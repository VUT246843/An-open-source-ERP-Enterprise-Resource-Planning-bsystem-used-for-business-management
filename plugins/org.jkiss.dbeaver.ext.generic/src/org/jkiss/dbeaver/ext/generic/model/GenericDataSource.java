    }

     * @param tableName not null table name for search
    }
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
                while (dbResult.next()) {

    }
        @NotNull DBRProgressMonitor monitor,
    @Nullable
        return schemas == null ? null : schemas.getCachedObjects();
        return structureContainer == null ? null : structureContainer.getIndexes(monitor);
    public List<GenericSchema> getSchemas() {
        if (GenericConstants.TERM_CATALOG.equals(objectType)) {
        }
        if (!CommonUtils.isEmpty(getCatalogs())) {
        return this;
        @Override

import org.jkiss.dbeaver.model.sql.SQLDialect;
        }
    }
    protected JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> getDataTypeCache() {
        } else if ("null".equalsIgnoreCase(this.allObjectsPattern)) {
        /*if (!CommonUtils.isEmpty(catalogs)) {
        } else {
    }

    public DBSDataType getLocalDataType(int typeID) {
    public SimpleObjectCache getSchemaCache() {
        return null;
        Object param = getContainer().getDriver().getDriverParameter(paramName);
                    shutdownProps.put(DBConstants.DATA_SOURCE_PROPERTY_USER, connectionInfo.getUserName());

                final GenericMetaObject catalogObject = getMetaObject(GenericConstants.OBJECT_CATALOG);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    }
        }
        }

                        // Some drivers uses TABLE_QUALIFIER instead of catalog
    public List<? extends GenericView> getViews(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override

    private SimpleObjectCache<GenericStructContainer, GenericSchema> schemas;

                    this.structureContainer = new GenericDataSourceObjectContainer(this);
    boolean hasCatalogs() {
        return structureContainer == null ? null : structureContainer.getTable(monitor, name);
        }
        this.structureContainer = null;

        return structureContainer.getSynonymCache();
    public boolean isMergeEntities() {
    }
        return structureContainer.getForeignKeysCache();
        return metaModel;
        @NotNull DBRProgressMonitor monitor,
    public Format getNativeFormatTime() {
import org.jkiss.utils.time.ExtendedDateFormat;

    public DBSDataType getLocalDataType(@Nullable String typeName) {
    public List<? extends GenericTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
    }

            }

        }

                        catalogName = GenericUtils.safeGetStringTrimmed(catalogObject, dbResult, JDBCConstants.TABLE_QUALIFIER);
                }
        return nativeFormatTime;
            return schemas != null && !schemas.isEmpty() && schemas.getCachedObjects().contains(object);
    }



            }
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context, JDBCExecutionContext initFrom) throws DBException {
    @Nullable
import java.sql.*;

    {
    }
        if (!CommonUtils.isEmpty(paramShutdown)) {
    }
                        GenericCatalog catalog = metaModel.createCatalogImpl(this, catalogName);
                log.debug("Schema '" + schemaName + "' not found");
                return null;
                    shutdownProps.put(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD, connectionInfo.getUserPassword());
                        }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        return null;
            this.setCaseSensitive(true);
        } else {

                    String catalogName = GenericUtils.safeGetString(catalogObject, dbResult, JDBCConstants.TABLE_CAT);
    public final Collection<GenericCatalog> getCatalogList() {
    @NotNull
                            break;
        if (container == null) {
                        this.catalogs.add(catalog);
        final DBPDriver driver = container.getDriver();
        if (getDataSource().isMergeEntities()) {
                dataTypeCache.fillStandardTypes(this);
        return nativeFormatTimestamp;
    }
    public IndexCache getIndexCache() {
    }
                        JDBCUtils.executeStatement(session, queryShutdown);
        nativeFormatDate = makeNativeFormat(GenericConstants.PARAM_NATIVE_FORMAT_DATE);

                }
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    @NotNull
    }
        this.allObjectsPattern = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_ALL_OBJECTS_PATTERN));
        this.queryGetActiveDB = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_QUERY_GET_ACTIVE_DB));
        if (!wasPopulated) {
import org.jkiss.dbeaver.model.connection.DBPDriver;
        if (adapter == DBSStructureAssistant.class) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
            return getCatalogs();
            // Just skip it
        return catalogNames;
        String term = null;
    @Override

            JDBCDatabaseMetaData metaData = session.getMetaData();
                if (isMergeEntities() || (schemas == null || schemas.isEmpty())) {
                    totalCatalogs++;
            if (ex instanceof DBException) {
        // Do not try to cache all catalogs and schemas - it is too
        super(monitor, container, dialect, false);
                    }
                }

    @NotNull
        }

import java.util.List;
    @Override
                    driver.connect(
    public GenericStructContainer getObject() {
    }
                        }


            log.debug("Error reading and setting client application name: " + e.getMessage());
    @Override
        throws DBException {
        } else if (!CommonUtils.isEmpty(getSchemas())) {
        if (dialect instanceof JDBCSQLDialect) {
    public GenericDataSource getDataSource() {

import org.jkiss.dbeaver.ModelPreferences;
        return structureContainer == null ? null : structureContainer.getFunctionsOnly(monitor);
                        monitor.subTask("Extract catalogs - " + catalogName);
    @Override
        } else {
    boolean isSelectedEntityFromAPI() {
     * @throws DBException for schema or table incorrect searching
        }
                // Read catalogs
    }

        // Provide client info
        return schemas;
    public GenericMetaObject getMetaObject(String id) {
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read generic metadata")) {
    }

    @Override
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
        this.tableTypeCache.clearCache();
            try {
    }
    public GenericCatalog getCatalog() {
    private static final Log log = Log.getLog(GenericDataSource.class);
    @Override
    }
    private final JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> dataTypeCache;
                    if (metaModel.isSchemasOptional()) {
        return structureContainer.getTableCache();
        return position == null ? null : new ErrorPosition[]{position};

    }
    /**
    }
                    // Let's just skip it and use only schemas
    }
        @NotNull JDBCDatabaseMetaData metaData,
        return structureContainer == null ? null : structureContainer.getPhysicalTables(monitor);
                return null;
                }
        if (!CommonUtils.isEmpty(catalogName) && !CommonUtils.isEmpty(catalogs)) {
    @Override
            // Cache data types
    }

                        log.error("Error shutting down database", e);
/*
                        if (JDBCConstants.APPLICATION_NAME_CLIENT_PROPERTY.equalsIgnoreCase(name)) {
     * @return generic table base object by name from parent by parent's name
    }
    }
    }
    private Format makeNativeFormat(String paramName) {
        this.omitSingleCatalog = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_OMIT_SINGLE_CATALOG), false);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                final Driver driver = getDriverInstance(new VoidProgressMonitor()); // Use void monitor - driver already loaded

        return tableTypeCache.getAllObjects(monitor, this);

import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    @NotNull

    }
    public boolean isSchemaFiltersEnabled() {
    @Override
 */
import java.util.Collection;
    @NotNull
    public boolean isOmitSingleSchema() {
                }
        }
    @NotNull
            throws DBException {
    private boolean omitSingleCatalog;
                    }
            }
    @Override
            if (metaModel instanceof DBDValueHandlerProvider) {


    public Collection<? extends GenericTrigger<?>> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
                return transformer;
    protected boolean isPopulateClientAppName() {
    }
    }
        }
    void setSelectedEntityFromAPI(boolean selectedEntityFromAPI) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {

    }
    // Constructor for tests
                            continue;
            ((GenericExecutionContext) context).initDefaultsFrom(monitor, metaContext);
    public Collection<? extends GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor)
    @Override
    public GenericObjectContainer.GenericSequenceCache getSequenceCache() {
    public TableTriggerCache getTableTriggerCache() {


 *

import org.jkiss.dbeaver.DBException;
                    }
        return structureContainer == null ? null : structureContainer.getTableTriggers(monitor);

    }
        return this;

        return term;
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
    }
    @Override
                try {
        ErrorPosition position = metaModel.getErrorPosition(error);
    String getSelectedEntityType() {
                    } catch (Throwable e) {

        return super.createQueryTransformer(type);
 * GenericDataSource
        return allObjectsPattern;

                    this.catalogs = new ArrayList<>();
    @NotNull
        }
            return getSchemas();
                    }
        try {
            }
        if (!CommonUtils.isEmpty(catalogs)) {
    @Override

    }

            if (supportsSubqueries != null) {
    @Nullable
    public List<? extends GenericTableBase> getTables(@NotNull DBRProgressMonitor monitor)
    @Override


    @NotNull
            return null;
    private final GenericMetaModel metaModel;
import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.code.NotNull;
            if (CommonUtils.isEmpty(catalogs) && !catalogsFiltered) {
                } catch (Throwable e) {
    @NotNull
            return getSchema(childName);
        if (!getContainer().getDriver().isSampleURLApplicable() && connectionInfo.getUrl() != null && !CommonUtils.equalObjects(connectionURL, connectionInfo.getUrl())) {
                final List<String> catalogNames = getCatalogsNames(monitor, metaData, catalogObject, catalogFilters);
 * limitations under the License.
                        catalogsFiltered = true;
    private Format nativeFormatTimestamp, nativeFormatTime, nativeFormatDate;
            monitor.subTask("Shutdown embedded database");
        }

        return DBUtils.findObject(getCatalogs(), name);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    }
            populateClientAppName(context, purpose, jdbcConnection);
    @Nullable
    public final Collection<GenericSchema> getSchemaList() {
    @Override
            this.supportsStructCache = CommonUtils.toBoolean(supportsStructCacheParam);
            return new GenericTableType(
    @Override
    public GenericSchema getSchema(String name) {
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SCHEMA_FILTER_ENABLED), true);
        super.shutdown(monitor);
    @Override
        throws DBException {
    }
                            throw (DBException) e;
        if (object instanceof GenericCatalog) {
    @Override
}
    }
//            return null;
    }
        return dataTypeCache.getCachedObject(typeID);
                if (!catalogNames.isEmpty() || catalogsFiltered) {
    }
            } catch (Throwable e) {
        return super.getAdapter(adapter);
        } else if (object instanceof GenericSchema) {
 *
                            String appName = DBUtils.getClientApplicationName(getContainer(), context, purpose);
        return dataTypeCache.getCachedObjects();
                    return schema;
        return dataTypeCache.getCachedObject(typeName);
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
                    if (CommonUtils.isEmpty(catalogName)) {

                }

    }
     * @param monitor for schemas and tables searching
                return adapter.cast(metaModel);
        @Nullable DBSObjectFilter catalogFilters
            if (container == null) {
        } else if (GenericConstants.TERM_PROCEDURE.equals(objectType)) {
            try {
        return structureContainer == null ? null : structureContainer.getPackages(monitor);
        }
    @Override
    }

            String appName = DBUtils.getClientApplicationName(getContainer(), context, purpose);
        return container.getTable(monitor, tableName);
            false);
                        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

    public String getObjectTypeTerm(String path, String objectType, boolean multiple) {
            }

    // Native formats


            if (container != null) {

        nativeFormatTime = makeNativeFormat(GenericConstants.PARAM_NATIVE_FORMAT_TIME);
import org.jkiss.utils.CommonUtils;
        }
    String getQueryGetActiveDB() {
        this.selectedEntityType = selectedEntityType;
            log.error(e);
        }
    @Override
        } else if (structureContainer != null) {
                for (JDBCExecutionContext context : instance.getAllContexts()) {
        return supportsStructCache;
                if (totalCatalogs == 1 && omitSingleCatalog) {
            if (transformer != null) {
    @Override
                        catalogNames.add(catalogName);

    private boolean supportsStructCache;
     * Enable for all derived classes.
        return structureContainer.getSequenceCache();
    @Override
    public GenericDataSource(@NotNull DBRProgressMonitor monitor, @NotNull GenericMetaModel metaModel, @NotNull DBPDataSourceContainer container, @NotNull SQLDialect dialect)
        return !CommonUtils.isEmpty(catalogs);
                    if (tmpSchemas != null) {
        @Override
        this.dataTypeCache = metaModel.createDataTypeCache(this);
        }
                    // Just one catalog. Looks like DB2 or PostgreSQL
                log.debug("Shutdown finished: :" + e.getMessage());
    }
        } catch (Throwable e) {
            term = getInfo().getProcedureTerm();
    public Format getNativeFormatDate() {
        throws DBException {
    }
        // "ApplicationName" property seems to be pretty standard
                        shutdownProps.isEmpty() ? null : shutdownProps);
        throws DBException {
    }
        // Driver settings and URL template may have change since connection creation
        // Init native formats
                throw (DBException) ex;
            }
        @Override
                }
            log.warn("Actual connection URL (" + connectionURL + ") differs from previously saved (" + connectionInfo.getUrl() + "). " +
     */
                        getContainer().getActualConnectionConfiguration().getUrl() + paramShutdown,
        return getCatalogs();
                            if (maxLength <= 0) {
import java.util.ArrayList;
                            jdbcConnection.setClientInfo(name, CommonUtils.truncateString(appName, maxLength));
            return null;
            term = getInfo().getSchemaTerm();
                dataTypeCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.*;
    public Collection<GenericTableType> getTableTypes(DBRProgressMonitor monitor)
        }
    public boolean isOmitCatalog() {
        } else if (adapter == DBCQueryPlanner.class) {

            return GenericSchema.class;
    public boolean isOmitSchema() {
    @Override
        final Object supportsStructCacheParam = getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SUPPORTS_STRUCT_CACHE);
        DBSDataType dataType = getLocalDataType(typeName);
    }
//        if (getDataSource().isMergeEntities()) {
            return getCatalog(childName);
import org.jkiss.dbeaver.Log;
    }
    }
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
    }
        }
            if (!omitCatalog) {
        return null;
        } catch (UnsupportedOperationException | SQLFeatureNotSupportedException e) {
                container = ((GenericCatalog) container).getSchema(monitor, schemaName);
    }
                log.warn("Can't read catalog list", e);
        return super.resolveDataKind(typeName, valueType);
    }
        return catalogs;
     * @param schemaName nullable schema name for search
    @Override
    }


