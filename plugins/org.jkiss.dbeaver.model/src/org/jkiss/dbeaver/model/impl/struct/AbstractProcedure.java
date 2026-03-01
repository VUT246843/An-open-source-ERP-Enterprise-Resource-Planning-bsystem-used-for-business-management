/**
    protected AbstractProcedure(CONTAINER container, boolean persisted, String name, String description)
        return container;
    }

    @NotNull
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    }
    {
    {
    {
    @Nullable
        return description;
    DATASOURCE extends DBPDataSource,
    protected boolean persisted;
    protected String name;
    }

    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    @Override
    @Nullable
    public DATASOURCE getDataSource()
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    protected String description;
    }
    @Override
    public DBPImage getObjectImage() {
 * you may not use this file except in compliance with the License.
    public String getDescription()
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 */

 *
    @Override
    {
    }
 * AbstractProcedure
 * You may obtain a copy of the License at
    {
    }
    public CONTAINER getContainer()
        this.persisted = persisted;

    @Override

    @Override
    public void setName(@NotNull String name)
    }

        return persisted;
    }
import org.jkiss.dbeaver.model.meta.Property;
/*
    implements DBSProcedure, DBPSaveableObject, DBPImageProvider, DBPNamedObject2
    @Override
    public boolean isPersisted()

    }
 *
        } else {
}
    @Override
    @Override
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        this.persisted = persisted;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    protected AbstractProcedure(CONTAINER container, boolean persisted)
 * limitations under the License.
    public String getName()
 *


package org.jkiss.dbeaver.model.impl.struct;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        return (DATASOURCE) container.getDataSource();
{
        this.description = description;
    @Property(viewable = true, order = 1)
 * Unless required by applicable law or agreed to in writing, software
        if (getProcedureType() == DBSProcedureType.FUNCTION) {
        this.name = name;
        this.description = description;
    {
    CONTAINER extends DBSObjectContainer>


        this.container = container;
import org.jkiss.code.NotNull;
    {
public abstract class AbstractProcedure<
    protected CONTAINER container;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setDescription(String description)
            return DBIcon.TREE_PROCEDURE;
 * DBeaver - Universal Database Manager
 */
        return name;
    public void setPersisted(boolean persisted)
        return container;
        }
import org.jkiss.dbeaver.model.*;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
import org.jkiss.code.Nullable;
    @NotNull
        this(container, persisted);


    }
 * See the License for the specific language governing permissions and
            return DBIcon.TREE_FUNCTION;
    public DBSObject getParentObject()
        this.name = name;
