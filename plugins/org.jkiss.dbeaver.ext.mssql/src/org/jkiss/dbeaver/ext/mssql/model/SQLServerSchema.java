                sql.append(" AND t.schema_id = ?");
        @NotNull
    public Collection<SQLServerProcedure> getProcedures(DBRProgressMonitor monitor) throws DBException {
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "all_columns")).append(" c")
                .append("\nLEFT OUTER JOIN ").append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "computed_columns")).append(" cc ON cc.object_id=t.object_id AND cc.column_id=c.column_id")
        }
    }
                    break;
            sql.append("\nLEFT OUTER JOIN ").append(SQLServerUtils.getExtendedPropsTableName(owner.getDatabase())).append(" ep ON ep.class=").append(SQLServerObjectClass.OBJECT_OR_COLUMN.getClassId()).append(" AND ep.major_id=o.object_id AND ep.minor_id=0 AND ep.name='").append(SQLServerConstants.PROP_MS_DESCRIPTION).append("'");
                return null;
/*

            return DBUtils.getQuotedIdentifier(this);
            if (dt.getSchemaId() == getObjectId()) {
        private static final int INDEX_TYPE_NONCLUSTERED_ROWSTORE = 2;
                "\nWHERE p.type IN ('P','PC','X','TF','FN','IF') AND p.schema_id=?" +

 *
        return DBUtils.getFullQualifiedName(getDataSource(), getDatabase(), this);
        protected SQLServerTableForeignKey fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @NotNull
    }

                    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
    }
    }
                        if (table instanceof SQLServerTable) {
                        SQLServerTableBase table = getTable(monitor, tableName);
            for (SQLServerTableBase table: tableCache.getAllObjects(monitor, SQLServerSchema.this)) {
            SQLServerTableBase table = getTableWithTriggerSupport(session.getProgressMonitor(), tableId);
            }
 *
            }
            hasTableStatistics = true;
        return result;
    @NotNull
                dbStat.setLong(1, owner.getObjectId());
            dbStat.setLong(1, schema.getObjectId());
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerTableForeignKey foreignKey, @NotNull List<SQLServerTableForeignKeyColumn> rows)
        return null;
            return object;
        return name;
            return dbStat;


            } else {
            } else {
            if (CommonUtils.isEmpty(name)) {
            }
            String type = JDBCUtils.safeGetString(resultSet, "type");
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, SQLServerProcedure forObject) throws SQLException {
                indexName,
            StringBuilder sql = new StringBuilder(500);
            if (table.getObjectId() == tableId && table instanceof SQLServerTable) {
                        sql.append(" o.name LIKE ").append(SQLUtils.quoteString(session.getDataSource(), incName));
    //////////////////////////////////////////////////
                sql.append(" AND o.name = ").append(SQLUtils.quoteString(session.getDataSource(), object != null ? object.getName() : objectName));
        {

    }
            } else {
    public TableCache getTableCache() {

            if (forTable != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                sql.append(" AND t.schema_id=?");
    public SQLServerTableBase getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
    public ForeignKeyCache getForeignKeyCache() {
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "tables")).append(" t,")
    public SQLServerTableBase getTable(DBRProgressMonitor monitor, String name) throws DBException {
                    indexType = DBSIndexType.CLUSTERED;
            long refTableId = JDBCUtils.safeGetLong(dbResult, "referenced_object_id");
            super.loadObjects(monitor, schema, forParent);
            }
        @Override

        return procedureCache.getObject(monitor, this, name);
        log.debug("Table type '" + tableId + "' not found in schema " + getName());
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @Nullable SQLServerTableBase forTable)

    public List<SQLServerDataType> getDataTypes(DBRProgressMonitor monitor) throws DBException {

    }
                JDBCUtils.safeGetString(resultSet, "name"),
        return database.getDataSource();
        private static final int INDEX_TYPE_SPATIAL = 4;
                    break;
    @Association
            sql.append("\nORDER BY t.name");
                "SELECT kc.*,t.name as table_name FROM \n")
        synonymCache.clearCache();
        @Override

            }
            }
            return null;
        SQLServerTableBase forTable)
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
import org.jkiss.dbeaver.model.*;
            DBRProgressMonitor monitor = session.getProgressMonitor();
            sql.append("SELECT p.name as proc_name,pp.* FROM \n")
/**
            int indexTypeNum = JDBCUtils.safeGetInt(dbResult, "type");
                dbStat.setLong(1, forTable.getObjectId());
    }
            synonymCache.getAllObjects(monitor, this);
            super(tableCache, SQLServerTableBase.class, "table_name", "name");
import org.jkiss.dbeaver.model.meta.Property;
            }
            throws SQLException, DBException
 * Unless required by applicable law or agreed to in writing, software
    }
    // Tables
            allIndexes.addAll(CommonUtils.safeCollection(table.getIndexes(monitor)));
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @Nullable SQLServerProcedure object, @Nullable String objectName) throws SQLException {
                getObjectId(),
            }
                refColumn) };

        }
        public ProcedureCache() {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @Nullable SQLServerTableBase object, @Nullable String objectName) throws SQLException {
            }
            DBSForeignKeyModifyRule updateRule = SQLServerUtils.getForeignKeyModifyRule(JDBCUtils.safeGetInt(dbResult, "update_referential_action"));
            long refSchemaId = JDBCUtils.safeGetLong(dbResult, "referenced_schema_id");

 */
                isColumnstoreIndex);
                .append("\nLEFT OUTER JOIN ").append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "default_constraints")).append(" dc ON dc.parent_object_id=t.object_id AND dc.parent_column_id=c.column_id")
            // Cache schema indexes if no table specified
        if (object != null) {
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerTableIndex index, @NotNull List<SQLServerTableIndexColumn> rows)
            @NotNull SQLServerTableForeignKey object,
            if (owner.getDataSource().supportsExternalTables(session)) {
import org.jkiss.dbeaver.DBException;
                    break;
        this.hasTableStatistics = false;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table statistics")) {
    static class IndexCache extends JDBCCompositeCache<SQLServerSchema, SQLServerTableBase, SQLServerTableIndex, SQLServerTableIndexColumn> {
    }
        protected SQLServerProcedure fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                return null;
                    }
            throws SQLException

                parent,
                return (SQLServerTable) table;
            return new SQLServerTableIndexColumn[] {

            String name = JDBCUtils.safeGetString(dbResult, "name");
        return synonymCache.getAllObjects(monitor, this);
            sql.append("\nORDER BY c.object_id,c.column_id");
            throws SQLException
            this.schemaId = JDBCUtils.safeGetLong(resultSet, "schema_id");
            return;

    private final long schemaId;
        @Override
        {
            sql.append("SELECT ");
    public boolean isPersisted() {
    @Override
        List<SQLServerDataType> result = new ArrayList<>();

                result.add(dt);
        }
    }
        @SuppressWarnings("unchecked")
        }
                sql.append(" t.*, (SELECT STRING_AGG(te.type_desc, ', ') FROM ")
        TableCache()


    public Collection<SQLServerSynonym> getSynonyms(DBRProgressMonitor monitor) throws DBException {
                        hasCond = true;
                if (table.getOriginalName().equalsIgnoreCase(childName)) {
                for (SQLServerTableBase table : tableCache.getCachedObjects()) {
    void resetTableStatistics() {
        }
        SQLServerTableBase forParent) throws SQLException {

        foreignKeyCache.clearCache();
            sql.append("WHERE t.object_id = i.object_id AND ic.object_id=i.object_id AND ic.index_id=i.index_id");

            sql.append(" as trigger_type FROM ")
            if (refTable == null) {

                DBSObjectFilter tableFilters = dataSource.getContainer().getObjectFilter(SQLServerTableBase.class, owner, false);
    }
                sql.append(" AND t.object_id = ?");
        @Nullable
        database.refreshDataTypes();
        @Nullable
            }
        this.persisted = persisted;

        throw new IllegalStateException("Can't change schema definition");
        }
    private boolean persisted;

            if (forTable != null) {
        this.description = JDBCUtils.safeGetString(resultSet, "description");
            return new SQLServerProcedureParameter(session.getProgressMonitor(), parent, dbResult);
                    for (String incName : CommonUtils.safeCollection(tableFilters.getInclude())) {
            }
        return result;
    @NotNull
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;

     */
        protected SQLServerTableTrigger fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {


import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            }
    public String getName() {
    private TriggerCache triggerCache = new TriggerCache();
            long refIndexId = JDBCUtils.safeGetLong(dbResult, "key_index_id");

*/
            sql.append("WHERE s.schema_id=?");

                sql.append("\nLEFT OUTER JOIN ").append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "tables")).append(" t ON t.object_id=o.object_id");
    }
                }

    @Override
    @Override



     * Index cache implementation
            long columnId = JDBCUtils.safeGetInt(dbResult, "column_id");
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, SQLServerTableBase forTable)
        if (getDataSource().isServerVersionAtLeast(SQLServerConstants.SQL_SERVER_2005_VERSION_MAJOR ,0)) {
        {
            }
        }
                    String originalName = SQLServerUtils.stripTempdbTableName(name);
    static class ProcedureCache extends JDBCStructLookupCache<SQLServerSchema, SQLServerProcedure, SQLServerProcedureParameter> {
        ForeignKeyCache()

    }
            if (forTable != null) {
            @NotNull JDBCSession session,
            uniqueConstraintCache.getAllObjects(monitor, this);
        return synonymCache.getObject(monitor, this, name);
        @NotNull
            StringBuilder sql = new StringBuilder();
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @Nullable

    public String getDescription() {
    }
            sql.append("\nORDER BY pp.object_id, pp.parameter_id");
            throws SQLException, DBException
            if (object != null || objectName != null) {
        }
                    sql.append(" AND (");
    @NotNull
        return procedureCache;
    }
            }
            }
            SQLServerTableIndex index = table.getIndex(session.getProgressMonitor(), indexId);
                sql.append(" AND kc.parent_object_id=?");
    private ProcedureCache procedureCache = new ProcedureCache();
    @Override
        protected SQLServerTableUniqueKey fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @NotNull
    //////////////////////////////////////////////////
            } else if (SQLServerObjectType.TT.name().equals(type)) {
        }
        @Override
        }
                        if (hasCond) sql.append(" OR ");
    //////////////////////////////////////////////////
