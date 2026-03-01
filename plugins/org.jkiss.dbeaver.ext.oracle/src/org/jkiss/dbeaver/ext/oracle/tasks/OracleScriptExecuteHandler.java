            cmd.add("-v");
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
/*
import java.nio.file.Files;
        File sqlPlusBinary = new File(settings.getClientHome().getPath(), "bin/" + sqlPlusExec); //$NON-NLS-1$
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionType;
        else {
        fillProcessParameters(settings, arg, cmd);
        if ("TNS".equals(conInfo.getProviderProperty(OracleConstants.PROP_CONNECTION_TYPE))) { //$NON-NLS-1$
 * limitations under the License.
        cmd.add(dumpPath);
    }
import java.util.List;
        settings.loadSettings(context, new TaskPreferenceStore(task));
        }

        if (!sqlPlusBinary.exists()) {
            sqlPlusBinary = new File(settings.getClientHome().getPath(), sqlPlusExec);
        }
import java.nio.file.Path;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (!sqlPlusBinary.exists()) {
import java.util.ArrayList;
        cmd.add(toolWizard.getDatabaseObjects().getName());
import org.jkiss.dbeaver.model.struct.DBSObject;

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (toolWizard.isVerbose()) {
        List<String> cmd = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;
    @Override
 *
    protected void startProcessHandler(
        new BinaryFileTransformerJob(monitor, task, inputFile, process.getOutputStream(), log).start();



    @Override
            }
        }
 * You may obtain a copy of the License at
        OracleScriptExecuteSettings settings,
        return cmd;
import java.io.IOException;

 *
*/
        }
        cmd.add(conInfo.getUserName() + "/" + conInfo.getUserPassword() + "@" + url); //$NON-NLS-1$ //$NON-NLS-2$
        return true;
        cmd.add("-q");
import org.jkiss.dbeaver.model.task.DBTTask;
                url = "//" + conInfo.getHostName() + (port != null ? ":" + port : "") + "/" + conInfo.getDatabaseName(); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        String dumpPath = sqlPlusBinary.getAbsolutePath();
 *
            } else {
        DBRProgressMonitor monitor,
    @Override
    @Override
    ) throws IOException, DBException {
    protected List<String> getCommandLine(OracleScriptExecuteSettings settings, OracleDataSource arg) throws IOException {
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
        Process process,
public class OracleScriptExecuteHandler extends AbstractNativeToolHandler<OracleScriptExecuteSettings, DBSObject, OracleDataSource> {
                url = "(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=" + conInfo.getHostName() + ")(Port=" + port + "))(CONNECT_DATA=(SID=" + conInfo.getDatabaseName() + ")))";
import java.util.Collections;
    }
    }
import java.util.Collection;
            String port = conInfo.getHostPort();
import org.jkiss.dbeaver.model.fs.DBFUtils;

package org.jkiss.dbeaver.ext.oracle.tasks;
        String sqlPlusExec = RuntimeUtils.getNativeBinaryName("sqlplus"); //$NON-NLS-1$
 * See the License for the specific language governing permissions and
            if (isSID) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    @Override
    protected boolean isLogInputStream() {

        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final String role = conInfo.getProviderProperty(OracleConstants.PROP_INTERNAL_LOGON);
        }
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolHandler;
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected OracleScriptExecuteSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {
        OracleDataSource arg,

        ProcessBuilder processBuilder,
    }
    protected boolean needsModelRefresh() {
import java.io.File;
    public Collection<OracleDataSource> getRunInfo(OracleScriptExecuteSettings settings) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            boolean isSID = OracleConnectionType.SID.name().equals(conInfo.getProviderProperty(OracleConstants.PROP_SID_SERVICE));
        DBTTask task,
        if (role != null) {
        return Collections.singletonList((OracleDataSource) settings.getDataSourceContainer().getDataSource());

        Log log
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public void fillProcessParameters(OracleScriptExecuteSettings settings, OracleDataSource arg, List<String> cmd) throws IOException {


 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
}
            throw new IOException("SQL*Plus binary not found in '" + settings.getClientHome().getPath().getAbsolutePath());
/*
        super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
            throw new IOException("File '" + inputFile + "' doesn't exist");
    }
        if (!Files.exists(inputFile)) {
            url += (" AS " + role);
    @Override
        DBPConnectionConfiguration conInfo = settings.getDataSourceContainer().getActualConnectionConfiguration();
        OracleScriptExecuteSettings settings = new OracleScriptExecuteSettings(task.getProject());
        }
        return settings;
    @Override
        Path inputFile = DBFUtils.resolvePathFromString(monitor, task.getProject(), settings.getInputFile());
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;

            url = conInfo.getServerName() != null ? conInfo.getServerName() : conInfo.getDatabaseName();
        String url;
        return false;
    }
 */

import org.jkiss.dbeaver.DBException;
