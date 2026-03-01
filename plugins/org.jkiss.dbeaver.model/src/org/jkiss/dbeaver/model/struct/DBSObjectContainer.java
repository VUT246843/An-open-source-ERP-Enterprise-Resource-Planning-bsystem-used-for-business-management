import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Cache underlying relations
import org.jkiss.code.Nullable;

     */
 * limitations under the License.
     * Cache attributes of underlying entities/relations

     * @return collection of child objects (not null).
     * Gets child object by its name.
public interface DBSObjectContainer extends DBSObject
     * Retrieve list of immediate child objects (not recursive)
     *  Objects type depends on implementor (catalogs, schemas, tables, etc)
    int STRUCT_ALL = STRUCT_ENTITIES | STRUCT_ATTRIBUTES | STRUCT_ASSOCIATIONS;
    /**
     * @param childName name of child object
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
     * This method is invoked when view want to draw something like ER diagram which
 * DBSObjectContainer
     * In most cases object name have to be case insensitive.
     */
     * @throws DBException on any DB error
}
     * Caches all underlying structure contents.
    /**
     */
     * Usually it is some non-abstract table implementation.
 * See the License for the specific language governing permissions and
     */

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
     */
     * @throws org.jkiss.dbeaver.DBException on error
     */
     * @param monitor progress monitor
    int STRUCT_ASSOCIATIONS = 4;
    DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException;
    int STRUCT_ENTITIES = 1;

    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
{
     */
 */
    /**
     * @return type of child objects
import org.jkiss.code.NotNull;
    @NotNull
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,

     * Cache underlying entities
     * @param monitor progress monitor
     * @param monitor progress monitor. May be null. In that case implementor mustn't do any expensive operations
import java.util.Collection;
     * Reads tables, columns, foreign keys and other RDB information.

     */
     * @return child object or null
    /**
     * @throws DBException on any DB error
     * @throws DBException on any DB error
     *
    /**
     * @param scope underlying structure scope
    Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException;
package org.jkiss.dbeaver.model.struct;
    int STRUCT_ATTRIBUTES = 2;
 * you may not use this file except in compliance with the License.
     * Gets type of primary child elements.
 *
 *
    Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException;
     *
 *
     * includes all container entities.
 * Unless required by applicable law or agreed to in writing, software
     * @param monitor progress monitor
 * You may obtain a copy of the License at
    /**
    /**
/*
    /**
     * Cache everything
/**
    void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException;
     * @see DBSEntityContainer


