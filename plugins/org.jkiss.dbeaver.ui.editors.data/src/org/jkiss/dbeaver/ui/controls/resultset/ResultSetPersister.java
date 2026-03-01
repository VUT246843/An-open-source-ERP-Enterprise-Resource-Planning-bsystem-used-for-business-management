            if (change.getValue() instanceof DBDAttributeBinding ab) {

                    // Empty identifier. We have to define it
                        DBUtils.releaseValue(curValue);
                }
                        processStatementChanges(statement);
                        }
                            }
import org.jkiss.dbeaver.ui.ISmartTransactionManager;
                } else if (!rowIdentifier.isValidIdentifier()) {
        // Update keys
            if (!hasComplexUpdates && isComplexNestedAttribute(change.getKey())) {
    private static final Log log = Log.getLog(ResultSetPersister.class);
                Throwable[] error = new Throwable[1];
                                cascadeStats.add(cascadeStat);
                            DBUtils.getObjectFullName(rowIdentifier.getUniqueKey(), DBPEvaluationContext.UI) +

            throw new DBCException("Internal error: can't get single entity metadata, insert is not possible");

import org.eclipse.core.runtime.IStatus;
                    DBCTransactionManager txnManager = DBUtils.getTransactionManager(getExecutionContext());
        }
    }

    }
                        if (error == null) {
     * @param monitor  progress monitor
        }
            for (DBDAttributeValue col : keyAttributes) {
            if (!generateScript) {
        public DBSDataContainer getDataContainer() {
                    } catch (DBCException e) {
        }

    }
    private static boolean isComplexNestedAttribute(DBDAttributeBinding attr) {

        }

                    log.debug("Can't find target column for auto-generated key '" + keyAttribute.getName() + "'");

        final DBSEntity entity;
                            } else {

                UIUtils.runInProgressService(monitor1 -> {
                DBDValueHandler valueHandler = DBUtils.findValueHandler(session, keyAttribute);
                    }
                        }
            }
                }
    @NotNull
            deleteStats = new DBCStatistics();
                }
                    }
        private void processStatementChanges(DataStatementInfo statement) {

        @Nullable
        viewer.getActivePresentation().updateValueView();
                            } else {
        return attrs;
        boolean supportsRI = dataManipulator.getDataSource().getInfo().supportsReferentialIntegrity();
            }
                    try {
    public List<DBEPersistAction> getScript() {
                List<DataStatementInfo> cascadeStats = new ArrayList<>();
                    if (!isVirtualColumn(changedAttr)) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    identifierGroups.computeIfAbsent(rowIdentifier, k -> new ArrayList<>()).add(changedAttr);
                }
                log.warn("Error refreshing rows", ex);
            Map<String, Object> options,
                            session,
            for (DBDAttributeBinding binding : keyColumns) {

    }
            }
        return !deletedRows.isEmpty();
                            0);
        }
                        rowsChanged = reflectChanges();
            }
                        }
     * Filter changes
                                hasKey = false;
            attrs.addAll(row.getChangedAttributes());

            DBCStatistics stats
                }


                        viewer.updateEditControls();
            options.put(DBPScriptObject.OPTION_FULLY_QUALIFIED_NAMES, settings.isUseFullyQualifiedNames());
            for (DataStatementInfo stat : statements) {
            (entity instanceof DBSDocumentContainer || entity.getDataSource().getInfo().isDynamicMetadata())
                    DBSEntity refEntity = ref.getParentObject();
                    }

                }
                    } catch (Throwable e) {
    interface DataUpdateListener {
                    attributes[statement.updateAttributes.size() + i] = statement.keyAttributes.get(i).getValue();
        for (ResultSetRow row : this.rowIdentifiers.keySet()) {
    private void prepareInsertStatements(@NotNull DBRProgressMonitor monitor)

                        } else {

            }
            return ResultSetPersister.this;
                        List<? extends DBSEntityAttributeRef> attrRefs = ((DBSEntityReferrer) ref).getAttributeReferences(monitor);
    }
    }
                        if (!txnManager.isAutoCommit()) {
            @Nullable DataUpdateListener listener,
            insertStatements.add(statement);
                            session,
        DataUpdaterJob(
            Map<DBDRowIdentifier, List<DBDAttributeBinding>> identifierGroups = new LinkedHashMap<>();
                                    + "' can't be used as a key. Value clone is not supported.");
            }
 * Unless required by applicable law or agreed to in writing, software
        final DBCExecutionContext executionContext = viewer.getExecutionContext();
