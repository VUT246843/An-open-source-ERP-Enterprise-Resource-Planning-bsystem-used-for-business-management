import org.jkiss.dbeaver.model.task.DBTTask;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DBTTask getTask() {
        log.debug("\t" + name);
 * limitations under the License.

/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}import org.jkiss.dbeaver.Log;

    }
    public void subTask(@NotNull String name) {
        super.beginTask(name, totalWork);
    }
import org.jkiss.dbeaver.model.runtime.ProxyProgressMonitor;
    @Override
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    @Override
        super(monitor);
        return task;
    public TaskLoggingProgressMonitor(DBRProgressMonitor monitor, DBTTask task) {
        log.debug("" + name);
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBTTask task;
 *
        super.subTask(name);
 *
package org.jkiss.dbeaver.registry.task;

 * Unless required by applicable law or agreed to in writing, software

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
        this.task = task;
    public void beginTask(@NotNull String name, int totalWork) {


    private static final Log log = Log.getLog(TaskLoggingProgressMonitor.class);
 *
 */
 * You may obtain a copy of the License at
public class TaskLoggingProgressMonitor extends ProxyProgressMonitor {
 * Licensed under the Apache License, Version 2.0 (the "License");
