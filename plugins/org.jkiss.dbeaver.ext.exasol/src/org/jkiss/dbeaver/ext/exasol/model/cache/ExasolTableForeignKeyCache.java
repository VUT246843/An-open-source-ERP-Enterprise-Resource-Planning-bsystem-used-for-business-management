 * distributed under the License is distributed on an "AS IS" BASIS,

            " 		) cc\r\n" +
        @NotNull JDBCSession session,
                JDBCUtils.safeGetInt(dbResult, "ORDINAL_POSITION"))
            "		ORDINAL_POSITION";
 * @author Karl
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    extends JDBCCompositeCache<ExasolSchema, ExasolTable, ExasolTableForeignKey, ExasolTableForeignKeyColumn> {
                ExasolUtils.quoteString(forTable.getName()),
    @Nullable
        if (tableColumn == null) {
    protected ExasolTableForeignKey fetchObject(
            "	where\r\n" +
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @NotNull
            "			)\r\n" +
        @Nullable ExasolTable forTable
        if (refColumn == null) {
        super(tableCache, ExasolTable.class, "CONSTRAINT_TABLE", "CONSTRAINT_NAME");
        return new ExasolTableForeignKey(session.getProgressMonitor(), ExasolTable, dbResult);
    private static final String SQL_FK_ALL =
            "				CONSTRAINT_TYPE = 'FOREIGN KEY' AND CONSTRAINT_TABLE = '%s' \r\n" +
        String colName = JDBCUtils.safeGetString(dbResult, "COLUMN_NAME");
        ExasolTable refTable = object.getReferencedConstraint() == null ? null : object.getReferencedConstraint().getTable();
            "			where\r\n" +
                ExasolUtils.quoteString(exasolSchema.getName()),
/**
    protected ExasolTableForeignKeyColumn[] fetchObjectRow(
        @NotNull ExasolSchema exasolSchema,
        @NotNull JDBCSession session,
 *
import java.sql.SQLException;
            sql = String.format(SQL_FK_ALL,
        "/*snapshot execution*/ select\r\n" +
                ExasolUtils.quoteString(exasolSchema.getName()),
    ) throws DBException {
            "cc.column_name,cc.ordinal_position,cc.referenced_schema,cc.referenced_table,cc.referenced_column" +
            "				CONSTRAINT_TYPE = 'FOREIGN KEY' AND CONSTRAINT_TABLE = '%s' \r\n" +
        if (forTable != null) {

        }
            "				CONSTRAINT_SCHEMA, CONSTRAINT_TABLE, CONSTRAINT_NAME, CONSTRAINT_OWNER, CONSTRAINT_TYPE\r\n" +
            "		CONSTRAINT_NAME,CONSTRAINT_TABLE,CONSTRAINT_SCHEMA,constraint_owner,c.constraint_enabled,constraint_Type," +
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        
            "		(SELECT * FROM 	EXA_ALL_CONSTRAINTS " +

        @NotNull String constName,
            "				CONSTRAINT_SCHEMA = '%s' and\r\n" +
    public ExasolTableForeignKeyCache(ExasolTableCache tableCache) {

    ) throws SQLException {
    @Override
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            "        ORDER BY 1,2,3 \r\n" +
        if (refTable == null) {
            "	from\r\n" +
            "			(\r\n" +
 */
        String refColName = JDBCUtils.safeGetString(dbResult, "REFERENCED_COLUMN");
            "			where\r\n" +
            log.error("ExasolTableForeignKeyCache : Column '" + colName + "' not found in table '" + table.getFullyQualifiedName(DBPEvaluationContext.UI) + "' ??");
        @NotNull ExasolTableForeignKey object,
            "			)\r\n" +
            return null;
        } else {
        String sql;
                refColumn,
            "		CONSTRAINT_SCHEMA = '%s' and\r\n" +
            "		ORDINAL_POSITION";
    }
        ExasolTableColumn tableColumn = table.getAttribute(session.getProgressMonitor(), colName);
        dbStat.setQueryString(sql);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                ExasolUtils.quoteString(exasolSchema.getName()));
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        @NotNull ExasolTable ExasolTable,

            "		inner join\r\n" +
    @Override
 * limitations under the License.
            log.error("ExasolTableForeignKeyCache : RefTable not found for FK '" + object.getFullyQualifiedName(DBPEvaluationContext.UI) + "' ??");
            "        )c\r\n" +

        

            new ExasolTableForeignKeyColumn(
            "		CONSTRAINT_NAME,CONSTRAINT_TABLE,CONSTRAINT_SCHEMA,constraint_owner,c.constraint_enabled,constraint_Type," +
                ExasolUtils.quoteString(exasolSchema.getName()),
    private static final String SQL_FK_TAB =
            "		(SELECT * FROM EXA_ALL_CONSTRAINT_COLUMNS " +
            "	order by\r\n" +
 * See the License for the specific language governing permissions and
                ExasolUtils.quoteString(exasolSchema.getName()),
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public final class ExasolTableForeignKeyCache
}
    ) throws DBException {
            "		(SELECT * FROM 	EXA_ALL_CONSTRAINTS " +
                object,
            return null;
            "		(SELECT * FROM EXA_ALL_CONSTRAINT_COLUMNS " +
            "        )c\r\n" +
            "				CONSTRAINT_SCHEMA = '%s' and\r\n" +

    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull ExasolTableForeignKey constraint, @NotNull List<ExasolTableForeignKeyColumn> rows) {
            sql = String.format(SQL_FK_TAB,
 * Copyright (C) 2010-2025 DBeaver Corp and others
            "	using\r\n" +
                tableColumn,
/*
            "        ORDER BY 1,2,3 \r\n" +
        @NotNull ExasolSchema ExasolSchema,
            "				CONSTRAINT_SCHEMA = '%s' and\r\n" +

import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
        return new ExasolTableForeignKeyColumn[]{

        };
            "		inner join\r\n" +
    }
    }

            "		CONSTRAINT_SCHEMA = '%s' and\r\n" +
import org.jkiss.dbeaver.ext.exasol.model.*;
    @NotNull
            log.error("ExasolTableForeignKeyCache : RefColumn '" + refColName + "' not found in table '" + table.getFullyQualifiedName(DBPEvaluationContext.UI) + "' ??");
            "				CONSTRAINT_TYPE = 'FOREIGN KEY'\r\n" +
import java.util.List;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        "/*snapshot execution*/ select\r\n" +
        }
 */
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
            return null;
            "			where\r\n" +
        @NotNull ExasolTable table,
        @NotNull JDBCResultSet dbResult
            "		CONSTRAINT_TYPE = 'FOREIGN KEY' \r\n" +
            "        ORDER BY 1,2,3 \r\n" +
 *
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
    protected JDBCStatement prepareObjectsStatement(
            "				CONSTRAINT_SCHEMA = '%s' and\r\n" +
 * you may not use this file except in compliance with the License.
            "				CONSTRAINT_TYPE = 'FOREIGN KEY'  \r\n" +
        }
 * DBeaver - Universal Database Manager
                ExasolUtils.quoteString(forTable.getName()));
            "	where\r\n" +
 *     http://www.apache.org/licenses/LICENSE-2.0
                ExasolUtils.quoteString(exasolSchema.getName()),
            "	using\r\n" +
        return dbStat;
            "				CONSTRAINT_SCHEMA, CONSTRAINT_TABLE, CONSTRAINT_NAME, CONSTRAINT_OWNER, CONSTRAINT_TYPE\r\n" +
 *
package org.jkiss.dbeaver.ext.exasol.model.cache;
            "			where\r\n" +
            "	from\r\n" +
            " 		) cc\r\n" +
        ExasolTableColumn refColumn = refTable.getAttribute(session.getProgressMonitor(), refColName);
        @NotNull JDBCResultSet dbResult
        JDBCStatement dbStat = session.createStatement();
                ExasolUtils.quoteString(forTable.getName()),
            "			(\r\n" +
    @Override
            "	order by\r\n" +
            "cc.column_name,cc.ordinal_position,cc.referenced_schema,cc.referenced_table,cc.referenced_column" +
            "		CONSTRAINT_TYPE = 'FOREIGN KEY' AND CONSTRAINT_TABLE = '%s' \r\n" +
import org.jkiss.dbeaver.DBException;
            "        ORDER BY 1,2,3 \r\n" +
        @NotNull JDBCSession session,
    }
import org.jkiss.code.NotNull;

        constraint.setAttributeReferences(rows);
