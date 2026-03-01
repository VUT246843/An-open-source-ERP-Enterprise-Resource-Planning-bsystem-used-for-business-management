    private final long oid;
import java.sql.ResultSet;
    public boolean isInstalled() {
    public PostgreDatabase getDatabase() {
    
 *
 *
import org.jkiss.dbeaver.model.DBPSystemInfoObject;
    private final String version;
            this.database = database;
 * limitations under the License.

    public long getObjectId() {
    
    private final PostgreDatabase database;
    public String getDescription() {
     @Override
        return installed_version;
    @Property(viewable = true, order = 3)
    @NotNull
    
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        return oid;
            this.installed_version = JDBCUtils.safeGetString(dbResult, "installed_version");
        return null;
            installed = installed_version != null;

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;

    public DBSObject getParentObject() {
        return database.getDataSource();
/*
            this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    private final String description;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public  PostgreAvailableExtension(PostgreDatabase database,ResultSet dbResult)
    @Property(viewable = true, order = 4)
    @Override
    }
        return true;
    
package org.jkiss.dbeaver.ext.postgresql.model;
    
    }

 * DBeaver - Universal Database Manager
    private final String installed_version;
     @Override
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObject;
    
import org.jkiss.dbeaver.model.meta.Property;
        return database;
    }
}
    }
        {
    public String getVersion() {



    private final String name;

        return description;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public PostgreDataSource getDataSource() {
    public String getName() {
    @Override
    @Override
    @Override
    }
        return installed;
    private final boolean installed;
    }
            this.description = JDBCUtils.safeGetString(dbResult, "comment");
    }
    }
    @Override
 * You may obtain a copy of the License at
    public String getInstalledVersion() {
    @Property(viewable = true, order = 1)
 */
    public boolean isPersisted() {
        return version;
    
    @NotNull
        return name;
    @Property(viewable = true, order = 2)

public class PostgreAvailableExtension implements PostgreObject, DBPSystemInfoObject {
    
            this.version = JDBCUtils.safeGetString(dbResult, "default_version");

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.name = JDBCUtils.safeGetString(dbResult, "name");
        }
    }
 * you may not use this file except in compliance with the License.
    }

