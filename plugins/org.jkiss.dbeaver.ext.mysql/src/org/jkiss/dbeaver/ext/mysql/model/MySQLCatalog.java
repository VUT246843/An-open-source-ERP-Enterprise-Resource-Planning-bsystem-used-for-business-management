            }
        ) throws SQLException {

        protected MySQLProcedure fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull JDBCResultSet dbResult)
        throws DBException
    {

            if (object != null || objectName != null) {
        @Override
            } else if (MySQLConstants.INDEX_TYPE_FULLTEXT.getId().equals(indexTypeName)) {
        }
        return hasStatistics;
    {
    }
            StringBuilder sql = new StringBuilder(500);
                        }
        return tableCache.getAllObjects(monitor, this);
        @Override


        }

                case DatabaseMetaData.procedureColumnInOut: parameterType = DBSProcedureParameterKind.INOUT; break;
                indexType = MySQLConstants.INDEX_TYPE_RTREE;
    }
        {
        @Override
            sql.append(

                dbStat.setString(2, object != null ? object.getName() : objectName);
        return getDataSource().supportsInformationSchema() ?


    protected void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
        }
    static class EventCache extends JDBCObjectCache<MySQLCatalog, MySQLEvent> {
        tableCache.setCaseSensitive(false);
                    if (tableFilters != null && !tableFilters.isNotApplicable()) {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        UniqueKeyCache(TableCache tableCache)
        }
    }
        {

import org.jkiss.dbeaver.model.meta.*;
            if (!additionalInfo.loaded) {
        @NotNull
     */
            }
        return getTableCache().getObject(monitor, this, childName);
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull MySQLTableConstraint object, @NotNull List<MySQLTableConstraintColumn> children) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog mySQLCatalog) throws SQLException {
        }
        return monitor == null ? packageCache.getCachedObjects() : packageCache.getAllObjects(monitor, this);
 * You may obtain a copy of the License at
    }
            super(tableCache, MySQLTable.class, MySQLConstants.COL_TABLE_NAME, MySQLConstants.COL_CONSTRAINT_NAME);
        }
        @Override
            dbStat.setString(1, owner.getName());

                null,
    }
            int columnTypeNum = JDBCUtils.safeGetInt(dbResult, JDBCConstants.COLUMN_TYPE);
        return dbSize;
                        if (table instanceof MySQLTable) {
        return true;
            sql.append(" ORDER BY ").append(MySQLConstants.COL_TABLE_NAME).append(",").append(MySQLConstants.COL_INDEX_NAME).append(",").append(MySQLConstants.COL_SEQ_IN_INDEX);
        return getDataSource().supportsInformationSchema() ?
            }
        }
        }
        JDBCResultSet resultSet) throws SQLException, DBException {
        throws DBException
        @Nullable
 * Unless required by applicable law or agreed to in writing, software
        public ProceduresCache()
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBCException {
        JDBCResultSet dbResult)

        String checkConstraintName, @NotNull

    }

    }
        }
    }

    public Collection<MySQLSequence> getSequences(DBRProgressMonitor monitor) throws DBException {
            }
    {
                            if (!CommonUtils.isEmpty(tableFilters.getInclude())) {

        public boolean allowCustomValue()
                sql.append(" AND ").append(MySQLConstants.COL_TABLE_NAME).append("=?");
        {
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull MySQLTableIndex index, @NotNull List<MySQLTableIndexColumn> rows)

                columnSize,
    public String getName()
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLTable forTable) throws SQLException {

        if (getDataSource().supportsCheckConstraints()) {
            dbStat.setString(1, owner.getName());
                if (object != null) {
            } catch (SQLException e) {
    {
import java.sql.SQLException;
            boolean nullable = "YES".equals(JDBCUtils.safeGetStringTrimmed(dbResult, MySQLConstants.COL_NULLABLE));
                scale, precision, notNull,
        return persisted;
    @Override
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                position,
        }
            JDBCPreparedStatement dbStat = session.prepareStatement(
        }
        }
        protected MySQLTableConstraintColumn[] fetchObjectRow(
            return session.getMetaData().getProcedureColumns(
        @Nullable
            }
    @Override
                            sql.append(")");
        private MySQLCharset defaultCharset;
                try (JDBCStatement dbStat = session.createStatement()) {
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
        {
        {
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
    }
            };
        {
            DBSProcedureParameterKind parameterType;
                    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
        return proceduresCache;
     * Index cache implementation
            }
    {

                    dbStat.setString(3, String.valueOf(object.getProcedureType()));
            }
    private final EventCache eventCache = new EventCache();
    @Override

        {
            this.setCaseSensitive(!getDataSource().getSQLDialect().useCaseInsensitiveNameLookup());
        return getDataSource().supportsInformationSchema() ?
        }
            // it should be parsed from SHOW CREATE PROCEDURE/FUNCTION query
        uniqueKeyCache.clearCache();
        protected MySQLTableConstraint fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull MySQLTable parent, @NotNull
        return getDataSource().isSystemCatalog(getName());
            dbStat.setString(1, owner.getName());

                        } else {
            if (forTable != null) {
                return new MySQLView(owner, dbResult);
    }
    }
    }
            if (forTable != null) {
            return new MySQLTableIndex(
import org.jkiss.dbeaver.model.exec.DBCException;
                dbStat.setString(2, forTable.getName());
    DBPScriptObject, DBPScriptObjectExt2
        }
        return null;

    private boolean persisted;
        }
                    }
        protected MySQLTableConstraintColumn[] fetchObjectRow(@NotNull JDBCSession session, @NotNull MySQLTable mySQLTable, @NotNull
    }
    }

                indexTypeName.toUpperCase(Locale.ENGLISH).contains(MySQLConstants.INDEX_TYPE_HASH.getId().toUpperCase(Locale.ENGLISH))
        @Override


                .append(" WHERE ").append(MySQLConstants.COL_TABLE_SCHEMA).append("=?");
            MySQLTableColumn tableColumn = columnName == null ? null : parent.getAttribute(session.getProgressMonitor(), columnName);
    public boolean hasStatistics() {
    private Long databaseSize;

            //int radix = JDBCUtils.safeGetInt(dbResult, JDBCConstants.RADIX);
                    "\nWHERE " + MySQLConstants.COL_ROUTINE_SCHEMA + "=?" +
        @NotNull
        @Override
            }
                        sql.append(" WHERE Table_type <> 'SEQUENCE'");
        {
        }
 * DBeaver - Universal Database Manager
                            sql.append("(");
                    "SELECT TABLE_NAME FROM information_schema.TABLES WHERE TABLE_SCHEMA=? AND TABLE_TYPE = 'SEQUENCE'");
                case DatabaseMetaData.procedureColumnReturn: parameterType = DBSProcedureParameterKind.RETURN; break;
            String ownerName = owner.getName();
        private String sqlPath;
        @Override
        @Override
            if (object != null || objectName != null) {
                    parent, constraintName, null, DBSEntityConstraintType.UNIQUE_KEY, true);
    public String getDescription()
                                if (hasCond) sql.append(" OR ");
        }
                    }
    /**
    }

                return null;

                    dbStat.setString(1, getName());
                try (JDBCResultSet dbResult = dbStat.executeQuery("SHOW TABLE STATUS FROM " + DBUtils.getQuotedIdentifier(this))) {
    final IndexCache indexCache = new IndexCache(tableCache);
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        throws DBException
    public Collection<MySQLProcedure> getProcedures(DBRProgressMonitor monitor) throws DBException {
        }
            JDBCPreparedStatement dbStat = session.prepareStatement(
                return null;
        public boolean isPropertyCached(@NotNull MySQLCatalog object, @NotNull Object propertyId)
            return dbStat;
                case DatabaseMetaData.procedureColumnOut: parameterType = DBSProcedureParameterKind.OUT; break;
            throws SQLException, DBException
public class MySQLCatalog implements
            }
    public MySQLProcedure getProcedure(DBRProgressMonitor monitor, String procName)
            }
    
                    sql.append(" WHERE ").append(tableNameCol);

        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {

}
    @Property(viewable = true, editable = true, order = 1)
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, MySQLTable forTable)
    @Association
    }

     */
        }
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
            throws SQLException
        indexCache.clearCache();
        protected MySQLTableIndex fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull MySQLTable parent, @NotNull

        @Nullable

                        additionalInfo.sqlPath = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_SQL_PATH);
        return getDataSource().supportsInformationSchema() ?
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<MySQLCatalog> {
        @NotNull
    {
                .append(" WHERE ").append(MySQLConstants.COL_TABLE_SCHEMA).append("=?");
    }
        @Override
            }

    }
            String columnName = JDBCUtils.safeGetString(dbResult, JDBCConstants.COLUMN_NAME);
            if (forTable != null) {
        return this;
            throws SQLException
                Collections.emptyList();
    static class UniqueKeyCache extends JDBCCompositeCache<MySQLCatalog, MySQLTable, MySQLTableConstraint, MySQLTableConstraintColumn> {

        {
            if (forTable != null) {
import java.sql.DatabaseMetaData;
        {

    {
    }
                Collections.emptyList();
        }
        {
        {
    /**
    /**
        }
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
            sql.append(" ORDER BY ").append(MySQLConstants.COL_ORDINAL_POSITION);
        if (!isPersisted()) {
        monitor.subTask("Cache tables");
        protected MySQLTableBase fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull JDBCResultSet dbResult)
        }

                            boolean hasCond = false;
            super(tableCache, MySQLTable.class, MySQLConstants.COL_TABLE_NAME, MySQLConstants.COL_CONSTRAINT_NAME);
    @Association

            throws SQLException, DBException

            sql.append("\nORDER BY kc.CONSTRAINT_NAME,kc.ORDINAL_POSITION");
        throws DBException

        return tableCache;


        }
    static class TriggerCache extends JDBCObjectLookupCache<MySQLCatalog, MySQLTrigger> {
            String typeName = JDBCUtils.safeGetString(dbResult, JDBCConstants.TYPE_NAME);
            sql
            this.defaultCharset = defaultCharset;
                    parent, constraintName, null, DBSEntityConstraintType.PRIMARY_KEY, true);
                "SELECT * FROM information_schema.EVENTS WHERE EVENT_SCHEMA=? ORDER BY EVENT_NAME");
            ) {
        {
        getTableCache().clearCache();
            return new MySQLTableIndexColumn[] { new MySQLTableIndexColumn(
        @Property(viewable = true, editable = true, updatable = true, listProvider = CharsetListProvider.class, order = 2)
        if (getDataSource().readKeysWithColumns()) {

                indexType = MySQLConstants.INDEX_TYPE_FULLTEXT;
    {

            String columnName = JDBCUtils.safeGetStringTrimmed(dbResult, MySQLConstants.COL_COLUMN_NAME);
        if (CommonUtils.getOption(options, OPTION_INCLUDE_NESTED_OBJECTS)) {
                                sql.append(tableNameCol).append(" NOT LIKE ").append(SQLUtils.quoteString(session.getDataSource(), incName));
                throw new DBCException(e, session.getExecutionContext());
            return false;
    static class PackageCache extends JDBCObjectLookupCache<MySQLCatalog, MySQLPackage> {
        return getProceduresCache().getObject(monitor, this, procName);
        return additionalInfo;
    static class SequenceCache extends JDBCObjectCache<MySQLCatalog, MySQLSequence> {
                        if (dbResult.next()) {
        {
    static class IndexCache extends JDBCCompositeCache<MySQLCatalog, MySQLTable, MySQLTableIndex, MySQLTableIndexColumn> {
        {
            try (JDBCSession session = DBUtils.openUtilSession(monitor, this, "Read database size")) {
        throws DBException
    }
                                sql.append(tableNameCol).append(" LIKE ").append(SQLUtils.quoteString(session.getDataSource(), SQLUtils.makeSQLLike(incName)));
    };

            return new MySQLSequence(mySQLCatalog, sequenceName);

        }

        }

        return triggerCache;
            StringBuilder sql = new StringBuilder();
    @Association
                        sql.append(" AND Table_type <> 'SEQUENCE'");
                        if (dbResult.nextRow()) {

            } else if (CommonUtils.isNotEmpty(indexTypeName) &&
        @NotNull
            return defaultCharset;
                sql.append(" AND tc.TABLE_NAME=?\n");
        }
        return uniqueKeyCache;
                log.debug("Column '" + columnName + "' not found in table '" + parent.getName() + "' for index '" + object.getName() + "'");
        @Override
        }

    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
            return additionalInfo;
            if (session.getMetaData().getDatabaseMajorVersion() > 4) {
    public Collection<MySQLPackage> getPackages(DBRProgressMonitor monitor)
            int scale = JDBCUtils.safeGetInt(dbResult, JDBCConstants.SCALE);

        {
            dbStat.setString(1, ownerName);
        public void setDefaultCollation(MySQLCollation defaultCollation)
            return;
        @Property(viewable = true, editable = true, updatable = true, listProvider = CollationListProvider.class, order = 3)
        protected MySQLEvent fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull JDBCResultSet dbResult)
        @Override
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull MySQLTableConstraint constraint, @NotNull List<MySQLTableConstraintColumn> rows)
    private String name;
    }
        }
            additionalInfo.loaded = true;
            return new MySQLTableConstraint(parent, checkConstraintName, null, DBSEntityConstraintType.CHECK, true, resultSet);
    @Override


        }

            return new MySQLEvent(owner, dbResult);
            }
        databaseDDL = null;
    {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            return new MySQLProcedure(owner, dbResult);
                dbStat.setString(2, object != null ? object.getName() : objectName);
            return;
    public Collection<MySQLView> getViews(DBRProgressMonitor monitor)
        this.hasStatistics = false;
            //DBSDataType dataType = getDataSourceContainer().getInfo().getSupportedDataType(typeName);
        throws DBException
        @Override

 * you may not use this file except in compliance with the License.
        } finally {
import org.jkiss.dbeaver.DBDatabaseException;
    DBSProcedureContainer, DBPObjectStatisticsCollector, DBPObjectStatistics,
                        }
                dbStat.setString(2, forTable.getName());



        IndexCache(TableCache tableCache)

                "SELECT tc.TABLE_NAME, cc.CONSTRAINT_NAME, cc.CHECK_CLAUSE\n" +
    final TriggerCache triggerCache = new TriggerCache();

                Collections.emptyList();
                    "FROM INFORMATION_SCHEMA.TABLES \n" +
        }
                            databaseDDL = "-- Database definition is not available";
        @Nullable
    @Association
                "SELECT name,comment FROM mysql.proc\n" +
        }
    private transient String databaseDDL;
        }
    @Association
        }
        @Override

    }
                dbStat.setString(2, object != null ? object.getName() : objectName);
                "SELECT * FROM " + MySQLConstants.INFO_SCHEMA_NAME + ".SCHEMATA WHERE SCHEMA_NAME=?")) {
                return null;
    }
            return new MySQLProcedureParameter(
    }
            // Read constraints with columns
                if (object != null || objectName != null) {

/*
            return dbStat;
import org.jkiss.code.Nullable;
            throws SQLException, DBException
            return object.additionalInfo.loaded;
    public Long getDatabaseSize(DBRProgressMonitor monitor) throws DBException {
    }
                            for (String incName : tableFilters.getInclude()) {
            throws SQLException, DBException
            this.sqlPath = sqlPath;

    @Override
            return new MySQLTableColumn(table, dbResult);
        protected void detectCaseSensitivity(DBSObject object) {
            if (MySQLConstants.INDEX_TYPE_BTREE.getId().equals(indexTypeName)) {

    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load database DDL")) {
                    }

            throws SQLException, DBException
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        {
                "SELECT kc.CONSTRAINT_NAME,kc.TABLE_NAME,kc.COLUMN_NAME,kc.ORDINAL_POSITION\n" +
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
        return name + " [" + dataSource.getContainer().getName() + "]";
                checkConstraintCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
            } else {
            if (object != null || objectName != null) {
        return OPTION_INCLUDE_NESTED_OBJECTS.equals(option);
    public MySQLTableBase getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
            throws SQLException, DBException
    public Collection<MySQLTableIndex> getIndexes(DBRProgressMonitor monitor) throws DBException {
                loadAdditionalInfo(monitor);
                    if (dbResult.next()) {
                }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override
            this.additionalInfo.defaultCollation = dataSource.getCollation("utf8_general_ci");
        return getDataSource().supportsInformationSchema() ?
        triggerCache.clearCache();

        }
                    "SELECT SUM((DATA_LENGTH+INDEX_LENGTH))\n" +
        protected MySQLTrigger fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull JDBCResultSet dbResult)
                dbStat.setString(2, forTable.getName());
            return defaultCollation;
            return sqlPath;
            StringBuilder sql = new StringBuilder();
        {
            @NotNull MySQLTable parent, @NotNull MySQLTableIndex object, @NotNull JDBCResultSet dbResult)
        return checkConstraintCache;
                Collections.emptyList();
        if (databaseDDL == null) {
     * Procedures cache implementation
        public MySQLCharset getDefaultCharset()
    {
                    parameterType);
    {
                    additionalInfo.loaded = true;
            }
        @Override
        MySQLDataSource dataSource = getDataSource();
    public Collection<MySQLTableBase> getChildren(@NotNull DBRProgressMonitor monitor)
        }
    @NotNull
            );
        return databaseSize;
        }
    }
    }
        {
    {
    }
        @Override

    }

        return databaseDDL;
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
            } else {
            dbStat.setString(1, owner.getName());
        @Override
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLTableBase forTable)
                indexType,
    {
    }
                    " AND ROUTINE_TYPE" + (object == null ? " IN ('PROCEDURE','FUNCTION')" : "=?") +
    @Override
            }
            if (!session.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_USE_SERVER_SIDE_FILTERS)) {
        {
    {
            String subPart = JDBCUtils.safeGetStringTrimmed(dbResult, MySQLConstants.COL_SUB_PART);
        {
                procedure == null ? null : JDBCUtils.escapeWildCards(session, procedure.getName()),
    public static class CollationListProvider implements IPropertyValueListProvider<MySQLCatalog> {
    public EventCache getEventCache() {
        {
    public Collection<MySQLTrigger> getTriggers(DBRProgressMonitor monitor) throws DBException {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                        if (!CommonUtils.isEmpty(tableFilters.getExclude())) {
    public synchronized void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope)

        }
                    DBSObjectFilter tableFilters = dataSource.getContainer().getObjectFilter(MySQLTable.class, owner, true);
                throw new DBCException(e, session.getExecutionContext());
        @Override
            sql.append("TABLES FROM ").append(DBUtils.getQuotedIdentifier(owner));
        @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
                            databaseSize = 0L;
     */
    }
        this.dataSource = dataSource;
            // Lets driver do it instead of me
            this.additionalInfo.loaded = true;
 * limitations under the License.
 */
                object,
    @NotNull
            getTableCache().loadChildren(monitor, this, null);
    public boolean isPersisted()
    public AdditionalInfo getAdditionalInfo() {
            throws SQLException, DBException
                owner.getName(),
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            throws SQLException
            return dbStat;
                column,
    public MySQLTrigger getTrigger(DBRProgressMonitor monitor, String name)
                indexType = MySQLConstants.INDEX_TYPE_BTREE;
            }
                }
    @Override
    }
import java.util.*;
        }
        {
                        }
        public TableCache()
    }
        @Override
            String ascOrDesc = JDBCUtils.safeGetStringTrimmed(dbResult, MySQLConstants.COL_COLLATION);
    {
        throws DBException
            try (JDBCStatement dbStat = session.createStatement()) {
            this.defaultCollation = defaultCollation;
        throws DBException
            }
        getProceduresCache().clearCache();
        @Nullable
                }
                sql.append(" AND ").append(MySQLConstants.COL_TABLE_NAME).append("=?");
    public MySQLTable getTable(DBRProgressMonitor monitor, String name)

                    }
        @Override
    private long dbSize;
 * Licensed under the Apache License, Version 2.0 (the "License");
            monitor.subTask("Cache table constraints");
        }
    @Override
                sql.append(" LIKE ");
        }
            String sequenceName = JDBCUtils.safeGetString(resultSet, "TABLE_NAME");
 * Copyright (C) 2010-2026 DBeaver Corp and others

    }
    public static class AdditionalInfo {
    public SequenceCache getSequenceCache() {

                                hasCond = true;
                } else {
import org.jkiss.dbeaver.model.struct.DBSObject;
            hasStatistics = true;

            return dbStat;
import java.sql.ResultSet;

        public JDBCStatement prepareLookupStatement(

            return dbStat;
            JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        } else {
            throws SQLException
        }
        String indexName, @NotNull
                // Client side filter
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (forTable != null) {
            additionalInfo.loaded = false;


        @NotNull
                if (object != null || objectName != null) {
                throw new DBDatabaseException(e, getDataSource());

            dbStat.setString(1, owner.getName());
    }
            this.additionalInfo.defaultCharset = dataSource.getCharset("utf8");
        {
                {
        return name;
                }
        return MySQLTable.class;
                }
                return new MySQLTable(owner, dbResult);
                try (JDBCPreparedStatement dbStat = session.prepareStatement(
            return dbStat;

                    "\nORDER BY " + MySQLConstants.COL_ROUTINE_NAME
    private volatile boolean hasStatistics;
                        sql.append(" WHERE ");
        public void setDefaultCharset(MySQLCharset defaultCharset)
            } catch (SQLException e) {
                tableColumn,
            dbStat.setString(1, owner.getName());
            String tableName = JDBCUtils.safeGetString(dbResult, "EVENT_OBJECT_TABLE");
                return new MySQLTableConstraint(
import org.jkiss.utils.ByteNumberFormat;
                    "WHERE TABLE_SCHEMA=?"))
    {
    public static class TableCache extends JDBCStructLookupCache<MySQLCatalog, MySQLTableBase, MySQLTableColumn> {
                "SELECT * FROM INFORMATION_SCHEMA.TRIGGERS\n" +
            }
    }

                "SELECT * FROM " + MySQLConstants.META_TABLE_ROUTINES +

        protected MySQLSequence fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog mySQLCatalog, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
            boolean notNull = JDBCUtils.safeGetInt(dbResult, JDBCConstants.NULLABLE) == DatabaseMetaData.procedureNoNulls;
        }
                .append("SELECT * FROM ").append(MySQLConstants.META_TABLE_STATISTICS)
            return session.prepareStatement(sql.toString());

    @Override
    /**
        sequenceCache.clearCache();
    @Override
    }

    DBSCatalog, DBPSaveableObject, DBPRefreshableObject, DBPSystemObject,
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
import org.jkiss.dbeaver.ModelPreferences;
            throws SQLException, DBException
                indexCache.getObjects(monitor, this, null) :
        @NotNull
        }
        protected MySQLProcedureParameter fetchChild(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull MySQLProcedure parent, @NotNull JDBCResultSet dbResult)
    @Override
        }
            return dbStat;
            sql.append("ORDER BY tc.TABLE_NAME,cc.CONSTRAINT_NAME");
                    (object == null && objectName == null ? "" : " \nAND name = ?")
 *
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        return sequenceCache;
        {
        }
                throw new DBException("Error reading database DDL", e);
            switch (columnTypeNum) {
            }
                "A".equalsIgnoreCase(ascOrDesc),
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
            @NotNull JDBCSession session,
    }
                columnName = "RETURN";
            );
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            MySQLDataSource dataSource = owner.getDataSource();
    public UniqueKeyCache getUniqueKeyCache()
                            }
        {
            uniqueKeyCache.getAllObjects(monitor, this);

        getTableCache().getAllObjects(monitor, this);
        @Override
        }
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLProcedure procedure)

import org.jkiss.utils.CommonUtils;
    @Association
                                sql.append(" AND ");

    @Property(viewable = true, order = 20, formatter = ByteNumberFormat.class)
                Collections.emptyList();
            @NotNull MySQLTable parent, @NotNull MySQLTableConstraint object, @NotNull JDBCResultSet dbResult)
        }
        }
        JDBCResultSet resultSet) throws SQLException, DBException {
    }
            }
        protected MySQLPackage fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull JDBCResultSet dbResult)
     */
    public TriggerCache getTriggerCache()
    {
        return indexCache;

        void setSqlPath(String sqlPath)
                return new MySQLTableConstraint(
        protected MySQLTableConstraint fetchObject(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull MySQLTable parent, @NotNull
    public long getStatObjectSize() {
        if (isSystem()) {

            }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public MySQLCollation getDefaultCollation()
            constraint.setAttributeReferences(rows);
    @Override
    }
        @Nullable
        @Override
                        if (!CommonUtils.isEmpty(tableFilters.getInclude())) {
        public Object[] getPossibleValues(MySQLCatalog object)

            } else {
            }
                        additionalInfo.defaultCollation = dataSource.getCollation(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_DEFAULT_COLLATION_NAME));
                            sql.append(")");
    public void setName(String name)
            if (getDataSource().supportsCheckConstraints()) {
    public class ProceduresCache extends JDBCStructLookupCache<MySQLCatalog, MySQLProcedure, MySQLProcedureParameter> {
            return dbStat;
                        MySQLTableBase table = getTableCache().getObject(monitor, this, tableName);
        @Override
                indexType = MySQLConstants.INDEX_TYPE_HASH;

    private final SequenceCache sequenceCache = new SequenceCache();
                            sql.append("(");
                columnName,
        @NotNull
        eventCache.clearCache();
        this.persisted = persisted;
        @Property(viewable = true, order = 4)
            long columnSize = JDBCUtils.safeGetLong(dbResult, JDBCConstants.LENGTH);
            if (object.additionalInfo.defaultCharset == null) {
{
    {
                log.warn("Column '" + columnName + "' not found in table '" + parent.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
            this.name = JDBCUtils.safeGetString(dbResult, 1);
                 " ORDER BY EVENT_OBJECT_SCHEMA, TRIGGER_NAME;")
    public CheckConstraintCache getCheckConstraintCache()
    }
            return false;
        if (dbResult != null) {
                indexName,
        @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return eventCache;
    }
        if (!getDataSource().supportsInformationSchema()) {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLPackage object, @Nullable String objectName) throws SQLException {
        @Override
                "WHERE TRIGGER_SCHEMA = ?" +
import org.jkiss.code.NotNull;
        return dataSource;
            return;
    {
            return dbStat;
    public Collection<MySQLEvent> getEvents(DBRProgressMonitor monitor) throws DBException {
    @Association
        {
    }
        }
                    appendTableNameCondition(session, object, objectName, sql, true);
        if (databaseSize == null && getDataSource().supportsInformationSchema()) {
            DBSIndexType indexType;
            return new MySQLTableConstraintColumn[0];

            @NotNull JDBCSession session,
    @Override
            dbStat.setString(1, owner.getName());
            int ordinalPosition = JDBCUtils.safeGetInt(dbResult, MySQLConstants.COL_ORDINAL_POSITION);

/**
package org.jkiss.dbeaver.ext.mysql.model;
            // There is no metadata table about proc/func columns -
                String tableNameCol = DBUtils.getQuotedIdentifier(dataSource, "Tables_in_" + owner.getName());
import org.jkiss.dbeaver.DBException;
            final JDBCPreparedStatement dbStat = session.prepareStatement(
            if (column == null) {
    public String toString()
            }
    {
    @Override
 *
        @NotNull
        throws DBException
            if (forceUseLike || objectName != null && SQLUtils.isLikePattern(objectName)) {
    // for internal use only
                    }
            int precision = JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION);
    }
            }
 */
            (monitor == null ? eventCache.getCachedObjects() : eventCache.getAllObjects(monitor, this)) :
 * See the License for the specific language governing permissions and
        {
     * Constraint cache implementation
                ((object == null && objectName == null ? "" : " \nAND TRIGGER_NAME = ?\n") +
        if (hasStatistics && !forceRefresh) {
        private MySQLCollation defaultCollation;
        }
                "%").getSourceStatement();
            MySQLTable triggerTable = CommonUtils.isEmpty(tableName) ? null : owner.getTable(session.getProgressMonitor(), tableName);
        {
            if (forTable != null) {

                            }
        {
    {
            StringBuilder sql = new StringBuilder("SHOW ");
        private static void appendTableNameCondition(@NotNull JDBCSession session, @Nullable MySQLTableBase object, @Nullable String objectName, StringBuilder sql, boolean forceUseLike) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        String constraintName, @NotNull
                    appendTableNameCondition(session, object, objectName, sql, false);
                    (object == null && objectName == null ? "" : " AND " + MySQLConstants.COL_ROUTINE_NAME + "=?") +

        @Override
    @PropertyGroup()
            int valueType = JDBCUtils.safeGetInt(dbResult, JDBCConstants.DATA_TYPE);
                            }
    public MySQLCatalog(MySQLDataSource dataSource, ResultSet dbResult)
            super(JDBCConstants.TABLE_NAME);

                sql.append(" AND kc.TABLE_NAME=?");
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner)
                }
            MySQLTableColumn column = parent.getAttribute(session.getProgressMonitor(), columnName);
    public TableCache getTableCache()
                "FROM INFORMATION_SCHEMA.CHECK_CONSTRAINTS cc, INFORMATION_SCHEMA.TABLE_CONSTRAINTS tc\n" +
    public DBSObject getParentObject()
            throws SQLException, DBException
            StringBuilder sql = new StringBuilder(500);
            if (tableType != null && tableType.contains("VIEW")) {
        @Override
            checkConstraintCache.clearCache();

                        }

        this.dbSize = dbSize;
            throws SQLException, DBException
            persisted = false;
        CheckConstraintCache(TableCache tableCache)

            uniqueKeyCache.getAllObjects(monitor, this);
        @Override

        protected MySQLTableIndexColumn[] fetchObjectRow(
                return object.additionalInfo.defaultCharset.getCollations().toArray();

            }
        }
        @Override
    }

        if ((scope & STRUCT_ATTRIBUTES) != 0) {
    private final PackageCache packageCache = new PackageCache();
    @Association
    }
        @Override
            );
                }
            if (forTable != null) {
                ordinalPosition,

        {
        {
    {
            super(tableCache, MySQLTable.class, MySQLConstants.COL_TABLE_NAME, MySQLConstants.COL_INDEX_NAME);
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLTrigger object, @Nullable String objectName) throws SQLException {
            return new MySQLTrigger(owner, triggerTable, dbResult);
                case DatabaseMetaData.procedureColumnResult: parameterType = DBSProcedureParameterKind.RESULTSET; break;
        return triggerCache.getObject(monitor, this, name);
                default: parameterType = DBSProcedureParameterKind.UNKNOWN; break;
    @Nullable
    }
            index.setColumns(rows);
            monitor.subTask("Cache table columns");
                        String tableName = dbResult.getString("Name");
            }
 * MySQLCatalog
        }
        @Override

    }
            } catch (SQLException e) {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLProcedure object, @Nullable String objectName) throws SQLException {
    final CheckConstraintCache checkConstraintCache = new CheckConstraintCache(tableCache);
                    if (dataSource.supportsSequences()) {
                            databaseDDL = JDBCUtils.safeGetString(dbResult, "Create Database");
            String indexTypeName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_INDEX_TYPE);
        hasStatistics = false;
            return new MySQLTableConstraintColumn[] { new MySQLTableConstraintColumn(
        synchronized (additionalInfo) {
            } else if (MySQLConstants.INDEX_TYPE_RTREE.getId().equals(indexTypeName)) {
                "FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE kc WHERE kc.TABLE_SCHEMA=? AND kc.REFERENCED_TABLE_NAME IS NULL");
    }
                dbResult);
    }
        public Object[] getPossibleValues(MySQLCatalog object)
                                if (hasCond) sql.append(" OR ");
            throws SQLException, DBException

                dbStat.setString(1, getName());
            }
            if (tableColumn == null) {
     * Check constraint cache implementation
            throws SQLException
            } else {
    @NotNull
    }
    private final MySQLDataSource dataSource;
        }
            // Load procedure columns through MySQL metadata
        if ((scope & STRUCT_ASSOCIATIONS) != 0) {
            final String tableType = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_TYPE);
            sql.append(
            }
                        }
    private final TableCache tableCache = new TableCache() {

    @Override
                case DatabaseMetaData.procedureColumnIn: parameterType = DBSProcedureParameterKind.IN; break;
            (monitor == null ? triggerCache.getCachedObjects() : triggerCache.getAllObjects(monitor, this)) :
    public static class CharsetListProvider implements IPropertyValueListProvider<MySQLCatalog> {
        }
        this.name = name;
                sql.append(" = ");

    @Override
    public IndexCache getIndexCache()
            if (CommonUtils.isEmpty(columnName) && parameterType == DBSProcedureParameterKind.RETURN) {
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
            } else {
            if (forTable != null) {
        return tables;

    protected final AdditionalInfo additionalInfo = new AdditionalInfo();
            } else {
            this.additionalInfo.sqlPath = "";
 *
    public Collection<MySQLTable> getTables(DBRProgressMonitor monitor) throws DBException {
                valueType,
import org.jkiss.dbeaver.model.*;
                indexType = DBSIndexType.OTHER;
import org.jkiss.dbeaver.model.sql.SQLUtils;
                "WHERE tc.CONSTRAINT_SCHEMA = ?\n" +
        public String getSqlPath()
    void setDatabaseSize(long dbSize) {
    @Override
    }
                    "WHERE db = ? AND type = 'PACKAGE'" +
        @Nullable
            @NotNull JDBCSession session,
    void resetStatistics() {
    static class CheckConstraintCache extends JDBCCompositeCache<MySQLCatalog, MySQLTable, MySQLTableConstraint, MySQLTableConstraintColumn> {

    @Override
            if (constraintName.equals(MySQLConstants.CONSTRAINT_PRIMARY_KEY_NAME)) {

    public boolean isSystem() {
                typeName,
        {
        protected MySQLTableColumn fetchChild(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @NotNull MySQLTableBase table, @NotNull JDBCResultSet dbResult)
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor)
                subPart)
        }
                dbStat.setString(2, forTable.getName());
                                hasCond = true;
        return getTableCache().getTypedObjects(monitor, this, MySQLView.class);
            int position = JDBCUtils.safeGetInt(dbResult, JDBCConstants.ORDINAL_POSITION);
            }
            dbStat.setString(1, mySQLCatalog.getName());
    {
            @Nullable MySQLTableBase object,
            int ordinalPosition = JDBCUtils.safeGetInt(dbResult, MySQLConstants.COL_SEQ_IN_INDEX);
    public boolean isStatisticsCollected() {
            @NotNull MySQLCatalog owner,
            @Nullable String objectName
        @Override
            sql

    }
            persisted = true;
    }
        public boolean allowCustomValue()

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
                            boolean hasCond = false;
        {
        private volatile boolean loaded = false;
            hasStatistics = true;
        List<MySQLTable> tables = getTableCache().getTypedObjects(monitor, this, MySQLTable.class);
                parent,
        @Override
                nullable,
            sql.append(SQLUtils.quoteString(session.getDataSource(), object != null ? object.getName() : objectName));
import org.jkiss.dbeaver.model.struct.DBSEntity;
    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                        additionalInfo.defaultCharset = dataSource.getCharset(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_DEFAULT_CHARACTER_SET_NAME));

                            databaseSize = dbResult.getLong(1);
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    final UniqueKeyCache uniqueKeyCache = new UniqueKeyCache(tableCache);
            return;
        throws DBException
        }
            super(JDBCConstants.PROCEDURE_NAME);
                    while (dbResult.next()) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLCatalog owner, @Nullable MySQLTable forTable)
                "AND tc.CONSTRAINT_SCHEMA=cc.CONSTRAINT_SCHEMA AND tc.CONSTRAINT_NAME=cc.CONSTRAINT_NAME\n");
    }

                            ((MySQLTable) table).fetchAdditionalInfo(dbResult);
                ordinalPosition) };

                getProceduresCache().getAllObjects(monitor, this) :
            return new MySQLPackage(owner, dbResult);
                    } else if (dataSource.supportsSequences()) {


            return object.getDataSource().getCharsets().toArray();
                        } else {
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    }
                    try (JDBCResultSet dbResult = dbStat.executeQuery("SHOW CREATE DATABASE " + DBUtils.getQuotedIdentifier(this))) {
                object,
    }
            (monitor == null ? sequenceCache.getCachedObjects() : sequenceCache.getAllObjects(monitor, this)) :
    @NotNull
    private final ProceduresCache proceduresCache = new ProceduresCache();
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    {
                            for (String incName : tableFilters.getExclude()) {
        return getTableCache().getObject(monitor, this, name, MySQLTable.class);
        }
    {
        @NotNull
    public ProceduresCache getProceduresCache()
        JDBCResultSet dbResult)
                sql.append("FULL ");
        return dataSource.getContainer();
    @Override
        }
        }
            String columnName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_COLUMN_NAME);
    public MySQLDataSource getDataSource()
    public void setPersisted(boolean persisted)
                parent,
                .append("SELECT * FROM ").append(MySQLConstants.META_TABLE_COLUMNS)
        MySQLTableConstraint forObject, @NotNull
