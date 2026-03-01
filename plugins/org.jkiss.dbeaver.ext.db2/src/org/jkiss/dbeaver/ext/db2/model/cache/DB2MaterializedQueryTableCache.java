 * 
    }
 * @author Denis Forveille
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        sb.append("   AND V.VIEWNAME = ?");
    {
        sb.append("SELECT *");
        sb.append("   AND T.TABSCHEMA = V.VIEWSCHEMA");
    @Override
        sb.setLength(0);
    }
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_MQT_ALL);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        SQL_MQT_ALL = sb.toString();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DB2MaterializedQueryTable db2MQT, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
    {

    @Override

        sb.append(" FROM SYSCAT.TABLES T");

    }
 * you may not use this file except in compliance with the License.
    @Override
            sql = SQL_COLS_TAB;
        sb.append("    , SYSCAT.VIEWS V");
        if (db2MaterializedQueryTable != null || db2MaterializedQueryTableName != null) {
        sb.append("   AND T.TABNAME = V.VIEWNAME");
    public DB2MaterializedQueryTableCache()

        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
package org.jkiss.dbeaver.ext.db2.model.cache;
    protected DB2MaterializedQueryTable fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.db2.model.DB2MaterializedQueryTable;

    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    private static final String SQL_COLS_TAB = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA=? AND TABNAME = ? ORDER BY COLNO WITH UR";
    {
 *
 * You may obtain a copy of the License at
            dbStat.setString(1, db2Schema.getName());
 * DBeaver - Universal Database Manager
        } else {
    @NotNull
        StringBuilder sb = new StringBuilder(256);
        }

}

import org.jkiss.dbeaver.DBException;
        }
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_MQT);
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
 * Unless required by applicable law or agreed to in writing, software
            dbStat.setString(2, forMqt.getName());
    extends JDBCStructLookupCache<DB2Schema, DB2MaterializedQueryTable, DB2TableColumn> {
 */
    protected DB2TableColumn fetchChild(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableType;
import org.jkiss.code.NotNull;

        sb.append(" WHERE V.VIEWSCHEMA = ?");
    }
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
        String sql;
        sb.append("   AND T.TYPE IN ").append(DB2TableType.getInClause(DB2ObjectType.MQT));
    }
import java.sql.SQLException;
    public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
            dbStat.setString(1, db2Schema.getName());
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Cache for DB2 MQT

        @Nullable DB2MaterializedQueryTable forMqt) throws SQLException
            dbStat.setString(2,
            sql = SQL_COLS_ALL;
            return dbStat;
        sb.append(" WHERE V.VIEWSCHEMA = ?");

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        sb.append("   AND T.TYPE IN ").append(DB2TableType.getInClause(DB2ObjectType.MQT));
    static {
        }
        SQL_MQT = sb.toString();
        if (forMqt != null) {
                                                @Nullable DB2MaterializedQueryTable db2MaterializedQueryTable, @Nullable String db2MaterializedQueryTableName) throws SQLException
    private static final String SQL_MQT;
        sb.append("    , SYSCAT.VIEWS V");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        return new DB2TableColumn(session.getProgressMonitor(), db2MQT, dbResult);
    }
        if (forMqt != null) {
        } else {
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
import org.jkiss.code.Nullable;
        return new DB2MaterializedQueryTable(session.getProgressMonitor(), db2Schema, dbResult);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        sb.append("SELECT *");
        sb.append(" WITH UR");
        sb.append(" WITH UR");
    private static final String SQL_COLS_ALL = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA=? ORDER BY TABNAME, COLNO WITH UR";

    private static final String SQL_MQT_ALL;
        return dbStat;
    @Override

 *
        sb.append(" ORDER BY T.TABNAME");
                db2MaterializedQueryTable != null ? db2MaterializedQueryTable.getName() : db2MaterializedQueryTableName);
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
public final class DB2MaterializedQueryTableCache
 * limitations under the License.
/**
        sb.append("   AND T.TABSCHEMA = V.VIEWSCHEMA");
 * See the License for the specific language governing permissions and
            return dbStat;
        dbStat.setString(1, db2Schema.getName());
    protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
        sb.append(" FROM SYSCAT.TABLES T");
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        super("TABNAME");
 */
        sb.append("   AND T.TABNAME = V.VIEWNAME");
/*
