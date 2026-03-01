/**


    void removeCommand(@NotNull DBECommand<?> command);
 * DBeaver - Universal Database Manager
    void addCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector reflector);
 * See the License for the specific language governing permissions and


    DBECommand<?> getUndoCommand();
    @NotNull
import java.util.Map;



 * distributed under the License is distributed on an "AS IS" BASIS,
 * Command context.
    void undoCommand();
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.model.edit;


import org.jkiss.dbeaver.DBException;

 * Unless required by applicable law or agreed to in writing, software
}    void addCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector reflector, boolean execute);
 */
    Collection<DBPObject> getEditedObjects();
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Provides facilities for object edit commands, undo/redo, save/revert
 */
    void redoCommand();

    void updateCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector commandReflector);
    void saveChanges(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException;
 *
    DBECommand<?> getRedoCommand();
    boolean isDirty();
    Collection<? extends DBECommand<?>> getUndoCommands();
import org.jkiss.dbeaver.model.DBPContextProvider;


 * limitations under the License.
 *


    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
    // Do not use transactions in conect save
/*
    void removeCommandListener(@NotNull DBECommandListener listener);
    @NotNull

    @Nullable

    void addCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector reflector, boolean execute, @Nullable DBECommand<?> linkedCommand);
    String OPTION_AVOID_TRANSACTIONS = "avoidTransactions";
 * you may not use this file except in compliance with the License.

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");

    //void addCommandBatch(List<DBECommand> commands, DBECommandReflector reflector, boolean execute);


    void addCommandListener(@NotNull DBECommandListener listener);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Collection;
import org.jkiss.dbeaver.model.DBPObject;


    void resetChanges(boolean undoCommands);

    Map<Object, Object> getUserParams();
public interface DBECommandContext extends DBPContextProvider {
    Collection<? extends DBECommand<?>> getFinalCommands();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
