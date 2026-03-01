    private boolean transferData(DBRProgressMonitor monitor, DataTransferPipe transferPipe) throws Exception {
 * See the License for the specific language governing permissions and
        elapsedTime = System.currentTimeMillis() - startTime;
        final int pipeCount = settings.getDataPipes().size();
    @Override

                    Log.setLogWriter(logStream);
                Log.setLogWriter(null);
    private final DBRProgressMonitor parentMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                IDataTransferConsumer<?, ?> consumer = transferPipe.getConsumer();
            consumer.finishTransfer(monitor, e, task, false);
    public boolean isHasErrors() {
import org.eclipse.core.runtime.IStatus;
                    parentMonitor.worked(1);
                break;
    private final DBTTask task;
        this.log = log;

        @Nullable DBRProgressMonitor parentMonitor,
 *
        return Status.OK_STATUS;
        monitor.beginTask(
    ) {
                return new Status(IStatus.OK, getClass(), "Data transfer failed", e);
        super("Data transfer job [" + index + "]: " + settings.getConsumer().getName());
            //consumer.initTransfer(producer.getDatabaseObject(), consumerSettings, );
        @NotNull Log log,
        return elapsedTime;
                }

            DataTransferPipe transferPipe = settings.acquireDataPipe(monitor, task);
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
import org.jkiss.code.NotNull;
        this.task = task;

 */
            totalStatistics.accumulate(producer.getStatistics());
        } finally {
        return totalStatistics;
}
    private final DataTransferSettings settings;
        monitor.beginTask("Perform data transfer", pipeCount);
        return hasErrors;

        try {
            return true;
        monitor.done();
import org.jkiss.dbeaver.model.exec.DBCStatistics;
        return settings;
        IDataTransferConsumer consumer = transferPipe.getConsumer();
                CommonUtils.truncateString(outputName, 200)), 1);
        @NotNull DBTTask task,

    }

        final DBRProgressMonitor monitor = parentMonitor != null ? parentMonitor : jobMonitor;
    protected IStatus run(@NotNull DBRProgressMonitor jobMonitor) {
 */
                }
                // Report as an OK status to avoid showing the error in the UI (it's handled by the caller)
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

package org.jkiss.dbeaver.tools.transfer;
        }
        @Nullable PrintStream logStream,
/**
                if (logStream != null) {
        for (; ;) {
        hasErrors = false;
            NLS.bind(DTMessages.data_transfer_wizard_job_container_name,
    }
 *
            if (monitor.isCanceled()) {
 * DBeaver - Universal Database Manager
                hasErrors |= !transferResult;
            if (transferPipe == null) {
        this.logStream = logStream;
                boolean transferResult = transferData(monitor, transferPipe);

        IDataTransferProducer producer = transferPipe.getProducer();
            try {

    private final PrintStream logStream;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.osgi.util.NLS;
                break;
    @NotNull
        @NotNull DataTransferSettings settings,
import org.jkiss.utils.CommonUtils;
    public DBCStatistics getTotalStatistics() {
            totalStatistics.accumulate(consumer.getStatistics());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DataTransferJob(
        long startTime = System.currentTimeMillis();
 * You may obtain a copy of the License at
import java.io.PrintStream;
 * Data transfer job
    }
    private boolean hasErrors;

    private long elapsedTime;
 * limitations under the License.
    }
        int index
    }
    private final Log log;
        String inputName = producer.getObjectFullName(monitor);
            monitor.done();
            producer.transferData(monitor, consumer, processor, nodeSettings, task);
        String outputName = consumer.getObjectFullName(monitor);
        this.settings = settings;
 * Unless required by applicable law or agreed to in writing, software
            }
/*
import org.jkiss.code.Nullable;
public class DataTransferJob extends AbstractJob {
        IDataTransferSettings nodeSettings = settings.getNodeSettings(settings.getProducer());


            consumer.finishTransfer(monitor, false);
                if (parentMonitor != null) {
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
            log.error("Error transferring data from " + inputName + " to " + outputName, e);
 *
        }

 * Copyright (C) 2010-2025 DBeaver Corp and others
            throw e;
                CommonUtils.truncateString(inputName, 200),
                jobMonitor.worked(1);
        } catch (Exception e) {
            }
            } catch (Exception e) {
        this.parentMonitor = parentMonitor;
    private final DBCStatistics totalStatistics = new DBCStatistics();

            IDataTransferProcessor processor = settings.getProcessor() == null ? null : settings.getProcessor().getInstance();
    public DataTransferSettings getSettings() {


import org.eclipse.core.runtime.Status;
    public long getElapsedTime() {
import org.jkiss.dbeaver.model.task.DBTTask;

import org.jkiss.dbeaver.Log;
