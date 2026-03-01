
    private static final Log log = Log.getLog(PostgreDatabase.class);

        }
        checkInstanceConnection(monitor);
        return roleCache.getObject(monitor, this, reference.getRoleName());
            setCache(Collections.emptyList());
        }
                dataTypeCache.clear();
            // Cache data types
    public Collection<PostgreDataType> getLocalDataTypes() {
                if (dataType != null) {
        }
    @Association
    private long tablespaceId;
            this.connectionLimit = JDBCUtils.safeGetInt(dbResult, "datconnlimit");
                    database.getDataSource());
        }
                "SELECT l.oid,l.* FROM pg_catalog.pg_language l " +
    @Property(order = 12)
            return Collections.emptyList();
        @Override
            return new PostgreTablespace(owner, dbResult);
    public PostgreProcedure getProcedure(DBRProgressMonitor monitor, long schemaId, long procId)
    }
        checkInstanceConnection(monitor);
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
    public PostgreDatabaseJDBCObjectCache<? extends PostgreRole> getRoleCache() {
        List<String> searchPath = metaContext == null ? Collections.singletonList(PostgreConstants.CATALOG_SCHEMA_NAME) : metaContext.getSearchPath();
        }
    }
        }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)

        return isTemplate;
                                loadedDataTypes.add(dataType);
                    "FROM pg_catalog.pg_conversion c\n" +
    private String ctype;
        final PostgreSchema schema = getSchema(monitor, schemaId);
        }
    public final ExtensionCache extensionCache = new ExtensionCache();
    @Association
            return null;
    public Collection<PostgreTablespace> getTablespaces(DBRProgressMonitor monitor) throws DBException {
    public PostgreSchema createSchemaImpl(@NotNull PostgreDatabase owner, @NotNull String name, @NotNull JDBCResultSet resultSet) throws SQLException {
 * See the License for the specific language governing permissions and
    }
    protected PostgreDatabase(DBRProgressMonitor monitor, PostgreDataSource dataSource, String name, PostgreRole owner, String templateName, PostgreTablespace tablespace, PostgreCharset encoding) throws DBException {
        this.tablespaceId = JDBCUtils.safeGetLong(dbResult, "dattablespace");
    }

    public Collection<PostgreJobClass> getJobClasses(@NotNull DBRProgressMonitor monitor) throws DBException {
    @NotNull
                } else {

            );
        protected boolean handleCacheReadError(@NotNull Exception error) {
    @Nullable
                log.debug("Skipping schema with NULL name");
        // Get all schemas


        checkInstanceConnection(monitor);
                supportTypColumn = true;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    public void setDescription(String description) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
        return accessMethodCache.getAllObjects(monitor, this);

    public long getStatObjectSize() {


        if (getDataSource().getServerType().supportsCollations()) {
                    }
    public PostgreEventTrigger getEventTrigger(DBRProgressMonitor monitor, String triggerName) throws DBException {
                        while (dbResult.next()) {
    }
        this.initialTablespace = tablespace;
        public Object[] getPossibleValues(PostgreDatabase object)
        checkInstanceConnection(monitor);
        }
        }
    @Override
        @Override
                }
        if (!getDataSource().getServerType().supportsRoles()) {
    
        }
            // First check system catalog
        }

                "SELECT c.contoencoding as encid,pg_catalog.pg_encoding_to_char(c.contoencoding) as encname\n" +
                  "            group by oid_ext        \n" +
        protected PostgreSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    public EventTriggersCache getEventTriggersCache() {
            return new PostgreAccessMethod(owner, dbResult);
            throws SQLException {
            if (dataType != null) {
            if (!CommonUtils.isEmpty(dataTypeCache)) {
        @Override
    public Collection<PostgreAccessMethod> getAccessMethods(DBRProgressMonitor monitor) throws DBException {
    @Association
    }

        schemaCache.clearCache();
    }
    @Override
    @Override

    }
    }
                StringBuilder sql = new StringBuilder(256);

        }
            return null;
    @Override
        synchronized (dataTypeCache) {
                  "          from\n" +
                return new Object[0];
                  " e.* \n" +

            return prepareStatement;

        @NotNull
        return jobCache.getAllObjects(monitor, this);
        this.ownerId = owner.getObjectId();
    JobClassCache getJobClassCache() {
        return PostgreUtils.getObjectById(monitor, roleCache, this, roleId);
     */
        {
        @Override
        }
        // Query row count
    ///////////////////////////////////////////////////
            StringBuilder catalogQuery = new StringBuilder(
        return availableExtensionCache.getAllObjects(monitor, this);

            }
    }
    }
        }
            throws SQLException {
    }
        {
        }
        this.name = databaseName;
        protected PostgreAvailableExtension fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)

        try {

    }

        }

        readDatabaseInfo(monitor);
            throws SQLException, DBException {
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "datdba");
        }
    public PostgreSchema getSchema(long oid) {
        return schemaCache.getCachedObject(PostgreConstants.CATALOG_SCHEMA_NAME);
                return ts;
                  "                pg_catalog.pg_extension e1 ) c \n" +
        /**
    }
    }
        @Nullable


    }

                dbStat.setString(1, name);
    @NotNull
    @Override
    private String templateName;

            return session.prepareStatement(
        @NotNull

        if (!isSharedDatabase() && executionContext == null) {
        return dataSource.resolveDataKind(typeName, typeID);
 */
                  " cfg.tbls,\n" +
         * Adds condition in the query and returns true if condition is added.
    }
            }
            );
        }
            final PostgreDataType dataType = schema.getDataTypeCache().getCachedObject(typeName);
                    try {
                    "\nORDER BY t.oid"
        return null;
    protected String getMetadataContextName() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Caches

                }
                }
        boolean hasDataTypes;
            dataType.getParentObject().getDataTypeCache().cacheObject(dataType);
            typeName = "_" + typeName.substring(0, typeName.length() - 2);
            }
                    catalogFilters = new DBSObjectFilter();
    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {

    private String collate;

    }
        }
                                schemaList.add(schema);

        checkInstanceConnection(monitor);


            return new PostgreJobClass(database, dbResult);
        ec.setIsolatedContext(true);
         * @param session to check columns existing
        }
                if (!readAllTypes) {
    }
                return null;
        }

                        supportTypColumn = true;
        DBPStatefulObject,
        return null;
        if (typeId <= 0) {
            initializeMainContext(monitor);

                    "\nORDER BY am.oid"
        // Check schemas in search path

        @NotNull
        final PostgreSchema schema = getCatalogSchema();
    public Collection<PostgreForeignServer> getForeignServers(DBRProgressMonitor monitor) throws DBException {

                }
        protected PostgreJobClass fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull JDBCResultSet dbResult) {
                    "\nORDER BY l.fdwname"
                } else {
        return initialEncoding;
                    sql.append("\nAND (c.relkind IS NULL OR c.relkind = 'c')");
        this.initCaches();
    private boolean isTemplate;
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;

        checkInstanceConnection(monitor);

        protected boolean handleCacheReadError(@NotNull Exception error) {
 *
    }
        @Override
    static class EncodingCache extends PostgreDatabaseJDBCObjectCache<PostgreCharset> {
    }
    private Boolean supportTypColumn;
    // Column "typcategory" appeared only in PG version 8.4 and before we relied on DB version to verify the conditions, but it was not the most universal solution.
import org.jkiss.utils.CommonUtils;
        @Override
        this.initCaches();
                    supportTypColumn = false;
        cacheDataTypes(monitor, true);
    @Nullable
    public long getObjectId() {
        return ec;
            }
        for (PostgreTablespace ts : tablespaceCache.getAllObjects(monitor, this)) {
                return session.prepareStatement("SELECT 1");
            if (object != null || CommonUtils.isNotEmpty(objectName)) {
    @Association
    @Association
    // We mustn't cache metadata when checkInstanceConnection called during datasource instantiation
        protected PostgreForeignDataWrapper fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
            return session.prepareStatement(
    @Nullable
    }
        @Override
        if (!getDataSource().getServerType().supportsDatabaseDescription()) {
            DBSObjectFilter catalogFilters = database.getDataSource().getContainer().getObjectFilter(PostgreSchema.class, null, false);

    protected static abstract class PostgreDatabaseJDBCObjectCache<OBJECT extends DBSObject> extends JDBCObjectCache<PostgreDatabase, OBJECT> {
            if (procedure != null) {
        PostgreObject,
        for (PostgreJobClass cls : getJobClasses(monitor)) {
        {
    public Collection<PostgreExtension> getExtensions(DBRProgressMonitor monitor)
        }
    // Properties
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                  " pg_catalog.pg_extension e \n" +
        }
        }


    @NotNull
            return null;
    @Association
            return new PostgreLanguage(owner, dbResult);
    }
    /**
import org.jkiss.code.NotNull;
        throws DBException {
        return supportTypColumn;
    // Default schema and search path
            hasDataTypes = !dataTypeCache.isEmpty();
            return session.prepareStatement(sql.toString());
    }
            throws SQLException {
                    + "join pg_database on objoid = pg_database.oid where datname = ?", getName());
    private int connectionLimit;
    }
        }
        return getSchemas(monitor);
            }
    final AccessMethodCache accessMethodCache = new AccessMethodCache();
        @Override
    @NotNull
    public final JobClassCache jobClassCache = new JobClassCache();
    /**
    public DBPDataKind resolveDataKind(@NotNull String typeName, int typeID) {
        @Override

import org.jkiss.utils.LongKeyMap;
        DBPRefreshableObject,


            description = "";
        }
        public boolean allowCustomValue()
    final LanguageCache languageCache = new LanguageCache();
    }
    }
    }
            return false;
    }
    public PostgreRole getInitialOwner() {
        schemaCache.cacheObject(sysSchema);

        return enumValueCache;
    public Collection<PostgreAvailableExtension> getAvailableExtensions(DBRProgressMonitor monitor)
        }
        return tablespaceCache.getAllObjects(monitor, this);
        this.initCaches();
    public void setDefaultEncoding(PostgreCharset charset) throws DBException {
            checkInstanceConnection(monitor);

    }
        checkInstanceConnection(monitor);
            return new PostgreEnumValue(database.getDataSource(), database, resultSet);
        checkInstanceConnection(monitor);
    }
        } else {
package org.jkiss.dbeaver.ext.postgresql.model;
    }
        @Override
                    "GROUP BY c.contoencoding\n" +
            }
        @NotNull
                        if (catalogSchema != null) {

        @Nullable
            }
    // Object container

    implements
        checkInstanceConnection(monitor);
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.DBException;
        @Override
        @NotNull
    public void setInitialEncoding(PostgreCharset initialEncoding) {
        throws DBException {
        @Override
        this.encodingId = JDBCUtils.safeGetLong(dbResult, "encoding");
*/

            log.debug("Can't resolve data type " + typeId, e);
        protected boolean handleCacheReadError(@NotNull Exception error) {
        schemaCache = getDataSource().getServerType().createSchemaCache(this);
        for (final PostgreSchema schema : getSchemas(monitor)) {
    public void setInitialOwner(PostgreRole initialOwner) {
    static class EventTriggersCache extends JDBCObjectLookupCache<PostgreDatabase, PostgreEventTrigger> {
            );
        throws DBException {

    private long oid;
 *
    }
        @Override
    static class RoleCache extends PostgreDatabaseJDBCObjectCache<PostgreRole> {
                return tablespaces.toArray(new Object[0]);
    }
        // Check the rest

        protected PostgreJob fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        @Nullable
                return dataType;
    }
                  "                join    pg_class cls on cls.oid = c.oid \n" +
    }
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
        foreignDataWrapperCache.clearCache();

        DBPObjectStatistics,
    protected PostgreDatabaseJDBCObjectCache<? extends PostgreRole> createRoleCache() {
        return JDBCExecutionContext.TYPE_METADATA + " <" + getName() + ">";
        this.initCaches();
    }
                            for (PostgreSchema schema : schemaList) {

        for (PostgreSchema schema : schemaCache.getCachedObjects()) {
                  " left join  (\n" +
    }
    public DBSDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull String typeFullName) throws DBException {
            }
        checkInstanceConnection(monitor);
                (object != null || CommonUtils.isNotEmpty(objectName) ? " WHERE pet.evtname = ?" : "");
    public String toString() {

            return description;
                            if (!session.isClosed() && !session.getAutoCommit()) {



            return null;

        return schemaCache.getCachedObject(PostgreConstants.PUBLIC_SCHEMA_NAME);
        if (!getDataSource().supportsRoles()) {
    }
    }

    private final EnumValueCache enumValueCache = new EnumValueCache();
        return description;

    }

        return PostgreSchema.class;
                try (JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString())) {
            }

                            }
            }
                    return collation;
    public PostgreCollation getCollation(DBRProgressMonitor monitor, long id)
        roleCache.clearCache();

        }
        }
    PostgreSchema getPublicSchema() {
                    }
        foreignServerCache.clearCache();
                    "\nORDER BY c.oid"
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)

        if (typeName.endsWith("[]")) {
            }
            }
    public PostgreSchema getSchema(DBRProgressMonitor monitor, long oid) throws DBException {
    @NotNull

                cacheDataTypes(monitor, true);
        @Override
                    catalogFilters,
import org.jkiss.dbeaver.DBDatabaseException;
        for (PostgreSchema schema : schemaCache.getCachedObjects()) {
                    (owner.getDataSource().getServerType().supportsTablespaceLocation() ? ",pg_tablespace_location(t.oid) loc" : "") +
        } catch (Exception e) {
    public PostgreCharset getDefaultEncoding(DBRProgressMonitor monitor) throws DBException {
                JDBCUtils.setFilterParameters(dbStat, 1, catalogFilters);

            dataType = schema.getDataTypeCache().getDataType(typeId);
        throws DBException {

            throws SQLException {
                  "         select\n" +
                // For those who missed previous warnings
    public Collection<? extends PostgreRole> getUsers(DBRProgressMonitor monitor) throws DBException {
                    if (!CommonUtils.isEmpty(includeFilters) && !includeFilters.contains(PostgreConstants.CATALOG_SCHEMA_NAME)) {
        extensionCache.clearCache();
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)


        return foreignServerCache.getAllObjects(monitor, this);

            return null;
        synchronized (dataTypeCache) {
    private String name;
        }


        }
    @NotNull
            }
    public PostgreExecutionContext getMetaContext() {
                    List<String> includeFilters = catalogFilters.getInclude();
                  "                join pg_namespace ns on ns.oid = cls.relnamespace\n" +
import org.jkiss.dbeaver.model.meta.*;
    // Stats
    private void initEnumTypesCache(@NotNull DBRProgressMonitor monitor) throws DBException {
                            log.warn("Can't rollback transaction", e);
        @NotNull
            return dataType;

        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @Nullable PostgreJob object, @Nullable String objectName) throws SQLException {
        }
            if (dataType != null) {
    }
                    "\nORDER BY l.oid"
        return PostgreUtils.resolveTypeFullName(monitor, this, typeFullName);

        }
            log.debug("Error reading tablespaces", error);
        checkInstanceConnection(monitor);
        }
                }
        DBPObjectWithLazyDescription
        return templateName;
        return schema.getTable(monitor, tableId);
            }
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    }
        return eventTriggersCache.getObject(monitor, this, triggerName);
        return foreignDataWrapperCache.getAllObjects(monitor, this);
                }
    ///////////////////////////////////////////////
        @NotNull
    public PostgreSchema getCatalogSchema(DBRProgressMonitor monitor) throws DBException {
            throw new DBCException(e, context);

            if (PostgreSchema.isUtilitySchema(name) && !owner.getDataSource().getContainer().getNavigatorSettings().isShowUtilityObjects()) {

    }
                    "\nLEFT OUTER JOIN pg_catalog.pg_proc p ON p.oid=l.fdwhandler " +
        return schemaCache.getObject(monitor, this, name);
            if (schema != null) {
        @Override
    @Association
                  "            select\n" +
        
        accessMethodCache.clearCache();

        availableExtensionCache.clearCache();
    }
    public Collection<PostgreSchema> getSchemas(DBRProgressMonitor monitor) throws DBException {
        PostgreSchema schema = getSchema(monitor, schemaId);
    private void readDatabaseInfo(DBRProgressMonitor monitor) throws DBCException {
                    catalogFilters = new DBSObjectFilter(catalogFilters);
        if ((!dataSource.isConnectionRefreshing() && this == dataSource.getDefaultInstance()) || this.isSharedDatabase()) {
            throws SQLException {
        }
        return null;
            return false;
    private final EventTriggersCache eventTriggersCache = new EventTriggersCache();
         * @param query query text needed for additions
        return PostgreUtils.getObjectById(monitor, encodingCache, this, encodingId);
                continue;
    @Override
        }
    public void setInitialTablespace(PostgreTablespace initialTablespace) {

            throws SQLException, DBException {
    }
        public Object[] getPossibleValues(PostgreDatabase object)
                log.error(e);
        public Object[] getPossibleValues(PostgreDatabase object)
                }
            if (cacheMetadata)
            return session.prepareStatement("SELECT * FROM pgagent.pga_jobclass");
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
        this.name = newName;
    }
            log.debug("Error reading database info", e);
                        }
            throws SQLException {
            JDBCPreparedStatement prepareStatement = session.prepareStatement(statement);
            return Collections.emptyList();
    boolean supportsSysTypCategoryColumn(JDBCSession session) {
            throws SQLException, DBException {
    }
    }
        enumValueCache.clearCache();
    }
        protected PostgreLanguage fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
        protected boolean addExtraCondition(@NotNull JDBCSession session, @NotNull StringBuilder query) {
    public Collection<PostgreSetting> getSettings(DBRProgressMonitor monitor) throws DBException {

        @Override
    }

        checkInstanceConnection(monitor);
        @Override
        @Override
                        }
    @Property(editable = true, updatable = true, order = 3, listProvider = RoleListProvider.class)
                "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=n.oid AND d.objsubid=0 AND d.classoid='pg_namespace'::regclass\n");

    }
    }
                if (dataType != null) {
                log.error(e);
    @Override
            return dbStat;
        this.initialEncoding = encoding;
            final PostgreSchema schema = getCatalogSchema();

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase database) throws SQLException {
    }

    public String getName() {
        }
        this.initialEncoding = initialEncoding;
        if (((PostgreDataSource) dataSource).isSupportsEnumTable()) {
            initializeMetaContext(monitor);
        return collate;
        }
            }
    public static class EnumValueCache extends PostgreDatabaseJDBCObjectCache<PostgreEnumValue> {
    static class ExtensionCache extends PostgreDatabaseJDBCObjectCache<PostgreExtension> {
        }
    }
            if (!dataSource.isServerVersionAtLeast(10, 0)) {
            return dataType;
            throws SQLException, DBException {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return allowConnect;
            return schema.getDataTypeCache().getCachedObjects();
                                schema.getDataTypeCache().setFullCache(true);
        this.tablespaceId = tablespace.getObjectId();
import org.jkiss.dbeaver.runtime.DBWorkbench;

            throws SQLException {
        if (dataSource.isServerVersionAtLeast(8, 1)) {
                synchronized (dataTypeCache) {
                final PostgreDataType dataType = schema.getDataTypeCache().getCachedObject(typeName);
                        "\nFROM pg_catalog.pg_type t");
    @Override
        jobClassCache.clearCache();
import org.jkiss.dbeaver.model.*;
    }

            }
    }
            return false;
        super(monitor, dataSource, false);
        checkInstanceConnection(monitor, false);

                return procedure;
    public boolean isSharedDatabase() {


        }
                  "                unnest(e1.extconfig) oid , e1.oid oid_ext\n" +
    }
    static class LanguageCache extends PostgreDatabaseJDBCObjectCache<PostgreLanguage> {
    ///////////////////////////////////////////////
            throws SQLException {
        @Override
        return PostgreUtils.getDefaultDataTypeName(dataKind);
        }

    public static class JobClassCache extends PostgreDatabaseJDBCObjectCache<PostgreJobClass> {

            );
            }
                return true;
    @Property(order = 10)
    public String getTemplateName() {
            }
        checkInstanceConnection(monitor);
    public PostgreProcedure getProcedure(DBRProgressMonitor monitor, long procId)
        super(dataSource);
        }
    // Data types
    private final EncodingCache encodingCache = new EncodingCache();
        PostgreExecutionContext ec = (PostgreExecutionContext) super.openIsolatedContext(monitor, purpose, initFrom);
                "SELECT l.oid,l.* FROM pg_catalog.pg_foreign_server l" +
