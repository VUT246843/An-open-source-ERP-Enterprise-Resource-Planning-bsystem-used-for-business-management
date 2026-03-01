                                    List<? extends DBSObject> dependentObjectsList = ((DBEObjectWithDependencies) objectManager).getDependentObjectsList(monitor, attribute);
                }
 * Unless required by applicable law or agreed to in writing, software
            // We cannot update labels/icons for context-dependent global actions
                confirmMessage = NLS.bind(UINavigatorMessages.confirm_deleting_dependent_one_object,
                    node.getNodeTypeLabel(),
        }
            if (dataSource == null) {
            return true;
            }
    @Override
import java.util.List;
            );
                        }
    @Override
    private static boolean deleteObjects(final IWorkbenchWindow window, NavigatorObjectsDeleter deleter, final List<?> selectedObjects) {
            if (selection instanceof IStructuredSelection structuredSelection && structuredSelection.size() == 1) {
import org.eclipse.core.commands.ExecutionException;
                }
                confirmMessage,
        if (containsNodesFromDifferentDataSources(objects)) {
                    if (constraint instanceof DBSEntityReferrer && index instanceof DBSEntityReferrer) {
                return false;
            return;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
import org.eclipse.ui.commands.IElementUpdater;
        }
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
        return false;
import org.jkiss.dbeaver.ui.dialogs.Reply;
import org.jkiss.utils.CommonUtils;
    public boolean isEnabled() {
                    UINavigatorMessages.search_dependencies_error_title, UINavigatorMessages.search_dependencies_error_message, e.getTargetException());
    private static void changeDependentObjectsList(@NotNull DBRProgressMonitor monitor, List<? extends DBSObject> dependentObjectsList) throws DBException {
        }
                        if (dbsObject instanceof DBSEntityAttribute) {
                                        for (Object object : dependentObjectsList) {
        List<DBNNode> dependentObjectsListNodes = new ArrayList<>();
import org.jkiss.dbeaver.model.navigator.*;
        }
            return;
            } else if (!dataSource.equals(currentDatasource)) {
                                    changeDependentObjectsList(monitor, dependentObjectsList);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            );
        }
            for (DBSObject constraint : constrList) {
                    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                for (DBSObject index : indexList) {
}
                return deleteObjects(window, deleter, selectedObjects);

                                    log.debug("Can't get object dependent list", e);
                                                } else {
            if (databaseNode instanceof  DBNDataSource) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (selectionProvider != null) {
        }
                dependentObjectsDeleter.delete();
        // Let's find this indexes and remove from dependent list
            return false;
                                    if (!CommonUtils.isEmpty(dependentObjectsList)) {

            return false;
            if (!(o instanceof DBNDatabaseNode)) {
import org.eclipse.jface.viewers.ISelectionProvider;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                                    log.warn("Node not found for object " + object);
            }
        if (!updateUI) {
                            dependentObjectsList.remove(index);
            }
                DBNNode node = NavigatorUtils.getSelectedNode(structuredSelection);
import org.eclipse.jface.viewers.ISelection;
    }
                    element.setText(NLS.bind(UINavigatorMessages.actions_navigator_delete, node.getNodeTypeLabel()));
                UINavigatorMessages.error_deleting_multiple_objects_from_different_datasources_title,
            ISelection selection = selectionProvider.getSelection();
                return true;

                return true;
            return true;
 *
                                }
                                                if (node != null) {
                UINavigatorMessages.error_deleting_multiple_objects_from_different_datasources_message
        }
            NavigatorObjectsDeleter dependentObjectsDeleter = NavigatorObjectsDeleter.of(dependentObjectsListNodes, window);
        final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
        for (Object o: objects) {
        final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
        final ISelectionProvider selectionProvider = UIUtils.getSelectionProvider(element.getServiceLocator());
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Some indexes in some databases in fact duplicate existing keys, and therefore deleting keys will automatically delete indexes on the database side
        if (reply == Reply.YES) {
            return null;
import org.jkiss.code.NotNull;

            }
 * See the License for the specific language governing permissions and
        if (reply == NavigatorNodesDeletionConfirmations.SHOW_SCRIPT) {
            Reply reply = NavigatorNodesDeletionConfirmations.confirm(
    }
            deleter.delete();
            DBWorkbench.getPlatformUI().showError(

import org.jkiss.dbeaver.ui.UIUtils;
                                            }
 * DBeaver - Universal Database Manager
        if (!UPDATE_GLOBAL_ACTION_LABELS) {
            if (persistCheck) {
                            DBSEntityAttribute attribute = (DBSEntityAttribute) dbsObject;
        Reply reply = NavigatorNodesDeletionConfirmations.confirm(window.getShell(), selectedObjects, deleter);
            }
    public static boolean tryDeleteObjects(@NotNull IWorkbenchWindow window, @NotNull List<?> objects) {
                                        }
                if (node != null) {
import java.util.stream.Collectors;
import org.eclipse.ui.IWorkbenchWindow;
            DBPDataSource currentDatasource;
        } catch (InterruptedException ignored) {
        }
                for (Object obj : selectedObjects) {
        if (confirmDependenciesDelete(window, selectedObjects)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            List<? extends DBSObject> constrList = dependentObjectsList.stream().filter(o -> o instanceof DBSTableConstraint).collect(Collectors.toList());
                UINavigatorMessages.confirm_deleting_dependent_objects_title,
        }
        } else {
            UIUtils.runInProgressService(monitor -> {
    }
import org.jkiss.dbeaver.model.edit.DBEObjectWithDependencies;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import java.lang.reflect.InvocationTargetException;
                                    }

        if (!CommonUtils.isEmpty(dependentObjectsListNodes)) {
    }
            } else {
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.menus.UIElement;
            }
    public void updateElement(UIElement element, Map parameters) {
                    }
        } catch (InvocationTargetException e) {
import java.util.ArrayList;
        } else {
        if (!CommonUtils.isEmpty(dependentObjectsList)) {
            DBNDatabaseNode databaseNode = (DBNDatabaseNode) o;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
        }
        return null;
            DBWorkbench.getPlatformUI().showError(

 * You may obtain a copy of the License at
                                            if (object instanceof DBSObject objToDelete) {
 * limitations under the License.
                currentDatasource = null;
                window.getShell(),
                        DBSObject dbsObject = ((DBNDatabaseItem) obj).getObject();
            if (dependentObjectsListNodes.size() == 1) {
        if (!(selection instanceof IStructuredSelection)) {
                        if (DBUtils.referrerMatches(monitor, (DBSEntityReferrer) constraint, DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) index))) {
            } else {
    private static boolean confirmDependenciesDelete(final IWorkbenchWindow window, final List<?> selectedObjects) {
    }
            List<? extends DBSObject> indexList = dependentObjectsList.stream().filter(o -> o instanceof DBSTableIndex).collect(Collectors.toList());
                currentDatasource = databaseNode.getDataSource();
import org.jkiss.dbeaver.model.DBUtils;
    }
            if (reply == Reply.YES) {
                    node.getNodeDisplayName());
import org.jkiss.dbeaver.DBException;
import java.util.Map;
                dataSource = currentDatasource;
            return deleteObjects(window, deleter, selectedObjects);
        tryDeleteObjects(window, structuredSelection.toList());
 */
            String confirmMessage;
import org.jkiss.dbeaver.model.DBPDataSource;
                }
                DBNDatabaseNode node = (DBNDatabaseNode) dependentObjectsListNodes.get(0);
import org.eclipse.osgi.util.NLS;
    }

import org.jkiss.dbeaver.model.struct.DBSObject;
    private static boolean tryDeleteObjects(final IWorkbenchWindow window, final List<?> selectedObjects, final NavigatorObjectsDeleter deleter) {
                continue;
public class NavigatorHandlerObjectDelete extends NavigatorHandlerObjectBase implements IElementUpdater {
    private static boolean containsNodesFromDifferentDataSources(@NotNull List<?> objects) {
    }
            } else {
                            }

        }
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
import org.eclipse.ui.handlers.HandlerUtil;
                                                }
    public Object execute(final ExecutionEvent event) throws ExecutionException {
                confirmMessage = NLS.bind(UINavigatorMessages.confirm_deleting_dependent_objects, dependentObjectsListNodes.size());
    public NavigatorHandlerObjectDelete() {

                dependentObjectsDeleter
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
            // Because main menu is not updated on every menu show. And only the first text is saved
                            DBEObjectManager<?> objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(attribute.getClass());
 *
        return tryDeleteObjects(window, objects, NavigatorObjectsDeleter.of(objects, window));
            final boolean persistCheck = deleter.showScriptWindow();
    }
/*
            });

                    if (obj instanceof DBNDatabaseItem) {
 *
import org.eclipse.core.commands.ExecutionEvent;
    }
import org.jkiss.dbeaver.ui.navigator.dialogs.NavigatorNodesDeletionConfirmations;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
            }
                                                    dependentObjectsListNodes.add(node);
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            } else {
                                try {
    private static final Log log = Log.getLog(NavigatorHandlerObjectDelete.class);

    @Override
        try {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.Log;
        DBPDataSource dataSource = null;

                            if (objectManager instanceof DBEObjectWithDependencies) {
        return false;
        return super.isEnabled();
                                } catch (DBException e) {
                dependentObjectsListNodes,
                return tryDeleteObjects(window, selectedObjects, deleter);
        }

                                                DBNDatabaseNode node = DBNUtils.getNodeByObject(monitor, objToDelete, false);
package org.jkiss.dbeaver.ui.navigator.actions;
            }
 * you may not use this file except in compliance with the License.
