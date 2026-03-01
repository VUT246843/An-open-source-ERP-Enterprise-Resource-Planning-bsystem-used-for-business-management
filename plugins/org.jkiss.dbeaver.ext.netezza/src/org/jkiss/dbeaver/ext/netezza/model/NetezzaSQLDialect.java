            "VARIANCE",

import org.jkiss.dbeaver.model.DBPKeywordType;
    };
    }
    }
    @Override
        super("Netezza", "netezza");
    };

            "STDDEV",
    public int getCatalogUsage() {
            "CURRENT_TIME",
            "LAST_VALUE",
    NetezzaSQLDialect() {
            "ONLINE",
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
            "EXPRESS",
            "CURRENT_USER"
/*
    @Override
    };
    @Override

 * See the License for the specific language governing permissions and


 *

            "DATE_TRUNC",
            "CURRENT_USEROID",

    private static String[] NETEZZA_KEYWORDS = {
    };
 * You may obtain a copy of the License at
            "LOCK",
    public boolean isCatalogAtStart() {
            "VAR_SAMP"
import org.jkiss.dbeaver.model.DBPDataKind;
        super.initDriverSettings(session, dataSource, metaData);

    //Function without arguments/parameters
 * you may not use this file except in compliance with the License.
    }
        return true;
    @Override
            "FIRST_VALUE",
    private static final String[] OTHER_TYPES_FUNCTION = {
 *
        return SQLDialect.USAGE_ALL;
            "CURRENT_TX_SCHEMA",
package org.jkiss.dbeaver.ext.netezza.model;
            "SYNONYM",
    @Override
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
            "CURRENT_CATALOG",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            "RESET"
    public int getSchemaUsage() {
        return super.validIdentifierStart(c) || c == '_';
 *     http://www.apache.org/licenses/LICENSE-2.0

 */

            "ANALYZE",
            "LEAD",

        addKeywords(Arrays.asList(NETEZZA_KEYWORDS), DBPKeywordType.KEYWORD);
    }
            "STDDEV_POP",
            "SHOW",
            "TIMEOFDAY"

}
        addKeywords(Arrays.asList(OTHER_TYPES_FUNCTION), DBPKeywordType.OTHER);
            "DISTRIBUTE",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
            "CURRENT_DATE",
            "CURRENT_SID",
            "STDDEV_SAMP",
import java.util.Arrays;
            "CURRENT_TIMESTAMP",
 *
        }
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            "CURRENT_USERID",
            "COMMENT",
    private static String[] NETEZZA_FUNCTIONS = new String[]{
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class NetezzaSQLDialect extends GenericSQLDialect {
            "DECODE",
import org.jkiss.code.NotNull;
    private static String[] NETEZZA_FUNCTIONS_DATETIME = new String[]{
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
            "RESET",
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public boolean validIdentifierStart(char c) {
            "DATE_PART",

    public String getColumnTypeModifiers(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind) {
            "CURRENT_DB",
        addFunctions(Arrays.asList(NETEZZA_FUNCTIONS_DATETIME));
            "CURRENT_SCHEMA",
 * DBeaver - Universal Database Manager
    }
    }
            "CURRENT_PATH",
            "VAR_POP",
            "LAG",

        return SQLDialect.USAGE_ALL;
        if (typeName.equals("INTERVAL")) {
 * limitations under the License.
        addFunctions(Arrays.asList(NETEZZA_FUNCTIONS));
        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
            "CURRENT_TX_PATH",
            return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
