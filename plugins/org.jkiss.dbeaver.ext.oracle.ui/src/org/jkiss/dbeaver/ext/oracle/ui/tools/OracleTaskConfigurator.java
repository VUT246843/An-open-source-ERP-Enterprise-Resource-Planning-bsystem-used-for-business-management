    public TaskConfigurationWizard createTaskConfigWizard(@NotNull DBTTask taskConfiguration) {
    @Override
            case OracleTasks.TASK_SCRIPT_EXECUTE:
 *
import org.jkiss.dbeaver.model.task.DBTTask;
/**
    }
 *
import org.jkiss.dbeaver.tasks.ui.nativetool.NativeToolConfigPanel;
        switch (taskConfiguration.getType().getId()) {
import org.jkiss.dbeaver.model.task.DBTTaskType;

            super(runnableContext, taskType, DBPDataSourceContainer.class, OracleDataSourceProvider.class);
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanelProvider;
import org.jkiss.dbeaver.ext.oracle.OracleDataSourceProvider;

    }

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.oracle.tasks.OracleTasks;
 * you may not use this file except in compliance with the License.

        }
    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 */
public class OracleTaskConfigurator implements DBTTaskConfigurator, DBTTaskConfigPanelProvider {
        return null;
package org.jkiss.dbeaver.ext.oracle.ui.tools;
/*
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * limitations under the License.

    private static final Log log = Log.getLog(OracleTaskConfigurator.class);
 * DBeaver - Universal Database Manager
        ConfigPanel(DBRRunnableContext runnableContext, DBTTaskType taskType) {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    private static class ConfigPanel extends NativeToolConfigPanel<DBPDataSourceContainer> {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;

 * Oracle task configurator
                return new OracleScriptExecuteWizard(taskConfiguration);

 * See the License for the specific language governing permissions and

        return new ConfigPanel(runnableContext, taskType);
 * Unless required by applicable law or agreed to in writing, software
    public ConfigPanel createInputConfigurator(DBRRunnableContext runnableContext, @NotNull DBTTaskType taskType) {
}
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 * Licensed under the Apache License, Version 2.0 (the "License");
