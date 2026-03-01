        "HASHTYPE_SHA",


    private static final Log LOG = Log.getLog(ExasolDataSource.class);
    };
        "ST_DISTANCE",
import org.jkiss.dbeaver.model.DBPKeywordType;

        "GROUPING_ID",
        "ST_EQUALS",
        "RATIO_TO_REPORT",
        "ST_ISSIMPLE",
		return super.escapeScriptValue(attribute, value, strValue);
    @Override
    @Override
        "ST_BUFFER",
        				super.addSQLKeyword(keyWord);
        return new String[]{"EXECUTE SCRIPT"};
    @Override
			add("BIT");
package org.jkiss.dbeaver.ext.exasol;
    @NotNull
    @Override
        "ST_TRANSFORM",
        "NVL",
    private void addExtraFunctions(String... functions) {
 * Copyright (C) 2016 Karl Griesser (fullref@gmail.com)
            ProjectionAliasVisibilityScope.ORDER_BY
        "SESSION_PARAMETER",
        				String keyWord = dbResult.getString("KEYWORD");
        "IS_TIMESTAMP",
        "BIT_AND",
        return true;
        "ST_Y",
		this.addKeywords(value, DBPKeywordType.KEYWORD);
        				

    
			add("CPU_WEIGHT");
        "ST_NUMPOINTS",

    
        "ST_UNION",
}
        "ST_NUMGEOMETRIES",
        "BIT_CHECK",
        "BIT_LENGTH",
 *
    private static final String[] ADVANCED_FUNCTIONS = {

        			if (dbResult != null && dbResult.next()) {
        "BIT_NOT",
    @Override
        "ST_DIMENSION",
        "ST_X",
        return MultiValueInsertMode.GROUP_ROWS;
			add("PRECEDENCE");
        "ST_GEOMETRYTYPE",
		
        		try (JDBCResultSet dbResult = stmt.executeQuery("/*snapshot execution*/ SELECT keyword FROM sys.EXA_SQL_KEYWORDS esk WHERE RESERVED")) {
        "ST_CONTAINS",
        		try (JDBCResultSet dbResult = stmt.executeQuery("/*snapshot execution*/ SELECT \"VALUE\" FROM \"$ODBCJDBC\".DB_METADATA WHERE name = 'aggregateFunctions'")) {
        try {
        "NTILE",
    @Override
        "IS_BOOLEAN",
        "ST_NUMINTERIORRINGS",
        "HASH_MD5",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        "DECODE",
        "ST_LENGTH",
    }
 *
        "CONVERT_TZ",
    @NotNull
        "HASHTYPE_TIGER",
 * See the License for the specific language governing permissions and
    @Override
        			while(dbResult != null && dbResult.next()) {
    }

        "BIT_SET",
        
    }

    //Exasol does not support prepareCall
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        "ST_FORCE2D",
        "SYS_GUID",
        "ST_ENDPOINT",
        "MUL",
		}};
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        "ST_POINTN",
        return false;
        				this.addExtraFunctions(aggregateFunctions);
			add("BYTE");
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
        "LISTAGG",
        "ST_EXTERIORRING",
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
 * you may not use this file except in compliance with the License.
import java.sql.SQLException;
        "HASH_SHA",
        }
    @NotNull
        "IS_DSINTERVAL",
        "ZEROIFNULL"
            LOG.warn("Could not retrieve functions list from Exasol dictionary");
        "ST_STARTPOINT",
    }
 * DBeaver - Universal Database Manager
    public String[] getExecuteKeywords() {
        "ST_ISRING",
    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {
    public boolean supportsInsertAllDefaultValuesStatement() {
        "ST_SYMDIFFERENCE",
        "ROWID",
import org.jkiss.code.NotNull;

    public static final String[] EXEC_KEYWORDS = new String[]{};
    }
public class ExasolSQLDialect extends JDBCSQLDialect {
        "REGR_FUNCTIONS",
			add("JDBC");
        "ST_DISJOINT",
        "ST_BOUNDARY",

        super.initDriverSettings(session, dataSource, metaData);
		
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        "ST_CROSSES",
        } catch (SQLException e) {
        "LAG",
        			}
        "BIT_TO_NUM",
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {

        "IS_YMINTERVAL",
        super("Exasol", "exasol");

        "ST_SETSRID",
        "EDIT_DISTANCE",
    public boolean supportsAliasInSelect() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        "ST_CENTROID",
        "NULLIFZERO",
    public ExasolSQLDialect() {
			add("USER_TEMP_DB_RAM_LIMIT");
        "IS_DATE",
/*
        			}

		ArrayList<String> value = new ArrayList<String>() {{
        "JSON_VALUE",
        "ST_WITHIN",
        "JSON_EXTRACT",
        				String keyWord = dbResult.getString(1);
        "ST_ENVELOPE",
        return true;
        "SYS_CONNECT_BY_PATH",

import org.jkiss.dbeaver.Log;
        "ST_MAX_DECIMAL_DIGITS",
        addFunctions(Arrays.asList(ADVANCED_FUNCTIONS));
import java.util.ArrayList;
        "HASHTYPE_MD5",
        				String[] aggregateFunctions = keyWord.split(",");
        "ST_OVERLAPS",
        "ROWNUM",
        return EnumSet.of(
        );
        "ST_GEOMETRYN",
import java.util.EnumSet;
			add("KERBEROS");
        "ST_ISEMPTY",
        "HASH_TIGER",
			add("GROUP_TEMP_DB_RAM_LIMIT");
 * limitations under the License.
			add("SESSION_TEMP_DB_RAM_LIMIT");
        "LAST_VALUE",
    }
        				
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
			try (JDBCStatement stmt = session.createStatement()) {
        		}
        "ST_CONVEXHULL",
        addTableQueryKeywords("DESC");

    
        "ST_DIFFERENCE",
    }
        super.addFunctions(Arrays.asList(functions));
        "LEAD",
 *
        "BIT_OR",
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        "ST_TOUCHES",
        		}

        	}
		@SuppressWarnings("serial")
 */
 * Unless required by applicable law or agreed to in writing, software
        "DATE_TRUNC",
    }
import java.util.Arrays;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public boolean supportsAliasInConditions() {
        
        
