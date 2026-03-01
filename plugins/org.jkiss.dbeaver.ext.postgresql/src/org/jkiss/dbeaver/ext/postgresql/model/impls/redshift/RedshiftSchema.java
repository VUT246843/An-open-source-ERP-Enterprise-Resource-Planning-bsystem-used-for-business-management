 * Copyright (C) 2010-2025 DBeaver Corp and others
                "SELECT \"table\",size,tbl_rows FROM SVV_TABLE_INFO WHERE \"schema\"=?"))
    public String getTableColumnsQueryExtraParameters(PostgreTableContainer owner, PostgreTableBase forTable) {
 * You may obtain a copy of the License at
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * Unless required by applicable law or agreed to in writing, software
 */
                }
        return super.isSystem() || "catalog_history".equals(getName());
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read relation statistics")) {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (table instanceof RedshiftTable rsTable) {
        }
        super(database, name, owner);
import org.jkiss.dbeaver.ext.postgresql.model.*;

            try (JDBCPreparedStatement dbStat = ((JDBCSession)session).prepareStatement(
    @Override
                        PostgreTableBase table = getTable(monitor, tableName);
    public RedshiftSchema(PostgreDatabase database, String name, ResultSet dbResult) throws SQLException {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                dbStat.setString(1, getName());
            hasStatistics = true;
                            rsTable.fetchStatistics(dbResult);
import org.jkiss.code.NotNull;

import java.sql.SQLException;
    }
 * you may not use this file except in compliance with the License.

    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
public class RedshiftSchema extends PostgreSchema {
 *
import java.sql.ResultSet;
 * limitations under the License.
            return;
import org.jkiss.dbeaver.model.DBUtils;

/*
            {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
import org.jkiss.dbeaver.model.exec.DBCException;
        super(database, name, dbResult);
    }
        } finally {
 * See the License for the specific language governing permissions and
 *
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (hasStatistics && !forceRefresh) {
}
                        String tableName = dbResult.getString(1);
 * RedshiftExternalSchema
    public boolean isSystem() {
                    }

 * distributed under the License is distributed on an "AS IS" BASIS,
                    while (dbResult.next()) {
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
            } catch (SQLException e) {
        }
    @Override
        return ",format_encoding(a.attencodingtype::integer) AS \"encoding\"";
    public RedshiftSchema(PostgreDatabase database, String name, PostgreRole owner) {
                throw new DBCException("Error reading schema relation statistics", e);
    private static final Log log = Log.getLog(RedshiftSchema.class);
                        }
 */

import org.jkiss.dbeaver.DBException;
    }

            }
    }


/**
