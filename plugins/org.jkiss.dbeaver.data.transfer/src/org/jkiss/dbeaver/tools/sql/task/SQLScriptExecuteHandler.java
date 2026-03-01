                    }
        }
                    DBCExecutionContext executionContext = dataSource.getDefaultInstance().getDefaultContext(monitor, false);
        var sqlFile = DTUtils.findProjectFile(project, filePath);
import org.jkiss.dbeaver.model.sql.SQLScriptCommitType;
 * you may not use this file except in compliance with the License.

    private void processScript(DBRProgressMonitor monitor, DBTTask task, SQLScriptExecuteSettings settings, DBCExecutionContext executionContext, String filePath, String sqlScriptContent, Log log, PrintStream logStream) throws DBException {
                        if (defaultSchema != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        dataSourceContainer.connect(monitor, true, true);
        }
import org.jkiss.dbeaver.model.navigator.DBNNode;
                } catch (Exception e) {
 * Unless required by applicable law or agreed to in writing, software
                        throw new DBException("Can't obtain data source connection");
            return IOUtils.readToString(fileReader);
                    }
 *
            return Files.readString(nioPath);
 */
        return DBTTaskRunStatus.makeStatisticsStatus(totalStatistics);
import java.nio.file.Path;
import java.nio.file.Files;
            log.error(error);
        }
import org.jkiss.dbeaver.model.app.DBPProject;

            throw new DBException("File " + filePath + " is not found in project " + project.getId());
        @NotNull Log log,

                    if (contextDefaults != null) {
                    runScripts(monitor, task, settings, log, logStream);
import java.util.Locale;
        totalStatistics.accumulate(scriptProcessor.getTotalStatistics());
import org.jkiss.dbeaver.model.navigator.DBNProject;
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                        }
                }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
            log.debug("Task canceled");
                try (Reader reader = new InputStreamReader(sd.openInputStream())) {
        }
                }
        @NotNull Log log,
import org.jkiss.dbeaver.tools.transfer.DTUtils;
    }

import java.nio.charset.StandardCharsets;
    @NotNull
            return new String(rmController.getResourceContents(project.getId(), filePath), StandardCharsets.UTF_8);
        scriptProcessor.setErrorHandling(settings.isIgnoreErrors() ? SQLScriptErrorHandling.IGNORE : SQLScriptErrorHandling.STOP_ROLLBACK);

