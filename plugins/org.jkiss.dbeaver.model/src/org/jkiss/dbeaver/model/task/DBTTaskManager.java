    @NotNull

    @Nullable
    @NotNull
    @NotNull
    @NotNull
     * Temporary tasks can be used to execute some task without adding to task manager registry
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
}
     * @param monitor  progress monitor
     */
        @NotNull DBTTaskExecutionListener listener
    @NotNull



 * See the License for the specific language governing permissions and


 */
 * Task manager
    DBTTaskFolder[] getTasksFolders();
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBTTask task,


 * DBeaver - Universal Database Manager
    /**
    @NotNull

    DBTTask createTask(
     * @param task     task to run
    DBTTaskRegistry getRegistry();
public interface DBTTaskManager {
    DBTTask createTemporaryTask(

    /**
     * @return task run status
import org.jkiss.code.Nullable;
    Path getStatisticsFolder();

    @NotNull
    @Nullable

import org.jkiss.dbeaver.DBException;

    DBTTask[] getAllTasks();
    DBTTask getTaskById(@NotNull String id);
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull Map<String, Object> properties) throws DBException;
import java.nio.file.Path;
     * @param listener task execution listener
     * @param listener task execution listener
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;

 * Unless required by applicable law or agreed to in writing, software
    void updateConfiguration();
    @NotNull

     * Runs a task synchronously, blocking the calling thread.
                                   @NotNull String folderName,
     * @see #scheduleTask(DBTTask, DBTTaskExecutionListener)
/**
     * @throws DBException on any error

    @Nullable

     */
        @Nullable String taskFolderName,

 *
    DBPProject getProject();
    Path getStatisticsFolder(@NotNull DBTTask task);
 * You may obtain a copy of the License at
        @NotNull String label);
    DBTTask getTaskByName(@NotNull String name);
    Job scheduleTask(@NotNull DBTTask task, @NotNull DBTTaskExecutionListener listener) throws DBException;

    void updateTaskConfiguration(@NotNull DBTTask task) throws DBException;
     * @throws DBException on any error


    DBTTaskType[] getExistingTaskTypes();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    void removeTaskFolder(@NotNull DBTTaskFolder taskFolder) throws DBException;
     * @see #runTask(DBRProgressMonitor, DBTTask, DBTTaskExecutionListener)
    DBTTask[] getAllTaskByType(DBTTaskType task);
        @NotNull DBTTaskType task,
    void cancelRunningTasks();
    DBTTaskFolder createTaskFolder(@NotNull DBPProject project,
    @NotNull
    boolean hasRunningTasks();
import org.jkiss.dbeaver.model.app.DBPProject;
package org.jkiss.dbeaver.model.task;

    @NotNull
    @NotNull
        @Nullable String description,
    @NotNull
                                   @Nullable DBTTask[] folderTasks) throws DBException;
                                   @Nullable DBTTaskFolder parentFolder,

 *
import org.eclipse.core.runtime.jobs.Job;
        @NotNull DBTTaskType task,
     *
    DBTTaskRunStatus runTask(
 *
    ) throws DBException;
import org.jkiss.code.NotNull;
        @NotNull String label,
    /**

     * @return job that will run the task
     * Schedules a task to be run at some point in the future.

     * @param task     task to run
    void deleteTaskConfiguration(@NotNull DBTTask task) throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
     *
 * you may not use this file except in compliance with the License.
