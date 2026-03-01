        List<OBJECT_TYPE> objectList = settings.getObjectList();
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        script = script.trim();
        @NotNull PrintStream logStream,
        List<DBEPersistAction> queries = new ArrayList<>();
                }
        }
        return false;
        if (!script.isEmpty()) {
import java.util.List;
                                log.debug("Error executing query", e);
import org.jkiss.dbeaver.model.exec.*;
                            } catch (Exception e) {
                                                        ((SQLToolRunListener) listener).handleActionStatistics(object, action, session, executeStatistics);
 *
            }
                generateObjectQueries(session, settings, queries, object);
        } catch (InterruptedException e) {
import java.util.Locale;
                    DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
    public boolean needsRefreshOnFinish() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                txnManager.setAutoCommit(monitor, false);
                        if (!isAutoCommitModeSwitchedOn) {
                monitor.worked(1);
                                    continue;
                                    }

                    throw new InvocationTargetException(e);
import org.jkiss.dbeaver.model.runtime.PrintStreamProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
                                                                    statement);
                                            // Just print a warning
                        if(isRunInAutoCommit() && txnManager != null && !txnManager.isAutoCommit()){
        }
 * limitations under the License.
        for (OBJECT_TYPE object : objectList) {
                                                    monitor.subTask("\tFinished in " + RuntimeUtils.formatExecutionTime(execTime));
        return DBTTaskRunStatus.makeStatisticsStatus(statistics);
    public final DBTTaskRunStatus executeTask(

                monitor.subTask("Process [" + DBUtils.getObjectFullName(object, DBPEvaluationContext.UI) + "]");
                                monitor.worked(1);
                        for (DBEPersistAction action : queries) {
                                        script,
                            } catch (DBCException e) {
                            isAutoCommitModeSwitchedOn = false;
        } catch (Exception e) {
        try {
                                                            ((SQLToolRunStatisticsGenerator) SQLToolExecuteHandler.this).getExecuteStatistics(
                                log.debug("Cannot set auto-commit status", e);
                                if(listener instanceof SQLToolRunListener) {
        @NotNull DBRRunnableContext runnableContext,
                                            // This is bad but we can live with it

                            if (monitor.isCanceled()) {
                    executeTool(new PrintStreamProgressMonitor(monitor, logStream), task, settings, log, logStream, listener);
package org.jkiss.dbeaver.model.sql.task;
        return false;
            monitor.beginTask("Execute tool '" + task.getType().getName() + "'", objectList.size());
                                                            stat.setExecutionTime(execTime);
import org.jkiss.dbeaver.DBException;
        return false;
        @NotNull DBTTask task,
                                                                    object,
        }
                            }
        outLog.println("Tool execution finished");
                            }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

    }
                            txnManager.setAutoCommit(monitor, true);
        } finally {
    }
    public abstract void generateObjectQueries(DBCSession session, SETTINGS settings, List<DBEPersistAction> queries, OBJECT_TYPE object) throws DBCException;
 *
import org.jkiss.dbeaver.model.task.DBTTask;
                                                    }
            log.error(error);
                                            if (updateCount >= 0) {
                    try {
    private final DBCStatistics statistics = new DBCStatistics();
        @NotNull Log log,
import java.io.PrintStream;
        outLog.flush();
                                lastError = e;
import org.jkiss.code.NotNull;
                Throwable throwable = warnings.get(0);
                                        statistics.addExecuteTime(execTime);
        return false;
                                        statement.executeStatement();
import org.jkiss.dbeaver.Log;
                                if (!CommonUtils.isEmpty(script)) {
                    boolean isAutoCommitModeSwitchedOn = true;
            }
                                            // In some cases we can't read update count
            if (!warnings.isEmpty()) {
            }

        List<OBJECT_TYPE> objectList = settings.getObjectList();
                                }
                                            long updateCount = statement.getUpdateRowCount();
                                                } else {
                                        false,
                                break;
 */
                                                    List<? extends SQLToolStatistics> executeStatistics =

                                            }
                    } finally {
                                            log.warn("Can't obtain update count", e);
                                outLog.println("Error executing query\n" + e.getMessage());
                }
    }
                                                                    settings,
                            }
 * You may obtain a copy of the License at
        String script = queries.stream().map(DBEPersistAction::getScript).collect(Collectors.joining(";\n"));
    }
                                                        }
                                                                    action,
                                    try (final DBCStatement statement = session.prepareStatement(

                } catch (Exception e) {
                try {
        @NotNull DBTTaskExecutionListener listener) throws DBException
import java.util.stream.Collectors;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
                                }
        SETTINGS settings = createToolSettings();
                                        long execTime = System.currentTimeMillis() - startTime;
            List<Throwable> warnings = settings.getWarnings();
/**
        } catch (InvocationTargetException e) {
import java.util.ArrayList;
                        }
import org.jkiss.dbeaver.model.task.DBTTaskExecutionListener;
                                    )) {
                            try {
                        }
    @NotNull
    public boolean isRunInSeparateTransaction() {
                throw new DBCException("Tool execution error: " + throwable.getMessage(), throwable);
                    generateObjectQueries(session, settings, queries, object);

 * SQLToolExecuteHandler
 *
 * See the License for the specific language governing permissions and
    public abstract SETTINGS createToolSettings();
                            try {
                                                statistics.addRowsUpdated(updateCount);
                                                        for (SQLToolStatistics stat : executeStatistics) {
import org.jkiss.dbeaver.model.task.DBTTaskHandler;
import java.io.IOException;
        settings.loadConfiguration(runnableContext, task.getProperties(), task.getProject());
    public boolean isNeedConfirmation() {

public abstract class SQLToolExecuteHandler<OBJECT_TYPE extends DBSObject, SETTINGS extends SQLToolExecuteSettings<OBJECT_TYPE>> implements DBTTaskHandler {
}
        try {
        executeWithSettings(runnableContext, task, locale, log, logStream, listener, settings);
            for (OBJECT_TYPE object : objectList) {



    }
                                        if (listener instanceof SQLToolRunListener) {
                                                    } else {
import org.jkiss.dbeaver.model.task.DBTTaskRunStatus;
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.lang.reflect.InvocationTargetException;
                                                if (SQLToolExecuteHandler.this instanceof SQLToolRunStatisticsGenerator) {
    private void executeTool(DBRProgressMonitor monitor, DBTTask task, SETTINGS settings, Log log, PrintStream outLog, DBTTaskExecutionListener listener) throws DBException, IOException {
                                                    if (!CommonUtils.isEmpty(executeStatistics)) {
        }
                                        } catch (DBCException e) {
            try (DBCSession session = DBUtils.openUtilSession(monitor, object, "Generate tool queries")) {
 */
    @NotNull
                                                    ((SQLToolRunListener) listener).handleActionStatistics(object, action, session, Collections.singletonList(statisticsSimple));
    {
        }
                                        }
                                        try {

                                    ((SQLToolRunListener) listener).handleActionStatistics(object, action, session, Collections.singletonList(errorStat));
                                            if (action.getType() != DBEPersistAction.ActionType.INITIALIZER && action.getType() != DBEPersistAction.ActionType.FINALIZER) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            });
                                                }
                            if (!CommonUtils.isEmpty(action.getTitle())) {
                            } finally {
                                    SQLToolStatisticsSimple errorStat = new SQLToolStatisticsSimple(object, true);
                                        DBCStatementType.SCRIPT,
            outLog.println("Process error\n" + e.getMessage());
            monitor.done();

            log.debug("SQL tools canceled");
 * distributed under the License is distributed on an "AS IS" BASIS,
            // Add trailing delimiter (join doesn't do it)
 * DBeaver - Universal Database Manager
                                        false
                                        statistics.addStatementsCount();
        Exception lastError = null;
                                            }
        listener.taskStarted(task);
    public boolean isOpenTargetObjectsOnFinish() {
                                        }
            log.debug(e);
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                monitor.subTask(action.getTitle());
    }
                                    errorStat.setStatusMessage(e.getMessage());

                                                                    session,
                                if (action instanceof SQLDatabasePersistActionComment) {
                    DBCExecutionContext context = session.getExecutionContext();
    }
