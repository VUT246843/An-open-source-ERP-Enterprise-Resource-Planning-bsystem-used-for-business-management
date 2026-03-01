    }
        @NotNull
        return PostgreTableRegular.class;
                            log.warn("Can't find parent table's schema '" + parentSchemaId + "'");
                            log.debug("Can't read schema default permissions for " + getName());
                dbStat.setLong(1, PostgreSchema.this.getObjectId());
    public long getObjectId() {
    @Property(viewable = true, order = 1)
        }
                    "            select\n" +
 * limitations under the License.
            return null;
        }
                    cols[i] = cCol;
    @Association
                        PostgreTableBase table = getTable(monitor, tableId);
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    public Collection<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBException {
    PostgreObject,
        return getTableCache().getTypedObjects(monitor, this, PostgreView.class);
    }
    public PostgreSequence getSequence(DBRProgressMonitor monitor, String name) throws DBException {
        if (indexCache == null) {
        return name;
                .append("LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=c.oid AND d.objsubid=0 AND d.classoid='pg_class'::regclass\n");
    }
    public void setObjectDefinitionText(String sourceText) throws DBException {

            try {
                dbStat.setLong(1, container.getSchema().getObjectId());
                case "x":

    protected volatile boolean hasStatistics;
        @Nullable
                        }

        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    }

        for (PostgreClass table : getTableCache().getAllObjects(monitor, this)) {
    public List<PostgreMaterializedView> getMaterializedViews(DBRProgressMonitor monitor) throws DBException {
    }
        throws DBException {

    public PostgreProcedure getProcedure(DBRProgressMonitor monitor, long oid) throws DBException {
    @Override
            @NotNull JDBCResultSet dbResult
    @NotNull
    protected TableCache createTableCache() {
                    return null;
        PostgreSchema pgCatalogSchema = this.database.getSchema(monitor, PostgreConstants.CATALOG_SCHEMA_NAME);
                    return new PostgreTableForeignKey(table, name, resultSet);
                name.startsWith(PostgreConstants.SYSTEM_SCHEMA_PREFIX);
        return indexCache;

            }
            return dbStat;
                if (attr == null) {
        if (indexCache != null) {
            StringBuilder sql = new StringBuilder();
    @Nullable
    }
                    attrExpression,
    @Override
                    "          from\n" +
            if (getDataSource().getServerType().supportsInheritance()) {
            JDBCPreparedStatement dbStat = session.prepareStatement(
        return getTableCache().getTypedObjects(monitor, this, PostgreSequence.class);
    protected long ownerId;
            super(getTableCache(), PostgreTableBase.class, "tabrelname", "conname");
    }
    }
                .thenComparing(DBSTypedObject::getTypeName))
                Collection<? extends PostgreTableColumn> attributes = table.getAttributes(monitor);
        if (!getDataSource().getServerType().supportsTableStatistics() || hasStatistics && !forceRefresh) {
        return schema.startsWith(PostgreConstants.TOAST_SCHEMA_PREFIX) ||
    }
 * PostgreSchema
        }
        PostgreSchema publicSchema = this.database.getSchema(monitor, PostgreConstants.PUBLIC_SCHEMA_NAME);
                dbStat.setLong(1, getObjectId());
    }
    @Association
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        return getProceduresCache().getObject(monitor, this, procName);
    public DBSNamespace getNamespaceForObjectType(@NotNull DBSObjectType objectType) {
            } catch (DBException e) {
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
                // We can't rely on pg_am flags anymore because they awere removed in 9.6+
            isCatalogSchema() ||
        sql.append(";\n");
        ) throws SQLException {

                    i,
    @Override
            } else {
            index.setColumns(rows);
    DBSNamespaceContainer,
        }
    DBSSchema,
            monitor.subTask("Cache constraints");
                        log.warn("Bad index attribute index: " + colNumber);
            @NotNull JDBCSession session,
                        continue;
        if (getDataSource().supportsReadingKeysWithColumns()) {
    }
                }
        if (defaultPrivileges == null) {
                sql.append(",pg_catalog.pg_get_expr(c.relpartbound, c.oid) as partition_expr,  pg_catalog.pg_get_partkeydef(c.oid) as partition_key ");
            );
                        if (parentTable == null) {
            @NotNull PostgreTableConstraintBase<?> constraint,
                    break;
    }
import java.util.stream.Collectors;
            return dbStat;
                PostgreIndexColumn col = new PostgreIndexColumn(
                session.getProgressMonitor(),
        this.description = JDBCUtils.safeGetString(dbResult, "description");
                    " left join  (\n" +
                    if (attr == null) {
                    (versionAtLeast7 ? " and d.classoid='pg_proc'::regclass " : "") + // to avoid objects duplication
    }
    }
            .collect(Collectors.toCollection(ArrayList::new));
                            }

    public String toString() {

            }
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
/*
                    WHERE s.nspname =?"""))
                    "\nWHERE p.pronamespace=?" +
        public ProceduresCache() {

                        PostgreSchema parentSchema = getDatabase().getSchema(monitor, parentSchemaId);
    private final ProceduresCache proceduresCache;
            if (forParent == null) {
            monitor.subTask("Cache indexes");
                    continue;
    }
        extensionCache.clearCache();
    public List<? extends PostgreTable> getForeignTables(DBRProgressMonitor monitor) throws DBException {
                    "\nWHERE ");
        }
                        attrExpression = JDBCUtils.queryString(session, "select pg_catalog.pg_get_indexdef(?, ?, true)", object.getObjectId(), i + 1);
            getTableCache().loadChildren(monitor, this, null);
        return extensionCache.getAllObjects(monitor, this);
        }
    public List<PostgreProcedure> getProcedures(DBRProgressMonitor monitor) throws DBException {
    }
                    (object != null || objectName == null ? "" : " AND p." + nameColumn + "=?") +

    @Override
                    }
        throws DBException {
import java.sql.ResultSet;
                    "                join    pg_class cls on cls.oid = c.oid \n" +
            dbStat.setLong(1, PostgreSchema.this.getObjectId());
            @NotNull JDBCResultSet dbResult
                int options = keyOptions == null || keyOptions.length < keyNumbers.length ? 0 : keyOptions[i];
            return null;
import java.sql.SQLException;
        @Override
        protected ConstraintCache() {
                    " e.oid,\n" +
                    break;
     */
            PostgreDataSource dataSource = getDataSource();
    //@Property(viewable = false, order = 2)
                }
            throws SQLException, DBException {
                    getTableColumnsQueryExtraParameters(container.getSchema(), forTable) +
                    if (table instanceof PostgreTable pgTable) {
    @Override

            Collection<PostgreDataType> dataTypes = getDataTypes(monitor);
                        if (CommonUtils.isEmpty(objectType)) {
        } catch (Exception e) {
                    WHERE rc.oid=i.inhrelid AND rc.relnamespace=? AND pc.oid=i.inhparent""")) {
                        ", case when c.contype='c' then \"substring\"(pg_get_constraintdef(c.oid), 7) else null end consrc_copy") +
    class ExtensionCache extends JDBCObjectCache<PostgreSchema, PostgreExtension> {
    @NotNull
            @NotNull JDBCResultSet dbResult
                PostgreTableForeignKeyColumn[] fkCols = new PostgreTableForeignKeyColumn[colCount];

                    from pg_catalog.pg_namespace s
        return this;
                        addDDLLine(sql, tableOrView.getObjectDefinitionText(monitor, options));
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull PostgreIndex index, @NotNull List<PostgreIndexColumn> rows) {
            @NotNull PostgreTableBase table,
            return;
        if (publicSchema != null) {
            // Read constraints with columns
        if (indexCache == null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        protected PostgreExtension fetchObject(@NotNull JDBCSession session, @NotNull PostgreSchema owner, @NotNull JDBCResultSet dbResult)
        return this.proceduresCache;
    }
                    break;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
    }
    public PostgreTableBase getTable(DBRProgressMonitor monitor, long tableId) throws DBException {

            @Nullable PostgreProcedure object,
                    "\nORDER BY a.attnum");
            return new PostgreNamespace(this);
    public void setPersisted(boolean persisted) {
                            continue;
                sql.append(" i.indrelid=?");
            if (table.getObjectId() == tableId) {
        if (pgCatalogSchema != null) {
import org.jkiss.dbeaver.model.meta.Association;
                    isAscending,
        throws DBException {
    }
        }


    public class TableCache extends JDBCStructLookupCache<PostgreTableContainer, PostgreTableBase, PostgreTableColumn> {


                dbStat.setLong(2, object.getObjectId());
        return new TableCache();
                long colNumber = keyNumbers[i];
    /**
        return this.oid;
import org.jkiss.dbeaver.model.struct.*;
            if (type == null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.ownerId = owner == null ? 0 : owner.getObjectId();
            return dbStat;
    }
            if (getDataSource().getServerType().supportsRelationSizeCalc()) {
                    SELECT i.inhrelid relid, pc.relnamespace parent_ns, pc.oid parent_oid, i.inhseqno
    public List<PostgreIndex> getIndexes(@NotNull DBRProgressMonitor monitor, @Nullable PostgreTableBase parent) throws DBException {
    @Override
                        oid = dbResult.getLong(1);
                table.resetSuperInheritance();
    @Override
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
        return null;
        @Override
    public PostgreDatabase getParentObject() {
                    constraintType = DBSEntityConstraintType.CHECK;
        protected JDBCStatement prepareObjectsStatement(
            dbStat.setLong(1, getObjectId());
            }
    private final PostgreDatabase database;

            monitor.beginTask("Cache schema", 1);
    }
    @NotNull
            @Nullable PostgreTableBase forParent
import org.jkiss.dbeaver.model.exec.DBCException;
    }
        if ((scope & STRUCT_ASSOCIATIONS) != 0) {
    }

                DBStructUtils.generateTableListDDL(new SubTaskProgressMonitor(monitor), sql, allTables, new HashMap<>(options), false);
        @Nullable
            @NotNull PostgreTableBase table,
            long[] keyNumbers = PostgreUtils.getIdVector(JDBCUtils.safeGetObject(dbResult, "keys"), getDataSource());
            if (forTable != null) {

        return aggregateCache.getAllObjects(monitor, this);
/*
    public void setDescription(String description) {
                            ((PostgreTableReal) table).fetchStatistics(dbResult);
    @Override
        }
import org.jkiss.dbeaver.DBException;

            if (object != null) {
        return null;
                // No nullify all other tables inheritance
            object.cacheAttributes(monitor, children, false);
            } catch (SQLException e) {

    }
            if (!monitor.isCanceled()) {
        this(database, name);
        protected PostgreIndexColumn[] fetchObjectRow(
        return dataTypeCache;
        protected PostgreTableColumn fetchChild(
    }
            }
        if (owner != null) {
    public PostgreDataSource getDataSource() {
            PostgreAccessMethod accessMethod = object.getAccessMethod(session.getProgressMonitor());
        return result;
                """
        this.hasStatistics = false;
            long[] indColClasses = PostgreUtils.getIdVector(JDBCUtils.safeGetObject(dbResult, "indclass"), getDataSource());
    }
                    "         ) cfg on cfg.oid_ext = e.oid\n" +
                    (supportsSequences ? "\nLEFT OUTER JOIN pg_depend dep on dep.refobjid = a.attrelid AND dep.deptype = 'i' " +
    }
        final ArrayList<? extends PostgreTable> tables = getTableCache().getTypedObjects(monitor, this, PostgreTable.class)
                }
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
                        if (acl == null) {
            }
                "SELECT c.relname,a.*,pg_catalog.pg_get_expr(ad.adbin, ad.adrelid, true) as def_value,dsc.description" +


            String name = JDBCUtils.safeGetString(resultSet, "conname");
            @NotNull PostgreTableContainer container,
                sql.append("t.relnamespace=?");
        try (JDBCSession session = DBUtils.openUtilSession(monitor, this, "Read schema id")) {
        @Override
                Collection<PostgreProcedure> procedures = getProcedures(monitor);
    @Nullable
                    // Skipp table types and arrays
                dbStat.setLong(1, PostgreSchema.this.getObjectId());
            } else {
                    "                join pg_namespace ns on ns.oid = cls.relnamespace\n" +
                }
        this.description = description;
                    }
        PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
            defaultPrivileges = new ArrayList<>();
            }
            }
                    PostgreTableForeignKeyColumn cCol = new PostgreTableForeignKeyColumn(foreignKey, attr, i, refAttr);
                    " join pg_namespace n on n.oid =e.extnamespace\n" +
                    "                pg_catalog.pg_extension e1 ) c \n" +

        ) throws SQLException, DBException {
                    constraintType = DBSEntityConstraintType.PRIMARY_KEY;
    }
                    "            from\n" +
            @NotNull PostgreTableBase parent,
                String attrExpression = null;
            @Nullable PostgreTableBase forTable
    @Override
        protected JDBCStatement prepareObjectsStatement(
        }
                .append(" IS ").append(SQLUtils.quoteString(this, getDescription()));
            @NotNull JDBCSession session,

        this.persisted = true;
                    select c.oid,pg_catalog.pg_total_relation_size(c.oid) as total_rel_size,pg_catalog.pg_relation_size(c.oid) as rel_size
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                log.error("Can't read default privileges for schema " + getName());

            @NotNull JDBCSession session,
            );
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            DBSEntityConstraintType constraintType;

    @Nullable
                    INNER JOIN pg_catalog.pg_class c ON c.oid=i.indexrelid
        protected PostgreAggregate fetchObject(
        @Override

    DBPNamedObject2,
            }
    protected String getTableColumnsQueryExtraParameters(PostgreTableContainer owner, PostgreTableBase forTable) {

                } catch (DBException e) {
                    if (monitor.isCanceled()) {
        return DBPScriptObject.OPTION_INCLUDE_PERMISSIONS.equals(option) || DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option)
    }
        @NotNull
            if (index.getObjectId() == indexId) {
            return new PostgreProcedure(session.getProgressMonitor(), owner, dbResult);
                parent,
    @Association
    @Override
        protected TableCache() {
        @Override
        public JDBCStatement prepareLookupStatement(
                    constraintType = DBSEntityConstraintType.UNIQUE_KEY;
                "SELECT * FROM pg_default_acl WHERE defaclnamespace = ?")) {
     * Index cache implementation
                        continue;
        @NotNull
            if (table.isPartition()) {
                for (PostgreProcedure procedure : procedures) {
        throws SQLException {
    }
        return new ConstraintCache();
            @NotNull JDBCResultSet resultSet
            Collection<? extends PostgreTableColumn> attributes = parent.getAttributes(dbResult.getSession().getProgressMonitor());
                    }
                    "FROM \n" +
/**


                int refColCount = keyRefNumbers.length;
                    if (dbResult.next()) {
            monitor.subTask("Cache table columns");
            @NotNull PostgreTableConstraintBase<?> object,
            super(getTableCache(), PostgreTableBase.class, "tabrelname", "relname");
                    \sFROM pg_catalog.pg_index i
    }
        return isUtilitySchema(name);
                        }
    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

                Collection<? extends PostgreTableColumn> refAttributes = refTable.getAttributes(monitor);
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
                addDDLLine(sql, dataType.getObjectDefinitionText(monitor, options));
            indexCache.clearCache();
                monitor.done();
            String nameColumn = "proname";
            @NotNull JDBCSession session,


                    while (dbResult.next()) {

                    monitor.subTask(procedure.getName());
                try {
            .collect(Collectors.toList());
                        // It's ok, function index or something

    protected ProceduresCache createProceduresCache() {

import org.jkiss.dbeaver.model.runtime.SubTaskProgressMonitor;


        StringBuilder sql = new StringBuilder();
    public DBSNamespace[] getAllNamespaces() {
            @NotNull JDBCSession session,
    }
    public void setOwner(PostgreRole role) {
        }
                dbStat.setLong(1, getObjectId());
    @Association
            final DBRProgressMonitor monitor = resultSet.getSession().getProgressMonitor();
    @NotNull
                                      && isPartitionTableRow(dbResult)
            
                dbStat.setString(2, object != null ? object.getName() : objectName);
                    FROM pg_catalog.pg_aggregate a,pg_catalog.pg_proc p
                            PostgreUtils.extractPermissionsFromACL(session.getProgressMonitor(), this, acl, true);
            }

        }
            sql.append("SELECT c.oid,c.*,d.description");
                sql.append(",pg_catalog.pg_relation_size(i.indexrelid) as index_rel_size");
        postgrePrivileges.addAll(defaultPrivileges);
            String type = JDBCUtils.safeGetString(resultSet, "contype");
            }
        }
    }

                    }
        return schema;
            setListOrderComparator(DBUtils.nameComparator());
        return database.getDataSource();
                return null;
    private Object schemaAcl;

        database.cacheDataTypes(monitor, true);
        protected PostgreTableConstraintBase<?> fetchObject(
    }

                    }
                        allTables.add(tableOrView);
    }
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            //return new PostgreExtension(owner, dbResult);
        this(database, name);
 * Unless required by applicable law or agreed to in writing, software
                        }
            @Nullable PostgreTableBase object,
    }
            final JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "nspowner");
                    log.warn("Unsupported PG constraint type: " + type);

    public boolean isUtility() {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreSchema owner) throws SQLException {
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
                monitor.subTask("Cache inheritance");
                    } else {
            }
            }
        return getTableCache().getObject(monitor, this, name, PostgreSequence.class);

            if (indexCache != null) {
        }
    public PostgreMaterializedView getMaterializedView(DBRProgressMonitor monitor, String name) throws DBException {
                        }
        }
                throw new DBCException(e, session.getExecutionContext());
    @NotNull
    }

    public void readSchemaInfo(DBRProgressMonitor monitor) {
}
        indexCache = database.getDataSource().getServerType().supportsIndexes() ? new IndexCache() : null;
        @Nullable
            Collection<PostgreExtension> extensions = getExtensions(monitor);
    DBSVisibilityScopeProvider
        @Override
                    (supportsSequences ? ",dep.objid" : "") +
            try {
                addDDLLine(sql, ext.getObjectDefinitionText(monitor, options));
    }
                    "\nLEFT OUTER JOIN pg_catalog.pg_attrdef ad ON (a.attrelid=ad.adrelid AND a.attnum = ad.adnum)" +
        ) throws SQLException, DBException {
            }
                case "p":
    public PostgreProcedure getProcedure(DBRProgressMonitor monitor, String procName) throws DBException {
        this.name = newName;
        return hasStatistics || !getDataSource().getServerType().supportsTableStatistics();
        this.schemaAcl = JDBCUtils.safeGetObject(dbResult, "nspacl");
            return container.getDataSource().getServerType().createRelationOfClass(PostgreSchema.this, kind, dbResult);
            sql.append(
            constraintCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    "\nLEFT OUTER JOIN pg_catalog.pg_description dsc ON (c.oid=dsc.objoid AND a.attnum = dsc.objsubid)" +
            @NotNull JDBCSession session,
        }
                final PostgreAttribute attr = PostgreUtils.getAttributeByNum(attributes, (int) colNumber);
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (defaultPrivileges == null) {
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
    private final ExtensionCache extensionCache;

                    if (colNumber == 0 && expr != null) {
        ) throws SQLException {
            @NotNull JDBCSession session,

                assert attributes != null;
                        }
    @NotNull
        if (!CommonUtils.isEmpty(ddl)) {
     * Procedures cache implementation
    }
                }
    PostgreSchema(PostgreDatabase database, String name) {
                log.warn("Error reading attribute info", e);
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
        return getTableCache().getObject(monitor, this, childName);
    //@Property
    @Override
    DBPRefreshableObject,
import org.jkiss.dbeaver.model.*;
                    fkCols[i] = cCol;
            @NotNull List<PostgreTableConstraintColumn> children
                    LEFT OUTER JOIN pg_catalog.pg_description dsc ON i.indexrelid=dsc.objoid
                            continue;
                Collection<? extends PostgreTableColumn> attributes = table.getAttributes(monitor);
    public String getDescription() {
            switch (type) {
                dbResult);
        @Override


        if (PostgreNamespace.supportsObjectType(objectType)) {
    public PostgreDataTypeCache getDataTypeCache() {
    @Association
            );
                monitor.done();
    public ProceduresCache getProceduresCache() {
        return getTableCache().getTypedObjects(monitor, this, PostgreMaterializedView.class);
                        final long tableId = JDBCUtils.safeGetLong(dbResult, "relid");

            }
            sql.append(";\n");
                result[i] = col;
            @NotNull JDBCSession session,
            if (keyNumbers == null) {

                return table.createTableColumn(session.getProgressMonitor(), PostgreSchema.this, dbResult);
                    colOpClass,
        defaultPrivileges = null;
        }
import java.lang.reflect.Array;
                case "t":
            constraintCache.getAllObjects(monitor, this);
    @Association
        protected PostgreIndex fetchObject(

        throws SQLException
    }
                    "\nFROM pg_catalog.pg_constraint c" +
                if (!readAllTypes && (dataType.hasAttributes() || dataType.isArray())) {
                sql.append(" c.relnamespace=?");
        @Override

            }
 *
                            int seqNum = JDBCUtils.safeGetInt(dbResult, "inhseqno");
        protected PostgreTableConstraintColumn[] fetchObjectRow(
    public String getName() {
            boolean supportsSequences = container.getDataSource().getServerType().supportsSequences();
                dbStat.setString(2, objectName);
                    short colNumber = keyNumbers[i].shortValue(); // Column number - 1-based
            table.resetSuperInheritance();
    }
            } else {
    public PostgreSchema(PostgreDatabase database, String name, ResultSet dbResult)
            dbStat.setLong(1, PostgreSchema.this.getObjectId());
            }
        if (getDataSource().supportsReadingKeysWithColumns()) {
    public PostgreIndex getIndex(@NotNull DBRProgressMonitor monitor, long indexId) throws DBException {
        protected PostgreProcedure fetchObject(
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
            return List.of();

            @NotNull PostgreIndex object,
        }
                    if (refAttr == null) {

            .sorted(Comparator

                        PostgreTableBase curTable = getTable(monitor, tableId);
                    PostgreTableConstraintColumn cCol = new PostgreTableConstraintColumn(constraint, attr, i);
        }
                """
    public PostgreTableBase getTable(DBRProgressMonitor monitor, String tableName) throws DBException {
                """
        }
    private final TableCache tableCache;
            return JDBCUtils.safeGetBoolean(dbResult, "relispartition");
    public List<PostgreIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
        return database;
    protected boolean persisted;
                    log.error(e);
                        for (PostgrePrivilege privilege : privileges) {
    }

        dataTypeCache = new PostgreDataTypeCache();
        List<DBSObjectContainer> result = new ArrayList<>();
                    constraintType = PostgreConstants.CONSTRAINT_EXCLUSIVE;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if ((scope & STRUCT_ATTRIBUTES) != 0) {
    }
            sql.append("\nFROM pg_catalog.pg_class c\n")
    @Property(order = 4)
            if (forParent == null) {
        return this.tableCache;
                    return new PostgreTableConstraint(table, name, constraintType, resultSet);
    public synchronized void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope)
import java.util.*;

        }
        protected void cacheChildren(
            String oidColumn = serverType.getProceduresOidColumn(); // Hack for Redshift SP support
    @Association
                """
                        }
            if (forTable != null) {
                        continue;
                "SELECT i.*,i.indkey as keys,c.relname,c.relnamespace,c.relam,c.reltablespace,tc.relname as tabrelname,dsc.description");
                return null;
            constraintCache.getAllObjects(monitor, this);
        return new ProceduresCache();
            }
            cacheStructure(monitor, DBSObjectContainer.STRUCT_ALL);
                    addDDLLine(sql, procedure.getObjectDefinitionText(monitor, options));
                final PostgreTableBase refTable = foreignKey.getAssociatedEntity();
        return (PostgreTableBase) getChild(monitor, tableName);
        }
        return description;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
            @NotNull PostgreTableContainer container,
                "SELECT c.oid,c.*,t.relname as tabrelname,rt.relnamespace as refnamespace,d.description" +

    private ArrayList<PostgrePrivilege> defaultPrivileges;
            if (object == null && objectName != null) {
        } else {
                if (monitor.isCanceled()) {
                    break;
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                    "ORDER BY e.oid"
        return getProceduresCache().getAllObjects(monitor, this);


            @NotNull PostgreTableContainer container,
    public List<PostgreExtension> getExtensions(DBRProgressMonitor monitor)
    @Override
                        if (table instanceof PostgreTableReal) {

                readDefaultPrivileges(monitor);
        @Override
    private final AggregateCache aggregateCache;
                    "\nINNER JOIN pg_catalog.pg_class c ON (a.attrelid=c.oid)" +
        }
            boolean supportsExprIndex = getDataSource().isServerVersionAtLeast(7, 4);
        ) throws SQLException {

        this.persisted = persisted;
                    "\nORDER BY p.proname"
    public IndexCache getIndexCache() {
        ) throws SQLException, DBException {
    @Association

                    log.warn("Unresolved reference table of '" + foreignKey.getName() + "'");
{
                                defaultPrivilege.setUnderKind(objectType);
                .append(object == null && objectName == null ? "" : " AND relname=?");
            if (dataSource.isServerVersionAtLeast(10, 0)) {
            Number[] keyNumbers = PostgreUtils.safeGetNumberArray(resultSet, "conkey");
            super("relname");

                    while (dbResult.next()) {
            }
        }
    DBPSaveableObject,
            @NotNull JDBCSession session,
            @NotNull JDBCResultSet dbResult
        return postgrePrivileges;
    }
            boolean readAllTypes = getDatabase().getDataSource().supportReadingAllDataTypes();
        @Override

            }
                    SELECT s.oid as schema_id
            // Read constraints with columns
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
                    (session.getDataSource().isServerVersionAtLeast(8, 4) ? "pg_catalog.pg_get_expr(p.proargdefaults, 0)" : "NULL") + " as arg_defaults,d.description\n" +
            .filter(table -> !table.isPartition() && !(table instanceof PostgreTableForeign))
            } catch (SQLException e) {

            @NotNull PostgreTableBase parent,
                }
                        if (curTable instanceof PostgreTable) {
        }
    public List<PostgreAggregate> getAggregateFunctions(DBRProgressMonitor monitor)
        ) {
                        long tableId = dbResult.getLong(1);
        @Nullable
*/
        }
                    } else {
        return PostgreConstants.CATALOG_SCHEMA_NAME.equals(name);
                    "\nFROM pg_catalog.pg_attribute a" +
                    (object == null ? "" : " AND p." + oidColumn + "=?") +
 * DBeaver - Universal Database Manager
    public ConstraintCache getConstraintCache() {
                log.error(e);
                    ORDER BY p.proname"""
                    " cfg.tbls,\n" +
package org.jkiss.dbeaver.ext.postgresql.model;
        }
    protected ConstraintCache createConstraintCache() {
        ) throws DBException {
            @NotNull PostgreSchema owner,
        }
            return dbStat;
            log.debug("Error reading schema information ", e);
    public boolean isPersisted() {
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read relation statistics")) {
        return false;

    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        resetPartitionsInheritance(monitor);
                PostgreTableConstraintColumn[] cols = new PostgreTableConstraintColumn[colCount];
                    }
        }
            }
        return null;
    /**
            @NotNull JDBCResultSet dbResult
                }
            }


    public PostgreSchema(PostgreDatabase database, String name, PostgreRole owner) {

    @Override
    @Association
        return database;
    PostgrePrivilegeOwner,

                    }
            sql.append("\nCOMMENT ON SCHEMA ").append(DBUtils.getQuotedIdentifier(this))
    }

 *
        ) throws SQLException {
            super();
        return tableCache.getTypedObjects(monitor, this, PostgreTableReal.class);
                        }
        this.loadInfo(dbResult);
        tableCache = createTableCache();
                } else {

                            log.warn("Can't find parent table '" + parentTableId + "' in '" + parentSchema.getName() + "'");
        }
 *
                indexName,
                PostgreConstants.INFO_SCHEMA_NAME.equalsIgnoreCase(name) ||
    private final ConstraintCache constraintCache;
            return null;
                for (PostgreTableBase table : getTables(monitor)) {
    void resetStatistics() {
                        log.warn("Bad constraint attribute index: " + colNumber);
    protected void loadInfo(ResultSet dbResult)
                    WHERE p.oid=a.aggfnoid AND p.pronamespace=?
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return null;
    }

    }
        ) {

        }
            if (!monitor.isCanceled()) {
        ) throws SQLException, DBException {

    }
        throw new DBException("Schema DDL is read-only");
            assert attributes != null;
                monitor.beginTask("Load procedures", procedures.size());
    }
        @Override
            sql.append("\n").append(ddl);

            sql.append(" ORDER BY tabrelname, c.relname");
            final String kindString = getDataSource().getServerType().supportsPartitions()
                }
                for (PostgreTableBase tableOrView : tablesOrViews) {
    public boolean isExternal() {
                                defaultPrivileges.add(defaultPrivilege);
                            if (privilege instanceof PostgreDefaultPrivilege defaultPrivilege) {
                return null;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read default schema privileges")) {
                    return null;
                for (int i = 0; i < colCount; i++) {
    @NotNull

                    "            (\n" +
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreSchema owner)
    @Association
            }
    private void resetPartitionsInheritance(DBRProgressMonitor monitor) throws DBException {
            sql.append("\nORDER BY c.oid");
import org.jkiss.dbeaver.model.meta.Property;

                Collection<PostgreTableBase> tablesOrViews = getTableCache().getAllObjects(monitor, this);
                    " e.* \n" +
        getTableCache().getAllObjects(monitor, this);
        }
                log.warn("Null constraint type");
                    }
                    attr,
            @NotNull PostgreTableContainer container,
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        @Override
        return tables;
                    (versionAtLeast7 ? " AND d.objsubid = 0" : "") + // no links to columns
        @NotNull
                        final long parentSchemaId = JDBCUtils.safeGetLong(dbResult, "parent_ns");
            }
                sql.append(",pg_catalog.pg_get_expr(i.indpred, i.indrelid) as pred_expr");
                case "u":
        sql.append("CREATE SCHEMA ").append(DBUtils.getQuotedIdentifier(this));
                        log.warn("Bad reference table '" + refTable + "' attribute index: " + colNumber);
        }
                    }
                    break;
        if (!actions.isEmpty()) {
            sql.append(
    }
            hasStatistics = true;
                // https://stackoverflow.com/questions/18121103/how-to-get-the-index-column-orderasc-desc-nulls-first-from-postgresql
                int colCount = keyNumbers.length;
                        log.warn("Bad foreign key attribute index: " + colNumber);
                    final PostgreTableColumn refAttr = PostgreUtils.getAttributeByNum(refAttributes, keyRefNumbers[i].intValue());
        }
        }
            return dbStat;
        aggregateCache = new AggregateCache();
    @Override
        @Override
                    "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=p." + oidColumn +
            }
    private void addDDLLine(StringBuilder sql, String ddl) {
                    constraintType = DBSEntityConstraintType.FOREIGN_KEY;
    public boolean isCatalogSchema() {
    public class ConstraintCache extends JDBCCompositeCache<PostgreTableContainer, PostgreTableBase, PostgreTableConstraintBase<?>, PostgreTableConstraintColumn> {
 * See the License for the specific language governing permissions and
                return cols;
                dbStat.setLong(1, forTable.getObjectId());
     */
            monitor.beginTask("Load data types", dataTypes.size());
        }
        List<PostgrePrivilege> postgrePrivileges = new ArrayList<>(
            @NotNull String indexName,
        }
        @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
                                      ? PostgreClass.RelKind.R.getCode() : JDBCUtils.safeGetString(dbResult, "relkind");
        return getTableCache().getObject(monitor, this, name, PostgreMaterializedView.class);
                            continue;
    void addDefaultPrivileges(List<PostgrePrivilege> resultPrivileges) {
    }
                    "\nLEFT OUTER JOIN pg_catalog.pg_class rt ON rt.oid=c.confrelid" +
                                      && CommonUtils.equalObjects(JDBCUtils.safeGetString(dbResult, "relkind"), PostgreClass.RelKind.r.getCode())
        @Override
        return database.getDataSource().getServerType().supportsRoles() ? database.getRoleById(monitor, ownerId) : null;
                    "\nWHERE e.extnamespace=?\n" +

                boolean isAscending =  (options & 1) == 0;
                }
            object.cacheAttributes(monitor, children, true);
                for (int i = 0; i < colCount; i++) {
            @NotNull DBRProgressMonitor monitor,
                dbStat.setLong(1, forParent.getObjectId());
     */
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                return index;
                    "SELECT \n" +
            for (PostgreExtension ext : extensions) {
    @Override
            PostgreIndexColumn[] result = new PostgreIndexColumn[keyNumbers.length];

                "SELECT p." + oidColumn + " as poid,p.*," +
        return dataTypeCache.getAllObjects(monitor, this).stream()
            @NotNull PostgreTableContainer container,

                if (refTable == null) {
        for (PostgreTable table : this.getTables(monitor)) {
                    FROM pg_catalog.pg_inherits i, pg_class rc, pg_class pc
                    constraintType = PostgreConstants.CONSTRAINT_TRIGGER;
    public PostgreDatabase getDatabase() {
                return fkCols;
                    FROM pg_class c
                    "            ARRAY_AGG(ns.nspname || '.' ||  cls.relname) tbls, oid_ext\n" +
    public boolean isPublicSchema() {
            .stream()
        defaultPrivileges.addAll(resultPrivileges);
    }
        constraintCache = createConstraintCache();
                    monitor.worked(1);
            @NotNull PostgreSchema owner,
    }
        @Override
            }
            }
    DBPSystemObject,

    class IndexCache extends JDBCCompositeCache<PostgreTableContainer, PostgreTableBase, PostgreIndex, PostgreIndexColumn> {
                if (constraintType == DBSEntityConstraintType.FOREIGN_KEY) {
                        pgTable.nullifyEmptySuperTableInheritance();
        return "";
        extensionCache = new ExtensionCache();
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
            } else {
                    }

    {
            throws SQLException {

    @Override
    }
            PostgreUtils.extractPermissionsFromACL(monitor, this, schemaAcl, false));
        return new DBSNamespace[] { new PostgreNamespace(this) };
                    break;
    DBSProcedureContainer,
                        String objectType = JDBCUtils.safeGetString(dbResult, "defaclobjtype");


     * Constraint cache implementation
    }
            if (supportsExprIndex) {
        if (!CommonUtils.isEmpty(getDescription()) && CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
        hasStatistics = false;

        monitor.subTask("Cache tables");
                    break;
                    final PostgreTableColumn attr = PostgreUtils.getAttributeByNum(attributes, colNumber);
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
                return null;
        }
 */
    private void cacheTableInheritance(DBRProgressMonitor monitor) throws DBException {
    }

    public boolean isSystem() {
    }
            return new PostgreIndex(
    DBPScriptObjectExt2,
    }
        ) throws SQLException, DBException {
                sql.append(",pg_catalog.pg_stat_get_numscans(i.indexrelid) as index_num_scans");

                    "\nLEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=c.oid AND d.objsubid=0 AND d.classoid='pg_constraint'::regclass" +

                case "f":
                    "            group by oid_ext        \n" +
            }
    }
import org.jkiss.dbeaver.Log;
    @Nullable
        this.ownerId = role == null ? 0 : role.getObjectId();
                            continue;
    public static boolean isUtilitySchema(String schema) {
        final ArrayList<? extends PostgreTable> tables = getTableCache().getTypedObjects(monitor, this, PostgreTableForeign.class)
    protected String name;
                    SELECT p.oid AS proc_oid,p.proname AS proc_name,a.*
    public boolean isStatisticsCollected() {
            @NotNull PostgreTableContainer container,
                            ((PostgreTable) curTable).addSuperTableInheritance(parentTable, seqNum);
            // Show DDL for all schema objects (do not include CREATE EXTENSION)
            String expr = JDBCUtils.safeGetString(dbResult, "expr");

        return sql.toString();
    protected String description;
                int colCount = Array.getLength(keyNumbers);
        for (PostgreIndex index : indexCache.getAllObjects(monitor, this)) {
                    "FROM pg_catalog." + serverType.getProceduresSystemTable() + " p\n" +
            @NotNull JDBCResultSet resultSet
import org.jkiss.dbeaver.model.exec.DBCSession;
    public List<? extends PostgreTable> getTables(DBRProgressMonitor monitor)

            }


            @NotNull PostgreTableContainer container,

                        if (parentSchema == null) {
            int[] keyOptions = PostgreUtils.getIntVector(JDBCUtils.safeGetObject(dbResult, "indoption"), getDataSource());
        constraintCache.clearCache();
        ) throws SQLException, DBException {
        @Override

 */
                            log.debug("Can't read default permissions object type for " + getName());
        return persisted;
    @NotNull
        }


        protected PostgreTableBase fetchObject(
                case "c":
        }

        for (PostgreTable table : getTableCache().getTypedObjects(monitor, this, PostgreTable.class)) {
        protected IndexCache() {
                    "                unnest(e1.extconfig) oid , e1.oid oid_ext\n" +
                    WHERE\s""");
        }
               || DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS.equals(option);
                        List<PostgrePrivilege> privileges =
                        break;
    }
        }
    }
        }
            } else {
    }
                    WHERE c.relnamespace=?"""))
        List<DBEPersistAction> actions = new ArrayList<>();
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
import org.jkiss.code.NotNull;
                monitor.worked(1);
        PostgreRole owner = getOwner(monitor);
            }
            @NotNull PostgreTableBase table,
        tableCache.clearCache();
            if (constraint instanceof PostgreTableForeignKey foreignKey) {
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override

    }
        @Override
        }
    public PostgreSchema getSchema() {
            .stream()
    }
        }
                    " pg_catalog.pg_extension e \n" +

                        log.debug("Number of foreign columns is less than constraint columns (" + refColCount + " < " + colCount + ") in " + constraint.getFullyQualifiedName(DBPEvaluationContext.DDL));
            } else {
    }
                return (PostgreTableBase) table;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    }
                return null;
        }
    class AggregateCache extends JDBCObjectCache<PostgreSchema, PostgreAggregate> {
            {
    @NotNull
                dbStat.setLong(1, forTable.getObjectId());
        return PostgreConstants.PUBLIC_SCHEMA_NAME.equals(name);
        protected JDBCStatement prepareChildrenStatement(
                }
    public List<PostgreView> getViews(DBRProgressMonitor monitor) throws DBException {
                }
    private void readDefaultPrivileges(DBRProgressMonitor monitor) throws DBException {
                        "and dep.refobjsubid = a.attnum and dep.classid = dep.refclassid" : "") +
                }
                        final long parentTableId = JDBCUtils.safeGetLong(dbResult, "parent_oid");
import org.jkiss.utils.CommonUtils;
    public static class ProceduresCache extends JDBCObjectLookupCache<PostgreSchema, PostgreProcedure> {
                return proc;
        @Override
            @NotNull JDBCResultSet dbResult
    public List<PostgreSequence> getSequences(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
        @Override
            StringBuilder sql = new StringBuilder();
    }
                dbStat.setLong(1, getObjectId());
    @Override
        }
        return indexCache.getObjects(monitor, this, parent);
            } catch (SQLException e) {
            dbStat.setLong(1, owner.getObjectId());
    PostgreTableContainer,
    @Property(viewable = false, order = 2)
            @NotNull JDBCSession session,
    public TableCache getTableCache() {
                List<PostgreTableBase> allTables = new ArrayList<>();
            boolean versionAtLeast7 = session.getDataSource().isServerVersionAtLeast(7, 2);
                .comparing((DBSTypedObject type) -> type.getTypeName().startsWith("_")) // Sort the array data types at the end of the list
            return dbStat;
            .filter(table -> !table.isPartition())
        sql.append("-- DROP SCHEMA ").append(DBUtils.getQuotedIdentifier(this)).append(";\n\n");
            PostgreClass.RelKind kind = PostgreClass.RelKind.valueOf(kindString);
                sql.append("c.conrelid=?");

            @NotNull JDBCSession session,

        public JDBCStatement prepareLookupStatement(
            }
                Number[] keyRefNumbers = PostgreUtils.safeGetNumberArray(resultSet, "confkey");
            if (keyNumbers == null) {
                    (!getDataSource().getServerType().supportsPGConstraintExpressionColumn() ? ", null as consrc_copy" :
                sql.append(",pg_catalog.pg_get_expr(i.indexprs, i.indrelid, true) as expr");
        return this.constraintCache;
                    "\nWHERE NOT a.attisdropped AND c.relkind not in ('i','I','c')" +
            JDBCPreparedStatement dbStat = session.prepareStatement(
            {
public class PostgreSchema implements
                    false);
    private final PostgreDataTypeCache dataTypeCache;

                long colOpClass = indColClasses == null || indColClasses.length < keyNumbers.length ? 0 : indColClasses[i];

    }
                    "         select\n" +
    @Association
                default:
        return

            sql.append(SQLUtils.generateScript(getDataSource(), actions.toArray(new DBEPersistAction[0]), false));
            final JDBCPreparedStatement dbStat = session.prepareStatement(
            monitor.done();
        } finally {
    /**
        return name;
    }
            return result;
    protected long oid;
    private static final Log log = Log.getLog(PostgreSchema.class);
                    INNER JOIN pg_catalog.pg_class tc ON tc.oid=i.indrelid
        ) throws SQLException {
            //sql.append(" AND NOT i.indisprimary");
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            .collect(Collectors.toCollection(ArrayList::new));
            @NotNull PostgreSchema owner,



            @NotNull String childName,
        }
    @NotNull
    }
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS)) {

    public void setName(@NotNull String newName) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table inheritance info")) {
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
        throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                """
            @NotNull PostgreTableContainer container,
        for (PostgreProcedure proc : getProceduresCache().getAllObjects(monitor, this)) {
                    PostgreAttribute<?> attr = PostgreUtils.getAttributeByNum(attributes, colNumber.intValue());
            result.add(publicSchema);
    public List<PostgreDataType> getDataTypes(DBRProgressMonitor monitor) throws DBException {
            StringBuilder sql = new StringBuilder(

                    }
            schema.startsWith(PostgreConstants.TEMP_SCHEMA_PREFIX);
                    if (tableOrView instanceof PostgreSequence) {
    @Override

                    }
                        break;
            result.add(pgCatalogSchema);
        protected void cacheChildren2(@NotNull DBRProgressMonitor monitor, @NotNull PostgreTableConstraintBase<?> object, @NotNull List<PostgreTableConstraintColumn> children) {

        this.name = name;
    @Override
    }
            PostgreServerExtension serverType = owner.getDataSource().getServerType();
            }

            }
                        Object acl = JDBCUtils.safeGetObject(dbResult, "defaclacl");
                    object,
                throw new DBCException("Error reading schema relation statistics", e);

            }
            @NotNull JDBCSession session,
        this.database = database;
        return getIndexes(monitor, null);
    @Association
            sql.append(" AUTHORIZATION ").append(DBUtils.getQuotedIdentifier(owner));
                indexCache.getAllObjects(monitor, this);
    @Override
            @NotNull JDBCSession session,
    @Override
            return new PostgreAggregate(session.getProgressMonitor(), owner, dbResult);
                    (forTable != null ? " AND c.oid=?" : " AND c.relnamespace=?") +
            for (PostgreDataType dataType : dataTypes) {
        proceduresCache.clearCache();
            if (proc.getObjectId() == oid) {


            defaultPrivileges = new ArrayList<>();
            if (object != null || objectName != null)
        protected boolean isPartitionTableRow(@NotNull JDBCResultSet dbResult) {
                }

                        PostgreTableBase parentTable = parentSchema.getTable(monitor, parentTableId);
                    cacheTableInheritance(monitor);
                    if (attr == null) {
                }
            final JDBCPreparedStatement dbStat = session.prepareStatement(
    DBPObjectStatisticsCollector,
            @Nullable String objectName
                dbStat.setString(1, getName());
        PostgreSchema schema = database.schemaCache.refreshObject(monitor, database, this);
            @Nullable PostgreTableBase forTable
    public List<? extends JDBCTable> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
            @Nullable String objectName
                    Number colNumber = (Number) Array.get(keyNumbers, i); // Column number - 1-based

    private final IndexCache indexCache;
                    while (dbResult.nextRow()) {
            for (int i = 0; i < keyNumbers.length; i++) {
            sql.append("WHERE c.relnamespace=? AND c.relkind not in ('i','I','c')")
                    "\nINNER JOIN pg_catalog.pg_class t ON t.oid=c.conrelid" +
        return tables;
                    if (i >= refColCount) {
        proceduresCache = createProceduresCache();

                }
            if (forTable != null) {
        @NotNull
    }

        }
        }
            return dbStat;
            monitor.done();
        throws DBException {

    }
                assert keyRefNumbers != null && attributes != null && refAttributes != null;
            sql.append("\n\n");
    }
    public List<DBSObjectContainer> getPublicScopes(@NotNull DBRProgressMonitor monitor) throws DBException {
    public JDBCTable getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
 * you may not use this file except in compliance with the License.
        }
            try (JDBCPreparedStatement dbStat = ((JDBCSession)session).prepareStatement(
            if (getDataSource().getServerType().supportsDefaultPrivileges()) {
                    monitor.subTask(tableOrView.getName());
    }
    PostgreScriptObject,
            } catch (DBException e) {
