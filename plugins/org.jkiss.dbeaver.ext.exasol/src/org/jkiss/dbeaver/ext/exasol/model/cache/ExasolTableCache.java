				dbResult);
		@NotNull ExasolTable parent,
	}
		String sql = String.format(SQL_TABLES, exasolSchema.getName());
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;

		JDBCStatement dbstat = session.createStatement();
		
 *     http://www.apache.org/licenses/LICENSE-2.0
			"SYS.%s_COLUMNS c " + 
			"WHERE " + 

		
			sql = String.format(SQL_COLS_TAB,tablePrefix, ExasolUtils.quoteString(exasolSchema.getName()),ExasolUtils.quoteString(exasolTable.getName()));
			"FROM " + 
 */
	}
package org.jkiss.dbeaver.ext.exasol.model.cache;
 * Unless required by applicable law or agreed to in writing, software
			"SYS.%s_COLUMNS c " + 
		
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

		return dbstat;
	private static final String SQL_TABLES = "/*snapshot execution*/ select OWNER,OBJECT_ID,TABLE_CAT,TABLE_SCHEM,TABLE_NAME as COLUMN_TABLE,TABLE_TYPE,REMARKS,TYPE_CAT,TYPE_SCHEM,TYPE_NAME,SELF_REFERENCING_COL_NAME,REF_GENERATION from \"$ODBCJDBC\".ALL_TABLES WHERE TABLE_SCHEM = '%s' and TABLE_TYPE = 'TABLE' order by TABLE_NAME";

			"COLUMN_ORDINAL_POSITION ";
		else
			"AND COLUMN_TABLE = '%s' " + 

 * DBeaver - Universal Database Manager
		if (exasolTable != null)
			"c.* " + 

		@NotNull ExasolSchema exasolSchema,
		@NotNull JDBCSession session,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		return dbstat;
 *

		extends JDBCStructCache<ExasolSchema, ExasolTable, ExasolTableColumn> {
		String sql;
	public ExasolTableCache()
		@NotNull ExasolSchema exasolSchema
	) throws DBException {
			"ORDER BY " + 
 * You may obtain a copy of the License at
		JDBCStatement dbstat = session.createStatement();
    @Override
	protected JDBCStatement prepareObjectsStatement(
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
		@Nullable ExasolTable exasolTable
import java.sql.SQLException;
		return new ExasolTable(session.getProgressMonitor(), owner, resultSet);
			"COLUMN_SCHEMA = '%s' AND COLUMN_OBJECT_TYPE = 'TABLE' " + 
	
	@SuppressWarnings("rawtypes")
		@NotNull JDBCResultSet dbResult
 * distributed under the License is distributed on an "AS IS" BASIS,
		super("COLUMN_TABLE");
/*
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
	@Override
	}
import org.jkiss.code.NotNull;

	}

	) throws DBException {
	protected ExasolTable fetchObject(
		dbstat.setQueryString(sql);
 *

		@NotNull JDBCSession session,
import org.jkiss.code.Nullable;
	) throws SQLException {

 *
import org.jkiss.dbeaver.DBException;
			sql = String.format(SQL_COLS_ALL,tablePrefix, ExasolUtils.quoteString(exasolSchema.getName()));

 * limitations under the License.
}
			"WHERE " + 
		String tablePrefix = exasolSchema.getDataSource().getTablePrefix(ExasolSysTablePrefix.ALL);

	) throws SQLException {
	@Override
		@NotNull ExasolSchema owner,
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableColumn;
	protected ExasolTableColumn fetchChild(
	@NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
	private static final String SQL_COLS_ALL = "/*snapshot execution*/ SELECT " + 
			"c.* " + 
		dbstat.setQueryString(sql);
			"COLUMN_ORDINAL_POSITION ";
	{

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
		@NotNull JDBCResultSet resultSet
			"COLUMN_SCHEMA = '%s' " + 
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
 * See the License for the specific language governing permissions and
public final class ExasolTableCache
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
	protected JDBCStatement prepareChildrenStatement(
			"FROM " + 
	private static final String SQL_COLS_TAB = "/*snapshot execution*/ SELECT " + 
		return new ExasolTableColumn(session.getProgressMonitor(), parent,
			"ORDER BY " + 
		@NotNull JDBCSession session,
	}
		@NotNull JDBCSession session,
 * Licensed under the Apache License, Version 2.0 (the "License");
		@NotNull ExasolSchema owner,
	@Override
