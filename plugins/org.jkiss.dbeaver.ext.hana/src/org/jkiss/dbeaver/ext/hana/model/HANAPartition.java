    }
        return false;
            this.rangeStart = JDBCUtils.safeGetString(dbResult, "LEVEL_2_RANGE_MIN_VALUE");
    public DBSTable getParentTable() {
    }
    }
        this.rangeEnd = JDBCUtils.safeGetString(dbResult, "LEVEL_1_RANGE_MAX_VALUE");
 *

    @Property(viewable = true, order = 55, formatter = ByteNumberFormat.class)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;

import java.sql.Timestamp;
        }
        return rangeEnd;
import org.jkiss.code.NotNull;

import java.math.BigDecimal;
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    @Property(viewable = true, order = 80)
        return creationTime;
        this.lastDeltaMerge = JDBCUtils.safeGetTimestamp(dbResult, "LAST_MERGE_TIME");
    public Timestamp getCreationTime() {
 * distributed under the License is distributed on an "AS IS" BASIS,


    public BigDecimal getMainSize() {
    public DBSTablePartition getPartitionParent() {
    private Timestamp lastDeltaMerge;
        if (CommonUtils.isEmpty(this.rangeStart)) {
import org.jkiss.utils.CommonUtils;
        return this.parentTable;
    @Property(viewable = true, order = 10)

    @Property(viewable = true, order = 60)
        return mainSize;
    }
    @Override
    public int getPartId() {
    public String getRangeEnd() {
        return lastDeltaMerge;
        return totalSize;
    private Timestamp creationTime;
        this.mainSize = JDBCUtils.safeGetBigDecimal(dbResult, "MEMORY_SIZE_IN_MAIN");
        return loaded;
    public Timestamp getLastLogReplay() {
    public Timestamp getLastDeltaMerge() {
    public BigDecimal getTotalSize() {


 *
        this.parentTable = table;
    public long getStatObjectSize() {
    }
 * DBeaver - Universal Database Manager
 *
        }
        this.loaded = JDBCUtils.safeGetString(dbResult, "LOADED");
    }
    @Property(viewable = true, order = 70)

    public boolean hasStatistics() {

 * You may obtain a copy of the License at
        super(table.getContainer(), String.valueOf(partId), table.getTableType(), dbResult);
    public HANAPartition(
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    public BigDecimal getDeltaSize() {

        return recordCount;
    ) {
    @Property(viewable = true, order = 30)
        @NotNull int partId,

    @Property(viewable = true, order = 50, formatter = ByteNumberFormat.class)

    @Property(viewable = true, order = 45, formatter = ByteNumberFormat.class)
            this.rangeEnd = JDBCUtils.safeGetString(dbResult, "LEVEL_3_RANGE_MAX_VALUE");
    private String rangeStart;
    private BigDecimal deltaSize;
    @Property(viewable = true, order = 75)

        this.recordCount = JDBCUtils.safeGetInt(dbResult, "RECORD_COUNT");
    private int recordCount;

    private int partId;

        return partId;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 */

    @Override
    }
    @Override 
 * you may not use this file except in compliance with the License.
        this.partId = partId;
            this.rangeStart = JDBCUtils.safeGetString(dbResult, "LEVEL_3_RANGE_MIN_VALUE");
public class HANAPartition extends HANATable implements DBSTablePartition {
        return lastLogReplay;
/*
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private final HANATable parentTable;

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override 
        if (CommonUtils.isEmpty(this.rangeStart)) {
    public boolean isSubPartition() {
    }
    private BigDecimal totalSize;
        return loadUnit;
    
import org.jkiss.utils.ByteNumberFormat;
        this.creationTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATE_TIME");

    public String getLoadUnit() {
    private BigDecimal mainSize;
 * See the License for the specific language governing permissions and
        @NotNull JDBCResultSet dbResult
        this.deltaSize = JDBCUtils.safeGetBigDecimal(dbResult, "MEMORY_SIZE_IN_DELTA");        
    }
        @NotNull HANATable table,

    private String loadUnit;
    }

    }
package org.jkiss.dbeaver.ext.hana.model;
    }
    private String rangeEnd;
        this.lastLogReplay = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REPLAY_LOG_TIME");
    @Override
    public int getRecordCount() {
    }
    @Property(viewable = true, order = 65)
            this.rangeEnd = JDBCUtils.safeGetString(dbResult, "LEVEL_2_RANGE_MAX_VALUE");
    public String getRangeStart() {
        this.loadUnit = JDBCUtils.safeGetString(dbResult, "LOAD_UNIT");
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
    }
import org.jkiss.dbeaver.model.meta.Property;
        return null;
    }

        this.totalSize = JDBCUtils.safeGetBigDecimal(dbResult, "MEMORY_SIZE_IN_TOTAL");
        return deltaSize;
    @Property(viewable = true, order = 40)
    private Timestamp lastLogReplay;
    public String getLoaded() {
    @Property(viewable = true, order = 35)

 * Unless required by applicable law or agreed to in writing, software
        return rangeStart;
    }
        return false;

        this.rangeStart = JDBCUtils.safeGetString(dbResult, "LEVEL_1_RANGE_MIN_VALUE");
 * limitations under the License.
    private String loaded;
        return 0;
