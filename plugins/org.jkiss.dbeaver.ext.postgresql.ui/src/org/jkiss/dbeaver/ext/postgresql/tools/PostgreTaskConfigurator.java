/*

 */
import org.jkiss.dbeaver.model.task.DBTTaskType;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    private static final Log log = Log.getLog(PostgreTaskConfigurator.class);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.task.DBTTask;

 * limitations under the License.

 * you may not use this file except in compliance with the License.
        }
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
    public ConfigPanel createInputConfigurator(DBRRunnableContext runnableContext, @NotNull DBTTaskType taskType) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        }
/**
            case PostgreSQLTasks.TASK_SCRIPT_EXECUTE:
    private static class ConfigPanel extends NativeToolConfigPanel<PostgreDatabase> {
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
package org.jkiss.dbeaver.ext.postgresql.tools;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class PostgreTaskConfigurator implements DBTTaskConfigurator, DBTTaskConfigPanelProvider {
import org.jkiss.dbeaver.tasks.ui.nativetool.NativeToolConfigPanel;
    public TaskConfigurationWizard createTaskConfigWizard(@NotNull DBTTask taskConfiguration) {

    @Override
    @Override
 *
import org.jkiss.dbeaver.ext.postgresql.PostgreDataSourceProvider;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return new PostgreRestoreWizard(taskConfiguration);
 * PostgreSQL task configurator
                return new PostgreScriptExecuteWizard(taskConfiguration);
            case PostgreSQLTasks.TASK_DATABASE_BACKUP_ALL:
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreSQLTasks;
 *

        switch (taskConfiguration.getType().getId()) {
 */
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanelProvider;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        ConfigPanel(DBRRunnableContext runnableContext, DBTTaskType taskType) {
        return new ConfigPanel(runnableContext, taskType);



                return new PostgreBackupAllWizard(taskConfiguration);
            case PostgreSQLTasks.TASK_DATABASE_BACKUP:
 *
            case PostgreSQLTasks.TASK_DATABASE_RESTORE:
            super(runnableContext, taskType, PostgreDatabase.class, PostgreDataSourceProvider.class);
                return new PostgreBackupWizard(taskConfiguration);
    }
 * See the License for the specific language governing permissions and
    }
