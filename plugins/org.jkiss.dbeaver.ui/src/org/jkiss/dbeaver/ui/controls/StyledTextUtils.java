
 * Unless required by applicable law or agreed to in writing, software
                }
            public void run() {
import org.eclipse.swt.graphics.Point;
        dropTarget.addDropListener(new DropTargetAdapter() {
                return text.getWordWrap();
        final Point selectionRange = text.getSelectionRange();
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.IWorkbenchCommandConstants;
    public static void fillDefaultStyledTextContextMenu(IContributionManager menu, final StyledText text) {
                    e.detail = DND.DROP_COPY;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            ResourceBundle.getBundle("org.eclipse.ui.texteditor.ConstructedEditorMessages"),
        public StyledTextAction(String actionId, boolean enabled, StyledText styledText, int action) {
        return new FindReplaceAction(
        });
    public static void enableDND(StyledText control) {
import org.eclipse.jface.text.IFindReplaceTarget;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;

 * limitations under the License.
        public StyledTextActionEx(String actionId, int style) {
        menu.add(new StyledTextAction(IWorkbenchCommandConstants.EDIT_CUT, selectionRange.y > 0, text, ST.CUT));
            this.styledText = styledText;
        menu.add(new StyledTextAction(IWorkbenchCommandConstants.EDIT_PASTE, text.getEditable(), text, ST.PASTE));
 * See the License for the specific language governing permissions and

            shell,

        }
        menu.add(new StyledTextActionEx(ITextEditorActionDefinitionIds.WORD_WRAP, Action.AS_CHECK_BOX) {
    public static IAction createFindReplaceAction(Shell shell, IFindReplaceTarget target) {
 * StyledTextContentAdapter
public class StyledTextUtils {
    public static class StyledTextActionEx extends Action {

        private final StyledText styledText;
                text.setWordWrap(!text.getWordWrap());
            public void dragOperationChanged(DropTargetEvent e) {
            fillDefaultStyledTextContextMenu(manager, text));
    }
        menuMgr.addMenuListener(manager ->
 */
 * You may obtain a copy of the License at
 *
                }

}
        public void run() {
        menu.add(new StyledTextAction(IWorkbenchCommandConstants.EDIT_COPY, selectionRange.y > 0, text, ST.COPY));
        menu.add(createFindReplaceAction(text.getShell(), stFindReplaceTarget));
import org.eclipse.ui.texteditor.FindReplaceAction;
                if (e.detail == DND.DROP_DEFAULT) {
    }
        DropTarget dropTarget = new DropTarget(control, DND.DROP_DEFAULT | DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK);
            public void dragEnter(DropTargetEvent e) {
                control.insert((String) e.data);
            }
            target);
/**
            @Override
                if (e.detail == DND.DROP_DEFAULT) {
import org.eclipse.swt.custom.ST;
        MenuManager menuMgr = new MenuManager();
package org.jkiss.dbeaver.ui.controls;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            styledText.invokeAction(action);
            }
            this.setEnabled(enabled);
import org.jkiss.dbeaver.ui.ActionUtils;
 */
        text.addDisposeListener(e -> menuMgr.dispose());
            }
 *

import java.util.ResourceBundle;
        menu.add(new StyledTextAction(IWorkbenchCommandConstants.EDIT_SELECT_ALL, true, text, ST.SELECT_ALL));

import org.eclipse.swt.widgets.Shell;
        menuMgr.setRemoveAllWhenShown(true);

            }
 *
    }
            }
    public static class StyledTextAction extends Action {
    }

/*
 * DBeaver - Universal Database Manager
        IFindReplaceTarget stFindReplaceTarget = new StyledTextFindReplaceTarget(text);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            @Override
            "Editor.FindReplace.",
import org.eclipse.swt.custom.StyledText;
    }
        text.setMenu(menuMgr.createContextMenu(text));
        menu.add(new GroupMarker("styled_text_additions"));
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

            public void drop(DropTargetEvent e) {
            super(ActionUtils.findCommandName(actionId));

        dropTarget.setTransfer(TextTransfer.getInstance());
            this.setActionDefinitionId(actionId);
            public boolean isChecked() {
    public static void fillDefaultStyledTextContextMenu(final StyledText text) {
        private final int action;
            super(ActionUtils.findCommandName(actionId), style);
        });
            this.setActionDefinitionId(actionId);
    }
            this.action = action;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.dnd.*;


import org.eclipse.jface.action.*;
                    e.detail = DND.DROP_COPY;

        @Override
