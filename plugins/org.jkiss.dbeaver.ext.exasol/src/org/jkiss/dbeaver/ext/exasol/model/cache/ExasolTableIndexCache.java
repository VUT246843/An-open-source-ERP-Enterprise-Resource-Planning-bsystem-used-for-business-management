	}
		
package org.jkiss.dbeaver.ext.exasol.model.cache;
		StringBuilder sql = new StringBuilder(
				
		
							QUERYINDEX, 

 */
	}
	protected ExasolTableIndex fetchObject(
		@Nullable ExasolTable table
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
		ExasolTableIndexColumn[] arrayIndexCols = new ExasolTableIndexColumn[indexCols.size()];
/*

import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
					new ExasolTableIndexColumn(forObject, tableColumn, i + 1)
import org.jkiss.code.NotNull;

		
	}
				indexCols.add(
		
	protected JDBCStatement prepareObjectsStatement(
		if (table != null) {

				ExasolTableColumn tableColumn = colString[i] == null ? null
 *
		
		index.setColumns(cols);
 *
			colString = m.group(1).split(",");
							tablePrefix,
		@NotNull JDBCResultSet resultSet
		@NotNull ExasolTable parent,
	@NotNull
		@NotNull ExasolSchema schema,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
		

		

			sql.append(
 * distributed under the License is distributed on an "AS IS" BASIS,
			for (int i = 0; i < colString.length; i++) {
	protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull ExasolTableIndex index, @NotNull List<ExasolTableIndexColumn> cols) {
	private static final String QUERYINDEX = "/*snapshot execution*/ SELECT * FROM SYS.%s_INDICES WHERE INDEX_SCHEMA = '%s'";

import java.util.regex.Pattern;
		}
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
			);
		@NotNull JDBCSession session,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		if (m.find()) {
import org.jkiss.code.Nullable;

	@Override
		return new ExasolTableIndex(session.getProgressMonitor(), table, indexName, dbResult);
		String[] colString;
		@NotNull JDBCSession session,
 * DBeaver - Universal Database Manager
		ArrayList<ExasolTableIndexColumn> indexCols = new ArrayList<>();
	) throws DBException {
		// table provided - append filter
		@NotNull String indexName,
		@NotNull ExasolTableIndex forObject,
 * you may not use this file except in compliance with the License.
		return arrayIndexCols;
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
		@NotNull JDBCSession session,
	}
		//ToDo: fix regex
		super(parentCache, ExasolTable.class, "INDEX_TABLE", "REMARKS");
	}
		
import java.sql.SQLException;
 *
		@NotNull JDBCResultSet dbResult
				String.format(
}
	protected ExasolTableIndexColumn[] fetchObjectRow(
import org.jkiss.dbeaver.ext.exasol.model.*;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
	) {
		JDBCStatement dbstat =  session.createStatement();
		return dbstat;

		}
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2025 DBeaver Corp and others
		
							ExasolUtils.quoteString(schema.getName())

 * limitations under the License.
public class ExasolTableIndexCache extends JDBCCompositeCache<ExasolSchema, ExasolTable, ExasolTableIndex, ExasolTableIndexColumn> {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
import java.util.regex.Matcher;
		
		arrayIndexCols = indexCols.toArray(arrayIndexCols);
import org.jkiss.dbeaver.DBException;
	public ExasolTableIndexCache(ExasolTableCache parentCache) {
					String.format(" AND INDEX_TABLE = '%s'", ExasolUtils.quoteString(table.getName()))
					: parent.getAttribute(session.getProgressMonitor(), colString[i]);
 * You may obtain a copy of the License at
		Matcher m = indexCols.matcher(JDBCUtils.safeGetString(resultSet, "REMARKS"));

    @Override
	private static final Pattern indexCols = Pattern.compile(".+\\((.+)\\)");
 * See the License for the specific language governing permissions and
		String tablePrefix = schema.getDataSource().getTablePrefix(ExasolSysTablePrefix.ALL);
	) throws SQLException {
				);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
						)
import java.util.List;
		
			}
		dbstat.setQueryString(sql.toString());
				);
	@Override

	@Override
		@NotNull ExasolSchema schema,

		@NotNull ExasolTable table,
