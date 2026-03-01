import org.eclipse.ui.IWorkbenchPart;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }

import org.jkiss.dbeaver.ext.cubrid.model.plan.CubridPlanAnalyser;
    public void visualizeQueryPlan(Viewer viewer, SQLQuery query, DBCPlan plan) {
    }
        SQLQuery fullText = new SQLQuery(query.getDataSource(), ((CubridPlanAnalyser) plan).getPlanQueryString());
        fullText.showPlan(query, plan);
 *
 * See the License for the specific language governing permissions and
    protected void showPlan(Viewer viewer, SQLQuery query, DBCPlan plan) {
import org.jkiss.dbeaver.ext.cubrid.ui.views.CubridSQLPlanFullTextViewer;
 * limitations under the License.
        showPlan(viewer, fullText, plan);

        CubridSQLPlanFullTextViewer treeViewer = new CubridSQLPlanFullTextViewer(workbenchPart, parent);
import org.jkiss.dbeaver.model.sql.SQLQuery;
}
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    @Override

        return treeViewer;


    }
        CubridSQLPlanFullTextViewer fullText = (CubridSQLPlanFullTextViewer) viewer;
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
public class CubridSQLPlanViewProvider extends SQLPlanSaveProvider {
 */
/*
import org.eclipse.swt.widgets.Composite;

package org.jkiss.dbeaver.ext.cubrid.ui.editors;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.editors.sql.SQLPlanSaveProvider;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.eclipse.jface.viewers.Viewer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Viewer createPlanViewer(IWorkbenchPart workbenchPart, Composite parent) {

