    @Override
public class HandlerDashboardOpen extends AbstractDataSourceHandler {
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)) {
 * you may not use this file except in compliance with the License.
            return null;
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
/*
 *
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
 * You may obtain a copy of the License at

import org.eclipse.ui.IWorkbenchWindow;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.handlers.HandlerUtil;
 *     http://www.apache.org/licenses/LICENSE-2.0
            return null;
        return null;
            null);
        DataSourceDashboardView.openView(
 *
import org.eclipse.core.commands.ExecutionEvent;
 * See the License for the specific language governing permissions and
        }
                UIDashboardMessages.error_dashboard_view_no_connection_msg);
            dataSourceContainer.getProject(),
    public Object execute(ExecutionEvent event) throws ExecutionException {
 */
        if (dataSourceContainer == null) {
import org.jkiss.dbeaver.ui.dashboard.view.DataSourceDashboardView;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
            DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.model.rm.RMConstants;
 * DBeaver - Universal Database Manager

            dataSourceContainer,
 * Unless required by applicable law or agreed to in writing, software
            workbenchWindow,
                UIDashboardMessages.error_dashboard_view_no_connection_title,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
 *
        DBPDataSourceContainer dataSourceContainer = getActiveDataSourceContainer(event, false);
        if (dataSourceContainer == null) {
 * limitations under the License.
            DBWorkbench.getPlatformUI().showError("Permission denied", "The user needs more permissions to open dashboards.");
import org.eclipse.core.commands.ExecutionException;
package org.jkiss.dbeaver.ui.dashboard.navigator;
        }
            dataSourceContainer = getActiveDataSourceContainer(event, true);
