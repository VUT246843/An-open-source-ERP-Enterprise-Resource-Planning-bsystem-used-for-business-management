        this.expression = source.expression;

    public long getChecksum()
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 9)
    @NotNull
import org.jkiss.dbeaver.model.DBConstants;
    @NotNull

    public long getTableRows()
    @Override
 *
        setPartition(true);
    }
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 16)

    }
 */
import org.jkiss.dbeaver.DBException;
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 14)
        if (subPartitions == null) {
import org.jkiss.dbeaver.model.DBUtils;
        this.nodegroup = source.nodegroup;
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 11)
        return maxDataLength;
    }
        this.tableRows = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_TABLE_ROWS);
    private MySQLTable table;
import org.jkiss.dbeaver.model.meta.Property;
    public Date getUpdateTime()
        this.name = name;
/*
    {



    {
        return parent;
    }
                MySQLConstants.COL_PARTITION_EXPRESSION :
            parent == null ?
    {
    private long dataLength;
    public long getMaxDataLength()
import java.sql.ResultSet;
            subPartitions = new ArrayList<>();
import java.util.List;
                MySQLConstants.COL_SUBPARTITION_EXPRESSION);
            parent == null ?
    }


    }
        }


        return nodegroup;
    @Property(viewable = true, order = 3)
}
    {
    public long getIndexLength()
        if (parent != null) {
    @NotNull

    @Override
    }

        this.maxDataLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_MAX_DATA_LENGTH);
    }
        this.description = source.description;

    private String expression;
    public DBSTable getParentTable() {
    protected String getTableName() {

    // Copy constructor
    {
    private void addSubPartitions(MySQLPartition partition)
    @Override
    @Association
        this.expression = JDBCUtils.safeGetString(dbResult,
        MySQLTable table,
        this.table = source.table;

    }
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 6)
    }
    {
import org.jkiss.dbeaver.model.DBPEvaluationContext;

        return tableRows;
 */
    public String getExpression()

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    }
        this.nodegroup = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_NODEGROUP);
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    private String method;
import org.jkiss.dbeaver.model.meta.Association;
    {
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.ArrayList;
        return comment;
    private int position;
    }
        this.comment = source.comment;
    }
    protected MySQLPartition(
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 7)

    public boolean needFullPath() {
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, MySQLConstants.COL_CREATE_TIME);
package org.jkiss.dbeaver.ext.mysql.model;
    public List<MySQLPartition> getSubPartitions()
        return checkTime;
                MySQLConstants.COL_SUBPARTITION_ORDINAL_POSITION);
    @Property(viewable = true, editable = false, updatable = false, order = 1)
        this.comment = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_PARTITION_COMMENT);
    protected MySQLPartition(MySQLTable mySQLTable, MySQLPartition parent, String name, ResultSet dbResult)
    protected void appendExtraSelectParameters(@NotNull StringBuilder query) {
 *


    {
import org.jkiss.dbeaver.model.meta.PropertyLength;
        return createTime;
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;

    private MySQLPartition parent;
    private long indexLength;
    private String description;

    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 13)
    }
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 10)
    @Property(viewable = true, order = 5)
    public String getDescription()
    public long getAvgRowLength()
    }
    @NotNull

        return table.getObjectDefinitionText(monitor, options);
    public String getComment()
        return updateTime;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    @Override
    private long dataFree;

    }
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 8)
    private List<MySQLPartition> subPartitions;
    @Override
        this.method = JDBCUtils.safeGetString(dbResult,
    @Property(viewable = true, order = 4)
    {
    @Nullable
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 15)
 * See the License for the specific language governing permissions and
    @Override
    {
    }
        return table;
 * DBeaver - Universal Database Manager
        this.checkTime = JDBCUtils.safeGetTimestamp(dbResult, MySQLConstants.COL_CHECK_TIME);
        return subPartitions;
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        DBRProgressMonitor monitor,
        query.append(" PARTITION (").append(DBUtils.getQuotedIdentifier(this)).append(")");
    ) {
        return table.getFullyQualifiedName(DBPEvaluationContext.DML);
        return dataFree;
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.model.DBPDataSource;
        return indexLength;
    public MySQLPartition getPartitionParent() {
        super(monitor, table.getContainer(), sourceEntity);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        subPartitions.add(partition);
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 12)
    public String getMethod()
    @Property(viewable = true, order = 17)
    }
    }
    public Date getCheckTime()
    public long getDataFree()
    }
        this.name = source.name;
        this.checksum = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_CHECKSUM);
        this.method = source.method;
        this.avgRowLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_AVG_ROW_LENGTH);
        return parent != null;

 * You may obtain a copy of the License at
    {
    private long checksum;
 * MySQLPartition


        setPartition(true);
    {

import java.util.Map;
    private long maxDataLength;
        this.indexLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_INDEX_LENGTH);
        return description;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.code.Nullable;
    }
    @Nullable
        return false;
            parent.addSubPartitions(this);
    protected boolean needAliasInSelect(
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
            parent == null ?
    private String nodegroup;
    public boolean isSubPartition() {
        this.parent = parent;
        this.table = mySQLTable;
        @NotNull DBPDataSource dataSource
        this.dataLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_DATA_LENGTH);
    @Override
    public long getDataLength()

        return false;
    public String getNodegroup()
    {

        @Nullable DBDDataFilter dataFilter,
    private String comment;
    }
        this.position = source.position;
/**

        this.dataFree = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_DATA_FREE);
                MySQLConstants.COL_PARTITION_ORDINAL_POSITION :
    public int getPosition()
 * Unless required by applicable law or agreed to in writing, software
    public Date getCreateTime()
    private long avgRowLength;
        return expression;
 * limitations under the License.
    }
    }
    {
        MySQLPartition source,
import org.jkiss.dbeaver.model.data.DBDDataFilter;
public class MySQLPartition extends MySQLTable implements DBSTablePartition {
    private Date createTime;

        return method;
    private long tableRows;
                MySQLConstants.COL_PARTITION_METHOD :

        return name;
        return position;
    @Override
        this.description = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_PARTITION_DESCRIPTION);
import org.jkiss.code.NotNull;
    {
        this.updateTime = JDBCUtils.safeGetTimestamp(dbResult, MySQLConstants.COL_UPDATE_TIME);

    ) throws DBException {
    public String getName()
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
 *
        DBSEntity sourceEntity
    private Date checkTime;
        return checksum;
    }
    }
    }
        @Nullable DBDPseudoAttribute rowIdAttribute,
    @Override
    {
    {
    private Date updateTime;
    private String name;
                MySQLConstants.COL_SUBPARTITION_METHOD);
        return dataLength;
    }
        super(mySQLTable.getContainer(), dbResult);
import java.util.Date;
 * you may not use this file except in compliance with the License.
        this.position = JDBCUtils.safeGetInt(dbResult,
    @Property(viewable = true, order = 2)

        return avgRowLength;
