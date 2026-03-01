    }
        objectList.remove(object);

        this.objectList.clear();
 *
public class ListCache<OWNER extends DBSObject, OBJECT extends DBSObject>
        return DBUtils.findObject(objectList, name);
import java.util.ArrayList;
    {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        return DBUtils.findObject(objectList, name);
    }



    }

    public void cacheObject(@NotNull OBJECT object)
        this.objectList.clear();
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void renameObject(@NotNull OBJECT object, @NotNull String oldName, @NotNull String newName) {
    public OBJECT getCachedObject(@NotNull String name)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
    public ListCache(List<OBJECT> objectList) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
 * limitations under the License.


    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    {
    }
/**
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name) throws DBException {
    @NotNull
 */
        return true;


    {
import org.jkiss.code.Nullable;
    {
import org.jkiss.dbeaver.model.DBUtils;
/*
    public boolean isFullyCached()
    }
    implements DBSObjectCache<OWNER, OBJECT>
 * You may obtain a copy of the License at

 *
        return objectList;
 *

    public List<OBJECT> getCachedObjects()
        objectList.add(object);
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
{
        this.objectList = (objectList == null ? new ArrayList<>() : objectList);
    public void clearCache()
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
 * See the License for the specific language governing permissions and
    @Override
        return objectList;

    public void setCache(@NotNull List<OBJECT> objects)
        this.objectList.addAll(objects);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

    }
    public void removeObject(@NotNull OBJECT object, boolean resetFullCache)

    }
    @Override
 * List wrapper cache
    private final List<OBJECT> objectList;
    @Override
 */
    {

    @NotNull
    @Override
    public List<OBJECT> getAllObjects(@NotNull DBRProgressMonitor monitor, OWNER owner) throws DBException {
 * DBeaver - Universal Database Manager
    @Nullable
package org.jkiss.dbeaver.model.struct.cache;
 * Unless required by applicable law or agreed to in writing, software
    }
    {

}
        // do nothing - we don't cache names
