    public TreeViewer getNavigatorViewer() {
        // Hook context menu
            return adapter.cast(new PropertyPageStandard());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    implements INavigatorModelView, DBPDataSourceContainerProvider, DBPPreferenceListener
    @Override
import org.eclipse.swt.SWT;
    public void showNode(DBNNode node) {
        return tree;
import org.jkiss.utils.CommonUtils;
            @Override
                    );
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(this);
                    );
            public void mouseDown(MouseEvent e) {
        installDragAndDropSupport(navigatorTree);
        } else {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.eclipse.swt.events.MouseEvent;
                String name = node.getNodeDisplayName();
    /**

                }

    }
            }
                    NavigatorPreferences.DoubleClickBehavior dcBehaviorDefault = CommonUtils.valueOf(
                super.mouseDown(e);
    }
    }

    protected INavigatorFilter getNavigatorFilter() {

                    }
        );
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                                        serviceConnections.connectDataSource(dataSource, null);
 * you may not use this file except in compliance with the License.
            if (lastSelection instanceof DBNDataSource dataSourceNode) {
                            }
     * @return filter or null if no filtering is supported.
    }
            case NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS:
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        navigatorTree.getViewer().addSelectionChangedListener(
            public void mouseUp(MouseEvent e) {
                                }
                    } else {
    @Override
            case NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION:
                // Commented because it forced selection reset on connection expand

import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
        // Create tree
        if (!structSel.isEmpty()) {
            case ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY:
import org.eclipse.jface.viewers.IStructuredSelection;
}
     *
                                if (serviceSQL != null) {
{
                if (CommonUtils.isEmpty(desc)) {

import org.jkiss.dbeaver.ui.controls.PropertyPageStandard;
            case NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO:
                        toggleNode(viewer, node);
                    if (node instanceof DBNDatabaseNode && ((DBNDatabaseNode) node).getObject() instanceof DBSDataContainer) {
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.ui.UIExecutionQueue;
    @Override
    public void createPartControl(Composite parent) {
            false,
                                    serviceSQL.openRecentScript(dataSource);
                            case CONNECT: {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                                    } else {
                        NavigatorPreferences.DoubleClickBehavior.EDIT
            viewer.collapseToLevel(node, 1);
                } else if (node instanceof DBNDataSource) {
                tree.getViewer().getTree().redraw();
                        NavigatorPreferences.DoubleClickBehavior.class,
*/
import java.util.Map;
     */

            case ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST:
    public void preferenceChange(PreferenceChangeEvent event) {
                    getViewSite().getActionBars().getStatusLineManager().setMessage(name + " - " + desc);
                        }
            public void mouseDoubleClick(MouseEvent e) {
                        NavigatorPreferences.DoubleClickBehavior.class,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
    }
            }
            for (Object node : selection.toArray()) {
            return;
                                    }
                    boolean hasChildren = node instanceof DBNNode && ((DBNNode) node).hasChildren(true);



        });
        });
            IEditorPart activeEditor = UIUtils.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
                                UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
