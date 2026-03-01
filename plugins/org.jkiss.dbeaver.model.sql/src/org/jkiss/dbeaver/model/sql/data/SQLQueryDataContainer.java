    private final SQLScriptContext scriptContext;
                        long fetchStartTime = System.currentTimeMillis();
            } catch (DBException e) {
        if (name == null) {
    public boolean isPersisted() {
    @Override
    }
    }
    @Nullable

                    }
    @NotNull
        if (query.getParameters() == null) {
            sqlQuery = new SQLQuery(dataSource, queryText, sqlQuery);
        for (SQLQueryParameter parameter : query.getParameters()) {
    @Nullable



    @Override
        @NotNull DBCSession session,
            } else {
        final SQLQueryResult curResult = new SQLQueryResult(sqlQuery);
            try {


 */


    public String getDescription()
    }
    @Override
        long startTime = System.currentTimeMillis();
    public DBPDataSource getDataSource()
        this.contextProvider = contextProvider;
            DBExecUtils.setStatementFetchSize(dbcStatement, firstRow, maxRows, fetchSize);

    }
import org.jkiss.dbeaver.model.data.DBDDataFilter;
        }


 * DBeaver - Universal Database Manager
        // Modify query (filters + parameters)
        @Nullable DBCExecutionSource source,
    {
 */
        int fetchSize
        this.log = log;
        return scriptContext;
 * You may obtain a copy of the License at
                    try (resultSet) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public String[] getSupportedFeatures() {
        return new String[] {FEATURE_DATA_SELECT, FEATURE_DATA_COUNT, FEATURE_DATA_FILTER};
    {
import java.util.LinkedHashMap;
            statistics.addExecuteTime(System.currentTimeMillis() - startTime);
        statistics.setQueryText(sqlQuery.getText());
                    session.getProgressMonitor(),
    }
    public SQLScriptContext getScriptContext() {
    @Override
            if (hasResultSet) {
        return statistics;
        return false;

        String name = query.getOriginalText();
 * Unless required by applicable law or agreed to in writing, software
        return obj instanceof SQLQueryDataContainer &&
            }
        return result;

import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
    public DBSObject getParentObject()
        return "SQL Query";


    public DBCStatistics readData(
        throws DBCException
package org.jkiss.dbeaver.model.sql.data;
    @Override
                    statistics.setRowsFetched(fetchProgress.getRowCount());
    }
/*
    @Nullable

    public boolean equals(Object obj) {
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
        Map<String, Object> result = new LinkedHashMap<>();


    }
    public String toString() {
            SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
        DBDDataFilter dataFilter,
                        statistics.addFetchTime(System.currentTimeMillis() - fetchStartTime);

        SQLQuery sqlQuery = query;
        DBCStatistics statistics = new DBCStatistics();
        try (final DBCStatement dbcStatement = DBUtils.makeStatement(
    }
                        while (!fetchProgress.isMaxRowsFetched(maxRows) && !fetchProgress.isCanceled() && resultSet.nextRow()) {
 * Data container for single SQL query.

        return DBIcon.TREE_FILE;
        return name;
                if (resultSet != null) {

import org.jkiss.dbeaver.model.*;
            DBCStatementType.SCRIPT,
 *
        return -1;
 * limitations under the License.
                    dataFilter
            SQLParserContext parserContext = new SQLParserContext(getDataSource(), syntaxManager, ruleManager, new Document(query.getText()));
    }
        }
        }
                            fetchProgress.monitorRowFetch();
    @Override
        this.query = query;
            // Execute statement
                // User canceled

    private final Log log;
            source,
                    DBDDataReceiver.startFetchWorkflow(dataReceiver, session, resultSet, firstRow, maxRows);
        }
                    dataSource,
            SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
                    }

    }

    }
    @Nullable
    @Override
/**
        return dataSource == null ? null : dataSource.getContainer();
import java.util.Map;
        DBPDataSource dataSource = getDataSource();
 * you may not use this file except in compliance with the License.
    public DBPDataSourceContainer getDataSourceContainer() {
        DBPDataSource dataSource = session.getDataSource();
            String filteredQueryText;
    }
            }
                    monitor.subTask(fetchProgress.getRowCount() + " rows fetched");
        return query.getOriginalText();
        this.scriptContext = scriptContext;
                            dataReceiver.fetchRow(session, resultSet);
        if (firstRow > 0) {
        this.query = query;
    @NotNull

        @NotNull DBDDataReceiver dataReceiver,
    {
        } else {
        }

            maxRows))
            sqlQuery.setParameters(SQLScriptParser.parseParametersAndVariables(parserContext, 0, sqlQuery.getLength()));
                        executeResult.setRowCount(fetchProgress.getRowCount());
                curResult.addWarnings(dbcStatement.getStatementWarnings());
    public String getName()
    }

import org.jkiss.code.NotNull;
    @Override
            result.put(parameter.getVarName(), parameter.getValue());
            statistics.addStatementsCount();
        {
    public SQLQueryDataContainer(DBPContextProvider contextProvider, SQLQuery query, SQLScriptContext scriptContext, Log log) {
        DBCExecutionContext executionContext = getExecutionContext();
            CommonUtils.equalObjects(query, ((SQLQueryDataContainer) obj).query);
                log.warn("Can't read execution warnings", e);
        long maxRows,
import org.jkiss.dbeaver.DBException;
                    SQLQueryResult.ExecuteResult executeResult = curResult.addExecuteResult(true);
    {
            sqlQuery,
    }
import org.jkiss.utils.CommonUtils;
        long flags,
            boolean hasResultSet = dbcStatement.executeStatement();
        long firstRow,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return executionContext == null ? null : executionContext.getDataSource();
    }
            session,
        return query;
                    monitor.subTask("Fetch result set");
 *
            }
    @Nullable
        return contextProvider.getExecutionContext();
            session.getProgressMonitor().subTask("Execute query");

 * Licensed under the Apache License, Version 2.0 (the "License");
                }
import org.jkiss.code.Nullable;

            return scriptContext.getAllParameters();
    private final DBPContextProvider contextProvider;
        }
            try {
    public void setQuery(SQLQuery query) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
            firstRow,
import org.jkiss.dbeaver.model.sql.*;

    {
            curResult.setHasResultSet(hasResultSet);

            sqlQuery = new SQLQuery(dataSource, filteredQueryText, sqlQuery);

    @Override
    public DBPImage getObjectImage() {
import org.jkiss.dbeaver.model.sql.parser.SQLParserContext;
                    queryText,
 * distributed under the License is distributed on an "AS IS" BASIS,
                DBCResultSet resultSet = dbcStatement.openResultSet();
                filteredQueryText = dataSource.getSQLDialect().addFiltersToQuery(
    @Override
    @Override
import org.eclipse.jface.text.Document;
    @NotNull

                        // Fetch all rows
            } catch (Throwable e) {
            }
    {
        String queryText = sqlQuery.getText();//.trim();
                return statistics;
                        }


            name = "SQL";
    public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags)
    @NotNull
    ) throws DBException
 *
    public DBCExecutionContext getExecutionContext() {
            ruleManager.loadRules(dataSource, false);
import org.jkiss.dbeaver.Log;
    @Override
    @Override
}
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Doesn't support multiple resulsets.
        if (dataFilter != null && dataFilter.hasFilters()) {
    public SQLScriptElement getQuery() {
                throw new DBCException("Unable to apply filters to query", e, session.getExecutionContext());
    private SQLQuery query;
        }
import org.jkiss.dbeaver.model.exec.*;
        if (scriptContext != null) {
            syntaxManager.init(dataSource.getSQLDialect(), dataSource.getContainer().getPreferenceStore());
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    @Override

                    DBFetchProgress fetchProgress = new DBFetchProgress(session.getProgressMonitor());
public class SQLQueryDataContainer implements DBSDataContainer, SQLQueryContainer, DBPContextProvider, DBPImageProvider {
                );
        return getDataSource();

    public Map<String, Object> getQueryParameters() {
    @Override
                log.warn("No results returned by query execution");
            curResult.setRowOffset(firstRow);
 * See the License for the specific language governing permissions and
            if (!scriptContext.fillQueryParameters(sqlQuery, () -> dataReceiver, CommonUtils.isBitSet(flags, DBSDataContainer.FLAG_REFRESH))) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    DBRProgressMonitor monitor = session.getProgressMonitor();
    }
    }
                    if (executeResult != null) {
