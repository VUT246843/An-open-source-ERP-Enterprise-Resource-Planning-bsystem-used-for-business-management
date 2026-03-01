package org.jkiss.dbeaver.tasks.ui.sql;
public class SQLToolTaskConfigurator implements DBTTaskConfigurator {
 * you may not use this file except in compliance with the License.
 *
 * limitations under the License.
    }
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.task.DBTTask;
import org.jkiss.dbeaver.Log;

    private static final Log log = Log.getLog(SQLToolTaskConfigurator.class);
 */
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * SQL tool task configurator


 */
    public TaskConfigurationWizard createTaskConfigWizard(@NotNull DBTTask taskConfiguration) {
import org.jkiss.code.NotNull;
 *
        return new SQLToolTaskWizard(taskConfiguration);
}
 * You may obtain a copy of the License at
/**

    @Override