import org.eclipse.jface.viewers.TreeViewer;
                    }
                super.mouseDoubleClick(e);
            parent,

            if (activeEditor != null) {
        if (lastSelection instanceof DBNDatabaseNode databaseNode) {
    public void dispose() {
    }
            } else if (databaseNode.getObject() != null) {

                        DBPDataSourceContainer dataSource = ((DBNDataSource) node).getObject();
    public <T> T getAdapter(Class<T> adapter) {
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
            }
        return tree.getViewer();
            }
                break;
            }
    public static DBNModel getGlobalNavigatorModel() {
                return dataSourceNode.getDataSourceContainer();

                                break;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override

     * This is a callback that will allow us to create the viewer and initialize
        this.tree.setItemRenderer(new StatisticsNavigatorNodeRenderer(this));
                            parameters = Collections.singletonMap(MultiPageDatabaseEditor.PARAMETER_ACTIVE_PAGE, defaultEditorPageId);
        this.tree = createNavigatorTree(parent, null);
                        defaultEditorPageId = DBWorkbench.getPlatform().getPreferenceStore()
                break;
                getViewSite().getActionBars().getStatusLineManager().setMessage(null);
 */
        tree.showNode(node);
            case ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE:
    }
        // Add drag and drop support
        });
     */
        navigatorTree.getViewer().addDoubleClickListener(event -> {
 *     http://www.apache.org/licenses/LICENSE-2.0
                // Don't display status message for root node - it has no meaningful information
    public DatabaseNavigatorTree getNavigatorTree() {
import org.jkiss.code.NotNull;

    @Override
import org.eclipse.ui.contexts.IContextService;
    private void toggleNode(TreeViewer viewer, Object node) {
        String property = event.getProperty();
 * distributed under the License is distributed on an "AS IS" BASIS,
                }

        getSite().getService(IContextService.class).activateContext(INavigatorModelView.NAVIGATOR_CONTEXT_ID);
            }
                        if (!CommonUtils.isEmpty(defaultEditorPageId)) {




                if ((node instanceof DBNResource && ((DBNResource) node).getResource() instanceof IFolder)) {
        UIExecutionQueue.queueExec(() -> {
        return super.getAdapter(adapter);
 * limitations under the License.
                            }
        NavigatorUtils.addDragAndDropSupport(navigatorTree.getViewer());
import org.eclipse.core.resources.IFolder;
                                        serviceConnections.disconnectDataSource(dataSource);
            event -> onSelectionChange((IStructuredSelection) event.getSelection())
                            case SQL_EDITOR_NEW: {
                    if (hasChildren && dcBehaviorDefault == NavigatorPreferences.DoubleClickBehavior.EXPAND) {

                    navigatorTree.getViewer().setSelection(new StructuredSelection());
        switch (property) {
                        Map<String, Object> parameters = null;
                super.mouseUp(e);
    }
    }
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.MultiPageDatabaseEditor;
            rootNode,
            if (containers != null && containers.size() == 1) {
                        toggleNode(viewer, node);
        if (adapter == IPropertySheetPage.class) {
                        DBWorkbench.getPlatform().getPreferenceStore().getString(NavigatorPreferences.NAVIGATOR_CONNECTION_DOUBLE_CLICK),
            Collection<DBPDataSourceContainer> containers = resourceNode.getAssociatedDataSources();
/*
            if (!tree.isDisposed()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                        switch (dsBehaviorDefault) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            case ModelPreferences.NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS:
                if (node instanceof DBNDatabaseNode && !(node instanceof DBNDatabaseFolder)) {
import org.eclipse.ui.IEditorPart;
     * Navigator nodes filter.
        }
    /**
                                    serviceSQL.openNewScript(dataSource);
                    } else {
    private DatabaseNavigatorTree tree;
            @Override

            @Override
        return null;
        final DatabaseNavigatorTree navigatorTree = new DatabaseNavigatorTree(
                                break;
            viewer.expandToLevel(node, 1);
                if (item == null) {
            }
     * Passing the focus request to the viewer's control.
                    name = node.getNodeTypeLabel() + ": " + name;
    /**
                    if (dsBehaviorDefault == NavigatorPreferences.DoubleClickBehavior.EXPAND) {
                        NavigatorUtils.executeNodeAction(DBXTreeNodeHandler.Action.open, node, parameters, getSite());
     * Implementation returns true if element shouldn't be filtered (i.e. always visible).
                tree.setInput(getRootNode());
                String desc = node.getNodeDescription();
                }
        }
                NavigatorUtils.syncEditorWithNavigator(this, activeEditor);
            if (lastSelection instanceof DBNRoot) {
            case NavigatorPreferences.NAVIGATOR_COLOR_ALL_NODES:
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
                    getViewSite().getActionBars().getStatusLineManager().setMessage(name);
 * See the License for the specific language governing permissions and
        return SWT.MULTI | SWT.FULL_SELECTION;
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;

        super.dispose();

import org.eclipse.swt.events.MouseAdapter;
    private DatabaseNavigatorTree createNavigatorTree(Composite parent, DBNNode rootNode) {
     * it.
            IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
        navigatorTree.getViewer().getTree().addMouseListener(new MouseAdapter() {
                    toggleNode(viewer, node);
                } else {

        createTreeColumns(navigatorTree);
        }
    }
import org.jkiss.dbeaver.ModelPreferences;
    protected void installDragAndDropSupport(DatabaseNavigatorTree navigatorTree) {
                            }

                            case SQL_EDITOR: {
    @NotNull
                } else if (node instanceof TreeNodeSpecial) {
            case NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME:
        } else {
    private void onSelectionChange(IStructuredSelection structSel) {
                } else {
        }
    }
                    String defaultEditorPageId = null;
        getViewSite().setSelectionProvider(tree.getViewer());
                                UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
                                break;
                    NavigatorPreferences.DoubleClickBehavior dsBehaviorDefault = CommonUtils.valueOf(
                                if (serviceConnections != null) {
    protected NavigatorViewBase() {

    protected void createTreeColumns(DatabaseNavigatorTree tree) {
        return DBWorkbench.getPlatform().getNavigatorModel();
                                if (serviceSQL != null) {
        tree.getViewer().getControl().setFocus();
                        DBWorkbench.getPlatform().getPreferenceStore().getString(NavigatorPreferences.NAVIGATOR_OBJECT_DOUBLE_CLICK)
                Point point = new Point(e.x, e.y);
            lastSelection = structSel.getFirstElement();
import java.util.Collection;
                                break;

    @Nullable
            }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;

import org.eclipse.swt.widgets.Composite;

import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
                return containers.iterator().next();

            case NavigatorPreferences.NAVIGATOR_GROUP_BY_DRIVER:
        });

        }
        }
    public void setFocus() {
    }
        if (lastSelection instanceof DBNDatabaseNode && preferenceStore.getBoolean(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE)) {
            } else if (lastSelection instanceof DBNNode node) {
                    ((TreeNodeSpecial) node).handleDefaultAction(navigatorTree);
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;

 *
    }
    @Override
    }
                                UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    public DBPDataSourceContainer getDataSourceContainer() {

    }
     */
            event.doit = false;
import org.eclipse.ui.part.ViewPart;
                                NavigatorHandlerObjectOpen.openEntityEditor((DBNDataSource) node, null, UIUtils.getActiveWorkbenchWindow());
import org.eclipse.ui.views.properties.IPropertySheetPage;
        return null;
    protected int getTreeStyle() {
    }
/*
        if (Boolean.TRUE.equals(viewer.getExpandedState(node))) {
            lastSelection = null;
 *
            getNavigatorFilter()
                //Object node = selection.getFirstElement();
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNodeHandler;
        NavigatorUtils.addContextMenu(this.getSite(), navigatorTree.getViewer());
                tree.getViewer().refresh();
import java.util.Collections;
    private transient Object lastSelection;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

                            .getString(NavigatorPreferences.NAVIGATOR_DEFAULT_EDITOR_PAGE);
            getTreeStyle(),
        }
    }
public abstract class NavigatorViewBase extends ViewPart
                    }
                return dataSource == null ? null : dataSource.getContainer();
package org.jkiss.dbeaver.ui.navigator.database;
    }
import org.jkiss.dbeaver.model.navigator.*;
        navigatorTree.getViewer().getTree().addListener(SWT.MouseDoubleClick, event -> {
        DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(this);
            }
        if (CommonUtils.equalObjects(event.getOldValue(), event.getNewValue())) {
        );
        } else if (lastSelection instanceof DBNResource resourceNode) {
 * DBeaver - Universal Database Manager
                            case EDIT:
        super();
                } 
 *
        getSite().getService(IContextService.class).activateContext(INavigatorModelView.NAVIGATOR_VIEW_CONTEXT_ID);
                final DBPDataSource dataSource = databaseNode.getObject().getDataSource();
                                    if (dataSource.isConnected()) {
                                }
                TreeItem item = navigatorTree.getViewer().getTree().getItem(point);
                        }
                                }
    @NotNull
            TreeViewer viewer = tree.getViewer();
        return navigatorTree;
 * You may obtain a copy of the License at
