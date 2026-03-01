        PostgreDatabaseRestoreSettings settings = new PostgreDatabaseRestoreSettings(task.getProject());
        return settings;
        List<String> cmd = new ArrayList<>();
import java.util.Collection;
import org.jkiss.dbeaver.model.struct.DBSObject;
        return false;
    protected void startProcessHandler(DBRProgressMonitor monitor, DBTTask task, PostgreDatabaseRestoreSettings settings, PostgreDatabaseRestoreInfo arg, ProcessBuilder processBuilder, Process process, Log log) throws IOException, DBException {
import org.jkiss.dbeaver.model.fs.DBFUtils;
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
 * Unless required by applicable law or agreed to in writing, software
        }

}
            }
    }
        if (!Files.exists(inputFile)) {
    public Collection<PostgreDatabaseRestoreInfo> getRunInfo(PostgreDatabaseRestoreSettings settings) {
        DBWorkbench.getPlatformUI().showWarningNotification("Warning", "Database restore finished with warnings.\nPlease check the error log to see what is wrong.");
    }
    }
package org.jkiss.dbeaver.ext.postgresql.tasks;
            new BinaryFileTransformerJob(monitor, task, inputFile, process.getOutputStream(), log).start();
import java.io.IOException;
        List<String> cmd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

}
            }

            if (!dir.exists()) {
    @Override
            cmd.add("--format=" + settings.getFormat().getId());
        if (isUseStreamTransfer(inputFile.toUri().toString()) && settings.getFormat() != PostgreBackupRestoreSettings.ExportFormat.DIRECTORY) {
            if (settings.isCreateDatabase()) {

        return Collections.singletonList(settings.getRestoreInfo());
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            }
import java.io.File;
        }
            if (!isUseStreamTransfer(settings.getInputFile())) {
            throw new IOException("File '" + inputFile + "' doesn't exist");

            DBPDataSource dataSource = settings.getDataSourceContainer().getDataSource();
                cmd.add("--create");
            }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!dir.mkdirs()) {
/*
        final Path inputFile = DBFUtils.resolvePathFromString(monitor, task.getProject(), settings.getInputFile());
            }

 * limitations under the License.
        super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
import org.jkiss.dbeaver.model.task.DBTTask;
        return false;
 * DBeaver - Universal Database Manager
    @Override
            }

                }
        } else if (task.getType().getId().equals(PostgreSQLTasks.TASK_DATABASE_RESTORE)) {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (settings.getFormat() == PostgreBackupRestoreSettings.ExportFormat.PLAIN) {
    @Override
    protected boolean isExportWizard() {
import java.nio.file.Files;
    }

import java.nio.file.Path;
                cmd.add("--no-owner");
        settings.loadSettings(context, new TaskPreferenceStore(task));
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    public boolean isVerbose() {
                return false; 

import java.util.Collections;
    protected PostgreDatabaseRestoreSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {
        }
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others



                    log.error("Can't create directory '" + dir.getAbsolutePath() + "'");

                cmd.add(settings.getInputFile());
        }
    }
        PostgreDatabaseRestoreSettings settings,
    protected boolean validateTaskParameters(DBTTask task, PostgreDatabaseRestoreSettings settings, Log log) {
    protected boolean isMergeProcessStreams() {
    }
            final File dir = new File(settings.getOutputFilePattern());
        if (settings.getFormat() != PostgreBackupRestoreSettings.ExportFormat.PLAIN) {
                log.error(NLS.bind(ModelMessages.tasks_restore_readonly_message, dataSource.getName()));
        super.fillProcessParameters(settings, arg, cmd);
        return cmd;
    if (exitCode == 1) {
 * you may not use this file except in compliance with the License.
        fillProcessParameters(settings, arg, cmd);
        // only supported by pg_restore
    }

    }
import org.eclipse.osgi.util.NLS;
        PostgreDatabaseRestoreInfo arg,
            }
public class PostgreDatabaseRestoreHandler extends PostgreNativeToolHandler<PostgreDatabaseRestoreSettings, DBSObject, PostgreDatabaseRestoreInfo> {
import org.jkiss.dbeaver.Log;
    ) throws IOException {

    protected boolean isLogInputStream() {
    @Override
import org.jkiss.dbeaver.model.messages.ModelMessages;
        super.validateErrorCode(exitCode);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            ) {
                settings.getFormat() == PostgreBackupRestoreSettings.ExportFormat.DIRECTORY
 * You may obtain a copy of the License at
        return true;
        return false;
 *
import org.jkiss.dbeaver.DBException;
                cmd.add("--clean");
    }
        }
    @Override
    }

    } else {
    @Override
    @Override
import java.util.ArrayList;
                    return false;

            if (dataSource != null && DBUtils.isReadOnly(settings.getDataSourceContainer().getDataSource())) {
        if (settings.getFormat() != PostgreBackupRestoreSettings.ExportFormat.PLAIN) {
            if (settings.isCleanFirst()) {
        return true;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        }
            if (!isUseStreamTransfer(settings.getInputFile()) ||
 */
import org.jkiss.dbeaver.model.DBUtils;
        } else {
        cmd.add("--dbname=" + settings.getRestoreInfo().getDatabase()); // database name here can be used without quotes
        if (task.getType().getId().equals(PostgreSQLTasks.TASK_DATABASE_BACKUP)) {
            if (settings.isNoOwner()) {
    public void fillProcessParameters(
    protected boolean needsModelRefresh() {

 *
    @Override
 * See the License for the specific language governing permissions and

    @Override

                cmd.add("--file=" + settings.getInputFile());
    protected List<String> getCommandLine(PostgreDatabaseRestoreSettings settings, PostgreDatabaseRestoreInfo arg) throws IOException {
import java.util.List;
    }
    public void validateErrorCode(int exitCode) throws IOException {
        return true;
