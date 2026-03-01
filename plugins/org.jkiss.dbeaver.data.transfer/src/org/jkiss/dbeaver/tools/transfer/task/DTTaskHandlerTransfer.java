                    monitor.worked(1);
    public DBTTaskRunStatus executeTask(
                        } catch (InterruptedException | OperationCanceledException e) {
            final DataTransferJob[] jobs = new DataTransferJob[totalJobs];
        try {
            this.task = task;
                for (DataTransferJob job : jobs) {
                DataTransferJob job = new DataTransferJob(settings, task, log, logStream, totalJobs == 1 ? monitor : null, i);
                                             @NotNull List<DataTransferPipe> pipes) throws DBException {
                            }
        @Override
                    pipe.initPipe(settings, i, dataPipes.size());

                                    if (monitor.isCanceled()) {
import org.jkiss.dbeaver.Log;

                    return;

        DBException[] dbException = {null};
            this.log = log;
                }
        try {
            DBWorkbench.getPlatformUI().showError(
    private Throwable runDataTransferJobs(
        if (totalJobs == 0) {
    private int initializePipes(
 * DTTaskHandlerTransfer
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
                runnableContext,
                    task,
            throw new DBException("Error loading task settings", e.getTargetException());
        @Nullable PrintStream logStream,
            settings, task, listener, log, logStream, dataPipes, totalJobs);
                    group.cancel();
        DatabaseTransferConsumer databaseTransferConsumer = (DatabaseTransferConsumer) consumer;

            runnableContext.run(true, true, taskExecutor);
    @Override
public class DTTaskHandlerTransfer implements DBTTaskHandler, DBTTaskInfoCollector {
                        } catch (DBException e) {
 */
        if (!(consumer instanceof DatabaseTransferConsumer)) {
    private class TaskExecutor implements DBRRunnableWithProgress {
            }
            monitor.beginTask("Performing data transfer in parallel", settings.getDataPipes().size());
 * You may obtain a copy of the License at
        }
            runnableContext.run(true, true, monitor -> {
            }
        } catch (InvocationTargetException e) {
                    }

        runnableContext.run(true, false, monitor -> {
                                // Try to join with monitor checks
                    } catch (DBException e) {
            final JobGroup group;
    @NotNull
        TaskExecutor taskExecutor = new TaskExecutor(
        DBException[] firstDBException = {null};
                    }
        executeWithSettings(runnableContext, task, locale, log, logStream, listener, settings[0]);
                    }
                group = null;
import org.eclipse.core.runtime.jobs.JobGroup;
                        indexOfLastPipeWithDisabledReferentialIntegrity[0] = i;
                        throw e;

 * Licensed under the Apache License, Version 2.0 (the "License");

                                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                DTMessages.data_transfer_task_handler_unexpected_error_title,
                dbException[0] = e;
                    try {
        return indexOfLastPipeWithDisabledReferentialIntegrity[0];
                dataPipes.get(dataPipes.size() - 1).getConsumer().finishTransfer(monitor, error, task, true);
        }
            listener.taskFinished(task, null, error, settings);
        @NotNull DBRRunnableContext runnableContext,

        if (firstDBException[0] != null) {
            //ignore
        DataTransferSettings.collectTaskInfo(task, information);
                            if (firstDBException[0] == null) {
        @Nullable DBTTask task
    }
                    if (enableReferentialIntegrity(consumer, monitor, false)) {
    }
        @NotNull Log log,
                }
        try {
            }

        @NotNull Locale locale,
        DatabaseConsumerSettings settings = databaseTransferConsumer.getSettings();
    public void executeWithSettings(
            this.dataPipes = dataPipes;
import java.util.List;
 * limitations under the License.
    public void collectTaskInfo(@NotNull DBTTask task, @NotNull TaskInformation information) {
import org.jkiss.dbeaver.model.exec.DBCStatistics;
            throw new DBException("Unable to restore referential integrity properly", firstDBException[0]);
            monitor.beginTask("Initialize pipes", dataPipes.size());

        } catch (InterruptedException | OperationCanceledException e) {
import org.jkiss.code.NotNull;
                    final IStatus result = job.getResult();
                    DataTransferPipe pipe = dataPipes.get(i);
            });
            }
                                break;
        }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                    monitor.beginTask("Post transfer work", pipes.size());
                monitor.done();
import java.util.Locale;
            //ignore
            try {

            } finally {
        List<DataTransferPipe> dataPipes = settings.getDataPipes();
                    true);
                                }
        if (settings.isDisableReferentialIntegrity() && databaseTransferConsumer.supportsChangingReferentialIntegrity(monitor)) {
            try {
import org.jkiss.dbeaver.model.runtime.ProxyProgressMonitor;
            for (int i = 0; i < totalJobs; i++) {
                Object consumerRuntimeParameters = settings.getNodeSettings(settings.getConsumer()).prepareRuntimeParameters();
        @NotNull DBRRunnableContext runnableContext,
            this.logStream = logStream;
                    }
                }
        @NotNull DBRRunnableContext runnableContext,
                            enableReferentialIntegrity(pipe.getConsumer(), monitor, true);
                }
        } catch (InvocationTargetException e) {
        return false;
                e.getCause()

        private final DBTTaskExecutionListener listener;
        @NotNull Locale locale,
        int indexOfLastPipeWithDisabledReferentialIntegrity = -1;
            );
        @NotNull Locale locale,
            throw dbException[0];
    }
 * DBeaver - Universal Database Manager
                    }
                    if (monitor.isCanceled()) {
            DataTransferSettings settings,
        ) {
        }
}
                DTMessages.data_transfer_task_handler_resoring_referential_integrity_unexpected_error_title,
            int totalJobs
                    // Cancel all nested jobs
        DBTTask task,
import org.jkiss.dbeaver.DBException;
        return taskExecutor.error;
        }
            Throwable error = taskExecutor.error;
