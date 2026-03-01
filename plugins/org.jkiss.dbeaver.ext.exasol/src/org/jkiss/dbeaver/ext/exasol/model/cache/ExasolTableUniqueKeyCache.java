        "	WHERE\r\n" + 
    ) throws DBException {
    		"	cc.ORDINAL_POSITION,\r\n" + 
        "		c.CONSTRAINT_SCHEMA = '%s'\r\n" + 
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        //SQLs only return primary keys. no unique constraints in exasol


        }
        "	c.CONSTRAINT_TYPE,\r\n" + 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final String SQL_UK_ALL =
    		"	C.CONSTRAINT_SCHEMA,\r\n" + 
        "INNER JOIN (SELECT * FROM SYS.EXA_ALL_CONSTRAINT_COLUMNS c " +
        @NotNull ExasolTableUniqueKey object,
    }
            "	(SELECT * FROM SYS.EXA_ALL_CONSTRAINTS c" +
import org.jkiss.code.NotNull;
        "	cc.REFERENCED_TABLE\r\n" + 

    }
            "		AND c.CONSTRAINT_TYPE = cc.CONSTRAINT_TYPE\r\n" + 
        @NotNull JDBCSession session,
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        "	c.CONSTRAINT_NAME,\r\n" + 
        return new ExasolTableUniqueKey(session.getProgressMonitor(), exasolTable, dbResult, type);
import org.jkiss.dbeaver.ext.exasol.model.*;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            "		c.CONSTRAINT_SCHEMA = cc.CONSTRAINT_SCHEMA\r\n" + 
    @Override
    		"	cc.COLUMN_NAME,\r\n" + 
            "		c.CONSTRAINT_SCHEMA = '%s'\r\n" + 
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private static final String SQL_UK_TAB =
}
            sql = String.format(SQL_UK_ALL,ExasolUtils.quoteString(exasolSchema.getName()),ExasolUtils.quoteString(exasolSchema.getName()));
