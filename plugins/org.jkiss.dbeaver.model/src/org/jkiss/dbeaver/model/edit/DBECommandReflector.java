 *

 * limitations under the License.
 *
 *
 * Database Object Command reflector.
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
public interface DBECommandReflector<OBJECT_TYPE extends DBPObject, COMMAND extends DBECommand<OBJECT_TYPE>> {
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
/**
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPObject;
 */
 * Updates UI on command undo/redo actions.

    void undoCommand(@NotNull COMMAND command);
 * Licensed under the Apache License, Version 2.0 (the "License");

 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
/*
    void redoCommand(@NotNull COMMAND command);

package org.jkiss.dbeaver.model.edit;
}

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Note: reflector isn't invoked after command creation (because command is created AFTER UI changes).
