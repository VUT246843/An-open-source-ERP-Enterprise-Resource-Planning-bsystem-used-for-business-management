import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                    "min(min_date) AS min_date," +
        }
                    "sum(bytes) as table_size, " +
                        fetchStatistics(dbResult);
        return "ALTER TABLE " + tableName + " DELETE ";
    public synchronized Long getRowCount(DBRProgressMonitor monitor) {

    }
    public String getEngineMessage() {
        @Override
    ClickhouseTable(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
    private void readStatistics(DBRProgressMonitor monitor) {
    private long tableRows;

    void fetchStatistics(JDBCResultSet dbResult) throws SQLException {
import org.jkiss.code.NotNull;
            try (JDBCPreparedStatement dbStat = ((JDBCSession)session).prepareStatement(
        return minDate;
import org.jkiss.dbeaver.model.DBUtils;
    @Override
    @Override
        public Object[] getPossibleValues(ClickhouseTable object) {
    public String generateTableUpdateSet() {
    @Property(viewable = true,
            return getDataSource().getEngineByName(engineName);
 * ClickhouseTable

    public String getMetadataPath() {
    @Override
    }
        maxDate = JDBCUtils.safeGetString(dbResult, "max_date");
        final List<ClickhouseTableEngine> tableEngines = getDataSource().getTableEngines();
 */
import org.jkiss.dbeaver.DBException;
        length = PropertyLength.MULTILINE, order = 100)
    public ClickhouseTableEngine getEngine() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                "select " +
        return tableSize == null ? 0 : tableSize;
        // We have engine here already
                dbStat.setString(2, getName());
    @Property(category = DBConstants.CAT_STATISTICS, order = 23)
    public ClickhouseDataSource getDataSource() {
import java.util.List;
        updatableExpr = "object.dataSource.isServerVersionAtLeast(21, 6)",

        return tableRows;
            return;
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 27)

    private static final Log log = Log.getLog(ClickhouseTable.class);
    }
            tableRows = JDBCUtils.safeGetLong(dbResult, "total_rows");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            lastModifyTime = JDBCUtils.safeGetTimestamp(dbResult, "metadata_modification_time");
    @Nullable
        tableSize = JDBCUtils.safeGetLong(dbResult, "table_size");



        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read relation statistics")) {
        // Now this is a spare method of reading statistics, the main statistics will be read when reading the table data
                    "max(max_date) AS max_date " +

        lastModifyTime = JDBCUtils.safeGetTimestamp(dbResult, "latest_modification");
        return dbsObject;
/**
    private void setDefaultEngine() {
            engine = searchEngine(engineName);
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
            setDefaultEngine();
    }
    }
    }

 */
    public String getTableType() {
    @Override
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 20, formatter = ByteNumberFormat.class)
            }

import org.jkiss.dbeaver.model.exec.DBCSession;
    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            // Log is one of the simplest ClickHouse engines. It doesn't need special engine parameters
    private String maxDate;
        }
        this.engineMessage = engineMessage;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 25, editable = true, listProvider = EngineListProvider.class)
        return null;

                    "sum(rows) as table_rows, " +

    public boolean hasStatistics() {
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
    }

    private String metadataPath;

    }

            log.error("Error reading relation statistics", e);
    }
        return super.getTableType();
    }
        } catch (Exception e) {
        if (dbResult != null) {
/*
import org.jkiss.dbeaver.model.meta.Property;
    @Override
        } else {
        return engineMessage;
                }
            {
                    "GROUP BY table"))
    public void setEngine(ClickhouseTableEngine engine) {
 * See the License for the specific language governing permissions and

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override
            String engineName = JDBCUtils.safeGetString(dbResult, "engine");
        if (CommonUtils.isNotEmpty(engineName)) {
    private String minDate;
        public boolean allowCustomValue() {
                    }
        }
    private ClickhouseTableEngine engine;
 * DBeaver - Universal Database Manager
            return false;
    @NotNull
    }
        }
                dbStat.setString(1, getContainer().getName());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return maxDate;
        minDate = JDBCUtils.safeGetString(dbResult, "min_date");
    }
        @Override
        }
        }
    public long getStatObjectSize() {
 *
 * Unless required by applicable law or agreed to in writing, software
    @Property(category = DBConstants.CAT_STATISTICS, order = 22)
        return tableSize != null;
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
    }

    private ClickhouseTableEngine searchEngine(String engineName) {
            tableSize = JDBCUtils.safeGetLong(dbResult, "total_bytes");
    @Override
 *
        return metadataPath;
        readStatistics(monitor);

    }

        tableRows = JDBCUtils.safeGetLong(dbResult, "table_rows");

 * limitations under the License.
    public String generateTableDeleteFrom(String tableName) {
                    "max(modification_time) as latest_modification," +

        editableExpr = "object.dataSource.isServerVersionAtLeast(21, 6)",
            engine = tableEngines.stream().filter(e -> e.getName().equals("Log")).findFirst().orElse(tableEngines.get(0));

 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

{
            return object.getDataSource().getTableEngines().toArray();
        DBSObject dbsObject = super.refreshObject(monitor);
    private String engineMessage;
    }
                    "WHERE active AND database=? AND table=?\n" +
        if (hasStatistics()) {
    @Property(viewable = true, order = 26, editable = true, length = PropertyLength.MULTILINE)
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public String getMaxDate(DBRProgressMonitor monitor) {
    @Nullable
public class ClickhouseTable extends GenericTable implements DBPObjectStatistics
        return super.getDescription();
        return "";
    }
    }
    public String getMinDate(DBRProgressMonitor monitor) {
import java.util.Date;
        @Nullable
        if (!CommonUtils.isEmpty(tableEngines)) {
        return "ALTER TABLE " + tableName + " UPDATE ";
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
            metadataPath = JDBCUtils.safeGetString(dbResult, "metadata_path");
        return lastModifyTime;
                    if (dbResult.next()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
}

            engineMessage = JDBCUtils.safeGetString(dbResult, "engine_full");
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 21)
    public String getDescription() {
    public static class EngineListProvider implements IPropertyValueListProvider<ClickhouseTable> {
        }
 * you may not use this file except in compliance with the License.
    private Date lastModifyTime;
        return engine;
    @Override
import org.jkiss.dbeaver.Log;
import org.jkiss.utils.ByteNumberFormat;
import java.sql.SQLException;
 *
    @Property(category = DBConstants.CAT_STATISTICS, order = 24)
                    "FROM system.parts\n" +
    public Date getLastModifyTime(DBRProgressMonitor monitor) {
    public String generateTableUpdateBegin(String tableName) {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        this.engine = engine;
    }
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    private Long tableSize;

package org.jkiss.dbeaver.ext.clickhouse.model;

        return (ClickhouseDataSource) super.getDataSource();
    public void setEngineMessage(String engineMessage) {
    @Nullable
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
import org.jkiss.dbeaver.model.DBPObjectStatistics;
        super(container, tableName, tableType, dbResult);
