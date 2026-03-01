 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.commands.ExecutionEvent;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *
 */
 * DBeaver - Universal Database Manager
    }
 *
    {
/*
import org.eclipse.ui.handlers.HandlerUtil;

            HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().activate(activeEditor);
 * you may not use this file except in compliance with the License.

    }
        }
 * limitations under the License.
}
        final NavigatorViewBase navigatorView = NavigatorUtils.getActiveNavigatorView(event);
        if (NavigatorUtils.syncEditorWithNavigator(navigatorView, activeEditor)) {
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.IEditorPart;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and

        }
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
import org.eclipse.core.commands.AbstractHandler;
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        if (navigatorView == null) {
 *

    @Override
    public SQLEditorHandlerSyncConnection()
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
public class SQLEditorHandlerSyncConnection extends AbstractHandler {
