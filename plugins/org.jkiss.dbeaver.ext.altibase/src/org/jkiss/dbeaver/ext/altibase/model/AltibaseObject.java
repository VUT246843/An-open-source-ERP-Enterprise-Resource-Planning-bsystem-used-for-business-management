        this.persisted = persisted;
    }
 *
import org.jkiss.dbeaver.model.meta.Property;
    protected final PARENT parent;
import org.jkiss.dbeaver.model.struct.DBSObject;
        boolean persisted) {
        return null;
 * Unless required by applicable law or agreed to in writing, software

    @Override
        this.parent = parent;
        return (AltibaseDataSource) parent.getDataSource();
        this.objectId = objectId;
    @Override
    @NotNull
    public void setPersisted(boolean persisted) {
        this.parent = parent;
    }
    }
    public AltibaseDataSource getDataSource() {
        this.persisted = persisted;
    @Nullable
        return objectId;

    public void setName(String name) {
        PARENT parent,
        return parent;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
package org.jkiss.dbeaver.ext.altibase.model;
    public boolean isPersisted() {

    }
public abstract class AltibaseObject<PARENT extends DBSObject> implements DBSObject, DBPSaveableObject {
    public long getObjectId() {
 * You may obtain a copy of the License at
    private long objectId;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getName() {
    protected AltibaseObject(
    }
        return name;
import org.jkiss.code.Nullable;
        boolean persisted) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        long objectId,


    protected AltibaseObject(
    @Override
/*

    }
import org.jkiss.utils.CommonUtils;
    @NotNull
    }
    
 *

    @Override
    @Override

        String name,
 * DBeaver - Universal Database Manager
 * limitations under the License.
    public PARENT getParentObject() {
import org.jkiss.dbeaver.model.DBPSaveableObject;

    }
}

        this.persisted = persisted;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    protected String name;
        this.name = name;
    }

    }
        String name,
        this.name = name;
    private boolean persisted;
import org.jkiss.code.NotNull;
    @Property(viewable = true, editable = true, order = 1)
 * See the License for the specific language governing permissions and
        this.name = CommonUtils.notEmpty(name);
 * you may not use this file except in compliance with the License.
        PARENT parent,

 *
        return persisted;
    public String getDescription() {
