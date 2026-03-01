        this.configuration = configuration;
                newName = getConfiguration().getServerName();
                newName = CoreMessages.dialog_connection_wizard_final_default_new_connection_name;

        return CONNECTION_NAME_VARIABLES_INFO;
    private final DataSourceDescriptor descriptor;
                    return DBWUtils.getTargetTunnelHostName(dataSourceContainer, configuration);
                    return configuration.getHostName();
        DBPConnectionConfiguration.VARIABLE_HOST_TUNNEL,
 *
    public static final String[][] CONNECTION_NAME_VARIABLES_INFO = new String[][]{
        {DBPConnectionConfiguration.VARIABLE_USER, "database user name"},

            switch (name) {
                newName = getDataSourceContainer().getDriver().getName();
            while (st.hasMoreTokens()) {
        DBPConnectionConfiguration.VARIABLE_CONN_TYPE,
}
    }
import org.jkiss.dbeaver.core.CoreMessages;
public class ConnectionNameResolver implements IVariableResolver {
 *
    };
        {DBPConnectionConfiguration.VARIABLE_HOST, "target database host"},
            }
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
 * you may not use this file except in compliance with the License.
    }
        return CONNECTION_NAME_VARIABLES;
                    return configuration.getUrl();
                    continue;
 * See the License for the specific language governing permissions and

                String nextPart = st.nextToken();
        DBPConnectionConfiguration.VARIABLE_PORT,
    @Override
        DBPConnectionConfiguration.VARIABLE_DATABASE,
                case DBPConnectionConfiguration.VARIABLE_HOST_TUNNEL:

        {DBPConnectionConfiguration.VARIABLE_HOST_TUNNEL, "tunnel database host"},
                case DBPConnectionConfiguration.VARIABLE_DATE:

                case DBPConnectionConfiguration.VAR_HOST_OR_DATABASE:
                case DBPConnectionConfiguration.VARIABLE_HOST:
        this.dataSourceContainer = dataSourceContainer;
                case DBPConnectionConfiguration.VARIABLE_URL:
    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
            }
    }
        DBPConnectionConfiguration.VARIABLE_SERVER,
            //newName = settings.getDriver().getName() + " - " + newName; //$NON-NLS-1$
 * DBeaver - Universal Database Manager
            StringTokenizer st = new StringTokenizer(newName, "/\\"); //$NON-NLS-1$
                    break;
                    return configuration.getDatabaseName();

    public DBPDataSourceContainer getDataSourceContainer() {
            }
        }
                    return RuntimeUtils.getCurrentDate();
            }
    @NotNull
                    return generateLegacyConnectionName();


        DBPConnectionConfiguration.VARIABLE_HOST,
import org.jkiss.dbeaver.runtime.IVariableResolver;

        if (CommonUtils.isEmpty(newName)) {
    public static String[] getConnectionVariables() {
    private final DBPDataSourceContainer dataSourceContainer;
                case DBPConnectionConfiguration.VARIABLE_CONN_TYPE:

    public String get(@NotNull String name) {
    @NotNull
    @Nullable

        {DBPConnectionConfiguration.VARIABLE_PORT, "target database port"},
    }
                    return configuration.getConnectionType().getId();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public static final String[] CONNECTION_NAME_VARIABLES = new String[]{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                case DBPConnectionConfiguration.VARIABLE_SERVER:
        String newName = descriptor == null ? "" : getDataSourceContainer().getName(); //$NON-NLS-1$
 *
        DBPConnectionConfiguration.VARIABLE_DATE,
                case DBPConnectionConfiguration.VARIABLE_CONN_TYPE_LEGACY:

                newName = getConfiguration().getHostName();
    };
                    break;
    public ConnectionNameResolver(DBPDataSourceContainer dataSourceContainer, DBPConnectionConfiguration configuration, @Nullable DataSourceDescriptor descriptor) {
        return dataSourceContainer;
                }
                case DBPConnectionConfiguration.VARIABLE_PORT:
    private final DBPConnectionConfiguration configuration;
                    return configuration.getServerName();
 * You may obtain a copy of the License at
        DBPConnectionConfiguration.VAR_HOST_OR_DATABASE
            newName = CommonUtils.truncateString(newName, 50);
            if (CommonUtils.isEmpty(newName) || newName.isBlank()) {
import java.util.StringTokenizer;
import org.jkiss.utils.CommonUtils;
                    return dataSourceContainer.getProject().getName();
                newName = nextPart;
                case DBPConnectionConfiguration.VARIABLE_DATABASE:
        {DBPConnectionConfiguration.VARIABLE_DATE, "current date"},
        DBPConnectionConfiguration.VARIABLE_USER,
package org.jkiss.dbeaver.ui.dialogs.connection;
            newName = getConfiguration().getDatabaseName();
        return CommonUtils.trim(CommonUtils.notEmpty(newName));
    }
        }
        }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.net.DBWUtils;
        {DBPConnectionConfiguration.VAR_HOST_OR_DATABASE, "Legacy configuration for the connection name"}
 */
            }
    public static String[][] getConnectionVariablesInfo() {
            if (CommonUtils.isEmpty(newName)) {
    @NotNull
                    return configuration.getUserName();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public DBPConnectionConfiguration getConfiguration() {
        {DBPConnectionConfiguration.VARIABLE_SERVER, "target server name"},
        DBPConnectionConfiguration.VARIABLE_URL,
        if (dataSourceContainer != null) {
        if (configuration != null) {
    private String generateLegacyConnectionName() {
        this.descriptor = descriptor;
                default:
        {DBPConnectionConfiguration.VARIABLE_DATABASE, "target database name"},
        DBPConnectionConfiguration.VAR_PROJECT_NAME,
            if (CommonUtils.isEmpty(newName)) {
                case DBPConnectionConfiguration.VARIABLE_USER:
                if (nextPart.matches("[0-9]+")) {
/*
            }
    }
        return configuration;
        {DBPConnectionConfiguration.VARIABLE_CONN_TYPE, "connection type"},
        {DBPConnectionConfiguration.VARIABLE_URL, "connection URL"},
 * Licensed under the Apache License, Version 2.0 (the "License");
                    return configuration.getHostPort();
    ;
 * distributed under the License is distributed on an "AS IS" BASIS,
                default:
            if (CommonUtils.isEmpty(newName)) {
            }
        {DBPConnectionConfiguration.VAR_PROJECT_NAME, "project name"},
 * limitations under the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
                case DBPConnectionConfiguration.VAR_PROJECT_NAME:
        return System.getenv(name);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            switch (name) {
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
