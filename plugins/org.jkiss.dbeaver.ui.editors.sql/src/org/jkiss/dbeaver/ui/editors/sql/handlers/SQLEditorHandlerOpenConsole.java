    public SQLEditorHandlerOpenConsole()
        }
 */
                serviceSQL.openSQLConsole(navContext.getDataSourceContainer(), navContext.getExecutionContext(), navContext.getSelectedObject(), "Console", "");
    }
public class SQLEditorHandlerOpenConsole extends AbstractHandler {
    public Object execute(ExecutionEvent event) throws ExecutionException
            UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
        } catch (Exception e) {
 * limitations under the License.
        return null;
    private static final Log log = Log.getLog(SQLEditorHandlerOpenConsole.class);
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    @Override
 * DBeaver - Universal Database Manager
    {
 *
import org.eclipse.core.commands.ExecutionEvent;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

            SQLNavigatorContext navContext = SQLEditorHandlerOpenEditor.getCurrentContext(event);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

    {
/*
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.core.commands.AbstractHandler;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.Log;

 * Licensed under the Apache License, Version 2.0 (the "License");
            if (serviceSQL != null) {
            // Ignore

 *
    }
            }

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionException;
