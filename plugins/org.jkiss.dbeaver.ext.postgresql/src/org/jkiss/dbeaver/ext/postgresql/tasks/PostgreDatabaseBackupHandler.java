    protected boolean isLogInputStream() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
        return true;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.Log;
                    log.error("Can't create directory '" + dir + "'", e);
        return true;
        if (settings.isDropObjects()) {
                    }
 *
        return cmd;
            DumpCopierJob job = new DumpCopierJob(monitor, "Export database", process.getInputStream(), outFile, log);
        ProcessBuilder processBuilder,
        Process process,
        if (settings.isUseInserts()) {
            cmd.add("--encoding=" + settings.getEncoding());
        String outFileName = settings.getOutputFile(arg);
        PostgreDatabaseBackupSettings settings,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 *
    ) throws IOException {
                cmd.add(escapeCLIIdentifier(table.getFullyQualifiedName(DBPEvaluationContext.DDL)));
            log.debug("Can't find specific schemas/tables for the backup");
import org.jkiss.dbeaver.model.fs.DBFUtils;
 * DBeaver - Universal Database Manager
        }

import org.jkiss.dbeaver.model.DBPEvaluationContext;
            cmd.add("--create");
    protected void startProcessHandler(
                }
import org.jkiss.dbeaver.model.struct.DBSObject;


                final String dir = settings.getOutputFolder(exportObject);
        super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
        if (isUseStreamTransfer(outFileName) && settings.getFormat() != PostgreBackupRestoreSettings.ExportFormat.DIRECTORY) {
        List<String> cmd
    protected boolean validateTaskParameters(DBTTask task, PostgreDatabaseBackupSettings settings, Log log) {
        return settings.getExportObjects();
 * See the License for the specific language governing permissions and

                catch (Exception e) {
    @Override
public class PostgreDatabaseBackupHandler extends PostgreNativeToolHandler<PostgreDatabaseBackupSettings, DBSObject, PostgreDatabaseBackupInfo> {
        if (settings.isCreateDatabase()) {
            return;
            return;
    }
        }
    @Override
            cmd.add("--inserts");
        }


        List<String> cmd = new ArrayList<>();
    public void fillProcessParameters(
        PostgreDatabaseBackupInfo arg,
        cmd.add("--format=" + settings.getFormat().getId());

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.utils.CommonUtils;
    protected PostgreDatabaseBackupSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {
import java.io.IOException;
            }
 */
        }
        return true;
            cmd.add(settings.getOutputFile(arg));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
import org.jkiss.dbeaver.DBException;
 *
        }
    @Override
    @Override
import org.jkiss.dbeaver.model.task.DBTTask;
import java.util.Collection;
                cmd.add("-t");
                }
        settings.loadSettings(context, new TaskPreferenceStore(task));
                // Use explicit quotes in case of quoted identifiers (#5950)

            settings.getFormat() == PostgreBackupRestoreSettings.ExportFormat.DIRECTORY
/*
        }
            log.debug("Dump database into " + outFile.toUri());
        }
    }
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
    }
        super.fillProcessParameters(settings, arg, cmd);
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (!CommonUtils.isEmpty(arg.getSchemas())) {

 * Unless required by applicable law or agreed to in writing, software
}
 * You may obtain a copy of the License at
    }
            cmd.add("--compress=" + settings.getCompression());
        ) {
            for (PostgreTableBase table : arg.getTables()) {
    @Override
        } else if (!CommonUtils.isEmpty(arg.getTables())) {
        PostgreDatabaseBackupSettings settings = new PostgreDatabaseBackupSettings(task.getProject());
    @Override
                        Files.createDirectories(outputFolderPath);
    @Override
        cmd.add(arg.getDatabase().getName());
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            cmd.add("--clean");
import java.nio.file.Path;
        if (settings.isNoPrivileges()) {
                try {
        Log log
            job.start();
import java.util.List;
    protected boolean isExportWizard() {
            for (PostgreSchema schema : arg.getSchemas()) {
        if (!CommonUtils.isEmpty(settings.getCompression())) {
    public boolean isVerbose() {
        }
 * you may not use this file except in compliance with the License.

            Path outFile = DBFUtils.resolvePathFromString(monitor, task.getProject(), outFileName);

        DBRProgressMonitor monitor,
        if (!CommonUtils.isEmpty(settings.getEncoding())) {
        if (settings.getExportObjects().isEmpty()) {
        if (!isUseStreamTransfer(settings.getOutputFile(arg)) ||
                    if (!Files.exists(outputFolderPath)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Collection<PostgreDatabaseBackupInfo> getRunInfo(PostgreDatabaseBackupSettings settings) {
import java.util.ArrayList;
            cmd.add("--no-owner");
    ) throws IOException, DBException {
    @Override
        if (settings.isFullSchemaBackup()) {

        DBTTask task,
    protected boolean needsModelRefresh() {
        return settings;
        return false;

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
                cmd.add(escapeCLIIdentifier(DBUtils.getQuotedIdentifier(schema)));
    private static final Log log = Log.getLog(PostgreDatabaseBackupHandler.class);
        return false;
        // Objects
            }
        if (settings.isNoOwner()) {
import java.nio.file.Files;
            for (PostgreDatabaseBackupInfo exportObject : settings.getExportObjects()) {

            }
        }

    }
        PostgreDatabaseBackupSettings settings,
    protected List<String> getCommandLine(PostgreDatabaseBackupSettings settings, PostgreDatabaseBackupInfo arg) throws IOException {
        fillProcessParameters(settings, arg, cmd);
    }
                // Use explicit quotes in case of quoted identifiers (#5950)

    }
                    return false;
            cmd.add("--no-privileges");
    @Override
    }
                    Path outputFolderPath = DBFUtils.resolvePathFromString(new VoidProgressMonitor(), task.getProject(), dir);
        PostgreDatabaseBackupInfo arg,
        if (task.getType().getId().equals(PostgreSQLTasks.TASK_DATABASE_BACKUP)) {
        }
 * limitations under the License.
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    }

            cmd.add("--file");
package org.jkiss.dbeaver.ext.postgresql.tasks;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }


                cmd.add("-n");
