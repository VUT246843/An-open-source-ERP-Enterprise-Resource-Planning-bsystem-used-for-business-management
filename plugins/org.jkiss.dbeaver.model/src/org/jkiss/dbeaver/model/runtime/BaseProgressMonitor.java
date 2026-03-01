    }
    private static final IProgressMonitor NESTED_INSTANCE = new NullProgressMonitor();
public abstract class BaseProgressMonitor implements DBRProgressMonitor {
import org.eclipse.core.runtime.NullProgressMonitor;
    @Nullable

 * Copyright (C) 2010-2025 DBeaver Corp and others

    }
import org.jkiss.code.NotNull;
    }
    protected BaseProgressMonitor() {
        // no-op
        return null;
/*
    public List<DBRBlockingObject> getActiveBlocks() {
    @Override


package org.jkiss.dbeaver.model.runtime;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override

    }


 *
    public boolean isCanceled() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        // do nothing
    @Override
/**
 * Progress monitor null implementation
 * You may obtain a copy of the License at
    @Override

    @Override
import org.jkiss.code.Nullable;
    }
 *
        return DBWorkbench.getPlatform().isShuttingDown();
        // do nothing
    public void beginTask(@NotNull String name, int totalWork) {

import org.jkiss.dbeaver.runtime.DBWorkbench;

    public void endBlock() {
 * you may not use this file except in compliance with the License.
    public void worked(int work) {
 *
    }
 * DBeaver - Universal Database Manager
        // no-op
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return NESTED_INSTANCE;

    @Override
import java.util.List;
 */
    @Override

    public void startBlock(@NotNull DBRBlockingObject object, @Nullable String taskName) {
        // no-op
 * See the License for the specific language governing permissions and
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void done() {
    public void subTask(@NotNull String name) {
    public IProgressMonitor getNestedMonitor() {
import org.eclipse.core.runtime.IProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
        // no-op
    @NotNull
    }

}    }
    @Override
    }
    }
