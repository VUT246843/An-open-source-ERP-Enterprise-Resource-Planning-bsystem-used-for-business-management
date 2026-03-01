        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
import org.jkiss.dbeaver.ui.editors.entity.FolderEditor;
                    if (hp < editor.getHistorySize() - 1) {
                    final int hp = editor.getHistoryPosition();
                    if (hp > 0) {
 * Unless required by applicable law or agreed to in writing, software
        }
        }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void updateElement(UIElement element, Map parameters)
            String actionId = event.getCommand().getId();
import org.eclipse.ui.handlers.HandlerUtil;
            String text = "Undo";
 *
public class FolderNavigateHandler extends AbstractHandler //implements IElementUpdater
}        final IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        return null;
                case IWorkbenchCommandConstants.NAVIGATE_BACKWARD_HISTORY: {
import org.eclipse.core.commands.ExecutionEvent;
                }


            final DBECommandContext commandContext = ((EntityEditor) activeEditor).getCommandContext();
{
                }
 * you may not use this file except in compliance with the License.
    }
            }
                    break;

    @Override
import org.eclipse.core.commands.ExecutionException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.entity.handlers;
 * DBeaver - Universal Database Manager
 *
/*
        if (editor != null) {
            }
        }
    {
 * See the License for the specific language governing permissions and
 *
                    }
                        editor.navigateHistory(hp - 1);

            if (commandContext != null && commandContext.getUndoCommand() != null) {
import org.eclipse.ui.IWorkbenchCommandConstants;
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    break;


 * You may obtain a copy of the License at
        if (activeEditor instanceof EntityEditor) {
                    }
        FolderEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), FolderEditor.class);
 * limitations under the License.
                text += " " + commandContext.getUndoCommand().getTitle();
*/
    {
                case IWorkbenchCommandConstants.NAVIGATE_FORWARD_HISTORY: {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    final int hp = editor.getHistoryPosition();
            switch (actionId) {
import org.eclipse.core.commands.AbstractHandler;
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.utils.RuntimeUtils;
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
/*
    public Object execute(ExecutionEvent event) throws ExecutionException
            element.setText(text);
                        editor.navigateHistory(hp + 1);
