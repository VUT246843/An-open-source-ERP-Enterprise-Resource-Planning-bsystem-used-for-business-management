        JDBCResultSet dbResult
            if (tableFilters != null && tableFilters.hasSingleMask()) {
                    } catch (Throwable ignored) {
        DBSIndexType indexType,
                                        packageMap.put(packageName, procedurePackage);
        @NotNull GenericStructContainer owner,
        return "-- Source code not available";
    GenericMetaModelDescriptor descriptor;

    }
    // Schema with NULL name is a valid schema [Phoenix]
        if (isUtilityTable && !navigatorSettings.isShowUtilityObjects()) {
        return null;
        }
     * @param options for generated DDL

                            if (monitor.isCanceled()) {

                            oldCatalog = null;
                                default -> GenericFunctionResultType.UNKNOWN;
                                        procedurePackage = new GenericPackage(container, packageName, true);
    /**

import org.jkiss.dbeaver.model.sql.SQLUtils;

     * But it is better to read this DDL from a database directly. It can contain database-specific parameters.
            forParent == null ?
                    String schemaName = GenericUtils.safeGetString(schemaObject, dbResult, JDBCConstants.TABLE_SCHEM);
                    // Try to read functions (note: this function appeared only in Java 1.6 so it maybe not implemented by many drivers)
            }
    private static final Log log = Log.getLog(GenericMetaModel.class);
                    } else {
        Integer scale,
                try {
        int ordinalPos = GenericUtils.safeGetInt(columnObject, dbResult, JDBCConstants.ORDINAL_POSITION);
    ) throws DBException {
                                break;
    }
        String tableSchema = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_SCHEM);
    //////////////////////////////////////////////////////
     * They can have procedures/functions with equal names and different parameters (overloaded).
        // Caused problems in #6241. Probably we should remove it (for now getPackageName always returns null so it is disabled anyway)
        throw new DBCFeatureNotSupportedException();
            if (isSchemasOptional()) {

        @NotNull GenericStructContainer container,
    public GenericProcedure createProcedureImpl(
        @NotNull DBSProcedureType procedureType,
                    if (CommonUtils.isEmpty(schemaName)) {
            owner.getDataSource().getAllObjectsPattern())
    }
            // Catalog name specified while there are no catalogs in data source
    public boolean supportsUniqueKeys() {
        return tableType.toUpperCase(Locale.ENGLISH).contains(GenericConstants.TABLE_TYPE_VIEW);
        String typeName,
        GenericFunctionResultType functionResultType)
        @NotNull GenericTableBase table,

                            if (procedureName == null) {
                                specificName = procedureName;
        try {
                            }
    }
        return new GenericTableForeignKey(table, name, remarks, referencedKey, deleteRule, updateRule, deferability, persisted);
                                null);
                tableNamePattern = owner.getDataSource().getAllObjectsPattern();
                    if (nullSchema) {

                                specificName = functionName;
    }
        INVALID_TABLE_TYPES.add("INDEX");
    }
        return false;
        String remarks,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        throw new DBCFeatureNotSupportedException();
        return false;
        @NotNull GenericMetaObject tableObject,
        @NotNull GenericStructContainer owner,
    }
    }
    ) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        container.getCatalog() == null ? null : container.getCatalog().getName(),
                            }
            : GenericUtils.safeGetString(columnObject, dbResult, JDBCConstants.COLUMN_NAME);

                        schemasFiltered = true;

        return false;

            } finally {
                        log.debug("Error reading global schemas " + " - " + e.getMessage());
        }
        throw new DBCFeatureNotSupportedException();
                            if (packageName != null) {
     *                  "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
     */
        String constraintName,
    @Nullable


                                    if (packageMap == null) {
            : GenericUtils.safeGetString(tableObject, dbResult, JDBCConstants.TABLE_NAME);
        return true;
    // App will suppress any error during catalog read then
    // Misc
    public GenericTrigger createContainerTriggerImpl(

                            } else {
        return new GenericTable(
        @NotNull DBRProgressMonitor monitor,
                            GenericFunctionResultType functionResultType = switch (funcTypeNum) {
        return new GenericTableColumn(table,
            remarks, defaultValue, autoIncrement, autoGenerated
    }

                            if (functionName == null) {
                            procedureName = GenericUtils.normalizeProcedureName(procedureName);
        String qualifier,
            log.warn("Column '" + columnName + "' not found in table '" + parent.getFullyQualifiedName(DBPEvaluationContext.DDL) + "' for PK '" + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
            throw new DBDatabaseException(e, dataSource);

    public Integer extractPrecisionOfNumericColumn(int valueType, long columnSize) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public GenericDataSource createDataSourceImpl(

                                        container.addPackage(procedurePackage);
    // Constraints
        @NotNull String procedureName,
                            schemaName = GenericConstants.DEFAULT_NULL_SCHEMA_NAME;

        return session.getMetaData().getTables(
                log.error("Can't read schema list", ex);
                                log.debug("Broken driver [" + session.getDataSource().getContainer().getDriver().getName() + "] - returns the same list for getProcedures and getFunctons");
        DBSForeignKeyModifyRule updateRule,
        return null;
                        // Use general schema reading method
    ) throws DBException {
            .getSourceStatement();
        @NotNull JDBCSession session,
    }
        if (!CommonUtils.isEmpty(tableSchema) && dataSource.isOmitSchema()) {
                // incorrect results.
    // App will suppress any error during schema read then
import org.jkiss.code.NotNull;
    public JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> createDataTypeCache(
        @Nullable GenericTableBase forTable
    public GenericTableIndex createIndexImpl(
        );
    {
        return false;
    //////////////////////////////////////////////////////
        String triggerName,
        @NotNull JDBCResultSet dbResult
 * Generic meta model
                        container.getSchema() == null || DBUtils.isVirtualObject(container.getSchema()) ? null : JDBCUtils.escapeWildCards(session, container.getSchema().getName()),
            tableName,
        @Nullable GenericCatalog catalog
    @NotNull
        throw new SQLFeatureNotSupportedException();
        INVALID_TABLE_TYPES.add("SEQUENCE");
            } else if (dataSource.isSchemaFiltersEnabled()) {
    }
    public boolean isSystemTable(@NotNull GenericTableBase table) {
        @NotNull JDBCSession session,
/*
    public GenericSchema createSchemaImpl(@NotNull GenericDataSource dataSource, @Nullable GenericCatalog catalog, @NotNull String schemaName) throws DBException {
        try {
     * @throws DBException in case of session or metadata reading fall
            scale = GenericUtils.safeGetInteger(columnObject, dbResult, JDBCConstants.DECIMAL_DIGITS);

                    // Read procedures

            if (dataType != null) {

        @NotNull GenericDataSource dataSource,
    public boolean isFKConstraintWordDuplicated() {
        Integer precision = extractPrecisionOfNumericColumn(valueType, columnSize);
                }
        }
    ) throws SQLException {
            DBSDataType dataType = session.getDataSource().getLocalDataType(typeName);
            log.debug("Empty table name " + (owner == null ? "" : " in container " + owner.getName()));
                typeName = typeName.substring(0, typeName.length() - 2);

                        catalog.getName(),
            }

                    String catalogName = GenericUtils.safeGetString(schemaObject, dbResult, JDBCConstants.TABLE_CATALOG);
    ) throws DBException {
                } catch (Throwable e) {
                        dataSource.getAllObjectsPattern())
                            String procedureCatalog = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.PROCEDURE_CAT);
        boolean trimName = isTrimObjectNames();
    @NotNull
                } catch (Throwable e) {
                    }
import org.jkiss.dbeaver.ext.generic.GenericConstants;
    ) throws DBException {

                            if (monitor.isCanceled()) {
        return null;
            try {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
    //////////////////////////////////////////////////////

            return null;
        String procedureName,
import java.sql.SQLException;
        @Nullable JDBCResultSet dbResult)
                            DBSProcedureType procedureType = switch (procTypeNum) {
                            schemaFilters.getSingleMask() :
        // [JDBC: PostgreSQL]
            return null;

        return descriptor == null ? null : descriptor.getObject(id);
import org.jkiss.dbeaver.model.*;
        int radix,
    public GenericTableBase createTableImpl(
    public boolean supportsSynonyms(@NotNull GenericDataSource dataSource) {
    }
import org.jkiss.code.Nullable;
import java.sql.Types;
    //////////////////////////////////////////////////////
 *
    }
            columnName,
        return null;
        @NotNull GenericStructContainer genericStructContainer,
                                }
                        }
        @NotNull JDBCResultSet dbResult
    // True if catalogs can be omitted.
        if (tableType != null && INVALID_TABLE_TYPES.contains(tableType)) {

            charLength, scale, precision, radix, isNotNull,
    }
     * @param monitor to create session or to read metadata
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            }
import org.jkiss.utils.CommonUtils;
                                case DatabaseMetaData.procedureResultUnknown -> DBSProcedureType.PROCEDURE;
            GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_NAME)
        return false;
                            }
    public GenericTrigger<?> createTableTriggerImpl(
        @NotNull GenericDataSource dataSource,
                            }
 *
    ) throws DBException {
                        schemaName = GenericUtils.safeGetString(schemaObject, dbResult, JDBCConstants.TABLE_OWNER);
        @NotNull JDBCResultSet dbResult
    public boolean hasFunctionSupport() {
        JDBCResultSet dbResult,
     * We can generate a table DDL because we have attributes and constraints info.

            // Schemas are not supported
        String name,
            specificName,
        if (CommonUtils.isEmpty(tableName)) {

                    if (CommonUtils.isEmpty(schemaName)) {
        if (valueType == Types.NUMERIC || valueType == Types.DECIMAL) {
        Map<String, GenericPackage> packageMap = null;
    ) {
     * @param sourceObject source object with required name and parents info
                    if (isSchemasOptional()) {
                        }
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
            // Ignore tables with schema [Google Spanner]
                // Anyway using "%" instead is ok
        }
                    dbResult = session.getMetaData().getSchemas(
                    } else {
            if (tmpSchemas.isEmpty() && catalogSchemas && !schemasFiltered && dataSource.getCatalogs().size() == 1) {

        boolean autoIncrement,
                            if (!catalogSchemas) {
                        dataSource.getAllObjectsPattern())) {
    @NotNull
import java.sql.SQLFeatureNotSupportedException;
                            String functionName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.FUNCTION_NAME);
            radix = GenericUtils.safeGetInt(columnObject, dbResult, JDBCConstants.NUM_PREC_RADIX);
        String tableType = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_TYPE);
                                continue;
    public List<? extends GenericTrigger> loadTriggers(
        @Nullable String tableType,
    }
    }
            if (hasProcedureSupport()) {

            return null;

                                break;
    }
                    try (JDBCResultSet dbResult = session.getMetaData().getFunctions(
        DBSEntityReferrer referencedKey,
     * @return true if the database can have in one container procedure and function with equal names (considering parameters)
    }
                            final GenericProcedure procedure = createProcedureImpl(

                                remarks,
        if (!CommonUtils.isEmpty(typeName)) {
                                //case DatabaseMetaData.functionResultUnknown: functionResultType = GenericFunctionResultType.UNKNOWN; break;
import java.sql.DatabaseMetaData;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                        log.debug("Error reading schemas in catalog '" + catalog.getName() + "' - " + e.getClass().getSimpleName() + " - " + e.getMessage());
                                case DatabaseMetaData.functionReturnsTable -> GenericFunctionResultType.TABLE;
        return true;
        String defaultValue = GenericUtils.safeGetString(columnObject, dbResult, JDBCConstants.COLUMN_DEF);
        } catch (Throwable e) {
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
                owner.getDataSource().getAllObjectsPattern() :
        boolean persisted
                                DBSProcedureType.FUNCTION,
        @NotNull DBPDataSourceContainer container
                try {
    //////////////////////////////////////////////////////
                                case DatabaseMetaData.procedureNoResult -> DBSProcedureType.PROCEDURE;

        return new GenericCatalog(dataSource, catalogName);
        boolean notNull,
            // [JDBC: SQLite] Escaped column name. Let's un-escape it
                }


    @Nullable
            return null;

                if (supportsCatalogChange() && catalog != null) {



 * Licensed under the Apache License, Version 2.0 (the "License");
        return new GenericUniqueKey(table, constraintName, null, constraintType, persisted);
 * See the License for the specific language governing permissions and
        throws SQLException
                    // Read procedures
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public boolean useCatalogInObjectNames() {
    public JDBCStatement prepareForeignKeysLoadStatement(
        if (dataSource.isOmitSchema()) {
                    }
        int valueType,
            } else {
    public boolean isColumnNotNullByDefault() {
        }
        return true;
            indexName,
            // Fix value type
     * @return precision of the numeric column or null
                (columnName.startsWith(SQLConstants.DEFAULT_IDENTIFIER_QUOTE) && columnName.endsWith(SQLConstants.DEFAULT_IDENTIFIER_QUOTE))) {
                            };
    }
                try {
        return DBStructUtils.generateTableDDL(
     */
        @Nullable String remarks,


                    dbResult = session.getMetaData().getSchemas(
import org.jkiss.dbeaver.DBException;
     * @param valueType type id
    public GenericSynonym createSynonymImpl(
            owner.getSchema() == null || DBUtils.isVirtualObject(owner.getSchema()) ? null : owner.getSchema().getName(),
     * But other databases can have tables, columns, etc. with spaces around their names
        long cardinality,
                            String specificName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.SPECIFIC_NAME);
            remarks, defaultValue, autoIncrement, autoGenerated
    public boolean supportsOverloadedProcedureNames() {
     *  <LI><B>REF_GENERATION</B> String {@code =>} specifies how values in
        @NotNull JDBCSession session,
        }
                            GenericProcedure function = funcMap.get(specificName);
                            String procedureName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.PROCEDURE_NAME);
        @NotNull JDBCSession session,
        return tableType.contains("SYSTEM");
        int sourceType = GenericUtils.safeGetInt(columnObject, dbResult, JDBCConstants.SOURCE_DATA_TYPE);
                        }
            tableType,
                        supportsFunctions = true;
        }
            owner.getSchema() == null || DBUtils.isVirtualObject(owner.getSchema()) ? null : JDBCUtils.escapeWildCards(session, owner.getSchema().getName()),

                            dataSource.getAllObjectsPattern());
            }
                dbResult.close();
    ) throws DBException {
                                // Invalid schema's catalog or schema without catalog (then do not use schemas as structure)
                        null,
        DBSForeignKeyModifyRule deleteRule,

    // in DatabaseMetaData.getTables method (PostgreSQL especially)
            columnName = columnName.substring(1, columnName.length() - 1);
                    }

    ) {
                    log.debug("Can't read generic functions", e);
        }
            GenericUtils.safeGetStringTrimmed(pkObject, dbResult, JDBCConstants.COLUMN_NAME)
                forParent.getName())

    }
        String remarks = GenericUtils.safeGetString(columnObject, dbResult, JDBCConstants.REMARKS);
                            schemaFilters.getSingleMask() :
        @NotNull DBRProgressMonitor monitor,
                                    supportsFunctions ? DBSProcedureType.PROCEDURE : DBSProcedureType.FUNCTION;
                        // some drivers uses TABLE_OWNER column instead of TABLE_SCHEM
    public GenericUniqueKey createConstraintImpl(
                container,
        return false;


            return new GenericView(
        GenericMetaObject procObject = dataSource.getMetaObject(GenericConstants.OBJECT_PROCEDURE);
                                break;
    }
                        try {
     *  <LI><B>TABLE_TYPE</B> String {@code =>} table type.  Typical types are "TABLE",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        String columnName,
    public DBPErrorAssistant.ErrorPosition getErrorPosition(@NotNull Throwable error) {

    }

    @NotNull
    public GenericTableColumn fetchTableColumn(
                dbResult);
                autoIncrement = true;
        return table;
        @Nullable JDBCResultSet dbResult,
        boolean autoGenerated = "YES".equals(GenericUtils.safeGetStringTrimmed(columnObject, dbResult, JDBCConstants.IS_GENERATEDCOLUMN));
                                    }
     * @param sourceObject source object with required name and parents info

                            continue;
            session.getProgressMonitor(),
                        while (dbResult.next()) {
                            }
                                procedureName,
            // Check for empty modifiers [MS SQL]
        return false;
     * Returns SQL clause for table column auto-increment.
    public boolean isTableColumnCommentEditable() {
        INVALID_TABLE_TYPES.add("TYPE");
        if (isSystemTable && !navigatorSettings.isShowSystemObjects()) {
                                procedureType,
        @NotNull JDBCResultSet resultSet
        String deleteClause = deleteRule.getClause();

    public boolean isCatalogsOptional() {
        if (tableType != null && isView(tableType)) {
    }
        @Nullable GenericTableBase forParent
            cardinality,

     *
            return null;
     *                  "SYSTEM", "USER", "DERIVED". (may be <code>null</code>)
    public boolean supportsDatabaseTriggers(@NotNull GenericDataSource dataSource) {
        }
            log.debug("Null primary key column for '" + object.getName() + "'");
    //////////////////////////////////////////////////////
    protected String getDefaultTypeName() {
                                procedurePackage.addProcedure(procedure);
    // Container triggers (not supported by default)
import java.util.*;
     * May also contain any other db-specific columns
     *  <LI><B>TABLE_SCHEM</B> String {@code =>} table schema (may be <code>null</code>)
                tableName,
    public String getPackageName(
                        // This method not supported (may be old driver version)
                        // Doesn't match filter

        @NotNull GenericStructContainer container,
    ) throws DBException {



            null).getSourceStatement();
                    if (session.getProgressMonitor().isCanceled()) {
 * You may obtain a copy of the License at
    }
        return false;
        return false;
        } catch (Throwable ex) {
    }
        if (CommonUtils.isEmpty(columnName)) {
                throw new DBDatabaseException(ex, dataSource);
    ) throws DBException {
     * Will set precision for type from length if type can have precision

        return false;
                        if (supportsNullSchemas()) {

        boolean autoGenerated


            return "ON DELETE " + deleteClause;
    public DBCQueryPlanner getQueryPlanner(@NotNull GenericDataSource dataSource) {
        DBSEntityConstraintType constraintType,
        @Nullable GenericTableBase table
        @NotNull JDBCResultSet dbResult
    public void loadProcedures(@NotNull DBRProgressMonitor monitor, @NotNull GenericObjectContainer container)
    public boolean supportsNullSchemas() {
        @NotNull JDBCSession session,
    ) throws DBException {
        @NotNull JDBCSession session,
        String specificName
    public JDBCStatement prepareTableLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable GenericTableBase object, @Nullable String objectName)
            typeName = getDefaultTypeName();
import org.jkiss.dbeaver.DBDatabaseException;
    }
    }
    /**
        } catch (UnsupportedOperationException | SQLFeatureNotSupportedException e) {
    protected boolean supportsCatalogChange() {
                while (dbResult.next()) {
        @NotNull GenericProcedure sourceObject
    }
        @NotNull GenericStructContainer genericStructContainer,
        return null;
    }

    ) throws DBException {
    static {
                                // Broken driver
     *                  SELF_REFERENCING_COL_NAME are created. Values are
        GenericMetaObject columnObject = owner.getDataSource().getMetaObject(GenericConstants.OBJECT_TABLE_COLUMN);
        return "-- View definition not available";
    public String getTriggerDDL(
        boolean persisted
        {
                        container.getSchema() == null || DBUtils.isVirtualObject(container.getSchema()) ? null : JDBCUtils.escapeWildCards(session, container.getSchema().getName()),
    }
    }
                                //functionName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.PROCEDURE_NAME);
        }
        @NotNull GenericTableBase table,
            boolean catalogSchemas = false, schemasFiltered = false;
        if (object == null && objectName == null) {
        return true;
     */
    public GenericMetaObject getMetaObject(String id) {

    }
            return tmpSchemas;
            // Check for packages. Oracle (and may be some other databases) uses catalog name as a storage for package name
    public String getTableDDL(
            owner.getSchema() == null || DBUtils.isVirtualObject(owner.getSchema()) ? null : owner.getSchema().getName(),
                        } catch (Throwable e) {
        GenericDataSource dataSource = owner.getDataSource();
                                    }
                            String specificName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.SPECIFIC_NAME);
        return createTableColumnImpl(
        return false;
                            String remarks = GenericUtils.safeGetString(procObject, dbResult, JDBCConstants.REMARKS);
        GenericDataSource dataSource = container.getDataSource();
import org.jkiss.dbeaver.ext.generic.model.*;
    // Triggers
                        schema.setVirtual(true);
            procedureName,
        throw new SQLFeatureNotSupportedException();

                String oldCatalog = null;
    public GenericMetaModel()
                }
        return session.getMetaData().getPrimaryKeys(
        @NotNull JDBCSession session,

        @NotNull JDBCSession session,
        long columnSize = GenericUtils.safeGetLong(columnObject, dbResult, JDBCConstants.COLUMN_SIZE);
        String remarks,
                    }


            return null;
        return session.getMetaData().getColumns(
        }

        if (table == null) {
                // There is just one catalog and empty schema list. Try to read global schemas
    }
                    boolean nullSchema = false;
        if ((columnName.startsWith("[") && columnName.endsWith("]")) ||
    }
                    }
    public GenericSequence createSequenceImpl(

                    tmpSchemas.add(schema);
    }
        int radix = 10;
        if (!CommonUtils.isEmpty(deleteClause)) {
    // True if schemas can be omitted.
            ((JDBCDataSourceInfo) dataSourceInfo).supportsViews();
    public boolean hasProcedureSupport() {
            final List<GenericSchema> tmpSchemas = new ArrayList<>();
                            if (specificName == null && functionName.indexOf(';') != -1) {
                        }
            JDBCResultSet dbResult = null;
    public String getViewDDL(
            if (typeName.endsWith("()")) {
                                specificName,
    /**
                                procedurePackage != null ? procedurePackage : container,

        GenericTableColumn tableColumn = parent.getAttribute(session.getProgressMonitor(), columnName);
        DBSForeignKeyDeferability deferability,
            log.debug("Can't read schema list: " + e.getMessage());
                if (!CommonUtils.isEmpty(tableNamePattern)) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
            owner.getCatalog() == null ? null : owner.getCatalog().getName(),
                // In some drivers (e.g. jt400) reading schemas with empty catalog leads to
        return true;
    // Some database (like Informix) do not support foreign key declaration as nested.
                    }
            return null;
 * you may not use this file except in compliance with the License.
                        oldCatalog = session.getCatalog();
    }
        @NotNull JDBCSession session,
    // Catalog load
                            // FIXME: remove as a silly workaround
    public GenericTableForeignKey createTableForeignKeyImpl(

    }
        Integer scale = null;
        INVALID_TABLE_TYPES.add("SYSTEM INDEX");
        return session.getMetaData().getImportedKeys(
                            if (CommonUtils.isEmpty(specificName)) {
    {
        int keySeq = GenericUtils.safeGetInt(pkObject, dbResult, JDBCConstants.KEY_SEQ);
    }
        try {
        @NotNull DBRProgressMonitor monitor,
     * @return true if we trim objects names, false - if not
    @Nullable
     * Some drivers return columns, tables or other objects names with extra spaces around (like FireBird)
    // Comments
    // Tables
                    //session.getProgressMonitor().subTask("Schema " + schemaName);
                            if (function != null && !supportsEqualFunctionsAndProceduresNames()) {
        }
     *
                        }

    }
            columnName,
                    if (!CommonUtils.isEmpty(catalogName)) {
        // [JDBC: SQLite]
                // Most likely it is a fake one, let's skip it
                valueType = dataType.getTypeID();
                try {
    public String generateOnDeleteFK(@NotNull DBSForeignKeyModifyRule deleteRule) {
    }
                        schemaFilters != null && schemaFilters.hasSingleMask() ?
                            log.debug("Error while setting active catalog name back to '" + oldCatalog + "'", e);
            }
            boolean supportsFunctions = false;
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
    public boolean isTableCommentEditable() {
                        container.getCatalog() == null ? null : container.getCatalog().getName(),
     * We can only read the view DDL from the database directly.
    public boolean supportNestedForeignKeys() {

        @NotNull GenericTableBase genericTableBase,
     *
     * @param monitor to create session or to read metadata
        return true;
                }
    public String generateOnUpdateFK(@NotNull DBSForeignKeyModifyRule updateRule) {
            tableNamePattern,
                                continue;
        @NotNull DBRProgressMonitor monitor,
     * Prepares statement which returns results with following columns (the same as in JDBC spec).

        @NotNull GenericTableBase table,
            : GenericUtils.safeGetString(pkObject, dbResult, JDBCConstants.COLUMN_NAME);
                } catch (Throwable e) {
            final DBSObjectFilter schemaFilters = dataSource.getContainer().getObjectFilter(GenericSchema.class, catalog, false);
            // Wrong schema - this may happen with virtual schemas
        );
            }
            owner.getCatalog() == null ? null : owner.getCatalog().getName(),
        } catch (Exception e) {
     *                  "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY",
            //return catalogName;
     * Many databases can not have procedures and functions with equal specific names - this is database restriction.
 * DBeaver - Universal Database Manager
    public boolean isView(@NotNull String tableType) {
        return false;
                    try (JDBCResultSet dbResult = session.getMetaData().getProcedures(
        @Nullable String tableName,
                                // [JDBC: SQL Server native driver]
    public GenericTableBase createTableOrViewImpl(
    //////////////////////////////////////////////////////
            table,

            tableType,

            if (typeName.toUpperCase(Locale.ENGLISH).endsWith(GenericConstants.TYPE_MODIFIER_IDENTITY)) {
    }
        return "-- Source code not available";
                typeName = typeName.substring(0, typeName.length() - GenericConstants.TYPE_MODIFIER_IDENTITY.length());
                                functionName = functionName.substring(0, functionName.lastIndexOf(';'));
    }
        @NotNull JDBCSession session,
    // Datasource
    }
        @NotNull GenericStructContainer container,
                return loadSchemas(session, dataSource, null);
                        } else {
                            }
    {
        @NotNull GenericTableBase table,
        if (DBUtils.isVirtualObject(owner) && !CommonUtils.isEmpty(tableSchema)) {

        return new GenericSchema(dataSource, catalog, schemaName);
            log.warn("Error getting column scale", e);
            columnSize,
            dbResult);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                        break;
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
    }
            // In fact it is a legacy code from ancient times (before Oracle extension was added).
     * @throws DBException in case of session or metadata reading fall
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
            owner.getCatalog() == null ? null : owner.getCatalog().getName(),

        @NotNull GenericUniqueKey object,
        @NotNull JDBCSession session,
    /**
        boolean persisted)
                    ) {
     *  <LI><B>TYPE_SCHEM</B> String {@code =>} the types schema (may be <code>null</code>)
            persisted);
    }
        String updateClause = updateRule.getClause();
    }
        if (tableColumn == null) {
    public boolean isSchemasOptional() {
                JDBCUtils.escapeWildCards(session, forTable.getName()),
    }
     */
    }
                                functionResultType);
    public JDBCStatement prepareTableTriggersLoadStatement(

    //////////////////////////////////////////////////////
    ) {
                            session.setCatalog(catalog.getName());
    ) throws SQLException {
    }
        @NotNull JDBCResultSet resultSet
     *  <LI><B>TYPE_NAME</B> String {@code =>} type name (may be <code>null</code>)
                                container.addProcedure(procedure);
    }
        @NotNull JDBCSession session,
        @NotNull GenericStructContainer container
        @NotNull GenericTrigger trigger
    }
            }
            // Check for identity modifier [DBSPEC: MS SQL]
    ) {
            monitor, sourceObject, options, false);
        @NotNull GenericView sourceObject,
    @NotNull
        throw new SQLFeatureNotSupportedException();
            .getSourceStatement();
    ) throws SQLException {

        return false;
                            session.setCatalog(oldCatalog);
        Map<String, GenericProcedure> funcMap = new LinkedHashMap<>();
                            }
    public boolean showProcedureParamNames() {
                                continue;

        long columnSize,


        }
        }
     *
 *
                            if (procedurePackage != null) {
     *  <LI><B>REMARKS</B> String {@code =>} explanatory comment on the table
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
            if (dataSource.isOmitSingleSchema() && catalog == null && tmpSchemas.size() == 1 && (schemaFilters == null || schemaFilters.isNotApplicable())) {
    }
    }
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {
                // Schemas are not supported - just ignore this error
                            final GenericProcedure procedure = createProcedureImpl(
                                case DatabaseMetaData.procedureReturnsResult ->
        throw new DBCFeatureNotSupportedException();
    public boolean isSystemSchema(GenericSchema schema) {
    // Table columns

            final GenericMetaObject schemaObject = getMetaObject(GenericConstants.OBJECT_SCHEMA);
    public boolean isUtilityTable(@NotNull GenericTableBase table) {
    ) {

        String columnName = trimName ?
        @Nullable GenericTableBase forParent
     * @return table DDL
            remarks,
        return new GenericTableIndex(

    public boolean handleSequenceCacheReadingError(Exception error) {
     *  </OL>
                                    if (procedurePackage == null) {
     * @return view DDL
        }
                                    procedurePackage = packageMap.get(packageName);

            owner,
    // Schema load
     *  <LI><B>TYPE_CAT</B> String {@code =>} the types catalog (may be <code>null</code>)
        DBNBrowseSettings navigatorSettings = dataSource.getContainer().getNavigatorSettings();

            tableNamePattern = JDBCUtils.escapeWildCards(session, (object != null ? object.getName() : objectName));
        @NotNull GenericStructContainer container
                        while (dbResult.next()) {
                        try {
        } catch (SQLException e) {
        String specificName,
            typeName, valueType, sourceType, ordinalPos,
    }
        INVALID_TABLE_TYPES.add("TRIGGER");
    }
                }
    public GenericTableColumn createTableColumnImpl(
        return false;
    }
    //////////////////////////////////////////////////////
                            }
        return new GenericTableConstraintColumn[] {
    {
                    if (oldCatalog != null && !CommonUtils.equalObjects(oldCatalog, catalog.getName())) {
        return new GenericProcedure(
                    }
                    tableNamePattern = SQLUtils.makeSQLLike(tableNamePattern);
                                // It may be a function?
            tableName,
    public GenericCatalog createCatalogImpl(@NotNull GenericDataSource dataSource, @NotNull String catalogName) {
    public JDBCStatement prepareContainerTriggersLoadStatement(
                            log.debug("Catalog name '" + catalogName + "' differs from schema's catalog '" + catalog.getName() + "'");
     *  <LI><B>TABLE_CAT</B> String {@code =>} table catalog (may be <code>null</code>)
            owner.getCatalog() == null ? null : owner.getCatalog().getName(),
    }
     *  <OL>
            dbResult,
    public GenericTableConstraintColumn[] createConstraintColumnsImpl(
 */
        }
            final DBSObjectFilter tableFilters = session.getDataSource().getContainer().getObjectFilter(GenericTable.class, owner, false);
            columnSize,

     *  <LI><B>TABLE_NAME</B> String {@code =>} table name
    public JDBCStatement prepareSequencesLoadStatement(
     * @param columnSize length of the column

    @NotNull

            }
            }
        return "N/A";  //$NON-NLS-1$
    }
     * For this reason we usually trim it from our side
        throw new SQLFeatureNotSupportedException();
                                remarks,
                                // Just skip it - we have list of all existing schemas and this one belongs to another catalog
        String tableNamePattern;
                        schemaFilters != null && schemaFilters.hasSingleMask() ?
     *                  "identifier" column of a typed table (may be <code>null</code>)
            forTable == null ?
                    catalogSchemas = true;
        @NotNull Map<String, Object> options
                                functionName,
     */
                                        packageMap = new TreeMap<>();
            // Bad table type. Just skip it
    //////////////////////////////////////////////////////
     * Null if auto-increment is not supported.
            }
    //////////////////////////////////////////////////////
                        throw e;
        }
            return null;
        GenericMetaObject pkObject,
import org.jkiss.dbeaver.Log;
        boolean nonUnique,
                                // so let's skip yet another procedure list
                                // Seems to be a duplicate
                    }


    /**
        if (!CommonUtils.isEmpty(updateClause)) {

     */
        int valueType = GenericUtils.safeGetInt(columnObject, dbResult, JDBCConstants.DATA_TYPE);

                    } else {
                }
        }
    }



import org.jkiss.dbeaver.model.struct.*;
    public boolean isTrimObjectNames() {
        return false;
        @NotNull GenericStructContainer container,
    }
                            container.addProcedure(procedure);
    }
        @NotNull JDBCSession session,
        return DBSEntityConstraintType.PRIMARY_KEY;
    ) throws SQLException {
        String columnName = isTrimObjectNames() ?
            return "ON UPDATE " + updateClause;
                                // Apparently some drivers return the same results for getProcedures and getFunctions -
            return null;

            .getSourceStatement();
        return new GenericDataTypeCache(container);
        @NotNull GenericTableBase table,

    }
        return false;
            charLength, scale, precision, radix, notNull,
    }
                    if (isSchemasOptional()) {
    public String getProcedureDDL(
        @NotNull GenericStructContainer container,
            if (hasFunctionSupport()) {

                return null;
        } else {
    ) throws DBException {
    }
        DBPDataSourceInfo dataSourceInfo = dataSource.getInfo();

                            };
            return Math.toIntExact(columnSize);

import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
                                if (!CommonUtils.isEmpty(packageName)) {
    }
                                case DatabaseMetaData.functionNoTable -> GenericFunctionResultType.NO_TABLE;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        String defaultValue,
        @NotNull GenericStructContainer owner,
                    dbResult = session.getMetaData().getSchemas();
     * @param options for generated DDL
     *  <LI><B>SELF_REFERENCING_COL_NAME</B> String {@code =>} name of the designated
public class GenericMetaModel {
        Integer precision,
    }
        @NotNull GenericStructContainer owner,
        boolean isSystemTable = table.isSystem();
                            }
    // Tables types which are not actually a table
                    if (oldCatalog != null) {
            if (catalog != null) {
        @NotNull GenericStructContainer container,
        int ordinalPos,
                        oldCatalog = null;
    @NotNull
        long charLength = GenericUtils.safeGetLong(columnObject, dbResult, JDBCConstants.CHAR_OCTET_LENGTH);
    @Nullable
    @NotNull
        @NotNull GenericStructContainer owner,
import org.jkiss.dbeaver.model.sql.SQLConstants;
    }
                log.warn("Can't read schema list", ex);
        boolean showComments = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);
        @NotNull GenericTableBase parent,
            typeName, valueType, sourceType, ordinalPos,
                            funcMap.put(specificName == null ? functionName : specificName, procedure);
        boolean isNotNull = GenericUtils.safeGetInt(columnObject, dbResult, JDBCConstants.NULLABLE) == DatabaseMetaData.columnNoNulls;
    public boolean supportsNotNullColumnModifiers(DBSObject object) {

        String catalogName,
    public boolean supportsEqualFunctionsAndProceduresNames() {
    }
    ) throws DBException {


    /**
                    }


                } finally {
        @Nullable GenericTableBase forParent
        @NotNull DBRProgressMonitor monitor,

        }
            } else {
            log.warn("Error getting column radix", e);
            log.debug("Ignore table " + tableSchema + "." + tableName + " (schemas are omitted)");
    ) throws SQLException {
                owner.getDataSource().getAllObjectsPattern() :
    {
                            String packageName = getPackageName(dataSource, procedureCatalog, procedureName, specificName);
        @NotNull DBRProgressMonitor monitor,
        String tableName = isTrimObjectNames()?
        return false;
        return !(dataSourceInfo instanceof JDBCDataSourceInfo) ||
    ) throws SQLException, DBException {
    @NotNull
    public boolean supportsViews(@NotNull GenericDataSource dataSource) {
        String indexName,
                    }
    @Nullable
    @NotNull
    // Indexes
    // Procedure load
        INVALID_TABLE_TYPES.add("SYSTEM SEQUENCE");
                        throw e;
        if (!CommonUtils.isEmpty(catalogName) && CommonUtils.isEmpty(dataSource.getCatalogs())) {

        String typeName = GenericUtils.safeGetStringTrimmed(columnObject, dbResult, JDBCConstants.TYPE_NAME);
     */
                                log.debug("Catalog name (" + catalogName + ") found for schema '" + schemaName + "' while schema doesn't have parent catalog");

                        } catch (Throwable e) {
                            if (!dataSource.isOmitCatalog()) {
/**
            nonUnique,
        long charLength,
            }
                new GenericTableConstraintColumn(object, tableColumn, keySeq) };
    }
        throws DBException
                            }
                            }
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
                    // Try to set catalog explicitly. May be needed for old drivers (Netezza)
        int sourceType,
            GenericUtils.safeGetStringTrimmed(columnObject, dbResult, JDBCConstants.COLUMN_NAME)
            owner.getSchema() == null || DBUtils.isVirtualObject(owner.getSchema()) ? null : JDBCUtils.escapeWildCards(session, owner.getSchema().getName()),

        @Nullable GenericStructContainer forParent
    }
                        }
        }
            qualifier,
    // This is needed for some strange JDBC drivers which returns not a table objects
                            int procTypeNum = GenericUtils.safeGetInt(procObject, dbResult, JDBCConstants.PROCEDURE_TYPE);
    }
    public JDBCStatement prepareUniqueConstraintsLoadStatement(
                tableType,
    /**
            return null;
            return null;
        return null;
    }
        @NotNull GenericTableBase sourceObject,
                    }


        return true;

    public JDBCStatement prepareTableColumnLoadStatement(
}
        @NotNull DBRProgressMonitor monitor,
                    try {
        GenericTableBase table = this.createTableOrViewImpl(
        @NotNull Map<String, Object> options
    public String getAutoIncrementClause(GenericTableColumn column) {
    //////////////////////////////////////////////////////
                            }
                }
                    }
                            String remarks = GenericUtils.safeGetString(procObject, dbResult, JDBCConstants.REMARKS);
                    GenericSchema schema = createSchemaImpl(dataSource, catalog, schemaName);
    // DDL for these tables must contain definition of FK outside main brackets (ALTER TABLE ... ADD CONSTRAINT FOREIGN KEY)
                        continue;
        @NotNull GenericStructContainer container
    public DBSEntityConstraintType getUniqueConstraintType(@NotNull JDBCResultSet dbResult) throws DBException, SQLException {

            table,


    }
        return false;
                    }
                }
    public boolean supportsUpsertStatement() {
                            if (container.hasProcedure(functionName)) {
                {
        return null;

        final String tableType = table.getTableType().toUpperCase(Locale.ENGLISH);
                        if (catalog == null) {
        return new ArrayList<>();
                                default -> DBSProcedureType.UNKNOWN;
            procedureType,
            functionResultType);
            }
    ) throws SQLException {
        return false;

                        } else if (!catalog.getName().equals(catalogName)) {
    // Sequences
        }
        }
    }

    public boolean supportsCheckConstraints() {
                            int funcTypeNum = GenericUtils.safeGetInt(procObject, dbResult, JDBCConstants.FUNCTION_TYPE);
        return true;
 */
    public JDBCStatement prepareSynonymsLoadStatement(
                // Only one schema and no catalogs

        return false;
            container,
    }
            dbResult);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load procedures")) {
    {

    private static final Set<String> INVALID_TABLE_TYPES = new HashSet<>();
        }
            if (dbResult == null) {
        @NotNull JDBCSession session,

            container,

                tmpSchemas.clear();
                tableNamePattern = tableFilters.getSingleMask();

                            nullSchema = true;
                                container,
     *
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            dataSource.getAllObjectsPattern());
            forParent == null ? owner.getDataSource().getAllObjectsPattern() : forParent.getName())

    public List<GenericSchema> loadSchemas(
        boolean isUtilityTable = table.isUtility();
 * Copyright (C) 2010-2026 DBeaver Corp and others
                                specificName,
                                continue;
    // Synonyms
                    if (schemaFilters != null && !schemaFilters.matches(schemaName)) {
        return new GenericDataSource(monitor, container, this, new GenericSQLDialect());
    ) throws DBException {
package org.jkiss.dbeaver.ext.generic.model.meta;
                            GenericPackage procedurePackage = null;

            indexType,
        boolean autoIncrement = "YES".equals(GenericUtils.safeGetStringTrimmed(columnObject, dbResult, JDBCConstants.IS_AUTOINCREMENT));
