        } catch (IOException e) {
    public byte[] loadFileData(@NotNull String fileType, @NotNull String filePath) throws DBException {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (IOException e) {
    }

import org.jkiss.code.NotNull;
 *
    }
import java.nio.file.Path;
 * DBeaver - Universal Database Manager
        Path targetPath = getTargetPath(fileType, filePath);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
package org.jkiss.dbeaver.registry;
        throw new DBCFeatureNotSupportedException();
    @NotNull
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBFileController;
            throw new DBException("Error writing file '" + targetPath.toAbsolutePath() + "' data: " + e.getMessage(), e);
        try {

 * Unless required by applicable law or agreed to in writing, software
    public String[] listFiles(@NotNull String fileType, @NotNull String filePath) throws DBException {

 *     http://www.apache.org/licenses/LICENSE-2.0
        Path targetPath = getTargetPath(fileType, filePath);
        this.dataFolder = dataFolder;
    @Override
        return getBytes(targetPath);
    @NotNull
/*
        try {
        }
        Path targetPath = getTargetPath(fileType, filePath);
        } catch (IOException e) {
    @Override
    }
import org.jkiss.dbeaver.DBException;

        }
    }
 */
 * limitations under the License.

            Files.delete(targetPath);
                Files.createDirectories(targetPath.getParent());
            }
            if (!Files.exists(targetPath.getParent())) {
    protected final Path dataFolder;
    public void saveFileData(@NotNull String fileType, @NotNull String filePath, byte[] fileData) throws DBException {

        try {

    }
            Files.write(targetPath, fileData);
        }
}
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
    public void deleteFile(@NotNull String fileType, @NotNull String filePath, boolean recursive) throws DBException {
    protected Path getTargetPath(@NotNull String fileType, @NotNull String filePath) throws DBException {
import java.nio.file.Files;
 *
    protected byte[] getBytes(Path targetPath) throws DBException {
            return Files.readAllBytes(targetPath);

 *
 * you may not use this file except in compliance with the License.
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import java.io.IOException;
            throw new DBException("Error reading file '" + targetPath.toAbsolutePath() + "' data", e);
            throw new DBException("Error deleting file '" + targetPath.toAbsolutePath() + "' data: " + e.getMessage(), e);
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class LocalFileController implements DBFileController {

        return dataFolder.resolve(fileType).resolve(filePath);
    public LocalFileController(Path dataFolder) {

