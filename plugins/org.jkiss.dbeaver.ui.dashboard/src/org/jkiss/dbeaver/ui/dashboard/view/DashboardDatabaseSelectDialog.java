
                @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.dialogs.IDialogSettings;
import org.jkiss.dbeaver.model.DBPImage;
}    }


                    okPressed();
    }
                this.target = null;
                    if (selectedObject instanceof DBPNamedObject) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
                }

 *
                UIUtils.packColumns(treeViewer.getTree(), true, null);
        Composite dialogArea = super.createDialogArea(parent);
import org.jkiss.dbeaver.ui.controls.NamedObjectPatternFilter;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.DBeaverIcons;
                        cell.setText(element.getName());
    @Override
                            cell.setText(CommonUtils.notEmpty(((DBPDriver) element).getDescription()));
                        if (result.size() <= 1) {
                    }
 * Database select dialog
            gd.widthHint = 300;
    @Override
import org.eclipse.jface.viewers.*;
 * You may obtain a copy of the License at
            treeViewer.addSelectionChangedListener(event -> {
    }
    private TreeViewer treeViewer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        DBPImage icon = null;
                        if (icon != null) {

        return dialogArea;
                }
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
                @Override
        Control contents = super.createContents(parent);
                public boolean hasChildren(Object element) {
            });
            treeViewer = DialogUtils.createFilteredTree(dialogArea, SWT.BORDER, new NamedObjectPatternFilter(), null);
/**
        }
                        return false;

                        return new Object[0];
                    }
 */
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;

                    List<? extends DBPNamedObject> result = null;
import org.jkiss.dbeaver.model.DBPNamedObject;
                if (target != null) {
        return UIUtils.getSettingsSection(UIDashboardActivator.getDefault().getDialogSettings(), DIALOG_ID);
                            icon = ((DBPDriver) element).getIcon();
                        result = ((DBPDataSourceProviderDescriptor) parentElement).getEnabledDrivers();
        return contents;
                    if (element instanceof DBPDriver) {
                        } else if (element instanceof DBPDataSourceProviderDescriptor) {
                    return ((DBPDataSourceProviderDescriptor) element).getEnabledDrivers().size() > 1;
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
    private DBPNamedObject target;
            });
import org.eclipse.swt.widgets.Composite;
                    }
    }
    protected Control createContents(Composite parent) {
                public void update(ViewerCell cell) {
import org.eclipse.swt.widgets.Control;
    private static final String DIALOG_ID = "DBeaver.DashboardDatabaseSelectDialog";//$NON-NLS-1$
            });
                treeViewer.expandAll();
                            icon = ((DBPDataSourceProviderDescriptor) element).getIcon();
                        }

                }
        super(shell, UIDashboardMessages.dialog_dashboard_database_select_title, null);
                    if (result == null) {
                    DBPNamedObject element = (DBPNamedObject) cell.getElement();
        getButton(IDialogConstants.OK_ID).setEnabled(target != null);
            treeViewer.getControl().setLayoutData(gd);
            UIUtils.createTreeColumn(treeViewer.getTree(), SWT.LEFT, UIDashboardMessages.dialog_dashboard_database_select_column_description);
                    } else {
                public Object[] getChildren(Object parentElement) {
    public DBPNamedObject getTarget() {
                        this.target = (DBPNamedObject) selectedObject;

                }
 *
            gd.heightHint = 300;
    }

/*
            treeViewer.setContentProvider(new TreeContentProvider() {
    protected IDialogSettings getDialogBoundsSettings() {
    private void updateButtons() {
        updateButtons();
                            cell.setText(((DBPDataSourceProviderDescriptor) element).getDescription());
                    result.sort(DBUtils.nameComparator());
public class DashboardDatabaseSelectDialog extends BaseDialog {
                ISelection selection = event.getSelection();

                            result = null;
import org.jkiss.dbeaver.ui.UIUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
            treeViewer.setLabelProvider(new CellLabelProvider() {
        {
                    }
                    if (parentElement instanceof List) {

import java.util.List;
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.model.DBUtils;
                        }

            treeViewer.getTree().setHeaderVisible(true);
 * you may not use this file except in compliance with the License.
                    return result.toArray();
            UIUtils.createTreeColumn(treeViewer.getTree(), SWT.LEFT, UIDashboardMessages.dialog_dashboard_database_select_column_name);

                            cell.setImage(DBeaverIcons.getImage(icon));
                        if (element instanceof DBPDriver) {

        return target;
import org.eclipse.swt.widgets.Shell;
                        }
import org.jkiss.utils.CommonUtils;
            GridData gd = new GridData(GridData.FILL_BOTH);
import org.eclipse.jface.dialogs.IDialogConstants;
                    if (cell.getColumnIndex() == 0) {
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardActivator;
                    Object selectedObject = ((IStructuredSelection) selection).getFirstElement();

                    } else if (parentElement instanceof DBPDataSourceProviderDescriptor) {
package org.jkiss.dbeaver.ui.dashboard.view;
 * limitations under the License.
            });
            treeViewer.addDoubleClickListener(event -> {
    }
            });
                        result = (List) parentElement;
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.swt.SWT;
 */
    @Override
                    }
 *
            UIUtils.asyncExec(() -> {
            treeViewer.setInput(DBWorkbench.getPlatform().getDataSourceProviderRegistry().getDataSourceProviders());
    protected Composite createDialogArea(Composite parent) {

                        if (element instanceof DBPDriver) {

    public DashboardDatabaseSelectDialog(Shell shell) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                this.updateButtons();
import org.eclipse.swt.layout.GridData;
                        } else if (element instanceof DBPDataSourceProviderDescriptor) {
                        }
                if (selection instanceof IStructuredSelection) {
                @Override