import java.util.Collections;
            script += ";\n";
                try (DBCSession session = DBUtils.openUtilSession(monitor, object, "Execute " + task.getType().getName())) {

import org.jkiss.dbeaver.model.DBUtils;
            error = e.getTargetException();
                                        false,
    }
                                                        ((SQLToolRunListener) listener).handleActionStatistics(object, action, session, Collections.singletonList(statisticsSimple));
/*
    }
        if (error != null) {
    private void executeWithSettings(@NotNull DBRRunnableContext runnableContext, DBTTask task, @NotNull Locale locale, @NotNull Log log, PrintStream logStream, @NotNull DBTTaskExecutionListener listener, SETTINGS settings) throws DBException {
                    }
                            }
            runnableContext.run(true, true, monitor -> {
    @Override
        return script;
    public String generateScript(DBRProgressMonitor monitor, SETTINGS settings) throws DBException {
                                        long startTime = System.currentTimeMillis();
        listener.taskFinished(task, null, lastError, settings);

                                }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
                    List<DBEPersistAction> queries = new ArrayList<>();

        @NotNull Locale locale,
            lastError = e;

                                String script = action.getScript();

 * Copyright (C) 2010-2025 DBeaver Corp and others
        return false;

    public boolean isRunInAutoCommit() {
        Throwable error = null;

                        }

                                                SQLToolStatisticsSimple statisticsSimple = new SQLToolStatisticsSimple(object, false);
