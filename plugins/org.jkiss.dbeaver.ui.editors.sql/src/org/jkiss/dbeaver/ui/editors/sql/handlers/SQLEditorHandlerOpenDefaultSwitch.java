    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        String commandId = CommonUtils.toString(parameters.get("command"));
import org.eclipse.core.commands.ExecutionException;
    public void updateElement(UIElement element, Map parameters) {
            log.error("No command for default SQL editor handler");
import org.eclipse.core.commands.ExecutionEvent;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
            return null;
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        String commandName = ActionUtils.findCommandName(commandId);
    private static final Log log = Log.getLog(SQLEditorHandlerOpenDefaultSwitch.class);

        if (editorCommand == null) {
        element.setText(commandName);

        return null;
            return;
        if (CommonUtils.isEmpty(commandId)) {
    }
import java.util.Map;
    }

import org.eclipse.ui.menus.UIElement;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 *
        String editorCommand = event.getParameter("command");
import org.eclipse.core.commands.AbstractHandler;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.Log;


        }
        }
 * limitations under the License.
            return;
public class SQLEditorHandlerOpenDefaultSwitch extends AbstractHandler implements IElementUpdater {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (CommonUtils.isEmpty(commandName)) {
 *
 * DBeaver - Universal Database Manager
}
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.runtime.DBWorkbench;
        String defCommand = DBWorkbench.getPlatform().getPreferenceStore().getString(SQLPreferenceConstants.DEFAULT_SQL_EDITOR_OPEN_COMMAND);

 *

        element.setChecked(CommonUtils.equalObjects(defCommand, commandId));
 */
import org.jkiss.dbeaver.ui.ActionUtils;
    @Override
 * See the License for the specific language governing permissions and
        }
/*
        DBWorkbench.getPlatform().getPreferenceStore().setValue(SQLPreferenceConstants.DEFAULT_SQL_EDITOR_OPEN_COMMAND, editorCommand);

    public SQLEditorHandlerOpenDefaultSwitch() {
import org.eclipse.ui.commands.IElementUpdater;
