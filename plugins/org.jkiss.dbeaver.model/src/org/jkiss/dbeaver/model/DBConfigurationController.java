     * @param filePath relative or absolute file path
 *
import org.jkiss.code.NotNull;
    /**
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
     */
        @NotNull String data) throws DBException;

 * Licensed under the Apache License, Version 2.0 (the "License");
     * Saves config file contents
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param filePath relative or absolute
package org.jkiss.dbeaver.model;
 */
 *
/*
public interface DBConfigurationController extends DBPObjectController {

 * Config files controller.
 * you may not use this file except in compliance with the License.

 */
    void saveConfigurationFile(
/**
        @NotNull String filePath,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
     * Loads config file contents.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    String loadConfigurationFile(@NotNull String filePath) throws DBException;
}
     */

 *

 * limitations under the License.
    /**
