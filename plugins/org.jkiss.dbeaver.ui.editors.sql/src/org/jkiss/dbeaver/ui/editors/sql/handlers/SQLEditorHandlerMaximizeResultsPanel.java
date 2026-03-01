            } else {

 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    }
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();

import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

import org.eclipse.ui.commands.IElementUpdater;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        return null;
import java.util.Map;
import org.eclipse.core.commands.AbstractHandler;
 * you may not use this file except in compliance with the License.

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (editor.hasMaximizedControl()) {
            editor.toggleEditorMaximize();
            return;
    public void updateElement(UIElement element, Map parameters)

    @Override

import org.eclipse.core.commands.ExecutionEvent;
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

}            return;
        SQLEditor editor = RuntimeUtils.getObjectAdapter(activeEditor, SQLEditor.class);
                element.setText(SQLEditorMessages.action_menu_sqleditor_restoreResultsPanel);
import org.eclipse.ui.IEditorPart;
/*
    @Override
 * Unless required by applicable law or agreed to in writing, software
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
        }
public class SQLEditorHandlerMaximizeResultsPanel extends AbstractHandler implements IElementUpdater {
        if (editor != null) {
        }
        if (activeEditor == null) {
import org.eclipse.ui.menus.UIElement;
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * limitations under the License.
import org.eclipse.core.commands.ExecutionException;
    }
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        }
    {
import org.eclipse.ui.handlers.HandlerUtil;
                element.setText(SQLEditorMessages.action_menu_sqleditor_maximizeResultsPanel);
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 *
        if (editor != null) {
import org.eclipse.ui.IWorkbenchWindow;
