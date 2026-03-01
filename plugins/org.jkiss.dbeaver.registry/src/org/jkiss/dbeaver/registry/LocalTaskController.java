        } catch (IOException e) {
     *
        var configString = loadTaskConfigurationFile(projectId, filePath);
    @Override
     * @param create will create metadata folder if true
        try (var reader = new StringReader(configString)) {
package org.jkiss.dbeaver.registry;
    }
            } catch (IOException e) {
    public void saveTaskConfigurationFile(
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        }
import com.google.gson.Gson;
        .create();
        }
import java.io.StringReader;
        .serializeNulls()
            throw new DBException("Error reading task configuration file '" + filePath + "'", e);
            try {
 * Unless required by applicable law or agreed to in writing, software
 */
            Map<String, Object> jsonMap = JSONUtils.parseMap(gson, reader);
            ContentUtils.makeFileBackup(localPath);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
        Path parent = DBWorkbench.getPlatform().getWorkspace().getProject(projectId).getMetadataFolder(create);
            throw new DBException("Error saving task configuration file '" + filePath + "'");
        .setStrictness(Strictness.LENIENT)
        Path localPath = getMetadataFolder(projectId, true).resolve(filePath);
        throws DBException {
     * Return path to metadata folder with tasks file inside

        } catch (IOException e) {
    /**
        @Nullable String data
        Path localPath = getMetadataFolder(projectId, false).resolve(filePath);
            try {
    }
    public Path getMetadataFolder(@NotNull String projectId, boolean create) throws DBException {
import com.google.gson.GsonBuilder;

                throw new DBException("Error creating metadata folder", e);
        createFolder(create, parent);
    public LocalTaskController() {
        @NotNull String filePath,
 *
 * you may not use this file except in compliance with the License.
        if (create && Files.notExists(metadataFolder)) {

    @Override
        }
 * DBeaver - Universal Database Manager
/*

            } catch (IOException e) {
import org.jkiss.dbeaver.DBException;
    ) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
                Files.createDirectories(metadataFolder);
 * See the License for the specific language governing permissions and
        try {
                throw new DBException("Error deleting task configuration file '" + filePath + "'", e);
            return;
     * @param projectId unique project name
        }
        if (configString == null) {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
     * @return path to metadata folder
            }
                Files.delete(localPath);
            return null;
        }
import org.jkiss.dbeaver.model.task.DBTTaskController;
    @Override
            var taskData = jsonMap.get(taskId);
import com.google.gson.Strictness;
}
    }
import org.jkiss.dbeaver.utils.ContentUtils;

import org.jkiss.code.Nullable;
        @NotNull String projectId,
        if (Files.notExists(localPath)) {

        }
     */

    protected void createFolder(boolean create, Path metadataFolder) throws DBException {
    private static final Gson gson = new GsonBuilder()
import java.util.Map;

import java.nio.file.Path;
            return Files.readString(localPath, StandardCharsets.UTF_8);
    }
 *
        try {
    }
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            throw new DBException("Error writing task configuration file '" + filePath + "'", e);
        if (data == null) {
    @NotNull
            return taskData == null ? null : gson.toJson(Map.of(taskId, taskData));
        .setPrettyPrinting()
import java.io.IOException;
        }
        return parent;
    }
    public String loadTaskConfigurationFile(@NotNull String projectId, @NotNull String filePath) throws DBException {

 * limitations under the License.
            return null;
    public String loadTaskConfiguration(@NotNull String projectId, @NotNull String taskId, @NotNull String filePath)
            Files.writeString(localPath, data, StandardCharsets.UTF_8);
import java.nio.charset.StandardCharsets;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
 *
     * @throws DBException on case of folder creation exception
public class LocalTaskController implements DBTTaskController {
        if (Files.exists(localPath)) {
        if (data == null && Files.exists(localPath)) {
import java.nio.file.Files;
