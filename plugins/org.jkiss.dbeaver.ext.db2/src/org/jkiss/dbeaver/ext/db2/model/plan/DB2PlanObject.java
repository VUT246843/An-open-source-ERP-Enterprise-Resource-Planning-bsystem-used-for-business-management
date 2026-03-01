    private Long first2KeyCard;
        this.numRIDsDeleted = JDBCUtils.safeGetLong(dbResult, "NUMRIDS_DELETED");
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    }
    public Long getNumEmptyLeafs()

    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    }
    }
        this.first4KeyCard = copy.getFirst4KeyCard();
    private Double avgRandomPages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.avgRandomFetchPages = JDBCUtils.safeGetDouble(dbResult, "AVERAGE_RANDOM_FETCH_PAGES");

        // this.objectSchema=copy.getObjectSc();
        this.density = copy.getDensity();
        this.statsSrc = copy.getStatsSrc();
    public Number getNodePercent() {
    private Integer numDataParts;
    public Long getFirst4KeyCard()
 * You may obtain a copy of the License at
        return displayName;
 * @author Denis Forveille
    }
    @Override
    {
        this.transferRate = copy.getTransferRate();
    public static String buildName(String objectSchema, String objectName)
    public Double getAvgRandomPages()
/*
    public Double getAvgSequencePages()
    {
    }
        this.sequentialPages = copy.getSequentialPages();
    }
        this.activeBlocks = copy.getActiveBlocks();
        this.width = copy.getWidth();
    @Property(editable = false, viewable = false, category = DB2Constants.CAT_DATETIME)
        this.numEmptyLeafs = copy.getNumEmptyLeafs();

        return density;
        this.avgRandomPages = copy.getAvgRandomPages();
    {
        this.nullKeys = copy.getNullKeys();
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
 * DBeaver - Universal Database Manager
    }

    }
 */
    @Property(editable = false, viewable = false)
    }

    // ----------------
    }
    private Double overHead;
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    @Property(editable = false, viewable = false)
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    }
    @Override
        return pages;
        return nLeaf;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Property(editable = false, viewable = false)

    {
    private Integer prefetchSize;

    }
 * 

    {

    {
    {
    public Long getSequentialPages()
        return cluster;
    public Double getAvgSequenceFetchGap()
        this.first4KeyCard = JDBCUtils.safeGetLong(dbResult, "FIRST4KEYCARD");

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(editable = false, viewable = false)
    public String getTablespaceName()

        this.statsTime = copy.getStatsTime();
    }
    @Override

 * See the License for the specific language governing permissions and
        this.cluster = JDBCUtils.safeGetDouble(dbResult, "CLUSTER");
        this.extentSize = copy.getExtentSize();
    }
        this.rowCount = JDBCUtils.safeGetInteger(dbResult, "ROW_COUNT");
    public String getDistinct()
    // --------
        return displayName;
        this.transferRate = JDBCUtils.safeGetDouble(dbResult, "TRANSFER_RATE");

        this.avgSequenceGap = JDBCUtils.safeGetDouble(dbResult, "AVERAGE_SEQUENCE_GAP");


    @Property(editable = false, viewable = true, order = 2, category = DB2Constants.CAT_PERFORMANCE, format = DB2Constants.PLAN_COST_FORMAT)
/**
    private Double avgRandomFetchPages;
    {

    private Integer extentSize;

    // Helpers
    // -----------------
        this.numRIDs = JDBCUtils.safeGetLong(dbResult, "NUMRIDS");


        return firstKeyCard;
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
 * you may not use this file except in compliance with the License.
        this.objectName = JDBCUtils.safeGetString(dbResult, "OBJECT_NAME");
    public Double getTransferRate()
    public Double getEstimatedCardinality()
    @Property(editable = false, viewable = false, category = DB2Constants.CAT_PERFORMANCE)
    public Integer getRowCount()
    public Long getOverFlow()

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    {
import org.jkiss.dbeaver.model.meta.Property;

    @Property(editable = false, viewable = false)
        return rowCount;
    @Property(editable = false, viewable = false)
package org.jkiss.dbeaver.ext.db2.model.plan;
        return avgSequencePages;
        return nullKeys;
    {
    private Double avgSequencePages;
    public Integer getColumnsCount()
    }
    public Long getFirst3KeyCard()
        this.avgSequenceFetchGap = copy.getAvgSequenceFetchGap();

        this.first2KeyCard = JDBCUtils.safeGetLong(dbResult, "FIRST2KEYCARD");

        return tablespaceName;
        return avgRandomFetchPages;
        return objectType;
        return objectType;
        this.objectType = JDBCUtils.safeGetString(dbResult, "OBJECT_TYPE");
        this.displayName = copy.getDisplayName();
    }
        return first4KeyCard;
    @Property(editable = false, viewable = false)
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(editable = false, viewable = true, order = 1)
    public Number getNodeRowCount() {
    }
        return statsTime;
    // Constructors
    public Integer getPrefetchSize()
    private Long firstKeyCard;
    @Property(editable = false, viewable = false, order = 3)
    private Double transferRate;
    @Property(editable = false, viewable = false)
    @Property(editable = false, viewable = false)
    private Integer density;

        this.tablespaceName = JDBCUtils.safeGetString(dbResult, "TABLESPACE_NAME");
        return null;
    {
        this.statsSrc = JDBCUtils.safeGetString(dbResult, "STATS_SRC");
        this.overHead = copy.getOverHead();
    private String distinct;
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    }
        this.pages = JDBCUtils.safeGetLong(dbResult, "PAGES");
    {
    }
        this.firstKeyCard = copy.getFirstKeyCard();
    DB2PlanObject(DB2PlanObject copy)
 *
    }
        return Double.valueOf(rowCount);
    // ----------------
    }
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
        return fullKeyCard;
    {
 *
    }
        this.activeBlocks = JDBCUtils.safeGetLong(dbResult, "ACTIVE_BLOCKS");
        return numRIDsDeleted;
    // Properties
        this.nodeName = buildName(objectSchema, objectName);
        return nodeName;
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
        return avgSequenceFetchGap;
    {
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
        return statsSrc;
        this.numRIDs = copy.getNumRIDs();
        return createTime;
    {

    public String getNodeType() {
    {
    }
        this.avgSequencePages = JDBCUtils.safeGetDouble(dbResult, "AVERAGE_SEQUENCE_PAGES");
        return extentSize;
        return nLevels;
        return numRIDs;
    }

    public Long getFullKeyCard()
        this.displayName = objectType + ": " + nodeName;
    }
    @Override
        this.cluster = copy.getCluster();
    public String getStatsSrc()

    {
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    public Integer getWidth()

    private String nodeName;
    {
        return null;
    {

    }
        if (statsTime != null && createTime != null) {
    }
        return objectSchema + "." + objectName;
    }
        this.overFlow = JDBCUtils.safeGetLong(dbResult, "OVERFLOW");

    {

    private String objectType;
        return displayName;
    @Override
        return prefetchSize;
        return sequentialPages;
    {

    {
    private Integer nLevels;

    private Double avgSequenceFetchPages;

    private Long activeBlocks;
        return avgSequenceFetchPages;
    }
 * limitations under the License.
        return avgRandomPages;
    private Integer columnsCount;

        this.firstKeyCard = JDBCUtils.safeGetLong(dbResult, "FIRSTKEYCARD");
        return rowCount;
    }
    private String nullKeys;
        this.overFlow = copy.getOverFlow();
        return 0;
    {

    public Long getNumRIDs()
    public String getNodeDescription() {
    @Property(editable = false, viewable = false)
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    }

        return first3KeyCard;
    {
        this.nLeaf = copy.getnLeaf();
import java.sql.Timestamp;
    private Long overFlow;
    {
    @Override
    }
    public Double getAvgSequenceFetchPages()
    // -----------------
    {
    {
    public String getNullKeys()
    }
    {
    @Property(editable = false, viewable = false)
        return columnsCount;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Integer getExtentSize()
        return transferRate;
    public Long getPages()
        return avgSequenceGap;
    public Double getAvgRandomFetchPages()
    public String toString()
    private Timestamp createTime;
        this.distinct = JDBCUtils.safeGetString(dbResult, "DISTINCT");
    private Double avgSequenceFetchGap;
    // --------

    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)

    private String objectSchema;
    public Timestamp getStatsTime()
 */
    private String statsSrc;
        this.first2KeyCard = copy.getFirst2KeyCard();
    }
    }
    {
        this.overHead = JDBCUtils.safeGetDouble(dbResult, "OVERHEAD");
    private Long nLeaf;

    public Long getNumRIDsDeleted()
        this.extentSize = JDBCUtils.safeGetInteger(dbResult, "EXTENTSIZE");
        this.rowCount = copy.getRowCount();




    {
        this.avgSequenceFetchGap = JDBCUtils.safeGetDouble(dbResult, "AVERAGE_SEQUENCE_FETCH_GAP");

    @Property(editable = false, viewable = false)
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)

    {
    public Long getnLeaf()
    public Double getAvgSequenceGap()
    private Long first3KeyCard;
    public DB2PlanObject(JDBCResultSet dbResult)
    }
    public Long getFirstKeyCard()
    {
    private Double avgSequenceGap;
        return overHead;
        return activeBlocks;
    }
    public Integer getNumDataParts()
    private Long numRIDs;
        this.density = JDBCUtils.safeGetInteger(dbResult, "DENSITY");
        this.avgSequenceGap = copy.getAvgSequenceGap();
    {
    {
    {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;

    @Property(editable = false, viewable = false)
        this.width = JDBCUtils.safeGetInteger(dbResult, "WIDTH");
    }
        this.columnsCount = copy.getColumnsCount();
        this.avgRandomFetchPages = copy.getAvgRandomFetchPages();
        this.columnsCount = JDBCUtils.safeGetInteger(dbResult, "COLUMN_COUNT");
        this.prefetchSize = JDBCUtils.safeGetInteger(dbResult, "PREFETCHSIZE");

        this.nLevels = copy.getnLevels();
 *
        this.nLeaf = JDBCUtils.safeGetLong(dbResult, "NLEAF");
    private Integer rowCount;
    }
    @Override
    {

    @Property(editable = false, viewable = false)
    @Property(editable = false, viewable = false)
        // super(copy);


    }

        this.fullKeyCard = JDBCUtils.safeGetLong(dbResult, "FULLKEYCARD");
    public Number getNodeDuration() {
    }
}
        this.statsTime = JDBCUtils.safeGetTimestamp(dbResult, "STATISTICS_TIME");
    }
    private String tablespaceName;
    public Timestamp getCreateTime()
    {
    public String getDisplayName()
        this.numEmptyLeafs = JDBCUtils.safeGetLong(dbResult, "NUM_EMPTY_LEAFS");
    }
    private Integer width;
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    {
    {
        this.sequentialPages = JDBCUtils.safeGetLong(dbResult, "SEQUENTIAL_PAGES");
    {

    {
        return overFlow;
    public Double getOverHead()
public class DB2PlanObject extends DB2PlanNode implements DBCPlanCostNode {
        this.numDataParts = copy.getNumDataParts();
        this.prefetchSize = copy.getPrefetchSize();
        this.nLevels = JDBCUtils.safeGetInteger(dbResult, "NLEVELS");
        this.avgSequenceFetchPages = copy.getAvgSequenceFetchPages();
        this.avgSequenceFetchPages = JDBCUtils.safeGetDouble(dbResult, "AVERAGE_SEQUENCE_FETCH_PAGES");
    @Property(editable = false, viewable = false)
        return numDataParts;
            return statsTime.getTime() - createTime.getTime();
    public Integer getDensity()
        this.objectType = copy.getObjectType();

    private String objectName;
        this.numDataParts = JDBCUtils.safeGetInteger(dbResult, "NUM_DATA_PARTS");
        this.numRIDsDeleted = copy.getNumRIDsDeleted();
    private Long numEmptyLeafs;
        this.nodeName = copy.getNodeName();
    }
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
        this.distinct = copy.getDistinct();
    }
    // ------------
        this.objectSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "OBJECT_SCHEMA");
        this.pages = copy.getPages();

    private Long sequentialPages;
    public Long getFirst2KeyCard()
    private Timestamp statsTime;
    {
    }
    public Number getNodeCost() {
 * Unless required by applicable law or agreed to in writing, software
    private String displayName;
    @Property(editable = false, viewable = false)
    {
 * DB2 EXPLAIN_OBJECT table
        this.first3KeyCard = JDBCUtils.safeGetLong(dbResult, "FIRST3KEYCARD");
    @Property(editable = false, viewable = false)
    public Integer getnLevels()
    @Property(editable = false, viewable = false, category = DBConstants.CAT_STATISTICS)
    private Long numRIDsDeleted;
    }
    }


    public String getNodeName()


    // ------------
        this.first3KeyCard = copy.getFirst3KeyCard();
    }
import org.jkiss.dbeaver.model.DBConstants;
    // Business Contract
        }
    private Long pages;
    {
        this.avgSequencePages = copy.getAvgSequencePages();
    }
        // this.objectName=copy.getObjectType()

        this.createTime = copy.getCreateTime();

    public Double getCluster()
    private Double cluster;

        return distinct;
        return first2KeyCard;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Long first4KeyCard;

        this.tablespaceName = copy.getDisplayName();
        return width;
    @Override
        this.nullKeys = JDBCUtils.safeGetString(dbResult, "NULLKEYS");
    public String getObjectType()

        this.fullKeyCard = copy.getFullKeyCard();
    public Long getActiveBlocks()
    private Long fullKeyCard;
        return numEmptyLeafs;
