    @Override
 * you may not use this file except in compliance with the License.
    protected boolean isExportWizard() {

        return false;
    protected boolean needsModelRefresh() {
    @Override
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import java.nio.file.Path;
}
    }
    @Override
 * limitations under the License.
    }
    }
 * DBeaver - Universal Database Manager
        final Path inputFile = DBFUtils.resolvePathFromString(monitor, task.getProject(), settings.getInputFile());
public class PostgreScriptExecuteHandler extends PostgreNativeToolHandler<PostgreScriptExecuteSettings, DBSObject, PostgreDatabase> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
import org.jkiss.dbeaver.model.struct.DBSObject;
    protected boolean isLogInputStream() {
        new BinaryFileTransformerJob(monitor, task, inputFile, process.getOutputStream(), log).start();

import org.jkiss.dbeaver.DBException;
    @Override
    @Override


    protected void startProcessHandler(
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        return Collections.singletonList(settings.getDatabase());
/*
 *
        }
    protected List<String> getCommandLine(PostgreScriptExecuteSettings settings, PostgreDatabase arg) throws IOException {
        PostgreDatabase arg,
    ) throws IOException, DBException {
        Process process,
    }
    }

    }
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,

 * You may obtain a copy of the License at
        Log log
    public Collection<PostgreDatabase> getRunInfo(PostgreScriptExecuteSettings settings) {
 * See the License for the specific language governing permissions and

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public boolean isVerbose() {
    public void fillProcessParameters(PostgreScriptExecuteSettings settings, PostgreDatabase arg, List<String> cmd) throws IOException {
    @Override

        return cmd;
            cmd.add("--echo-errors"); //$NON-NLS-1$
import org.jkiss.dbeaver.Log;
        DBTTask task,
        fillProcessParameters(settings, arg, cmd);
        return false;
    @Override
    @Override
        return settings;


        super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
        PostgreScriptExecuteSettings settings = new PostgreScriptExecuteSettings(task.getProject());
    @Override
    }

    protected PostgreScriptExecuteSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {
import org.jkiss.dbeaver.model.task.DBTTask;
import java.util.List;
        ProcessBuilder processBuilder,

import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
        }
import java.util.Collection;
        if (!Files.exists(inputFile)) {

        DBRProgressMonitor monitor,
            throw new IOException("File '" + inputFile + "' doesn't exist");
        return true;
        settings.loadSettings(context, new TaskPreferenceStore(task));
 * Licensed under the Apache License, Version 2.0 (the "License");
        super.fillProcessParameters(settings, arg, cmd);
        PostgreScriptExecuteSettings settings,
        List<String> cmd = new ArrayList<>();

import java.util.ArrayList;
        if (arg.getDataSource().isServerVersionAtLeast(9, 5)) {
    }
 *
        cmd.add(arg.getName());
import java.util.Collections;
import org.jkiss.dbeaver.model.fs.DBFUtils;

import java.nio.file.Files;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.io.IOException;
 *

package org.jkiss.dbeaver.ext.postgresql.tasks;

