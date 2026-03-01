    }
         * Use credentials derived from connection configuration
                    Files.delete(config);
        try (Writer writer = Files.newBufferedWriter(cnf)) {

            return super.doExecute(monitor, task, settings, log);
}
import org.jkiss.dbeaver.model.task.DBTTask;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private boolean isOverrideCredentials(SETTINGS settings) {

            writer.write("\nuser=" + CommonUtils.notEmpty(username)); //$NON-NLS-1$
        } else {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
        if (CommonUtils.isEmpty(toolUserName)) {
        Path cnf = dir.resolve(".my.cnf"); //$NON-NLS-1$
 * you may not use this file except in compliance with the License.
                }
import org.jkiss.utils.CommonUtils;
         * This is needed to avoid overriding empty password.
        } finally {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
         */
            String toolUserPassword = settings.getToolUserPassword();
package org.jkiss.dbeaver.ext.mysql.tasks;
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            return ((MySQLNativeCredentialsSettings) settings).isOverrideCredentials();
        return cnf;
 *
            toolUserPassword = settings.getDataSourceContainer().getActualConnectionConfiguration().getUserPassword();
import org.jkiss.dbeaver.DBException;
    }
        try {
 * See the License for the specific language governing permissions and
            writer.write("\npassword=" + CommonUtils.notEmpty(password)); //$NON-NLS-1$
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected boolean doExecute(DBRProgressMonitor monitor, DBTTask task, SETTINGS settings, Log log) throws DBException, InterruptedException {
    }
    private static Path createCredentialsFile(String username, String password) throws IOException {
            writer.write("[client]"); //$NON-NLS-1$
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    extends AbstractNativeToolHandler<SETTINGS, BASE_OBJECT, PROCESS_ARG> {
    @Override
                process.environment().put(MySQLConstants.ENV_VAR_MYSQL_PWD, toolUserPassword);

            if (CommonUtils.isEmpty(toolUserPassword)) {
            cmd.add(toolUserName);
import java.io.IOException;
import org.jkiss.dbeaver.Log;
                try {
import java.nio.file.Files;
    protected List<String> getCommandLine(SETTINGS settings, PROCESS_ARG arg) throws IOException {
        return cmd;
        fillProcessParameters(settings, arg, cmd);
    protected void setupProcessParameters(DBRProgressMonitor monitor, SETTINGS settings, PROCESS_ARG arg, ProcessBuilder process) {
            cmd.add(1, "--defaults-file=" + config.toAbsolutePath());
            if (config != null) {
            }

                } catch (IOException e) {
        }
        Path dir = DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), "mysql-native-handler"); //$NON-NLS-1$
        String toolUserPassword = settings.getToolUserPassword();

 * DBeaver - Universal Database Manager

        }
            }
 *
 * Unless required by applicable law or agreed to in writing, software
import java.nio.file.Path;
    }
        NativeToolUtils.addHostAndPortParamsToCmd(settings.getDataSourceContainer(), cmd);
    private Path config;
            config = createCredentialsFile(toolUserName, toolUserPassword);
            if (CommonUtils.isNotEmpty(toolUserPassword)) {
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
                toolUserPassword = getDataSourcePassword(monitor, settings);
    @Override
        }

import org.jkiss.dbeaver.tasks.nativetool.NativeToolUtils;
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolHandler;
            toolUserName = settings.getDataSourceContainer().getActualConnectionConfiguration().getUserName();
         * if no username was specified by export configuration itself.
 * limitations under the License.





 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (isOverrideCredentials(settings)) {
/*
        return false;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.io.Writer;
import java.util.ArrayList;
        cnf.toFile().deleteOnExit();

                    log.debug("Failed to delete configuration file", e);
 */

            }
        /*
            cmd.add("-u");

public abstract class MySQLNativeToolHandler<SETTINGS extends AbstractNativeToolSettings<BASE_OBJECT>, BASE_OBJECT extends DBSObject, PROCESS_ARG>
        if (settings instanceof MySQLNativeCredentialsSettings) {

        String toolUserName = settings.getToolUserName();
        if (!isOverrideCredentials(settings)) {
        List<String> cmd = new ArrayList<>();
import java.util.List;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
