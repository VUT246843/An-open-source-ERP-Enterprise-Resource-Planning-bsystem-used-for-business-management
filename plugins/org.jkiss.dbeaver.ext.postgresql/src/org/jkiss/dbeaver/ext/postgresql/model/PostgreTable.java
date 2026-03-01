        if (CommonUtils.isEmpty(si)) {
                            final long subTableId = JDBCUtils.safeGetLong(dbResult, "inhrelid"); //$NON-NLS-1$
        @Override
    public List<PostgreTableBase> getSubTables(DBRProgressMonitor monitor) throws DBException {
    }
        if (superTables == null && getDataSource().getServerType().supportsInheritance() && isPersisted() && monitor != null) {
    public void setHasRowLevelSecurity(boolean hasRowLevelSecurity) {
            // Prefetch partitions (shouldn't be too expensive, we already have all tables in cache)
            }
                "WHERE i.inhrelid=? AND c.oid=i.inhparent " +


        if (superTables == null) {
                    partSizeSum += ((PostgreTableReal) partTable).getStatObjectSize();
                                this,
        }
                                log.warn("Can't find sub-table's schema '" + subSchemaId + "'");
        return result;
    public PolicyCache getPolicyCache() {

    @Nullable
                    while (dbResult.next()) {
                    throw new DBCException(e, session.getExecutionContext());
/*
        List<PostgreTableBase> result = new ArrayList<>(si.size());
                        if (parentTable == null) {
                        PostgreSchema schema = getDatabase().getSchema(monitor, parentSchemaId);
    @Nullable

                result.add(table);

        super(container);
 * DBeaver - Universal Database Manager
    public PostgreTable(PostgreTableContainer container)
    }
    public PostgreTable(DBRProgressMonitor monitor, PostgreTableContainer container, PostgreTable source, boolean persisted) throws DBException {

                    while (dbResult.next()) {
    public boolean isView() {
    public List<PostgreTableBase> getSuperTables(DBRProgressMonitor monitor) throws DBException {
        }
        @Override
                    "FROM pg_catalog.pg_inherits i,pg_catalog.pg_class c " +
        if (getDataSource().getServerType().supportsHasOidsColumn()) {
import org.jkiss.code.Nullable;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * See the License for the specific language governing permissions and
        if (indexCache != null) {
import org.jkiss.dbeaver.model.meta.Property;
    @Override

                            continue;
    private String partitionKey;
        this.hasRowLevelSecurity = hasRowLevelSecurity;

        } else {
            @NotNull PostgreTable table,
    }
    private List<PostgreTableInheritance> subTables;
        }
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT DISTINCT connamespace FROM pg_catalog.pg_constraint WHERE confrelid=?")) {

    }
            return foreignKeys;
                            new PostgreTableInheritance(
    }
    @Property(viewable = true, editable = true, updatable = true, order = 20, listProvider = TablespaceListProvider.class)
    private String partitionRange;
                            tables.add(
                        }

    }
                }
        if (CommonUtils.isEmpty(superTables)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Property(viewable = true, updatable = true, order = 41, visibleIf = PostgreColumnHasRowLevelSecurity.class)
    private boolean hasRowLevelSecurity;
    public PostgreTablespace getTablespace(DBRProgressMonitor monitor) throws DBException {
        if (diskSpace != null && subTables != null) {
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
        }
                    }
            return object.getDataSource().getServerType().supportsRowLevelSecurity();
            stmt.setString(1, table.getSchema().getName());
        this.hasPartitions = this.partitionKey != null;
            }
        List<PostgreTableBase> result = new ArrayList<>(si.size());

        List<DBSEntityAssociation> refs = new ArrayList<>(
import org.jkiss.dbeaver.model.struct.*;
                        final PostgreSchema schema = getContainer().getDatabase().getSchema(monitor, schemaId);
        return si.stream()
    protected void fetchStatistics(JDBCResultSet dbResult) throws DBException, SQLException {
            result.add(si.get(i1).getAssociatedEntity());
            for (PostgreTableInheritance ti : subTables) {
            .collect(Collectors.toList());
        return partitionKey;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        public boolean isValidValue(@NotNull PostgreTable object, @Nullable Object value) throws IllegalArgumentException {
    public SimpleObjectCache<PostgreTable, PostgreTableForeignKey> getForeignKeyCache() {
                return Collections.emptyList();
                }
                PostgreTableBase partTable = ti.getParentObject();
    public List<PostgreTableInheritance> getSubInheritance(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
    @Override
    @Nullable
        }
    @Property(viewable = false, optional = true, order = 31)
            }
    public String getPartitionRange(DBRProgressMonitor monitor) throws DBException {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

    }
        @Nullable

    public void setHasOids(boolean hasOids) {
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
        for (PostgreTableInheritance aSi : si) {
        }
        this.tablespaceId = tablespace.getObjectId();
    private long depObjectId;
        return refs;
        policyCache.clearCache();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, PostgreTableConstraint.class),
        if (CommonUtils.isEmpty(si)) {
    private long tablespaceId;
        return this.hasOids && getDataSource().getServerType().supportsOids();
        }
import java.util.*;
                            }
            DBUtils.orderObjects(tables);
    void resetSuperInheritance() {
        return super.supportsObjectDefinitionOption(option);
        agg.addAll(superTables);
    }
                } catch (SQLException e) {
        this.tablespaceId = container == source.getContainer() ? source.tablespaceId : 0;
        return getSchema().getConstraintCache().getTypedObjects(monitor, getSchema(), this, PostgreTableForeignKey.class);
    }
        if (partitionRange == null && getDataSource().getServerType().supportsInheritance()) {
    private final SimpleObjectCache<PostgreTable, PostgreTableForeignKey> foreignKeys = new SimpleObjectCache<>();
                dbStat.setLong(1, getObjectId());
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table inheritance info")) {
    public synchronized Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor)

            getPartitions(dbResult.getSession().getProgressMonitor());
            @NotNull JDBCSession session,
    }
        this.hasSubClasses = JDBCUtils.safeGetBoolean(dbResult, "relhassubclass");
            }
                        PostgreTableBase parentTable = schema.getTable(monitor, parentTableId);
 */
                if (srcIndex.isPrimaryKeyIndex()) {
            return getDatabase().getDefaultTablespace(monitor);
            if (monitor.isForceCacheUsage()) {
        return getSchema().getIndexes(monitor, this);
    @Association
import org.jkiss.dbeaver.Log;
    }

     */
            @NotNull PostgreTable table
            for (PostgreIndex srcIndex : CommonUtils.safeCollection(source.getIndexes(monitor))) {
            return null;
    }
                                new PostgreTableInheritance(
                }
                log.debug("Can't copy association '" + srcFK.getName() + "' - can't find referenced constraint");
        final List<PostgreTableInheritance> si = getSuperInheritance(monitor);
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;
        }
        superTables = null;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                            PostgreTableBase subTable = schema.getTable(monitor, subTableId);
    public void setPartitionKey(String partitionKey) {
    }
    public boolean isHasOids() {

    {
    }
        }
            }
    }
        return result;
 * distributed under the License is distributed on an "AS IS" BASIS,
//                if (getDataSource().isServerVersionAtLeast(10, 0)) {
        }
 *
        }
        return tablespaceId != 0;
        protected JDBCStatement prepareObjectsStatement(
        return hasOids;
                String sql = "SELECT i.*,c.relnamespace " +

            superTables = new ArrayList<>();
        // Copy FKs
        if (!getDataSource().getServerType().supportsIndexes()) {
import org.jkiss.dbeaver.model.exec.DBCException;
        PostgreTableContainer container,
    void addSuperTableInheritance(PostgreTableBase superTable, int seqNum) {
import java.util.stream.Collectors;
                }
    @Property(viewable = true, order = 42)
    }
            stmt.setString(2, table.getName());
        }
