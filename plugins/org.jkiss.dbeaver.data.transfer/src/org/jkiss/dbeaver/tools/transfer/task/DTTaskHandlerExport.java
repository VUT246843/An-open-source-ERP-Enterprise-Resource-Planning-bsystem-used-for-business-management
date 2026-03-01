import java.util.Locale;
 *

import org.jkiss.dbeaver.model.task.DBTTaskRunStatus;
    }
        @NotNull Locale locale,
/**
        @NotNull DBRRunnableContext runnableContext,
        return super.executeTask(runnableContext, task, locale, log, logStream, listener);
import org.jkiss.dbeaver.model.task.DBTTask;
        @NotNull DBTTaskExecutionListener listener
        @NotNull DBTTask task,
 */
 *
        @NotNull PrintStream logStream,

        @NotNull Log log,
    public DBTTaskRunStatus executeTask(
 * DTTaskHandlerExport
 */
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.tools.transfer.task;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.task.DBTTaskExecutionListener;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        }
 * limitations under the License.
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {

            throw new DBException("Error: Data export operation is restricted by policy"); //$NON-NLS-1$
    ) throws DBException {
import java.io.PrintStream;
public class DTTaskHandlerExport extends DTTaskHandlerTransfer {
 * See the License for the specific language governing permissions and
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
}
 *
