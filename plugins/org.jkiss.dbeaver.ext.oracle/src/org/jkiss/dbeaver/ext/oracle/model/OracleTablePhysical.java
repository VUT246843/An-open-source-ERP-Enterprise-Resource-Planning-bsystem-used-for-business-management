                    (partition != null || CommonUtils.isNotEmpty(partitionName) ? " AND PARTITION_NAME=?" : "") +
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 20)

                "  UNION ALL\n" +
    public PartitionInfo getPartitionInfo(DBRProgressMonitor monitor) throws DBException

    public void setTablespace(OracleTablespace tablespace) {
        {
            return Collections.emptyList();
        throws DBException
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    private static final String SUB_PART_KEY_TYPE = "SUBPART";
        ) throws SQLException {
        if (isPersisted() && partitionedBy == null && isPartitioned()) {
            @NotNull JDBCResultSet resultSet
                    }
        return partitionCache.getCachedObjects();
                "FROM SYS.ALL_SUBPART_KEY_COLUMNS\n" +
        }
    }
        }
    }


    public synchronized Long getRealRowCount(DBRProgressMonitor monitor)
            return object.partitionedBy != null;

            try {
    }
    @Property(viewable = true, order = 13)
                    }
                    .collect(Collectors.joining(","));
        }
    @Override
    }
        this.getContainer().indexCache.clearObjectCache(this);
    private String partitionedBy;
            @NotNull JDBCSession session,
        partitionKeys.clear();
                stat.setString(4, tableName);

        @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
            log.warn("Error fetching table '" + tableName + "' partition keys info.", e);
            return new OracleTablePartition(table, partitionName, resultSet, null);
                "  AND NAME = ?\n" +
import org.jkiss.dbeaver.DBDatabaseException;
    @Property(viewable = true, order = 22, editable = true, updatable = true, listProvider = TablespaceListProvider.class)
        super(schema, dbResult);
        } catch (DBException e) {
    public Object getTablespace() {
        }
                    while (resultSet.next()) {
        return OracleTablespace.resolveTablespaceReference(monitor, this, null);
    public String getPartitionedBy(DBRProgressMonitor monitor) {
 */
            dbStat.setString(1, table.getContainer().getName());
        return this.getContainer().indexCache.getObjects(monitor, getContainer(), this);
import org.jkiss.dbeaver.model.struct.DBSObject;
        }

import java.sql.SQLException;

                            } else {
    public static class PartitioningTablePropertyValidator implements IPropertyValueValidator<OracleTablePhysical, Object> {
    public Set<OracleTableColumn> getPartitionKeys() {

        }
    }
    @LazyProperty(cacheValidator = PartitionedValueLoadValidator.class)
     */

    }
    {
            return dbStat;
            log.debug("Can't fetch row count", e);
            partitionInfo = new PartitionInfo();
    @Property(viewable = true, editableExpr = "object.getDataSource().supportsPartitionsCreation()", order = 16,
                stat.setString(2, tableName);
        }
        if (partitionInfo == null && partitioned && isPersisted()) {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
                "WHERE OBJECT_TYPE = 'TABLE'\n" +
            try (final JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load partitioning info")) {
 *
                        OracleTableColumn col = getAttribute(monitor, colName);
    private void loadPartitionKeys(@NotNull DBRProgressMonitor monitor) {
            subPartitionedBy = subPartitionKeys.stream()
        }
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
                return null;
        this.partitioned = false;
                                getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
            loadPartitionKeys(monitor);
            super();
                        }
            return false;
        }
        return tablespace;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        // Table partition
import org.jkiss.utils.CommonUtils;
    {
    public Collection<OracleTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor)
                "  AND OWNER = ?\n" +
import java.sql.ResultSet;

            @Nullable String partitionName
 * Copyright (C) 2010-2025 DBeaver Corp and others
        String tableName = getName();
        readSpecialProperties(dbResult);
    private Set<OracleTableColumn> partitionKeys = new HashSet<>();
     */
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read row count")) {
                            }

        this.tablespace = JDBCUtils.safeGetString(dbResult, "TABLESPACE_NAME");
            }
                    "\nORDER BY PARTITION_POSITION");
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, expensive = true, order = 21)
        readSpecialProperties(dbResult);
            // Load partition key info
