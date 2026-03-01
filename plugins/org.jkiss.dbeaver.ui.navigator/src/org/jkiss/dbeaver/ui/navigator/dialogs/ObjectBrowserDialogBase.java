                specialNode.handleDefaultAction(navigatorTree);

    private final List<DBNNode> selectedObjects = new ArrayList<>();

            return object != null && matchesType(object, true);
        @NotNull List<? extends DBNNode> selectedNodes,
import org.jkiss.dbeaver.model.struct.DBSObject;
                        selectedObjects.add((DBNNode) node);
        GridData gd = new GridData(GridData.FILL_BOTH);

    }
    private final DBNNode[] selectedNodes;
            specialNode = null;
    private DatabaseNavigatorTree navigatorTree;

 * limitations under the License.
 * @author Serge Rider
            IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
    {
import org.eclipse.swt.events.SelectionEvent;
            selectedObjects.clear();
            DBSObject object = ((DBSWrapper) node).getObject();
                    try {
    }
    @Override
 * you may not use this file except in compliance with the License.
                okPressed();


        this.selectedNodes = selectedNodes.toArray(DBNNode[]::new);
                    if (matchesResultNode((DBNNode)node)) {
            if (!selectedObjects.isEmpty()) {
        return showConnected;
 * See the License for the specific language governing permissions and
    private static final int TREE_EXPANSION_DEPTH = 2;
import org.eclipse.swt.widgets.Control;
        navigatorTree = new DatabaseNavigatorTree(group, rootNode, (singleSelection ? SWT.SINGLE : SWT.MULTI) | SWT.BORDER, false, navigatorFilter);
            Collections.addAll(selectedObjects, selectedNodes);
 *
                @Override
                    }
import org.jkiss.dbeaver.model.navigator.DBNObjectNode;
import org.eclipse.jface.viewers.TreeViewer;

        DatabaseNavigatorTreeFilter navigatorFilter = createNavigatorFilter();
    {
        return selectedObjects;
        navigatorTree.setLayoutData(gd);
        treeViewer.addSelectionChangedListener(event -> {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
            }
 *
import org.eclipse.swt.widgets.Shell;
            } else if (specialNode != null) {
        return null;
/**
            final Button showConnectedCheck = new Button(group, SWT.CHECK);
                        if (showConnected) {
        return group;
import org.eclipse.jface.dialogs.IDialogConstants;

    protected ObjectBrowserDialogBase(
        ViewerFilter viewerFilter = createViewerFilter();
        } else {
        if (node instanceof DBSWrapper) {
        Control contents = super.createContents(parent);
                        treeViewer.getControl().setRedraw(true);
import org.eclipse.jface.viewers.IStructuredSelection;
/*
 * ObjectBrowserDialog
            }
 */
            treeViewer.setSelection(new StructuredSelection(selectedNodes));
    ) {
import org.jkiss.dbeaver.model.struct.DBSWrapper;
 * You may obtain a copy of the License at
    public static boolean isShowConnected() {
                    showConnected = showConnectedCheck.getSelection();
                    } finally {
    private final String title;
        if (viewerFilter != null) {
                if (node instanceof DBNNode) {
            return matchesType(((DBNObjectNode) node).getNodeObject(), true);
    protected boolean matchesResultNode(DBNNode node) {
                        selectedObjects.clear();
 *
package org.jkiss.dbeaver.ui.navigator.dialogs;
    protected void okPressed()
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
        gd = new GridData(GridData.FILL_BOTH);

    }
        return true;
    private final DBNNode rootNode;
        boolean singleSelection

            object = DBUtils.getAdapter(DBSObject.class, object);
    protected Control createDialogArea(Composite parent)
import org.jkiss.code.NotNull;
            showConnectedCheck.setText(UINavigatorMessages.label_show_connected);
        @NotNull String title,
    }
    {
        return null;
        } else if (node instanceof DBNObjectNode) {
    private final boolean singleSelection;
                    } else {
        super(parentShell);
    protected Control createContents(Composite parent)
        final TreeViewer treeViewer = navigatorTree.getViewer();
                        treeViewer.refresh();
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
            });
    protected boolean isResizable()
            showConnectedCheck.setSelection(showConnected);
        });
        navigatorTree.setFilterObjectType(DatabaseNavigatorTreeFilterObjectType.connection);
 * Unless required by applicable law or agreed to in writing, software
            if (object != null && matchesType(object, true)) {
import java.util.ArrayList;
    }

import org.eclipse.jface.viewers.ViewerFilter;
        this.singleSelection = singleSelection;
                public void widgetSelected(SelectionEvent e) {
            treeViewer.addFilter(viewerFilter);
            }
        this.title = title;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return true;
import org.eclipse.swt.widgets.Button;
            for (Object node : selection) {
        @NotNull DBNNode rootNode,
        Composite group = (Composite) super.createDialogArea(parent);
        gd.heightHint = 500;
        }
                } else if (node instanceof TreeNodeSpecial) {
    }
    }
    /** Expands first level of each node */

                }
    @Override
import java.util.Collections;

        super.okPressed();
                    specialNode = (TreeNodeSpecial) node;
    public List<DBNNode> getSelectedObjects()

        treeViewer.getTree().setFocus();
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
import org.jkiss.dbeaver.model.DBUtils;
    @Override
    protected DatabaseNavigatorTreeFilter createNavigatorFilter() {
 *
        treeViewer.addDoubleClickListener(event -> {
        group.setLayoutData(gd);
    {
    @Override
import org.jkiss.dbeaver.model.navigator.DBNNode;
        }
import org.eclipse.jface.dialogs.Dialog;
                    }
    protected boolean matchesType(Object object, boolean result) {

        if (rootNode instanceof DBNContainer && ((DBNContainer) rootNode).getChildrenClass() == DBPDataSourceContainer.class) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                            treeViewer.expandToLevel(TREE_EXPANSION_DEPTH, false);
        }
        this.rootNode = rootNode;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilterObjectType;
            }
        gd.widthHint = 500;
        return true;
import org.jkiss.dbeaver.model.navigator.DBNContainer;
    }
import java.util.List;
        getShell().setText(title);
        if (selectedNodes.length > 0) {

 */
    {
                    treeViewer.getControl().setRedraw(false);
    }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        });
                }
    private TreeNodeSpecial specialNode;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        getButton(IDialogConstants.OK_ID).setEnabled(!selectedObjects.isEmpty());
            return matchesType(node, true);
    }

import org.eclipse.swt.SWT;
        @NotNull Shell parentShell,
public abstract class ObjectBrowserDialogBase extends Dialog {
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;

import org.eclipse.swt.layout.GridData;
    }

    private static boolean showConnected;
import org.eclipse.swt.events.SelectionAdapter;
        }

 * DBeaver - Universal Database Manager

            for (DBNNode node : selectedNodes) {
                        }
            getButton(IDialogConstants.OK_ID).setEnabled(!selectedObjects.isEmpty());

            showConnectedCheck.addSelectionListener(new SelectionAdapter() {

                if (!(node instanceof DBNDataSource dataSource) || dataSource.getDataSourceContainer().isConnected()) {
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
    protected ViewerFilter createViewerFilter() {
                    treeViewer.expandToLevel(selectedNodes, 1);
        return contents;

