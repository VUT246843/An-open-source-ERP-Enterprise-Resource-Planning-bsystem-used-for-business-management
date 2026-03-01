        @NotNull JDBCObjectSupplier<DatabaseMetaData> original
    JDBCDatabaseMetaData createMetaData(
}
    JDBCResultSet createResultSet(
 */

        throws SQLException;
        @NotNull JDBCObjectSupplier<Statement> original,
 * Unless required by applicable law or agreed to in writing, software
    ) throws SQLException;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull ResultSet original,
        @NotNull JDBCSession session,
        boolean disableLogging

public interface JDBCFactory {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.NotNull;
    JDBCResultSetMetaData createResultSetMetaData(@NotNull JDBCResultSet resultSet)

 * Licensed under the Apache License, Version 2.0 (the "License");
    ) throws SQLException;
 */
/*
    @NotNull
        boolean disableLogging
        @Nullable String sql,
import org.jkiss.code.Nullable;

    ) throws SQLException;
    JDBCCallableStatement createCallableStatement(
        boolean disableLogging
package org.jkiss.dbeaver.model.exec.jdbc;
/**
 *
        @Nullable String sql,
 * limitations under the License.
 * DBeaver - Universal Database Manager

    JDBCStatement createStatement(
 * Copyright (C) 2010-2025 DBeaver Corp and others
    JDBCPreparedStatement createPreparedStatement(
        @NotNull JDBCSession session,
    ) throws SQLException;
 * JDBC implementation factory
        @NotNull JDBCObjectSupplier<CallableStatement> original,

 *


        @NotNull JDBCSession session,

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull JDBCStatement statement,
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        @NotNull JDBCSession session,
    ) throws SQLException;
        @NotNull JDBCObjectSupplier<PreparedStatement> original,
        @NotNull JDBCSession session,
        boolean disableLogging
import java.sql.*;
