            try (DBCSession session = DBUtils.openUtilSession(monitor, this, "Read row count")) {
        this.getContainer().getTableCache().getChildrenCache(this).cacheObject(column);
    public boolean isPhysicalTable() {
        }
            return getContainer().getForeignKeysCache().getObject(monitor, getContainer(), this, name);
        @NotNull GenericStructContainer container,

                for (GenericTableIndex index : indexList) {
        this.getContainer().getForeignKeysCache().clearObjectCache(this);
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
            getSchema() == null ? null : getSchema().getName(),

    }
    }
                //String fkTableFullName = DBUtils.getFullyQualifiedName(getDataSource(), info.fkTableCatalog, info.fkTableSchema, info.fkTableName);



        if (getDataSource().getInfo().supportsReferentialIntegrity() || getDataSource().getInfo().supportsIndexes()) {
    }
        return "EXTERNAL_TABLE".equals(tableType);
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
import java.util.*;

    }
                return tableTriggerCache.getObjects(monitor, parentObject, this);
        }
            // ensure all columns are already cached
            return fkList;

        return container.getSchema();
                if (fkColumn == null) {
        throws DBException {
        super(container, tableName, dbResult != null);
            getDataSource().getCatalog(tableCatalogName);
                // do not throw this error - row count is optional info and some providers may fail
        return null;

        return tableCatalogName;
                    log.warn("Can't find FK table " + fkTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + " column " + info.fkColumnName);
            final Collection<? extends GenericTableIndex> indexList = getIndexes(monitor);
    @Override
            getContainer().getTableCache().getChildrenCache(this);
        }
                    if (index.isUnique()/* || index.getIndexType() == DBSIndexType.STATISTIC*/) {
        this.getContainer().getTableTriggerCache().clearObjectCache(this);
    public List<GenericUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
                        fkList.add(fk);
    //@Property(viewable = true, optional = true, order = 3)
                if (pkColumn == null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
            getCatalog() == null ? null : getCatalog().getName(),
            this.tableType = "";
                DBSForeignKeyModifyRule deleteRule = JDBCUtils.getCascadeFromNum(info.deleteRuleNum);
            getDataSource().getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SUPPORTS_TRUNCATE),

                    GenericTableForeignKeyColumnTable fkColumnInfo = new GenericTableForeignKeyColumnTable(fk, fkColumn, info.keySeq, pkColumn);
        return this.getContainer().getTableCache().refreshObject(monitor, getContainer(), this);

    @Nullable
/*
            return DBUtils.getFullQualifiedName(
            List<GenericTableForeignKey> fkList = new ArrayList<>();
            this.description = GenericUtils.safeGetString(container.getTableCache().getTableObject(), dbResult, JDBCConstants.REMARKS);
        }
        return null;
                }
            supportsUniqueKeys
        boolean mergeEntities = container.getDataSource().isMergeEntities();

            getDataSource(),
            // Do not count rows for views
            // Read foreign keys in two passes
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    public Collection<? extends GenericTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor)
                GenericTableColumn pkColumn = this.getAttribute(monitor, info.pkColumnName);

public abstract class GenericTableBase extends JDBCTable<GenericDataSource, GenericStructContainer> implements DBPRefreshableObject, DBPSystemObject, DBPScriptObject {
                        // No choice, we have to create fake foreign key :(
        boolean supportsUniqueKeys = getContainer().getDataSource().getMetaModel().supportsUniqueKeys();
        }

        @Nullable String tableName,
                }
                }
        throws DBException {
            return this.getContainer().getIndexCache().getObjects(monitor, getContainer(), this);
        if (childrenCache != null) {
                if (fk == null) {

        this.getContainer().getConstraintKeysCache().clearObjectCache(this);
    @Override
import org.jkiss.dbeaver.model.*;
    // Comment row count calculation - it works too long and takes a lot of resources without serious reason
    }
        this.description = description;
        }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
                    continue;
            } else {
    }
        }
    public boolean isUtility() {
        DBPDataSourceInfo dataSource = getDataSource().getInfo();
        GenericStructContainer parentObject = getParentObject();

            return childrenCache.getCachedObjects();
                    return null;
                    if (uniqueKeys != null) {
    public TableCache getCache() {
            false);
                getSchema(),
            getSchema(),
                    info.fkName = info.fkTableName.toUpperCase() + "_FK" + info.keySeq;
        try (JDBCResultSet dbResult = metaData.getExportedKeys(


        if (Boolean.FALSE.equals(getDataSource().getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_SUPPORTS_SELECT_COUNT))) {
                rowCount = countData(
    @Property(viewable = true, optional = true, order = 3, labelProvider = GenericCatalog.CatalogNameTermProvider.class)


import org.jkiss.code.NotNull;
        this.tableSchemaName = tableSchemaName;
        GenericStructContainer container,
    public GenericTableBase(
    @Nullable
        return null;
    public void addUniqueKey(GenericUniqueKey constraint) {
        ) {
import org.jkiss.dbeaver.model.meta.ForTest;
 * You may obtain a copy of the License at
                GenericTableColumn fkColumn = fkTable.getAttribute(monitor, info.fkColumnName);
            final List<ForeignKeyInfo> fkInfos = loadReferenceInfoList(session, fkObject);
            // some drivers don't like it
        return getContainer().getTableCache();
        if (isView() && context == DBPEvaluationContext.DDL && !getDataSource().getMetaModel().useCatalogInObjectNames()) {
                    if (pk == null) {
    }
            return getContainer().getForeignKeysCache().getObjects(monitor, getContainer(), this);
        }
    }
 */
        return this.getContainer().getTableCache().getChild(monitor, getContainer(), this, attributeName);
import org.jkiss.dbeaver.DBDatabaseException;
                            if (pkConstraint.getConstraintType().isUnique() && DBUtils.getConstraintAttribute(monitor, pkConstraint, pkColumn) != null) {
import org.jkiss.dbeaver.model.meta.PropertyLength;
            } else {
    public boolean isAbstractTable() {
                        if (cardinality > 0) {
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
    @Override
    }
import org.jkiss.dbeaver.model.meta.Association;
        if (this.tableType == null) {
//                if (indexes != null) {
                    log.debug("Null FK table name");
        if (getDataSource().getInfo().supportsReferentialIntegrity()) {
                        fk = fkTable.getDataSource().getMetaModel().createTableForeignKeyImpl(fkTable, info.fkName, null, pk, deleteRule, updateRule, deferability, true);
        }
    }
    @NotNull
                    fkList.add(fk);
                    }
    @Nullable
    }
                }
                if (pk == null) {
 * DBeaver - Universal Database Manager
    @Override
                DBSForeignKeyDeferability deferability = switch (info.deferabilityNum) {
                log.debug("Error reading references: " + ex.getMessage());
            if (tableTriggerCache != null) {
        }
    private String tableType;
    }

import org.jkiss.dbeaver.DBException;
                return Collections.emptyList();
    }
        GenericStructContainer container = getContainer();
    }
        final GenericMetaModel metaModel = container.getDataSource().getMetaModel();
    public boolean isExternalTable() {
    public Long getRowCountFromIndexes(DBRProgressMonitor monitor) {

                    pk = DBUtils.findObject(this.getConstraints(monitor), info.pkName);
                } else {
        if (this.tableType == null) {
                GenericUniqueKey pk = null;
        return this.isSystem;
    @Nullable
    public Collection<? extends GenericTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.Log;
        if (dataSource.supportsReferentialIntegrity() ||
                    }
                        for (GenericUniqueKey pkConstraint : uniqueKeys) {
            // Read indexes using cache
    public List<? extends GenericTrigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
                }
                ForeignKeyInfo fkInfo = new ForeignKeyInfo();
 * you may not use this file except in compliance with the License.
    @Override
            return loadReferences(monitor);
        this.isSystem = metaModel.isSystemTable(this);
                        final long cardinality = index.getCardinality();
        this.tableType = tableType;
                        fkMap.put(info.fkName, fk);
    }
                if (CommonUtils.isEmpty(info.fkName)) {
        if (getDataSource().getInfo().supportsReferentialIntegrity()) {
                            }


 * See the License for the specific language governing permissions and
    public String getDescription() {
                    continue;
                }
    private Long rowCount;

            tableSchemaName = GenericUtils.safeGetString(container.getTableCache().getTableObject(), dbResult, JDBCConstants.TABLE_SCHEM);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
                }
                    // Add this fake constraint to it's owner
        return null;

                    default -> DBSForeignKeyDeferability.UNKNOWN;
        if (isView() || !isPersisted()) {
        return null;
        return null;
                if (fk != null && !fkList.contains(fk)) {
        return "SHARED_TABLE".equals(tableType);
    public GenericTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName)
                }
            // Try to get cardinality from some unique index
//                    rowCount = getRowCountFromIndexes(monitor);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Association
        return rowCount;
        // Load indexes
                    pk.addColumn(new GenericTableConstraintColumn(pk, pkColumn, info.keySeq));
    ) {
    @Property(viewable = true, optional = true, labelProvider = GenericSchema.SchemaNameTermProvider.class, order = 4)
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
        if (dbResult != null) {
                    continue;
/**
            if (JDBCUtils.isFeatureNotSupportedError(getDataSource(), ex)) {
                }
    }
                    log.error(e);
        return Collections.emptyList();
        }
    private final String tableSchemaName;
                    case DatabaseMetaData.importedKeyInitiallyImmediate -> DBSForeignKeyDeferability.INITIALLY_IMMEDIATE;

        final DBSObjectCache<GenericTableBase, GenericTableColumn> childrenCache =
    private static final Log log = Log.getLog(GenericTableBase.class);
    public GenericCatalog getCatalog() {

            this.tableType = "";
                        log.debug("Unique key '" + info.pkName + "' not found in table " + this.getFullyQualifiedName(DBPEvaluationContext.DDL) + " for FK " + info.fkName);
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        @NotNull String tableCatalogName,
    public GenericTableBase(
                DBSForeignKeyModifyRule updateRule = JDBCUtils.getCascadeFromNum(info.updateRuleNum);
            }
                    fk = fkMap.get(info.fkName);
        if (parentObject != null) {
        return this.getContainer().getTableCache().getChildren(monitor, getContainer(), this);
    }
    public void setDescription(String description) {
        throws DBException {
        if (getDataSource().getInfo().supportsReferentialIntegrity()) {
                    pk = this.getDataSource().getMetaModel().createConstraintImpl(this, info.pkName, DBSEntityConstraintType.PRIMARY_KEY, null, true);
        }
    }


                // Find PK

                    log.warn("Can't find unique key for table " + this.getFullyQualifiedName(DBPEvaluationContext.DDL) + " column " + pkColumn.getName());
        }
                if (pk == null) {
        JDBCDatabaseMetaData metaData = session.getMetaData();
    private boolean isSystem;
    public String getCatalogName() {
            TableTriggerCache tableTriggerCache = parentObject.getTableTriggerCache();
    public GenericUniqueKey getConstraint(@NotNull DBRProgressMonitor monitor, String name) throws DBException {
            }

                }
        }
                getDataSource(),

        @Nullable String tableName,
        @Nullable JDBCResultSet dbResult) {
    }
                    log.warn("Can't find FK table " + info.fkTableName);
        this.getContainer().getIndexCache().clearObjectCache(this);
                    //String pkFullName = getFullyQualifiedName() + "." + info.pkName;

            getAttributes(monitor);
    }
            // [SQL Server] workaround. You can't use catalog name in operations with views.


    }
    }
                this);
        }
        final List<ForeignKeyInfo> fkInfos = new ArrayList<>();
    }
        if (!CommonUtils.isEmpty(tableCatalogName)) {
    @Nullable
    @Property(viewable = true, editableExpr = "object.dataSource.metaModel.tableCommentEditable", updatableExpr = "object.dataSource.metaModel.tableCommentEditable", length = PropertyLength.MULTILINE, order = 100)
        if (rowCount != null) {
            // Query row count

                        log.warn("Can't find foreign key '" + info.fkName + "' for table " + fkTable.getFullyQualifiedName(DBPEvaluationContext.DDL));
        this.tableCatalogName = tableCatalogName;
                        }
        }
    public Long getRowCount(DBRProgressMonitor monitor) {
        return getContainer().getCatalog();
                                pk = pkConstraint;
                // Find (or create) FK
import java.sql.DatabaseMetaData;
                    if (fk == null) {
    public String getSchemaName() {
        throws DBException {
    }
    }
    //@Property(viewable = true, optional = true, order = 4)
//                }
        return description;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        } catch (DBException e) {
    @Nullable

    private boolean isUtility;
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            return new ArrayList<>();
    @Override
    @Override



                    }
    }
    }
        }

                    fk = DBUtils.findObject(fkTable.getAssociations(monitor), info.fkName);
        if (getDataSource().getInfo().supportsIndexes()) {
        return "ABSTRACT_TABLE".equals(tableType);
                throw new DBDatabaseException(ex, getDataSource());
    @Override
            getName())) {

    }
        return tableSchemaName;
                    // Make fake FK name
                GenericTableBase fkTable = getDataSource().findTable(monitor, info.fkTableCatalog, info.fkTableSchema, info.fkTableName);
                }
        }
 */
    @Nullable
        if (rowCount == null) {
                                break;
            }
        return fkInfos;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            dataSource.supportsIndexes() ||
    public boolean supportUniqueIndexes() {
            if (!CommonUtils.isEmpty(indexList)) {

    }
    public boolean isSharedTable() {
                    Collection<GenericUniqueKey> uniqueKeys = this.getConstraints(monitor);
                    }
        return null;
    @Override
            getAttributes(monitor);
    public List<? extends GenericTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
    public List<ForeignKeyInfo> loadReferenceInfoList(@NotNull JDBCSession session, GenericMetaObject fkObject) throws SQLException {
 * distributed under the License is distributed on an "AS IS" BASIS,
            return getContainer().getConstraintKeysCache().getObject(monitor, getContainer(), this, name);
                    case DatabaseMetaData.importedKeyInitiallyDeferred -> DBSForeignKeyDeferability.INITIALLY_DEFERRED;
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;

            getCatalog(),
            tableCatalogName = null;
            }
        }
        }
                fkInfo.fetchColumnsInfo(fkObject, dbResult);
    @ForTest
    private String description;
        } else {
    public Collection<? extends GenericTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor)
import org.jkiss.code.Nullable;
                    continue;
import org.jkiss.dbeaver.ext.generic.GenericConstants;
    }
 * Generic table
    // Constructor for tests
            return null;
 * Unless required by applicable law or agreed to in writing, software

        super(container, tableName, true);
    private List<GenericTableForeignKey> loadReferences(DBRProgressMonitor monitor)
 * limitations under the License.
        return !isView();
                return getDataSource().getSchema(tableSchemaName);

            // Cardinality
                    log.warn("Can't find PK column " + info.pkColumnName);
    public boolean supportsDDL() {
        return tableType;
        return true;
            } catch (DBException e) {
                if (!CommonUtils.isEmpty(info.pkName)) {
                            return cardinality;

    protected boolean isTruncateSupported() {
                    return ((GenericCatalog)container).getSchema(new VoidProgressMonitor(), tableSchemaName);
 *
            }
    public String getTableType() {
    @Override
    public void setSystem(boolean system) {
                GenericTableForeignKey fk;

                log.debug("Can't fetch row count: " + e.getMessage());
    }
            tableCatalogName = GenericUtils.safeGetString(container.getTableCache().getTableObject(), dbResult, JDBCConstants.TABLE_CATALOG);
package org.jkiss.dbeaver.ext.generic.model;


        }
        getContainer().getConstraintKeysCache().cacheObject(constraint);
    public Collection<DBSIndexType> getTableIndexTypes() {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table relations")) {
            while (dbResult.next()) {
    private final String tableCatalogName;
        return null;
            rowCount = -1L;
}
    public abstract String getDDL();
        } catch (SQLException ex) {
                if (fkTable == null) {
        return getContainer().getObject();
        throws DBException {
            }
            // Select count not supported
    public boolean isSystem() {
                    fk.addColumn(fkColumnInfo);
        return isUtility;
    }

                    }
        this.tableType = tableType;
        try {
    }

import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
            Map<String, GenericTableForeignKey> fkMap = new HashMap<>();
    @Override
        }
import org.jkiss.dbeaver.model.meta.Property;
        return CommonUtils.getBoolean(
                }
    public void addAttribute(GenericTableColumn column) {
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
    @Property(viewable = false, expensive = true, order = 5, category = DBConstants.CAT_STATISTICS)

                    if (fk == null) {
    }
                } catch (Exception e) {
        @Nullable String tableType,
        @Nullable String tableType,
        throws DBException {
        if (!isPersisted() || !getDataSource().getInfo().supportsReferentialIntegrity() || monitor == null || monitor.isForceCacheUsage()) {
    public GenericStructContainer getParentObject() {
                        }
            tableSchemaName = null;
    }
        this.isUtility = metaModel.isUtilityTable(this);
        throws DBException {
    }
                    fk = DBUtils.findObject(fkTable.getAssociations(monitor), info.fkName);
            this);
import java.sql.SQLException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public GenericSchema getSchema() {
        return true;
import org.jkiss.dbeaver.model.exec.DBCSession;
            if (!(container instanceof GenericCatalog)) {
            return rowCount;
        @NotNull String tableSchemaName
    @Property(viewable = true, order = 2)
            }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return null;
        isSystem = system;
                if (CommonUtils.isEmpty(info.fkTableName)) {
                };
            // First read entire resultset to prevent recursive metadata requests
                    new AbstractExecutionSource(this, session.getExecutionContext(), this), session, null, DBSDataContainer.FLAG_NONE);
        if (!CommonUtils.isEmpty(tableSchemaName)) {
            for (ForeignKeyInfo info : fkInfos) {
    @Association
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
                fkInfos.add(fkInfo);
                    case DatabaseMetaData.importedKeyNotDeferrable -> DBSForeignKeyDeferability.NOT_DEFERRABLE;
    public GenericTableForeignKey getAssociation(@NotNull DBRProgressMonitor monitor, String name)
            final GenericMetaObject fkObject = getDataSource().getMetaObject(GenericConstants.OBJECT_FOREIGN_KEY);
        return DBUtils.getFullQualifiedName(
    }
                try {
            return getContainer().getConstraintKeysCache().getObjects(monitor, getContainer(), this);
        return Collections.singletonList(DBSIndexType.OTHER);
        if (rowCount == null) {

    @Override
    }
            // ensure all columns are already cached
        return null;
                    this.addUniqueKey(pk);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
 *

                    // Too bad. But we have to create new fake PK for this FK

    public Collection<GenericTableBase> getSubTables() {
    public List<? extends GenericTableColumn> getCachedAttributes() {
            log.error(e);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (mergeEntities && dbResult != null) {
