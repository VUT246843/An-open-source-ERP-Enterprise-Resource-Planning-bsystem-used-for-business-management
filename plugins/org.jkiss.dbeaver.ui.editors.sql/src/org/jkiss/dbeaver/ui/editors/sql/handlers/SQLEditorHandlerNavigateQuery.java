 *
}
            default:
                nextQuery = null;
            case SQLEditorCommands.CMD_SQL_QUERY_PREV:
import org.eclipse.ui.IEditorPart;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        if (!(activeEditor instanceof SQLEditorBase)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
            editor.selectAndReveal(nextQuery.getOffset(), nextQuery.getLength());
 * DBeaver - Universal Database Manager
/*


                break;
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    }

import org.eclipse.core.commands.ExecutionEvent;
 * you may not use this file except in compliance with the License.
                nextQuery = editor.extractNextQuery(true);
                nextQuery = editor.extractNextQuery(false);

        switch (actionId) {
    {
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

    @Override
        String actionId = event.getCommand().getId();
 * Unless required by applicable law or agreed to in writing, software
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        SQLScriptElement nextQuery;
        SQLEditorBase editor = (SQLEditorBase)activeEditor;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
        }
                break;
        }
            case SQLEditorCommands.CMD_SQL_QUERY_NEXT:
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (nextQuery != null) {
    public Object execute(ExecutionEvent event) throws ExecutionException
public class SQLEditorHandlerNavigateQuery extends AbstractHandler {
            return null;
        }
                break;
