        MySQLTableColumn pkColumn = pkTable == null ? null : pkTable.getAttribute(monitor, pkColumnName);
        @Property(category = DBConstants.CAT_STATISTICS, order = 15,
    @Override
                    additionalInfo.loaded = true;
            }

        public long getRowCount() {
                return;

        } else if (!enable && disableReferentialIntegrityStatement != null) {

    }
            } else {
            log.debug("Can't find PK table " + pkTableName + " column " + pkColumnName);
    {
        @Override
import org.jkiss.utils.ByteNumberFormat;
 * See the License for the specific language governing permissions and
        public Object[] getPossibleValues(MySQLTable object)
    private void processRow(
            additionalInfo.loaded = true;
        public long getAvgRowLength() {
                      rc.REFERENCED_TABLE_NAME     AS pk_table_name,
                return new MySQLPartition(table, null, partitionName, dbResult);
                            String pkTableName = JDBCUtils.safeGetString(dbResult, "pk_table_name");
        return super.refreshObject(monitor);
                return;
                return object.additionalInfo.charset.getCollations().toArray();
        result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, MySQLTableConstraint.class));
            }
    {
            return enableReferentialIntegrityStatement;
                        String pkTableName = JDBCUtils.safeGetString(dbResult, JDBCConstants.PKTABLE_NAME);
        @Override
    {
        additionalInfo.avgRowLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_AVG_ROW_LENGTH);
        @NotNull DBRProgressMonitor monitor,
                      kcu.REFERENCED_COLUMN_NAME   AS pk_column_name,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                            pkColumnName,
    @Association
            pk = pkMap.get(pkFullName);
        @Override
    }
    class PartitionCache extends JDBCObjectCache<MySQLTable, MySQLPartition> {
 * Unless required by applicable law or agreed to in writing, software
        getContainer().triggerCache.clearChildrenOf(this);
        return additionalInfo.loaded == true;
            engines.sort(DBUtils.<MySQLEngine>nameComparator());
                        String fkTableCatalog = JDBCUtils.safeGetString(dbResult, JDBCConstants.FKTABLE_CAT);
                pkMap.put(pkFullName, pk);
                " ORDER BY PARTITION_ORDINAL_POSITION,SUBPARTITION_ORDINAL_POSITION");
            return engine;
                    parentPartition = new MySQLPartition(table, null, partitionName, dbResult);
            Map<String, MySQLTableConstraint> pkMap = new HashMap<>();
                    stmt.setString(2, getName());
        String fkTableCatalog,
        return additionalInfo.description;
            visibleIf = PartitionedTablePropertyValidator.class, order = 3)
            additionalInfo.partitioned = sourceAI.partitioned;
                    getContainer().getName(), null, getName()
        @Override
            log.debug("Unable to retrieve additional info for mysql table", e);
            additionalInfo.description = sourceAI.description;
        MySQLTableColumn fkColumn = fkTable == null ? null : fkTable.getAttribute(monitor, fkColumnName);

                if (divPos != -1) {
        }
            return !object.isPartition();
                fk = new MySQLTableForeignKey(fkTable, fkName, null, pk, deleteRuleEnum, updateRuleEnum, true);
            if (!additionalInfo.loaded) {
        } catch (DBCException e) {
            if (fk.hasColumn(fkColumnInfo)) {

        }

        // Find PK
                if (!parentFetched) {
        additionalInfo.rowCount = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_ROWS);

    @Override
        // Copy FKs
        @Property(editable = true, updatable = true, listProvider = CharsetListProvider.class,
                    }
        super(catalog, dbResult);
        if (CommonUtils.isNotEmpty(createOptions)) {
            log.debug("Can't find PK table " + pkTableName);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (additionalInfo.collation != null) {
        throws DBException

import org.jkiss.dbeaver.Log;
                log.warn("Can't find foreign key '" + fkName + "' for table " + fkTable.getFullyQualifiedName(
        }
            if (fk.getReferencedConstraint() != null) {
            }
                                fkTableCatalog,
    {
            Map<String, MySQLTableForeignKey> fkMap = new HashMap<>();
                return null;

            return dataLength;
                if (!fkList.contains(fk)) {
                        }
        {
                            references,
                if (srcIndex instanceof MySQLTableIndex && srcIndex.isPrimary()) {
        result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, MySQLTableConstraint.class));
            }
    public synchronized Collection<MySQLTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor)
            return dbStat;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(


        private MySQLCharset charset;
    }
        public boolean isValidValue(@NotNull MySQLTable object, @Nullable Object value) throws IllegalArgumentException {
        public String getDescription() {
        }
        String desc = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_COMMENT);
import org.jkiss.dbeaver.model.struct.rdb.DBSPartitionContainer;

        if (source instanceof MySQLTable) {
    }
        }
        throws DBException

    private String disableReferentialIntegrityStatement;
        }
                            fkMap
                        int updateRule = JDBCUtils.safeGetInt(dbResult, JDBCConstants.UPDATE_RULE);
        public boolean allowCustomValue()
    @Override
        this.foreignKeys.setCache(fkList);

                    }
            }
        @Property(category = DBConstants.CAT_STATISTICS, visibleIf = PartitionedTablePropertyValidator.class, order = 22)

                    DBPEvaluationContext.DDL));
    private List<MySQLTableForeignKey> loadForeignKeys(
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
        @Property(category = DBConstants.CAT_STATISTICS, visibleIf = PartitionedTablePropertyValidator.class, order = 21)
        }
            if (references) {
    @NotNull
    private final SimpleObjectCache<MySQLTable, MySQLTableForeignKey> foreignKeys = new SimpleObjectCache<>();
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {

                return null;
    @Nullable

        };
    }
                            deleteRule,
        return false;
