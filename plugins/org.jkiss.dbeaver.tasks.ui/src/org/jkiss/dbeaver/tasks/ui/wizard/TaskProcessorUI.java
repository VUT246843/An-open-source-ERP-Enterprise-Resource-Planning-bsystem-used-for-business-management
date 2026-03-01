    }
        @Nullable Object settings
            }

    @Override
    }
        this.staticContext = staticContext;
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;

 * DBeaver - Universal Database Manager
    }
    }
    }
    @NotNull
        @Nullable DBTTask task,
                    completeMessage.toString(), !hasErrors ? IStatus.INFO : IStatus.ERROR);
                    error.getMessage(),
                    .append(" (").append(RuntimeUtils.formatExecutionTime(elapsedTime)).append(")");
    }
import org.jkiss.dbeaver.model.task.DBTTaskExecutionListener;

import org.jkiss.dbeaver.DBException;
        this.startTime = System.currentTimeMillis();
package org.jkiss.dbeaver.tasks.ui.wizard;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

                    theTask == null ? this.task.getName() : theTask.getName(),
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
            List<String> objects = new ArrayList<>();
                    DBPMessageType.ERROR,
    @Override

                DBeaverNotifications.showNotification(
                completeMessage.append("\nObject(s) processed: ").append(String.join(",", objects));

            StringBuilder completeMessage = new StringBuilder();

    public void taskStarted(@Nullable DBTTask task) {
    private static final Log log = Log.getLog(TaskProcessorUI.class);
    public void taskFinished(
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return true;
import org.jkiss.dbeaver.model.DBPMessageType;
        this.task = task;
    protected boolean isShowFinalMessage() {
        });
                        new DBTTaskEvent(theTask == null ? this.task : theTask, DBTTaskEvent.Action.TASK_ACTIVATE)));
        DBRRunnableWithProgress runnable
        boolean fork,
                    () -> DBWorkbench.getPlatformUI().showError("Task error", "Task execution failed", error)
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.Nullable;
        this.timeSincePreviousTask = startTime;
        throw new DBException("Empty task execute implementation");
    public void run(
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.registry.task.TaskRegistry;
import org.jkiss.dbeaver.utils.RuntimeUtils;
    private void sendNotification(@Nullable DBTTask theTask, @Nullable Throwable error, long elapsedTime, @Nullable Object settings) {
 * you may not use this file except in compliance with the License.
                );
    @NotNull
 * See the License for the specific language governing permissions and

                    "task.execute.failure",

        this.started = true;
import java.util.ArrayList;

            }

        return task;
    public DBTTask getTask() {
                serviceSystemAgent.notifyAgent(
 *     http://www.apache.org/licenses/LICENSE-2.0
        runTask();
    public void executeTask() throws DBException {
    public TaskProcessorUI(@NotNull DBRRunnableContext staticContext, @NotNull DBTTask task) {
 * You may obtain a copy of the License at
        @Nullable Object result,
    @Override
        this.started = false;
 *
    }
                DBeaverNotifications.showNotification(
            boolean hasErrors = error != null;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void runTask() throws DBException {

 * distributed under the License is distributed on an "AS IS" BASIS,
                    .append(TaskUIMessages.task_processor_ui_message_task_completed)
        sendNotification(task, error, elapsedTime, settings);
                    () -> TaskRegistry.getInstance().notifyTaskListeners(
import java.lang.reflect.InvocationTargetException;
    public void subTaskFinished(@Nullable DBTTask task, @Nullable Throwable error, @Nullable Object settings) {
 * Unless required by applicable law or agreed to in writing, software
    @Override
    private long startTime;
/*
        timeSincePreviousTask = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis() - startTime;
    private long timeSincePreviousTask;
    private final DBTTask task;
            } else if (error != null && !(error instanceof InterruptedException)) {
            if (settings instanceof AbstractNativeToolSettings) {

    ) {

        UIUtils.asyncExec(() -> {
            }
import org.jkiss.dbeaver.model.task.DBTTaskEvent;
            if (isShowFinalMessage() && !hasErrors) {
    ) throws InvocationTargetException, InterruptedException {

        staticContext.run(fork, cancelable, runnable);
import org.jkiss.code.NotNull;

 * limitations under the License.
        boolean cancelable,
                    completeMessage.toString(),
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.model.task.DBTTask;
}

                    objects.add(databaseObject.getName());
 */
                    DBPMessageType.INFORMATION,
        @Nullable Throwable error,
        long elapsedTime = System.currentTimeMillis() - timeSincePreviousTask;
                    theTask == null ? this.task.getName() : theTask.getName(),
 *
                    "task.execute.success",
                this.task.getType().getName() :
    }
public class TaskProcessorUI implements DBRRunnableContext, DBTTaskExecutionListener {
            if (serviceSystemAgent != null && elapsedTime > serviceSystemAgent.getLongOperationTimeout() * 1000) {
import org.jkiss.dbeaver.runtime.ui.UIServiceSystemAgent;
import org.jkiss.dbeaver.Log;
    private final DBRRunnableContext staticContext;
    }


            completeMessage.append(theTask == null ?
                for (DBSObject databaseObject : ((AbstractNativeToolSettings<?>) settings).getDatabaseObjects()) {
                theTask.getType().getName()).append(" ")
import org.jkiss.dbeaver.model.struct.DBSObject;
    @NotNull
            UIServiceSystemAgent serviceSystemAgent = DBWorkbench.getService(UIServiceSystemAgent.class);
    }
import java.util.List;
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
        sendNotification(task, error, elapsedTime, settings);
    private boolean started;

