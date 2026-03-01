 * You may obtain a copy of the License at
        return result;
    }
                    );
            for (HintProviderInfo pi : this.hintProviders.values()) {
package org.jkiss.dbeaver.ui.controls.resultset;
/*
        contextConfiguration = ValueHintRegistry.getInstance().getContextConfiguration(
        }
public class ResultSetHintContext implements DBDValueHintContext {
    public void setHintContextAttribute(@NotNull String name, @Nullable Object value) {
import org.jkiss.dbeaver.registry.data.hints.ValueHintContextConfiguration;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;

        final Set<DBDAttributeBinding> attributes = new LinkedHashSet<>();
    private final Map<DBDValueHintProvider, HintProviderInfo> hintProviders = new IdentityHashMap<>();
        return entitySupplier.get();
        synchronized (this.hintProvidersLock) {
        }

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPDataSource;
    private final Map<String, Object> contextAttributes = new HashMap<>();
        DBSEntity entity = ds == null ? null : entitySupplier.get();
                if (pi.enabled && pi.provider instanceof DBDCellHintProvider chp && pi.attributes.contains(attr)) {

    }
import org.jkiss.code.NotNull;

        boolean cleanupCache
    }
        DBSDataContainer dataContainer = getDataContainer();
/**
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;
        }
import org.jkiss.dbeaver.model.data.hints.DBDAttributeHintProvider;
import org.jkiss.dbeaver.model.data.hints.DBDValueHintProvider;
 *
    @Override
        } catch (Throwable e) {
    public List<DBDAttributeHintProvider> getColumnHintProviders(DBDAttributeBinding attr) {
        if (value == null) {
 */
                    attr.getValueHandler().getValueObjectType(attr));
        boolean enabled;

    }
                        monitor,
    }
                }
    @Override
    @Override
            this.contextAttributes.put(name, value);
            for (HintProviderInfo pi : this.hintProviders.values()) {
                }
            for (ValueHintProviderDescriptor desc : descriptors) {
        }
    }
    @Nullable
        @Nullable Collection<DBDAttributeBinding> attributes,
        return dataContainerSupplier.get();
                List<DBDValueHintProvider> attrHintProviders = hintRegistry.getAllValueBindings(
                    ds,
                    HintProviderInfo providerInfo = hintProviders.computeIfAbsent(provider, p -> {
        synchronized (this.hintProvidersLock) {

    @Override

import org.jkiss.dbeaver.registry.data.hints.ValueHintRegistry;
 * Result set hint context
        @NotNull Collection<? extends DBDValueRow> rows,
            }

        return result;
        // Detect new config

            }
    }

import org.jkiss.code.Nullable;
                        HintProviderInfo pi = new HintProviderInfo(p);
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;
        final DBDValueHintProvider provider;
        HintConfigurationLevel oldLevel = getConfigurationLevel();
import org.jkiss.dbeaver.registry.data.hints.ValueHintProviderDescriptor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    this,
 * limitations under the License.
        }
 * DBeaver - Universal Database Manager
        }
    }
    private static final Log log = Log.getLog(ResultSetHintContext.class);
    public DBSEntity getContextEntity() {
        this.contextAttributes.clear();
            contextConfiguration.deleteConfiguration();
    }
    private final Supplier<DBSDataContainer> dataContainerSupplier;
    public List<ValueHintProviderDescriptor> filterApplicableHintProviderDescriptors(List<ValueHintProviderDescriptor> descriptors) {
        this.entitySupplier = entitySupplier;
            entity,

        DBPDataSource ds = dataContainer == null || level == HintConfigurationLevel.GLOBAL ? null : dataContainer.getDataSource();
    private final Object hintProvidersLock = new Object();
        return contextAttributes.get(name);
                        cleanupCache

    @Override
 * you may not use this file except in compliance with the License.
    private final Supplier<DBSEntity> entitySupplier;
            this.hintProviders.clear();
        contextConfiguration = ValueHintRegistry.getInstance().getContextConfiguration(

    static class HintProviderInfo {
                    providerInfo.attributes.add(attr);
        }
                        !CommonUtils.isEmpty(attributes) ? attributes : pi.attributes,
}
        try {

        }
        List<ValueHintProviderDescriptor> result = new ArrayList<>(descriptors.size());

        synchronized (this.hintProvidersLock) {
        synchronized (this.hintProvidersLock) {
                        rows,
 * Unless required by applicable law or agreed to in writing, software
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
            return;
                        return pi;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    void initProviders(DBDAttributeBinding[] attributes) {
            for (HintProviderInfo pi : this.hintProviders.values()) {
    public List<DBDCellHintProvider> getCellHintProviders(DBDAttributeBinding attr) {
        contextConfiguration.saveConfiguration();

 * distributed under the License is distributed on an "AS IS" BASIS,
            this.provider = provider;
    public void setConfigurationLevel(HintConfigurationLevel level) {
import java.util.function.Supplier;
                    });
 *
                    chp.cacheRequiredData(
            for (DBDAttributeBinding attr : attributes) {

        return contextConfiguration;
    }
    ResultSetHintContext(Supplier<DBSDataContainer> dataContainerSupplier, Supplier<DBSEntity> entitySupplier) {

            ds == null ? null : ds.getContainer(),

    }


    public void cacheRequiredData(
import org.jkiss.dbeaver.Log;
    }
 *
        }

    public DBSDataContainer getDataContainer() {
                if (this.hintProviders.containsKey(desc.getInstance())) {
                }
    public Object getHintContextAttribute(@NotNull String name) {
    ) throws DBException {
                        ValueHintProviderDescriptor providerDescriptor = hintRegistry.getDescriptorByInstance(provider);

import org.jkiss.dbeaver.model.data.DBDValueRow;
 */
                    attr,
    }
        List<DBDAttributeHintProvider> result = new ArrayList<>();
    public ValueHintContextConfiguration getContextConfiguration() {
                        this,
            ds == null ? null : ds.getContainer(),
                    result.add(ahp);
            }
        this.dataContainerSupplier = dataContainerSupplier;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            // Delete old configuration
        DBSEntity entity = ds == null || level != HintConfigurationLevel.ENTITY ? null : entitySupplier.get();
                    result.add(chp);
        if (oldLevel == level) {
        return result;
            this.contextAttributes.remove(name);
    }
            entity,
    @Override
    }
        // Save new configuration
            false);
    void resetCache() {
        if (level.ordinal() < oldLevel.ordinal()) {
        @NotNull DBRProgressMonitor monitor,

        private HintProviderInfo(DBDValueHintProvider provider) {
            }
import org.jkiss.dbeaver.DBException;
                }
    @Nullable
            log.error("Error loading hint providers", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
                ValueHintRegistry hintRegistry = ValueHintRegistry.getInstance();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (pi.enabled && pi.provider instanceof DBDCellHintProvider chp) {
        return contextConfiguration.getLevel();
        DBPDataSource ds = dataContainer == null ? null : dataContainer.getDataSource();
        List<DBDCellHintProvider> result = new ArrayList<>();

                for (DBDValueHintProvider provider : attrHintProviders) {
        DBSDataContainer dataContainer = getDataContainer();
            true);
    @Nullable
import java.util.*;
                    result.add(desc);
        } else {
                if (pi.enabled && pi.provider instanceof DBDAttributeHintProvider ahp && pi.attributes.contains(attr)) {
    public HintConfigurationLevel getConfigurationLevel() {
        }
            }
 * See the License for the specific language governing permissions and
        synchronized (this.hintProvidersLock) {
    private ValueHintContextConfiguration contextConfiguration;
                        pi.enabled = contextConfiguration.isHintEnabled(providerDescriptor);
 * Copyright (C) 2010-2026 DBeaver Corp and others
