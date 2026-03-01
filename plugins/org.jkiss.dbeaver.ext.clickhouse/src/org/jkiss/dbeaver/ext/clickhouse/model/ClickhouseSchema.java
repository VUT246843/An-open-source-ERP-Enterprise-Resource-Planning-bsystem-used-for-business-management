    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
        if (hasStatistics && !forceRefresh) {
        return (List<ClickhouseTable>) super.getTables(monitor);
                throw new DBCException("Error reading schema statistics", e);
                };
 *     http://www.apache.org/licenses/LICENSE-2.0
                        GenericTableBase table = getTable(monitor, tableName);
package org.jkiss.dbeaver.ext.clickhouse.model;
    }
            }
                        "sum(bytes) as table_size, " +
                    }
            @Override
    }

{
                dbStat.setString(1, getName());
 */

        return ClickhouseTable.class;
    public ClickhouseSchema(@NotNull GenericDataSource dataSource, @Nullable GenericCatalog catalog, @NotNull String schemaName) {
    @NotNull
        resetStatistics();
                        if (table instanceof ClickhouseTable) {
                    }
import org.jkiss.dbeaver.model.struct.cache.SimpleObjectCache;
 * You may obtain a copy of the License at
        return super.refreshObject(monitor);
        };
import org.jkiss.dbeaver.model.struct.DBSObject;
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
import org.jkiss.dbeaver.model.exec.DBCException;
                    "FROM system.parts\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
            return;
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        super(dataSource, catalog, schemaName);
                        "min(min_date) AS min_date," +
        return new TableCache(datasource) {
    @Override
    public boolean isStatisticsCollected() {
                    "GROUP BY table"))
                        String tableName = dbResult.getString(1);
            protected SimpleObjectCache<GenericTableBase, GenericTableColumn> createNestedCache() {

            hasStatistics = true;
 * ClickhouseSchema
                    @Override
    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    void resetStatistics() {
    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                            ((ClickhouseTable)table).fetchStatistics(dbResult);
import org.jkiss.dbeaver.ext.generic.model.*;
        hasStatistics = false;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.code.Nullable;

                    while (dbResult.next()) {
/**
                }
import org.jkiss.dbeaver.model.DBUtils;
 * See the License for the specific language governing permissions and
    }
            {
}

 * DBeaver - Universal Database Manager
                        "max(max_date) AS max_date " +
    @Override
            try (JDBCPreparedStatement dbStat = ((JDBCSession)session).prepareStatement(
                        "sum(rows) as table_rows, " +

import org.jkiss.code.NotNull;
                this.setCaseSensitive(true);
                        }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
                        this.setCaseSensitive(true);
    @Override
public class ClickhouseSchema extends GenericSchema implements DBPObjectStatisticsCollector
    }
            protected void detectCaseSensitivity(DBSObject object) {
 *
        return hasStatistics;
        return (List<ClickhouseTable>) super.getPhysicalTables(monitor);
                "select table," +
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    }
                    "WHERE database=? AND active\n" +
import org.jkiss.dbeaver.model.exec.DBCSession;
                        "max(modification_time) as latest_modification," +
    @Override

    }
    private boolean hasStatistics = true;
    @Override
            } catch (SQLException e) {
            @Override
        } finally {
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read relation statistics")) {
    public List<ClickhouseTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
    public List<ClickhouseTable> getTables(@NotNull DBRProgressMonitor monitor) throws DBException {
    public TableCache createTableCache(GenericDataSource datasource) {
                return new SimpleObjectCache<>() {
/*
import org.jkiss.dbeaver.model.struct.DBSEntity;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
import java.sql.SQLException;
import java.util.List;
 *
        }
            @NotNull
            }
 */
    @Override
                    protected void detectCaseSensitivity(DBSObject object) {
        }
