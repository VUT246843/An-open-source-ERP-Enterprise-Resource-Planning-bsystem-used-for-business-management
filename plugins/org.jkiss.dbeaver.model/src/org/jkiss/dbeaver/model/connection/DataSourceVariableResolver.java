    }

 * You may obtain a copy of the License at
                    return DBWUtils.getTargetTunnelHostName(dataSourceContainer, configuration);
    private static final Log log = Log.getLog(DataSourceVariableResolver.class);
                case DBPConnectionConfiguration.VARIABLE_PORT:

                return dataSourceContainer.getTagValue(
            }
    public String get(@NotNull String name) {
            if (name.startsWith(DBPConnectionConfiguration.VARIABLE_PREFIX_PROPERTIES)) {

 *
            if (DBPConnectionConfiguration.VARIABLE_PASSWORD.equals(name) && isSecure()) {
        return dataSourceContainer;
                case DBPConnectionConfiguration.VAR_PROJECT_PATH:
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    }
            switch (name) {
    public DBPDataSourceContainer getDataSourceContainer() {
            switch (name) {
        }
            }
            }

                return configuration.getUserPassword();
                    return RuntimeUtils.getCurrentTime();
                    Object value = BeanUtils.readObjectProperty(origin, originProperty);
                    return configuration.getServerName();
    protected boolean isResolveSystemVariables() {
    private final DBPDataSourceContainer dataSourceContainer;
    }
                case DBPConnectionConfiguration.VARIABLE_DATASOURCE:
 * Licensed under the Apache License, Version 2.0 (the "License");
            // isSecure() is always false here due to dbeaver/pro#1861
        this.dataSourceContainer = dataSourceContainer;
            }

            }
public class DataSourceVariableResolver extends SystemVariablesResolver {
                    return configuration.getUserName();
import org.jkiss.dbeaver.model.net.DBWUtils;
                }
            if (propValue != null) {
    @Override
        this.configuration = configuration;
    public DataSourceVariableResolver(
 *
                case DBPConnectionConfiguration.VARIABLE_USER:
                    name.substring(DBPConnectionConfiguration.VARIABLE_PREFIX_TAG.length()));
                case DBPConnectionConfiguration.VARIABLE_HOST_TUNNEL:
                        return value.toString();
                case DBPConnectionConfiguration.VAR_PROJECT_NAME:
                case DBPConnectionConfiguration.VARIABLE_TIME:
            if (name.startsWith(DBPConnectionConfiguration.VARIABLE_PREFIX_ORIGIN)) {

        return false; // see dbeaver/pro#1861
                    return configuration.getHostPort();
 * limitations under the License.
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (configuration != null) {
        return DBWorkbench.getPlatform().getApplication().isEnvironmentVariablesAccessible();
    }
                    log.debug("Invalid datasource origin property '" + originProperty + "': " + e.getMessage(), e);
                    return dataSourceContainer.getProject().getAbsolutePath().toAbsolutePath().toString();
                case DBPConnectionConfiguration.VARIABLE_DATABASE:
            }
                    name.substring(DBPConnectionConfiguration.VARIABLE_PREFIX_PROPERTIES.length()));
                try {
            String propValue = configuration.getProperty(name);

import org.jkiss.dbeaver.utils.SystemVariablesResolver;
                    return configuration.getDatabaseName();
                    return dataSourceContainer.getProject().getName();
            }
                    return configuration.getHostName();
            if (name.startsWith(DBPConnectionConfiguration.VARIABLE_PREFIX_AUTH)) {
import org.jkiss.code.Nullable;
    @Nullable
                case DBPConnectionConfiguration.VARIABLE_DATE:
    public boolean isSecure() {
                    return configuration.getUrl();
        return configuration;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    protected DBPConnectionConfiguration getConfiguration() {
import org.jkiss.utils.BeanUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (name.startsWith(DBPConnectionConfiguration.VARIABLE_PREFIX_TAG)) {
                case DBPConnectionConfiguration.VARIABLE_URL:
                    return configuration.getConnectionType().getId();
                case DBPConnectionConfiguration.VARIABLE_CONN_TYPE:
        }
                return configuration.getAuthProperty(
                String originProperty = name.substring(DBPConnectionConfiguration.VARIABLE_PREFIX_ORIGIN.length());
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (value != null) {
import org.jkiss.dbeaver.Log;
                    name.substring(DBPConnectionConfiguration.VARIABLE_PREFIX_AUTH.length()));
                return configuration.getProperty(
                } catch (Exception e) {

 * you may not use this file except in compliance with the License.
                    return dataSourceContainer.getName();
 *
                case DBPConnectionConfiguration.VARIABLE_HOST:
    private final DBPConnectionConfiguration configuration;

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }

                DBPDataSourceOrigin origin = dataSourceContainer.getOrigin();
        return super.get(name);
        if (dataSourceContainer != null) {
 * DBeaver - Universal Database Manager
 */
        @Nullable DBPDataSourceContainer dataSourceContainer, @Nullable DBPConnectionConfiguration configuration) {
                return propValue;
/*
                case DBPConnectionConfiguration.VARIABLE_SERVER:
}
package org.jkiss.dbeaver.model.connection;
import org.jkiss.dbeaver.runtime.DBWorkbench;

 * Unless required by applicable law or agreed to in writing, software
                    return RuntimeUtils.getCurrentDate();
import org.jkiss.dbeaver.model.DBPDataSourceOrigin;

    }
    }
                case DBPConnectionConfiguration.VARIABLE_CONN_TYPE_LEGACY:
import org.jkiss.code.NotNull;
