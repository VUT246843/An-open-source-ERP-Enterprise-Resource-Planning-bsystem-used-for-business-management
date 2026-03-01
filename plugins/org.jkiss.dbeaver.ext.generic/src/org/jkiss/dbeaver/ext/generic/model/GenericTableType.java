    }
    {
 * Licensed under the Apache License, Version 2.0 (the "License");


public class GenericTableType implements DBSObject {
    {
    public boolean isPersisted()

        return null;
 *
    @Override
package org.jkiss.dbeaver.ext.generic.model;
        this.dataSource = dataSource;
 * you may not use this file except in compliance with the License.
    private final String name;
        this.name = name;
 * DBeaver - Universal Database Manager

    public String getName()
    public DBPDataSource getDataSource()
import org.jkiss.dbeaver.model.struct.DBSObject;
        return name;

    public GenericTableType(@NotNull GenericDataSource dataSource, @NotNull String name)
    @Override
 */
    public DBSObject getParentObject()

import org.jkiss.code.NotNull;

    {
        return true;
    @Override
    }
 *
    {
    {
    private final GenericDataSource dataSource;
import org.jkiss.dbeaver.model.DBPDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return dataSource.getContainer();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

        return dataSource;
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
/*
    @Override
    {
/**
 */

 * You may obtain a copy of the License at
 * Table type
 * See the License for the specific language governing permissions and
    }
    }
    }
    @Override
    @NotNull
    public String getDescription()
