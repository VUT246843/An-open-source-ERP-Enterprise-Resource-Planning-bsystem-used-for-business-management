
            url.append(name).append("=").append(value);
 *
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo)
        }
import org.jkiss.utils.CommonUtils;
    public DBPDataSource openDataSource(
import org.jkiss.dbeaver.Log;

import org.jkiss.code.NotNull;
        String schemaName = connectionInfo.getProviderProperty(SnowflakeConstants.PROP_SCHEMA);
        hasParam = addParameter(url, "warehouse", warehouse, hasParam);
        // Backward compatibility
 *
import org.jkiss.dbeaver.model.connection.DBPDriver;
}
    }
 */
    @Override
    }
    private static final Log log = Log.getLog(SnowflakeDataSourceProvider.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return hasParam;
    public SnowflakeDataSourceProvider()
public class SnowflakeDataSourceProvider extends JDBCDataSourceProvider {
        @NotNull DBPDataSourceContainer container)
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * you may not use this file except in compliance with the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
    }
 *
        if (!CommonUtils.isEmpty(value)) {
    @NotNull
        return new SnowflakeDataSource(monitor, container, new SnowflakeMetaModel());
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        }
        throws DBException
        if (CommonUtils.isEmpty(warehouse)) {
        StringBuilder url = new StringBuilder();

 * DBeaver - Universal Database Manager
        return url.toString();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
    {
    private static boolean addParameter(StringBuilder url, String name, String value, boolean hasParam) {
        @NotNull DBRProgressMonitor monitor,
    @Override


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.snowflake;
        boolean hasParam = addParameter(url, "db", connectionInfo.getDatabaseName(), false);
 * You may obtain a copy of the License at
        url.append("/?");
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    public void init(@NotNull DBPPlatform platform) {
    {
            schemaName = connectionInfo.getProviderProperty(SnowflakeConstants.PROP_SCHEMA2);

            return true;
    {

import org.jkiss.dbeaver.model.app.DBPPlatform;
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
        if (CommonUtils.isEmpty(schemaName)) {
            warehouse = connectionInfo.getProviderProperty(SnowflakeConstants.PROP_WAREHOUSE);
    @Override
        String warehouse = connectionInfo.getServerName();

    {
        addParameter(url, "role", connectionInfo.getProviderProperty(SnowflakeConstants.PROP_ROLE_LEGACY), hasParam);
            if (hasParam) url.append("&");

    }
            url.append(":").append(connectionInfo.getHostPort());
import org.jkiss.dbeaver.ext.snowflake.model.SnowflakeMetaModel;
/*

    public long getFeatures()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.snowflake.model.SnowflakeDataSource;
        url.append("jdbc:snowflake://").append(connectionInfo.getHostName());

        }

        hasParam = addParameter(url, "schema", schemaName, hasParam);


        }
    @Override
