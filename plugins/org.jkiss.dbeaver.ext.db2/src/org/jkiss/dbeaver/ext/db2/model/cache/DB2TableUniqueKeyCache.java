    }
    }
        sb.append("  ORDER BY C.CONSTNAME");
import org.jkiss.dbeaver.ext.db2.model.dict.DB2ConstraintType;
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);

/*

        sb.setLength(0);
        dbStat.setString(1, db2Schema.getName());

    @Override
        } else {
    @NotNull
            sql = SQL_UK_ALL;
 */
        SQL_UK_ALL = sb.toString();
    @Override
import org.jkiss.dbeaver.DBException;
                new DB2TableKeyColumn(object, tableColumn, JDBCUtils.safeGetInt(dbResult, "COLSEQ")) };
        sb.append("  WHERE C.TABSCHEMA = ?");

        sb.append("    AND KCU.TABNAME   = C.TABNAME");
        DBSEntityConstraintType type = DB2ConstraintType.getConstraintType(JDBCUtils.safeGetString(dbResult, "TYPE"));
 * Copyright (C) 2010-2025 DBeaver Corp and others
        sb.append("  WHERE C.TABSCHEMA = ?");
        sb.append("       ,SYSCAT.KEYCOLUSE KCU");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * limitations under the License.

        if (forTable != null) {
}
        @NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2Table db2Table, @NotNull String indexName,
        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
            return new DB2TableKeyColumn[] {
        sb.append("      , KCU.COLNAME");
 *
    {
 * @author Denis Forveille
        sb.append("      , KCU.COLSEQ");
 * Cache for DB2 Table Unique Keys
    }
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @Nullable DB2Table forTable)
 */
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    }
        super(tableCache, DB2Table.class, "TABNAME", "CONSTNAME");
    static {
            sql = SQL_UK_TAB;
import org.jkiss.code.NotNull;

    {
 * 
        }
package org.jkiss.dbeaver.ext.db2.model.cache;
public final class DB2TableUniqueKeyCache extends JDBCCompositeCache<DB2Schema, DB2Table, DB2TableUniqueKey, DB2TableKeyColumn> {
import java.sql.SQLException;
    private static final String SQL_UK_ALL;
    private static final String SQL_UK_TAB;
        sb.append(" SELECT C.*");
    {
/**
        sb.append("   FROM SYSCAT.TABCONST C");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        constraint.setAttributeReferences(rows);
        sb.append("      , KCU.COLNAME");
        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        sb.append("    AND KCU.TABSCHEMA = C.TABSCHEMA");
import org.jkiss.dbeaver.ext.db2.model.*;


import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        @NotNull JDBCSession session, @NotNull DB2Table db2Table, @NotNull DB2TableUniqueKey object,
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.code.Nullable;
        sb.append("  ORDER BY C.CONSTNAME");

 * See the License for the specific language governing permissions and
        sb.append("         , KCU.COLSEQ");
import java.util.List;
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * you may not use this file except in compliance with the License.
            return null;
        DB2TableColumn tableColumn = db2Table.getAttribute(session.getProgressMonitor(), colName);

    public DB2TableUniqueKeyCache(DB2TableCache tableCache)
 *
            log.debug("Column '" + colName + "' not found in table '" + db2Table.getFullyQualifiedName(DBPEvaluationContext.UI) + "' ??");
    protected DB2TableUniqueKey fetchObject(
        sb.append("       ,SYSCAT.KEYCOLUSE KCU");
        sb.append(" WITH UR");
        sb.append("    AND KCU.CONSTNAME = C.CONSTNAME");
        sb.append("   FROM SYSCAT.TABCONST C");

        return new DB2TableUniqueKey(session.getProgressMonitor(), db2Table, dbResult, type);
        return dbStat;
        }
        if (forTable != null) {
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
        StringBuilder sb = new StringBuilder(512);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
        sb.append("    AND KCU.TABSCHEMA = C.TABSCHEMA");
        sb.append(" WITH UR");
    protected DB2TableKeyColumn[] fetchObjectRow(
        } else {
        sb.append("    AND C.TYPE IN ('P','U')");
    {

 *
            dbStat.setString(2, forTable.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        String sql;
        sb.append("      , KCU.COLSEQ");
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull DB2TableUniqueKey constraint, @NotNull List<DB2TableKeyColumn> rows)
        sb.append("    AND C.TABNAME = ?");
        sb.append("    AND KCU.TABNAME   = C.TABNAME");
        if (tableColumn == null) {

    }
        sb.append("         , KCU.COLSEQ");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        String colName = JDBCUtils.safeGetString(dbResult, "COLNAME");
        sb.append("    AND C.TYPE IN ('P','U')");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        sb.append("    AND KCU.CONSTNAME = C.CONSTNAME");

    @Override
        sb.append(" SELECT C.*");
        SQL_UK_TAB = sb.toString();
        throws SQLException
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
