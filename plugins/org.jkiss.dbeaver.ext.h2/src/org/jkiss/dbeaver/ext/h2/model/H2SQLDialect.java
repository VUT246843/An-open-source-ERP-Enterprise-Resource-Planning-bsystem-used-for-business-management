    }
        return MultiValueInsertMode.GROUP_ROWS;
    }
 * DBeaver - Universal Database Manager

}
 */
 * You may obtain a copy of the License at
 * limitations under the License.
 *
    public boolean supportsAliasInSelect() {
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
    @Override
    }
 *
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.initDriverSettings(session, dataSource, metaData);


 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/**
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public H2SQLDialect() {

package org.jkiss.dbeaver.ext.h2.model;
 */

        return true;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.NotNull;

    @Override
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        super("H2", "h2");
 * H2 dialect
public class H2SQLDialect extends GenericSQLDialect {
 *
    }
 * Unless required by applicable law or agreed to in writing, software
