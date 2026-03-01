            dbStat.setString(2, forNickname.getName());
    {

public final class DB2NicknameCache extends JDBCStructLookupCache<DB2Schema, DB2Nickname, DB2TableColumn> {
        sb.append(" WHERE TABSCHEMA = ?");
 * Copyright (C) 2010-2024 DBeaver Corp and others
        dbStat.setString(1, db2Schema.getName());

    }
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
}
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.ext.db2.model.fed.DB2Nickname;
 * limitations under the License.

        } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @Nullable DB2Nickname db2Nickname,
        String sql;
    private static final String SQL_NICK;
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
        SQL_NICK_ALL = sb.toString();
        StringBuilder sb = new StringBuilder(256);
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
 */

import org.jkiss.code.NotNull;
    }

        JDBCPreparedStatement dbStat = session.prepareStatement(sql);

    private static final String SQL_COLS_NICK = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY COLNO WITH UR";
    }
 * Unless required by applicable law or agreed to in writing, software
        sb.setLength(0);
    }
        sb.append(" WHERE TABSCHEMA = ?");
import java.sql.SQLException;
import org.jkiss.dbeaver.model.DBUtils;
        }
 * @author Denis Forveille
    protected DB2Nickname fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet dbResult)
            sql = SQL_COLS_ALL;
 * DBeaver - Universal Database Manager
        @NotNull DB2Nickname db2Nickname, @NotNull JDBCResultSet dbResult) throws SQLException, DBException

        }
        if (forNickname != null) {
 * You may obtain a copy of the License at
            dbStat.setString(2, db2Nickname != null ? db2Nickname.getName() : db2NicknameName);
        sb.append(" WITH UR");
        super("TABNAME");
    {
 * 
                                                @Nullable String db2NicknameName) throws SQLException
    @NotNull
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

        @Nullable DB2Nickname forNickname) throws SQLException
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final String SQL_NICK_ALL;
        sb.append("SELECT *");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            sql = SQL_COLS_NICK;
    {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
    {
 * See the License for the specific language governing permissions and
 *
        sb.append(" ORDER BY TABNAME");
 * Cache for DB2 Nicknames

    @Override
    @Override
    public DB2NicknameCache()
        sb.append("   AND TABNAME = ?");
 */
    protected DB2TableColumn fetchChild(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,

        sb.append("  FROM SYSCAT.NICKNAMES");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    private static final String SQL_COLS_ALL  = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA = ? ORDER BY TABNAME, COLNO WITH UR";

        return dbStat;
            return dbStat;
    }
        SQL_NICK = sb.toString();
        return new DB2TableColumn(session.getProgressMonitor(), db2Nickname, dbResult);
        throws SQLException, DBException
            dbStat.setString(1, db2Schema.getName());
 *
        setListOrderComparator(DBUtils.nameComparator());
    static {
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_NICK_ALL);
 *
        if (forNickname != null) {
    {
        sb.append("SELECT *");
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        return new DB2Nickname(session.getProgressMonitor(), db2Schema, dbResult);
    @Override
        if (db2Nickname != null || db2NicknameName != null) {
/**

 * you may not use this file except in compliance with the License.
            return dbStat;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            dbStat.setString(1, db2Schema.getName());
    protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
        sb.append("  FROM SYSCAT.NICKNAMES");
/*

            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_NICK);

        } else {
package org.jkiss.dbeaver.ext.db2.model.cache;
        sb.append(" WITH UR");
