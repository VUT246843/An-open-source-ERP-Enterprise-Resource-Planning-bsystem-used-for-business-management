            treeViewer.getControl(),
}

            @Override
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.IDialogSettings;
                        return ((DBNLocalFolder) element).hasConnected();
                        DBNLocalFolder folderNode = projectNode.getFolderNode(dsFolder);
    }
                showConnected = showConnectedCheck.getSelection();
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        createButton(composite, IDialogConstants.OK_ID, "&Select", true); //$NON-NLS-1$
            if (showConnected) {
    private static final String PARAM_SHOW_ALL_PROJECTS = "showAllProjects"; //$NON-NLS-1$

        return UIUtils.getDialogSettings(DIALOG_ID);
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        UIUtils.asyncExec(() -> {
                        // Do not expand anything
        treeViewer.addFilter(new ViewerFilter() {
            public void widgetSelected(SelectionEvent e) {
 *
                }
    private DBNNode rootNode;
            public boolean select(Viewer viewer, Object parentElement, Object element)
                        }

                        // Expand only current DS folder
                return element instanceof DBNProject || element instanceof DBNProjectDatabases || element instanceof DBNLocalFolder || element instanceof DBNDataSource;
        final Button showAllProjectsCheck = new Button(group, SWT.CHECK);
import org.eclipse.jface.viewers.*;
    protected IDialogSettings getDialogBoundsSettings()
    protected Composite createDialogArea(Composite parent)
                }
    private final DBPProject project;
        return dataSource;
/*
 * DBeaver - Universal Database Manager
        final Button showConnectedCheck = new Button(group, SWT.CHECK);
        rootNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot();
                    if (element instanceof DBNDataSource) {
        });
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.code.Nullable;
            public void widgetSelected(SelectionEvent e) {
        showAllProjectsCheck.setSelection(showAllProjects);
            if (dsNode != null) {
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                } finally {

                expandFolders(this, treeRootNode);
        return showAllProjects || projectNode == null ? rootNode : projectNode;
            }
import org.jkiss.dbeaver.DBException;
 *
                        return ((DBNDataSource) element).getDataSource() != null;

                    if (element instanceof DBNLocalFolder) {
        });
        dataSourceTree.setLayoutData(gd);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    return;
        }
                expandFolders(dataSourceTree, getTreeRootNode());
                    dataSourceTree.reloadTree(getTreeRootNode());
        };

import org.jkiss.dbeaver.model.navigator.*;
                    dataSource = ((DBNDataSource) selNode).getObject();
            public boolean select(Object element) {
        return composite;
            }
            }
                return true;
                            break;
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
 *
    }
        showAllProjectsCheck.setLayoutData(GridDataFactory.swtDefaults().exclude(project == null).create());

            Point treeSize = dataSourceTree.getViewer().getTree().computeSize(SWT.DEFAULT, SWT.DEFAULT);
                    treeViewer.refresh();
                }
    @Override
            false,
        projectNode = null;
                return object instanceof DBNDataSource;
        gd.minimumWidth = 100;
                    if (showConnected) {
        if (node instanceof DBNLocalFolder || node instanceof DBNProjectDatabases || node instanceof DBNProject || node instanceof DBNRoot) {
        showConnected = getDialogBoundsSettings().getBoolean(PARAM_SHOW_CONNECTED);
            SWT.SINGLE | SWT.BORDER,
                return object instanceof DBNDataSource;

        treeViewer.addDoubleClickListener(event -> {
                    String description = dataSource.getDescription();
        }
        }

//            createButton(composite, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);

                try {
            descriptionText,
                okPressed();
            }
            if (node instanceof DBNProject p && !p.getProject().isOpen()) {

        composite.setLayout(layout);
        return ctl;
            getButton(IDialogConstants.OK_ID).setEnabled(false);
import org.eclipse.swt.events.SelectionAdapter;
            dataSourceTree.getFilterControl(),
                Object selNode = structSel.isEmpty() ? null : structSel.getFirstElement();
            dsFilter,
    {
                    if (showAllProjects) {
                getDialogBoundsSettings().put(PARAM_SHOW_ALL_PROJECTS, showAllProjects);
 * You may obtain a copy of the License at
        // Add the buttons to the button bar.
//        }
import org.eclipse.swt.events.SelectionEvent;

 * limitations under the License.
    @Nullable
        showAllProjectsCheck.setText(UINavigatorMessages.label_show_all_projects);
                    }
                    }
        };
                if (selNode instanceof DBNDataSource) {
        super.buttonPressed(buttonId);
                    if (description == null) {
            @Override
                getShell().setSize(shellCompSize.x, shellSize.y);
    }
                    DBPDataSourceFolder dsFolder;
                } else {
                    }
        Composite composite = new Composite(parent, SWT.NONE);
            }
                } finally {
        composite.setLayoutData(gd);
        });
            }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                showAllProjects = showAllProjectsCheck.getSelection();
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.VERTICAL_ALIGN_CENTER);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * SelectDataSourceDialog
            }
        }
                }
            if (getButton(IDialogConstants.OK_ID).isEnabled()) {
        closeOnFocusLost(
            dataSourceTree.getFilterControl().setFocus();
                // Don't try to expand unloaded projects - let the user do it
        }
            }
            dataSource = null;
        super(parentShell, UINavigatorMessages.dialog_select_datasource_title);
    protected Control createContents(Composite parent)
        this.project = project;
                if (showConnected) {
                    element instanceof DBNDataSource;
            showConnectedCheck,
        layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);

import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
                    element instanceof DBNProjectDatabases ||
import org.jkiss.dbeaver.ui.UIUtils;
            DBNProject projectBaseNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(project);
            if (treeSize.x >= shellSize.x) {
    private void expandFolders(DatabaseNavigatorTree dataSourceTree, DBNNode node) {
                            expandFolders(this, folderNode);
                treeViewer.setSelection(new StructuredSelection(dsNode), true);
                        if (folderNode != null) {
                getShell().layout(true);
 * @author Serge Rider
    @Override
            }
                getDialogBoundsSettings().put(PARAM_SHOW_CONNECTED, showConnected);
    {
                    }
        if (this.dataSource != null) {
                treeViewer.getControl().setRedraw(false);
            if (projectBaseNode != null) {
                DBNNode treeRootNode = getTreeRootNode();
    private DBNNode getTreeRootNode() {
        gd.heightHint = 500;
                projectNode = projectBaseNode.getDatabases();
        layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
            protected void onTreeRefresh() {
import org.eclipse.swt.layout.GridLayout;
                treeViewer.getControl().setRedraw(false);

import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
 * Licensed under the Apache License, Version 2.0 (the "License");

            @Override
                return;
                        if (dsFolder.getParent() == null) {
 *
        GridData gd = new GridData(GridData.FILL_BOTH);
            public boolean filterFolders() {
    protected Control createButtonBar(@NotNull Composite parent) {
            }

                    expandFolders(dataSourceTree, childNode);
                    } else {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        gd.minimumHeight = 100;
                IStructuredSelection structSel = (IStructuredSelection) event.getSelection();
        descriptionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        treeViewer.addSelectionChangedListener(
                childNodes = node.getChildren(new VoidProgressMonitor());
        });
        this.dataSource = selection;
    @Override
                    dataSource = null;
            @Override
        composite.setFont(parent.getFont());
    }
            public boolean filterObjectByPattern(Object object) {

            }
        if (this.dataSource == null) {
public class SelectDataSourceDialog extends AbstractPopupPanel {
import org.eclipse.swt.SWT;
                    element instanceof DBNLocalFolder ||
            }
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.IGNORE_ID) {
            @Override
        createButton(composite, IDialogConstants.IGNORE_ID, "&None", false); //$NON-NLS-1$
    public SelectDataSourceDialog(@NotNull Shell parentShell, @Nullable DBPProject project, DBPDataSourceContainer selection)
                return element instanceof DBNProject ||
        group.setTabList(new Control[] { dataSourceTree, showConnectedCheck, showAllProjectsCheck} );
                    for (dsFolder = dataSource.getFolder(); dsFolder != null; dsFolder = dsFolder.getParent()) {
    private DBNProjectDatabases projectNode;
    @Override
import org.eclipse.jface.layout.GridDataFactory;
    private static final String DIALOG_ID = "DBeaver.SelectDataSourceDialog";//$NON-NLS-1$
    private DBPDataSourceContainer dataSource = null;
import org.eclipse.swt.layout.GridData;
        showConnectedCheck.addSelectionListener(new SelectionAdapter() {
            showAllProjectsCheck);

        final Text descriptionText = new Text(group, SWT.READ_ONLY);
        );
    }
            getTreeRootNode(),
            DBNNode[] childNodes;
                return;
            UINavigatorMessages.filter_connection_name_placeholder)
                    getButton(IDialogConstants.OK_ID).setEnabled(false);
        });
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
                        }
            Point shellSize = getShell().getSize();
            buttonId = IDialogConstants.OK_ID;
                    }
            @Override

 */

import org.eclipse.jface.dialogs.IDialogConstants;
            DBNDatabaseNode dsNode = DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(this.dataSource);
                    }
            }
        return group;
            }
            dataSourceTree.getViewer().expandToLevel(node, 1);

            @Override
            public boolean isLeafObject(Object object) {
            if (childNodes != null) {
//        if (!isModeless()) {
                Point shellCompSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
 *     http://www.apache.org/licenses/LICENSE-2.0
        layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
        if (project != null) {
        showAllProjects = getDialogBoundsSettings().getBoolean(PARAM_SHOW_ALL_PROJECTS);
            try {
            @Override
import org.jkiss.code.NotNull;
 */
                for (DBNNode childNode : childNodes) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
                        description = dataSource.getName();
        GridLayout layout = new GridLayout(3, false);
    }
                if (dataSource != null && projectNode != null) {
    private static final String PARAM_SHOW_CONNECTED = "showConnected"; //$NON-NLS-1$
import org.jkiss.dbeaver.runtime.DBWorkbench;
        group.setLayoutData(gd);


            } catch (DBException e) {

            group,
                        expandFolders(dataSourceTree, getTreeRootNode());
        DatabaseNavigatorTree dataSourceTree = new DatabaseNavigatorTree(
    private boolean showAllProjects;
        showConnectedCheck.setText(UINavigatorMessages.label_show_connected);
    {
            }
    public DBPDataSourceContainer getDataSource()
    }
import org.eclipse.swt.graphics.Point;
                    treeViewer.getControl().setRedraw(true);
                    treeViewer.getControl().setRedraw(true);
                        expandFolders(dataSourceTree, getTreeRootNode());
                }
                    }
        layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
                    descriptionText.setText(description);
            }

        gd = new GridData(GridData.FILL_BOTH);
        {

        INavigatorFilter dsFilter = new DatabaseNavigatorTreeFilter() {

    {
                try {
/**
            {
        showAllProjectsCheck.addSelectionListener(new SelectionAdapter() {

                    getButton(IDialogConstants.OK_ID).setEnabled(true);
        Control ctl = super.createContents(parent);
                    if (dsFolder != null) {
    }
                }
        Composite group = super.createDialogArea(parent);
    private boolean showConnected;
package org.jkiss.dbeaver.ui.navigator.dialogs;
        final TreeViewer treeViewer = dataSourceTree.getViewer();
            event -> {
        showConnectedCheck.setSelection(showConnected);
