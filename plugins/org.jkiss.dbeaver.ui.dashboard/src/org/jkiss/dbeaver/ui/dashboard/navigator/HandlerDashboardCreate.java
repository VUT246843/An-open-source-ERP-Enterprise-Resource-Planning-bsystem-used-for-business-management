        DBPDataSourceContainer dataSourceContainer = getDataSourceContainerFromPart(
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public Object execute(ExecutionEvent event) {
        if (CommonUtils.toBoolean(event.getParameter("datasource"))) {
import java.util.Map;
            dataSourceContainer = getDataSourceContainerFromPart(HandlerUtil.getActivePart(event));
 *
            element.setText("New project dashboard");

        ActiveWizardDialog dialog = new ActiveWizardDialog(

    }
import org.jkiss.dbeaver.ui.UIUtils;

 */
 *
 * Unless required by applicable law or agreed to in writing, software

    public void updateElement(UIElement element, Map parameters) {
            HandlerUtil.getActiveWorkbenchWindow(event),
        if (dataSourceContainer == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * DBeaver - Universal Database Manager
public class HandlerDashboardCreate extends AbstractDataSourceHandler implements IElementUpdater {
import org.jkiss.utils.CommonUtils;
import org.eclipse.core.commands.ExecutionEvent;
/*
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at

            element.setText("New dashboard for '" + dataSourceContainer.getName() + "'");

import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
        } else {
package org.jkiss.dbeaver.ui.dashboard.navigator;
            new DashboardCreateWizard(dataSourceContainer));
        DBPDataSourceContainer dataSourceContainer = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.menus.UIElement;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.eclipse.ui.commands.IElementUpdater;
        }
} * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
        dialog.open();
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;
 *
 * you may not use this file except in compliance with the License.
 * limitations under the License.
import org.eclipse.ui.handlers.HandlerUtil;
            UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart());
