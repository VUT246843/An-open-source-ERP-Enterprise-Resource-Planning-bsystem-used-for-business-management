import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
        if (activeEditor instanceof EntityEditor) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
}public class RedoChangesHandler extends AbstractHandler implements IElementUpdater
        final IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
{
import org.eclipse.ui.menus.UIElement;
import org.eclipse.ui.IEditorPart;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.AbstractHandler;
/*
                text += " " + commandContext.getRedoCommand().getTitle();
    {
            String text = WorkbenchMessages.Workbench_redo;
 * limitations under the License.
            final DBECommandContext commandContext = ((EntityEditor) activeEditor).getCommandContext();
    public void updateElement(UIElement element, Map parameters)

        if (editor != null) {
 */
package org.jkiss.dbeaver.ui.editors.entity.handlers;
        }
    }
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.handlers.HandlerUtil;
    @Override
import org.eclipse.core.commands.ExecutionEvent;
        }

 *
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Object execute(ExecutionEvent event) throws ExecutionException
import java.util.Map;
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

            return;
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
import org.eclipse.ui.IWorkbenchWindow;

            if (commandContext != null && commandContext.getRedoCommand() != null) {
import org.eclipse.ui.internal.WorkbenchMessages;
 * Unless required by applicable law or agreed to in writing, software
    {

 * DBeaver - Universal Database Manager
            editor.redoChanges();
        EntityEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), EntityEditor.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            element.setText(text);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * You may obtain a copy of the License at
    @Override
 * See the License for the specific language governing permissions and

    }
        return null;
