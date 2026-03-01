        this.providerProperties.clear();
                }
    public String getUserName() {
        new String[][]{
    }
        }

                    }

            synchronized (handlers) {
        return
    }
 * Unless required by applicable law or agreed to in writing, software

    public String getConnectionColor() {
        {VAR_PROJECT_NAME, "project name"},

        this.hostPort = hostPort;
    }
    }


    }
        return configProfileSource;
        for (DBWHandlerConfiguration handler : info.handlers) {
    // Misc
                handler.resolveDynamicVariables(variableResolver);
}


        return keepAliveInterval;
        this.userPassword = info.userPassword;
    private final Map<String, String> providerProperties;
        }
            return false;
        this.connectionColor = color;
    }
        }


    public String getClientHomeId() {

        this.connectionType = DBPConnectionType.DEFAULT_TYPE;

    // Network handlers
            } else {

            if (authModelDesc != null) {

                for (DBWHandlerConfiguration handlerConfig : profile.getConfigurations()) {

        {VARIABLE_DATE, "current date"},
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
            CommonUtils.equalOrEmptyStrings(this.hostName, source.hostName) &&
    public void setUserPassword(@Nullable String userPassword) {
    public Map<String, String> getAuthProperties() {
    public void setProviderProperties(@NotNull Map<String, String> properties) {
    }
    }
    }
    }
    @NotNull
    }
        this.providerProperties = new LinkedHashMap<>(info.providerProperties);
        properties.put(name, value);
    ////////////////////////////////////////////////////


    public void setHandlers(@NotNull List<DBWHandlerConfiguration> handlers) {
    }
    public void setServerName(String serverName) {
        this.connectionType = info.connectionType;
    public DBPConnectionBootstrap getBootstrap() {
    @NotNull

            this.handlers.add(new DBWHandlerConfiguration(handler));
    }
    public DBPConnectionConfiguration(@NotNull DBPConnectionConfiguration info) {
    @NotNull


    public static final String VARIABLE_CONN_TYPE_LEGACY = "connectionType";
import org.jkiss.dbeaver.model.runtime.DBRShellCommand;

            handlers.removeIf(handler -> handler.getId().equals(id));
    }
import org.jkiss.dbeaver.model.access.DBAAuthModel;
    }
            }
    public static final String[][] CONNECT_VARIABLES = new String[][]{
    private String userName;

     */
        } else {
    public static final String[][] INTERNAL_CONNECT_VARIABLES = ArrayUtils.concatArrays(
    ////////////////////////////////////////////////////
    }
        this.handlers = new ArrayList<>(info.handlers.size());
    public void setProperty(String name, String value) {
    }
    }
    }
    @NotNull
    }

    ////////////////////////////////////////////////////
                    return;
                CommonUtils.equalOrEmptyStrings(this.serverName, source.serverName) &&
                CommonUtils.equalObjects(this.handlers, source.handlers) &&
    private boolean closeIdleConnection;

    public void removeProviderProperty(String name) {

        {SystemVariablesResolver.VAR_HOME, "OS user home path"},
    private String databaseName;
    public DBPDriverConfigurationType getConfigurationType() {
    @NotNull
        this.handlers = new ArrayList<>();
        if (command == null) {
    }
    private final List<DBWHandlerConfiguration> handlers;
        url = GeneralUtils.replaceVariables(url, variableResolver);
    }
    ////////////////////////////////////////////////////

    }

    @Nullable
        }
    private int closeIdleInterval;
     * Otherwise, the profile configuration is updated, and the connection's
    public static final String VARIABLE_DATASOURCE = "datasource";
        this.hostName = info.hostName;

        this.closeIdleInterval = info.closeIdleInterval;

        if (value == null) {
    @Nullable
    }
    /**
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
        this.configurationType = info.configurationType;
        resolveDynamicVariablesInMap(this.providerProperties, variableResolver);
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

     * If {@code null} is passed, only the profile configuration is cleared.
    public void setProviderProperty(String name, String value) {
    public String getServerName() {
 * distributed under the License is distributed on an "AS IS" BASIS,

                CommonUtils.equalObjects(this.authProperties, source.authProperties) &&
    @NotNull
        }
    public int getCloseIdleInterval() {
        return closeIdleConnection;
        this.properties.clear();
    }
        properties.remove(name);
            for (int i = 0; i < handlers.size(); i++) {
import org.jkiss.dbeaver.model.DBPObject;
                }
    public String getAuthProperty(String name) {
    public boolean hasProperty(String name) {
    @NotNull
        this.url = info.url;

    }
    }
        return properties.get(name);
    public void setRuntimeAttribute(String name, Object value) {
    }
    public boolean isCloseIdleConnection() {
    public void setProperties(@NotNull Map<String, String> properties) {
        this.keepAliveInterval = keepAliveInterval;
        this.closeIdleConnection = closeIdleConnection;
                return authModelDesc.getInstance();
    public String getAuthModelId() {
    private DBPDriverConfigurationType configurationType;
        this.configurationType = DBPDriverConfigurationType.MANUAL;
    private int keepAliveInterval;
    /**
            }
        return properties.containsKey(name);
    public int getKeepAliveInterval() {
        hostName = GeneralUtils.replaceVariables(hostName, variableResolver);
        return "ConnectionConfiguration: " + (url == null ? databaseName : url);
        {VARIABLE_DATASOURCE, "datasource"},

    public static final String VAR_HOST_OR_DATABASE = "host_or_database";
        return hostPort;
        return getAuthModelDescriptor(AuthModelDatabaseNative.ID);
    public String getHostPort() {

        this.authModelId = info.authModelId;
    public Map<String, String> getProperties() {
    public DBPAuthModelDescriptor getAuthModelDescriptor() {
    }
    // Properties (connection properties, usually used by driver)
import org.jkiss.code.Nullable;
    public void setConnectionType(DBPConnectionType connectionType) {
    ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////

    public String getUrl() {
     * @return RGB color or null
    private final DBPConnectionBootstrap bootstrap;
    }
                handlers.clear();
        {SystemVariablesResolver.VAR_APP_VERSION, "application version"},
        return runtimeAttributes;
    }
    private String serverName;
        if (!(obj instanceof DBPConnectionConfiguration)) {
        return properties;
        if (authProperties == null) {
    @NotNull
                CommonUtils.equalObjects(this.bootstrap, source.bootstrap) &&
    }
                CommonUtils.equalObjects(this.configurationType, source.configurationType) &&
        }
    public String getHostName() {

     */
    public void removeHandler(@NotNull String id) {
    }
    public DBRShellCommand getEvent(DBPConnectionEventType eventType) {
import org.jkiss.dbeaver.Log;
    // Authentication
            configProfileName = profile.getProfileId();
                CommonUtils.equalObjects(this.clientHomeId, source.clientHomeId) &&
        return DBWorkbench.getPlatform().getDataSourceProviderRegistry().getAuthModel(id);
        return authProperties;
 * Connection configuration.
    }
                CommonUtils.equalObjects(this.properties, source.properties) &&
        this.keepAliveInterval = 0;
        this.userName = userName;

    public void resolveDynamicVariables(IVariableResolver variableResolver) {

    public String getUserPassword() {
    public void setConfigProfile(@Nullable DBWNetworkProfile profile) {

 * you may not use this file except in compliance with the License.
                CommonUtils.equalOrEmptyStrings(this.hostPort, source.hostPort) &&
    public static final String VARIABLE_USER = "user";
        return handlers;
    public static final String VARIABLE_PREFIX_PROPERTIES = "properties.";
    public String toString() {

    // Provider properties (extra configuration parameters)

                if (cfg.getId().equals(id)) {
    }
            } else {
                    if (handlerConfig.isEnabled()) {
    @Nullable
    public void setConnectionColor(String color) {
    public Map<String, Object> getRuntimeAttribute() {
        return hostName;
        userName = GeneralUtils.replaceVariables(userName, variableResolver);

    private String configProfileSource;
        synchronized (handlers) {


import org.jkiss.utils.ArrayUtils;
        runtimeAttributes.put(name, value);
 */
                CommonUtils.equalObjects(this.events, source.events) &&
        this.runtimeAttributes = new HashMap<>();
        }

        this.providerProperties.putAll(properties);
                CommonUtils.equalObjects(this.authModelId, source.authModelId) &&
        return databaseName;
        return configurationType;
     * Color in RGB format
        {SystemVariablesResolver.VAR_LOCAL_IP, "local IP address"},
        return userName;
 * Licensed under the Apache License, Version 2.0 (the "License");
    // Runtime attributes
                CommonUtils.equalObjects(this.providerProperties, source.providerProperties) &&
    }
        this.connectionColor = info.connectionColor;
 *
    public void setCloseIdleInterval(int closeIdleInterval) {

        {VARIABLE_PORT, "target database port"},
    }
        this.serverName = serverName;
                }
        return bootstrap;
                CommonUtils.equalOrEmptyStrings(this.databaseName, source.databaseName) &&
    }
    private final Map<String, Object> runtimeAttributes;
        {VAR_PROJECT_PATH, "project path"},
        return connectionType;
    public List<DBWHandlerConfiguration> getHandlers() {
public class DBPConnectionConfiguration implements DBPObject {

    public static final String VARIABLE_PASSWORD = "password";
            this.handlers.clear();
    public boolean equals(Object obj) {
        this.properties.putAll(properties);
        for (Map.Entry<DBPConnectionEventType, DBRShellCommand> entry : info.events.entrySet()) {
        synchronized (this.handlers) {
            }
    public void setAuthModelId(String authModelId) {
        this.configProfileName = info.configProfileName;
        }
    }
    };
    public Object getRuntimeAttribute(String name) {
    }

    public static final String VARIABLE_TIME = "time";
        return eventTypes.toArray(new DBPConnectionEventType[0]);
        }

            this.handlers.addAll(handlers);
        synchronized (handlers) {

    public static final String VARIABLE_CONN_TYPE = "connection.type";
    public static final String VARIABLE_PREFIX_ORIGIN = "origin.";
        if (authProperties == null) {
            prop.setValue(GeneralUtils.replaceVariables(prop.getValue(), variableResolver));

    @Override

    

    public String getProperty(String name) {
        providerProperties.remove(name);
    public Map<String, String> getProviderProperties() {
    }
        return userPassword;
        if (!CommonUtils.isEmpty(authModelId)) {
import org.jkiss.utils.CommonUtils;
    public static final String VARIABLE_PREFIX_AUTH = "auth.";
            this.authProperties = new LinkedHashMap<>(authProperties);
        this.configurationType = configurationType;
            // {VARIABLE_PASSWORD, "database password (plain)"},  see dbeaver/pro#1861
        CONNECT_VARIABLES,
    public String getDatabaseName() {
    // Misc
    public static final String VARIABLE_HOST = "host";
        this.hostName = hostName;

    public void setConfigProfileName(@Nullable String configProfileName) {
     * <p>
    ////////////////////////////////////////////////////
        resolveDynamicVariablesInMap(this.properties, variableResolver);
    }
        this.databaseName = info.databaseName;
    @Nullable
        this.configProfileSource = configProfileSource;
        this.properties = new LinkedHashMap<>(info.properties);
    }
        {VARIABLE_USER, "database user name"},
        providerProperties.put(name, value);

            }

        this.databaseName = databaseName;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return AuthModelDatabaseNative.INSTANCE;
     * network handlers are replaced with the profile's.
    }
    private static final Log log = Log.getLog(DBPConnectionConfiguration.class);
    public static final String VARIABLE_PREFIX_TAG = "tag.";
        this.authProperties = info.authProperties == null ? null : new LinkedHashMap<>(info.authProperties);
        {VARIABLE_HOST, "target database host"},
        this.hostPort = info.hostPort;
    }
    }
    }
        this.bootstrap = new DBPConnectionBootstrap(info.bootstrap);
    public void setAuthProperty(@NotNull String name, @Nullable String value) {

        this.userPassword = userPassword;
                this.closeIdleConnection == source.closeIdleConnection &&
    }
        {SystemVariablesResolver.VAR_WORKSPACE, "workspace path"},
        this.keepAliveInterval = info.keepAliveInterval;


            return null;
        DBPConnectionConfiguration source = (DBPConnectionConfiguration) obj;
            events.put(eventType, command);
    public void setHostPort(String hostPort) {
    private String userPassword;
        return connectionColor;
            this.authProperties.put(name, value);
    public void setClientHomeId(String clientHomeId) {
    }
    public void setAuthProperties(@Nullable Map<String, String> authProperties) {
    private String authModelId;

            configProfileName = null;
import org.jkiss.code.NotNull;
        return events.get(eventType);
 */
        }
            }
        return closeIdleInterval;
        this.clientHomeId = clientHomeId;
    }
    public String getConfigProfileName() {
 *
            DBPAuthModelDescriptor authModelDesc = getAuthModelDescriptor(authModelId);
        }

    }
    }

            this.authProperties.remove(name);
        return runtimeAttributes.get(name);
    }
        this.runtimeAttributes = info.runtimeAttributes;
     * Zero or negative means no keep-alive.
    public static final String VARIABLE_HOST_TUNNEL = "host.tunnel";
    public DBPConnectionEventType[] getDeclaredEvents() {
        }
    public void setEvent(DBPConnectionEventType eventType, DBRShellCommand command) {
                        updateHandler(new DBWHandlerConfiguration(handlerConfig));
     * Sets the network profile for this configuration.
package org.jkiss.dbeaver.model.connection;
    }
        {VARIABLE_URL, "connection URL"},
