    public boolean supportsAliasInSelect() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
    public boolean supportsOrderByIndex() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * you may not use this file except in compliance with the License.
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
 *
        super("DB2 for z/OS", "db2_zos");
public class DB2ZOSSQLDialect extends GenericSQLDialect {
    }
        return BEGIN_END_BLOCK;
    }
    public DB2ZOSSQLDialect() {
/*
    }
 */
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

        turnFunctionIntoKeyword("TRUNCATE");
    private static final String[][] BEGIN_END_BLOCK = new String[][]{

        return true;
    };
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    @Override
        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END}
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.sql.SQLConstants;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
 *

        return false;
 * Unless required by applicable law or agreed to in writing, software

        super.initDriverSettings(session, dataSource, metaData);
    }
}
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
    @Override

    }
 * limitations under the License.

 *     http://www.apache.org/licenses/LICENSE-2.0

    public String[][] getBlockBoundStrings() {
    public boolean supportsAliasInConditions() {
package org.jkiss.dbeaver.ext.db2.zos.model;
    }
        return false;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
    @Override
