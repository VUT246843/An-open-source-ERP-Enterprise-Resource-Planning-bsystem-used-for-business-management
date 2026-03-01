            }

            Files.writeString(localPath, data, StandardCharsets.UTF_8);
/*
        try {
    protected final Path configFolder;
        }
            return Files.readString(localPath, StandardCharsets.UTF_8);
        } catch (IOException e) {
                localPath = legacyConfigFolder.resolve(filePath);
            if (!Files.exists(localPath)) {
            if (legacyConfigFolder != null) {

                Files.createDirectories(localFolder);
        }
 *

 * Local configuration controller. Keeps files on hard drive.
            if (Files.exists(localPath)) {
    }
    public void setLegacyConfigFolder(Path legacyConfigFolder) {

 * limitations under the License.
import org.jkiss.dbeaver.model.DBConfigurationController;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
            Path localFolder = localPath.getParent();
/**
 * you may not use this file except in compliance with the License.

        Path localPath = configFolder.resolve(filePath);
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.IOException;
            }
}
        }
            throw new DBException("Invalid configuration path");
                return null;
 *
    public LocalConfigurationController(Path configFolder) {
import org.jkiss.dbeaver.utils.ContentUtils;
 * You may obtain a copy of the License at
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        if (!localPath.normalize().startsWith(configFolder)) {
            }
    }
            if (!Files.exists(localFolder)) {
 * See the License for the specific language governing permissions and
        }
 */
        } catch (IOException e) {
    public void saveConfigurationFile(@NotNull String filePath, @NotNull String data) throws DBException {
        this.configFolder = configFolder;
import org.jkiss.dbeaver.DBException;

import java.nio.charset.StandardCharsets;
 * Copyright (C) 2010-2024 DBeaver Corp and others


package org.jkiss.dbeaver.registry;
    @Override
    public String loadConfigurationFile(@NotNull String filePath) throws DBException {
        }
        this.legacyConfigFolder = legacyConfigFolder;
                ContentUtils.makeFileBackup(localPath);
            // Try to get it from legacy location
 * DBeaver - Universal Database Manager
        if (!Files.exists(localPath)) {
            throw new DBException("Error reading configuration file '" + filePath + "'", e);
            }
        Path localPath = configFolder.resolve(filePath);
            throw new DBException("Invalid configuration path '" + localPath + "'");
        try {
    }
import java.nio.file.Path;
public class LocalConfigurationController implements DBConfigurationController {
    private Path legacyConfigFolder;
            throw new DBException("Error writing configuration file '" + filePath + "'", e);
import org.jkiss.code.NotNull;

        if (!localPath.normalize().startsWith(configFolder)) {
import java.nio.file.Files;
 */
