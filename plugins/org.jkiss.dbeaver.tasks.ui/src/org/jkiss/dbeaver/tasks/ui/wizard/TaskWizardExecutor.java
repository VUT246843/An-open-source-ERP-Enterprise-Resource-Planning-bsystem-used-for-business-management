import org.jkiss.code.NotNull;

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.task.DBTaskUtils;
        }
            DBTTaskHandler handlerTransfer = getTask().getType().createHandler();
            handlerTransfer.executeTask(this, getTask(), Locale.getDefault(), log, logWriter, this);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public TaskWizardExecutor(@NotNull DBRRunnableContext staticContext, @NotNull DBTTask task, @NotNull Log log, @NotNull PrintStream logWriter) {
}import org.jkiss.dbeaver.Log;
 *
 */
    @Override
 * you may not use this file except in compliance with the License.
    protected boolean isShowFinalMessage() {
import org.jkiss.dbeaver.tasks.ui.TaskFeatures;

 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.task.DBTTaskHandler;
 * Unless required by applicable law or agreed to in writing, software
/*

import java.util.Locale;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return CommonUtils.getBoolean(getTask().getProperties().get("showFinalMessage"), true);
    private final Log log;
    }

public class TaskWizardExecutor extends TaskProcessorUI {
    private PrintStream logWriter;
import org.jkiss.utils.CommonUtils;
        this.logWriter = logWriter;
    protected void runTask() throws DBException {
        this.log = log;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
import java.util.Map;
            TaskFeatures.TASKS_EXECUTE.use(Map.of("type", getTask().getType().getId()));
    }
        super(staticContext, task);

 *
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.task.DBTTask;
package org.jkiss.dbeaver.tasks.ui.wizard;
    @Override

        if (DBTaskUtils.confirmTask(getTask(), log, logWriter)) {
 *
import java.io.PrintStream;
