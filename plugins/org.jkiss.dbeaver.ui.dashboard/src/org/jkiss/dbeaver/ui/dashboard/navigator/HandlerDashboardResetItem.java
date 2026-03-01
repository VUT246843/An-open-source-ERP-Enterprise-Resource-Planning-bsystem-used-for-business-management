                    for (DashboardItemContainer dc : gc.getItems()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (view != null) {

            } else {
    }
        DashboardViewer view = getActiveDashboardView(event);
    @Override

                for (DashboardGroupContainer gc : view.getDashboardListViewer().getGroups()) {
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;

            if (selectedDashboard != null) {
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.ui.dashboard.model.DashboardGroupContainer;
                }
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
                    }
public class HandlerDashboardResetItem extends HandlerDashboardAbstract {
/*
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionException;
            DashboardItemContainer selectedDashboard = getSelectedDashboard(view);
package org.jkiss.dbeaver.ui.dashboard.navigator;
} */
                        dc.resetDashboardData();
 *
 * DBeaver - Universal Database Manager
                selectedDashboard.resetDashboardData();
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
