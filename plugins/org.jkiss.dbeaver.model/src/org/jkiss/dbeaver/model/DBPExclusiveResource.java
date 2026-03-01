 * You may obtain a copy of the License at

    Object acquireTaskLock(@NotNull String taskName, boolean checkDup);
    void releaseExclusiveLock(@NotNull Object lock);
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
     * then returns {@link #TASK_PROCESED} as a result.
    void releaseTaskLock(@NotNull String taskName, @NotNull Object lock);
 * It is needed to avoid low-level synchronization (which may lead to deadlocks).
    Object acquireExclusiveLock();
 *
     * Acquires named resource lock. Waits until resource will be available.
    /**

 *     http://www.apache.org/licenses/LICENSE-2.0

    Object TASK_PROCESED = new Object();
/*
     * @param lock lock object obtained in acquireExclusiveLock.
     * Releases exclusive lock. Threads waiting in acquireExclusiveLock now can continue.
    /**
}
package org.jkiss.dbeaver.model;

import org.jkiss.code.NotNull;
     */
     */
     * Works like {@link #acquireExclusiveLock} but if checkDup=true and lock is already acquired (i.e. task is running)

 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

     */


{
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
 * Unless required by applicable law or agreed to in writing, software
 */
     * @return lock object. Caller MUST call this function in pair with releaseExclusiveLock in try/finally block.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
     * Acquires exclusive resource lock. Waits until resource will be available.

 * Exclusive resource is an object which can be used only by a single thread.
    @NotNull
    /**
 *
public interface DBPExclusiveResource
