        return new ExasolView(session.getProgressMonitor(), exasolSchema, dbResult);
	            sql = String.format(SQL_COLS_VIEW,tablePrefix, ExasolUtils.quoteString(exasolSchema.getName()), ExasolUtils.quoteString(forView.getName())) ;
			"	COLUMN_IS_NULLABLE as COLUMN_IS_NULLABLE	, " + 
			"	'VIEW' as COLUMN_OBJECT_TYPE, " + 
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
			"SYS.%s_COLUMNS c " + 
			"	TYPE_NAME  , " + 
			"	TABLE_SCHEM as COLUMN_SCHEMA, " + 
			if (forView != null) {
		}
		@NotNull JDBCResultSet dbResult
		
			"	CHAR_OCTET_LENGTH, " + 

    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
			"COLUMN_ORDINAL_POSITION ";
			"	TABLE_NAME as COLUMN_TABLE, " + 
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableColumn;
    }
		@NotNull ExasolSchema exasolSchema,
	@NotNull
			"	COLUMN_NAME as COLUMN_NAME, " + 
			"	TABLE_CAT, " + 
			"ORDER BY " + 
        String sql;
		@NotNull ExasolSchema exasolSchema,
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull ExasolSchema exasolSchema) throws SQLException {

			"	SCOPE_CATALOG, " + 
 * Licensed under the Apache License, Version 2.0 (the "License");
        
	        } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            " union all select 'SYS',-1,' ',SCHEMA_name, object_name as column_table, object_type,object_comment,null, null,null,null,null from EXA_SYSCAT where SCHEMA_NAME = '%s' order by TABLE_NAME";
		dbstat.setQueryString(sql);
    protected JDBCStatement prepareChildrenStatement(
			"COLUMN_SCHEMA = '%s' AND COLUMN_OBJECT_TYPE = 'VIEW' " + 
 * limitations under the License.
			"	'SYS' as COLUMN_OWNER, " + 
			"AND COLUMN_TABLE = '%s' " + 
			"COLUMN_SCHEMA = '%s' " + 
		@NotNull JDBCSession session,
			"	DATA_TYPE as COLUMN_TYPE_ID, " + 

 * Copyright (C) 2010-2025 DBeaver Corp and others
	private static final String SQL_COLS_VIEW = "/*snapshot execution*/ SELECT " + 
			"FROM  \"$ODBCJDBC\".ALL_COLUMNS  " + 
        super("COLUMN_TABLE");

			"	SOURCE_DATA_TYPE, " + 
			"FROM " + 
			"	COLUMN_COMMENT as COLUMN_COMMENT, " + 
        JDBCStatement dbStat = session.createStatement();
		String tablePrefix = exasolSchema.getDataSource().getTablePrefix(ExasolSysTablePrefix.ALL);
	        }
 *
			"	COLUMN_NAME as COLUMN_NAME, " + 
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
			"c.* " + 
			"	CAST(null as varchar(128)) as STATUS, " + 
			"	SCOPE_CATALOG, " + 
			"	cast(null as integer) as COLUMN_PARTITION_KEY_ORDINAL_POSITION " + 