import org.jkiss.dbeaver.model.exec.DBCException;
        }
        protected PostgreCharset fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
        this.description = description;

        boolean handlePermissionDeniedError(Exception e) {
            if (schema.getObjectId() == oid) {
            PostgreDataType dataType = PostgreDataTypeCache.resolveDataType(monitor, this, typeName);
            if (catalogFilters != null) {
            }
        this.dbTotalSize = dbTotalSize;
    @Nullable
    @Association
    }
                    return dataType;

        return dbTotalSize;
        protected PostgreExtension fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
                        log.debug("Error reading system information from the pg_type table: " + e.getMessage());
    private transient PostgreCharset initialEncoding;
        if (getDataSource().getServerType().supportsCollations()) {
            final StringBuilder sql = new StringBuilder("SELECT * FROM pgagent.pga_job");

        @Override
    @Override
    @Property(order = 14)
        @Override
        }
            if (ts.getObjectId() == tablespaceId) {
        return true;
    EnumValueCache getEnumValueCache() {
        languageCache.clearCache();

    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
        @NotNull
        checkInstanceConnection(monitor);

            }
        @NotNull
            }
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        @Override
    }
    ///////////////////////////////////////////////
                sql.append(" WHERE jobid=").append(object.getObjectId());
         * @return true if condition added
    }
    }
            return session.prepareStatement(
            if (cls.getObjectId() == id) {
    private String description;
                            }
        throws DBException {
                    "\nFROM pg_catalog.pg_tablespace t " +
        @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Nullable
    }

        }
        }
            @NotNull PostgreDatabase database

        }
            DBWorkbench.getPlatformUI().showError("Error accessing pgAgent jobs", "Can't access pgAgent jobs.\n\nThis database may not have the extension installed or you don't have sufficient permissions to access them.\n\nIf you believe that this is DBeaver's fault, please report it.", error);
    @Override

    public void setName(@NotNull String newName) {
                return true;
        return getDataType(null, typeName);
        {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @Nullable PostgreEventTrigger object, @Nullable String objectName) throws SQLException {
        @NotNull
import org.jkiss.code.Nullable;
        @Override
    }
    public String getCollate() {
    @Association
import org.jkiss.dbeaver.model.struct.*;
            return session.prepareStatement("SELECT * FROM pg_catalog.pg_enum");
                enumValueCache.clearCache();
    }
    public JDBCObjectLookupCache<PostgreDatabase, PostgreSchema> schemaCache;
        this.encodingId = encoding == null ? 0 : encoding.getObjectId();
            if (name == null) {
        if (schema != null) {
                return dataType;
        return new PostgreSchema(owner, name, postgreRole);
    static class AccessMethodCache extends PostgreDatabaseJDBCObjectCache<PostgreAccessMethod> {
        checkInstanceConnection(monitor);
            return new PostgreCharset(owner, dbResult);

        if (monitor != null) {
        checkInstanceConnection(monitor);

    }
    }
                if (object != null || objectName != null) {
    public DBSObjectState getObjectState() {
    }

        @NotNull
    }
            this.collate = JDBCUtils.safeGetString(dbResult, "datcollate");
            return owner.createSchemaImpl(owner, name, resultSet);
    }
        return true;
            boolean extraConditionAdded = addExtraCondition(session, catalogQuery);
        }
    private final PostgreDatabaseJDBCObjectCache<? extends PostgreRole> roleCache = createRoleCache();
            }
        @NotNull
                            PostgreUtils.getQueryForSystemColumnChecking("pg_type", "typcategory"));
        protected PostgreAccessMethod fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)


                JDBCUtils.appendFilterClause(
    @Nullable
        }

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
    public PostgreDatabase getDatabase() {
    @NotNull
                " FROM pg_catalog.pg_roles a " +
            synchronized (dataTypeCache) {
    // Tablespaces
                            PostgreDataType dataType = PostgreDataType.readDataType(session, this, dbResult, !readAllTypes);
    public String getDescription() {
            throws SQLException, DBException {
                if (!dataSource.isServerVersionAtLeast(8, 4)) {
    public static class CharsetListProvider implements IPropertyValueListProvider<PostgreDatabase> {
    public void setDbTotalSize(long dbTotalSize) {
    public PostgreSchema createSchemaImpl(@NotNull PostgreDatabase owner, @NotNull String name, @Nullable PostgreRole postgreRole) {
    public boolean isInstanceConnected() {
        this.initialOwner = owner;
                            }
            return PostgreConstants.STATE_UNAVAILABLE;
    }
            return new PostgreCollation(session.getProgressMonitor(), owner, dbResult);
    }
            log.debug("Can't resolve data type '" + typeName + "' in database '" + getName() + "'");
    private final CollationCache collationCache = new CollationCache();
    @Nullable
        return null;
    @Override
        return dataSource.getDefaultInstance() == this;
        if (description == null) {
        checkInstanceConnection(monitor);
    /////////////////////////////////////////////////////////////////////////////////////

    }
        DBSInstanceLazy,
            );
            String statement = "SELECT pet.*, d.description FROM pg_catalog.pg_event_trigger pet\n" +
    public Collection<PostgreLanguage> getLanguages(DBRProgressMonitor monitor) throws DBException {

    /////////////////////////////////////////////////
    public String getCtype() {
        return JDBCExecutionContext.TYPE_MAIN + " <" + getName() + ">";
                log.warn(error);

            throws SQLException, DBException {
    @NotNull
    }

                    if (supportsSysTypColumn) {
            return null;
        @Override
        throws DBException {
        return this;
        return getDataSource().getSettingCache().getAllObjects(monitor, getDataSource());
                return cls;
                  "            (\n" +
    public PostgreJobClass getJobClass(@NotNull DBRProgressMonitor monitor, long id) throws DBException {
            return null;
        PostgreExecutionContext context = getMetaContext();
            roleCache.setCache(Collections.emptyList());
                "\nORDER BY a.rolname";
    static class AvailableExtensionCache extends PostgreDatabaseJDBCObjectCache<PostgreAvailableExtension> {
    public Collection<PostgreForeignDataWrapper> getForeignDataWrappers(DBRProgressMonitor monitor) throws DBException {
    @Association
        return false;
    ///////////////////////////////////////////////
            throws SQLException, DBException {
            }
        super(monitor, dataSource, false);
    @Override
        return initialOwner;
            // Roles not supported
            PostgreProcedure procedure = PostgreUtils.getObjectById(monitor, schema.getProceduresCache(), schema, procId);
        }
        this.isTemplate = JDBCUtils.safeGetBoolean(dbResult, "datistemplate");
        return roleCache;
                return new Object[0];
            }
        }
        return eventTriggersCache.getAllObjects(monitor, this);

    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 * you may not use this file except in compliance with the License.
    @Property(editable = true, updatable = true, order = 4, listProvider = TablespaceListProvider.class)
        protected PostgreRole fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
 * Unless required by applicable law or agreed to in writing, software
            return new PostgreJob(session.getProgressMonitor(), database, resultSet);

    @Override
                return schema;

 */
            checkInstanceConnection(monitor, true);
            // FIXME: maybe some better workaround?
                log.error(e);
            return session.prepareStatement(
        } catch (SQLException e) {
            synchronized (dataTypeCache) {
        }
        if (!getDataSource().getServerType().supportsEncodings()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setTemplateName(String templateName) {
    }
    }


                return null;

        return encodingCache.getAllObjects(monitor, this);
    @Override
    public PostgreRole getDBA(DBRProgressMonitor monitor) throws DBException {
                  "         ) cfg on cfg.oid_ext = e.oid\n" +

    }
        protected boolean handleCacheReadError(@NotNull Exception error) {
    }
            return session.prepareStatement(
        checkInstanceConnection(monitor);
            return new PostgreEventTrigger(database, eventTriggerName, resultSet);
            @NotNull PostgreDatabase database,
    public PostgreDataType getDataType(@Nullable DBRProgressMonitor monitor, String typeName) {
    TablespaceCache getTablespaceCache() {
            }
            description = JDBCUtils.queryString(session, "select description from pg_shdescription "
                "SELECT l.oid,l.*,p.pronamespace as handler_schema_id " +
        return null;
    }
                    "nspname",
    }
        @Override
    private transient PostgreRole initialOwner;
        @Nullable
        return name;
                    "\nFROM pg_catalog.pg_foreign_data_wrapper l" +
        }

}
    }
        } catch (DBCException e) {
        throws DBException {
{
    void checkInstanceConnection(@NotNull DBRProgressMonitor monitor, boolean cacheMetadata) throws DBException {
                            session,
    public Collection<? extends PostgreRole> getAuthIds(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            dataType.getParentObject().getDataTypeCache().cacheObject(dataType);
                "SELECT am.oid,am.* FROM pg_catalog.pg_am am " +
    PostgreTableBase findTable(DBRProgressMonitor monitor, long schemaId, long tableId)
    @Override
            } catch (DBException e) {
        try (JDBCSession session = context.openSession(monitor, DBCExecutionPurpose.META, "Load database info")) {
                setCache(Collections.emptyList());

    @Nullable
    PostgreSchema getActiveSchema() {
                "SELECT n.oid,n.*,d.description FROM pg_catalog.pg_namespace n\n" +
    @Override
        }
    private final LongKeyMap<PostgreDataType> dataTypeCache = new LongKeyMap<>();
    public PostgreJob getJob(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
        return null;

    }
                    for (PostgreDataType dataType : loadedDataTypes) {
        if (monitor == null || monitor.isForceCacheUsage()) {
            log.debug("Error reading database description ", e);
        @Override
        return tablespaceCache;
    public Collection<PostgreJob> getJobs(@NotNull DBRProgressMonitor monitor) throws DBException {
     * @return enum values cache. Do not use is if database do not support enams. Check {@code PostgreDatasource#isSupportsEnumTable}
                boolean supportsSysTypColumn = supportsSysTypCategoryColumn(session); // Do not read all array and table types, unless the user has decided otherwise
            return DBSObjectState.NORMAL;
                if (collation.getObjectId() == id) {
    }
    }
            boolean readAllTypes = postgreDataSource.supportReadingAllDataTypes();
    }

        this.name = name;
            throws SQLException {
        DBSCatalog,
    }
    @Property(order = 11)
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
    static class ForeignServerCache extends PostgreDatabaseJDBCObjectCache<PostgreForeignServer> {
    private boolean allowConnect;
        }
            if (PostgreConstants.EC_PERMISSION_DENIED.equals(SQLState.getStateFromException(e))) {
        return (PostgreDataSource) dataSource;
            return true;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
    // Because datasource is not fully initialized yet
                        try {
        checkInstanceConnection(monitor);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }

        }

                return tablespaces.toArray(new Object[0]);
    }

    }
        throws DBException {

    @Override

        return name;
                Collection<? extends PostgreRole> roles = object.getAuthIds(new VoidProgressMonitor());

public class PostgreDatabase extends JDBCRemoteInstance
    public PostgreCharset getInitialEncoding() {

            return null;
    }
        return languageCache.getAllObjects(monitor, this);
    }
        return new RoleCache();
    @Association
                        "\nLEFT OUTER JOIN pg_catalog.pg_description d ON t.oid=d.objoid" +
            // dbStat.setLong(1, PostgreSchema.this.getObjectId());
    }
        return monitor == null ? schemaCache.getCachedObjects() : schemaCache.getAllObjects(monitor, this);
        // We need to set name first
    }
            // On some multi-tenant servers pg_database is not public so error may gappen here
        @Nullable
        public boolean allowCustomValue()
            return new PostgreRole(owner, dbResult);
    }
                    return dataType;
    }
            PostgreDataSource postgreDataSource = getDataSource();
    }
        protected PostgreEventTrigger fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
            log.error("Catalog " + schemaId + " not found");
    @Override
                    }
        return extensionCache.getAllObjects(monitor, this);
        {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                        PostgreSchema catalogSchema = getCatalogSchema();
    public boolean isActiveDatabase() {

    public static class TablespaceListProvider implements IPropertyValueListProvider<PostgreDatabase> {
            }
        return null;
                "LEFT OUTER JOIN pg_catalog.pg_description d ON pet.\"oid\" = d.objoid" +
        PostgreDataType dataType;
                    "\nORDER BY l.srvname"
            return session.prepareStatement(sql);
        // Type not found. Let's resolve it
                    }
            if (!database.getDataSource().isSupportsEnumTable()) {


        for (String schemaName : searchPath) {
        ) throws SQLException, DBException {
        }
    private long encodingId;
        PostgreSchema sysSchema = new PostgreSchema(this, PostgreConstants.CATALOG_SCHEMA_NAME);
                        JDBCUtils.queryString(
                    } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    static class ForeignDataWrapperCache extends PostgreDatabaseJDBCObjectCache<PostgreForeignDataWrapper> {
    public static class JobCache extends JDBCObjectLookupCache<PostgreDatabase, PostgreJob> {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        }
            if ((catalogFilters != null && !catalogFilters.isNotApplicable()) || object != null || objectName != null) {
    @NotNull
        @Override
        return this.oid;
            @NotNull JDBCSession session,
import java.sql.ResultSet;

                            if (dataType != null) {
        } catch (Exception e) {
    public void setDefaultTablespace(PostgreTablespace tablespace) throws DBException {
    }
                        sql.append(" AND (et.typcategory IS NULL OR et.typcategory <> 'C')");
    @Property(order = 13)
                                schema.getDataTypeCache().cacheObject(dataType);
                        }
    @Nullable
            initEnumTypesCache(monitor);
        }
            return false;
        }
    PostgreSchema getCatalogSchema() {
                    sql.append("\nLEFT OUTER JOIN pg_catalog.pg_type et ON et.oid=t.typelem "); // If typelem is not 0 then it identifies another row in pg_type

     * It reuses default database connection and its' object can be accessed with cross-database queries.
        tablespaceCache.clearCache();
            if (dataType != null) {
        if (!hasDataTypes || forceRefresh) {
                prepareStatement.setString(1, object != null ? object.getName() : objectName);
    @NotNull
        try {
        }
        }
        this.loadInfo(dbResult);
    public PostgreRole getRoleById(DBRProgressMonitor monitor, long roleId) throws DBException {
    }
        throws DBException {
            } catch (DBException e) {

    @Nullable
            if (schema != null) {
                  "            ARRAY_AGG(ns.nspname || '.' ||  cls.relname) tbls, oid_ext\n" +
                        "\nWHERE t.typname IS NOT NULL");
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
    @Override
                    if (dbResult.nextRow()) {

            catalogQuery.append(" ORDER BY nspname");
            @NotNull JDBCResultSet resultSet
        return getSchema(monitor, PostgreConstants.CATALOG_SCHEMA_NAME);
            enumValueCache.getAllObjects(monitor, this);
        super(monitor, dataSource, false);
            String sql = "SELECT a.oid,a.*" + (supportsCommentsOnRole ? ",pd.description" : "") +
    static class TablespaceCache extends PostgreDatabaseJDBCObjectCache<PostgreTablespace> {
        }
    public DBSDataType getLocalDataType(int typeID) {
    // Infos
        @Override
                  "ORDER BY e.oid"
            return true;
                    "ORDER BY 2\n"
    
    }
        this.encodingId = charset.getObjectId();
                  " join pg_namespace n on n.oid =e.extnamespace\n" +
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
                    catalogQuery,
    }
    @Override
            } catch (SQLException e) {
        this.templateName = templateName;
    @Nullable
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
 * PostgreDatabase
 * limitations under the License.
            if (object != null) {
        if (!getDataSource().getServerType().supportsEncodings()) {
                                PostgreSchema schema = dataType.getParentObject();
                final PostgreDataType dataType = schema.getDataTypeCache().getCachedObject(typeName);

        }
    public boolean isAllowConnect() {
        }
/*
    PostgreDatabase(PostgreDataSource dataSource, String databaseName) {
    @Nullable

        return description;
            String name = JDBCUtils.safeGetString(resultSet, "nspname");
        }
                  "            from\n" +
                }
    @ForTest
        } catch (Exception e) {

    public String getDescription(@NotNull DBRProgressMonitor monitor) {
                  "FROM \n" +

import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        {
        PostgreExecutionContext metaContext = getMetaContext();
        try (JDBCSession session = DBUtils.openUtilSession(monitor, getDataSource(), "Read database description")) {
    @Override
            return session.prepareStatement(
        return jobClassCache;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
        if (description != null) {

                            catalogSchema.getDataTypeCache().mapAliases(catalogSchema);
                return roles.toArray(new Object[0]);


                        dataTypeCache.put(dataType.getObjectId(), dataType);
    @Nullable

        @Override

        @Override
            return session.prepareStatement(
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
    // So make a separate request to the database for checking.
                                session.rollback();
        this.templateName = templateName;
            return false;
    }
            throws SQLException {
        if (!getDataSource().getServerType().supportsRoles()) {
         */
        log.debug("Collation '" + id + "' not found in schema " + getName());
            readDatabaseInfo(monitor);
    @Nullable

                }
                        supportTypColumn = false;
    @NotNull
            );
    protected String getMainContextName() {

    public PostgreRole getRoleByReference(@NotNull DBRProgressMonitor monitor, @NotNull PostgreRoleReference reference) throws DBException {
                Collection<PostgreTablespace> tablespaces = object.getTablespaces(new VoidProgressMonitor());
        }
        protected PostgreCollation fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
        return roleCache.getAllObjects(monitor, this);
            boolean supportsCommentsOnRole = owner.getDataSource().getServerType().supportsCommentsOnRole();
     * Shared database doesn't need separate JDBC connection.
                        catalogFilters.addInclude(PostgreConstants.CATALOG_SCHEMA_NAME);
        this.initialOwner = initialOwner;
        eventTriggersCache.clearCache();

    @NotNull
                  "SELECT \n" +

        @Override
    public PostgreTablespace getDefaultTablespace(DBRProgressMonitor monitor) throws DBException {
    public PostgreExecutionContext openIsolatedContext(@NotNull DBRProgressMonitor monitor, @NotNull String purpose, @Nullable DBCExecutionContext initFrom) throws DBException {

                sql.append("SELECT t.oid,t.*,c.relkind,").append(PostgreDataTypeCache.getBaseTypeNameClause(postgreDataSource)).append(", d.description" +
        }
            }
                return new ArrayList<>(dataTypeCache.values());
            this.ctype = JDBCUtils.safeGetString(dbResult, "datctype");
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
        if (!getDataSource().getServerType().supportsRoles()) {

        return roleCache.getAllObjects(monitor, this);
        return ctype;
        ) throws SQLException {
                    }
    }
        this.name = databaseName;
    @Override
            try {
                List<PostgreDataType> loadedDataTypes = new ArrayList<>();

        protected PostgreForeignServer fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
import org.jkiss.dbeaver.model.sql.SQLState;
                dataTypeCache.put(dataType.getObjectId(), dataType);
        checkInstanceConnection(monitor);

    @Override
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT db.oid,db.* FROM pg_catalog.pg_database db WHERE datname=?")) {


    @Property(viewable = true, order = 2)
    private long ownerId;
        public JDBCStatement prepareObjectsStatement(
    }
         *

    @Override
    @Override
            }
            } else {
        return connectionLimit;
        }

 * Copyright (C) 2010-2026 DBeaver Corp and others
                "SELECT t.oid,t.*" +
        DBPNamedObject2,
    @Nullable
            try {
 * DBeaver - Universal Database Manager
    @Override
    public static class RoleListProvider implements IPropertyValueListProvider<PostgreDatabase> {
        @Nullable
    private final AvailableExtensionCache availableExtensionCache = new AvailableExtensionCache();

                    !extraConditionAdded,
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            } catch (DBException e) {
        jobCache.clearCache();
        this.ownerId = owner == null ? 0 : owner.getObjectId();
        return eventTriggersCache;
                        } catch (SQLException ex) {


    }
        this.allowConnect = JDBCUtils.safeGetBoolean(dbResult, "datallowconn");
    }
    protected PostgreDatabase(DBRProgressMonitor monitor, PostgreDataSource dataSource, ResultSet dbResult)
        @Override
            JDBCPreparedStatement dbStat = session.prepareStatement(catalogQuery.toString());
        try {
    public boolean hasStatistics() {
    @Association
                  "  n.nspname as schema_name,\n" +
    public PostgreTablespace getTablespace(DBRProgressMonitor monitor, long tablespaceId) throws DBException {
            final PostgreSchema schema = schemaCache.getCachedObject(schemaName);
            throws SQLException, DBException {
    }
    static class CollationCache extends PostgreDatabaseJDBCObjectCache<PostgreCollation> {
                  "SELECT name,default_version,installed_version,comment FROM pg_catalog.pg_available_extensions ORDER BY name"
        @Override

import java.util.*;
        return new PostgreSchema(owner, name, resultSet);
        }
            return new PostgreForeignDataWrapper(owner, dbResult);
        return null;
    final ForeignDataWrapperCache foreignDataWrapperCache = new ForeignDataWrapperCache();
                setCache(Collections.emptyList());
/*
            dataType = dataTypeCache.get(typeId);
                  " e.oid,\n" +
                log.warn(e);
                synchronized (dataTypeCache) {
        }
    @Override
            String eventTriggerName = JDBCUtils.safeGetString(resultSet, "evtname");
    @Override
                    catalogFilters.addInclude(object != null ? object.getName() : objectName);
        @Nullable
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
            return new PostgreForeignServer(owner, dbResult);
        @NotNull
    }
            return collationCache.getAllObjects(monitor, this);
    }

    void cacheDataTypes(DBRProgressMonitor monitor, boolean forceRefresh) throws DBException {
    public Collection<PostgreCollation> getCollations(DBRProgressMonitor monitor)
        public boolean allowCustomValue()
            }
        this.initialTablespace = initialTablespace;
            );

            if (CommonUtils.isEmpty(eventTriggerName)) {
    }
        {
    public final TablespaceCache tablespaceCache = new TablespaceCache();
        encodingCache.clearCache();
    }
    ////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    }
    }
        return metaContext != null || executionContext != null || sharedInstance != null;
        protected PostgreTablespace fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet dbResult)
        checkInstanceConnection(monitor);
        }
        @NotNull

    @Property(editable = false, updatable = false, order = 5/*, listProvider = CharsetListProvider.class*/)

            return session.prepareStatement(


            );
                dataTypeCache.put(dataType.getObjectId(), dataType);
        this.tablespaceId = tablespace == null ? 0 : tablespace.getObjectId();
                }
    @NotNull
                        }
    }
    private void initCaches() {
            );
        for (PostgreSchema schema : schemaCache.getCachedObjects()) {
                throw new DBDatabaseException(e, postgreDataSource);
/**
            throws SQLException, DBException {

        {
        }
    public boolean isTemplate() {
            ((PostgreDataSource) dataSource).readDatabaseServerVersion(session);
        }
    protected PostgreDatabase(DBRProgressMonitor monitor, PostgreDataSource dataSource, String databaseName)
                    // Always read catalog schema
        @Override
    public PostgreDataType getLocalDataType(String typeName) {
        return jobCache.getObject(monitor, this, name);
            return new PostgreAvailableExtension(owner, dbResult);
        for (PostgreSchema schema : schemaCache.getAllObjects(monitor, this)) {
    }
                        loadInfo(dbResult);
            }
        @Override
        // Clear all caches

                return null;
        }
        }
    @Association
            return handlePermissionDeniedError(error);
    }
        return PostgreUtils.getObjectById(monitor, tablespaceCache, this, tablespaceId);
 *
            for (PostgreCollation collation : collationCache.getAllObjects(monitor, this)) {


            return new PostgreExtension(owner, dbResult);
    }
        }
            try {

            return session.prepareStatement(
        }
        if (!getDataSource().isServerVersionAtLeast(8, 1)) {
    @Nullable
    public PostgreTablespace getInitialTablespace() {
            return null;
 * You may obtain a copy of the License at


        @Override
            // Do not do anything.
                return dataType;
        synchronized (dataTypeCache) {
    }
            dataType = PostgreDataTypeCache.resolveDataType(monitor, this, typeId);
    public PostgreSchema getSchema(DBRProgressMonitor monitor, String name) throws DBException {
        if (supportTypColumn == null) {
        return getSchema(monitor, childName);


    }
                (supportsCommentsOnRole ? "\nleft join pg_catalog.pg_shdescription pd on a.oid = pd.objoid" : "") +
                        Set<PostgreSchema> schemaList = new HashSet<>();
            return PostgreUtils.getObjectById(monitor, schema.getProceduresCache(), schema, procId);
    public void checkInstanceConnection(@NotNull DBRProgressMonitor monitor) throws DBException {
    public final ForeignServerCache foreignServerCache = new ForeignServerCache();
    public int getConnectionLimit() {
                "SELECT c.oid,c.* FROM pg_catalog.pg_collation c " +
    public final JobCache jobCache = new JobCache();
        return this;
    }
        sysSchema.getDataTypeCache().loadDefaultTypes(sysSchema);
    }
            // In some cases ResultSetMetadata returns it as []
        collationCache.clearCache();
    public void setDBA(PostgreRole owner) {

            return this;
import java.sql.SQLException;
        }
        return null;
            return false;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase owner)
    @Association
    public boolean isPersisted() {
    }
        if (sharedInstance == null && metaContext == null && executionContext == null) {
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
        protected PostgreEnumValue fetchObject(
                return new Object[0];
    public static class SchemaCache extends JDBCObjectLookupCache<PostgreDatabase, PostgreSchema> {
        // Type not found. Let's resolve it
            // #271, #501: in some databases (AWS?) pg_authid is not accessible
            synchronized (dataTypeCache) {

            if (schema.getObjectId() == oid) {
        return initialTablespace;
     */
        @Override
                    }
    // Procedures

    public Collection<PostgreCharset> getEncodings(DBRProgressMonitor monitor) throws DBException {

        return jobClassCache.getAllObjects(monitor, this);
        if (!isSharedDatabase() && executionContext == null) {
                return schema;
        }
            }

                Collection<PostgreCharset> tablespaces = object.getEncodings(new VoidProgressMonitor());
        @Override
    @Association
    }
    }
        if (dataSource.isServerVersionAtLeast(8, 4)) {

        if (schema != null) {

            if (searchPath.contains(schema.getName())) {
        @NotNull
                }
    public PostgreDataType getDataType(DBRProgressMonitor monitor, long typeId) {
        }
        @Override

        }
    private transient PostgreTablespace initialTablespace;
    public PostgreDataSource getDataSource() {
    private long dbTotalSize = -1;
            if (PostgreConstants.EC_PERMISSION_DENIED.equals(SQLState.getStateFromException(error))) {
    @Override
                        if (!schemaList.isEmpty()) {
            @NotNull JDBCSession session,
            return null;
        DBPDataTypeProvider,
 *     http://www.apache.org/licenses/LICENSE-2.0
                    dataTypeCache.put(typeId, dataType);
        }
        this.name = JDBCUtils.safeGetString(dbResult, "datname");
            throws SQLException, DBException
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @Nullable PostgreSchema object, @Nullable String objectName) throws SQLException {
                sql.append("\nLEFT OUTER JOIN pg_catalog.pg_class c ON c.oid=t.typrelid" +
 * distributed under the License is distributed on an "AS IS" BASIS,
        return getMetaContext().getDefaultSchema();
        return getDataType(new VoidProgressMonitor(), typeID);
    protected void loadInfo(ResultSet dbResult) {
            }
                if (!readAllTypes && supportsSysTypColumn) {
        return (PostgreExecutionContext) super.getDefaultContext(true);
    @Association
    }
            // Nothing to refresh
    @Association
        return getRoleById(monitor, ownerId);
        if (schema == null) {
    public Collection<PostgreEventTrigger> getEventTriggers(DBRProgressMonitor monitor) throws DBException {
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read data types")) {
        }
        }
