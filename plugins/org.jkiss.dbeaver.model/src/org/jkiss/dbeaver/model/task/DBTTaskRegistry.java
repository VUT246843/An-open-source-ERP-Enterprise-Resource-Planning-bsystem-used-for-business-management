    DBTTaskType[] getAllTaskTypes();
/*
    String EVENT_TASK_EXECUTE = "taskExecuted";
    DBTTaskCategory[] getAllCategories();
    @Nullable
    @NotNull
    @NotNull
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    DBTTaskCategory[] getRootCategories();
    String EVENT_PARAM_TASK = "taskId";
public interface DBTTaskRegistry {
 * Task registry

    String EVENT_PARAM_PROJECT = "project";
 */
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull

/**
 * See the License for the specific language governing permissions and
    DBTTaskType getTaskType(String id);
    void addTaskListener(DBTTaskListener listener);
 * you may not use this file except in compliance with the License.

    DBTSchedulerDescriptor[] getAllSchedulers();
 *
}



import org.jkiss.code.Nullable;

    String EVENT_BEFORE_PROJECT_DELETE = "beforeProjectDelete";
 */

package org.jkiss.dbeaver.model.task;

 *     http://www.apache.org/licenses/LICENSE-2.0
    DBTSchedulerDescriptor getActiveScheduler();

    void removeTaskListener(DBTTaskListener listener);
 * You may obtain a copy of the License at
 *
    @NotNull

 * DBeaver - Universal Database Manager
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
