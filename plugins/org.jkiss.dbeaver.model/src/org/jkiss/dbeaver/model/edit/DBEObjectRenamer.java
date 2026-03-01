 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *
     * @throws DBException on any error
 * Unless required by applicable law or agreed to in writing, software

/**
import org.jkiss.dbeaver.DBException;


 */
/*
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        throws DBException;
 * Provide object's rename functions
    default boolean canRenameObject(OBJECT_TYPE object) {
     */
 */
     *
import org.jkiss.code.NotNull;
     *
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
    void renameObject(@NotNull DBECommandContext commandContext, @NotNull OBJECT_TYPE object, @NotNull Map<String, Object> options, @NotNull String newName)
        return true;
import java.util.Map;
 * limitations under the License.

     * @param newName new name. Not null only if UI somehow determine possible new name
    String PROP_NEW_NAME = "newName";
    }
 * You may obtain a copy of the License at

     * @param commandContext command context. Implementation should add new command to it.

package org.jkiss.dbeaver.model.edit;

 * Object describer.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    String PROP_OLD_NAME = "oldName";
    /**
 * See the License for the specific language governing permissions and
}     * Describes object
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

     * @param options
     * @param object object
public interface DBEObjectRenamer<OBJECT_TYPE extends DBSObject> extends DBEObjectManager<OBJECT_TYPE> {
