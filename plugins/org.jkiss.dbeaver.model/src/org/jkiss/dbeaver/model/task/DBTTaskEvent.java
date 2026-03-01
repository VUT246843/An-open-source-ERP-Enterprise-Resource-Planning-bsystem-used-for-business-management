    }
 * limitations under the License.
    public DBTTask getTask() {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

 * You may obtain a copy of the License at
    public enum Action
 * you may not use this file except in compliance with the License.
 * Task event.
        TASK_UPDATE,
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.task = task;
 *

/*
        TASK_ADD,
        TASK_EXECUTE,
    public Action getAction()
    public DBTTaskEvent(@NotNull DBTTask task, @NotNull Action action) {

 * Fired whenever task is create/deleted/updated.
        return action + " " + task;
    private final DBTTask task;

        TASK_ACTIVATE,

 *

 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    }
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return task;
import org.jkiss.code.NotNull;
 * Every task run also triggers UPDATE event.
    @NotNull
 *
 */
        return action;
 */


/**
        this.action = action;

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    public String toString() {
        TASK_REMOVE,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private final Action action;
public class DBTTaskEvent {
 * DBeaver - Universal Database Manager
}
package org.jkiss.dbeaver.model.task;
    }
