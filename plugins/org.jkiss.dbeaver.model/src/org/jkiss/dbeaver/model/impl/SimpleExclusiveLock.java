            synchronized (this) {

 */
        Thread curThread = Thread.currentThread();
                }

                lock.lockThread = null;
        Lock lock;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * DBeaver - Universal Database Manager
    }
/**
 * See the License for the specific language governing permissions and
        releaseTaskLock(TASK_GLOBAL, lock);
            }
 *
            if (lock == null) {

 * Unless required by applicable law or agreed to in writing, software
            }
                    lock.lockThread = curThread;
        }

import java.util.HashMap;
        synchronized (this) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        synchronized (this) {
            }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    private final Map<String, Lock> locks = new HashMap<>();
import org.jkiss.code.NotNull;
            } else if (lock.lockCount < 0) {
                    return curThread;
                locks.put(taskName, lock);
                throw new IllegalStateException("Internal error: negative lock count. Restart application.");
 * You may obtain a copy of the License at

            if (!DBWorkbench.getPlatformUI().readAndDispatchEvents()) {
    @NotNull
    private static class Lock {
        }
    @Override

package org.jkiss.dbeaver.model.impl;
            if (lock.lockThread != lockObj) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
public class SimpleExclusiveLock implements DBPExclusiveResource {
 * limitations under the License.
    public Object acquireExclusiveLock() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public Object acquireTaskLock(@NotNull String taskName, boolean checkDup) {
                throw new IllegalArgumentException("Wrong exclusive lock passed");
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

    public void releaseExclusiveLock(@NotNull Object lock) {
                RuntimeUtils.pause(50);
            if (lock == null) {
 * you may not use this file except in compliance with the License.
import java.util.Map;
            taskRunning = true;
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;

            }
        boolean taskRunning = false;
        return acquireTaskLock(TASK_GLOBAL, false);
    public void releaseTaskLock(@NotNull String taskName, @NotNull Object lockObj) {
                    lock.lockCount++;
    @Override
 * Simple exclusive lock
            if (lock.lockCount == 0) {
        private volatile Thread lockThread;
    @Override
        for (;;) {
    }
/*
import org.jkiss.dbeaver.model.DBPExclusiveResource;
                        return TASK_PROCESED;

                    if (checkDup && taskRunning) {
 *
        }
        private int lockCount = 0;

            Lock lock = locks.get(taskName);
            }
            // Wait for a while
            lock.lockCount--;
}
    private static final String TASK_GLOBAL = "#global";

                if (lock.lockThread == curThread || lock.lockThread == null) {
                throw new IllegalArgumentException("Wrong task name: " + taskName);
            lock = locks.get(taskName);
                lock = new Lock();
    @Override

                    }
