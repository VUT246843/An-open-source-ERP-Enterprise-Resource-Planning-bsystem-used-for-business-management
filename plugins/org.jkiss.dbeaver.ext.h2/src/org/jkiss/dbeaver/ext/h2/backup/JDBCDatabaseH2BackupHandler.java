        if (!IOUtils.isFileFromDefaultFS(workspace)) {
        }
    @Override
import java.nio.file.Path;
import org.jkiss.dbeaver.model.connection.InternalDatabaseConfig;
        int currentSchemaVersion,
 * limitations under the License.
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
        @NotNull Connection connection,
    public void doBackup(
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
                Files.createDirectories(workspace);
            + SQLBackupConstants.BACKUP_FILE_TYPE);
import java.sql.Statement;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
        Path workspace = DBWorkbench.getPlatform().getWorkspace().getAbsolutePath().resolve(SQLBackupConstants.BACKUP_FOLDER);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import java.io.IOException;
            Files.deleteIfExists(backupFile);
        @NotNull InternalDatabaseConfig databaseConfig
            return;
import org.jkiss.dbeaver.model.sql.backup.SQLBackupConstants;
            log.error("Create backup is failed: " + e.getMessage());
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.backup.JDBCDatabaseBackupHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw new DBException("Backup is failed: " + e.getMessage());

        } catch (Exception e) {
}
 *
        try (Statement statement = connection.createStatement()) {
import org.jkiss.utils.IOUtils;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
                statement.execute(backupCommand);
    ) throws DBException, IOException {
 * You may obtain a copy of the License at
public class JDBCDatabaseH2BackupHandler implements JDBCDatabaseBackupHandler {


 *
import java.nio.file.Files;
import java.sql.Connection;
        Path backupFile = workspace.resolve(SQLBackupConstants.BACKUP_FILE_NAME + currentSchemaVersion
            log.warn("Backup to an external workspace is not supported");
            }
                log.info("Reserve backup created to path: " + workspace + "backup");
                String backupCommand = "BACKUP TO '" + backupFile + "'";
            if (Files.notExists(backupFile)) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.ext.h2.backup;
    private static final Log log = Log.getLog(JDBCDatabaseH2BackupHandler.class);

import org.jkiss.code.NotNull;


import org.jkiss.dbeaver.Log;
/*
