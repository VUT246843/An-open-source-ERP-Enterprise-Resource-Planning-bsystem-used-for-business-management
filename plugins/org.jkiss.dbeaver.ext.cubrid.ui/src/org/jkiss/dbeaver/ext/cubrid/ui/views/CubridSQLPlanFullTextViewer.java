    public ISelection getSelection() {
import org.eclipse.swt.widgets.Control;


    }
        this.fullText.setText(query.getText());
import org.eclipse.swt.widgets.Composite;

package org.jkiss.dbeaver.ext.cubrid.ui.views;
    @Override
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.swt.custom.SashForm;
    }
 * DBeaver - Universal Database Manager
    }

 * You may obtain a copy of the License at
    }
 * you may not use this file except in compliance with the License.
    public void refresh() {
 * limitations under the License.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Text;
        Text text = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
 */
        text.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
    public Control getControl() {
import org.jkiss.dbeaver.ui.UIUtils;
    public void setInput(Object input) {

    private SashForm textPanel;
    @Override
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        Composite composite = UIUtils.createPlaceholder(parent, 1);
import org.eclipse.jface.viewers.Viewer;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
/*


        return null;
 *
import org.jkiss.dbeaver.model.sql.SQLQuery;
        textPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        return text;
    public void setSelection(ISelection selection, boolean reveal) {
import org.eclipse.swt.SWT;

        sqlText = createReadOnlyText(textPanel);
import org.eclipse.ui.IWorkbenchPart;
    public Object getInput() {


public class CubridSQLPlanFullTextViewer extends Viewer {
}
    private Text sqlText;
    private Text fullText;
    }
    @Override
        textPanel = UIUtils.createPartDivider(workbenchPart, composite, SWT.VERTICAL);
import org.eclipse.swt.layout.GridData;
        return null;
    @Override
    }

import org.eclipse.jface.viewers.ISelection;
        return textPanel.getParent();
 *     http://www.apache.org/licenses/LICENSE-2.0
        fullText = createReadOnlyText(textPanel);
 * See the License for the specific language governing permissions and
        textPanel.setWeights(new int[] {80, 20});
 *
    @Override
    public void showPlan(SQLQuery query, DBCPlan plan) {
    private Text createReadOnlyText(Composite parent) {
        this.sqlText.setText(plan.getQueryString());
    public CubridSQLPlanFullTextViewer(IWorkbenchPart workbenchPart, Composite parent) {
 *

