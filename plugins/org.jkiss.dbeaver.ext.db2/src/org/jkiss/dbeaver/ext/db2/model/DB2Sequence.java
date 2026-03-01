        if (db2DataSource.isAtLeastV9_7()) {
    public Long getMaxValue()
        return precision;
 */
/*
    }
    private String baseSchema;
    {
        this.maxValue = maxValue;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;

    }

    public DB2SequencePrecision getPrecision()
    public Long getStart()
    {
    {
    {
        DB2DataSource db2DataSource = schema.getDataSource();
    }
import org.jkiss.code.Nullable;
    private Long incrementBy;
    public DB2SequenceType getSeqType()
        this.start = JDBCUtils.safeGetLong(dbResult, "START");
 * Unless required by applicable law or agreed to in writing, software
    {
    public Timestamp getCreateTime()
    private String owner;
    public String getBaseSequence()
    @Property(viewable = true, editable = true, updatable = true, order = 11)

    }
            this.baseSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "BASE_SEQSCHEMA");

    public Boolean getCycle()
    {
        this.origin = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, "ORIGIN"));
    @Property(viewable = false, editable = true, updatable = true, length = PropertyLength.MULTILINE)
    }
    {
    @Property(viewable = true, editable = true, order = 12)
    public Long getMinValue()
        return dataTypeId;
        return seqType;

    }
    private Timestamp createTime;
    @Property(viewable = false, editable = true, updatable = true, order = 6)
    // -----------------
    public String getBaseSchema()
    public Boolean getOrder()
import org.jkiss.code.NotNull;
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
 * @author Denis Forveille
    @Property(viewable = true, editable = false, order = 2)
    }
        return maxValue;
    public void setCache(Integer cache)
    }
 * 
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;

        seqType = DB2SequenceType.S;

    {
    }
 * you may not use this file except in compliance with the License.
    }
        this.precision = precision;
        this.seqId = JDBCUtils.safeGetInteger(dbResult, "SEQID");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    }
        return createTime;
        cycle = false;


    {
    private Timestamp alterTime;
    @Override
    {
        this.start = start;
    private DB2SequencePrecision precision;
    @Property(viewable = true, editable = true, updatable = true, order = 9)
    }
 * limitations under the License.
        this.sourceTypeId = JDBCUtils.safeGetInteger(dbResult, "SOURCETYPEID");
    }
    @Property(viewable = false, editable = true, updatable = true, order = 6)
    {
    {
    {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2SequenceType;
    @Property(viewable = false, editable = false)
    public Integer getSourceTypeId()
        this.cycle = JDBCUtils.safeGetBoolean(dbResult, "CYCLE", DB2YesNo.Y.name());

        this.maxValue = JDBCUtils.safeGetLong(dbResult, "MAXVALUE");
    private DB2OwnerType ownerType;
    }

    }

    public void setOrder(Boolean order)
 * Licensed under the Apache License, Version 2.0 (the "License");

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    @Property(viewable = true, editable = true, updatable = true, order = 8)
    public DB2OwnerType getOwnerType()
    private DB2OwnerType origin;
    public Integer getCache()

        return remarks;
 * See the License for the specific language governing permissions and

    public void setPrecision(DB2SequencePrecision precision)
        this.minValue = minValue;
    }
    @Override
        this.seqType = CommonUtils.valueOf(DB2SequenceType.class, JDBCUtils.safeGetString(dbResult, "SEQTYPE"));
        return baseSchema;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_BASEBJECT)

    {
        ownerType = DB2OwnerType.U;
        return origin;
        this.dataTypeId = JDBCUtils.safeGetInteger(dbResult, "DATATYPEID");
    private Integer cache;
        this.order = order;
        origin = DB2OwnerType.U;
    public DB2OwnerType getOrigin()
    public DB2Sequence(DB2Schema schema, String name)
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Long maxValue;
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = true, editable = false, order = 5)
    public Number getLastValue() {
    // -----------------------
        this.cache = cache;
 *

        this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
    public void setIncrementBy(Long incrementBy)
    private Integer seqId;

    private DB2SequenceType seqType;

        this.incrementBy = JDBCUtils.safeGetLong(dbResult, "INCREMENT");
 * DB2 sequence
        this.incrementBy = incrementBy;
        return owner;

    // -----------------
    {
        this.cache = JDBCUtils.safeGetInteger(dbResult, "CACHE");
    public void setMinValue(Long minValue)
import java.sql.ResultSet;

    private Long minValue;
        super(schema, name, false);
        order = false;
    // Constructors
        cache = 20;

    }
    @Property(viewable = true, editable = false, order = 1)
    }
        this.cycle = cycle;
    {
    {
    {
        return cycle;
        }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    {
    @Property(viewable = false, editable = false, order = 23)
    }
    }
    }
    private Long nextCacheFirstValue;
    private Integer sourceTypeId;
    @NotNull
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
    public Long getNextCacheFirstValue()
        return super.getName();
        return baseSequence;
    public Integer getDataTypeId()

        return getNextCacheFirstValue();

        this.minValue = JDBCUtils.safeGetLong(dbResult, "MINVALUE");
            this.baseSequence = JDBCUtils.safeGetString(dbResult, "BASE_SEQNAME");

import java.sql.Timestamp;

        return super.getSchema();
 */
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
        return cache;
    public String getDescription()
}
        return incrementBy;
        this.remarks = remarks;
    }

    private Boolean order;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_BASEBJECT)

