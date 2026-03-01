public class HSQLDialect extends GenericSQLDialect {
    @Override
                "NCLOB"));
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.initDriverSettings(session, dataSource, metaData);
        super("HSQLDB", "hsqldb");
                "LAST_VALUE",
 * You may obtain a copy of the License at
                "LIKE_REGEX",
                "ELSEIF",
 *
                "END_EXEC",
                "NCHAR",
}
                "OFFSET",
                "SYNONYM",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.util.Arrays;
                "NTH_VALUE",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        addFunctions(
        addDataTypes(
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                "COMPARABLE",
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
            Arrays.asList(
                "LEAVE",
 * limitations under the License.

 * you may not use this file except in compliance with the License.
            Arrays.asList(
        addSQLKeywords(
                ));
                "HANDLER",
 * See the License for the specific language governing permissions and


    public HSQLDialect() {
                "CURRENT_CATALOG",
                "TRANSLATE_REGEX"
                "MAX_CARDINALITY",
                "LOOP",

 *
    }
    }
                "POSITION_REGEX",
            ));
                "PERIOD",
 */


package org.jkiss.dbeaver.ext.hsqldb.model;
    public boolean supportsAliasInSelect() {
                "ITERATE",
        return true;
                "UNTIL",
                "FIRST_VALUE",
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
                "STACKED",

                "SIGNAL",
 *     http://www.apache.org/licenses/LICENSE-2.0
                "LEAD",
                "NTILE",
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
                "OCCURRENCES_REGEX",
 * DBeaver - Universal Database Manager
                "CURRENT_SCHEMA",
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
/*
                "TRIM_ARRAY",
 * Unless required by applicable law or agreed to in writing, software
                "SUBSTRING_REGEX",

            Arrays.asList(
                "RESIGNAL",
                "VALUE"
