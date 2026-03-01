 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Usually some UI dialog/wizard for task configuration.
 *
 * limitations under the License.
 * Task configurator.
     *

     * Creates a panel for task input objects configure.
        DBRRunnableContext runnableContext,
package org.jkiss.dbeaver.tasks.ui;
/**
    /**
        @NotNull DBTTaskType taskType);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

     */
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
public interface DBTTaskConfigPanelProvider {
    DBTTaskConfigPanel createInputConfigurator(
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.task.DBTTaskType;
     * @param runnableContext runnable context
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 */
     * @param taskType task type
     * @return null if config panel not supported/disabled. Otherwise IObjectPropertyConfigurator implementation (see UI modules).

}
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