import org.jkiss.dbeaver.model.DBConstants;
    }

        return partitionCache.getAllObjects(monitor, this);
            } catch (DBException e) {
            }
        }
                            partitionInfo = new PartitionInfo(monitor, this.getDataSource(), dbResult);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                partitionedBy = partitionKeys.stream()
        }
    @Override
        // Query row count
                    dbStat.setString(1, getContainer().getName());
        return super.refreshObject(monitor);
    protected OracleTablePhysical(@NotNull OracleSchema schema, @NotNull ResultSet dbResult, @NotNull String name) {
        @Nullable
            }
    public boolean isPartitioned() {

            return realRowCount;
                throw new DBDatabaseException(e, getDataSource());
        return partitionInfo;
    }
    public Set<OracleTableColumn> getSubPartitionKeys() {
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
        }
    }
            @NotNull OracleTablePhysical table,
        if (partitionCache != null) {
        partitionInfo = null;
    protected OracleTablePhysical(@NotNull OracleSchema schema, @NotNull ResultSet dbResult) {



     */
    public Collection<OracleTablePartition> getCachedPartitions() {
        if (partitionCache == null) {
        throws DBException
    }
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSPartitionContainer;
            try (JDBCPreparedStatement stat = session.prepareStatement("SELECT COLUMN_NAME, 'PART' AS TYPE\n" +
    private PartitionInfo partitionInfo;
            tablespaces.sort(DBUtils.<OracleTablespace>nameComparator());
    private static final Log log = Log.getLog(OracleTablePhysical.class);
    @NotNull
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public long getRowCount()
        this.partitionCache = new PartitionCache();
import java.util.*;
        return partitioned;
    }
                stat.setString(1, schemaName);
    {
        public boolean isValidValue(@NotNull OracleTablePhysical object, @Nullable Object value) throws IllegalArgumentException {
 * limitations under the License.
                            if (SUB_PART_KEY_TYPE.equals(keyType)) {
                stat.setString(3, schemaName);
    }
        @Override
    /**
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load partition key info for table")) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    }
    }
     * Returns cached partitions list (for newly created tables, basically).
        visibleIf = PartitioningTablePropertyValidator.class)
 * you may not use this file except in compliance with the License.
    public static class PartitionedValueLoadValidator implements IPropertyCacheValidator<OracleTablePhysical> {
    public Collection<OracleTablePartition> getPartitions(DBRProgressMonitor monitor) throws DBException {
    private long rowCount;
import java.util.stream.Collectors;

            return getCachedPartitions();
        public Object[] getPossibleValues(OracleTablePhysical object)
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
            }
    }

        return partitionCache;
                            log.warn("Column '" + colName + "' not found in table '" +
                dbStat.setString(3, partition != null ? partition.getName() : partitionName);
            super(monitor, dataSource, dbResult);
                "FROM SYS.ALL_PART_KEY_COLUMNS\n" +
    {
    }

        public JDBCStatement prepareLookupStatement(
        return subPartitionKeys;
        public boolean allowCustomValue()
        }
    public PartitionCache getPartitionCache() {
        if (CommonUtils.isNotEmpty(partitionedBy) && partitionInfo == null) {
            @NotNull OracleTablePhysical table,
        public boolean isPropertyCached(@NotNull OracleTablePhysical object, @NotNull Object propertyId) {
 * You may obtain a copy of the License at
        protected OracleTablePartition fetchObject(
    private PartitionCache partitionCache;
    public Object getTablespace(DBRProgressMonitor monitor) throws DBException
                .map(JDBCTableColumn::getName)
                .collect(Collectors.joining(","));
    //private boolean valid;
            realRowCount = countData(new AbstractExecutionSource(this, session.getExecutionContext(), this), session, null, DBSDataContainer.FLAG_NONE);
import org.jkiss.dbeaver.Log;

        @Override
                        String keyType = resultSet.getString(2);
    private Long realRowCount;
/*


                    "\nWHERE TABLE_OWNER=? AND TABLE_NAME=? " +
        this.valid = OracleUtils.getObjectStatus(monitor, this, OracleObjectType.TABLE);
    @PropertyGroup
    public PartitionInfo getPartitionInfo() {
        return subPartitionedBy;

                    dbStat.setString(2, getName());
        }
    @Association
        this.partitionedBy = partitionedBy;
                        if (col == null) {
    private static class PartitionCache extends JDBCObjectLookupCache<OracleTablePhysical, OracleTablePartition> {

        }
    public OracleTableIndex getIndex(DBRProgressMonitor monitor, String name)
import org.jkiss.code.NotNull;
    private Set<OracleTableColumn> subPartitionKeys = new HashSet<>();
    public Object getLazyReference(Object propertyId)

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private String subPartitionedBy;

import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableColumn;
        visibleIf = PartitioningTablePropertyValidator.class)
        this.tablespace = tablespace;
            final List<OracleTablespace> tablespaces = new ArrayList<>();
public abstract class OracleTablePhysical extends OracleTableBase implements DBSObjectLazy<OracleDataSource>, DBSPartitionContainer {
            } catch (SQLException e) {
        subPartitionKeys.clear();
            // Do not count rows for views

                        }
    }
        }
        {
}
        public PartitionInfo(DBRProgressMonitor monitor, OracleDataSource dataSource, ResultSet dbResult) {


    @LazyProperty(cacheValidator = PartitionInfoValidator.class)
                        if (dbResult.next()) {
    }
            if (partition != null || CommonUtils.isNotEmpty(partitionName)) {
        super(schema, name, false);
        this.partitioned = JDBCUtils.safeGetBoolean(dbResult, "PARTITIONED", OracleConstants.RESULT_YES_VALUE);
            return Collections.emptyList();
                log.error(e);
                "  AND NAME = ?")
                        } else {
    public void setPartitionedBy(String partitionedBy) {
import org.jkiss.dbeaver.model.meta.*;
    {
    {
        this.subPartitionedBy = subPartitionedBy;
        {
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    }
        return partitionInfo;
        return partitionKeys;
    /**
import org.jkiss.dbeaver.DBException;
            partitionCache.clearCache();
    private Object tablespace;
import org.jkiss.dbeaver.model.exec.DBCException;
            return object.partitioned && object.partitionInfo != null;
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
            @Nullable OracleTablePartition partition,
    public void setSubPartitionedBy(String subPartitionedBy) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
            realRowCount = -1L;
    }
        }
        this.partitionCache = partitioned ? partitionCache == null ? new PartitionCache() : partitionCache : null;
    @LazyProperty(cacheValidator = OracleTablespace.TablespaceReferenceValidator.class)
        @NotNull
    @Override
                "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(table.getDataSource()) + "ALL_TAB_PARTITIONS " +
        this.rowCount = JDBCUtils.safeGetLong(dbResult, "NUM_ROWS");
 *
        return partitionedBy;
        if (partitionCache == null) {
import org.jkiss.dbeaver.model.DBUtils;
            return !(object instanceof OracleTablePartition) && (!object.isPersisted() || object.isPartitioned());
        }
    }
    {
        if (partitionCache == null) {
            }
    }
    @Association
                "SELECT COLUMN_NAME, '" + SUB_PART_KEY_TYPE + "' AS TYPE\n" +
        @Override
    /**
            @NotNull JDBCSession session,
 * DBeaver - Universal Database Manager
                "WHERE OBJECT_TYPE = 'TABLE'\n" +
                                partitionKeys.add(col);
                        String colName = resultSet.getString(1);
                try (JDBCResultSet resultSet = stat.executeQuery()) {
            return tablespaces.toArray(new OracleTablespace[0]);


    }
import org.jkiss.dbeaver.model.exec.DBCSession;
    }

            return null;
    @Nullable
            if (CommonUtils.isEmpty(partitionName)) {
     * Returns partitions list for partitioned tables, cached partitions for newly create tables and empty list for others.
        if (CommonUtils.isEmpty(subPartitionedBy) && !CommonUtils.isEmpty(subPartitionKeys)) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM ALL_PART_TABLES WHERE OWNER=? AND TABLE_NAME=?")) {
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
        if (!isPersisted()) {
            partitionCache = new PartitionCache();
        // Read indexes using cache
            String partitionName = JDBCUtils.safeGetString(resultSet, "PARTITION_NAME");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    .map(JDBCTableColumn::getName)

                String schemaName = getSchema().getName();
        return this.getContainer().indexCache.getObject(monitor, getContainer(), this, name);

    }
            dbStat.setString(2, table.getName());
        PartitionInfo() {
        public boolean isPropertyCached(@NotNull OracleTablePhysical object, @NotNull Object propertyId)
    }
        super(schema, name);
    private void readSpecialProperties(@NotNull ResultSet dbResult) {
    {
        }
    private boolean partitioned;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                }

        return tablespace;
    @Nullable
    public static class PartitionInfo extends OracleTablePartition.PartitionInfoBase {
        return rowCount;
            }
        } catch (Exception e) {
                "  AND OWNER = ?\n" +
                                subPartitionKeys.add(col);
    }
    @Property(viewable = true, editableExpr = "object.getDataSource().supportsPartitionsCreation()", order = 17,
/**

        @Override
        }
        if (realRowCount != null) {

    public static class PartitionInfoValidator implements IPropertyCacheValidator<OracleTablePhysical> {
        return realRowCount;
    }
 * Oracle physical table
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (realRowCount == null) {
    }

            ) {
    @Association
        @Override

    protected OracleTablePhysical(@NotNull OracleSchema schema, @NotNull String name) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

                }

    public static class TablespaceListProvider implements IPropertyValueListProvider<OracleTablePhysical> {
    public String getSubPartitionedBy() {
        ) throws SQLException, DBException {
        @Override
                tablespaces.addAll(object.getDataSource().getTablespaces(new VoidProgressMonitor()));
        this.partitionInfo = new PartitionInfo();
package org.jkiss.dbeaver.ext.oracle.model;


    @Override
            if (!CommonUtils.isEmpty(partitionKeys)) {
        if (!isPersisted()) {
    }
     * To provide partition keys as a string  via UI.
