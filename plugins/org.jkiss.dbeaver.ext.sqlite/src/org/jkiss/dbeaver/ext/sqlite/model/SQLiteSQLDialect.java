    }

 *


 * See the License for the specific language governing permissions and
            "RANDOM",
        return SQLITE_QUOTE_STRINGS;
    }
            "TIME",
            "NULLIF",
 * DBeaver - Universal Database Manager
/*
import org.jkiss.dbeaver.DBException;
    @Override
            "SUBSTR",
        addKeywords(Set.of("STRICT"), DBPKeywordType.OTHER);

        super.initDriverSettings(session, dataSource, metaData);
            "SUM",
        {"\"", "\""},
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
    public MultiValueInsertMode getDefaultMultiValueInsertMode()
    }
        ));
    public SQLiteSQLDialect() {
import java.sql.SQLException;
    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {
    public boolean supportsAlterTableStatement() {
    @Override
package org.jkiss.dbeaver.ext.sqlite.model;
    @Override
            "REPLACE",
    }
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
            "IIF",
    @Override
            "COALESCE",
            "COUNT",
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }

            "LTRIM",
    protected void loadFunctions(JDBCSession session, JDBCDatabaseMetaData metaData, Set<String> allFunctions) throws DBException, SQLException {
        return true;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    {
            "UPPER",
    @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLiteSQLDialect extends GenericSQLDialect {
    }
    };
    @NotNull
        return super.escapeScriptValue(attribute, value, strValue);
import org.jkiss.code.NotNull;
}
        return true;

        {"'", "'"},
        super.loadFunctions(session, metaData, allFunctions);
    public boolean supportsInsertAllDefaultValuesStatement() {
    public String[][] getIdentifierQuoteStrings() {
            "STRFTIME",
            // SQLite doesn't have special literals for IEEE special values
            return "'" + value + "'";
            "TRIM",
    private static final String[][] SQLITE_QUOTE_STRINGS = {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            "AVG",
 *     http://www.apache.org/licenses/LICENSE-2.0
            "SQlite",
        return false;
    @Override
import java.util.Set;
 *
        allFunctions.addAll(List.of(
 * you may not use this file except in compliance with the License.
            "GROUP",
 */
            "DATE",
            "IFNULL",

import org.jkiss.utils.CommonUtils;
            "MIN",
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (CommonUtils.isNaN(value) || CommonUtils.isInfinite(value)) {
    @NotNull

    public boolean supportsIndexCreateAndDrop() {

 * Licensed under the Apache License, Version 2.0 (the "License");
            "ROUND"
            "LOWER",
        return true;
        return MultiValueInsertMode.GROUP_ROWS;
        super("SQLite", "sqlite");
 * You may obtain a copy of the License at


        }
        {"`", "`"}
            "DATETIME",
            "JULIANDAY",
            "LENGTH",
    }
    public boolean supportsAliasInSelect() {
            "INSTR",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

            "MAX",

            "RTRIM",
        {"[", "]"},
    }
import java.util.List;
import org.jkiss.dbeaver.model.DBPKeywordType;
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {

 *
 * limitations under the License.
            "ABS",
