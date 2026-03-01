                // Fetch data only if we have to fetch all results or if it is rs requested
                    try {
 * DBeaver - Universal Database Manager
                            // #2792: Check this twice. Some drivers (e.g. Sybase jConnect)
        DBFetchProgress fetchProgress = new DBFetchProgress(session.getProgressMonitor());
            } catch (Throwable ex) {
        }
        try (resultSet) {
                }
    }
    private Throwable lastError = null;
                    break;
        }
                }
        if (element instanceof SQLScript script) {
        return lastError == null || errorHandling == SQLScriptErrorHandling.IGNORE;
        }
        } else if (!(element instanceof SQLQuery sqlQuery)) {
                            txnManager.commit(session);
        }
        if (dataReceiver == null) {
                        log.warn("Can't obtain update count", e);
                        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.sql.data.SQLQueryDataContainer;
            }
                        } else {
                    } catch (DBCException e) {
                    } catch (DBCException e) {
                }
                }

        this.scriptContext = scriptContext;
            scriptContext.fillQueryParameters(sqlQuery, () -> dataReceiver, true);
                if (errorHandling != SQLScriptErrorHandling.IGNORE) {


            source,
    }
import org.jkiss.code.NotNull;
        try {
    private final DBCStatistics totalStatistics = new DBCStatistics();
        this.offset = offset;
                    try {
            sqlQuery,
                if (!(ex instanceof DBException)) {
    public void setFetchFlags(long fetchFlags) {
    private DBCStatistics statistics;
    private boolean fetchQueryData(DBCSession session, DBCResultSet resultSet, DBDDataReceiver dataReceiver) throws DBException {
                    }
                if (!hasResultSet && updateCount < 0) {
            String duration = DurationFormatter.format(Duration.ofMillis(statistics.getExecuteTime()), DurationFormat.MEDIUM);
        if (element instanceof SQLControlCommand controlCommand) {
        @NotNull List<SQLScriptElement> script,
                    return true;

            throw new DBCException("Error during SQL script execution", ex);
            }
                });
                }

                        DBCResultSet resultSet = statement.openResultSet();
        for (SQLScriptElement query : script) {

                    for (Throwable warning : warnings) {
 *
    private final DBDDataReceiver dataReceiver;
                        scriptContext.getOutputWriter().println(null, warning.getMessage());
                    }
    }
            while (true) {
                        monitor.subTask("Rollback");
        this.dataReceiver = dataReceiver;
                if (!(e instanceof DBException)) {
        }

                }
                    monitor.beginTask("Finish transaction", 1);
                if (warnings != null) {
import org.jkiss.dbeaver.Log;
                Throwable[] warnings = statement.getStatementWarnings();
package org.jkiss.dbeaver.model.sql.exec;
                if (controlResult.getTransformed() != null) {
            }
                    }
            boolean runNext = executeSingleQuery(session, query);
                if (session.isLoggingEnabled()) {
            log.debug(STAT_LOG_PREFIX + "Time: " + duration +
                    } else if (errorHandling == SQLScriptErrorHandling.STOP_ROLLBACK) {
            }
                        // In some cases we can't read update count
 * SQLScriptProcessor
import org.jkiss.dbeaver.model.sql.*;
    private boolean executeSingleQuery(@NotNull DBCSession session, @NotNull SQLScriptElement element) {
        this.log = log;
            // Execute query
import java.util.List;

    public void setOffset(long offset) {
                if (session.isLoggingEnabled()) {
                lastError = ex;
    }
                    break;
            if (!runNext) {
                }
            boolean hasResultSet = statement.executeStatement();
                    QMUtils.getDefaultHandler().handleScriptBegin(session);
    }
        this.queries = queries;
            statistics.addStatementsCount();
 *

                    txnManager.setAutoCommit(monitor, oldAutoCommit);
                (statistics.getRowsUpdated() >= 0 ? ", updated " + statistics.getRowsUpdated() + " row(s)" : ""));
                            // Kind of bug in the driver. It says it has resultset but returns null
                SQLControlResult controlResult = scriptContext.executeControlCommand(session.getProgressMonitor(), controlCommand);
import org.jkiss.dbeaver.utils.RuntimeUtils;
            try (DBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.USER_SCRIPT, "SQL Query")) {
        );
                            hasResultSet = statement.nextResults();
            return false;
    private static final String STAT_LOG_PREFIX = "-----------------> ";
        return totalStatistics;

                    log.error(lastError);
                } else {
                    } else {
 *
            try {
    public void runScript(DBRProgressMonitor monitor) throws DBCException {
                }
                // Restore transactions settings
 * Unless required by applicable law or agreed to in writing, software
            lastError = null;
            maxRows

 */

                    log.error("Unexpected error while processing SQL command", e);
    }
    private final DBCExecutionContext executionContext;
    public DBCStatistics getTotalStatistics() {
        this.fetchFlags = fetchFlags;
                    }
                fetchProgress.monitorRowFetch();


    }
    private final Log log;
                boolean oldAutoCommit = txnManager == null || txnManager.isAutoCommit();
                        } else {
                        // Just print a warning
        return errorHandling;
            }
                    // Execution cancel
        @NotNull DBDDataReceiver dataReceiver,
        this.executionContext = executionContext;
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
        DBCExecutionSource source = new AbstractExecutionSource(dataContainer, session.getExecutionContext(), this, sqlQuery);
                    long execStartTime = System.currentTimeMillis();
        // Execute statement
            }

                executeScript(session, queries, true);
                            statistics.addRowsUpdated(updateCount);
                if (!hasResultSet) {
                    }
                            throw e;
                // Commit data
            // No data pump - skip fetching stage
        if (resultSet == null) {
                // Set transaction settings (only if autocommit is off)
 * limitations under the License.

    public void setMaxRows(long maxRows) {
    }
                        // Just ignore error
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
    }
                monitor.beginTask("Execute queries (" + queries.size() + ")", queries.size());
                if (txnManager != null && txnManager.isSupportsTransactions() && !oldAutoCommit && commitType != SQLScriptCommitType.AUTOCOMMIT) {
                lastError = e;

    public SQLScriptCommitType getCommitType() {

        return commitType;
 */
            log.debug(STAT_LOG_PREFIX + "Execute command\n" + element.getText());
                statement.close();
                    if (lastError == null || errorHandling == SQLScriptErrorHandling.STOP_COMMIT) {
public class SQLScriptProcessor {
            try {
                log.error("Error closing statement", e);
/*
                        updateCount = statement.getUpdateRowCount();
            // Fetch all rows

                    updateCount = hasResultSet ? -1 : 0;
        @NotNull Log log) {
                monitor.done();
                        if (updateCount >= 0) {
                        }
        monitor.subTask(fetchProgress.getRowCount() + " rows fetched");
                            hasResultSet = fetchQueryData(session, resultSet, dataReceiver);
                }
        }
            long updateCount = -1;
                }
                            log.error(e);
            }
            log.error("Unsupported SQL element type: " + element);
                    QMUtils.getDefaultHandler().handleScriptEnd(session);
                        }
        }
        statistics.setRowsFetched(fetchProgress.getRowCount());
            statistics.addExecuteTime(System.currentTimeMillis() - startTime);
        @NotNull DBCExecutionContext executionContext,
            while (!fetchProgress.isCanceled() && resultSet.nextRow()) {
        DBExecUtils.setStatementFetchSize(statement, 0, maxRows, fetchSize);
        @NotNull List<SQLScriptElement> queries,
                    // Nothing else to fetch
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
            totalStatistics.accumulate(statistics);
        boolean trackMonitor
                        if (session.getDataSource().getInfo().isMultipleResultsFetchBroken()) {
                    element = controlResult.getTransformed();

                    executeStatement(session, sqlQuery, execStartTime);
        DBDDataReceiver.startFetchWorkflow(dataReceiver, session, resultSet, 0, 0);
                    break;
        monitor.subTask("Fetch result set");
                    if (hasResultSet) {
import org.jkiss.dbeaver.model.qm.QMUtils;
                        txnManager.rollback(session, null);
    private long offset;
 * See the License for the specific language governing permissions and

                (statistics.getRowsFetched() >= 0 ? ", fetched " + statistics.getRowsFetched() + " row(s)" : "") +
                }
            }
            log.debug(STAT_LOG_PREFIX + "Execute query\n" + sqlQuery.getText());
            statistics.addFetchTime(System.currentTimeMillis() - fetchStartTime);
                        if (resultSet == null) {
    }
                statistics.setQueryText(sqlQuery.getText());
    }
    private void executeStatement(@NotNull DBCSession session, SQLQuery sqlQuery, long startTime) throws DBException {

                        hasResultSet = statement.nextResults();
        @NotNull SQLScriptContext scriptContext,
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
                if (txnManager != null && txnManager.isSupportsTransactions() && oldAutoCommit != newAutoCommit) {
    ) {
    }
            if (trackMonitor) {
        this.commitType = commitType;
                dataReceiver.fetchRow(session, resultSet);
            long fetchStartTime = System.currentTimeMillis();
            offset,
    private SQLScriptErrorHandling errorHandling = SQLScriptErrorHandling.STOP_ROLLBACK;
                        // This is bad but we can live with it
                            // throw error on n'th result fetch - but it still can keep fetching next results
        @NotNull DBCSession session,
                }

                statistics.reset();
import java.time.Duration;
                if (lastError == null) {

            try {
    private long fetchFlags;

import org.jkiss.dbeaver.utils.DurationFormatter;
        try {
            try {
            } catch (Throwable e) {
        final DBCStatement statement = DBUtils.makeStatement(
                }
                }
                    txnManager.setAutoCommit(monitor, newAutoCommit);

 * Licensed under the Apache License, Version 2.0 (the "License");
    public SQLScriptProcessor(
                scriptContext.clearStatementContext();
                DBExecUtils.tryExecuteRecover(session, session.getDataSource(), param -> {

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBUtils;
                log.warn("Can't read execution warnings", e);
            session,
            }
    private SQLScriptCommitType commitType = SQLScriptCommitType.AUTOCOMMIT;
            } catch (Throwable e) {
        this.maxRows = maxRows;
                    break;
import org.jkiss.dbeaver.utils.DurationFormat;
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (session.getProgressMonitor().isCanceled()) {


            } catch (Throwable e) {
                session.getProgressMonitor().worked(1);
                        monitor.subTask("Script executed with errors. Changes were not committed.");
                        if (commitType != SQLScriptCommitType.NO_COMMIT) {
            this.executeScript(session, script.getScriptElements(), false);

                            break;

            DBCStatementType.SCRIPT,
    private final List<SQLScriptElement> queries;
        return true;
    private int fetchSize;
            return false;

                }
    public SQLScriptErrorHandling getErrorHandling() {
        this.fetchSize = fetchSize;
    public void setFetchSize(int fetchSize) {
import org.jkiss.dbeaver.model.exec.*;
    }
        } else {
        if (lastError != null && errorHandling != SQLScriptErrorHandling.IGNORE) {
                boolean newAutoCommit = (commitType == SQLScriptCommitType.AUTOCOMMIT);

        this.errorHandling = errorHandling;
                return false;
    }

    private long maxRows;
                            monitor.subTask("Commit");

import org.jkiss.dbeaver.model.DBFetchProgress;
 *     http://www.apache.org/licenses/LICENSE-2.0

        statistics = new DBCStatistics();
        RuntimeUtils.setThreadName("SQL script execution");
        }
    public void setCommitType(SQLScriptCommitType commitType) {
import org.jkiss.dbeaver.DBException;
                if (session.getDataSource().getInfo().supportsMultipleResults()) {
                } else {
 * you may not use this file except in compliance with the License.
        } finally {
                break;
                } else {

    private final SQLScriptContext scriptContext;
    private void executeScript(
                {
                    log.warn("Query failed: " + lastError.getMessage());


        }
            }
/**
            throw new DBCException("Script execute failed", lastError);
            } finally {
                    log.error("Unexpected error while processing SQL", ex);
            return false;
        } catch (Throwable ex) {
                    monitor.done();
    public void setErrorHandling(SQLScriptErrorHandling errorHandling) {
                if (txnManager != null && txnManager.isSupportsTransactions() && oldAutoCommit != newAutoCommit) {
                        }
        DBRProgressMonitor monitor = session.getProgressMonitor();
    }

        SQLQueryDataContainer dataContainer = new SQLQueryDataContainer(() -> executionContext, sqlQuery, scriptContext, log);

