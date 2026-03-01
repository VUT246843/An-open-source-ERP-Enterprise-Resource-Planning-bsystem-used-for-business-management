            DBSEntityAttribute attr = binding.getEntityAttribute();
                            // just make it again
                        int asteriskIndex = sqlQuery.getSelectItemAsteriskIndex();
        DBPConnectionConfiguration cfg = ctx.getConnectionConfiguration();
    public static DBSEntityConstraint getBestIdentifier(
                    return false;
                            log.error("Operation failed. Retry count remains = " + (tryCount - i - 1), lastError);
                    // Some other error
    public static void setExecutionContextDefaults(

import org.jkiss.dbeaver.model.virtual.DBVEntity;
            if (networkHandler instanceof DBWForwarder && ((DBWForwarder) networkHandler).matchesParameters(host, port)) {
    public static boolean isExecutionInProgress(@NotNull DBPDataSource dataSource) {
    }
            if (attribute.isPseudoAttribute()) {
        if (txnManager != null) {
                    }
    /**
            DBSEntity attrEntity = attr.getParentObject();
                if (pseudoAttribute != null && pseudoAttribute.getType() == DBDPseudoAttributeType.ROWID) {

import org.jkiss.dbeaver.model.net.DBWHandlerType;

                }
    public static void executeScript(DBCSession session, DBEPersistAction[] persistActions) {
                bindingMeta.setRowIdentifierStatus(ModelMessages.no_corresponding_table_column_text);
                                    break;
        for (DBWNetworkHandler networkHandler : ctx.getActiveNetworkHandlers()) {
                        if (sourceDescriptor instanceof SQLQuery query) {

                }
        return executionContext == null ||
                // To be editable we need this resultset contain set of columns from the same table
                        }
        boolean recoveryFailed;
                    if (isGoodReferrer(monitor, bindings, referrer)) {
            // Load transformers


        }
            return "Connection is in read-only state";
            }
                    }
                            if (entity != null) {
            } catch (NumberFormatException e) {
        DBPDataSourceContainer container = executionContext.getDataSource().getContainer();
            // Do this after natural identifiers search (see #3829)
            try {
        }

import org.jkiss.dbeaver.model.virtual.DBVUtils;
import org.jkiss.dbeaver.model.runtime.*;
import java.net.Authenticator;

        if (referrers != null) {
            if (recoverEnabled) {
        if (table instanceof DBSDocumentContainer documentContainer) {
    /**
        DBRProgressMonitor monitor = session.getProgressMonitor();
        return null;
            CommonUtils.equalObjects(attr1.getPrecision(), attr2.getPrecision()) &&
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
            }
        }
                    return ctx;
    }
            }
            return;

                    throw new DBDatabaseException(lastError, dataSource);
        }

            }

import org.jkiss.dbeaver.model.*;
            preferenceStore.getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT) : connectionType.isSmartCommit();
            monitor : new LocalCacheProgressMonitor(monitor);
                    }
        }
                        bindingMeta.getMetaAttribute().getEntityMetaData() != null ||
    public static DBPDataSourceContainer findConnectionContext(String host, int port, String path) {
                }
                if (referrer instanceof DBSEntityAssociation) {
import org.jkiss.dbeaver.model.qm.meta.QMMConnectionInfo;
                            sqlQuery = query;
        synchronized (ACTIVE_CONTEXTS) {
                }
        // Or use settings from the connection type
     */
                    }
/**
            SQLUtils.compareAliases(attr1.getLabel(), attr2.getLabel()) &&


            }
    /**
        @NotNull DBDAttributeBinding[] bindings,
            }

        @NotNull DBDAttributeBinding[] bindings
                throw e;
                            entityBindingMap.put(attrEntityMeta, attrEntity);
            }


                    } else {
                                    break;
                        case RETRY:
        int recoveryDepth;
            monitor.done();
            contextDefaults = executionContext.getContextDefaults();
        List<DBSEntityConstraint> identifiers = new ArrayList<>(2);
                    DBSEntityAttribute tableColumn = null;
        if (isRecoverSmartCommitEnable) {
                        }

                recoveryStack.set(null);
                    return (DBSEntityAssociation) referrer;
                    monitor = ((DBCSession) param).getProgressMonitor();
            if (persistActions != null) {
            for (DBPDataSourceContainer ctx : ACTIVE_CONTEXTS) {
            }
                log.warn(e);
                                if (!realColumnName.equalsIgnoreCase(columnName)) {

            boolean needsTableMetaForColumnResolution = dataSource.getInfo().needsTableMetaForColumnResolution();
    }
        } else if (newSchema != null && contextDefaults.supportsSchemaChange()) {
import org.jkiss.dbeaver.model.data.*;
        Map<DBSEntity, DBDRowIdentifier> locatorMap = new IdentityHashMap<>();
    ) throws DBException {
            } else if (newObject instanceof DBSCatalog) {
                        }
        if (dataSource == null || !container.isConnected()) {
                                (referrer instanceof DBSTableIndex && ((DBSTableIndex) referrer).isUnique()))) {
                    if (!keepRunning) {
                        finally {
     */
        return false;
            DBSEntity entity = null;
                        );
            if (sourceEntity != null) {
                    DBSDataContainer dataContainer = executionSource.getDataContainer();
        if (value == null) {
                try {

        }
                DBDRowIdentifier rowIdentifier = locatorMap.get(attrEntity);
            return true;
        }
                    boolean updateColumnMeta = sourceEntity != null ||
        @NotNull DBDAttributeBinding[] bindings,
        }
                            monitor.done();
import org.eclipse.core.runtime.Status;
        }
    }
                            }*/
                    //  - Table metadata was specified for column
                    break;
            return "Read-only data container";
                            executionContext = ((DBCException) lastError).getExecutionContext();
        synchronized (ACTIVE_CONTEXTS) {
                        if ((!updateColumnHandler && bindingMeta.getDataKind() != tableColumn.getDataKind()) ||

                                    }
                                }
    /**
                        if (selectItem != null && selectItem.isPlainColumn()) {
                    monitor.subTask(action.getTitle());
            if (uniqueId != null) {
        try {
        }
            return;
                }

                            if (!transactionManager.isAutoCommit()) {
        DBCExecutionContextDefaults<?,?> contextDefaults = null;
                    return false;
                    attrEntity = entity;
        }
            }
    public static List<DBPDataSourceContainer> getActiveContexts() {
                    Collection<? extends DBSEntityConstraint> constraints = table.getConstraints(monitor);

                DBSEntity attrEntity = null;
        }
    }
        try {
                    if (ignoreErrors) {
     * Returns read-only status for an attribute (also can check that row identifier is incomplete by checking a valid key).
    public static final boolean BROWSE_LAZY_ASSOCIATIONS = false;
            ACTIVE_CONTEXTS.remove(context);
                        if (attrEntity == null) {
import org.jkiss.dbeaver.model.struct.*;
import java.lang.reflect.InvocationTargetException;
        if (rowIdentifier == null || !(rowIdentifier.getEntity() instanceof DBSDataManipulator dataContainer)) {
    }
            }
import org.jkiss.dbeaver.Log;
    }
    public static void setStatementFetchSize(DBCStatement dbStat, long firstRow, long maxRows, int fetchSize) {
                    return true;
    public static void recoverSmartCommit(DBCExecutionContext executionContext) {
    private static boolean contextMatches(String host, int port, DBPDataSourceContainer ctx) {
                newSchema = (DBSSchema) newObject;
                            (sqlQuery == null || !DBDAttributeBindingMeta.haveEqualsTypes(tableColumn, attrMeta));
 * limitations under the License.
    public static DBPDataSourceContainer getCurrentThreadContext() {
        return executionContext;
                            } catch (DBCException e) {
     */
                QMMConnectionInfo qmConnection = QMUtils.getCurrentConnection(context);
                    binding.lateBinding(session, rows);
            String status = attribute.getRowIdentifierStatus();
            }
                } catch (Exception e) {
    }
            return 0;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        DBRProgressMonitor monitor = session.getProgressMonitor();

            }

                        }
        synchronized (ACTIVE_CONTEXTS) {
    public static boolean isAttributeReadOnly(@Nullable DBDAttributeBinding attribute, boolean checkValidKey) {
        }
        } else if (value instanceof Number number) {
            try {

    /**
                recoveryState.recoveryFailed = true;
                        // Discover from entity metadata
                        } catch (DBCException e) {
import org.jkiss.dbeaver.runtime.net.GlobalProxyAuthenticator;

    }
    public static String getResultSetReadOnlyStatus(@Nullable DBPDataSourceContainer container) {
                // Skip physical identifiers for views. There are nothing anyway
                            // First search for primary index

        DBRProgressMonitor monitor,
                    break;
            }
                                if (nonIdentifyingConstraints == null) nonIdentifyingConstraints = new ArrayList<>();
                        if ((asteriskIndex < 0 || asteriskIndex > attrMeta.getOrdinalPosition()) &&
        }
                // which construct any unique key

    ) throws DBException {
                    }
 *
                try {
                            if (selectItem != null && selectItem.isPlainColumn()) {
                Collections.addAll(actions, persistActions);
        if (hasProxy) {
        if (recoveryState == null) {
                    if (tableColumn != null) {
*/
            }
            return "Null meta attribute";
                            // E.g. we fetched strings and found out that we should handle them as LOBs or enums.
        @NotNull DBCExecutionContextDefaults contextDefaults,
                    String columnName = attrMeta.getName();
                                log.warn("Error resolving attribute '" + binding.getName() + "' values", e);
        }
                                queryEntityMetaScore = entityMeta.getCompleteScore();

        }
    ) throws DBException {
            }
                        Object sourceDescriptor = executionSource.getSourceDescriptor();
        String script = action.getScript();
        return DBPErrorAssistant.ErrorType.NORMAL;
        try (DBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.UTIL, jobName)) {
        }
                                    } else {

            if (handler.isEnabled() && handler.getType() == DBWHandlerType.PROXY) {
        DBSObject newObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (attrEntity != null) {
                            if (DBUtils.isIdentifierConstraint(monitor, constraint)) {
        @Nullable String curCatalogName,
                executionContext.close();
            }
import org.jkiss.dbeaver.DBException;
                        } else {
        List<DBSEntityReferrer> referrers = attr.getReferrers();
                        } else if (bindingMeta.setEntityAttribute(tableColumn, updateColumnHandler) && rows != null) {
                return Double.parseDouble(string);
        }
            boolean refMatches = false;
import org.jkiss.dbeaver.model.edit.DBECommand;
                                (queryEntityMetaScore > attrEntityMeta.getCompleteScore() || DBUtils.isView(entity)))
        if (checkValidKey) {
        synchronized (ACTIVE_CONTEXTS) {
                    monitor = (DBRProgressMonitor) param;
                    ((SQLDatabasePersistAction) action).afterExecute(session, dbStat, null);
        return getAttributeReadOnlyStatus(attribute, true);
                    }
                        bindingMeta.setRowIdentifierStatus(ModelMessages.cannot_determine_unique_row_identifier_text);
                        continue;
        }
                        ) {
                            log.debug("Invalidate context [" + executionContext.getDataSource().getContainer().getName() + "/" + executionContext.getContextName() + "] transactions");
                        DBCExecutionContext executionContext = null;
                }
                        if (executionContext != null) {

import org.jkiss.dbeaver.DBDatabaseException;
        DBPDataSource dataSource = session.getDataSource();
    public static List<DBEPersistAction> getActionsListFromCommandContext(@NotNull DBRProgressMonitor monitor, DBECommandContext commandContext, DBCExecutionContext executionContext, Map<String, Object> options, @Nullable List<DBEPersistAction> actions) throws DBException {
                    lastError = e;
                    if (sqlQuery != null &&
        }
        DBPErrorAssistant errorAssistant = DBUtils.getAdapter(DBPErrorAssistant.class, dataSource);
            monitor.done();
                            tableColumn = attrEntity.getAttribute(mdMonitor, columnName);
            DBDRowIdentifier rowIdentifier = attribute.getRowIdentifier();
        }
/*
     *
                }
                    lastError = null;
                    runnable.run(param);
    }
                if (attrEntity != null && binding instanceof DBDAttributeBindingMeta bindingMeta) {
                DBCStatement sourceStatement = resultSet.getSourceStatement();
        return isAttributeReadOnly(attribute, false);
        // Make new or use existing virtual identifier
            int queryEntityMetaScore = -1;

                return true;
            if (rowIdentifier != null) {
                return 0.0;

/*
                    DBCEntityMetaData attrEntityMeta = attrMeta.getEntityMetaData();
        DBRProgressMonitor monitor = session.getProgressMonitor();
        for (DBSEntityAttributeRef ref : references) {
            } else {
            DBCTransactionManager transactionManager = DBUtils.getTransactionManager(executionContext);
import java.util.*;
                } else if (param instanceof DBCSession) {
                                }
        if (references == null || references.isEmpty()) {
            !executionContext.getDataSource().getContainer().hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_DATA) ||
                        }
 *

                    } else if (columnName != null) {
            if (attr == null) {
        // Note: authenticator may be changed by Eclipse framework on startup or later.
    }
        }

     * Checks if the data source has pending statements that are still executing.
        if (action instanceof SQLDatabasePersistActionComment) {
                    continue;
                    DBCEntityMetaData entityMeta = null;
                    @NotNull
                    //  - We use some explicit entity (e.g. table data editor)
            for (DBDAttributeBinding binding : bindings) {
        boolean isSmartCommitEnable = preferenceStore.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT) ?
                }
                SQLSelectItem selectItem = sqlQuery == null ? null : sqlQuery.getSelectItem(attrMeta.getOrdinalPosition());
        return ACTIVE_CONTEXT.get();
                                }
            }
        final Map<DBCEntityMetaData, DBSEntity> entityBindingMap = new IdentityHashMap<>();
                // Check indexes first.
        }
        if (CommonUtils.equalObjects(cfg.getHostName(), host) && String.valueOf(port).equals(cfg.getHostPort())) {
        // No physical identifiers or row ids
            }
                            }
        }
            for (DBEPersistAction action : persistActions) {
                }

            for (DBDAttributeBinding column : bindings) {
    }
                            }
                            (referrer.getConstraintType().isUnique() ||
                        case IGNORE:
        }
                if (rowIdentifier == null) {
                            attrEntity,

                    }
        try {
                            uniqueId = referrer;
                                        columnName = DBObjectNameCaseTransformer.transformName(dataSource, realColumnName);
                newCatalog = (DBSCatalog) newInstance;
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;

                    // Test pseudo attributes
            try {
                    //  - Database doesn't support column name collisions (default)
                    refMatches = true;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    private static class RecoveryState {
                binding.loadTransformers(session, rows);
            Throwable lastError = null;
                    if (bindingMeta.getPseudoAttribute() != null) {
        @Nullable String newObjectName) throws DBException
    @SuppressWarnings("unchecked")
                                tableColumn = attrEntity.getAttribute(mdMonitor, columnName);
    }
                        if (attrEntity != null) {
            return new ArrayList<>(ACTIVE_CONTEXTS);

            }
        }
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            contextDefaults.setDefaultCatalog(monitor, newCatalog, contextDefaults.supportsSchemaChange() ? newSchema : null);
        DBRProgressMonitor monitor,
    public static void finishContextInitiation(DBPDataSourceContainer context) {
    @NotNull
            executeScript(session, persistActions.toArray(new DBEPersistAction[0]));
import org.jkiss.dbeaver.model.qm.meta.QMMStatementExecuteInfo;
            return 0;
                }
        if (container.isConnectionReadOnly()) {
    ) throws DBException {
        DBSCatalog newCatalog = null;
                        entity = entity1;
                }
                    return null;
                        }
            for (DBDAttributeBinding binding : bindings) {
        }
                            return Status.OK_STATUS;
        // That's why we set new default authenticator on connection initiation
        }
            return;
    private static final ThreadLocal<DBPDataSourceContainer> ACTIVE_CONTEXT = new ThreadLocal<>();
                    // Otherwise it is an expression.
            }
                }
        }
        throw new DBException("Association not found in attribute [" + attr.getName() + "]");
                dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.EXECUTE_RECOVER_ENABLED);
                    break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                if (!sqlDialect.isTransactionModifyingQuery(queryText)) {
        if (errorAssistant != null) {
        for (DBDAttributeBinding attribute : attributes) {
    }
                }
                        }
                executePersistAction(session, action);
                                if (index.isPrimary() && DBUtils.isIdentifierIndex(monitor, index)) {
            if (rowIdentifier.isIncomplete()) {
    public static void executeScript(
        if (contextDefaults != null && (contextDefaults.supportsSchemaChange() || contextDefaults.supportsCatalogChange())) {
                    }
                    // It is a real table columns if:
            monitor.worked(1);
        //List<DBSEntityConstraint> nonIdentifyingConstraints = null;
                        if (sqlQuery == null) {

     * Current execution context. Used by global authenticators and network handlers
                newObject = newCatalog.getChild(monitor, newObjectName);
                        log.debug("Invalidate datasource '" + dataSource.getContainer().getName() + "' connections...");
                            break;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
                for (DBDAttributeBinding binding : bindings) {
    }
    }
            preferenceStore.getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER)
            if (lastError != null) {
            recoveryState.recoveryDepth--;
                    monitor.worked(1);

                                    row[pos] = binding.getValueHandler().getValueFromObject(session, tableColumn, row[pos], false, false);
        }
            if (columnDataType != null) {
                monitor.subTask("Read results metadata");
                        if (entityMeta != null) {
                            break;
                        if (referrer.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {
                if (errorType != DBPErrorAssistant.ErrorType.TRANSACTION_ABORTED && errorType != DBPErrorAssistant.ErrorType.CONNECTION_LOST) {
                    return false;
                for (DBDRowIdentifier rowIdentifier : locatorMap.values()) {
                }
            } else {
    public static <T> boolean tryExecuteRecover(@NotNull T param, @NotNull DBPDataSource dataSource, @NotNull DBRRunnableParametrized<T> runnable) throws DBException {
    }
                    @Override
                if (qmConnection != null) {
    }
                        InvalidateJob.invalidateTransaction(monitor, dataSource, executionContext);
    }
                    log.debug("Error executing query", e);

        DBDRowIdentifier rowIdentifier = attribute.getRowIdentifier();
                    }
        // Check single source flag

                        }
                SQLDialect sqlDialect = SQLUtils.getDialectFromDataSource(session.getDataSource());
                break;
    @NotNull
                            for (DBSTableIndex index : indexes) {
        if (attribute.getMetaAttribute() == null) {
        return false;
        @Nullable String newCatalogName,
        @NotNull DBRRunnableWithParam<CONTEXT> runnable
    private static boolean isSameDataTypes(@NotNull DBSEntityAttribute tableColumn, @NotNull DBCAttributeMetaData resultSetAttributeMeta) {
                    try {
        }
    public static double makeNumericValue(@Nullable Object value) {
package org.jkiss.dbeaver.model.exec;
            monitor.worked(1);
            return referrer instanceof DBVEntityConstraint;
                } else {
                }
 * See the License for the specific language governing permissions and
                }
        DBPPreferenceStore preferenceStore = container.getPreferenceStore();
    {
import org.eclipse.core.runtime.IStatus;
    public static boolean equalAttributes(DBCAttributeMetaData attr1, DBCAttributeMetaData attr2) {
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
                            if (entity != null &&
    }
            for (DBSEntityConstraint constraint : identifiers) {
            return number.doubleValue();

                            log.debug("Error recovering smart commit mode: " + e.getMessage());
                                int pos = attrMeta.getOrdinalPosition();
        }
                }
     * @param param DBRProgressProgress monitor or DBCSession
        }
     */
        if (script == null) {
                        InvalidateJob.invalidateDataSource(
                                for (Object[] row : rows) {
            }
                    DBDPseudoAttribute pseudoAttribute = DBUtils.getPseudoAttribute(attrEntity, columnName);
            monitor.subTask("Detect unique identifiers");
                        break;
        return true;
            final Map<DBSEntity, DBDRowIdentifier> locatorMap = bindUniqueIdentifiers(bindings, mdMonitor);
            if (newInstance instanceof DBSCatalog) {
import org.jkiss.dbeaver.model.net.DBWForwarder;
    private static boolean isGoodReferrer(DBRProgressMonitor monitor, DBDAttributeBinding[] bindings, DBSEntityReferrer referrer) throws DBException
    @Nullable
    }
        for (DBDAttributeBinding binding : bindings) {
            DBEPersistAction[] persistActions = cmd.getPersistActions(monitor, executionContext, options);
                } catch (Exception e) {
            int tryCount = 1;
                    } catch (Exception e) {

        } finally {

    @Nullable
}                    }
                    // Can't recover
            return status != null ? status : "No row identifier found";
                            // Do not update entity attribute.
            return "Underlying entity doesn't support data modification";
            executionContext.getDataSource().getInfo().isReadOnlyData();
import org.jkiss.dbeaver.model.sql.SQLSelectItem;
        if (checkValidKey && rowIdentifier.isIncomplete()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
            if (transactionManager != null) {
            }
                            log.debug("Cannot bind attribute '" + bindingMeta.getName() + "'");
        return
        DBSEntity dataContainer = rowIdentifier.getEntity();
                } catch (InvocationTargetException e) {
        if (newCatalog != null && newSchema != null && changeCatalog) {
                    }
            // Find PK or unique key
        // Set proxy auth (if required)
                                entityBindingMap.put(entityMeta, entity);
            actions = new ArrayList<>();
    ) throws DBException {
                            // Just do nothing
                        // Do not recover if connection was canceled
                            }
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        if (attribute.getMetaAttribute().isReadOnly()) {
                    log.error("Operation interrupted");
                        attrEntity = entityBindingMap.get(attrEntityMeta);
        DBPDataSourceContainer curContext = getCurrentThreadContext();
                    uniqueId = constraint;
                if (contextMatches(host, port, ctx)) {
            return true;
            }
                if (!monitor.isCanceled()) {
                        }
                }
                } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                DBDPseudoAttribute pseudoAttribute = column instanceof DBDAttributeBindingMeta ? ((DBDAttributeBindingMeta) column).getPseudoAttribute() : null;
                    }

                return false;
                    DBCExecutionSource executionSource = sourceStatement.getStatementSource();

            recoveryState.recoveryDepth++;
        DBSEntity sourceTable = null;
        DBSSchema newSchema = null;
                            ignoreErrors = true;
                    }
        Collection<? extends DBSEntityAttributeRef> references = referrer.getAttributeReferences(monitor);

    public static DBPErrorAssistant.ErrorType discoverErrorType(@NotNull DBPDataSource dataSource, @NotNull Throwable error) {
            ACTIVE_CONTEXTS.add(context);
                                attrEntity = DBUtils.getEntityFromMetaData(mdMonitor, session.getExecutionContext(), attrEntityMeta);
    }


        @NotNull DBRProgressMonitor monitor,
                    // from parsed query because driver doesn't return it.
        } catch (Exception e) {
        }
        }

