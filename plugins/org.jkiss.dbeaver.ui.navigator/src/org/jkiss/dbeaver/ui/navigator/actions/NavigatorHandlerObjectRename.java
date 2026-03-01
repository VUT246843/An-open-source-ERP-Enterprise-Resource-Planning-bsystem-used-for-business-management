            false) : node.getNodeDisplayName();
                    } catch (DBException e) {
                            workbenchWindow,
                if (object != null) {
                            object.getClass(),
        String oldName = node instanceof DBNDatabaseNode ? ((DBNDatabaseNode) node).getPlainNodeName(true,
import org.eclipse.osgi.util.NLS;
                                commandTarget.getContext().resetChanges(true);
            }
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.DBException;
            if (node != null) {
        }
                    UINavigatorMessages.actions_navigator_rename_object_exception_title,
        return false;
                    try {
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

                        } else {

                workbenchWindow,
        return null;
    @Override
import java.lang.reflect.InvocationTargetException;
            newName = EnterNameDialog.chooseName(shell,
                            } else {
        if (CommonUtils.isEmpty(newName) || newName.equals(oldName)) {
            return false;
                            }
import org.eclipse.swt.widgets.Shell;
        if (oldName == null) {
            if (node.getParentNode() instanceof DBNContainer) {

                e);
                if (nodeProject == null || nodeProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
        try {
                                return false;
                            false);
                NLS.bind(UINavigatorMessages.actions_navigator_rename_database_object_exception_message,
                NLS.bind(UINavigatorMessages.actions_navigator_rename_object, node.getNodeTypeLabel()), oldName);
import org.jkiss.utils.CommonUtils;
                String finalNewName = newName;
                    NLS.bind(UINavigatorMessages.actions_navigator_rename_object_exception_message, oldName), e);
        if (node instanceof DBNDatabaseNode dbNode) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
    {
                        if (object.isPersisted() && commandTarget.getEditor() == null) {
        }
                        options.put(DBEObjectManager.OPTION_UI_SOURCE, uiSource);
                            }
        if (newName == null) {
                            node,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
            }
                });
            return renameDatabaseObject(

    public static boolean renameDatabaseObject(IWorkbenchWindow workbenchWindow, DBNDatabaseNode node, String newName, Object uiSource)
                }
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
}/*

import java.util.LinkedHashMap;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    renameNode(HandlerUtil.getActiveWorkbenchWindow(event), HandlerUtil.getActiveShell(event), node, null, this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                UIUtils.runInProgressService(monitor -> {
                        CommandTarget commandTarget = getCommandTarget(
        }
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.model.edit.DBECommand;
            Object element = structSelection.getFirstElement();
 * Unless required by applicable law or agreed to in writing, software
                UINavigatorMessages.actions_navigator_rename_database_object_exception_title,
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
            } catch (Exception e) {
 * limitations under the License.
import org.eclipse.ui.IWorkbenchWindow;
                return true;

                            node.getParentNode(),
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                            if (!showScript(workbenchWindow, commandTarget.getContext(), DBPScriptObject.EMPTY_OPTIONS,
    }
                DBPProject nodeProject = node.getOwnerProject();
                    }
                        return true;
                // Rename with null monitor because it is some local resource
                DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.model.navigator.DBNContainer;
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.eclipse.jface.viewers.ISelection;
                    DBEObjectRenamer objectRenamer = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(object.getClass(), DBEObjectRenamer.class);
package org.jkiss.dbeaver.ui.navigator.actions;
 * You may obtain a copy of the License at
                        throw new InvocationTargetException(e);
 *
            oldName = "?";
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                }
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
public class NavigatorHandlerObjectRename extends NavigatorHandlerObjectBase {
import java.util.Map;
        if (node.supportsRename()) {
    {
 * See the License for the specific language governing permissions and
    }
            return false;
            }
        }
            DBNNode node = RuntimeUtils.getObjectAdapter(element, DBNNode.class);
                        node.rename(monitor, finalNewName);
                                ObjectSaver renamer = new ObjectSaver(commandTarget.getContext(), DBPScriptObject.EMPTY_OPTIONS);
 */
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.navigator.DBNNode;
                        Map<String, Object> options = new LinkedHashMap<>();
        if (selection instanceof IStructuredSelection structSelection) {
    public static boolean renameNode(IWorkbenchWindow workbenchWindow, Shell shell, final DBNNode node, String newName, Object uiSource)
                                UINavigatorMessages.actions_navigator_rename_script)) {
                dbNode,
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
                        objectRenamer.renameObject(commandTarget.getContext(), object, options, newName);

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.app.DBPProject;
                                TasksJob.runTask(NLS.bind(UINavigatorMessages.actions_navigator_rename_database_object,

import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
import org.jkiss.dbeaver.runtime.TasksJob;
                                    object.getName()), renamer);
            try {
    }
 *
 *
                                //System.out.println(command);
                DBSObject object = node.getObject();
                        }
        return false;

        } catch (Throwable e) {
                    }
                    node.getNodeDisplayName()),
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (objectRenamer != null) {
                CommonUtils.toString(UIUtils.normalizePropertyValue(newName)), uiSource);
                            for (DBECommand command : commandTarget.getContext().getFinalCommands()) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.dbeaver.model.rm.RMConstants;
            DBWorkbench.getPlatformUI().showError(
