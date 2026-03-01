        }
        sb.append(" WITH UR");

    @Override
        }
}
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        return new DB2Table(session.getProgressMonitor(), db2Schema, dbResult);
        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
 *
/**
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        dbStat.setString(1, db2Schema.getName());
    private static final String SQL_COLS_ALL = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA = ? ORDER BY TABNAME, COLNO WITH UR";
 * limitations under the License.
    }
    private static final String SQL_TAB;
    protected DB2TableColumn fetchChild(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2Table db2Table,

 * See the License for the specific language governing permissions and
            sql = SQL_COLS_TAB;
    @Override

    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        sb.append("   AND TYPE IN ").append(DB2TableType.getInClause(DB2ObjectType.TABLE));
        return dbStat;
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
        sb.setLength(0);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.code.Nullable;
    private static final String SQL_TAB_ALL;
            dbStat.setString(2, forTable.getName());
        @Nullable DB2Table forTable) throws SQLException
            dbStat.setString(1, db2Schema.getName());
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
 * Cache for DB2 Tables
            return dbStat;
        @Nullable DB2Table db2Table, @Nullable String db2TableName) throws SQLException
        sb.append("  FROM SYSCAT.TABLES");
    protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

package org.jkiss.dbeaver.ext.db2.model.cache;
        SQL_TAB = sb.toString();
    private static final String SQL_COLS_TAB = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY COLNO WITH UR";


        if (forTable != null) {

import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
    }
        SQL_TAB_ALL = sb.toString();
 * 
        return new DB2TableColumn(session.getProgressMonitor(), db2Table, dbResult);
 */
    }
        throws SQLException, DBException
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
            dbStat.setString(2, db2Table != null ? db2Table.getName() : db2TableName);
        }
    @Override
    static {
import java.sql.SQLException;
            sql = SQL_COLS_ALL;
import org.jkiss.dbeaver.DBException;
        sb.append(" WHERE TABSCHEMA = ?");
            return dbStat;

import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableType;
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_TAB_ALL);
    protected DB2Table fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet dbResult)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super("TABNAME");
        sb.append(" ORDER BY TABNAME");
    {
    {
    public DB2TableCache()
/*
    }
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
    }
    @NotNull
        } else {
 * you may not use this file except in compliance with the License.
        String sql;
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
        } else {
        sb.append(" WITH UR");
    }
        StringBuilder sb = new StringBuilder(256);
            dbStat.setString(1, db2Schema.getName());
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_TAB);
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
public final class DB2TableCache extends JDBCStructLookupCache<DB2Schema, DB2Table, DB2TableColumn> {
    @Override
 *

        sb.append("  FROM SYSCAT.TABLES");
    {
    public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
 * @author Denis Forveille
        sb.append("SELECT *");
        if (db2Table != null || db2TableName != null) {
        if (forTable != null) {
 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");

        sb.append("   AND TYPE IN ").append(DB2TableType.getInClause(DB2ObjectType.TABLE));
 *
import org.jkiss.code.NotNull;
        sb.append("   AND TABNAME = ?");
        sb.append("SELECT *");

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;


        sb.append(" WHERE TABSCHEMA = ?");
