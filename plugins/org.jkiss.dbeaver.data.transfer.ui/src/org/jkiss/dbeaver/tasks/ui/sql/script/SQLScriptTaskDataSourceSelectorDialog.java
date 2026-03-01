                    Collection<DBPDataSourceContainer> containers = ((DBNResource) element).getAssociatedDataSources();
        gd.heightHint = 300;
                        StringBuilder text = new StringBuilder();
        this.projectNode = projectNode;

import org.eclipse.swt.layout.GridData;
        return dialogArea;

            updateSelectedDataSources();
import org.jkiss.utils.CommonUtils;
            }
        super.createButtonsForButtonBar(parent);
/*
        columnController.addColumn(ModelMessages.model_navigator_Name, DTUIMessages.sql_script_task_data_source_selection_dialog_column_description_script, SWT.LEFT, true, true, new ColumnLabelProvider() {
        });
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
        for (Object element : dataSourceTree.getCheckboxViewer().getCheckedElements()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            }
            }
    private DBNProject projectNode;
        ViewerColumnController columnController = new ViewerColumnController("sqlTaskScriptViewer", viewer);
                return true;
                }
        super(parentShell, DTMessages.sql_script_task_page_settings_group_connections, null);
        dataSourceTree = new DatabaseNavigatorTree(
                return "";
        }
            @Override
            }
            public Image getImage(Object element) {
            public String getText(Object element) {
    private List<DBNDataSource> selectedDataSources = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            public boolean isLeafObject(Object object) {
import org.eclipse.jface.viewers.IToolTipProvider;
        Composite dialogArea = super.createDialogArea(parent);
                    return ((IToolTipProvider) mainLabelProvider).getToolTipText(element);
                        for (DBPDataSourceContainer container : containers) {
            dsFilter);
        });

    @Override
            public String getText(Object element) {
                            if (text.length() > 0) {
package org.jkiss.dbeaver.tasks.ui.sql.script;
 *
                if (element instanceof DBNResource) {
    static void createScriptColumns(ColumnViewer viewer) {
        columnController.createColumns(true);
    }
                        return text.toString();

    protected Composite createDialogArea(Composite parent) {
import org.jkiss.dbeaver.model.navigator.*;
 * you may not use this file except in compliance with the License.
        GridData gd = new GridData(GridData.FILL_BOTH);
 * DBeaver - Universal Database Manager
    }
                                text.append(", ");
 * Licensed under the Apache License, Version 2.0 (the "License");
        dataSourceTree.setLayoutData(gd);
        return selectedDataSources;
    }
            @Override
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
                            }
            @Override
        INavigatorFilter dsFilter = new DatabaseNavigatorTreeFilter() {
            projectNode.getDatabases(),
}
    @Override
import org.eclipse.jface.dialogs.IDialogConstants;
        dataSourceTree.getViewer().addSelectionChangedListener(event -> {
            @Override
                selectedDataSources.add((DBNDataSource) element);
        };

            @Override
        final ILabelProvider mainLabelProvider = (ILabelProvider) viewer.getLabelProvider();
import org.jkiss.dbeaver.model.messages.ModelMessages;
            public String getToolTipText(Object element) {
 * You may obtain a copy of the License at
                return mainLabelProvider.getText(element);
    public List<DBNDataSource> getSelectedDataSources() {
            }
    private void updateSelectedDataSources() {
                    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
            if (element instanceof DBNDataSource) {


                    if (!CommonUtils.isEmpty(containers)) {
        columnController.setForceAutoSize(true);

import java.util.Collection;
            SWT.SINGLE | SWT.BORDER | SWT.CHECK,
                return element instanceof DBNProject || element instanceof DBNProjectDatabases || element instanceof DBNLocalFolder || element instanceof DBNDataSource || element instanceof TreeNodeSpecial;

import java.util.ArrayList;
                return object instanceof DBNDataSource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.viewers.ColumnViewer;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
                return mainLabelProvider.getImage(element);
            }
            public Image getImage(Object element) {
                            text.append(container.getName());
            @Override
                if (mainLabelProvider instanceof IToolTipProvider) {
import java.util.List;
 * limitations under the License.

 * See the License for the specific language governing permissions and
        columnController.addColumn(ModelMessages.model_navigator_Connection, DTUIMessages.sql_script_task_data_source_selection_dialog_column_description_script_data_source, SWT.LEFT, true, true, new ColumnLabelProvider() {

                        }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
import org.eclipse.jface.viewers.ILabelProvider;
 * Unless required by applicable law or agreed to in writing, software
        getButton(IDialogConstants.OK_ID).setEnabled(false);
class SQLScriptTaskDataSourceSelectorDialog extends BaseDialog {
                return null;
    }
                }
 *
import org.eclipse.swt.widgets.Shell;

            public boolean select(Object element) {
        selectedDataSources.clear();
            }
            public boolean filterFolders() {

    SQLScriptTaskDataSourceSelectorDialog(Shell parentShell, DBNProject projectNode) {
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;


            @Override
            dialogArea,
import org.eclipse.swt.graphics.Image;
    }
        gd.widthHint = 400;
            false,
 *
                return null;
            @Override
    private DatabaseNavigatorTree dataSourceTree;
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
        getButton(IDialogConstants.OK_ID).setEnabled(!selectedDataSources.isEmpty());
    protected void createButtonsForButtonBar(Composite parent) {
 */
import org.eclipse.swt.SWT;
        });

 * distributed under the License is distributed on an "AS IS" BASIS,
            }
