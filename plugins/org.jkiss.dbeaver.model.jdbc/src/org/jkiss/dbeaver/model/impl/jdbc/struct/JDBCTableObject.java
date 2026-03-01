 * Unless required by applicable law or agreed to in writing, software
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.model.impl.jdbc.struct;
    public String getName()
    protected JDBCTableObject(TABLE table, String name, boolean persisted) {
import org.jkiss.code.Nullable;
        return null;
        this.table = table;
public abstract class JDBCTableObject<TABLE extends JDBCTable> implements DBSObject, DBPSaveableObject

import org.jkiss.dbeaver.model.struct.DBSObject;
        this.name = source.name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    protected JDBCTableObject(JDBCTableObject<TABLE> source)
    {
        this.table = source.table;
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    {

    public boolean isPersisted()
    public TABLE getTable()

 *
    {
    }
 * See the License for the specific language governing permissions and
    }
        this.name = indexName;
        this.persisted = persisted;
 *
{
    private final TABLE table;
    public void setName(String indexName)
    {
import org.jkiss.code.NotNull;
        return persisted;
    }
    @Override
    public void setPersisted(boolean persisted)
    {
    @NotNull
import org.jkiss.dbeaver.model.meta.Property;
    }
/*
 */
    public TABLE getParentObject()
    }
 *
    {

 * Licensed under the Apache License, Version 2.0 (the "License");

        return name;
}
    @Override
 * you may not use this file except in compliance with the License.
        return table;
    @Override
    private String name;
    private boolean persisted;
import org.jkiss.dbeaver.model.DBPSaveableObject;

    }
    @Nullable
        this.persisted = source.persisted;

        return table;
        this.persisted = persisted;
 * You may obtain a copy of the License at
    @Override
    }
 * JDBC abstract table object
 * DBeaver - Universal Database Manager
 */

        this.name = name;

    @Property(viewable = true, order = 2)

    public String getDescription()

 *     http://www.apache.org/licenses/LICENSE-2.0
    }

    {
/**