import org.eclipse.osgi.util.NLS;
        ) {
                if (col.getAttribute().isAutoGenerated() && DBUtils.isNullValue(col.getValue())) {
                // Reflect changes
            UIUtils.runInProgressService(monitor ->
                            txnManager.rollback(session, savepoint);
                batch.generatePersistActions(session, script, options);
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {

            for (DataStatementInfo stat : insertStatements) {
        }
        @Override
     */
            }
                )) {
            row.setState(ResultSetRow.STATE_NORMAL);
        viewer.queueDataPump(new RowRefreshJob(
                                break;
        }
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
            return dm;
    private void prepareStatements(@NotNull DBRProgressMonitor monitor, ResultSetSaveSettings settings) throws DBException {
        model.refreshChangeCount();

                });
                            constraint.setValue(keyValue);
        private final ResultSetSaveSettings settings;
            }
            if (viewer.getContainer() instanceof IResultSetContainerExt) {
                }
        return result;
        }
                    } catch (Throwable e) {
            if (row.isChanged()) {
                                    } else {
                UIUtils.syncExec(() -> {
        }
                if (change.getValue() instanceof DBDAttributeBinding ab && attrRefs.contains(ab)) {
            throw new DBCException("Can't persist data - not connected to database");
        for (ResultSetRow row : changedRows) {
                    // Virtual id should be created if we missing natural one
                    continue;
                            // Got it
                                batch.generatePersistActions(session, script, options);
 * See the License for the specific language governing permissions and

                    }
    private boolean isVirtualColumn(@Nullable DBDAttributeBinding column) {
            try {
                monitor.subTask(ResultSetMessages.controls_resultset_check_autocommit_state);
import org.jkiss.dbeaver.DBException;
                }
                        }
        if (table == null) {
                        // Got it. Just update column oldValue
    /**
    }

        if (!stat.updatedCells.isEmpty()) {
            }

                        if (txnManager != null && !txnManager.isAutoCommit()) {
                                monitor.subTask("Disable auto-commit mode");
                                        log.debug("Can't find attribute value for '" + attribute.getName() + "' recursive delete");
                        viewer.redrawData(false, true);
     */
                    // Key not found
                for (DBSEntityAssociation ref : references) {
        this.viewer = viewer;
        public Throwable getError() {
        }
                            batch.add(DBDAttributeValue.getValues(statement.keyAttributes));

    {

            }
    public boolean hasInserts() {

                        // It is already delete cascade - just ignore it
                    DBDAttributeBinding binding = model.getAttributeBinding(statement.entity, keyAttribute.getName());
                    if (monitor.isCanceled()) break;
        DBSEntity entity = rowIdentifier.getEntity();
                    if (!viewer.getControl().isDisposed()) {
 * limitations under the License.
                            statement.updatedCells.put(k, keyValue);
                            if (refreshValues[i] != null) {
                                DBSEntityAttribute attribute = attrRef.getAttribute();
            }

            throws DBCException {
            @NotNull List<ResultSetRow> rows
        if (monitor == null) {
        private Throwable executeStatements(DBCSession session) {
                ResultSetPersister.this.deleteStatements.size()
                        DBDAttributeBinding column = columns[k];
        ) {

                if (stat.executed && stat.row == row) {
        }
                    if (ref instanceof DBSEntityReferrer) {
                        DBSDataManipulator dataContainer = getDataManipulator(statement.entity);
        for (var rowEntry : rowIdentifiers.entrySet()) {
                                DBCStatistics bs = batch.execute(session, options);
        }
        @Override
        DBSEntity entity = model.getSingleSource();
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
                throw new DBCException("No unique row identifier is result set. Cannot proceed with row(s) delete.");
                            0,
                            DBSDataContainer.FLAG_REFRESH,
            DBDAttributeBinding docAttr = model.getDocumentAttribute();
                    return true;
        RowRefreshJob(
                        continue;
        @NotNull
                            for (DBSEntityAttributeRef attrRef : attrRefs) {
            deleteStatements.add(statement);
                        return e;
                            // Make single array of values
        }

import org.jkiss.dbeaver.utils.GeneralUtils;
                            }
        }
        @Nullable final DataUpdateListener listener
        List<DBDAttributeBinding> attrRefs = new ArrayList<>();
            if (!generateScript && txnManager != null) {
            }
                                txnManager.setAutoCommit(monitor, false);
            DBCSession session,
                    break;
                DBWorkbench.getPlatformUI().showError("Data error", "Error generating script", error);
        if (!row.isChanged()) {

                }
            UIUtils.asyncExec(viewer::fireResultSetChange); // Update "save" and "cancel" buttons
        DBCExecutionContext executionContext = viewer.getContainer().getExecutionContext();
                    this.listener.onUpdate(error == null);
            return false;
                        for (int i = 0; i < rows.size(); i++) {
                updateStatements.add(statement);
                for (Map.Entry<DBDAttributeBinding, Object> changedValue : row.getChanges()) {
                    continue;
        return true;
                            DBWorkbench.getPlatformUI().showError(
                        }
                        }
 */
                        if (((ISmartTransactionManager) container).isSmartAutoCommit()) {
            }
        return report;
        }
                Object keyValue = valueHandler.fetchValueObject(session, resultSet, keyAttribute, i);
    }

                result.add(stat);
                }
                    break;
        }
        } else {
                }
                            constraints.add(constraint);
        {
            for (var identifierEntry : rowEntry.getValue().entrySet()) {
            if (changes == null) {
                    if (error[0] != null) {
        boolean deepCascade
                        txnManager.releaseSavepoint(monitor, this.savepoint);

     * Data update listener

            }
                    for (int k = 0; k < columns.length; k++) {
                monitor,
            job.schedule();
                        return e;
                List<DataStatementInfo> cascadeStats = prepareDeleteCascade(monitor, rowIdentifier, deleteStatements, deepCascade);
        private Throwable error;

                                attributes[i] = statement.updateAttributes.get(i).getValue();
    @NotNull
import org.jkiss.dbeaver.model.struct.*;
    }
                    if (DataUpdaterJob.this.autocommit || error == null) {
                            statement.needKeys() ? new KeyDataReceiver(statement) : null,
        @Override
        private final DBSDataContainer dataContainer;
                ResultSetMessages.controls_resultset_viewer_monitor_aply_changes,
        private final DBDRowIdentifier rowIdentifier;

                        if (!hasKey) {
        return false;
                throw new DBCException("Attributes of unique key '" +
                return error[0];
                        throw new InvocationTargetException(error[0]);
    public ResultSetSaveReport generateReport() {
import java.lang.reflect.InvocationTargetException;
        }
                    monitor.worked(1);
        report.setHasReferences(dataSource != null && dataSource.getInfo().supportsReferentialIntegrity());
        if (executionContext == null) {
                DBExecUtils.tryExecuteRecover(monitor, session.getDataSource(), param -> {
                            new ExecutionSource(dataContainer))) {
                    addedRows.add(row);
    private void prepareUpdateStatements(@NotNull DBRProgressMonitor monitor) throws DBException {
        this.columns = model.getAttributes();
                    }
                        try (DBSDataManipulator.ExecuteBatch batch = dataContainer.updateData(
        Set<DBDAttributeBinding> updatedAttributes = this.getUpdatedAttributes();
        for (ResultSetRow row : deletedRows) {
                if (!updated) {
                    try {
        if (needsSingleEntity) {
                                cascadeStat.keyAttributes.addAll(refKeyValues);
            }
                                this.notifyContainer(bs);
                    this.autocommit = txnManager.isAutoCommit();
                    }
     * @param row row to check
            DataStatementInfo statement = new DataStatementInfo(DBSManipulationType.INSERT, row, table);
    }
        for (ResultSetRow row : changedRows) {
                            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
                }
                    DBUtils.getObjectFullName(defIdentifier.getUniqueKey(), DBPEvaluationContext.UI) +
        @NotNull
                    } catch (Throwable e) {
import org.eclipse.core.runtime.Status;
        if (references != null) {
        prepareUpdateStatements(monitor);
                            if (DBUtils.isNullValue(keyValue)) {
            // FIXME: but it will require to provide dynamic document metadata.
            )) {
                final AbstractExecutionSource executionSource = new AbstractExecutionSource(
     * Data statement

        changedRows.clear();
                            model.updateCellValue(changedValue.getKey(), row, null, changedValue.getValue(), false);
                        if (keyValue instanceof DBDContent) {
                            DBDAttributeValue.getAttributes(statement.keyAttributes),
                    // table has auto-increment columns and user performs simple row update
        @Nullable
    // Changes affects only rows which statements executed successfully
                });
                    try {
                            log.error(e);
        }
                }
                        this.savepoint = txnManager.setSavepoint(monitor, null);
                    }
            throw new DBCException("Internal error: can't find entity identifier, delete is not possible");
        viewer.updateEditControls();

        for (ResultSetRow row : changedRows) {
                final DBDAttributeBinding[] curAttributes = viewer.getModel().getAttributes();
            insertStats = new DBCStatistics();
        @NotNull
    private final List<DataStatementInfo> deleteStatements = new ArrayList<>();
    @NotNull
            for (Map.Entry<Integer, Object> entry : stat.updatedCells.entrySet()) {
                return e;
            }

        final DBSManipulationType type;
                case ResultSetRow.STATE_NORMAL:
            }
                        //curRows.get(statement.row.row)[colIndex] = keyValue;
        DBCExecutionContext executionContext = viewer.getContainer().getExecutionContext();

        for (Map.Entry<DBDAttributeBinding, Object> change : row.getChanges()) {

/*
        }
    // Returns true only if our attribute has parent of type array
                    } catch (DBException e) {
                }
        }
                    if (container instanceof ISmartTransactionManager) {
                        binding,
                DBUtils.releaseValue(row.values[entry.getKey()]);
                                throw new DBCException("Column '" + metaColumn.getFullyQualifiedName(DBPEvaluationContext.UI)
                                if (attribute != null) {
        final DBDRowIdentifier rowIdentifier = model.getDefaultRowIdentifier();
                    try {
            }
        throws DBException
        public Object getSourceDescriptor() {
                    // Update only if metadata wasn't changed
    ) throws DBException {
    }
                final Object[][] refreshValues = new Object[rows.size()][];
                        DBSDataManipulator dataContainer = getDataManipulator(statement.entity);
                            }
                                    ResultSetUtils.formatRowCount(DataUpdaterJob.this.updateStats.getRowsUpdated())
        viewer.redrawData(false, rowsChanged);
                        statement.updateAttributes.add(new DBDAttributeValue(changedAttr, model.getCellValue(changedAttr, row)));
        refreshRows.addAll(addedRows);
                    break;
            for (int i = 0; i < statement.keyAttributes.size(); i++) {
    }
                        continue;

            if (generateScript) {
                        prepareStatements(monitor1, settings);
    }
                        }
                            filter,
        }


            }
                        // May be savepoints not supported
                case ResultSetRow.STATE_REMOVED:
            try (DBCSession session = getExecutionContext().openSession(
                    }
                                    copiedContext.resetContents();
        @Override
                ResultSetMessages.controls_resultset_viewer_job_update

                    "Refresh row(s) after insert/update"
        Set<DBDAttributeBinding> attrs = new LinkedHashSet<>();
                            DBDAttributeValue.getAttributes(statement.updateAttributes),
                DBDRowIdentifier rowIdentifier = attr.getRowIdentifier();
        //job.schedule();
    private boolean execute(
                        DBSDataManipulator dataContainer = getDataManipulator(statement.entity);
import org.jkiss.dbeaver.Log;

            return false;
                DBCTransactionManager txnManager = DBUtils.getTransactionManager(getExecutionContext());

                        for (DBDAttributeBinding keyAttr : idAttributes) {
        }
    private final List<DBDValue> clonedValues = new ArrayList<>();

            } catch (DBException e) {

                            DBDAttributeValue.getAttributes(statement.keyAttributes),

                            }
                    }
            return null;
            if (entity == null) {
            ResultSetRow row = rowEntry.getKey();
                if (stat.executed && stat.row == row) {
        deletedRows.clear();
            } finally {
                            //curRows.get(statement.row.row)[k] = keyValue;
            this.row = row;
/*

                    changes.put(change.getKey(), change.getValue());
        } catch (Exception e) {
    /**
        // Make insert statements
            this.rowIdentifier = rowIdentifier;
                            executionSource,
                DBSEntity table = rowIdentifier.getEntity();

        }
                for (DBDAttributeBinding changedAttr : changedAttrsForTable) {
                                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    /**
                    monitor,
                    }
        } else {
                }
                if (!updated) {
                        try {
            @NotNull ResultSetSaveSettings settings,

                    }
    private boolean reflectChanges() {
        }
                attrRefs.add(ab);
                        viewer.redrawData(false, rowsChanged);
        @Override
        return changes;
import org.jkiss.dbeaver.model.data.*;
                        try (DBSDataManipulator.ExecuteBatch batch = dataContainer.insertData(
                    reflectKeysUpdate(stat);

                    model.cleanupRow(row);
                    }
            try {
            try {
                            continue;
            }
                        model.getCellValue(binding, row)));
            }
        @NotNull

                            session,
            if (row.isChanged()) {
                        }
            }

                return Status.CANCEL_STATUS;
                if (this.listener != null) {
        if (executionContext == null) {
        throws DBException {
    @NotNull
            }
                        refreshValues[i] = dataReceiver.getRowValues();
                }
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
    public Set<DBDAttributeBinding> getUpdatedAttributes() {
                                        refKeyValues.add(value);

                            viewer.setStatus(GeneralUtils.getFirstMessage(error), DBPMessageType.ERROR);
            for (DBDAttributeBinding attr : updatedAttributes) {

            }
        }
        }
                    Object curValue = model.getCellValue(changedValue.getKey(), row);
                }
    private class DataUpdaterJob extends DataSourceJob {
            model.setUpdateInProgress(this);

        private final boolean generateScript;
        @Override
            if (!identifierGroups.isEmpty()) {
        }
                    // We shouldn't be here ever!
                boolean updated = false;

        if (hasDeletes()) {
                case ResultSetRow.STATE_ADDED:
            DBRProgressMonitor monitor = session.getProgressMonitor();
                }
            // Probably we have only virtual one with empty attribute set
            switch (row.getState()) {
    private final List<ResultSetRow> changedRows = new ArrayList<>();
                for (DBDAttributeBinding metaColumn : idColumns) {
        }
                            final Object keyValue = viewer.getModel().getCellValue(keyAttr, row);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        addedRows.clear();
                                txnManager.rollback(session, null);
        if (entity instanceof DBSDataManipulator dm) {

                    throw new DBCException(
            DataStatementInfo statement,

    void checkEntityIdentifiers() throws DBException
                monitor.done();
    private final List<DBEPersistAction> script = new ArrayList<>();
    private final ResultSetViewer viewer;
                    } catch (DBException e) {
        for (ResultSetRow row : addedRows) {

            } else {
                List<DBDAttributeBinding> changedAttrsForTable = identifierEntry.getValue();
        }
        for (ResultSetRow row : addedRows) {
     *
                    if (viewer.getModel().isDynamicMetadata() && attr.getDataKind() == DBPDataKind.DOCUMENT) {

        }
        @Nullable
                            Object[] attributes = new Object[statement.updateAttributes.size() + statement.keyAttributes.size()];
    private final DBDAttributeBinding[] columns;
                                keyValue = vc.cloneValue(monitor);
            this.entity = entity;
            return job.getError() == null;
                // Error happened during data refresh
                                    ResultSetUtils.formatRowCount(DataUpdaterJob.this.deleteStats.getRowsUpdated()),
            }
                DBDRowIdentifier rowIdentifier = identifierEntry.getKey();
            this.type = type;
                model.setUpdateInProgress(null);
     * @return map of changed attributes and their new values null if no changes
        if (entity.getDataSource() != null &&
    public boolean hasUpdates() {
                    deletedRows.add(row);
                    }
    private final ResultSetModel model;
            }
                            0,
 * you may not use this file except in compliance with the License.
}
        boolean generateScript,
                changedRows++;
                DBCExecutionPurpose.USER,
                    attributes[statement.updateAttributes.size() + i] = DBDNull.INSTANCE;
import org.jkiss.dbeaver.ui.UITask;
                            }
                    }
        DBPDataSource dataSource = viewer.getDataSource();
                    // If new value and old value are the same - do not release it
            // FIXME: do not refresh documents for now. Can be solved by extracting document ID attributes
                    monitor.worked(1);
        private boolean autocommit;
                if (change.getValue() instanceof DBDAttributeBinding ab) {

        if (executionContext == null) {

                            }
                        statement.keyAttributes.add(new DBDAttributeValue(column, model.getCellValue(column, row)));
            }
                    if (monitor.isCanceled()) break;
                            null,
            statement.executed = false;
        DataStatementInfo statement;
            } finally {
            super("Refresh rows", executionSource, executionContext);
        report.setInserts(addedRows.size());
                    }
        DataStatementInfo(@NotNull DBSManipulationType type, @NotNull ResultSetRow row, @NotNull DBSEntity entity) {
                    statement.keyAttributes.add(new DBDAttributeValue(metaColumn, keyValue));
            monitor.beginTask(
            return Status.OK_STATUS;

                    if (ref instanceof DBSTableForeignKey && ((DBSTableForeignKey) ref).getDeleteRule() == DBSForeignKeyModifyRule.CASCADE) {
                if (identifier.isIncomplete()) {
    static class DataStatementInfo {
                    new DBDAttributeValue(

                throw new DBException("Error preparing update statements", e.getTargetException());
                    break;
        return rowsChanged;
            job.run(monitor);
            rowIdentifier,
        }
        if (rowIdentifier == null) {
    }
            List<? extends DBCAttributeMetaData> keyAttributes = rsMeta.getAttributes();
                        if (column.isAutoGenerated()) {
                UIUtils.syncExec(() -> {
                            List<DBDAttributeValue> refKeyValues = new ArrayList<>();
                        keyValue = changes.get(metaColumn);
        }
    }
            }
        final ResultSetRow row;
                    if (monitor.isCanceled()) break;
                    if (binding != null) {
                        } catch (DBException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            } else if (!defIdentifier.isValidIdentifier()) {
    }
                            Object[] attributes = new Object[statement.keyAttributes.size()];
 * You may obtain a copy of the License at
                error = executeStatements(monitor);
                    }
        if (monitor == null) {
                        dataContainer.readData(
        }
            this.statement = statement;
                            "' - attributes of key '" +
                            if (generateScript) {
                            for (int i = 0; i < statement.updateAttributes.size(); i++) {
                    dataContainer, getExecutionContext(), this);
                        }
                        processStatementError(statement, session);
        }
        throws DBException {
        }

                for (DataStatementInfo statement : ResultSetPersister.this.deleteStatements) {
                    }
    class KeyDataReceiver implements DBDDataReceiver {


                        throw new DBCException("No unique key defined");
                        updated = true;
                            new ExecutionSource(dataContainer),
                    }
                }
        }
        if (hasComplexUpdates && !attrRefs.isEmpty()) {
        @Override

        void notifyContainer(DBCExecutionResult result) {
                }
                throw new DBCException("Can't detect source entity");
            }
        }
    private final List<DataStatementInfo> insertStatements = new ArrayList<>();
                                if (keyValue instanceof DBDContent copiedContext) {
            Object[] attributes,
        }
        }
                this.notifyContainer(bs);
                    // [MSSQL] Sometimes driver returns empty list of generated keys if
        }
                    this.autocommit = true;
                            viewer.setStatus(
            DBDRowIdentifier defIdentifier = model.getDefaultRowIdentifier();
        if (supportsRI && deleteCascade) {
        return !addedRows.isEmpty();
                hasComplexUpdates = true;
    }
            if (identifier != null) {
                monitor.done();
                if (txnManager != null) {
                ((IResultSetContainerExt) viewer.getContainer()).handleExecuteResult(result);
            }
                model.refreshHintsInfo(monitor, model.getAllRows(), true));
                                ));
        public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) {
                    }
        @Override
                        log.debug("Can't set savepoint", e);
                    monitor.worked(1);
    private final List<DataStatementInfo> updateStatements = new ArrayList<>();
            batch.add(attributes);
                }

        @Override
 * DBeaver - Universal Database Manager
            @NotNull ResultSetExecutionSource executionSource,
        ) {

        // Prepare rows
                    try {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                }
                            session,
            executionContext,
                });
                        processStatementError(statement, session);
                        try (DBSDataManipulator.ExecuteBatch batch = dataContainer.deleteData(
            for (int i = 0; i < keyAttributes.size(); i++) {
    // Reflect data changes in viewer
                    rowsChanged = true;
                        // Document contains ID inside - no need to check
            prepareDeleteStatements(monitor, settings.isDeleteCascade(), settings.isDeepCascade());
            throw new DBCException("No execution context");
                }
import org.jkiss.utils.CommonUtils;
                return null;
        }
                List<DBDAttributeBinding> idAttributes = rowIdentifier.getAttributes();
                        log.debug("Error during transaction rollback", e);
                if (stat.executed && stat.row == row) {
                                "Data error", "Error synchronizing data with database", error);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        public Object getExecutionController() {
            List<DBDAttributeBinding> keyColumns = rowIdentifier.getAttributes();
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
            }
                    }
                                rows.get(i).values = refreshValues[i];
                if (!generateScript && txnManager != null && this.savepoint != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
        } else {
import org.jkiss.dbeaver.model.*;
        return execute(monitor, generateScript, settings, listener);
        DBDRowIdentifier rowIdentifier = model.getDefaultRowIdentifier();
        return script;
        viewer.updatePanelsContent(false);
                return false;
                DataStatementInfo statement = new DataStatementInfo(DBSManipulationType.UPDATE, row, table);
                    viewer.fireResultSetChange();
            return false;
        if (rowIdentifier == null || rowIdentifier.isIncomplete()) {
                return true;
                }
        DataUpdaterJob job = new DataUpdaterJob(generateScript, settings, listener, executionContext);
                    reflectKeysUpdate(stat);
                        log.warn("Error rolling back after data refresh failure", ex);
                row.values[entry.getKey()] = entry.getValue();
                if (!generateScript) {
        collectChanges();
                List<DBDAttributeBinding> idColumns = rowIdentifier.getAttributes();
            } finally {
            log.debug("Error refreshing hints", e);
                    try {
    private DBSDataManipulator getDataManipulator(DBSEntity entity) throws DBCException {
    }
        boolean needsSingleEntity = this.hasInserts() || this.hasDeletes();
    }

        for (ResultSetRow row : model.getAllRows()) {
                    }
                if (viewer.getPreferenceStore().getBoolean(ModelPreferences.QUERY_ROLLBACK_ON_ERROR)) {
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(getExecutionContext());
                // Let's rollback if we are in transaction
                        statement.updatedCells.put(binding.getOrdinalPosition(), keyValue);

                        return e;
            statement.executed = true;
    private List<DataStatementInfo> prepareDeleteCascade(
        }
                        log.debug("Can't release savepoint", e);
            return dataContainer;
                    boolean rowsChanged = false;
                clonedValues.clear();
                                // We have a key. Let's delete
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            new ResultSetExecutionSource(viewer.getDataContainer(), viewer, this),
                    changes.put(change.getKey(), row.getChange(ab));
                    }
     * Applies changes.
    {
        }
            @NotNull DBCExecutionContext executionContext,

                    // Just skip it..

    /**
            for (Map.Entry<DBDAttributeBinding, Object> change : row.getChanges()) {
    boolean refreshInsertedRows() throws DBCException {
                        changedRows.add(row);
                            constraint.setOperator(DBCLogicalOperator.EQUALS);
                        }
            boolean generateScript,
            Map<String, Object> options = new LinkedHashMap<>();
        }
        @NotNull
                ResultSetRow row = stat.row;
        private DBCSavepoint savepoint;
        for (DBDAttributeBinding parent = attr.getParentObject(); parent != null; parent = parent.getParentObject()) {
                try (DBCSession session = getExecutionContext().openSession(
            prepareStatements(monitor, settings);
            }
        @Override
        refreshRows.addAll(changedRows);
            monitor.worked(1);
            return Status.OK_STATUS;
                            new ExecutionSource(dataContainer))) {

                    + ResultSetPersister.this.updateStatements.size() + 1);
    }
        // Remove deleted rows
        List<ResultSetRow> refreshRows = new ArrayList<>();
                    if (changes != null && changes.containsKey(metaColumn)) {

                    try {
import org.jkiss.dbeaver.model.exec.*;
                        continue;
            }
                                    clonedValues.add(copiedContext);
                        ResultSetRow row = rows.get(i);
 *
        @NotNull DBRProgressMonitor monitor,
            this.listener = listener;
                stats.accumulate(bs);
                            "' are missing in result set");
        public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet)

        }
                    if (!viewer.getControl().isDisposed() && viewer.getModel().getAttributes() == curAttributes) {
    @Nullable
            // Check for value locators
                            if (!refKeyValues.isEmpty()) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
        }
                } catch (DBCException e) {
                    if (changedValue.getValue() instanceof DBDAttributeBinding) {
                }
                } else {
     * Key data receiver
        Collection<? extends DBSEntityAssociation> references = entity.getReferences(monitor);

    private final List<ResultSetRow> deletedRows = new ArrayList<>();
            DBSDataManipulator.ExecuteBatch batch,
            // No key - can't refresh
                    try {

                    } catch (DBException e) {
                continue;
     */
                                NLS.bind(
                    log.warn("Can't determine autocommit state", e);
            }
        boolean rowsChanged = model.cleanupRows(addedRows);
import org.jkiss.dbeaver.ModelPreferences;
            return true;
                for (DBDAttributeBinding column : columns) {
                    // Auto-generated key not found
                    if (!UITask.run(() -> ValidateUniqueKeyUsageDialog.validateUniqueKey(viewer, executionContext))) {
            // Otherwise remove root element from the list
    private void reflectKeysUpdate(DataStatementInfo stat) {
                DBCAttributeMetaData keyAttribute = keyAttributes.get(i);
        }

            if (parent.getDataKind() == DBPDataKind.ARRAY) {
*/
        private final List<ResultSetRow> rows;
                                }
                        RowDataReceiver dataReceiver = new RowDataReceiver(curAttributes);
        DBSDataManipulator dataManipulator = getDataManipulator(rowIdentifier.getEntity());
    }

                DBDRowIdentifier rowIdentifier = changedAttr.getRowIdentifier();
package org.jkiss.dbeaver.ui.controls.resultset;
                                }
     */
                // Notify rsv container about statement execute
                    Object keyValue = model.getCellValue(metaColumn, row);
    @NotNull
                        List<DBDAttributeConstraint> constraints = new ArrayList<>();
    }

            }
     * @param listener value listener
                    value.release();
                    // Just ignore such empty keys. We can't do anything with them anyway
            }
                result.addAll(cascadeStats);
    private void collectChanges() {
        for (ResultSetRow row : deletedRows) {
                }
            }
            if (!generateScript) {
 *
    public boolean hasDeletes() {
                    row.setState(ResultSetRow.STATE_NORMAL);
            } catch (Throwable ex) {
        private DBCStatistics updateStats, insertStats, deleteStats;
                                    DBDAttributeValue value = DBDAttributeValue.getAttributeValue(stat.keyAttributes, attribute);

                    }
                                for (DBDAttributeValue kv : refKeyValues) {
                            }

                        }
            return false;
            }
                deleteStatements.clear();
                        "Can't update attribute '" + attr.getName() +

            } catch (InvocationTargetException e) {
        @NotNull DBDRowIdentifier rowIdentifier,
        int changedRows = 0;
        public DBCScriptContext getScriptContext() {
    }

        final Map<Integer, Object> updatedCells = new HashMap<>();
        KeyDataReceiver(DataStatementInfo statement) {
                    changes.put(ab, row.getChange(ab));
    }


        if (!viewer.getModel().isSingleSource()) {
    }
                            if (txnManager != null && txnManager.isSupportsTransactions() && txnManager.isAutoCommit()) {
        Map<DBDAttributeBinding, Object> changes = new LinkedHashMap<>(row.getChangesCount());
                            updated = true;
        model.refreshChangeCount();
            @NotNull DBCExecutionContext executionContext
import org.jkiss.code.NotNull;
        private void processStatementError(DataStatementInfo statement, DBCSession session) {
        this.model = viewer.getModel();
                }

                            try (DBCSession session = getExecutionContext().openSession(monitor, DBCExecutionPurpose.UTIL, "Rollback after data refresh failure")) {
                rowIdentifiers.put(row, identifierGroups);

                if (idAttributes.isEmpty()) {
                        }
                    row.clearChanges();
                if (rowIdentifier != null) {
 * Result set data updater
                    + ResultSetPersister.this.insertStatements.size()
     * Depending on attributes structure we leave only leaf elements or entire document (for document-oriented databases)
        private void extractDataAndProcessBatch(
            } else if (error != null) {
            for (DataStatementInfo stat : updateStatements) {
    private final Map<ResultSetRow, Map<DBDRowIdentifier, List<DBDAttributeBinding>>> rowIdentifiers = new LinkedHashMap<>();
                            dataReceiver,
    }
                        }
        collectChanges();
            for (Map.Entry<DBDAttributeBinding, Object> change : row.getChanges()) {
        public void close() {
    @NotNull

    private class RowRefreshJob extends ResultSetJobAbstract {
     */
        return !changedRows.isEmpty();
            if (docAttr != null) {
        report.setUpdates(changedRows);
                if (DBUtils.isNullValue(statement.keyAttributes.get(i).getValue())) {
                for (DataStatementInfo statement : ResultSetPersister.this.insertStatements) {
                            }

        }
    }
            return error;
        for (ResultSetRow row : deletedRows) {
            } catch (DBException e) {
            monitor.beginTask("Refresh updated rows", 1);
            this.dataContainer = dataContainer;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // Make delete statements

            return null;
                if (keyValue == null) {
        boolean hasComplexUpdates = false;
        if (refreshRows.isEmpty()) {
            for (DBDAttributeBinding changedAttr : changes.keySet()) {
        final List<DBDAttributeValue> updateAttributes = new ArrayList<>();
        }
            DataStatementInfo statement = new DataStatementInfo(DBSManipulationType.DELETE, row, rowIdentifier.getEntity());
            } catch (InterruptedException e) {
                }
                    }
                viewer.releaseDataReadLock();
import org.jkiss.dbeaver.model.sql.RowDataReceiver;
        }
    ) throws DBException {
        } else {
                                }
            return false;
        }
        try {
        }
        if (this.hasDeletes()) {
                }
                                    ResultSetMessages.controls_resultset_viewer_status_inserted_,
    ResultSetPersister(@NotNull ResultSetViewer viewer) {
        DBSEntity entity = rowIdentifier.getEntity();
                });
                                    ResultSetUtils.formatRowCount(DataUpdaterJob.this.insertStats.getRowsUpdated()),
                            break;
                }
                DBCStatistics bs = batch.execute(session, options);
        return column instanceof DBDAttributeBindingCustom;
                        boolean hasKey = true;
                if (attrRefs.contains(change.getKey())) {
            DBCResultSetMetaData rsMeta = resultSet.getMeta();
        boolean rowsChanged = false;
                                DataStatementInfo cascadeStat = new DataStatementInfo(DBSManipulationType.DELETE, stat.row, refEntity);
        ));
                            if (keyValue instanceof DBDValueCloneable vc) {
                for (DataStatementInfo statement : ResultSetPersister.this.updateStatements) {
        @NotNull
    }


                        processStatementChanges(statement);
            // Nothing to refresh
import java.util.*;
                    DBCExecutionPurpose.UTIL,
import org.jkiss.code.Nullable;
        final DBSEntity table = viewer.getModel().getSingleSource();
            // Now iterate over all statements and make cascade delete for each
            try {


                log.debug(e);
        }
        private Throwable executeStatements(DBRProgressMonitor monitor) {

            throw new DBCException("Entity " + entity.getName() + " doesn't support data manipulation");
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final List<ResultSetRow> addedRows = new ArrayList<>();
                    IResultSetContainer container = viewer.getContainer();
                    break;
        }
        ) throws DBException {
            Map<DBDAttributeBinding, Object> changes = collectUpdateChanges(row);
                                insertStats.accumulate(bs);
                                // Notify rsv container about statement execute

                    break;
        boolean executed = false;
    boolean applyChanges(@Nullable DBRProgressMonitor monitor, boolean generateScript, ResultSetSaveSettings settings, @Nullable DataUpdateListener listener)
                if (!this.autocommit && txnManager.supportsSavepoints()) {
                if (rowIdentifier == null) {
        if (hasInserts()) {
            if (!generateScript && txnManager != null) {
            throw new DBCException("No execution context");
     *

            updateStats = new DBCStatistics();
        boolean needKeys() {
                            // No key value for this row
        for (ResultSetRow row : changedRows) {
                    }
                }
                        //releaseStatements();
class ResultSetPersister {
                                    if (value == null) {
            return viewer;
import org.jkiss.dbeaver.ui.UIUtils;
            } finally {

        }
    @NotNull
                    if (row.isChanged()) {
                    // Try to find and update auto-increment column
    }
            Map<DBDAttributeBinding, Object> changes = collectUpdateChanges(row);
        ExecutionSource(DBSDataContainer dataContainer) {
        ResultSetSaveReport report = new ResultSetSaveReport();
            try {
                    for (int i = 0; i < rows.size(); i++) {

                    } catch (DBException e) {
                // Check attributes of non-virtual identifier
        }
        }
            this.generateScript = generateScript;
                    error[0] = executeStatements(session);
                            options)) {
                    }
            } else {
                statement.keyAttributes.add(new DBDAttributeValue(docAttr, model.getCellValue(docAttr, row)));
        }
    private Map<DBDAttributeBinding, Object> collectUpdateChanges(@NotNull ResultSetRow row) {
            this.rows = new ArrayList<>(rows);
                final DBSDataContainer dataContainer = executionSource.getDataContainer();
            refreshRows

                            final DBDAttributeConstraint constraint = new DBDAttributeConstraint(keyAttr);
                }
        @Nullable DBRProgressMonitor monitor,

                            extractDataAndProcessBatch(session, options, statement, batch, attributes, deleteStats);
    class ExecutionSource implements DBCExecutionSource {
            this.settings = settings;
        @NotNull List<DataStatementInfo> statements,
                            extractDataAndProcessBatch(session, options, statement, batch, attributes, updateStats);
            // If we have complex values then leave only nested elements attributes
                statement.keyAttributes.add(
        @NotNull ResultSetSaveSettings settings,
/**
        List<DataStatementInfo> result = new ArrayList<>();
        public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) {
                    return Status.OK_STATUS;
                    if (!isVirtualColumn(column)) {
        private final DataUpdateListener listener;

                } else {

                        processStatementChanges(statement);
 *
        void onUpdate(boolean success);
                        processStatementError(statement, session);
    }
    private void prepareDeleteStatements(@NotNull DBRProgressMonitor monitor, boolean deleteCascade, boolean deepCascade)
                        DBDDataFilter filter = new DBDDataFilter(constraints);
            DBDRowIdentifier identifier = viewer.getVirtualEntityIdentifier();
                            }

        }

    @NotNull
            if (!viewer.acquireDataReadLock()) {
                for (DBDValue value : clonedValues) {
                                System.out.println("DELETE! " + entity.getName());
                            DBDAttributeValue.getAttributes(statement.keyAttributes),
                row.clearChanges();
            if (defIdentifier == null) {
            @NotNull DBDRowIdentifier rowIdentifier,
                if (!CommonUtils.isEmpty(keyAttribute.getName())) {

                        if (attrRefs != null) {
                try {
                    "' are missing in result set. Cannot proceed with row(s) delete.");
            super(ResultSetMessages.controls_resultset_viewer_job_update, executionContext);
        report.setDeletes(deletedRows.size());
            }
    public void rejectChanges() {
                deleteStatements.addAll(cascadeStats);
            prepareInsertStatements(monitor);
            for (DataStatementInfo stat : deleteStatements) {
                        // Maybe savepoints not supported
        if (entity != null) {
                                    System.out.println("\tATTR: " + DBUtils.getObjectFullName(kv.getAttribute(), DBPEvaluationContext.UI) + "=" + kv.getValue());
        final List<DBDAttributeValue> keyAttributes = new ArrayList<>();
                    throw new DBCException("Attribute " + attr.getName() + " was changed but it hasn't associated unique key");
                        }
                    if (!Objects.equals(changedValue.getValue(), curValue)) {
                        throw new InvocationTargetException(e);
                // Ok, now we have refreshed values. Let's update real model
        }
                }
