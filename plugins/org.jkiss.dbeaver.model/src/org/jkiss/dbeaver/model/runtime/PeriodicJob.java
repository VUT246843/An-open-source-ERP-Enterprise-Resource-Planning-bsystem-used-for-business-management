 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * limitations under the License.

    private final Duration period;
        schedule(period);
    @NotNull
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    }
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        }
public abstract class PeriodicJob extends AbstractJob {
    protected abstract void doJob(@NotNull DBRProgressMonitor monitor);
 * See the License for the specific language governing permissions and
        doJob(monitor);
        setSystem(true);

}
    public final void scheduleMonitor() {
        if (platform.isShuttingDown()) {
import org.eclipse.core.runtime.IStatus;
/*
        this.period = period;
import org.jkiss.dbeaver.model.app.DBPPlatform;
    @NotNull
        log.trace(getName() + " job started");
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.platform = platform;

 * You may obtain a copy of the License at

        if (!platform.isShuttingDown()) {

        // If the platform is still running after the job is completed, reschedule the job
            return Status.OK_STATUS;
    private static final Log log = Log.getLog(PeriodicJob.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

        return Status.OK_STATUS;
    }
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.model.runtime;
        setUser(false);
    }
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.core.runtime.Status;

import org.jkiss.code.NotNull;


            scheduleMonitor();
 *
        log.trace(getName() + " job finished");
 *
    public PeriodicJob(@NotNull String name, @NotNull DBPPlatform platform, @NotNull Duration period) {
        super(name);
    protected final DBPPlatform platform;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import java.time.Duration;
