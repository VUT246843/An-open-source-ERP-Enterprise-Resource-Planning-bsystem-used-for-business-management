import org.eclipse.swt.widgets.Shell;
                    Class<? extends DBSObject> childrenClass = ((DBNDatabaseFolder) element).getChildrenClass();
/*

    protected Composite createDialogArea(Composite parent) {
                    if (showConnected && !((DBNDataSource) element).getDataSourceContainer().isConnected()) {
        selectedObjects.clear();
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
    private void updateSelectedObjects() {
            @Override
                    return taskType.isDriverApplicable(((DBNDataSource) element).getDataSourceContainer().getDriver());
 * You may obtain a copy of the License at
    private DatabaseNavigatorTree dataSourceTree;


 */
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.tasks.ui.sql.internal.TasksSQLUIMessages;
        gd.heightHint = 300;
        dataSourceTree.setLayoutData(gd);
            }
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
 * Licensed under the Apache License, Version 2.0 (the "License");
                            (!showConnected || ds.getDataSourceContainer().isConnected())) {
        showConnectedCheck.addSelectionListener(new SelectionAdapter() {
        };
    private static boolean showConnected;
    }
                        }
                    for (DBNDataSource ds : ((DBNLocalFolder) element).getNestedDataSources()) {
        super(parentShell, TasksSQLUIMessages.sql_tool_task_object_selector_dialog_title, null);
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
                            (taskType.matchesEntityElements() && DBSEntity.class.isAssignableFrom(childrenClass)) ||
        showConnectedCheck.setText(UINavigatorMessages.label_show_connected);
        INavigatorFilter dsFilter = new DatabaseNavigatorTreeFilter() {

import org.eclipse.swt.widgets.Composite;
    protected void createButtonsForButtonBar(Composite parent) {
                if (element instanceof DBNProject || element instanceof DBNProjectDatabases) {
                if (element instanceof DBNDataSource) {
import org.eclipse.swt.widgets.Button;
class SQLToolTaskObjectSelectorDialog extends BaseDialog {
                if (element instanceof DBNLocalFolder) {
        return dialogArea;
                    return childrenClass != null &&
import org.eclipse.swt.events.SelectionAdapter;
 *

import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;
import org.jkiss.dbeaver.model.navigator.*;
            @Override
    }
            dialogArea,

                    }

                    DBSObject object = ((DBNDatabaseItem) element).getObject();
        return selectedObjects;
                return object instanceof DBNDatabaseItem && taskType.appliesTo(((DBNDatabaseItem) object).getObject());
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite dialogArea = super.createDialogArea(parent);
 * See the License for the specific language governing permissions and
            }
                dataSourceTree.getViewer().refresh();
 *
import java.util.List;

                return true;
                        taskType.appliesTo(object));
        dataSourceTree = new DatabaseNavigatorTree(
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;

                } else if (element instanceof DBNDatabaseFolder) {
    private List<DBSObject> selectedObjects = new ArrayList<>();
            }
        showConnectedCheck.setSelection(showConnected);
                            return true;
        final Button showConnectedCheck = new Button(dialogArea, SWT.CHECK);
            if (element instanceof DBNDatabaseItem && taskType.matchesType(((DBNDatabaseItem) element).getObject().getClass())) {
    }
 * DBeaver - Universal Database Manager
        }
                        (taskType.matchesEntityElements() && DBSEntity.class.isAssignableFrom(object.getClass())) ||
        getButton(IDialogConstants.OK_ID).setEnabled(!selectedObjects.isEmpty());
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }

            dsFilter);
import java.util.ArrayList;
            @Override
        });
    public List<DBSObject> getSelectedObjects() {
            public boolean filterFolders() {
                }
                    return true;
    }
 * Unless required by applicable law or agreed to in writing, software

package org.jkiss.dbeaver.tasks.ui.sql;
                    return false;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 *
                            taskType.matchesType(childrenClass));
            SWT.SINGLE | SWT.BORDER | SWT.CHECK,
import org.eclipse.swt.events.SelectionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (Object element : dataSourceTree.getCheckboxViewer().getCheckedElements()) {
    @Override
            public boolean isLeafObject(Object object) {
            @Override
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                        if (taskType.isDriverApplicable(ds.getDataSourceContainer().getDriver()) &&
            updateSelectedObjects();
                }
        dataSourceTree.getViewer().addSelectionChangedListener(event -> {
                    return (DBSObjectContainer.class.isAssignableFrom(object.getClass()) ||
            public boolean select(Object element) {
                }
}
                        (DBSObjectContainer.class.isAssignableFrom(childrenClass) ||
        super.createButtonsForButtonBar(parent);
    }
                }
        gd.widthHint = 400;
            }
        GridData gd = new GridData(GridData.FILL_BOTH);
        });
import org.jkiss.dbeaver.model.struct.DBSEntity;

    @Override
                showConnected = showConnectedCheck.getSelection();
    private DBNProject projectNode;
                selectedObjects.add(((DBNDatabaseItem) element).getObject());
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            public void widgetSelected(SelectionEvent e) {
        getButton(IDialogConstants.OK_ID).setEnabled(false);
        this.projectNode = projectNode;
        this.taskType = taskType;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.layout.GridData;
                        return false;
 * limitations under the License.
                if (element instanceof DBNDatabaseItem) {
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.struct.DBSObject;
            false,
    private TaskTypeDescriptor taskType;
                return element instanceof TreeNodeSpecial;
    SQLToolTaskObjectSelectorDialog(Shell parentShell, DBNProject projectNode, TaskTypeDescriptor taskType) {
            projectNode.getDatabases(),
