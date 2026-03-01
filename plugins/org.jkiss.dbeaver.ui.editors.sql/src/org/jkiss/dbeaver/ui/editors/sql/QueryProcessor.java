                processDataExport(scriptContext, queries);
        for (QueryResultsContainer resultsProvider : resultContainers) {
                        : SQLEditorMessages.editors_sql_job_execute_script,
                                SQLEditorMessages.sql_editor_confirm_no_fetch_result_for_big_script_no
            singleQuery,
    protected abstract QueryResultsContainer createQueryResultsContainer(
            owner.showScriptPositionRuler(owner.getShowScriptRulerOnExecution());
                    );
        }
                    ResultSetViewer rsv = resultsContainer.getResultSetController();
                        new LoggingProgressMonitor(SQLEditorBase.log),
            QueryResultsContainer resultsContainer = getFirstResults();
        //            if (isStatsResult) {
        }
        }

        createResultsProvider(0, makeDefault);
        for (QueryResultsContainer rc : resultContainers) {
    }
        owner.setSmartAutoCommit(smartAutoCommit);
import org.eclipse.osgi.util.NLS;
            }
    }
        return owner.isSmartAutoCommit();
    @NotNull
        if (resultSetNumber >= resultContainers.size() && !owner.isDisposed()) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    resultsContainer.setQuery(queries.getFirst());
    private final SQLEditor owner;

    private final boolean singleQuery;
                    ) +

        return true;
    @Override
    @NotNull
                            owner.setDisableFetchResultSet(disableFetchCurrentResultSets);
            // Open new results processor in UI thread
        QueryResultsContainer resultsProvider = createQueryResultsContainer(
        //                for (QueryResultsProvider provider : resultContainers) {
            }
        int resultSetNumber,
        );
                RuntimeUtils.runTask(monitor -> job.closeJob(), "Close SQL job", 2000, true);
            String dataSourceContainerName = dataSourceContainer == null ? "N/A" : dataSourceContainer.getName();
/*
    }
        final boolean isSingleQuery = !forceScript && (queries.size() == 1);
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
                    NLS.bind(

        List<IDataTransferProducer<?>> producers = new ArrayList<>();
                try {
import org.jkiss.utils.CommonUtils;
    }
        return resultsProvider;
                job.cancel();
            if (job.getState() == Job.RUNNING) {
        int resultSetNumber,
                    isSingleQuery ? SQLEditorMessages.editors_sql_job_execute_query
import org.jkiss.code.NotNull;
                job.cancel();
                    executionContext, resultsContainer, queries, scriptContext, this, listener,
                return true;
            if (queryListener != null) {

import org.jkiss.dbeaver.model.sql.data.SQLQueryDataContainer;
        if (curDataReceiver != null) {

            return false;
    ) {
 * limitations under the License.
        resultContainers.add(resultsProvider);
    private final AtomicInteger curJobRunning = new AtomicInteger(0);
        @NotNull DBSDataContainer dataContainer,
import org.jkiss.dbeaver.utils.GeneralUtils;
                } else {
                boolean disableFetchCurrentResultSets;
    );
import org.jkiss.dbeaver.DBException;
        boolean singleQuery,
        //                        resultSetNumber = provider.resultSetNumber;
        this.curDataReceiver = curDataReceiver;

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        if (executionContext == null) {
import org.jkiss.dbeaver.ui.editors.sql.execute.SQLQueryJob;
        boolean export,
        boolean singleQuery
    public boolean isDirty() {
            DBWorkbench.getPlatformUI().showError(
                        rsv.refresh();

import org.jkiss.dbeaver.model.data.DBDDataReceiver;

import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
                if (queries.size() > QUERIES_COUNT_FOR_NO_FETCH_RESULT_SET_CONFIRMATION) {
                    DBWorkbench.getPlatformUI().showError("Command error", "Error processing control command", e);

                DBWorkbench.getPlatformUI()

                    closeJob();
        if (job != null) {
    }
            resultsProvider.setQuery(statement);
                    }
    private void processDataExport(SQLScriptContext scriptContext, List<SQLScriptElement> queries) {
import org.jkiss.dbeaver.tools.transfer.IDataTransferProducer;
            DBWorkbench.getPlatformUI().showError(
    @Override
        if (job != null) {
        final SQLQueryJob job = curJob;

import org.jkiss.code.Nullable;
    }
        DataTransferWizard.openWizard(
    }
    @NotNull
                SQLQueryDataContainer dataContainer = new SQLQueryDataContainer(getOwner(), query, scriptContext, SQLEditorBase.log);

        } else {
                        DBPPlatformUI.UserChoiceResponse rs = DBWorkbench.getPlatformUI().showUserChoice(

import java.util.concurrent.atomic.AtomicInteger;
            curJob = null;
        final QueryResultsContainer resultsProvider = resultContainers.get(resultSetNumber);
        this.singleQuery = singleQuery;
                    NLS.bind(SQLEditorMessages.sql_editor_data_receiver_result_name_tooltip_query, processedQueryText);
            if (export) {

 *
        final List<SQLScriptElement> queries,
            String processedQueryText = CommonUtils.isEmpty(queryText) ? "N/A" : queryText;
import org.eclipse.core.runtime.jobs.Job;
            new StructuredSelection(this),
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;
 *
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    @NotNull
    QueryResultsContainer getFirstResults() {
 */
    private QueryResultsContainer createResultsProvider(int resultSetNumber, boolean makeDefault) {
            }
            }
    }
 * DBeaver - Universal Database Manager
        }
            return null;
    @NotNull
