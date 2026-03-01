
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.exec.DBCSession;
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
                    }
        } finally {
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read catalog statistics")) {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * You may obtain a copy of the License at
                    while (dbResult.next()) {
                            cht.fetchStatistics(dbResult);
    @Override
import org.jkiss.code.NotNull;
                        + "max(modification_time) as latest_modification," + "min(min_date) AS min_date,"
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
} * DBeaver - Universal Database Manager
        return (List<ClickhouseTable>) super.getTables(monitor);
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    "select table," + "sum(bytes) as table_size, " + "sum(rows) as table_rows, "
import org.jkiss.code.Nullable;
import java.util.List;
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
    @Override
                        GenericTableBase table = getTable(monitor, tableName);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    void resetStatistics() {
                        if (table instanceof ClickhouseTable cht) {
 *
        return getName().equalsIgnoreCase("INFORMATION_SCHEMA") || getName().equals("system");

import org.jkiss.dbeaver.model.DBPSystemObject;
                dbStat.setString(1, getName());
                        + "max(max_date) AS max_date " + "FROM system.parts\n" + "WHERE database=? AND active\n"
    }
    @Override
                }
        return ClickhouseTable.class;
        super(dataSource, catalogName);
    }
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
package org.jkiss.dbeaver.ext.clickhouse.model;
        @NotNull DBRProgressMonitor monitor,
 *
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
    public ClickhouseCatalog(@NotNull GenericDataSource dataSource, @NotNull String catalogName) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
import java.sql.SQLException;

    @NotNull



        return (List<ClickhouseTable>) super.getPhysicalTables(monitor);
    @Override
            ) {
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
        boolean forceRefresh
    public boolean isSystem() {
    }
        return hasStatistics;
                JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(
        return super.refreshObject(monitor);
/*
                throw new DBCException("Error reading catalog statistics", e);
    }
            return;
import org.jkiss.dbeaver.model.struct.DBSObject;

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
                        + "GROUP BY table")
    }
        hasStatistics = false;
        boolean totalSizeOnly,
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Unless required by applicable law or agreed to in writing, software
public class ClickhouseCatalog extends GenericCatalog implements DBPObjectStatisticsCollector, DBPSystemObject {
        resetStatistics();
 *

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    ) throws DBException {

            }
    public void collectObjectStatistics(
    public List<ClickhouseTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    }
                        String tableName = dbResult.getString(1);
                        }
    @Override

            hasStatistics = true;
        }
    public List<ClickhouseTable> getTables(@NotNull DBRProgressMonitor monitor) throws DBException {
    public boolean isStatisticsCollected() {
    private boolean hasStatistics = false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
            try (
        if (hasStatistics && !forceRefresh) {

