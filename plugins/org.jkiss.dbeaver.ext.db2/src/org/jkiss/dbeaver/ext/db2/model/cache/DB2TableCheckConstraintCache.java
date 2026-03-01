            JDBCUtils.safeGetString(dbResult, "USAGE"));
    }
        return dbStat;
        sb.append("  ORDER BY CK.COLNAME");
    protected DB2TableCheckConstraintColumn[] fetchObjectRow(
public final class DB2TableCheckConstraintCache extends
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
        DB2TableCheckConstraintColUsage usage = CommonUtils.valueOf(DB2TableCheckConstraintColUsage.class,
    }
            log.debug("Column '" + colName + "' not found in table '" + db2Table.getFullyQualifiedName(DBPEvaluationContext.UI) + "' ??");
import java.util.List;
    @Override
        dbStat.setString(1, db2Schema.getName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        }

        } else {
        } else {
import org.jkiss.code.Nullable;
        sb.append("    AND CK.TABNAME   = C.TABNAME");
 *
    }
import java.sql.SQLException;

    static {
        sb.append("  ORDER BY CK.COLNAME");
            sql = SQL_CK_TAB;
        sb.append("   FROM SYSCAT.CHECKS C");
/*
/**
    public DB2TableCheckConstraintCache(DB2TableCache tableCache)
        sb.append(" WITH UR");
        StringBuilder sb = new StringBuilder(512);
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String sql;
 * @author Denis Forveille
 */
        sb.setLength(0);
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull DB2TableCheckConstraint constraint, @NotNull List<DB2TableCheckConstraintColumn> rows)
    @Nullable
        throws SQLException
        sb.append("      , CK.COLNAME");
        return new DB2TableCheckConstraint(session.getProgressMonitor(), db2Table, dbResult);
        if (tableColumn == null) {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableCheckConstraintColUsage;
            return null;
 * Cache for DB2 Table Check Constraints

        sb.append(" SELECT C.*");
import org.jkiss.dbeaver.DBException;
        sb.append("      , CK.USAGE");
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @Nullable DB2Table forTable)
 * DBeaver - Universal Database Manager
    }
        sb.append(" WITH UR");
 * limitations under the License.
 */
        sb.append("    AND C.TABNAME = ?");
            return new DB2TableCheckConstraintColumn[] { new DB2TableCheckConstraintColumn(object, tableColumn, usage) };
            dbStat.setString(2, forTable.getName());
 * See the License for the specific language governing permissions and
    {
        }
    {
        @NotNull JDBCSession session, @NotNull DB2Table db2Table,
        constraint.setAttributeReferences(rows);


        sb.append("       ,SYSCAT.COLCHECKS  CK");
}
    protected DB2TableCheckConstraint fetchObject(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        super(tableCache, DB2Table.class, "TABNAME", "CONSTNAME");
    }
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
 *

        sb.append(" SELECT C.*");
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    @Override
    }
        if (forTable != null) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        @NotNull DB2TableCheckConstraint object, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        DB2TableColumn tableColumn = db2Table.getAttribute(session.getProgressMonitor(), colName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        SQL_CK_ALL = sb.toString();
        @NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2Table db2Table,
        sb.append("    AND CK.TABNAME   = C.TABNAME");
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.NotNull;
        }
    @NotNull
        sb.append("  WHERE C.TABSCHEMA = ?");

        sb.append("    AND CK.CONSTNAME = C.CONSTNAME");
 * you may not use this file except in compliance with the License.
    {
        sb.append("       ,SYSCAT.COLCHECKS  CK");
        if (forTable != null) {
    private static final String SQL_CK_ALL;
        sb.append("   FROM SYSCAT.CHECKS C");
 * Unless required by applicable law or agreed to in writing, software
        sb.append("    AND CK.TABSCHEMA = C.TABSCHEMA");
package org.jkiss.dbeaver.ext.db2.model.cache;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.ext.db2.model.*;
        sb.append("    AND CK.CONSTNAME = C.CONSTNAME");
        @NotNull String indexName, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        sb.append("      , CK.USAGE");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    JDBCCompositeCache<DB2Schema, DB2Table, DB2TableCheckConstraint, DB2TableCheckConstraintColumn> {
        SQL_CK_TAB = sb.toString();
    private static final String SQL_CK_TAB;
            sql = SQL_CK_ALL;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {



        String colName = JDBCUtils.safeGetString(dbResult, "COLNAME");
        sb.append("      , CK.COLNAME");

        sb.append("    AND CK.TABSCHEMA = C.TABSCHEMA");

    @Nullable
        sb.append("  WHERE C.TABSCHEMA = ?");
 * 

