import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

            //this.planTree.createProgressPanel(composite);
            {
    }
            this.planTree = new PlanNodesTree(leftPanel, SWT.SHEET, workbenchPart.getSite());
import org.jkiss.dbeaver.ui.ActionUtils;
    public void refresh() {
import org.eclipse.swt.graphics.Point;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        return null;
 */
 *
}        ISelection selection = planTree.getItemsViewer().getSelection();
            planProperties = new PropertyTreeViewer(planPanel, SWT.H_SCROLL | SWT.V_SCROLL);
            //leftPanel.setMaximizedControl(planTree);
    @Override
            leftPanel = UIUtils.createPartDivider(workbenchPart, planPanel, SWT.VERTICAL);

    @Override

 * SQLPlanTreeViewer
        }
    private class ToggleViewAction extends Action {
    private PropertyTreeViewer planProperties;
        this.toggleViewAction = new ToggleViewAction();
    }
        this.sqlText.setText(query.getText());
                message = null;//"No connection or data source doesn't support execution plan";
        this.query = query;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private SQLQuery query;
        //this.planPanel.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
    public SQLPlanTreeViewer(final IWorkbenchPart workbenchPart, Composite parent)
        return null;
        @Override
/**

        }
    {
            Object element = ((IStructuredSelection) selection).getFirstElement();

        planTree.getControl().addPaintListener(e -> {
                (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS))
    }
        return query;
        //planPanel.setMaximizedControl(planTree);
            if (element != selectedElement) {
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
    }
public class SQLPlanTreeViewer extends Viewer
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.action.IContributionManager;
            gd.verticalIndent = 0;


        return planTree.getItemsViewer();
        return planPanel.getParent();
    }
import org.jkiss.utils.CommonUtils;
        contributionManager.add(toggleViewAction);
        {
        this.planPanel = UIUtils.createPartDivider(workbenchPart, composite, SWT.HORIZONTAL);
        {
    }
                e.detail = SWT.TRAVERSE_NONE;
            }
        }
            super(SQLEditorMessages.editors_sql_explain_refresh_tree_viewer_plan_toggle_view_text, 
import org.jkiss.dbeaver.ui.UIUtils;
            if (query == null) {


import org.jkiss.dbeaver.model.DBIcon;
 * See the License for the specific language governing permissions and
    }
import org.eclipse.swt.custom.SashForm;
            leftPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
    private void showPlanNode()
        this.planTree.showPlan(query.getDataSource(), plan);
import org.jkiss.dbeaver.ui.DBeaverIcons;
            gd.horizontalIndent = 0;
    {
    @Override
            if (toggleViewAction.isEnabled() &&
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
import org.jkiss.dbeaver.model.sql.SQLQuery;
        {
    public void setInput(Object input) {
    void showPlan(SQLQuery query, DBCPlan plan) {
 *
    public void setSelection(ISelection selection, boolean reveal) {

            }
        } else if (selection instanceof IStructuredSelection) {
    public Control getControl()
import org.eclipse.swt.graphics.Rectangle;
            final Control maxControl = leftPanel.getMaximizedControl();
        planPanel.setWeights(new int[] {70, 30});
    }
        this.planPanel.setLayout(gl);
    private SashForm planPanel;
    // Actions
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
        super();
                selectedElement = element;
    public Viewer getViewer()
                e.gc.drawText(message, (bounds.width - ext.x) / 2, bounds.height / 3 + 20);
    //static final Log log = Log.getLog(ResultSetViewer.class);
        }
                leftPanel.setMaximizedControl(planTree);
        Composite composite = UIUtils.createPlaceholder(parent, 1);
                toggleViewAction.run();
 * distributed under the License is distributed on an "AS IS" BASIS,

        gl.marginWidth = 0;
                DBeaverIcons.getImageDescriptor(DBIcon.SQL_TEXT));
        });

        planTree.getItemsViewer().addSelectionChangedListener(event -> showPlanNode());

                    workbenchPart.getSite(), false);
        gl.marginHeight = 0;

            if (maxControl == null) {


    }
            planProperties.clearProperties();

    private transient Object selectedElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.action.Action;

import org.eclipse.swt.layout.GridData;
            //this.planTree.setShowDivider(true);
        createActions();
    }
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
                PropertyCollector propertySource = new PropertyCollector(element, true);
import org.eclipse.swt.widgets.Composite;
                    SQLEditorCommands.CMD_EXPLAIN_PLAN,
        {
 *
    }
                Rectangle bounds = planTree.getBounds();
        private ToggleViewAction()
            if (message != null) {
            GridData gd = new GridData(GridData.FILL_BOTH);
                message = "Select a query and run " + ActionUtils.findCommandDescription(
import org.eclipse.swt.widgets.Control;
        }
    /////////////////////////////////////////////////
    }
            leftPanel.setWeights(new int[] {80, 20});
            } else if (CommonUtils.isEmpty(sqlText.getText())) {

    private final SashForm leftPanel;
 * DBeaver - Universal Database Manager

import org.eclipse.ui.IWorkbenchPart;
            sqlText = new Text(leftPanel, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
    private ToggleViewAction toggleViewAction;
        this.planTree.getControl().addTraverseListener(e -> {
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
    private Text sqlText;
        final GridLayout gl = new GridLayout(1, false);
                propertySource.collectProperties();
import org.eclipse.swt.layout.GridLayout;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

{

    public Object getInput() {
package org.jkiss.dbeaver.ui.editors.sql.plan.simple;

    {
            } else {
 * limitations under the License.
    public SQLQuery getQuery() {

import org.eclipse.swt.SWT;

    void contributeActions(IContributionManager contributionManager, SQLQuery lastQuery, DBCPlan lastPlan) {
import org.eclipse.swt.widgets.Text;
    @Override
            }

 */
            String message = null;



        if (selection.isEmpty()) {
                leftPanel.setMaximizedControl(null);

        this.planPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
                Point ext = e.gc.textExtent(message);

            }
/*
        });
        this.toggleViewAction.setEnabled(true);
    public ISelection getSelection() {
                e.doit = false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.jface.viewers.Viewer;
            }
    private PlanNodesTree planTree;

 * You may obtain a copy of the License at
    /////////////////////////////////////////////////
    @Override
            planTree.setLayoutData(gd);
    {
                planProperties.loadProperties(propertySource);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    // Viewer
        public void run()
        this.toggleViewAction.setEnabled(false);

    private void createActions()
    {