import org.jkiss.dbeaver.DBException;
            List<MySQLTableForeignKey> fkList = loadForeignKeys(monitor, false);
        throws DBException
    @Association


                            break;
                                references,
                            fkList,
        @Nullable
            throws DBException
        }
        if (fkColumn == null) {
        }
        if (!isPersisted()) {
            }
            return updateTime;
        String pkTableName,

    public Collection<MySQLTableConstraint> getCheckConstraints(@NotNull DBRProgressMonitor monitor)
                    partitionMap.put(partitionName, parentPartition);
                                pkTableName,
                }
            // Copy indexes
        public MySQLCharset getCharset() {
    @Override
            } else {
            String pkFullName = pkTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + "." + pkName;
            }


    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

                            String fkColumnName = JDBCUtils.safeGetString(dbResult, "fk_column_name");
                      kcu.TABLE_NAME               AS fk_table_name,
    {
        @Override
    }
                            processRow(
                "SELECT * FROM " + MySQLConstants.META_TABLE_PARTITIONS +
        boolean references
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                    if (dbResult.next()) {
                            String fkTableName = JDBCUtils.safeGetString(dbResult, "fk_table_name");
            return partitioned;
}
import java.util.*;
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    {
        }
        if (pk == null && pkTable != null) {
        @Override
        }
        List<MySQLTableConstraint> constraintObjects = getContainer().uniqueKeyCache.getObjects(monitor, getContainer(), this);
            visibleIf = PartitionedTablePropertyValidator.class, order = 5)
            return DatabaseMetaData.importedKeyNoAction;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLTable mySQLTable) throws SQLException
            enableReferentialIntegrityStatement = "ALTER TABLE ? ENABLE KEYS";
        // filer table description (for INNODB it contains some system information)

