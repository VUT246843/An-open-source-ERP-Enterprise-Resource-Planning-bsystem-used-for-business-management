        this.value = value;
{

    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public MySQLParameter(MySQLDataSource dataSource, String name, Object value)

    @Nullable
        return true;
        return name;
    public String getName()
    private final MySQLDataSource dataSource;
    @Property(viewable = true, order = 1)
 * See the License for the specific language governing permissions and
        return value;
    }
 *

    {
    @Override
    private Object value;
    private static final Log log = Log.getLog(MySQLParameter.class);
    private String description;
package org.jkiss.dbeaver.ext.mysql.model;
    @Override
        this.dataSource = dataSource;
import org.jkiss.dbeaver.Log;
 * MySQLParameter
    public String getDescription()
 *
    {
    @Override
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
/*
 */

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
//    @Property(name = "Description", viewable = true, order = 100)
    @NotNull
    private final String name;
    }
    {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.meta.Property;
    public DBSObject getParentObject()
/**
    @Override
    {
    }
 * DBeaver - Universal Database Manager
public class MySQLParameter implements DBSObject

    }

        this.name = name;
 * limitations under the License.
    public boolean isPersisted()

    @Property(viewable = true, order = 2)
    public Object getValue()
        return getDataSource();

    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        return description;
import org.jkiss.dbeaver.model.struct.DBSObject;

    public MySQLDataSource getDataSource()
import org.jkiss.code.Nullable;
        return dataSource;
import org.jkiss.code.NotNull;
 *
    {

    @Override
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    }
