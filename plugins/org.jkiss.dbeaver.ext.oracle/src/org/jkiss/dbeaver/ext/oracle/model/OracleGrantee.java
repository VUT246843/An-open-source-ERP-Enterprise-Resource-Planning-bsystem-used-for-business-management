 *
        systemPrivCache.clearCache();
        @NotNull
    }
 * you may not use this file except in compliance with the License.
            return dbStat;
        return this;
    public Collection<OraclePrivSystem> getSystemPrivs(DBRProgressMonitor monitor) throws DBException
                "AND o.OWNER=p." + (hasDBA ? "OWNER" : "TABLE_SCHEMA") + " AND o.OBJECT_NAME=p.TABLE_NAME AND o.OBJECT_TYPE<>'PACKAGE BODY'");
public abstract class OracleGrantee extends OracleGlobalObject implements DBAUser, DBPSaveableObject, DBPRefreshableObject
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            dbStat.setString(1, owner.getName());
    public OracleGrantee(OracleDataSource dataSource) {

                "FROM " + (hasDBA ? "DBA_TAB_PRIVS p, DBA_OBJECTS o" : "ALL_TAB_PRIVS p, ALL_OBJECTS o") + "\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.DBPSaveableObject;
        rolePrivCache.clearCache();
            final JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        }

import org.jkiss.dbeaver.model.access.DBAUser;
                "WHERE p.GRANTEE=? " +
        return rolePrivCache.getAllObjects(monitor, this);
        @Override
/*
        @Override
        {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    static class SystemPrivCache extends JDBCObjectCache<OracleGrantee, OraclePrivSystem> {
    static class RolePrivCache extends JDBCObjectCache<OracleGrantee, OraclePrivRole> {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        @Override

    public Collection<OraclePrivObject> getObjectPrivs(DBRProgressMonitor monitor) throws DBException

    {

 * distributed under the License is distributed on an "AS IS" BASIS,

                "SELECT * FROM DBA_ROLE_PRIVS WHERE GRANTEE=? ORDER BY GRANTED_ROLE");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    static class ObjectPrivCache extends JDBCObjectCache<OracleGrantee, OraclePrivObject> {

        return systemPrivCache.getAllObjects(monitor, this);
        @Override
        }
    }


    @Association
            dbStat.setString(1, owner.getName());
        return objectPrivCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.Log;
 */
            final JDBCPreparedStatement dbStat = session.prepareStatement(
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        super(dataSource, true);
        protected OraclePrivObject fetchObject(@NotNull JDBCSession session, @NotNull OracleGrantee owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
            return new OraclePrivSystem(owner, resultSet);
        {
    private final SystemPrivCache systemPrivCache = new SystemPrivCache();
        protected OraclePrivRole fetchObject(@NotNull JDBCSession session, @NotNull OracleGrantee owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @Association
 * OracleGrantee
        }
                "SELECT * FROM DBA_SYS_PRIVS WHERE GRANTEE=? ORDER BY PRIVILEGE");
    final RolePrivCache rolePrivCache = new RolePrivCache();

import org.jkiss.dbeaver.model.DBPRefreshableObject;
        @NotNull
            return dbStat;
    }
import org.jkiss.code.Nullable;
        @NotNull
    private static final Log log = Log.getLog(OracleGrantee.class);
{
 * DBeaver - Universal Database Manager

} *     http://www.apache.org/licenses/LICENSE-2.0

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            dbStat.setString(1, owner.getName());
        protected OraclePrivSystem fetchObject(@NotNull JDBCSession session, @NotNull OracleGrantee owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
            boolean hasDBA = owner.getDataSource().isViewAvailable(session.getProgressMonitor(), OracleConstants.SCHEMA_SYS, OracleConstants.VIEW_DBA_TAB_PRIVS);
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleGrantee owner) throws SQLException

        objectPrivCache.clearCache();
 *
import org.jkiss.dbeaver.DBException;
    public Collection<OraclePrivRole> getRolePrivs(DBRProgressMonitor monitor) throws DBException
                "SELECT p.*,o.OBJECT_TYPE\n" +
import java.util.Collection;
 */
package org.jkiss.dbeaver.ext.oracle.model;
            return new OraclePrivRole(owner, resultSet);
        {
import java.sql.SQLException;
        }
            return new OraclePrivObject(owner, resultSet);
        {
    }
import org.jkiss.dbeaver.model.meta.Association;
import org.jkiss.dbeaver.model.struct.DBSObject;

 * limitations under the License.
    }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleGrantee owner) throws SQLException
            return dbStat;
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
        {
        {


    {

    {
    private final ObjectPrivCache objectPrivCache = new ObjectPrivCache();
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleGrantee owner) throws SQLException
        @Override

    }
/**
    @Association
        }
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.code.NotNull;
 *
