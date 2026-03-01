    }

 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected DBNNode getRootNode() {

        return false;
            @NotNull
//        }
        return dataSourceTree.getViewer().getSelection();
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
    public List<DBNNode> getCheckedNodes() {
        return rootNode;
/*


                public boolean select(Viewer viewer, Object parentElement, Object element) {
    }
        } else {
        for (Object element : checkedElements) {
            (DBSObjectContainer.class.isAssignableFrom(folderItemsClass) ||
                checkboxTreeManager.updateElementsCheck(
            }
        dataSourceTree.getViewer().addSelectionChangedListener(listener);
            (obj instanceof DBSDataContainer && obj instanceof DBSEntity);
        selectedProject = this.getSelectedProject();
        @NotNull Composite parent,
        Object[] checkedElements = dataSourceTree.getCheckboxViewer().getCheckedElements();
        TreeViewer treeViewer = dataSourceTree.getViewer();
package org.jkiss.dbeaver.ui.navigator.database;
                if (dsNode != null) {
            if (element instanceof DBNNode nodes) {
    public void refreshNodes() {
        return selectedProject;
        gd.heightHint = 300;
        }
        int style,
            dataSourceTree.setFilterObjectType(DatabaseNavigatorTreeFilterObjectType.container);
import java.util.List;
        dataSourceTree.getViewer().setSelection(
 * you may not use this file except in compliance with the License.
                new Class[]{DBSDataContainer.class});
                return Set.of(DatabaseNavigatorTreeFilterObjectType.container, DatabaseNavigatorTreeFilterObjectType.table);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
            }
 *
        }
                Object firstElement = viewer.getStructuredSelection().getFirstElement();
        return NavigatorUtils.getSelectedProject();
        if (parent.getLayout() instanceof GridLayout) {
 *
    public DatabaseObjectsSelectorPanel(@NotNull Composite parent, boolean multiSelector, @NotNull DBRRunnableContext runnableContext) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBRRunnableContext runnableContext,
public class DatabaseObjectsSelectorPanel extends Composite {

    protected DatabaseNavigatorTreeFilter createNavigatorFilter() {
    protected boolean isDataSourceVisible(DBNDataSource dataSource) {
            if (treeViewer instanceof CheckboxTreeViewer checkboxTreeViewer) {
            if (element instanceof DBNNode) {
                first = false;
                DBNDataSource dsNode = DBNDataSource.getDataSourceNode(node);
 * Unless required by applicable law or agreed to in writing, software
    }

import org.jkiss.code.Nullable;
        gl.marginHeight = 0;
            return true;
    }
            @Override
    private DatabaseObjectsTreeManager checkboxTreeManager;
            dataSourceTree.getViewer().addSelectionChangedListener(event -> onSelectionChange(
        return result;
        dataSourceTree.setLayoutData(gd);
            }
                    true,
    }
            } else if (first) {

    }
        for (DBNNode node : nodes) {
        }
        this(parent, runnableContext, SWT.SINGLE | SWT.BORDER | (multiSelector ? SWT.CHECK : SWT.NONE), false);
import org.eclipse.jface.viewers.*;
import java.util.Set;
            public Set<DatabaseNavigatorTreeFilterObjectType> getSupportedObjectTypes() {
    }
        }

        boolean first = true;
    ) {
    protected DBPProject getSelectedProject() {
    protected boolean isFolderVisible(DBNLocalFolder folder) {
    private final DBPProject selectedProject;
        this(parent, runnableContext, style, false);

            };
        DBNNode rootNode = this.getRootNode();
        if ((style & SWT.CHECK) != 0) {
                    treeViewer.reveal(dsNode);
//            dataSourceTree.getViewer().reveal(node);
    }
                    return isElementAccepted(element);
                return isElementAccepted(element);

        for (Object element : dataSourceTree.getCheckboxViewer().getCheckedElements()) {

            });
    }
import org.jkiss.dbeaver.model.struct.*;
            viewer.addDoubleClickListener(event ->
                case DBNDatabaseFolder folder -> isDatabaseFolderVisible(folder);
 * You may obtain a copy of the License at
    }
        return checkboxTreeManager;
        if (enableFilter) {
        if (element instanceof DBNNode) {
        if (element instanceof TreeNodeSpecial) {
            checkboxTreeManager = new DatabaseObjectsTreeManager(runnableContext, viewer,
 * See the License for the specific language governing permissions and
    }
    }
    private final DatabaseNavigatorTree dataSourceTree;
            final CheckboxTreeViewer viewer = dataSourceTree.getCheckboxViewer();
import org.eclipse.swt.layout.GridLayout;
                @Override
import java.util.ArrayList;
    public void setNavigatorFilter(INavigatorFilter navigatorFilter) {
    @NotNull
        final DBNProject projectNode = navigatorModel.getRoot().getProjectNode(selectedProject);
            if (revealAll) {
            }
        }
            new StructuredSelection(nodes), true);
                checkboxTreeViewer.setChecked(node, true);
        dataSourceTree.setNavigatorFilter(navigatorFilter);
        List<DBNNode> result = new ArrayList<>(checkedElements.length);

                default -> false;
        }
            @Override
            dataSourceTree.getViewer().addFilter(new ViewerFilter() {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        dataSourceTree = new DatabaseNavigatorTree(this, rootNode, style, false, navigatorFilter);

        GridData gd = new GridData(GridData.FILL_BOTH);

    }
    }

    public void setSelection(List<? extends DBNNode> nodes) {
            {
import org.eclipse.swt.SWT;
    protected void onSelectionChange(Object element) {
        }
        }
    protected boolean isDatabaseFolderVisible(DBNDatabaseFolder folder) {
        if (treeViewer instanceof CheckboxTreeViewer) {
        return obj instanceof DBSInstance ||

    public DatabaseNavigatorTree getNavigatorTree() {
        GridLayout gl = new GridLayout(1, true);
        boolean enableFilter

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                result.add(nodes);
import org.jkiss.dbeaver.model.app.DBPProject;

import java.util.Collection;
 * DBeaver - Universal Database Manager
        return true;
import org.jkiss.dbeaver.model.navigator.*;
import org.eclipse.swt.widgets.Composite;
 *


    }
import org.jkiss.code.NotNull;
        DatabaseNavigatorTreeFilter navigatorFilter = enableFilter ? createNavigatorFilter() : null;

                    viewer.getChecked(firstElement),
                case DBNProjectDatabases ignored -> true;
    public ISelection getSelection() {
                case DBNDataSource dataSource -> isDataSourceVisible(dataSource);
                    true);

    }
        return new DatabaseNavigatorTreeFilter() {
                return true;
    @Nullable
    public DatabaseObjectsSelectorPanel(
import org.eclipse.swt.layout.GridData;
    public void checkNodes(Collection<? extends DBNNode> nodes, boolean revealAll) {
    }

    }
    protected boolean isDatabaseObjectVisible(DBSObject obj) {
        gl.marginWidth = 0;
 * limitations under the License.
        }
                case DBSWrapper wrapper -> isDatabaseObjectVisible(wrapper.getObject());
    }
        return dataSourceTree;
        return false;
                ((IStructuredSelection)event.getSelection()).getFirstElement()));
                    new Object[]{firstElement},
            }
        DBNModel navigatorModel = selectedProject.getNavigatorModel();

            setLayoutData(new GridData(GridData.FILL_BOTH));
                }
    @NotNull
                DBSEntity.class.isAssignableFrom(folderItemsClass));
    protected boolean isElementAccepted(@Nullable Object element) {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
                treeViewer.reveal(node);
        Class<? extends DBSObject> folderItemsClass = folder.getChildrenClass();
        if (!enableFilter) {
        return folderItemsClass != null &&
    public DBPProject getProject() {
        };
        dataSourceTree.getViewer().refresh();
    }
        setLayout(gl);
        return true;

        super(parent, SWT.NONE);

import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    public DatabaseObjectsTreeManager getCheckboxTreeManager() {
            return switch (element) {
            }
    public DatabaseObjectsSelectorPanel(@NotNull Composite parent, @NotNull DBRRunnableContext runnableContext, int style) {


            public boolean select(Object element) {
            viewer.addCheckStateListener(event -> onSelectionChange(event.getElement()));

                }

            obj instanceof DBSObjectContainer ||
            checkboxTreeManager.updateCheckStates();
 */
                case DBNLocalFolder localFolder -> isFolderVisible(localFolder);
    public void addSelectionListener(ISelectionChangedListener listener) {
//        for (DBNNode node : nodes) {
        DBNNode rootNode = projectNode == null ? navigatorModel.getRoot() : projectNode.getDatabases();

            });
    }
    }
    public boolean hasCheckedNodes() {
