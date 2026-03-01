import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
    {
            return dbStat;
    public String getAuthentication()
        super(dataSource);
                    "SELECT * FROM DBA_ROLE_PRIVS WHERE GRANTED_ROLE=? ORDER BY GRANTEE");
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

}
package org.jkiss.dbeaver.ext.oracle.model;
 *

import org.jkiss.dbeaver.model.meta.Association;
 * you may not use this file except in compliance with the License.
    @Property(viewable = true, order = 2)
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.meta.Property;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    static class UserCache extends JDBCObjectCache<OracleRole, OraclePrivUser> {
        return super.refreshObject(monitor);
    }
    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
 * See the License for the specific language governing permissions and

    public String getName() {
    @Property(viewable = true, order = 3)
        return authentication;

public class OracleRole extends OracleGrantee implements DBARole
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


        this.name = JDBCUtils.safeGetString(resultSet, "ROLE");
/**
    private String authentication;
        @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;

import org.jkiss.dbeaver.model.access.DBARole;
/*
 * limitations under the License.

    {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.code.NotNull;
import java.sql.SQLException;
import org.jkiss.dbeaver.model.struct.DBSObject;
            dbStat.setString(1, owner.getName());
    public Collection<OraclePrivUser> getUserPrivs(DBRProgressMonitor monitor) throws DBException
        userCache.clearCache();
import java.util.Collection;
 */

        {

        }
 */
 * OracleRole
    }
            return new OraclePrivUser(owner, resultSet);
    private static final Log log = Log.getLog(OracleRole.class);
        protected OraclePrivUser fetchObject(@NotNull JDBCSession session, @NotNull OracleRole owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
        return name;
import java.sql.ResultSet;
import org.jkiss.code.Nullable;
{
    public OracleRole(OracleDataSource dataSource, ResultSet resultSet) {
    private final UserCache userCache = new UserCache();
import org.jkiss.dbeaver.DBException;
    private String name;

        {
        @Override
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleRole owner) throws SQLException
    @Association
 * DBeaver - Universal Database Manager
        @Override
    @Nullable

    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.authentication = JDBCUtils.safeGetStringTrimmed(resultSet, "PASSWORD_REQUIRED");
 * You may obtain a copy of the License at
 *
        return userCache.getAllObjects(monitor, this);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
