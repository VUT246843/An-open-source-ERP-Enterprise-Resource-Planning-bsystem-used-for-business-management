                    SQLScriptElement query = queries.get(queryNum);
                    Status.OK,
                } catch (Throwable e) {
                        break;
        }
                MessageDialogWithToggle dialog = new MessageDialogWithToggle(

                                hasResultSet = dbcStatement.nextResults();

        @NotNull SQLScriptElement query,
    private int confirmQueryExecution(@NotNull final SQLQuery query, final boolean scriptMode) {
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
        try {
        @NotNull DBCTransactionManager txnManager,
        return true;
        this.fetchFlags = fetchFlags;

        } else *//*
                    }
                        return false;
                }
        } else if (lastGoodQuery != null) {

                    );
                return false;
            int updateCountReads = 0;
                        } catch (DBCException e) {
import org.eclipse.jface.dialogs.MessageDialog;
                    //statistics.setFetchTime(0);

        }
                    // Execute query

        }
                    }
import java.util.Map;
 * You may obtain a copy of the License at
                fetchProgress.monitorRowFetch();
import org.jkiss.dbeaver.model.sql.registry.SQLCommandsRegistry;
public class SQLQueryJob extends DataSourceJob {
            } catch (Throwable e) {

        StatisticsTabOnExecutionBehavior statisticsTabOnExecutionBehavior = StatisticsTabOnExecutionBehavior.getByName(
                    QMUtils.getDefaultHandler().handleScriptBegin(session);
 * See the License for the specific language governing permissions and


    }
                DBExecUtils.tryExecuteRecover(session, session.getDataSource(), executor);
import org.eclipse.ui.IWorkbenchPartSite;
                    protected void createDialogAndButtonArea(Composite parent) {
                curResult.addWarnings(statistics.getWarnings().toArray(new Throwable[0]));
                            DBPErrorAssistant.ErrorType errorType = DBExecUtils.discoverErrorType(session.getDataSource(), e);
                    long updateCount = statistics.getRowsUpdated();
                        DBPPlatformUI.UserResponse response = ExecutionQueueErrorJob.showError(
                        // In some cases we can't read update count
            boolean hasResultSet = dbcStatement.executeStatement();
                "Error during SQL job execution: " + ex.getMessage());
    private SQLScriptElement lastGoodQuery;
                    monitor.worked(1);
                    statistics.addMessage("Command " + finalCommand.getCommand() + " processed");
                        switch (response) {
                    );
                    dataFilter
        {
                while (queryNum < queries.size()) {
            DBCExecutionContext context = getExecutionContext();
        }
        try {
        // Query may be a nested script
        if (dataFilter != null && dataFilter.hasFilters()) {
                        if (scriptMode) {
                        // Nothing else to fetch
            if (!statementCanceled && curStatement != null) {
                    return statistics.getStatementsCount() > 1;
            }
                return true;
                        } catch (DBCException e) {
                                break;
                            sourceName = resultSet.getResultSetName();
                        UIUtils.getActiveWorkbenchShell(),
                                    if (rowsFetched == 0) {
                                // We need to ignore this error and try to get next results
        } catch (Exception e) {
                            } else if (!sourceName.equals(entityName)) {
            } finally {
                statementCanceled = true;
            case ALWAYS:

                    queryText,

            listener.onEndQuery(session, curResult, statistics);
        } else {
        @Nullable SQLResultsConsumer resultsConsumer,
                            throw e;
import org.eclipse.jface.dialogs.IDialogSettings;
                startQueryAlerted = true;
                                tryAgain = true;
    public SQLQueryResult getCurrentQueryResult() {
            }
            // Notify job end
    public void setFetchSize(int fetchSize) {
                                    } else {
                        try {
                            break;
    public boolean isJobOpen() {
                    protected IDialogSettings getDialogBoundsSettings() {
                    }
import org.jkiss.dbeaver.ui.editors.IncludedScriptFileEditorInput;
                        }
    public void closeJob() {
                } catch (Throwable e) {
        }
                        confirmed = hasResultSet;
        if (listener != null) {
        return true;
    }

            }
        }
                            if (errorType == DBPErrorAssistant.ErrorType.RESULT_SET_MISSING) {
                } else {
                        }
        return isIncludedScript || queryNum < queries.size() - 1;
            try (StatResultSet fakeResultSet = new StatResultSet(session, statStatement)) {
            if (shouldRecoverQuery(execStatement)) {
    }
                return new Status(
        }
                                } catch (DBCException e) {
                }
                    dataSource,
        }
            DBRRunnableParametrized<DBCSession> executor = param -> {
                if (element instanceof SQLControlCommand finalCommand) {
        }

                        statistics.getStatementsCount(),
    ) throws DBCException {
            } catch (DBException e) {
/*

        if (!getExecutionContext().getDataSource().getContainer().getDriver().isThreadSafeDriver()) {

                    if (controlResult.isSuccess()) {
    }
                    curStatement.cancelBlock();
            statistics.addStatementsCount();
import org.jkiss.dbeaver.ui.ISmartTransactionManager;
    public SQLQueryJob(
                    connectionType.setConfirmExecute(false);
            curResultSets.add(resultSet);
    private boolean fetchResultSets;
                    try {
                    statistics.addStatementsCount();
        closeStatement();
        @NotNull List<SQLScriptElement> queries,
                        if (lastError == null) {
                        if (!CommonUtils.isEmpty(entityName)) {

            statement instanceof Update ||
        monitor.done();
                    txnManager.setAutoCommit(monitor, true);
        }
                    if (CommonUtils.isBitSet(result, SQLPragmaHandler.RESULT_CONSUME_QUERY)) {
    public String toString() {

                }
                }

        return queries.size() == 1 &&
                }
    }
    private static final int MAX_QUERY_PREVIEW_LENGTH = 8192;
        }
                if (!(e instanceof DBException)) {
            // Fetch all rows
                return result;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected IStatus run(@NotNull DBRProgressMonitor monitor)
                }
                    protected boolean isResizable() {
 * @author Serge Rider
                        String text = query.getText();
            }

                SQLCommandHandlerDescriptor descriptor = SQLCommandsRegistry.getInstance().getCommandHandler(controlCommand.getCommandId());
        AbstractExecutionSource source = new AbstractExecutionSource(dataContainer, session.getExecutionContext(), partSite.getPart(), sqlQuery);

            // Prepare statement
    private static final int MAX_UPDATE_COUNT_READS = 1000;
        monitor.subTask("Initialize context");
                            DBDDataReceiver dataReceiver = resultsConsumer.getDataReceiver(sqlQuery, resultSetNumber);
                lastError = e;
                        log.warn("Can't obtain update count", e);
        boolean isDisableFetchResultSet)
        this.listener = listener;
        }
                            case STOP:
                    fakeResultSet.addColumn("Execute time", DBPDataKind.NUMERIC);
                // Notify query start
        }
                        new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT).format(new Date())
            } catch (Throwable e) {
                }
            this.rsMaxRows = preferenceStore.getInt(ModelPreferences.RESULT_SET_MAX_ROWS);
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorActivator;
 *
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
import org.jkiss.dbeaver.model.qm.QMUtils;
        DBExecUtils.setStatementFetchSize(dbcStatement, rsOffset, rsMaxRows, fetchSize);
                }
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.StatisticsTabOnExecutionBehavior;
            }
        this.rsMaxRows = maxRows;
    }
                }
            closeStatement();
            };
                        .getInt(SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY)) {
                    }

import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.Log;
                    return controlResult.isSuccess();
    private void closeStatement() {
                }
        return curStatement != null;
    private int queryNum = 0;
            return new Status(
            }
            DBPPreferenceStore preferenceStore = getDataSourceContainer().getPreferenceStore();
                                        statistics.setError(e);
                resultSetNumber = 0;
        super(name, executionContext);
                    }
import net.sf.jsqlparser.statement.select.PlainSelect;
                    fakeResultSet.addColumn("Execute time", DBPDataKind.NUMERIC);
    private boolean isQueue() {
                                        // Ad error as a warning

                int confirmResult = confirmQueryExecution(sqlQuery, queries.size() > 1);
            long updateCount = -1;
        this.resultsConsumer = resultsConsumer;
    ) {
    private SQLQueryResult curResult;
                            case IGNORE:
            // Read config form preference store
                executionContext.invalidateContext(monitor);
            startTime = System.currentTimeMillis();
                    if (monitor.isCanceled()) {
            );
            protected Integer runTask() {
        monitor.beginTask("Execute SQL script", queries.size());
import org.eclipse.swt.widgets.Composite;
            @Override
        Statement statement = query.getStatement();
                                    }
                        }
                    } catch (DBCException e) {
            session,
    {
                        log.info("Script executed with errors. Changes were not committed.");
        // Modify query (filters + parameters)
        }.execute();
                            }
                        null,
                    //statistics.setExecuteTime(0);
                } catch (DBException e) {
                        if (dialogArea.getLayoutData() instanceof GridData) {
        }

                                sourceName = entityName;
                    log.error("Can't cancel execution: " + e.getMessage());
            source,
            if (!connectionInvalidated && dataSource.getContainer().getPreferenceStore().getBoolean(SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE)) {
        this.scriptContext = scriptContext;

                    for (DBCAttributeMetaData attr : rsMeta.getAttributes()) {
        if (!(element instanceof SQLQuery sqlQuery)) {
            sqlQuery,
                        lastError = e;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        new Date(statistics.getStartTime()),
                    executeResult.setResultSetName(SQLEditorMessages.editors_sql_statistics);
        @Nullable DBCResultSet resultSet,
            return false;
                        return true;
        boolean allowStatistics

import org.eclipse.swt.layout.GridData;
                        );
                    log.error("Error generating execution result stats", e);
                                statistics.setError(e);
        return curStatement;
                    log.error(e);
                    sourceName = SQLEditorMessages.editors_sql_data_grid;
                return false;
        catch (Throwable ex) {
        // Execute statement
import org.eclipse.core.runtime.Status;
                        GridData gd = new GridData(GridData.FILL_BOTH);
        this.dataContainer = dataContainer;
            case NEVER:
    @NotNull
                        boolean tryAgain = false;
                            isQueue);
                        // Exhausted all read attempts with no success
            }
            statistics.addExecuteTime(System.currentTimeMillis() - startTime);

            query.setData(STATS_RESULTS); // It will set tab name to "Stats"
                                if (dbcStatement.nextResults()) {
import java.text.SimpleDateFormat;
                            true
        @NotNull DBCSession session,
                        // This is bad, but we can live with it
                            ),
import net.sf.jsqlparser.statement.insert.Insert;
            long fetchStartTime = System.currentTimeMillis();
                            NLS.bind(
                }
        finally {
                throw new DBCException(lastError, getExecutionContext());
                    listener.onEndScript(statistics, lastError != null);
                log.debug("Can't set statement timeout:" + e.getMessage());
                                break;
        @NotNull DBCSession session,
                curStatement = null;
                if (resultSetNumber <= 0 || statistics.getRowsUpdated() >= 0) {
                            if (dataReceiver != null) {
                } catch (InvocationTargetException e) {
                        break;
import org.jkiss.code.NotNull;
                        try {
                            if (dataSourceInfo.isMultipleResultsFetchBroken()) {
            CommonUtils.isBitSet(fetchFlags, DBSDataContainer.FLAG_REFRESH)
            SQLQuery execStatement = sqlQuery;
            curResult.setError(ex);
                }
    }
    public void setDataFilter(DBDDataFilter dataFilter)
                            SQLEditorMessages.editors_sql_warning_many_subtables_title,
                        && query instanceof SQLQuery sqlQuery
            (statement instanceof PlainSelect select && !CommonUtils.isEmpty(select.getIntoTables()))) {
                    DBCResultSetMetaData rsMeta = resultSet.getMeta();

        @NotNull SQLQueryResult.ExecuteResult executeResult,
                    executeResult.setResultSetName(SQLEditorMessages.editors_sql_data_grid);
                preferenceStore.getBoolean(SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS) && !isDisableFetchResultSet
                    }
                                // throw error on n'th result fetch - but it still can keep fetching next results
        }
                    fakeResultSet.addColumn("Fetch time", DBPDataKind.NUMERIC);
        this.fetchSize = fetchSize;
        */
                            updateCountReads++;
        this.fetchResultSets = fetchResultSets;
                        }
        @NotNull DBDDataReceiver dataReceiver,
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
            return false;
                            if (sourceName == null) {
                {
                            statistics.addRowsUpdated(updateCount);
import net.sf.jsqlparser.statement.delete.Delete;
    }
                        gd.horizontalSpan = 2;
        DBFetchProgress fetchProgress = new DBFetchProgress(session.getProgressMonitor());

                try {
    private final List<SQLScriptElement> queries;
                try {
                    }
        if (statement instanceof Insert ||
                }
    private boolean isShowExecutionResult() {
        // Cancel statement only for the second time cancel is called
                                SQLEditorMessages.editors_sql_warning_many_subtables_text,

                if (fetchResultSetNumber < 0 || fetchResultSetNumber == resultSetNumber) {
            this.fetchResultSets = queries.size() == 1 || (
                if (descriptor != null && descriptor.isInteractive()) {
    {
                    } else {
                    log.error("Error while closing resultset", e);
                        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            ep.getEditorInput() instanceof IncludedScriptFileEditorInput;
                            log.warn("Error returning to auto commit");
                try {
                if (controlResult.getTransformed() != null) {
import org.jkiss.dbeaver.ui.editors.sql.SQLResultsConsumer;
                        } else if (tryAgain) {
            }
                        if (commitType != SQLScriptCommitType.NO_COMMIT) {
            if (fireEvents && listener != null) {
        }
    private boolean shouldRecoverQuery(SQLQuery query) {
                                }
                            hasResultSet = dbcStatement.nextResults();
                }
                        new Date(),
                        RuntimeUtils.formatExecutionTime(statistics.getExecuteTime()),
                log.warn("Can't read execution warnings", e);
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            return false;
                } catch (Exception e) {
                SQLQueryResult resultInfo = new SQLQueryResult(query);
    }
                        }
        finally {

    }
                        applyDialogFont(parent);
import net.sf.jsqlparser.statement.update.Update;
    ) throws DBException {

        if (curResult.getError() != null && errorHandling != SQLScriptErrorHandling.IGNORE) {
                monitor.beginTask(this.getName(), queries.size());
                statistics.addFetchTime(System.currentTimeMillis() - fetchStartTime);
            if (updateStatistics) {
                    throw new InvocationTargetException(e);
                    element = controlResult.getTransformed();
    }
                        RuntimeUtils.formatExecutionTime(statistics.getExecuteTime()),
                    txnManager.setAutoCommit(monitor, false);
            rowsFetched = 0;
                                break;
            }
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
                }


                // Commit data
            }
        @Nullable DBSDataContainer dataContainer,
                if (!hasResultSet) {
                    } else if (errorHandling == SQLScriptErrorHandling.STOP_ROLLBACK) {
                final SQLPragmaHandlerDescriptor descriptor = SQLCommandsRegistry.getInstance().getPragmaHandler(id);
                        "Confirm query execution",
    @Override
                log.error("Unsupported SQL element type: " + element);
        long startTime = System.currentTimeMillis();
        // Reset query to original. Otherwise multiple filters will corrupt it
                    fakeResultSet.addColumn("Total time", DBPDataKind.NUMERIC);
            return SqlJobResult.FAILURE;
                } else {
                    DBWorkbench.getPlatform().getDataSourceProviderRegistry().saveConnectionTypes();
            statement instanceof Delete ||
    private final SQLScriptCommitType commitType;
                }
                            // Truncate string. Too big strings may freeze UI
import org.jkiss.dbeaver.model.exec.*;
        try {

                                    continue;

        monitor.subTask("Fetch result set");
                                // just make it again
                    }
        if (rsOffset > 0) {
import org.eclipse.swt.widgets.Text;
            case FOR_MULTIPLE_QUERIES:
                        statistics.getRowsUpdated() < 0 ? 0 : statistics.getRowsUpdated(),
        if (statementTimeout > 0) {
                        }
        int statementTimeout = getDataSourceContainer().getPreferenceStore().getInt(SQLPreferenceConstants.STATEMENT_TIMEOUT);
            // Check and invalidate connection
                    if (resultsConsumer instanceof ISmartTransactionManager && ((ISmartTransactionManager) resultsConsumer).isSmartAutoCommit()) {
                        "You are in '" + connectionType.getName() + "' connection.\nDo you confirm query execution?",
        DBDDataReceiver.startFetchWorkflow(dataReceiver, session, resultSet, rsOffset, rsMaxRows);
                    }
        return queries.isEmpty() ? null : queries.getFirst();
            () -> resultsConsumer.getDataReceiver(originalQuery, resultSetNumber),
            curResult.setHasResultSet(hasResultSet);
                boolean changedToManualCommit = false;
                // Restore transactions settings
                    resultSet.close();
                if (txnManager != null && !oldAutoCommit && newAutoCommit) {

    public void setResultSetLimit(long offset, long maxRows) {
        }

                    default:
                        }
        }
    }
                    DBUtils.closeSafely(resultSet);
                } else {
        if (keepCursor) {
                }
                && !txnManager.isAutoCommit() && commitType != SQLScriptCommitType.AUTOCOMMIT
                if (hasResultSet && fetchResultSets) {
                connectionInvalidated = true;
    }
                    fakeResultSet.addColumn("Finish time", DBPDataKind.DATETIME);
                boolean newAutoCommit = (commitType == SQLScriptCommitType.AUTOCOMMIT);
            // User canceled
        @NotNull DBCExecutionContext executionContext,
                        if (stopScript) {
                                statistics.addWarning(e);
    }
            }
        int resultNumber,
                if (statistics.getStatementsCount() > 1) {
    }
    ) throws DBCException {
                        lastGoodQuery = element;
                        listener.onStartScript();
            // Some databases (especially NoSQL) may produce a lot of

                        // Ask to continue
        @NotNull SQLQuery query
                try {

                                // #2792: Check this twice. Some drivers (e.g. Sybase jConnect)
                        monitor.beginTask("Rollback data", 1);
                    //statistics.setStatementsCount(0);
                        log.error(lastError);
        DBRProgressMonitor monitor = session.getProgressMonitor();
                        String entityName = attr.getEntityName();
            sqlQuery = new SQLQuery(executionContext.getDataSource(), filteredQueryText, sqlQuery);
        statistics = new DBCStatistics();

    private void showExecutionResult(DBCSession session) {
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                    SQLEditorActivator.PLUGIN_ID,
                        RuntimeUtils.formatExecutionTime(statistics.getTotalTime()),
                                try {
                    }
                    } catch (Exception e) {
        boolean isIncludedScript = partSite.getPart() instanceof IEditorPart ep &&
        String queryText = originalQuery.getText();//.trim();
                    @Override
                            lastError,
            txnManager.commit(session);
                        }
            if (txnManager != null && txnManager.isSupportsTransactions()
            try {
                        if (text.length() > MAX_QUERY_PREVIEW_LENGTH) {
                            DBCTransactionManager transactionManager = DBUtils.getTransactionManager(session.getExecutionContext());
                    fakeResultSet.addColumn("Updated Rows", DBPDataKind.NUMERIC);
            while ((!hasLimits() || !fetchProgress.isMaxRowsFetched(rsMaxRows)) && !fetchProgress.isCanceled() && resultSet.nextRow()) {
    }
                        result = descriptor.createHandler().processPragma(session.getProgressMonitor(), container, entry.getValue());
                    if (hasResultSet && fetchResultSets) {
    public DBCStatistics getStatistics()
                    @Override
        monitor.subTask(fetchProgress.getRowCount() + " rows fetched");
                        && !oldAutoCommit && commitType != SQLScriptCommitType.AUTOCOMMIT
import org.jkiss.dbeaver.ui.UIUtils;
        if (isShowExecutionResult()) { // Single statement with some stats
                            isQueue ? "SQL script execution" : "SQL query execution",
                        createButton(parent, IDialogConstants.NO_ID, IDialogConstants.NO_LABEL, false);
            if (!(nestedElement instanceof SQLQuery nestedQuery)) {
            this.errorHandling = SQLScriptErrorHandling.valueOf(preferenceStore.getString(SQLPreferenceConstants.SCRIPT_ERROR_HANDLING));
import org.jkiss.code.Nullable;

            curResult.setRowOffset(rsOffset);
                // Notify job start

            DBRProgressMonitor monitor = session.getProgressMonitor();
                        it.remove();

                    "SQL job completed");
                SQLControlResult controlResult = scriptContext.executeControlCommand(session.getProgressMonitor(), controlCommand);
                filteredQueryText = dataSource.getSQLDialect().addFiltersToQuery(

import org.eclipse.core.runtime.IStatus;
        this.fetchResultSetNumber = fetchResultSetNumber;
                lastGoodQuery = element;

                    if (changedToManualCommit) {
                if (!hasResultSet) {
    private int fetchResultSetNumber;
                        return true;
    private void executeStatement(@NotNull DBCSession session, SQLQuery sqlQuery, long startTime, SQLQueryResult curResult) throws DBException {
                if (dialog.getToggleState()) {
 *
                        return UIUtils.getDialogSettings("DBeaver.SQLQueryConfirmDialog"); //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
        final DBPDataSource dataSource = executionContext.getDataSource();
                    }
        } else if (allowStatistics && result && statistics.getStatementsCount() > 0) {
                    listener.onEndSqlJob(session, getSqlJobResult());
                monitor.done();
            if (fireEvents && listener != null && startQueryAlerted) {
                log.error("Unable to add filters to query", e);
            statementCancel = true;
                }
    }
        monitor.beginTask("Get data receiver", 1);
    private boolean executeSingleQuery(
                            continue;
    public SQLScriptElement getLastQuery()

                log.error("Unexpected error while processing SQL", ex);
import org.jkiss.dbeaver.ModelPreferences;

        if (result != null) {
                }
        boolean fireEvents,
            }

            if (!executeSingleElement(session, fireEvents, nestedQuery)) {
                    fakeResultSet.addColumn("Start time", DBPDataKind.DATETIME);

    }
    private void fetchExecutionResult(@NotNull DBCSession session, @NotNull DBDDataReceiver dataReceiver, @NotNull SQLQuery query) throws DBException {
    }
                    }
        final DBPPreferenceStore store = getDataSourceContainer().getPreferenceStore();
            if (queries.size() == 1) {
                    throw e.getTargetException();
            }
        catch (Throwable ex) {
            for (var it = scriptContext.getPragmas().entrySet().iterator(); it.hasNext(); ) {
                            text = CommonUtils.truncateString(text, MAX_QUERY_PREVIEW_LENGTH) +
            //monitor.subTask("Close query");
            SQLQuery query = new SQLQuery(session.getDataSource(), "", -1, -1);
            }
                    return true;
    {
 * limitations under the License.
    private final IWorkbenchPartSite partSite;
                int result = dialog.open();
                    final int result;
        }

                            txnManager.commit(session);
        return rsOffset >= 0 && rsMaxRows > 0;
        if (queries.get(queries.size() - 1) == lastGoodQuery && lastError == null) {

 * you may not use this file except in compliance with the License.
    protected void handleTransactionStatements(

import org.jkiss.dbeaver.DBException;
                            createButton(parent, IDialogConstants.YES_TO_ALL_ID, IDialogConstants.YES_TO_ALL_LABEL, false);
                            case IGNORE_ALL:

    }
    private DBCStatistics statistics;
        finally {
            log.error("Unsupported SQL element type: " + element);
                return false;
            return false;
                    executeStatement(session, execStatement, execStartTime, curResult);
            curResult.setQueryTime(System.currentTimeMillis() - startTime);
            if (lastError instanceof DBCException dbce) {
                }
                    {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
                lastError = e;
                                // Multiple source entities
                        // Just print a warning
        }
    }
        }
                    QMUtils.getDefaultHandler().handleScriptEnd(session);
                    try {
            if (!keepCursor) {
import org.jkiss.dbeaver.model.sql.registry.SQLPragmaHandlerDescriptor;
                    fetchExecutionResult(session, dataReceiver, query);
                        boolean stopScript = false;

    private final SQLResultsConsumer resultsConsumer;
            lastError = ex;
                                        // Some rows were fetched, so we don't want to fail entire query
    {
                            }

    public void setFetchResultSets(boolean fetchResultSets)

 * Unless required by applicable law or agreed to in writing, software
                    // let's return back to auto commit

                        skipConfirmation = true;
                    case IDialogConstants.YES_ID:
    private long fetchFlags;
                    }
        if (curStatement != null) {
                    updateCount = hasResultSet ? -1 : 0;
            }
            return false;
        final DBCStatement dbcStatement = DBUtils.makeStatement(
                        try {
import org.eclipse.osgi.util.NLS;
                        SQLQueryResult.ExecuteResult executeResult = curResult.addExecuteResult(false);
                                        statistics.setRowsFetched(rowsFetched);
    }
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
        return new UITask<Integer>() {
                }

            }
                    resultSetNumber++;
import org.jkiss.dbeaver.model.impl.local.StatResultSet;
        }

                    fakeResultSet.addRow(
        session.getProgressMonitor().subTask(CommonUtils.truncateString(query.getText(), 512));
        boolean updateStatistics
    private SQLScriptErrorHandling errorHandling;
                // Set transaction settings (only if autocommit is off)
                    ) {
            rsMaxRows);
            }
                            monitor.beginTask("Commit data", 1);
        this.rsOffset = offset;
    }
            }
            } else {
            } else {
                final String id = entry.getKey();
                } catch (Exception e) {
                                errorHandling = SQLScriptErrorHandling.IGNORE;
            final SQLQueryDataContainer container = new SQLQueryDataContainer(this::getExecutionContext, query, scriptContext, log);
    private SqlJobResult getSqlJobResult() {
        if (element instanceof SQLControlCommand controlCommand) {
        }
                }
                        DBCResultSet resultSet;
                } else {
                rowsFetched++;
 */
                            // Execution cancel

    {
                        RuntimeUtils.formatExecutionTime(statistics.getFetchTime()),
        this.dataFilter = dataFilter;
import org.jkiss.dbeaver.ui.dialogs.exec.ExecutionQueueErrorJob;
                        log.trace("Max rows exceeded. Additional resultsets extraction is disabled");
                            break;
    private Throwable lastError = null;
                                "... (truncated " + (text.length() - MAX_QUERY_PREVIEW_LENGTH) + " characters)";
                    if (txnManager != null && txnManager.isSupportsTransactions()
                    }
                    session.getProgressMonitor(),
    {
            if (!(ex instanceof DBException)) {
                                // ignore error


                }
                // Return success
        }
        boolean keepCursor = keepStatementOpen();
    @Override
            statistics.setQueryText(sqlQuery.getText());
            monitor.subTask("Execute query");
                            if (transactionManager != null) {
        // Success
            int resultSetCounter = 0;
        if (query.getType().equals(SQLQueryType.COMMIT)) {
                        boolean isQueue = isQueue();

                try {
            }

        skipConfirmation = false;
            } finally {
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    controlCommand.setData(listener);
                SQLQueryResult.ExecuteResult executeResult = resultInfo.addExecuteResult(true);
        try {
    private boolean executeSingleElement(@NotNull DBCSession session, boolean fireEvents, SQLQuery sqlQuery) {

            try {
                return false;
                        hasResultSet = false;
 * SQLQueryJob
                        }
import org.jkiss.dbeaver.model.impl.AbstractStatement;
                                lastError = null;
            try (DBCSession session = context.openSession(monitor, purpose, "SQL Query")) {
        query.reset();
                boolean oldAutoCommit = txnManager == null || txnManager.isAutoCommit();

        switch (statisticsTabOnExecutionBehavior) {
                            resultSet = dbcStatement.openResultSet();
            if (!CommonUtils.isEmpty(statistics.getWarnings())) {
            monitor.done();
            try {
            }
                        break;

                            case RETRY:
            showExecutionResult(session);
            DBCStatementType.SCRIPT,
            log.error(e);
    private boolean connectionInvalidated = false;
    }
            // Notify query start
import java.util.List;
                                    .getInt(SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY)
                    protected void createButtonsForButtonBar(Composite parent)

                        // Apply to the parent so that the message gets it too.
import org.jkiss.dbeaver.model.*;
                    //statistics.setRowsUpdated(0);


    private int resultSetNumber;
                try {
                    fakeResultSet.addRow(
                }
    private final List<DBCResultSet> curResultSets = new ArrayList<>();
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
        // Notify query end
                            }
                        log.error(e);
            ) {
        try {
    private final SQLScriptContext scriptContext;
 */
        }
        List<SQLScriptElement> nestedElements = sqlQuery.getScriptElements();
    public static final Object STATS_RESULTS = new Object();
        @NotNull SQLScriptContext scriptContext,
                                throw e;
                final String queryTitle = result.getStatement().getQueryTitle();
                    }
import org.jkiss.dbeaver.model.impl.local.LocalStatement;
                            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        this.queries = queries;
        DBRProgressMonitor monitor = session.getProgressMonitor();
            DBDDataReceiver dataReceiver = resultsConsumer.getDataReceiver(query, resultSetNumber);
        }


        if (!skipConfirmation && getDataSourceContainer().getConnectionConfiguration().getConnectionType().isConfirmExecute()) {
        final SQLQuery originalQuery = sqlQuery;

                        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
                } else {
                }
                    }
        resultSetNumber = resultNumber;
            return SqlJobResult.SUCCESS;
        return true;
                if (dataSourceInfo.supportsMultipleResults()) {
            sqlQuery = new SQLQuery(executionContext.getDataSource(), queryText, sqlQuery);
            if (listener != null) {
            default:
        final DBCExecutionContext executionContext = getExecutionContext();

}
                }
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
                        }
                            RuntimeUtils.pause(100);
    private long rsOffset;
            } else {
    public void setFetchFlags(long fetchFlags) {
    }
    private int fetchSize;
import org.eclipse.swt.SWT;
                    // Single statement - reorder fields to prioritize the important ones

                        changedToManualCommit = DBExecUtils.checkSmartAutoCommit(session, execStatement.getText());
                        monitor.done();
                    long execStartTime = System.currentTimeMillis();

import org.jkiss.dbeaver.model.data.DBDDataReceiver;

                        dialogArea = createDialogArea(parent);
                executeResult.setResultSetName(sourceName);
                    } else {

                if (statistics.getStatementsCount() > 0) {
        curResult = new SQLQueryResult(sqlQuery);

*/
        return lastGoodQuery;
        return curResult;
                curResultSets.clear();

                    }
                Status.ERROR,
                DBPDataSourceInfo dataSourceInfo = session.getDataSource().getInfo();
    }
                    if (!runNext) {
                SQLEditorActivator.PLUGIN_ID,
        statistics = new DBCStatistics();
        }
        }
        }
        if (queryNum == queries.size()) {
                    fetchResultSetNumber = resultSetNumber;

                    fakeResultSet.addColumn("Start time", DBPDataKind.DATETIME);
                closeStatement();

        if (!scriptContext.fillQueryParameters(
                }
        monitor.subTask("Create results view");
                throw dbce;

        source.setScriptContext(scriptContext);
            if (!keepStatementOpen()) {
                                        log.warn("Fetch failed", e);
                    queryNum++;
                        Text messageText = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
            }
        }

                switch (confirmResult) {

            getDataSourceContainer().getPreferenceStore().getBoolean(ResultSetPreferences.KEEP_STATEMENT_OPEN);
/*if (!statementCancel) {
                                    hasResultSet = fetchQueryData(session, resultSet, curResult, curResult.addExecuteResult(true), dataReceiver, true);
                    executor.run(session);
import org.jkiss.dbeaver.ui.UITask;
    {
                        return false;
                                getDataSourceContainer().getPreferenceStore()
                                // just stop execution
                    // Check monitor
            boolean confirmed = false;
            originalQuery,
/*
                    }
            }
                }
    private boolean hasLimits()
            }
                    log.error(e);
    }
                    // Retrieve source entity

                    if (hasLimits() && rowsFetched >= rsMaxRows && dataSourceInfo.isMultipleResultsFailsOnMaxRows()) {

                    fakeResultSet.addColumn("Finish time", DBPDataKind.DATETIME);
        } else {

            return SqlJobResult.PARTIAL_SUCCESS;
        // Only in single query mode and if pref option set to true


            try {
                        break;
            // Validate all transactional queries
                    sourceName = queryTitle;
                        gd.heightHint = UIUtils.getFontHeight(messageText) * 4 + 10;
            monitor.subTask("Execute query");
import java.util.Date;
                if (!CommonUtils.isEmpty(queryTitle)) {
                }
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
                    // Toggle smart commit mode
        monitor.beginTask("Process query", 1);
                handleTransactionStatements(txnManager, session, sqlQuery);
                    log.error("Unexpected error while processing SQL command", e);

 *
            this.commitType = SQLScriptCommitType.valueOf(preferenceStore.getString(SQLPreferenceConstants.SCRIPT_COMMIT_TYPE));
                        }
                    // Otherwise, display statistics if the option is set
import java.util.ArrayList;
                dbcStatement.setStatementTimeout(statementTimeout);
            rsOffset,
        @NotNull String name,
    private boolean skipConfirmation;
                        }
                return false;
                    break;
        lastError = null;
            store.getString(SQLPreferenceConstants.SHOW_STATISTICS_ON_EXECUTION));
                        // Just ignore error
                fetchQueryData(session, fakeResultSet, resultInfo, executeResult, dataReceiver, false);


        return "SQLQueryJob (" + queries + ")";
            }
                DBUtils.closeSafely(curStatement);
                            resultSetCounter++;
                        updateCount = dbcStatement.getUpdateRowCount();
    public SQLScriptElement getLastGoodQuery() {
        lastGoodQuery = originalQuery;
            }
                query.setText(queries.get(0).getText());
    }
                    if (hasResultSet && !confirmed && resultSetCounter >= getDataSourceContainer().getPreferenceStore()
    private DBDDataFilter dataFilter;
            String filteredQueryText;
        }
                if (CommonUtils.isEmpty(sourceName)) {
        curStatement = dbcStatement;
            };
import org.jkiss.utils.CommonUtils;
        if (updateStatistics) {
                    try {
                        return false;
    {
                    boolean runNext = executeSingleQuery(session, query, true);
                        handleTransactionStatements(txnManager, session, sqlQuery);
            }
                for (DBCResultSet resultSet : curResultSets) {
        for (SQLScriptElement nestedElement : nestedElements) {
                                        throw e;
        {
        this.partSite = partSite;
            if (result != null) {
        //session.getProgressMonitor().beginTask(CommonUtils.truncateString(query.getText(), 512), 1);
                                lastError = null;
                return resultSetNumber <= 0 || statistics.getRowsFetched() <= 0;
                    // We just switched to manual mode, there is no other statements in transaction

import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;

                                break;
        }
                );
import org.jkiss.dbeaver.model.sql.data.SQLQueryDataContainer;
    private DBCStatement curStatement;
        return true;
        }
            DBCExecutionPurpose purpose = queries.size() > 1 ? DBCExecutionPurpose.USER_SCRIPT : DBCExecutionPurpose.USER;

    }
                dataReceiver.fetchRow(session, resultSet);
                        createButton(parent, IDialogConstants.YES_ID, IDialogConstants.YES_LABEL, true);

                        query.getText()
                    }
            listener.onEndSqlJob(session, getSqlJobResult());
            queryNum = 0;
                if (dbcStatement instanceof AbstractStatement<?> as) {
        @NotNull IWorkbenchPartSite partSite,

                }
                            // This will happen quite often, do not log it
                    }

        } else if (query.getType().equals(SQLQueryType.ROLLBACK)) {
        if (resultSet == null) {
                if (session.isLoggingEnabled()) {
                final Map.Entry<String, Map<String, Object>> entry = it.next();
            String sourceName = null;//resultSet.getResultSetName();
        return statistics;
        final boolean fireEvents
            } catch (Throwable e) {
        }
        if (!result && lastError != null) {
                        txnManager.rollback(session, null);
            try {
                    }
                if (txnManager != null && !oldAutoCommit && newAutoCommit) {

import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
                            ((GridData) dialogArea.getLayoutData()).grabExcessVerticalSpace = false;

                            } else {

    @NotNull
                // Fetch data only if we have to fetch all results or if it is rs requested
                if (txnManager != null && txnManager.isSupportsTransactions() && !oldAutoCommit && commitType != SQLScriptCommitType.AUTOCOMMIT) {
                            }

    }
                }
                    showExecutionResult(session);

                        new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT).format(new Date(statistics.getStartTime())),
            if (!SQLSemanticProcessor.isSelectQuery(session.getDataSource().getSQLDialect(), sqlQuery.getText())) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    protected void canceling()

    private transient int rowsFetched;
 *
                        } else {

import org.jkiss.dbeaver.model.data.DBDDataFilter;
                }
                    fakeResultSet.addColumn("Query", DBPDataKind.STRING);
    public void setFetchResultSetNumber(int fetchResultSetNumber)
/**
                curResult.addWarnings(dbcStatement.getStatementWarnings());
    public void extractData(
            executeResult.setRowCount(fetchProgress.getRowCount());
                        break;
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
        boolean result = executeSingleQuery(session, query, fireEvents);
import org.eclipse.jface.dialogs.IDialogConstants;
                            break;
                    case IDialogConstants.YES_TO_ALL_ID:
                    fakeResultSet.addColumn("Queries", DBPDataKind.NUMERIC);
    private final DBSDataContainer dataContainer;
        @NotNull DBCSession session,
        RuntimeUtils.setThreadName("SQL script execution");
    }
        }
                try {
                            }
                };
                        updateCount,
                        "Do not ask for " + connectionType.getName() + " connections", false)
                    if (lastError == null || errorHandling == SQLScriptErrorHandling.STOP_COMMIT) {
            statistics.setRowsFetched(fetchProgress.getRowCount());
    private final SQLQueryListener listener;
                    @Override
                if (listener != null) {

                    fetchResultSetNumber = resultSetNumber;
                    }
                                }
        @NotNull SQLScriptElement element,
                        MessageDialog.WARNING, ConfirmationDialog.getButtonLabels(ConfirmationDialog.QUESTION_WITH_CANCEL), 0,
                            executeResult.setUpdateCount(updateCount);
                if (session.isLoggingEnabled()) {
                    if (CommonUtils.isBitSet(result, SQLPragmaHandler.RESULT_CONSUME_PRAGMA)) {
            return false;
        finally {
                    fakeResultSet.addColumn("Updated Rows", DBPDataKind.NUMERIC);
                        hasResultSet = DBWorkbench.getPlatformUI().confirmAction(
            }
        boolean startQueryAlerted = false;
                    }
                        messageText.setText(text);
    {
                                sourceName += "(+)";
                if (descriptor != null) {
    public void notifyQueryExecutionEnd(DBCSession session, SQLQueryResult curResult) {

                    as.runCloseDependants();

    public DBCStatement getCurrentStatement() {
                        messageText.setLayoutData(gd);
                        if (updateCount >= 0) {
            txnManager.rollback(session, null);
            // result sets, we should warn user because it may lead to UI freeze
        }
                    // Important fields like "Updated Rows" and "Execute time" are now displayed before the query text for easier access.
                        } catch (DBCException ex) {
import net.sf.jsqlparser.statement.Statement;
                    listener.onStartQuery(session, sqlQuery);
                        }
                }

            while (true) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            monitor.done();
                if (listener != null) {
        @Nullable SQLQueryResult result,
    private long rsMaxRows;
                    // Multiple statements - show script statistics
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
        try (LocalStatement statStatement = new LocalStatement(session, "statistics")) {
    }
    private boolean keepStatementOpen() {
                        } catch (Exception e) {
                notifyQueryExecutionEnd(session, curResult);
 * DBeaver - Universal Database Manager

        )) {
    private static final Log log = Log.getLog(SQLQueryJob.class);
            if (dataReceiver != null && !(dataReceiver instanceof IDataTransferConsumer)) {
                    if (updateCount < 0) {
        }
        if (!scriptContext.getPragmas().isEmpty() && element instanceof SQLQuery query) {
    private boolean fetchQueryData(
import org.jkiss.dbeaver.model.sql.*;
                    case IDialogConstants.NO_ID:
                    @Override
            }
                    // If there are no results or we have updated some rows, always display statistics
        // Fetch fake result set
                    if (CommonUtils.isEmpty(sourceName)) {

                    // We can't reset statistics here (we can be in script mode)

                                transactionManager.setAutoCommit(monitor, true);
            }
        @Nullable SQLQueryListener listener,
                                stopScript = true;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                        buttonBar = createButtonBar(parent);
package org.jkiss.dbeaver.ui.editors.sql.execute;
        final DBPConnectionType connectionType = getDataSourceContainer().getConnectionConfiguration().getConnectionType();
        @NotNull DBCSession session,
                        if (resultSet == null) {
                } catch (DBException e) {
                    if (updateCount <= 0 && updateCountReads >= MAX_UPDATE_COUNT_READS) {
                            // Kind of bug in the driver. It says it has resultset but returns null
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
            monitor.done();
                                break;
import org.eclipse.ui.IEditorPart;
                    } catch (DBException e) {
