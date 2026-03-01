                        String sqlScript = ((DBAServerSessionManagerSQL) sessionManager).generateSessionReadQuery(getSessionOptions());
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
                    {

            return LoadingJob.createService(new LoadSessionsService(), new SessionLoadVisualizer());
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                ((DBAServerSessionManagerSQL) sessionManager).canGenerateSessionReadQuery())
            protected void afterCompleteLoading(@NotNull Collection<SESSION_TYPE> items) {
                    @Override
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
                    }
        }
        }
                return Collections.emptyList();

import org.eclipse.ui.IWorkbenchPart;
                                DetailsListControl detailsViewer = (DetailsListControl) item.getControl();
                    }
            @Override
    private class SessionListControl extends SessionTable<SESSION_TYPE> {
import org.eclipse.ui.PartInitException;
            }
                        if (data instanceof DBAServerSessionDetails) {
public class SessionManagerViewer<SESSION_TYPE extends DBAServerSession>
        private class SearchFilter extends ViewerFilter {
            if (data instanceof DBAServerSessionDetails) {
                            CTabItem extDetailsItem = new CTabItem(detailsFolder, SWT.NONE);
                if (sessionManager instanceof DBAServerSessionDetailsProvider) {
        protected LoadingJob<Collection<DBPObject>> createLoadService(boolean forUpdate) {
        refreshControl.scheduleAutoRefresh(false);

    private Object selectedPlanElement;
                super.completeLoading(items);
    protected SessionManagerViewer(IWorkbenchPart part, Composite parent, final DBAServerSessionManager<SESSION_TYPE> sessionManager) {
            sessionTable.createProgressPanel(composite);
        ISelection selection = sessionTable.getSelectionProvider().getSelection();
            contributeToToolbar(getSessionManager(), contributionManager);
                                text.setBackground(UIStyles.getDefaultTextBackground());

            if (sessionManager instanceof DBAServerSessionManagerSQL &&

import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
                try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, "Load session details (" + sessionDetails.getDetailsTitle() + ")")) {
            sessionTable.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            }

                    public void widgetSelected(SelectionEvent e) {
    private final DBAServerSessionManager<SESSION_TYPE> sessionManager;
            try {
            }).schedule();
        sashMain.setLayoutData(new GridData(GridData.FILL_BOTH));
 *     http://www.apache.org/licenses/LICENSE-2.0
                            text.append(GeneralUtils.getDefaultLineSeparator());
            {
            @Override
                            } catch (CoreException e) {
                DBWorkbench.getPlatformUI().showError(sessionTable.getShell().getText(), null, e);
            final Pattern pattern;
import org.eclipse.swt.custom.SashForm;
            sessionTable.getItemsViewer().addSelectionChangedListener(event -> onSessionSelect(getSelectedSession()));
                                extDetailsItem.setImage(DBeaverIcons.getImage(detailsInfo.getDetailsIcon()));
            Object data = detailsItem.getData();
        }
        this.subSite = new SubEditorSite(workbenchPart.getSite());
                        }
                Object text = sqlViewer.getAdapter(Control.class);
                }
        private DBAServerSessionDetails sessionDetails;


                planViewer.explainQueryPlan(new SQLQuery(sessionManager.getDataSource(), sqlText), curSession.getActiveQueryId());
            {
                                sessionManager.getDataSource().getContainer(),
import org.jkiss.dbeaver.model.admin.sessions.*;
                {
                            if (DBPObjectWithDescription.class.isAssignableFrom(detailsType)) {
    }
                        onSessionSelect(null);
        {

    private static final Log log = Log.getLog(SessionManagerViewer.class);
                }
import org.eclipse.osgi.util.NLS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private final CTabItem detailsItem;
                        (options & SEARCH_CASE_SENSITIVE) != 0);
                sessionProps.loadProperties(propCollector);
        UIUtils.dispose(boldFont);
                                    sqlScript
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private class SessionDetailsLoadService extends DatabaseLoadService<Collection<DBPObject>> {
    {
import org.eclipse.swt.custom.CTabItem;
                        Object data = item.getData();
import org.eclipse.jface.action.IAction;
        protected final Map<String, Object> getSessionOptions() {
 * DBeaver - Universal Database Manager
                new ObjectsLoadVisualizer());
        }
        //$NON-NLS-1$
                    StringBuilder text = new StringBuilder();
                            }
                                text.setData(detailsInfo);
import org.jkiss.dbeaver.model.sql.SQLQuery;
    private final IEditorSite subSite;
        @Override

                                SQLEditorHandlerOpenObjectConsole.openAndExecuteSQLScript(
        } else if (planViewer != null) {
            }
            }
            String sqlText = curSession == null ? "" : CommonUtils.notEmpty(curSession.getActiveQuery());
        if (selection.isEmpty()) {
                    public void run()
                }
                    @Nullable
                sessionProps = new PropertyTreeViewer(detailsFolder, SWT.NONE);
            super(parent, SWT.SHEET, site, new ListContentProvider());
                    {
            sqlViewer.reloadSyntaxRules();
    private final CTabFolder previewFolder;
                                    matches = true;
                new SessionDetailsLoadService(sessionDetails),
                    log.error(e);
                }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                        if (item instanceof DBPObjectWithDescription) {
        sessionTable.disposeControl();
 *
                try {

import java.util.*;
                public void completeLoading(Collection<DBPObject> dbpObjects) {
                    }
            new ProgressLoaderVisualizer<>(loadingService, styledText) {
            @Override

        String activeQuery = element.getActiveQuery();
                detailsItem.setText(SessionEditorMessages.viewer_details_item_details);
                }
import org.jkiss.dbeaver.model.DBUtils;
        sqlPlanItem.setControl(planViewer.getControl());
                            }
            List<DBAServerSession> sessions = new ArrayList<>();
    public DBAServerSession getSelectedSession() {

import org.eclipse.jface.action.Action;
                sqlViewItem.setImage(DBeaverIcons.getImage(DBIcon.SQL_TEXT));
            @Override
            super(sash, SWT.SHEET, site, sessionManager);
    private final Font boldFont;
                PropertyCollector propertySource = new PropertyCollector(element, true);
                        for (DBPPropertyDescriptor property : getAllProperties()) {
    public void refreshSessions() {


                setListData(items, false, false, true);
            throws InvocationTargetException, InterruptedException
        @Override
                                detailsViewer.loadData();
                    DetailsListControl detailsListControl = (DetailsListControl) detailsItem.getControl();
                detailsItem.setImage(DBeaverIcons.getImage(UIIcon.PROPERTIES));
                            text.append(((DBPObjectWithDescription) item).getDescription());
        }
    public Composite getControl() {
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        } else {
            updateSQL();
            return true;
            }
                        }
                        result.addAll(sessionDetails);
            if (!CommonUtils.isEmpty(sqlText)) {
                            if (property instanceof ObjectPropertyDescriptor) {
    @Nullable
    }
                        for (DBAServerSessionDetails detailsInfo : sessionDetails) {
            loadingService,
            return;
        {
            CTabItem detailsItem = detailsFolder.getItem(detailsFolder.getSelectionIndex());
        selectedPlanElement = null;
    public DatabaseObjectListControl getSessionListControl() {
        }
        this.sessionManager = sessionManager;
                        if (!CommonUtils.isEmpty(sqlScript)) {
import org.jkiss.utils.CommonUtils;
        settings = UIUtils.getDialogSettings("DBeaver." + sessionEditor.getClass().getSimpleName());
    private void updateSQL() {
        private class SessionSearcher implements ISearchExecutor {
        DetailsListControl(Composite parent, IWorkbenchSite site, DBAServerSessionDetails sessionDetails) {
        }
                        return DBUtils.getDefaultContext(sessionManager.getDataSource(), false);
/**
import org.jkiss.dbeaver.ui.*;

                    }
            detailsItem.setText(SessionEditorMessages.viewer_details_item_session_details);
                propertySource.collectProperties();
import org.eclipse.swt.SWT;
                        return false;
                    @Override
                    }
    void loadSettings(AbstractSessionEditor sessionEditor) {
                }
    }
//        planTree = new PlanNodesTree(previewFolder, SWT.SHEET, workbenchPart.getSite());
                sqlViewer.init(subSite, sqlInput);
            sashDetails.setLayoutData(new GridData(GridData.FILL_BOTH));
    private final SessionListControl sessionTable;
                });
                    public void widgetSelected(SelectionEvent e) {
                propCollector.collectProperties();
        }
        if (sqlViewer.getTextViewer() != null) {
                @Override
                }
                    sessionTable.getItemsViewer().setSelection(new StructuredSelection(sessionsToSelect));
                    List<DBAServerSessionDetails> sessionDetails = ((DBAServerSessionDetailsProvider) sessionManager).getSessionDetails();
/*
            try {
            sessionProps.clearProperties();
                            if (detailsInfo.getDetailsTooltip() != null) {

        CTabItem sqlPlanItem = new CTabItem(previewFolder, SWT.NONE);
                detailsFolder = new CTabFolder(sashDetails, SWT.TOP);
                                extDetailsItem.setControl(UIUtils.createLabel(detailsFolder, NLS.bind(SessionEditorMessages.viewer_unsupported_details_type_label, detailsType)));
            {
                        }
            return Collections.emptyList();
            sessionTable = new SessionListControl(sashMain, workbenchPart.getSite(), sessionManager);
import org.eclipse.jface.viewers.*;

        }
                } catch (Exception e) {
        if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
                    public DBCExecutionContext getExecutionContext() {
import org.eclipse.ui.IEditorSite;
    private void updatePreview() {
                            );
        if (activeQuery != null && searchPattern.matcher(activeQuery).find()) {
        LoadingJob.createService(
        private DBAServerSessionDetails sessionDetails;

import org.jkiss.dbeaver.utils.GeneralUtils;
                                );
                        searchString,
            return SessionManagerViewer.this.getSessionOptions();
                            Class<?> detailsType = ((DBAServerSessionDetails) data).getDetailsType();
        sessionTable.createAlterService(sessions, options).schedule();
            return LoadingJob.createService(
                                    UIUtils.getActiveWorkbenchWindow(),
                                DBWorkbench.getPlatformUI().showError(SessionEditorMessages.viewer_session_manager_error_opening_editor_title,
                selectedPlanElement = element;
                    @Override
import org.jkiss.code.NotNull;

    }
        if (curSession == session && selectedPlanElement == null) {
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
import org.jkiss.dbeaver.ui.views.session.internal.SessionEditorMessages;
                            }
import org.jkiss.dbeaver.ui.editors.sql.plan.ExplainPlanViewer;
            sashMain.setWeights(new int[] { mainSashRatio, 1000 - mainSashRatio });
            public boolean select(Viewer viewer, Object parentElement, Object element) {
            refreshControl.populateRefreshButton(contributionManager);
                        boolean matches = false;
        {
            sqlViewer.setInput(sqlInput);
    public void alterSessions(final List<SESSION_TYPE> sessions, Map<String, Object> options) {
            searcher = new SessionSearcher();
                            Class<?> detailsType = detailsInfo.getDetailsType();
    }
                    }

            // Show execution plan
                getItemsViewer().setFilters();
}                    return true;
        }
        @NotNull
    }
import org.eclipse.swt.layout.GridData;
 * You may obtain a copy of the License at
        protected LoadingJob<Collection<SESSION_TYPE>> createLoadService(boolean forUpdate) {
 * See the License for the specific language governing permissions and
                            }
        }
        } else {
        this.workbenchPart = part;
import java.util.regex.PatternSyntaxException;
import org.jkiss.code.Nullable;
            }
        sessionTable.loadData();
            this.sessionDetails = sessionDetails;
            if (curSession == null) {
            }
        sashMain.setWeights(new int[]{700, 300});
                    if (sessionDetails != null) {
                    loadPlainTextDetails((DBAServerSessionDetails) data, styledText);
                contributionManager.add(ActionUtils.makeActionContribution(new Action(SessionEditorMessages.viewer_open_sql_editor_text, IAction.AS_PUSH_BUTTON) {
                detailsFolder.addSelectionListener(new SelectionAdapter() {
                    styledText.setText(text.toString());
import org.eclipse.swt.widgets.Composite;
                            extDetailsItem.setData(detailsInfo);
        }
import org.eclipse.swt.widgets.Control;
                    if (sessionDetails != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPObject;
import java.util.regex.Pattern;


    //private Text sessionInfo;




import org.jkiss.dbeaver.model.exec.DBCSession;
        updatePreview();
            return sessions;
            public SearchFilter(String searchString, boolean caseSensitiveSearch) throws PatternSyntaxException {
                sessionProps.clearProperties();
                    return false;
import org.eclipse.swt.custom.CTabFolder;
        sqlPlanItem.setImage(DBeaverIcons.getImage(UIIcon.SQL_PAGE_EXPLAIN_PLAN));
            return new Class[] { sessionDetails.getDetailsType() };
    private IDialogSettings settings;
        protected String getListConfigId(List<Class<?>> classList) {
            });
                    } else {
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
        return sessionTable.getSuitableSelectedElement(DBAServerSession.class);
        ISelection selection = planViewer.getSelection();
                                }
                    @Override
                        return matches;
                    refreshSessions();




                } catch (PatternSyntaxException e) {
                    }


 */
        settings.put("DetailsSashRatio", sashDetails.getWeights()[0]);


                            SQLNavigatorContext navContext = new SQLNavigatorContext(
        }
                sessionProps.loadProperties(propertySource);
import org.eclipse.swt.custom.StyledText;
        this.boldFont = UIUtils.makeBoldFont(parent.getFont());
import org.eclipse.swt.graphics.Font;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final SashForm sashDetails;
                previewFolder = new CTabFolder(sashDetails, SWT.TOP);

                            } else {
    }
                            }
                                loadPlainTextDetails((DBAServerSessionDetails) data, styledText);
 * SessionManagerViewer

    public List<DBAServerSession> getSelectedSessions()

                    sessions.add((DBAServerSession) item);


        } else if (selection instanceof IStructuredSelection) {
        @Override
                PropertyCollector propCollector = new PropertyCollector(curSession, true);
                    @Override
 * limitations under the License.
                    }
                } else {

    public void dispose()
            super("Load session details " + sessionDetails.getDetailsTitle(), sessionManager.getDataSource());
        detailsItem.setText(SessionEditorMessages.viewer_plan_details_text);

                                    SessionEditorMessages.viewer_session_manager_error_opening_editor_message, e);
        SessionListControl(Composite sash, IWorkbenchSite site, DBAServerSessionManager<SESSION_TYPE> sessionManager)
                        onSessionSelect(curSession);
                updateSQL();
            } else {
                sqlViewer.reloadSyntaxRules();

                    StyledText styledText = (StyledText) detailsItem.getControl();
                    }
                            extDetailsItem.setText(detailsInfo.getDetailsTitle());


            } catch (Throwable ex) {

    private final AutoRefreshControl refreshControl;

        }
        settings.put("MainSashRatio", sashMain.getWeights()[0]);
import org.eclipse.core.runtime.CoreException;
    private final PropertyTreeViewer sessionProps;
    }
                detailsItem.setControl(sessionProps.getControl());
            this.sessionDetails = sessionDetails;
                    createPlannerTab(previewFolder);
                    getItemsViewer().setFilters(searchFilter);
            return "SessionDetails/" + sessionManager.getDataSource().getContainer().getDriver().getId() + "/" + sessionDetails.getDetailsTitle();
    private void showPlanNode()

    private void createPlannerTab(CTabFolder previewFolder) {
            if (element != selectedPlanElement) {
                sqlViewItem.setText(SessionEditorMessages.viewer_view_item_sql);
import org.jkiss.dbeaver.runtime.DBWorkbench;

            }
                                if (value != null && pattern.matcher(CommonUtils.toString(value)).find()) {
    }
    }
                if (item instanceof DBAServerSession) {
        previewFolder.setSelection(0);
        return null;

            }
                    detailsListControl.loadData();
                }
            sashMain.setWeights(new int[]{500, 500});

        }
        protected ISearchExecutor getSearchRunner()
                    for (DBPObject item : dbpObjects) {
package org.jkiss.dbeaver.ui.views.session;
        }
        if (sqlViewer.getSite() == null) {

                detailsFolder.setSelection(detailsItem);
            contributionManager.add(new Action(SessionEditorMessages.viewer_session_manager_refresh_sessions_action, DBeaverIcons.getImageDescriptor(UIIcon.REFRESH)) {


import java.lang.reflect.InvocationTargetException;
        }


                @Override
                            if (detailsInfo.getDetailsIcon() != null) {
                                text.setForeground(UIStyles.getDefaultTextForeground());
            }
        int mainSashRatio = CommonUtils.toInt(settings.get("MainSashRatio"), 0);
        @Override
        planner = DBUtils.getAdapter(DBCQueryPlanner.class, sessionManager.getDataSource());
                    log.error(e.getMessage());
 * Licensed under the Apache License, Version 2.0 (the "License");
        public void fillCustomActions(IContributionManager contributionManager) {
//        planTree.substituteProgressPanel(getSessionListControl());

    protected void loadSettings(IDialogSettings settings) {
                        setToolTipText(SessionEditorMessages.viewer_open_sql_editor_tip);
                sqlViewer = new SQLEditorBase() {
        @Override
import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;
                                    navContext,
            if (curSession == null) {
    private final DBCQueryPlanner planner;
    private void loadPlainTextDetails(DBAServerSessionDetails data, StyledText styledText) {
        }
    protected boolean sessionMatches(SESSION_TYPE element, Pattern searchPattern) {
    {
                    SearchFilter searchFilter = new SearchFilter(

                                    true,
        return sessionTable;

                            try {
                    ((StyledText) text).setWordWrap(true);
    private final IWorkbenchPart workbenchPart;
        SessionDetailsLoadService(DBAServerSessionDetails sessionDetails) {
        protected Class<?>[] getListBaseTypes(Collection<DBPObject> items) {
            public boolean performSearch(String searchString, int options) {
        }
                }, true));
            }

            }
        StringEditorInput sqlInput = new StringEditorInput(sessionTable.getShell().getText(), text, true, GeneralUtils.getDefaultFileEncoding());
        curSession = session;
                throw new InvocationTargetException(ex);
                try {
                parent.addDisposeListener(e -> sqlViewer.dispose());
        @Override
                        updatePreview();
                detailsItem = new CTabItem(detailsFolder, SWT.NONE);
    private final SashForm sashMain;
    }
        {
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
                    public boolean isFoldingEnabled() {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
                    }
import org.eclipse.swt.events.SelectionEvent;
        refreshControl = new AutoRefreshControl(sashMain, sessionManager.getClass().getSimpleName(), monitor -> UIUtils.syncExec(this::refreshSessions));
                Collection<DBAServerSession> previouslySelectedSessions = getSelectedSessions();
        planViewer.addSelectionChangedListener(event -> showPlanNode());

        @Override
    }
            public void cancelSearch() {
                previewFolder.setSelection(sqlViewItem);
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenObjectConsole;
                }
                public void run()
import org.jkiss.dbeaver.ui.controls.autorefresh.AutoRefreshControl;
                    Object[] sessionsToSelect = previouslySelectedSessions.stream().filter(items::contains).toArray();

import org.jkiss.dbeaver.ui.controls.ListContentProvider;
    private final SQLEditorBase sqlViewer;
        sqlPlanItem.setText(SessionEditorMessages.viewer_sql_plan_item_execution_plan);
                                extDetailsItem.setToolTipText(detailsInfo.getDetailsTooltip());
            }
import org.eclipse.jface.dialogs.IDialogSettings;
                    return result;

                    if (element instanceof DBAServerSession) {
                            if (DBPObjectWithDescription.class.isAssignableFrom(detailsType)) {
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
                                    SessionEditorMessages.viewer_session_manager_sql_title,
                                Object value = ((ObjectPropertyDescriptor) property).readValue(element, null, true);
                                extDetailsItem.setControl(text);
                }
            for (Object item : ((IStructuredSelection) selection).toArray()) {
                    List<? extends DBPObject> sessionDetails = this.sessionDetails.getSessionDetails(session, curSession);
            }
        String text = curSession == null ? "" : CommonUtils.notEmpty(curSession.getActiveQuery());
            }

        return false;
    {


        private final class SessionLoadVisualizer extends ObjectsLoadVisualizer {
        private final SessionSearcher searcher;
        if (mainSashRatio > 0) {
                                DBUtils.getDefaultContext(sessionManager.getDataSource(), false)
                sqlViewer.createPartControl(previewFolder);
        SessionDetailsLoadService loadingService = new SessionDetailsLoadService(data);
    protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager)
    }
{
                            } else {
                if (planner != null) {
 *

                if (items != null) {
                                text.setFont(UIUtils.getMonospaceFont());
                sqlViewItem.setControl(sqlViewer.getEditorControlWrapper());
                                extDetailsItem.setControl(detailsProps);
            return searcher;
    public Map<String, Object> getSessionOptions() {
            public void completeLoading(Collection<SESSION_TYPE> items) {

        }
                            } else if (DBPObject.class.isAssignableFrom(detailsType)) {

    {
                    List<DBPObject> result = new ArrayList<>();
import org.jkiss.dbeaver.model.DBIcon;

import org.eclipse.swt.events.SelectionAdapter;
    }
                                StyledText text = new StyledText(detailsFolder, SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
    protected void saveSettings(IDialogSettings settings) {
    private class DetailsListControl extends DatabaseObjectListControl<DBPObject> {

    }
        @Override
        {
    }
        sqlPlanItem.setData(planViewer);
import org.eclipse.jface.action.IContributionManager;
                        }
        }


        }
    }
        if (detailsFolder.getSelectionIndex() > 0) {
                                    new StructuredSelection(),
        if (previewFolder.getSelectionIndex() == 0) {
        public Collection<DBPObject> evaluate(@NotNull DBRProgressMonitor monitor)
                };

                CTabItem sqlViewItem = new CTabItem(previewFolder, SWT.NONE);
 *
    private final CTabFolder detailsFolder;
import org.eclipse.jface.action.Separator;
 * Unless required by applicable law or agreed to in writing, software
            sessionTable.addDisposeListener(e -> saveSettings(settings));
                });
    }
    }
        }
                    if (items.contains(curSession)) {
                contributionManager.add(new Separator());
        int detailsSashRatio = CommonUtils.toInt(settings.get("DetailsSashRatio"), 0);
                }
    private ExplainPlanViewer planViewer;
                    }
        loadSettings(settings);
        return sessionTable.getControl();
                                StyledText styledText = (StyledText) item.getControl();
            Object element = ((IStructuredSelection) selection).getFirstElement();
                pattern = Pattern.compile(SQLUtils.makeLikePattern(searchString), caseSensitiveSearch ? 0 : Pattern.CASE_INSENSITIVE);
        }
    }
                        }
import org.jkiss.dbeaver.Log;
            // Show SQL
                            }
        planViewer = new ExplainPlanViewer(workbenchPart, sqlViewer, previewFolder, 0);

import org.eclipse.ui.IWorkbenchSite;
                DBCExecutionContext context = DBUtils.getDefaultContext(sessionManager.getDataSource(), false);
                                    break;

                if (detailsItem.getControl() instanceof StyledText) {
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
    }
                                DetailsListControl detailsProps = new DetailsListControl(detailsFolder, workbenchPart.getSite(), detailsInfo);
            } catch (PartInitException e) {
    private DBAServerSession curSession;
                        CTabItem item = detailsFolder.getItem(detailsFolder.getSelectionIndex());
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
    {
        sashMain = UIUtils.createPartDivider(workbenchPart, composite, UIUtils.checkSashStyle(SWT.VERTICAL | SWT.SMOOTH));
    protected void onSessionSelect(DBAServerSession session)
            }
    }


import org.jkiss.dbeaver.model.sql.SQLUtils;
            @Override
                if (text instanceof StyledText) {

            sashDetails.setWeights(new int[] { detailsSashRatio, 1000 - detailsSashRatio });

                    return false;
                        setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_SCRIPT));
        }
        if (detailsSashRatio > 0) {
            }
 */
                    return false;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;


                previewFolder.addSelectionListener(new SelectionAdapter() {

            sashDetails = UIUtils.createPartDivider(workbenchPart, sashMain, UIUtils.checkSashStyle(SWT.HORIZONTAL | SWT.SMOOTH));
