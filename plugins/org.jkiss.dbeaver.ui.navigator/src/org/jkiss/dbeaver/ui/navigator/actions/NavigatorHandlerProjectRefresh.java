import org.eclipse.core.commands.ExecutionException;

 * Copyright (C) 2010-2024 DBeaver Corp and others
                DBeaverNotifications.showNotification(
        } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.model.DBPMessageType;
import java.lang.reflect.InvocationTargetException;

 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * limitations under the License.
                    DBeaverNotifications.NT_GENERIC,
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
            NavigatorHandlerRefresh.refreshInNavigator(
    @Override

            return null;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
        try {

 */
 *
            DBWorkbench.getPlatformUI().showError("Refresh workspace", "Can't refresh workspace", e.getTargetException());
                    DBPPlatformDesktop.getInstance().getWorkspace().refreshWorkspaceContents(new DefaultProgressMonitor(monitor));
                HandlerUtil.getActivePart(event),
        } catch (InterruptedException e) {
 * See the License for the specific language governing permissions and
public class NavigatorHandlerProjectRefresh extends NavigatorHandlerObjectBase {
                    throw new InvocationTargetException(e);
package org.jkiss.dbeaver.ui.navigator.actions;
 *
                    DBPMessageType.INFORMATION,

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
                    "Projects refresh",
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
 *
        if (CommonUtils.toBoolean(event.getParameter("singleProject"))) {
                try {
import org.eclipse.core.commands.ExecutionEvent;
 * Unless required by applicable law or agreed to in writing, software
        final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
/*
}                true);
                } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * DBeaver - Universal Database Manager
                    "Project list was synchronized with local file system",
                    null);
            workbenchWindow.run(true, true, monitor -> {
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
            });
    }
        return null;
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                event,
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.utils.CommonUtils;
            // do nothing
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
