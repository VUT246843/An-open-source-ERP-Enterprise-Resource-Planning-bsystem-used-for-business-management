import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                        return null;
                    item.setText(ActionUtils.getLabelWithIndexMnemonic(item.getText(), index));

            Class<?> nodeItemClass = node.getObject().getClass();
            node = RuntimeUtils.getObjectAdapter(selectedObject, DBNNode.class);
    private static IContributionItem makeCreateContributionItem(
    private void showPopupMenu(@NotNull ExecutionEvent event, @NotNull DBNNode node) throws ExecutionException {
            menuManager.dispose();
            if (itemTypes != null) {
        }
import org.jkiss.dbeaver.model.fs.DBFFileStoreProvider;
        if (menuManager != null) {
        @NotNull List<IContributionItem> createActions,
                {
                        .filter(Objects::nonNull)
        ) {
        Class<?> objectClass = node.getChildrenClass(childMeta);
        }
import org.jkiss.dbeaver.model.DBPDataSourcePermission;
                    index += 1;
                return EMPTY_MENU;
                }
            node == null || ObjectPropertyTester.nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
        return null;
            addDatabaseNodeCreateItems(site, createActions, dbNode);

                        IContributionItem item = makeCreateContributionItem(
                            break;
                        }
                        if (isCreateSupported(node, itemClass)) {
                    }
            return;
                }
        }
                    nodeClass = dbFolder.getChildrenClass();
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        }
                }
        if (objectClass != null) {
                            nodeItemClass.getName(),

import org.eclipse.core.commands.ParameterizedCommand;
        parameters.put(NavigatorCommands.PARAM_OBJECT_TYPE_NAME, objectTypeName);
        if (part == null || activeShell == null || focusControl == null) {
            if (objectType != null) {

            IContributionItem item = makeCreateContributionItem(
                UIIcon.SQL_NEW_CONNECTION,
    }
import org.jkiss.dbeaver.ui.UIUtils;
            }
                false
            return;

        final ISelection selection = HandlerUtil.getCurrentSelection(event);
            if (activePart == null) {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                    } else if (childMeta instanceof DBXTreeItem treeItem) {
            int index = 0;
import org.eclipse.core.resources.IResource;
    @Nullable

import org.eclipse.swt.widgets.MenuItem;
 *
            DBNNode node = getNodeFromSelection(selectionProvider.getSelection());
                            site,
    public static DBPImage getObjectTypeIcon(ISelectionProvider selectionProvider) {
import org.eclipse.osgi.util.NLS;
            element.setText(NLS.bind(UINavigatorMessages.actions_navigator_create_new, getObjectTypeName(element)));

            }
            element.setIcon(DBeaverIcons.getImageDescriptor(new DBIcon(objectIcon.toString())));

import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
    public static List<IContributionItem> fillCreateMenuItems(@Nullable IWorkbenchPartSite site, @Nullable DBNNode node) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        final Shell activeShell = HandlerUtil.getActiveShell(event);
                UINavigatorMessages.navigator_handler_object_create_file_other_text,
                    if (childMeta instanceof DBXTreeFolder) {
 * Dynamic menu "Create" fills elements with parameters. Direct contribution of create command will create nearest
            if (!createActions.isEmpty() && !(createActions.getLast() instanceof Separator)) {
import org.eclipse.swt.widgets.Control;
            } else {
                            node.getNodeTypeLabel(),
    public static String getObjectTypeName(UIElement element) {
import org.eclipse.ui.actions.CompoundContributionItem;
            }
    {
    }
                if (!CommonUtils.isEmpty(metaChildren)) {
                        if (command != null) {
                return EMPTY_MENU;
                for (IContributionItem item : actions) {
        }

 * You may obtain a copy of the License at

    private static final Log log = Log.getLog(NavigatorHandlerObjectCreateNew.class);
            {
        } else {
                }
        }));
        }
                        log.error("Error detecting new object type " + objectType, e);
import java.util.*;
                return EMPTY_MENU;
                    nodeClass = node.getChildrenClass(treeItem);
                    }
            if (isCreateSupported(
                        addChildNodeCreateItem(site, createActions, node, treeItem);
            DBNNode node = getNodeFromSelection(selectionProvider.getSelection());
import org.eclipse.swt.events.MenuListener;
        if (typeName != null) {
        }
            }
            DBXTreeFolder.ItemType[] itemTypes = folderMeta.getItemTypes();
                            nodeIcon,
        );
import org.eclipse.core.commands.ExecutionException;
        } else {
            // Dummy item. We need only count
                    if (item instanceof CommandContributionItem cci) {
                if (resource instanceof IProject && !DBWorkbench.isDistributed()) {
                    createActions.add(DUMMY_CONTRIBUTION_ITEM);
                DBPDataSourceContainer.class.getName(),
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;

                dbNode.getValueObject() : parentNode.getOwnerProject());
                nodeItemClass = DBPDataSourceContainer.class;
                        DBPImage nodeIcon = node.getNodeIconDefault();
                    newObjectType = dbNode.getMeta().getSource().getObjectClass(objectType);
    public void updateElement(UIElement element, Map parameters) {
                                site, itemType.getClassName(), itemType.getItemType(), itemType.getItemIcon(), false);
                }
            } else if (node instanceof DBNDatabaseFolder dbFolder) {

    }
                } else {
                    if (nodeClass == null || (childrenClass != null && nodeClass.isAssignableFrom(childrenClass))) {
    static DBNNode getNodeFromSelection(ISelection selection) {
                    } catch (ClassNotFoundException e) {
package org.jkiss.dbeaver.ui.navigator.actions;
            CommandContributionItem.STYLE_PUSH
        }
        }

        contextMenu.setVisible(true);
            }
    }
                        ));

        if (site == null) {
        return objectMaker != null && objectMaker.canCreateObject(
        Object typeName = parameters.get(NavigatorCommands.PARAM_OBJECT_TYPE_NAME);
        if (!updateUI) {
    @Override
                    try {
        boolean isFolder = CommonUtils.toBoolean(event.getParameter(NavigatorCommands.PARAM_OBJECT_TYPE_FOLDER));
import org.jkiss.dbeaver.model.DBIcon;

    private static IContributionItem makeCommandContributionItem(@Nullable IWorkbenchPartSite site, String commandId)
                }
 */
            // In case of nested folder, we don't want to unwrap it because the parent's icon will be used instead
        @Nullable IWorkbenchPartSite site,
    }
            if (activePage == null) {
                if (nodeClass == null) {

            final IResource resource = GeneralUtils.adapt(node, IResource.class);
            return DUMMY_CONTRIBUTION_ITEM;
                }
    public Object execute(ExecutionEvent event) throws ExecutionException {
            for (final MenuItem item : contextMenu.getItems()) {
        boolean isFolder
            if (node instanceof DBNDataSource) {
                            IContributionItem item = makeCreateContributionItem(
                image = DBIcon.TYPE_OBJECT;
                    createActions.add(makeCommandContributionItem(site, NavigatorCommands.CMD_CREATE_PROJECT));
        if (location != null) {
            if (DBPDataSourceContainer.class.isAssignableFrom(nodeItemClass)) {
                        .map(CommandContributionItem::getCommand)
        if (childMeta.isVirtual()) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.Nullable;

                        createActions.add(item);
                parentNode,
                    createActions.add(makeCommandContributionItem(site, NavigatorCommands.CMD_CREATE_RESOURCE_FILE));
import org.eclipse.jface.viewers.IStructuredSelection;
            if (node instanceof DBNContainer && !(node instanceof DBNDataSource)) {
            if (typeName != null) {
 * object type according to navigator selection.
            Object selectedObject = ((IStructuredSelection)selection).getFirstElement();
 *
        return node;

import org.jkiss.dbeaver.model.app.DBPResourceCreator;
        }
                return true;
            }
import org.eclipse.jface.action.Separator;
 *
                site,
                createActions.add(new Separator());
                    final ParameterizedCommand[] commands = fillCreateMenuItems(activePart.getSite(), node).stream()
        } else {
                    }
        String objectType = event.getParameter(NavigatorCommands.PARAM_OBJECT_TYPE);

                }
            }
                if (handler instanceof DBPResourceCreator
import org.eclipse.ui.menus.CommandContributionItem;
                // Test direct child node items

                    }
        boolean projectConnectionEditable =
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
    // If site is null then we need only item count. BAD CODE.
            } else {


import org.eclipse.jface.viewers.ISelection;
                List<IContributionItem> actions = fillCreateMenuItems(workbenchWindow.getActivePage().getActivePart().getSite(), node);
        @NotNull String objectTypeName,
                    && (handler.getFeatures(resource) & DBPResourceHandler.FEATURE_CREATE_FOLDER) != 0 && projectResourceEditable
            }
        }
                IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
            List<IContributionItem> createActions = fillCreateMenuItems(site, node);
                if (metaChildren.size() == 1 && metaChildren.getFirst() instanceof DBXTreeItem treeItem) {
            if (selectionProvider == null) {

        DBNNode node = NavigatorUtils.getSelectedNode(element);
        ISelectionProvider selectionProvider = UIUtils.getSelectionProvider(element.getServiceLocator());
import org.eclipse.ui.*;

            }
                    return metaChildren.getFirst().getIcon(null);
            if (!(node instanceof DBNDatabaseFolder) && node.getParentNode() instanceof DBNDatabaseFolder) {
                    site, objectClass.getName(), typeName, childMeta.getIcon(null), true);
                            false
    }
            if (!CommonUtils.isEmpty(metaChildren)) {
        if ((node instanceof DBNLocalFolder || node instanceof DBNProjectDatabases) && projectConnectionEditable) {
                // Do not add child folders
            NavigatorCommands.CMD_OBJECT_CREATE,
 * you may not use this file except in compliance with the License.

        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
                if (node instanceof DBNDatabaseNode dbNode) {
    public static class MenuCreateContributor extends CompoundContributionItem {
                        makeCreateContributionItem(
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.actions.ObjectPropertyTester;
                            typeName = command.getParameterMap().get(NavigatorCommands.PARAM_OBJECT_TYPE_NAME);
                        return null;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IContributionItem;
                        .toArray(ParameterizedCommand[]::new);

            parameters.put(NavigatorCommands.PARAM_OBJECT_TYPE_ICON, objectIcon.getLocation());
        @Nullable IWorkbenchPartSite site,
        }
        final Menu contextMenu = menuManager.createContextMenu(focusControl);

        for (IContributionItem item : fillCreateMenuItems(part.getSite(), node)) {
import org.jkiss.dbeaver.ui.ActionUtils;
                // Use interface instead of implementation.
        if (node != null) {
            if (!CommonUtils.isEmpty(childNodeMetas)) {
                null
        if (selection.isEmpty()) {
            } else {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            if (!isCreateSupported(node, objectClass)) {

        @Override
//                                }
    private static boolean isCreateSupported(DBNNode parentNode, Class<?> objectClass) {
    }
        }
            List<DBXTreeNode> childNodeMetas = node.getMeta().getChildren(node);
            NavigatorCommands.CMD_OBJECT_CREATE,
        if ((node instanceof DBNLocalFolder || node instanceof DBNProjectDatabases || node instanceof DBNDataSource)

                return false;
    }
                    } else if (commands.length > 1) {
                            if (typeName != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return false;
}
                return;
import org.eclipse.swt.widgets.Menu;
            }


    @Override
    public static final Separator DUMMY_CONTRIBUTION_ITEM = new Separator();
 * It can create object of specified type (in parameters) or for current selection.
                return null;
            parentNode instanceof DBNDatabaseNode dbNode ?
                            site, nodeClass.getName(), nodeType, nodeIcon, false);
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;

    ) {
                return node.getNodeIconDefault();
            if (node.getObject() == null) {
            DBPImage image = getObjectTypeIcon(selectionProvider);
                final List<DBXTreeNode> metaChildren = dbFolder.getMeta().getChildren(node);
        if (objectIcon != null) {
 * See the License for the specific language governing permissions and
        }
        if (node != null) {
        }
    }
                // Now add all child folders
            createActions.add(makeCommandContributionItem(site, NavigatorCommands.CMD_CREATE_LOCAL_FOLDER));
            }
                for (DBXTreeFolder.ItemType itemType : itemTypes) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
        if (node instanceof DBNDatabaseNode dbNode) {
    private static void addDatabaseNodeCreateItems(
        }
            IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
                            addChildNodeCreateItem(site, createActions, node, treeItem);
            }
                // No explicit object type. Try to detect from selection
                        // folder.getChildrenClass may return more precise type than node.getChildrenClass
        }
                site,
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.NotNull;
                } else {
        return createActions;
import org.eclipse.core.commands.ExecutionEvent;
            // Test explicit create types
                }
                if (site == null) {
        return new CommandContributionItem(params);
                if (nodeClass != null && nodeType != null) {

            DBXTreeFolder folderMeta = dbFolder.getMeta();
                        if (!CommonUtils.isEmpty(folderChildMeta) && folderChildMeta.size() == 1

            final DBPWorkspaceDesktop workspace = DBPPlatformDesktop.getInstance().getWorkspace();
            objectClass, DBEObjectMaker.class);

            menuManager.add(item);
            && projectConnectionEditable
 * distributed under the License is distributed on an "AS IS" BASIS,
            return ActionUtils.makeCommandContribution(site, commandId);
        }
                if (resource instanceof IContainer && !(resource instanceof DBFFileStoreProvider) && projectResourceEditable && !DBWorkbench.isDistributed()) {
import org.eclipse.ui.menus.UIElement;
                        .filter(item -> item instanceof CommandContributionItem)
            }
        if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
            }
/**
            parameters.put(NavigatorCommands.PARAM_OBJECT_TYPE_FOLDER, String.valueOf(true));
            IWorkbenchPart activePart = activePage.getActivePart();
                }

                        .map(item -> (CommandContributionItem) item)
        }
                createActions.add(new Separator());
                        .filter(command -> command.getId().contains(".create")) // All create commands allowed
                ) {
import org.jkiss.dbeaver.ui.UIIcon;
            }

            createActions.add(item);
            final List<DBXTreeNode> metaChildren = folderMeta.getChildren(node);
        DBNNode node = null;
import org.jkiss.dbeaver.model.DBPImage;
                        nodeClass = childrenClass;
            Class<?> newObjectType = null;
//                                    objectIcon = command.getParameterMap().get(NavigatorCommands.PARAM_OBJECT_TYPE_ICON);
        boolean projectResourceEditable =
 * Sorry, this is a bit over-complicated handler. Historical reasons.
            }
            if (image == null) {
                }
                for (DBXTreeNode childMeta : childNodeMetas) {
                        }
                                typeName = NLS.bind(UINavigatorMessages.actions_navigator_create_new, typeName);
                Class<?> nodeClass = null;
    private MenuManager menuManager;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        final Point location = ActionUtils.getLocationFromControl(activeShell, focusControl);
    }
            element.setIcon(DBeaverIcons.getImageDescriptor(image));
/*
        parameters.put(NavigatorCommands.PARAM_OBJECT_TYPE, objectType);
            DBNNode parentNode = node.getParentNode();
                return ((DBNContainer)node).getChildrenType();
        if (typeName == null) {
            if (resource != null) {
                    createActions.add(makeCommandContributionItem(site, NavigatorCommands.CMD_CREATE_FOLDER_LINK));
                    && (handler.getFeatures(resource) & DBPResourceCreator.FEATURE_CREATE_FILE) != 0 && projectResourceEditable
                        }
                            createActions.add(item);
        Map<String, String> parameters = new HashMap<>();
            createActions.add(ActionUtils.makeCommandContribution(
        private static final IContributionItem[] EMPTY_MENU = new IContributionItem[0];
                IContributionItem item = makeCreateContributionItem(
                    if (isCreateSupported(node, nodeClass)) {
            }
        return null;
            element.setText(typeName.toString());
        if (isFolder) {

 * limitations under the License.
import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
        if (node != null) {
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
import org.jkiss.dbeaver.ui.DBeaverIcons;
            return null;
                    }
                if (activePart != null) {
        if (selectionProvider == null) {
    ) {
                    createActions.add(
            );

                    DBPImage nodeIcon = node instanceof DBNDataSource ?
//                                if (!(node instanceof DBNDatabaseFolder)) {
 * Unless required by applicable law or agreed to in writing, software
            }
        }
                        ) {
                            }
        menuManager = new MenuManager();
                IWorkbenchCommandConstants.FILE_NEW,
import org.eclipse.swt.widgets.Shell;
                    createActions.add(makeCommandContributionItem(site, NavigatorCommands.CMD_CREATE_RESOURCE_FOLDER));
        protected IContributionItem[] getContributionItems() {
                ModelMessages.model_navigator_Connection,
                String nodeType = metaChildren.getFirst().getChildrenTypeLabel(node.getDataSource(), null);
        if (node instanceof DBNDatabaseFolder dbFolder) {
                return node.getNodeTypeLabel();
                                // Prepend "Create new" as it is a single node

            }

            }
        @NotNull DBNDatabaseNode node
        }
        if (site != null) {
                    if (itemClass != null) {
        }
                    Class<?> childrenClass = dbFolder.getChildrenClass();
import org.jkiss.dbeaver.model.navigator.*;
            if (!node.getDataSourceContainer().hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_METADATA)) {
        return false;
                return;
import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.viewers.ISelectionProvider;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        newObjectType = Class.forName(objectType);
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
            return createActions.toArray(new IContributionItem[0]);
        DBNNode node = getNodeFromSelection(selectionProvider.getSelection());
                }
                    }
        contextMenu.addMenuListener(MenuListener.menuShownAdapter(e -> {
public class NavigatorHandlerObjectCreateNew extends NavigatorHandlerObjectCreateBase implements IElementUpdater {
                        List<DBXTreeNode> folderChildMeta = childMeta.getChildren(node);
            String typeName = childMeta.getNodeTypeLabel(node.getDataSource(), null);
        Object objectIcon = parameters.get(NavigatorCommands.PARAM_OBJECT_TYPE_ICON);
            return DUMMY_CONTRIBUTION_ITEM;
        }
import org.jkiss.dbeaver.Log;
        return null;
                createActions.add(item);
            return;
import org.jkiss.dbeaver.model.rm.RMConstants;
            // Try to get type from active selection
            ISelectionProvider selectionProvider = site.getSelectionProvider();

        @Nullable DBPImage objectIcon,
                    Class<Object> itemClass = folderMeta.getSource().getObjectClass(itemType.getClassName(), Object.class);
    }
                        UIIcon.SQL_NEW_CONNECTION : node.getNodeIconDefault();
        } else {
            return;
            ));
            }
            if (node != null && !node.isDisposed()) {
                return UIIcon.SQL_CONNECT;
                // Otherwise ClassNotFoundException may happen
        DBNNode node = getNodeFromSelection(selection);
        }
                ) {
            IWorkbenchPartSite site = activePart.getSite();
import org.eclipse.jface.action.MenuManager;
                }
                node = node.getParentNode();
        final IWorkbenchPart part = HandlerUtil.getActivePartChecked(event);
                    if (commands.length == 1) {
            }
import org.eclipse.ui.menus.CommandContributionItemParameter;
                }
                                // Do not use object icon ()
            createNewObject(HandlerUtil.getActiveWorkbenchWindow(event), node, newObjectType, null, isFolder);
            if (site != null) {
                        ActionUtils.runCommand(commands[0].getId(), selection, commands[0].getParameterMap(), activePart.getSite());
        params.parameters = parameters;
                DBPResourceHandler handler = workspace.getResourceHandler(resource);
                }
        List<IContributionItem> createActions = new ArrayList<>();
                        ParameterizedCommand command = cci.getCommand();
            if (site == null) {
import org.eclipse.ui.commands.IElementUpdater;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
                    createActions.add(makeCommandContributionItem(site, NavigatorCommands.CMD_CREATE_FILE_LINK));
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
                if (CommonUtils.isNotEmpty(item.getText())) {
                            && folderChildMeta.getFirst() instanceof DBXTreeItem treeItem
        @NotNull String objectType,

            node == null || ObjectPropertyTester.nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
        DBEObjectMaker<?, ?> objectMaker = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
                if (handler != null
        }
            contextMenu.setLocation(location);
        if (objectIcon != null) {
        if (site == null) {
                        showPopupMenu(event, node);
        CommandContributionItemParameter params = new CommandContributionItemParameter(
                    }
        final Control focusControl = activeShell != null ? activeShell.getDisplay().getFocusControl() : null;
import org.eclipse.swt.graphics.Point;

            site,
        } else {
    }
 */
                nodeItemClass))
                }
        }
                return EMPTY_MENU;
import org.jkiss.dbeaver.model.messages.ModelMessages;
    private static boolean addChildNodeCreateItem(@Nullable IWorkbenchPartSite site, List<IContributionItem> createActions, DBNDatabaseNode node, DBXTreeItem childMeta) {