import org.jkiss.dbeaver.ext.exasol.model.ExasolView;
import java.sql.SQLException;
	        }
			"FROM " + 
			"	TABLE_NAME as COLUMN_TABLE, " + 
			"SYS.%s_COLUMNS c " + 
    @Override
			"	DATA_TYPE as COLUMN_TYPE_ID, " + 
    @Override
			"WHERE table_schem = '%s' AND table_name = '%s'";
			"	TABLE_CAT, " + 
			"	COLUMN_TYPE, " + 
			"	COLUMN_DEF as COLUMN_DEFAULT, " + 
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Cache for Exasol Views
 */
 *
		} else {

			"WHERE " + 
/*

			"	COLUMN_IDENTITY as COLUMN_IDENTITY, " + 
			"	CAST(null as varchar(128)) as STATUS, " + 
			"	TYPE_NAME  , " + 

public class ExasolViewCache extends JDBCStructCache<ExasolSchema, ExasolView, ExasolTableColumn> {
import org.jkiss.dbeaver.DBException;
		return dbstat;

			"COLUMN_ORDINAL_POSITION ";
			"	IS_NULLABLE, " + 
			"	COLUMN_COMMENT as COLUMN_COMMENT, " + 
			"	REMARKS, " + 

			"	ORDINAL_POSITION as COLUMN_ORDINAL_POSITION, " + 
			"	CHAR_OCTET_LENGTH, " + 
	private static final String SQL_VIEWS = "/*snapshot execution*/ select OWNER,OBJECT_ID,TABLE_CAT,TABLE_SCHEM,TABLE_NAME as COLUMN_TABLE,TABLE_TYPE,REMARKS,TYPE_CAT,TYPE_SCHEM,TYPE_NAME,SELF_REFERENCING_COL_NAME,REF_GENERATION from \"$ODBCJDBC\".ALL_TABLES WHERE TABLE_SCHEM = '%s' and TABLE_TYPE = 'VIEW' " +
	        } else {
			"WHERE " + 
    }
			"	NUM_PREC_RADIX, " + 
			"	DECIMAL_DIGITS as COLUMN_NUM_SCALE, " + 
	private static final String SQL_COLS_SYS_ALL = ""
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			"	COLUMN_SIZE as COLUMN_MAXSIZE, " + 
			"	COLUMN_IS_NULLABLE as COLUMN_IS_NULLABLE	, " + 
			"ORDER BY " + 
			"	COLUMN_IDENTITY as COLUMN_IDENTITY, " + 
			+ "/*snapshot execution*/ SELECT OBJECT_ID as COLUMN_OBJECT_ID, " + 
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.exasol.model.cache;
			"	NULLABLE, " + 
			"	COLUMN_DEF as COLUMN_DEFAULT, " + 
		String sql = String.format(SQL_VIEWS, exasolSchema.getName(),exasolSchema.getName());
			"FROM  \"$ODBCJDBC\".ALL_COLUMNS  " + 
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
			+ "/*snapshot execution*/ SELECT OBJECT_ID as COLUMN_OBJECT_ID, " + 
import org.jkiss.code.NotNull;
			"WHERE table_schem = '%s' ";

 * You may obtain a copy of the License at
			"	NUM_PREC_RADIX, " + 
		@NotNull ExasolView exasolView,
 * DBeaver - Universal Database Manager
			"	REMARKS, " + 
		if (exasolSchema.getName().equals("SYS") || exasolSchema.getName().equals("EXA_STATISTICS")) {
	) throws SQLException {

			"	'SYS' as COLUMN_OWNER, " + 
			"	NULLABLE, " + 
}
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
 * @author Karl Griesser
	private static final String SQL_COLS_SYS_VIEW = ""
			"	SOURCE_DATA_TYPE, " + 
 * distributed under the License is distributed on an "AS IS" BASIS,
        dbStat.setQueryString(sql);
	@Override
	            sql = String.format(SQL_COLS_SYS_ALL, ExasolUtils.quoteString(exasolSchema.getName()));
		@NotNull JDBCSession session,
	private static final String SQL_COLS_ALL = "/*snapshot execution*/ SELECT " + 
			"	SCOPE_SCHEMA, " + 
    protected ExasolView fetchObject(@NotNull JDBCSession session, @NotNull ExasolSchema exasolSchema, @NotNull JDBCResultSet dbResult) {
	            sql = String.format(SQL_COLS_SYS_VIEW, ExasolUtils.quoteString(exasolSchema.getName()), ExasolUtils.quoteString(forView.getName())) ;
			"	IS_NULLABLE, " + 
			"	COLUMN_IS_DISTRIBUTION_KEY as COLUMN_IS_DISTRIBUTION_KEY, " + 
			"	SCOPE_TABLE, " + 
			"c.* " + 
    }
	            sql = String.format(SQL_COLS_ALL,tablePrefix, ExasolUtils.quoteString(exasolSchema.getName()));
    protected ExasolTableColumn fetchChild(
 *




			"	COLUMN_SIZE as COLUMN_MAXSIZE, " + 
 */
    @Override


			"	TABLE_SCHEM as COLUMN_SCHEMA, " + 
			if (forView != null) {
    public ExasolViewCache() {

		@Nullable ExasolView forView
			"	SCOPE_SCHEMA, " + 
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
			"	cast(null as integer) as COLUMN_PARTITION_KEY_ORDINAL_POSITION " + 
        return dbStat;
/**

			"	COLUMN_TYPE, " + 
	) throws DBException {
 *
        return new ExasolTableColumn(session.getProgressMonitor(), exasolView, dbResult);
import org.jkiss.code.Nullable;
			"	DECIMAL_DIGITS as COLUMN_NUM_SCALE, " + 
			"	'VIEW' as COLUMN_OBJECT_TYPE, " + 
			"	ORDINAL_POSITION as COLUMN_ORDINAL_POSITION, " + 
			"	COLUMN_IS_DISTRIBUTION_KEY as COLUMN_IS_DISTRIBUTION_KEY, " + 
    }
			"	SCOPE_TABLE, " + 
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
		JDBCStatement dbstat = session.createStatement();
