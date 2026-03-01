import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and

        if (vObject != null) {
        return globalContextConfiguration;
                Map<String, Object> hpMap = new LinkedHashMap<>();
import org.jkiss.dbeaver.model.virtual.DBVContainer;
        for (IConfigurationElement ext : extElements) {
import org.jkiss.dbeaver.model.data.hints.DBDValueHintProvider;
        @Override
                hpMap.put("parameters", hpc.getValue().getParameters());
        }
                    vObject.setProperty(HINT_CONFIG_PROPERTY, new LinkedHashMap<>());
    public List<ValueHintProviderDescriptor> getHintDescriptors(@NotNull DBDValueHintProvider.HintObject forObject) {
        for (ValueHintProviderDescriptor descriptor : descriptors) {
            isEnabled = isHintEnabledInVirtualObject(descriptor, DBVUtils.getVirtualEntity(entity, false));
            Map<String, Object> dataHintsConfig = new LinkedHashMap<>();

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            try {
            } else {
 */
        // Fallback to global

            ValueHintContextConfiguration configuration = findHintConfigFromVirtualObject(
            }

        @Override
    }
            }
            return null;
        @Override
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;
            if (isEnabled != null) {
        }
            return getInstance().getContextConfiguration(vObject.getDataSourceContainer(), null, false);
import java.util.ArrayList;
            if (configuration != null) {
        public void deleteConfiguration() {
import org.jkiss.dbeaver.model.data.hints.standard.VoidHintProvider;
import org.eclipse.core.runtime.IConfigurationElement;
    public static final String CONFIG_FILE_NAME = "data-hints.json";
            if (dataSourceContainer == null) {
        }
                    }
        @Override
                        configurationMap = new LinkedHashMap<>();
                    Map<String, ValueHintProviderConfiguration> configurationMap = gson.fromJson(
 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
            log.error("Global configuration cannot be deleted");
                return isEnabled;
                String json = gson.toJson(this.getConfigurationMap());
                return getInstance().globalContextConfiguration;
        }
    private static final Gson gson = new GsonBuilder().create();
            }
                    .loadConfigurationFile(CONFIG_FILE_NAME);
        @Nullable DBPDataSourceContainer ds,
    }
            @NotNull DBDValueHintContext.HintConfigurationLevel level
            ValueHintContextConfiguration configuration = findHintConfigFromVirtualObject(
                }
        public void saveConfiguration() {


 * Copyright (C) 2010-2024 DBeaver Corp and others
            Map<String, Object> dataHintsConfig = vObject.getProperty(HINT_CONFIG_PROPERTY);
                        // May happen if json deserializes to null

                        }
    public ValueHintProviderDescriptor getDescriptorByInstance(DBDValueHintProvider provider) {
        @Nullable DBPDataSourceContainer ds,
        public ValueHintContextConfiguration getParent() {
                }
        public ValueHintContextConfiguration getParent() {
                if (provConfig != null) {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    public List<ValueHintProviderDescriptor> getHintDescriptors() {
            DBPDataSourceContainer dataSourceContainer = vObject.getDataSourceContainer();
            if (dataHintsConfig != null) {
        }
     * Optimized check. It doesn't deserialize entire providers config but checks virtual model internal state.
 * you may not use this file except in compliance with the License.
            } catch (DBException e) {
                log.debug("Error reading hints configuration", e);
import org.jkiss.dbeaver.model.virtual.DBVObject;
    protected List<ValueHintProviderDescriptor> getDescriptors() {
    }
                log.error("Error saving hint providers configuration", e);
                        return CommonUtils.toBoolean(isEnabled);
                    for (Map.Entry<String, Object> pc : dataHintsConfig.entrySet()) {
                        configContent,
     */
            if (vObject instanceof DBVContainer) {
                log.error("Error saving virtual config for hints: not datasource container");
 *
    private ValueHintRegistry(IExtensionRegistry registry) {
    @NotNull
        if (entity != null) {
                    vObject,
        }
                DBVUtils.getVirtualEntity(entity, forceCreate),
                    if (isEnabled != null) {
    private final ValueHintContextConfiguration globalContextConfiguration;
import java.util.Map;
        @NotNull ValueHintProviderDescriptor descriptor,
    ) {
            if (descriptor.getInstance() == provider) {
    }
        return null;
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        return instance;
    public ValueHintContextConfiguration getContextConfiguration(
        return getDescriptors().stream().filter(d -> d.getForObject() == forObject).toList();
                dataHintsConfig.put(hpc.getKey(), hpMap);
import com.google.gson.reflect.TypeToken;
        }
        }
    }
    private static ValueHintRegistry instance = null;
            super(DBDValueHintContext.HintConfigurationLevel.GLOBAL);
        }
import org.jkiss.utils.CommonUtils;
    private static class GlobalHintContextConfiguration extends ValueHintContextConfiguration {
    private static final String HINT_CONFIG_PROPERTY = "data.hints.configuration";

            } catch (Exception e) {
                descriptors.add(new ValueHintProviderDescriptor(ext));
        if (instance == null) {

                Map<String, Object> dataHintsConfig = vObject.getProperty(HINT_CONFIG_PROPERTY);
    private final List<ValueHintProviderDescriptor> descriptors = new ArrayList<>();
 * You may obtain a copy of the License at
            this.vObject = vObject;
import org.jkiss.dbeaver.model.virtual.DBVEntity;

            }
            }
                            configurationMap.put(pc.getKey(), configuration);
import com.google.gson.GsonBuilder;
        return null;
            vObject.setProperty(HINT_CONFIG_PROPERTY, dataHintsConfig);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.eclipse.core.runtime.Platform;
        boolean forceCreate
    private ValueHintContextConfiguration findHintConfigFromVirtualObject(@Nullable DBVObject vObject, boolean forceCreate) {
                        if (pc.getValue() instanceof Map map) {
                String configContent = DBWorkbench.getPlatform()
                    .getConfigurationController()
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ValueHintProviderDescriptor.EXTENSION_ID);
                hpMap.put("enabled", hpc.getValue().isEnabled());
        // Load datasource providers from external plugins
        public void saveConfiguration() {
        return VoidHintProvider.INSTANCE;
                return new VirtualHintContextConfiguration(

                return configuration;
    @Override
        @Override
    }
        public GlobalHintContextConfiguration() {
            }
 * ValueHintRegistry
        }
            try {
            }
            vObject.setProperty(HINT_CONFIG_PROPERTY, null);

        return getDescriptors();
 * Unless required by applicable law or agreed to in writing, software

                            ValueHintProviderConfiguration configuration = JSONUtils.deserializeObject(map, ValueHintProviderConfiguration.class);

                    vObject instanceof DBVEntity ? DBDValueHintContext.HintConfigurationLevel.ENTITY : DBDValueHintContext.HintConfigurationLevel.DATASOURCE);
        }
                forceCreate);
/**
        }

        if (ds != null) {
                    .saveConfigurationFile(CONFIG_FILE_NAME, json);

                DBWorkbench.getPlatform()
            super(level);
package org.jkiss.dbeaver.registry.data.hints;
        @Nullable DBSEntity entity
    }
            try {
            instance = new ValueHintRegistry(Platform.getExtensionRegistry());

        }
        @Nullable DBSEntity entity,
 * limitations under the License.
    @NotNull
import org.jkiss.dbeaver.DBException;
    protected DBDValueHintProvider getDefaultValueBinding() {



            }
                forceCreate);


 * DBeaver - Universal Database Manager

            if (isEnabled != null) {
            } catch (Exception e) {
                return descriptor;
        @Override
    }
            }

import org.jkiss.dbeaver.model.struct.DBSEntity;
        }
            if (configuration != null) {
        this.globalContextConfiguration = new GlobalHintContextConfiguration();
    ) {
import java.util.List;
                } else {
 */
    }
    public boolean isHintEnabled(
    }
                Map<String, Object> provConfig = JSONUtils.getObjectOrNull(dataHintsConfig, descriptor.getId());
                        new TypeToken<Map<String, ValueHintProviderConfiguration>>() {
        }

        private final DBVObject vObject;
            if (ValueHintProviderDescriptor.TAG_HINT_PROVIDER.equals(ext.getName())) {
    @Override
                dataSourceContainer.persistConfiguration();
                ds.getVirtualModel(),
                    }
    private static class VirtualHintContextConfiguration extends ValueHintContextConfiguration {

        public VirtualHintContextConfiguration(
import org.jkiss.code.NotNull;
public class ValueHintRegistry extends AbstractValueBindingRegistry<DBDValueHintProvider, DBDValueHintContext, ValueHintProviderDescriptor> {
    private Boolean isHintEnabledInVirtualObject(ValueHintProviderDescriptor descriptor, DBVObject vObject) {
        }
        public void deleteConfiguration() {
}
                log.error("Error loading hint providers configuration", e);

    public synchronized static ValueHintRegistry getInstance() {
            }

        ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.LinkedHashMap;
            isEnabled = isHintEnabledInVirtualObject(descriptor, ds.getVirtualModel());
        return null;
                    .getConfigurationController()
 *
        Boolean isEnabled;

        return globalContextConfiguration.isHintEnabled(descriptor);
            persistConfiguration();
        if (vObject != null) {
import com.google.gson.Gson;
                    Object isEnabled = provConfig.get("enabled");
 *
                if (configContent != null) {
import org.jkiss.dbeaver.model.virtual.DBVUtils;
            for (Map.Entry<String, ValueHintProviderConfiguration> hpc : configurationMap.entrySet()) {
            }
        if (entity != null) {
    /**

        // Fallback to global
    private static final Log log = Log.getLog(ValueHintRegistry.class);
            }
            @NotNull DBVObject vObject,

    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            if (dataHintsConfig != null || forceCreate) {
            persistConfiguration();
        }
                        }.getType());

            }
            }
                if (dataHintsConfig != null) {
                    this.setConfigurationMap(configurationMap);
                return configuration;
        return descriptors;
        if (ds != null) {
        private void persistConfiguration() {

        }
    }
                    if (configurationMap == null) {
            // Try virt model
            Map<String, Object> dataHintsConfig = vObject.getProperty(HINT_CONFIG_PROPERTY);

import org.eclipse.core.runtime.IExtensionRegistry;
                }
                return isEnabled;
