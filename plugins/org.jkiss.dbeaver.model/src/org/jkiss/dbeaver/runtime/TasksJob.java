                // Ignore
import java.util.ArrayList;
                if (tasks.size() == 1) {
 * See the License for the specific language governing permissions and
                    switch (DBWorkbench.getPlatformUI().showErrorStopRetryIgnore(getName(), e.getTargetException(), true)) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        monitor.beginTask(getName(), tasks.size());
import java.util.Collection;

                        case RETRY:
        monitor.done();
 */
 * limitations under the License.
                }
import java.util.List;
    }
    }


    public static void runTasks(String name, Collection<DBRRunnableWithProgress> tasks) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
        this(name, Collections.singletonList(task));
    @NotNull
                            break;
import java.util.Collections;
                } else if (!ignoreErrors) {
            DBRRunnableWithProgress task = tasks.get(i);
                    boolean keepRunning = true;
            try {
            monitor.worked(1);
            } catch (InvocationTargetException e) {
            }
                    DBWorkbench.getPlatformUI().showError(getName(), null, e.getTargetException());
import org.eclipse.core.runtime.Status;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        case STOP:
 * You may obtain a copy of the License at
                            // Just do nothing
    }

/**
package org.jkiss.dbeaver.runtime;
 *

    private TasksJob(String name, DBRRunnableWithProgress task) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (monitor.isCanceled()) {
            }

    private TasksJob(String name, Collection<DBRRunnableWithProgress> tasks) {
                            break;
        new TasksJob(name, task).schedule();
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.tasks = new ArrayList<>(tasks);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                        break;
    @Override
import org.eclipse.core.runtime.IStatus;
 *

 * Job running specified tasks in queue

                            break;
 */
 * you may not use this file except in compliance with the License.
    private final List<DBRRunnableWithProgress> tasks;
        new TasksJob(name, tasks).schedule();
                    if (!keepRunning) {
public class TasksJob extends AbstractJob
        super(name);
    public static void runTask(String name, DBRRunnableWithProgress task) {
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        boolean ignoreErrors = false;
    }
            } catch (InterruptedException e) {
            i++;
                break;
                task.run(monitor);
import java.lang.reflect.InvocationTargetException;
}

                    }
 * DBeaver - Universal Database Manager
        return Status.OK_STATUS;

        setUser(true);
                            ignoreErrors = true;
/*
 *
                        case IGNORE:
                            // just make it again
        }
                            keepRunning = false;
                            continue;
                        case IGNORE_ALL:
    }
                    }
        for (int i = 0; i < tasks.size(); ) {
import org.jkiss.code.NotNull;
