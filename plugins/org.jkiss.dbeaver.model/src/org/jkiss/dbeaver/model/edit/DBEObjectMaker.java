     * Real object creation will be performed by saveChanges function.
import java.util.Map;
     *
 * DBEObjectManager

     * @param container parent object
import org.jkiss.dbeaver.model.DBPDataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    /**
    long FEATURE_SUPPORTS_COPY              = 1 << 4;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    OBJECT_TYPE createNewObject(
    long FEATURE_DELETE_CASCADE             = 1 << 3;
     */
package org.jkiss.dbeaver.model.edit;
import org.jkiss.dbeaver.DBException;
    long FEATURE_EDITOR_ON_CREATE           = 1 << 2;


     * Additionally implementation could add initial command(s) to this manager.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    boolean canDeleteObject(@NotNull OBJECT_TYPE object);
    long FEATURE_CREATE_FROM_PASTE          = 1 << 1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull Map<String, Object> options) throws DBException;
    boolean canCreateObject(@NotNull Object container);
        @NotNull DBECommandContext commandContext,
     * @param commandContext command context
 * You may obtain a copy of the License at
    DBSObjectCache<? extends DBSObject, OBJECT_TYPE> getObjectsCache(OBJECT_TYPE object);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    /**
     * Actually this function should not delete object but add command(s) to the manager.
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
    /**
     * Creates new object and sets it as manager's object.
     * @return null if no additional actions should be performed


 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
     * @param options delete options. Options are set by delete wizard.
 * DBeaver - Universal Database Manager
/**
 *
import org.jkiss.code.Nullable;
     * @param object contained object
     * Editor will reflect object create/delete in commands model update method
     * @param monitor progress monitor


     * @return objects cache or null
     */

        @NotNull OBJECT_TYPE object,

     */
     * This function can be invoked only once per one manager.
     * Deletes specified object.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull Map<String, Object> options) throws DBException;
     * @param options options
     * @param copyFrom template for new object (usually result of "paste" operation)
     * @param object object
    long getMakerOptions(@NotNull DBPDataSource dataSource);
        @NotNull Object container,

    void deleteObject(
     * Real object's delete will be performed by saveChanges function.
}
        @NotNull DBECommandContext commandContext,
     * New object shouldn't be persisted by this function - it just performs manager initialization.
import org.jkiss.dbeaver.model.struct.DBSObject;
/*
    long FEATURE_SAVE_IMMEDIATELY           = 1;
public interface DBEObjectMaker<OBJECT_TYPE extends DBSObject, CONTAINER_TYPE> extends DBEObjectManager<OBJECT_TYPE> {
     * @param commandContext command context
    long FEATURE_CLOSE_EXISTING_CONNECTIONS = 1 << 5;
     * Provides access to objects cache.
        @Nullable Object copyFrom,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 */
