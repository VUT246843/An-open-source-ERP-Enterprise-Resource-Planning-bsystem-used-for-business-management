}
        return true;
 * Unless required by applicable law or agreed to in writing, software

            if (!CommonUtils.isEmpty(includedDatabases)) {
    protected boolean validateTaskParameters(DBTTask task, PostgreBackupAllSettings settings, Log log) {
            List<PostgreDatabase> includedDatabases = arg.getDatabases();
            cmd.add("--no-owner");

        return false;
        }
import org.jkiss.dbeaver.model.fs.DBFUtils;

            }

    }
        }
        }
        if (!CommonUtils.isEmpty(settings.getEncoding())) {

        return true;
            }
    @Override
    public Collection<PostgreDatabaseBackupAllInfo> getRunInfo(PostgreBackupAllSettings settings) {
import org.jkiss.dbeaver.DBException;
    }
 * You may obtain a copy of the License at
import java.nio.file.Path;
 * DBeaver - Universal Database Manager
    @Override
    protected List<String> getCommandLine(PostgreBackupAllSettings settings, PostgreDatabaseBackupAllInfo arg) throws IOException {
        }
 * you may not use this file except in compliance with the License.
    @Override
        if (settings.isNoPrivileges()) {

    protected boolean needsModelRefresh() {
        } else {
        }
        return false;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    extends PostgreNativeToolHandler<PostgreBackupAllSettings, DBSObject, PostgreDatabaseBackupAllInfo> {
                    // pg_dumpall does not have parameter "include database", only "exclude database".
    ) throws IOException {
    }
        // Databases

        List<String> cmd
 * limitations under the License.
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
        if (settings.isExportOnlyMetadata()) {
                    List<PostgreDatabase> allDatabasesCopy = new ArrayList<>(allDatabases);
        if (!settings.isAddRolesPasswords()) {
 * See the License for the specific language governing permissions and


import java.nio.file.Files;
    @Override
                            Files.createDirectories(outputFolderPath);
import java.util.Collection;
    }
                String dir = settings.getOutputFolder(exportObject);
            // If not specified, the postgres database will be used, and if that does not exist, template1 will be used.
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                    // So we need to create list of excluded databases
                    return false;
        return cmd;
        if (PostgreSQLTasks.TASK_DATABASE_BACKUP_ALL.equals(task.getType().getId())) {



 *
            cmd.add("--roles-only");
import org.jkiss.utils.CommonUtils;
    public boolean isVerbose() {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    protected boolean isExportWizard() {
        if (settings.isNoOwner()) {
        if (settings.isExportOnlyTablespaces()) {

                    for (PostgreDatabase database : allDatabasesCopy) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        PostgreBackupAllSettings settings,
    public void fillProcessParameters(
 *
            cmd.add("--schema-only");
    @Override
                        cmd.add("--exclude-database=" + escapeCLIIdentifier(database.getName()));
        if (settings.isExportOnlyGlobals()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import java.util.ArrayList;
import org.jkiss.dbeaver.Log;

        List<String> cmd = new ArrayList<>();
                    if (!Files.exists(outputFolderPath)) {
            cmd.add("--tablespaces-only");
        if (settings.getExportObjects().isEmpty()) {
        }
            cmd.add("--encoding=" + settings.getEncoding());
package org.jkiss.dbeaver.ext.postgresql.tasks;
                }
                    log.error("Can't create directory '" + dir + "'", e);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    }
    @Override
        return true;
 *
        cmd.add(settings.getOutputFile(arg));
        super.fillProcessParameters(settings, arg, cmd);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    Path outputFolderPath = DBFUtils.resolvePathFromString(new VoidProgressMonitor(), task.getProject(), dir);
                }
                    }
    }
        fillProcessParameters(settings, arg, cmd);
    }
                } catch (Exception e) {
import java.io.IOException;
    protected PostgreBackupAllSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {
            cmd.add("--globals-only");

                    }
/*
            for (PostgreDatabaseBackupAllInfo exportObject : settings.getExportObjects()) {
        }
            // We do not want to dump users passwords by default
                try {
                final List<PostgreDatabase> allDatabases = dataSource.getDatabases();
        PostgreDatabaseBackupAllInfo arg,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

        settings.loadSettings(context, new TaskPreferenceStore(task));
        return settings;
    @Override
public class PostgreDatabaseBackupAllHandler
            cmd.add("--no-role-passwords");
                if (allDatabases.size() != includedDatabases.size()) {
        }
        }
 */
        if (settings.isExportOnlyRoles()) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                        // Use explicit quotes in case of quoted identifiers (#5950)
                    allDatabasesCopy.removeAll(includedDatabases);
                final PostgreDataSource dataSource = arg.getDataSource();
    }
            cmd.add("--no-privileges");
    protected boolean isLogInputStream() {
        cmd.add("--file");
import java.util.List;
        return settings.getExportObjects();
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    @Override
import org.jkiss.dbeaver.model.task.DBTTask;
        PostgreBackupAllSettings settings = new PostgreBackupAllSettings(task.getProject());
