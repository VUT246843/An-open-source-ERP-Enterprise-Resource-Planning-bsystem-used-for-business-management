import org.jkiss.code.Nullable;
    /**

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
 * Allows opening native execution wizards
     * Opens the wizard for the database
import org.jkiss.code.NotNull;
 */
     *
 * See the License for the specific language governing permissions and
 *

 *

/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @param <CONTAINER> container to read settings from
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.actions.exec;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * DBeaver - Universal Database Manager
     * @param container container to read settings from
     */
public interface SQLScriptExecutor<CONTAINER extends DBSObject> {
     * @throws DBException if failed to open the wizard
import org.jkiss.dbeaver.model.struct.DBSObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.nio.file.Path;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
     * @param file SQL file
 */
 * you may not use this file except in compliance with the License.
 *
/*
}
 * limitations under the License.
    void execute(@NotNull CONTAINER container, @Nullable Path file) throws DBException;
 * Unless required by applicable law or agreed to in writing, software
