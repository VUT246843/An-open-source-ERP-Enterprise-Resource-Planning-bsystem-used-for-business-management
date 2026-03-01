    
 * Job which runs every second and updates necessary dashboards
import org.jkiss.code.NotNull;
        }
            }

import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static final int JOB_DELAY = 1000;
        if (isSchedule.get() && !DBWorkbench.getPlatform().isShuttingDown()) {
package org.jkiss.dbeaver.ui.dashboard.view;
 * You may obtain a copy of the License at
            log.error("Error running dashboard updater", e);
            if (new DashboardUpdater().updateDashboards(monitor)) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Log log = Log.getLog(DashboardUpdateJob.class);
                pauseDashboardUpdate();
        isSchedule.set(false);
        } catch (Exception e) {
 *

}    private final AtomicBoolean isSchedule = new AtomicBoolean(true);
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static DashboardUpdateJob getDefault() {
        super("Dashboard update");
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.Status;
    
    public static void startUpdating() {

 * Copyright (C) 2010-2025 DBeaver Corp and others

            schedule(JOB_DELAY);
import org.jkiss.dbeaver.Log;

 *


 * DBeaver - Universal Database Manager

    }

        return updateJob;
    public void pauseDashboardUpdate() {
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
public class DashboardUpdateJob extends AbstractJob {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    
    
        if (isSchedule.compareAndSet(false, true)) {
        return Status.OK_STATUS;
    private static DashboardUpdateJob updateJob;
    


        updateJob = new DashboardUpdateJob();
    @Override
 *

    }
        updateJob.schedule(JOB_DELAY);
    }
    }
 */
        try {
 */
    public void resumeDashboardUpdate() {
    }
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        }
            schedule(JOB_DELAY);
    @NotNull
import java.util.concurrent.atomic.AtomicBoolean;
/**
import org.eclipse.core.runtime.IStatus;
    private DashboardUpdateJob() {
 * distributed under the License is distributed on an "AS IS" BASIS,
