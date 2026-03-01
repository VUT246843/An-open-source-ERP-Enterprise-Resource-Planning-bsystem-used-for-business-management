    }
        }
    private static final String IMPORT_SCRIPT_USING_PASSWORD =
public class H2Migrator {

            if (dbProperties.getProperty(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD) == null) {
        @NotNull
            v1TraceBackupPath = dbFolderPath.resolve(createBackupFileName(v1Paths.dbTraceFile));
        @NotNull Driver driver,
        @NotNull String script,
        var oldUrl = databaseConfiguration.getUrl();
        if (exportFile.exists()) {
            workspacePaths.v2Paths.dbName
    }
import org.jkiss.dbeaver.DBException;
        private static final String V1_DATA_BACKUP_FILE_NAME = "h2db_v1_backup";
            (resolvedDbUrl.endsWith(dbNameV1) || V1_DRIVER_NAME.equals(databaseConfiguration.getDriver()))

            monitor.worked(1);
            if (dbProperties.getProperty(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD) == null) {

            } else {
            !V1_DRIVER_NAME.equals(databaseConfiguration.getDriver()) ||
        this.dbProperties = dbProperties;

            log.debug("H2 v1->v2 migration was successful");
import java.nio.file.Files;
            if (!exportFile.delete()) {
        }
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
            dbTraceFile = folderPath.resolve(dbName + ".trace.db");
        if (driverDescriptor == null) {
        @NotNull
    }
        @NotNull
            monitor.beginTask("H2 database v1 -> v2 migration started", 3);

    public void migrateDatabaseIfNeeded(@NotNull String dbNameV1, @NotNull String dbNameV2) {
            resolvedDbUrl.startsWith("jdbc:h2:mem:")
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull


        }
    }
        }
            var password = dbProperties.getProperty(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD);
    }
        private final Path exportFilePath;
    private static final String IMPORT_SCRIPT = "RUNSCRIPT FROM ? FROM_1X";

    }
     * or the link points to a v1 file, this method updates the database configuration.
            Files.move(workspacePaths.v1Paths.dbDataFile, workspacePaths.v1DataBackupPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private final DataSourceProviderRegistry dataSourceProviderRegistry;
import java.nio.file.Path;
            }
            log.trace("No migration needed");
     * <p>
    public H2Migrator(
        "RUNSCRIPT FROM ? COMPRESSION DEFLATE CIPHER AES PASSWORD ? CHARSET 'UTF-8' FROM_1X";

        String resolvedDbUrl = databaseConfiguration.getResolvedUrl();

 * You may obtain a copy of the License at
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            log.debug("v1 files restored");
    @NotNull
import java.io.IOException;
import org.jkiss.dbeaver.model.DBConstants;
    }
        if (!resolvedDbUrl.endsWith(dbNameV1) ||
 * limitations under the License.
    private void rollback(@NotNull WorkspacePaths workspacePaths, @NotNull String oldUrl, @NotNull String oldDriver) {
        @NotNull
    }

    // no 'language=H2' — due to an annoying error about unresolvable statement 'FROM_1X'
            v1Paths = new H2FilesPaths(dbFolderPath, dbNameV1);
        @NotNull InternalDatabaseConfig databaseConfiguration,

 *

    private static final Log log = Log.getLog(H2Migrator.class);
            return filePath.getParent();

     * IMPORTANT: if the database is already version 2, but the driver in the configuration is version 1,
    private static final String EXPORT_SCRIPT_USING_PASSWORD = "SCRIPT TO ? COMPRESSION DEFLATE CIPHER AES PASSWORD ? CHARSET 'UTF-8'";
        try (var connection = driver.connect(databaseConfiguration.getResolvedUrl(), dbProperties);
            var dbFolderPath = getFolderPath(resolvedDbUrl);
            log.error("Migration H2 v1->v2 failed", e);
        var updatedDbUrl = CommonUtils.replaceLast(
            v2Paths = new H2FilesPaths(dbFolderPath, dbNameV2);
                executeScript(v1Driver, EXPORT_SCRIPT, exportFilePath);
        @NotNull Properties dbProperties
        if (!updatedDbUrl.equals(databaseConfiguration.getUrl())) {
            if (workspacePaths.v1Paths.dbTraceFile.toFile().exists()) {
            }
        return driverDescriptor.getDefaultDriverLoader().getDriverInstance(monitor);
            this.dbName = dbName;
        @NotNull DataSourceProviderRegistry dataSourceProviderRegistry,
import java.sql.Driver;
            statement.execute();
            dbDataFile = folderPath.resolve(dbName + ".mv.db");
                executeScript(v2Driver, IMPORT_SCRIPT, exportFilePath);
 *
        this.databaseConfiguration = databaseConfiguration;
        private H2FilesPaths(@NotNull Path folderPath, @NotNull String dbName) {
            monitor.worked(1);
        @NotNull
                executeScript(v1Driver, EXPORT_SCRIPT_USING_PASSWORD, exportFilePath);
            migrateDatabase(workspacePaths);
    private final DBRProgressMonitor monitor;

        // the changed config is not written to disk immediately, so it is possible that the database is migrated,
        }
import java.util.Properties;
        if (!V2_DRIVER_NAME.equals(databaseConfiguration.getDriver())) {
 * you may not use this file except in compliance with the License.
    private Driver getDriver(@NotNull String driverName) throws DBException {
             var statement = connection.prepareStatement(script)
     * <p>



                Files.move(workspacePaths.v1TraceBackupPath, workspacePaths.v1Paths.dbTraceFile, StandardCopyOption.REPLACE_EXISTING);
        } finally {
        private WorkspacePaths(@NotNull String resolvedDbUrl, @NotNull String dbNameV1, @NotNull String dbNameV2) {
 *
        this.dataSourceProviderRegistry = dataSourceProviderRegistry;
            final var exportFilePath = workspacePaths.exportFilePath.toString();
        try {

import java.nio.file.StandardCopyOption;
            monitor.subTask("Importing data to new v2 database");
        }
    // language=H2
            log.error("Unable to restore old database file '" + workspacePaths.v1Paths.dbDataFile + "'", e);
            if (password != null) {
    @NotNull
        ) {
        try {

}
    ) {
                backupFileName = "." + backupFileName;

            monitor.subTask("Creating v1 database backup '" + workspacePaths.v1DataBackupPath + "'");
            monitor.done();
        var oldDriver = databaseConfiguration.getDriver();
            }
            monitor.worked(1);
    private void updateConfig(@NotNull WorkspacePaths workspacePaths) {
    public static boolean isH2Database(InternalDatabaseConfig databaseConfiguration) {
            if (workspacePaths.v1TraceBackupPath.toFile().exists()) {
        private static Path getFolderPath(@NotNull String resolvedDbUrl) {
    }
                Files.move(workspacePaths.v1Paths.dbTraceFile, workspacePaths.v1TraceBackupPath, StandardCopyOption.REPLACE_EXISTING);
    private static class H2FilesPaths {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

            log.debug("Export file removed '" + workspacePaths.exportFilePath + "'");
        // but the config on disk remains old
     */
    ) throws SQLException {
package org.jkiss.dbeaver.registry.storage;
            databaseConfiguration.getUrl(),
    private static class WorkspacePaths {

            updateConfig(workspacePaths);
            }
    }
    private void migrateDatabase(@NotNull WorkspacePaths workspacePaths) throws DBException, SQLException, IOException {
        private final Path dbDataFile;
            return backupFileName;
            final var v1Driver = getDriver(V1_DRIVER_NAME);

        );
 * distributed under the License is distributed on an "AS IS" BASIS,
            exportFilePath = dbFolderPath.resolve(EXPORT_SCRIPT_FILE_NAME);
        private final Path v1TraceBackupPath;
        var exportFile = workspacePaths.exportFilePath.toFile();

        var driverDescriptor = dataSourceProviderRegistry.findDriver(driverName);
        if (workspacePaths.v2Paths.dbDataFile.toFile().exists() &&
            String backupFileName = file.getFileName().toString() + ".backup";
 * Unless required by applicable law or agreed to in writing, software
    /**
            v1DataBackupPath = dbFolderPath.resolve(createBackupFileName(v1Paths.dbDataFile));
        databaseConfiguration.setUrl(oldUrl);
        private static final String EXPORT_SCRIPT_FILE_NAME = "H2v1ExportScript";
        }
import java.sql.SQLException;
    private void removeExportFile(@NotNull WorkspacePaths workspacePaths) {
            }
        }
    public static final String V1_DRIVER_NAME = "h2_embedded";
     * Migrates the H2 database from version 1 to version 2.


     * </p>
        @NotNull DBRProgressMonitor monitor,
        return databaseConfiguration.getUrl().startsWith("jdbc:h2");
        private final H2FilesPaths v2Paths;

    public static final String V2_DRIVER_NAME = "h2_embedded_v2";
    private final InternalDatabaseConfig databaseConfiguration;
                statement.setString(2, password);
import org.jkiss.dbeaver.Log;
        private final Path v1DataBackupPath;
    private final Properties dbProperties;
    @NotNull
 * See the License for the specific language governing permissions and
        private String createBackupFileName(Path file) {
        } catch (IOException e) {
            return;
        ) {
import org.jkiss.dbeaver.model.connection.InternalDatabaseConfig;
        @NotNull String filePath
            databaseConfiguration.setDriver(V2_DRIVER_NAME);
            log.debug("Using database driver '" + V2_DRIVER_NAME + "' instead of '" + V1_DRIVER_NAME + "' from config");
    @NotNull
        private final H2FilesPaths v1Paths;

        var workspacePaths = new WorkspacePaths(resolvedDbUrl, dbNameV1, dbNameV2);
        }
        this.monitor = monitor;
        private final Path dbTraceFile;
            log.debug("Using database file '" + workspacePaths.v2Paths.dbDataFile + "' instead of '"
        }
    @NotNull
            removeExportFile(workspacePaths);
            if (!backupFileName.startsWith(".")) {
            rollback(workspacePaths, oldUrl, oldDriver);
/*
                executeScript(v2Driver, IMPORT_SCRIPT_USING_PASSWORD, exportFilePath);

            }
 */

            } else {
        private final String dbName;
            }
            workspacePaths.v1Paths.dbName,
            throw new DBException("Driver '" + driverName + "' couldn't be resolved");
            var filePath = Paths.get(resolvedDbUrl.substring("jdbc:h2:".length()));
    // language=H2
        private static final String V1_TRACE_BACKUP_FILE_NAME = "h2db_trace_v1_backup";
            monitor.subTask("Exporting v1 database");
        @NotNull
            final var v2Driver = getDriver(V2_DRIVER_NAME);

    }
                + workspacePaths.v1Paths.dbDataFile + "' from config");

            updateConfig(workspacePaths);
    private void executeScript(



import org.jkiss.utils.CommonUtils;
import org.jkiss.code.NotNull;
        try {

     * </p>
        @NotNull
            databaseConfiguration.setUrl(updatedDbUrl);

        }
            Files.move(workspacePaths.v1DataBackupPath, workspacePaths.v1Paths.dbDataFile, StandardCopyOption.REPLACE_EXISTING);
import java.nio.file.Paths;
    // no 'language=H2' — due to an annoying error about unresolvable statement 'FROM_1X'
        }
    private static final String EXPORT_SCRIPT = "SCRIPT TO ?";
        ) {
        @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                log.error("Unable to remove H2 v1 export script file");
            statement.setString(1, filePath);
        removeExportFile(workspacePaths);
 * DBeaver - Universal Database Manager
            return;
        databaseConfiguration.setDriver(oldDriver);

