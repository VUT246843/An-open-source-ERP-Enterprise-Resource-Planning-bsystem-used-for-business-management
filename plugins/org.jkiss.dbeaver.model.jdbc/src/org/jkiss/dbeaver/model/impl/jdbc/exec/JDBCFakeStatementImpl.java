        boolean disableLogging
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
}        return resultSet;
 * May be used as "fake" statement to wrap result sets returned by connection metadata or something.
    public void setResultSet(JDBCResultSetImpl resultSet) {

        }
    }
    }
    public void close() {
        @Nullable String queryText,
        // Fake statements can be closed twice (explicitly and by owner resultset close)
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import java.sql.SQLException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public JDBCResultSet executeQuery() {
        this.resultSet = resultSet;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return 0;
            closed = true;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

 */

    @Override
    public boolean execute() throws SQLException {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        return false;
    private boolean closed;

 * DBeaver - Universal Database Manager
    }
        if (!closed) {
    public int executeUpdate() throws SQLException {
 * ResultSet container.
    ) throws SQLException {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        // So do real close only once
 *

package org.jkiss.dbeaver.model.impl.jdbc.exec;
    @Override
    public JDBCResultSet getResultSet() {

/**
 *
    public JDBCFakeStatementImpl(
public class JDBCFakeStatementImpl extends JDBCPreparedStatementImpl<PreparedStatement> {
    }
    private JDBCResultSetImpl resultSet;
import org.jkiss.code.Nullable;
    @Override
        super(connection, () -> JDBCVoidStatementImpl.INSTANCE, queryText, disableLogging);

    }
import java.sql.PreparedStatement;
            super.close();
import org.jkiss.dbeaver.model.exec.DBCException;
 */
        return resultSet;
 * limitations under the License.
    }
        return false;
        @NotNull JDBCSession connection,
    @Override
    public boolean executeStatement() throws DBCException {


 *