import org.jkiss.dbeaver.runtime.DBWorkbench;
        }

        DBPConnectionType connectionType = container.getConnectionConfiguration().getConnectionType();
                }
        return locatorMap;
                tryCount += dataSource.getContainer().getPreferenceStore().getInt(ModelPreferences.EXECUTE_RECOVER_RETRY_COUNT);
            }
            for (DBDAttributeBinding binding : bindings) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            monitor.subTask("Load transformers");
        if (newCatalogName != null) {
                                    identifiers.add(index);
                            // Probably it is an alias which conflicts with column name

            }
        try {

        @Nullable DBSEntity sourceEntity,
        return actions;
            throw e;
    }

                            // Different data kind and meta attribute doesn't have table reference.
                }
                        }
                fetchSize = DEFAULT_READ_FETCH_SIZE;
                if (txnManager.isAutoCommit()) {
                dbStat.setResultsFetchSize(
    }
                                // If this is a view then don't try to detect entity for each attribute
                    if (dataContainer instanceof DBSEntity entity1) {
                    log.debug("Error reading table constraints: " + e.getMessage());
                    rowIdentifier.reloadAttributes(mdMonitor, bindings);
                        tableColumn = bindingMeta.getPseudoAttribute().createFakeAttribute(attrEntity, attrMeta);

            try {
                        Collection<? extends DBSTableIndex> indexes = dbsTable.getIndexes(monitor);
                    // Table column can be found from results metadata or from SQL query parser
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
            return true;
        @NotNull DBRProgressMonitor mdMonitor
                                    identifiers.add(index);
            return true;
                        if (!CommonUtils.isEmpty(indexes)) {
                    {
                    if (pseudoAttribute != null) {
                                    log.debug("Table '" + DBUtils.getSimpleQualifiedName(attrEntityMeta.getCatalogName(), attrEntityMeta.getSchemaName(), attrEntityMeta.getEntityName()) + "' not found in metadata catalog");
                if (attrMeta == null) {

     */
                return uniqueId;
        DBDRowIdentifier rowIdentifier = attribute.getRowIdentifier();
                DBRProgressMonitor monitor;
            }
    private static final ThreadLocal<RecoveryState> recoveryStack = new ThreadLocal<>();
                }
                    }
import org.jkiss.dbeaver.runtime.jobs.InvalidateJob;
        } else {
        } else if (value instanceof String string) {
                        } else {
                            break;
import org.jkiss.dbeaver.model.sql.SQLUtils;
        return !dataContainer.isFeatureSupported(DBSDataManipulator.FEATURE_DATA_UPDATE);
        return tableColumn.getDataKind().isComplex() == resultSetAttributeMeta.getDataKind().isComplex();
                        CommonUtils.equalObjects(columnName, attrMeta.getLabel()))
        }
            }
            : connectionType.isSmartCommitRecover();
            }
            return ((DBPErrorAssistant) dataSource).discoverErrorType(error);
        List<DBEPersistAction> persistActions
            } catch (Exception e) {

                            log.debug("Invalidate datasource [" + dataSource.getContainer().getName() + "] transactions");
        }
        }
    public static boolean checkSmartAutoCommit(DBCSession session, String queryText) {
     */
     * Gets read-only status for a result set.
                                        columnName = DBUtils.getUnQuotedIdentifier(dataSource, realColumnName);
                    }
