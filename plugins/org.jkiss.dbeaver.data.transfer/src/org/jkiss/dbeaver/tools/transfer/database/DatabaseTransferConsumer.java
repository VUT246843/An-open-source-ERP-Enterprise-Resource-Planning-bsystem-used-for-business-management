
        @Nullable
    @Override
                    targetSession,
            }
            return true;
                    } else {
                        column.sourceAttr,
        if (targetObjectContainer != null) {
            }
                    columnMapping.valueTransformer = columnMapping.targetAttr.getTransformer().createTransformer();
public class DatabaseTransferConsumer implements IDataTransferConsumer<DatabaseConsumerSettings, IDataTransferProcessor>,
    }

import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;

                        columnMapping.targetAttr = new DatabaseMappingAttribute(containerMapping, columnMapping.sourceAttr);
        targetAttributes = new ArrayList<>(columnMappings.length);
            return;
                    var node = DBNUtils.getNodeByObject(containerMapping.getTarget());
            throw new DBCException("Error opening new connection", e);
            if (containerMapping.hasNewTargetObject()) {
                    oldCatalog = contextDefaults.getDefaultCatalog();
                        retryInsert = switch (response) {
    }

        }
        public DBDValueHandler targetValueHandler;
                        } else {
                    if (node == null) {
                    try {
            this.binding = binding;

                log.warn("Table '" + targetObject.getName() + "' doesn't support truncate operation");
            return;
    public DBPProject getProject() {
                    "Can't create or update target table:\n" +
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    private void insertBatch(boolean force) throws DBCException {
    private DBCSession targetSession;
                        }
            if (column == null || column.targetIndex < 0) {


                if (DBFetchProgress.monitorFetchProgress(rowsExported)) {
        } else {
        }
        if (targetObjectContainer != null) {
            DBUtils.closeSafely(targetContext);
        if (localTargetObject != null) {
    // Used in deserialized or directly instantiated consumers
        public String getDefaultValue() {
    }
        return container;
        }
        }

    @Override
import org.jkiss.dbeaver.DBException;
                            statistics.accumulate(executeBatch.execute(targetSession, options)));

            monitor.done();
        }
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
            case create -> targetName + " [Create]";
            if (bulkLoadManager != null) {
            }
                    } else if (targetObject instanceof DBPRefreshableObject ro) {
                containerMapping,
            executeBatch.add(rowValues);
    public boolean isConfigurationComplete() {
        return container != null ? container.getName() : "?";
            if (containerMapping != null && containerMapping.getTarget() instanceof DBSDocumentContainer) {
        public DBSEntity getParentObject() {
    }
        DBSDataManipulator targetObject = getTargetObject();
    @Override
                    if (!txnManager.isAutoCommit()) {
    }
                        "Error transforming attribute '" + column.sourceAttr.getName() +


                if (settings.isUseTransactions()) {
        public void close() {
        }
            return targetObjectContainer.getName();
                } catch (DBException e) {
            final DataTransferRegistry registry = DataTransferRegistry.getInstance();
                            if (errorType == DBPErrorAssistant.ErrorType.UNIQUE_KEY_VIOLATION) {
            throw new DBCException("Data transfer to database [" + dataSourceContainer.getName() + "] restricted by connection configuration");
        return attr.isPseudoAttribute() ||
    }
            bulkLoadManager.close();

import org.jkiss.dbeaver.model.sql.SQLDialectInsertReplaceMethod;
            }
        return DBIcon.TREE_TABLE;
        @Nullable Map<String, Object> processorProperties,
                log.debug("Error refreshing database model after data consumer", e);
            }
                        SQLDialectInsertReplaceMethod insertReplaceMethod =

            if (settings.getContainer() == null) {
                }
                }
        public DBPDataSource getDataSource() {
            }
            DBSObjectContainer container = settings.getContainer();
                    if (oldAutoCommit) {
import java.util.ArrayList;
    @Override
                targetObject.truncateData(targetSession, executionSource);
    public boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) throws DBException {
            if (columnMapping.targetAttr.getTransformer() != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public DatabaseMappingAttribute targetAttr;
    public void setTargetObject(DBSDataManipulator targetObject) {
                executeBatch = null;

            return targetName + " [Existing]";
            }
import org.jkiss.dbeaver.model.navigator.DBNModel;
        public DBCStatistics execute(@NotNull DBCSession session, @NotNull Map<String, Object> options) throws DBCException {

                        columnMapping.targetAttr.setTarget(docAttribute);
            if (columnMapping.targetAttr.getMappingType() == DatabaseMappingType.skip) {

                        SQLUtils.generateScript(session.getDataSource(), actions, false), e);
            columnMapping.targetIndex = targetAttributes.size();
    }
            log.debug(e);
                session.getExecutionContext(),
    protected List<Object[]> getPreviewRows() {
    }
                            }


        }
                if (columnMapping.targetAttr == null) {
                    String insertMethodId = settings.getOnDuplicateKeyInsertMethodId();
                    } catch (DBException e) {
    private List<DBSAttributeBase> targetAttributes;
    }
    @Override
            // Document-based datasource
        public IDataTransferAttributeTransformer valueTransformer;
    public List<DBSAttributeBase> getTargetAttributes() {
    public DBSDataContainer getSourceObject() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return DBIcon.TREE_FOLDER_TABLE;
                        session,
        if (targetObjectContainer != null) {
        if (targetObjectContainer != null) {
                            columnMapping.targetAttr = new DatabaseMappingAttribute(null, columnMapping.sourceAttr);
        }
            for (Map.Entry<String, Map<String, Object>> entry : settings.getEventProcessors().entrySet()) {
                };

                        }
                        log.debug(e);
                    }
    public DatabaseTransferConsumer() {
                        column.sourceAttr,


                    try {
    // In this case consumer will be replaced with explicit consumers during configuration

            targetContext = null;
                    targetSession,
        targetSession.enableLogging(settings.isEnableQmLogging());
import org.jkiss.dbeaver.Log;
                }
                            "' value with transformer '" + column.targetAttr.getTransformer().getName() + "'", e);
    }
        if (dynamicTarget) {
            try {
     * @return list of target attributes
    public DatabaseTransferConsumer(DBSDataManipulator targetObject) {
import org.jkiss.code.Nullable;
    public DatabaseConsumerSettings getSettings() {

        AbstractExecutionSource executionSource = new AbstractExecutionSource(containerMapping.getSource(), targetContext, this);
            targetAttributes.add(targetAttr);
    private DBSDataManipulator localTargetObject;
                        ro.refreshObject(monitor);
            }
                            targetSession, targetObject, attributes, executionSource, settings.getCommitAfterRows(), options);
    }
        return statistics;
                            if (e instanceof DBCException dbe) {
        options.put(DBSDataManipulator.OPTION_USE_MULTI_INSERT, settings.isUseMultiRowInsert());
            CommonUtils.equalObjects(getTargetObject(), ((DatabaseTransferConsumer) obj).getTargetObject());
            DBSSchema oldSchema = null;
        return targetObject == null ? settings.getContainer() : targetObject;
            DBSDataManipulator targetObject = getTargetObject();
    }
                    DBWorkbench.getPlatformUI().showError("Transfer event processor", "Error executing data transfer event processor '" + entry.getKey() + "'", e);
                executeBatch = targetObject.insertData(
        try (DBCSession session = DBUtils.openMetaSession(monitor, dbObject, "Create target metadata")) {
import org.jkiss.dbeaver.model.task.DBTTask;
                } catch (DBException e) {
        this.targetObjectContainer = targetObjectContainer;
        }
        }
            }
        insertBatch(false);
    public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
        }
        } else {
                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    if (docAttribute != null) {
    }
        String targetName = null;
        @Override
        this.localTargetObject = targetObject;
                    try {
    public ColumnMapping[] getColumnMappings() {
                    targetSession,
                                break;

                try {
        }


                        session.getExecutionContext().getContextDefaults().setDefaultCatalog(monitor, oldCatalog, oldSchema);
        return null;
                options.put(DBSDataManipulator.OPTION_DISABLE_BATCHES, disableUsingBatches);
        };
        @Override
            previewRows = new ArrayList<>();
            }

    }
                if (targetObject instanceof DBSDataManipulatorExt) {
                bulkLoadManager.finishBulkLoad(targetSession);
    @Override

                    DBWorkbench.getPlatformUI().openEntityEditor(targetObject);
        if (targetName != null) {
                        DBSEntityAttribute attribute = ((DBSEntity) targetObject).getAttribute(session.getProgressMonitor(), columnMapping.sourceAttr.getName());
            }
                            columnMapping.targetAttr.setMappingType(DatabaseMappingType.existing);
                    targetAttributes.toArray(new DBSAttributeBase[0]),
        @Nullable DBPProject project
                    continue;
                        column.sourceAttr.getOrdinalPosition());
        return switch (containerMapping.getMappingType()) {

        DBPDataSourceContainer container = getDataSourceContainer();
        return columnMappings;
        @NotNull
                    } catch (Exception e) {

        }
            if (settings.isUseBulkLoad()) {

 * DBeaver - Universal Database Manager
    @Override
        @Nullable DatabaseConsumerSettings settings,
                DBUtils.getObjectOwnerInstance(targetDB).openIsolatedContext(monitor, "Data transfer consumer", null) : DBUtils.getDefaultContext(targetDB, false);
            initExporter(session.getProgressMonitor());
        boolean headlessMode = DBWorkbench.getPlatform().getApplication().isHeadlessMode();
                    // Every uncommited data here is considered as fail, and we need to rollback them
    private boolean useIsolatedConnection;
            }
        Map<String, Object> options = new HashMap<>();
    public void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
                DBSObjectContainer container = settings.getContainer();

                }
                    }
            targetName = DBUtils.getObjectFullName(targetObject, DBPEvaluationContext.UI);
        DBSDataManipulator targetObject = getTargetObject();
            super(binding.getName(), binding.getTypeName(), -1, index, binding.getMaxLength(), null, null, false, false);
                    new AbstractExecutionSource(getSourceObject(), targetContext, this));
    }
            if (catalog != null) {
            if (column.valueTransformer != null) {
        return null;
            } catch (Exception e) {
        public String toString() {
        if (targetObject instanceof DBPImageProvider) {

            rsAttributes = DBUtils.getAttributeBindings(session, sourceObject, resultSet.getMeta());
                }

    @Override
    }
        DBSObjectContainer container = settings.getContainer();
        for (ColumnMapping column : columnMappings) {
            // Refresh navigator

        }
            bulkLoadManager = null;
                        document != null ? document : attrValue,
                executeBatch.close();
        } else {
        return containerMapping == null ? localTargetObject : containerMapping.getTarget();
            throw new DBException("Changing referential integrity is unsupported!");
        if (session.getDataSource().getInfo().isDynamicMetadata()) {
        if (containerMapping == null) {
                try {
import java.util.List;
                }
    public void startTransfer(DBRProgressMonitor monitor) throws DBException {
                }
                }
                } else {
                return switch (containerMapping.getMappingType()) {
                    attrValue = DBUtils.getAttributeValue(column.sourceAttr, sourceBindings, rowValues);
            document = attr.getValueHandler().fetchValueObject(session, resultSet, attr, attr.getOrdinalPosition());
        if (!dataSourceContainer.hasModifyPermission(DBPDataSourcePermission.PERMISSION_IMPORT_DATA)) {
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
        }
    private boolean isPreview;
                    // Revert to old catalog
                        }
        @Override
        boolean ignoreDuplicateRowsErrors = settings.isIgnoreDuplicateRows();
        private final DBSEntity entity;
            }
        public void generatePersistActions(@NotNull DBCSession session, @NotNull List<DBEPersistAction> actions, @NotNull Map<String, Object> options) throws DBCException {
        // Transform value
            if (targetAttr == null) {
            } finally {
        if (!(dbsObject instanceof DBPReferentialIntegrityController controller)) {
        if (isPreview) {
    public DBPImage getObjectIcon() {
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
    public static final String NODE_ID = "databaseTransferConsumer";
                if (contextDefaults != null && contextDefaults.supportsCatalogChange() && contextDefaults.getDefaultCatalog() != catalog) {
                    throw new DBException("No target datasource - can't create target objects");
            return DBValueFormatting.getObjectImage(targetObject);
            // even if DBSDataManipulator.FEATURE_DATA_TRUNCATE is reported to be not supported.
 * Unless required by applicable law or agreed to in writing, software
        } catch (DBException e) {
                options.put(DBSDataManipulator.OPTION_SKIP_BIND_VALUES, settings.isSkipBindValues());
                try {

import org.jkiss.dbeaver.model.*;
    @Override
        private final DBDAttributeBinding binding;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        public PreviewColumnInfo(DBSEntity entity, DBDAttributeBinding binding, int index) {
            // Note: all implementations support truncate in some way (e.g. DELETE FROM)
        options.put(DBSDataManipulator.OPTION_SKIP_BIND_VALUES, settings.isSkipBindValues());
                        if (objectNode != null) {
            if (containerMapping == null) {
    public DBPDataSourceContainer getDataSourceContainer() {
                    targetSession.getProgressMonitor().subTask("Insert rows (" + rowsExported + ")");
        } finally {
                    executionSource,
    public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
            }
                if (hasNewObjects) {
                                throw dbe;

            if (!isPreview && targetObject instanceof DBSDataManipulatorExt) {
        } else {
                }

                ((DBSDataManipulatorExt) targetObject).afterDataChange(
import org.jkiss.dbeaver.model.app.DBPProject;
                    throw new DBCException(
            if (rowsExported > 0) {
        if (targetObject != null && !isPreview && offset <= 0 && settings.isTruncateBeforeLoad() && (containerMapping == null || containerMapping.getMappingType() == DatabaseMappingType.existing)) {
        DBSObject targetDB = checkTargetContainer(monitor);
            }
                    throw new DBCException("Target attribute for [" + columnMapping.sourceAttr.getName() + "] wasn't resolved");
        for (int i = 0; i < rsAttributes.length; i++) {
                if (onDuplicateKeyCaseOn) {
        if (last && error == null) {
                do {
                        if (ignoreErrors) {
            final DBDAttributeBinding attr = DBUtils.getAttributeBindings(session, getSourceObject(), resultSet.getMeta())[0];
        try {
}
        }
        controller.enableReferentialIntegrity(monitor, enable);
    }
                    }
            default -> targetName + " [Existing]";
    }
        public int targetIndex = -1;
            boolean disableUsingBatches = settings.isDisableUsingBatches();
                // Map all attributes directly.
        }
                            message = DTMessages.database_transfer_consumer_task_error_occurred_during_batch_insert;
        if (bulkLoadManager != null) {
                        bulkLoadManager = bulkLoader.createBulkLoad(

        // + " [No changes]";
            } else {
    }
                }
                                ignoreErrors = true;
        return targetObjectContainer;
            case skip -> "[Skip]";
        public DBDAttributeBinding sourceAttr;
            this.sourceAttr = sourceAttr;
                columnMapping.targetAttr = containerMapping.getAttributeMapping(columnMapping.sourceAttr);
    private void closeExporter() {
            try {
@DBSerializable(DatabaseTransferConsumer.NODE_ID)

            case existing -> {
            previewRows.add(attributeValues);
                        if (attribute != null) {
                    if (node != null) {
        }
            try {
            }
                DatabaseTransferUtils.createTargetDynamicTable(session.getProgressMonitor(), session.getExecutionContext(), schema, containerMapping, containerMapping.getTarget() != null);
            return sourceAttr + "->" + targetAttr;
            // Truncate target tables

    }
    public DatabaseTransferConsumer(DBSObjectContainer targetObjectContainer) {

        }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferEventProcessorDescriptor;
        }
     * This class is only suitable for data transfer preview.
                        };
                        node.refreshNode(monitor, this);
        if (!headlessMode && !last && settings.isOpenTableOnFinish() && error == null) {
                } catch (Exception e) {
        private ColumnMapping(DBDAttributeBinding sourceAttr) {
                        txnManager.setAutoCommit(monitor, true);
    private Boolean oldAutoCommit;
                    throw new DBCException("Error getting document attribute", e);
                    ((DBSDataManipulatorExt) targetObject).beforeDataChange(targetSession, DBSManipulationType.INSERT, attributes, executionSource);
        closeExporter();
        }
    public void initTransfer(
    public DBSObject getDatabaseObject() {
                try {
        DBSObject dbsObject = checkTargetContainer(monitor);
                    case create, recreate, existing -> createTargetTable(session, containerMapping);
                        String message;
        }
                    throw new DBCException("Can't create attribute transformer", e);
                }

                    }
        }
        if (schema == null) {
        if (bulkLoadManager != null) {
    public DBSObjectContainer getContainer() {
        @Override
    }
            return actions.length > 0;
    protected boolean isPreview() {

            }
            if ((needCommit || disableUsingBatches) && executeBatch != null) {
        }
                if (bulkLoader != null) {
    public String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
    public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) throws DBException {
                boolean hasNewObjects = createTargetDatabaseObjects(monitor, dbObject);
            }
        }
            DBSObject dbObject = checkTargetContainer(monitor);
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
        monitor.beginTask("Create necessary database objects", 1);
        finishTransfer(monitor, null, last);
            DBEPersistAction[] actions = DatabaseTransferUtils.generateTargetTableDDL(
    private DBSObjectContainer container;
        } else {
        }
                            case IGNORE -> false;
            } else if (executeBatch != null) {
    // Used only for non-explicit import
                        if (insertReplaceMethod != null) {

                } else if (columnMapping.targetAttr.getSource() instanceof DBSEntityAttribute || targetObject instanceof DBSDocumentContainer) {
        targetSession = targetContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Data load");
                    if (error == null) {
    public void setContainer(DBSObjectContainer container) {

                if (isPreview) {
            }
        @Override




            try {
    }
                        if (DBWorkbench.getPlatform().getApplication().isHeadlessMode()) {
            }
    }
                if (targetObject instanceof DBSEntity) {
    public String getObjectName() {
import org.jkiss.dbeaver.model.exec.*;
        return settings;
                oldAutoCommit = txnManager.isAutoCommit();

        IDataTransferNodePrimary, DBPReferentialIntegrityController {
                                yield false;
    @Override

        boolean dynamicTarget = targetContext.getDataSource().getInfo().isDynamicMetadata();
        DBSAttributeBase[] attributes = targetAttributes.toArray(new DBSAttributeBase[0]);
                DBSObjectContainer container = settings.getContainer();
                            case IGNORE_ALL -> {
        return previewRows;
            DBSCatalog oldCatalog = null;
                            break;
            attr instanceof DBDAttributeBindingCustom;
                    targetAttr.getTarget() == null ? targetAttr.getSource() : targetAttr.getTarget(),
                yield targetName;
    @Override
    @Override
            } else {
        } catch (DBException e) {
            return new DBCStatistics();
    public void close() {
            Object attrValue;
    private ColumnMapping[] columnMappings;
    private DBSObject checkTargetContainer(DBRProgressMonitor monitor) throws DBException {
        if (last) {
            DBSCatalog catalog = dbObject instanceof DBSSchema ? DBUtils.getParentOfType(DBSCatalog.class, dbObject) : null;
    public DBSDataManipulator getTargetObject() {
            // We may need to change active catalog to create target object in the proper location

import java.util.HashMap;
    }
                rowValues[column.targetIndex] = column.targetValueHandler.getValueFromObject(
            columnMappings[i] = columnMapping;
        this.localTargetObject = targetObject;
                } while (retryInsert);
                    } catch (DBCException e) {
    }
                boolean onDuplicateKeyCaseOn = settings.getOnDuplicateKeyInsertMethodId() != null &&
            if (bulkLoadManager == null) {
 *
        try {
            return container.getDataSource().getContainer();
    private boolean ignoreErrors = false;

        DBPDataSourceContainer dataSourceContainer = targetDB.getDataSource().getContainer();
    public static class ColumnMapping {
                    log.error("Error refreshing object '" + targetObject.getName() + "'", e);
    }
        }
        DBPDataSourceContainer container = getDataSourceContainer();
                        yield targetName + " [Alter]";
    public void finishTransfer(@NotNull DBRProgressMonitor monitor, @Nullable Throwable error, @Nullable DBTTask task, boolean last) {
        public Map<String, Object> valueTransformerProperties;
                    columnMapping.valueTransformerProperties = columnMapping.targetAttr.getTransformerProperties();
        }
        @NotNull DBSObject sourceObject,
            if (container instanceof DBPDataSourceContainer && container.getDataSource() == null) {
            }
    private DatabaseMappingContainer containerMapping;

                var contextDefaults = session.getExecutionContext().getContextDefaults();
 * distributed under the License is distributed on an "AS IS" BASIS,
                    options);
                // No explicit mappings. Mapping must be provided by data producer
                DBUtils.initDataSource(monitor, (DBPDataSourceContainer) settings.getContainer(), null);
                throw new DBCException(
        @Override
    @Override
                    attrValue,
            return true;
                            DBPErrorAssistant.ErrorType errorType = DBExecUtils.discoverErrorType(targetSession.getDataSource(), e.getCause());
            return targetObject.getDataSource().getContainer();
            if (txnManager != null && txnManager.isSupportsTransactions()) {
                }
        }
                attrValue = resultSet.getAttributeValue(i);
        @NotNull
    public String getObjectContainerName() {
                    refreshableObject.refreshObject(monitor);
                    if (!oldAutoCommit) {
        }
        return containerMapping != null &&
        }
                        node = DBNUtils.getNodeByObject(container);

    }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    false, false);
                try {
        return containerMapping == null ? null : containerMapping.getSource();
                        columnMapping.targetAttr.setMappingType(DatabaseMappingType.existing);
                    null,
import org.jkiss.dbeaver.model.navigator.DBNUtils;

        @Nullable IDataTransferProcessor processor,
    @Override
                        log.error("Error inserting row", e);
                }
    @Override
    }
                if (navigatorModel != null) {

            return entity;

import org.jkiss.dbeaver.model.data.DBDAttributeBindingCustom;
    private long rowsExported = 0;
                bulkLoadManager.flushRows(targetSession);
            }
                    DBSEntityAttribute docAttribute = docContainer.getDocumentAttribute(session.getProgressMonitor());
import org.jkiss.dbeaver.model.navigator.DBNEvent;
    }

    @Override


        if (settings.isUseTransactions() && needCommit && !targetSession.getProgressMonitor().isCanceled()) {


                targetSession = null;
    private DBSObjectContainer targetObjectContainer;
                log.error("Error refreshing database model", e);
        }
                schema,

                        log.debug(e);
                } else if (container instanceof DBPRefreshableObject refreshableObject) {
                    if (!CommonUtils.isEmpty(insertMethodId)) {
    }
        }
        }

    private void initExporter(DBRProgressMonitor monitor) throws DBException {
        }
                continue;
                    }
        targetName = containerMapping.getTargetFullName();
            if (targetObject != null) {
    @Override
/**
                }
            ColumnMapping columnMapping = new ColumnMapping(rsAttributes[i]);
            try {
    private boolean isSkipColumn(DBDAttributeBinding attr) {
 * You may obtain a copy of the License at
    }
import java.util.Map;
                }
                            }

    }

    }
                continue;
            DBSDataManipulator targetObject = getTargetObject();
        this.container = container;
            return this.binding.getDataKind();
                    targetAttr = columnMapping.targetAttr.getSource();
                    default -> false;
                }

    }
            }
    }

                            default -> retryInsert;
        }
        columnMappings = new ColumnMapping[rsAttributes.length];
    public boolean equals(Object obj) {
        this.settings = settings;
    protected void setPreview(boolean preview) {
        } else {
                if (columnMapping.targetAttr == null) {
package org.jkiss.dbeaver.tools.transfer.database;
    }
                    throw new DBCException("Can't find target attribute [" + columnMapping.sourceAttr.getName() + "]");
            return null;
        // 2. ignoreDuplicateRowsErrors option is enabled - that means, what we do not have batches, only single rows, and we can loose inserted rows without commit in some databases like PG
                } catch (Exception e) {
        //session.getProgressMonitor().worked(1);
    public void setContainerMapping(@Nullable DatabaseMappingContainer containerMapping) {
                // This may happen when several database consumers point to the same container node
                // Init connection
                    }

        @NotNull
    private boolean createTargetTable(DBCSession session, DatabaseMappingContainer containerMapping) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
     */
    public void finishTransfer(@NotNull DBRProgressMonitor monitor, boolean last) {
            DBSAttributeBase targetAttr = columnMapping.targetAttr.getTarget();
    }

                            case RETRY -> true;
                DBCTransactionManager txnManager = DBUtils.getTransactionManager(targetSession.getExecutionContext());


        }
                            message = DTMessages.database_transfer_consumer_task_error_occurred_during_data_load;
     */
            } catch (Exception e) {
                        document != null ? new Object[]{document} : rowValues,
import org.jkiss.utils.CommonUtils;
        }
        try {
        try {
        }
        Object[] rowValues = new Object[targetAttributes.size()];
        @Override
                        resultSet,
                options.put(DBSDataManipulator.OPTION_MULTI_INSERT_BATCH_SIZE, settings.getMultiRowInsertBatch());
            if (isSkipColumn(rsAttributes[i])) {
            if (targetSession != null) {
        if (targetObject != null) {
                            throw new DBCException(e.getMessage(), e);
    }
            }
                }
            }
 *

        return container != null ? container.getDriver().getIcon() : null;
        if (dbsObject instanceof DBPReferentialIntegrityController) {
    private static final Log log = Log.getLog(DatabaseTransferConsumer.class);
import org.jkiss.dbeaver.model.sql.SQLUtils;
                DatabaseTransferUtils.refreshDatabaseMappings(monitor, settings, containerMapping, true);
                    log.debug("Can't find event processor '" + entry.getKey() + "'");
    public DBCStatistics getStatistics() {
        if (!isPreview) {
            monitor.subTask("Refresh final database model");
            document = null;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
            }
        }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                        column.valueTransformerProperties);
import java.sql.SQLException;
                    if (attr.getMappingType() == DatabaseMappingType.create) {
        }
                            }
    private DBDAttributeBinding[] rsAttributes;
            ColumnMapping column = columnMappings[i];
import org.jkiss.dbeaver.model.struct.*;
                        session,
        }
                    retryInsert = false;
                rowValues[column.targetIndex] = attrValue;

                        txnManager.setAutoCommit(monitor, false);
        if (targetObject == null) {
    private List<Object[]> previewRows;
                    txnManager.setAutoCommit(targetSession.getProgressMonitor(), oldAutoCommit);

    private DatabaseConsumerSettings settings;
            return ((DBPReferentialIntegrityController) dbsObject).getChangeReferentialIntegrityStatement(monitor, enable);

    }
                if (txnManager != null && txnManager.isSupportsTransactions()) {

            } catch (DBCFeatureNotSupportedException e) {
                }
    @Nullable
        DBSObject dbsObject = checkTargetContainer(monitor);
        this.containerMapping = containerMapping;
        } finally {


                }
            }
                    DBSManipulationType.INSERT,
        if (bulkLoadManager != null) {
    @Nullable
    }
        if (containerMapping == null) {
                    }
        return containerMapping == null ? localTargetObject : containerMapping.getTarget();
                    rowValues[column.targetIndex] = column.valueTransformer.transformAttribute(
                // No value handler - get raw value
        try {
    private DBCExecutionContext targetContext;
            }

        }
        }
            throw new DBException("No target container selected");
    private DBSDataBulkLoader.BulkLoadManager bulkLoadManager;
                } else {
                Object attrValue = rowValues[column.targetIndex];
                if (oldCatalog != null) {
                        log.error("Error getting target attribute");
    public DBSObjectContainer getTargetObjectContainer() {
    public void setSettings(@Nullable DatabaseConsumerSettings settings) {

                containerMapping.getChangedPropertiesMap());

                    }
                final DataTransferEventProcessorDescriptor descriptor = registry.getEventProcessorById(entry.getKey());
        }
                        DBNDatabaseNode objectNode = DBNUtils.getNodeByObject(targetObject);
                session.getProgressMonitor(),
                    }
                DatabaseMappingAttribute targetAttr = column.targetAttr;
 */

                            columnMapping.targetAttr.setTarget(attribute);
        sourceBindings = rsAttributes;
                Map<String, Object> options = new HashMap<>();
    }
    /*
            this.containerMapping = settings.getDataMapping((DBSDataContainer) sourceObject);
        if (targetContext != null && useIsolatedConnection) {
                txnManager.commit(targetSession);

                targetSession.close();
 *
 * See the License for the specific language governing permissions and
                } catch (DBException e) {
        @Override
        if (container != null) {
                boolean retryInsert;

    @Nullable
    }
            this.entity = entity;
                    } catch (DBCException e) {
        this.settings = settings;
    private boolean createTargetDatabaseObjects(DBRProgressMonitor monitor, DBSObject dbObject) throws DBException {
                        processor.processEvent(monitor, IDataTransferEventProcessor.Event.FINISH, this, task, entry.getValue());
                throw new DBCException("Can't initialize database consumer. No target object and no target container");
    /**

                // Refresh node first (this will refresh table data as well)
        return targetAttributes;
    private final DBCStatistics statistics = new DBCStatistics();
                            }
        }


        }
            } catch (DBCException e) {
    }
                    }
            throw new DBCException("Internal error: consumer mappings not set");
                        }
                        DBPPlatformUI.UserResponse response = DBWorkbench.getPlatformUI().showErrorStopRetryIgnore(message, e, true);
    }
                }
        }
                    }
            } catch (Exception e) {

            useIsolatedConnection = !isPreview && settings.isOpenNewConnections() && !dataSourceContainer.getDriver().isEmbedded();
                                options.put(DBSDataManipulator.OPTION_INSERT_REPLACE_METHOD, insertMethod);
                    try {
 * limitations under the License.
                    }
            columnMapping.sourceValueHandler = columnMapping.sourceAttr.getValueHandler();
import org.jkiss.dbeaver.model.meta.DBSerializable;
        public DBPDataKind getDataKind() {
                    final IDataTransferEventProcessor<DatabaseTransferConsumer> processor = descriptor.create();
        // Create all necessary database objects
        }
            }
    private static class PreviewColumnInfo extends AbstractAttribute implements DBSEntityAttribute {
        }
                    DBNModel navigatorModel = DBNUtils.getNavigatorModel(targetObject);
            if (column == null || column.targetIndex < 0) {



            return this.binding.getDataSource();
 */
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            }
                            try {
            bulkLoadManager.addRow(targetSession, rowValues);
            return targetObjectContainer.getDataSource().getContainer();
            return DBUtils.getObjectFullName(targetObjectContainer, DBPEvaluationContext.UI);
        DBSDataManipulator targetObject = getTargetObject();
        @NotNull
        }
                insertBatch(true);
            if (column.sourceValueHandler != null) {
        public void add(@NotNull Object[] attributeValues) throws DBCException {
    private DBSDataManipulator.ExecuteBatch executeBatch;
    }
                        DBExecUtils.tryExecuteRecover(targetSession, targetSession.getDataSource(), param ->
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0

            (!settings.isTransferAutoGeneratedColumns() && attr.isAutoGenerated()) ||
            if (needCommit) {
                    if (navigatorModel != null) {
                    }
            case recreate -> targetName + " [Recreate]";

                    attributes,
        if (settings != null) {
                        txnManager.rollback(targetSession, null);
        // 1. This is the end of the insert operation (fetchEnd)

            if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
        }
            } else {
                continue;
        } catch (Throwable e) {
        public DBDValueHandler sourceValueHandler;
                log.debug("Error reverting auto-commit mode", e);
            }

                if (descriptor == null) {
            return DBIcon.TREE_FOLDER_TABLE;
import org.jkiss.dbeaver.tools.transfer.*;
        final Object document;
            executeBatch = new PreviewBatch();
                    !settings.getOnDuplicateKeyInsertMethodId().equals(DBSDataManipulator.INSERT_NONE_METHOD);
        DBSDataManipulator targetObject = getTargetObject();
                                log.debug("Can't get insert replace method", e);
            }
    private DBDAttributeBinding[] sourceBindings;
        if (!isPreview && targetObject != null) {
                for (DatabaseMappingAttribute attr : containerMapping.getAttributeMappings(new VoidProgressMonitor())) {
    }
        DBSDataContainer sourceObject = getSourceObject();
                } else {
                            DBWorkbench.getPlatform().getSQLDialectRegistry().getInsertReplaceMethod(insertMethodId);
                        if (ignoreDuplicateRowsErrors && (e.getCause() instanceof SQLException)) {
        // 3. We approached the amount of rows selected for commenting
            throw new DBCException("Error initializing exporter", e);
        DBSObjectContainer schema = settings.getContainer();
    @NotNull
                    throw new DBCException("Can't resolve target attribute for [" + columnMapping.sourceAttr.getName() + "]");
                DBSDataBulkLoader bulkLoader = DBUtils.getAdapter(DBSDataBulkLoader.class, targetContext.getDataSource());
                continue;
                    // Use source attr. Some datasource (e.g. document oriented do not have strict set of attributes)
    private class PreviewBatch implements DBSDataManipulator.ExecuteBatch {
                        contextDefaults.setDefaultCatalog(monitor, catalog, (DBSSchema) dbObject);
                    attrValue = column.sourceValueHandler.fetchValueObject(
                    try {
                }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                targetSession.getProgressMonitor().subTask("Commit changes");
                        if (disableUsingBatches) {
                        }
        }
                        }
                            } catch (DBException e) {
        // No need. monitor is incremented in data reader
                                DBDInsertReplaceMethod insertMethod = insertReplaceMethod.createInsertMethod();
                        processor.processError(monitor, error, this, task, entry.getValue());
        }
        if (session.getDataSource().getInfo().isDynamicMetadata()) {
                        }
        }
                } catch (DBException e) {
                    log.error("Error opening entity editor for '" + targetObject.getName() + "'", e);
    ) {
                    DBSDocumentContainer docContainer = (DBSDocumentContainer) (targetObject instanceof DBSDocumentContainer ? targetObject : sourceObject);
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(targetSession.getExecutionContext());
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
        @NotNull TransferParameters parameters,
    }
import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;

                DatabaseTransferUtils.executeDDL(session, actions);
                        throw new DBCException("Error creating bulk loader", e);
            rsAttributes = DTUtils.makeLeafAttributeBindings(session, sourceObject, resultSet);
                    }
 * Stream transfer consumer
        if (!isPreview && targetSession != null && oldAutoCommit != null) {
        @Override
            columnMapping.targetValueHandler = DBUtils.findValueHandler(targetContext.getDataSource(), targetAttr);
                }
                            objectNode.refreshNode(monitor, DBNEvent.FORCE_REFRESH);
            try {
        isPreview = preview;
    @Override
import org.jkiss.code.NotNull;
        DBSDataManipulator targetObject = getTargetObject();
                if (column.sourceAttr instanceof DBDAttributeBindingCustom) {
            return targetObjectContainer;
            if (!isPreview && containerMapping != null) {
        return isPreview;
        if (targetObjectContainer != null) {

            DBCTransactionManager txnManager = DBUtils.getTransactionManager(targetSession.getExecutionContext());
                            case STOP -> throw new DBCException("Can't insert row", e);
                DBNModel navigatorModel = DBNUtils.getNavigatorModel(container);
        if (targetObjectContainer != null) {
        if (targetObject != null) {
        rowsExported++;
    }

import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
            (containerMapping.getTarget() != null || !CommonUtils.isEmpty(containerMapping.getTargetName()));
        }
        // Do commit action in these cases:
            } else if (sourceObject instanceof DBSDocumentContainer && dynamicTarget) {
        return getDataSourceContainer() == null ? null : getDataSourceContainer().getProject();
 * you may not use this file except in compliance with the License.
                    targetAttr = new PreviewColumnInfo(null, columnMapping.sourceAttr, columnMapping.targetIndex);
    @Override
                    DatabaseTransferUtils.refreshDatabaseModel(monitor, settings, containerMapping);
            }

        for (int i = 0; i < columnMappings.length; i++) {
                        rsAttributes,
            targetContext = useIsolatedConnection ?
    @Override
        return checkTargetContainer(monitor) instanceof DBPReferentialIntegrityController;
                }
                if (container == null) {
                // Mappings can be outdated so is the target object.
        return obj instanceof DatabaseTransferConsumer &&
            return "?";
        boolean needCommit = force || ignoreDuplicateRowsErrors || ((rowsExported % settings.getCommitAfterRows()) == 0);
                    } catch (Throwable e) {
                try {


    public DBPImage getObjectContainerIcon() {