package org.jkiss.dbeaver.ext.exasol.model.cache;
                new ExasolTableKeyColumn(object, tableColumn, JDBCUtils.safeGetInteger(dbResult, "ORDINAL_POSITION"))
             * Exasol always verify not null for columns in a PK
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull ExasolTableUniqueKey constraint, @NotNull List<ExasolTableKeyColumn> rows) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    extends JDBCCompositeCache<ExasolSchema, ExasolTable, ExasolTableUniqueKey, ExasolTableKeyColumn> {
        } else {
        "	(SELECT * FROM SYS.EXA_ALL_CONSTRAINTS c" +
    @Nullable
        "/*snapshot execution*/ SELECT\r\n" + 
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
    
            "	(\r\n" + 
            return null;

 * limitations under the License.
            sql = String.format(SQL_UK_TAB,ExasolUtils.quoteString(exasolSchema.getName()), ExasolUtils.quoteString(forTable.getName()),ExasolUtils.quoteString(exasolSchema.getName()), ExasolUtils.quoteString(forTable.getName()));
        @NotNull String constName,
 * Unless required by applicable law or agreed to in writing, software
    public ExasolTableUniqueKeyCache(ExasolTableCache tableCache) {
        @NotNull ExasolTable exasolTable,
import java.util.List;
        "	c.CONSTRAINT_ENABLED,\r\n" + 
    		"	cc.REFERENCED_SCHEMA,\r\n" + 
        } else {
        if (forTable != null) {
            };
        "		AND c.CONSTRAINT_TABLE = '%s' order by 1,2,3,4\r\n" + 

        "		AND c.CONSTRAINT_TYPE = 'PRIMARY KEY'\r\n" + 
        dbStat.setQueryString(sql);
        "	cc.COLUMN_NAME,\r\n" + 
            "		c.CONSTRAINT_SCHEMA = '%s'\r\n" + 
        "	WHERE\r\n" + 
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    		"/*snapshot execution*/ SELECT\r\n" + 
        "	cc.ORDINAL_POSITION,\r\n" + 
    protected ExasolTableKeyColumn[] fetchObjectRow(
        "	) c\r\n" + 
        String columnName = JDBCUtils.safeGetString(dbResult, "COLUMN_NAME");

 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        JDBCStatement dbStat = session.createStatement();
	@NotNull
            "		AND c.CONSTRAINT_TABLE = cc.CONSTRAINT_TABLE\r\n" + 

    @NotNull
 * DBeaver - Universal Database Manager
    		"	cc.REFERENCED_COLUMN,\r\n" + 
    ) throws DBException {
 * You may obtain a copy of the License at
        "		AND c.CONSTRAINT_TABLE = cc.CONSTRAINT_TABLE\r\n" + 
import org.jkiss.code.Nullable;


 * you may not use this file except in compliance with the License.
    		"	c.CONSTRAINT_TYPE,\r\n" + 
        "		AND c.CONSTRAINT_OWNER = cc.CONSTRAINT_OWNER\r\n" + 
            "	)cc ON\r\n" + 
        "		AND c.CONSTRAINT_TYPE = 'PRIMARY KEY'\r\n" + 
            "	ORDINAL_POSITION";
        constraint.setAttributeReferences(rows);
        @NotNull JDBCResultSet dbResult

        "	C.CONSTRAINT_SCHEMA,\r\n" + 
            tableColumn.setRequired(true);
    		"	cc.REFERENCED_TABLE\r\n" + 
            "	WHERE\r\n" + 
    		"	c.CONSTRAINT_OWNER,\r\n" + 
        ExasolTableColumn tableColumn = exasolTable.getAttribute(session.getProgressMonitor(), columnName);
 *
        "	ORDINAL_POSITION";
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull ExasolTable exasolTable,
        "	c.CONSTRAINT_OWNER,\r\n" + 
        "	cc.REFERENCED_COLUMN,\r\n" + 
            "ORDER BY\r\n" + 
        @NotNull JDBCResultSet dbResult
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        "		c.CONSTRAINT_SCHEMA = '%s'\r\n" + 
            "		AND c.CONSTRAINT_TYPE = 'PRIMARY KEY'\r\n" + 
            "INNER JOIN (SELECT * FROM SYS.EXA_ALL_CONSTRAINT_COLUMNS c " +
        throws SQLException {
        "	c.CONSTRAINT_TABLE,\r\n" + 
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        String sql;
        "ORDER BY\r\n" + 
        "	)cc ON\r\n" + 
        "		AND c.CONSTRAINT_TABLE = '%s' order by 1,2,3,4\r\n" + 
        "	(\r\n" + 
            /* verify that the column is not null -> even though it is not in the meta data
    @Override
    }
            "	)\r\n" + 

    		;		
            "		AND c.CONSTRAINT_NAME = cc.CONSTRAINT_NAME\r\n" + 
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull ExasolSchema exasolSchema, @Nullable ExasolTable forTable)
    }
    @Override
import java.sql.SQLException;
            "		AND c.CONSTRAINT_TYPE = 'PRIMARY KEY'\r\n" + 
        DBSEntityConstraintType type = DBSEntityConstraintType.PRIMARY_KEY;
/*
        "		c.CONSTRAINT_SCHEMA = cc.CONSTRAINT_SCHEMA\r\n" + 
        @NotNull JDBCSession session,

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        @NotNull ExasolSchema exasolSchema,
    		"	c.CONSTRAINT_ENABLED,\r\n" + 
        "	cc.REFERENCED_SCHEMA,\r\n" + 
    		"	c.CONSTRAINT_NAME,\r\n" + 
        if (tableColumn == null) {
             * this is necessary for the automatic unique identifiers detection to work
        "		AND c.CONSTRAINT_NAME = cc.CONSTRAINT_NAME\r\n" + 
            log.info("Column '" + columnName + "' not found in table '" + exasolTable.getFullyQualifiedName(DBPEvaluationContext.UI) + "' ??");
        "	)\r\n" + 
            return new ExasolTableKeyColumn[]{
        "		AND c.CONSTRAINT_TYPE = cc.CONSTRAINT_TYPE\r\n" + 

    		"	c.CONSTRAINT_TABLE,\r\n" + 
import org.jkiss.dbeaver.DBException;
            "		AND c.CONSTRAINT_OWNER = cc.CONSTRAINT_OWNER\r\n" + 

 */

            "		order by 1,2,3,4\r\n" + 
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            "		order by 1,2,3,4\r\n" + 
        return dbStat;
    @SuppressWarnings("rawtypes")

    protected ExasolTableUniqueKey fetchObject(
        super(tableCache, ExasolTable.class, "CONSTRAINT_TABLE", "CONSTRAINT_NAME");
            "	WHERE\r\n" + 
             */
            "	) c\r\n" + 
            "FROM\r\n" + 
public final class ExasolTableUniqueKeyCache
        "FROM\r\n" + 
