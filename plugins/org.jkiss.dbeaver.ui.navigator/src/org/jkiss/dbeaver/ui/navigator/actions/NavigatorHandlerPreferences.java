 *
import org.eclipse.core.commands.ExecutionException;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionEvent;
        return null;

    public Object execute(ExecutionEvent event) throws ExecutionException {
        ActionUtils.runCommand(IWorkbenchCommandConstants.WINDOW_PREFERENCES, HandlerUtil.getActiveWorkbenchWindow(event));
public class NavigatorHandlerPreferences extends AbstractHandler {
import org.eclipse.core.commands.AbstractHandler;
 *
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

        if (activePart instanceof NavigatorViewBase) {
                HandlerUtil.getActiveShell(event),
        final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
/*
 * Unless required by applicable law or agreed to in writing, software
} */
/*
        }
import org.eclipse.ui.handlers.HandlerUtil;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.ActionUtils;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
                PrefPageDatabaseNavigator.PAGE_ID
package org.jkiss.dbeaver.ui.navigator.actions;
            UIUtils.showPreferencesFor(
 * distributed under the License is distributed on an "AS IS" BASIS,
            );
 * See the License for the specific language governing permissions and
                activePart,
 *
*/
import org.eclipse.ui.IWorkbenchCommandConstants;


