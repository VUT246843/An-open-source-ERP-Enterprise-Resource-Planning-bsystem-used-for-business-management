    @Nullable
 *
    }
        this.name = JDBCUtils.safeGetString(dbResult, "jclname");
import org.jkiss.dbeaver.model.meta.Property;
 * you may not use this file except in compliance with the License.
        return database.getDataSource();

    private final PostgreDatabase database;
        return true;

        return id;

    @Override
 * Unless required by applicable law or agreed to in writing, software
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * You may obtain a copy of the License at
 * limitations under the License.
    public PostgreDatabase getDatabase() {

    @Override
import org.jkiss.code.Nullable;
    public long getObjectId() {
    @NotNull
 */
    public String getName() {


    @NotNull
    @Property(viewable = true, order = 1)
    @Override
    private final long id;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObject;
 * See the License for the specific language governing permissions and
        this.id = JDBCUtils.safeGetInt(dbResult, "jclid");
/*

        return database;
        return null;
 * DBeaver - Universal Database Manager
    public DBSObject getParentObject() {
    @Override
import org.jkiss.code.NotNull;
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    public PostgreJobClass(@NotNull PostgreDatabase database, @NotNull ResultSet dbResult) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    @NotNull
}

package org.jkiss.dbeaver.ext.postgresql.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import java.sql.ResultSet;

    }
    @Override

public class PostgreJobClass implements PostgreObject {

        return name;
    }
    private final String name;
    }
        return database;
    public boolean isPersisted() {
    @Override
    }
    public PostgreDataSource getDataSource() {
        this.database = database;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getDescription() {
