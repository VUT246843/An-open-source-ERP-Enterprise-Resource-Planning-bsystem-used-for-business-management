        }
            if (selItem instanceof DBNNode) {
            } else {
        @Nullable final IWorkbenchSite workbenchSite,
    ) {
    public static DatabaseNavigatorTree getNavigatorTree(@NotNull ExecutionEvent event) {
                            id.startsWith("team.main"))  // $NON-NLS-0$
        @NotNull final Viewer viewer,
                    result.add(selectedObject);

        @NotNull final ISelectionProvider selectionProvider,
            manager.add(new Separator());
    public static void executeNodeAction(DBXTreeNodeHandler.Action action, Object node, Map<String, Object> parameters, IServiceLocator serviceLocator) {
    public static void addStandardMenuItem(@Nullable IWorkbenchSite workbenchSite, @NotNull IMenuManager manager, @NotNull ISelectionProvider selectionProvider) {

        }
        return result;
import org.eclipse.swt.events.MenuEvent;
                        nodeFilter.addExclude(node.getNodeDisplayName());

import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
        if (activePart instanceof NavigatorViewBase) {
            window);

        activePart = activePage.findView(ProjectNavigatorView.VIEW_ID);
                if (executionContext != null) {
                    activeProject = executionContext.getDataSource().getContainer().getRegistry().getProject();
                    if (exclude) {
                    try {
        if (activeEditor instanceof DBPContextProvider && dbsObject != null) {
    public static DBNNode getSelectedNode(ISelectionProvider selectionProvider)
                    entry.getValue(),
                            id.startsWith("replaceWithMenu") ||
                        dbObject.getDataSource().getContainer().getPreferenceStore().getInt(ModelPreferences.CONNECTION_OPEN_TIMEOUT));
        return getSelectedNode(selectionProvider.getSelection());
     * @param element ui element
            }
        }
        } else {
            IWorkbenchPartSite partSite = UIUtils.getWorkbenchPartSite(locator);
                if (PreferencesUtil.hasPropertiesContributors(firstElement) && firstElement instanceof DBNResource) {
            if (dataSource != null) {
    private static void addSetDefaultObjectAction(IWorkbenchSite workbenchSite, IMenuManager manager, DBNNode selectedNode) {

        @NotNull final IMenuListener menuListener)
        @NotNull ISelectionProvider selectionProvider)
            for (Map.Entry<DBNDatabaseNode, DBSObjectFilter> entry : folders.entrySet()) {
        }
            }
import org.eclipse.swt.widgets.MenuItem;
            }
    public static void addDragAndDropSupport(final Viewer viewer) {


                    if ((resource instanceof IFolder || resource instanceof EFSNIOResource) &&
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionEvent;


            selection = null;


    }
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
    public static DBSObject getSelectedObject(ISelection selection)
        return null;
        NavigatorViewBase nodeView;
                    IResource resource = node.getAdapter(IResource.class);
        final Control control = viewer.getControl();
            if (handler != null && handler.getPerform() == DBXTreeNodeHandler.Perform.command && !CommonUtils.isEmpty(handler.getCommand())) {
                    String commandID = NavigatorUtils.getNodeActionCommand(
            ((IWorkbenchPartSite)workbenchSite).registerContextMenu(menuMgr, viewer);
            for (DBPDataSourceContainer ds : changedContainers) {
        } catch (Exception e) {
            // do nothing
            } else {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @NotNull final Viewer viewer,
        if (locator != null) {
    public static String getNodeActionCommand(DBXTreeNodeHandler.Action action, Object node, String defCommand) {
        manager.add(new GroupMarker(IActionConstants.MB_ADDITIONS_END));
                    DBPDataSourceContainer container = ((DBPDataSourceContainerProvider) activePart).getDataSourceContainer();
        if (enableDrag) {
                    final DBSObject dbObject = dbsObject;
        } catch (DBException e) {
            return null;
import org.eclipse.swt.dnd.*;
        }
    }

import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
                            if (itemData instanceof IContributionItem contributionItem) {
            int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;
            }
        } else {
                    id.startsWith("addFromHistoryAction")) { // $NON-NLS-0$
    }
                if (navigatorTree != null) {
        if (selection == null || selection.isEmpty()) {
            }
    public static void addContextMenu(
                if (((objectManager.getSupportedFeatures() & INavigatorObjectManager.FEATURE_OPEN)) != 0) {
                    openEntityEditor(node, window, parameters);
        ) {
            return editor.getDatabaseObject();
                DBCExecutionContext executionContext = contextProvider.getExecutionContext();
            }
    public static void addContextMenu(final IWorkbenchSite workbenchSite, final Viewer viewer) {


            return null;
            manager.add(ActionUtils.makeCommandContribution(workbenchSite, NavigatorCommands.CMD_OBJECT_SET_DEFAULT));
            public void menuShown(MenuEvent e) {
            // Save folders
    }

                throw new DBException("Do not know how to open node '" + node + "'");
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (selectedNode != null && !selectedNode.isLocked() && workbenchSite != null) {
    @Nullable
        manager.add(new GroupMarker(NavigatorCommands.GROUP_NAVIGATOR_ADDITIONS_END));
        if (!(selection instanceof IStructuredSelection structuredSelection)) {
            source.addDragListener(new NavigatorDragSourceListener(viewer));
import org.eclipse.ui.part.IPageSite;
            DBCExecutionContext navExecutionContext = null;
                    item.dispose();
                            Object itemData = item.getData();
            defCommandId = NavigatorCommands.CMD_OBJECT_OPEN;
     * @return node or null
        }
                if (selectedObject != null) {
        if (activeProject == null) {
            DatabaseEditorContext editorContext = new DatabaseEditorContextBase(ds, dbsObject);
        }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
        try {
import org.jkiss.dbeaver.ui.IActionConstants;
        DatabaseNavigatorTree tree = DatabaseNavigatorTree.getFromShell(Display.getCurrent());
        return null;
                        addSetActive = true;
                // TextTransfer should be the last when using Wayland
                                    menu.setDefaultItem(item);
import org.jkiss.dbeaver.ui.dnd.TreeNodeTransfer;
            if (itemData instanceof IContributionItem contribution) {
                    {
                    if (nodeFilter == null) {
import org.jkiss.dbeaver.ui.editors.MultiPageDatabaseEditor;
                        continue;
        if (addSetActive) {
        }
        if (part == null) {
            if (node instanceof DBNResource resource) {
                if (contextDefaults != null) {

            return null;
                manager.add(ActionUtils.makeCommandContribution(workbenchSite, IWorkbenchCommandConstants.FILE_REFRESH));
            if (selectedObject instanceof ContextMenuTreeNodeSpecial node) {
            for (Iterator iter = ((IStructuredSelection)selection).iterator(); iter.hasNext(); ) {
        if (enableDrop) {
 * you may not use this file except in compliance with the License.
                FileTransfer.getInstance()
    {
                                throw new InvocationTargetException(e);

        List<DBSObject> result = new ArrayList<>();
                                    editorContextDefaults.setDefaultCatalog(monitor, (DBSCatalog) dbObject, null);
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
import org.jkiss.dbeaver.Log;
                }
                }
        IWorkbenchPart activePart = UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart();

    public static DBSObject getCurrentDatabaseObject() {

                    ) {
            };
                }
import org.jkiss.dbeaver.ModelPreferences;

import org.jkiss.dbeaver.DBException;
                return (DBNNode) selectedObject;
            dropTarget.setTransfer(TreeNodeTransfer.getInstance(), FileTransfer.getInstance());
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
     * Find selected node for specified UI element
        }
            return null;
                    }
        return defCommand;
import org.eclipse.ui.handlers.HandlerUtil;

    public static List<DBSObject> getSelectedObjects(ISelection selection)
 * Copyright (C) 2010-2026 DBeaver Corp and others
            return false;
        menuMgr.addMenuListener(manager -> {
        if (navigatorViewer == null) {
                }
        if (selection instanceof IStructuredSelection structuredSelection) {
        return createContextMenu(workbenchSite, viewer, viewer, menuListener);
import java.util.*;
import org.jkiss.code.NotNull;
        }
import org.eclipse.jface.action.*;
    public static MenuManager createContextMenu(
                resourceHandler.openResource(resource.getResource());
    }
            }
        DBPDataSourceContainer ds = databaseNode.getDataSourceContainer();
    }
                navExecutionContext = DBUtils.getOrOpenDefaultContext(dbsObject, false);
        if (activePart == null) {
                        }, "Set active object",
                DatabaseObjectTransfer.getInstance(),

        }
                if (node != null) {
                                monitor.beginTask("Change default object", 1);
            for (Object selectedObject : (IStructuredSelection) selection) {
 * See the License for the specific language governing permissions and
    }
        }
        }
            Object itemData = item.getData();
                        nodeFilter = parentNode.getNodeFilter(nodeMeta, true);
                                }
    }
                workbenchWindow.getActivePage().bringToTop(nodeView);
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        }
                        DBXTreeItem meta = DBNUtils.getValidItemsMeta(monitor, node);
                        }
                    } else {
 */
        } else if (workbenchSite instanceof IPageSite) {
        return null;
                Menu menu = (Menu) e.widget;
                    }
            public void menuHidden(MenuEvent e) {
        final DBNNode selectedNode = getSelectedNode(selectionProvider);
            }
                    }
            CommonUtils.toString(activePage, null),
        if (selection.isEmpty()) {
    public static DBPProject getSelectedProject(ISelection currentSelection, IWorkbenchPart activePart) {

        }
        if (nodeView != null) {
                        folders.put(parentNode, nodeFilter);

        return null;

        return getNavigatorTree(HandlerUtil.getActiveWorkbenchWindow(event));
    }
                    nodeMeta,
import org.jkiss.dbeaver.model.struct.DBSObject;
    public static boolean syncEditorWithNavigator(INavigatorModelView navigatorView, IEditorPart activeEditor) {
import org.eclipse.ui.dialogs.PreferencesUtil;
                return handler.getCommand();
 * Unless required by applicable law or agreed to in writing, software
        Menu menu = menuMgr.createContextMenu(control);
                        for (MenuItem item : menu.getItems()) {
import java.nio.file.Path;
                                    monitor.subTask("Change default catalog");
                        nodeFilter.addInclude(node.getNodeDisplayName());

        if (selectedNode != null && !selectedNode.isLocked() && workbenchSite != null) {
        return menuMgr;
                        DBXTreeNodeHandler.Action.open,
            DropTarget dropTarget = new DropTarget(viewer.getControl(), DND.DROP_MOVE);
            ISelectionProvider selectionProvider = activePart.getSite().getSelectionProvider();
    }
import org.eclipse.ui.part.EditorInputTransfer;
    @Nullable

                    nodeView = (NavigatorViewBase) workbenchWindow.getActivePage().showView(ProjectNavigatorView.VIEW_ID);
        }
import org.jkiss.dbeaver.model.navigator.*;

    }
                }
        } else if (activeEditor instanceof EntityEditor editor) {
import org.eclipse.ui.*;
                "Error while opening object '" + node + "'",
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        try {
            return false;
        @NotNull final Viewer viewer,
            ViewerColumnController<?, ?> columnController = ViewerColumnController.getFromControl(control);
        for (MenuItem item : menu.getItems()) {
    }
            Object selectedObject = structuredSelection.getFirstElement();
                if (id.startsWith("org.eclipse.debug") || // $NON-NLS-0$
    {
        if (selection.isEmpty()) {

            if (partSite != null && partSite.getPart() instanceof DatabaseNavigatorView view) {
            if (activePart instanceof DBPContextProvider contextProvider) {
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNodeHandler;
                changedContainers.add(targetNode.getDataSourceContainer());
            if (selectedNode.isPersisted()) {
            }
                return;
 *
    }
                            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    });
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.Nullable;
    public static void filterSelection(final ISelection selection, boolean exclude) {
            if (!workbenchWindow.getActivePage().isPartVisible(nodeView)) {
                "Error opening object",
                } else if (activePart instanceof DBPDataSourceContainerProvider) {
            return Collections.emptyList();
            ContextMenuTreeNodeSpecial specialNode = getSelectedSpecialNode(viewer.getSelection());
            INavigatorObjectManager objectManager = GeneralUtils.adapt(objectNode.getNodeObject(), INavigatorObjectManager.class);
        menuMgr.setRemoveAllWhenShown(true);

        }
            if (mainEditor instanceof ObjectPropertiesEditor objectPropertiesEditor) {
                if (!(item instanceof DBNDatabaseNode node)) {


    }

        } catch (PartInitException e) {
import org.jkiss.utils.ArrayUtils;
                DBCExecutionContextDefaults<?,?> contextDefaults = defaultContext.getContextDefaults();
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            DBXTreeNodeHandler handler = ((DBNDatabaseNode) node).getMeta().getHandler(action);
        });
        menu.addMenuListener(new MenuListener() {
                }
        DBPProject nodeProject = selectedNode.getOwnerProject();
import org.eclipse.ui.menus.UIElement;
            } else if (node instanceof DBNPathBase dbnPath) {
            DBPDataSource dataSource = ((DBNDatabaseNode) selectedNode).getDataSource();
                        node,
        if (currentSelection instanceof IStructuredSelection && !currentSelection.isEmpty()) {
                if (nodeView == null) {

                    if (nodeMeta == null) {
        }
import org.jkiss.dbeaver.ui.navigator.database.load.ContextMenuTreeNodeSpecial;
            }
    public static NavigatorViewBase getActiveNavigatorView(ExecutionEvent event) {
                return RuntimeUtils.getObjectAdapter(selectedObject, DBNNode.class);
            dropTarget.addDropListener(new NavigatorDropTargetListener(viewer));
                if (node != null && !node.isLocked() && node.allowsOpen()) {
import org.eclipse.swt.events.MenuListener;
                if (editorContextDefaults != null) {
        if (node instanceof DBNObjectNode objectNode) {
        ISelection selection;
        return NavigatorUtils.getSelectedProject(selection, activePart);
    public static DBPProject getSelectedProject() {
                    }
        }
                if (id == null) {
            if (specialNode != null) {
            }
                    objectManager.openObjectEditor(window, objectNode);
                removeUnrelatedMenuItems(menu, node);
    public static ContextMenuTreeNodeSpecial getSelectedSpecialNode(@Nullable ISelection selection) {
            DBCExecutionContext editorExecutionContext = ((DBPContextProvider) activeEditor).getExecutionContext();
            return NavigatorUtils.getSelectedNode(selectionProvider);

        }
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
            if (selectedObject instanceof DBNNode) {
        manager.add(new GroupMarker(NavigatorCommands.GROUP_TOOLS));
                    }
                                } else if (dbObject instanceof DBSSchema && dbObject != editorContextDefaults.getDefaultSchema()) {
import org.eclipse.core.resources.IFolder;
        final List<DBNNode> nodes = new ArrayList<>();
            return null;
        if (selection instanceof IStructuredSelection) {
        }
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
import org.eclipse.jface.viewers.*;
        if (action == DBXTreeNodeHandler.Action.open) {
        if (dsProvider.getDataSourceContainer() != ds) {
        if (selection instanceof IStructuredSelection) {
        // Add "Set active object" menu
        }
                nodeView = UIUtils.findView(workbenchWindow, ProjectNavigatorView.class);
}
        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
            }
        }
        @Nullable final IWorkbenchSite workbenchSite,
                if (selectedObject instanceof DBNNode) {
     */
    public static DatabaseNavigatorTree getNavigatorTree(@Nullable IServiceLocator locator) {
        }
        if (selectionProvider == null) {
                DBNDatabaseNode parentNode = node.getParentNode() instanceof DBNDatabaseNode parent ? parent : node;
        }
        IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
        ISelection selection = selectionProvider.getSelection();

        Viewer navigatorViewer = navigatorView.getNavigatorViewer();

        }
                DBCExecutionContext defaultContext = DBUtils.getDefaultContext(dataSource, false);
        if (selectionProvider != null) {
                    if ((selectedObject instanceof DBSCatalog && contextDefaults.supportsCatalogChange() && contextDefaults.getDefaultCatalog() != selectedObject) ||
                return objectPropertiesEditor.getDatabaseObject();
                    false);
        }
                                String contribId = contributionItem.getId();
                                if (contribId != null && contribId.equals(commandID)) {
                    } catch (Exception ex) {
            dbsObject = DBUtils.getParentOfType(DBSStructContainer.class, dbsObject);
    }

        }
                            } catch (DBCException e) {
                }
            }
    }
            if (dsNode.getOwnerProject() == DBWorkbench.getPlatform().getWorkspace().getActiveProject()) {

        }
                    }
                        (id.startsWith("compareWithMenu") || // $NON-NLS-0$
        }
            return;
            return tree;
import org.jkiss.dbeaver.ui.IDataSourceContainerUpdate;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        try {
    }
                    if (node != null) {
                    );
        manager.add(new GroupMarker(NavigatorCommands.GROUP_TOOLS_END));
                DBPResourceHandler resourceHandler = resource.getHandler();
                            nodeFilter = new DBSObjectFilter();
                openEntityEditor(node, window, parameters);
import org.jkiss.dbeaver.model.exec.DBCException;
                String id = contribution.getId();
                DatabaseNavigatorTree navigatorTree = getNavigatorTree(workbenchSite);
        openNavigatorNode(node, window, null);
            // Refresh all folders
                                    editorContextDefaults.setDefaultSchema(monitor, (DBSSchema) dbObject);
        activePart = activePage.findView(DatabaseNavigatorView.VIEW_ID);
 *
        ISelectionProvider selectionProvider = UIUtils.getSelectionProvider(element.getServiceLocator());
        }
            if (RuntimeUtils.isWayland()) {
            } catch (DBCException ignored) {
                }
            log.error(e);
        final IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
                    nodeView = (NavigatorViewBase) workbenchWindow.getActivePage().showView(DatabaseNavigatorView.VIEW_ID);
        }
                }
            Set<DBPDataSourceContainer> changedContainers = new HashSet<>();
    {
                // Add refresh button
            return null;
                }
                    manager.add(ActionUtils.makeCommandContribution(workbenchSite, IWorkbenchCommandConstants.FILE_PROPERTIES));
                ds.persistConfiguration();
                        NavigatorCommands.CMD_OBJECT_OPEN
                                monitor.worked(1);
            DBWorkbench.getPlatformUI().showError(
        @Nullable final IMenuListener menuListener
        return DBUtils.getFromObject(((IStructuredSelection)selection).getFirstElement());
        return Collections.unmodifiableList(nodes);
        manager.add(new Separator());
            nodeView.showNode(dsNode);

                } else {
        DBSObject dbsObject = databaseNode.getObject();

    @Nullable
                            try {
    private static void openEntityEditor(Object node, IWorkbenchWindow window, Map<?, ?> parameters) throws DBException {
                }
            Transfer[] dragTransferTypes = new Transfer[] {
                    continue;
 * limitations under the License.
import org.jkiss.dbeaver.model.rm.RMConstants;
                }
        String defCommandId = null;
        }
                                if (dbObject instanceof DBSCatalog && dbObject != editorContextDefaults.getDefaultCatalog()) {

                    }
                    continue;
            }
import org.jkiss.dbeaver.ui.navigator.dnd.NavigatorDragSourceListener;
                return;
import org.eclipse.swt.widgets.Control;
                        (selectedObject instanceof DBSSchema && contextDefaults.supportsSchemaChange() && contextDefaults.getDefaultSchema() != selectedObject))
            }
        executeNodeAction(action, node, null, serviceLocator);
    }
        return null;
        } else {
            }
            return null;
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
package org.jkiss.dbeaver.ui.navigator;
            // Add properties button
    }
                activeProject = ((DBNNode) selItem).getOwnerProjectOrNull();
            return Collections.emptyList();
import org.jkiss.dbeaver.model.fs.nio.EFSNIOResource;
            @Override
            return false;
            return null;
            Map<DBNDatabaseNode, DBSObjectFilter> folders = new HashMap<>();
                columnController.fillConfigMenu(manager);
 * You may obtain a copy of the License at

        String actionCommand = getNodeActionCommand(action, node, defCommandId);
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public static MenuManager createContextMenu(

                        }
    public static void executeNodeAction(DBXTreeNodeHandler.Action action, Object node, IServiceLocator serviceLocator) {
                DBCExecutionContextDefaults editorContextDefaults = editorExecutionContext.getContextDefaults();
    }
import org.jkiss.dbeaver.model.struct.DBSStructContainer;
                    DBSObjectFilter nodeFilter = folders.get(parentNode);
        if (!(dbsObject instanceof DBSStructContainer)) {
    {
                }
                menuListener.menuAboutToShow(manager);
        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
            if (navExecutionContext != null && editorExecutionContext != null) {
    public static DBNNode getSelectedNode(ISelection selection)
                return node;
            }
            Object selectedObject = ((IStructuredSelection)selection).getFirstElement();

            }
            }
    public static IStructuredSelection getSelectionFromPart(IWorkbenchPart part)
            }
        if (activeProject == null) {
        @Nullable final IWorkbenchSite workbenchSite,
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
                Object firstElement = ((IStructuredSelection) selection).getFirstElement();
import org.eclipse.swt.widgets.Menu;
                return view.getNavigatorTree();
                    RuntimeUtils.runTask(monitor -> {
            }
                DBNDatabaseNode targetNode = entry.getKey();
            if (columnController != null && columnController.isClickOnHeader()) {
            selection = selectionProvider == null ? null : selectionProvider.getSelection();

        }
                        return meta;
                if (!EditorUtils.openExternalFiles(new Path[]{ dbnPath.getPath() }, null, false, dbnPath)) {
        Object activePage = parameters == null ? null : parameters.get(MultiPageDatabaseEditor.PARAMETER_ACTIVE_PAGE);
                if (nodeView == null) {
            return (NavigatorViewBase) activePart;
    {
            addSetDefaultObjectAction(workbenchSite, manager, selectedNode);
            // Save configs

import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
    {
import org.jkiss.dbeaver.ui.editors.DatabaseEditorContext;
        }
        return activeProject;
        return true;
                        activeProject = container.getProject();
            } else if (node instanceof DBNNode baseNode && baseNode.allowsOpen()) {
                        item.dispose();
import org.jkiss.dbeaver.ui.editors.DatabaseEditorContextBase;
                targetNode.setNodeFilter(
import org.jkiss.dbeaver.model.*;
                manager.add(new Separator());
                        }
 */
                return;

            Object selItem = ((IStructuredSelection) currentSelection).getFirstElement();
import org.jkiss.dbeaver.ui.navigator.dnd.NavigatorDropTargetListener;
    }
            DBSObject selectedObject = ((DBNDatabaseNode) selectedNode).getObject();
            }
            DBWorkbench.getPlatformUI().showError("Can't open view", "Error opening navigator view", e);

            return;
                DBNNode node = getSelectedNode(viewer.getSelection());
        IEditorPart activeEditor = activePage.getActiveEditor();
    }
        }
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            }
            @Override
                    nodeFilter.setEnabled(true);
            manager.add(new Separator());
                            meta = DBNUtils.getValidItemsMeta(monitor, parentNode);
        }
        return (IStructuredSelection)selection;

    }
