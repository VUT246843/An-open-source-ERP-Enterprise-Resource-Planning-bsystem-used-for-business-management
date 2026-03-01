    private Duration elapsedTime = Duration.ZERO;
        DBTaskUtils.confirmTaskOrThrow(task, taskLog, logWriter);
 */
import java.util.Locale;
            if (taskStatus.getResultMessage() == null) {
    }
                    taskError.printStackTrace(new PrintWriter(buf, true));
        @Override
        public void taskStarted(@Nullable DBTTask task) {
             
        Date startTime = new Date();
            log.error("Error opening task run log file", e);
                    taskLog.info(String.format("Task '%s' (%s) cancelled after %s ms", task.getName(), task.getId(), elapsedTime));

            if (canceledByTimeOut) {
        return taskRunStatus;

            this.parent = src;
                }
                } else if (taskError != null) {
/**
        }
 *
    public Throwable getTaskError() {
                    }

    }
        this.task = task;
import org.jkiss.dbeaver.Log;
        return task;
        activeMonitor = monitor;
        activeMonitor.getNestedMonitor().setCanceled(true);
        String taskId = dateFormat.format(startTime) + "_" + taskNumber.incrementAndGet();
    }
    }
                        errorMessage = taskError.getClass().getName();
        this.locale = locale;
import java.io.IOException;
    private DBTTaskRunStatus taskRunStatus = new DBTTaskRunStatus();
    public TaskRunJob(TaskImpl task, Locale locale, DBTTaskExecutionListener executionListener) {
                    taskRun.setErrorMessage(errorMessage);
    @NotNull
            } finally {
    public DBTTaskRunStatus getTaskRunStatus() {
    }
            parent.taskFinished(task, result, error, settings);
            monitor.beginTask("Run task '" + task.getName() + " (" + task.getType().getName() + ")", 1);

        setUser(true);
            taskLog = Log.getLog(TaskRunJob.class);
                taskError = e;
                monitor.done();
        setSystem(false);
    private boolean canceledByTimeOut = false;
import java.text.SimpleDateFormat;
    private Instant taskStartTime = Instant.now();
                } else {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    private DBTTaskRunStatus executeTask(
 * DBeaver - Universal Database Manager
        return taskStatus;

 * TaskRunJob
        if (monitor.isCanceled()) {
    @NotNull
            } catch (Throwable e) {
        TaskRunImpl taskRun = new TaskRunImpl(
                    taskRun.setErrorStackTrace(buf.toString());
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        try (PrintStream logStream = new PrintStream(Files.newOutputStream(logFile), true, StandardCharsets.UTF_8)) {

            taskId,
        @NotNull PrintStream logWriter
    private final Locale locale;
import java.io.PrintStream;
            System.getProperty(StandardConstants.ENV_USER_NAME),

 *
 * distributed under the License is distributed on an "AS IS" BASIS,

            taskLog.info(String.format("Task '%s' (%s) started", task.getName(), task.getId()));
    @Override
    private final DBTTaskExecutionListener executionListener;
import java.time.Instant;
import java.lang.reflect.InvocationTargetException;
    }
        return taskError;
    private DBRProgressMonitor activeMonitor;
        public LoggingExecutionListener(DBTTaskExecutionListener src) {
            canceling();
        }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;

/*
        runnable.run(activeMonitor);
            PrintStream oldLogWriter = Log.getLogWriter();
            Log.setLogWriter(logStream);
    private Throwable taskError;
import java.nio.charset.StandardCharsets;

import java.util.concurrent.atomic.AtomicInteger;
    @Override
        }
    public void run(boolean fork, boolean cancelable, DBRRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException {
            }

import java.io.PrintWriter;
                taskRun.setRunDuration(elapsedTime.toMillis());
package org.jkiss.dbeaver.registry.task;
                taskStatus.setResultMessage("by timeout reached");
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public TaskImpl getTask() {
import org.eclipse.core.runtime.IStatus;
        dateFormat.setTimeZone(TimeZone.getTimeZone(TimezoneRegistry.getUserDefaultTimezone()));

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.nio.file.Path;
        }
        super("Task [" + task.getType().getName() + "] runner - " + task.getName());
        task.getTaskStatsFolder(true);
                Log.setLogWriter(oldLogWriter);
    public Duration getElapsedTime() {
                taskLog.error("Task fatal error", e);
import java.time.Duration;
            new Date(),

import org.jkiss.dbeaver.DBException;
import java.nio.file.Files;
    }
            null, null);
 * limitations under the License.
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 * You may obtain a copy of the License at
        DBTTaskRunStatus taskStatus = taskHandler.executeTask(this, task, locale, taskLog, logWriter, executionListener);
import java.util.TimeZone;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 *
    private static final Log log = Log.getLog(TaskRunJob.class);


        }
        public void taskFinished(@Nullable DBTTask task, @Nullable Object result, @Nullable Throwable error, @Nullable Object settings) {
 * See the License for the specific language governing permissions and
        @Override
    }
        @NotNull DBRProgressMonitor monitor,
            elapsedTime = getElapsedTime();

    private final TaskImpl task;
import java.util.Date;
        DBTTaskExecutionListener parent;
                    taskLog.info(String.format("Task '%s' (%s) finished with errors in %s ms", task.getName(), task.getId(), elapsedTime));
    private class LoggingExecutionListener implements DBTTaskExecutionListener {
        }
            GeneralUtils.getProductTitle(),
                    taskLog.info(String.format("Task '%s' (%s) finished successfully in %s ms", task.getName(), task.getId(), elapsedTime));
                taskStatus.setResultMessage("by user");
import org.jkiss.code.NotNull;
            }
                    if (CommonUtils.isEmpty(errorMessage)) {
            taskError = error;


        canceledByTimeOut = true;
                task.updateRun(taskRun);

        task.addNewRun(taskRun);
            parent.taskStarted(task);

                    taskRun.setErrorMessage("Canceled");
                taskLog.flush();
                taskRun.setExtraMessage(taskRunStatus.getResultMessage());

        @Override
        if (isRunDirectly()) {
    public void cancelByTimeout() {
                    String errorMessage = taskError.getMessage();

    }
import java.io.StringWriter;
    ) throws DBException, InterruptedException {
        this.executionListener = new LoggingExecutionListener(executionListener);
    @NotNull
import org.jkiss.dbeaver.registry.timezone.TimezoneRegistry;
import org.eclipse.core.runtime.Status;
            taskStartTime = Instant.now();
public class TaskRunJob extends AbstractJob implements DBRRunnableContext {

        }
 * you may not use this file except in compliance with the License.
                if (activeMonitor.isCanceled() || monitor.isCanceled()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.utils.StandardConstants;
 * Licensed under the Apache License, Version 2.0 (the "License");
        Path logFile = Objects.requireNonNull(task.getRunLog(taskRun)); // must exist on local machine
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    @NotNull
            try {
        return Status.OK_STATUS;
    private Log taskLog = log;
}
    @Nullable
        } catch (IOException e) {
        cancel();
 */
        return Duration.between(taskStartTime, Instant.now());
import org.jkiss.dbeaver.utils.GeneralUtils;
                taskRunStatus = executeTask(new TaskLoggingProgressMonitor(monitor, task), logStream);

            parent.subTaskFinished(task, error, settings);
        SimpleDateFormat dateFormat = new SimpleDateFormat(GeneralUtils.DEFAULT_TIMESTAMP_PATTERN, Locale.getDefault()); //$NON-NLS-1$
    private static final AtomicInteger taskNumber = new AtomicInteger(0);

import java.util.Objects;
import org.jkiss.utils.CommonUtils;
        DBTTaskHandler taskHandler = task.getType().createHandler();
import org.jkiss.dbeaver.model.task.*;
        public void subTaskFinished(@Nullable DBTTask task, @Nullable Throwable error, @Nullable Object settings) {
                    StringWriter buf = new StringWriter();