import org.jkiss.dbeaver.ext.db2.DB2Constants;
    {
    public DB2Schema getSchema()
 *
        return order;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.db2.model.dict.DB2SequencePrecision;
    public Long getIncrementBy()
    public String getOwner()
    {
    }

/**
    }
    public Integer getSeqId()
        return this;
        return minValue;
    @Property(viewable = true, editable = false, order = 4)
    private Long start;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
    }
    @Nullable
    {
        this.order = JDBCUtils.safeGetBoolean(dbResult, "ORDER", DB2YesNo.Y.name());
    }
        return seqId;

    }
        this.precision = DB2SequencePrecision.getFromDataType(JDBCUtils.safeGetInteger(dbResult, "PRECISION"));

    }
        // DB2 Default
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    {

        this.nextCacheFirstValue = JDBCUtils.safeGetLong(dbResult, "NEXTCACHEFIRSTVALUE");
        }
    // -----------------------
    public void setStart(Long start)
import org.jkiss.dbeaver.model.meta.Property;
    private String baseSequence;
    private Boolean cycle;
public class DB2Sequence extends DB2SchemaObject implements DBSSequence, DBPRefreshableObject {

    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
    {
    }

        this.nextCacheFirstValue = nextCacheFirstValue;
        return sourceTypeId;
    @Property(viewable = false, editable = false)

    }
    public void setMaxValue(Long maxValue)
    }
 *

    }

        return alterTime;
        incrementBy = 1L;
    public void setNextCacheFirstValue(Long nextCacheFirstValue)
        return nextCacheFirstValue;
    public String getName()
    {
        return ownerType;
        precision = DB2SequencePrecision.P10;

    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {
    {
    @Override
    public Timestamp getAlterTime()
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * You may obtain a copy of the License at
    }
    }
    {

    // Properties

    }
    public void setDescription(String remarks)
    {


        super(schema, JDBCUtils.safeGetString(dbResult, "SEQNAME"), true);
    @Property(viewable = true, editable = true, updatable = true, order = 7)
        if (db2DataSource.isAtLeastV9_5()) {
    {
    @Override
    @Property(viewable = true, editable = true, updatable = true, order = 10)
    public void setCycle(Boolean cycle)
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
    {
        return start;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    private String remarks;
    @Property(viewable = false, editable = false)

    {
import org.jkiss.dbeaver.DBException;

package org.jkiss.dbeaver.ext.db2.model;

    private Integer dataTypeId;
    }
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);

import org.jkiss.dbeaver.model.struct.DBSObject;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
    public DB2Sequence(DB2Schema schema, ResultSet dbResult)