import org.jkiss.code.Nullable;
        protected void loadObjects(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerSchema schema, @Nullable SQLServerTableBase forParent)
        }

import org.jkiss.dbeaver.model.exec.DBCException;
        for (SQLServerDataType dt : database.getDataTypes(monitor)) {

                indexCache.getAllObjects(monitor, schema);
    }
    @Override
    public Collection<SQLServerSequence> getSequences(DBRProgressMonitor monitor) throws DBException {
            } else {

            String type = JDBCUtils.safeGetStringTrimmed(dbResult, "type");
        @Override
            SQLServerTableColumn fkColumn = fkTable.getAttribute(monitor, JDBCUtils.safeGetLong(dbResult, "parent_column_id"));
                if (tableFilters != null && !tableFilters.isEmpty()) {
    @Override
                JDBCUtils.safeGetLong(resultSet, "object_id"),
            DBRProgressMonitor monitor = session.getProgressMonitor();
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
                dbResult,
    static class UniqueConstraintCache extends JDBCCompositeCache<SQLServerSchema, SQLServerTableBase, SQLServerTableUniqueKey, SQLServerTableIndexColumn> {
            int columnId = JDBCUtils.safeGetInt(dbResult, "constraint_column_id");
            return dbStat;
                return null;

                .append("\nLEFT OUTER JOIN ").append(SQLServerUtils.getExtendedPropsTableName(owner.getDatabase())).append(" ep ON ep.class=").append(SQLServerObjectClass.OBJECT_OR_COLUMN.getClassId()).append(" AND ep.major_id=t.object_id AND ep.minor_id=c.column_id AND ep.name='").append(SQLServerConstants.PROP_MS_DESCRIPTION).append("'")
            }

        }
    static class SynonymCache extends JDBCObjectCache<SQLServerSchema, SQLServerSynonym> {


    public SQLServerDataSource getDataSource() {
                indexType,
                sql.append("t.schema_id=?");
                (object != null || objectName != null ? " AND p.name=?" : "") +
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)

}
                .append("\nWHERE t.object_id = fk.parent_object_id AND fk.object_id=fkc.constraint_object_id AND tr.object_id=fk.referenced_object_id");
        return triggerCache.getAllObjects(monitor, this);
            return dbStat;
        return tableCache.getTypedObjects(monitor, this, SQLServerTable.class);
    }
                        if (hasCond) sql.append(" OR ");
                true);
    }
    public boolean isStatisticsCollected() {

                dbStat.setString(2, object != null ? object.getName() : objectName);
                dbStat.setLong(2, forParent.getObjectId());
    }
        SQLServerTableUniqueKey forObject, @NotNull
                        ((SQLServerTable) table).setDefaultTableStats();
            }
            if (index == null) {
                CommonUtils.toLong(JDBCUtils.safeGetObject(resultSet, "maximum_value")),
        }
                    }
        }
            sql.append(" FROM ").append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "all_objects")).append(" o");
    }
        {
        @Override

        SQLServerTableBase parent, @NotNull String indexName, @NotNull
                case INDEX_TYPE_HEAP:
                JDBCUtils.safeGetString(resultSet, "base_object_name"),
        return SQLServerTable.class;
                        }
    // Sequences
            dbStat.setLong(1, schema.getObjectId());
        private static final int INDEX_TYPE_CLUSTERED_COLUMNSTORE = 5;
        sequenceCache.clearCache();
    private TableCache tableCache = new TableCache();
            sql.append("\nORDER BY kc.name");

                    .append("WHERE t.object_id = te.object_id)");
    @Property(viewable = false, editable = false, order = 5)
    /////////////////////////////////////////////////////////
        StringBuilder sql = new StringBuilder();

            }
    public Collection<SQLServerView> getViews(DBRProgressMonitor monitor) throws DBException {
        @Override
    }
    public String toString() {
    private IndexCache indexCache = new IndexCache(tableCache);
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "tables")).append(" tr")

                .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "key_constraints")).append(" kc,")
            sql.append("WHERE o.object_id=t.object_id AND o.schema_id=?");
            return new SQLServerTableIndex(
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema schema) throws SQLException {
    public void setPersisted(boolean persisted) {
        }
            for (SQLServerTableUniqueKey refPK : CommonUtils.safeCollection(refTable.getConstraints(monitor))) {
        }
            SQLServerTableBase fkTable = object.getParentObject();
            sql.append("WHERE s.schema_id=?");
    @Association
        }
            log.debug("Table '" + tableId + "' not found in schema " + getName());
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
                return null;
        return this.persisted;
        return uniqueConstraintCache;
                log.debug("Empty table name fetched");
    @Override
                case INDEX_TYPE_XML:
    private volatile boolean hasTableStatistics;
            sql.append("\nORDER BY s.name");
        }
    /**

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @Override

            } else {
            indexCache.getAllObjects(monitor, this);
            SQLServerTable refTable = refSchema.getTable(monitor, refTableId);
    private final SQLServerDatabase database;
            } else {
            SQLServerSchema refSchema = owner.getDatabase().getSchema(monitor, refSchemaId);
    public SynonymCache getSynonymCache() {

import java.util.Collection;
    private static final Log log = Log.getLog(SQLServerSchema.class);
                "\nORDER BY p.name";
            boolean included = JDBCUtils.safeGetInt(dbResult, "is_included_column") == 1;
        }
        protected SQLServerSequence fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        protected SQLServerTableIndex fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @NotNull SQLServerTableBase parent, @NotNull
            int ordinal = JDBCUtils.safeGetInt(dbResult, "key_ordinal");
        @Override
        if (database.isTempDatabase()) {
                .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "all_objects")).append(" p, ")
            if (owner.getDataSource().supportsExternalTables(session) && JDBCUtils.safeGetBoolean(dbResult, "is_external")) {

                dbStat.setLong(1, owner.getObjectId());
    @Override
            }
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
        @NotNull
                return null;
        UniqueConstraintCache(TableCache tableCache) {
    }
 * See the License for the specific language governing permissions and
            index.setColumns(rows);
        }
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
            if (SQLServerObjectType.U.name().equals(type) || SQLServerObjectType.S.name().equals(type)) {
    public UniqueConstraintCache getUniqueConstraintCache() {
    }
    public void setObjectDefinitionText(String source) {
        @Override

    }
                return new SQLServerTableUniqueKey(table, name, null, cType, index, true);

        }

            }
    }
        result.addAll(synonymCache.getAllObjects(monitor, this));
            if (table.getObjectId() == tableId && table instanceof SQLServerTableType tt) {




                "SELECT s.* FROM \n")
        }
        return getFullyQualifiedName(DBPEvaluationContext.UI);
            if (SQLServerUtils.isDriverBabelfish(dataSource.getContainer().getDriver())) {
                .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "all_parameters")).append(" pp\n")

            sql.append(
        {
 * distributed under the License is distributed on an "AS IS" BASIS,
        private static final int INDEX_TYPE_NONCLUSTERED_COLUMNSTORE = 6;
                return new SQLServerTableType(owner, dbResult, name);
    @Override
    }
    @Nullable
        if ((scope & STRUCT_ATTRIBUTES) == STRUCT_ATTRIBUTES) {
    }
        } else {
        indexCache.clearCache();
        protected SQLServerTableForeignKeyColumn[] fetchObjectRow(
 * you may not use this file except in compliance with the License.
                columnId,
            foreignKey.setAttributeReferences(rows);
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
            hasTableStatistics = true;
        return tableCache.getObject(monitor, this, name);

        return schemaId;
                    return table;
                }
    @Association
            @NotNull SQLServerTableIndex object,
    public Collection<SQLServerExternalTable> getExternalTables(DBRProgressMonitor monitor) throws DBException {
            sql.append("\nWHERE o.type IN ('U','S','V','TT') AND o.schema_id = ").append(owner.getObjectId());
     */
        for (SQLServerTableBase table : tableCache.getAllObjects(monitor, this)) {
        @Override
        procedureCache.clearCache();
import org.jkiss.dbeaver.model.struct.*;
        return database;
    @Property(viewable = true, editable = true, order = 1)
            Collection<SQLServerTableBase> tablesOrViews = tableCache.getAllObjects(monitor, this);
                return new SQLServerExternalTable(owner, dbResult, name);
        @Override
        private static final int INDEX_TYPE_HEAP = 0;
import java.util.ArrayList;
    @NotNull
            sql.append("SELECT c.*,t.name as table_name,t.schema_id,cc.is_persisted,cc.definition as computed_definition");
import org.jkiss.utils.CommonUtils;

    // Triggers
        IndexCache(TableCache tableCache)
        }
        }
                    sql.append(")");
                }
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
        return allIndexes;
        return tableCache.getTypedObjects(monitor, this, SQLServerTableType.class);
    @Association

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                CommonUtils.toLong(JDBCUtils.safeGetObject(resultSet, "increment")),
            @NotNull SQLServerTableBase parent,
        }
        @Override
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "all_objects")).append(" t").append("\n");

            return dbStat;
            sql.append("SELECT i.*,ic.index_column_id,ic.column_id,ic.key_ordinal,ic.is_descending_key,ic.is_included_column,t.name as table_name\nFROM ")

            if (object != null || objectName != null) {
        @Override
                true
import java.sql.SQLException;
    private SynonymCache synonymCache = new SynonymCache();
        protected SQLServerProcedureParameter fetchChild(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @NotNull SQLServerProcedure parent, @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerTableUniqueKey object, @NotNull List<SQLServerTableIndexColumn> children) {

            super("table_name");
        protected SQLServerTableIndexColumn[] fetchObjectRow(
                        sql.append(" o.name NOT LIKE ").append(SQLUtils.quoteString(session.getDataSource(), incName));
            }
                    hasCond = false;
        this.name = JDBCUtils.safeGetString(resultSet, "name");
    @Property(viewable = false, editable = true, order = 10)
        JDBCResultSet dbResult)
        return sequenceCache.getAllObjects(monitor, this);
            if (refSchema == null) {
            StringBuilder sql = new StringBuilder();
            }
        sql.append(";\n");
    }
    }
            }
            } else {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
                    .append("WHERE t.object_id = te.object_id FOR XML PATH ('')), 2, 1000)");
            monitor.done();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        if (!monitor.isCanceled()) {
                    while (dbResult.next()) {
    }
    }
    }
                .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "all_objects")).append(" t\n");
            sql.append("\nORDER BY i.object_id,i.index_id,ic.key_ordinal");
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema schema) throws SQLException {

            sql.append("\nORDER BY fkc.constraint_object_id, fkc.constraint_column_id");
        return tableCache.getTypedObjects(monitor, this, SQLServerExternalTable.class);
    }
                DBSEntityConstraintType cType = "PK".equals(type) ? DBSEntityConstraintType.PRIMARY_KEY : DBSEntityConstraintType.UNIQUE_KEY;
                getDatabase(),
            }
        }
            boolean isSystemNamed = JDBCUtils.safeGetInt(resultSet, "is_system_named") != 0;
        }
        }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
                    if (table instanceof SQLServerTable && !((SQLServerTable) table).hasStatistics()) {

                }

            return new SQLServerProcedure(schema, resultSet);
                if (owner.getDatabase().isTempDatabase()) {
        return indexCache;
                dbStat.setLong(1, forObject.getObjectId());
    }
        protected SQLServerTableBase fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @NotNull JDBCResultSet dbResult) {
                .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "sequences")).append(" s\n");
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

