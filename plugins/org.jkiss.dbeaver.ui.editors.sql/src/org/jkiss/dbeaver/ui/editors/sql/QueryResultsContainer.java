        return getOwner().isSmartAutoCommit();
            } else {
    @Override

        } finally {
    public void detach() {
                true,
        int fetchSize
        @NotNull DBDDataReceiver dataReceiver,
    @Override
    @Override
        DBDDataFilter dataFilter,

    @Nullable

        // dump server output only once on one query execution
        return name;
    }
        if (this.resultSetNumber == 0) {
    }
    }
        } catch (Throwable e) {

    @Nullable
    public long countData(
        } else {
                job.setFetchResultSetNumber(-1);
            }
 * Licensed under the Apache License, Version 2.0 (the "License");

    IResultSetValueReflector,

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        this(resultSetViewerContainer, queryProcessor, resultSetNumber, resultSetIndex, singleQuery, false);

        try {

                currentQueryResult.setError(error);
    DBSDataContainer,
    public int getQueryIndex() {
import org.jkiss.dbeaver.model.data.DBDDataReceiver;


        if (query instanceof SQLQuery sqlQuery && sqlQuery.isModifying()) {
                IWorkbenchPage.MATCH_NONE
            job.setDataFilter(dataFilter);
    }
    public String getName() {
        getOwner().setSmartAutoCommit(smartAutoCommit);
    }

    public void onModelPrepared() {
        return viewer != null && viewer.hasData();
    public void forceDataReadCancel(Throwable error) {
        @NotNull DBSDataContainer dataContainer,
    }
    }

            return dataContainer.readData(source, session, dataReceiver, dataFilter, firstRow, maxRows, flags, fetchSize);
        this.resultSetNumber = resultSetNumber;
        }
            resultSetNumber, 0, dataContainer.getName()), null);
                    currentQueryResult = new SQLQueryResult(new SQLQuery(null, ""));
        long flags,
    private DBSDataContainer dataContainer;
        SQLEditor owner = getOwner();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
    public DBPProject getProject() {
    boolean isStatistics() {

    @Override
    }

    SQLEditor.QueryProcessingComponent {
        if (textWidget != null) {
            detached = false;

    @Nullable
            }
    }
            DBWorkbench.getPlatformUI().showError("Detached results", "Can't open results view", e);
    }
    }
        }
    @Override
        DBPDataSource dataSource = getDataSource();

        boolean makeDefault
    }
            return dataContainer.getDescription();
    }
                SQLResultsEditor.class.getName(),

            SQLQueryJob job = processor.getCurJob();
    public ResultSetViewer getResultSetController() {
        if (tabItem != null) {
    public boolean isReadyToRun() {
        long firstRow,
        @NotNull Composite resultSetViewerContainer,
        }
    }
        getOwner().notifyOnDataListeners(this);
    ISmartTransactionManager,

        }
