
        return value.replace(STORAGE_PLACEHOLDER, CommonUtils.notEmpty(home));
import org.jkiss.utils.StringUtils;
import org.jkiss.utils.CommonUtils;
            );
 *     http://www.apache.org/licenses/LICENSE-2.0
 * pgAdmin servers.json import
        PgAdminRoot root = GSON.fromJson(reader, PgAdminRoot.class);
            if (pgAdminServer.connectionParameters != null && !pgAdminServer.connectionParameters.isEmpty()) {
    private static final Log log = Log.getLog(PgAdminImportConfigurationService.class);
 *
                host,

    @Nullable
            return value;
            String user = pgAdminServer.username;
            );
        .create();
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    private static final Gson GSON = new GsonBuilder()
public class PgAdminImportConfigurationService {
            if (CommonUtils.isNotEmpty(strVal)) {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

    private String expandStorageDir(@Nullable String value) {
import com.google.gson.Gson;
import java.util.Map;
    private static final String STORAGE_PLACEHOLDER = "<STORAGE_DIR>";

    }

import org.jkiss.code.Nullable;
            ImportConnectionInfo conn = new ImportConnectionInfo(
        for (Map.Entry<String, Object> pe : params.entrySet()) {

                null,
        }
        @SerializedName("ConnectionParameters")
            importData.addDriver(postgresqlDriver);
 */

package org.jkiss.dbeaver.ui.config.migration.wizards.pgadmin;



 * distributed under the License is distributed on an "AS IS" BASIS,
    private static class PgAdminRoot {
        String name;
                CommonUtils.isEmpty(db) ? null : db,
    private static final String DRIVER_ID_POSTGRESQL = "postgres-jdbc";
        .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
        @SerializedName("host")
    public static final PgAdminImportConfigurationService INSTANCE = new PgAdminImportConfigurationService();
            String strVal = expandStorageDir(String.valueOf(propertyValue));
        @SerializedName("Host")
            }
            PgAdminServer pgAdminServer = entry.getValue();
        }
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
            if (pgAdminServer == null) {
                port,

        String hostAlt;
                "jdbc:postgresql://{host}[:{port}]/{database}",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                continue;
        if (CommonUtils.isEmpty(value)) {
        DataSourceProviderRegistry registry = DataSourceProviderRegistry.getInstance();
        @SerializedName("MaintenanceDB")
 *
            String db = pgAdminServer.maintenanceDB;
        }
        @SerializedName("Username")
        if (importData.getDriverByID(postgresqlDriver.getId()) == null) {

                applyConnectionParameters(conn, pgAdminServer.connectionParameters);
            String host = StringUtils.firstNonEmpty(pgAdminServer.host, pgAdminServer.hostAlt);
                pgAdminServer.name,
                continue;
 */

        Map<String, Object> connectionParameters;
}
            importData.addConnection(conn);
        for (Map.Entry<String, PgAdminServer> entry : root.servers.entrySet()) {
            if (CommonUtils.isEmpty(host)) {
 * DBeaver - Universal Database Manager
        @SerializedName("Servers")
    private static class PgAdminServer {

 * You may obtain a copy of the License at

            }
import java.io.Reader;
                DRIVER_ID_POSTGRESQL,
            this.postgresqlDriver = new ImportDriverInfo(driver);
import com.google.gson.ToNumberPolicy;
import org.jkiss.dbeaver.model.connection.DBPDriver;
/**
            }
        String host;

                continue;
        String username;

                null

    }
        @SerializedName("Port")
            String port = String.valueOf(pgAdminServer.port);


    private final ImportDriverInfo postgresqlDriver;
        String maintenanceDB;
            }

            this.postgresqlDriver = new ImportDriverInfo(
                postgresqlDriver,
    private PgAdminImportConfigurationService() {
        String home = System.getProperty(StandardConstants.ENV_USER_HOME);
/*
            Object propertyValue = pe.getValue();
                "org.postgresql.Driver"
                conn.setProperty(formattedName, strVal);

    }
        if (driver != null) {
                null,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
    }
import org.jkiss.utils.StandardConstants;
import com.google.gson.GsonBuilder;
        DBPDriver driver = registry.findDriver(DRIVER_ID_POSTGRESQL);
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and

        if (root == null || root.servers == null || root.servers.isEmpty()) {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
            String propertyName = pe.getKey();
        @SerializedName("Name")
import com.google.gson.annotations.SerializedName;
 * limitations under the License.
        Integer port;
        } else {
    }
            if (CommonUtils.isEmpty(propertyName) || propertyValue == null) {
        Map<String, PgAdminServer> servers;
            return;

    }
        }
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    public void importJSON(@NotNull ImportData importData, @NotNull Reader reader) {
            log.debug("Empty or invalid pgAdmin config JSON or no 'Servers' found");
                CommonUtils.isEmpty(user) ? null : user,
    private void applyConnectionParameters(@NotNull ImportConnectionInfo conn, @NotNull Map<String, Object> params) {
            String formattedName = StringUtils.underscoreToCamelCase(propertyName);
                "PostgreSQL",
            }
