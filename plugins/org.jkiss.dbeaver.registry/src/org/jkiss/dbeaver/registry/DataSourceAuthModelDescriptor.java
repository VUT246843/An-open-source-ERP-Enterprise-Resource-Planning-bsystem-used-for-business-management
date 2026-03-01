
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }
                // locate class
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
        return (DBAAuthModel<T>) instance;
    private final Map<String, String[]> replaces = new HashMap<>();
        for (IConfigurationElement libConfig : config.getChildren(RegistryConstants.TAG_FILE)) {
 */
        // We need to find all replacements (including inherited drivers)
        return requiredAuthProvider;
import org.jkiss.code.Nullable;
            return replList;
    private final List<DBPDriverLibrary> libraries;
    }
    public boolean isDesktopModel() {
        this.name = config.getAttribute(RegistryConstants.ATTR_LABEL);
    private final boolean isDesktop;
        return implType.getImplName();
    }
        return appliesTo(driver);
import org.jkiss.dbeaver.model.DBPImage;
    }
        return libraries;
    }
                    if (!ArrayUtils.contains(forList, driver.getId()) &&

    public String getId() {
package org.jkiss.dbeaver.registry;
            String forAttr = dsConfig.getAttribute("for");
    boolean appliesTo(DBPDriver driver) {
        for (IConfigurationElement dsConfig : config.getChildren("replace")) {
    private final String name;
        this.requiresLocalConfiguration = CommonUtils.toBoolean(config.getAttribute("requiresLocalConfiguration"));
    public Collection<String> getReplaces(DBPDriver driver) {
            String replModel = dsConfig.getAttribute("model");
    public String getImplClassName() {
    @Override

        // This is a bit tricky
 *
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;

                if (!ArrayUtils.isEmpty(forList)) {
 * Auth model descriptor
    public boolean isCloudModel() {
                lib.setCustom(false);
    private boolean hasCondReplaces = false;

    @Override
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
import java.util.*;
    public boolean isApplicableTo(DBPDriver driver) {
    @Override
        this.defaultModel = CommonUtils.toBoolean(config.getAttribute(RegistryConstants.ATTR_DEFAULT));
    @Nullable
import org.jkiss.dbeaver.model.DBIcon;
        }

    public boolean requiresLocalConfiguration() {
            DriverLibraryAbstract lib = DriverLibraryAbstract.createFromConfig(null, libConfig);
        return isCloud;
        this.isCloud = CommonUtils.toBoolean(config.getAttribute("cloud"));
        DBAAuthCredentialsForm credentialsForm = instance.createCredentialsForm(dataSource, configuration);
    private final boolean requiresLocalConfiguration;
    public String toString() {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            }
                return amd;
            String[] replFor = CommonUtils.isEmpty(forAttr) ? new String[0] : forAttr.split(",");
        return defaultModel;
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
/*
    }
        this.isDesktop = CommonUtils.toBoolean(config.getAttribute("desktop"));
        } else {
    public List<? extends DBPDriverLibrary> getDriverLibraries() {
 *
import org.eclipse.core.runtime.IConfigurationElement;
    @NotNull
    }
    }
        this.implType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));

        if (hasCondReplaces) {
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
            } catch (Throwable ex) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class DataSourceAuthModelDescriptor extends DataSourceBindingDescriptor implements DBPAuthModelDescriptor {
                libraries.add(lib);
            if (lib != null) {

    @Override
        this.requiredAuthProvider = CommonUtils.toString(config.getAttribute("requiredAuthProvider"));
 * DBeaver - Universal Database Manager
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    }
        PropertyCollector propertyCollector = new PropertyCollector(credentialsForm, false);


    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }

    public <T extends DBAAuthCredentials> DBAAuthModel<T> getInstance() {

    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataSourceAuth"; //$NON-NLS-1$
    public boolean isDefaultModel() {
        }

        propertyCollector.collectProperties();
        if (instance == null) {

    private final String id;
    private DBAAuthModel<?> instance;
/**
    @NotNull
    }
                        continue;
        return name;
        List<DataSourceAuthModelDescriptor> allAuthModels = DataSourceProviderRegistry.getInstance().getAllAuthModels();
    }
        }


        return propertyCollector;

            }
    public String getRequiredAuthProviderId() {
    public DBPAuthModelDescriptor getReplacedBy(@NotNull DBPDriver driver) {
    }

        if (this.icon == null) {
        return requiresLocalConfiguration;
        super(config);
    private final String description;
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));

        return isDriverApplicable(driver);
    @Override
    }
    public String getName() {
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
        return id;
            return replaces.keySet();
        return isDesktop;
        // And the remove all models which are not applicable to the driver
import org.jkiss.dbeaver.registry.driver.DriverLibraryAbstract;
    @Override
    DataSourceAuthModelDescriptor(IConfigurationElement config) {
    }
    public DBPPropertySource createCredentialsSource(DBPDataSourceContainer dataSource, DBPConnectionConfiguration configuration) {
        }
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
import org.jkiss.dbeaver.model.access.DBAAuthModel;

    @Nullable

    @NotNull
    @Override

    @Override
        return description;
    @Override
            if (applicableAMs.contains(amd) && amd.getReplaces(driver).contains(id) && amd.isDriverApplicable(driver)) {

                this.instance = null;
    private final boolean isCloud;
 * you may not use this file except in compliance with the License.
            this.icon = DBIcon.TREE_PACKAGE;
import org.jkiss.dbeaver.model.connection.DBPDriver;
    }
    }

        this.libraries = new ArrayList<>();
    @NotNull
                throw new IllegalStateException("Can't initialize data source auth model '" + implType.getImplName() + "'", ex);
        }
    @Override
        List<? extends DBPAuthModelDescriptor> applicableAMs = DataSourceProviderRegistry.getInstance().getApplicableAuthModels(driver);
    private DBPImage icon;
    @Override

    @Override
    @Override
    private final ObjectType implType;
                replList.add(re.getKey());
    @Override
                        !ArrayUtils.contains(forList, driver.getProviderId()))
    public DBPImage getIcon() {
    }
                    }
        for (int i = allAuthModels.size(); i > 0; i--) {
            }
            this.replaces.put(replModel, replFor);

 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.access.DBAAuthCredentialsForm;
            for (Map.Entry<String, String[]> re : replaces.entrySet()) {
    }
    private final boolean defaultModel;
import org.jkiss.utils.ArrayUtils;
            List<String> replList = new ArrayList<>();
                String[] forList = re.getValue();
        DBAAuthModel<DBAAuthCredentials> instance = getInstance();
    private final String requiredAuthProvider;


        return id;
            try {
 *
            }
}

                }
            DataSourceAuthModelDescriptor amd = allAuthModels.get(i - 1);
    public String getDescription() {
            this.hasCondReplaces = hasCondReplaces || !ArrayUtils.isEmpty(replFor);
                    {
        return icon;
                this.instance = implType.createInstance(DBAAuthModel.class);
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
 * limitations under the License.
