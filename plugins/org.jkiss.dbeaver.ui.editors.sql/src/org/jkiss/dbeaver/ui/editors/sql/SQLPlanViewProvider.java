
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql;
 * you may not use this file except in compliance with the License.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
 */
 * See the License for the specific language governing permissions and

    void visualizeQueryPlan(Viewer viewer, SQLQuery query, DBCPlan plan);
public interface SQLPlanViewProvider {
 * You may obtain a copy of the License at
 *
 */

    Viewer createPlanViewer(IWorkbenchPart workbenchPart, Composite parent);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager
import org.eclipse.jface.viewers.Viewer;
 * Unless required by applicable law or agreed to in writing, software
/*

import org.jkiss.dbeaver.model.sql.SQLQuery;
 * SQLPlanViewProvider
 * limitations under the License.
}
    void contributeActions(Viewer viewer, IContributionManager contributionManager, SQLQuery lastQuery, DBCPlan lastPlan);
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.action.IContributionManager;
/**

import org.eclipse.ui.IWorkbenchPart;