import org.jkiss.dbeaver.runtime.DBWorkbench;
                return authModelDesc;

    private String url;
        return clientHomeId;

import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
        }
            if (authModelDesc != null) {
        this.events = new LinkedHashMap<>(info.events.size());
    private void resolveDynamicVariablesInMap(Map<String, String> map, IVariableResolver variableResolver) {
        return authProperties == null ? null : authProperties.get(name);
    }
        hostPort = GeneralUtils.replaceVariables(hostPort, variableResolver);

            events.remove(eventType);

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final String VARIABLE_URL = "url";
    private final Map<String, String> properties;
 * You may obtain a copy of the License at
        return url;
        this.events = new LinkedHashMap<>();
        return serverName;

    private String hostPort;
        if (profile == null) {
    /**
                CommonUtils.equalOrEmptyStrings(this.userName, source.userName) &&
    private DBPConnectionType connectionType;
            }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.runtime.IVariableResolver;
    public void setCloseIdleConnection(boolean closeIdleConnection) {

        }
    public String getProviderProperty(String name) {
    @NotNull
                CommonUtils.equalOrEmptyStrings(this.userPassword, source.userPassword) &&
    private String hostName;

        }
        if (map == null) {
        return getHandler(id) != null;
        });
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBPConnectionConfiguration() {
    }
        {VARIABLE_HOST_TUNNEL, "tunnel host name"},
        return providerProperties.get(name);
    public void setConfigProfileSource(@Nullable String configProfileSource) {
        this.configProfileName = configProfileName;



    public void setKeepAliveInterval(int keepAliveInterval) {
                if (handlers.get(i).getId().equals(handler.getId())) {
    public boolean hasHandler(@NotNull String id) {
        this.authModelId = authModelId;
        this.properties = new LinkedHashMap<>();
        synchronized (handlers) {
    private String connectionColor;

    }
            for (DBWHandlerConfiguration cfg : handlers) {
 *

    public static final String VARIABLE_PORT = "port";
    public DBPConnectionType getConnectionType() {
    }
        resolveDynamicVariablesInMap(this.authProperties, variableResolver);

        {SystemVariablesResolver.VAR_APP_NAME, "application name"},
    @NotNull
        } else {
    public void setConfigurationType(@NotNull DBPDriverConfigurationType configurationType) {
                log.error("Authentication model '" + authModelId + "' not found. Use default.");

    }
    public void setUrl(String url) {
        this.closeIdleConnection = info.closeIdleConnection;
        this.closeIdleConnection = true;
    }
    // Variables

                this.closeIdleInterval == source.closeIdleInterval;
            configProfileSource = profile.getProfileSource();
        this.closeIdleInterval = closeIdleInterval;
        databaseName = GeneralUtils.replaceVariables(databaseName, variableResolver);
            if (handler.isEnabled()) {
    public void setUserName(String userName) {
    }

        this.serverName = info.serverName;
    }
    public void removeProperty(String name) {
        {SystemVariablesResolver.VAR_APP_PATH, "application install path"},
        Set<DBPConnectionEventType> eventTypes = events.keySet();
                CommonUtils.equalObjects(this.configProfileName, source.configProfileName) &&
        } else {
        this.clientHomeId = info.clientHomeId;
        for (DBWHandlerConfiguration handler : handlers) {
                log.error("Authentication model '" + authModelId + "' not found. Use default.");
    public String getConfigProfileSource() {
    public <T extends DBAAuthCredentials> DBAAuthModel<T> getAuthModel() {
        return providerProperties;
     *
import java.util.*;
    public void setHostName(String hostName) {
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
        userPassword = GeneralUtils.replaceVariables(userPassword, variableResolver);
        serverName = GeneralUtils.replaceVariables(serverName, variableResolver);


     * Keep-Alive interval (seconds).
        {VARIABLE_SERVER, "target server name"},
        for (Map.Entry<String, String> prop : map.entrySet()) {

    }
    private Map<String, String> authProperties;
    private String configProfileName;
 * limitations under the License.
    }

    private final Map<DBPConnectionEventType, DBRShellCommand> events;
            DBPAuthModelDescriptor authModelDesc = getAuthModelDescriptor(authModelId);

        this.bootstrap = new DBPConnectionBootstrap();

    }
    public void setDatabaseName(String databaseName) {
    public static final String PROP_SECRET_SUBJECT_ID = "shared.credentials.default.subject";

    public void updateHandler(@NotNull DBWHandlerConfiguration handler) {
        this.connectionType = connectionType;
     */
            this.authProperties = null;
    }

        {VARIABLE_CONN_TYPE, "connection type"},
            return;
    }

    }

    public static final String VARIABLE_DATE = "date";
        this.providerProperties = new LinkedHashMap<>();
        } else {
        return configProfileName;
            configProfileSource = null;
        this.closeIdleInterval = 0;
    @NotNull

    }
            this.handlers.add(handler);
        }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
                CommonUtils.equalObjects(this.connectionType, source.connectionType) &&
            this.events.put(entry.getKey(), new DBRShellCommand(entry.getValue()));

            authProperties = new LinkedHashMap<>();
    // Events
        if (!CommonUtils.isEmpty(authModelId)) {
    public static final String VARIABLE_DATABASE = "database";
        this.url = url;
     *
                    return cfg;

    public DBWHandlerConfiguration getHandler(@NotNull String id) {
                CommonUtils.equalOrEmptyStrings(this.url, source.url) &&
        bootstrap.resolveDynamicVariables(variableResolver);
        this.configProfileSource = info.configProfileSource;


/*
/**
    public static final String VARIABLE_SERVER = "server";
                CommonUtils.equalObjects(this.configProfileSource, source.configProfileSource) &&

    }
    }
                this.keepAliveInterval == source.keepAliveInterval &&
    private String clientHomeId;
    public static final String VAR_PROJECT_NAME = "project.name";
    ///////////////////////////////////////////////////////////
    public static final String VAR_PROJECT_PATH = "project.path";
    }
                    handlers.set(i, handler);
    @NotNull
        return authModelId;
    private DBPAuthModelDescriptor getAuthModelDescriptor(String id) {
        {VARIABLE_DATABASE, "target database name"},
        this.userName = info.userName;

     * @param profile the network profile

    @NotNull
    @Nullable
        {SystemVariablesResolver.VAR_DBEAVER_HOME, "application install path"},
