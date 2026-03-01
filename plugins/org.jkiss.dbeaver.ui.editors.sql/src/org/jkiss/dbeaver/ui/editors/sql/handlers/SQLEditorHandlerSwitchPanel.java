    private static final Log log = Log.getLog(SQLEditorHandlerSwitchPanel.class);
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * you may not use this file except in compliance with the License.
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
import org.eclipse.core.commands.ExecutionEvent;
                editor.toggleActivePanel();
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 *
                break;

import org.eclipse.core.commands.ExecutionException;
                break;

import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
        if (editor == null) {

} * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.handlers.HandlerUtil;
            case SQLEditorCommands.CMD_SQL_SWITCH_PANEL:
 * Unless required by applicable law or agreed to in writing, software
/*
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

        switch (actionId) {
                break;

 */
            case SQLEditorCommands.CMD_SQL_SHOW_OUTPUT:
        String actionId = event.getCommand().getId();
            return null;
    @Override
 *
                editor.showVariablesPanel(null);
                editor.showOutputPanel(null);
        }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.utils.RuntimeUtils;
public class SQLEditorHandlerSwitchPanel extends AbstractHandler {
        return null;
 *
                editor.showExecutionLogPanel(null);
            case SQLEditorCommands.CMD_SQL_SHOW_LOG:
    }
 * limitations under the License.
import org.jkiss.dbeaver.Log;

                break;
            case SQLEditorCommands.CMD_SQL_SHOW_VARIABLES:
import org.eclipse.core.commands.AbstractHandler;
