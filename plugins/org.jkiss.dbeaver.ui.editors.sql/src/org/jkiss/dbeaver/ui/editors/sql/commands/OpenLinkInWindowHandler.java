import org.jkiss.utils.CommonUtils;
    @Override
import org.jkiss.dbeaver.utils.RuntimeUtils;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        ISelection selection = editor.getSelectionProvider().getSelection();
 * DBeaver - Universal Database Manager
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
 *
import org.eclipse.ui.commands.IElementUpdater;
        }
        element.setTooltip(SQLEditorMessages.editors_sql_actions_search_selected_text_online_tip);
import org.jkiss.dbeaver.ui.ShellUtils;
            DBWorkbench.getPlatformUI().showError(TITLE, "Desktop is not supported.");
        googleLink = URLEncoder.encode(googleLink, StandardCharsets.UTF_8);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.core.commands.ExecutionException;
            ShellUtils.launchProgram(SEARCH_WEB_ADDRESS_PREFIX + googleLink);
    private boolean isSelectedTextNullOrEmpty(ISelection selection) {
public class OpenLinkInWindowHandler extends AbstractHandler implements IElementUpdater {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
            DBWorkbench.getPlatformUI().showError(TITLE, "No text was selected");
}
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        }
 * Unless required by applicable law or agreed to in writing, software
        return CommonUtils.isEmpty(textSelection.getText());
import org.eclipse.core.commands.ExecutionEvent;

 *     http://www.apache.org/licenses/LICENSE-2.0

            DBWorkbench.getPlatformUI().showError(TITLE, "No suitable editor was found for SQL");
        if (selection == null || selection.isEmpty() || !(selection instanceof TextSelection textSelection)) {
    
    public void updateElement(UIElement element, Map parameters) {

            return null;
        } else {
import org.jkiss.dbeaver.ui.AWTUtils;
    }
        element.setText(SQLEditorMessages.editors_sql_actions_search_selected_text_online);

package org.jkiss.dbeaver.ui.editors.sql.commands;
        if (AWTUtils.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
import org.eclipse.jface.viewers.ISelection;
            return null;
import org.eclipse.jface.text.TextSelection;
    private static final String TITLE = "Search selection in web";
        
import org.eclipse.ui.handlers.HandlerUtil;
import java.util.Map;
import java.net.URLEncoder;

    }
 *
        return null;
        if (!(selection instanceof TextSelection textSelection) || isSelectedTextNullOrEmpty(selection)) {
 * See the License for the specific language governing permissions and
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.core.commands.AbstractHandler;
 * you may not use this file except in compliance with the License.
    private static final String SEARCH_WEB_ADDRESS_PREFIX = "https://www.google.com/search?q=";
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            return true;
        String googleLink = textSelection.getText().trim();
        if (editor == null) {
import java.nio.charset.StandardCharsets;
 * limitations under the License.
 * You may obtain a copy of the License at
import org.eclipse.ui.menus.UIElement;

    @Override
    
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
import java.awt.*;

