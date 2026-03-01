            }
            if (CommonUtils.isEmpty(dashboardId) && CommonUtils.isEmpty(projectName)) {
                // Legacy, backward compatibility
        super();
                    projectName = idParts[0];
            dashboardListViewer.dispose();
import org.jkiss.dbeaver.Log;
            if (dataSourceContainer != null) {
        return configuration == null ? null : configuration.getDataSourceContainer();
    }
                        continue;
            DBWorkbench.getPlatformUI().showError(
            String projectName = null;
                    dashboardId = DashboardConfigurationList.DEFAULT_DASHBOARD_ID;
        if (dashboardListViewer != null) {
 *
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
            case OBJECT_UPDATE:
                UIDashboardMessages.error_dashboard_view_cannot_open_title,
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                String[] params = secondaryId.substring(DashboardConfiguration.REF_PREFIX.length()).split(",");
        try {
    }
                }
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
public class DataSourceDashboardView extends ViewPart implements DashboardViewer, DBPDataSourceContainerProvider, DBPEventListener {
    public static DataSourceDashboardView openView(
    @Override
                project = dataSourceContainer.getProject();
        return null;
            case OBJECT_REMOVE:
    public void updateStatus() {
 *
    }
                }
    @Override
        }
                dashboardListViewer.createDashboardsFromConfiguration();
            String secondaryId = getViewSite().getSecondaryId();
                break;

 *     http://www.apache.org/licenses/LICENSE-2.0


        super.saveState(memento);


                    if (divPos < 0) {
        super.dispose();
            if (dataSourceContainer != null) {
    @Override
        UIExecutionQueue.queueExec(() -> createDashboardControls(parent));
            }
            log.error("Error initializing dashboard view", e);

import org.jkiss.code.NotNull;
        }





 * DBeaver - Universal Database Manager
                    group.selectItem(items.get(0));

                project = DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
        return dashboardListViewer;

                DashboardConfiguration.getViewId(project, dataSourceContainer, id),
import org.jkiss.dbeaver.ui.UIUtils;
                if (idParts.length == 1) {
/*
        if (dashboardListViewer != null) {
                dashboardListViewer.createControl(parent);
                    datasourceId = idParts[0];
    public void createPartControl(Composite parent) {
    }
                    int divPos = param.indexOf("=");
            } else {
                DataSourceDashboardView.VIEW_ID,

    private void createDashboardControls(Composite parent) {
            return;
import org.eclipse.ui.*;
                configurationList = new DashboardConfigurationList(dataSourceContainer);
    public static final String VIEW_ID = "org.jkiss.dbeaver.ui.dashboardView";
                }
    @Override
            }
                if (configuration == null) {
                if (datasourceId == null) {
    }
                configuration = configurationList.getDashboard(dashboardId);
    public DataSourceDashboardView() {
            } else {

import org.jkiss.code.Nullable;

    }
    }
        if (event.getObject() != dataSourceContainer) {
    private DBPDataSourceContainer dataSourceContainer;
    public void handleDataSourceEvent(@NotNull DBPEvent event) {
        @NotNull IWorkbenchWindow workbenchWindow,

 * Unless required by applicable law or agreed to in writing, software
                }
import org.eclipse.ui.part.ViewPart;
                if (CommonUtils.isEmpty(dashboardId)) {
import org.eclipse.swt.widgets.Composite;
                for (String param : params) {

                    dataSourceContainer = project.getDataSourceRegistry().getDataSource(datasourceId);
                        param.substring(0, divPos),
            if (dataSourceContainer != null) {
            dashboardId = null;
                partName = project.getName() + ":" + dashboardId;
                        case project -> projectName = value;
    public void init(IViewSite site) throws PartInitException {
        }
                        null);
        }
                IWorkbenchPage.VIEW_ACTIVATE);

    }
        return configurationList;
            }
                    }
        } catch (PartInitException e) {
                List<? extends DashboardItemContainer> items = group.getItems();
        } catch (Throwable e) {
                configurationList.checkDefaultDashboardExistence();
            if (secondaryId.startsWith(DashboardConfiguration.REF_PREFIX)) {
                    }
                String[] idParts = secondaryId.split("/");
            }
    private String dashboardId;
                DashboardUpdateJob.getDefault().resumeDashboardUpdate();
        switch (event.getAction()) {
        }
        if (dataSourceContainer != null) {
            if (CommonUtils.isEmpty(secondaryId)) {
        }

                    throw new IllegalStateException("Invalid datasource ID: " + datasourceId);
            }

        if (configuration == null) {
    private DBPProject project;
            parent.layout(true, true);
    @Override

    private DashboardListViewer dashboardListViewer;
                    throw new IllegalStateException("Invalid project name: " + projectName);
import org.jkiss.dbeaver.runtime.DBWorkbench;

        }
        return configuration;
                    datasourceId = idParts[1];

        } else {
        }
            } else {
                if (!CommonUtils.isEmpty(datasourceId)) {
                    switch (dp) {
                        log.debug("Invalid dashboard parameter '" + param + "'");
    private DashboardConfigurationList configurationList;
                        DashboardConfiguration.Parameter.class,
                throw new IllegalStateException("Dashboard view requires active database connection");

                }
                partName = dataSourceContainer.getName() + (dataSourceContainer.isConnected() ? "" : UIDashboardMessages.dashboard_view_status_off);
                dataSourceContainer.getRegistry().removeDataSourceListener(this);
                }
    @Override
import org.jkiss.dbeaver.model.*;
            String datasourceId = null;
                updateStatus();

                    String value = param.substring(divPos + 1);
package org.jkiss.dbeaver.ui.dashboard.view;
            if (group != null) {
            DashboardGroupContainer group = dashboardListViewer.getDefaultGroup();
            } else {
            if (CommonUtils.isEmpty(projectName)) {
                        case id -> dashboardId = value;
                    dashboardId = configurationList.getDashboards().get(0).getDashboardId();
            return (DataSourceDashboardView) workbenchWindow.getActivePage().showView(
            setTitleToolTip("Connection: " + dataSourceContainer.getName() + " (" + dataSourceContainer.getDriver().getFullName() + ")");
    static protected final Log log = Log.getLog(DataSourceDashboardView.class);
 */
    public DBPDataSourceContainer getDataSourceContainer() {
            }
            partName = configuration.getDashboardName();
    @Override


        UIUtils.syncExec(() -> setPartName(partName));
            }
            dashboardListViewer = null;

                    configuration = configurationList.getDashboard(dashboardId);
    public void setFocus() {
    }
import org.jkiss.dbeaver.ui.controls.ProgressPainter;

                }
    }
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.ui.UIExecutionQueue;
        ProgressPainter dashboardProgressPainter = new ProgressPainter(parent);

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                updateStatus();
 * You may obtain a copy of the License at

                UIDashboardMessages.error_dashboard_view_cannot_open_msg,
                dashboardListViewer = new DashboardListViewer(getSite(), this, configurationList, configuration);
                if (!items.isEmpty()) {
            dashboardProgressPainter.close();
                } else {
                        case datasource -> datasourceId = value;
    public DashboardConfiguration getConfiguration() {
        @Nullable String id) {
 *
        @NotNull DBPProject project,
                throw new IllegalStateException("Bad dashboard view ID: " + secondaryId);
        super.init(site);
                    DashboardConfiguration.Parameter dp = CommonUtils.valueOf(
                getSite().setSelectionProvider(dashboardListViewer);
    public DashboardListViewer getDashboardListViewer() {
            }
        try {
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.ui.dashboard.control.DashboardListViewer;
                dataSourceContainer.getRegistry().addDataSourceListener(this);
                }
                e);
    public DashboardConfigurationList getConfigurationList() {
            return;
    }
    public void dispose() {
 * you may not use this file except in compliance with the License.
    }
        if (dataSourceContainer != null) {
        }
        String partName;

            if (dataSourceContainer.isConnected()) {
        }
                if (project == null) {


    }
}
import org.jkiss.utils.CommonUtils;
    private DashboardConfiguration configuration;
                dataSourceContainer = DBUtils.findDataSource(null, datasourceId);
 * See the License for the specific language governing permissions and
        @Nullable DBPDataSourceContainer dataSourceContainer,
import java.util.List;
import org.jkiss.dbeaver.ui.dashboard.model.*;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void saveState(IMemento memento) {
        if (DashboardConfigurationList.DEFAULT_DASHBOARD_NAME.equals(configuration.getDashboardName())) {
                UIUtils.asyncExec(this::updateStatus);
