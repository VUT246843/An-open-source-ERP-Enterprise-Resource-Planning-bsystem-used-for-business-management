


 *
}

/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        // dbStat.setMaxRows(1);
 * See the License for the specific language governing permissions and
        dbStat.setString(1, db2Grantee.getType().name());
        throws SQLException, DBException
    protected DB2DatabaseAuth fetchObject(@NotNull JDBCSession session, @NotNull DB2Grantee db2Grantee, @NotNull JDBCResultSet dbResult)
 */
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        // dbStat.setFetchSize(1); // Only 1 row per user
 * Unless required by applicable law or agreed to in writing, software
        dbStat.setString(2, db2Grantee.getName());
 * you may not use this file except in compliance with the License.
        return dbStat;
import org.jkiss.code.NotNull;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Grantee db2Grantee) throws SQLException
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Cache for Databases authorities for a given Grantee

    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 *
/**

    {
    {
 * limitations under the License.
    @Override
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    @Override
 */
        return new DB2DatabaseAuth(session.getProgressMonitor(), db2Grantee.getDataSource(), dbResult);
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final String SQL = "SELECT * FROM SYSCAT.DBAUTH WHERE GRANTEETYPE = ? AND GRANTEE = ? WITH UR";
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL);
import java.sql.SQLException;
package org.jkiss.dbeaver.ext.db2.model.security;
 * @author Denis Forveille
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class DB2GranteeDatabaseAuthCache extends JDBCObjectCache<DB2Grantee, DB2DatabaseAuth> {
