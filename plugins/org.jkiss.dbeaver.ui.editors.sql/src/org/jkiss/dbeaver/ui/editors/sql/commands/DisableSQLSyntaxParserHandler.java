        }
import org.eclipse.ui.commands.IElementUpdater;
        IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
            }
    
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
        final IEditorPart editor = HandlerUtil.getActiveEditor(event);
            IEditorInput editorInput = editor.getEditorInput();
        if (activePage != null) {
}
        IWorkbenchPage activePage = element.getServiceLocator().getService(IWorkbenchWindow.class).getActivePage();

import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;

    @Nullable
 * See the License for the specific language governing permissions and

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.ExecutionEvent;
    public void updateElement(@NotNull UIElement element, @Nullable Map parameters) {
    @Override
    }
 *
    @Override
import org.eclipse.core.commands.AbstractHandler;
 * limitations under the License.

public class DisableSQLSyntaxParserHandler extends AbstractHandler implements IElementUpdater {
            IEditorPart editor = activePage.getActiveEditor();
 *
            return false;
 * you may not use this file except in compliance with the License.
    }
        if (editor instanceof SQLEditor) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Map;
import org.eclipse.ui.IWorkbenchWindow;
            SQLEditorUtils.setSQLSyntaxParserEnabled(editorInput, !SQLEditorUtils.isSQLSyntaxParserEnabled(editorInput));
        if (activePage != null) {
        }
package org.jkiss.dbeaver.ui.editors.sql.commands;
            return editor != null && !SQLEditorBase.isBigScript(editor.getEditorInput());
        } else {
            IEditorPart editor = activePage.getActiveEditor();
    public static final String COMMAND_ID = "org.jkiss.dbeaver.ui.editors.sql.disableSQLSyntaxParser";
                element.setChecked(!SQLEditorUtils.isSQLSyntaxParserApplied(((SQLEditor) editor).getEditorInput()));
    public Object execute(@NotNull ExecutionEvent event) throws ExecutionException {
import org.eclipse.ui.IEditorInput;
import org.jkiss.dbeaver.ui.UIUtils;
    
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 */
    public boolean isEnabled() {
        }
import org.eclipse.ui.menus.UIElement;
import org.eclipse.ui.IEditorPart;
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
import org.eclipse.ui.IWorkbenchPage;
 * Unless required by applicable law or agreed to in writing, software
/*

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
    }
            if (editor instanceof SQLEditor) {
