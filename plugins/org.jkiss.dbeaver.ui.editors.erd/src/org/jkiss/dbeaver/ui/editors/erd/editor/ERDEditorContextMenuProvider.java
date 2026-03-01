            menu.add(new DiagramToggleGridAction());
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Provides a context menu for the schema diagram editor. A virtual cut and paste from the flow example
        if (registerForNavigatorActions) {
import org.eclipse.jface.viewers.ISelection;
            if (editor instanceof ERDEditorEmbedded) {
                editor.fillPartContextMenu(menu, (IStructuredSelection) selection);
//            menu.add(new GroupMarker(NavigatorCommands.GROUP_NAVIGATOR_ADDITIONS));

import org.jkiss.dbeaver.ui.IActionConstants;
     * @param editor the editor
            menu.add(new DiagramLayoutAction(editor));
            editor.fillAttributeVisibilityMenu(menu);
    }
            editor.getEditorSite().registerContextMenu("#ERDEditorContext", this, editor.getEditorSite().getSelectionProvider(), false);
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramToggleGridAction;
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
    private ERDEditorPart editor;
     */
import org.eclipse.ui.IWorkbenchCommandConstants;

            editor.fillRoutersMenu(menu);
 */
     * Creates a new FlowContextMenuProvider associated with the given viewer
            menu.add(new Separator());
import org.eclipse.jface.action.*;
            }
//            menu.add(new GroupMarker(NavigatorCommands.GROUP_NAVIGATOR_ADDITIONS_END));
 * Created on Jul 22, 2004

 *
            ISelection selection = editor.getGraphicalViewer().getSelection();
import org.eclipse.ui.IWorkbenchActionConstants;
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
        this.setRemoveAllWhenShown(true);
 * You may obtain a copy of the License at
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        super("ERD Editor Context Menu", "#ERDEditorContext");
            menu.add(new Separator(IWorkbenchActionConstants.M_EDIT));
        if (editor.isLoaded()) {
            }
            menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
            if (ActionUtils.isCommandEnabled(IWorkbenchCommandConstants.EDIT_DELETE, editor.getSite())) {
    public void menuAboutToShow(IMenuManager menu) {

    private void buildContextMenu(IMenuManager menu) {
            menu.add(new GroupMarker(IActionConstants.MB_ADDITIONS_END));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 */
/**
 * limitations under the License.
 *
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software


    /**

            }
                menu.add(ActionUtils.makeCommandContribution(editor.getSite(), IWorkbenchCommandConstants.EDIT_DELETE));
public class ERDEditorContextMenuProvider extends MenuManager implements IMenuListener {

package org.jkiss.dbeaver.ui.editors.erd.editor;
    }


        }
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramLayoutAction;
        this.addMenuListener(this);
            if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
            menu.add(new Separator());
 * you may not use this file except in compliance with the License.
            menu.add(ActionUtils.makeCommandContribution(editor.getSite(), ERDUIConstants.CMD_SAVE_AS));
            editor.fillNotationsMenu(menu);
import org.jkiss.dbeaver.ui.ActionUtils;
        }
}            menu.add(new GroupMarker(NavigatorCommands.GROUP_TOOLS));
     *
     * and action registry.
            menu.add(new Separator());
    }
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramTogglePersistAction;
    public ERDEditorContextMenuProvider(ERDEditorPart editor, boolean registerForNavigatorActions) {
 */
/*
        this.editor = editor;
        this.buildContextMenu(menu);

            menu.add(ActionUtils.makeCommandContribution(editor.getSite(), IWorkbenchCommandConstants.EDIT_COPY));
                menu.add(new DiagramTogglePersistAction((ERDEditorEmbedded) editor));
/*
