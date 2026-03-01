
            DBPDataSourceContainer dsContainer = mqEntry.getKey();

                    Object value = mapValue.get(mapKeys[i]);
            if (dataSource == null) {
                for (DBDashboardQuery query : queries) {
            return;
            try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, mqInfo.mapQuery.getQueryText(), false, false, false)) {
                for (MapQueryInfo mqi : queryList) {
                            continue;
                    continue;
                colName = rsAttr.getName();
            }
        private final Map<String, Object> mapValue = new HashMap<>();
                        updateDashboard(monitor, dashboard);
            this.dashboard = dashboard;
            String[] mapLabels = dashboard.getMapLabels();
                tsColName = colName;
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            monitor.worked(1);
                if (result instanceof Number) {
        for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
        }
        }
        if (getDashboardsToUpdate(dashboards)) {
            }
            }
                    }

            }
                    revertTxn = true;
            if (DashboardConstants.RS_COL_TIMESTAMP.equalsIgnoreCase(colName)) {
            try {
                        return null;
                    } catch (Throwable e) {
        DashboardContainer view = dashboard.getGroup().getView();
            String colName = rsAttr.getLabel();

import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;
            } else if (dashboard.getMapFormula() != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
            Date timestamp;

            DBPDataSource dataSource = dashboard.getDataSourceContainer().getDataSource();
                log.debug("Error reading map query data for '" + dsContainer.getName() + "'", e);
    private boolean checkViewDashboards(DataSourceDashboardView view) {
                if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
                        }
                    // Skip all provided
            for (IWorkbenchPage page : window.getPages()) {
            return dataset;
                        if (part instanceof DataSourceDashboardView dv && checkViewDashboards(dv)) {
            }
            }
                                    fetchDashboardData(dashboard, dbResults);
        DashboardDataset dataset = new DashboardDataset(colNames.toArray(new String[0]));


                for (IViewReference view : page.getViewReferences()) {
        }
            }
                // FIXME: dashboards must be queued in auto-commit mode?
                        if (name.equals("map")) {
                } else {
                    public void set(String name, Object value) {
                    if (mqi.mapQuery == mapQuery) {
                if (dbStat.executeStatement()) {
                }
import org.jkiss.dbeaver.model.DBUtils;
 * See the License for the specific language governing permissions and
        MapQueryInfo mqi = getMapQueryData(dashboard);
        // Get all map queries used by dashboards

                            return ciMap;
                }
            DBDashboardMapQuery mapQuery = dashboard.getMapQuery();
import org.jkiss.dbeaver.DBException;
                                if (dbResults != null) {
        if (queries.isEmpty()) {
    /**

        }
                    newRow = new DashboardDatasetRow(oldTimestamp, new Object[oldRows.size()]);
        try (DBCSession session = executionContext.openSession(
    }
    }
 *
        DBCExecutionContext executionContext = mqInfo.viewContainer.getExecutionContext();
                JexlContext context = new JexlContext() {
                if (ArrayUtils.isEmpty(mapLabels)) {
import org.jkiss.utils.ArrayUtils;
                        throw new DBCException("Error updating dashboard " + dashboard.getItemDescriptor().getId(), e, session.getExecutionContext());
        
                for (int i = 0; i < mapKeys.length; i++) {
            monitor, DBCExecutionPurpose.UTIL, "Read map query '" + mqInfo.mapQuery.getId() + "' data")) {

                            log.debug("Datasource '" + mqi.dashboard.getDataSourceContainer().getName() + "' dashboard query failed. Stopping update of dashboard queries for this datasource.");
                DBExecUtils.tryExecuteRecover(dashboards, dataSource, param -> {
        }

                DBExecUtils.tryExecuteRecover(dashboards, dataSource, param -> {
        monitor.done();
                continue;

            if (false) {
                newRow.getValues()[i] = oldRow.getValues()[colIndex];
    private void readMapQueryData(DBRProgressMonitor monitor, MapQueryInfo mqInfo) throws DBCException {
import org.jkiss.dbeaver.Log;

        }
                DashboardDataset dataset = new DashboardDataset(mapLabels);
                    txnManager.setAutoCommit(monitor, false);
                            throw e;
    }
public class DashboardUpdater {
                        break;
import org.jkiss.dbeaver.model.dashboard.data.DashboardDatasetRow;
                    }
                    @Override
                        } catch (DBCException e) {
            case rows:
        for (int i = 0; i < oldRows.size(); i++) {
                    }
                        try {
            this.mapQuery = mapQuery;
                        numValue = number;
                    ciMap.put(me.getKey().toLowerCase(Locale.ENGLISH), me.getValue());
 * Unless required by applicable law or agreed to in writing, software
                    public boolean has(String name) {
        dashboardContainer.updateDashboardData(dataset);

import org.jkiss.code.NotNull;
            if (!ArrayUtils.isEmpty(mapKeys)) {
                    @Override
                    public Object get(String name) {
        while (dbResults.nextRow()) {
                break;
                DashboardDatasetRow newRow = newRows[colIndex - 1];
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
                    }

                    try (DBCResultSet dbResults = dbStat.openResultSet()) {
        for (DashboardItemContainer dashboard : dashboards) {
                    }
                    try {

            }
 * You may obtain a copy of the License at
        DashboardDataset newDataset = new DashboardDataset(colNamesFromRows.toArray(new String[0]));

            String[] mapKeys = dashboard.getMapKeys();
                        log.debug("Datasource '" + dashboard.getDataSourceContainer().getName() + "' dashboard query failed. Stopping update of dashboards for this datasource.");
 */
        return pauseDashboardUpdate;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * limitations under the License.
        updateDashboards(monitor, dashboards);
/*
package org.jkiss.dbeaver.ui.dashboard.view;
            }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            fetchDashboardMapData(monitor, dashboard);
                    dashboards.add(dashboardContainer);
            for (int colIndex = 1; colIndex < oldColumnCount; colIndex++) {
        return null;
            }
                    } catch (Exception e) {
                            try (DBCResultSet dbResults = dbStat.openResultSet()) {
            return;
        } catch (Exception e) {
        List<MapQueryInfo> mapQueryInfos = mapQueries.get(dashboard.getDataSourceContainer());

    private void fetchDashboardData(DashboardItemContainer dashboardContainer, DBCResultSet dbResults) throws DBCException {
 * DBeaver - Universal Database Manager
                continue;
        if (dashboard.getMapQuery() != null) {
            } else {
                }
        DBCExecutionContext executionContext = view.getExecutionContext();
                Object result = dashboard.getMapFormula().evaluate(context);
                continue;

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;
                    if (!ArrayUtils.isEmpty(mapLabels)) {
                    }
        if (executionContext == null) {
                for (Map.Entry<String, Object> me : mapValue.entrySet()) {
                dataset.addRow(new DashboardDatasetRow(timestamp, mapValues));
                break;
                    try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, query.getQueryText(), false, false, false)) {
                        dashboard.disableAutoUpdate();
                List<MapQueryInfo> queryList = mapQueries.computeIfAbsent(
    private DashboardDataset transposeDataset(DashboardDataset dataset) {
            DashboardDatasetRow oldRow = oldRows.get(i);
        }
            Object[] values = new Object[colNames.size()];
        }
    private void updateDashboards(@NotNull DBRProgressMonitor monitor, @NotNull List<DashboardItemContainer> dashboards) {

                    queryList.add(new MapQueryInfo(dashboard, dashboard.getGroup().getView(), mapQuery));
import org.jkiss.dbeaver.model.exec.*;
        // Column names don't matter. Get everything from rows.
                    if (value instanceof Number number) {

                if (timestamp == null) {

                        if (!mqi.dashboard.isAutoUpdateEnabled()) {
            newDataset.addRow(newRow);
                    return mqi;
            if (mapQuery != null) {
            }
            colNamesFromRows.add(CommonUtils.toString(oldRow.getValues()[0], String.valueOf(i + 1)));
                timestamp = (Date) dbResults.getAttributeValue(tsColName);
}        if (mapQueryInfos != null) {
            if (dataSource == null) {
        boolean pauseDashboardUpdate = true;

            }
                    log.debug("Wrong expression result: " + result);
     * @return true if need pause to update dashboard, false if not
                }
                if (!found) {
        for (DashboardDatasetRow newRow : newRows) {
        }
                    @Override
                    }
                }
import org.jkiss.dbeaver.ui.dashboard.model.DashboardGroupContainer;
        long currentTime = System.currentTimeMillis();
                    DashboardDataset dataset = new DashboardDataset(new String[]{ columnName });
                    }
                        return name.equals("object") || name.equals("dashboard");
                timestamp = new Date();
        DashboardListViewer viewManager = view.getDashboardListViewer();
                    for (MapQueryInfo mqi : mqEntry.getValue()) {
        if (mqi == null) {
                        found = true;
        String tsColName = null;
                    newRows[colIndex - 1] = newRow;
        DashboardDatasetRow[] newRows = new DashboardDatasetRow[oldColumnCount - 1];
 * you may not use this file except in compliance with the License.
                        } else if (name.equals("dashboard")) {
        List<DashboardItemContainer> dashboards = new ArrayList<>();
        switch (dashboardContainer.getItemDescriptor().getFetchType()) {
                        while (dbResults.nextRow()) {
        return newDataset;
        Map<String, Object> mapValue = mqi.mapValue;
        for (Map.Entry<DBPDataSourceContainer, List<MapQueryInfo>> mqEntry : mapQueries.entrySet()) {
            session.enableLogging(false);
    private final Map<DBPDataSourceContainer, List<MapQueryInfo>> mapQueries = new HashMap<>();
        // First column in row is actually column name. The rest are row values (usually 1)
                    mapLabels = mapKeys;
 * Licensed under the Apache License, Version 2.0 (the "License");
            for (DashboardItemContainer dashboardContainer : group.getItems()) {
        for (DBCAttributeMetaData rsAttr : rsAttrs) {
                            return dashboard;
            }
import org.jkiss.dbeaver.model.dashboard.DBDashboardMapQuery;
import org.jkiss.dbeaver.model.dashboard.DBDashboardDataType;
    private static class MapQueryInfo {
import java.lang.reflect.InvocationTargetException;
 *
                            }
                Object[] mapValues = new Object[mapKeys.length];
            return;
                dashboard.updateDashboardData(dataset);
                if (lastUpdateTime == null || (currentTime - lastUpdateTime.getTime()) >= dashboardContainer.getUpdatePeriod()) {
        }
            dataset.addRow(new DashboardDatasetRow(timestamp, values));
import org.jkiss.utils.CommonUtils;
    public DashboardUpdater() {
            }
                        log.warn("Set is not implemented in DBX model");
                    }
    }
        List<? extends DBCAttributeMetaData> rsAttrs = meta.getAttributes();
        int oldColumnCount = dataset.getColumnNames().length;

                // FIXME: we can't switch to auto-commit because connection may be used by another tasks (e.g. SQL editor)
            try {
        if (mapValue != null) {

        Date oldTimestamp = oldRows.get(0).getTimestamp();
        }
                boolean found = false;
            if (dataset.getRows().size() >= dashboardContainer.getDashboardMaxItems()) {
                    }
    public boolean getDashboardsToUpdate(List<DashboardItemContainer> dashboards) {
            }
                if (revertTxn) {
                        columnName = mapLabels[0];
                        }
                            mqi.dashboard.disableAutoUpdate();
                    if (view.getId().equalsIgnoreCase(DataSourceDashboardView.VIEW_ID)) {
    }
    }
        }
                    }
        private final DBDashboardMapQuery mapQuery;
    }

     * 
    }
import java.util.*;
import org.eclipse.ui.*;
        return viewManager != null && viewManager.getDataSourceContainer().isConnected();
                }
    }
        }
        List<String> colNames = new ArrayList<>();
            throw new DBCException("Error reading map query data", e);
                            Object mapValue = dbResults.getAttributeValue(1);
        }
                }
            return;
        List<String> colNamesFromRows = new ArrayList<>();
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
            boolean revertTxn = false;
            }
                    } else {
            monitor, DBCExecutionPurpose.UTIL, "Read dashboard '" + dashboard.getItemDescriptor().getName() + "' data")) {
            return;
            } finally {
        }
    private static final Log log = Log.getLog(DashboardUpdater.class);
                    dashboard.updateDashboardData(dataset);
                    Number numValue;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
            } catch (DBException e) {
            session.enableLogging(false);
import org.jkiss.dbeaver.model.dashboard.DBDashboardQuery;


        }
import org.jkiss.dbeaver.model.DBPDataSource;
            DBPDataSource dataSource = dsContainer.getDataSource();

            try {
                            mqInfo.mapValue.put(mapKey, mapValue);
                }
                    dashboard.getDataSourceContainer(), k -> new ArrayList<>());
import org.apache.commons.jexl3.JexlContext;
    }
                if (dashboardContainer.getItemDescriptor().getDataType() == DBDashboardDataType.provided) {
            monitor.subTask("Read dashboard data");
        monitor.beginTask("Update dashboards", dashboards.size());
                    mapValues[i] = numValue;
                            getViewDashboards(dv, dashboards);
                if (mqi.mapQuery == dashboard.getMapQuery()) {
        public MapQueryInfo(DashboardItemContainer dashboard, DashboardContainer viewContainer, DBDashboardMapQuery mapQuery) {
        }
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
                }

                        throw new InvocationTargetException(e);
        if (oldColumnCount < 2) {
                }
                    timestamp = new Date();
            // Something went wrong
            }
            if (CommonUtils.isEmpty(colName)) {
        }
            for (MapQueryInfo mqi : mapQueryInfos) {
        }
                            readMapQueryData(monitor, mqi);
                        if (dbStat.executeStatement()) {
        private final DashboardItemContainer dashboard;
    private void getViewDashboards(DataSourceDashboardView view, List<DashboardItemContainer> dashboards) {
            if (tsColName != null) {
                }
                }
                            String mapKey = CommonUtils.toString(dbResults.getAttributeValue(0));
    private void updateDashboard(DBRProgressMonitor monitor, DashboardItemContainer dashboard) throws DBCException {
    public boolean updateDashboards(@NotNull DBRProgressMonitor monitor) {
                            pauseDashboardUpdate = false;
        public Date timestamp;
        private final DashboardContainer viewContainer;

                values[i] = dbResults.getAttributeValue(colNames.get(i));
                });
        List<? extends DBDashboardQuery> queries = dashboard.getQueryList();
        for (DashboardGroupContainer group : viewManager.getGroups()) {
        }
                dataset = transposeDataset(dataset);
            for (int i = 0; i < colNames.size(); i++) {
                if (newRow == null) {
                        }
                });
        }

        }
        for (DashboardItemContainer dashboard : dashboards) {

                        }
                Date lastUpdateTime = dashboardContainer.getLastUpdateTime();
                }
            } catch (DBException e) {
                Date timestamp = mqi.timestamp;

        try (DBCSession session = executionContext.openSession(
            if (!dashboard.isAutoUpdateEnabled()) {
        if (executionContext == null) {
        List<DashboardDatasetRow> oldRows = dataset.getRows();
                Map<String, Object> ciMap = new HashMap<>(mapValue.size());
import org.jkiss.dbeaver.ui.dashboard.control.DashboardListViewer;
                log.debug("Error reading dashboard '" + dashboard.getItemDescriptor().getId() + "' data: " + CommonUtils.getRootCause(e).getMessage());
                        IWorkbenchPart part = view.getPart(false);
        return false;
                        numValue = CommonUtils.toDouble(value);
            } else {
        }
                        mqInfo.timestamp = new Date();
                colNames.add(colName);
                        }
     */
    }
    private MapQueryInfo getMapQueryData(DashboardItemContainer dashboard) {
import org.jkiss.dbeaver.model.dashboard.data.DashboardDataset;
                    txnManager.setAutoCommit(monitor, true);
    private void fetchDashboardMapData(DBRProgressMonitor monitor, DashboardItemContainer dashboard) {
                    String columnName = dashboard.getItemDescriptor().getName();
            return true;
                };
                        }
                }
 *
                                }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    dataset.addRow(new DashboardDatasetRow(new Date(), new Object[] { result } ));
        DBCResultSetMetaData meta = dbResults.getMeta();
        DashboardListViewer viewManager = view.getDashboardListViewer();
    
                }
        if (!dashboard.getDataSourceContainer().isConnected() || DBWorkbench.getPlatform().isShuttingDown()) {
            this.viewContainer = viewContainer;
