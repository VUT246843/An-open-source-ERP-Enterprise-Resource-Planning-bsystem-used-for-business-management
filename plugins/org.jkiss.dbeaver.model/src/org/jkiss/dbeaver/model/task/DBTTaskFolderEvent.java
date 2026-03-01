 * limitations under the License.
package org.jkiss.dbeaver.model.task;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public enum Action
    }
    }
    }
        this.action = action;

    private DBTTaskFolder taskFolder;
    public String toString() {
    {
    private Action action;
        return action;
    {
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        TASK_FOLDER_UPDATE,
 *
    public Action getAction()
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBTTaskFolder getTaskFolder() {
    }
public class DBTTaskFolderEvent {

        return action + " " + taskFolder;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
        return taskFolder;
        TASK_FOLDER_REMOVE
 */


    public DBTTaskFolderEvent(DBTTaskFolder taskFolder, Action action) {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        this.taskFolder = taskFolder;
 *
}
        TASK_FOLDER_ADD,
