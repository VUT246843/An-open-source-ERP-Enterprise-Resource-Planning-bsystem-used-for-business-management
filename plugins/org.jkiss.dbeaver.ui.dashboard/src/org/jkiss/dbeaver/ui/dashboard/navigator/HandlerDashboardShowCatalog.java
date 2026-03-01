 *
        DashboardViewer view = getActiveDashboardView(event);
 * See the License for the specific language governing permissions and

 * limitations under the License.
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
                }
    @Override
                if (listViewer.isVisible()) {
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
            DashboardListViewer listViewer = view.getDashboardListViewer();
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        }
 */
import static org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants.PARAM_CATALOG_PANEL_TOGGLE;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 *

            }
 * You may obtain a copy of the License at
            if (event.getParameter(PARAM_CATALOG_PANEL_TOGGLE) != null) {
        return null;

public class HandlerDashboardShowCatalog extends HandlerDashboardAbstract {
package org.jkiss.dbeaver.ui.dashboard.navigator;
                } else {
 * Unless required by applicable law or agreed to in writing, software
        if (view != null) {
                    listViewer.showChartCatalog();

import org.jkiss.dbeaver.ui.dashboard.control.DashboardListViewer;
}
import org.eclipse.core.commands.ExecutionException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Object execute(ExecutionEvent event) throws ExecutionException {
                    listViewer.hideChartCatalog();
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.commands.ExecutionEvent;
