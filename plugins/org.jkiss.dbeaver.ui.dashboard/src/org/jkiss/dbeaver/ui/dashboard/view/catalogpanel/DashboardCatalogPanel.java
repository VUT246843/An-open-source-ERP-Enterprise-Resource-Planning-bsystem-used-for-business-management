        setLayout(layout);
            ISelection selection = dashboardTable.getSelection();
                    event.data = dragItem.getText();
        @NotNull DBPProject project,

        @NotNull Composite parent,
import org.jkiss.dbeaver.model.app.DBPProject;
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ui.dashboard.registry.DashboardRendererDescriptor;

                    dragImage = null;
            style |= SWT.BORDER;
                    }

                    return;

                }
                Rectangle columnBounds = dragItem.getBounds();
 * limitations under the License.
        GridData gd = new GridData(GridData.FILL_BOTH);
                        cell.setText(dpd.getName());
 * Licensed under the Apache License, Version 2.0 (the "License");
                gc.dispose();
                dragImage = new Image(Display.getCurrent(), columnBounds.width, columnBounds.height);
            }
        super(parent, SWT.NONE);
                    selectedDashboard = null;
                        cell.setText(folder.getName());
    public void handleItemDelete(@NotNull DashboardItemConfiguration item) {

            }
    }
    public DashboardCatalogPanel(
                final String dbmsName = dataSourceContainer == null ?
 *
        });

                UIUtils.drawMessageOverControl(table, e, msg, 0);
                    }
                            }
import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;
            if ((dashboardTable.getStructuredSelection().getFirstElement() instanceof DashboardItemConfiguration)) {
}        }
        table.setLayoutData(gd);

                        DBPImage icon = folder.getIcon();
import org.eclipse.osgi.util.NLS;

            }
        table.setHeaderVisible(true);
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemConfigurationTransfer;
            addDragAndDropSupport(table);
                        DBPImage icon = null;
import org.jkiss.utils.CommonUtils;
                event.image = dragImage;
                } else {
                }
            private Image dragImage;
    }
            handleChartSelected();
        // Add listeners
