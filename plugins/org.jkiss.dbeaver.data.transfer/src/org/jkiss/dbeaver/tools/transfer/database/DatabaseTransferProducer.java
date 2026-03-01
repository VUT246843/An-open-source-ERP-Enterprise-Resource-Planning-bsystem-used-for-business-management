        public DatabaseTransferProducer deserializeObject(
                                }
                                }
    @Override
                        if (settings.getExtractType() == DatabaseProducerSettings.ExtractType.SINGLE_QUERY) {
            @NotNull Map<String, Object> state
                throw new DBCException("Error instantiating data producer", e.getTargetException());
}
            var useFetchedRows = settings.getFetchedRowsPolicy();
        final SQLQueryContainer queryContainer = GeneralUtils.adapt(dataContainer, SQLQueryContainer.class);

        return getObjectName() + (container == null ? "" : "@" + container.getName());
                            case "query": {
    @Override
import org.jkiss.dbeaver.model.meta.DBSerializable;
    public DBSDataContainer getDatabaseObject()
/*
                        }
    public boolean equals(Object obj) {
        DBPDataSourceContainer container = getDataSourceContainer();

                        if (project == null) {
                                    // Done
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
                            log.warn("Can't change auto-commit", e);
                state.put("type", "query");
    public boolean isConfigurationComplete() {
                    }

            if (context == null) {
            } else {
    @Override
                                    taskContextProvider,
                        throw new InvocationTargetException(e);

    public DBPProject getProject() {
        DBSDataContainer databaseObject = getDatabaseObject();
                                break;
                    }
            DBSDataContainer dataContainer = object.dataContainer;
import org.jkiss.dbeaver.model.app.DBPProject;
    @Override
                                    txnManager.rollback(session, savepoint);
                    state.put("project", dataSource.getProject().getName());
                            if (!txnManager.isAutoCommit()) {
import org.jkiss.dbeaver.model.impl.DataSourceContextProvider;
                                    taskContextProvider, null, new PrintWriter(System.err, true), null);
import org.jkiss.dbeaver.tools.transfer.serialize.DTObjectSerializer;
                                String queryText = CommonUtils.toString(state.get("query"));
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                                if (pathItems.length > 2) {
                    try {
                        } catch (Throwable e) {
            }
                                String id = CommonUtils.toString(state.get("entityId"));
    public DBPImage getObjectIcon() {
    }
        return obj instanceof DatabaseTransferProducer &&
        this.dataFilter = dataFilter;
    private final DBCStatistics producerStatistics = new DBCStatistics();
                                    }
                object.dataFilter.serialize(dataFilterState);
                        }
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
        @Nullable IDataTransferProcessor processor,
                        }
    @NotNull
                throw new DBCException("Can't retrieve execution context from data container " + dataContainer);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    readFlags |= DBSDataContainer.FLAG_USE_SELECTED_ROWS;
                            project = objectContext.getProject();
    }
            @NotNull DBTTask objectContext,

import org.jkiss.dbeaver.tools.transfer.IDataTransferProducer;
                        // Auto-commit has to be turned off because some drivers allows to read LOBs and

                        monitor.subTask("Read data");
                                String[] pathItems = id.split("/");
                            producerStatistics.accumulate(dataContainer.readData(transferSource, session, consumer, dataFilter, -1, -1, readFlags, settings.getFetchSize()));
        this.defaultCatalog = defaultCatalog;
                                if (producer.dataSourceContainer != null && !serializeContext.isDataSourceFailed(producer.dataSourceContainer)) {
                            if (txnManager != null && txnManager.isSupportsTransactions()) {
                                producer.dataContainer = new SQLQueryDataContainer(

                                }
                                txnManager.setAutoCommit(monitor, oldAutoCommit);
                    }
                                    scriptContext,
    @Nullable
    public String getDefaultSchema() {

            if (useFetchedRows != null) {
                context = DBUtils.getDefaultContext(dataContainer, false);

        if (dataContainer != null) {
                                    savepoint = txnManager.setSavepoint(monitor, "Data transfer start");
    private DBDDataFilter dataFilter;
            return DBValueFormatting.getObjectImage(dataContainer);
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
            } catch (InterruptedException e) {
    @Override
                if (useFetchedRows.selectedRowsOnly()) {
    public String getObjectFullName(@NotNull DBRProgressMonitor monitor) throws IOException {
    private DBSDataContainer dataContainer;
                            if (oldAutoCommit != null) {
    }
                }
                Map<String, Object> dataFilterState = new LinkedHashMap<>();
                    if (!selectiveExportFromUI && newConnection) {

import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
            boolean newConnection = settings.isOpenNewConnections() && !getDatabaseObject().getDataSource().getContainer().getDriver().isEmbedded();
import org.eclipse.core.runtime.IAdaptable;

        @Nullable DBTTask task)
                                String dsId = CommonUtils.toString(state.get("dataSource"));
                                    query,
            if (dataContainer instanceof DBPContextProvider) {
        }
                                txnManager.releaseSavepoint(monitor, savepoint);
            }
 */

                state.put("entityId", DBUtils.getObjectFullId(dataContainer));
    }
    }

            boolean selectiveExportFromUI = useFetchedRows != null;

                        context.close();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;
        @Override
    @Override
                    } finally {
                runnableContext.run(true, true, monitor -> {
                                }
                }
    public String getObjectContainerName() {
                                if (txnManager != null && !txnManager.isAutoCommit()) {
            long readFlags = DBSDataContainer.FLAG_NONE;
                        DBPProject project = CommonUtils.isEmpty(projectName) ? null : DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
    private static final Log log = Log.getLog(DatabaseTransferProducer.class);
                Boolean oldAutoCommit = null;
                                producer.dataSourceContainer = DBUtils.findDataSourceByObjectId(project, id);
            try {
                                    try {
                        try {
                }
                            if (savepoint != null) {
            }
        DBPDataSourceContainer container = getDataSourceContainer();
    private DBPDataSourceContainer dataSourceContainer;
    }
                        // Perform export
                                        serializeContext.addDataSourceFail(producer.dataSourceContainer);
    @Nullable
        assert (dataSource != null);
    public DatabaseTransferProducer() {

                        DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
                } finally {


 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                                SQLScriptContext scriptContext = new SQLScriptContext(null,
        if (queryContainer != null) {
    public void setDefaultSchema(@Nullable String defaultSchema) {
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntity;
            @NotNull SerializerContext serializeContext,
    }
    }
                                    log);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            } else {
                context = DBUtils.getObjectOwnerInstance(getDatabaseObject()).openIsolatedContext(monitor, "Data transfer producer", context);
        return dataSourceContainer;
                                DataSourceContextProvider taskContextProvider = new DataSourceContextProvider(dataSource);
                                        serializeContext.addError(e);
import org.jkiss.dbeaver.model.task.DBTaskUtils;
                    monitor.beginTask(DTMessages.data_transfer_wizard_job_task_export_table_data, (int) totalRows);
import java.util.LinkedHashMap;
                                if (txnManager.supportsSavepoints()) {
        return container != null ? container.getDriver().getIcon() : null;
import java.io.IOException;
            CommonUtils.equalObjects(dataContainer, ((DatabaseTransferProducer) obj).dataContainer) &&
    }
    public String getObjectName() {
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
    public String getDefaultCatalog() {
        return container != null ? container.getName() : CommonUtils.notNull(objectId, "?");
    }
    public DatabaseTransferProducer(@NotNull DBSDataContainer dataContainer)
            boolean forceDataReadTransactions = Boolean.TRUE.equals(dataSource.getDataSourceFeature(DBPDataSource.FEATURE_LOB_REQUIRE_TRANSACTIONS));
    public DatabaseTransferProducer(@NotNull DBSDataContainer dataContainer, @Nullable DBDDataFilter dataFilter)
                                txnManager.rollback(session, savepoint);
    @Nullable
        @NotNull IDataTransferConsumer consumer,
                SQLQueryContainer queryContainer = (SQLQueryContainer) dataContainer;
    }
        return dataContainer;
                        String selType = CommonUtils.toString(state.get("type"));
import java.util.Map;
                                    ds.connect(monitor, true, true);
    public DBPDataSourceContainer getDataSourceContainer() {
            if (dataContainer instanceof DBSEntity) {
        }
            } catch (InvocationTargetException e) {
                                oldAutoCommit = txnManager.isAutoCommit();
                    if (object.defaultCatalog != null) {
        DBExecUtils.tryExecuteRecover(monitor1, dataSource, monitor -> {
                                txnManager.setAutoCommit(monitor, false);
        @NotNull DBRProgressMonitor monitor1,
                                serializeContext.addError(new DBException("Unsupported selector type: " + selType));
                        state.put("defaultCatalog", object.defaultCatalog);
                DBTaskUtils.initFromContext(monitor, task, context);
    @Override
                                        producer.dataContainer = (DBSDataContainer) DBUtils.findObjectById(monitor, project, id);
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
 *
        return dataContainer != null;
                                break;
        throws DBException {
 * Unless required by applicable law or agreed to in writing, software
        }
                    AbstractExecutionSource transferSource = new AbstractExecutionSource(dataContainer, context, consumer);

                                }
                        state.put("defaultSchema", object.defaultSchema);
                            // Just do it in single query
import org.jkiss.dbeaver.model.task.DBTTask;
                        if (txnManager != null && txnManager.isSupportsTransactions()) {
/**
            if (!selectiveExportFromUI && newConnection) {
                    } catch (Exception e) {
                            }
                        String projectName = CommonUtils.toString(state.get("project"));

import org.jkiss.dbeaver.tools.transfer.IDataTransferNodePrimary;

                if (dataContainer.getDataSource() != null) {

    private String objectId;
            return producer;
                throw new DBCException("Deserialization canceled", e);
                                break;
                            monitor.done();
import org.jkiss.dbeaver.model.data.DBDDataFilter;
                });
        return producerStatistics;
                                DBCStatistics statistics = dataContainer.readData(
    }
                if (useFetchedRows.selectedColumnsOnly()) {
                        }
                                    producer.objectId = id;
                    }
                        // other complex structures only in transactional mode

                            int segmentSize = settings.getSegmentSize();
                            long offset = 0;

                                    throw new DBCException("Can't find datasource "+ dsId);
package org.jkiss.dbeaver.tools.transfer.database;

    @Nullable
                                producer.defaultCatalog = CommonUtils.toString(state.get("defaultCatalog"), null);
                                DBPDataSource dataSource = ds.getDataSource();

                        // Turn off auto-commit in source DB
                        }
    {
                                } else {
                        switch (selType) {
                        } finally {
    @Override

                    }
        this.dataContainer = dataContainer;
        }
    public DBCStatistics getStatistics() {
        DBPDataSourceContainer container = getDataSourceContainer();
                        } catch (DBCException e) {
        if (dataContainer instanceof DBPImageProvider) {
                            log.warn("Can't retrieve row count from '" + dataContainer.getName() + "'", e);
import org.jkiss.dbeaver.DBException;
        return dataContainer == null ? null : DBUtils.getObjectOwnerProject(dataContainer);
        return DBIcon.TREE_TABLE;
import org.jkiss.dbeaver.model.sql.data.SQLQueryDataContainer;
    {

            DatabaseTransferProducer producer = new DatabaseTransferProducer();
import org.jkiss.dbeaver.runtime.DBWorkbench;
        ) throws DBException {

                DBCSavepoint savepoint = null;

    }
import java.lang.reflect.InvocationTargetException;
    public void setDefaultCatalog(@Nullable String defaultCatalog) {
                if (dataSource != null) {
                                producerStatistics.accumulate(statistics);
                    state.put("project", dataContainer.getDataSource().getContainer().getProject().getName());

                                offset += statistics.getRowsFetched();
        if (databaseObject == null) {
import org.jkiss.utils.CommonUtils;
                            }
        @NotNull DatabaseProducerSettings settings,
            }

            @NotNull DBRRunnableContext runnableContext,
        return defaultCatalog;
            DBCExecutionContext context;

    }
                            }
                    readFlags |= DBSDataContainer.FLAG_USE_SELECTED_COLUMNS;

                            default:
 * limitations under the License.
                            totalRows = dataContainer.countData(transferSource, session, dataFilter, readFlags);
                            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
            }
                            case "entity": {
                                DBPDataSourceContainer ds = project.getDataSourceRegistry().getDataSource(dsId);
        });

                                log.warn("Error rolling back transaction", e1);
            DBPDataSource dataSource = dataContainer.getDataSource();
                    try {
                state.put("query", query.getOriginalText());
                        monitor.done();

                            }
        return defaultSchema;
        this.dataContainer = dataContainer;
        DBPDataSource dataSource = databaseObject.getDataSource();
                    if (!selectiveExportFromUI && (newConnection || forceDataReadTransactions)) {
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.*;
        public void serializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull DBTTask context, @NotNull DatabaseTransferProducer object, @NotNull Map<String, Object> state) {
import org.jkiss.dbeaver.model.sql.SQLQuery;
                }
                                    transferSource, session, consumer, dataFilter, offset, segmentSize, readFlags, settings.getFetchSize());
                    state.put("dataSource", dataSource.getId());

                                    } catch (DBException e) {
                                producer.defaultSchema = CommonUtils.toString(state.get("defaultSchema"), null);
            return dataSource == null ? null : dataSource.getContainer();
                                scriptContext.setVariables(DBTaskUtils.getVariables(objectContext));
    }
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
                DBSDataContainer nestedDataContainer = ((IAdaptable) dataContainer).getAdapter(DBSDataContainer.class);
                    }
 * you may not use this file except in compliance with the License.
                            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            } catch (Throwable e1) {
            CommonUtils.equalObjects(dataFilter, ((DatabaseTransferProducer) obj).dataFilter);
            } else if (dataContainer instanceof SQLQueryContainer) {
            }
                state.put("type", "entity");
                            try {

        return dataContainer == null ? objectId : DBUtils.getObjectFullName(dataContainer, DBPEvaluationContext.DML);
                    long totalRows = 0;
            if (dataContainer instanceof IAdaptable) {
import org.jkiss.dbeaver.model.exec.*;
            if (task != null) {
    public void transferData(
                    }
import org.jkiss.code.NotNull;
        this.dataContainer = dataContainer;
 * Data container transfer producer
                            }
                    }
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
            try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, contextTask)) {
    private String defaultSchema;
    @Nullable
                SQLScriptElement query = queryContainer.getQuery();
            return CommonUtils.getSingleLineString(queryContainer.getQuery().toString());
                            for (; ; ) {
    }
                                SQLQuery query = new SQLQuery(dataSource, queryText);
import org.jkiss.code.Nullable;
public class DatabaseTransferProducer implements IDataTransferProducer<DatabaseProducerSettings>, IDataTransferNodePrimary {
                                }
                DBPDataSourceContainer dataSource = queryContainer.getDataSourceContainer();
 * See the License for the specific language governing permissions and
        String contextTask = DTMessages.data_transfer_wizard_job_task_export;
import java.util.List;
            }
                        try {

 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (object.defaultSchema != null) {
                    dataContainer = nestedDataContainer;
                state.put("dataFilter", dataFilterState);

    @Nullable
        }
            throw new DBException("No input database object found");
                                if (ds == null) {
    private String defaultCatalog;
import java.io.PrintWriter;
                            }
                context = ((DBPContextProvider) dataContainer).getExecutionContext();
    public static class ObjectSerializer implements DTObjectSerializer<DBTTask, DatabaseTransferProducer> {
                            }
 */
@DBSerializable("databaseTransferProducer")
                                if (statistics == null || statistics.getRowsFetched() < segmentSize) {
    @Override
                }
    {
    }
    public void setDataContainer(@NotNull DBSDataContainer dataContainer) {
        }
                                    break;
                                if (!ds.isConnected()) {
                                }
                try {
    public DBPImage getObjectContainerIcon() {
    @Override
 *
 * You may obtain a copy of the License at

            }
                            // Read all data by segments
    }
import org.jkiss.dbeaver.Log;
                log.error("Unsupported producer data container: " + dataContainer);
    }
                    if (settings.isQueryRowCount() && dataContainer.isFeatureSupported(DBSDataContainer.FEATURE_DATA_COUNT)) {
                    if (!selectiveExportFromUI && (newConnection || forceDataReadTransactions)) {
 *
        @Override
                        } else {
                state.put("type", "unknown");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    }
        this.defaultSchema = defaultSchema;
                        monitor.beginTask(DTMessages.data_transfer_wizard_job_task_retrieve, 1);
                                DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());

                                    producer.objectId = String.join("/", List.of(pathItems).subList(2, pathItems.length));
    }
                if (nestedDataContainer != null) {

            }
                        }
            }
                DBExecUtils.setExecutionContextDefaults(monitor, dataSource, context, defaultCatalog, null, defaultSchema);
                readFlags |= DBSDataContainer.FLAG_USE_FETCHED_ROWS;
            if (object.dataFilter != null) {