//                    sql += " AND c.relispartition=false";
        this.hasOids = source.hasOids;
    }
        }
                        }

public abstract class PostgreTable extends PostgreTableReal
    public List<PostgreTableBase> getPartitions(DBRProgressMonitor monitor) throws DBException {
    private boolean hasOids;

                        if (schema == null) {
    @Property(editable = true, updatable = true, order = 40, visibleIf = PostgreColumnHasOidsValidator.class)
        @Override
            return Collections.emptyList();

                                    this,
        this.partitionKey = getDataSource().isServerVersionAtLeast(10, 0) ? JDBCUtils.safeGetString(dbResult, "partition_key")  : null;
                            continue;
        throws DBException
//                }
        final Collection<PostgreTableForeignKey> foreignKeys = getForeignKeys(monitor);
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, PostgreTableConstraint.class)
            if (fk.getReferencedConstraint() != null) {
    @Nullable
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        return subTables == null || subTables.isEmpty() ? null : subTables;
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
            @NotNull JDBCSession session,
            } catch (SQLException e) {

        return hasPartitions;

                            if (constraint.getAssociatedEntity() == this) {
                        partitionRange = JDBCUtils.safeGetString(dbResult, "partition_range"); //$NON-NLS-1$
            return null;
        }
                throw new DBDatabaseException(e, getDataSource());
                            }
                throw new DBCException(e, session.getExecutionContext());


        this.hasOids = hasOids;
                                refs.add(constraint);
    @Association

                try (JDBCPreparedStatement dbStat = session.prepareStatement(
    }
    }

import org.jkiss.dbeaver.DBException;
    public Collection<PostgreTableForeignKey> getForeignKeys(@NotNull DBRProgressMonitor monitor) throws DBException {
            CommonUtils.safeList(getSubInheritance(monitor)));
    }
        }
    @Override
                        inheritanceList.add(

                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        if (this.hasOidPseudoAttribute()) {

    }
        return false;
 *
                                log.warn("Can't find sub-table '" + subTableId + "' in '" + schema.getName() + "'");
            superTables = new ArrayList<>();
        }

    @Override
    }
    @Override
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
        return hasRowLevelSecurity;
