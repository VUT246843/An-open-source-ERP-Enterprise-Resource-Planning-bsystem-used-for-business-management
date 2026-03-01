/*
    @Override
 * See the License for the specific language governing permissions and
    public PostgreDataSource getDataSource()
 * you may not use this file except in compliance with the License.
    @Override

 * PostgreSQL informational object
    {
 * DBeaver - Universal Database Manager

    {
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPSystemInfoObject;

        return database.getDataSource();
 *
        return database;
    }
public abstract class PostgreInformation implements DBSObject, DBPSystemInfoObject, PostgreObject {


    @NotNull
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    private PostgreDatabase database;
    {
    @Override
    public boolean isPersisted()
        return getName();
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import org.jkiss.code.Nullable;
    }
        return true;

 */
 *
        return null;
    protected PostgreInformation(PostgreDatabase database)
        return database;
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
 * Unless required by applicable law or agreed to in writing, software

    @Override


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.postgresql.model;
 *
    public String toString()
    public String getDescription() {
    }
/**
    public PostgreDatabase getDatabase() {

import org.jkiss.code.NotNull;

    }
    @Override
        this.database = database;
    {
    @Override
    public DBSObject getParentObject()
}
    @Nullable
