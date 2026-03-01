    void importFiles(@NotNull List<Path> filePath, @NotNull String processorType) throws DBException;
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
 *
     *
 * you may not use this file except in compliance with the License.
     * Imports the specified files into the system using the provided processor type.
 * limitations under the License.
     */
     *                 The list must not be null and should contain valid file paths.
     * This method processes a list of file paths and uses the given processor type
     * to handle the import operation.
 * Interface for handling the import of files into a database or other target systems.
package org.jkiss.dbeaver.model.file;
 * Unless required by applicable law or agreed to in writing, software
import java.nio.file.Path;
/**
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
     * @param filePath A list of {@code Path} objects representing the file paths to be imported.
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface FileImportHandler {

     * @param processorType A {@code String} specifying the type of processor to be used
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
     *                      for handling the import. The string must not be null.
 */

 * Licensed under the Apache License, Version 2.0 (the "License");

    /**
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Implementations of this interface are responsible for processing a list of file paths
