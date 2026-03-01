    public final RESULT runWithResult() throws DBException {
    }
        return runTask();
                    return null;
 *

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    public RESULT execute() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            protected T runTask() {
package org.jkiss.dbeaver.ui;
public abstract class UITask<RESULT> extends RunnableWithResult<RESULT> {
    protected abstract RESULT runTask() throws DBException;
import org.jkiss.dbeaver.DBException;
    public static <T> T run(TaskExecutor <T> runnable) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
    }

    }
            }
                try {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * distributed under the License is distributed on an "AS IS" BASIS,


/*
 */
 * You may obtain a copy of the License at
        return UIUtils.syncExec(this);
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.runtime.RunnableWithResult;
    @Override

    public interface TaskExecutor <T> {
 * See the License for the specific language governing permissions and

        return new UITask<T>() {
                    DBWorkbench.getPlatformUI().showError("Task error", "Internal error: task " + runnable + "' failed", e);
 *
                } catch (Exception e) {
                    return runnable.run();
        T run() throws DBException;
        }.execute();
 * Copyright (C) 2010-2024 DBeaver Corp and others

            @Override
} * you may not use this file except in compliance with the License.
