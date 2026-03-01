
 */
 */

    byte[] loadFileData(@NotNull String fileType, @NotNull String filePath) throws DBException;
 *

 *
 * you may not use this file except in compliance with the License.
 *
    String DATA_FOLDER = "data";
    void saveFileData(@NotNull String fileType, @NotNull String filePath, byte[] fileData) throws DBException;
 * limitations under the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Binary files controller.
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * - 'database-driver' is for driver jar files

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

/*
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.model;

public interface DBFileController extends DBPObjectController {
}
 * There are different file types.
    void deleteFile(@NotNull String fileType, @NotNull String filePath, boolean recursive) throws DBException;
    String TYPE_DATABASE_DRIVER = "libraries";
 *
 * You may obtain a copy of the License at
    String[] listFiles(@NotNull String fileType, @NotNull String filePath) throws DBException;
import org.jkiss.dbeaver.DBException;
