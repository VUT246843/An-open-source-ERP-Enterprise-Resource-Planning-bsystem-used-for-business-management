public interface DBTTaskFolder extends DBPNamedObject2 {
 */


import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
    DBTTaskFolder getParentFolder();
 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.model.app.DBPProject;

    @Nullable


 *
    void removeTaskFromFolder(DBTTask task);
 * Copyright (C) 2010-2024 DBeaver Corp and others

    DBPProject getProject();
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
    List<DBTTask> getTasks();

 * You may obtain a copy of the License at

 * limitations under the License.
    boolean removeFolderFromFoldersList(@NotNull DBTTaskFolder taskFolder);
import org.jkiss.dbeaver.model.DBPNamedObject2;
package org.jkiss.dbeaver.model.task;
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;
 * See the License for the specific language governing permissions and
    void addFolderToFoldersList(@NotNull DBTTaskFolder taskFolder);

    void addTaskToFolder(@NotNull DBTTask task);
    List<DBTTaskFolder> getNestedTaskFolders();

 * distributed under the License is distributed on an "AS IS" BASIS,
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
