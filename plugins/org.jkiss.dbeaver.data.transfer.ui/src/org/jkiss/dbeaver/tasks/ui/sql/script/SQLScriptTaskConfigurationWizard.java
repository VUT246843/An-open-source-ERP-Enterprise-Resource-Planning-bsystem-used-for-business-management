import org.jkiss.dbeaver.DBException;
    public SQLScriptTaskConfigurationWizard(@NotNull DBTTask task) {

            DBWorkbench.getPlatformUI().showError("Configuration error", "Unable to load task configuration", e);
    @Override
    }
        return SQLTaskConstants.TASK_SCRIPT_EXECUTE;
        pageSettings = new SQLScriptTaskPageSettings(this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*

            settings.loadConfiguration(task);

    @Override
    protected String getDefaultWindowTitle() {
import java.util.Map;
    @Override
import org.jkiss.dbeaver.model.task.DBTTask;
        }
    @Override
    }
import org.jkiss.dbeaver.tools.sql.SQLScriptExecuteSettings;
    }
 *
class SQLScriptTaskConfigurationWizard extends TaskConfigurationWizard<SQLScriptExecuteSettings> {
    public String getTaskTypeId() {
        } catch (DBException e) {
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
import org.jkiss.dbeaver.tools.sql.SQLTaskConstants;

 * DBeaver - Universal Database Manager
    public SQLScriptTaskConfigurationWizard() {
 */
        super.addPages();
    private SQLScriptTaskPageSettings pageSettings;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
        settings.saveConfiguration(state);
        super(task);


import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
    }
import org.jkiss.code.NotNull;
        addPage(pageSettings);
 * Copyright (C) 2010-2025 DBeaver Corp and others

    private SQLScriptExecuteSettings settings = new SQLScriptExecuteSettings();
 *

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        return settings;
    public SQLScriptExecuteSettings getSettings() {

        return DTUIMessages.sql_script_task_configuration_wizard_default_window_title;
 * limitations under the License.
    }

import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.tasks.ui.sql.script;
 * Unless required by applicable law or agreed to in writing, software
}
    public void addPages() {
    @Override
 * you may not use this file except in compliance with the License.
        pageSettings.saveSettings();
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {

        try {
