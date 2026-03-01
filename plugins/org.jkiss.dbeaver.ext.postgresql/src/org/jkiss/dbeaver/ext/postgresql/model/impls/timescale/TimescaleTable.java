            return;
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
 * you may not use this file except in compliance with the License.
    }
public class TimescaleTable extends PostgreTableRegular {
            "SELECT total_bytes as total_rel_size, table_bytes as rel_size " +
        try (JDBCPreparedStatement stmt = session.prepareStatement(sql)) {
 *
        } catch (SQLException e) {
    protected void fetchStatistics(@NotNull JDBCResultSet dbResult) throws DBException, SQLException {

            "SELECT 1 FROM timescaledb_information.hypertables " +
            super.readTableStatistics(session);
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            }
import org.jkiss.dbeaver.Log;

        }
        if (!getDataSource().getServerType().supportsTableStatistics()) {
 * Copyright (C) 2010-2026 DBeaver Corp and others

            stmt.setString(1, getSchema().getName());
        super(schema, dbResult);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
 * You may obtain a copy of the License at
                return rs.next();
/*
            return;

    }
        }
    }
    public TimescaleTable(PostgreSchema schema, ResultSet dbResult) {
            }
import java.sql.ResultSet;
    @Override
            "FROM hypertable_detailed_size(?)")) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
}
import org.jkiss.code.NotNull;
                    fetchStatistics(dbResult);
import org.jkiss.dbeaver.DBException;
            dbStat.setLong(1, getObjectId());
 * limitations under the License.
        String sql =
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            log.error("Failed to check if table is a hypertable: " + e.getMessage(), e);
            stmt.setString(2, getName());

    private boolean isHypertable(@NotNull JDBCSession session) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        super.fetchStatistics(dbResult);
 * See the License for the specific language governing permissions and

                if (dbResult.next()) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;

 */
        if (!isHypertable(session)) {
            "WHERE hypertable_schema = ? AND hypertable_name = ?";
                }
import java.sql.SQLException;
 *
            return false;
    }
 * DBeaver - Universal Database Manager
            try (JDBCResultSet rs = stmt.executeQuery()) {
    protected void readTableStatistics(@NotNull JDBCSession session) throws DBException, SQLException {
 * Unless required by applicable law or agreed to in writing, software


package org.jkiss.dbeaver.ext.postgresql.model.impls.timescale;
    private static final Log log = Log.getLog(TimescaleTable.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableRegular;

        }

        }
