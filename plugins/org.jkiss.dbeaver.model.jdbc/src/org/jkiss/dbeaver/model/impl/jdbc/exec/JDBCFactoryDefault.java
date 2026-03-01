    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull ResultSet original,
    public JDBCResultSet createResultSet(
        return new JDBCDatabaseMetaDataImpl(session, metadata.get());
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull JDBCObjectSupplier<PreparedStatement> stmtSupplier,
    ) throws SQLException {
    public JDBCDatabaseMetaData createMetaData(
    @Override
        @Nullable String sql,
        @NotNull JDBCSession session,
        @NotNull JDBCObjectSupplier<CallableStatement> stmtSupplier,
        @NotNull JDBCSession session,
 * You may obtain a copy of the License at

        boolean disableLogging
        return new JDBCResultSetImpl(session, statement, original, disableLogging);
    }
 *
        boolean disableLogging
import java.sql.*;
    @Override
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        return new JDBCPreparedStatementImpl<>(session, stmtSupplier, sql, disableLogging);

        boolean disableLogging
    public JDBCResultSetMetaData createResultSetMetaData(
 * Default JDBC factory


    }

 * you may not use this file except in compliance with the License.
        return new JDBCResultSetMetaDataImpl(resultSet);
        return new JDBCStatementImpl<>(session, stmtSupplier, null, disableLogging);
    @Override
 * Unless required by applicable law or agreed to in writing, software
    ) throws SQLException {
        @NotNull JDBCStatement statement,
    ) throws SQLException {
import org.jkiss.code.NotNull;
 */
        @NotNull JDBCObjectSupplier<DatabaseMetaData> metadata
import org.jkiss.dbeaver.model.exec.jdbc.*;
}
    public JDBCStatement createStatement(

    @Override

package org.jkiss.dbeaver.model.impl.jdbc.exec;
        boolean disableLogging
        @Nullable String sql,
 *
    @NotNull
        @NotNull JDBCSession session,
    public JDBCPreparedStatement createPreparedStatement(
    }

/*

    ) throws SQLException {
    ) throws SQLException {
        return new JDBCCallableStatementImpl(session, stmtSupplier, sql, disableLogging);
public class JDBCFactoryDefault implements JDBCFactory {
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
    ) throws SQLException {
    @Override
    }
import org.jkiss.code.Nullable;
        @NotNull JDBCResultSet resultSet
 */
        @NotNull JDBCSession session,
/**
        @NotNull JDBCSession session,
        @NotNull JDBCObjectSupplier<Statement> stmtSupplier,
    public JDBCCallableStatement createCallableStatement(
