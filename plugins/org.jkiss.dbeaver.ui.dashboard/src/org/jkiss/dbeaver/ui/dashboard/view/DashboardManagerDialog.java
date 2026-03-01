                    }
        }

                    }
                        result = DashboardRegistry.getInstance().getDashboardItems(
                newChartButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Composite group = UIUtils.createPlaceholder(dialogArea, 2);
    private Button deleteButton;
                @Override
            setReturnCode(OK);
    private Button copyButton;
    }
            setViewerInput();
                if (selectedDashboard != null) {
            } else {
 * Unless required by applicable law or agreed to in writing, software

    @Override
    }
import org.jkiss.dbeaver.model.DBPNamedObject;
            copyButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
                        }
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridData;
                treeViewer.expandToLevel(2);
                            cell.setText(CommonUtils.notEmpty(driver.getDescription()));

            }
import org.jkiss.dbeaver.ui.UIUtils;
            });
                    deleteDashboard();
                    }
                    Object selectedObject = ss.getFirstElement();
        }
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
        getShell().setMinimumSize(300, 300);
                            driver, false);
    private void copyDashboard() {
        {
                public boolean hasChildren(Object element) {
            parent,
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
                    } else if (parentElement instanceof DashboardProviderDescriptor dpd) {
                    DBPNamedObject element = (DBPNamedObject) cell.getElement();
            }
package org.jkiss.dbeaver.ui.dashboard.view;
            super(group, SWT.BORDER);

import org.jkiss.dbeaver.model.connection.DBPDriver;
        DashboardItemConfiguration newDashboard = new DashboardItemConfiguration(
                            getDashboardProviderFor(parentMap, driver),

    private DashboardItemConfiguration selectedDashboard;
            });
                @Override
            close();
        DashboardItemConfigurationDialog editDialog = new DashboardItemConfigurationDialog(getShell(), selectedDashboard, false);
            deleteButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

                            result = DashboardRegistry.getInstance().getAllSupportedSources(dpd);
        editButton.setEnabled(selectedDashboard != null);
                this.selectedDashboard = null;
                @Override
            UIUtils.createTreeColumn(treeViewer.getTree(), SWT.LEFT, UIDashboardMessages.dialog_dashboard_manager_treecolumn_name);
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
        }
