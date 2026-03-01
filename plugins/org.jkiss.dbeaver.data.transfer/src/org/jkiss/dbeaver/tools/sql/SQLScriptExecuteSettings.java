
/**
}
                }
                if (project == null) {
        config.put("dumpQueryResultsToLog", dumpQueryResultsToLog);
            dsConfig.add(dsInfo);
    private boolean ignoreErrors;
import org.jkiss.dbeaver.model.task.DBTTaskSettings;
        if (dataSource != null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }

    }
        Throwable lastError = dataSourceRegistry.getLastError();
            String dataSourceContainerId = JSONUtils.getString(config, "dataSourceContainer");
                if (dataSource != null) {
import org.jkiss.dbeaver.Log;
        autoCommit = JSONUtils.getBoolean(config, "autoCommit");
        if (lastError != null) {
import java.util.ArrayList;
                    }
    public boolean isIgnoreErrors() {
                if (project != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                DBPDataSourceContainer dataSource = loadDataSourceOrThrow(project, dataSourceContainerId);
 *

import java.util.List;
    public void setDataSources(List<DBPDataSourceContainer> dataSources) {
        return null;
                    if (!CommonUtils.isEmpty(dataSourceContainerId)) {
        String projectName = JSONUtils.getString(config, "project");
    }
 * Unless required by applicable law or agreed to in writing, software
 */
 */
        DBPDataSourceContainer dataSource = dataSourceRegistry.getDataSource(id);
                project = CommonUtils.isEmpty(projectName) ? null : DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
        return autoCommit;
                            dataSources.add(dataSource);
        DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
        }


import org.jkiss.code.Nullable;
    }
                        if (dataSource != null) {
            dsInfo.put("project", ds.getProject().getName());
    public boolean isDumpQueryResultsToLog() {

    public boolean isAutoCommit() {
        dumpQueryResultsToLog = JSONUtils.getBoolean(config, "dumpQueryResultsToLog");
public class SQLScriptExecuteSettings implements DBTTaskSettings {
        DBPProject project = CommonUtils.isEmpty(projectName) ? null : DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
        // Legacy config support (single datasource
    public void loadConfiguration(@NotNull DBTTask task) throws DBException {
    private boolean autoCommit;
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        scriptFiles = JSONUtils.deserializeStringList(config, "scriptFiles");
        this.ignoreErrors = ignoreErrors;
    }
import org.jkiss.dbeaver.DBException;
        config.put("ignoreErrors", ignoreErrors);
        if (project != null) {
package org.jkiss.dbeaver.tools.sql;
                }
        return dataSources;
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.task.DBTTask;



            throw new DBException("Unable to load data source '" + id + "' from project '" + project.getId() + "'", lastError);
    private DBPTransactionIsolation transactionIsolation;
 * SQLScriptExecuteSettings
import org.jkiss.dbeaver.model.app.DBPProject;
        this.autoCommit = autoCommit;

            Map<String, Object> dsInfo = new LinkedHashMap<>();
            return dataSource;

                    dataSources.add(dataSource);
        }
        }
    public DBPTransactionIsolation getTransactionIsolation() {

        return ignoreErrors;
    public List<String> getScriptFiles() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        ignoreErrors = JSONUtils.getBoolean(config, "ignoreErrors");
    }
 * limitations under the License.
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    }
    private static final Log log = Log.getLog(SQLScriptExecuteSettings.class);

    private boolean dumpQueryResultsToLog;

 *
            }

    public List<DBPDataSourceContainer> getDataSources() {
    public void setTransactionIsolation(DBPTransactionIsolation transactionIsolation) {
        this.scriptFiles = scriptFiles;
import org.jkiss.utils.CommonUtils;
        this.transactionIsolation = transactionIsolation;
 * DBeaver - Universal Database Manager
            }

        for (DBPDataSourceContainer ds : dataSources) {
        return scriptFiles;
import java.util.LinkedHashMap;
            List<Map<String, Object>> dsConfig = JSONUtils.getObjectList(config, "dataSources");
import org.jkiss.dbeaver.runtime.DBWorkbench;
            for (Map<String, Object> dsInfo : dsConfig) {
    }

    }
        Map<String, Object> config = task.getProperties();
 *
        config.put("autoCommit", autoCommit);
                        DBPDataSourceContainer dataSource = loadDataSourceOrThrow(project, dataSourceContainerId);
                projectName = JSONUtils.getString(dsInfo, "project");
import java.util.Map;
/*
    private List<DBPDataSourceContainer> dataSources = new ArrayList<>();
        config.put("dataSources", dsConfig);
    }
    }
        List<Map<String, Object>> dsConfig = new ArrayList<>();

        this.dataSources = dataSources;

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public void setScriptFiles(List<String> scriptFiles) {
    public void setIgnoreErrors(boolean ignoreErrors) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.json.JSONUtils;


            if (!CommonUtils.isEmpty(dataSourceContainerId)) {
    }
        return transactionIsolation;
        return dumpQueryResultsToLog;

    public void setAutoCommit(boolean autoCommit) {
                        }
    }
            // Modern config (datasource list)
            dsInfo.put("dataSource", ds.getId());
 * you may not use this file except in compliance with the License.

    private DBPDataSourceContainer loadDataSourceOrThrow(@NotNull DBPProject project, @NotNull String id) throws DBException {
                    String dataSourceContainerId = JSONUtils.getString(dsInfo, "dataSource");
                }
    private List<String> scriptFiles = new ArrayList<>();
    @Nullable

import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    public void setDumpQueryResultsToLog(boolean dumpQueryResultsToLog) {
        this.dumpQueryResultsToLog = dumpQueryResultsToLog;
    }
                    project = task.getProject();

        config.put("scriptFiles", scriptFiles);
    public void saveConfiguration(Map<String, Object> config) {
