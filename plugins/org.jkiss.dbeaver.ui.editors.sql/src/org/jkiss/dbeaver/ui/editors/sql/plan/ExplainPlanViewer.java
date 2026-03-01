    
        private Viewer viewer;
import org.jkiss.dbeaver.DBException;
        public void fillCustomActions(IContributionManager contributionManager) {
        if (planner == null) {
            planViewComposite.layout();


import org.jkiss.dbeaver.ui.controls.VerticalButton;
        VerticalButton[] items = tabViewFolder.getItems();
        public DBCPlan evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Override
        }
        private final DBCExecutionContext executionContext;
        ProgressControl(Composite parent) {
                    lastQuery = new SQLQuery(

    }
            this.query = query;
            try {
    public static DBCQueryPlannerConfiguration makeExplainPlanConfiguration(DBRProgressMonitor monitor, DBCQueryPlanner planner) {
                    if (viewDesc.getIcon() != null) {
/**

                if (configuration == null) {
        }
import java.util.Collections;
                }
            activeViewInfo = null;
    private PlanViewInfo activeViewInfo;
    private int planNumber;
        }
            }
import org.eclipse.swt.widgets.FileDialog;
                curFolder = fd.getFilterPath();
        }
                explainService.cancel();
 *
                    refresh();
        {
    }
import org.jkiss.dbeaver.model.DBPDataSource;
        }
        this.planPresentationContainer = new ProgressControl(parent);

    private class ProgressControl extends ProgressPageControl {
                activeViewInfo.planViewer.contributeActions(activeViewInfo.viewer, contributionManager, lastQuery, lastPlan);
            if (viewInfo.viewer != null) {
import org.eclipse.jface.viewers.ISelection;
    @Override
                    }
        private SQLPlanViewDescriptor descriptor;


                }
        PlanViewInfo[] infos = new PlanViewInfo[items.length];
        activeViewInfo = (PlanViewInfo) viewButton.getData();
                    lastQueryId = lastPlan.getQueryString();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    public void explainQueryPlan(SQLQuery query, Object queryId) {

    @Override
        return activeViewInfo == null ? null : activeViewInfo.viewer.getSelection();

import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorActivator;
                    lastPlan = ((DBCQueryPlannerSerializable) planner).deserialize(r);
            FileDialog fd = new FileDialog(viewer.getControl().getShell(), SWT.OPEN | SWT.SINGLE);
            super("Explain plan", planner.getDataSource());
        this.refreshPlanAction = new RefreshPlanAction();
    private void visualizePlan(DBCPlan plan) {
    private final VerticalFolder tabViewFolder;
                }
            for (SQLPlanViewDescriptor viewDesc : instance.getPlanViewDescriptors()) {
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizerExt;
            super.fillCustomActions(contributionManager);
            infos[i] = (PlanViewInfo) items[i].getData();
            ((GridLayout)tabViewFolder.getLayout()).marginTop = 20;

        }
            super(SQLEditorMessages.editors_sql_explain_refresh_plan_action_text, DBeaverIcons.getImageDescriptor(UIIcon.REFRESH));
    @Override
    private final DBPContextProvider contextProvider;
        this.lastQuery = query;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.eclipse.jface.action.IContributionManager;
                treeViewButton.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                    DBWorkbench.getPlatformUI().showError("Load plan", "Error loading plan ", CommonUtils.getRootCause(e));
import org.eclipse.jface.viewers.Viewer;
 * See the License for the specific language governing permissions and
        }
        public void run()
        if (activeViewInfo != null) {
        }
                treeViewButton.setData(new PlanViewInfo(viewDesc));
import org.jkiss.dbeaver.model.exec.DBExecUtils;
    private IDialogSettings getPlanViewSettings() {

            return plannerConfigurator.configureObject(monitor, null, planner, configuration, Collections.emptyMap());

import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.utils.CommonUtils;
        this.workbenchPart = workbenchPart;
        for (int i = 0; i < items.length; i++) {
            activeViewInfo.viewer.setInput(input);
    private final Composite planViewComposite;
        DBCQueryPlanner planner;
        return false;
        ExplainPlanService(DBCQueryPlanner planner, DBCExecutionContext executionContext, String query, Object savedQueryId)
        for (PlanViewInfo viewInfo : getPlanViews()) {
import org.eclipse.jface.dialogs.IDialogSettings;
    private void changeActiveView(VerticalButton viewButton) throws DBException {
        refresh();

import org.jkiss.dbeaver.model.exec.DBCSession;
            planner = GeneralUtils.adapt(dataSource, DBCQueryPlanner.class);
        }
    }
            if (activeViewInfo != null && activeViewInfo.viewer != null) {
        protected boolean cancelProgress() {
        {
        DBCExecutionContext executionContext = contextProvider.getExecutionContext();
            PlanViewInfo data = (PlanViewInfo) item.getData();
            planViewComposite.setLayout(new StackLayout());
                planPresentationContainer.createVisualizer());
        planPresentationContainer.refreshActions();
        if (activeViewInfo != null) {
                if (plan != null) {
            if (explainService != null) {

                    changeActiveView(tabViewFolder.getSelection());
        } else {
                        e);
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
        {
            if (curItem == null) {
            explainService = LoadingJob.createService(
            }
    }
    }
            });
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
 *

            ((StackLayout) planViewComposite.getLayout()).topControl = activeViewInfo.viewer.getControl();
                if (workbenchPart instanceof SQLEditor) {
        private final Object savedQueryId;
        @Override
 * Unless required by applicable law or agreed to in writing, software
                }
            planViewComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    public boolean loadQueryPlan(DBCQueryPlanner planner, Viewer viewer) {
import org.jkiss.dbeaver.ui.editors.sql.SQLPlanSaveProvider;
        return lastQuery;


    @Override
import org.eclipse.swt.layout.GridLayout;
import java.io.IOException;
 */
        return UIUtils.getSettingsSection(SQLEditorActivator.getDefault().getDialogSettings(), getClass().getSimpleName());

        DBCQueryPlannerConfiguration configuration = new DBCQueryPlannerConfiguration();
                    try (DBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Explain '" + query + "'")) {
import org.jkiss.dbeaver.ui.UIUtils;

            return plan;
        if (activeViewInfo.planViewer == null) {
        return configuration;
import org.eclipse.swt.widgets.Control;
                            lastPlan.getQueryString());
                        SQLEditorMessages.editors_sql_error_execution_plan_message,
            }
                new ExplainPlanService(planner, executionContext, lastQuery.getText(), lastQueryId),
                    ((SQLEditor) workbenchPart).refreshActions();
import org.jkiss.dbeaver.ui.internal.UIMessages;
                    treeViewButton.setToolTipText(viewDesc.getDescription());
            fd.setFilterExtensions(SQLPlanSaveProvider.EXT);
            this.savedQueryId = savedQueryId;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
                }
                viewInfo.planViewer.visualizeQueryPlan(viewInfo.viewer, lastQuery, plan);
import org.jkiss.dbeaver.Log;
                try (Reader r = new FileReader(selected)) {
        if (activeViewInfo != null && activeViewInfo.viewer instanceof IAdaptable) {
                } catch (DBException e) {
        if (executionContext != null) {
                throw new InvocationTargetException(ex);

            String selected = fd.open();
package org.jkiss.dbeaver.ui.editors.sql.plan;
                        } else {
    private LoadingJob<DBCPlan> explainService;
    public void refresh() {
    private static class PlanViewInfo {
            return ((IAdaptable) activeViewInfo.viewer).getAdapter(adapter);
            activeViewInfo.viewer = activeViewInfo.planViewer.createPlanViewer(workbenchPart, planViewComposite);
import org.eclipse.swt.layout.GridData;
    private SQLQuery lastQuery;

    private String curFolder;
        }
        }
    private PlanViewInfo[] getPlanViews() {
        {
}
    private final IWorkbenchPart workbenchPart;
    private class RefreshPlanAction extends Action {

            DBPDataSource currentDataSource = null;
                        contextProvider.getExecutionContext().getDataSource(),
        return planPresentationContainer;
        this.planPresentationContainer.setLayoutData(new GridData(GridData.FILL_BOTH));



    }

        DBEObjectConfigurator<DBCQueryPlannerConfiguration> plannerConfigurator = GeneralUtils.adapt(planner, DBEObjectConfigurator.class);
                } catch (IOException | InvocationTargetException e) {
        }
            } catch (Throwable ex) {
                explainService = null;
            tabViewFolder.addListener(SWT.Selection, event -> {
        tabViewFolder.setSelection(curItem);
 */
        if (activeViewInfo.planViewer != null) {
        private final DBCQueryPlanner planner;
        }
            explainService.schedule();
import org.jkiss.dbeaver.ui.editors.sql.plan.registry.SQLPlanViewDescriptor;
    public Control getControl() {

            getPlanViewSettings().put("activeView", activeViewInfo.descriptor.getId());
                return true;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    DBWorkbench.getPlatformUI().showError(
        this.contextProvider = contextProvider;
            DBWorkbench.getPlatformUI().showError("No SQL Plan","This datasource doesn't support execution plans");
import org.eclipse.swt.custom.StackLayout;

 * You may obtain a copy of the License at
    public void setSelection(ISelection selection, boolean reveal) {
        return activeViewInfo == null ? null : activeViewInfo.viewer.getInput();
    public Object getInput() {

 *

            activeViewInfo.planViewer = activeViewInfo.descriptor.createInstance();
 * ResultSetViewer
            planner = null;
            }
            DBPDataSource dataSource = executionContext.getDataSource();
    public ISelection getSelection() {

                super.completeLoading(plan);
        return infos;
    }
        progressPanel.setLayoutData(gd);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
            this.planner = planner;
/*
                if (viewDesc.isDataSourceSpecific() && !viewDesc.supportedBy(currentDataSource)) {


        this.refreshPlanAction.setEnabled(false);
    }
    @Override
                curItem = item;
import org.eclipse.swt.SWT;
        }
    }

                treeViewButton.setText(viewDesc.getLabel());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import java.io.Reader;
 * Licensed under the Apache License, Version 2.0 (the "License");
            public void finalizeLoading() {
    }
    static final Log log = Log.getLog(ExplainPlanViewer.class);
        public PlanViewInfo(SQLPlanViewDescriptor descriptor) {
                DBExecUtils.tryExecuteRecover(monitor, executionContext.getDataSource(), param -> {
        return planNumber;
    }
        private DBCPlan plan;
                    visualizePlan(plan);
        gd.horizontalSpan = 2;
        private SQLPlanViewProvider planViewer;
    private final ProgressControl planPresentationContainer;
            }
        this.planPresentationContainer.getLayout().numColumns = 2;
import java.lang.reflect.InvocationTargetException;
    // Viewer
        }
import org.eclipse.swt.widgets.Composite;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                            plan = planner.planQueryExecution(session, query, configuration);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);


import org.jkiss.dbeaver.model.DBPContextProvider;
        return null;
        } else {
        if (plannerConfigurator != null) {
            if (this.contextProvider != null && this.contextProvider.getExecutionContext() != null) {
        {
            if (selected != null) {
        this.lastQueryId = queryId;
    }
    }
    @Override
        private RefreshPlanAction()
import org.jkiss.dbeaver.ui.controls.VerticalFolder;
            @Override

        this.lastPlan = plan;
import org.jkiss.dbeaver.utils.GeneralUtils;
                // We need to update UI controls state after error dialog
    @Override

            }
 * DBeaver - Universal Database Manager
                        SQLEditorMessages.editors_sql_error_execution_plan_title,
                        if (savedQueryId != null && planner instanceof DBCSavedQueryPlanner) {
                    return true;
    }
        }
            }
        for (VerticalButton item : tabViewFolder.getItems()) {
import org.eclipse.jface.action.Action;
                    continue;
        VerticalButton curItem = null;


import org.jkiss.dbeaver.ui.LoadingJob;
        }
        planPresentationContainer.refreshActions();
    public ExplainPlanViewer(final IWorkbenchPart workbenchPart, DBPContextProvider contextProvider, Composite parent, int planNumber)
    }

    private DBCPlan lastPlan;
    }
 * limitations under the License.
    /////////////////////////////////////////////////////////

                        }
                try {
    private RefreshPlanAction refreshPlanAction;
        IDialogSettings settings = getPlanViewSettings();
    private Object lastQueryId;
                curItem = item;
import org.eclipse.core.runtime.IAdaptable;
        Composite progressPanel = planPresentationContainer.createProgressPanel();
        @Override
        }

            return false;
            @Override
            }
        planPresentationContainer.setShowDivider(false);
    public void setInput(Object input) {
        @Override
                            plan = ((DBCSavedQueryPlanner) planner).readSavedQueryExecutionPlan(session, savedQueryId);
import org.jkiss.dbeaver.ui.editors.sql.plan.registry.SQLPlanViewRegistry;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        String activeViewId = settings.get("activeView");
        } else {
        private final String query;
            tabViewFolder.setLayoutData(new GridData(GridData.FILL_VERTICAL));
            if (lastPlan != null) {

            tabViewFolder = new VerticalFolder(planPresentationContainer, SWT.LEFT);



                }

            }
            } else if (activeViewId != null && activeViewId.equals(data.descriptor.getId())) {
    {
            }

        }

            SQLPlanViewRegistry instance = SQLPlanViewRegistry.getInstance();
                // Redraw editor

 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
            }
            this.executionContext = executionContext;
    public int getPlanNumber() {
        this.refreshPlanAction.setEnabled(true);
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                DBCQueryPlannerConfiguration configuration = makeExplainPlanConfiguration(monitor, planner);
                        treeViewButton.setImage(DBeaverIcons.getImage(viewDesc.getIcon()));
                if (!CommonUtils.isEmpty(viewDesc.getDescription())) {
    public <T> T getAdapter(Class<T> adapter) {
            fd.setFilterPath(curFolder);
        class PlanLoadVisualizer extends ProgressVisualizer<DBCPlan> implements ILoadVisualizerExt {
            super(parent, SWT.SHEET);
            fd.setText(UIMessages.save_execution_plan);
            ExplainPlanViewer.this.refresh();
        }
public class ExplainPlanViewer extends Viewer implements IAdaptable
                    return null;
{
            return new PlanLoadVisualizer();
                VerticalButton treeViewButton = new VerticalButton(tabViewFolder, SWT.LEFT | SWT.RADIO);
            public void completeLoading(DBCPlan plan) {
import org.jkiss.dbeaver.model.exec.plan.*;
    public SQLQuery getQuery() {


    public static class ExplainPlanService extends DatabaseLoadService<DBCPlan> {
            activeViewInfo.viewer.setSelection(selection, reveal);
            planViewComposite = new Composite(planPresentationContainer, SWT.NONE);

                });
                currentDataSource = this.contextProvider.getExecutionContext().getDataSource();

                activeViewInfo.planViewer.visualizeQueryPlan(activeViewInfo.viewer, lastQuery, lastPlan);
import org.jkiss.dbeaver.ui.DBeaverIcons;
        this.planNumber = planNumber;
        }

    };
import java.io.FileReader;
                }
import org.eclipse.ui.IWorkbenchPart;
import org.jkiss.dbeaver.ui.editors.sql.SQLPlanViewProvider;

            contributionManager.add(refreshPlanAction);
        if (planner instanceof DBCQueryPlannerSerializable) {

import org.jkiss.dbeaver.model.sql.SQLQuery;
        }
            this.descriptor = descriptor;
        PlanLoadVisualizer createVisualizer() {
