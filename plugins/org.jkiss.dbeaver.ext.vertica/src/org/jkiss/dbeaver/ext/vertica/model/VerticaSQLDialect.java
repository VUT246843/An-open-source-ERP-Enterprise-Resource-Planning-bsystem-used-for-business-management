
import org.jkiss.utils.CommonUtils;
                new SQLDollarQuoteRule(
        "COMMENT",
    @Override

        "SMALLDATETIME",

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            "CURRENT_SCHEMA",
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                    position == RulePosition.PARTITION,
    public String[] getExecuteKeywords() {
        "TIMEZONE",
 * Unless required by applicable law or agreed to in writing, software
    @Override
        addSQLKeywords(Arrays.asList(VERTICA_KEYWORDS));
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        "MONEY",
        super("Vertica", "vertica");
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    };
        "VARCHAR2",
            "CURRENT_DATABASE",
        "EXPLAIN",
            };
    private static final String[][] VERTICA_BEGIN_END_BLOCK = new String[][]{
                        dataSource.getConnectionConfiguration().getProviderProperty(VerticaConstants.PROP_DOLLAR_QUOTES_AS_STRING)
 */
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {

        }
import org.jkiss.dbeaver.model.text.parser.TPRule;
        "ILIKE",
import org.jkiss.code.NotNull;
        return VERTICA_BEGIN_END_BLOCK;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
        "NOTNULL",
        "ENCODED",
    }

        "KSAFE",
        return EXEC_KEYWORDS;
        return super.getCaseInsensitiveExpressionFormatter(operator);
    public boolean supportsInsertAllDefaultValuesStatement() {
            return new TPRule[] {


import org.jkiss.code.Nullable;
        return VERTICA_BLOCK_HEADERS;
    }
 * you may not use this file except in compliance with the License.
        "PINNED",
        super.initDriverSettings(session, dataSource, metaData);
            {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END},
    }
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
    @Override

    @NotNull
    public SQLExpressionFormatter getCaseInsensitiveExpressionFormatter(@NotNull DBCLogicalOperator operator) {
    }
        if (operator == DBCLogicalOperator.LIKE) {
        return new TPRule[0];
        "CORRELATION",
 *

    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

            {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
    private static final String[] VERTICA_BLOCK_HEADERS = new String[]{
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    @NotNull
 * DBeaver - Universal Database Manager
import java.util.Arrays;
    private static String[] VERTICA_KEYWORDS = new String[]{
import org.jkiss.dbeaver.model.sql.SQLExpressionFormatter;
        "INTERVALYM",
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {

    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {

        "MINUS",
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
    }
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
            {"LOOP", SQLConstants.BLOCK_END + " LOOP"}
    };
 *
        "VERBOSE",
import org.jkiss.dbeaver.model.sql.parser.rules.SQLDollarQuoteRule;
        return BasicSQLDialect.DEFAULT_IDENTIFIER_QUOTES;
    public boolean supportsAliasInSelect() {
    public String[][] getIdentifierQuoteStrings() {
    public String[] getBlockHeaderStrings() {
    private static String[] EXEC_KEYWORDS = {"CALL"};

    @Nullable
        "DECLARE"
        "CACHE",
package org.jkiss.dbeaver.ext.vertica.model;
    }

        "ILIKEB",

        "NULLSEQUAL",
                    )
                    false, // actually Vertica supports named dollar-strings, why are we ignoring it?

    @Override
    @NotNull
            "DATETIME",
        "PROJECTION",
        "OFFSET",
 * See the License for the specific language governing permissions and
        "TIMESERIES",
            "DECODE"
 * limitations under the License.
import org.jkiss.dbeaver.ext.vertica.VerticaConstants;
        // SELECT * FROM keywords WHERE reserved = 'R'
                )
    @Override
import org.jkiss.dbeaver.model.sql.SQLConstants;
public class VerticaSQLDialect extends GenericSQLDialect implements TPRuleProvider {
        "BIT",
        return MultiValueInsertMode.GROUP_ROWS;
                    true,
import org.jkiss.dbeaver.model.text.TextUtils;
    };
 * You may obtain a copy of the License at
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String[][] getBlockBoundStrings() {
        "JSON"
        "TEXT",
                    dataSource == null || CommonUtils.toBoolean(
        return true;
    public VerticaSQLDialect() {
            return (left, right) -> left + " ILIKE " + right;
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return true;
    private static String[] VERTICA_FUNCTIONS = new String[]{
            "DATEDIFF",
        addFunctions(Arrays.asList(VERTICA_FUNCTIONS));
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
        "LIKEB",
}

        "ISNULL",
    };
        "NCHAR",
        "TINYINT",
        "FLEX",
    }
        "UUID",
    }
