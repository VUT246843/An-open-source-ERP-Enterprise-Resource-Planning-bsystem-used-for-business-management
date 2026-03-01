    @NotNull
    @Override
        this.value = JDBCUtils.safeGetString(dbResult, "setting");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
}
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String value;
    @Override
        }
    public String getName() {
    private final PostgreDataSource database;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @NotNull
    public String getValue() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 2)
    public String getUnit() {
    protected PostgreSetting(PostgreDataSource database, ResultSet dbResult) {

    @Property(viewable = true, order = 1)
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.meta.Property;
    public DBSObject getParentObject() {
        return true;
import java.sql.ResultSet;
    }
    public boolean isPersisted() {
 *
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    @Override
 * you may not use this file except in compliance with the License.


    @Nullable
    }

        return database;
    public DBPDataSource getDataSource() {
public class PostgreSetting implements DBSObject, DBPSystemInfoObject {
        this.description = JDBCUtils.safeGetString(dbResult, "short_desc");
        this.name = JDBCUtils.safeGetString(dbResult, "name");
    private final String name;
    }
    private final String description;

    @Nullable

    @Nullable
        return database.getDataSource();
            this.unit = null;
        return unit;
import org.jkiss.code.NotNull;
    @Nullable
    private final String unit;
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Property(viewable = true, order = 3)

        } else {
/*
        return value;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPSystemInfoObject;
    @Override
 * You may obtain a copy of the License at
    @Override
    }
        return description;
package org.jkiss.dbeaver.ext.postgresql.model;
            this.unit = JDBCUtils.safeGetString(dbResult, "unit");
        this.database = database;
        return name;
 *
 */
 * limitations under the License.

        if (database.isServerVersionAtLeast(8, 2)) {
    public String getDescription() {
    }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

