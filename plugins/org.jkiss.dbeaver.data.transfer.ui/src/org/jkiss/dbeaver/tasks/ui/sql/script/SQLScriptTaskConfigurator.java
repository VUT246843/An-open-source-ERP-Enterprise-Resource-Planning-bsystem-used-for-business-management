
    @Override
 */

    }
 * SQL task configurator
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 *

 * You may obtain a copy of the License at
 *
    public TaskConfigurationWizard createTaskConfigWizard(@NotNull DBTTask taskConfiguration) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.task.DBTTask;
        return new SQLScriptTaskConfigurationWizard(taskConfiguration);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
/**
}

import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
package org.jkiss.dbeaver.tasks.ui.sql.script;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

public class SQLScriptTaskConfigurator implements DBTTaskConfigurator {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 */
