 * you may not use this file except in compliance with the License.

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 *
import java.sql.Statement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.Nullable;
    JDBCResultSet openResultSet() throws DBCException;
import org.jkiss.dbeaver.model.exec.DBCStatement;
 *
 */
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.model.runtime.DBRBlockingObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    JDBCResultSet executeQuery(String sql)
 * DBeaver - Universal Database Manager
/*
    @Nullable
    JDBCSession getConnection();
    @Override
public interface JDBCStatement extends Statement, DBCStatement, DBCScriptStatement, DBRBlockingObject {
        throws SQLException;
    void close();
 * You may obtain a copy of the License at

    JDBCResultSet getResultSet()
import org.jkiss.dbeaver.model.exec.DBCException;
 * See the License for the specific language governing permissions and


 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.SQLException;

        throws SQLException;
 * JDBC statement
package org.jkiss.dbeaver.model.exec.jdbc;
    @Nullable
 */
}

 * Unless required by applicable law or agreed to in writing, software
    JDBCResultSet openGeneratedKeysResultSet() throws DBCException;

    @Nullable
import org.jkiss.dbeaver.model.exec.DBCScriptStatement;
/**
    @Nullable
    @Override
