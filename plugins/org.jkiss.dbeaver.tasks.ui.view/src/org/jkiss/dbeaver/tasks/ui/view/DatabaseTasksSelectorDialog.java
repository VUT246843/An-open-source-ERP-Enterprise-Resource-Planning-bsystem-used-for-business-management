        tasksTree.loadViewConfig();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
package org.jkiss.dbeaver.tasks.ui.view;
        gd.heightHint = 500;
import org.eclipse.jface.dialogs.IDialogConstants;
            selectedTasks.addAll(tasksTree.getCheckedTasks());

        return selectedTasks;
    }
    private DatabaseTasksTree tasksTree;
        GridData gd = new GridData(GridData.FILL_BOTH);

        this.tasksTree.getViewer().getTree().setLayoutData(gd);
        this.tasksTree = new DatabaseTasksTree(dialogArea, true);
 *
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
    }

    @Override
    protected Composite createDialogArea(Composite parent) {
/*
 *
import java.util.ArrayList;
    @Override
import java.util.List;
}
        Composite dialogArea = super.createDialogArea(parent);
public class DatabaseTasksSelectorDialog extends BaseDialog {
            selectedTasks.clear();
    public List<DBTTask> getSelectedTasks() {
        tasksTree.getViewer().addSelectionChangedListener(event -> {
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.Log;
 * you may not use this file except in compliance with the License.


        });
 * limitations under the License.
 */
            getButton(IDialogConstants.OK_ID).setEnabled(!selectedTasks.isEmpty());
 * Licensed under the Apache License, Version 2.0 (the "License");

        super(parentShell, TaskUIViewMessages.db_tasks_selector_dialog, null);

    }
    private final List<DBTTask> selectedTasks = new ArrayList<>();

    protected void createButtonsForButtonBar(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public DatabaseTasksSelectorDialog(Shell parentShell) {
        getButton(IDialogConstants.OK_ID).setEnabled(false);

        return dialogArea;
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Log log = Log.getLog(DatabaseTasksSelectorDialog.class);
import org.jkiss.dbeaver.model.task.DBTTask;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        tasksTree.loadTasks();
 * See the License for the specific language governing permissions and


 * distributed under the License is distributed on an "AS IS" BASIS,
        super.createButtonsForButtonBar(parent);
