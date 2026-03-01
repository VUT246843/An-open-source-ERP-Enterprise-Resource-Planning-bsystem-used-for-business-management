            "  ORDER BY R.REFKEYNAME" +

            "    AND KCU.TABNAME   = R.REFTABNAME" +
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
        return new DB2TableReference(session.getProgressMonitor(), ownerTable, dbResult);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            return new DB2TableKeyColumn[]  {
        if (tableColumn == null) {
    @Override
        @NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2Table db2Table, @NotNull String constName,
            "    AND R.REFTABNAME = ?" +
    }
    }
        SQL_REF_TAB = " SELECT R.*" +
            "      , KCU.COLSEQ" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        throws SQLException

 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.db2.model.cache;
            "  WHERE R.REFTABSCHEMA = ?" +
    @Nullable

    {
        }
    {
        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
            " WITH UR";
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull DB2TableReference constraint, @NotNull List<DB2TableKeyColumn> rows)
            "      , KCU.COLNAME" +
            " WITH UR";

        SQL_REF_ALL = " SELECT R.*" +
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @Nullable DB2Table forTable)
 * Unless required by applicable law or agreed to in writing, software
            "  ORDER BY R.REFKEYNAME" +
}
        String sql;
    public DB2TableReferenceCache(DB2TableCache tableCache)

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            "   FROM SYSCAT.REFERENCES R" +
            sql = SQL_REF_ALL;
            log.error("Cannot find reference owner table " + ownerSchemaName + "." + ownerTableName);
            "         , KCU.COLSEQ" +

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.db2.model.*;
        super(tableCache, DB2Table.class, "REFTABNAME", "CONSTNAME");
import java.sql.SQLException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;


        }
            "  WHERE R.REFTABSCHEMA = ?" +
import java.util.List;
    @NotNull
 * 
import org.jkiss.dbeaver.DBException;
            dbStat.setString(2, forTable.getName());
        dbStat.setString(1, db2Schema.getName());
            sql = SQL_REF_TAB;
            return null;
        constraint.setAttributeReferences(rows);
            };
            "   FROM SYSCAT.REFERENCES R" +
 * distributed under the License is distributed on an "AS IS" BASIS,
            "    AND KCU.TABSCHEMA = R.REFTABSCHEMA" +
 */
            "       ,SYSCAT.KEYCOLUSE KCU" +
        DB2TableColumn tableColumn = db2Table.getAttribute(session.getProgressMonitor(), colName);
        } else {
            "    AND KCU.CONSTNAME = R.REFKEYNAME" +
    static {
public final class DB2TableReferenceCache extends JDBCCompositeCache<DB2Schema, DB2Table, DB2TableReference, DB2TableKeyColumn> {
        } else {
    }
            "      , KCU.COLSEQ" +
 *
        @NotNull JDBCSession session, @NotNull DB2Table db2Table,
        String ownerTableName = JDBCUtils.safeGetString(dbResult, "TABNAME");
            "       ,SYSCAT.KEYCOLUSE KCU" +
        }
        DB2Table ownerTable = DB2Utils.findTableBySchemaNameAndName(
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
    protected DB2TableKeyColumn[] fetchObjectRow(
    @Override
import org.jkiss.dbeaver.ext.db2.DB2Utils;
    @Nullable
    }
        String colName = JDBCUtils.safeGetString(dbResult, "COLNAME");
 * limitations under the License.
            "    AND KCU.TABNAME   = R.REFTABNAME" +
            session.getProgressMonitor(), db2Schema.getDataSource(), ownerSchemaName, ownerTableName);
        @NotNull DB2TableReference db2TableReference, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;

/*
 * See the License for the specific language governing permissions and
        String ownerSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static final String SQL_REF_ALL;
    public static final String SQL_REF_TAB;
                new DB2TableKeyColumn(db2TableReference, tableColumn, JDBCUtils.safeGetInt(dbResult, "COLSEQ"))
    protected DB2TableReference fetchObject(
 *
 * @author Denis Forveille
            "    AND KCU.TABSCHEMA = R.REFTABSCHEMA" +
            log.debug("DB2TableReferenceCache : Column '" + colName + "' not found in table '" + db2Table.getName() + "' ??");
    }


        if (ownerTable == null) {
        if (forTable != null) {
        return dbStat;
 */
            "      , KCU.COLNAME" +
            "         , KCU.COLSEQ" +
            return null;
 * Cache for DB2 Table Forign Keys (Reverse)

/**
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (forTable != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
 *
            "    AND KCU.CONSTNAME = R.REFKEYNAME" +
    {
