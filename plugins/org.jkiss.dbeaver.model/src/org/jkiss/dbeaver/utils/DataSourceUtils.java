            for (String cp : conParams) {
                        break;
                        if (!matched) {
                        }
                    value = CommonUtils.toString(propertyDescriptor.getDefaultValue());
    public static final String PARAM_PORT = "port";
import com.google.gson.reflect.TypeToken;
        //ds.set

            hideSchemas = false,
        }
                        break;
        } else {
                        }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                return hostText;
    private static final String PARAM_AUTO_COMMIT = "autoCommit";

            String hostPort = cfg.getHostPort();
import org.jkiss.dbeaver.model.net.DBWHandlerRegistry;
        for (String prefix : prefixes) {
                    case PARAM_MERGE_ENTITIES:
                    processNetworkHandlerProperties(dataSource, savePassword, handlerUpdateParams);
                        port = paramValue;
        }

                        password = paramValue;
            }
                    case PARAM_PASSWORD:
        newDS.setTemporary(isTemporary);
                            String handlerId = paramName.substring(0, divPos);
                        }
                            String suffix = paramName.substring(PREFIX_ADVANCED_PROP.length());

import java.util.stream.Collectors;
 * See the License for the specific language governing permissions and
        navSettings.setShowSystemObjects(showSystemObjects);
    }
                        port != null && !port.equals(cfg.getHostPort()) ||
                            if (!suffix.isEmpty()) {
            DBPDataSourceProvider dataSourceProvider = dataSourceContainer.getDriver().getDataSourceProvider();
                        if (user == null || user.equals(ds.getConnectionConfiguration().getUserName())) {
                        break;
            String param = paramParts[1];
                    case PARAM_HOST:
                            if (divPos == -1) {
            if (!CommonUtils.isEmpty(database)) connConfig.setDatabaseName(database);
                        handlerConfiguration.setUserName(value);
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (CommonUtils.isNotEmpty(hostPort)) {
 * Connection spec utils.
                    case PARAM_SAVE_PASSWORD:
        }
                for (DBPDataSourceContainer ds : dsRegistry.getDataSources()) {
                    }
                    DBPConnectionConfiguration cfg = ds.getConnectionConfiguration();
                );
            }

import org.jkiss.dbeaver.model.connection.DBPDriver;
                    case PARAM_DATABASE:
            String[] paramParts = networkHandlerParam.split("\\.", 2);
            return null;
            if (userName != null) {
            dataSource = dsRegistry.getDataSource(dsId);
    public static String getDataSourceAddressText(DBPDataSourceContainer dataSourceContainer) {
                    case PARAM_SAVE:
                        break;
        } else {
                }
        if (dsName == null) {
        @NotNull String connectionSpec,
            connConfig.getBootstrap().setDefaultAutoCommit(autoCommit);
            }
                            handled = true;
                        mergeEntities = CommonUtils.toBoolean(paramValue);
                }
    public static void processNetworkHandlerProperties(
                        hideFolders = CommonUtils.toBoolean(paramValue);
            }
 *
                    {
        }
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        DBPDataSourceRegistry dsRegistry = project.getDataSourceRegistry();
            log.error("Driver name not specified - can't create new datasource");
                                matched = false;
                        savePassword = CommonUtils.toBoolean(paramValue);
                    case PARAM_ID:
            .stream()
                for (DBPDataSourceContainer ds : dsRegistry.getDataSources()) {
 * Unless required by applicable law or agreed to in writing, software

        if (autoCommit != null) {
                            if (!matched) {
                    continue;
            String serverName = cfg.getServerName();
                processNetworkHandlerProperties(newDS, savePassword, handlerUpdateParams);

 * Copyright (C) 2010-2026 DBeaver Corp and others
            prefixes.add(prefix);
                log.error("Datasource '" + dsIdOrName + "' not found in project '" + project.getName() + "'");
            if (dataSource == null) {
 * limitations under the License.
            if (!availableHandlers.containsKey(prefix)) {
        DBPDataSourceContainer dataSource = null;
        if (savePassword) {
import org.jkiss.dbeaver.model.secret.DBSSecretValue;
        return "......";
            handlerConfiguration.setEnabled(true);
                try {
                continue;
                        break;
                            DBWHandlerConfiguration handler = cfg.getHandler(handlerProp.getKey());
                            String suffix = paramName.substring(PREFIX_NET_HANDLER.length());
        try {
        @Nullable GeneralUtils.IParameterHandler parameterHandler,
        }
            mergeEntities = false,
                                break;
    private static final String PARAM_SHOW_UTILITY_OBJECTS = "showUtilityObjects";
            log.error("Driver '" + driverName + "' not found");
    private static final String PREFIX_ADVANCED_PROP = "advProp.";
    public static final String PARAM_SERVER = "server";
        String driverName = null, url = null, host = null, port = null,
            if (!CommonUtils.isEmpty(authProperties)) connConfig.setAuthProperties(authProperties);
        connConfig.setUrl(url);

    public static final String PARAM_DRIVER = "driver";
                                handled = true;
                if (CommonUtils.isEmpty(value) && !propId.startsWith(handlerPrefix)) {
                            handled = true;
                    case PARAM_AUTO_COMMIT:
            }
            return cfg.getUrl();
                        break;
    ) {
        navSettings.setMergeEntities(mergeEntities);
                "Invalid network handler parameters: " + String.join(", ", unknownParams)

                        host = paramValue;
        }
        Map<String, String> handlerUpdateParams = new HashMap<>();
                        break;
            }
            isTemporary = true;
                            }
            dataSource = dsRegistry.findDataSourceByName(dsName);
                            authProperties.put(paramName, paramValue);
import java.util.*;

                unknownParams.add(networkHandlerParam);
                        } else if (parameterHandler != null) {
import org.jkiss.code.NotNull;
                switch (propertyDescriptor.getId()) {
                    return objectInformation;

public class DataSourceUtils {
            return CommonUtils.notEmpty(serverName);
                                handlerUpdateParams.put(suffix, paramValue);
    public static final String PARAM_NAME = "name";
package org.jkiss.dbeaver.utils;
                    case PARAM_HIDE_FOLDERS:
            secret.getValue(),
        }
}
            if (!CommonUtils.isEmpty(advancedProperties)) connConfig.setProviderProperties(advancedProperties);
            DBPConnectionConfiguration connConfig = dataSource.getConnectionConfiguration();
                                advancedProperties.put(suffix, paramValue);
            for (DBPPropertyDescriptor propertyDescriptor : handlerDescriptor.getHandlerProperties()) {
                                matched = false;
    public static String getJumpServerSettingsPrefix(int index) {
    @NotNull
                        user = paramValue;
                        break;
                        break;
        newDS.setName(dsName);
                        } else if (paramName.startsWith(PREFIX_ADVANCED_PROP)) {

import org.jkiss.dbeaver.model.app.DBPProject;
                        } else if (paramName.length() > PREFIX_AUTH_PROP.length() && paramName.startsWith(PREFIX_AUTH_PROP)) {
            Object userName = secretMap.get(DBConstants.PROP_USER);
        String dsId = null, dsName = null, dsIdOrName = null;
        DBPDriver driver = DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver(driverName);
            if (!CommonUtils.isEmpty(conProperties)) connConfig.setProperties(conProperties);
            String prefix = paramParts[0];
                            }
        connConfig.setProviderProperties(advancedProperties);
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
                    default:
        }
                int divPos = cp.indexOf('=');
                        break;
                        database = paramValue;

        boolean
                return hostText + ":" + hostPort;
    private static final String PARAM_HIDE_FOLDERS = "hideFolders";
        connConfig.setHostName(host);
                        break;
                if (CommonUtils.isEmpty(value)) {
        @NotNull DBPProject project,
                        handlerConfiguration.setPassword(value);
        connConfig.setServerName(server);
                                continue;
    public static String getSubjectFromSecret(DBSSecretValue secret) {
            newDS.setFolder(folder);
import org.jkiss.dbeaver.model.net.DBWUtils;
                handlerConfiguration = new DBWHandlerConfiguration(handlerDescriptor, dataSource);
                            if (!CommonUtils.equalObjects(cfg.getProperty(prop.getKey()), prop.getValue())) {
            }
                        break;

                    case PARAM_NAME:
        // Create new datasource with specified parameters
import org.jkiss.dbeaver.model.*;
            }
                    return ds;
                        }
        DBPDataSourceFolder folder = null;
                        if (!matched) {
/**
                }
                }

            showSystemObjects = false,
        boolean searchByParameters,

    private static final String PARAM_HIDE_SCHEMAS = "hideSchemas";
                    case PARAM_AUTH_MODEL:
 */

        if (secretMap != null) {
                        break;
            showOnlyEntities = false,

                if (!CommonUtils.isEmpty(objectInformation)) {
                        showOnlyEntities = CommonUtils.toBoolean(paramValue);
    private static final String PARAM_SHOW_ONLY_ENTITIES = "showOnlyEntities";
    }
    private static final String PREFIX_PROP = "prop.";
        if (driver == null) {
                        break;
                        for (Map.Entry<String, String> prop : conProperties.entrySet()) {
    public static final String PARAM_URL = "url";
                            parameterHandler.setParameter(paramName, paramValue);
 */
            server = null, database = null,
        return folder.getDataSourceRegistry().getDataSources().stream().anyMatch(d -> d.getFolder() == folder && d.isTemporary());
        if (dsId != null) {
    public static final String PROP_JUMP_SERVER = "jumpServer";
    private static final String PARAM_SAVE_PASSWORD = "savePassword";
            if (dataSourceProvider instanceof DBPInformationProvider dbpInformationProvider) {
        if (searchByParameters) {
                                }
                switch (paramName) {

                            conProperties.put(paramName, paramValue);
                            continue;
                    case PARAM_SHOW_UTILITY_OBJECTS:
                            handled = true;
            try {
            DBWHandlerConfiguration handlerConfiguration = connectionConfiguration.getHandler(handlerDescriptor.getId());
                String paramValue = cp.substring(divPos + 1);
                String paramName = cp.substring(0, divPos);
        if (folder != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            handlerConfiguration.setSavePassword(savePassword);
                }
        for (String networkHandlerParam : handlerParams.keySet()) {
                        }
                if (divPos == -1) {
        @NotNull DBPDataSourceContainer dataSource,
                if (CommonUtils.isEmpty(value)) {
        } else if (dsName != null) {
    private static final String PARAM_SHOW_SYSTEM_OBJECTS = "showSystemObjects";
        List<String> unknownParams = new ArrayList<>();
        if (CommonUtils.isEmpty(handlerParams)) {
            }
        Map<String, ? extends DBWHandlerDescriptor> availableHandlers = handlerRegistry.getDescriptors(dataSource.getDriver())
                }
                        }
                    case PARAM_PORT:
            savePassword = true,
                            paramName = paramName.substring(divPos + 1);
            if (!CommonUtils.isEmpty(password)) connConfig.setUserPassword(password);
            String hostText = DBWUtils.getTargetTunnelHostName(dataSourceContainer, cfg);
            );
    }
        }
        boolean createNewDataSource
    private static final String PARAM_MERGE_ENTITIES = "mergeEntities";
            if (dataSource == null) {
                    default:
                        break;
    public static final String PARAM_USER = "user";
                        if (parameterHandler != null) {
            connConfig.setAuthProperties(authProperties);
 *     http://www.apache.org/licenses/LICENSE-2.0
        navSettings.setShowOnlyEntities(showOnlyEntities);
import org.jkiss.utils.CommonUtils;
            dataSource = dsRegistry.getDataSource(dsIdOrName);
        } catch (DBException e) {
                    case "user":
        }
import org.jkiss.dbeaver.Log;
        }
            connConfig.setAuthModelId(authModelId);
    ) throws DBException {
                        autoCommit = CommonUtils.toBoolean(paramValue);
                        showUtilityObjects = CommonUtils.toBoolean(paramValue);
        if (!CommonUtils.isEmpty(authProperties)) {
            } catch (DBException e) {
                                if (!CommonUtils.equalObjects(handler.getProperty(prop.getKey()), prop.getValue())) {
    private static final String PARAM_PASSWORD = "password";
                    if (server != null && !server.equals(cfg.getServerName()) ||
                        break;

                        boolean handled = false;
            newDS.setSavePassword(true);
    private static final String PREFIX_NET_HANDLER = "netHandler."; // set params
                            }
                        //id from descriptor must be used, because id entered by the user may differ
 * You may obtain a copy of the License at
        boolean savePassword,
                } catch (DBException e) {
        navSettings.setShowUtilityObjects(showUtilityObjects);
            }
            log.error(e);
                                    matched = false;
                }
                    DBPInformationProvider.INFO_TARGET_ADDRESS
import org.jkiss.dbeaver.DBException;
                    if (url.equals(ds.getConnectionConfiguration().getUrl())) {
                    case "password":

        connConfig.setDatabaseName(database);
            if (handlerConfiguration == null) {
                unknownParams.add(networkHandlerParam);
        Map<String, String> advancedProperties = new HashMap<>();
            dsIdOrName = conParams[0];
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            continue;
            hideFolders = false,
                            handlerPopMap.put(paramName, paramValue);
        }
                            log.debug("Unknown connection parameter '" + paramName + "'");
                    if (!conProperties.isEmpty()) {
                        break;
                String propId = propertyDescriptor.getId();
        Map<String, String> authProperties = new HashMap<>();
                    //no value and default value for property
                        break;
                        authModelId = paramValue;
                    case PARAM_SHOW_ONLY_ENTITIES:
            user = null, password = null, authModelId = null;
 * DBeaver - Universal Database Manager
        if (!CommonUtils.isEmpty(unknownParams)) {

/*
                        continue;
            }
                            paramName = paramName.substring(PREFIX_AUTH_PROP.length());
        if (!CommonUtils.isEmpty(handlerUpdateParams)) {
        if (dataSource == null && dsIdOrName != null) {
            DBWHandlerDescriptor handlerDescriptor = availableHandlers.get(prefix);
                }
                        }
                    }
                                    break;
            if (paramParts.length != 2) {
                        break;
                            Map<String, String> handlerPopMap = handlerProps.computeIfAbsent(handlerId, k -> new HashMap<>());
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
    }

    private static final String PARAM_AUTH_MODEL = "auth";
        if (cfg.getConfigurationType() == DBPDriverConfigurationType.MANUAL) {
                    case PARAM_SERVER:
            throw new DBException(
        }
                    boolean matched = true;
            if (database != null) {
        connConfig.setUserPassword(password);
    public static DBPDataSourceContainer getDataSourceBySpec(
                    case PARAM_SHOW_SYSTEM_OBJECTS:
        if (conParams.length == 1 && conParams[0].indexOf('=') == -1) {
        DBPConnectionConfiguration connConfig = new DBPConnectionConfiguration();
    public static final String PARAM_ID = "id";
        connConfig.setUserName(user);
                    case PARAM_CREATE:
                        break;
                }
    private static final String PARAM_FOLDER = "folder";
        if (!createNewDataSource) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
            .collect(Collectors.toMap(DBWHandlerDescriptor::getPrefix, h -> h));

                dsName += " - " + database;
            dsName = "Ext: " + driver.getName();
                            }
            if (url != null) {
                            }
                return null;
                    }
        }
                dataSource = dsRegistry.findDataSourceByName(dsIdOrName);
                            for (Map.Entry<String, String> prop : handlerProp.getValue().entrySet()) {
    public static final String PARAM_SAVE = "save";
                        isTemporary = !CommonUtils.toBoolean(paramValue);
        Boolean autoCommit = null;
                continue;
            if (!CommonUtils.isEmpty(user)) connConfig.setUserName(user);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
                    case PARAM_DRIVER:
                return userName.toString();
        Map<String, Map<String, String>> handlerProps = new HashMap<>();
            } else {
        connConfig.setHostPort(port);
                        host != null && !host.equals(cfg.getHostName()) ||
        Map<String, Object> secretMap = DBInfoUtils.SECRET_GSON.fromJson(
            return dataSource;
import org.jkiss.code.Nullable;
        DBNBrowseSettings navSettings = newDS.getNavigatorSettings();
                String objectInformation = dbpInformationProvider.getObjectInformation(
            String handlerPrefix = handlerDescriptor.getPrefix() + ".";
        }
                        createNewDataSource = CommonUtils.toBoolean(paramValue);

                        showSystemObjects = CommonUtils.toBoolean(paramValue);
                            if (handler == null) {
    private static final String PREFIX_HANDLER = "handler."; //for search
        var connectionConfiguration = dataSource.getConnectionConfiguration();
        }
                        dsId = paramValue;
        return PROP_JUMP_SERVER + index + ".";
                        folder = dsRegistry.getFolder(paramValue);
                        break;
                            // network handler prop

        if (!CommonUtils.isEmpty(authModelId)) {
                    }
                        if (paramName.length() > PREFIX_PROP.length() && paramName.startsWith(PREFIX_PROP)) {
import org.jkiss.dbeaver.model.net.DBWHandlerDescriptor;
    public static final String PARAM_HOST = "host";

                        break;
                            }
        navSettings.setHideSchemas(hideSchemas);
 *

                    if (!handlerProps.isEmpty()) {
            if (!CommonUtils.isEmpty(authModelId)) connConfig.setAuthModelId(authModelId);
        String subjectId = secret.getSubjectId();
        }
                    case PARAM_USER:
            connectionConfiguration.updateHandler(handlerConfiguration);
            if (!CommonUtils.isEmpty(handlerUpdateParams)) {
                                handled = true;
    private static final String PREFIX_AUTH_PROP = "authProp.";
            return null;
    private static final String PARAM_CREATE = "create";
                }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                            if (!suffix.isEmpty()) {
        navSettings.setHideFolders(hideFolders);
                    case PARAM_HIDE_SCHEMAS:
                        hideSchemas = CommonUtils.toBoolean(paramValue);
                        } else if (paramName.startsWith(PREFIX_NET_HANDLER)) {
                        if (!handled) {
        return subjectId == null ? secret.getDisplayName() : subjectId;
            return;
                        break;
                        dsName = paramValue;
                            paramName = paramName.substring(PREFIX_HANDLER.length());
            }
            // Try to find by parameters / handler props
                    dataSourceContainer,
            }
                        server = paramValue;

    }
                        } else {

                        database != null && !database.equals(cfg.getDatabaseName()) ||
                            handlerConfiguration.setSecureProperty(propertyDescriptor.getId(), value);
            dsRegistry.addDataSource(newDS);
                        user != null && !user.equals(cfg.getUserName()))
 * you may not use this file except in compliance with the License.
                                break;
            } else if (server != null) {
        }
            new TypeToken<Map<String, Object>>() {}.getType());
        }
                    value = handlerParams.get(handlerPrefix + propId);
                        } else if (paramName.length() > PREFIX_HANDLER.length() && paramName.startsWith(PREFIX_HANDLER)) {
        DBPDataSourceContainer newDS = dsRegistry.createDataSource(driver, connConfig);
        if (driverName == null) {
        @Nullable Map<String, String> handlerParams
                        }
    }

        }
        }
        DBWHandlerRegistry handlerRegistry = DBWorkbench.getPlatform().getNetworkHandlerRegistry();
 *
            showUtilityObjects = false,
                dsName += " - " + server;
                        if (propertyDescriptor.hasFeature("secured")) {

            }
                            paramName = paramName.substring(PREFIX_PROP.length());
                    log.error("Error applying network handler properties", e);
        }
                            handlerConfiguration.setProperty(propertyDescriptor.getId(), value);
    public static String getUserNameFromSecret(DBSSecretValue secret) {
                    case PARAM_FOLDER:
            return null;

    public static boolean isFolderHasTemporaryDataSources(DBPDataSourceFolder folder) {
                String value = handlerParams.get(propId);
                        for (Map.Entry<String, Map<String, String>> handlerProp : handlerProps.entrySet()) {
        Map<String, String> conProperties = new HashMap<>();
    public static final String PARAM_DATABASE = "database";
        if (dataSource != null) {
                        break;
                    case PARAM_URL:

        connConfig.setProperties(conProperties);
        return newDS;
                                log.debug("Wrong handler parameter: '" + paramName + "'");

                            return ds;
    }
                        url = paramValue;
        }
                            divPos = paramName.indexOf('.');
                                break;
                            handled = parameterHandler.setParameter(paramName, paramValue);
        if (dataSourceContainer.getDriver().isCustomEndpointInformation()) {
                    continue;
                log.error("Error applying network handler properties", e);
            if (CommonUtils.isNotEmpty(hostText)) {
        String[] conParams = connectionSpec.split("\\|");
        DBPConnectionConfiguration cfg = dataSourceContainer.getConnectionConfiguration();
    private static final Log log = Log.getLog(DataSourceUtils.class);
            }
                            }
        Set<String> prefixes = new HashSet<>();

                        }
                        driverName = paramValue;
