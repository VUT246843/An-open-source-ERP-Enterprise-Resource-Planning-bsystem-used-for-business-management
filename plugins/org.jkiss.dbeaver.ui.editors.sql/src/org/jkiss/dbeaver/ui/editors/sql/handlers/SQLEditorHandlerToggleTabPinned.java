import org.eclipse.core.commands.ExecutionException;
 *
import org.eclipse.ui.IWorkbenchWindow;
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
        }
        if (editor != null) {
 * you may not use this file except in compliance with the License.
import java.util.Map;
 * Unless required by applicable law or agreed to in writing, software
        }
 *
                element.setText(SQLEditorMessages.action_result_tabs_unpin_tab);
/*
import org.eclipse.ui.menus.UIElement;
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
            return;
    }
        }
    @Override
        }
import org.eclipse.ui.commands.IElementUpdater;



        if (editor != null) {
        if (activeEditor == null) {
import org.eclipse.core.commands.AbstractHandler;
 * Licensed under the Apache License, Version 2.0 (the "License");
            } else {
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
            editor.toggleActiveTabPinned();
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

 * See the License for the specific language governing permissions and
                element.setText(SQLEditorMessages.action_result_tabs_pin_tab);
        return null;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }


    public void updateElement(UIElement element, Map parameters) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.utils.RuntimeUtils;
            if (editor.isActiveTabPinned()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * limitations under the License.
public class SQLEditorHandlerToggleTabPinned extends AbstractHandler implements IElementUpdater {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            return;
}        SQLEditor editor = RuntimeUtils.getObjectAdapter(activeEditor, SQLEditor.class);
 *
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
            }
