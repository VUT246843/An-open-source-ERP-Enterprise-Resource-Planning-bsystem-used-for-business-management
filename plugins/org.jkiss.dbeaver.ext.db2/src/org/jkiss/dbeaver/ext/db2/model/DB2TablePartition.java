import org.jkiss.code.Nullable;
 *

import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablePartitionAccessMode;
        this.indexTablespace = DB2Utils
    @Property(viewable = true, editable = false, order = 1)
            .findTablespaceById(new VoidProgressMonitor(), db2Table.getDataSource(), longTablespaceId);

        return indexTablespace;
 */
 * limitations under the License.
        return accessMode;
    public DBSTablePartition getPartitionParent() {
    @Property(viewable = false, order = 5, category = DB2Constants.CAT_TABLESPACE)
    @Property(viewable = true, order = 2)
    private Integer partitionObjectId;
            true);
    }
    @Override
    {
            this.statsTime = JDBCUtils.safeGetTimestamp(dbResult, "STATS_TIME");
        this.seqNo = JDBCUtils.safeGetInteger(dbResult, "SEQNO");
    {
package org.jkiss.dbeaver.ext.db2.model;
 * Unless required by applicable law or agreed to in writing, software

        }
    }
    @NotNull
    }
    public Long getCard()
    @Property(viewable = true, order = 12)
    @Property(viewable = false, order = 24, category = DBConstants.CAT_STATISTICS)
        return status;

    @Property(viewable = false, order = 20, category = DBConstants.CAT_STATISTICS)
 * DBeaver - Universal Database Manager

    {
    // -----------------------
    @Property(viewable = true, order = 13)
                indexTablespaceId);

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false, order = 6, category = DB2Constants.CAT_TABLESPACE)
    }
    {
    private Long fPages;
    {
    {
        return longTablespace;
    @Property(viewable = false, order = 23, category = DBConstants.CAT_STATISTICS)
    @Property(viewable = false, order = 3)
        Integer tablespaceId = JDBCUtils.safeGetInteger(dbResult, "TBSPACEID");
        return statsTime;
            this.card = JDBCUtils.safeGetLongNullable(dbResult, "CARD");

    {
    {
            this.lastUsed = JDBCUtils.safeGetDate(dbResult, "LASTUSED");
    @Property(viewable = true, order = 8)
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Integer seqNo;
    private Long card;

    @Property(viewable = true, order = 7)
 *
    @Property(viewable = true, order = 11)

    }
    {


    {
    {
    @Property(viewable = true, order = 4, category = DB2Constants.CAT_TABLESPACE)
    }
    }
        return fPages;
    private Long nPages;
    public DBSTable getParentTable() {
        this.status = CommonUtils.valueOf(DB2TablePartitionStatus.class, JDBCUtils.safeGetString(dbResult, "STATUS"));
        if (db2DataSource.isAtLeastV9_5()) {
    private Date lastUsed;
 * Licensed under the Apache License, Version 2.0 (the "License");

    public Long getOverFLow()
            this.longTablespace = DB2Utils.findTablespaceById(new VoidProgressMonitor(), db2Table.getDataSource(),
}
    @Property(viewable = true, order = 10)
        Integer longTablespaceId = JDBCUtils.safeGetInteger(dbResult, "LONG_TBSPACEID");
    }
    public Date getLastUsed()
    public Integer getSeqNo()
    {
    {
import org.jkiss.utils.CommonUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

import org.jkiss.code.NotNull;
    private DB2TablePartitionAccessMode accessMode;
import org.jkiss.dbeaver.ext.db2.DB2Constants;

    public Long getfPages()
 */

        return partitionObjectId;
    }

    @Property(viewable = false, order = 22, category = DBConstants.CAT_STATISTICS)

        return parent;
            this.fPages = JDBCUtils.safeGetLongNullable(dbResult, "FPAGES");
    private String highValue;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablePartitionStatus;
/*

    public Long getnPages()
 * DB2 Table Partition
    public DB2TablePartitionStatus getStatus()
    @NotNull
    }
            this.nPages = JDBCUtils.safeGetLongNullable(dbResult, "NPAGES");
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    }
        return false;
    private DB2Tablespace indexTablespace;
    public Boolean getLowInclusive()
    @Property(viewable = true, order = 9)
    public String getHighValue()
import org.jkiss.dbeaver.DBException;

        DB2DataSource db2DataSource = db2Table.getDataSource();
    }
/**

 * @author Denis Forveille
        super(db2Table, JDBCUtils.safeGetString(dbResult, "DATAPARTITIONNAME"), JDBCUtils.safeGetInt(dbResult, "DATAPARTITIONID"),
    public DB2Tablespace getLongTablespace()
    }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    }

        this.accessMode = CommonUtils.valueOf(DB2TablePartitionAccessMode.class, JDBCUtils.safeGetString(dbResult, "ACCESS_MODE"));
        this.lowValue = JDBCUtils.safeGetString(dbResult, "LOWVALUE");


import org.jkiss.dbeaver.ext.db2.DB2Utils;
    public String getName()
    private DB2Tablespace longTablespace;
    {
    public Integer getPartitionObjectId()
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    public DB2Tablespace getTablespace()
        this.highValue = JDBCUtils.safeGetString(dbResult, "HIGHVALUE");
    @Override
public class DB2TablePartition extends DB2Object<DB2Table> implements DBSTablePartition {
    private Boolean highInclusive;
    // Properties

        this.highInclusive = JDBCUtils.safeGetBoolean(dbResult, "HIGHINCLUSIVE", DB2YesNo.Y.name());
        this.tablespace = DB2Utils.findTablespaceById(new VoidProgressMonitor(), db2Table.getDataSource(), tablespaceId);

import org.jkiss.dbeaver.model.DBConstants;
    // -----------------

    @Override
    private Long overFLow;


    @Property(viewable = false, order = 21, category = DBConstants.CAT_STATISTICS)
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
    {
    }
    public boolean isSubPartition() {
    public Timestamp getStatsTime()
        // Lookup tablespaces
        this.partitionObjectId = JDBCUtils.safeGetInteger(dbResult, "PARTITIONOBJECTID");
    }
    {
    }
import java.sql.ResultSet;
        return highValue;
import java.sql.Timestamp;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    }

    {
        return lowInclusive;
        return seqNo;
    }
    // -----------------------
        return null;
    {

        return overFLow;
    public DB2Table getTable()
 * See the License for the specific language governing permissions and
    private Timestamp statsTime;
        this.lowInclusive = JDBCUtils.safeGetBoolean(dbResult, "LOWINCLUSIVE", DB2YesNo.Y.name());
    private String lowValue;
        return parent;
 * 

 * You may obtain a copy of the License at

        return lastUsed;
            this.overFLow = JDBCUtils.safeGetLongNullable(dbResult, "OVERFLOW");
        return highInclusive;
        return card;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private DB2TablePartitionStatus status;
    }

        }
    @Property(viewable = false, order = 40)
    {

        return nPages;

import org.jkiss.dbeaver.model.meta.Property;
    {
            Integer indexTablespaceId = JDBCUtils.safeGetInteger(dbResult, "INDEX_TBSPACEID");
    @Override

    private Boolean lowInclusive;

    }
        return lowValue;
    public DB2TablePartition(DB2Table db2Table, ResultSet dbResult) throws DBException

import java.sql.Date;
        return tablespace;
    public Boolean getHighInclusive()
    private DB2Tablespace tablespace;
    public DB2Tablespace getIndexTablespace()
    public DB2TablePartitionAccessMode getAccessMode()
        return super.getName();
 * you may not use this file except in compliance with the License.
    // -----------------
    // Constructors
    public String getLowValue()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
 *
        if (db2DataSource.isAtLeastV9_7()) {
