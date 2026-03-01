    public DB2DataSource getDataSource()

    {
    }
    public PARENT getParentObject()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getName()
    {
    public long getObjectId()
    protected final PARENT parent;
    private static final Log log = Log.getLog(DB2Object.class);
    protected DB2Object(PARENT parent, String name, boolean persisted)
        return parent;
 * limitations under the License.
    {
import org.jkiss.code.Nullable;
    }
    @Override
        return null;

    public void setPersisted(boolean persisted)
        this.parent = parent;
        this.persisted = persisted;
    protected DB2Object(PARENT parent, String name, long objectId, boolean persisted)
    {
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * Unless required by applicable law or agreed to in writing, software
    private long objectId;


        return name;
        return persisted;
import org.jkiss.dbeaver.Log;
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPSaveableObject;

        this.persisted = persisted;
    @Property(viewable = true, editable = false, order = 1)
}
        this.name = name;
    public String getDescription()
    @Override
        return objectId;
        this.name = name;
    protected String name;
 * You may obtain a copy of the License at


 */
        this.parent = parent;
    {
    @Nullable
package org.jkiss.dbeaver.ext.db2.model;
 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Abstract DB2 object
        this.objectId = objectId;
    public boolean isPersisted()
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
public abstract class DB2Object<PARENT extends DBSObject> implements DBSObject, DBPSaveableObject {
    }
 *
    }
    public void setName(String name)
    @Override
 *
    }
import org.jkiss.dbeaver.model.meta.Property;
        this.persisted = persisted;
        return (DB2DataSource) parent.getDataSource();
 * you may not use this file except in compliance with the License.
    }
    {
 *

    }
 */


    @NotNull
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    {

    }
 * DBeaver - Universal Database Manager
        this.name = name;
    @Override
    private boolean persisted;
/*

    @NotNull
