    // -----------------
 *
    // -----------------
    public boolean isUnique()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        return first3Keycard;
        DB2DataSource db2DataSource = schema.getDataSource();
    public Timestamp getCreateTime()
    private Boolean           compression;
    // -----------------
    private Integer           pctFree;
    {
    public Timestamp getStatsTime()
    @Property(viewable = false, order = 20, editable = false)
import java.sql.Timestamp;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
 * DB2 Index




import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
            return getContainer().getIndexCache().getChildren(monitor, getContainer(), this);
    private Boolean           reverseScans;
        this.reverseScans = JDBCUtils.safeGetBoolean(dbResult, "REVERSE_SCANS", DB2YesNo.Y.name());
    private Integer           uniqueColCount;
    {

    }
    public DB2UniqueRule getUniqueRule()
        this.indexType = db2IndexType == null ? DBSIndexType.UNKNOWN : db2IndexType.getDBSIndexType();
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.code.Nullable;
    }
    private Integer           clusterRatio;
 */
    {
        this.first2Keycard = JDBCUtils.safeGetLong(dbResult, "FIRST2KEYCARD");
        this.minPctUsed = JDBCUtils.safeGetInteger(dbResult, "MINPCTUSED");

    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    // -----------------
 *
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
 * Unless required by applicable law or agreed to in writing, software
        cols.cacheObject(ixColumn);
    {
        return createTime;
package org.jkiss.dbeaver.ext.db2.model;
        this.clusterRatio = JDBCUtils.safeGetInteger(dbResult, "CLUSTERRATIO");
    public Long getFirstKeycard()
}
    @Property(viewable = false, editable = false, length = PropertyLength.MULTILINE)
    @Property(viewable = false, order = 22, editable = false)
        this.pageSplit = CommonUtils.valueOf(DB2IndexPageSplit.class, JDBCUtils.safeGetStringTrimmed(dbResult, "PAGESPLIT"));
        this.uniqueRule = uniqueRule;
        // DF: Could have been done in constructor. More "readable" to do it here
    @Override

        this.first3Keycard = JDBCUtils.safeGetLong(dbResult, "FIRST3KEYCARD");
        return uniqueColCount;
import org.jkiss.dbeaver.DBException;

        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
        return pageSplit;
    // -----------------
    private Integer           tablespaceId;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
    }
    {
        this.pctFree = JDBCUtils.safeGetInteger(dbResult, "PCTFREE");
    }

    @Property(viewable = false, editable = false, order = 11)
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");


    {
    @Property(viewable = true, editable = false, order = 5)
    @Property(viewable = false, editable = false, order = 12)
    public Integer getClusterRatio()
        return reverseScans;
    // -----------------
    }
    public Long getFirst3Keycard()

    @Property(viewable = false, order = 23, editable = false)
 */

    @Property(viewable = false, editable = false, order = 34, category = DBConstants.CAT_STATISTICS)
    public Boolean getCompression()
    {
            return null;
/**
/*

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        } catch (DBException e) {
        try {
    {
    }
 * You may obtain a copy of the License at
        return getContainer().getName() + "." + getName();
    private Long              first2Keycard;
    public Integer getIndexId()
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
    private Timestamp         statsTime;
    public DB2Index(DB2TableBase db2Table, String indexName, DBSIndexType indexType, DB2UniqueRule uniqueRule)
    @Property(viewable = false, editable = false, order = 36, category = DBConstants.CAT_STATISTICS)
import org.jkiss.dbeaver.ext.db2.model.dict.DB2IndexType;
    }
        return madeUnique;
        this.uniqueColCount = JDBCUtils.safeGetInteger(dbResult, "UNIQUE_COLCOUNT");
    {

    private Integer           minPctUsed;
    }
    private static final Log  LOG = Log.getLog(DB2Index.class);

    public Boolean getReverseScans()

        return tablespaceId;
        return first2Keycard;
 * @author Denis Forveille
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Boolean getMadeUnique()
 * Copyright (C) 2010-2025 DBeaver Corp and others

    // Properties
        return statsTime;
    {
    {

            // DF: Don't know what to do with this exception except log it
import org.jkiss.dbeaver.ext.db2.model.dict.DB2IndexPageSplit;

        return uniqueRule;
        this.colCount = JDBCUtils.safeGetInteger(dbResult, "COLCOUNT");
    public Integer getUniqueColCount()

        super(schema, table, JDBCUtils.safeGetStringTrimmed(dbResult, "INDNAME"), null, true);

    }


    {
    }
    }
    }
    public DB2Index(DBRProgressMonitor monitor, DB2Schema schema, DB2TableBase table, ResultSet dbResult)
    }

    @Override
    public void setUniqueRule(DB2UniqueRule uniqueRule) {

        return indexId;
        if (db2DataSource.isAtLeastV9_5()) {
    private Boolean           madeUnique;
        this.tablespaceId = JDBCUtils.safeGetInteger(dbResult, "TBSPACEID");
    public DB2Schema getIndSchema()
    {
    public Integer getTablespaceId()
    private DB2IndexType      db2IndexType;
import org.jkiss.dbeaver.Log;
    @Property(viewable = true, editable = false, order = 2)
        this.db2IndexType = CommonUtils.valueOf(DB2IndexType.class, JDBCUtils.safeGetStringTrimmed(dbResult, "INDEXTYPE"));
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    // Business Contract
        super(db2Table.getSchema(), db2Table, indexName, indexType, false);

    {
    private String            remarks;
        }
        this.first4Keycard = JDBCUtils.safeGetLong(dbResult, "FIRST4KEYCARD");
import org.jkiss.dbeaver.model.meta.Property;
    {
    {
    @Property(viewable = false, editable = false, order = 10)
import org.jkiss.dbeaver.model.DBConstants;
    {
    public DB2IndexPageSplit getPageSplit()
    @Override
    // Stats
            this.compression = JDBCUtils.safeGetBoolean(dbResult, "COMPRESSION", DB2YesNo.Y.name());
        return firstKeycard;

    {
    {
    {
 * DBeaver - Universal Database Manager
    // Constructors
    }
    {

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
        this.fullKeycard = JDBCUtils.safeGetLong(dbResult, "FULLKEYCARD");
    private Long              fullKeycard;
    private Long              first4Keycard;
    public Long getFirst4Keycard()
    @Nullable
 * limitations under the License.
 * 
    }
    }
        return remarks;
    @Property(viewable = false, editable = false, order = 35, category = DBConstants.CAT_STATISTICS)
    public String getDescription()
    private Timestamp         createTime;
            LOG.error("DBException swallowed during getAttributeReferences", e);
    private DB2UniqueRule     uniqueRule;
    // Structure
    // Columns



import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }

import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
    }
        return clusterRatio;

    @Property(viewable = false, editable = false, order = 71)
    @NotNull
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
    public Long getFullKeycard()
        return minPctUsed;
        return pctFree;
    {
import java.sql.ResultSet;

        return super.getName();
        return fullKeycard;
 * you may not use this file except in compliance with the License.
        return getTable().getDataSource();
        this.indexId = JDBCUtils.safeGetInteger(dbResult, "IID");
        return first4Keycard;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2UniqueRule;

        DBSObjectCache<DB2Index, DB2IndexColumn> cols = getContainer().getIndexCache().getChildrenCache(this);
        this.firstKeycard = JDBCUtils.safeGetLong(dbResult, "FIRSTKEYCARD");
    public Integer getPctFree()
        this.statsTime = JDBCUtils.safeGetTimestamp(dbResult, "STATS_TIME");
    private Integer           indexId;
public class DB2Index extends JDBCTableIndex<DB2Schema, DB2TableBase> {
    {
    public DB2DataSource getDataSource()
    // -----------------
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    {

    @Property(viewable = false, editable = false, order = 33, category = DBConstants.CAT_STATISTICS)
    }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    private Long              first3Keycard;
    {
    public void addColumn(DB2IndexColumn ixColumn)
import java.util.List;
        return compression;
        return (uniqueRule.isUnique());
    @Property(viewable = false, order = 21, editable = false)
    @Property(viewable = false, editable = false, order = 30, category = DBConstants.CAT_STATISTICS)
    @Property(viewable = false, editable = false, order = 32, category = DBConstants.CAT_STATISTICS)

    // -----------------
import org.jkiss.utils.CommonUtils;

    }
    public Integer getColCount()
    public String getName()
    }

    }
 *
    @Override
    private DB2IndexPageSplit pageSplit;

        this.uniqueRule = CommonUtils.valueOf(DB2UniqueRule.class, JDBCUtils.safeGetString(dbResult, "UNIQUERULE"));
    public Integer getMinPctUsed()
    }

        }
    @Property(viewable = false, editable = false, order = 70)

    private Long              firstKeycard;
        this.madeUnique = JDBCUtils.safeGetBoolean(dbResult, "MADE_UNIQUE");
    @NotNull

    }
    public List<DB2IndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
    }
    @NotNull
    {
    private Integer           colCount;
    {
    }
        return colCount;
    }
    // Derived
    @Override
    }
    @Property(viewable = false, order = 24, editable = false)
    public Long getFirst2Keycard()
    @Property(viewable = true, editable = false, order = 31, category = DBConstants.CAT_STATISTICS)
        this.uniqueRule = uniqueRule;
        return getContainer();
