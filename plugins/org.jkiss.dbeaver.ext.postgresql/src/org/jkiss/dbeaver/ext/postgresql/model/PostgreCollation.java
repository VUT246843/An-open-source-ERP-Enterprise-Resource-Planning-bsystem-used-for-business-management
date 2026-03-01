        return null;
    }

    private String provider;
        return encodingId;
    @Nullable
    @Property(viewable = true, order = 6)
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.sql.SQLException;
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            this.provider = JDBCUtils.safeGetString(dbResult, "collprovider");

    private long ownerId;
    }
    public String getName()
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    private String name;
 * See the License for the specific language governing permissions and

 *
    public PostgreRole getOwnerId(DBRProgressMonitor monitor) throws DBException {
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "collowner");
    {
    @Override
import org.jkiss.dbeaver.DBException;
    @Override
    }
        return collate;
    @Property(viewable = true, order = 5)
    @Override
    @Property(viewable = false, order = 50)
 * limitations under the License.
        return true;
    }
        this.encodingId = JDBCUtils.safeGetLong(dbResult, "collencoding");
    private PostgreDatabase database;
    private void loadInfo(DBRProgressMonitor monitor, ResultSet dbResult)
        throws SQLException, DBException {
    @Property(viewable = true, order = 7)
    public String getCollate() {
package org.jkiss.dbeaver.ext.postgresql.model;
    public PostgreDatabase getDatabase() {
        return schema;


public class PostgreCollation extends PostgreInformation {
 * PostgreCollation
    public String getCtype() {
    @NotNull
        }
 * You may obtain a copy of the License at
        return name;
 *
        super(database);
    }
        this.collate = JDBCUtils.safeGetString(dbResult, "collcollate");
    private String ctype;

    @Property(viewable = true, order = 2)
        return provider;
    }
    }
    private PostgreSchema schema;
    @Override

        return oid;

    }
        this.ctype = JDBCUtils.safeGetString(dbResult, "collctype");
    @NotNull
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.name = JDBCUtils.safeGetString(dbResult, "collname");
    @Property(viewable = true, order = 1)

 */
    @Override
        this.schema = database.getSchema(monitor, JDBCUtils.safeGetLong(dbResult, "collnamespace"));
    }
    @Property(viewable = true, order = 8)
import org.jkiss.dbeaver.model.meta.Property;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
        return database.getDataSource();
    {

    private long oid;
        return database;
    @NotNull
    private long encodingId;
    @Override
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (getDataSource().isServerVersionAtLeast(10, 0)) {

    public PostgreSchema getSchema() {

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public long getEncodingId() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    private String collate;
    public boolean isPersisted() {
    }

    }
    public long getObjectId() {
    }
        return database.getRoleById(monitor, ownerId);



    public String getDescription()
    public PostgreCollation(DBRProgressMonitor monitor, PostgreDatabase database, ResultSet dbResult)
    @Property(viewable = true, order = 3)
        this.database = database;
 * Unless required by applicable law or agreed to in writing, software
    public DBSObject getParentObject()
    }
    public String getProvider() {
/*
    }



    public PostgreDataSource getDataSource() {
        throws SQLException, DBException {
import org.jkiss.code.NotNull;
        return ctype;
        this.loadInfo(monitor, dbResult);
import java.sql.ResultSet;
    {
    @Override
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 */
        return database;

