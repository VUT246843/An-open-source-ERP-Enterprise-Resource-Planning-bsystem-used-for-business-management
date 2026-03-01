 *

    static {
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        sb.append(" ORDER BY T.TABNAME");
        }
        sb.append(" FROM SYSCAT.TABLES T");
    @Override
    {
        sb.append("   AND T.TABSCHEMA = V.VIEWSCHEMA");
import org.jkiss.dbeaver.DBException;
        StringBuilder sb = new StringBuilder(256);
        String sql;
        if (db2View != null || db2ViewName != null) {

            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_VIEW);

        sb.append("   AND T.TYPE IN ").append(DB2TableType.getInClause(DB2ObjectType.VIEW));
    private static final String SQL_COLS_ALL = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA=? ORDER BY TABNAME, COLNO WITH UR";
package org.jkiss.dbeaver.ext.db2.model.cache;
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        sb.append(" FROM SYSCAT.TABLES T");

    private static final String SQL_COLS_TAB = "SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA=? AND TABNAME = ? ORDER BY COLNO WITH UR";
import org.jkiss.code.NotNull;

        return dbStat;
        sb.append("SELECT *");
        SQL_VIEW_ALL = sb.toString();
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
            sql = SQL_COLS_ALL;
        sb.append("   AND T.TYPE IN ").append(DB2TableType.getInClause(DB2ObjectType.VIEW));
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        @Nullable DB2View db2View, @Nullable String db2ViewName) throws SQLException
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
        }

        sb.append("   AND T.TABNAME = V.VIEWNAME");
            dbStat.setString(1, db2Schema.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
    }
 * limitations under the License.

    public DB2ViewCache()
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
        sb.append(" WHERE V.VIEWSCHEMA = ?");
        } else {
        }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableType;
        sb.append("   AND T.TABSCHEMA = V.VIEWSCHEMA");

        sb.append("    , SYSCAT.VIEWS V");
        return new DB2TableColumn(session.getProgressMonitor(), db2View, dbResult);
 * 
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (forView != null) {
    @NotNull
    private static final String SQL_VIEW_ALL;
 * Cache for DB2 Views
    }
    protected DB2View fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet dbResult)
    {
    @Override
    protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        sb.append("   AND T.TABNAME = V.VIEWNAME");
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

    {
 */
            dbStat.setString(1, db2Schema.getName());
 * Unless required by applicable law or agreed to in writing, software
        super("TABNAME");
            return dbStat;
        } else {
import org.jkiss.code.Nullable;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return new DB2View(session.getProgressMonitor(), db2Schema, dbResult);
        SQL_VIEW = sb.toString();
 * See the License for the specific language governing permissions and
/*
 */
        sb.setLength(0);
        if (forView != null) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.db2.model.DB2View;

    }
        sb.append("   AND V.VIEWNAME = ?");
import java.sql.SQLException;

        throws SQLException, DBException
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    {
            return dbStat;
        sb.append(" WHERE V.VIEWSCHEMA = ?");
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_VIEW_ALL);
        sb.append("    , SYSCAT.VIEWS V");
        dbStat.setString(1, db2Schema.getName());
        sb.append("SELECT *");
    {
 *
    private static final String SQL_VIEW;

        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
    }
    protected DB2TableColumn fetchChild(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2View db2View,

public final class DB2ViewCache extends JDBCStructLookupCache<DB2Schema, DB2View, DB2TableColumn> {
        sb.append(" WITH UR");
 * You may obtain a copy of the License at
            dbStat.setString(2, db2View != null ? db2View.getName() : db2ViewName);
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
            dbStat.setString(2, forView.getName());
        @Nullable DB2View forView) throws SQLException
 * @author Denis Forveille
        sb.append(" WITH UR");
    public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
    @Override
            sql = SQL_COLS_TAB;
