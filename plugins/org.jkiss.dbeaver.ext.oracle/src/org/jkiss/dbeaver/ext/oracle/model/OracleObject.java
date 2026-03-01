        String name,
    }
import org.jkiss.dbeaver.model.DBPSaveableObject;
    @Override
        String name,
    @NotNull
 *
 * Unless required by applicable law or agreed to in writing, software
    protected String name;
    }
public abstract class OracleObject<PARENT extends DBSObject> implements DBSObject, DBPSaveableObject
        this.persisted = persisted;
import org.jkiss.code.NotNull;
    public String getDescription()
 */
        return parent;

/*
 * See the License for the specific language governing permissions and
    public String getName()
    {
    @Override
 * You may obtain a copy of the License at
    {
        this.name = name;
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void setName(String name)
    public long getObjectId()
    @Property(viewable = true, editable = true, order = 1)

    @Override
    protected final PARENT parent;
    private long objectId;

 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    }

package org.jkiss.dbeaver.ext.oracle.model;
        this.name = CommonUtils.notEmpty(name);
 * Abstract oracle object
        this.parent = parent;
import org.jkiss.dbeaver.Log;
        return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    public PARENT getParentObject()
        long objectId,
    }
        return name;
    }


        return objectId;
import org.jkiss.dbeaver.model.struct.DBSObject;
    {
 * limitations under the License.

    @Override
    protected OracleObject(


        this.persisted = persisted;
        boolean persisted)
        this.name = name;
 *
    }
    protected OracleObject(
{
    }
    @NotNull

    }
        this.parent = parent;
    public boolean isPersisted()
    {
    {

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return persisted;
    @Override
import org.jkiss.dbeaver.model.meta.Property;
 * you may not use this file except in compliance with the License.
        this.objectId = objectId;
 */
        PARENT parent,
    {
    }
    public void setPersisted(boolean persisted)
        boolean persisted)
    }
    {
    public OracleDataSource getDataSource()
}
/**

 * DBeaver - Universal Database Manager
    private boolean persisted;
    {

    @Nullable
        PARENT parent,
import org.jkiss.utils.CommonUtils;
        return (OracleDataSource) parent.getDataSource();
    private static final Log log = Log.getLog(OracleObject.class);
        this.persisted = persisted;