import java.util.List;
            }
    }
                dbStat.setLong(1, schema.getObjectId());
    @Association
    }
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        tableCache.clearCache();

        @Nullable
    }
    public long getObjectId() {

                    break;
    }
    @Association
        {
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
                sql.append("p.object_id = ?");

    }
                    .append("\n");
            return getDataSource().getLocalDataTypes();

    }

        return database;
        @Override
            SQLServerTableColumn refColumn = refTable.getAttribute(monitor, JDBCUtils.safeGetLong(dbResult, "referenced_column_id"));
            tableCache.getAllObjects(monitor, this);
            }
    @Nullable
    @Override
        return null;
    class ForeignKeyCache extends JDBCCompositeCache<SQLServerSchema, SQLServerTableBase, SQLServerTableForeignKey, SQLServerTableForeignKeyColumn> {
        if ((scope & STRUCT_ASSOCIATIONS) == STRUCT_ASSOCIATIONS) {
    }
            StringBuilder sql = new StringBuilder(500);

            SQLServerTableColumn tableColumn = columnId == 0 ? null : parent.getAttribute(session.getProgressMonitor(), columnId);
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "foreign_key_columns")).append(" fkc, ")
        return procedureCache.getAllObjects(monitor, this);
                    indexType = SQLServerConstants.INDEX_TYPE_HEAP;
            if (forObject == null) {
                        String tableName = dbResult.getString("name");
            StringBuilder sql = new StringBuilder(500);

        }
            if (object != null || objectName != null) {

        if (hasTableStatistics && !forceRefresh) {
        JDBCResultSet dbResult)
            throws SQLException, DBException

                log.debug("Ref index " + refIndexId + " not found in table " + refTable.getFullyQualifiedName(DBPEvaluationContext.UI));
                        hasCond = true;
    @Association
    static class SequenceCache extends JDBCObjectCache<SQLServerSchema, SQLServerSequence> {
        @NotNull
        sql.append("-- DROP SCHEMA ").append(DBUtils.getQuotedIdentifier(this)).append(";\n\n");
            setListOrderComparator(DBUtils.nameComparator());
    public ProcedureCache getProcedureCache() {
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
    @Override
package org.jkiss.dbeaver.ext.mssql.model;
                }
                dbStat.setLong(1, owner.getObjectId());
            throws DBException
        return triggerCache;
                || indexTypeNum == INDEX_TYPE_NONCLUSTERED_COLUMNSTORE;

            tableCache.getChildren(monitor, this, null);
        {
        @Nullable

        String indexName, @NotNull
            DBSForeignKeyModifyRule deleteRule = SQLServerUtils.getForeignKeyModifyRule(JDBCUtils.safeGetInt(dbResult, "delete_referential_action"));
                log.debug("Trigger owner " + tableId + " not found");
        return tableCache;
                if (table.getObjectId() == tableId && table.supportsTriggers()) {
        JDBCResultSet resultSet) throws SQLException, DBException {
        return null;
import org.jkiss.dbeaver.Log;
        }
                getDataSource(),
            if (forParent != null) {
        @Nullable
        return synonymCache;
            }
    }
    @NotNull
        @Override
            return dbStat;
    public Collection<SQLServerTable> getTables(DBRProgressMonitor monitor) throws DBException {
            SQLServerTableBase refTable = object.getReferencedTable();
            StringBuilder sql = new StringBuilder();
                    if (originalName != null) {
                }
                    return table;
                    break;
        {
            throws SQLException
    }
                    }
            super(tableCache, SQLServerTableBase.class, "table_name", "name");
            String fkName = JDBCUtils.safeGetString(dbResult, "name");
 * DBeaver - Universal Database Manager
        @NotNull
        }
            @NotNull JDBCSession session,
    private ForeignKeyCache foreignKeyCache = new ForeignKeyCache();
            };
            if (forParent == null) {
        @Override
        return this;
            @NotNull JDBCResultSet dbResult)

            for (SQLServerTableTemp table : tableCache.getTypedObjects(monitor, this, SQLServerTableTemp.class)) {
                object,
    }
            sql.append(
            return session.prepareStatement(sql.toString());
                case INDEX_TYPE_CLUSTERED_COLUMNSTORE:
                default:

    //////////////////////////////////////////////////
    }
                return null;

        {
        @Override
            } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private String description;
        private static final int INDEX_TYPE_NONCLUSTERED_HASH = 7;

        }
                sql.append(", COLUMNPROPERTY(c.object_id, c.name, 'charmaxlen') as char_max_length");
        }
    private UniqueConstraintCache uniqueConstraintCache = new UniqueConstraintCache(tableCache);
                "\nFROM " + SQLServerUtils.getSystemTableName(schema.getDatabase(), "all_objects") + " p" +
            sql.append("SELECT o.*,ep.value as description");
        for (SQLServerTableBase table : getTables(monitor)) {
        @NotNull
            sql.append("SELECT t.name as table_name,fk.name,fk.key_index_id,fk.is_disabled,fk.delete_referential_action,fk.update_referential_action," +
public class SQLServerSchema implements DBSSchema, DBPSaveableObject, DBPQualifiedObject, DBPRefreshableObject, DBPSystemObject, SQLServerObject, DBSProcedureContainer, DBSObjectWithScript, DBPObjectStatisticsCollector {
                    .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "trigger_events")).append(" te ")
        private static final int INDEX_TYPE_CLUSTERED_ROWSTORE = 1;
    // Procedures
                    indexType = SQLServerConstants.INDEX_TYPE_NON_CLUSTERED;
        }
                    boolean hasCond = false;
            SQLServerTableIndex index = refTable.getIndex(monitor, refIndexId);
    @Override
            throw new DBCException("Error reading table statistics", e);

                return null;
        sql.append("CREATE SCHEMA ").append(DBUtils.getQuotedIdentifier(this));
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "index_columns")).append(" ic, ")
            throws SQLException, DBException
        protected SQLServerSynonym fetchObject(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                new SQLServerTableIndexColumn(object, indexColumnId, tableColumn, ordinal, ascending, included)
    private SequenceCache sequenceCache = new SequenceCache();
                .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "synonyms")).append(" s\n");
    public IndexCache getIndexCache() {
                case INDEX_TYPE_NONCLUSTERED_ROWSTORE:
            JDBCPreparedStatement dbStat = session.prepareStatement(sql);
            } else {
            long indexColumnId = JDBCUtils.safeGetInt(dbResult, "index_column_id");
     * Constraint cache implementation
        }

                null,
        }
        {
    @Association
    @Override

import org.jkiss.dbeaver.model.meta.PropertyLength;
                true);
            switch (indexTypeNum) {
                sql.append("t.*, SUBSTRING((SELECT ', ' + te.type_desc AS [text()] FROM ")
            StringBuilder sql = new StringBuilder(500);
            } else {
    public Collection<SQLServerTableType> getTablesTypes(DBRProgressMonitor monitor) throws DBException {
            return dbStat;
        log.debug("Table '" + tableId + "' not found in schema " + getName());
        {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                sql.append("t.*, ''");
        @Override
        }
    public SQLServerDatabase getDatabase() {
            SQLServerDataSource dataSource = owner.getDataSource();
        private static final int INDEX_TYPE_XML = 3;
    @Override
        return hasTableStatistics;
                log.debug("Ref table " + refTableId + " not found in schema " + refSchema.getName());
                return tt;
            if (table == null) {
            DBSIndexType indexType;
        @Override


        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @Nullable

            } else {
            dbStat.setLong(1, schema.getObjectId());
        if ((scope & STRUCT_ENTITIES) == STRUCT_ENTITIES) {
        return foreignKeyCache;
    @Override

            )) {
                "\nLEFT OUTER JOIN " + SQLServerUtils.getExtendedPropsTableName(schema.getDatabase()) + " ep ON ep.class=" + SQLServerObjectClass.OBJECT_OR_COLUMN.getClassId() + " AND ep.major_id=p.object_id AND ep.minor_id=0 AND ep.name='" + SQLServerConstants.PROP_MS_DESCRIPTION + "'" +
 * You may obtain a copy of the License at
    // Synonyms

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "indexes")).append(" i, ")
        return
                .append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "foreign_keys")).append(" fk,")
            }
            return new SQLServerTableForeignKeyColumn[] { new SQLServerTableForeignKeyColumn(
        {
            if (owner.getDataSource().supportsColumnProperty()) {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull SQLServerSchema schema, @Nullable SQLServerTableTrigger object, @Nullable String objectName) throws SQLException {
            StringBuilder sql = new StringBuilder(500);
        SQLServerTableBase object = tableCache.getObject(monitor, this, childName);
        }
            if (forParent != null) {

        if (SQLServerUtils.isDriverBabelfish(getDataSource().getContainer().getDriver())) {
            }
            long tableId = JDBCUtils.safeGetLong(resultSet, "parent_id");
            }
    public List<SQLServerObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
            return dbStat;
    public TriggerCache getTriggerCache() {
        @Override

            return new SQLServerSequence(schema,
import org.jkiss.dbeaver.model.sql.SQLUtils;
                    for (String incName : CommonUtils.safeCollection(tableFilters.getExclude())) {

        // tempdb tables have special naming convention. See SQLServerUtils.stripTempdbTableName
            sql.append("\nORDER BY s.name");
                sql.append(" AND t.name=?");
            @NotNull SQLServerTableBase parent,
            sql.append("WHERE kc.parent_object_id=t.object_id AND kc.schema_id=?");
    }
            boolean isColumnstoreIndex = indexTypeNum == INDEX_TYPE_CLUSTERED_COLUMNSTORE
        @Override
            foreignKeyCache.getAllObjects(monitor, this);
            if (forTable != null) {

        @Override
        }
                return new SQLServerView(owner, dbResult, name);
            return new SQLServerSynonym(schema,
    }
            else if (dataSource.isServerVersionAtLeast(14, 0)) {
            super(tableCache, SQLServerTableBase.class, "table_name", "name");


            String name = JDBCUtils.safeGetString(resultSet, "name");
 * Licensed under the Apache License, Version 2.0 (the "License");
    //////////////////////////////////////////////////
        return description;

    public DBSObject getParentObject() {
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
            if (fkColumn == null || refColumn == null) {
            return dbStat;
    }

            boolean ascending = JDBCUtils.safeGetInt(dbResult, "is_descending_key") == 0;
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    public boolean isSystem() {
            return dbStat;
                fkColumn,
    public SQLServerSynonym getSynonym(DBRProgressMonitor monitor, String name) throws DBException {
        private SQLServerTableBase getTableWithTriggerSupport(DBRProgressMonitor monitor, long tableId) throws DBException {
import java.util.Map;
        @NotNull
        if (SQLServerConstants.SQL_SERVER_SYSTEM_SCHEMA.equals(getName())) {
    @Nullable
                .append("\nJOIN ").append(SQLServerUtils.getSystemTableName(owner.getDatabase(), "all_objects")).append(" t ON t.object_id=c.object_id")
        this.description = description;
            if (forTable != null) {
    public Collection<SQLServerTableTrigger> getTriggers(DBRProgressMonitor monitor) throws DBException {
            name.equalsIgnoreCase(SQLServerConstants.SQL_SERVER_SYSTEM_SCHEMA) ||


        {
        }
                    indexType = DBSIndexType.OTHER;
            this.schemaId = JDBCUtils.safeGetLong(resultSet, "uid");
    public SQLServerProcedure getProcedure(DBRProgressMonitor monitor, String name) throws DBException {
            dbStat.setLong(1, schema.getObjectId());
            StringBuilder sql = new StringBuilder();

            @NotNull JDBCResultSet dbResult)
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
                sql.append("t.object_id=?");
            } else {
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
    @Association
            if (forObject == null) {
                            ((SQLServerTable) table).fetchTableStats(dbResult);

                    }

        return sql.toString();
                CommonUtils.toLong(JDBCUtils.safeGetObject(resultSet, "current_value")),
    public SQLServerTableType getTableType(@NotNull DBRProgressMonitor monitor, long tableId) throws DBException {
        }
    }
    @Override
    public SQLServerTable getTable(DBRProgressMonitor monitor, long tableId) throws DBException {
    /**
        {
        List<SQLServerObject> result = new ArrayList<>();
                CommonUtils.toLong(JDBCUtils.safeGetObject(resultSet, "minimum_value")),

        uniqueConstraintCache.clearCache();

    // Indexes
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
    @Override
                case INDEX_TYPE_NONCLUSTERED_COLUMNSTORE:
                log.debug("Ref schema " + refSchemaId + " not found");

            }
        }
    private String name;
import org.jkiss.dbeaver.model.meta.Association;
* SQL Server schema
            long indexId = JDBCUtils.safeGetLong(resultSet, "unique_index_id");
        result.addAll(tableCache.getAllObjects(monitor, this));
            }

    }
    public List<SQLServerTableIndex> getIndexes(DBRProgressMonitor monitor) throws DBException {
            return new SQLServerTableForeignKey(parent, fkName, null, refConstraint, deleteRule, updateRule, true);
            }
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
        }
        protected SQLServerTableColumn fetchChild(@NotNull JDBCSession session, @NotNull SQLServerSchema owner, @NotNull SQLServerTableBase table, @NotNull JDBCResultSet dbResult)
            if (forTable != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                session,
        this.database = database;
        }

        hasTableStatistics = false;
                    .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "triggers")).append(" t,")
                dbStat.setString(2, object != null ? object.getName() : objectName);

    @NotNull
            return new SQLServerTableIndexColumn[0];//forObject.getIndex().getAttributeReferences(session.getProgressMonitor()).toArray(new SQLServerTableIndexColumn[0]);
        SQLServerTableBase table, @NotNull String childName, @NotNull

        List<SQLServerTableIndex> allIndexes = new ArrayList<>();
            DBStructUtils.generateTableListDDL(monitor, sql, tablesOrViews, options, false);
                dbStat.setLong(1, forTable.getObjectId());
                sql.append(",t.is_external");
                case INDEX_TYPE_CLUSTERED_ROWSTORE:
                    .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "all_objects")).append(" o")
                return new SQLServerTable(owner, dbResult, name);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
 *

            }
            super("proc_name");
                case INDEX_TYPE_NONCLUSTERED_HASH:
        }
    @Association
        @NotNull
    }
                    refConstraint = refPK;
        for (SQLServerTableBase table : tableCache.getAllObjects(monitor, this)) {
            return;


    //////////////////////////////////////////////////
        }
        if (!SQLServerUtils.supportsCrossDatabaseQueries(getDataSource())) {
                JDBCUtils.safeGetString(resultSet, "name"),
        @Override
                .append("\nWHERE p.type IN ('P','PC','X','TF','FN','IF') AND p.object_id = pp.object_id AND ");
        this.persisted = true;
        }
        @Override

                case INDEX_TYPE_SPATIAL:
                }

                    .append(SQLServerUtils.getSystemTableName(schema.getDatabase(), "trigger_events")).append(" te ")
        protected SQLServerTableIndexColumn[] fetchObjectRow(@NotNull JDBCSession session, @NotNull SQLServerTableBase table, @NotNull
                sql.append(" AND t.object_id=?");
            return new SQLServerTableColumn(session.getProgressMonitor(), table, dbResult);
import org.jkiss.code.NotNull;
    class TriggerCache extends JDBCObjectLookupCache<SQLServerSchema, SQLServerTableTrigger> {
    public void setDescription(String description) {
        @Override
            sql.append("SELECT s.* FROM \n")
                "fkc.*,tr.schema_id referenced_schema_id\nFROM ")
            }
                .append("\nWHERE ");
    }
            try (JDBCPreparedStatement dbStat = SQLServerUtils.prepareTableStatisticLoadStatement(
                sql.append("p.schema_id = ?");
            sql.append(", dc.definition as default_definition,dc.name as default_constraint_name,ep.value as description\nFROM ")
                JDBCUtils.safeGetLong(resultSet, "object_id"),
        @Override
            final SQLServerDataSource dataSource = schema.getDataSource();
            String sql = "SELECT p.*,ep.value as description" +
                if (refPK.getIndex() == index) {
        @Override
            dbStat.setLong(1, schema.getObjectId());
            name.equalsIgnoreCase(SQLServerConstants.INFORMATION_SCHEMA_SCHEMA);
        } catch (SQLException e) {
            if (owner.getDataSource().supportsExternalTables(session)) {
        } finally {
        return tableCache.getTypedObjects(monitor, this, SQLServerView.class);
            if (index == null) {
                        return new SQLServerTableTemp(owner, dbResult, name, originalName);
        JDBCResultSet resultSet) throws SQLException, DBException {
            DBSEntityConstraint refConstraint = index;
 * limitations under the License.
            }
            throws SQLException, DBException
            }
            if (object != null || objectName != null) {

    @Override
    // Data types
                dbStat.setLong(1, forTable.getObjectId());
    public static class TableCache extends JDBCStructLookupCache<SQLServerSchema, SQLServerTableBase, SQLServerTableColumn> {
    SQLServerSchema(SQLServerDatabase database, JDBCResultSet resultSet) {
            return new SQLServerTableTrigger(table, resultSet);