/*
    public void setObjectDefinitionText(String sourceText) throws DBException {
                throw new DBCException(e, session.getExecutionContext());
        }
        List<MySQLTableForeignKey> fkList,
                            pkTableCatalog,

            } catch (SQLException e) {
        private boolean partitioned;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
    @Override
        }
        }
                      kcu.COLUMN_NAME              AS fk_column_name,

                int divPos = desc.indexOf("; " + INNODB_COMMENT);
        public boolean allowCustomValue()

        super(monitor, catalog, source);
                      rc.DELETE_RULE,

        MySQLCatalog catalog,
            throw new DBDatabaseException(ex, getDataSource());
        return getContainer().uniqueKeyCache.getObject(monitor, getContainer(), this, ukName);
            return maxDataLength;
import java.sql.ResultSet;
            }
            if (trigger.getTable() == this) {
        public boolean isPartitioned() {
        {
        Map<String, MySQLTableForeignKey> fkMap
            AdditionalInfo info = getAdditionalInfo(monitor);
                      ON kcu.CONSTRAINT_SCHEMA = rc.CONSTRAINT_SCHEMA

            }
        for (DBSEntityConstraint srcConstr : CommonUtils.safeCollection(source.getConstraints(monitor))) {

                    }
    public long getStatObjectSize() {
                    parentFetched = true;
                        processRow(
                    try (JDBCResultSet dbResult = stmt.executeQuery()) {
 */
            partitionMap.clear();
 *
    {
                )) {
            return false;
        {
                    """;
                pk.addColumn(new MySQLTableConstraintColumn(pk, pkColumn, keySeq));
    }

        if (pk == null && pkTable != null && pkName != null) {
        }
    }
import org.jkiss.dbeaver.DBDatabaseException;
    implements DBPObjectStatistics, DBPReferentialIntegrityController, DBSPartitionContainer, DBSEntityConstrainable
        }
                    DBPEvaluationContext.DDL));
                partitionName = "PARTITION";
    @Association

                return null;
            for (MySQLTrigger srcTrigger : ((MySQLTable) source).getTriggers(monitor)) {
import org.jkiss.dbeaver.model.exec.DBCException;
                // create subpartition
                try (JDBCPreparedStatement stmt = session.prepareStatement(sql)) {

    @Override
    {
                    while (dbResult.next()) {
        }
        synchronized (additionalInfo) {
    }
            if (CommonUtils.isEmpty(subPartitionName)) {
        additionalInfo.createTime = JDBCUtils.safeGetTimestamp(dbResult, MySQLConstants.COL_CREATE_TIME);
        @Nullable
            disableReferentialIntegrityStatement = "ALTER TABLE ? DISABLE KEYS";
        if (enable) {
            additionalInfo.charset = additionalInfo.collation.getCharset();
            return additionalInfo;
        throws DBException
            return fkList;
    }
    @Override

        public long getIndexLength() {
                    desc = desc.substring(0, divPos);

            // Copy triggers
        }
        String fkColumnName,
        MySQLTable fkTable = getDataSource().findTable(monitor, fkTableCatalog, fkTableName);
                fk.addColumn(fkColumnInfo);
        // Find (or create) FK
            }
            if (fk == null) {
                    return parentPartition;
    private static final String INNODB_COMMENT = "InnoDB free";
        String fkTableName,
        this.referenceCache = null;

        boolean supportsAlterTableKeysStmt = false; // ALTER TABLE ... ENABLE/DISABLE KEYS statement works per table and speeds up insert
        if (references && fkTable != null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        @Override
            log.warn("Can't find primary key for table " + pkTable.getFullyQualifiedName(DBPEvaluationContext.DDL));
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            }
            visibleIf = PartitionedTablePropertyValidator.class, formatter = ByteNumberFormat.class)
        protected MySQLPartition fetchObject(@NotNull JDBCSession session, @NotNull MySQLTable table, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
                    fkList.add(fk);
            }
                                pkTableCatalog,
        else {
            String subPartitionName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_SUBPARTITION_NAME);
        private long autoIncrement;
            for (MySQLPartition partition : ((MySQLTable)source).partitionCache.getCachedObjects()) {
                MySQLPartition parentPartition = partitionMap.get(partitionName);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table relations")) {
            MySQLTableForeignKeyColumn fkColumnInfo = new MySQLTableForeignKeyColumn(fk, fkColumn, keySeq, pkColumn);
        getContainer().indexCache.clearObjectCache(this);
            } else {
    public MySQLTableForeignKey getAssociation(DBRProgressMonitor monitor, String fkName)
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
        @NotNull
        if (getDataSource().supportsCheckConstraints()) {
                                fkMap
            } else {
    {
    @Association
    void fetchAdditionalInfo(JDBCResultSet dbResult) {
            if (!CommonUtils.isEmpty(checkConstraintObjects)) {

            Collection<MySQLTableConstraint> constraints = pkTable.getConstraints(monitor);
                }
                fkList.add(fk);
                    // Skip primary key index (it will be created implicitly)
            additionalInfo.engine = sourceAI.engine;
import org.jkiss.dbeaver.model.meta.*;
                // This is default empty info partition for tables without partitions. Do not create it.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public Collection<MySQLTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor)
        if (rule == null) {
                            int deleteRule = convertRuleToNum(JDBCUtils.safeGetString(dbResult, "DELETE_RULE"));
        }
        @Override
        }
            visibleIf = PartitionedTablePropertyValidator.class, order = 6)
            }
                            int updateRule = convertRuleToNum(JDBCUtils.safeGetString(dbResult, "UPDATE_RULE"));
            visibleIf = PartitionedTablePropertyValidator.class, formatter = ByteNumberFormat.class)
            String partitionName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_PARTITION_NAME);
        if (referenceCache == null && !monitor.isForceCacheUsage()) {


        getContainer().uniqueKeyCache.clearObjectCache(this);
                supportsAlterTableKeysStmt = true;
                        String pkTableCatalog = JDBCUtils.safeGetString(dbResult, JDBCConstants.PKTABLE_CAT);
    private static final String PARTITIONED_STATUS = "partitioned";
    }
         return getContainer().checkConstraintCache.getObjects(monitor, getContainer(), this);
                                pkName,

                      kcu.TABLE_SCHEMA             AS fk_table_schema,
                            String pkTableCatalog = JDBCUtils.safeGetString(dbResult, "pk_table_schema");
            List<MySQLTableConstraint> checkConstraintObjects = getContainer().checkConstraintCache.getObjects(monitor, getContainer(), this);
                JDBCDatabaseMetaData meta = session.getMetaData();
                // No choice, we have to create fake foreign key :(
                    JOIN information_schema.KEY_COLUMN_USAGE kcu
    private static final Log log = Log.getLog(MySQLTable.class);

                getContainer().triggerCache.cacheObject(trigger);
    private void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
        return disableReferentialIntegrityStatement;
            if (references) {
                triggers.add(trigger);
        }
        int updateRule,
    @Nullable
        }
                fk.setName(fk.getName() + "_copy"); // Fix FK name - they are unique within schema
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final PartitionCache partitionCache = new PartitionCache();
    public static class PartitionedTablePropertyValidator implements IPropertyValueValidator<MySQLTable, Object> {
        }
        return switch (rule.toUpperCase()) {


        }
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<MySQLTable> {
        throws DBException
        additionalInfo.indexLength = JDBCUtils.safeGetLong(dbResult, "Index_length");
            JDBCPreparedStatement dbStat = session.prepareStatement(
        additionalInfo.rowFormat = JDBCUtils.safeGetString(dbResult, "Row_format");
            case "SET NULL" -> DatabaseMetaData.importedKeySetNull;
            log.warn("Can't find FK table " + fkTableName);
        if (getDataSource().supportsCheckConstraints()) {
                      kcu.ORDINAL_POSITION         AS key_seq,
        }
                MySQLTableIndex index = new MySQLTableIndex(monitor, this, srcIndex);
    public boolean isView()
        } catch (SQLException ex) {
                boolean parentFetched = false;
        List<MySQLTableForeignKey> fkList = new ArrayList<>();
    public String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) {
        if (!foreignKeys.isFullyCached() && getDataSource().getInfo().supportsReferentialIntegrity() && !monitor.isForceCacheUsage()) {
    @Association
            additionalInfo.description = desc;
    @NotNull
            }
        MySQLTable pkTable = getDataSource().findTable(monitor, pkTableCatalog, pkTableName);
        }
    }
import org.jkiss.dbeaver.model.exec.jdbc.*;
            return rowFormat;

        String pkTableCatalog,
        }
        return getContainer().checkConstraintCache.getObject(monitor, getContainer(), this, constName);


import org.jkiss.dbeaver.model.struct.cache.SimpleObjectCache;
            referenceCache = loadForeignKeys(monitor, true);

        @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE,

 */
                String sql = """
        additionalInfo.dataLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_DATA_LENGTH);
    {
        Map<String, MySQLPartition> partitionMap = new HashMap<>();
                partitionCache.cacheObject(new MySQLPartition(monitor, this, partition, source));

        if (pkTable == null) {
    }
            }

        sql = sql.replace("?", getFullyQualifiedName(DBPEvaluationContext.DDL));
    public boolean hasPartitions() {

    public MySQLTable(DBRProgressMonitor monitor, MySQLCatalog catalog, DBSEntity source) throws DBException {
            log.debug("Can't find FK table " + fkTableName + " column " + fkColumnName);
        throws DBException

        }
            pk = DBUtils.findObject(constraints, pkName);
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
            }
        }
        return triggers;
        private long dataLength;
                " WHERE TABLE_SCHEMA=? AND TABLE_NAME=? " +
        return result;
                    }
    public DBSObjectCache<MySQLTable, MySQLTableForeignKey> getForeignKeyCache()
        List<DBSEntityConstraintInfo> result = new ArrayList<>();
        }
                      rc.UNIQUE_CONSTRAINT_NAME    AS pk_name
    }
        MySQLTableConstraint pk = null;
            case "RESTRICT" -> DatabaseMetaData.importedKeyRestrict;
{
            return avgRowLength;
            // Copy partitions
                                fkList,
    public MySQLTable(
    @Override
        boolean references,
            } else {
    }
            return constraintObjects;
        public MySQLCollation getCollation() {
            throws DBException
            }
                      kcu.CONSTRAINT_NAME          AS fk_name,
        public long getAutoIncrement() {
        return additionalInfo.dataLength + additionalInfo.indexLength;
        @Nullable
            }
                                keySeq,
    private volatile List<MySQLTableForeignKey> referenceCache;
    @Override
                                monitor,
        DBSForeignKeyModifyRule updateRuleEnum = JDBCUtils.getCascadeFromNum(updateRule);
            }
                                fkName,
            if (fk == null) {
            additionalInfo.partitioned = createOptions.contains(PARTITIONED_STATUS);
                            updateRule,
    @Override
        }

