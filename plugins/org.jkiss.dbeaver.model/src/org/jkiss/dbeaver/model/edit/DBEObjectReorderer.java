     *@param newPosition new position  @throws DBException on any error
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Provide object's reorder functions


} *
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param object object
 * you may not use this file except in compliance with the License.
    int getMinimumOrdinalPosition(OBJECT_TYPE object);
 * limitations under the License.

 */
/**

     *
    void setObjectOrdinalPosition(DBECommandContext commandContext, OBJECT_TYPE object, List<OBJECT_TYPE> siblingObjects, int newPosition)
import org.jkiss.dbeaver.DBException;

 * Copyright (C) 2010-2024 DBeaver Corp and others
     * Changes object ordinal position
import java.util.List;
/*
 *

    int getMaximumOrdinalPosition(OBJECT_TYPE object);
import org.jkiss.dbeaver.model.struct.DBSObject;
     * @param siblingObjects
public interface DBEObjectReorderer<OBJECT_TYPE extends DBSObject> extends DBEObjectManager<OBJECT_TYPE> {
package org.jkiss.dbeaver.model.edit;
     */
 * DBeaver - Universal Database Manager
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBException;

    /**
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param commandContext command context. Implementation should add new command to it.
 * Unless required by applicable law or agreed to in writing, software
 * Object reorderer.
 */
