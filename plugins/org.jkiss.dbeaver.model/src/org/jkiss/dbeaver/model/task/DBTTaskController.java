     * @param filePath  file name + extension

     * @throws DBException returns in case of file loading
    @Nullable
 *
/**
     * workspace + project

     */
    @Nullable
import org.jkiss.dbeaver.model.DBPObjectController;
package org.jkiss.dbeaver.model.task;
     * Or it can be on the remote workspace + project
     * Method to load (read) tasks configuration file (usually tasks.json). Task config can be in the local workspace + project
 *
     * @param projectId to find proper project
    String loadTaskConfigurationFile(@NotNull String projectId, @NotNull String filePath) throws DBException;
import org.jkiss.code.Nullable;
     *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     *
 */
     * Method to load (read) task configuration from file (usually tasks.json). Task config can be in the local
    /**
 * DBeaver - Universal Database Manager
    ) throws DBException;
    void saveTaskConfigurationFile(
 * Helps to work properly with tasks: read and save configuration file in different type of DBeaver applications.
     */
        @NotNull String taskId,
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @return data from task configuration file in the String format or null if task not exist
 * Unless required by applicable law or agreed to in writing, software
     * Method saves task configuration file. After task creation/editing as example
import org.jkiss.dbeaver.DBException;
     */
    String loadTaskConfiguration(
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param projectId to find proper project task config
    /**
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @throws DBException returns in case of file loading
        @Nullable String data) throws DBException;
 * You may obtain a copy of the License at
    /**
     * @param projectId to find proper project

     *
 * See the License for the specific language governing permissions and
     * @param taskId    to find proper task
     * @throws DBException returns in case of file loading/saving

public interface DBTTaskController extends DBPObjectController {
 */
     * @param filePath  file name + extension
     * @param filePath  file name + extension
}
     * @param data      for update. Can be null in case of purpose of delete file

 *
        @NotNull String filePath,
     * @return data from task configuration file in the String format
/*
        @NotNull String projectId,

     * Or it can be on the remote workspace + project
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull String filePath
        @NotNull String projectId,