public class MySQLTable extends MySQLTableBase
        super(catalog);
    }
    public MySQLTable(MySQLCatalog catalog)
                        int deleteRule = JDBCUtils.safeGetInt(dbResult, JDBCConstants.DELETE_RULE);

            return;
            visibleIf = PartitionedTablePropertyValidator.class, formatter = ByteNumberFormat.class)
        for (DBSEntityAssociation srcFK : CommonUtils.safeCollection(source.getAssociations(monitor))) {
        }
                            monitor,
            if (CommonUtils.isEmpty(partitionName) && CommonUtils.isEmpty(subPartitionName)) {
                            fkTableCatalog,
                return;
            dbStat.setString(1, getContainer().getName());
            enableReferentialIntegrityStatement = "SET GLOBAL FOREIGN_KEY_CHECKS=1";
            return false;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
            visibleIf = PartitionedTablePropertyValidator.class)
                        fetchAdditionalInfo(dbResult);
            return charset;
        String sql = getChangeReferentialIntegrityStatement(monitor, enable);
                                pkColumnName,
            return enableReferentialIntegrityStatement;
        if (pkTable != null) {
            fk = DBUtils.findObject(fkTable.getAssociations(monitor), fkName);
    @Nullable
        {

        int keySeq,
    }
        return this.getContainer().indexCache.getObjects(monitor, getContainer(), this);
        try {
                }
        @Property(category = DBConstants.CAT_STATISTICS, order = 14,
    }
        }
                    continue;
    @Override
    @NotNull

        additionalInfo.collation = dataSource.getCollation(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_COLLATION));
        private String description;
        additionalInfo.checkTime = JDBCUtils.safeGetTimestamp(dbResult, "Check_time");
            result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, MySQLTableConstraint.class));
                    SELECT
