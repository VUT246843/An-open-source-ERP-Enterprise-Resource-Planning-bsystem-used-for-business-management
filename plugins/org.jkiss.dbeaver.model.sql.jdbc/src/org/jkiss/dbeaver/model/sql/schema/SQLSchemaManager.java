    ) {
    private final SQLDialect targetDatabaseDialect;

        ddlText = SQLQueryTranslator.translateScript(sourceDialect, targetDatabaseDialect, prefStore, ddlText);
 *
        String ddlText = CommonUtils.normalizeTableNames(IOUtils.readToString(ddlStream), databaseConfig.getSchema());
                // Update schema version
 * Upgrades schema version if needed.
 *
            line = line.trim();

        }
        this.connectionProvider = connectionProvider;
                    log.debug("Execute migration query: " + line);
     * @param monitor
            if (line.isEmpty()) {
            }
        }
        @NotNull SQLDialect targetDatabaseDialect,
                        return;
        @Nullable SQLInitialSchemaFiller sqlInitialSchemaFiller
            if (logQueries) {
        if (databaseConfig.isBackupEnabled()) {
                    // Do rollback in case some error happened during version check (makes sense for PG)
 */
import org.jkiss.utils.IOUtils;
                            monitor,
                    int currentSchemaVersion = versionManager.getCurrentSchemaVersion(monitor, dbCon, databaseConfig.getSchema());
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCTransaction;
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
                        dropSchema(monitor, dbCon);
import java.io.StringReader;
            }
    @NotNull
            }
                            dbCon,
                    log.debug("Trying to apply the migration again");
    private final SQLInitialSchemaFiller sqlInitialSchemaFiller;
        @NotNull Connection connection,
    private void createNewSchema(
                    dbStat.execute(line);
        try {
        @NotNull String schemaId,
        }
        this.sqlInitialSchemaFiller = sqlInitialSchemaFiller;
        @NotNull Connection connection
/**
                    log.error("Error during sql migration", e);
    ) throws DBException {
                    if (currentSchemaVersion < 0) {
    private final SQLSchemaConnectionProvider connectionProvider;
import org.jkiss.dbeaver.model.connection.InternalDatabaseConfig;
        executeScript(monitor, connection, new StringReader("DROP ALL OBJECTS"), true);
        this.schemaVersionActual = schemaVersionActual;
                    descriptor.getInstance().doBackup(dbCon, currentSchemaVersion, databaseConfig);
                    // 11 migration version sometimes crashes in h2
    ) throws SQLException, IOException, DBException {
    }
        String[] ddl = ddlText.split(";");
                }
    @NotNull
    ) throws IOException, DBException, SQLException {
                    }
        // Translate script to target dialect
                } catch (SQLException e) {
                        log.warn("Database backup failed: " + e.getMessage());
                            dbCon,
        @NotNull Connection connection

        boolean logQueries
        }
        } catch (IOException | SQLException e) {
                        versionManager.updateCurrentSchemaVersion(
    @NotNull
import java.io.Reader;


            }
                    txn.commit();
        @NotNull SQLSchemaConnectionProvider connectionProvider,

import org.jkiss.code.Nullable;
                continue;
            } finally {
                        // Update schema version
import java.io.IOException;

        this.schemaId = schemaId;
 * Converts schema create/update scripts into target database dialect.
    private void executeScript(
    }
                txn.commit();
            Reader ddlStream = scriptSource.openSchemaUpdateScript(monitor, updateToVer, targetDatabaseDialect.getDialectId());
                }
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and


    public void updateSchema(
            }
     * @return
 * Licensed under the Apache License, Version 2.0 (the "License");
                    log.info("Starting backup execution");

import org.jkiss.dbeaver.model.app.DBPApplication;
            Connection dbCon = connectionProvider.getDatabaseConnection(monitor);
            JDBCDatabaseBackupDescriptor descriptor =
/*
                try {
    /**
                        doBackupDatabase(dbCon, currentSchemaVersion);
        for (String line : ddl) {
                } catch (DBException e) {
    private void upgradeSchemaVersion(
                executeScript(monitor, connection, ddlStream, true);
        this.databaseConfig = databaseConfig;
        int currentSchemaVersion
    private void dropSchema(
        DBPPreferenceStore prefStore = SQLQueryTranslator.getDefaultPreferenceStore();
                    throw e;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        log.debug("Create new schema " + schemaId);
                    } else if (schemaVersionObsolete > 0 && currentSchemaVersion < schemaVersionObsolete) {
        this.targetDatabaseDialect = targetDatabaseDialect;
            int updateToVer = curVer + 1;
            try (Statement dbStat = connection.createStatement()) {
        this.versionManager = versionManager;
                        upgradeSchemaVersion(monitor, dbCon, txn, currentSchemaVersion);
                    } else if (schemaVersionActual > currentSchemaVersion) {

    }
        @NotNull DBRProgressMonitor monitor,
                        createNewSchema(monitor, dbCon);
                    log.debug("The second schema migration attempt was successful");
                            versionManager.getLatestSchemaVersion()
public final class SQLSchemaManager {
            if (ddlStream == null) {
import org.jkiss.code.NotNull;

                    dbStat.execute(line);
    private final String schemaId;
            executeScript(monitor, connection, ddlStream, false);
    ) throws DBException, SQLException, IOException {
            } catch (Exception e) {
import java.sql.SQLException;
import org.jkiss.dbeaver.Log;
                    log.warn(schemaId + " migration has been rolled back");
 * SQL schema manager.
                            monitor,

        }
 * Unless required by applicable law or agreed to in writing, software
                    //TODO: find a better way to avoid migration errors
    public SQLSchemaManager(
                            databaseConfig.getSchema(),
                    DBPApplication application = DBWorkbench.getPlatform().getApplication();
        if (sqlInitialSchemaFiller != null) {
        @NotNull SQLSchemaScriptSource scriptSource,
                }
                    if (application.isHeadlessMode() && application.isCommunity()) {
import org.jkiss.dbeaver.utils.ContentUtils;
                ContentUtils.close(ddlStream);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,
                            databaseConfig.getSchema(),

            sqlInitialSchemaFiller.fillInitialSchemaData(monitor, connection);
import java.sql.Statement;
        @NotNull DBRProgressMonitor monitor,
                        // Update schema version
        @NotNull Connection connection,
    private final InternalDatabaseConfig databaseConfig;
     */
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (descriptor != null) {
        @NotNull Reader ddlStream,
                versionManager.updateCurrentSchemaVersion(monitor, connection, databaseConfig.getSchema(), updateToVer);
import org.jkiss.dbeaver.DBException;

        this.scriptSource = scriptSource;
import org.jkiss.dbeaver.model.sql.backup.JDBCDatabaseBackupRegistry;
                continue;
                log.warn("Error updating " + schemaId + " schema version from " + curVer + " to " + updateToVer, e);
        @NotNull SQLSchemaVersionManager versionManager,
 * You may obtain a copy of the License at
        }
                            versionManager.getLatestSchemaVersion()
                log.debug("Process [" + line + "]");
                } catch (Exception e) {
    }
                        versionManager.updateCurrentSchemaVersion(

}
    @Nullable
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @NotNull

            throw new DBException("Error updating " + schemaId + " schema version", e);
 *
    }
    private final SQLSchemaVersionManager versionManager;
                    txn.rollback();
            try {
            }
                try {
 * limitations under the License.
 */
    private final SQLSchemaScriptSource scriptSource;
    ) throws IOException, DBException, SQLException {
 * DBeaver - Universal Database Manager

                    txn.rollback();
     * @throws DBException
        this.schemaVersionObsolete = schemaVersionObsolete;
        // Read DDL script
                        );
    private final int schemaVersionActual;
                        );
                JDBCDatabaseBackupRegistry.getInstance().getCurrentDescriptor(this.targetDatabaseDialect);
        for (int curVer = currentSchemaVersion; curVer < schemaVersionActual; curVer++) {
    @NotNull
            try (JDBCTransaction txn = new JDBCTransaction(dbCon)) {
    }
        int schemaVersionActual,
import org.jkiss.dbeaver.model.sql.backup.JDBCDatabaseBackupDescriptor;

package org.jkiss.dbeaver.model.sql.schema;
        try (Reader ddlStream = scriptSource.openSchemaCreateScript(monitor, targetDatabaseDialect.getDialectId())) {
                throw e;
                try {
        };
        int schemaVersionObsolete,
import org.jkiss.dbeaver.model.sql.SQLDialect;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.sql.Connection;
        BasicSQLDialect sourceDialect = new BasicSQLDialect() {
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final int schemaVersionObsolete;
            log.debug("Update schema " + schemaId + " version from " + curVer + " to " + updateToVer);
        @NotNull DBRProgressMonitor monitor
                        createNewSchema(monitor, dbCon);
        @NotNull JDBCTransaction txn,
    private static final Log log = Log.getLog(SQLSchemaManager.class);
import org.jkiss.dbeaver.model.sql.translate.SQLQueryTranslator;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    }
        @NotNull DBRProgressMonitor monitor,
        log.debug("Drop schema " + schemaId);
    private void doBackupDatabase(@NotNull Connection dbCon, int currentSchemaVersion) throws IOException, DBException {
        @NotNull InternalDatabaseConfig databaseConfig,
                    throw new DBException("Internal database backup has failed", e);