import java.util.ArrayList;

        return false;
        for (SQLScriptElement element : queries) {
            } else {
                tabName = SQLEditorMessages.editors_sql_statistics;
    }
    QueryResultsContainer createResultsProvider(@NotNull DBSDataContainer dataContainer) {
        boolean fetchResults,


    public DBDDataReceiver getDataReceiver(final SQLQuery statement, final int resultSetNumber) {
            if (element instanceof SQLScript) {

            resultSetNumber,
    );
        //                    if (provider.query != null && provider.query.getData() == SQLQueryJob.STATS_RESULTS) {

        return curJobRunning.get();
            true
import org.jkiss.dbeaver.ui.ISmartTransactionManager;
 * See the License for the specific language governing permissions and
        return resultContainers.getFirst();
            producers,
                    if (controlResult.getTransformed() != null) {
    boolean processQueries(
        }
            SQLEditor.SQLEditorQueryListener listener = new SQLEditor.SQLEditorQueryListener(this, closeTabOnError);
            return false;
        {
    public void cancelJob() {
    }
    @NotNull

            }
    protected abstract QueryResultsContainer createQueryResultsContainer(
                            SQLEditorMessages.sql_editor_confirm_no_fetch_result_for_big_script_title,
        boolean makeDefault
            DBPDataSourceContainer dataSourceContainer = owner.getDataSourceContainer();
            String queryText = CommonUtils.truncateString(statement.getText(), 1000);
    void closeJob() {
                    disableFetchCurrentResultSets
        boolean forceScript,
                    disableFetchCurrentResultSets = false;
            return false;
        //                // Maybe it was already open
import java.util.List;
                } catch (DBException e) {
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
            owner.getSite().getWorkbenchWindow(),

        this.owner = owner;
            rc.viewer.cancelJobs();
                        controlCommand
        resultContainers.add(resultsProvider);
    protected final List<QueryResultsContainer> resultContainers = new ArrayList<>();
            if (container.isPinned()) {
    public AtomicInteger getCurJobRunning() {
    }
        //                    }
    @Override
    public SQLEditor getOwner() {
        );
        return false;
                        job.setFetchResultSets(true);
            }
                    if (fetchResults) {
 * Unless required by applicable law or agreed to in writing, software

                }
import org.eclipse.jface.viewers.StructuredSelection;
                        element = controlResult.getTransformed();
        SQLScriptContext scriptContext,
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
                    GeneralUtils.getDefaultLineSeparator() +
            );
    QueryProcessor(@NotNull SQLEditor owner, boolean singleQuery, boolean makeDefault) {
            }

            ResultSetViewer rsv = resultsProvider.getResultSetController();
                        }
    public boolean isSmartAutoCommit() {
        }
                        );
            if (element instanceof SQLControlCommand controlCommand) {
                tabName += " " + (queryIndex + 1);
                        disableFetchCurrentResultSets = owner.getDisableFetchResultSet();
            dataContainer,
            }
                        if (rs.forAllChoiceIndex != null) {
                    curJob = job;
                ModelMessages.error_not_connected_to_database
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }


            // Editor seems to be disposed - no data receiver


        if (makeDefault) {

        int resultSetIndex,
                        rsv.resetDataFilter(false);
                final SQLQueryJob job = new SQLQueryJob(

        final boolean isStatsResult = (statement != null && statement.getData() == SQLQueryJob.STATS_RESULTS);
                    if (rsv != null) {
            null,
            UIUtils.asyncExec(() -> resultsProvider.updateResultsName(finalTabName, toolTip));
        // Create first (default) results provider
        resultContainers.remove(resultsContainer);
                return true;
        SQLQueryListener queryListener
                        new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT).format(new Date())
        }
    List<QueryResultsContainer> getResultContainers() {
        if (curJobRunning.get() > 0) {
    }
                scriptContext.fillQueryParameters(query, () -> null, false);
import java.text.SimpleDateFormat;
}
    }
            owner.getMaxResultsTabIndex(),
        }
    }
                    } else {
    @NotNull
            return curDataReceiver;
                    return;
                } else {
            if (job.getState() == Job.RUNNING) {
        //                        break;
                }
                            List.of(
                        rsv.resetHistory();
            resultsProvider.setLastGoodQuery(statement);
                NLS.bind(SQLEditorMessages.sql_editor_data_receiver_result_name_tooltip_connection, dataSourceContainerName) +
        }
            }
        }
    public void setCurDataReceiver(DBDDataReceiver curDataReceiver) {
                            List.of(SQLEditorMessages.sql_editor_confirm_no_fetch_result_for_big_script_remember), 0, 0
import org.jkiss.dbeaver.utils.RuntimeUtils;
            makeDefault
                                SQLEditorMessages.sql_editor_confirm_no_fetch_result_for_big_script_yes,
                    .showError("Embedded scripts are not allowed", "Query contains script element: " + element.getText());
                SQLEditorMessages.editors_sql_error_cant_execute_query_title,
        return curJobRunning;
        }
                        disableFetchCurrentResultSets = rs.choiceIndex == 0;
    static final int QUERIES_COUNT_FOR_NO_FETCH_RESULT_SET_CONFIRMATION = 100;
        }
            // Nothing to process

                }
            UIUtils.syncExec(() -> createResultsProvider(resultSetNumber, false));
            );
            String finalTabName = tabName;
                return;
    }
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                producers.add(new DatabaseTransferProducer(dataContainer, null));
        ResultSetViewer rsv = resultsProvider.getResultSetController();
    void removeResults(QueryResultsContainer resultsContainer) {
        if (resultSetNumber >= resultContainers.size()) {
    public void setSmartAutoCommit(boolean smartAutoCommit) {
            }
import org.jkiss.dbeaver.model.messages.ModelMessages;
                    owner.getSite(),
        QueryResultsContainer resultsProvider = createQueryResultsContainer(

                    SQLControlResult controlResult = scriptContext.executeControlCommand(
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
                SQLEditorMessages.editors_sql_error_cant_execute_query_title,
                    curJob = job;
            if (element instanceof SQLQuery query) {
    }
import org.jkiss.dbeaver.model.sql.*;
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
        int resultSetIndex,

    private DBDDataReceiver curDataReceiver = null;
    private volatile SQLQueryJob curJob;
                    GeneralUtils.getDefaultLineSeparator() +
abstract class QueryProcessor implements SQLResultsConsumer, ISmartTransactionManager, SQLEditor.QueryProcessingComponent {
        return resultContainers;

        owner.removeResults(resultsContainer, resultContainers.isEmpty());

        if (queries.isEmpty()) {
import java.util.Date;
    @NotNull
 *
    public boolean hasPinnedTabs() {
                SQLEditorMessages.editors_sql_error_cant_execute_query_message
                    }
            singleQuery
        final DBCExecutionContext executionContext = owner.getExecutionContext();
            owner.queryProcessors.add(this);
        //            }
        return owner;
            if (isStatsResult) {
                    job.schedule();
import org.jkiss.dbeaver.ui.UIUtils;
        return curJob;
        );
 * You may obtain a copy of the License at
            if (rsv != null && rsv.isDirty()) {
            owner.queryProcessors.addFirst(this);
        boolean closeTabOnError,
                );
                    if (owner.getDisableFetchResultSet() == null) {

package org.jkiss.dbeaver.ui.editors.sql;
        // Prepare execution job
        final SQLQueryJob job = curJob;
                    }
        if (statement != null && !owner.getResultTabsContainer().isDisposed()) {
                listener.setExtListener(queryListener);
                        SQLEditorMessages.sql_editor_data_receiver_result_name_tooltip_time,
    public SQLQueryJob getCurJob() {
        for (QueryResultsContainer container : resultContainers) {
                            SQLEditorMessages.sql_editor_confirm_no_fetch_result_for_big_script_question,
            String toolTip =
            String tabName = null;
        return rsv == null ? null : rsv.getDataReceiver();
                if (isSingleQuery) {
    @Nullable
        //                }
            // Special statements (not real statements) have their name in data
            if (job.isJobOpen()) {
            resultContainers.size(),
                            ),
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBConstants;

    }
        return resultsProvider;
            owner.getMaxResultsTabIndex() + 1,
                    }
    }
        }
    int getRunningJobs() {
                int queryIndex = owner.queryProcessors.indexOf(QueryProcessor.this);