public class GenericDataSource extends JDBCDataSource implements DBPTermProvider, GenericStructContainer {
        } else {
    @Override
        throws DBException {
    public Collection<? extends GenericProcedure> getProceduresOnly(@NotNull DBRProgressMonitor monitor) throws DBException {
                    while (ciList.next()) {
        throws DBException {
        if (initFrom != null) {
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {

    private boolean selectedEntityFromAPI;
                if (driver != null) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericDataSource owner) throws SQLException {
                if (schema.isVirtual()) {
    @Override
        boolean wasPopulated = false;
import org.jkiss.code.Nullable;
        if (term != null && multiple) {
        return null;
                GenericDataSource.this,
 * You may obtain a copy of the License at
                    resultSet,
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
                    getMetaObject(GenericConstants.OBJECT_TABLE_TYPE),
        if (!CommonUtils.isEmpty(schemaName)) {
            return adapter.cast(queryPlanner);

import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
            }
    public GenericObjectContainer.GenericSynonymCache getSynonymCache() {
            structureContainer.cacheStructure(monitor, scope);
    @Association
            final Object supportsSubqueries = getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SUPPORTS_SUBQUERIES);
        return getSchemas();
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_OMIT_SINGLE_SCHEMA), false);
            GenericExecutionContext metaContext = (GenericExecutionContext) initFrom;
    boolean supportsStructCache() {

                        throw new DBDatabaseException("Error reading schema list", e, this);
        if (metaModel instanceof DBCQueryTransformProvider) {
    public Collection<GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor, @NotNull String name)
    private GenericObjectContainer structureContainer;
    }
    }
import org.jkiss.dbeaver.model.impl.jdbc.*;
            return adapter.cast(new GenericStructureAssistant(this));
                log.debug("Error setting client application name: " + e.getMessage());
//        }
    }
        }
    }
    @Override
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        return querySetActiveDB;
        }
                monitor.subTask("Extract catalogs");
        GenericObjectContainer container = null;
import java.util.Properties;
        return structureContainer == null ? null : structureContainer.getProcedures(monitor, name);
    private class TableTypeCache extends JDBCObjectCache<GenericDataSource, GenericTableType> {
    }
     * Find table in a parent container by container name or in default container.
                log.error("Catalog " + catalogName + " not found");

    }
            return new ExtendedDateFormat(CommonUtils.toString(param));

        this.tableTypeCache = new TableTypeCache();
                Properties shutdownProps = new Properties();
        }
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
        return schemas != null && !schemas.isEmpty();
                        int maxLength = JDBCUtils.safeGetInt(ciList, "MAX_LEN");
                    JDBCConstants.TABLE_TYPE));
                                maxLength = 48;
        } catch (Exception e) {
    public Collection<? extends GenericSequence> getSequences(@NotNull DBRProgressMonitor monitor) throws DBException {
            return super.resolveDataKind(dataType.getTypeName(), dataType.getTypeID());
            }
    }

            ((GenericExecutionContext)context).refreshDefaults(monitor, true);

        }

        return dataTypeCache;

        return true;

    }
    boolean hasSchemas() {

    protected boolean catalogsFiltered;
        return structureContainer == null ? null : structureContainer.getTables(monitor);
    ) throws DBException {
import org.jkiss.dbeaver.model.struct.cache.SimpleObjectCache;
        } else if (structureContainer != null) {
    }
        if (isPopulateClientAppName() && !getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
    private String allObjectsPattern;
                monitor.subTask("Extract schemas");
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context, @NotNull String purpose) throws DBCException {
        super(monitor, container, dialect, false);
        }
            }
        } else if (adapter == DBDValueHandlerProvider.class) {
        boolean omitTypeCache = CommonUtils.toBoolean(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_OMIT_TYPE_CACHE));
                        break;
        }
                container = this.getSchema(schemaName);
            term += "s";

        protected GenericTableType fetchObject(@NotNull JDBCSession session, @NotNull GenericDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    }

            monitor.worked(1);
                        final String name = JDBCUtils.safeGetString(ciList, "NAME");
                    }
        super.initializeContextState(monitor, context, initFrom);
                    } else {
    }

    private void populateClientAppName(JDBCExecutionContext context, @NotNull String purpose, Connection jdbcConnection) {
        return selectedEntityType;
        this.initialize(monitor);
        return structureContainer == null ? null : structureContainer.getSynonyms(monitor);

                }