import java.sql.DatabaseMetaData;
                                updateRule,
        MySQLDataSource dataSource = getDataSource();
            for (DBSTableIndex srcIndex : CommonUtils.safeCollection(((DBSTable)source).getIndexes(monitor))) {
            case "SET DEFAULT" -> DatabaseMetaData.importedKeySetDefault;

        public long getMaxDataLength() {

        return getDDL(monitor, options);

        // Read indexes using cache

                            keySeq,
    }
        String createOptions = JDBCUtils.safeGetString(dbResult, "Create_options");
        @Property(category = DBConstants.CAT_STATISTICS, order = 16,
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
                        int keySeq = JDBCUtils.safeGetInt(dbResult, JDBCConstants.KEY_SEQ);
        private long rowCount;
        String fkName,
 * limitations under the License.
                        String fkTableName = JDBCUtils.safeGetString(dbResult, JDBCConstants.FKTABLE_NAME);
                }
                                pkMap,
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;
        additionalInfo.autoIncrement = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_AUTO_INCREMENT);
        {
        }
            return engines.toArray(new MySQLEngine[0]);
    public MySQLTableConstraint getUniqueKey(DBRProgressMonitor monitor, String ukName)
        }
    public Collection<MySQLPartition> getPartitions(DBRProgressMonitor monitor)

            } else if (!CommonUtils.isEmpty(desc)) {
        return foreignKeys.getCachedObjects();
        return DBUtils.findObject(getAssociations(monitor), fkName);
    }
    public MySQLTableConstraint getCheckConstraint(DBRProgressMonitor monitor, String constName)
        public String getRowFormat() {

        @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 12,

            // Find pk based on name
            if (references) {

        private Date createTime, updateTime, checkTime;
        private long avgRowLength;
        ResultSet dbResult)
            if (constraints != null) {
            return false;

        }
        }
