import java.util.Collection;
    void setCache(@NotNull List<OBJECT> objects);

    @NotNull
    void cacheObject(@NotNull OBJECT object);
     */
 *
        throws DBException;
    Collection<OBJECT> getAllObjects(@NotNull DBRProgressMonitor monitor, @Nullable OWNER owner)

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    List<OBJECT> getCachedObjects();
     * Clears all cache
     * @param object object to remove
     * True if all available objects were cached
    void removeObject(@NotNull OBJECT object, boolean resetFullCache);
     * Adds specified object to cache

     */

 * See the License for the specific language governing permissions and
}
    /**
     * @param objects new cache contents
     * Sets new cache contents. setCache(getCachedObjects()) will reset named cache.

 * you may not use this file except in compliance with the License.
     * Set fullyCache flag to true.
        throws DBException;
 * Unless required by applicable law or agreed to in writing, software
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;

    void clearCache();

     * @param object object to cache
     * @param resetFullCache if true resets fullyCached flag. May be used to refresh linked objects.
     */
 *
 *
    boolean isFullyCached();

    /**
package org.jkiss.dbeaver.model.struct.cache;
     * Removes specified object from cache
    @Nullable
    OBJECT getCachedObject(@NotNull String name);

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    void renameObject(@NotNull OBJECT object, @NotNull String oldName, @NotNull String newName);
/**


import org.jkiss.dbeaver.model.struct.DBSObject;

import java.util.List;
 */
 * Objects cache
    /**
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBSObjectCache<OWNER extends DBSObject, OBJECT extends DBSObject> {

    @Nullable
     */

    @NotNull
    OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name)
import org.jkiss.code.NotNull;
     */
