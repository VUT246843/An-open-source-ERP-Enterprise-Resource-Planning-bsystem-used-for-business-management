public class TimescaleSchema extends PostgreSchema {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
        super(owner, name, dbResult);
 * Licensed under the Apache License, Version 2.0 (the "License");
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read hypertable statistics")) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                       (size_info).total_bytes as total_rel_size,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
 * you may not use this file except in compliance with the License.
    public TimescaleSchema(PostgreDatabase owner, String name, ResultSet dbResult) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 *
                       (size_info).table_bytes as rel_size
                JOIN timescaledb_information.hypertables h
            } catch (SQLException e) {
                CROSS JOIN LATERAL hypertable_detailed_size(c.oid) AS size_info
 */
                throw new DBCException("Error reading schema relation statistics", e);
                stmt.setString(1, getName());
    }
                        long tableId = dbResult.getLong(1);

import org.jkiss.code.NotNull;
        super.collectObjectStatistics(monitor, totalSizeOnly, forceRefresh);
 * limitations under the License.
                        if (table instanceof TimescaleTable timescaleTable) {
            )) {
import org.jkiss.dbeaver.model.exec.DBCException;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.postgresql.model.impls.timescale;
 *
                    }
                }
                stmt.setLong(2, getObjectId());
 * Unless required by applicable law or agreed to in writing, software
import java.sql.ResultSet;

 * distributed under the License is distributed on an "AS IS" BASIS,
                WHERE c.relnamespace = ?"""
                            timescaleTable.fetchStatistics(dbResult);
 * You may obtain a copy of the License at
                try (JDBCResultSet dbResult = stmt.executeQuery()) {
import java.sql.SQLException;

            try (JDBCPreparedStatement stmt = ((JDBCSession) session).prepareStatement(
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        PostgreTableBase table = getTable(monitor, tableId);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
                    while (dbResult.next()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                FROM pg_class c
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
/*
        }
 * DBeaver - Universal Database Manager
    @Override
            }
                """
                        }
                  ON h.hypertable_schema = ? AND h.hypertable_name = c.relname
}
 * See the License for the specific language governing permissions and
                SELECT c.oid,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBUtils;

 *
import org.jkiss.dbeaver.model.exec.DBCSession;