public class DBExecUtils {
        DBPDataSource dataSource,
                if (sourceStatement != null && sourceStatement.getStatementSource() != null) {
                }
                } else {

        }
        }
                }
                        // Just skip them

                        }
    }
                        rowIdentifier = new DBDRowIdentifier(
                    } else {
                        !needsTableMetaForColumnResolution;
    private static final List<DBPDataSourceContainer> ACTIVE_CONTEXTS = new ArrayList<>();
        ACTIVE_CONTEXT.remove();
                        return Status.OK_STATUS;
        if (referrer instanceof DBDPseudoReferrer) {
        // First check specific datasource settings
                    }
                    return new DBDPseudoReferrer(table, column);
    }
                    if (errorType == DBPErrorAssistant.ErrorType.TRANSACTION_ABORTED) {
                        locatorMap.put(attrEntity, rowIdentifier);
                    break;

        if (useFetchSize) {
            return contextMatches(host, port, curContext) ? curContext : null;
                        }
                    QMMStatementExecuteInfo lastExec = qmConnection.getExecutionStack();
                            entity = DBUtils.getEntityFromMetaData(mdMonitor, session.getExecutionContext(), entityMeta);
import org.jkiss.code.Nullable;
                new AbstractJob("Recover smart commit mode") {
                    switch (DBWorkbench.getPlatformUI().showErrorStopRetryIgnore(session.getTaskTitle(), e, true)) {
        ACTIVE_CONTEXT.set(context);
        monitor.beginTask(session.getTaskTitle(), persistActions.length);
 * DBeaver - Universal Database Manager
        @NotNull DBSObjectContainer rootContainer,
                if (!recoverEnabled || recoveryState.recoveryFailed) {
                            }
            if (newObject instanceof DBSSchema) {
            if (newCatalog == null) {
                        }
            return "Data edit restricted";
                            }
            }
                    // Fix of #11194. If column name and alias are equals we could try to get real column name
                            }
        DBVEntity virtualEntity = DBVUtils.getVirtualEntity(table, true);

            for (int i = 0; i < tryCount; i++) {
                            monitor.beginTask("Switch to auto-commit mode", 1);
                        case STOP:
 *
        } else if (newCatalog != null && changeCatalog) {
                    // If datasource supports table names in result metadata then table name must present in results metadata.
            attr1.getOrdinalPosition() == attr2.getOrdinalPosition() &&
            if (!(binding instanceof DBDAttributeBindingMeta bindingMeta)) {
            recoveryState = new RecoveryState();
        DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
     * Checks if a result set is read-only.

                action.beforeExecute(session);
                if (!CommonUtils.isEmpty(action.getTitle())) {
        }
                }
                    executePersistAction(session, action);
        }
                newCatalog = (DBSCatalog) newObject;
                // Read nested bindings
                        if (i < tryCount - 1) {
        return null;
                log.debug("Error while closing just opened context");
                        if (!executionContext.isConnected()) {
                            keepRunning = false;
                        updateColumnMeta &&
    }
                    action.afterExecute(session, null);
                entity = sourceEntity;
                            for (DBSTableIndex index : indexes) {
        try {
                            // Then search for unique index
                bindingMeta.setRowIdentifier(rowIdentifier);
     */
            }
                            boolean isAllColumns = sqlQuery.getSelectItemAsteriskIndex() != -1;

                            {
        finally {
    public static Map<DBSEntity, DBDRowIdentifier> bindUniqueIdentifiers(

                DBPErrorAssistant.ErrorType errorType = discoverErrorType(dataSource, lastError);
                    // Check constraints
    /**
                            }
                        for (DBSEntityConstraint constraint : constraints) {
     * Returns read-only status for an attribute.
                            continue;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
            }
    public static String getAttributeReadOnlyStatus(@NotNull DBDAttributeBinding attribute) {
        return virtualEntity.getBestIdentifier();
                } else if (sourceTable != rowIdentifier.getEntity()) {
                monitor.subTask("Complete metadata load");
                dbStat.executeStatement();
                            } else {
 * you may not use this file except in compliance with the License.
        boolean useFetchSize = fetchSize > 0 || dbStat.getSession().getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_USE_FETCH_SIZE);
            if (rows != null && !mdMonitor.isForceCacheUsage()) {
                            if (isAllColumns || (selectItem != null && (selectItem.isPlainColumn() || selectItem.getName().equals("*")))) {
                } finally {
    }
                return "No unique key. Row modification is not available.";
        if (!container.hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_DATA)) {
                newObject = rootContainer.getChild(monitor, newObjectName);
                            monitor,
            return "Attribute is read-only";
                                if (DBUtils.isIdentifierIndex(monitor, index) && !identifiers.contains(index)) {
            Authenticator.setDefault(new GlobalProxyAuthenticator());
                        bindingMeta.setPseudoAttribute(pseudoAttribute);
                    txnManager.setAutoCommit(session.getProgressMonitor(), false);
                        }
                        }
    public static void executePersistActions(DBCSession session, DBEPersistAction[] persistActions) throws DBException {
            CommonUtils.equalObjects(attr1.getEntityMetaData(), attr2.getEntityMetaData()) &&
                                if (attrEntity == null && !mdMonitor.isForceCacheUsage()) {
        DBCExecutionContext executionContext,
                        // Indexes are not supported or not available
                DBCAttributeMetaData attrMeta = binding.getMetaAttribute();
                    firstRow < 0 || maxRows <= 0 ? fetchSize : (int) (firstRow + maxRows));
            try (DBCStatement dbStat = DBUtils.createStatement(session, script, false)) {
        monitor.beginTask("Discover resultset metadata", 3);
                        }
                    if (attrEntityMeta != null) {
            }
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;
                continue;
        }
            CommonUtils.equalObjects(attr1.getTypeName(), attr2.getTypeName());
                if (monitor.isCanceled()) {
            if (table instanceof DBSTable dbsTable && dbsTable.isView()) {
                                    if (DBUtils.isQuotedIdentifier(dataSource, realColumnName)) {
            }
    public static final int DEFAULT_READ_FETCH_SIZE = 10000;
        if (dataSource.getInfo().isReadOnlyData()) {
    private static final Log log = Log.getLog(DBExecUtils.class);
            }
    }
                } catch (InterruptedException e) {

                        if (lastError instanceof DBCException) {

                } else {
                    break;
                            true,
                    boolean keepRunning = true;
                                }
            action.afterExecute(session, null);
    {
                }
                        // It is in progress
        DBPDataSource dataSource = container == null ? null : container.getDataSource();
            return true;
 */
                // We got table name and column name
                        try {
        }
                    }
                if (table instanceof DBSTable dbsTable) {

            runnable.run(executionContext);
        }
                                identifiers.add(constraint);

    public static void changeDefaultObject(
                try {
        if (curContext != null) {
import org.jkiss.dbeaver.runtime.jobs.DefaultInvalidationFeedbackHandler;
                            attrEntityMeta = selectItem.getEntityMetaData();

        } finally {
                continue;
                        // Transaction aborted
        } else if (value instanceof Date date) {
            }
                    if (lastExec != null && !lastExec.isClosed()) {
            contextDefaults.setDefaultSchema(monitor, newSchema);
                if (sourceTable == null) {
        DBCExecutionContext executionContext,
                }
            changeDefaultObject(monitor, rootContainer, contextDefaults, newInstanceName, curInstanceName, newObjectName);
    public static void bindAttributes(
        @NotNull CONTEXT executionContext,
        @NotNull DBSEntity table,
                            return referrer;
    public static DBSEntity detectSingleSourceTable(DBDAttributeBinding ... attributes) {
            }
    /**
                if (constraint instanceof DBSEntityReferrer referrer) {
        return false;
    }
        boolean hasProxy = false;
    }
        if (newObjectName != null) {
                                String realColumnName = selectItem.getName();
import org.jkiss.dbeaver.model.sql.SQLQuery;
                    monitor.subTask(action.getTitle());
                        log.debug("Error reading table indexes: " + e.getMessage());


                        return true;
                        case IGNORE_ALL:
        }
                if (!txnManager.isAutoCommit()) {
                }.schedule();
    public static String getAttributeReadOnlyStatus(@NotNull DBDAttributeBinding attribute, boolean checkValidKey) {
                            // We have new type and new value handler.
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                                // MySQL returns source table name instead of view name. That's crazy.
                            }
        @Nullable DBCResultSet resultSet,
                    monitor.subTask("Discover owner entity");
                continue;
import org.jkiss.utils.CommonUtils;
    public static DBSEntityAssociation getAssociationByAttribute(DBDAttributeBinding attr) throws DBException {
        for (DBWHandlerConfiguration handler : context.getConnectionConfiguration().getHandlers()) {
            attr1.getTypeID() == attr2.getTypeID() &&
        for (DBSInstance instance : dataSource.getAvailableInstances()) {
    public static boolean isResultSetReadOnly(@Nullable DBCExecutionContext executionContext) {
        @Nullable String newObjectName
                }
        if (!isSmartCommitEnable) {
import org.jkiss.dbeaver.ModelPreferences;
    public static void executePersistAction(DBCSession session, DBEPersistAction action) throws DBException {
            for (DBCExecutionContext context : instance.getAllContexts()) {
        String jobName,
                            false,
                            entityIdentifier);
                            try {
        if (!(dataContainer instanceof DBSDataManipulator)) {
            for (final DBSEntityReferrer referrer : referrers) {
            return true;
            } catch (DBCException e) {
            boolean recoverEnabled = !recoveryState.recoveryFailed &&
        @Nullable String newInstanceName,
                if (sourceEntity == null) {
                    break;
    public static boolean isAttributeReadOnly(@Nullable DBDAttributeBinding attribute) {
 * You may obtain a copy of the License at
        }
        }
                                nonIdentifyingConstraints.add(constraint);
            }
        }
                if (!CommonUtils.isEmpty(action.getTitle())) {
        if (executionContext != null) {
        DBRProgressMonitor mdMonitor = container.isExtraMetadataReadEnabled() ?
        boolean changeCatalog = (curCatalogName != null ? !CommonUtils.equalObjects(curCatalogName, newCatalogName) : newCatalog != null);

                if (monitor.isCanceled()) {
    }
                    if (attrEntityMeta == null && sqlQuery != null) {
    public static void startContextInitiation(DBPDataSourceContainer context) {
        boolean ignoreErrors = false;
            !executionContext.isConnected() ||
        @NotNull DBCSession session,
            CommonUtils.equalObjects(attr1.getScale(), attr2.getScale()) &&
        }
            return date.getTime();

        if (rootContainer == null) {
        if (actions == null) {
        @NotNull DBRProgressMonitor monitor,
            monitor.done();
        if (!CommonUtils.isEmpty(identifiers)) {
            return "Underlying entity doesn't support data update";
            if (recoveryState.recoveryDepth == 0) {
            DBExecUtils.recoveryStack.set(recoveryState);
                                }
        if (!((DBSDataManipulator) dataContainer).isFeatureSupported(DBSDataManipulator.FEATURE_DATA_UPDATE)) {
        boolean isRecoverSmartCommitEnable = preferenceStore.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER) ?
            contextDefaults.setDefaultCatalog(monitor, newCatalog, null);
 * Execution utils
            DBSEntityConstraint uniqueId = null;
                            entityMeta = sqlQuery.getEntityMetadata(false);
 * Unless required by applicable law or agreed to in writing, software

                                transactionManager.setAutoCommit(monitor,true);
                }
import org.jkiss.dbeaver.model.impl.AbstractExecutionContext;
        }
        }
            // Check for pseudo attrs (ROWID)
            if (!refMatches) {
            } catch (DBCException e) {
                    if (constraints != null) {
                        DBCAttributeMetaData metaAttr = resultSet != null ? resultSet.getMeta().getAttributes().get(attrMeta.getOrdinalPosition()) : null;
                if (lastError instanceof DBException dbe) {
                            // We have to fix already fetched values.
        if (rowIdentifier == null) {
                    if (entityIdentifier != null) {
            if (fetchSize <= 0) {
        monitor.beginTask(session.getTaskTitle(), persistActions.length);
        } finally {
        }
        DBSObjectContainer rootContainer = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
            for (DBEPersistAction action : persistActions) {
    }
                }
            attr1.getMaxLength() == attr2.getMaxLength() &&
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                            (resultSet != null && CommonUtils.isEmpty(metaAttr.getEntityName()) && !isSameDataTypes(tableColumn, metaAttr))
        {
                            // It is a silly workaround for PG-like databases
            monitor.subTask("Discover attributes");
        }
                                attrEntity = entity;
                } catch (Exception e) {
        DBPDataSourceContainer container = dataSource.getContainer();
                monitor.subTask("Discover attribute '" + binding.getName() + "'");
        return null;
            attr1.isRequired() == attr2.isRequired() &&
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                    if (entity == null) {
            SQLUtils.compareAliases(attr1.getName(), attr2.getName()) &&

            DBSDataType columnDataType = ((DBSTypedObjectEx) tableColumn).getDataType();

                        } else if (uniqueId == null &&


        for (DBECommand<?> cmd : commandContext.getFinalCommands()) {
                return columnDataType.isStructurallyConsistentTypeWith(resultSetAttributeMeta);
                                // If query entity score is greater than database provided entity meta score then use base entity (from SQL query)
    }
                if (action instanceof SQLDatabasePersistAction) {
                if (param instanceof DBRProgressMonitor) {
            //monitor.subTask("Find attribute '" + binding.getName() + "' identifier");
        } else {
                hasProxy = true;
                            attrMeta.getOrdinalPosition() < sqlQuery.getSelectItemCount())
            } else if (resultSet != null) {
import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
                    monitor = new VoidProgressMonitor();
        @Nullable String curInstanceName,
                if (binding.matches(ref.getAttribute(), false)) {
            return new DBSDocumentConstraint(documentContainer);
            SQLQuery sqlQuery = null;
                        }
                        {
                                        // #12008
    {
                    sourceTable = rowIdentifier.getEntity();
            }
                if (attrEntity == null) {
                    lastError = e.getTargetException();
                            dataSource,
        {
        RecoveryState recoveryState = DBExecUtils.recoveryStack.get();
        }
                }
import org.jkiss.dbeaver.model.sql.SQLDialect;
            }
            {
    }

import org.jkiss.dbeaver.model.qm.QMUtils;
                    DBSEntityConstraint entityIdentifier = getBestIdentifier(mdMonitor, attrEntity, bindings);
        return sourceTable;
        @Nullable List<Object[]> rows) throws DBException
                    }
                }
                            }/* else {
        }
                    throw dbe;
            } catch (Exception ex) {
                // Reload attributes in row identifiers
                }
 */
            return "No connection to database";
    public static <CONTEXT extends AbstractExecutionContext<?,?>> CONTEXT tryOpenContext(
                        boolean updateColumnHandler = updateColumnMeta && rows != null &&
                            new DefaultInvalidationFeedbackHandler()

                log.warn(e);
            DBSObject newInstance = rootContainer.getChild(monitor, newCatalogName);
                action.afterExecute(session, e);
        if (attribute == null || attribute.getMetaAttribute() == null || attribute.getMetaAttribute().isReadOnly()) {
            }
            // Init row identifiers
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (tableColumn instanceof DBSTypedObjectEx) {
            attr1 != null && attr2 != null &&