/**
    @Nullable
            }
            return null;
            DBCQueryTransformer transformer = ((DBCQueryTransformProvider) metaModel).createQueryTransformer(type);
        return structureContainer == null ? null : structureContainer.getProcedure(monitor, uniqueName);
        } else if (GenericConstants.TERM_SCHEMA.equals(objectType)) {
    @Override
    }
        this.querySetActiveDB = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_QUERY_SET_ACTIVE_DB));
    public String getAllObjectsPattern() {
            throw new DBDatabaseException("Error reading metadata", ex, this);
            getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SPLIT_PROCEDURES_AND_FUNCTIONS),
    @Override

        return metaModel.getMetaObject(id);
        if (!omitTypeCache) {
 * Copyright (C) 2010-2025 DBeaver Corp and others


        String paramShutdown = CommonUtils.toString(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SHUTDOWN_URL_PARAM));
                    ciList.close();
        this.schemas = null;
            if (queryPlanner == null) {
    }
    private String queryGetActiveDB;
    public Collection<GenericTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor)
        // Recreate URL from parameters
        if (schemas != null) {

    }
    public GenericTableBase getTable(@NotNull DBRProgressMonitor monitor, @NotNull String name)
        return structureContainer.getTableTriggerCache();
        return CommonUtils.getBoolean(
                    catalogNames.clear();

    }
    public GenericMetaModel getMetaModel() {
            connectionInfo.setUrl(connectionURL);
            }
    protected String getConnectionURL(DBPConnectionConfiguration connectionInfo) {
        } else if (schemas != null && !schemas.isEmpty()) {
    }
    @Override
    @Nullable
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_OMIT_SCHEMA), false);
        @Nullable String catalogName,
            } else if (schemas != null && !schemas.isEmpty()) {
    @Override
    String getQuerySetActiveDB() {
    }
            }
        try {
    @Override
        return getClass() != GenericDataSource.class;
            try {
    }

        protected void detectCaseSensitivity(DBSObject object) {
        @NotNull String tableName

        if (dataType != null) {
            term = getInfo().getCatalogTerm();
        throws DBException {
        return structureContainer == null ? null : structureContainer.getTriggers(monitor);
    private String querySetActiveDB;
    @Override

    GenericCatalog getDefaultCatalog() {
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_OMIT_CATALOG), false);
            }
                        if (CommonUtils.isEmpty(catalogName)) {
import java.text.Format;
            container = structureContainer;
        if (!CommonUtils.isEmpty(getCatalogs())) {
     * Disable by default. Some drivers fail to connect when client app name is specified
    private String selectedEntityType;
            try (JDBCResultSet dbResult = metaData.getCatalogs()) {
                // Error reading catalogs - just warn about it
            return null;
    public GenericProcedure getProcedure(@NotNull DBRProgressMonitor monitor, @NotNull String uniqueName) throws DBException {
                "Probably driver properties were changed. Please go to the connection '" + getContainer().getName() + "' editor.");
        return structureContainer.getConstraintKeysCache();
        if (param == null) {
                    }
        return jdbcConnection;
            for (GenericSchema schema : schemas.getCachedObjects()) schema.cacheStructure(monitor, scope);
    }
    public Collection<? extends GenericTrigger<?>> getTableTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
    private List<GenericCatalog> catalogs;
                    for (String catalogName : catalogNames) {
        return nativeFormatDate;
        }
    public GenericSchema getSchema() {
        return schemas == null ? null : schemas.getCachedObject(name);
    public GenericDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container, @NotNull GenericMetaModel metaModel, @NotNull SQLDialect dialect)
                queryPlanner = metaModel.getQueryPlanner(this);
    }
 * you may not use this file except in compliance with the License.
                            wasPopulated = true;
            this.allObjectsPattern = "%";
        }
            return GenericTable.class;
    @Nullable

                    } else {
                    if (catalogFilters == null || catalogFilters.matches(catalogName)) {
        if (supportsStructCacheParam != null) {

    }
            }
        return structureContainer.getIndexCache();
    }
            return !CommonUtils.isEmpty(catalogs) && catalogs.contains(object);
    @Association
                jdbcConnection.setClientInfo(JDBCConstants.APPLICATION_NAME_CLIENT_PROPERTY, appName);
    public GenericTableBase findTable(
                container = structureContainer;
            } else {
    public Collection<? extends GenericSynonym> getSynonyms(@NotNull DBRProgressMonitor monitor) throws DBException {

            log.debug("Catalog list not supported: " + e.getMessage());
        super.initialize(monitor);
                if (!CommonUtils.isEmpty(connectionInfo.getUserPassword())) {
    }
        } catch (Throwable ex) {
import org.jkiss.dbeaver.model.meta.Association;

                    List<GenericSchema> tmpSchemas = metaModel.loadSchemas(session, this, null);
                        if (e instanceof DBException) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ConstraintKeysCache getConstraintKeysCache() {
        }
            final ResultSet ciList = jdbcConnection.getMetaData().getClientInfoProperties();

    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
                        this.schemas = new SimpleObjectCache<>();
                ((JDBCSQLDialect) dialect).setSupportsSubqueries(CommonUtils.toBoolean(supportsSubqueries));
    public ForeignKeysCache getForeignKeysCache() {
            return null;
        return selectedEntityFromAPI;
        return queryGetActiveDB;
        return structureContainer == null ? null : structureContainer.getViews(monitor);
                if (!CommonUtils.isEmpty(connectionInfo.getUserName())) {
        return this;
            return session.getMetaData().getTableTypes().getSourceStatement();
            return structureContainer.getChild(monitor, childName);
                // Catalogs not supported - try to read root schemas
                int totalCatalogs = 0;
        boolean omitCatalog = isOmitCatalog();
            if (container == null) {
            if (CommonUtils.isEmpty(dataTypeCache.getCachedObjects())) {
        this.metaModel = metaModel;
        this.dataTypeCache = metaModel.createDataTypeCache(this);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    }
        final List<String> catalogNames = new ArrayList<>();
        Connection jdbcConnection = super.openConnection(monitor, context, purpose);
    public GenericCatalog getCatalog(String name) {
        return structureContainer == null ? null : structureContainer.getProcedures(monitor);
    public boolean splitProceduresAndFunctions() {
    private final TableTypeCache tableTypeCache;
    }

                // Use basic data types
            }

     * @param catalogName nullable catalog name for search (can be a parent or a grandparent)
    ) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
        } else if (!CommonUtils.isEmpty(getSchemas())) {
            if (ciList != null) {
    @Override
                DBPConnectionConfiguration connectionInfo = getContainer().getActualConnectionConfiguration();
            }
        return structureContainer == null ? null : structureContainer.getProceduresOnly(monitor);
        @NotNull
    public Collection<GenericPackage> getPackages(@NotNull DBRProgressMonitor monitor)
 */
                    if (monitor.isCanceled()) {
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
        if (!CommonUtils.isEmpty(queryShutdown)) {
            }
        }
    public boolean supportsCatalogChangeInTransaction() {
            } catch (Exception e) {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        }
            for (JDBCRemoteInstance instance : getAvailableInstances()) {
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) throws DBCException {

        throws DBException
    }
                GenericUtils.safeGetString(
            for (GenericSchema schema : schemas.getCachedObjects()) {
            } catch (Exception e) {
            if (metaModel.isCatalogsOptional()) {
    }
            this.selectedEntityType = null;

    public Collection<? extends GenericProcedure> getFunctionsOnly(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return connectionURL;

        return getContainer().getNavigatorSettings().isMergeEntities();
        return structureContainer == null ? null : structureContainer.getSequences(monitor);
    }
        }
        } else if (schemas != null && !schemas.isEmpty()) {
    @Override
                    try (JDBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, "Shutdown database")) {
            container = getCatalog(catalogName);
    public List<String> getCatalogsNames(
                throw new DBException("Error reading catalog list", e);


        return false;
        if (container == null) {
        if (CommonUtils.isEmpty(this.allObjectsPattern)) {
                monitor.worked(1);
    private boolean isChild(DBSObject object) throws DBException {
                        this.schemas.setCache(tmpSchemas);


    public TableCache getTableCache() {
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor)
        if (CommonUtils.isEmpty(this.selectedEntityType)) {
    void setSelectedEntityType(String selectedEntityType) {
    @NotNull
        throws DBException {
        String queryShutdown = CommonUtils.toString(getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_QUERY_SHUTDOWN));
            }
            return null;
            }

        this.metaModel = metaModel;
        }
 * See the License for the specific language governing permissions and
        initializeRemoteInstance(monitor);
 *
    }
        try {
            for (GenericCatalog catalog : catalogs) catalog.cacheStructure(monitor, scope);
        GenericMetaObject catalogObject,
                        log.warn("Can't read schema list", e);
                            }
    @Override
                try {
                } finally {
     *
            this.allObjectsPattern = null;
        return dataTypeCache.getAllObjects(monitor, this);
            return structureContainer.getTables(monitor);

                log.debug("Can't fetch database data types: " + e.getMessage());
    @Override
    public List<GenericCatalog> getCatalogs() {
    @Override
        this.selectedEntityFromAPI = selectedEntityFromAPI;
            return GenericCatalog.class;
    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {
                final DBSObjectFilter catalogFilters = getContainer().getObjectFilter(GenericCatalog.class, null, false);
        return new GenericDataSourceInfo(container.getDriver(), metaData);
    private DBCQueryPlanner queryPlanner;
                }
                }
        throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.meta.ForTest;
    @Override
    }
        nativeFormatTimestamp = makeNativeFormat(GenericConstants.PARAM_NATIVE_FORMAT_TIMESTAMP);
    @NotNull
        } else */
                    // It's ok to use "%" instead of catalog name anyway
        @Nullable String schemaName,
                    }
                    }
     */
    }
        if (structureContainer != null) {
        }
        super.refreshObject(monitor);
        this.selectedEntityType = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_ACTIVE_ENTITY_TYPE));

    }
package org.jkiss.dbeaver.ext.generic.model;
    }
    GenericSchema getDefaultSchema() {
    }
        this.catalogs = null;


    }
    }

        }
    public Collection<? extends DBSDataType> getDataTypes(@NotNull DBRProgressMonitor monitor) throws DBException {
        }



    public void shutdown(@NotNull DBRProgressMonitor monitor) {
    @ForTest
 * DBeaver - Universal Database Manager
    }
                        this.schemas.setCaseSensitive(getSQLDialect().storesUnquotedCase() != DBPIdentifierCase.MIXED);
    public Format getNativeFormatTimestamp() {
    public Collection<? extends DBSDataType> getLocalDataTypes() {
        return new GenericExecutionContext(instance, type);
            } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;


        } catch (Throwable e) {
import org.jkiss.dbeaver.model.exec.*;
                }
    @Override
        String connectionURL = getContainer().getDriver().getConnectionURL(connectionInfo);

    @Override
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSDataType;
    /**
            // Read metadata
        }
        this.tableTypeCache = new TableTypeCache();
                monitor.worked(1);
    @Override
