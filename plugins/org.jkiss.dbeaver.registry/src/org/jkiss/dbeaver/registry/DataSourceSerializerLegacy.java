import org.jkiss.dbeaver.model.app.DBPProject;
                case RegistryConstants.TAG_DATA_SOURCE:
                    // Anyhow we won't try it again

                            } else {
        }
                        parseResults.updatedFolders.add(folder);
                    navSettings.setShowSystemObjects(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_SHOW_SYSTEM_OBJECTS)));
            throw new DBException("Datasource config parse error", ex);
                        } else {
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
                            if (curDataSource.isSavePassword()) {
                            default:
                case RegistryConstants.TAG_FILTER:
            if (CommonUtils.isEmpty(creds[0])) {
import java.util.Collections;
import org.jkiss.dbeaver.model.DBConstants;
            }
 * you may not use this file except in compliance with the License.
                } catch (Throwable e) {
                    }
    public boolean parseDataSources(
                    }

            }
    }
                        if (!passwordReadCanceled) {
                            curDataSource.updateObjectFilter(DBSCatalog.class.getName(), null, new DBSObjectFilter(legacyCatalogFilter, null));

                        }
                        }
 */
                    break;
                    break;
                final DataSourcesParser dsp = new DataSourcesParser(registry, configurationStorage, parseResults);
                    if (curFilter != null) {
                    }
        private final DataSourceParseResults parseResults;
                        config.setClientHomeId(attributes.getValue(RegistryConstants.ATTR_HOME));
                                curNetworkHandler.setPassword(creds[1]);
                        }
                        String propName = attributes.getValue(RegistryConstants.ATTR_NAME);
                encPassword = SimpleStringEncrypter.INSTANCE.decrypt(encPassword);
                        if (curCommand.isWaitProcessFinish()) {
        private String[] readSecuredCredentials(Attributes xmlAttrs, DataSourceDescriptor dataSource, String subNode) {
                        config.setDatabaseName(attributes.getValue(RegistryConstants.ATTR_DATABASE));

        private StringBuilder curQuery;
                    boolean newDataSource = (curDataSource == null);
import java.util.Collection;
        this.registry = registry;
                            .toString());
                            registry,
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        DBSSecretController secretController = DBSSecretController.getProjectSecretController(project);
 * distributed under the License is distributed on an "AS IS" BASIS,
                case RegistryConstants.TAG_DATA_SOURCE: {
                            id,
                parser.parse(dsp);
                }
                    }
                    DataSourceProviderDescriptor provider = DataSourceProviderRegistry.getInstance().getDataSourceProvider(providerId);
import org.jkiss.dbeaver.runtime.encode.SimpleStringEncrypter;
                }
                    }
                }
                                curDataSource.getConnectionConfiguration().setProperty(propName, propValue);
                        String legacySchemaFilter = attributes.getValue(RegistryConstants.ATTR_FILTER_SCHEMA);
import org.jkiss.utils.xml.SAXListener;
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
                            curFilter.setEnabled(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_ENABLED), true));
                case RegistryConstants.TAG_EVENT:
                                if (!CommonUtils.isEmpty(propValue)) {
                                curDataSource.getConnectionConfiguration().setProviderProperty(propName, propValue);
                            config.setUserName(creds[0]);
import org.jkiss.code.Nullable;
            this.parseResults = parseResults;
                        // Legacy filter settings
                        log.warn("Can't find driver " + driverId + " in datasource provider " + provider.getId() + " for datasource '" + name + "'. Create new driver");
                        NetworkHandlerDescriptor handlerDescriptor = NetworkHandlerRegistry.getInstance().getDescriptor(handlerId);
                            keyPrefix = "projects/" + project.getId();
                    }
                        curFilter.addExclude(CommonUtils.notEmpty(attributes.getValue(RegistryConstants.ATTR_NAME)));
            switch (localName) {
        }
    }
                case RegistryConstants.TAG_INCLUDE:
                            try {
                    break;
                        if (attributes.getValue(RegistryConstants.ATTR_AUTOCOMMIT) != null) {
                                break;
    @Override
                    if (curDataSource != null) {
        @NotNull List<T> localDataSources
                                // Backward compatibility - internal properties are provider properties
                        if (handlerDescriptor == null) {
                                DBPConnectionType.DEFAULT_TYPE)
                        // Support of old version without ID
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                    break;

                        curDataSource.getConnectionConfiguration().getBootstrap().getInitQueries().add(curQuery.toString());
                        }
                    }
                    navSettings.setHideVirtualModel(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_HIDE_VIRTUAL)));

                                    curDataSource.getConnectionConfiguration().getBootstrap().setDefaultCatalogName(propValue);
