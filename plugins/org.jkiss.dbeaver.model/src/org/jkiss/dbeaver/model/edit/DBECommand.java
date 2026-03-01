 * You may obtain a copy of the License at
    OBJECT_TYPE getObject();
     * Some scripts (like password change) should not be shown in Query Manager.
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
        @Nullable DBECommand<?> prevCommand,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.

 * DBeaver - Universal Database Manager
     */
    boolean isUndoable();
    DBECommand<?> merge(
    DBEPersistAction[] getPersistActions(
    boolean isDisableSessionLogging();

import org.jkiss.code.Nullable;
    void updateModel();
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Validates command.

 *
    boolean ignoreNestedCommands();
    @Nullable
     */
     * @param monitor
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
     */
 *
    /**
import java.util.Map;

     * If command is fine then just returns, otherwise throws an exception
    void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException;

     * @throws DBException contains information about invalid command state
}
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * you may not use this file except in compliance with the License.
 * Object change command


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

     * @param options
        @NotNull Map<Object, Object> userParams);
import org.jkiss.dbeaver.model.DBPObject;
        @NotNull DBRProgressMonitor monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
public interface DBECommand<OBJECT_TYPE extends DBPObject> {
    /**
        @NotNull Map<String, Object> options) throws DBException;
/**


    /**
    String getTitle();


    @NotNull
        @NotNull DBCExecutionContext executionContext,
 */
 *

     * Some commands (like structCreate) support nested commands, but we may avoid this behavior for correct command merging with this flag
    @NotNull
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.edit;
