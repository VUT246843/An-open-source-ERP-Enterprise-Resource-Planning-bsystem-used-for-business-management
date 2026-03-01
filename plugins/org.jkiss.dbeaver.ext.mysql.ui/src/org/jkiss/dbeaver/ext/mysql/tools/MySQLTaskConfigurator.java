    }
                return new MySQLExportWizard(taskConfiguration);
            case MySQLTasks.TASK_DATABASE_RESTORE:
    public ConfigPanel createInputConfigurator(DBRRunnableContext runnableContext, @NotNull DBTTaskType taskType) {

 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ext.mysql.MySQLDataSourceProvider;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return new ConfigPanel(runnableContext, taskType);
 * distributed under the License is distributed on an "AS IS" BASIS,

            case MySQLTasks.TASK_DATABASE_BACKUP:
    }
    private static class ConfigPanel extends NativeToolConfigPanel<MySQLCatalog> {
/*
import org.jkiss.dbeaver.model.task.DBTTaskType;
                return new MySQLScriptExecuteWizard(taskConfiguration, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        }
    private static final Log log = Log.getLog(MySQLTaskConfigurator.class);
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
    @Override
import org.jkiss.code.NotNull;
 */
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
/**
 *
public class MySQLTaskConfigurator implements DBTTaskConfigurator, DBTTaskConfigPanelProvider {
        return null;
 * MySQL task configurator
        switch (taskConfiguration.getType().getId()) {

 * limitations under the License.
            super(runnableContext, taskType, MySQLCatalog.class, MySQLDataSourceProvider.class);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLTasks;

 *
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanelProvider;
                return new MySQLScriptExecuteWizard(taskConfiguration, false);
import org.jkiss.dbeaver.tasks.ui.nativetool.NativeToolConfigPanel;
 * you may not use this file except in compliance with the License.

        ConfigPanel(DBRRunnableContext runnableContext, DBTTaskType taskType) {
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.Log;
        }
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.task.DBTTask;
package org.jkiss.dbeaver.ext.mysql.tools;

            case MySQLTasks.TASK_SCRIPT_EXECUTE:
    public TaskConfigurationWizard createTaskConfigWizard(@NotNull DBTTask taskConfiguration) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
    }
}