import org.jkiss.utils.CommonUtils;

            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table inheritance info")) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    {

import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            PostgreTableBase table = aSi.getParentObject();
        PostgreSchema.IndexCache indexCache = getSchema().getIndexCache();
        final List<PostgreTableInheritance> si = getSubInheritance(monitor);
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
                        final long schemaId = JDBCUtils.safeGetLong(dbResult, 1);
            }
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        this.hasRowLevelSecurity = getDataSource().getServerType().supportsRowLevelSecurity()
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table partition range")) {
        if (tablespaceId == 0) {

                        dbResult.next();
        }
                dbStat.setLong(1, getObjectId());
            @NotNull JDBCResultSet resultSet
    @Override
            return null;
                fkList.add(fk);
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            superTables = initSuperTables(monitor);
                                JDBCUtils.safeGetInt(dbResult, "inhseqno"),
        );
 * PostgreTable
        if (hasPartitions && DBPScriptObject.OPTION_INCLUDE_PARTITIONS.equals(option)) {
    public List<PostgreTableInheritance> getSuperInheritance(DBRProgressMonitor monitor) throws DBException {
    }
            }

import java.sql.SQLException;
            }
    @NotNull

                        }
        List<PostgreTableForeignKey> fkList = new ArrayList<>();
                    }
                "FROM pg_catalog.pg_inherits i,pg_catalog.pg_class c " +
        if (monitor == null || monitor.isForceCacheUsage()) {
 * limitations under the License.
    public String getPartitionKey() {

/**
    public List<PostgreTablePolicy> getPolicies(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
import org.jkiss.code.NotNull;

    }
            .map(AbstractTableConstraint::getParentObject)
    }
                        final long parentSchemaId = JDBCUtils.safeGetLong(dbResult, "relnamespace");
                        "select pg_get_expr(c.relpartbound, c.oid, true) as partition_range from \"pg_catalog\".pg_class c where relname = ? and relnamespace = ?;")) { //$NON-NLS-1$
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
 * you may not use this file except in compliance with the License.
        agg.addAll(foreignKeys);
            this.subTables = tables;
    implements PostgreTableContainer, DBDPseudoAttributeContainer, DBSEntityConstrainable
            return new PostgreTablePolicy(session.getProgressMonitor(), table, resultSet);
    @Property(viewable = true, editable = true, updatable = true, order = 43)
    }
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
import org.jkiss.dbeaver.model.DBUtils;

        @NotNull
                                continue;
import org.jkiss.dbeaver.model.meta.Association;
    }
                                    JDBCUtils.safeGetInt(dbResult, "inhseqno"),//$NON-NLS-1$
                        }
    }
        public boolean isValidValue(@NotNull PostgreTable object, @Nullable Object value) throws IllegalArgumentException {
    @Nullable
                } catch (SQLException e) {
        // Obtain a list of schemas containing references to this table to avoid fetching everything
        return agg;



        return super.refreshObject(monitor);
        }
                                continue;
        if (diskSpace != null && diskSpace == 0 && hasSubClasses) {
import org.jkiss.dbeaver.model.struct.cache.SimpleObjectCache;
                            if (schema == null) {

                        if (schema == null) {
    public DBDPseudoAttribute[] getAllPseudoAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
                            log.warn("Can't find parent table '" + parentTableId + "' in '" + schema.getName() + "'");
        protected PostgreTablePolicy fetchObject(
    public DBDPseudoAttribute[] getPseudoAttributes() {
                try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        }


    void nullifyEmptySuperTableInheritance() {
        return superTables == null || superTables.isEmpty() ? null : superTables;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read referencing schemas")) {
                if (partTable.isPartition() && partTable instanceof PostgreTableReal) {
                            if (subTable == null) {
        return super.getStatObjectSize();
        PostgreTableInheritance inheritance = new PostgreTableInheritance(this, superTable, seqNum, true);
                "SELECT i.*,c.relnamespace " +
            return partSizeSum;
import org.jkiss.dbeaver.model.DBPScriptObject;
        return PostgreUtils.getObjectById(monitor, getDatabase().tablespaceCache, getDatabase(), tablespaceId);
    @Override
                return inheritanceList;

    }
        return foreignKeys;
    private static final Log log = Log.getLog(PostgreTable.class);
            long partSizeSum = diskSpace;
    }
import org.jkiss.dbeaver.DBDatabaseException;

            }
        return partitionRange;
        return policyCache.getAllObjects(monitor, this);
    public static class PostgreColumnHasOidsValidator implements IPropertyValueValidator<PostgreTable, Object> {

                    dbStat.setString(1, getName());
            return superTables;

        this.partitionKey = partitionKey;
        }
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, PostgreTableConstraint.class),
        final List<PostgreTableInheritance> superTables = getSuperInheritance(monitor);
        this.tablespaceId = JDBCUtils.safeGetLong(dbResult, "reltablespace");
            } else {
    {
            return object.getDataSource().getServerType().supportsHasOidsColumn();
        @Override
        return DBStructUtils.generateTableDDL(monitor, this, options, false);
        subTables = null;
            PostgreTableForeignKey fk = new PostgreTableForeignKey(monitor, this, srcFK);
                            schema.getConstraintCache().getTypedObjects(monitor, schema, PostgreTableForeignKey.class);
    public Collection<PostgreIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (isPersisted() && subTables == null && hasSubClasses && getDataSource().getServerType().supportsInheritance()) {
    private final PolicyCache policyCache = new PolicyCache();
    }
        super.fetchStatistics(dbResult);

            if (!table.isPartition()) {
    }
        ) throws SQLException, DBException {
    }
    private boolean hasOidPseudoAttribute() {
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.INDEX, PostgreIndex.class),
                    dbStat.setLong(2, getSchema().oid);

        List<PostgreTableInheritance> inheritanceList = new ArrayList<>();
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    public boolean isTablespaceSpecified() {
    private List<PostgreTableInheritance> initSuperTables(DBRProgressMonitor monitor) throws DBException {
                                parentTable,

        return policyCache;
    //private List<PostgreTablePartition>  partitions  = null;
        final List<PostgreTableInheritance> si = getSubInheritance(monitor);
        if (CommonUtils.isEmpty(si)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Association
    public boolean isHasRowLevelSecurity() {
 * Unless required by applicable law or agreed to in writing, software
        List<DBSEntityAssociation> agg = new ArrayList<>(superTables.size() + foreignKeys.size());
        this.foreignKeys.setCache(fkList);
    private boolean hasSubClasses;
        }
                    throw new DBCException(e, session.getExecutionContext());
                    }
                                true));
                            }
            return stmt;
    }
            List<PostgreTableInheritance> tables = new ArrayList<>();
            this.hasOids = JDBCUtils.safeGetBoolean(dbResult, "relhasoids");
        ResultSet dbResult)
        return hasSubClasses;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                PostgreIndex constr = new PostgreIndex(monitor, this, srcIndex);
            return true;
    public long getStatObjectSize() {
        for (PostgreTableForeignKey srcFK : CommonUtils.safeCollection(source.getForeignKeys(monitor))) {
            final var stmt = session.prepareStatement("select * from pg_catalog.pg_policies where schemaname=? and tablename=?");
    @NotNull
    }
    public PostgreTable(
                indexCache.cacheObject(constr);
                                    subTable,
    @Override
    public static class PostgreColumnHasRowLevelSecurity implements IPropertyValueValidator<PostgreTable, Object> {
                        while (dbResult.next()) {
        }
}
            && JDBCUtils.safeGetBoolean(dbResult, "relrowsecurity");
        superTables.add(inheritance);
            .filter(PostgreTableBase::isPartition)

                            log.warn("Can't find parent table's schema '" + parentSchemaId + "'");
    public void setTablespace(PostgreTablespace tablespace) {

    }
                            final long subSchemaId = JDBCUtils.safeGetLong(dbResult, "relnamespace"); //$NON-NLS-1$
            } catch (SQLException e) {
        }
import java.sql.ResultSet;
                    dbStat.setLong(1, getObjectId());
                    continue;
        ) throws SQLException {
                    "WHERE i.inhparent=? AND c.oid=i.inhrelid";
                    }
        return List.of(
    public PostgreTablePolicy getPolicy(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
    }
package org.jkiss.dbeaver.ext.postgresql.model;
                            continue;
    }
        return policyCache.getObject(monitor, this, name);
    }
                }
                        final Collection<PostgreTableForeignKey> allForeignKeys =
                fk.setName(fk.getName() + "_copy"); // Fix FK name - they are unique within schema
            return null;
    }
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            return null;
        return DBDPseudoAttribute.EMPTY_ARRAY;
/*
    @NotNull
        }
    }
        super(monitor, container, source, persisted);
    @Association
    @Nullable
        super(container, dbResult);
            return new DBDPseudoAttribute[]{PostgreConstants.PSEUDO_ATTR_OID};

                        }

    private List<PostgreTableInheritance> superTables;
    public boolean hasSubClasses() {
 */
    }
*/

                            PostgreSchema schema = getDatabase().getSchema(monitor, subSchemaId);
    public boolean hasPartitions() {

                "ORDER BY i.inhseqno")) {
        } else if (CommonUtils.isEmpty(foreignKeys)) {
                        final long parentTableId = JDBCUtils.safeGetLong(dbResult, "inhparent");
                        for (PostgreTableForeignKey constraint : allForeignKeys) {

        superTables = null;
    }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        }
                }
    private boolean hasPartitions;
    public static class PolicyCache extends JDBCObjectCache<PostgreTable, PostgreTablePolicy> {
                                    true));

    // Copy constructor
        this.partitionKey = source.partitionKey;
        if (superTables == null) {
    @Override
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    private long depObjectAttrNumber;
{
    @Nullable
        for (int i1 = 0; i1 < si.size(); i1++) {
     * Sub tables = child tables
    @Property(viewable = false, optional = true, order = 30)
    }
    /**
