                + currentSchemaVersion + SQLBackupConstants.BACKUP_FILE_TYPE);
                Files.createDirectories(workspace);
                    StringBuilder processOutput = new StringBuilder();
                }
 *



                    if (exitCode == 0) {
    private static ProcessBuilder getBuilder(@NotNull InternalDatabaseConfig databaseConfig, URI uri, Path backupFile) {
                databaseName = databaseName.substring(1);
 * limitations under the License.
import java.io.BufferedReader;
import org.jkiss.utils.CommonUtils;
                        processOutput.append(line).append("\n");
 * Unless required by applicable law or agreed to in writing, software
 *
        String databaseName = uri.getPath();
 * DBeaver - Universal Database Manager


import org.jkiss.dbeaver.model.connection.InternalDatabaseConfig;
                        throw new DBException("Postgres backup failed");
        try {
            Path workspace = DBWorkbench.getPlatform().getWorkspace().getAbsolutePath().resolve(SQLBackupConstants.BACKUP_FOLDER);
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");


            }
    ) throws DBException {
        }
        ProcessBuilder processBuilder = new ProcessBuilder(
/*
                databaseName = databaseName.substring(0, questionMarkIndex);

            "--host", uri.getHost(),
    }
                    } else {
            throw new DBException("Create backup is failed: " + e.getMessage());
import java.nio.file.Files;
        if (databaseName != null) {
                    while ((line = bufferedReader.readLine()) != null) {

                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
    }
            "--file", backupFile.toAbsolutePath().toString()
                    log.error("Error reading process output", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (questionMarkIndex != -1) {
        processBuilder.command().add(databaseConfig.getUser());
 * See the License for the specific language governing permissions and
                ProcessBuilder processBuilder = getBuilder(databaseConfig, uri, backupFile);
                    int exitCode = process.waitFor();
        processBuilder.command().add(databaseName);
        processBuilder.command().add("--username");
            if (!IOUtils.isFileFromDefaultFS(workspace)) {
import java.sql.Connection;
            "pg_dump",
        int currentSchemaVersion,
    @Override
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.backup.JDBCDatabaseBackupHandler;

import org.jkiss.dbeaver.runtime.DBWorkbench;
                return;
        log.info("Command started: " + backupCommand);
            "--port", String.valueOf(uri.getPort()),
import java.net.URI;
import org.jkiss.dbeaver.Log;
            Path backupFile = workspace.resolve(uri.getPath().replace("/", "") + "_"
                        Files.deleteIfExists(backupFile);
        @NotNull Connection connection,
        );
 */
                + SQLBackupConstants.BACKUP_FILE_NAME + databaseConfig.getSchema()


}
                try (InputStream inputStream = process.getInputStream();
        }
            "--verbose",
                } catch (IOException e) {
import org.jkiss.utils.IOUtils;
            }
import org.jkiss.code.NotNull;

import java.io.IOException;
            processBuilder.command().add(databaseConfig.getSchema());
                        log.error("Postgres backup failed with output: " + processOutput.toString());
        if (CommonUtils.isNotEmpty(databaseConfig.getPassword())) {
                processBuilder.redirectErrorStream(true);
 *
import java.nio.file.Path;
                        log.info("Postgres backup successful");
                    String line;
            log.error("Create backup is failed: " + e.getMessage());
            if (Files.notExists(backupFile)) {
        }
            int questionMarkIndex = databaseName.indexOf("?");
            "--blobs",
                log.warn("Backup to an external workspace is not supported");
import java.io.InputStreamReader;
        }
                Process process = processBuilder.start();

public class JDBCDatabasePostgresBackupHandler implements JDBCDatabaseBackupHandler {
                    }

import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.postgresql.backup;
        @NotNull InternalDatabaseConfig databaseConfig
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            if (databaseName.startsWith("/")) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.backup.SQLBackupConstants;
    public void doBackup(
            URI uri = new URI(databaseConfig.getUrl().replace("jdbc:", ""));
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            }
 * You may obtain a copy of the License at

        } catch (Exception e) {
            processBuilder.command().add("--schema");
        if (CommonUtils.isNotEmpty(databaseConfig.getSchema())) {
        return processBuilder;
import java.io.InputStream;
        String backupCommand = String.join(" ", processBuilder.command());
    private static final Log log = Log.getLog(JDBCDatabasePostgresBackupHandler.class);
            processBuilder.environment().put("PGPASSWORD", databaseConfig.getPassword());
