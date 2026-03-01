 * DBeaver - Universal Database Manager
        @NotNull PrintStream logStream,
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * You may obtain a copy of the License at
}
import org.jkiss.dbeaver.model.task.DBTTaskExecutionListener;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            throw new DBException("Error: Data import operation is restricted by policy"); //$NON-NLS-1$
 * limitations under the License.
package org.jkiss.dbeaver.tools.transfer.task;
        @NotNull DBTTask task,
        @NotNull Log log,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.io.PrintStream;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_IMPORT)) {

        @NotNull DBRRunnableContext runnableContext,
 */
import org.jkiss.dbeaver.model.task.DBTTaskRunStatus;

import org.jkiss.dbeaver.model.task.DBTTask;
 * DTTaskHandlerImport
    @Override
public class DTTaskHandlerImport extends DTTaskHandlerTransfer {
        @NotNull Locale locale,
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBTTaskExecutionListener listener
    public DBTTaskRunStatus executeTask(

 * See the License for the specific language governing permissions and
import java.util.Locale;
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
        return super.executeTask(runnableContext, task, locale, log, logStream, listener);
/*
    }
        }
 */
/**
    ) throws DBException {
    @NotNull
import org.jkiss.code.NotNull;
