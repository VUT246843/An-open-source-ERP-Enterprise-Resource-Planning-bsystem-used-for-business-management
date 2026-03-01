    };
    private static final String[] DDL_KEYWORDS = new String[] {
        return DDL_KEYWORDS;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        return supportsAsBeforeTableAlias;
 * You may obtain a copy of the License at
        "NULLIF",
        "VALUE",
        {"BEGIN", "END"},
    public boolean supportsAsKeywordBeforeAliasInFromClause() {
        "RAND",


        "SINH",
public class FireBirdSQLDialect extends GenericSQLDialect {
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
        "COMPUTED",
        "DATEADD",
    @Override
    }
 * See the License for the specific language governing permissions and
    @Override
    }
    public DBDBinaryFormatter getNativeBinaryFormatter() {
            // it's probably in servers older than 2.0 https://www.firebirdsql.org/refdocs/langrefupd20-select.html
    }
        "CONTAINING",
        "MAXVALUE",
    }

    @Override
        "WEEKDAY",

 * DBeaver - Universal Database Manager

        "CURRENT_ROLE",
    public String[] getDDLKeywords() {
import org.jkiss.dbeaver.model.DBPKeywordType;
    protected String getStoredProcedureCallInitialClause(DBSProcedure proc) {
        return FB_BLOCK_HEADERS;
        "STARTING",
        "REVERSE",
        "CURRENT_USER",

    @Override
            supportsAsBeforeTableAlias = false;
 *
    public FireBirdSQLDialect() {
 * you may not use this file except in compliance with the License.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return super.validIdentifierPart(c, quoted) || c == '$';

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterHexString;

        return false;

    @Override
        addFunctions(Arrays.asList(FIREBIRD_FUNCTIONS));
 */
import org.jkiss.code.NotNull;
        if (!dataSource.isServerVersionAtLeast(2, 0)) {
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
    	"CEILING",
        return "select * from " + proc.getFullyQualifiedName(DBPEvaluationContext.DML);
    }
        return true;
        "BLOCK",
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
            // we don't know the exact version actually
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        "YEARDAY",
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;

        "TRUNC",
    };
    private static final String[] FIREBIRD_FUNCTIONS = {

    private boolean supportsAsBeforeTableAlias = true;
    };
 * limitations under the License.
    @NotNull

        return FB_BEGIN_END_BLOCK;
        super("Firebird", "firebird");
 *     http://www.apache.org/licenses/LICENSE-2.0
        "COMMENT",
        "EXTRACT",
        "BREAK",
        "EXECUTE BLOCK",
}
    private static final String[] FIREBIRD_KEYWORDS = new String[] {


        "CREATE", "ALTER", "DROP", "EXECUTE"
    @Override

    public boolean supportsAliasInSelect() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        return true;
        "ACCENT",
    }
        "NCHAR",
        //"IS",
    public String[] getBlockHeaderStrings() {

    };
    }
    public boolean supportsInsertAllDefaultValuesStatement() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.firebird.model;
    }
        //"DECLARE",
        super.initDriverSettings(session, dataSource, metaData);
    	"COALESCE",
    private static final String[][] FB_BEGIN_END_BLOCK = new String[][]{

    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {

        "DATEDIFF",
        }
    	"CEIL",
    @NotNull
        "GENERATOR",
 * Unless required by applicable law or agreed to in writing, software
import java.util.Arrays;
    public boolean supportsAliasInHaving() {
    private static final String[] FB_BLOCK_HEADERS = new String[]{
    public boolean validIdentifierPart(char c, boolean quoted) {
    @Override
    }

    }
        addKeywords(Arrays.asList(FIREBIRD_KEYWORDS), DBPKeywordType.KEYWORD);
    @Override
        return BinaryFormatterHexString.INSTANCE;
        "RPAD",
        "IIF",
    }
        "MINVALUE",
        turnFunctionIntoKeyword("TRUNCATE");
    @Override

    };
    public String[][] getBlockBoundStrings() {
