
    private static final Log log = Log.getLog(DefaultProgressMonitor.class);
    public IProgressMonitor getNestedMonitor() {
    @Override
    @Override
    @Override
        if (blocks == null) {
        @Override

        }
    }

        }
        nestedMonitor.done();
import org.jkiss.code.NotNull;
            return taskName + (subTask == null ? "" : " (" + subTask + ")");

                nestedMonitor.subTask(lastState.subTask);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        } else {
    private final IProgressMonitor nestedMonitor;
    public synchronized List<DBRBlockingObject> getActiveBlocks() {
    @Override
        } else {
        //}


    public synchronized void endBlock() {
    public synchronized void startBlock(@NotNull DBRBlockingObject object, @Nullable String taskName) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.eclipse.core.runtime.IProgressMonitor;
    }
    private final List<ProgressState> states = new ArrayList<>();
 *

        states.add(state);
 *
import org.jkiss.dbeaver.model.exec.DBCException;
 */
    private static class ProgressState {
/*

    public void done() {
            }
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    }
            ProgressState lastState = states.removeLast();
        if (taskName != null) {
 * DBeaver - Universal Database Manager
    public void beginTask(@NotNull String name, int totalWork) {
        if (states.isEmpty()) {
    @Override
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            states.getLast().progress += work;
public class DefaultProgressMonitor implements DBRProgressMonitor {
 */
    public void worked(int work) {

        //    this.done();

        String subTask;
}
        return blocks == null || blocks.isEmpty() ? null : new ArrayList<>(blocks);
            log.warn("End block invoked while no blocking objects are in stack"); //$NON-NLS-1$
    }

    public boolean isCanceled() {
        nestedMonitor.beginTask(name, totalWork);
    @Override
        ProgressState state = new ProgressState(name, totalWork);
        return nestedMonitor;
        blocks.removeLast();
            log.trace(new DBCException("Progress ended without start"));
        } else {
 * You may obtain a copy of the License at

        int progress;
        nestedMonitor.subTask(name);

        final String taskName;
 * limitations under the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        public String toString() {
        return nestedMonitor.isCanceled() ||
import org.jkiss.dbeaver.Log;
            states.getLast().subTask = name;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        // Restore previous state
    }
    public void subTask(@NotNull String name) {
package org.jkiss.dbeaver.model.runtime;
import org.jkiss.code.Nullable;
        }
 * See the License for the specific language governing permissions and
    @Override

            subTask(taskName);
            log.trace(new DBCException("Progress info without start"));
                nestedMonitor.worked(lastState.progress);

            DBWorkbench.getPlatform().isShuttingDown(); // All monitors are canceled if workbench is shutting down

            log.trace(new DBCException("Progress sub task without start"));
            this.taskName = taskName;
 * you may not use this file except in compliance with the License.

        blocks.add(object);
        this.nestedMonitor = nestedMonitor;
            nestedMonitor.beginTask(lastState.taskName, lastState.totalWork);
            }
    public DefaultProgressMonitor(@NotNull IProgressMonitor nestedMonitor) {
        ProgressState(String taskName, int totalWork) {
 *
            return;

        //if (blocks.size() == 1) {
        if (!states.isEmpty()) {
import java.util.List;
        if (blocks == null || blocks.isEmpty()) {

 * Progress monitor default implementation
    }
        if (states.isEmpty()) {

            if (lastState.progress > 0) {
    @Override
    @Override
            this.totalWork = totalWork;
    }
        nestedMonitor.worked(work);
    @NotNull
import java.util.ArrayList;
    }
    }
/**
            if (lastState.subTask != null) {
            blocks = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
        }
    private List<DBRBlockingObject> blocks = null;
    }
        final int totalWork;