import org.eclipse.jface.viewers.SelectionChangedEvent;
            try {
        this.dataContainer = dataContainer;
    public void setTabName(String tabName) {
            } else {
        if (dataContainer != null) {
        if (dataContainer != null) {

        @NotNull DBCSession session,
        final SQLQueryJob job = queryProcessor.getCurJob();

                job.notifyQueryExecutionEnd(null, currentQueryResult);
    protected final QueryProcessor queryProcessor;
    public void insertCurrentCellValue(DBDAttributeBinding attributeBinding, Object cellValue, String stringValue) {
    @Nullable

import java.util.Map;
 * You may obtain a copy of the License at
            job.setFetchSize(fetchSize);

import org.jkiss.dbeaver.ui.ISmartTransactionManager;
        getOwner().updateDirtyFlag();
    }
        features.add(FEATURE_DATA_SELECT);
            tabItem.setShowClose(!pinned);
    @NotNull

    public void handleResultSetSelectionChange(SelectionChangedEvent event) {
            }
    }
    @Override
    }
    @Override

            return DBUtils.countDataFromQuery(source, session, countQuery);
    SQLQueryContainer,
            } finally {
    }
                firstRow = sqlQuery.getResultsOffset();
                // Some custom receiver. Probably data export
    public DBCStatistics readData(
        return tabName;
        try {

abstract class QueryResultsContainer implements
    @Nullable
        if (dataSource == null) {
                maxRows = sqlQuery.getResultsMaxRows();
            if (qrc.query == query) {
    SQLEditor getOwner() {

        int resultSetIndex,
import java.util.ArrayList;

    ) throws DBException {
        }
import org.eclipse.swt.custom.CTabItem;
    public abstract void setPinned(boolean pinned);
        return queryProcessor;
    boolean hasData() {
        this.viewer.addListener(this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) throws DBException {
        DBRProgressMonitor monitor,
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.text.TextSelection;
    }
        }
    @Nullable
            // Nullify custom data receiver

        return getOwner().getProject();
 * See the License for the specific language governing permissions and
        return getOwner().createQueryResultsDecorator(singleQuery);
    protected boolean detached;
    @Override
    public DBPDataSourceContainer getDataSourceContainer() {
        this.resultSetIndex = resultSetIndex;
        try {
    }
    }


            throw new DBCException("Query transform is not supported by datasource");
        UIUtils.syncExec(() -> {
        return this;
        long flags
        if (dataContainer != null) {
import org.jkiss.dbeaver.model.struct.DBSObject;
            name = "SQL";
    @Override
 * you may not use this file except in compliance with the License.
    public void showCurrentError() {
            }
    }
        List<String> features = new ArrayList<>(3);
    @Override
    @Override
        });
        int resultSetIndex,
            throw new DBCException("Can't count rows for control command");
                SQLQueryResult currentQueryResult = job.getCurrentQueryResult();

    }
        this.singleQuery = singleQuery;
            job.setFetchFlags(flags);
        int resultSetNumber,
            CTabItem tabItem = resultsProvider.getResultsTab();
import org.jkiss.dbeaver.ui.editors.sql.execute.SQLQueryJob;
            tabItem.setImage(pinned ? SQLEditor.IMG_DATA_GRID_LOCKED : SQLEditor.IMG_DATA_GRID);
import org.jkiss.dbeaver.model.struct.DBSDataContainer;

        viewer.getControl().addDisposeListener(e -> {
        }
            queryProcessor.setCurDataReceiver(null);
            if (dataReceiver != viewer.getDataReceiver()) {
            }
        @NotNull DBDDataFilter newFilter
        return getDataSource();
        @NotNull DBSDataContainer dataContainer,
                resultCounts++;

    }
    @Override
    @Nullable
    @Override
            throw new DBCException("Error executing row count", e);
        }
            QueryResultsContainer resultsProvider = queryProcessor.createResultsProvider(dataContainer);
        } catch (DBException e) {
import org.eclipse.ui.IWorkbenchPage;
        if (!(query instanceof SQLQuery sqlQuery)) {
        long maxRows,
        }
            if (job != null) {
}
        this.viewer = new ResultSetViewer(resultSetViewerContainer, owner.getSite(), this);
    public String[] getSupportedFeatures() {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.sql.*;

            // Count number of results for this query. If > 1 then we will refresh them all at once
        }
        }
import org.jkiss.dbeaver.model.sql.transformers.SQLQueryTransformerCount;
    }
    }
        for (QueryProcessor processor : getOwner().queryProcessors) {

    }
    }
        }
        updateResultsName(queryProcessor.getOwner().getResultsTabName(
    protected final int resultSetIndex;
 *
        return query != null && query.getData() == SQLQueryJob.STATS_RESULTS;
    @Override
    private String tabName;
        if (dataContainer != null) {
    }
    public IResultSetDecorator createResultSetDecorator() {
                sqlValue = stringValue;
    public String getTabName() {
        return tabItem != null && !tabItem.isDisposed() && !tabItem.getShowClose();

import org.jkiss.code.NotNull;
    @Override

    public void openNewContainer(
                queryProcessor.setCurDataReceiver(dataReceiver);
    }
    private SQLScriptElement query = null;
    }
        return getOwner().queryProcessors.indexOf(queryProcessor);
    @Override
        return query;
            job.setResultSetLimit(firstRow, maxRows);
    public abstract CTabItem getResultsTab();
import org.jkiss.dbeaver.model.exec.*;
                tabItem.getParent().setSelection(tabItem);
            query.getOriginalText();
    public boolean isPersisted() {
        StyledText textWidget = getOwner().getTextViewer() == null ? null : getOwner().getTextViewer().getTextWidget();
 */
 *
        }
    protected abstract void dispose();

import org.jkiss.dbeaver.model.DBPDataSource;
            features.add(FEATURE_DATA_MODIFIED_ON_REFRESH);
    @NotNull
    abstract void updateResultsName(String resultSetName, String toolTip);
    }
            } else {
        if (name == null) {

    @NotNull
        }

        }
        @Nullable DBCExecutionSource source,
        @NotNull Composite resultSetViewerContainer,
    ) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

    IResultSetListener,
    }
        for (QueryResultsContainer qrc : queryProcessor.resultContainers) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
    }
        }
    @Override
    @Override
        SQLEditor owner = queryProcessor.getOwner();
            int resultCounts = getQueryResultCounts();
            textWidget.setCaretOffset(textWidget.getCaretOffset() + sqlValue.length());
