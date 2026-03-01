    public String getType() {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.version = JDBCUtils.safeGetString(dbResult, "srvversion");
    @NotNull
    @Property(viewable = true, order = 10)
        super(database);
    }
        this.loadInfo(dbResult);
                "OPTIONS " + PostgreUtils.getOptionsString(this.options);
    @Property(viewable = true, order = 3)
                "\nfs.srvname, " +

import java.util.Map;
    public PostgreForeignDataWrapper getForeignDataWrapper(DBRProgressMonitor monitor) throws DBException {

    public void setObjectDefinitionText(String sourceText) throws DBException {
            return new PostgreUserMapping(owner, dbResult);
    public String[] getOptions() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            "-- Foreign server: " + getName() + "\n\n" +
        @Override

            return session.prepareStatement(
        return

                "\nORDER BY srvname"
            throws SQLException
    @Property(viewable = true, order = 2)
                "\numoptions  " +
    private String version;
    }
import org.jkiss.code.NotNull;
    public String getVersion() {
        throws SQLException

    private long oid;
    @Association
    }
 * Unless required by applicable law or agreed to in writing, software
    {
    }

 * DBeaver - Universal Database Manager
    }
        return PostgreUtils.getObjectById(monitor, userMappingCache, this, oid);
    }

 * you may not use this file except in compliance with the License.

 * PostgreForeignServer
 *
        super(database);
    @Override
    @Property(viewable = false, order = 8)
}
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;

    {
    public PostgreForeignServer(PostgreDatabase database) {
        this.dataWrapperId = JDBCUtils.safeGetLong(dbResult, "srvfdw");

                "FOREIGN DATA WRAPPER " + getForeignDataWrapper(monitor).getName() + "\n\t" +


        this.options = PostgreUtils.safeGetStringArray(dbResult, "srvoptions");
        return version;
import org.jkiss.dbeaver.model.meta.Association;
    }
    }
                "\nsrvoptions,  " +
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
        return name;
 *
    }
    @Property(viewable = true, order = 4)
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        this.name = JDBCUtils.safeGetString(dbResult, "srvname");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import java.sql.SQLException;

    private String type;
    }
            throws SQLException, DBException
        {
            );
 */
import java.util.Collection;
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }

import org.jkiss.dbeaver.model.meta.Property;
        this.type = JDBCUtils.safeGetString(dbResult, "srvtype");
        return PostgreUtils.getObjectById(monitor, getDatabase().foreignDataWrapperCache, getDatabase(), dataWrapperId);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        return oid;
 * You may obtain a copy of the License at
                "select distinct " +
    private UserMappingCache userMappingCache = new UserMappingCache();
        {
    private String[] options;
 * See the License for the specific language governing permissions and
        return userMappingCache.getAllObjects(monitor, this);
 * limitations under the License.
public class PostgreForeignServer extends PostgreInformation implements PostgreScriptObject {
    private void loadInfo(ResultSet dbResult)

                "\njoin pg_foreign_server fs on um.srvid = fs.OID  " +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
        }

    {
        }
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    public PostgreUserMapping getUserMapping(DBRProgressMonitor monitor, long oid) throws DBException {
                "CREATE SERVER " + getName() + "\n\t" +


 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        return getDatabase().getRoleById(monitor, ownerId);
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {

                "\nleft join pg_authid pa on um.umuser = pa.OID " +
    public PostgreForeignServer(PostgreDatabase database, ResultSet dbResult)
    private String name;
        @NotNull
import java.sql.ResultSet;
        protected PostgreUserMapping fetchObject(@NotNull JDBCSession session, @NotNull PostgreForeignServer owner, @NotNull JDBCResultSet dbResult)

    @Property(viewable = true, order = 5)
    private long ownerId;
    private long dataWrapperId;
    public Collection<PostgreUserMapping> getUserMappings(DBRProgressMonitor monitor) throws DBException {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreForeignServer owner)
package org.jkiss.dbeaver.ext.postgresql.model;

                "-- DROP SERVER " + getName() + ";\n\n" +
        @Override


                "\ncase when rolname is null then 'public' else rolname end rolname, " +
    public String getName()
    public long getObjectId() {
    }
        return type;
                "\nfrom pg_user_mappings um  " +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
    @Override
    @Override
    static class UserMappingCache extends JDBCObjectCache<PostgreForeignServer, PostgreUserMapping> {
/*
    @NotNull
        return options;
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "srvowner");
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                "\nwhere fs.OID = " + owner.getObjectId() +
        throws SQLException
