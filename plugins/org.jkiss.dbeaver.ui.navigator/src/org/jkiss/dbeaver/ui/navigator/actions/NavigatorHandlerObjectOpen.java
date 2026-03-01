                String actionName = UINavigatorMessages.actions_navigator_open;
                        return ref.getEditor(true);
    public static IEditorPart openEntityEditor(
                if (node instanceof DBNDataSource && node.getOwnerProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
                    DBSObject object = ((DBNDatabaseNode) node).getObject();
        try {
        if (node == null) {
    public static IEditorPart openEntityEditor(DBSObject object)
            // If some modal dialog is open then we don't do this
        IWorkbenchWindow workbenchWindow,
                if (element instanceof DBNNode n) {
                        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_REFRESH_EDITORS_ON_OPEN)) {

                        label = actionName + " '" + StringUtils.truncateText(node.getNodeDisplayName(), 32) + "'"; //$NON-NLS-1$
        }
        return changed;
                    node = n;
                element.setText(label);
                } else if (node instanceof DBNDatabaseNode) {
                    return null;
                    if (selectedNode instanceof DBNDatabaseObject objectNode) {
        if (UIUtils.isInDialog()) {
                        DBUtils.getOrOpenDefaultContext(databaseObject, false);
        }
        @Nullable String defaultPageId,
                try {
                    actionName = UINavigatorMessages.actions_navigator_edit;
        final ISelectionProvider selectionProvider = UIUtils.getSelectionProvider(element.getServiceLocator());
                openConnectionEditor(workbenchWindow, dataSourceContainer);
    }
 * See the License for the specific language governing permissions and
            } else {
                }
import org.jkiss.dbeaver.model.DBUtils;
                log.error("Error refreshing database object", e);
    public static void openConnectionEditor(IWorkbenchWindow workbenchWindow, DBPDataSourceContainer dataSourceContainer) {
                        }
                        label = NLS.bind(actionName, node.getNodeTypeLabel()); //$NON-NLS-1$
                    NLS.bind(UINavigatorMessages.actions_navigator_open_editors_question,
            return;
                } else {
            }

                    } else {

import org.jkiss.dbeaver.model.navigator.*;
                        matches = ((INavigatorEditorInput) editorInput).getNavigatorNode() == node;
            if (defaultPageId == null) {
            if (dataSourceContainer.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
import org.eclipse.ui.IEditorInput;
                    }
import org.jkiss.dbeaver.model.rm.RMConstants;
                    // Set active page
                DBNNode node = null;
                if (!CommonUtils.equalObjects(editorInput.getAttribute(attr.getKey()), attr.getValue())) {
                    NavigatorUtils.openNavigatorNode(node, HandlerUtil.getActiveWorkbenchWindow(event), event.getParameters());
                if (settingsChanged) {
                        DatabaseNodeEditorInput editorInput = new DatabaseNodeEditorInput(dnNode);
                    if (editorInput instanceof DatabaseLazyEditorInput) {
                IEditorInput editorInput;
        return null;
    {
            }
import java.util.Map;
                if (databaseObject != null) {
        boolean changed = false;
                    if (pageEditor != null && pageEditor != ((EntityEditor) editor).getActiveEditor()) {
        IWorkbenchWindow workbenchWindow)
//                            object.getClass(),
                NodeEditorInput folderInput = new NodeEditorInput(selectedNode);

    public Object execute(ExecutionEvent event) throws ExecutionException {
                    }
                }
        }
                    return null;
            for (IEditorReference ref : workbenchWindow.getActivePage().getEditorReferences()) {
        }
    public static IEditorPart openEntityEditor(
                    editorInput.setAttribute(attr.getKey(), attr.getValue());
                    }
                    boolean matches;
                    DBSObject object = RuntimeUtils.getObjectAdapter(element, DBSObject.class);
import org.jkiss.dbeaver.model.exec.DBCException;
import org.eclipse.ui.IWorkbenchWindow;
                        ObjectEditorInput objectInput = new ObjectEditorInput(objectNode);
                }
import java.lang.reflect.InvocationTargetException;
                } else {
        if (!updateUI) {
    }
    public static IEditorPart openEntityEditor(
                            objectNode.getMeta().getEditorId());
            }
        }
                        return workbenchWindow.getActivePage().openEditor(
import org.jkiss.dbeaver.ui.editors.entity.FolderEditor;
                    if (matches) {
                    IEditorPart pageEditor = ((EntityEditor) editor).getPageEditor(defaultPageId);
        return openEntityEditor(selectedNode, defaultPageId, defaultFolderId, attributes, workbenchWindow, activate, false);
        if (defaultPageId != null && !CommonUtils.equalObjects(defaultPageId, editorInput.getDefaultPageId())) {
                }
                    }
                    if (((ITabbedFolderContainer) editor).switchFolder(defaultFolderId)) {
                }
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
                if (node != null) {
import org.eclipse.osgi.util.NLS;

                    if (object != null) {
    public static IEditorPart findEntityEditor(IWorkbenchWindow workbenchWindow, DBNNode node) {
                    ex);
                    }
    private static final Log log = Log.getLog(NavigatorHandlerObjectOpen.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final int MAX_OBJECT_SIZE_NO_CONFIRM = 3;

        DatabaseEditorInputFactory.setLookupEditor(true);
        if (selection instanceof IStructuredSelection structSelection) {
                            refreshDatabaseNode(dnNode);
            DBWorkbench.getPlatformUI()
                }
                if (editorInput instanceof INavigatorEditorInput) {
import org.eclipse.ui.handlers.HandlerUtil;
                        structSelection.size()))) {
            }
                    // Activate default folder
    private static void refreshDatabaseNode(@NotNull DBNDatabaseNode selectedNode) throws InvocationTargetException, InterruptedException {
            }
            DBNNode node = NavigatorUtils.getSelectedNode(selection);

        }
                    folderInput,
                        return workbenchWindow.getActivePage().openEditor(
    }
                if (defaultFolderId == null) {
                            objectInput,
}
        finally {
            if (selectedNode instanceof DBNDatabaseFolder && !(selectedNode.getParentNode() instanceof DBNDatabaseFolder) && selectedNode.getParentNode() instanceof DBNDatabaseNode) {
                    if (!databaseObject.isPersisted()) {
            serviceConnections.openConnectionEditor(dataSourceContainer, null);
                    workbenchWindow.getActivePage().activate(editor);
        if (serviceConnections != null) {
    {
 * You may obtain a copy of the License at
        });
                if (editorInput instanceof DatabaseEditorInput) {
                        actionName = UINavigatorMessages.actions_navigator_view;
        IWorkbenchWindow workbenchWindow,
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
//                        DBEObjectEditor objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
                }
                String label;
                    }

    {
                } else if (node.getAdapter(IResource.class) != null) {
                            editorInput,
                    NLS.bind(UINavigatorMessages.actions_navigator_open_editors_title, structSelection.size()),
                    log.debug("Unsupported object type: " + element);
                    continue;
                    DBWorkbench.getPlatformUI().showError("No object", "Node has no associated database object");
            }
        @Nullable String defaultPageId,
            }
import org.jkiss.dbeaver.DBException;
        @Nullable String defaultPageId,
            if (node != null) {
    ) {
        }
        if (!CommonUtils.isEmpty(attributes)) {
                } else {
    }
    @Override
import org.eclipse.ui.menus.UIElement;
        }
    }
                        if (!objectNode.isPersisted()) {
        return openEntityEditor(selectedNode, defaultPageId, null, null, workbenchWindow, true, true);
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        if (node != null) {
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolderContainer;
                }
import org.jkiss.dbeaver.ui.IRefreshablePart;
        final DBNDatabaseNode nodeToRefresh = selectedNode;
            for (Object element : structSelection) {
        if (defaultFolderId != null && !CommonUtils.equalObjects(defaultFolderId, editorInput.getDefaultFolderId())) {
    @Nullable
 *
                return workbenchWindow.getActivePage().openEditor(
        boolean connectionEditorAllowed
        if (selectionProvider != null) {
                    if (object != null) {
                    if (editor instanceof IRefreshablePart) {
                    defaultFolderId = selectedNode.getNodeTypeLabel();
        if (connectionEditorAllowed && selectedNode instanceof DBNDataSource) {
            return NavigatorHandlerObjectOpen.openEntityEditor(node, null, UIUtils.getActiveWorkbenchWindow());
                if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() > 1) {

import org.eclipse.core.commands.ExecutionException;
                DBSObject databaseObject = dnNode.getObject();
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.code.NotNull;
                            EntityEditor.class.getName());
                IEditorInput editorInput = editor.getEditorInput();
        @Nullable Map<String, Object> attributes,
        return null;
package org.jkiss.dbeaver.ui.navigator.actions;
                        ((IRefreshablePart) editor).refreshPart(selectedNode, true);
public class NavigatorHandlerObjectOpen extends NavigatorHandlerObjectBase implements IElementUpdater {
import org.eclipse.ui.commands.IElementUpdater;
            if (selectedNode instanceof DBNDatabaseNode dnNode) {
 *
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorDescriptor;

                if (workbenchWindow.getActivePage().getActiveEditor() != editor || activate) {
        }
 *

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.ui.editors.*;
        @Nullable Map<String, Object> attributes,
    @Override
        @NotNull DBNNode selectedNode,
import org.jkiss.dbeaver.Log;
        }
                if (editor instanceof ITabbedFolderContainer && defaultFolderId != null) {
                    FolderEditor.class.getName());
                } catch (Throwable e) {
            ISelection selection = selectionProvider.getSelection();
                    } else {
                        return null;
            DatabaseEditorInputFactory.setLookupEditor(false);
                        ((EntityEditor) editor).setActiveEditor(pageEditor);
            changed = true;
        DBNNode selectedNode,
            editorInput.setDefaultPageId(defaultPageId);
                    }
import org.eclipse.ui.IEditorPart;
        boolean activate)
            for (Map.Entry<String, Object> attr : attributes.entrySet()) {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
        } catch (Exception ex) {
 * Unless required by applicable law or agreed to in writing, software
            return null;
import org.jkiss.code.Nullable;
            final DBPDataSourceContainer dataSourceContainer = ((DBNDataSource)selectedNode).getDataSourceContainer();
        return null;
                    actionName = UINavigatorMessages.actions_navigator_error_dialog_open_resource_title;
        }
                }
 */
                    editorInput = ref.getEditorInput();

                defaultPageId = EntityEditorDescriptor.DEFAULT_OBJECT_EDITOR_ID;

                    try {
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!UIUtils.confirmAction(HandlerUtil.getActiveShell(event),
            }
            return null;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelectionProvider;
            try {

            }

                    }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                }
//                            DBEObjectEditor.class);
        }
                selectedNode = selectedNode.getParentNode();

/*
import org.jkiss.utils.CommonUtils;
                    settingsChanged = setInputAttributes((DatabaseEditorInput<?>) editorInput, defaultPageId, defaultFolderId, attributes);
    }
                    }
            }
                }
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
            if (editor != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                boolean settingsChanged = false;

                if (editor instanceof EntityEditor && defaultPageId != null) {
    }
        UIUtils.runInProgressService(monitor -> {
        @Nullable String defaultFolderId,
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    } else {

    public void updateElement(UIElement element, Map parameters)
        boolean activate,
                        //actionName = objectManager == null || !objectManager.canEditObject(object) ? UINavigatorMessages.actions_navigator_view : UINavigatorMessages.actions_navigator_edit;
                return null;
        @NotNull DBNNode selectedNode,
 * limitations under the License.
                    if (node.getAdapter(IResource.class) != null) {
            } catch (DBException e) {
                }
                        node = getNodeByObject(object);
                    "Can't open entity '" + selectedNode.getNodeDisplayName() + "'",
import org.eclipse.core.commands.ExecutionEvent;
            editorInput.setDefaultFolderId(defaultFolderId);
                    } catch (DBCException ignored) {
                    }
    {
                    changed = true;
            changed = true;
        }

                }
                        setInputAttributes(editorInput, defaultPageId, defaultFolderId, attributes);
import org.eclipse.jface.viewers.ISelection;
                    label = NLS.bind(actionName, UINavigatorMessages.actions_navigator__objects);
import org.eclipse.ui.IEditorReference;
                    }
                nodeToRefresh.refreshNode(monitor, nodeToRefresh);
                        setInputAttributes(objectInput, defaultPageId, defaultFolderId, attributes);
        try {
import org.jkiss.utils.StringUtils;
                        settingsChanged = true;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            return null;
                } else {
                }
    }
            if (structSelection.size() > MAX_OBJECT_SIZE_NO_CONFIRM) {
        DBNDatabaseNode node = NavigatorHandlerObjectOpen.getNodeByObject(object);

                        }
            return null;
 * DBeaver - Universal Database Manager
                return editor;
                .showError(UINavigatorMessages.actions_navigator_error_dialog_open_entity_title,
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                }
            IEditorPart editor = findEntityEditor(workbenchWindow, selectedNode);
        @Nullable String defaultFolderId,
        UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
    private static boolean setInputAttributes(DatabaseEditorInput<?> editorInput, String defaultPageId, String defaultFolderId, Map<String, Object> attributes) {
                        matches = node.getNodeUri().equals(((DatabaseLazyEditorInput) editorInput).getNodePath());
import org.jkiss.dbeaver.model.struct.DBSObject;
                        return null;
    }
