 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected DB2RoleAuth fetchObject(@NotNull JDBCSession session, @NotNull DB2Grantee db2Grantee, @NotNull JDBCResultSet dbResult) throws SQLException,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.DBException;

    @Override
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * You may obtain a copy of the License at
        dbStat.setString(2, db2Grantee.getName());
 * Cache for DB2 Roles for a given Grantee
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return dbStat;
 * @author Denis Forveille
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Grantee db2Grantee) throws SQLException
 *
        DB2Role db2Role = db2Grantee.getDataSource().getRole(session.getProgressMonitor(), db2RoleName);
import java.sql.SQLException;
    }

 * See the License for the specific language governing permissions and
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    private static final String SQL = "SELECT * FROM SYSCAT.ROLEAUTH WHERE GRANTEETYPE = ? AND GRANTEE = ? ORDER BY ROLENAME WITH UR";
    @Override
public class DB2GranteeRoleCache extends JDBCObjectCache<DB2Grantee, DB2RoleAuth> {
import org.jkiss.code.NotNull;

 * distributed under the License is distributed on an "AS IS" BASIS,
}
 */
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    {
 */
    {

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        dbStat.setString(1, db2Grantee.getType().name());
        // Lookup for the role in DS Cache
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL);
        return new DB2RoleAuth(db2Role, dbResult);

 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
/**
        DBException
 * limitations under the License.
 * you may not use this file except in compliance with the License.
        String db2RoleName = JDBCUtils.safeGetStringTrimmed(dbResult, "ROLENAME");
 *
package org.jkiss.dbeaver.ext.db2.model.security;
 * Unless required by applicable law or agreed to in writing, software
 * 

