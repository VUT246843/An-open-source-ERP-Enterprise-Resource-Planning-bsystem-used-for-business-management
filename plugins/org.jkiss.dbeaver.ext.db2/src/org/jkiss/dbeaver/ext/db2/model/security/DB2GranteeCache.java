    {
package org.jkiss.dbeaver.ext.db2.model.security;
    }
            sb.append("SELECT DISTINCT GRANTEE");
public final class DB2GranteeCache extends JDBCObjectCache<DB2DataSource, DB2Grantee> {
    }
        // DF: could be put in a cache "per version"
        sb.append("  FROM SYSCAT.ROUTINEAUTH");


import org.jkiss.dbeaver.DBException;
        sb.append("SELECT DISTINCT GRANTEE");
        DBException
        sb.append(" WHERE GRANTEETYPE = ?");// 6

 *
 * DBeaver - Universal Database Manager
        sb.append("SELECT DISTINCT GRANTEE");

    // -------

        sb.append(" UNION ");
            sb.append(" UNION ");
        this.authIdTypeName = authIdType.name();
        dbStat.setString(7, authIdTypeName);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        DBRProgressMonitor monitor = session.getProgressMonitor();
        if (db2DataSource.isAtLeastV9_7()) {
        }
        dbStat.setString(1, authIdTypeName);
            sb.append("  FROM SYSCAT.MODULEAUTH");

    private String authIdTypeName;
 * You may obtain a copy of the License at


        dbStat.setString(9, authIdTypeName);
        sb.append(" UNION ");
    {
            sb.append("SELECT DISTINCT GRANTEE");
    // Helpers
    private DB2AuthIDType authIdType;
        sb.append(" WHERE GRANTEETYPE = ?");// 8

        sb.append(" UNION ");
 * Unless required by applicable law or agreed to in writing, software
        sb.append(" UNION ");
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
            return new DB2User(monitor, db2DataSource, resultSet);
        }
        dbStat.setString(6, authIdTypeName);
        }
        switch (authIdType) {
        sb.append(" WHERE GRANTEETYPE = ?");// 2
 * Copyright (C) 2010-2024 DBeaver Corp and others

            sb.append(" UNION ");

        return dbStat;

        sb.append("  FROM SYSCAT.PACKAGEAUTH");
        sb.append(" ORDER BY GRANTEE");
}        sb.append(" UNION ");
            return new DB2Group(monitor, db2DataSource, resultSet);
        sb.append(" WHERE GRANTEETYPE = ?");// 3
 * See the License for the specific language governing permissions and
    }
        sb.append("SELECT DISTINCT GRANTEE");
        }

 */


 * limitations under the License.
        if (db2DataSource.isAtLeastV9_5()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
        sb.append(" WHERE GRANTEETYPE = ?");// 4
        if (db2DataSource.isAtLeastV9_5()) {
    @Override
        sb.append("  FROM SYSCAT.SCHEMAAUTH");

        }
        default:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        sb.append(" UNION ");

        sb.append(" WHERE GRANTEETYPE = ?"); // 1
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        if (db2DataSource.isAtLeastV9_7()) {
        dbStat.setString(10, authIdTypeName);
        sb.append(" WHERE GRANTEETYPE = ?");// 5
            dbStat.setString(12, authIdTypeName);
        sb.append(" WHERE GRANTEETYPE = ?"); // 10
        JDBCPreparedStatement dbStat = session.prepareStatement(getSQLStatement(db2DataSource));
        return sb.toString();

    // -------
        dbStat.setString(2, authIdTypeName);
        dbStat.setString(4, authIdTypeName);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        sb.append("  FROM SYSCAT.INDEXAUTH");
 * Cache for DB2 Groups and Users

import org.jkiss.code.NotNull;
        sb.append("  FROM SYSCAT.XSROBJECTAUTH");
    @Override
            throw new DBException("Structural problem. " + authIdType + " type not implemented");
        sb.append(" UNION ");

        this.authIdType = authIdType;
 * @author Denis Forveille
        sb.append("SELECT DISTINCT GRANTEE");
 *
    public DB2GranteeCache(DB2AuthIDType authIdType)
        sb.append("  FROM SYSCAT.TABAUTH");
            sb.append(" WHERE GRANTEETYPE = ?"); // 11
    {
    protected DB2Grantee fetchObject(@NotNull JDBCSession session, @NotNull DB2DataSource db2DataSource, @NotNull JDBCResultSet resultSet) throws SQLException,
        sb.append("SELECT DISTINCT GRANTEE");
 * you may not use this file except in compliance with the License.
        dbStat.setString(8, authIdTypeName);
 * 

        case U:
    private String getSQLStatement(DB2DataSource db2DataSource)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        case G:
        sb.append("SELECT DISTINCT GRANTEE");
        sb.append(" UNION ");
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2DataSource db2DataSource) throws SQLException
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        sb.append("  FROM SYSCAT.DBAUTH");
        sb.append("SELECT DISTINCT GRANTEE");



            sb.append("  FROM SYSCAT.ROLEAUTH");
    @NotNull
 */
        sb.append(" WITH UR");
        sb.append("SELECT DISTINCT GRANTEE");
/**
        sb.append("  FROM SYSCAT.SEQUENCEAUTH");
import java.sql.SQLException;



            dbStat.setString(11, authIdTypeName);
        sb.append(" UNION ");


        sb.append("  FROM SYSCAT.TBSPACEAUTH");


        sb.append("SELECT DISTINCT GRANTEE");
/*
        sb.append("SELECT DISTINCT GRANTEE");
        dbStat.setString(3, authIdTypeName);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        sb.append("  FROM SYSCAT.COLAUTH");

        sb.append(" WHERE GRANTEETYPE = ?");// 7


import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        sb.append(" WHERE GRANTEETYPE = ?");// 9

        StringBuilder sb = new StringBuilder(1536);
        dbStat.setString(5, authIdTypeName);
            sb.append(" WHERE GRANTEETYPE = ?"); // 12
