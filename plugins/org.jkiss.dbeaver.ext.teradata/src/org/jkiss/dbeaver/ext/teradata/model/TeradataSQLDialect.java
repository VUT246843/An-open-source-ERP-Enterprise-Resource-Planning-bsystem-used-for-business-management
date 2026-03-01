/*

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    }
        return true;

 *
 * Unless required by applicable law or agreed to in writing, software
 *

    public boolean supportsAliasInSelect() {
        // #11985 Teradata returns DDL of views/procedures/triggers with extra break lines, when they are created in the SQL Editor
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;


import java.util.Arrays;

package org.jkiss.dbeaver.ext.teradata.model;
 *
            ));
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
        super.initDriverSettings(session, dataSource, metaData);
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return true;
    public TeradataSQLDialect() {
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
public class TeradataSQLDialect extends GenericSQLDialect {
 * See the License for the specific language governing permissions and
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
 */
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean isCRLFBroken() {
            Arrays.asList(

 * limitations under the License.
    @Override
        super("Teradata", "teradata");
                "QUALIFY"
        addSQLKeywords(
    }

