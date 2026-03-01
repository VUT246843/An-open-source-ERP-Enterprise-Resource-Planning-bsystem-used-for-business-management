 * Unless required by applicable law or agreed to in writing, software
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(HandlerUtil.getCurrentSelection(event));
 *
        if (dataSource == null) {
        return DataSourceDashboardView.openView(HandlerUtil.getActiveWorkbenchWindow(event), dataSourceContainer.getProject(), dataSourceContainer, null);
        DBPDataSource dataSource = object.getDataSource();
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

public class DashboardOpenToolCommandHandler extends AbstractHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
        DBSObject object = selectedObjects.iterator().next();

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (selectedObjects.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        // Just open dashboard view
        }
        DBPDataSourceContainer dataSourceContainer = dataSource.getContainer();
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        }
 * DBeaver - Universal Database Manager
/*
    public Object execute(ExecutionEvent event) {
 * limitations under the License.
 *

import java.util.List;
            return null;
package org.jkiss.dbeaver.ui.dashboard.view;
}import org.eclipse.core.commands.AbstractHandler;
import org.jkiss.dbeaver.model.DBPDataSource;

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *
import org.eclipse.core.commands.ExecutionEvent;
            return null;
