    public ERDHandlerDelete() {
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gef.ui.actions.DeleteAction;
 * Licensed under the Apache License, Version 2.0 (the "License");
                element.setIcon(DBeaverIcons.getImageDescriptor(UIIcon.OBJ_REMOVE));
                        }
                                    if (node != null) {
        }
                                }
import org.eclipse.ui.ISources;
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();

import org.eclipse.swt.widgets.Control;
                    ) != Reply.YES) {
                                    DBNNode node = DBNUtils.getNodeByObject(new VoidProgressMonitor(), object, true);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        if (activeEditor == null) {
        }
 */
        // we do not have a default deleteHandler for this element to return it back to the default state with the default name and icon
                        HandlerUtil.getActiveShell(event),
        ERDEditorPart editor = RuntimeUtils.getObjectAdapter(activeEditor, ERDEditorPart.class);
 * You may obtain a copy of the License at

            if (editor.getDiagram().isEditEnabled()) {
import org.jkiss.dbeaver.ui.dialogs.Reply;
            }
                if (deleteAction.isEnabled()) {
                        null
import org.eclipse.ui.commands.IElementUpdater;
        return null;
                    if (!selectedNodes.isEmpty() && NavigatorNodesDeletionConfirmations.confirm(
            if (editor != null && !editor.isReadOnly()) {
import org.eclipse.core.commands.AbstractHandler;
    }
import org.eclipse.gef.commands.CompoundCommand;
    }
            super((IWorkbenchPart) editor);

        }
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
        }
import org.eclipse.gef.commands.Command;
        if (editor != null) {

                element.setText(ERDUIMessages.erd_action_delete_text);
import java.util.ArrayList;
                    Command deleteCommand = deleteAction.createDeleteCommand(selectedObjects);
                    List<DBNNode> selectedNodes = new ArrayList<>();
                                DBSObject object = ((ERDDatabaseObjectModifyCommand) nc).getDatabaseObject();
                    if (deleteCommand instanceof CompoundCommand) {
                        return null;
            return super.getSelectedObjects();
import org.jkiss.dbeaver.model.navigator.DBNNode;
/*
import java.util.List;
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDatabaseObjectModifyCommand;
 * limitations under the License.
    @Override
                    }
 * you may not use this file except in compliance with the License.
                            if (nc instanceof ERDDatabaseObjectModifyCommand) {
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);

            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);
                    deleteAction.run();
                                    }
    private static class ERDDeleteAction extends DeleteAction {

}
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
import org.eclipse.ui.menus.UIElement;
                }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                    }
                    // Show confirmation
 * See the License for the specific language governing permissions and
                ERDDeleteAction deleteAction = new ERDDeleteAction(editor);
        ERDDeleteAction(ERDEditorPart editor) {
                deleteAction.update();
import org.eclipse.ui.IWorkbenchPart;
 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {
public class ERDHandlerDelete extends AbstractHandler implements IElementUpdater {
    public void updateElement(UIElement element, Map parameters) {

 *
        if (control != null) {
                                    // Its ok to use void monitor here
                        for (Object nc : ((CompoundCommand) deleteCommand).getCommands()) {
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.ExecutionEvent;
                        selectedNodes,
        /*IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
        // We can add this custom text and image to the element, yes, but, unfortunately,
 * Unless required by applicable law or agreed to in writing, software
                                        selectedNodes.add(node);
                element.setText(ERDUIMessages.erd_action_remove_text);
import org.jkiss.dbeaver.ui.navigator.dialogs.NavigatorNodesDeletionConfirmations;
    }
            return;
package org.jkiss.dbeaver.ui.editors.erd.action;
                    List selectedObjects = deleteAction.getSelectedObjects();
        }*/
            return;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        @Override
                            }
 * DBeaver - Universal Database Manager
                                if (object != null) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
            }

import java.util.Map;
        public List getSelectedObjects() {
                element.setIcon(DBeaverIcons.getImageDescriptor(UIIcon.DELETE));

 *

