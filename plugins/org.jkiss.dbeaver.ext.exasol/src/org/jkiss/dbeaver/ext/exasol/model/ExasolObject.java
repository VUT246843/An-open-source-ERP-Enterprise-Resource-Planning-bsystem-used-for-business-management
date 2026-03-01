 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return parent;
    @Override

 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSObject;
        return objectId;
    @Override

    }
    }
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.persisted = persisted;
    }
        this.parent = parent;
    public long getObjectId() {
/*
        return null;
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.meta.Property;

    }

    }
    private long objectId;
    }
}
        return name;
    public void setName(String name) {
    protected ExasolObject(PARENT parent, String name, boolean persisted) {
        this.persisted = persisted;
        this.parent = parent;

    @Property(viewable = true, editable = false, order = 1)

    public void setPersisted(boolean persisted) {
    protected final PARENT parent;
    @Override
    }
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return (ExasolDataSource) parent.getDataSource();
    public PARENT getParentObject() {
import org.jkiss.dbeaver.model.DBPSaveableObject;
    protected String name;
        this.objectId = objectId;
    @Override

 * You may obtain a copy of the License at
    }
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software

        this.name = name;
        this.name = name;
    }
    @Nullable
    protected ExasolObject(PARENT parent, String name, long objectId, boolean persisted) {
    public String getDescription() {

 *
 *     http://www.apache.org/licenses/LICENSE-2.0


    private boolean persisted;
    public boolean isPersisted() {
    public ExasolDataSource getDataSource() {
        return persisted;
    @NotNull
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.ext.exasol.model;
    @Override
    @Override
 */
    public String getName() {
    }
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
        this.name = name;
public abstract class ExasolObject<PARENT extends DBSObject> implements DBSObject, DBPSaveableObject {
        this.persisted = persisted;