import org.jkiss.dbeaver.model.sql.exec.SQLScriptProcessor;
                    if (!dataSourceContainer.isConnected()) {
        Throwable error = null;
                        DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
        try (Reader fileReader = Files.newBufferedReader(sqlFile)) {
        @NotNull DBRProgressMonitor monitor,
        scriptContext.setVariables(DBTaskUtils.getVariables(task));
 */

 * SQLScriptExecuteHandler
import org.jkiss.dbeaver.model.sql.SQLScriptErrorHandling;


                            log.debug("> Default schema: " + defaultSchema.getName());
        }
                            log.debug("> Default catalog: " + defaultCatalog.getName());
                        if (defaultCatalog != null) {
        scriptProcessor.setCommitType(settings.isAutoCommit() ? SQLScriptCommitType.AUTOCOMMIT : SQLScriptCommitType.AT_END);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.task.*;
        if (rmControllerProvider != null) {
        @NotNull DBPProject project,
        }
        SQLScriptContext scriptContext = new SQLScriptContext(null, () -> executionContext, null, logWriter, null);
import org.jkiss.dbeaver.model.rm.RMControllerProvider;
public class SQLScriptExecuteHandler implements DBTTaskHandler {
        @NotNull SQLScriptExecuteSettings settings
        log.debug("SQL script execute completed");
        SQLScriptProcessor scriptProcessor = new SQLScriptProcessor(executionContext, scriptElements, scriptContext, dataReceiver, log);
        // Start consumers
        RMControllerProvider rmControllerProvider = DBUtils.getAdapter(RMControllerProvider.class, project);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
        scriptProcessor.runScript(monitor);
            }
    ) throws DBException {
        if (settings.isDumpQueryResultsToLog()) {
                        }
import org.jkiss.dbeaver.model.exec.DBCStatistics;
        Path nioPath = DBFUtils.resolvePathFromString(monitor, project, filePath);
    public DBTTaskRunStatus executeTask(
                    DBCExecutionContextDefaults contextDefaults = executionContext.getContextDefaults();
        @NotNull Locale locale,

import org.jkiss.dbeaver.tools.sql.SQLScriptExecuteSettings;
        }
        log.debug("SQL Scripts Execute");
package org.jkiss.dbeaver.tools.sql.task;
/*
                    processScript(monitor, task, settings, executionContext, filePath, sqlScriptContent, log, logStream);
        List<DBPDataSourceContainer> dataSources = settings.getDataSources();
        } catch (InvocationTargetException e) {
            try {
        if (!IOUtils.isLocalPath(nioPath)) {
        SQLScriptExecuteSettings settings = new SQLScriptExecuteSettings();
 * distributed under the License is distributed on an "AS IS" BASIS,

        @NotNull DBTTaskExecutionListener listener) throws DBException
        @NotNull DBTTaskExecutionListener listener,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
                    throw new InvocationTargetException(e);
                    DBPDataSource dataSource = dataSourceContainer.getDataSource();
            var rmController = rmControllerProvider.getResourceController();
                try {

        DBNProject projectNode = project.getNavigatorModel().getRoot().getProjectNode(project);
        }
        settings.loadConfiguration(task);
    private final DBCStatistics totalStatistics = new DBCStatistics();

import org.jkiss.dbeaver.model.navigator.DBNStreamData;
        try {
        @NotNull PrintStream logStream,
            error = e.getTargetException();
import org.jkiss.dbeaver.model.fs.DBFUtils;
            dataReceiver.setDumpWriter(logWriter);
                        DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();


                    return IOUtils.readToString(reader);

 *
    ) throws DBException, IOException {
import org.jkiss.dbeaver.Log;
                }
        @NotNull DBTTask task,
import java.lang.reflect.InvocationTargetException;
            });
        @NotNull Locale locale,
import java.io.*;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    public static String readScriptContents(
import org.jkiss.dbeaver.DBException;
            } catch (Throwable e) {
                for (DBPDataSourceContainer dataSourceContainer : dataSources) {
        List<SQLScriptElement> scriptElements = SQLScriptParser.parseScript(executionContext.getDataSource(), sqlScriptContent);
 * You may obtain a copy of the License at
        if (projectNode != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.List;

        @NotNull PrintStream logStream,
            // Remote file
    private void runScripts(DBRProgressMonitor monitor, DBTTask task, SQLScriptExecuteSettings settings, Log log, PrintStream logStream) throws DBException {
        listener.taskFinished(task, null, error, settings);
    }
        }
        @NotNull DBRRunnableContext runnableContext,
                    var sqlScriptContent = readScriptContents(monitor, task.getProject(), filePath);
    {
            if (fileNode instanceof DBNStreamData sd) {
import org.jkiss.dbeaver.model.DBPDataSource;
        @NotNull DBTTask task,
/**
        @NotNull DBRRunnableContext runnableContext,
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
import org.jkiss.utils.IOUtils;
                    log.debug("> Execute script [" + filePath + "] in [" + dataSourceContainer.getName() + "]");
            DBNNode fileNode = projectNode.findNodeByRelativePath(monitor, filePath);
        SQLScriptDataReceiver dataReceiver = new SQLScriptDataReceiver();
        if (error != null) {
                Throwable error = e instanceof InvocationTargetException ? ((InvocationTargetException) e).getTargetException() : e;
        executeWithSettings(runnableContext, task, locale, log, logStream, listener, settings);
            }
            runnableContext.run(true, true, monitor -> {
                    if (dataSource == null) {

import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
                    }
 * DBeaver - Universal Database Manager
    }

}
        if (sqlFile == null) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBUtils;
 *
        listener.taskStarted(task);
 * See the License for the specific language governing permissions and

        PrintWriter logWriter = new PrintWriter(logStream, true);
        @NotNull String filePath
    private void executeWithSettings(
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        for (String filePath : settings.getScriptFiles()) {
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
        } catch (InterruptedException e) {
                throw new DBException("Error executing script '" + filePath + "'", error);
