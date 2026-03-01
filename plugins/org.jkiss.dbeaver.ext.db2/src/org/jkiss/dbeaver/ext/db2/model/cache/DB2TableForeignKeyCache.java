package org.jkiss.dbeaver.ext.db2.model.cache;
        DB2TableColumn tableColumn = db2Table.getAttribute(session.getProgressMonitor(), colName);
import org.jkiss.code.Nullable;
        sb.append("      , KCU.COLSEQ");

    protected DB2TableForeignKey fetchObject(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            sql = SQL_FK_TAB;
        StringBuilder sb = new StringBuilder(512);
    ) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        sb.append("   FROM SYSCAT.REFERENCES R");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        sb.append("    AND KCU.TABNAME   = R.TABNAME");
 * distributed under the License is distributed on an "AS IS" BASIS,
            dbStat.setString(2, forTable.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * limitations under the License.
    protected DB2TableForeignKeyColumn[] fetchObjectRow(
/**

        sb.append("      , KCU.COLNAME");
 * You may obtain a copy of the License at
        sb.append("  WHERE R.TABSCHEMA = ?");

        sb.append("       ,SYSCAT.KEYCOLUSE KCU");
    static {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        sb.append("         , KCU.COLSEQ");
 *
/*
        } else {
        sb.append("   FROM SYSCAT.REFERENCES R");
 * See the License for the specific language governing permissions and
    @Override
public final class DB2TableForeignKeyCache extends JDBCCompositeCache<DB2Schema, DB2Table, DB2TableForeignKey, DB2TableForeignKeyColumn> {
        sb.setLength(0);

        if (forTable != null) {

import java.sql.SQLException;
        if (forTable != null) {
        sb.append(" WITH UR");

    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @Nullable DB2Table forTable)
        sb.append("  ORDER BY R.CONSTNAME");
    @Override
    @NotNull
            sql = SQL_FK_ALL;
 * DBeaver - Universal Database Manager
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull DB2TableForeignKey constraint, @NotNull List<DB2TableForeignKeyColumn> rows) {

                new DB2TableForeignKeyColumn(object, tableColumn, JDBCUtils.safeGetInt(dbResult, "COLSEQ"))
        sb.append("  ORDER BY R.CONSTNAME");

 *
    }
 * you may not use this file except in compliance with the License.
        sb.append("         , KCU.COLSEQ");
        SQL_FK_TAB = sb.toString();
    {
        sb.append(" WITH UR");
        SQL_FK_ALL = sb.toString();
        } else {
        if (tableColumn == null) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
import org.jkiss.dbeaver.DBException;

        sb.append("    AND KCU.TABSCHEMA = R.TABSCHEMA");
    private static final String SQL_FK_ALL;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DB2TableForeignKey object,
        super(tableCache, DB2Table.class, "TABNAME", "CONSTNAME");

        String colName = JDBCUtils.safeGetString(dbResult, "COLNAME");
    }
        @NotNull DB2Table db2Table,

        sb.append("      , KCU.COLNAME");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
        dbStat.setString(1, db2Schema.getName());
        sb.append("    AND KCU.CONSTNAME = R.CONSTNAME");
        sb.append("       ,SYSCAT.KEYCOLUSE KCU");
        sb.append(" SELECT R.*");
        sb.append("    AND R.TABNAME = ?");
    public DB2TableForeignKeyCache(DB2TableCache tableCache)
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        sb.append("  WHERE R.TABSCHEMA = ?");
        }
        sb.append("    AND KCU.TABSCHEMA = R.TABSCHEMA");
    {
    }
        sb.append("    AND KCU.TABNAME   = R.TABNAME");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @NotNull String constName, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
 * Cache for DB2 Table Foreign Keys
    {
            };
 */
}
    @Override
            return null;
        sb.append("      , KCU.COLSEQ");
        return new DB2TableForeignKey(session.getProgressMonitor(), db2Table, dbResult);
 *
        }
 * @author Denis Forveille

import java.util.List;
        @NotNull JDBCResultSet dbResult
            return new DB2TableForeignKeyColumn[] {
    private static final String SQL_FK_TAB;
        sb.append("    AND KCU.CONSTNAME = R.CONSTNAME");
    @Override

        return dbStat;
 * 
        String sql;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.*;
        sb.append(" SELECT R.*");
import org.jkiss.code.NotNull;
            log.debug("DB2TableForeignKeyCache : Column '" + colName + "' not found in table '" + db2Table.getFullyQualifiedName(DBPEvaluationContext.UI)
    }
        throws SQLException
        @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
                + "' ??");
        constraint.setAttributeReferences(rows);
    }
        @NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2Table db2Table,
    }
