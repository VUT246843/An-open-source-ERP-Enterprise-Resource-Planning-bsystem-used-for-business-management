            "YEAR",
    };
    private static final String[] HIVE_EXTRA_FUNCTIONS = {
 */
            "LENGTH",

            "GET_JSON_OBJECT",
    @Override
            "VIEWS"
            "LIMIT",
            "REGEXP",
    }

    };
            "DAYOFWEEK",
        addFunctions(Arrays.asList(HIVE_EXTRA_FUNCTIONS));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * DBeaver - Universal Database Manager
        super.initDriverSettings(session, dataSource, metaData);
            "REGEXP_EXTRACT",
}
            "MACRO",
            "REPLACE",
            "DATE_ADD",
    @Override
            "TRUNCATE",
import java.util.Arrays;
            "WEEKOFYEAR"
            "AFTER",
            "OPTION",
            removeSQLKeyword(keyword);
            "DATE_FORMAT",
            "REDUCE",

            "ARRAY_CONTAINS",
            "DATA",
            "SUBSTR",
        addSQLKeywords(Arrays.asList(RESERVED_KEYWORDS));
 * you may not use this file except in compliance with the License.
        return DEFAULT_QUOTE_STRINGS;
 * You may obtain a copy of the License at
    @Override
            "EXCHANGE",
    private static final String[] NON_RESERVED_KEYWORDS = {
            "LPAD",
            "TRANSACTION",
            "ASCII",
    public String[][] getIdentifierQuoteStrings() {
            "SUBSTRING_INDEX",
    }
            "RESTRICT",
        return '\\';

        for (String keyword : NON_RESERVED_KEYWORDS) {
    private static final String[] RESERVED_KEYWORDS = {
            "RLIKE",
 *
    private static final String[][] DEFAULT_QUOTE_STRINGS = {{"`", "`"}};
            "CONCAT",
 *

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;

            "TRUNC",
            "REGEXP_REPLACE",
            "CONF",
            "VIEW"

            "SCHEMA",

            "DAY",
            "PERCENT",
            "DATEDIFF",
            "ENCODE",
            "QUOTE"
    private static final String[] HIVE_STRING_FUNCTIONS = {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
            "COALESCE",
            "CASCADE",
            "DATABASE",
            "IMPORT",
 * limitations under the License.
    public boolean supportsAlterTableStatement() {
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
            "SHOW",

    }
    }
            "LEVEL",
            "INDEX",
            "DEFINED",
            "LTRIM",
    };
    public char getStringEscapeCharacter() {
 *
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
        addFunctions(Arrays.asList(HIVE_STRING_FUNCTIONS));
            "KEY",
package org.jkiss.dbeaver.ext.hive.model;
        return false;
    }
            "SUBSTRING",

            "SECOND",
    public HiveSQLDialect() {
            "TO_DATE",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            "CURRENT_DATABASE",
    }
        return true;

    };
 * distributed under the License is distributed on an "AS IS" BASIS,
public class HiveSQLDialect extends GenericSQLDialect {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            "ISOLATION",
            "HOUR",
            "MINUTE",
            "MONTH",
            "SYNC",
            "VERSION",
            "RENAME",

/*
            "SIZE",
 * Unless required by applicable law or agreed to in writing, software

        }
            "LESS",

        super("HiveQL", "hive");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    public boolean supportsAliasInSelect() {
 *     http://www.apache.org/licenses/LICENSE-2.0
            "DEFAULT",
            "EXTENDED",
