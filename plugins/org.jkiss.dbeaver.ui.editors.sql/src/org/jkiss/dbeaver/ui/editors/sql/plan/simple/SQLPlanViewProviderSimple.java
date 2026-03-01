

    protected void showPlan(Viewer viewer, SQLQuery query, DBCPlan plan) {
        SQLPlanTreeViewer treeViewer = (SQLPlanTreeViewer) viewer;
    public void visualizeQueryPlan(Viewer viewer, SQLQuery query, DBCPlan plan) {        
    public void contributeActions(Viewer viewer, IContributionManager contributionManager, SQLQuery lastQuery, DBCPlan lastPlan) {

    @Override
import org.eclipse.swt.widgets.Composite;
        return treeViewer;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.viewers.Viewer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * SQLPlanViewProviderSimple
        fillPlan(query,plan);
public class SQLPlanViewProviderSimple extends SQLPlanSaveProvider {
 * you may not use this file except in compliance with the License.
}
    }
    }
    public Viewer createPlanViewer(IWorkbenchPart workbenchPart, Composite parent) {
import org.jkiss.dbeaver.model.sql.SQLQuery;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        treeViewer.showPlan(query, plan);      

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
        SQLPlanTreeViewer treeViewer = (SQLPlanTreeViewer) viewer;
        treeViewer.contributeActions(contributionManager, lastQuery, lastPlan);


/*
    }

 * Unless required by applicable law or agreed to in writing, software
 */
/**
 *
    @Override
 */
    @Override
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.jface.action.IContributionManager;
        showPlan(viewer,query, plan);
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLPlanSaveProvider;
 *
        super.contributeActions(viewer, contributionManager, lastQuery, lastPlan);
        SQLPlanTreeViewer treeViewer = new SQLPlanTreeViewer(workbenchPart, parent);
    @Override
package org.jkiss.dbeaver.ui.editors.sql.plan.simple;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