package org.jkiss.dbeaver.ui.editors.sql;
    @Override
        if (getQueryResultCounts() <= 1 && lastGoodQuery instanceof SQLQuery) {
        return getOwner().getExecutionContext();
            if (tabItem != null) {
    @Override
 * DBeaver - Universal Database Manager
    }
        int resultCounts = 0;
            owner.setFocus();
import org.jkiss.utils.CommonUtils;
    IResultSetContainerExt,
                new SQLResultsEditorInput(this),

        return queryProcessor.getCurJob() == null || queryProcessor.getRunningJobs() <= 0;
    }
        }
import org.jkiss.dbeaver.model.app.DBPProject;
    @Override


    private int getQueryResultCounts() {
        this.tabName = tabName;

    }
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected int resultSetNumber;
            String sqlValue;
            return dataContainer.getSupportedFeatures();
import org.jkiss.dbeaver.model.DBUtils;
    public int getResultSetIndex() {
        });
    private SQLScriptElement lastGoodQuery = null;
    }
 *
            getOwner().dumpQueryServerOutput(result);
        if (this.query instanceof SQLQuery sqlQuery) {

    protected QueryResultsContainer(
    ) {
    }
    @Override
                if (currentQueryResult == null) {
    public DBSObject getParentObject() {
        return viewer;
                job.setFetchResultSetNumber(resultSetNumber);
        }
    public DBCExecutionContext getExecutionContext() {

import org.jkiss.dbeaver.ui.UIUtils;

            if (!CommonUtils.isEmpty(countQuery.getParameters())) {
            this.getOwner().getSite().getPage().openEditor(
            }
        @NotNull QueryProcessor queryProcessor,
            if (resultCounts <= 1 && resultSetNumber > 0) {
    void setQuery(SQLScriptElement query) {
 * Unless required by applicable law or agreed to in writing, software
    public SQLScriptElement getQuery() {
    // Data container and filter are non-null only in case of associations navigation
 *     http://www.apache.org/licenses/LICENSE-2.0
        return getOwner().getDataSourceContainer();
 * Copyright (C) 2010-2026 DBeaver Corp and others
            return job.getStatistics();
import org.jkiss.dbeaver.model.data.DBDDataFilter;
    protected boolean isTabPinned(CTabItem tabItem) {
    @Nullable
            return dataContainer.countData(source, session, dataFilter, DBSDataContainer.FLAG_NONE);
            detached = true;
        @NotNull DBCExecutionSource source,
    protected final boolean singleQuery;
        return getOwner().getGlobalScriptContext();
    @Override
    }
        this.query = query;
        this.lastGoodQuery = lastGoodQuery;
    @Override

    public String getDescription() {
        return resultCounts;
        }
            QueryResultsContainer.this.queryProcessor.removeResults(QueryResultsContainer.this);

    public void setSmartAutoCommit(boolean smartAutoCommit) {
    IResultSetContainer,
        if (dataContainer != null) {
    QueryResultsContainer(
import java.util.List;
        @Nullable DBDDataFilter dataFilter,
                lastGoodQuery = job.getLastGoodQuery();
                countQuery.setParameters(getOwner().parseQueryParameters(countQuery));
                job.extractData(session, this.query, resultCounts > 1 ? 0 : resultSetNumber, !detached, !detached);
    @Override
    }

    public Map<String, Object> getQueryParameters() {
    }
    protected final ResultSetViewer viewer;
    public void handleResultSetChange() {
            textWidget.setFocus();
    @Override
        if (job == null) {
            "SQL Query / " + getOwner().getEditorInput().getName() :
import org.jkiss.dbeaver.ui.controls.resultset.*;
    }

        @NotNull QueryProcessor queryProcessor,
        int resultSetNumber,
    public DBPDataSource getDataSource() {
            if (sqlQuery.getResultsMaxRows() >= 0) {
    public abstract boolean isPinned();
        this.queryProcessor = queryProcessor;
            features.add(FEATURE_DATA_FILTER);
        if (dataContainer != null) {
        if (owner.getLastQueryErrorPosition() > -1) {
        String name = lastGoodQuery != null ?

                sqlValue = SQLUtils.convertValueToSQL(getDataSource(), attributeBinding, cellValue);

        return getOwner().getGlobalScriptContext().getAllParameters();
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
            getOwner().setActiveResultsContainer(resultsProvider);
    @Override
        features.add(FEATURE_DATA_COUNT);

    public SQLScriptContext getScriptContext() {
            lastGoodQuery.getOriginalText() :
        return queryProcessor.getOwner();
            return SQLEditorMessages.editors_sql_description;
            return dataContainer.toString();

 * limitations under the License.
        boolean singleQuery
            throw new DBCException("No active query - can't read data");
        }
/*
            );
    }
    void setLastGoodQuery(SQLScriptElement lastGoodQuery) {
            if (getDataSource() != null) {

    }
        return getOwner().getDataSource();

            return dataContainer.getName();
        return features.toArray(new String[0]);
            (query == null ? null : query.getOriginalText());
            }

            owner.getSelectionProvider().setSelection(new TextSelection(owner.getLastQueryErrorPosition(), 0));
    public void handleResultSetLoad() {
                queryProcessor.setCurDataReceiver(null);


            textWidget.insert(sqlValue);
    public void handleExecuteResult(DBCExecutionResult result) {
    @Override
        }
        // even if it return multiple query results (resultSetNumber > 0)
        return query == null ?
    public DBSDataContainer getDataContainer() {
            SQLQuery countQuery = new SQLQueryTransformerCount().transformQuery(dataSource, getOwner().getSyntaxManager(), sqlQuery);
        boolean singleQuery,
import org.jkiss.code.Nullable;
    public String toString() {
        @NotNull DBCSession session,
import org.eclipse.swt.custom.StyledText;
    public boolean isSmartAutoCommit() {
            }
                }
        return dataContainer == null || dataContainer.isPersisted();
    protected void setTabPinned(@Nullable CTabItem tabItem, boolean pinned) {

    @Override

    IQueryExecuteController,
        return resultSetIndex;
    QueryProcessor getQueryProcessor() {
            resultsProvider.viewer.refreshWithFilter(newFilter);