import org.eclipse.swt.widgets.Tree;
        final DragSource source = new DragSource(table, DND.DROP_MOVE);
    }

            dataSourceContainer);
        dashboardTable.setInput(dbProviders);
                    selectedDashboard = dd;
    private final DBPProject project;
                    } else {
            @Override
        return project;
                dragItem = table.getItem(point);
                final String msg = NLS.bind(UIDashboardMessages.dialog_add_dashboard_message_no_more_dashboards_for, dbmsName);
            if (selection instanceof IStructuredSelection ss) {
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.Log;
    @Override
import org.jkiss.dbeaver.model.DBIcon;
import java.util.List;
 */
                if (dragImage != null) {
        source.addDragListener (new DragSourceListener() {
            public void dragFinished(DragSourceEvent event) {

                Point point = table.toControl(table.getDisplay().getCursorLocation());

import org.jkiss.dbeaver.model.dashboard.registry.DashboardProviderDescriptor;
        this.dataSourceContainer = dataSourceContainer;
    private void refreshInput() {
            public void dragStart(DragSourceEvent event) {
import org.eclipse.swt.dnd.*;
    public DBPProject getProject() {
 * Dashboard add dialog
    private final TreeViewer dashboardTable;
 * You may obtain a copy of the License at
        }
                    if (cell.getColumnIndex() == 0) {
import org.eclipse.swt.layout.GridData;
            if (table.getItemCount() == 0) {
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
                        }
                } else {
            }
import org.jkiss.code.NotNull;
 *
                        cell.setText(CommonUtils.notEmpty(dpd.getDescription()));

    }
                            if (viewType != null) {
import org.eclipse.swt.graphics.Rectangle;
    public DBPDataSourceContainer getDataSourceContainer() {
                } else if (cell.getElement() instanceof DashboardItemConfiguration dashboardDescriptor) {
                    }

/*
        dashboardTable.addSelectionChangedListener(event -> {
    public void handleItemCreate(@NotNull DashboardItemConfiguration item) {
                    columnBounds.x,

        dashboardTable.setLabelProvider(new CellLabelProvider() {
        return dataSourceContainer;
            }
        @Nullable Function<DashboardItemConfiguration, Boolean> itemFilter,
            public void dragSetData (DragSourceEvent event) {
                if (dragItem == null || !(dragItem.getData() instanceof DashboardItemConfiguration)) {
    }
    private final DBPDataSourceContainer dataSourceContainer;

        });
                    } else {
        if (isFlat) {
        dashboardTable.setContentProvider(new DashboardCatalogPanelTreeContentProvider(dataSourceContainer, project,
                    dragImage.dispose();
 *
                if (ss.getFirstElement() instanceof DashboardItemConfiguration dd) {
        UIUtils.asyncExec(() -> UIUtils.packColumns(table, true, null));
                    event.data = dashboardDescriptor;
 */
                    if (cell.getColumnIndex() == 0) {
                        cell.setImage(DBeaverIcons.getImage(icon));
        });
                } else if (cell.getElement() instanceof DBDashboardFolder folder) {
import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistryListener;
                ) {
 * you may not use this file except in compliance with the License.
                            cell.setImage(DBeaverIcons.getImage(icon));
        refreshInput();
 * DBeaver - Universal Database Manager
        if (isFlat) {
        Tree table = dashboardTable.getTree();
                    } else {
            layout.marginHeight = 0;
                    dragImage.dispose();
                if (dragItem.getData() instanceof DashboardItemConfiguration dashboardDescriptor &&
                    columnBounds.y);
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;

import org.jkiss.dbeaver.model.DBPImage;
        DashboardRegistry.getInstance().addListener(this);
 * See the License for the specific language governing permissions and
        if (!isFlat) {

import org.eclipse.swt.graphics.GC;
                }
import org.eclipse.swt.layout.GridLayout;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    DashboardItemConfigurationTransfer.INSTANCE.isSupportedType(event.dataType)
                            DashboardRendererDescriptor viewType = DashboardUIRegistry.getInstance().getViewType(dashboardDescriptor.getDashboardRenderer());
public abstract class DashboardCatalogPanel extends Composite implements DashboardRegistryListener {
        this.project = project;
 *     http://www.apache.org/licenses/LICENSE-2.0
            public void update(ViewerCell cell) {
import org.eclipse.swt.SWT;

        dashboardTable.addDoubleClickListener(event -> {
                        } else {
                }
        dashboardTable.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
    @Override
                }
import org.jkiss.dbeaver.model.dashboard.DBDashboardFolder;

        dashboardTable = new TreeViewer(this, style);
        return selectedDashboard;
    private static final Log log = Log.getLog(DashboardCatalogPanel.class);
import java.util.function.Function;
                        if (icon != null) {
        boolean isFlat) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        UIUtils.createTreeColumn(table, SWT.LEFT, UIDashboardMessages.dialog_add_dashboard_column_description);
        });
import org.eclipse.swt.graphics.Point;
                    dragImage = null;

        refreshInput();
        List<DashboardProviderDescriptor> dbProviders = DashboardRegistry.getInstance().getDashboardProviders(
                        if (icon == null) {
    public DashboardItemConfiguration getSelectedDashboard() {

import org.eclipse.swt.widgets.TreeItem;
    private DashboardItemConfiguration selectedDashboard;
        gd.heightHint = 200;
                        cell.setText(dashboardDescriptor.getName());
                                icon = viewType.getIcon();
            itemFilter));
                if (dragImage != null) {
        dashboardTable.expandToLevel(2);
                            icon = DBIcon.TYPE_OBJECT;
        gd.widthHint = 400;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
    protected abstract void handleChartSelectedFinal();
import org.eclipse.jface.viewers.*;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;
                gc.copyArea(
    @Nullable
            @Override
        int style = SWT.FULL_SELECTION;
                        cell.setText(CommonUtils.notEmpty(dashboardDescriptor.getDescription()));
        });
                if (cell.getElement() instanceof DashboardProviderDescriptor dpd) {
                        }
        table.addPaintListener(e -> {
import org.eclipse.swt.graphics.Image;
/**
    }
                        cell.setImage(DBeaverIcons.getImage(dpd.getIcon()));
                    dragImage,
        refreshInput();
    }
                    project.getName() : dataSourceContainer.getDriver().getName();
                        }
    @NotNull
                handleChartSelectedFinal();
package org.jkiss.dbeaver.ui.dashboard.view.catalogpanel;
        GridLayout layout = new GridLayout(1, false);
                GC gc = new GC(table);
    }

    @Nullable
        @Nullable DBPDataSourceContainer dataSourceContainer,
        UIUtils.createTreeColumn(table, SWT.LEFT, UIDashboardMessages.dialog_add_dashboard_column_name);
                    if (cell.getColumnIndex() == 0) {
    @NotNull
            private TreeItem dragItem;


            @Override
                        cell.setText(CommonUtils.notEmpty(folder.getDescription()));
            @Override
                        if (dashboardDescriptor.isCustom()) {
            }
import org.jkiss.dbeaver.ui.DBeaverIcons;
    private static void addDragAndDropSupport(Tree table) {
                            icon = DBIcon.TREE_FOLDER;

    protected abstract void handleChartSelected();
        addDisposeListener(e -> DashboardRegistry.getInstance().removeListener(this));
            layout.marginWidth = 0;
        source.setTransfer(TextTransfer.getInstance(), DashboardItemConfigurationTransfer.INSTANCE);
                }