import org.jkiss.dbeaver.ui.editors.entity.properties.ObjectPropertiesEditor;
                        nodes.add(node);
        if (!(selectedNode instanceof DBNDatabaseNode databaseNode)
        control.setMenu(menu);
                }
import org.jkiss.dbeaver.ui.dnd.DatabaseObjectTransfer;
    public static void addDragAndDropSupport(final Viewer viewer, boolean enableDrag, boolean enableDrop) {

import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorView;

        boolean addSetActive = false;
                    // Get contribution item from menu item and check it's ID
    }
        if (activePart instanceof NavigatorViewBase && activePage.isPartVisible(activePart)) {
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
        }
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
            for (Object item : structuredSelection.toArray()) {
        NavigatorHandlerObjectOpen.openEntityEditor(
                TreeNodeTransfer.getInstance(),
        final MenuManager menuMgr = new MenuManager();
        if (activeEditor instanceof ObjectPropertiesEditor editor) {
    {
                            }
        }

    public static DBNNode getSelectedNode(UIElement element)
    }
                DBSObject selectedObject = DBUtils.getFromObject(iter.next());
                    if (container != null) {
            dsProvider.setDataSourceContainer(ds);

                EditorInputTransfer.getInstance(),
        if (workbenchSite instanceof IWorkbenchPartSite) {
            if (menuListener != null) {
        if (activePart instanceof NavigatorViewBase && activePage.isPartVisible(activePart)) {
            // TODO: implement some other behavior
            if (objectManager != null) {
                {
                e);
        final ISelection selection = selectionProvider.getSelection();
    }
 *
/*
                }
                TextTransfer.getInstance(),
    }
        if (selectionProvider == null) {

            NavigatorHandlerRefresh.refreshNavigator(folders.keySet());
    /**
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerRefresh;
        addContextMenu(workbenchSite, viewer, viewer);
            }
        if (selectedNode.isPersisted() && selectedNode instanceof DBNDatabaseNode && !(selectedNode instanceof DBNDatabaseFolder) && ((DBNDatabaseNode)selectedNode).getObject() != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.jkiss.dbeaver.ui.navigator.project.ProjectNavigatorView;
import org.eclipse.swt.widgets.Display;
import org.jkiss.dbeaver.ui.ActionUtils;
                    // Dirty hack
/**
import java.lang.reflect.InvocationTargetException;
                }
        }

    public static List<DBNNode> getSelectedNodes(@NotNull ISelection selection) {

        }
    }
                    }
    public static void openNavigatorNode(Object node, IWorkbenchWindow window) {
        }
import org.eclipse.ui.services.IServiceLocator;
            }
            }
            ActionUtils.runCommand(actionCommand, new StructuredSelection(node), parameters, serviceLocator);
    @Nullable
    {
                DBXTreeItem nodeMeta = UIUtils.runWithMonitor(monitor -> DBNUtils.getValidItemsMeta(monitor, targetNode));
        addDragAndDropSupport(viewer, true, true);
            } else if (selectedObject != null) {
                        if (meta == null && node != parentNode) {
        }
            (DBNNode) node,
                }
import org.eclipse.core.resources.IResource;
            addStandardMenuItem(workbenchSite, manager, selectionProvider);
        if (selection instanceof IStructuredSelection) {
        }
        if (node instanceof DBNDatabaseNode) {
    public static void openNavigatorNode(Object node, IWorkbenchWindow window, Map<?, ?> parameters) {
                    DBXTreeItem nodeMeta = UIUtils.runWithMonitor(monitor -> {

import org.jkiss.dbeaver.model.app.DBPProject;
            log.error("Invalid selection type: " + selection);
            final DragSource source = new DragSource(viewer.getControl(), operations);
    private static final Log log = Log.getLog(NavigatorUtils.class);
        }
                nodeView = UIUtils.findView(workbenchWindow, DatabaseNavigatorView.class);
            }
        }
                    DBNNode node = RuntimeUtils.getObjectAdapter(selectedObject, DBNNode.class);
            activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
            ((IPageSite)workbenchSite).registerContextMenu("navigatorMenu", menuMgr, viewer);
        }
        if (!(activeEditor instanceof IDataSourceContainerUpdate dsProvider)) {
            IEditorPart mainEditor = editor.getActiveEditor();
                    nodes.add((DBNNode) selectedObject);
    }
            return (NavigatorViewBase) activePart;
                    specialNode.fillContextMenu(menuMgr, navigatorTree);
                        log.debug(ex);
                                }
            source.setTransfer(dragTransferTypes);
            || (nodeProject != null && !nodeProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT))
                ArrayUtils.reverse(dragTransferTypes);
        if (selection.isEmpty()) {
    public static void showNodeInNavigator(DBNDatabaseNode dsNode) {
        if (actionCommand != null) {
    }
    private static void removeUnrelatedMenuItems(Menu menu, DBNNode node) {

            try {
        });
    }
                        if (nodeFilter == null) {
            return (NavigatorViewBase) activePart;
        DBPProject activeProject = null;
                                    monitor.subTask("Change default schema");
            EditorUtils.setInputDataSource(activeEditor.getEditorInput(), editorContext);
    @Nullable
        DBNNode selectedNode = getSelectedNode(navigatorViewer.getSelection());
public class NavigatorUtils {
    }

                                monitor.done();

        MenuManager menuMgr = createContextMenu(workbenchSite, viewer, selectionProvider, null);
        manager.add(new GroupMarker(NavigatorCommands.GROUP_NAVIGATOR_ADDITIONS));
        if (tree != null) {
        ISelectionProvider selectionProvider = part.getSite().getSelectionProvider();
            if (selection instanceof IStructuredSelection) {
 * Navigator utils