import org.jkiss.dbeaver.model.struct.*;
                fkList.add(fk);


    }
        return foreignKeys;
    }
        }
        return true;
        try {
                log.debug("Can't copy association '" + srcFK.getName() + "' - can't find referenced constraint");
    @Association
        }

            }
            case "CASCADE" -> DatabaseMetaData.importedKeyCascade;
            return constraintObjects;
            default -> DatabaseMetaData.importedKeyNoAction;
        public void setCharset(MySQLCharset charset) { this.charset = charset; this.collation = charset == null ? null : charset.getDefaultCollation(); }
    @Association
        }
        private String rowFormat;
        public Object[] getPossibleValues(MySQLTable object)

        @Override
            if (!references) {
                if (engine.getSupport() == MySQLEngine.Support.YES || engine.getSupport() == MySQLEngine.Support.DEFAULT) {
        // Copy constraints
            fk = fkMap.get(fkName);
                            fkName,
            throw new DBException("Unable to change referential integrity", e);
    @Nullable
            }
                                deleteRule,
    public static class CollationListProvider implements IPropertyValueListProvider<MySQLTable> {
        {
                      rc.UPDATE_RULE,
    }
    @NotNull
                    WHERE rc.UNIQUE_CONSTRAINT_SCHEMA = ? AND rc.REFERENCED_TABLE_NAME = ?
        private long indexLength;
        MySQLTableForeignKey fk = null;
            if (!references) {
    }
            return description;
    ) throws DBException {
        } catch (SQLException e) {
        if (pkColumn == null) {
                desc = "";
import java.sql.SQLException;


                            fkTableName,
    }
        {
                        pk = pkConstraint;

        for (MySQLTrigger trigger : getContainer().triggerCache.getAllObjects(monitor, getContainer())) {
                return;
                            fkColumnName,
        return partitionCache.getAllObjects(monitor, this);
    }

        protected void invalidateObjects(DBRProgressMonitor monitor, MySQLTable owner, Iterator<MySQLPartition> objectIter)
    {
                log.warn("Unique key '" + pkName + "' not found in table " + pkTable.getFullyQualifiedName(
                    FROM information_schema.REFERENTIAL_CONSTRAINTS rc
        return additionalInfo.partitioned;
        private long dataFree;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
        public Date getCheckTime() {
    public Collection<MySQLTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor)
        }
        @Property(category = DBConstants.CAT_STATISTICS, visibleIf = PartitionedTablePropertyValidator.class, order = 20)
                }
            if (pk == null) {
    @PropertyGroup()
    private int convertRuleToNum(String rule) {
    }
                }
        @Property(viewable = true, visibleIf = PartitionedTablePropertyValidator.class, order = 23)
        }
        @Override
        if (source instanceof DBSTable) {
    @Override
        return referenceCache;
                if (parentPartition == null) {
                new MySQLPartition(table, parentPartition, subPartitionName, dbResult);
    public Collection<MySQLTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor)
            if (pk == null) {
        }
                pk = new MySQLTableConstraint(pkTable, pkName, null, DBSEntityConstraintType.PRIMARY_KEY, true);
        public long getDataLength() {
            getContainer().checkConstraintCache.clearObjectCache(this);
            additionalInfo.loaded = true;
            return autoIncrement;

        throws DBException
            if (object.additionalInfo.charset == null) {
package org.jkiss.dbeaver.ext.mysql.model;
        }
                            );
    }
                log.debug("FK " + fkName + " has already been added, skip");
            dbStat.setString(2, getName());
                }
        }
        }
            return disableReferentialIntegrityStatement;
                            String fkName = JDBCUtils.safeGetString(dbResult, "fk_name");
    }
            JDBCUtils.executeInMetaSession(monitor, this, "Changing referential integrity", sql);
                                fkTableName,
            foreignKeys.setCache(fkList);
        throw new DBException("Table DDL is read-only");
        public Date getCreateTime() {
            }
        @Property(category = DBConstants.CAT_STATISTICS, visibleIf = PartitionedTablePropertyValidator.class, order = 11)
                }
                            int keySeq = JDBCUtils.safeGetInt(dbResult, "key_seq");
        @Property(editable = true, updatable = true, listProvider = CollationListProvider.class,
    {
 * DBeaver - Universal Database Manager
            additionalInfo.collation = sourceAI.collation;

        Map<String, MySQLTableConstraint> pkMap,
            return rowCount;
        public boolean allowCustomValue()


            return indexLength;
    {
        public void setCollation(MySQLCollation collation) { this.collation = collation; }
    {
                            pkTableName,
            visibleIf = PartitionedTablePropertyValidator.class, order = 100)
        additionalInfo.engine = dataSource.getEngine(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE));
                    stmt.setString(1, getContainer().getName());
        throws DBException
    @Override
        @Property(category = DBConstants.CAT_STATISTICS, visibleIf = PartitionedTablePropertyValidator.class, order = 10)
            } else {
    public boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) {
            additionalInfo.charset = sourceAI.charset;
                    if (pkConstraint.getConstraintType().isUnique()
        private MySQLEngine engine;
        if (desc != null) {
        }
                            String pkName = JDBCUtils.safeGetString(dbResult, "pk_name");
            return object.getDataSource().getCharsets().toArray();
            this.getContainer().uniqueKeyCache.cacheObject(constr);
                        );
    public static class AdditionalInfo {
        if (!isPersisted() || monitor == null || monitor.isForceCacheUsage()) {
        {
                        // If pk name does not match, keep searching (actual pk might not be this one)
        additionalInfo.updateTime = JDBCUtils.safeGetTimestamp(dbResult, "Update_time");
    }
    }
                    engines.add(engine);
                            pkMap,
    {
    @Override
        {
        private long maxDataLength;
/**
            }
        @Property(viewable = true, editable = true, updatable = true, listProvider = EngineListProvider.class,
        public long getDataFree() {
                for (MySQLTableConstraint pkConstraint : constraints) {
            if (desc.startsWith(INNODB_COMMENT)) {
                fkMap.put(fkName, fk);
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        if (enable && enableReferentialIntegrityStatement != null) {
                        }
        }
import org.jkiss.code.NotNull;
    public List<MySQLTrigger> getTriggers(@NotNull DBRProgressMonitor monitor)
            // Too bad. But we have to create new fake PK for this FK
        additionalInfo.maxDataLength = JDBCUtils.safeGetLong(dbResult, "Max_data_length");
        @Property(category = DBConstants.CAT_STATISTICS, order = 13,
                            String pkColumnName = JDBCUtils.safeGetString(dbResult, "pk_column_name");
                }
            return checkTime;
        private MySQLCollation collation;

                            String fkTableCatalog = JDBCUtils.safeGetString(dbResult, "fk_table_schema");
    }

        }
            MySQLTableConstraint constr = new MySQLTableConstraint(monitor, this, srcConstr);
            if (partitionName == null) {
    public boolean hasStatistics() {
        additionalInfo.dataFree = JDBCUtils.safeGetLong(dbResult, "Data_free");
            return fkList;
                } else {
                "SHOW TABLE STATUS FROM " + DBUtils.getQuotedIdentifier(getContainer()) + " LIKE '" + getName() + "'")) {
        if (getDataSource().supportsCheckConstraints()) {
    {
        int deleteRule,
            MySQLTableForeignKey fk = new MySQLTableForeignKey(monitor, this, srcFK);
        {
                        String pkColumnName = JDBCUtils.safeGetString(dbResult, JDBCConstants.PKCOLUMN_NAME);
        additionalInfo.loaded = true;
                      rc.UNIQUE_CONSTRAINT_SCHEMA  AS pk_table_schema,
    public String getDescription()
                // https://bugs.mysql.com/bug.php?id=95280
                                fkColumnName,
            final List<MySQLEngine> engines = new ArrayList<>();
            }
        getContainer().resetStatistics();
        @Nullable DBRProgressMonitor monitor,
        public MySQLEngine getEngine() {

        public void setEngine(MySQLEngine engine) { this.engine = engine; }
            disableReferentialIntegrityStatement = "SET GLOBAL FOREIGN_KEY_CHECKS=0";
        if (supportsAlterTableKeysStmt) {
        }
        public void setAutoIncrement(long autoIncrement) { this.autoIncrement = autoIncrement; }


        if (fkTable == null) {
            return createTime;
    }
    }
 *
                        String fkName = JDBCUtils.safeGetString(dbResult, JDBCConstants.FK_NAME);
        List<MySQLTableForeignKey> fkList = new ArrayList<>();
    {
        public Object[] getPossibleValues(MySQLTable object)
        }
 * MySQLTable
                     AND kcu.CONSTRAINT_NAME   = rc.CONSTRAINT_NAME
        }
                constraintObjects.addAll(checkConstraintObjects);
            return object.additionalInfo.loaded;
        }
            for (MySQLEngine engine : object.getDataSource().getEngines()) {
    @Nullable
    public void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
                try (JDBCResultSet dbResult = meta.getImportedKeys(
                        while (dbResult.next()) {
    ) throws DBException {
        DBSForeignKeyModifyRule deleteRuleEnum = JDBCUtils.getCascadeFromNum(deleteRule);
                MySQLTrigger trigger = new MySQLTrigger(catalog, this, srcTrigger);
        }
                            pkName,
    }
    public static class CharsetListProvider implements IPropertyValueListProvider<MySQLTable> {
        public Date getUpdateTime() {
    }
    }
                // Known MySQL bug, metaData.getImportedKeys() can return duplicates
            visibleIf = PartitionedTablePropertyValidator.class, formatter = ByteNumberFormat.class)
            if (info != null && info.getEngine() != null && MySQLEngine.MYISAM.equals(info.getEngine().getName())) {
                        if (pkConstraint.getName().equals(pkName)) {
            // Find pk based on referenced columns
        }
            return collation;
        }

    public static class EngineListProvider implements IPropertyValueListProvider<MySQLTable> {
            AdditionalInfo sourceAI = ((MySQLTable)source).getAdditionalInfo(monitor);
    private String enableReferentialIntegrityStatement;
                }
            return dataFree;
 * Licensed under the Apache License, Version 2.0 (the "License");
        public boolean isPropertyCached(@NotNull MySQLTable object, @NotNull Object propertyId)
            }
        List<MySQLTrigger> triggers = new ArrayList<>();
            Collection<MySQLTableConstraint> constraints = pkTable.getConstraints(monitor);
                loadAdditionalInfo(monitor);
        public void setDescription(String description) { this.description = description; }
    // Copy constructor
 * you may not use this file except in compliance with the License.

        } else {

        @Override
 *
        }
                        String pkName = JDBCUtils.safeGetString(dbResult, JDBCConstants.PK_NAME);
        String pkName,
    }
import org.jkiss.dbeaver.model.*;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                        && DBUtils.getConstraintAttribute(monitor, pkConstraint, pkColumn) != null) {
                this.getContainer().indexCache.cacheObject(index);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        @Property(viewable = true, editable = true, updatable = true, visibleIf = PartitionedTablePropertyValidator.class, order = 4)
                        String fkColumnName = JDBCUtils.safeGetString(dbResult, JDBCConstants.FKCOLUMN_NAME);
            }
        if (fk == null) {
 * You may obtain a copy of the License at
        private volatile boolean loaded = false;
        String pkColumnName,
        }
        }
