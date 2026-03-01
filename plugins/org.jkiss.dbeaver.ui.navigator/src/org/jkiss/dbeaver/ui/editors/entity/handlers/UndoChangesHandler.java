import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.menus.UIElement;
            }
package org.jkiss.dbeaver.ui.editors.entity.handlers;
            final DBECommandContext commandContext = ((EntityEditor) activeEditor).getCommandContext();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        EntityEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), EntityEditor.class);
import org.jkiss.dbeaver.utils.RuntimeUtils;
 *
    public Object execute(ExecutionEvent event) throws ExecutionException
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionException;
 * See the License for the specific language governing permissions and


/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        if (activeEditor instanceof EntityEditor) {
 *
import java.util.Map;
 * you may not use this file except in compliance with the License.
 *
    {
            editor.undoChanges();
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (editor != null) {
    public void updateElement(UIElement element, Map parameters)
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
 */
    }
    @Override
import org.eclipse.ui.internal.WorkbenchMessages;
{
 * limitations under the License.

import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            if (commandContext != null && commandContext.getUndoCommand() != null) {
    {
}    @Override
            return;

 * DBeaver - Universal Database Manager
import org.eclipse.ui.handlers.HandlerUtil;
        return null;


        }
        final IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
            element.setText(text);
public class UndoChangesHandler extends AbstractHandler implements IElementUpdater
import org.eclipse.ui.IEditorPart;
                text += " " + commandContext.getUndoCommand().getTitle();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
import org.eclipse.core.commands.AbstractHandler;
        }
            String text = WorkbenchMessages.Workbench_undo;