package org.jkiss.dbeaver.registry;
                case RegistryConstants.TAG_EXCLUDE:
                        curDataSource = null;
                        }
                        }
                    curDataSource.setConnectionReadOnly(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_READ_ONLY)));
                encPassword = null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (curDataSource != null && curQuery != null && !curQuery.isEmpty()) {
                        DBPDriver driver = curDataSource.getDriver();
                    passwordReadCanceled = true;
                        if (!CommonUtils.isEmpty(keepAlive)) {
            } catch (Throwable e) {
                    }
                        if (attributes.getValue(RegistryConstants.ATTR_IGNORE_ERRORS) != null) {
                    }
        }
                        String legacyCatalogFilter = attributes.getValue(RegistryConstants.ATTR_FILTER_CATALOG);
                            }
                        String objectID = attributes.getValue(RegistryConstants.ATTR_ID);
                        creds[0] = secretController.getPrivateSecretValue(itemPath.resolve(RegistryConstants.ATTR_USER)
                    }
        }
                        provider.addDriver(driver);
                            config.getBootstrap().setIgnoreErrors(CommonUtils.toBoolean(attributes.getValue(RegistryConstants.ATTR_IGNORE_ERRORS)));
                    DataSourceFolder parent = parentFolder == null ? null : registry.findFolderByPath(parentFolder, true, parseResults);
                    curDataSource.setName(name);
                    if (curDataSource != null) {
                        }
                        switch (propName) {
                                }
                SAXReader parser = new SAXReader(is);
                            reader.setListener(EMPTY_LISTENER);
                            return;
            if (is != null) {
    }
        boolean isDescription = false;
                    if (curDataSource != null) {
            try {
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
                            }
    }
                        folder = new DataSourceFolder(registry, parent, name, description);
    private static String decryptPassword(String encPassword) {
                case RegistryConstants.TAG_PROVIDER_PROPERTY:
                        curNetworkHandler = new DBWHandlerConfiguration(handlerDescriptor, curDataSource);

                    String parentFolder = attributes.getValue(RegistryConstants.ATTR_PARENT);
        } catch (Exception ex) {
                    } else {
                        if (CommonUtils.isEmpty(driver.getName())) {
        private DBWHandlerConfiguration curNetworkHandler;
                case RegistryConstants.TAG_FOLDER: {
                            String timeoutString = attributes.getValue(RegistryConstants.ATTR_WAIT_PROCESS_TIMEOUT);
    ) throws DBException {
                        curQuery = null;
                        config.setUrl(attributes.getValue(RegistryConstants.ATTR_URL));

                    }
import org.xml.sax.Attributes;
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
    private static final Log log = Log.getLog(DataSourceSerializerLegacy.class);
                    break;
                        }
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {
                                // Broken driver - seems to be just created
                        curCommand.setShowProcessPanel(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_SHOW_PANEL)));
                    }
                        }
                    navSettings.setMergeEntities(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_MERGE_ENTITIES)));
                            curNetworkHandler.setUserName(creds[0]);
            }
                    }
                        }
        private DBSObjectFilter curFilter;

                            curDataSource.updateObjectFilter(DBSSchema.class.getName(), null, new DBSObjectFilter(legacySchemaFilter, null));
                        // Backward compatibility
                    }
                    if (curDataSource != null) {
import org.jkiss.dbeaver.model.runtime.DBRShellCommand;
                    } else {
            return creds;
                        return;
import org.jkiss.dbeaver.Log;
                    if (curDataSource != null) {
                case RegistryConstants.TAG_NETWORK_HANDLER:
                    } else {
                        curCommand.setPauseAfterExecute(CommonUtils.toInt(attributes.getValue(RegistryConstants.ATTR_PAUSE_AFTER_EXECUTE)));
                        if (!CommonUtils.isEmpty(colorValue)) {
                        config.setConnectionType(
            DBPProject project = dataSource.getProject();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (!CommonUtils.isEmpty(encPassword)) {
    ) throws IOException {
import org.jkiss.dbeaver.model.connection.DBPDriver;
                            driver,
                    if (project.isUseSecretStorage()) {
                    String name = attributes.getValue(RegistryConstants.ATTR_NAME);
                        curCommand.setTerminateAtDisconnect(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_TERMINATE_AT_DISCONNECT)));
                            case LEGACY_DEFAULT_AUTO_COMMIT:
        DataSourceDescriptor curDataSource;
                case RegistryConstants.TAG_NETWORK_HANDLER:
                curDataSource.setDescription(data);
            } else if (curCommand != null) {
                    break;
                    break;
                            curFilter.setName(attributes.getValue(RegistryConstants.ATTR_NAME));
        private boolean passwordReadCanceled = false;
                    String id = attributes.getValue(RegistryConstants.ATTR_ID);
                    navSettings.setHideSchemas(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_HIDE_SCHEMAS)));
                    break;

import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
                    }
        DBRShellCommand curCommand = null;

        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {
                            curFilter.setDescription(attributes.getValue(RegistryConstants.ATTR_DESCRIPTION));
                    if (folder == null) {
                    break;
                        curFilter.addInclude(CommonUtils.notEmpty(attributes.getValue(RegistryConstants.ATTR_NAME)));
                case RegistryConstants.TAG_VIRTUAL_META_DATA:
                        }
                        if (typeName != null) {
import org.jkiss.code.NotNull;

 */
                        if (!CommonUtils.isEmpty(legacyCatalogFilter)) {
                        DBPConnectionConfiguration config = curDataSource.getConnectionConfiguration();
                    break;
                    }
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
                            if (driver instanceof DriverDescriptor) {
                    break;
            {
                        parseResults.updatedDataSources.add(curDataSource);
/*
                    if (newDataSource) {
 * Legacy datasource serialization (xml)
                        curDataSource.getConnectionConfiguration().setHandlers(Collections.emptyList());
                        parseResults.addedFolders.add(folder);
                                break;
                            case LEGACY_DEFAULT_ACTIVE_OBJECT:
import java.nio.file.Path;
        throw new IOException("Legacy serializer is deprecated, save not possible");
                        curCommand = new DBRShellCommand("");
                            curDataSource.updateObjectFilter(typeName, objectID, curFilter);
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
        @NotNull DBRProgressMonitor monitor,
                                break;
                    isDescription = true;
        public void saxText(@NotNull SAXReader reader, @NotNull String data) {
        return false;
                        reader.setListener(curDataSource.getVirtualModel().getModelParser());
                    }
                    break;
                curCommand = null;
                        String propValue = attributes.getValue(RegistryConstants.ATTR_VALUE);
            } else if (curQuery != null) {
                        curDataSource = new DataSourceDescriptor(
                    break;
                            DataSourceOriginLocal.INSTANCE,
                creds[0] = xmlAttrs.getValue(RegistryConstants.ATTR_USER);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
                    break;
                                CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_TYPE)),
import org.jkiss.dbeaver.model.secret.DBSSecretController;
                        String colorValue = attributes.getValue(RegistryConstants.ATTR_COLOR);
                        if (dataSource == null) {
                    navSettings.setShowOnlyEntities(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_SHOW_ONLY_ENTITIES)));
                            }
                    curDataSource = null;
                                curDataSource.getConnectionConfiguration().getBootstrap().setDefaultTransactionIsolation(CommonUtils.toInt(propValue));
                    // Most likely user canceled master password enter of failed by some other reason.
                        driver = provider.createDriver(driverId);
                        if (attributes.getValue(RegistryConstants.ATTR_TXN_ISOLATION) != null) {
                case RegistryConstants.TAG_QUERY:
import java.util.List;
                    String name = attributes.getValue(RegistryConstants.ATTR_NAME);
                                config.setUserPassword(creds[1]);
                    break;
                case RegistryConstants.TAG_DESCRIPTION:
                    break;
                        DBPConnectionEventType eventType = DBPConnectionEventType.valueOf(attributes.getValue(RegistryConstants.ATTR_TYPE));
                        }

                        curDataSource.setFolder(registry.findFolderByPath(folderPath, true, parseResults));
import java.io.IOException;
                            attributes.getValue(RegistryConstants.ATTR_VALUE));
                        registry.addSavedFilter(curFilter);
            this.registry = registry;
        }
        try (InputStream is = configurationManager.readConfiguration(configurationStorage.getStorageName(), dataSourceIds)) {
                    } else if (curDataSource != null) {

            if (isDescription && curDataSource != null) {
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        return encPassword;
                    curDataSource = registry.getDataSource(id);
 * DBeaver - Universal Database Manager
        private DataSourcesParser(DataSourceRegistry<?> registry, DBPDataSourceConfigurationStorage storage, DataSourceParseResults parseResults) {
                            attributes.getValue(RegistryConstants.ATTR_VALUE));
                    if (curFilter != null) {
                    navSettings.setShowUtilityObjects(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_SHOW_UTIL_OBJECTS)));
                try {
                        config.setServerName(attributes.getValue(RegistryConstants.ATTR_SERVER));
                final String encPassword = xmlAttrs.getValue(RegistryConstants.ATTR_PASSWORD);
        @NotNull DataSourceParseResults parseResults,
                                config.setKeepAliveInterval(Integer.parseInt(keepAlive));
                        log.warn("Can't find datasource provider " + providerId + " for datasource '" + name + "'");

    }
                                ((DriverDescriptor)driver).setDriverClassName("java.sql.Driver");
                        curFilter.setDescription(attributes.getValue(RegistryConstants.ATTR_DESCRIPTION));
                        final String propValue = attributes.getValue(RegistryConstants.ATTR_VALUE);
import java.io.InputStream;
                            if (curNetworkHandler.isSavePassword()) {
            }
/**

                        String keepAlive = attributes.getValue(RegistryConstants.ATTR_KEEP_ALIVE);

 *
                        curDataSource.getConnectionConfiguration().setProperties(Collections.emptyMap());
                            if (propName.startsWith(DBConstants.INTERNAL_PROP_PREFIX)) {
        }
 * See the License for the specific language governing permissions and
                        curFilter.setName(attributes.getValue(RegistryConstants.ATTR_NAME));
                            attributes.getValue(RegistryConstants.ATTR_NAME),
                curCommand.setCommand(data);

                    if (curDataSource != null) {
                        String typeName = attributes.getValue(RegistryConstants.ATTR_TYPE);
                        DBPConnectionConfiguration config = curDataSource.getConnectionConfiguration();
            isDescription = false;
        @NotNull DataSourceConfigurationManager configurationManager,
                        if (!CommonUtils.isEmpty(attributes.getValue(RegistryConstants.ATTR_DEFAULT_OBJECT))) {
                        config.setHostName(attributes.getValue(RegistryConstants.ATTR_HOST));
                            curCommand.setWaitProcessTimeoutMs(timeoutMs);
                case RegistryConstants.TAG_QUERY:
                            attributes.getValue(RegistryConstants.ATTR_NAME),
                        parseResults.addedDataSources.add(curDataSource);
                        curNetworkHandler.setSavePassword(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_SAVE_PASSWORD)));
        @Override
    @Override
                        folder.setDescription(description);
    private final DataSourceRegistry<T> registry;
                        curDataSource.clearFilters();
                        }
            String[] creds = new String[2];
                    break;
                            config.getBootstrap().setDefaultAutoCommit(CommonUtils.toBoolean(attributes.getValue(RegistryConstants.ATTR_AUTOCOMMIT)));
        @NotNull DataSourceConfigurationManager configurationManager,
                                break;
                        curFilter.setEnabled(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_ENABLED), true));
                        if (propName != null) {
                        creds[1] = secretController.getPrivateSecretValue(itemPath.resolve(RegistryConstants.ATTR_PASSWORD)
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
                    if (id == null) {
                        curDataSource.getConnectionConfiguration().updateHandler(curNetworkHandler);
        DBPDataSourceConfigurationStorage storage;
                curQuery.append(data);
                        String keyPrefix;
                        if (!CommonUtils.isEmpty(legacySchemaFilter)) {
                    String driverId = attributes.getValue(RegistryConstants.ATTR_DRIVER);
                    if (curDataSource != null) {
                        curCommand.setEnabled(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_ENABLED)));
                        if (!passwordReadCanceled) {
                                curDataSource.getPreferenceStore().getProperties().put(propName, propValue);
                            }
                            case LEGACY_DEFAULT_ISOLATION:
import org.jkiss.dbeaver.DBException;
                    navSettings.setHideFolders(CommonUtils.getBoolean(attributes.getValue(DataSourceNavigatorSettings.ATTR_NAVIGATOR_HIDE_FOLDERS)));
                // could not decrypt - use as is
                        curDataSource.getConnectionConfiguration().setEvent(eventType, curCommand);
                        }
            }
                            storage,
                    {
                    curDataSource.setSavePassword(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_SAVE_PASSWORD)));
                    DataSourceFolder folder = parent == null ? registry.findFolderByPath(name, true, parseResults) : parent.getChild(name);
                            curFilter = new DBSObjectFilter();
import org.jkiss.dbeaver.model.connection.DBPConnectionEventType;
                case RegistryConstants.TAG_PROPERTY:
                    if (folderPath != null) {
class DataSourceSerializerLegacy<T extends DataSourceDescriptor> implements DataSourceSerializer<T> {
                    if (curDataSource != null) {
                    DataSourceNavigatorSettings navSettings = curDataSource.getOriginalNavigatorSettings();
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
                            keyPrefix = "datasources/" + dataSource.getId();

                case RegistryConstants.TAG_CUSTOM_PROPERTY:
                        curNetworkHandler.setProperty(
                    break;
                        config.setHostPort(attributes.getValue(RegistryConstants.ATTR_PORT));
                        id = name;
                        curCommand.setWaitProcessFinish(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_WAIT_PROCESS)));
                    curNetworkHandler = null;
                case RegistryConstants.TAG_CONNECTION:
                creds[1] = CommonUtils.isEmpty(encPassword) ? null : decryptPassword(encPassword);
                            config.setConnectionColor(colorValue);
                        curNetworkHandler.setEnabled(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_ENABLED)));
    private static final String LEGACY_DEFAULT_AUTO_COMMIT = "default.autocommit"; //$NON-NLS-1$
                    if (curNetworkHandler != null) {
                                ((DriverDescriptor)driver).setName(attributes.getValue(RegistryConstants.ATTR_URL));
                            new DBPConnectionConfiguration());
                    }
                    } else {
        @Override
                        // Clean settings - they have to be loaded later by parser
                        curCommand.setWorkingDirectory(attributes.getValue(RegistryConstants.ATTR_WORKING_DIRECTORY));
                            log.warn("Can't find network handler '" + handlerId + "'");
                    curQuery = new StringBuilder();
 * limitations under the License.
    @Nullable
                        }
                            final String[] creds = readSecuredCredentials(attributes, curDataSource, "network/" + handlerId);
                    }
                    if (provider == null) {
                    log.error("Can't read password from secure storage", e);
                            config.getBootstrap().setDefaultTransactionIsolation(CommonUtils.toInt(attributes.getValue(RegistryConstants.ATTR_TXN_ISOLATION)));
}
    DataSourceSerializerLegacy(DataSourceRegistry<T> registry) {
                        final String propName = attributes.getValue(RegistryConstants.ATTR_NAME);
                        String handlerId = attributes.getValue(RegistryConstants.ATTR_ID);
            this.storage = storage;
                    }
                            DataSourceProviderRegistry.getInstance().getConnectionType(
                            final String[] creds = readSecuredCredentials(attributes, curDataSource, null);
                    break;
                                log.warn("Bad keep-alive interval value", e);

                    String providerId = attributes.getValue(RegistryConstants.ATTR_PROVIDER);
import org.jkiss.utils.xml.SAXReader;
                            }
            }
                    final String folderPath = attributes.getValue(RegistryConstants.ATTR_FOLDER);
                        curFilter = new DBSObjectFilter();
                                curDataSource.getConnectionConfiguration().getBootstrap().setDefaultAutoCommit(CommonUtils.toBoolean(propValue));
                    }
                case RegistryConstants.TAG_BOOTSTRAP:
                            int timeoutMs = CommonUtils.toInt(timeoutString, DBRShellCommand.WAIT_PROCESS_TIMEOUT_FOREVER);
            curCommand = null;
                        }
                        curDataSource.getConnectionConfiguration().setProviderProperty(
 *
                            .toString());
                        reader.setListener(EMPTY_LISTENER);
                        );
        Collection<String> dataSourceIds
                    if (driver == null) {
    private static final String LEGACY_DEFAULT_ISOLATION = "default.isolation"; //$NON-NLS-1$
import org.jkiss.utils.CommonUtils;
                            config.getBootstrap().setDefaultCatalogName(attributes.getValue(RegistryConstants.ATTR_DEFAULT_OBJECT));
            if (CommonUtils.isEmpty(creds[1])) {
                    if (newDataSource) {
    public void saveDataSources(
            isDescription = false;
                case RegistryConstants.TAG_FILTER:
                    DriverDescriptor driver = provider.getDriver(driverId);
            }
    private static class DataSourcesParser implements SAXListener {
    private static final String LEGACY_DEFAULT_ACTIVE_OBJECT = "default.activeObject"; //$NON-NLS-1$
                        Path itemPath = Path.of(keyPrefix).resolve(CommonUtils.notEmpty(subNode));

 * You may obtain a copy of the License at
                    curFilter = null;
            }
                        }
                    curDataSource.setLockPasswordHash(attributes.getValue(RegistryConstants.ATTR_LOCK_PASSWORD));
                    String description = attributes.getValue(RegistryConstants.ATTR_DESCRIPTION);
        @Override
                            } catch (NumberFormatException e) {
        DataSourceRegistry<?> registry;
            switch (localName) {
