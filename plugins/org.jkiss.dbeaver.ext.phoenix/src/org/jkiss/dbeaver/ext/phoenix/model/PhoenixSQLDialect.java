 * DBeaver - Universal Database Manager

 */
        super.initDriverSettings(session, dataSource, metaData);
 * limitations under the License.
public class PhoenixSQLDialect extends GenericSQLDialect {
 * you may not use this file except in compliance with the License.
        super("Phoenix", "apache_phoenix");

import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
}
package org.jkiss.dbeaver.ext.phoenix.model;
        schemaUsage = SQLDialect.USAGE_ALL;
/*


    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    }
    }
    public PhoenixSQLDialect() {
 * See the License for the specific language governing permissions and
 *
        removeSQLKeyword("SYSTEM");
 *     http://www.apache.org/licenses/LICENSE-2.0
