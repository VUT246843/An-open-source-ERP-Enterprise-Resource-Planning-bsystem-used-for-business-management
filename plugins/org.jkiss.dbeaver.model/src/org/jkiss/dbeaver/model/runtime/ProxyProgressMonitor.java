    }
        original.endBlock();
    @Override
    // IProgressMonitor
    {
    {

/**
    public void done()
    @Override
 * See the License for the specific language governing permissions and
    public void setTaskName(String name) {


    //////////////////////////////////////////
    }
/*

 *
    public synchronized void endBlock()
 * DBeaver - Universal Database Manager
 *
    }


    }

    public List<DBRBlockingObject> getActiveBlocks()
    @Override
    @Override
    {
 */
 * limitations under the License.
}
        original.beginTask(name, totalWork);
        return original.isCanceled();
    }
    {
    }
 * You may obtain a copy of the License at
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
    }
    public void subTask(@NotNull String name)
    }
        original.done();
    }
    public void beginTask(@NotNull String name, int totalWork)
        return original.getActiveBlocks();
    public void setCanceled(boolean value) {
import org.jkiss.code.NotNull;
    }
    @Override



    @NotNull


    public boolean isCanceled()


        this.original = original;
    }
    }
        return original.getNestedMonitor();
 * Licensed under the Apache License, Version 2.0 (the "License");
public class ProxyProgressMonitor implements DBRProgressMonitor, IProgressMonitor {
    @Override
    @Override
    public IProgressMonitor getNestedMonitor()
 *

 * you may not use this file except in compliance with the License.
    {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.runtime.IProgressMonitor;
package org.jkiss.dbeaver.model.runtime;
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
    {
        original.startBlock(object, taskName);

    {
    {
        original.subTask(name);
 */
    public void internalWorked(double work) {
    public void worked(int work)
    public synchronized void startBlock(@NotNull DBRBlockingObject object, @Nullable String taskName)
        original.worked(work);
 * Progress monitor default implementation

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public ProxyProgressMonitor(DBRProgressMonitor original)

    {
    @Nullable
    @Override
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

    }
    protected DBRProgressMonitor original;

    {
