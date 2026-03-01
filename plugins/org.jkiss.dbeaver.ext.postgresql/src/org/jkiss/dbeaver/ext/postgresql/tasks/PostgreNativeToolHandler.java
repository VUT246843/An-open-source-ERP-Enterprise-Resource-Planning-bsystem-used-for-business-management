            // On Unixes it is more tricky (https://unix.stackexchange.com/questions/30903/how-to-escape-quotes-in-shell)

            cmd.add("--verbose");
import org.jkiss.dbeaver.model.struct.DBSObject;



        return false;
            userPassword = getDataSourcePassword(monitor, settings);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean isVerbose() {

        if (CommonUtils.isEmpty(userPassword)) {
    }
    @Override
    protected abstract boolean isExportWizard();
                            "psql"
    protected void setupProcessParameters(DBRProgressMonitor monitor, SETTINGS settings, PROCESS_ARG arg, ProcessBuilder process) {
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
        boolean isRestoreByPsql = this instanceof PostgreDatabaseRestoreHandler
        if (CommonUtils.isEmpty(toolUserName)) {

        cmd.add(dumpPath);
import org.jkiss.utils.IOUtils;
            this instanceof PostgreDatabaseBackupHandler ? "pg_dump" :
}
        settings.addExtraCommandArgs(cmd);
                        this instanceof PostgreDatabaseBackupAllHandler ? "pg_dumpall" :
        if (!CommonUtils.isEmpty(userPassword)) {
 * limitations under the License.
    @Override
/*
                isRestoreByPsql ? "psql" :
        String dumpPath = dumpBinary.getAbsolutePath();
    }
import org.jkiss.dbeaver.tasks.nativetool.NativeToolUtils;
        File dumpBinary = RuntimeUtils.getNativeClientBinary(

        DBPDataSourceContainer dataSourceContainer = settings.getDataSourceContainer();
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolHandler;
        }
        cmd.add("--username=" + toolUserName);
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
            // On Windows it is simple
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            process.environment().put("PGPASSWORD", userPassword);
            && postgreBackupRestoreSettings.getFormat() == PostgreBackupRestoreSettings.ExportFormat.PLAIN;
 */
    }
    public void fillProcessParameters(SETTINGS settings, PROCESS_ARG processArg, List<String> cmd) throws IOException {

    public static String escapeCLIIdentifier(String name) {
                    this instanceof PostgreDatabaseRestoreHandler ? "pg_restore" :
import java.util.List;
            return "\"" + name.replace("\"", "\\\"") + "\"";
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;
 *     http://www.apache.org/licenses/LICENSE-2.0
        ); //$NON-NLS-1$
        if (RuntimeUtils.isWindows()) {

 *
        }
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.io.IOException;
 *
 * DBeaver - Universal Database Manager
        String userPassword = settings.getToolUserPassword();
        if (isVerbose() && !isRestoreByPsql) {
            return name;
public abstract class PostgreNativeToolHandler<SETTINGS extends AbstractNativeToolSettings<BASE_OBJECT>, BASE_OBJECT extends DBSObject, PROCESS_ARG>
package org.jkiss.dbeaver.ext.postgresql.tasks;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public boolean isUseStreamTransfer(String targetFile) {
            && settings instanceof PostgreBackupRestoreSettings postgreBackupRestoreSettings
    }
        NativeToolUtils.addHostAndPortParamsToCmd(dataSourceContainer, cmd);
 * you may not use this file except in compliance with the License.
import java.io.File;
        return !IOUtils.isLocalFile(targetFile);
 *
    }
        }
            //return "\"" + name.replace("\"", "\"\\\"\"") + "\"";
    extends AbstractNativeToolHandler<SETTINGS, BASE_OBJECT, PROCESS_ARG> {
        String toolUserName = settings.getToolUserName();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
        }
 * You may obtain a copy of the License at

            //return "\"" + name.replace("\"", "\\\"") + "\"";
            toolUserName = dataSourceContainer.getActualConnectionConfiguration().getUserName();
            settings.getClientHome(), PostgreConstants.BIN_FOLDER,

        }