import org.eclipse.jface.dialogs.IDialogSettings;
            gd.widthHint = 300;
                        if (dpd.isDatabaseRequired()) {
                        } else if (element instanceof DashboardProviderDescriptor dpd) {
    protected void createButtonsForButtonBar(Composite parent) {
                    editDashboard();
            if (DashboardRegistry.getInstance().getDashboardItem(newDashboard.getId()) != null) {
                    if (parentElement instanceof List list) {
                        } else if (element instanceof DashboardItemConfiguration dashboardDescriptor) {
                            cell.setText(dpd.getDescription());
    private Button editButton;
                    copyDashboard();
            DashboardRegistry.getInstance().createDashboardItem(newDashboard);
 */
    }
            UIUtils.asyncExec(() -> {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.dashboard.registry.DashboardProviderDescriptor;
                    NLS.bind(UIDashboardMessages.dialog_dashboard_manager_button_new, dashboardProvider.getLabel()),

            gd.heightHint = 300;
                }
            copyButton = UIUtils.createPushButton(buttonBar, UIDashboardMessages.dialog_dashboard_manager_button_copy, null, new SelectionAdapter() {

 * you may not use this file except in compliance with the License.
                    }
        }
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
        deleteButton.setEnabled(selectedDashboard != null && selectedDashboard.isCustom());
                        result = DashboardRegistry.getInstance().getDashboardItems(
                @Override
import org.jkiss.dbeaver.model.DBIcon;
    }
                break;
                            getDashboardProviderFor(parentMap, dspd), dspd, false);
                    } else {
import org.eclipse.swt.events.SelectionAdapter;
            getShell(),
            buttonBar.setLayout(new GridLayout(1, false));
                    return !(element instanceof DashboardItemConfiguration);
    protected void buttonPressed(int buttonId) {

        }
    }
        for (int i = 2; ; i++) {
        setViewerInput();
    private static class DashboardTreeViewer extends TreeViewer {
            selectedDashboard = null;
            editButton = UIUtils.createPushButton(buttonBar, UIDashboardMessages.dialog_dashboard_manager_button_edit, null, new SelectionAdapter() {
                            cell.setImage(DBeaverIcons.getImage(dpd.getIcon()));
        if (editDialog.open() == IDialogConstants.OK_ID) {
        DashboardItemConfigurationDialog editDialog = new DashboardItemConfigurationDialog(getShell(), newDashboard, true);
import java.util.HashMap;
    }
        if (buttonId == IDialogConstants.CLOSE_ID) {
    protected Composite createDialogArea(Composite parent) {
            });

            treeViewer = new DashboardTreeViewer(group);


            UIDashboardMessages.dialog_dashboard_manager_shell_delete_title,
            List<DashboardProviderDescriptor> dashboardProviderDescriptors = DashboardRegistry.getInstance()
    private void updateButtons() {
    }
                        }
    private void setViewerInput() {
    private static final String DIALOG_ID = "DBeaver.DashboardManagerDialog";//$NON-NLS-1$
    @Override
                    } else if (parentElement instanceof DBPDriver driver) {
import org.eclipse.jface.dialogs.IDialogConstants;
        }
                    }
        }
 *
                        }
                        public void widgetSelected(SelectionEvent e) {
                                icon = DBIcon.TYPE_OBJECT;
                ISelection selection = event.getSelection();
            });
                    } else if (parentElement instanceof DBPDataSourceProviderDescriptor dspd) {
            DashboardRegistry.getInstance().getDashboardProviders());
                        }
            deleteButton = UIUtils.createPushButton(buttonBar, UIDashboardMessages.dialog_dashboard_manager_button_delete, null, new SelectionAdapter() {
import org.jkiss.dbeaver.model.DBUtils;
    }
import java.util.Map;
                            }
                                    icon = viewType.getIcon();
            });
    }
                public void widgetSelected(SelectionEvent e) {
                public Object[] getChildren(Object parentElement) {
            treeViewer.setLabelProvider(new CellLabelProvider() {
        }
        providers.removeIf(dpd -> !dpd.isSupportsCustomDashboards());


        }
                .getDashboardProvidersWithSupportCustomDashboards();
        this.updateButtons();

import org.eclipse.swt.widgets.Button;
                            if (icon != null) {
                newDashboard.setId(origId + " " + i);
                                }
                }
            refreshDashboards();
        treeViewer.setInput(providers);
                                if (viewType != null) {

import java.util.ArrayList;
                            result = DashboardRegistry.getInstance().getDashboardItems(dpd, null, false);
                    if (result == null) {
            IDialogConstants.CLOSE_ID,

    private DashboardTreeViewer treeViewer;
            GridData gd = new GridData(GridData.FILL_BOTH);
    }
        copyButton.setEnabled(selectedDashboard != null);
    private void deleteDashboard() {
import org.jkiss.dbeaver.ui.DBeaverIcons;

            treeViewer.addSelectionChangedListener(event -> {
        createButton(
                        } else if (element instanceof DBPDataSourceProviderDescriptor dspd) {
        newDashboard.setDataType(providerDescriptor.getDataType());
            refreshDashboards();
            for (DashboardProviderDescriptor dashboardProvider : dashboardProviderDescriptors) {
            });
            editButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            });
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (editDialog.open() == IDialogConstants.OK_ID) {
                        this.selectedDashboard = dd;
                            if (dashboardDescriptor.isCustom()) {
            Map<Object, Object> parentMap = new HashMap<>();
            treeViewer.setContentProvider(new TreeContentProvider() {
 *
    @Override
                        } else if (element instanceof DBPDataSourceProviderDescriptor dspd) {

                        cell.setText(element.getName());
        UIUtils.createInfoLabel(dialogArea, UIDashboardMessages.dialog_dashboard_manager_infolabel_predifined_dashboard);
                }
                    List<? extends DBPNamedObject> result = null;
            return;
                    result.sort(DBUtils.nameComparator());
            Composite buttonBar = new Composite(group, SWT.TOP);
            GridData gd = new GridData(GridData.FILL_VERTICAL);
        {
        newDashboard.setRenderer(providerDescriptor.getDefaultRenderer());
                }
    private void refreshDashboards() {
public class DashboardManagerDialog extends BaseDialog {
                        } else if (element instanceof DashboardProviderDescriptor dpd) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

        DashboardItemConfiguration newDashboard = new DashboardItemConfiguration(selectedDashboard);
            refreshDashboards();

 *     http://www.apache.org/licenses/LICENSE-2.0
            DashboardRegistry.getInstance().createDashboardItem(newDashboard);



            treeViewer.addDoubleClickListener(event -> {
import java.util.List;
                    editDashboard();
                        } else {
                this.updateButtons();
}
        String origId = newDashboard.getId();

            if (item instanceof DashboardProviderDescriptor dpd) {
                            cell.setImage(DBeaverIcons.getImage(dspd.getIcon()));
        List<DashboardProviderDescriptor> providers = new ArrayList<>(
import org.jkiss.dbeaver.model.DBPImage;
    public DashboardManagerDialog(Shell shell) {

                    if (cell.getColumnIndex() == 0) {
                    for (Object child : result) {
                            DBPImage icon = null;

        }
                                cell.setImage(DBeaverIcons.getImage(icon));
        treeViewer.expandToLevel(2);
            treeViewer.getTree().setHeaderVisible(true);
            });
            treeViewer.getControl().setLayoutData(gd);
                            } else {

import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
            //UIUtils.createTreeColumn(treeViewer.getTree(), SWT.LEFT, "Description");
        super(shell, UIDashboardMessages.dialog_dashboard_manager_title, null);
            DashboardRegistry.getInstance().removeDashboardItem(selectedDashboard);


import org.eclipse.swt.widgets.Composite;
                    null, new SelectionAdapter() {
                            }
                        @Override
        return null;
                        parentMap.put(child, parentElement);
                        result = list;
                }
    }
            NLS.bind(UIDashboardMessages.dialog_dashboard_manager_shell_delete_question, selectedDashboard.getName()))) {
                @Override
            IDialogConstants.CLOSE_LABEL,
        public DashboardTreeViewer(Composite group) {
                }
        return UIUtils.getSettingsSection(UIDashboardActivator.getDefault().getDialogSettings(), DIALOG_ID);
        if (editDialog.open() == IDialogConstants.OK_ID) {
        return group;

                if (selection instanceof IStructuredSelection ss) {
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardRendererDescriptor;
                            createDashboard(dashboardProvider);
    private void editDashboard() {
 * limitations under the License.
        if (UIUtils.confirmAction(
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                    });
                            cell.setText(dspd.getDescription());
                return dpd;
                @Override
    }
        if (selectedDashboard == null || !selectedDashboard.isCustom()) {
    protected IDialogSettings getDialogBoundsSettings() {
                }
import org.eclipse.jface.viewers.*;
    private DashboardProviderDescriptor getDashboardProviderFor(Map<Object, Object> parentMap, Object element) {
            DashboardRegistry.getInstance().saveSettings();
                                DashboardRendererDescriptor viewType = DashboardUIRegistry.getInstance().getViewType(dashboardDescriptor.getDashboardRenderer());
            true);
            buttonBar.setLayoutData(gd);
                    if (selectedObject instanceof DashboardItemConfiguration dd) {
    private void createDashboard(DashboardProviderDescriptor providerDescriptor) {
    }
            providerDescriptor, null, "", "", "", "", true);
                        if (element instanceof DBPDriver driver) {
        }
                public void update(ViewerCell cell) {
        updateButtons();

import org.eclipse.swt.events.SelectionEvent;
                        if (element instanceof DBPDriver driver) {
                public void widgetSelected(SelectionEvent e) {
 *
        Composite dialogArea = super.createDialogArea(parent);
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
            refreshDashboards();

                public void widgetSelected(SelectionEvent e) {
                            cell.setImage(DBeaverIcons.getImage(driver.getIcon()));
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardActivator;
        DashboardItemConfigurationDialog editDialog = new DashboardItemConfigurationDialog(getShell(), newDashboard, true);
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
                UIUtils.packColumns(treeViewer.getTree(), true, null);
import org.eclipse.osgi.util.NLS;
        for (Object item = element; item != null; item = parentMap.get(item)) {
                    return result.toArray();
    @Override
        newDashboard.setCustom(true);

                Button newChartButton = UIUtils.createPushButton(buttonBar,
                        return new Object[0];
import org.jkiss.utils.CommonUtils;
                }
import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;
