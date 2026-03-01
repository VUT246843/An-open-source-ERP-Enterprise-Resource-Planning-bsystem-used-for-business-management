
import java.util.List;

    private String folderName;

 *
    @Override
    private DBPProject folderProject;
        return folderProject;

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.folderName = folderName;
        nestedFolders.add(taskFolder);
    @NotNull

/*
    public DBTTaskFolder getParentFolder() {

        folderTasks.add(task);

import java.util.ArrayList;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void addTaskToFolder(@NotNull DBTTask task) {

        return nestedFolders;
        return folderTasks;
    }
    @NotNull
import org.jkiss.dbeaver.model.task.DBTTask;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    private List<DBTTaskFolder> nestedFolders = new ArrayList<>();
    }

        return folderName;

    public List<DBTTask> getTasks() {
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
    public DBPProject getProject() {
    TaskFolderImpl(@NotNull String folderName,
        folderTasks.remove(task);
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    public String getName() {
    @Override
    @Override
package org.jkiss.dbeaver.registry.task;
import org.jkiss.dbeaver.model.task.DBTTaskFolder;
    @Override
    @Override
 * See the License for the specific language governing permissions and
    public boolean removeFolderFromFoldersList(@NotNull DBTTaskFolder taskFolder) {
    }
    }

public class TaskFolderImpl implements DBTTaskFolder {
        this.folderProject = folderProject;
 * Unless required by applicable law or agreed to in writing, software
    public List<DBTTaskFolder> getNestedTaskFolders() {
import org.jkiss.dbeaver.model.app.DBPProject;
                   @Nullable List<DBTTask> folderTasks) {
    @Nullable
    private DBTTaskFolder parentFolder;

    @Override
    }
 *
    public void setName(@NotNull String newName) {
    }
        this.folderName = newName;
                   @NotNull DBPProject folderProject,
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

        this.parentFolder = parentFolder;
    }
    @Nullable
 * You may obtain a copy of the License at
    @Override
    @Nullable

        this.folderTasks = folderTasks;
import org.jkiss.code.NotNull;
    private List<DBTTask> folderTasks;
 * you may not use this file except in compliance with the License.
    }
    }
        return parentFolder;

        return nestedFolders.remove(taskFolder);
    public void addFolderToFoldersList(@NotNull DBTTaskFolder taskFolder) {
 */
    public void removeTaskFromFolder(DBTTask task) {
                   @Nullable DBTTaskFolder parentFolder,
