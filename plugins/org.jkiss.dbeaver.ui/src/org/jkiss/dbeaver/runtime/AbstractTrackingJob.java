/*
                RuntimeUtils.pause(50);
 * limitations under the License.
        setUser(false);
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            job.schedule();
        if (ownerMonitor != null) {
            }

 * Unless required by applicable law or agreed to in writing, software
    protected AbstractTrackingJob(String name) {
    }
    public static void executeInProgressMonitor(AbstractTrackingJob job) throws InvocationTargetException {
public abstract class AbstractTrackingJob extends AbstractJob {
        }
package org.jkiss.dbeaver.runtime;
 * You may obtain a copy of the License at
    public Throwable getConnectError() {
    private DBRProgressMonitor ownerMonitor;
    }

            while (job.getState() == Job.WAITING || job.getState() == Job.RUNNING) {


import org.jkiss.code.Nullable;
        UIUtils.runInProgressDialog(monitor -> {
    protected abstract void execute(@NotNull DBRProgressMonitor monitor) throws Throwable;
                }
import java.lang.reflect.InvocationTargetException;
                    throw new InvocationTargetException(null);
                    job.cancel();
        }

            if (job.getConnectError() != null) {
import org.eclipse.core.runtime.Status;
 * you may not use this file except in compliance with the License.
        return connectError;
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.jobs.Job;
        });
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (Throwable e) {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 *
            connectError = e;


                throw new InvocationTargetException(job.getConnectError());
 * Copyright (C) 2010-2025 DBeaver Corp and others

                if (monitor.isCanceled()) {
import org.jkiss.dbeaver.ui.UIUtils;
        this.ownerMonitor = ownerMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,


    public void setOwnerMonitor(@Nullable DBRProgressMonitor ownerMonitor) {

        setSystem(true);
    @Override
        return Status.OK_STATUS;

 *
    }
            job.setOwnerMonitor(monitor);
import org.jkiss.code.NotNull;
            execute(monitor);
    @Nullable
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
        super(name);
    @NotNull

 */
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
    protected Throwable connectError;
        try {
import org.eclipse.core.runtime.IStatus;
 *     http://www.apache.org/licenses/LICENSE-2.0
            monitor = ownerMonitor;
