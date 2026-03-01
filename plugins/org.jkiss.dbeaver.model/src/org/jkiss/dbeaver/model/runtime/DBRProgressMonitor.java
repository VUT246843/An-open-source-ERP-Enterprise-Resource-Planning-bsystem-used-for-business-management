
    @NotNull
    List<DBRBlockingObject> getActiveBlocks();


 * limitations under the License.
 * you may not use this file except in compliance with the License.
/**
 * See the License for the specific language governing permissions and
        return false;
     * Can be used to pass to eclipse API.
    void subTask(@NotNull String name);
 *
    default boolean isForceCacheUsage() {
    void endBlock();
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import java.util.List;

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.runtime;
public interface DBRProgressMonitor {

    boolean isCanceled();
import org.jkiss.code.NotNull;

 *
    /**
     * Obtains eclipse progress monitor.
 * Database progress monitor.
    void worked(int work);



     */
 * DBeaver - Universal Database Manager

 */
 */


    void startBlock(@NotNull DBRBlockingObject object, @Nullable String taskName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.IProgressMonitor;
    void beginTask(@NotNull String name, int totalWork);

    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

import org.jkiss.code.Nullable;
 * Similar to IProgressMonitor but with DBP specific features
}
    IProgressMonitor getNestedMonitor();
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

    void done();
