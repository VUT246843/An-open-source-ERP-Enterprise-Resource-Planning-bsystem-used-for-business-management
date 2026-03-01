    }
    }
    private static volatile Runnable nextJob;
            runCount++;
            runCount--;
            nextJob = execQueue.removeFirst();
            runCount++;
 * Copyright (C) 2010-2026 DBeaver Corp and others

}                // some Eclipse job is active in UI thread then retry later
        synchronized (execQueue) {
                runCount--;
            }
 * you may not use this file except in compliance with the License.

import java.util.List;
 *
/**
            boolean workbenchStarted = DBWorkbench.getPlatform() instanceof DBPPlatformDesktop pd && pd.isWorkbenchStarted();


 * distributed under the License is distributed on an "AS IS" BASIS,
    private static void executeInUI() {
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    UIUtils.asyncExec(UIExecutionQueue::executeInUI);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
                }
        synchronized (execQueue) {
 * limitations under the License.
            synchronized (execQueue) {
 *
    private static final List<Runnable> execQueue = new ArrayList<>();

            execQueue.add(runnable);
        }
                throw new IllegalStateException("Queue is unblocked");
 * It is needed to avoid simultaneous UI jobs start (e.g. in case when one job opens a dialog and other jobs will run in this dialog idle exec)
                if (!DBWorkbench.getPlatform().isShuttingDown()) {
        } finally {
 *
        synchronized (execQueue) {

        UIUtils.asyncExec(UIExecutionQueue::executeInUI);
            }
 * Next job can be run only after previous job is finished.
    public static void unblockQueue() {
        }
            if (runCount > 0 || !workbenchStarted) {
package org.jkiss.dbeaver.ui;

 */
    public static void queueExec(@NotNull Runnable runnable) {
                return;
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            if (runCount <= 0) {
                nextJob = null;
                // If workbench wasn't fully started or
        synchronized (execQueue) {
    }
    private static int runCount = 0;
        }
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.ArrayList;
/*
            }
    public static void blockQueue() {
import org.jkiss.code.NotNull;
    }
        UIUtils.asyncExec(UIExecutionQueue::executeInUI);
 * DBeaver - Universal Database Manager
        }

            nextJob.run();
public class UIExecutionQueue {
            if (execQueue.isEmpty()) {
        }
 * Similar to simple Display.asyncExec but puts all jobs in queue.
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
                // job is running or
            }