import org.jkiss.dbeaver.model.task.*;
        @NotNull DBTTaskExecutionListener listener,
                        try {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;

                        } else {
    ) throws DBException {
        DataTransferSettings[] settings = new DataTransferSettings[1];
    ) throws InvocationTargetException, InterruptedException, DBException {
                        monitor.worked(1);
                        if (error == null) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        final List<DataTransferPipe> dataPipes = settings.getDataPipes();
            return true;
        @Nullable DBTTask task,
                        try {
                    IDataTransferConsumer<?, ?> consumer = pipe.getConsumer();
        } catch (InterruptedException | OperationCanceledException e) {
                try {
                error = e.getTargetException();
                monitor.beginTask("Finalizing data transfer", 1);
                error.addSuppressed(e.getTargetException());
                monitor.done();
    }
                        }
        } catch (InterruptedException | OperationCanceledException e) {
                    log,
        }
                monitor.done();
        try {
    }
                            error.addSuppressed(result.getException());
        @NotNull IDataTransferConsumer<?, ?> consumer,
import java.io.PrintStream;
            DBWorkbench.getPlatformUI().showError(
    private final DBCStatistics totalStatistics = new DBCStatistics();
            DBTTask task,
        private final DataTransferSettings settings;
    ) throws DBException {

                            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (InterruptedException | OperationCanceledException e) {
        private final int totalJobs;
            indexOfLastPipeWithDisabledReferentialIntegrity = initializePipes(runnableContext, settings, task);
                            log.debug("enabling referential integrity unexpectedly failed", e);
                        }
    ) {
        private final List<DataTransferPipe> dataPipes;
        } catch (InvocationTargetException e) {
            );
                // End of transfer - signal last pipe about it
            } else {
                job.schedule();
        @NotNull DBRRunnableContext runnableContext,
                    monitor.subTask("Canceling ");
package org.jkiss.dbeaver.tools.transfer.task;
            } finally {
            DBTTaskExecutionListener listener,
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
 */
                if (monitor.isCanceled()) {
    }
                            while (true) {
        private final PrintStream logStream;
    private static final Log log = Log.getLog(DTTaskHandlerTransfer.class);
        boolean enable
                            break;
    private static boolean enableReferentialIntegrity(
        @NotNull DataTransferSettings settings,
        public TaskExecutor(
            log.debug("Data transfer was interrupted", e);
            restoreReferentialIntegrity(
        int[] indexOfLastPipeWithDisabledReferentialIntegrity = new int[]{-1};
        }
            runnableContext.run(true, false, monitor -> {
/*
        });
                    consumer.setRuntimeParameters(consumerRuntimeParameters);
                                firstDBException[0] = e;
                        consumer.finishTransfer(monitor, e, task, true);
                        job.cancel();
import org.eclipse.core.runtime.IStatus;
 * See the License for the specific language governing permissions and

                for (int i = 0; i < dataPipes.size(); i++) {
        final int totalJobs = Math.min(dataPipes.size(), settings.getMaxJobCount());
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (totalJobs > 1) {
        @NotNull DataTransferSettings settings
                    for (DataTransferPipe pipe: pipes) {
        @NotNull DBTTask task,
                    for (DataTransferJob job : jobs) {
        @NotNull DBTTaskExecutionListener listener,
import org.eclipse.core.runtime.OperationCanceledException;
                        break;
                settings[0] = new DataTransferSettings(
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
                }
        @NotNull DBTTaskExecutionListener listener) throws DBException
                } finally {

import java.lang.reflect.InvocationTargetException;
    }

import org.jkiss.code.Nullable;
            }
                job.setJobGroup(group);
                    totalStatistics.accumulate(job.getTotalStatistics());
                DTMessages.data_transfer_task_handler_resoring_referential_integrity_unexpected_error_message,
        }
            return error;
            databaseTransferConsumer.enableReferentialIntegrity(monitor, enable);
                jobs[i] = job;
        @NotNull PrintStream logStream,
                    group.join(0, new ProxyProgressMonitor(monitor));
                    monitor,

                    }
                                        break;
            } catch (DBException e) {
    @Nullable
                    if (group == null) {
                group = new JobGroup("Data transfer", totalJobs, totalJobs);
                settings.getDataPipes().subList(0, indexOfLastPipeWithDisabledReferentialIntegrity + 1)

            Throwable error = runDataTransferJobs(runnableContext, task, locale, log, logStream, listener, settings);
        private final DBTTask task;
            throw new DBException("Error starting data transfer", e);
                    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        public void run(DBRProgressMonitor monitor) {

 * Unless required by applicable law or agreed to in writing, software
 *
        } catch (InvocationTargetException e) {
            List<DataTransferPipe> dataPipes,
                        }
        private Throwable error;
                DTMessages.data_transfer_task_handler_unexpected_error_message,
        return DBTTaskRunStatus.makeStatisticsStatus(totalStatistics);
                    Collections.emptyMap(),
            this.listener = listener;
    @Override
                settings[0].loadNodeSettings(monitor);
            return null;
import java.util.Collections;
                            error = result.getException();
 *

            this.settings = settings;
            PrintStream logStream,
            if (group != null) {
            return new DBTTaskRunStatus();
        }
                        consumer.startTransfer(monitor);
                try {
        private final Log log;
        listener.taskStarted(task);
            } else {
        if (dbException[0] != null) {
            if (error == null) {
            });
            this.totalJobs = totalJobs;
    private void restoreReferentialIntegrity(@NotNull DBRRunnableContext runnableContext,
                } catch (InterruptedException | OperationCanceledException e) {
/**
        }
                                    continue;
        @NotNull Log log,
        }
        DataTransferSettings settings
    {
        } finally {
                    new DataTransferState(),
                                if (!job.join(1000, monitor.getNestedMonitor())) {
    }

        @Nullable PrintStream logStream,
            return false;
            }
import org.jkiss.dbeaver.tools.transfer.*;
        @NotNull Log log,
                e.getCause()
            Log log,
                    monitor.done();
                    if (result.getException() != null) {

            );
 *
