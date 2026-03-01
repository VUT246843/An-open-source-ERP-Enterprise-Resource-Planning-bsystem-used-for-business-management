    @Override

import java.util.List;
    }
        @NotNull DashboardConfigurationList configuration,
//        statusLabel.setImage(DBeaverIcons.getImage(dataSourceContainer.getDriver().getIcon()));
        return dashContainer;
            viewConfiguration.getProject(),
    public boolean isVisible() {
            isolatedContext = null;
            dashDivider.setMaximizedControl(null);
                dashContainer.addItem(getSelectedDashboard());
            @Override
        DBPDataSource dataSource = dataSourceContainer.getDataSource();
 * you may not use this file except in compliance with the License.

        if (viewConfiguration.getDashboardItemConfigs().isEmpty()) {
    public void showChartCatalog() {
import org.eclipse.swt.widgets.Composite;

    public void setSingleChartMode(boolean singleChartMode) {
        if (context != null) {
    @Override
        };
        new AbstractJob("Open connection for dashboard") {
            DashboardViewItem item = doFindItem(l.get(0));



    }
        }

                dashContainer.setSelection(item);
            dashDivider.setMaximizedControl(null);

                openSeparateContext();
    @NotNull
        if (viewConfiguration.isOpenConnectionOnActivate()) {
        }
            protected void handleChartSelected() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.*;
        DashboardViewItem selectedItem = dashContainer.getSelectedItem();
        this.site = site;
    @Override

import org.eclipse.core.runtime.Status;
    }
                        return GeneralUtils.makeExceptionStatus(e);

import org.eclipse.ui.IWorkbenchPart;
            true) {
    }
        isCatalogPanelVisible = false;

            }
    }
            }
    protected void internalRefresh(Object element) {
        }

     */
        }
    @Override
    public DashboardGroupContainer getDefaultGroup() {
    }
    protected void setSelectionToWidget(List l, boolean reveal) {

    private final DashboardConfiguration viewConfiguration;
        catalogPanel = new DashboardCatalogPanel(
import java.util.function.Consumer;
    }
    public DashboardConfigurationList getConfiguration() {
        } else {
                if (serviceConnections != null) {
    public void createDashboardsFromConfiguration() {
        return site;
        this.viewConfiguration = viewConfiguration;
    });
 *
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        dashContainer.createDefaultDashboards();
    public void hideChartCatalog() {
    }
    @Override
        dashContainer.clear();
//        String status = dataSourceContainer.isConnected() ? "connected (" + dataSourceContainer.getConnectTime() + ")" : "disconnected";
    protected DashboardViewItem doFindItem(Object element) {
import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;
    public List<? extends DashboardGroupContainer> getGroups() {
                DBUtils.closeSafely(context);
        return dashContainer;
    public void dispose() {
        if (dashDivider.getMaximizedControl() != null) {
        DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
import org.jkiss.dbeaver.model.struct.DBSInstance;
    }
import org.eclipse.jface.viewers.*;

    public void reveal(Object element) {
                DBSInstance instance = DBUtils.getObjectOwnerInstance(dataSource);
        this.singleChartMode = singleChartMode;
import org.jkiss.code.NotNull;
    public DBPDataSourceContainer getDataSourceContainer() {
    private volatile boolean useSeparateConnection;
    /**
        updateStatus();
    @Override
                //enableButton(IDialogConstants.OK_ID, getSelectedDashboard() != null);
            return;
    }
        DBCExecutionContext context = isolatedContext;
    private final Consumer<Object> dashboardsConfigChangedListener = a -> UIUtils.asyncExec(() -> {
        if (useSeparateConnection && isolatedContext != null) {
        this.configuration = configuration;
    private SashForm dashDivider;
                if (instance != null) {
        }

 * You may obtain a copy of the License at
    @NotNull

        }


                        }
            configuration.saveConfiguration();

            return;
    @Override
            WorkspaceConfigEventManager.addConfigChangedListener(DashboardRegistry.CONFIG_FILE_NAME, dashboardsConfigChangedListener); 
    public IWorkbenchSite getWorkbenchSite() {
    public void saveChanges() {
import org.eclipse.core.runtime.IStatus;
        @NotNull DashboardConfiguration viewConfiguration
import org.eclipse.ui.IWorkbenchSite;
/*
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private DashboardListControl dashContainer;
//        statusLabel.setText(this.dataSourceContainer.getName() + ": " + status);
        }.schedule();
            @Override
    @NotNull
    private final DashboardConfigurationList configuration;
        if (dashDivider.getMaximizedControl() != null) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return null;
    }
    private boolean isCatalogPanelVisible;
    protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
    @Override

            return isolatedContext;
        if (viewConfiguration.getDashboardItemConfigs().isEmpty()) {

    @Override
    }
    @Nullable

            item -> viewConfiguration.getItemConfig(item.getId()) != null,
        return dashContainer == null ? Collections.emptyList() : Collections.singletonList(dashContainer);
 * distributed under the License is distributed on an "AS IS" BASIS,


    @NotNull
public class DashboardListViewer extends StructuredViewer implements DBPDataSourceContainerProvider, DashboardContainer {
    }
        return configuration.getDataSourceContainer();
        return selectedItem == null ? new StructuredSelection() : new StructuredSelection(selectedItem);
        if (l.isEmpty()) {
    @Override
            }
            dashDivider,
    @Override
                }
    @Nullable
 *
    }
        fireSelectionChanged(new SelectionChangedEvent(this, getSelection()));
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
        }
    }
                }
    }
    }
        DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();

    private void initConnection() {
import org.eclipse.swt.widgets.Widget;
        if (item != null) {
            }

     * Gets visibility flag 
    @Override
    public DashboardConfiguration getViewConfiguration() {

        dashContainer.setRedraw(false);
        }
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    public ISelection getSelection() {
    private void updateStatus() {
 * DBeaver - Universal Database Manager
        return DBUtils.getDefaultContext(dataSourceContainer.getDataSource().getDefaultInstance(), true);

            if (dataSourceContainer != null && !dataSourceContainer.isConnected()) {
        return isCatalogPanelVisible;
            dashContainer.showItem(item);
    @Override
        }
        catalogPanel.setFocus();
         isCatalogPanelVisible = true;

            if (item != null) {
            DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
    public void updateSelection() {
        dashContainer = new DashboardListControl(site, dashDivider, this);
    @Override
        } else if (dashDivider.getWeights()[1] == 0) {
    @Override
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DashboardListViewer(
import org.jkiss.dbeaver.DBException;
        return null;
                    try {
    }

    @NotNull
        DashboardItemContainer item = doFindItem(element);
        this.part = part;
    }
                return Status.OK_STATUS;


    private void openSeparateContext() {
    }
    @NotNull

    private volatile DBCExecutionContext isolatedContext;
        initConnection();


    public IWorkbenchPart getWorkbenchPart() {
    public DBCExecutionContext getExecutionContext() {
package org.jkiss.dbeaver.ui.dashboard.control;
    }
    private final IWorkbenchSite site;
            protected void handleChartSelectedFinal() {
import org.jkiss.dbeaver.ui.UIUtils;
    }
        dashDivider = UIUtils.createPartDivider(part, parent, SWT.HORIZONTAL);
        @NotNull IWorkbenchSite site,
            @NotNull
 * limitations under the License.
    public Control getControl() {
    @Override
        dashDivider.setMaximizedControl(dashContainer);
    @Override
            openSeparateContext();
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
    private DashboardCatalogPanel catalogPanel;
        if (dataSource == null) {
        if (dataSourceContainer == null) {
            dashDivider.setWeights(100, 0);


    }
        } else {
    public void createControl(Composite parent) {
        dashContainer.layout(true, true);

import org.eclipse.swt.custom.SashForm;
                    serviceConnections.connectDataSource(dataSourceContainer, status -> {
            viewConfiguration.getDataSourceContainer(),
        }
    }
    }
            } else if (useSeparateConnection) {
        return getStructuredSelection();

            dashContainer.createDefaultDashboards();
    @Override
        } else {
import java.io.IOException;
    private boolean singleChartMode;
        WorkspaceConfigEventManager.removeConfigChangedListener(DashboardRegistry.CONFIG_FILE_NAME, dashboardsConfigChangedListener);

    protected List<?> getSelectionFromWidget() {
            DBWorkbench.getPlatformUI().showError("Save error", null, e);
import org.eclipse.swt.widgets.Control;
            dashDivider.setWeights(650, 350);
        }
    public boolean isSingleChartMode() {
        return part;
        return null;


            dashContainer.createDashboardsFromConfiguration();
    }
    ) {

import org.jkiss.dbeaver.ui.dashboard.view.catalogpanel.DashboardCatalogPanel;

            @Override
        return configuration;
    @Override
import org.jkiss.code.Nullable;
        return singleChartMode;
        @Nullable IWorkbenchPart part,
            }
        return selectedItem == null ? Collections.emptyList() : Collections.singletonList(selectedItem);
        DashboardItemContainer selectedItem = dashContainer.getSelectedItem();
        } else if (useSeparateConnection) {
        if (dataSourceContainer == null) {
 *
                            openSeparateContext();

    }
import org.jkiss.dbeaver.ui.dashboard.model.*;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 */


    @Nullable
    }
        }
        useSeparateConnection = viewConfiguration.isUseSeparateConnection();
                        if (useSeparateConnection) {
        return viewConfiguration;

    @Override
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    protected DashboardViewItem doFindInputItem(Object element) {
    //private CLabel statusLabel;
                    });
import org.eclipse.swt.SWT;
            dashDivider.setMaximizedControl(null);
                        isolatedContext = instance.openIsolatedContext(monitor, "Dashboard connection", null);
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (IOException e) {
            }
import java.util.Collections;
        dashContainer.setRedraw(true);
            if (context.isConnected()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
            dashContainer.setSelection(null);
        }
}
    @Nullable

    private final IWorkbenchPart part;
    }

        dashDivider.setWeights(650, 350);
    public IStructuredSelection getStructuredSelection() {
                    } catch (DBException e) {
                UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
    }
