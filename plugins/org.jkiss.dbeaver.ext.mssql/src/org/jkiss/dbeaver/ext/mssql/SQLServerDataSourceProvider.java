/*
            if (isJtds) {
    }
                url.append("jdbc:sqlserver://");
                }
            // SQL Server
                url.append(connectionInfo.getHostName());
import org.jkiss.dbeaver.ext.mssql.model.SQLServerAuthentication;
                url.append(";integratedSecurity=true");
            }
        return new SQLServerDataSource(monitor, container);
    }
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            connectionInfo.getAuthModelId().equals(AuthModelDatabaseNative.ID)))
                    url.append(";encrypt=true"); // ;hostNameInCertificate=*.database.windows.net
            }
 * DBeaver - Universal Database Manager
    public SQLServerDataSourceProvider()
        if (connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL) {
                    url.append("?ServiceName=").append(connectionInfo.getDatabaseName());
    }
                url.append(connectionInfo.getHostName());

        StringBuilder url = new StringBuilder();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (isJtds) {
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
            } else {
    private static Map<String,String> connectionsProps;
                }
}
    @Override
    @NotNull
    public long getFeatures() {

        {
 *
                if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
                }
        return url.toString();
                    url.append("databaseName=").append(connectionInfo.getDatabaseName());
    {
                }
        if (driver.getProviderDescriptor().matchesId(SQLServerConstants.PROVIDER_SQL_SERVER) &&
                if (!CommonUtils.isEmpty(connectionInfo.getHostPort()) && !connectionInfo.getHostPort().equals(driver.getDefaultPort())) {
                    url.append("/").append(connectionInfo.getDatabaseName());
        boolean isSqlServer = SQLServerUtils.isDriverSqlServer(driver);
    public DBPAuthModelDescriptor detectConnectionAuthModel(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
import org.jkiss.code.NotNull;
            throws DBException
                }
        } else {
                if (isDriverAzure) {
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
        if (isSqlServer) {
            SQLServerAuthentication authSchema = SQLServerUtils.detectAuthSchema(connectionInfo);

            } else {
                if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
            DBPAuthModelDescriptor authModel = DBWorkbench.getPlatform().getDataSourceProviderRegistry().getAuthModel(amId);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
                if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
 * you may not use this file except in compliance with the License.

                url.append("jdbc:jtds:sqlserver://");
                }
        }
                    url.append(":").append(connectionInfo.getHostPort());

import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
                }
    public DBPDataSource openDataSource(
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {

        boolean isDriverAzure = isSqlServer && SQLServerUtils.isDriverAzure(driver);
import java.util.Map;
        }
    }
            String amId = authSchema.getReplacedByAuthModelId();
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataSource;
        }
            return connectionInfo.getUrl();
 * See the License for the specific language governing permissions and
/*
                url.append(";");
 * limitations under the License.
            // Sybase
            }
 * Unless required by applicable law or agreed to in writing, software

        return connectionsProps;
                if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
package org.jkiss.dbeaver.ext.mssql;

import org.jkiss.dbeaver.model.DBPDataSource;
 * You may obtain a copy of the License at

            } else {
    @Override
        return super.detectConnectionAuthModel(driver, connectionInfo);
                url.append("jdbc:jtds:sybase://");
            @NotNull DBRProgressMonitor monitor,
                    url.append(":").append(connectionInfo.getHostPort());
import org.jkiss.utils.CommonUtils;
 *
 *
                if (!CommonUtils.isEmpty(connectionInfo.getHostPort()) && !connectionInfo.getHostPort().equals(driver.getDefaultPort())) {
    }
                if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
    {
            (CommonUtils.isEmpty(connectionInfo.getAuthModelId()) ||
                    url.append(";port=").append(connectionInfo.getHostPort());
            if ("TRUE".equalsIgnoreCase(connectionInfo.getProviderProperty(SQLServerConstants.PROP_CONNECTION_WINDOWS_AUTH))) {
            }
                    url.append(":").append(connectionInfo.getHostPort());
import org.jkiss.dbeaver.model.connection.DBPDriver;
    static {
                url.append(";serverName=").append(connectionInfo.getHostName());
 * Licensed under the Apache License, Version 2.0 (the "License");
                url.append("jdbc:sybase:Tds:");
public class SQLServerDataSourceProvider extends JDBCDataSourceProvider {

    @Override
import org.jkiss.dbeaver.DBException;

            log.error("Replacement auth model " + amId + " not found");
*/
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (isJtds) {
        boolean isJtds = SQLServerUtils.isDriverJtds(driver);
    @NotNull
                }
                }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @NotNull
    public static Map<String,String> getConnectionsProps() {
                return authModel;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
            // Convert legacy config to auth model
        
            if (authModel != null) {

    @Override
                    url.append("/").append(connectionInfo.getDatabaseName());
import java.util.HashMap;
                url.append(connectionInfo.getHostName());
            }


            @NotNull DBPDataSourceContainer container)
        connectionsProps = new HashMap<>();
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
