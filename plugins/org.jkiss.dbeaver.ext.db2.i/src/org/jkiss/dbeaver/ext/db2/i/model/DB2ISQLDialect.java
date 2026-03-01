import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * DBeaver - Universal Database Manager
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
    };

import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

    public String[][] getBlockBoundStrings() {
    @Override

    }

        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END}
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    @Override
    private static final String[][] BEGIN_END_BLOCK = new String[][]{
        return BEGIN_END_BLOCK;
    @Override
        return true;
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
 * limitations under the License.
        super("IBM DB2 i", "db2_i");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
 *
/*
        return MultiValueInsertMode.GROUP_ROWS;
        return false;
    }
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    }

 * you may not use this file except in compliance with the License.
    }
    public DB2ISQLDialect() {
import org.jkiss.code.NotNull;

    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
    }
    public boolean supportsOrderByIndex() {
    public boolean supportsAliasInSelect() {
    }
public class DB2ISQLDialect extends GenericSQLDialect {
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.SQLConstants;
package org.jkiss.dbeaver.ext.db2.i.model;
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
    public boolean supportsAliasInConditions() {
 *
        turnFunctionIntoKeyword("TRUNCATE");
        super.initDriverSettings(session, dataSource, metaData);
    @Override
