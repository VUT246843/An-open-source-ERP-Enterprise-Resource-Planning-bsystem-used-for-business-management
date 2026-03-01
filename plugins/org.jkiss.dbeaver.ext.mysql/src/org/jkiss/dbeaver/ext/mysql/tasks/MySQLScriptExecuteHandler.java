        Log log

/*
    }
            cmd.add("--debug-info"); //$NON-NLS-1$
    protected List<String> getCommandLine(MySQLScriptExecuteSettings settings, MySQLCatalog arg) throws IOException {
        return true;
        MySQLScriptExecuteSettings settings,
        return settings;
        if (!Files.exists(inputFile)) {
        MySQLCatalog arg,
import org.jkiss.dbeaver.ext.mysql.MySQLUtils;
        }
 * Unless required by applicable law or agreed to in writing, software
            new BinaryFileTransformerJob(
        return true;
        }
            new TextFileTransformerJob(monitor, task, inputFile, process.getOutputStream(), getInputCharset(), getOutputCharset(), log).start();
        settings.setImport(isImport);
import org.jkiss.dbeaver.model.messages.ModelMessages;
            cmd.add("--init-command=SET SESSION FOREIGN_KEY_CHECKS=0;");
import org.jkiss.dbeaver.model.fs.DBFUtils;
        ProcessBuilder processBuilder,

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (settings.isImport()) {
        String dumpPath = dumpBinary.getAbsolutePath();
            return false;
    @Override

    protected boolean validateTaskParameters(DBTTask task, MySQLScriptExecuteSettings settings, Log log) {
        Process process,
import org.jkiss.dbeaver.model.DBPDataSource;
 * See the License for the specific language governing permissions and
    public void fillProcessParameters(MySQLScriptExecuteSettings settings, MySQLCatalog arg, List<String> cmd) throws IOException {
        settings.addExtraCommandArgs(cmd);

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        if (settings.isImport() && dataSource != null && DBUtils.isReadOnly(dataSource)) {
                process.getOutputStream(), log).start();
            throw new IOException("File '" + inputFile + "' doesn't exist");
    @Override
import org.jkiss.dbeaver.model.task.DBTTask;
            cmd.add("-v");
    public Collection<MySQLCatalog> getRunInfo(MySQLScriptExecuteSettings settings) {
 *
    @Override
                inputFile,
    }
}
 * Licensed under the Apache License, Version 2.0 (the "License");
            super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
 */
        File dumpBinary = MySQLUtils.getClientExecutablePath(settings);
    @Override
        if (settings.isForeignKeyCheckDisabled()) {
import java.nio.file.Files;
        settings.loadSettings(context, new TaskPreferenceStore(task));
        }
        DBTTask task,
    protected boolean isMergeProcessStreams() {
 * You may obtain a copy of the License at
    }
        }

        } else {
        List<String> cmd = super.getCommandLine(settings, arg);
            cmd.add("--no-beep"); //$NON-NLS-1$
import org.jkiss.dbeaver.DBException;

package org.jkiss.dbeaver.ext.mysql.tasks;

                monitor,
public class MySQLScriptExecuteHandler extends MySQLNativeToolHandler<MySQLScriptExecuteSettings, MySQLCatalog, MySQLCatalog> {
        MySQLScriptExecuteSettings settings = new MySQLScriptExecuteSettings(task.getProject());
        if (settings.isNoBeep()) {

    }
    }
        DBPDataSource dataSource = settings.getDataSourceContainer().getDataSource();

 * limitations under the License.
        cmd.add(arg.getName());
import org.jkiss.dbeaver.Log;
        boolean isImport = task.getType().getId().equals(MySQLTasks.TASK_DATABASE_RESTORE);
    }

        }
                task,
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
        if (settings.getLogLevel() == MySQLScriptExecuteSettings.LogLevel.Debug) {
import java.util.List;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (settings.isVerbose()) {
import java.nio.file.Path;
import org.eclipse.osgi.util.NLS;
 * DBeaver - Universal Database Manager
    ) throws IOException, DBException {
 * you may not use this file except in compliance with the License.
    protected MySQLScriptExecuteSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {

import java.io.IOException;
import java.util.Collection;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBUtils;
    @Override
        Path inputFile = DBFUtils.resolvePathFromString(monitor, task.getProject(), settings.getInputFile());
 * Copyright (C) 2010-2025 DBeaver Corp and others
            super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
        cmd.add(dumpPath);
 *

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

        return cmd;
        return settings.getDatabaseObjects();
    protected void startProcessHandler(
import java.io.File;
    }
        DBRProgressMonitor monitor,
    @Override
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
            log.error(NLS.bind(ModelMessages.tasks_restore_readonly_message, dataSource.getName()));
