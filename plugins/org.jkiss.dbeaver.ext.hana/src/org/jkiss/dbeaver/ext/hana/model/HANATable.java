
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @NotNull JDBCSession session,


/*

        @Override
import org.jkiss.dbeaver.model.DBPObjectStatistics;
    }
        }
        @Nullable String tableName,
    }
            ((HANASchema) getSchema()).collectObjectStatistics(monitor, false, false);
        return super.getDescription();

    @Override

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            dbStat.setString(1, table.getName());
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            + "\nMEMORY_SIZE_IN_TOTAL, RECORD_COUNT, MEMORY_SIZE_IN_MAIN, MEMORY_SIZE_IN_DELTA, CREATE_TIME, LAST_MERGE_TIME, LAST_REPLAY_LOG_TIME, LOADED"
    @Override

import java.util.Collection;

        @Nullable JDBCResultSet dbResult)
    @Nullable
    }
        return super.getSchema();

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import java.sql.SQLException;
        if (tableSize == -1) {
            if (dbResult == null) {
    @SuppressWarnings("unchecked")
        return (HANATableColumn) super.getAttribute(monitor, attributeName);
            return new HANAPartition(table, partition_id, dbResult);
    public Collection<HANAPartition> getPartitions(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBConstants;
    private static class PartitionCache extends JDBCObjectCache<HANATable, HANAPartition> {

    public HANATableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.utils.ByteNumberFormat;
import org.jkiss.code.NotNull;
                return null;
        return tableSize != -1;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    }
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 13, visibleIf = HANANotPartitionedTable.class)
    public String getTableType() {

    public List<? extends HANATableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
            ((HANASchema) getSchema()).resetStatistics();
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
 * Unless required by applicable law or agreed to in writing, software
        super(container, tableName, tableType, dbResult);
 *
            int partition_id = JDBCUtils.safeGetInt(dbResult, "PART_ID");
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
 * You may obtain a copy of the License at
        return partitionCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    public boolean hasStatistics() {

        return tableSize;
    @NotNull
 * limitations under the License.
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1, visibleIf = HANANotPartitionedTable.class)
import java.util.List;
    @Property(category = DBConstants.CAT_STATISTICS, formatter = ByteNumberFormat.class)
        @Nullable String tableType,
    }
package org.jkiss.dbeaver.ext.hana.model;
        return super.getTableType();

    @Property(viewable = true, optional = true, labelProvider = GenericSchema.SchemaNameTermProvider.class, order = 4, visibleIf = HANANotPartitionedTable.class)
    private long tableSize = -1;
        return (List<? extends HANATableColumn>) super.getAttributes(monitor);
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
            + "\nWHERE tp.TABLE_NAME = ? AND tp.SCHEMA_NAME = ? ORDER BY tp.PART_ID");
        return super.refreshObject(monitor);
    {
    @Override
        @Override
    @Override
    @NotNull
}
        }
            tableSize = -1;

    }

    public String getDescription() {

        protected HANAPartition fetchObject(
    void fetchStatistics(JDBCResultSet dbResult) throws SQLException {
            return dbStat;
 * distributed under the License is distributed on an "AS IS" BASIS,
            dbStat.setString(2, table.getContainer().getName());
            }
import org.jkiss.code.Nullable;
        return super.getName();
    @Override
        }
    }
            + "\nFROM M_CS_TABLES mcs JOIN TABLE_PARTITIONS tp ON mcs.SCHEMA_NAME=tp.SCHEMA_NAME AND mcs.TABLE_NAME=tp.TABLE_NAME AND mcs.PART_ID=tp.PART_ID"
    @Override
import org.jkiss.dbeaver.model.meta.Property;
 * See the License for the specific language governing permissions and
        return tableSize;
    @NotNull
    public Long getTableSize(DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.
 */
    }

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull HANATable table) throws SQLException {
            @NotNull HANATable table,
            @NotNull JDBCResultSet dbResult
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


    }
        if (tableSize != -1) {
        @NotNull
        }
    @Property(viewable = true, order = 2, visibleIf = HANANotPartitionedTable.class)
public class HANATable extends GenericTable implements DBPObjectStatistics {
    public long getStatObjectSize() {
        ) throws SQLException, DBException {
    public String getName() {
 *
            final JDBCPreparedStatement dbStat = session.prepareStatement("SELECT tp.*, "
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
    private final PartitionCache partitionCache = new PartitionCache();
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public GenericSchema getSchema() {
    public HANATable(
        tableSize = dbResult.getLong("DISK_SIZE");
        GenericStructContainer container,
    }
    }
