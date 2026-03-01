            @Override
        enableButton(IDialogConstants.OK_ID, !selectedScripts.isEmpty());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.dialogs.IDialogConstants;
        GridData gd = new GridData(GridData.FILL_BOTH);

                }
                return mainLabelProvider.getText(element);
        scriptsTree.getViewer().addFilter(new ViewerFilter() {
class SQLScriptTaskScriptSelectorDialog extends BaseDialog {
            return "script folder".equals(element.getNodeType());
                return object instanceof DBNResource && ((DBNResource) object).getResource() instanceof IFile;
        };

            dialogArea,
            SWT.SINGLE | SWT.BORDER | SWT.CHECK,

import org.eclipse.core.resources.IFolder;
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
            public boolean select(Object element) {
        IResource resource = element.getResource();
                    return true;
            public boolean filterFolders() {
        ViewerColumnController<?,?> columnController = new ViewerColumnController<>("sqlTaskScriptViewer", viewer);
                }
        columnController.createColumns(true);
        Composite dialogArea = super.createDialogArea(parent);
            }
    private DatabaseNavigatorTree scriptsTree;
        this.projectNode = projectNode;
            }

        columnController.addColumn(ModelMessages.model_navigator_Connection, DTUIMessages.sql_script_task_selector_dialog_column_description_script_data_source, SWT.LEFT, true, true, new ColumnLabelProvider() {
                }
    }
            @Override
            if (element instanceof DBNResource dbnResource && dbnResource.getResource() instanceof IFile) {
    static void createScriptColumns(ColumnViewer viewer) {
                        StringBuilder text = new StringBuilder();
import java.util.List;

 */
            }
        scriptsTree = new DatabaseNavigatorTree(
                if (element instanceof DBNResource) {
                return element instanceof DBNLocalFolder || element instanceof DBNResource || element instanceof TreeNodeSpecial;
            public String getText(Object element) {
                return null;
import org.eclipse.swt.widgets.Composite;
    }
            }
import org.eclipse.jface.viewers.*;
    }
import org.eclipse.core.resources.IContainer;
        if (resource instanceof IFolder) {

        });
            public boolean filterObjectByPattern(Object object) {
                                text.append(", ");
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
                selectedScripts.add(dbnResource);
import org.eclipse.swt.graphics.Image;
                return mainLabelProvider.getImage(element);
                if (element instanceof TreeNodeSpecial) {
            }
            }
import org.jkiss.utils.CommonUtils;
    @Override
            @Override
        gd.heightHint = 300;
        return resource instanceof IContainer || (resource instanceof IFile && "sql".equals(resource.getFileExtension()));
    protected void createButtonsForButtonBar(Composite parent) {
                }
 * limitations under the License.
                return object instanceof DBNResource && ((DBNResource) object).getResource() instanceof IFile;
                            }
            public boolean select(Viewer viewer, Object parentElement, Object element) {
        columnController.setForceAutoSize(true);

            @Override
import org.jkiss.dbeaver.model.messages.ModelMessages;
        });
 *
            public Image getImage(Object element) {
import org.eclipse.core.resources.IResource;
import java.util.Collection;
 * DBeaver - Universal Database Manager

                    return isResourceApplicable((DBNResource) element);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    SQLScriptTaskScriptSelectorDialog(Shell parentShell, DBNProject projectNode) {
            }
import org.jkiss.dbeaver.model.navigator.DBNResource;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
/*
                            if (!text.isEmpty()) {
            }
                    Collection<DBPDataSourceContainer> containers = ((DBNResource) element).getAssociatedDataSources();
    }
            @Override
            public String getToolTipText(Object element) {
        scriptsTree.setLayoutData(gd);
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
                        return text.toString();
            false,

        for (Object element : scriptsTree.getCheckboxViewer().getCheckedElements()) {
 * you may not use this file except in compliance with the License.
            @Override
                            text.append(container.getName());
        enableButton(IDialogConstants.OK_ID, false);
 *

        });
            @Override
package org.jkiss.dbeaver.tasks.ui.sql.script;
        scriptsTree.getViewer().addSelectionChangedListener(event -> updateSelectedScripts());
            }
                    }
                return false;
            public String getText(Object element) {
                if (element instanceof DBNResource) {
    private void updateSelectedScripts() {

import org.eclipse.swt.widgets.Shell;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        createScriptColumns(scriptsTree.getViewer());
            @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            scriptFilter);
        columnController.addColumn(ModelMessages.model_navigator_Name, DTUIMessages.sql_script_task_selector_dialog_column_description_script, SWT.LEFT, true, true, new ColumnLabelProvider() {

 *
import org.jkiss.dbeaver.model.navigator.DBNProject;
        scriptsTree.getViewer().getTree().setHeaderVisible(true);
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean isResourceApplicable(DBNResource element) {
        scriptsTree.getViewer().expandToLevel(2);

                return "";
    protected Composite createDialogArea(Composite parent) {
            public boolean isLeafObject(Object object) {
    }
 * See the License for the specific language governing permissions and
            projectNode,
 * Copyright (C) 2010-2026 DBeaver Corp and others
        super(parentShell, DTMessages.sql_script_task_page_settings_group_files, null);
    }
    private final List<DBNNode> selectedScripts = new ArrayList<>();
import java.util.ArrayList;
        }
import org.jkiss.dbeaver.model.navigator.DBNNode;
            @Override
        }
        selectedScripts.clear();
                        }
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;

        gd.widthHint = 400;
        return selectedScripts;

                    return ((IToolTipProvider) mainLabelProvider).getToolTipText(element);
        final ILabelProvider mainLabelProvider = (ILabelProvider) viewer.getLabelProvider();


            // FIXME: this is a hack
import org.eclipse.swt.SWT;
                if (mainLabelProvider instanceof IToolTipProvider) {
}
        super.createButtonsForButtonBar(parent);
import org.eclipse.swt.layout.GridData;
        INavigatorFilter scriptFilter = new INavigatorFilter() {
    private final DBNProject projectNode;
                        for (DBPDataSourceContainer container : containers) {
    @Override
    public List<DBNNode> getSelectedScripts() {
import org.eclipse.core.resources.IFile;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            }
        return dialogArea;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (!CommonUtils.isEmpty(containers)) {
                return true;

 * Unless required by applicable law or agreed to in writing, software
