import org.jkiss.dbeaver.Log;

import org.eclipse.ui.menus.UIElement;
 *
import org.eclipse.core.commands.ExecutionException;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.eclipse.ui.IEditorPart;
    @Override
        SQLEditor editor = RuntimeUtils.getObjectAdapter(activeEditor, SQLEditor.class);
    public Object execute(@NotNull ExecutionEvent event) throws ExecutionException {
        }
public class SQLEditorHandlerToggleMultipleResultsPerTab extends AbstractHandler implements IElementUpdater {
        if (editor == null) {

import org.jkiss.code.NotNull;
            return null;
 * limitations under the License.
    private static final Log log = Log.getLog(SQLEditorHandlerToggleMultipleResultsPerTab.class);
        return null;
        editor.refreshActions();
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
        if (activeEditor == null) {
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        element.setChecked(editor.isMultipleResultsPerTabEnabled());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
        if (editor == null) {
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.AbstractHandler;
            return;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void updateElement(UIElement element, Map parameters) {
 * DBeaver - Universal Database Manager

 * You may obtain a copy of the License at
            log.error("No active SQL editor found");
/*
import org.eclipse.ui.commands.IElementUpdater;
    }


        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *
import org.eclipse.core.commands.ExecutionEvent;
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
        editor.toggleMultipleResultsPerTab();
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
            return;
}
import org.eclipse.ui.IWorkbenchWindow;
        }
 * See the License for the specific language governing permissions and
import java.util.Map;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;

 */
 *
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    @Override
