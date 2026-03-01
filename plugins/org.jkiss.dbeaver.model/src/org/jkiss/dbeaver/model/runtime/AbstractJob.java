    }
            finished = true;
import org.jkiss.utils.CommonUtils;
    protected void setSkipErrorOnCanceling(boolean skipErrorOnCanceling) {
import org.eclipse.core.runtime.IProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCSession;
            RuntimeUtils.setThreadName(getName());
    protected final static ThreadLocal<AbstractJob> CURRENT_JOB = new ThreadLocal<>();

    protected abstract IStatus run(@NotNull DBRProgressMonitor monitor);
    private class JobCanceler extends Job {
            }
                        if (!finished) {
    public boolean isForceCancel() {

    private void runBlockCanceler() {
            this.block = block;
            for (IStatus cStatus : status.getChildren()) {


    private volatile boolean finished = false;
    public final void schedule(@NotNull Duration delay) {
    }
        blockCanceled = false;
            return;
        }
        final List<DBRBlockingObject> activeBlocks = new ArrayList<>(
    public void setAttachedJob(@Nullable AbstractJob attachedJob) {
        }
            }
    // Attached job may be used to "overwrite" current job.
            CommonUtils.safeList(progressMonitor.getActiveBlocks()));
    @NotNull
    public boolean isFinished() {

        try {

    public boolean isCanceled() {
        }

        if (cancelTimestamp == -1) {
            finished = true;

/*
                    log.debug("Block cancel internal error: " + e.getMessage()); //$NON-N LS-1$
    }
                // There are other blocks. If last one can't be canceled then try others
    protected void canceling() {
        }
 * DBeaver - Universal Database Manager
                        }
            // If this happens during shutdown and job manager is not active
        } catch (Exception e) {
            try {
        }
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others

                Job cancelChecker = new Job("Cancel checker block") { //$NON-N LS-1$
                DBPDataSource dataSource = session.getDataSource();
            DBPPreferenceStore preferenceStore;
                    return true;
        }
                                schedule(cancelCheckTimeout);
            finished = false;
 *
        return finished;
 */
    }
    @NotNull
    @Override
            runBlockCanceler();

                blockCanceled = true;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
public abstract class AbstractJob extends Job {
import org.jkiss.dbeaver.model.DBPDataSource;
            finished = false;

            log.error(e);
                            new JobCanceler(nextBlock).schedule();
        if (attachedJob != null) {
 * Abstract job

            }

        final Thread currentThread = Thread.currentThread();
                if (!result.isOK() && result != Status.CANCEL_STATUS) {
                } catch (Throwable e) {
        super(name);
    protected AbstractJob(@NotNull String name)
        private final DBRBlockingObject block;
        if (!isForceCancel() && activeBlocks.size() < 2) {
    }
            return Status.OK_STATUS;
 */
            return true;

    public final IStatus runDirectly(@NotNull DBRProgressMonitor monitor) {
            super("Operation cancel"); //$NON-N LS-1$



    private volatile boolean runDirectly = false;
import org.jkiss.dbeaver.utils.GeneralUtils;
        public JobCanceler(DBRBlockingObject block) {
                    log.debug("Block cancel error", e); //$NON-N LS-1$
 * See the License for the specific language governing permissions and
        }
        CURRENT_JOB.set(this);
        }
    }
        // Run canceling job
            log.debug(e);
 * you may not use this file except in compliance with the License.
                    protected IStatus run(IProgressMonitor monitor) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * You may obtain a copy of the License at
        return cancelTimestamp;
            return result;
import org.eclipse.core.runtime.Status;
        return true;
    {
                    }
            attachedJob.canceling();
 * Licensed under the Apache License, Version 2.0 (the "License");
        runDirectly = true;
}                            if (!activeBlocks.isEmpty()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;


        return cancelTimestamp > 0;
    }
    }
                        setSystem(true);
            }
            return result;
            cancelTimestamp = System.currentTimeMillis();
        final String oldThreadName = currentThread.getName();
    private boolean logErrorStatus(@NotNull IStatus status) {

                        return GeneralUtils.makeExceptionStatus(e);
                } catch (DBException e) {
                    log.error("Error running job '" + getName() + "' execution: " + result.getMessage());
            }
                            DBRBlockingObject nextBlock = activeBlocks.removeLast();
        }
            IStatus result;
                result = this.run(progressMonitor);
    public boolean isRunDirectly() {
        try {
            log.error("Error during job '" + getName() + "' execution", status.getException());
                try {
                        setUser(false);
        return skipErrorOnCanceling;
        @NotNull
        schedule(delay.toMillis());
        }

        this.attachedJob = attachedJob;
        final DBRBlockingObject lastBlock = activeBlocks.removeLast();
            currentThread.setName(oldThreadName);
        progressMonitor = RuntimeUtils.makeMonitor(monitor);
        } catch (Throwable e) {

/**

            setUser(false);
import java.time.Duration;
                        return Status.OK_STATUS;
import java.util.ArrayList;
                cancelChecker.schedule(cancelCheckTimeout);
            IStatus result = this.run(progressMonitor);
    private volatile long cancelTimestamp = -1;
            return;
            return;
    }
        if (status.getException() != null) {
                    }
            return GeneralUtils.makeExceptionStatus(e);
import org.jkiss.dbeaver.utils.RuntimeUtils;
            setSystem(true);

        try {
    private volatile boolean blockCanceled = false;
import org.eclipse.core.runtime.jobs.Job;
            // Nothing to cancel
        this.skipErrorOnCanceling = skipErrorOnCanceling;
            }
            } catch (Throwable e) {

                };
                if (logErrorStatus(cStatus)) {
                    {
    }
        if (!blockCanceled) {
                    }
                result = GeneralUtils.makeExceptionStatus(e);
            CURRENT_JOB.remove();
            int cancelCheckTimeout = preferenceStore.getInt(ModelPreferences.EXECUTE_CANCEL_CHECK_TIMEOUT);
    }


        } finally {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
    public long getCancelTimestamp() {

                    @Override
        blockCanceled = false;
            new JobCanceler(lastBlock).schedule();

    }

            if (!finished) {
    private AbstractJob attachedJob = null;
                preferenceStore = dataSource.getContainer().getPreferenceStore();
        }
                }
        progressMonitor = monitor;
        }
        protected IStatus run(@NotNull IProgressMonitor monitor) {
                    BlockCanceler.cancelBlock(progressMonitor, block);
import org.jkiss.code.NotNull;

    }
        } finally {
        return false;
        return runDirectly;
                            }
                    return Status.CANCEL_STATUS;
import java.util.List;
            if (cancelCheckTimeout > 0) {
import org.jkiss.dbeaver.ModelPreferences;
            if (activeBlocks.getFirst() instanceof DBCSession session) {
    private boolean skipErrorOnCanceling;

import org.jkiss.dbeaver.Log;
    // It happens if some other AbstractJob runs in sync mode
import org.jkiss.dbeaver.DBException;
import org.eclipse.core.runtime.MultiStatus;
        if (!activeBlocks.isEmpty()) {
            } else {
    }
import org.eclipse.core.runtime.IStatus;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final Log log = Log.getLog(AbstractJob.class);
        @Override
        if (activeBlocks.isEmpty()) {
    private boolean isSkipErrorOnCanceling() {
                preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
    protected final IStatus run(@NotNull IProgressMonitor monitor) {
 *

package org.jkiss.dbeaver.model.runtime;
                    if (!isSkipErrorOnCanceling()) {
    private DBRProgressMonitor progressMonitor;
        } else if (status instanceof MultiStatus) {
    }
                }
            if (!logErrorStatus(result)) {
    }
