        if (getEditorInput() instanceof IFileEditorInput) {
            boolean focusInEditor = textViewer != null && textViewer.getTextWidget().isFocusControl();
            SQLEditorMessages.sql_editor_result_set_orientation_detached_tip,
            return;
            }
            for (VerticalButton button : switchPresentationExtraButtons) {
        tabFolder.setSelection(item);
            }

        ExplainPlanViewer planView = null;

        return tabIndex;
    }
            Throwable error = result.getError();
                                    }
        );
            .filter(SQLQuery::isDeleteUpdateDangerous)
                            DBCStatement statement = queryJob.getCurrentStatement();
            editorInput = new StringEditorInput(
                    }
        return res;

                T concreteAddIn = (T) addIn;
                        }
            if (select) {
            if (dialogResult == IDialogConstants.YES_TO_ALL_ID) {
                IPreferenceStore prefs = getPreferenceStore();
                    success = true;

                bottomBarMan.getControl().getParent().layout(true);
        }
            final DBCExecutionContext executionContext = getOwner().getExecutionContext();
        }
        if (view == outputViewer) {
                resultsSash.showDown();

    }
        }
    private final List<SQLQuery> runningQueries = new ArrayList<>();
            if (required == IFindReplaceTarget.class) {
        final List<VerticalButton> buttons = new ArrayList<>(presentations.size());
        );
        CTabFolder folder = getFolderForExtraPanels();
        ),
                    listener.onQueryResult(getContextPrefStore(container), result);
        if (logTab != null) {
        return null;

        if (SQLEditorBase.isReadEmbeddedBinding()) {
                }
        }
                textWidget.addFocusListener(FocusListener.focusGainedAdapter(focusEvent -> refreshActions()));
                getSite().setSelectionProvider(extraPresentationManager.activePresentation.getSelectionProvider());
                if (executionContext == null) {
            }
                    prefs.setValue(prefId, weights[0] + "-" + weights[1]);
                UIUtils.waitJobCompletion(saveJob, monitor);
            IEditorPart activeEditor = UIUtils.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
            setStatus("Can't explain plan for command", DBPMessageType.ERROR);
            SQLEditor.this.updateDataSourceContainer();
                    }

            return;
import org.jkiss.code.Nullable;
        }
        if (container != null) {
    private ExplainPlanViewer getPlanView(SQLQuery sqlQuery, DBCQueryPlanner planner) {
        }
        }
        }
    public void setEditorMaximized(boolean maximized) {
            if (viewItem != null) {
            }
        }
                }
    }
        final DBCExecutionContext executionContext = getExecutionContext();
            case SQLPreferenceConstants.MULTIPLE_RESULTS_PER_TAB: {
            } else {
                super.doSetInput(editorInput);
    private void updateOutputViewerIcon(boolean alert) {
        }
            }
        if (resultsContainer == curResultsContainer) {
    }
                            String resultSetName = results.getTabName();
    public boolean transformQueryWithParameters(SQLQuery query) {
                && !(curQueryProcessor instanceof MultiTabsQueryProcessor);
        private static final int UPDATE_DELAY_MS = 1000;
    public boolean processQueries(
        }
        }
                    continue;
    public <T> T getExtraPresentationPanel(Class<T> panelClass) {
            //            setFocus();
                region = document.getLineInformation(0);
    private volatile DBPContextProvider executionContextProvider;
        for (QueryProcessor queryProcessor : queryProcessors) {
                                            }
    private volatile DBCExecutionContext isolatedExecutionContext;
            CommandContributionItem.STYLE_CHECK,
            try {
    }
        return new String[] {
    int getMaxResultsTabIndex() {
            } finally {

        if (suggestionTextPainter != null) {
    /**
            } else if (dialogResult != IDialogConstants.OK_ID) {
        }
                        EditorUtils.getInputContextDefaults(instance.getDataSource().getContainer(), getEditorInput()) : null;
        }
            }
            try {
            }
        if (checkSession) {
        curResultsContainer = queryProcessor.getFirstResults();
        UIUtils.asyncExec(() -> variablesViewer.refreshVariables());
                    log.error(ex);
        });
        }


            presentationStack.setLayoutData(new GridData(GridData.FILL_BOTH));
                    );
                releaseExecutionContext();
            }
                            results.handleExecuteResult(result);
            if (executionContext != null && session != null) {
                    if (owner.isDisposed()) {
    }

        }
        private boolean lastFocusInEditor = true;
                            if (cValue != -1) {
        if (jobsRunning > 0) {
        // 1. Determine whether planner supports plan extraction
            .toList();
            } else if (progressMonitor != null) { //cancel
import org.jkiss.dbeaver.model.struct.DBSInstance;
        List<SQLScriptElement> elements = new ArrayList<>();
        setPartName(getEditorName());
                            }
                        return;
                tabItem.setImage(DBeaverIcons.getImage(panel.getIcon()));
        {
            if (emptyScriptCloseBehavior == SQLPreferenceConstants.EmptyScriptCloseBehavior.DELETE_NEW) {
        preferenceStore.setValue(SQLPreferenceConstants.EXTRA_PANEL_LOCATION, epLocation);
            return;
        return container == null ? null : container.getDataSource();

                if (ctxDefault != null && eventObject != null) {
                        serviceConnections.connectDataSource(
                        toggleAction.run();
    }
                    if (toolItem != null && !toolItem.getSelection()) {
        if (ds == null) {
    }
     * or move tab to right of all pinned tabs if unpinning
                for (CTabItem tabItem : resultTabs.getItems()) {
            }
        CSSUtils.markConnectionTypeColor(sqlEditorPanel);
        //planView = new ExplainPlanViewer(this, resultTabs);
            SQLEditorMessages.sql_editor_result_set_orientation_horizontal_tip,
        if (isolatedExecutionContext != null && isolatedExecutionContext.isConnected()) {
            if (resultTabs.getItemCount() == 0) {
                                    }
            if (panelInstance != null && !isChecked()) {
                        curQueryProcessor.getFirstResults().dispose();

                for (Control vb : presentationSwitchFolder.getChildren()) {
            variablesViewer,
                }
        }
                    ISelectionProvider selectionProvider = extraPresentationManager.activePresentation.getSelectionProvider();
        if (QMUtils.isTransactionActive(isolatedExecutionContext)) {
                return rsv;
        });
        if (curResultsContainer != null) {
                StringBuilder assocSpecLine = new StringBuilder(EMBEDDED_BINDING_PREFIX);
import org.jkiss.dbeaver.model.exec.*;
            );
    @Override
        return null;
                    SQLEditor owner = queryProcessor.getOwner();
                                            if (!container.isPinned() && container.queryProcessor == processor) {
            return false;
        closeAllJobs();
            varTab.dispose();
        ServerOutputInfo(DBCServerOutputReader outputReader, DBCExecutionContext executionContext, DBCExecutionResult result) {
            }
                if (data instanceof QueryResultsContainer qrc) {
        final IMenuService menuService = getSite().getService(IMenuService.class);



                performSave(true, progressMonitor);
    private void restoreSashRatio(SashForm sash, String prefId) {
        return IDialogConstants.IGNORE_ID;
                }
        if (setSelection) {
        return super.isEditable() && this.isProjectResourceEditable();
                }
            }

                serverOutputs.clear();
    @Override
        DBRRunnableWithProgress queryObtainTask = monitor -> {
            }
        editorImage = null;
                    int resultTabsCount = 0;
            public void run() {

                            xQueries.add(query);
                        List<QueryResultsContainer> results = new ArrayList<>(sqp.getResultContainers());
    }
    private final ArrayList<SQLEditorAddIn> addIns = new ArrayList<>();
            SQLEditorMessages.sql_editor_result_set_orientation_vertical_tip,
    DBPEventListener,
import org.jkiss.dbeaver.ui.editors.sql.log.SQLLogPanel;

import org.jkiss.dbeaver.ui.controls.resultset.QueryResultsDecorator;
    }
        curQueryProcessor = null;
            final IStatusField field = getStatusField(category);
            if (window != null) {
            SQLEditor.this.reloadSyntaxRules();
                        owner.resultsSash.setMaximizedControl(owner.sqlEditorPanel);
                        && !owner.isHideQueryText()
    }
                    curQueryProcessor = null;
                            writer.println(message);
        DBPDataSourceContainer inputDataSource = null;
        return true;
            if (item.getData() instanceof QueryProcessingComponent && item.getShowClose() && !isPinned(item)) {

            .append("\n").append(NLS.bind(SQLEditorMessages.sql_editor_title_tooltip_type, dataSourceContainer.getDriver().getFullName()))
            showExecutionLogPanel(true);
        if (varTab != null) {
            if (curQueryProcessor == queryProcessor) {
            }
                document.replace(region.getOffset(), region.getLength(), "");
            } else {
                // Check running queries for async output
                    return IDialogConstants.CANCEL_ID;
                    for (CTabItem item : resultTabs.getItems()) {

    final DisposeListener resultTabDisposeListener = new DisposeListener() {
                SQLEditorMessages.sql_editor_title_tooltip_database,
        super.doSave(monitor);
            if (sqlExtraPanelSash.getMaximizedControl() != null) {
        }
        if (bottomLeft != null || bottomRight != null) {
    }
        }
        }
                // FIXME: this is a hack. We can't fire event on resource change so editor's state won't be updated in UI.
                int tabsClosed = closeExtraResultTabs(null, true, false);
                if (pd == extraPresentationManager.activePresentationDescriptor) {
                        owner.updateDirtyFlag();
            }

            null,

            } else {
            logViewer = null;
                    dumpOutput(monitor);
                        owner.resultsSash.setMaximizedControl(null);
                long features = super.getDecoratorFeatures();
                    "Can't connect to database", "Connection to '" + container.getName() + "' cannot be established.", status);
                UIUtils.getActiveShell(),

        return SQLEditorUtils.isSQLSyntaxParserEnabled(getEditorInput())
        }
    public DBPDataSource getDataSource() {
            logViewer.dispose();
        }
                        }
        private final DBCExecutionContext context;


        if (resultsSash.getMaximizedControl() == null) {
                // If the user chose not to save SQL consoles, then it's never considered dirty
                SQLEditorMessages.update_conflict_message_revert,
        DatabaseEditorUtils.setPartBackground(this, resultsSash);
                    }
            super.handleExceptionOnSave(exception, progressMonitor);
        } else if (planStyle == DBCPlanStyle.OUTPUT) {
        // That's fine
                };
        ToolBar bottomBar = bottomBarMan.createControl(leftToolPanel);
            return ISaveablePart2.NO;
            this.onSuccess = onSuccess;
            return null;
            createQueryProcessor(true, isSingleQuery, true);
        panelsLayout.marginWidth = 1;
        return jobsRunning;
import org.jkiss.dbeaver.ui.editors.text.DynamicFindReplaceTarget;
                if (e.detail == SWT.TRAVERSE_TAB_NEXT && e.stateMask == SWT.MOD1) {
        }
    }
                results.forEach(QueryResultsContainer::dispose);


        @Nullable IActionContributor actionContributor,
        return null;
                SQLPreferenceConstants.CONFIRM_SAVE_SQL_CONSOLE,
        }
                            manager.add(new Action(SQLEditorMessages.action_result_tabs_detach_tab) {

        // Extra views
                            updateOutputViewerIcon(true);
            }
    @Override
                        );
    private Image editorImage;

import org.jkiss.dbeaver.ui.actions.datasource.DataSourceToolbarUtils;


                            }
            case ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX:
    protected boolean isReadOnly() {
            return isolatedExecutionContext != null;
    }
        }

                setResultTabSelection(tabItem);
        super.setFocus();
    }

        {
        if (isTabsToTheRight) {
            }
        SQLPreferenceConstants.EmptyScriptCloseBehavior emptyScriptCloseBehavior
        return planView;
                if (region == null) {
import org.eclipse.ui.menus.CommandContributionItem;
            }
                if (activeViewer != null) {
    private final List<ServerOutputInfo> serverOutputs = new ArrayList<>();

                releaseExecutionContext();
                    extraPresentationManager.activePresentationPanel = pp;
        if (scriptContext == null) {
        bottomBar.pack();
            }
    }
                    listener.onDataSourceChanged(event);
    private Image tmpImage;
        }
                inputDataSource = dsp.getDataSourceContainer();
                maxIndex = Math.max(maxIndex, qrc.getResultSetIndex());

    private void updateExecutionContext(Runnable onSuccess) {
                        }
            presentationStack = new Composite(sqlExtraPanelSash, SWT.NONE);
import org.jkiss.dbeaver.ModelPreferences;
            SQLEditorMessages.sql_editor_result_set_orientation_detached,
                        }
                            });

                return GeneralUtils.makeExceptionStatus(e);
    }
    }
        super.updateStatusField(category);
    }
        }
            if (dataSource == null) {
                topBarMan.update(true);
                throw e;
    }

            processQueries(Collections.singletonList(planQuery), false, true, false, true, null, null);
                            foundSuitableTab = true;
        ITextSelection selection = (ITextSelection) getSelectionProvider().getSelection();
            resultSetOrientation = ResultSetOrientation.valueOf(DBWorkbench.getPlatform().getPreferenceStore()
        public void run() {
        // toolbar refresh triggered on active part change or current datasource change, but:
            case INonPersistentEditorInput npi -> scriptPath = "SQL Console";
                DBUtils.closeSafely(context);
                            }
                                });
import org.eclipse.jface.dialogs.IDialogConstants;
        public String getLabel() {
     */
        } else {
        @Nullable SQLQueryListener queryListener

    @Nullable
                for (ServerOutputInfo info : outputs) {
            dangerousQuery.getType().name(),
            if (!DBWorkbench.getPlatform().isShuttingDown() && resultsSash != null && !resultsSash.isDisposed()) {
                                                ((QueryResultsContainer) item.getData()).setPinned(false);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                } else {

            true
            }
            }
    }
            return sashOrientation;
                        case OBJECT_REMOVE:
            }
                } else {
            @Override
    public boolean getShowScriptRulerOnExecution() {
                List<QueryResultsContainer> results = new ArrayList<>(sqp.getResultContainers());
                setResultTabSelection(item);
        if (outputViewer != null) {

                } catch (Throwable ex) {
            manager -> manager.add(new OutputAutoShowToggleAction()),
    }
                } else {
        resultsSash.setShowBorders(true);
        UIUtils.createEmptyLabel(leftToolPanel, 1, 1).setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, true));
        createPresentationSwitchBar(sqlEditorPanel);
        }
                try {
        } else if (disconnectTimeoutSeconds > 0 && disconnectTimeoutSeconds > elapsedSeconds) {
            );
                        true,
                // If weight of one of controls less than 5% of weight of another - restore default wqeights
    private void createPresentationSwitchBar(Composite sqlEditorPanel) {
        Consumer<String> fontUpdater = s -> {
    }
                @Override
            return supported;

            );
    public boolean isSaveAsAllowed() {

    private final List<SQLEditorListener> listeners = new ArrayList<>();
                            } catch (DBCException e) {
        ){
        @Override
    }
            if (!focusInEditor) {
        }
    }
        createToggleLayoutButton();

                    action.run();
                Display.getCurrent().beep();
            if (activePart != this && activePart instanceof DBPDataSourceContainerProvider dsp) {
            @Override
    /////////////////////////////////////////////////////////////

                    }
                if (item != null && item.getShowClose()) {
            return executionContextProvider.getExecutionContext();
                    try {
                SQLScriptBindingType bindingType = SQLScriptBindingType.valueOf(DBWorkbench.getPlatform().getPreferenceStore()
            }
            if (decision == IDialogConstants.YES_ID) {
                    return false;

                0,

            }
        return tip.toString();
    private boolean isPinned(CTabItem tabItem) {
                                    }
import java.util.List;
        }
        final long rollbackTimeoutSeconds = DataSourceMonitorJob.getTransactionTimeoutSeconds(dataSourceContainer);

                    if (defaultContext != null) {
            showExtraPresentation(presentation);
    public boolean isActiveTask() {
        loadActivePreferenceSettings();
                topBarMan.update(true);
                    return SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL | SWT.SHEET | getDefaultOrientation();
            return;
                    }
                            SQLQuery query = transformer.transformQuery(dataSource, getSyntaxManager(), (SQLQuery) element);
        }
        DBPDataSource dataSource = getDataSource();
            } catch (Throwable ex) {
        }
            @Override
            SQLEditorCommands.CMD_SQL_SHOW_OUTPUT,
        // Check for file existence
    }
    public DBPDataSourceContainer getDataSourceContainer() {
            return false;

            new OutputLogWriter(),
                // Prepare query for tooltip
                                public void run() {
        bottomBar.setLayoutData(new GridData(SWT.CENTER, SWT.BOTTOM, true, false));

            } else if (textViewer != null) {


    private Composite presentationStack;
            String[] buttons = new String[]{
        @Override
        return processSQL(newTab, script, false, transformer, queryListener);
                }
        boolean isSingleQuery = queries.size() == 1;
                    }
                        manager.add(ActionUtils.makeCommandContribution(getSite(), SQLEditorCommands.CMD_SQL_EDITOR_TOGGLE_TAB_PINNED));
        }
                            if (dsEvent) {
                    if (i == 0 && tabsToClose.getFirst().getData() instanceof SingleTabQueryProcessor sqp && keepFirstTab) {
        if (getDataSourceFromContent() == dataSourceContainer) {
                UIUtils.asyncExec(() -> {
    }
    private VerticalButton[] switchPresentationExtraButtons;
                    }
            setFocusToTextControl();
                    }
            // prevent eclipse from overriding this CTabFolder's css class
            if (parentEditorContext instanceof SQLNavigatorContext nc) {
        }
                if (getOwner().getActivePreferenceStore().getBoolean(SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE)) {
            tmpImage = null;
        multipleResultsPerTabProperty.setPropertyValue(this, Boolean.toString(!wasEnabled));
        int jobsRunning = 0;
                            });
        return false;
        }
            }
                                    final List<CTabItem> tabs = new ArrayList<>();
    public SQLDialect getSQLDialect() {
            // Nothing to process
            final CTabItem item = new CTabItem(resultTabs, SWT.CLOSE);
                    }
        public void setExtListener(SQLQueryListener extListener) {
                }
        }
            ) {
import java.nio.file.Path;
                "Choose one or more queries to export from"
        };



                    }
        if (STATS_CATEGORY_TRANSACTION_TIMEOUT.equals(category)) {
                SQLEditorMessages.editors_sql_error_cant_execute_query_title,

            DBPPreferenceStore preferenceStore = container.getPreferenceStore();

            return super.getTitleToolTip();
        }
            presentationSwitchFolder.layout(true);
            showOutputPanel(true);
                stopped = true;
                    }
        super.reloadSyntaxRules();
            }
            outputViewer,
                    // Finish query
        return false;

                            }
                            null,
            // We only need to prompt user to close extra (unpinned) tabs if:
            if (dataSourceContainer == null) {
                        }
            } else {
                        }
                SQLEditor owner = getOwner();
            dialogType,
                    onSuccess.run();

            };
                return null;
                    DBCExecutionContext iec = nc.getExecutionContext();
                planQueryString[0] = plan.getPlanQueryString();
                    }
            && getDataSourceContainer().isConnected()

        }
            case SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION: {
        StyledText textWidget = getViewer().getTextWidget();
        }
                    && ((PresentationPanelToggleAction) action).panel.getId().equals(panelID)

        restoreSashRatio(sqlExtraPanelSash, SQLPreferenceConstants.EXTRA_PANEL_RATIO);
        return null;
    }
        private final Runnable onSuccess;
                resultsSash.setMaximizedControl(sqlEditorPanel);
                int caretOffset = event.caretOffset;

        if (syntaxLoaded && lastExecutionContext == executionContext) {
                CTabItem selectedTab = resultTabs.getSelection();
            return false;
            for (final ResultSetOrientation orientation : orientations) {
                if (onFinish != null) {

                            break;
            super("Update active transaction status");
                extraPresentationManager.activePresentationPanel = null;
            // Notify agent
        return dataSourceContainer;
        }
                DBPDataSource dataSource = getDataSource();
        resultsSash.setRedraw(false);
            }
                        }
                    int pinnedTabsCount = 0;
            this.closeTabOnError = closeTabOnError;
                    suggestionTextPainter.removeHint();

    }
                SWT.ICON_WARNING
            while (addInsIterator.hasPrevious()) {
                    VerticalButton panelButton = new VerticalButton(presentationSwitchFolder, SWT.RIGHT);
                DBWorkbench.getPlatformUI().showError(
    }
        }
        }
        // Notify listeners
                } else if (data instanceof SingleTabQueryProcessor stqp) {
                }
    }
            SQLEditorMessages.sql_editor_result_set_orientation_horizontal,
                            AssignVariableAction action = new AssignVariableAction(SQLEditor.this, container.getQuery().getText());
        control.addListener(SWT.Resize, event -> {
        if (!container.hasData()) {
                                selectionProvider.setSelection(new TextSelection(errorQueryOffset, errorQueryLength));
                    this.executionContextProvider = () -> iec;
            if (tabFolder.getItemCount() == 0) {
            }

                            // select new statistics tab

    }

        );
    @Nullable
                }
        setEditorMaximized(!resultsSash.isUpHidden());
                }


        }
        // divides editor area and results/panels area
        }
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            inputinitializer.run();
        this.setCompletionContext(new SQLEditorCompletionContext(this));
        container.setPinned(!isPinned);
            SQLEditorContributions.SQL_EDITOR_CONTROL_CONTEXT
                nextTabItem = resultTabs.getItem(i);
    }
                    final DBPDataSourceContainer dataSource = DataSourceUtils.getDataSourceBySpec(
            //getTarget determines current composite used for find/replace
    }
                Action action = new Action(orientation.getLabel(), Action.AS_RADIO_BUTTON) {
        VerticalButton.create(presentationSwitchFolder, SWT.RIGHT | SWT.CHECK, getSite(), SQLEditorCommands.CMD_TOGGLE_LAYOUT, false);
    @Override
    }
                resultsSash.setMaximizedControl(sqlEditorPanel);

                        if (resultsIndex < result.getExecuteResults().size()) {
                                // Active schema was changed? Update title and tooltip
        return singleQuery || !isMultipleResultsPerTabEnabled();

        updateExecutionContext(null);
                refreshEditorIconAndTitle();
                getSite().getShell(),
            false,
    }
                if (!matcher.matches()) {
                                    for (CTabItem tab : resultTabs.getItems()) {
            Menu menu = menuMgr.createContextMenu(resultTabs);
            tmpImage.dispose();
        if (SQLPreferenceConstants.LOCATION_RESULTS.equals(epLocation)) {
        SourceViewer viewer = getViewer();
        return tabItem != null && ((QueryResultsContainer) tabItem.getData()).isPinned();
        } else {
import org.eclipse.swt.custom.*;
    @Override
    private class OutputLogWriter implements DBCOutputWriter {
        } else {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;

    public boolean processSQL(
                if (owner.getTotalQueryRunning() <= 0) {



                        setResultTabSelection(item);
            }
        }
        for (QueryProcessor queryProcessor : queryProcessors) {
        }
            public long getDecoratorFeatures() {
                        container.getResultSetController().getModel(),
            @Override
        private final DBSInstance instance;
        }

            } else {
        }

    private Image baseEditorImage;

            Matcher matcher = EMBEDDED_BINDING_PREFIX_PATTERN.matcher(line);
        boolean isTabsToTheRight = tabFolder == sqlExtraPanelFolder;
            outputViewer.flush();
                }
                    file.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
    Composite getPresentationStack() {
    @Override
                        for (PrintWriter writer : addInWriters) {
            inputDataSource = EditorUtils.getInputDataSource(getEditorInput());
        }
            outputViewer.clearOutput();
                            monitor,
            if (activeResultsTab != null && UIUtils.isUIThread()) {
        }
        if (executionContext != null) {
        if (sqlEditorPanel != null) {
        if (dsContainer != null) {
            if (currentOutputViewer == null || currentOutputViewer.isDisposed()) {
            log.warn("There are " + jobsRunning + " SQL job(s) still running in the editor");
    @Override
    }
        }

                } else {
                saveJob.schedule();
    }
 *
        showResultsPanel(false);
                            continue;
        if (document == null) {
            return project == null || project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
            EditorUtils.setInputDataSource(input, context);
        @NotNull final List<SQLScriptElement> queries, final boolean forceScript,
            }
public class SQLEditor extends SQLEditorBase implements
                    if (tabItem.getData() instanceof SQLEditorPresentationPanel) {
    }
    @Nullable
    }
                };
        } else {
 */

                return features;
        IDocumentProvider provider= getDocumentProvider();
                    return;
                int[] weights = {
                if (tabItem != null && tabItem.getShowClose()) {

        }
                if (curQueryProcessor != null && curQueryProcessor.getFirstResults().hasData()) {
            getExecutionContext(),
        if (super.isDirty() || (extraPresentationManager.activePresentation instanceof ISaveablePart
    public void createPartControl(Composite parent) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.css.CSSUtils;
            }
    }
        private final QueryProcessor queryProcessor;

            int decision = ConfirmationDialog.confirmAction(
                    tabItem.dispose();
import org.eclipse.swt.graphics.*;
    public void refreshActions() {

        updateDataSourceContainer();
        } else {
    private int createDropQueryConfirmationDialog(@NotNull SQLQuery dropQuery, int dialogType) {
                        if (!owner.addProblem(GeneralUtils.getFirstMessage(error), new Position(errorQueryOffset, errorQueryLength))) {
            }
    private class OpenContextJob extends AbstractJob {
            }
            .filter(q -> q instanceof SQLQuery)
        for (CTabItem item : tabFolder.getItems()) {
    public static final String VIEW_PART_PROP_NAME = "org.jkiss.dbeaver.ui.editors.sql.SQLEditor";
                menu.insertAfter(GROUP_SQL_EXTRAS, new Action(pd.getDescription(), DBeaverIcons.getImageDescriptor(pd.getIcon())) {

        } else {
            if (editorControl == null || editorControl.isDisposed()) {
    /**
                : MultipleResultsPerTabMenuContribution.TRUE_IMAGE
                monitor.done();
            }
        } catch (Throwable e) {
                            }

                MessageDialog.NONE,
                if (status.isOK() && getExecutionContext() == null) {
        showExtraView(
    private ToolBarManager topBarMan;
                                // We must reload syntax to refresh context
                // Try to find suitable query processor among exiting ones if:

                if (iec != null) {
            // 3. Or current query processor has running jobs
    private static class ServerOutputInfo {
        tmpImage = null;
            } else {
    @Override

                        CommonUtils.truncateString(query.getText(), 200), !result.hasError() ? IStatus.INFO : IStatus.ERROR);
    }
                    createQueryProcessor(true, true, true);
        topBarMan.update(true);
        CTabFolder tabFolder = this.getFolderForExtraPanels();
            for (SQLEditorListener listener : listeners) {
        DBPDataSourceContainer dsContainer = getDataSourceContainer();
        final SQLScriptElement scriptElement = extractActiveQuery();
                // Save current datasource (we want to keep it here)
            SQLEditorContributions.SQL_EDITOR_SCRIPT_CONTEXT,
        }
    private int getTotalQueryRunning() {
                if (dataSource != null) {

        }
        @NotNull final String commandId,
                        contextChanged = true;

        switch (editorInput) {

        if (!datasourceChanged && curDataSource != null) {
        scriptAutoSavejob.schedule(1000);

            // Create new query processor if:
    private static final class TransactionStatusUpdateJob extends AbstractJob {
            SQLEditorCommands.CMD_SQL_SHOW_VARIABLES,
                        }
    }
                final CTabItem activeTab = getActiveResultsTab();

        }
            this.executionContext = executionContext;
        }
    protected boolean canProcessQueries() {
            outputViewer = null;
        for (IContributionItem contributionItem : topBarMan.getItems()) {
            }
            int totalLines = document.getNumberOfLines();
            @Override
     * then move tab to left of all unpinned tabs if pinning,

        boolean replaceCurrentTab = getActivePreferenceStore().getBoolean(SQLPreferenceConstants.RESULT_SET_REPLACE_CURRENT_TAB);
            //    and replace current tab on single query execution option is not set

    }
            SQLScriptElement query = extractActiveQuery();
    private class FindReplaceTarget extends DynamicFindReplaceTarget {
                    // Dump server output
            }
                    DBWorkbench.getPlatformUI().showError("Panel opening error", "Can't create panel " + panel.getLabel(), e);
    private CustomSashForm resultsSash;

        baseEditorImage = getTitleImage();

        private boolean scriptMode;
                    focusInEditor = lastFocusInEditor;
                            if (!CommonUtils.isEmpty(query.getParameters())) {
            variablesViewer = null;
                null,
                    }
                scriptMode = true;
        sqlEditorPanel = UIUtils.createPlaceholder(resultsSash, 3, 0);
        }
                            action.setEditable(false);
        if (getActivePreferenceStore().getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_CHANGE)) {
            } else {

        this.globalScriptContext = new SQLScriptContext(
        UIUtils.syncExec(this::onDataSourceChange);
import java.util.function.BiFunction;
    private class ScriptAutoSaveJob extends AbstractJob {
                        DBUtils.fireObjectSelect(instance, true, newContext);
            bottomBarMan.getControl().redraw();
                return null;
        ServerOutputReader() {
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationRegistry;
        boolean isStopDropQueriesConfirmed = showDangerousQueriesStopExecutionConfirmation(

        }
                        }

import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;


            menuService.populateContributionManager(bottomBarMan, SIDE_BOTTOM_TOOLBAR_CONTRIBUTION_ID);
                    }
                .filter(Objects::nonNull)
            return;
                    if (owner.activeResultsTab != null && !owner.activeResultsTab.isDisposed()) {
                        }
                            contextDefaultNames = new String[2];
    static final Image IMG_DATA_GRID_LOCKED = DBeaverIcons.getImage(UIIcon.SQL_PAGE_DATA_GRID_LOCKED);
                }
        }
        DBPDataSourceContainer ds = getDataSourceContainer();
                    log.error("Error during SQL editor add-in cleanup", ex); //$NON-NLS-1$
                try {
        if (queries.isEmpty()) {
    private void runPostExecuteActions(@Nullable SQLQueryResult result) {
                CTabItem tabItem = queryProcessor.getFirstResults().getResultsTab();
        }
    }
            if (resultTabs != null) {
    public IResultSetController getResultSetController() {
                                        }
        }
            }
    }
                    if (monitor.isCanceled()) {
                if (transactionStatusUpdateJob == null) {
            for (CTabItem item : resultTabs.getItems()) {
                SQLPreferenceConstants.CONFIRM_SAVE_SQL_CONSOLE,
    @Nullable
    public void setDisableFetchResultSet(Boolean disableFetchResultSet) {
import org.eclipse.ui.texteditor.rulers.IColumnSupport;
                if (tabsClosed == IDialogConstants.CANCEL_ID) {
                        project,
            }
    @Override

    private VerticalFolder presentationSwitchFolder;
                            manager.add(new Action(SQLEditorMessages.action_result_tabs_close_all_tabs) {
                }
                }
            !DBExecUtils.isExecutionInProgress(dataSourceContainer.getDataSource())
                return;
                if (switchFocus) {
            for (SQLEditorListener listener : listeners) {

    ) {
        if (results) {
                return panelClass.cast(tabItem.getData());
        }
                } else {
                                query.getType() != SQLQueryType.SELECT
                        }
        for (CTabItem tab : resultTabs.getItems()) {
                updateMultipleResultsPerTabToolItem();
        UIUtils.asyncExec(() -> {

            } else {

            );
        curResultsContainer = data;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

    public void setResultSetAutoFocusEnabled(boolean value) {
        if (RuntimeUtils.runTask(queryObtainTask, "Retrieve plan query", 5000) && !CommonUtils.isEmpty(planQueryString[0])) {
                    for (int k = firstLine; k <= lastLine; k++) {
        if (dataSourceContainer == null) {
            SWT.HORIZONTAL,
            switchPresentationSQLButton.setChecked(presentation == null);
import org.eclipse.jface.resource.JFaceResources;
                    ResultSetViewer viewer = results.getResultSetController();
        switchPresentationSQLButton = new VerticalButton(presentationSwitchFolder, SWT.RIGHT | SWT.CHECK);
                                EnterNameDialog dialog = new EnterNameDialog(
        }

        QueryProcessor processor = null;
                    break;
                    // Make sure that resultSetNumber equals to current loop index.

            // hack to prevent eclipse from overriding this Composite's class
        sqlExtraPanelFolder.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
    public int[] getCurrentLines() {
            ? context.getDataSource().getContainer().getPreferenceStore()
            }

 *

        if (!ArrayUtils.isEmpty(contextDefaults) && contextDefaults[0] != null) {

                    button.setFont(font);
                public void println(@Nullable DBCOutputSeverity severity, @Nullable String message) {
                        default:
        } else {
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
                // Remove connection association
        if (root != null) {
                            // because the statistics window can not be in focus in this case
                        if (!scriptMode) {
                    if (owner.isDisposed()) {
            curQueryProcessor.cancelJob();
        if (extraPresentationManager.activePresentation instanceof ISaveablePart sp && sp.isDirty()) {

            // FIXME: make it better
            }
/*

        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_SQL_EXECUTION)) {
        updateResultSetOrientation();
                        return Status.OK_STATUS;
        }
            if (dsContainer == null) {
        return extraPresentationManager.activePresentationDescriptor;
            super("Save '" + getPartName() + "' data changes...");
        IEditorInput finalEditorInput = editorInput;
                                resultSetName = owner.getResultsTabName(results.resultSetNumber, queryIndex, executeResult.getResultSetName());
    private void notifyOnQueryResultListeners(@NotNull QueryResultsContainer container, @NotNull SQLQueryResult result) {
    }
    }
                    }
    private volatile boolean syntaxLoaded = false;
        return resultsSash.getMaximizedControl() != null;
                    T adapter = adaptable.getAdapter(required);
                }

    private void accomplishEditorInputInitialization(@NotNull IEditorInput editorInput) {
    private CTabItem getExtraViewTab(Control control) {
        dataSourceContainer = container;
            globalScriptContext.clearVariables();
    private boolean stopDangerousQueriesExecutionConfirmation(@NotNull List<SQLScriptElement> queries) {
        if (item != null) {
        if (scriptElement == null) {
        if (logViewer != null) {


    }
                if (tabControl instanceof SingleTabQueryProcessor stqp) {
            }
                log.error("Error during SQL editor add-in initialization", ex); //$NON-NLS-1$
    private void deleteFileIfEmpty(IFile sqlFile) {
    @Nullable
        CTabItem nextTabItem;
                String preparedText = sqlQuery.getText().replaceAll("[\n\r\t]{3,}", "");
        }
        } catch (DBException e) {
                bottomRight = DBIcon.OVER_ERROR;
                    scriptPath = uri.toString();
                SQLEditor owner = queryProcessor.getOwner();

            export,
        private void processQueryResult(DBRProgressMonitor monitor, SQLQueryResult result, DBCStatistics statistics) {
                button.setChecked(presentation != null && button.getData() == presentation);
                currTabItem = nextTabItem;
            && isolatedExecutionContext == null) {
                    panelControl.dispose();
            getActivePreferenceStore().setValue(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW, isChecked());

                resultTabsReorder.swapTabs(currTabItem, nextTabItem);
        if (isolatedExecutionContext != null) {

            if (viewItem != null) {
    public boolean isMultipleResultsPerTabEnabled() {
        { // Clean up the add-ins in reverse order
        sqlExtraPanelSash = new SashForm(sqlEditorPanel, SWT.HORIZONTAL);
                @Override
            getEditorControlWrapper().setFocus();
        logViewer = new SQLLogPanel(folder, this);
                } else {
            dropQuery.getText()
                        log.error(e);
                    UIUtils.syncExec(() -> editor.updateStatusField(STATS_CATEGORY_TRANSACTION_TIMEOUT));
                                }
                                            tab.dispose();
            if (item.getData() instanceof MultiTabsQueryResultsContainer qrc) {
            return getTitle();
        VERTICAL(
            }
    private static final Image IMG_OUTPUT = DBeaverIcons.getImage(UIIcon.SQL_PAGE_OUTPUT);
        private boolean stopped = false;
        });

                                    container.setTabName(dialog.getResult());
                    action.setEnabled(false);
        releaseExecutionContext();
        CSSUtils.markConnectionTypeColor(resultsSash);
                }
        super.preferenceChange(event);
                schedule(100);
                            break;
        }
    private SQLSuggestionTextPainter suggestionTextPainter;
                log.debug("Delete empty SQL script '" + sqlFile.getFullPath().toOSString() + "'");
            return true;

                        }
                if (resultsSash.getMaximizedControl() == null) {

        private SQLQueryListener extListener;
        int maxIndex = 0;
        boolean newTab, boolean script, boolean executeFromPosition, SQLQueryTransformer transformer,
            }

        @Override
                    region = null;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public void cancelActiveQuery() {
    }
    private static final Pattern EMBEDDED_BINDING_PREFIX_PATTERN = Pattern.compile("--\\s*CONNECTION:\\s*(.+)", Pattern.CASE_INSENSITIVE);
            getProject()
                protected int getShellStyle() {
    }
                    if (!owner.isHideQueryText()) {
                };
        }
            // 1. Or all tabs are closed and no query processors are present
import java.util.function.Consumer;
                } catch (Throwable ex) {
            schedule();
                ConfirmationDialog.QUESTION
                    onFinish.onTaskFinished(status);
            }

                    int errorQueryOffset = query.getOffset();
                stackLayout.topControl = extraPresentationManager.getActivePresentationControl();
        // Create right vertical toolbar
/*
        }
                            });
                    // ignore - this may happen if SQL was edited after execution start

                    if (outputViewer.getControl()!=null) {
    @Override

                                }

        }
                if (resultTabs.getItemCount() == 0 && createQueryProcessor) {

            }

        if (bottomBarMan != null) {
                    super.setBackground(color);
                    owner.refreshActions();
                DBPDataSource dataSource = curDataSource;
            (resultTabs == null ? null : resultTabs.getSelection()) : activeResultsTab;
        return curQueryProcessor.processQueries(
            }
        if (inputExecutionContext != null) {
            // First check current data source settings
                    outputReader = DBUtils.getAdapter(DBCServerOutputReader.class, dataSource);
        // Context listener

            ConfirmationConstants.CONFIRM_DROP_SQL_ID,
        // Start output reader
                        return;
                    if (!owner.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE)) {
                    if (message != null) {
                if (owner.isDisposed()) {
            resultsSash.setRedraw(true);
    }
    private void embedDataSourceAssociation() {
                return true;
                curItem.dispose();
            for (Map.Entry<SQLPresentationDescriptor, SQLEditorPresentation> entry : extraPresentationManager.presentations.entrySet()) {

     * Toggle isPinned value of active tab container,
            // 1. The user is not executing query in a new tab
            } else {
            DBCServerOutputReader outputReader = DBUtils.getAdapter(DBCServerOutputReader.class, dataSource);
            }
                        owner.setResultTabSelection(owner.activeResultsTab);

    }
        }
                        }
        resultTabsReorder = new TabFolderReorder(resultTabs);
                }
        DBCQueryPlanner planner = GeneralUtils.adapt(getDataSource(), DBCQueryPlanner.class);
        } catch (IllegalArgumentException e) {
                }
    private void initSeparateConnection(@NotNull DBPDataSource dataSource, Runnable onSuccess, boolean readDefaultsFromInstance) {
            || lastExecutionContext.getDataSource() != executionContext.getDataSource()) {
            return Status.OK_STATUS;
                NLS.bind(SQLEditorMessages.update_conflict_message, this.getEditorInput().getName()),
                            } else {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        DBCPlanStyle planStyle = planner.getPlanStyle();
                    outputViewer.getViewer().scrollToEnd();
            : DBWorkbench.getPlatform().getPreferenceStore();
            processQueries(elements, false, false, true, true, null, sqlScriptContext);
            DBWorkbench.getPlatformUI().showError(
            );
            this.label = label;
import org.jkiss.dbeaver.ui.editors.sql.addins.SQLEditorAddInsRegistry;
                true,
            updateOutputViewerIcon(false);
                        return adapter;
            return dataSource.getSQLDialect();
                //page.activate(this);
                if (rsv != null && rsv.isDirty()) {
        }
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT);
                }
    public void saveAsNewScript() {
        EditorUtils.trackControlContext(getSite(), textWidget, SQLEditorContributions.SQL_EDITOR_CONTROL_CONTEXT);
import org.jkiss.dbeaver.model.sql.*;
        DBPImage bottomRight;
                        break;
        if (!(scriptElement instanceof SQLQuery)) {
        if (sqlQuery != null) {
                            onSuccess.run();
    @Override
        if (isNonPersistentEditor()) {
                    continue;
                            resultTabsCount++;
        return globalScriptContext;
        }
            file,
            localFile,
            if (!transformQueryWithParameters(sqlQuery)) {

                }
import org.eclipse.ui.texteditor.rulers.RulerColumnDescriptor;
                                        }
            for (QueryResultsContainer resultsProvider : queryProcessor.getResultContainers()) {
            case IPathEditorInput pei -> scriptPath = pei.getPath().toString();
                return ISaveablePart2.CANCEL;
        if (sqlExtraPanelFolder != null) {
                    boolean defaultChanged = eventObject == ctxDefault.getDefaultCatalog() || eventObject == ctxDefault.getDefaultSchema();
                return checkConnected(true, onFinish);
                }
                if (!singleQuery) {
            ) {

            });
    private ExtraPresentationManager extraPresentationManager;
     * Sets focus in current editor.
    @Override
        }
                setResultTabSelection(tabItem);
            outputViewer.refreshStyles();
                maxIndex = Math.max(maxIndex, results.getLast().getResultSetIndex());
        }));

                    // Do not remove first tab for this processor
            throw new DBException("No active connection");
            presentationStackLayout = new StackLayout();
                        owner.updateDirtyFlag();
            SQLEditorPropertyTester.firePropertyChange(SQLEditorPropertyTester.PROP_CAN_EXECUTE);
            UIIcon.ARROW_DOWN
            // This file is empty and never (at least during this session) had any contents.

                closeActiveTab();
import org.eclipse.ui.*;
        }
        curQueryProcessor = queryProcessor;
                    } catch (DBException e) {
            doSave(new NullProgressMonitor());
    }

            actionContributor.contributeActions(sqlExtraPanelToolbar);
        UIUtils.setHelp(resultsSash, IHelpContextIds.CTX_SQL_EDITOR);
                releaseExecutionContext();
                tabItem.setControl(panelControl);
        public void redrawEditor() {
            parent
    IResultSetProvider,

            return queryProcessor.getOwner();
                try {
                if (selectedTab == null || selectedTab.getData() != outputViewer) {
        leftToolPanel.setLayout(panelsLayout);

    }

                }
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationPanelDescriptor;
        }
                                }
            }
                        resultsIndex++;
        }
                    extraPresentationManager.activePresentationPanel = null;
            setChecked(getActivePreferenceStore().getBoolean(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW));
        synchronized (listeners) {
        }
        this.updateMultipleResultsPerTabToolItem();

                return false;

            item.setImage(IMG_EXPLAIN_PLAN);
    }
        CSSUtils.markConnectionTypeColor(topBar);
                    if (container != null && container.hasData()) {
        @Override
        DBPProject project = getProject();
        super.dispose();
        }
        });
            // TODO: make icon update. Can't call setImage because this will break contract f VerticalButton
        textWidget.addCaretListener(event -> {
    }
        // Clear server console output
                            null,
                            contextDefaultNames[1]
        // like in package declarations with multiple statements in body
    @Override

            ConfirmationConstants.CONFIRM_DANGER_SQL_ID,

                            rsv.doSave(monitor);
                    focusInEditor = textViewer != null && previousTarget.equals(textViewer.getFindReplaceTarget());
        }
        createControlsBar(sqlEditorPanel);
                        }
        private final boolean supported;
        return presentationStack;
        };
        private final ITextSelection originalSelection;
            sqlExtraPanelSash.setMaximizedControl(sqlExtraPanelSash.getChildren()[0]);
                bottomBarMan.update(true);
                                query.setParameters(parseQueryParameters(query));
    public void doSaveAs() {
    }
                if (rsv != null && rsv.getActivePresentation().getControl().isFocusControl()) {

            } else {
            if (panel.getIcon() != null) {
                updateExtraViewToolbar(ac);
                    .getString(SQLPreferenceConstants.SCRIPT_BIND_COMMENT_TYPE));
        IDocument document = getDocument();
        @Override

            setSystem(true);
                return;
            if (panelInstance == null) {
            if (currentOutputViewer == null || currentOutputViewer.isDisposed() || !currentOutputViewer.isHasNewOutput()) {
    public void updateDirtyFlag() {
            }
    }
                }
                        // Editor closed
    private boolean isContextChanged(DBPEvent event) {
    }
            }
        }
import org.jkiss.dbeaver.model.struct.DBSObjectState;
                    if (lastExecutionContext != isolatedExecutionContext || defaultChanged) {
            log.error("Error saving smart auto-commit option", e);
                    }

            SQLEditorMessages.sql_editor_result_set_orientation_vertical,
            if (planView != null) {
    }
        if (dataSourceContainer != null) {
        }
            return false;

                bottomRight = null;
                // Needed to update main toolbar
                UIMessages.dialog_policy_sql_execution_msg,
    private class SaveJob extends AbstractJob {
                                log.error(e);
        );
                    field.setText(null);
    private SQLScriptContext createScriptContext() {
                            }
                            }
                                // At least once there was some content saved

            // Something bad may happen. E.g. OutOfMemory error in case of too big input file.

import org.jkiss.dbeaver.registry.confirmation.ConfirmationConstants;
        public void run() {
            }
    }
        } catch (CoreException e) {
        resultTabs.addMouseListener(MouseListener.mouseUpAdapter(e -> {
    protected DBPDataSourceContainer getDataSourceContainerForSyntaxRuleReloading() {
        }
            boolean doConnect = ds.getPreferenceStore().getBoolean(SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE);
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        if (tmpImage != null) {
            }
            explainPlanFromQuery(planner, sqlQuery);

/*
    }
        @NotNull
        }
import org.jkiss.dbeaver.ui.editors.*;
                return;
    }
        public void onStartQuery(DBCSession session, final SQLQuery query) {
        boolean isSeparateConnection = switch (behavior) {
        this.resultTabs.addListener(TabFolderReorder.ITEM_MOVE_EVENT, event -> {
            log.error("Error loading input SQL file", e);
        return tabName;
    private int createDangerousUpdateDeleteQueryConfirmationDialog(@NotNull SQLQuery dangerousQuery, int dialogType) {
        try {
        }
                vButton.dispose();
                if (viewer != null) {
                if (!owner.visualizeQueryErrors(monitor, query, error, originalQuery)) {
                return;
                                        }
            final SQLEditorOutputConsoleViewer outputViewer = SQLEditor.this.outputViewer.getViewer();

        if (!contextChanged && isEditorContext && eventAction.equals(DBPEvent.Action.OBJECT_SELECT) && event.getEnabled()) {
                        } else {
                    extListener.onEndQuery(session, result, statistics);
        if (container == null) {
            DBWorkbench.getPlatformUI().showError("File save", "Can't save as new script file", e);
                        if (owner.isDisposed()) {
        ExplainPlanViewer planView = getPlanView(null, planner);
    @Nullable
                                results.updateResultsName(resultSetName, null);
                                            }
    }
            "org.jkiss.dbeaver.ui.editors.sql.toggle.extraPanels",
        if (dataSourceContainer.isConnectionReadOnly() &&
                                        setActiveResultsContainer(((SingleTabQueryProcessor) activeTab.getData()).getFirstResults());
            }
                Object tabControl = activeResultsTab.getData();
        if (!canProcessQueries()) {
            if (!focusInEditor) {
    }
        updateMultipleResultsPerTabToolItem();

        } catch (Exception e) {
    }
                        }
            return false;
                }
        // Transform query parameters
        CloseContextJob(DBCExecutionContext context) {

            return inputFile.getParent();
            && txnManager.isSupportsTransactions()
    private synchronized void doScriptAutoSave() {
    int obtainDesiredTabIndex(boolean makeDefault) {
        }
    }
            if (executeFromPosition) {

            return;
            ));
            presentationStack.layout(true, true);
                    DBCExecutionContext defaultContext = DBUtils.getDefaultContext(instance, false);
    public void showVariablesPanel(@Nullable Boolean show) {
        }
    private boolean useTabPerQuery(boolean singleQuery) {
                                }
        if (dataSourceContainer.getConnectionError() != null) {
import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
        @Override
                    }
            if (owner.getDataSourceContainer() != null && !scriptMode
        private void dumpOutput(DBRProgressMonitor monitor) {

                } catch (DBException e) {
            if (dsContainer instanceof DBPStatefulObject && ((DBPStatefulObject) dsContainer).getObjectState() == DBSObjectState.INVALID) {
    /**
                if (CommonUtils.isNotEmpty(status)) {
        return folder;
        @Override

            this.sashOrientation = sashOrientation;
            }
        switch (event.getProperty()) {
        String pattern = preferenceStore.getString(SQLPreferenceConstants.SCRIPT_TITLE_PATTERN);
    }
            }
    }
    @Override
                elements.removeFirst();
        topBar.pack();
        private final DBCExecutionResult result;
    }
            queryListener
                return required.cast(findReplaceTarget);

                    }
    private boolean isProjectResourceEditable() {
            listeners.add(listener);

                        break;
            final FileEditorInput input = new FileEditorInput(script);
                // Set context defaults
        }
                boolean finalNewTab = newTab;
                        PrefUtils.savePreferenceStore(preferenceStore);

            }
                }
            log.warn("Tool item for command " + commandId + " not found");
                }
        });
import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
        }
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorActivator;
                    }

                        if (element instanceof SQLQuery) {
                null,
import org.eclipse.ui.actions.CompoundContributionItem;

            getExecutionContext(),
    }
        if (planView == null) {
            IRegion region = document.getLineInformation(0);
        }
            TextViewer textViewer = getTextViewer();
            if (tabItem.getData() instanceof SQLEditorPresentationPanel && tabItem.getData().getClass() == panelClass) {
                    action.setChecked(true);
        if (input != null) {
        StackLayout presentationStackLayout = null;
        ) {
            }
                if (success == null) {
        }

                boolean activeTabHasMultipleResults = activeTab != null && activeTab.getData() instanceof SingleTabQueryProcessor;
            outputViewer.dispose();
                                    for (CTabItem tab : tabs) {
                        DBWorkbench.getPlatformUI()
                if (QMUtils.isTransactionActive(context)) {

                        false
                    DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
            }
        }
                }

                owner.setStatus(GeneralUtils.getFirstMessage(error), DBPMessageType.ERROR);
                SQLEditorMessages.editors_sql_error_cant_execute_query_title,
    @Override
            }
                            });
        }
                        viewer.getModel().setStatistics(statistics);
        private final DBCServerOutputReader outputReader;
                            if (resultTabs.indexOf(activeTab) < resultTabsCount - pinnedTabsCount - 1) {
        return true;
        if (resultsSash != null) {
                                selectionProvider.setSelection(originalSelection);
    protected void updateStatusField(String category) {

        return super.isReadOnly() || !this.isProjectResourceEditable();
    // Initialization
        if (dataSourceContainer == null) {
            String[] weightsStr = resultsPanelRatio.split("-");
                        case AFTER_CONNECT:
        BaseThemeSettings.instance.addPropertyListener(
                    }
                    elements = xQueries;
        private final String label;
            } finally {
            super.doSetInput(editorInput);
        private int topOffset, visibleLength;
                results[i] = lines.get(i);
        }
                    }

                    field.setText(status);
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.SHOW_ALL_DETAILS));
            }
                scriptName = localFile.getName();
        @Override

                        connSpec,
                setToolTipText(panel.getDescription());
                                @Override
                            newContext.getDataSource(),
                    int lastLine = document.getLineOfOffset(statementInfo.getOffset() + statementInfo.getLength());
            SQLEditorCommands.CMD_SQL_SHOW_LOG,
                                            }
                listener.beforeQueryExecute(script, newTab);

                    listener.onDataReceived(
            case ModelPreferences.SQL_CONTROL_COMMAND_PREFIX:
    public void refreshEditorIconAndTitle() {

                if (!outputViewer.isDisposed()) {

            try {
            show
     */
                }
                    owner.clearProblems(null);
            outputViewer.setExecutionContext(executionContext);
    private void releaseExecutionContext() {
            if (vButton.getCommandId() != null && vButton.getCommandId().equals(SQLEditorCommands.CMD_TOGGLE_LAYOUT)) {
            toolItem.setSelection(multipleResultsPerTab);
                if (resultTabs.getItem(i - 1).getData() instanceof QueryProcessingComponent) {
                                        for (QueryResultsContainer container : processor.getResultContainers()) {
                if (!nextTabItem.getShowClose()) {
            return;
                            }
    private static final Image IMG_LOG = DBeaverIcons.getImage(UIIcon.SQL_PAGE_LOG);
                    UIExecutionQueue.queueExec(this);
            return false;
        restoreSashRatio(resultsSash, SQLPreferenceConstants.RESULTS_PANEL_RATIO);
            EditorUtils.setInputDataSource(getEditorInput(), new SQLNavigatorContext(executionContext));
            CTabItem tabItem = curQueryProcessor.getFirstResults().getResultsTab();
            tickCount++;
        updateDirtyFlag();
            dataSourceContainer.acquire(this);
                    }
                    UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
                        DBWorkbench.getPlatformUI().showError(
                if (weights[1] < weights[0] / 15 || weights[0] < weights[1] / 15) {

                if (item.getData() instanceof ExplainPlanViewer pv) {
                        SQLQueryJob queryJob = qp.getCurJob();
                ConfirmationDialog.QUESTION
    private Composite sqlEditorPanel;
            // Get results window (it is possible that it was closed till that moment


        boolean isPinned = container.isPinned();
            } else if (item.getData() instanceof ExplainPlanViewer) {
        }
                }
            return false;
            DBPDataSourceContainer savedContainer = EditorUtils.getInputDataSource(input);
                for (QueryResultsContainer cr : queryProcessor.resultContainers) {
            if (!focusInEditor && rsv != null) {
    private boolean checkSession(DBRProgressListener onFinish) throws DBException {
                setImageDescriptor(DBeaverIcons.getImageDescriptor(panel.getIcon()));
        if (menuService != null) {
            }
            IEditorInput input = new FileStoreEditorInput(fileStore);
        }
                    ex.getMessage()
        return true;
            }
                    extraPresentationManager.activePresentationPanel = null;
            } else {
    );
            dataSourceContainer = inputExecutionContext.getDataSource().getContainer();
 * DBeaver - Universal Database Manager

        SeparateConnectionBehavior behavior = SeparateConnectionBehavior.parse(
        resultTabs = new CTabFolder(resultsSash, SWT.TOP | SWT.FLAT) {
        } else {
        }
        }
        return false;
            } else {
        DBSObject eventObject = event.getObject();
    private class ConnectVisualizer extends UIJob {
    }
        refreshEditorIconAndTitle();
                }
                    switchFocus(true);
                // Just create a new query processor
                    });
import org.jkiss.code.NotNull;
                        tabsToClose.get(i).dispose();
                                    public void run() {
        } else {
        // Release ds container
                            outputViewer.scrollToEnd();
            .map(q -> (SQLQuery) q)
    @Nullable
                for (SQLPresentationPanelDescriptor panelDescriptor : panels) {
            return BasicSQLDialect.INSTANCE;
    public <T extends SQLEditorAddIn> T findAddIn(@NotNull Class<T> addInClass) {
                    if (viewer != null) {
            EditorUtils.getInputContextDefaults(dataSource.getContainer(), getEditorInput()) : null;
    }
        topBarMan.update(true);
        }
            }
                if (caretOffset != suggestionOffset) {
                    .isFocusControl()) {
    }
                                manager.add(new Action(SQLEditorMessages.action_result_tabs_close_query_tabs) {
                if (queryProcessors.isEmpty()) {
    }
                            }
                // FIXME: but it works after short pause. Seems to be a bug in E4 command framework
        for (CTabItem tabItem : resultTabs.getItems()) {
        }
            UIUtils.disposeControlOnItemDispose(item);
                } catch (BadLocationException e) {
        return true;
        }
        if (file != null) {
                        if (onSuccess != null) {
        final boolean registryEvent = getDataSourceContainer() != null && event.getData() == getDataSourceContainer().getRegistry();
                }
                        updateOutputViewerIcon(true);
            scriptName,
        viewItem.setSelection(true);
                        final boolean isPinned = container.isPinned();
    }
            }
                processor = (QueryProcessor) item.getData();
        CTabItem currTabItem = activeTab;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                if (lastUIUpdateTime < 0 || System.currentTimeMillis() - lastUIUpdateTime > SCRIPT_UI_UPDATE_PERIOD) {
            });
        sqlExtraPanelToolbar.removeAll();
        SQLEditorVariablesResolver scriptNameResolver = new SQLEditorVariablesResolver(
            toggleResultPanel(false, createQueryProcessor);
        });
    @Override
                final DBCExecutionContext executionContext = getExecutionContext();
            getActivePreferenceStore().getString(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION)
                                    closeExtraResultTabs(null, false, false);
        );
                if (contextDefaultNames != null && contextDefaultNames.length > 1 &&
            case null, default -> {
                        }
            default -> this.getDataSourceContainer() == null
            setUser(true);
 * distributed under the License is distributed on an "AS IS" BASIS,
        };
            ) {
    protected void afterSaveToFile(File saveFile) {
                    createToggleLayoutButton();

    private void releaseContainer() {
        }
        if (container == dataSourceContainer) {
                    int queryIndex = owner.queryProcessors.indexOf(queryProcessor);
            bottomLeft = null;
            this.result = result;
            try {
        explainQueryPlan((SQLQuery) scriptElement);
        }
            }
            }
                        }

        checkInputFileExistence(editorInput);


                    item.setToolTipText(preparedText.substring(0, 300) + "...");
        // Initialize the add-ins and keep references for further cleanup on editor dispose
            this::createDropQueryConfirmationDialog
        final IFolder root = activeProject == null ? null :

            }
                    if (SQLEditorUtils.isOpenSeparateConnection(container)) {
            if (!isHideQueryText() && resultsSash.getMaximizedControl() != null) {
            // heavy abstractions leakage
                extraPresentationManager.activePresentationPanel = panelInstance;
            getDropQueries(queries),
            return;
        }
        return suggestionTextPainter;
        }
    public enum ResultSetOrientation {
        final QMTransactionState txnState = QMUtils.getTransactionState(executionContext);

        if (baseEditorImage == null) {
                }
            }
        for (SQLPresentationDescriptor presentation : presentations) {
    private void onTextChange(ModifyEvent e) {
                activeRS.getActivePresentation().getControl().setFocus();
        ),
            IMG_VARIABLES,
                    break;
            DBPImage image = new DBIconComposite(new DBIconBinary(null, baseEditorImage), false, null, null, bottomLeft, bottomRight);
        if (selection.getLength() > 1) {
                    setActiveResultsContainer(qrc);
        public void println(@Nullable DBCOutputSeverity severity, @Nullable String message) {
            if (result == SqlJobResult.SUCCESS || result == SqlJobResult.PARTIAL_SUCCESS) {
import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
        public void flush() {
                    cr.viewer.updateFiltersText(false);
    protected void onDataSourceChange() {
        @Override
                    extraPresentationManager.panels.remove(panel);
                        try (InputStream contents = historyItem.getContents()) {
            if (localFile != null) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
                                            CTabItem tab = resultTabs.getItem(i);

    public void saveToExternalFile() {
    }
    public void showExtraPresentation(@NotNull String presentationId) {
                extraPresentationManager.panels.put(panel, panelInstance);

                // Replace first query with query under cursor for case if the cursor is in the middle of the query
            return items.toArray(new IContributionItem[0]);
    private void createControlsBar(Composite sqlEditorPanel) {
                DBCExecutionContext iec = EditorUtils.getInputExecutionContext(input);
    }
            job.schedule();

    private void showResultsPanel(boolean createQueryProcessor) {
        if (curQueryProcessor == null || (newTab
        }
        topBar.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, false));

            if (item.getData() == control) {
        }
                        }
    IDataSourceContainerUpdate,
            });
                            globalScriptContext.saveVariables(ds.getDriver(), null);
            }
    }
            // Execute statement under cursor or selected text (if selection present)
            SQLScriptElement query = container.getQuery();
            case SQLPreferenceConstants.SCRIPT_TITLE_PATTERN:

            DBWorkbench.getPlatformUI().showError(
                String status;
     * Toggles editor/results maximization
                    if (tabItem.getData() == panelInstance) {
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        item.setImage(image);


            && (fileFromInput == null || fileFromInput.isSynchronized(0))

            }
                    ConfirmationDialog.QUESTION_WITH_CANCEL,
                            curQueryProcessor = processor;
                            dataSourceContainer, status -> {
            case ModelPreferences.SQL_PARAMETERS_ENABLED:

                if (!newTab && isSingleQueryNotScript) {
            (forceConnect || dataSourceContainer.getPreferenceStore().getBoolean(SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE));
        for (QueryProcessor queryProcessor : queryProcessors) {
        }
            this.outputReader = outputReader;

        DBPDataSourceContainer container = this.getDataSourceContainer();
                                        tab.dispose();
            this.description = description;
            }
            }
        super.createPartControl(editorContainer);
                    }
            resultSetOrientation = ResultSetOrientation.HORIZONTAL;
        }
        IFile file = EditorUtils.getFileFromInput(getEditorInput());
            // Dump server output
            getActivePreferenceStore().save();
        outputViewer = null;
    private class OutputAutoShowToggleAction extends Action {
                }
            return;
                if (activeTabHasSingleResult || activeTabHasMultipleResults) {
            }
                        results.stream().skip(1).forEach(QueryResultsContainer::dispose);
        if (!sqlFile.exists() || ResourceUtils.getFileLength(sqlFile) != 0) {
        final boolean objectEvent = event.getObject() != null && event.getObject().getDataSource() == getDataSource();
        CTabItem varTab = getExtraViewTab(variablesViewer);
        }
            this.readDefaultsFromInstance = readDefaultsFromInstance;
                        sideBarChanged = true;

        if (scriptAutoSavejob == null) {
                                contextDefaultsDB.getDefaultSchema().getName() : null;
        final IEditorInput editorInput = getEditorInput();
        lastExecutionContext = executionContext;
            }


                if (!ArrayUtils.isEmpty(fileHistory)) {
                    if (tabItem.getData() == panelInstance) {

import org.eclipse.swt.events.*;
    }
        return null;
            } else {
        // So we need to update toolbar state explicitly after the whole editor is finally initialized for sure.
        final Set<SQLPresentationDescriptor> presentations = extraPresentationManager.presentations.keySet();
        } else {
                }
        }
            this.queryProcessor = queryProcessor;
        }

        if (resultsSash.getMaximizedControl() != null) {
 * limitations under the License.
        }
    private ResultSetViewer getActiveResultSetViewer() {
                        tabItem.dispose();
        if (outTab != null) {
                    focusInEditor = false;
                        }
                doRevertToSaved();
                    for (QueryProcessor qp : queryProcessors) {
                    owner.dumpQueryServerOutput(result);
                    final QueryResultsContainer container = activeTabHasSingleResult ? (QueryResultsContainer) activeTab.getData() : null;
                    public void run() {
                }
import org.jkiss.dbeaver.ui.editors.sql.suggestion.SQLSuggestionTextPainter;
        IDocument document = getDocument();
                                            tab.dispose();


import org.jkiss.dbeaver.ui.editors.sql.addins.SQLEditorAddInDescriptor;
                        ResultSetViewer rsv = resultsProvider.getResultSetController();
        showResultsPanel(true);

    private boolean isShowScriptRulerOnExecution = true;
                            if (scriptMode) {
            UIExecutionQueue.queueExec(inputinitializer);
        UIUtils.asyncExec(() -> fireDataSourceChanged(null));
                    lastUIUpdateTime = System.currentTimeMillis();
                }

                                        for (CTabItem tab : tabs) {
                }

            if (presentationSwitchFolder != null) {
                    owner.runningQueries.add(query);
    private static final long SCRIPT_UI_UPDATE_PERIOD = 100;
                                public void run() {
        }
                }
    }
            );
            .append("\n").append(NLS.bind(SQLEditorMessages.sql_editor_title_tooltip_connection, dataSourceContainer.getName()))
                    "Query completed [" + owner.getEditorInput().getName() + "]" + GeneralUtils.getDefaultLineSeparator() +
    }
        return dataSourceContainer;
        @NotNull
        CTabFolder tabFolder = this.getFolderForExtraPanels();
        if (viewItem == null) {
        return activeResultsTab == null || activeResultsTab.isDisposed() ?
                if (outputReader != null && outputReader.isAsyncOutputReadSupported()) {
                if (readDefaultsFromInstance && datasourceChanged) {
                CTabItem activeTab = resultTabs.getSelection();
            topBarMan.getControl().redraw();
                        ConnectVisualizer connectVisualizer = new ConnectVisualizer();


                nextTabItem = resultTabs.getItem(i);
                }
            return required.cast(getResultSetController());
                    return rsv.promptToSaveOnClose();
                }
        try {
        ToolItem viewItem = getViewToolItem(commandId);
import org.eclipse.ui.ide.FileStoreEditorInput;
                }
            );
                || !this.getDataSourceContainer().isForceUseSingleConnection();
                DurationFormatter.format(Duration.ofSeconds(disconnectTimeoutSeconds - elapsedSeconds), DurationFormat.MEDIUM)
        DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
        if (outTab != null) {
                                @Override
                            }
        }
                UIUtils.asyncExec(() ->
                IFileState[] fileHistory = sqlFile.getHistory(monitor);
                }
    @Override
        DBCQueryPlanner planner = GeneralUtils.adapt(getDataSource(), DBCQueryPlanner.class);
            if (item.getData() instanceof QueryResultsContainer) {
            IFileStore fileStore = EFS.getStore(saveFile.toURI());
                CTabItem tabItem = new CTabItem(resultTabs, SWT.CLOSE);
        isDisableFetchResultSet = disableFetchResultSet;
    private static final Image IMG_OUTPUT_ALERT = DBeaverIcons.getImage(UIIcon.SQL_PAGE_OUTPUT_ALERT);

            try {
            case ALWAYS -> true;
    private QueryProcessor curQueryProcessor;
            if (error != null) {
    private final FindReplaceTarget findReplaceTarget = new FindReplaceTarget();
                                @Override
            baseEditorImage = getTitleImage();
            curResultsContainer = null;
                }

            }
                    if (owner.isDisposed()) {
            }
            }
                                    container.detach();
            UIUtils.asyncExec(() -> {
        // Stretch


                IAction action = ((ActionContributionItem) contributionItem).getAction();
                }
        Runnable inputinitializer = new Runnable() {
                boolean isInExecute = owner.getTotalQueryRunning() > 0;
    }
        String targetName = "multiple rows";
                EditorUtils.setInputDataSource(input, new SQLNavigatorContext(container, newExecutionContext));
    private VerticalButton switchPresentationSQLButton;
        }
                });
        boolean isEditorContext = eventObject == this.getDataSourceContainer() || event.getData() == this.getExecutionContext();
        sqlExtraPanelFolder.setSelection(0);
                    if (errorQueryOffset >= 0 && errorQueryLength > 0) {

import org.jkiss.dbeaver.model.exec.output.DBCOutputSeverity;
                            // But we need to avoid the result tab with the select statement
                return false;
                monitor.subTask("Save '" + getPartName() + "' changes...");
            RulerColumnDescriptor positionColumn = RulerColumnRegistry.getDefault().getColumnDescriptor(ScriptPositionColumn.ID);
            int response = dialog.open();


        }
            dataSourceContainer.getRegistry().addDataSourceListener(this);
        DBCExecutionContext context = container.getExecutionContext();
        if (dataSourceContainer != null) {


    private CTabItem getActiveResultsTab() {
    throws PartInitException {
        super.editorContextMenuAboutToShow(menu);
                }
        }
                elements.add(query);
    @NotNull
                // Throw original error
            final VerticalButton button = extraPresentationManager.createPresentationButton(presentation);
                    CommonUtils.toInt(weightsStr[0]),
            IWorkbenchPart activePart = getSite().getWorkbenchWindow().getActivePage().getActivePart();
            new SQLEditorParametersProvider(getSite())
                }
        @Override
        StackLayout stackLayout = (StackLayout) presentationStack.getLayout();
    public SQLScriptContext getGlobalScriptContext() {
            log.debug("Error extracting datasource info from script's content", e);
    }
        @Override
        UIUtils.asyncExec(() -> {
            item.setText(SQLEditorMessages.editors_sql_error_execution_plan_title + " - " + maxPlanNumber);
            outputItem.setImage(image);
        if (show != null && !show) {


    public void setShowScriptRulerOnExecution(boolean value) {
        IColumnSupport columnSupport = getAdapter(IColumnSupport.class);
                if (extraPresentationManager.activePresentationPanel != null) {
        synchronized (listeners) {
                if (contextDefaultNames == null) {
                            break;
                    }
            if (!newTab && isSingleQueryNotScript && curQueryProcessor.getResultContainers().size() > 1) {
        String resultsPanelRatio = getPreferenceStore().getString(prefId);
                }
            SWT.VERTICAL,
            var hasPinnedTabs = !noQueryProcessors && curQueryProcessor.hasPinnedTabs();
                }
            super("Dump server output");
        getActivePreferenceStore().setValue(ModelPreferences.TRANSACTIONS_SMART_COMMIT, smartAutoCommit);
                @Override
    }
                    curResultsContainer = null;
                if (tabControl instanceof QueryResultsContainer qrc) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
    }
    static final String STATS_CATEGORY_TRANSACTION_TIMEOUT = "TransactionTimeout";
                    } catch (Exception e) {

                        manager.add(ActionUtils.makeCommandContribution(getSite(), SQLEditorCommands.CMD_SQL_EDITOR_CLOSE_TAB));
    @Override

            } finally {
            elements.addAll(extractScriptQueries(selection.getOffset(), selection.getLength(), true, false, true));

            parent,
                    this.executionContextProvider = () -> iec;
            //We should update it, when we focus on the other panels or output view
                outputReader = new DefaultServerOutputReader();
                refreshContextDefaults(session);
                }
            if (closeTabOnError && error != null) {
    }
                            visibleLength = textViewer.getBottomIndexEndOffset() - topOffset;
                                            if (((QueryResultsContainer) item.getData()).isPinned()) {
            }
                // Check for existing query processors (maybe all result tabs were closed)
import org.jkiss.utils.IOUtils;

            synchronized (this) {
                    scriptPath = "<not a file>";
                }
                                if (statement != null && !statement.isStatementClosed()) {
            } else if (curDataSource != dataSource) {
                    SQLEditor.this.doTextEditorSave(monitor));
                    if (vb.getData() instanceof SQLPresentationPanelDescriptor) { // || vb instanceof Label
                    });
    }
        }
    private static final QualifiedName MULTIPLE_RESULTS_PER_TAB_PROP_NAME = new QualifiedName(
            for (int i = 0; i < lines.size(); i++) {
        }
                setPartName(getEditorName());
        // Release ds container
        }

            return ((QueryResultsContainer) tabItem.getData()).isPinned();
            jobsRunning += queryProcessor.getRunningJobs();
                    for (QueryResultsContainer results : queryProcessor.resultContainers) {
            updateContext();
                Control panelControl;
        if (dataSource != null) {
                        }
        if (getActivePreferenceStore().getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE)
        }
    public void editorContextMenuAboutToShow(IMenuManager menu) {
import org.jkiss.dbeaver.ui.editors.sql.variables.AssignVariableAction;
            DBCQueryPlannerConfiguration configuration = ExplainPlanViewer.makeExplainPlanConfiguration(monitor, planner);
        Composite leftToolPanel = new Composite(sqlEditorPanel, SWT.LEFT) {
            int[] results = new int[lines.size()];
    private SashForm sqlExtraPanelSash;
    }
    public <T> T getAdapter(Class<T> required) {
            }
        switchPresentationSQLButton.addSelectionListener(switchListener);
            }
            getProject()
            @Override
                    extraPresentationManager.getActivePresentationControl().setFocus();
import org.jkiss.dbeaver.model.rm.RMConstants;
                }

            setSystem(true);
        String scriptPath;
        if (!dataSourceContainer.hasModifyPermission(DBPDataSourcePermission.PERMISSION_EXECUTE_SCRIPTS)) {

                }
                            owner.toggleResultPanel(false, false);

            if (extListener != null) {
        }
        final IFile file = EditorUtils.getFileFromInput(getEditorInput());
            } else {
import org.eclipse.core.runtime.*;
                        if (results.getQuery() != query) {
                    PresentationPanelToggleAction toggleAction = new PresentationPanelToggleAction(panelDescriptor);
import org.eclipse.swt.layout.GridData;
                                    @Override
            logTab.dispose();
        DBPDataSourceContainer container = getDataSourceContainer();
        DBPDataSourceContainer dataSource = EditorUtils.getInputDataSource(editorInput);
                CommonUtils.truncateString(out.toString(), 10000),
        @Override
    private DBPDataSource curDataSource;
        return new QueryResultsDecorator() {
        resultTabs.setSimple(true);
     * Changes mode of showing result for script execution - multiple results per tab or one tab per result.
        }
        }
        }
    public void preferenceChange(PreferenceChangeEvent event) {
        @NotNull
            listeners.remove(listener);
    private TabFolderReorder resultTabsReorder;
            }
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
    public SQLPresentationDescriptor getActivePresentationDescriptor() {
        try {
            queryProcessors.remove(queryProcessor);
        CTabItem outputItem = UIUtils.getTabItem(resultTabs, outputViewer);

    }
            CTabItem item = (CTabItem) event.item;
        return extraPresentationManager.activePresentationDescriptor;

            final Font font = BaseThemeSettings.instance.partTitleFont;
            if (IOUtils.isLocalURI(locationURI)) {
    }
                        if (rsv != null && rsv.isDirty()) {
    @Override
                return new IContributionItem[0];
            UIUtils.showMessageBox(
                        writer.flush();
        return "SQLEditor " + getEditorInput();
        SQLEditorActivator.PLUGIN_ID, MULTIPLE_RESULTS_PER_TAB_PROPERTY
            try {
        }
        if (topBarMan != null) {
            (rollbackTimeoutSeconds > elapsedSeconds) &&
                addIns.add(addIn);
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        }
                outputs = new ArrayList<>(serverOutputs);
            // Show output log view if needed
                if (action instanceof PresentationPanelToggleAction
            UIUtils.syncExec(() -> {
            if (!monitor.isCanceled()) {
            log.error("Error creating presentation", e);
            // Close tab on error
                        //panelButton.setChecked(true);
            if (sqlQuery == null) {
            CTabItem item = sqlExtraPanelFolder.getSelection();
                    newTab = true;
            }
                UIUtils.asyncExec(() -> resultsSash.setMaximizedControl(null));
                                        }
    private QueryResultsContainer curResultsContainer;
            TextViewer textViewer = getTextViewer();
        if (dataSourceContainer == null) {
                    toggleResultPanel(false, true);
        public TransactionStatusUpdateJob() {
            setSystem(true);
            // 2. Or current query processor has pinned tabs
            editorImage = DBeaverIcons.getImage(image, false);
        StringBuilder tip = new StringBuilder();
        DBPDataSourceContainer dsContainer = getDataSourceContainer();


        CTabItem tabItem = getActiveResultsTab();
        private SQLEditor getOwner() {
            ConfirmationDialog.WARNING,
        }
                if (activeTab != null && activeTab.getControl() != null) {
    private static final String SIDE_TOP_TOOLBAR_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.ui.editors.sql.toolbar.side.top";
                SQLQuery originalQuery = owner.curResultsContainer.getQuery() instanceof SQLQuery sqlQuery ? sqlQuery
        return null;
            if (item != null) {
                // Show both editor and results
        if (dangerousQueries.size() == 1) {
        if (isPinned) {
        };
                    log.debug("Restore default sash weights");

        // Create left vertical toolbar
        }
            }
        if (inputFile != null) {
            if (addInClass.isInstance(addIn)) {
            resultTabs.setMenu(menu);


        return dataSourceContainer != null && dataSourceContainer.isConnected();
        }
            }
    }
                }
            }
        }
                    }
    private CTabFolder getFolderForExtraPanels() {
            scriptName = file.getFullPath().removeFileExtension().lastSegment();
                }
            }
                topBarMan.getControl().getParent().layout(true);
    @Override
                                setDataSourceContainer(null);
                    @NotNull
        final File inputFile = EditorUtils.getLocalFileFromInput(getEditorInput());
            tip.append("\n").append(NLS.bind(
                    CommonUtils.toInt(weightsStr[1]),
            return null;
        final DBPDataSourceContainer container = getDataSourceContainer();
                } else {
                    //Output viewer is just StyledText we use StyledTextFindReplace
        try {

        return ConfirmationDialog.confirmAction(
                    @Override
                    document.replace(region.getOffset(), region.getLength(), assocSpecLine.toString());

            SQLEditor.this.dataSourceContainer = null;
                //Focus is on presentation we need to find a class for it
                progressMonitor.setCanceled(true);

        });
            scriptContext = createScriptContext();
            }
    @Override
            ((ISaveablePart) extraPresentationManager.activePresentation).doSave(monitor);
    public void checkSessionAndConnect(DBRProgressListener onFinish) throws DBException {
                    monitor.worked(1);
            }
                if (item.getData() instanceof ExplainPlanViewer) {
        if (oldDataSource != newDataSource) {
                            manager.add(new Action(SQLEditorMessages.action_result_tabs_unpin_all_tabs) {
        }
            presentationStackLayout.topControl = presentationStack.getChildren()[0];
                            public void run() {

        java.nio.file.Path localFile = EditorUtils.getPathFromInput(getEditorInput());
                        });
        if (lastExecutionContext == null || executionContext == null

            if (rsv != null) {
                tabsToClose.add(item);
            if (data instanceof QueryResultsContainer queryResultsContainer) {
        setRangeIndicator(new DefaultRangeIndicator());
                UIUtils.asyncExec(() -> {
            } finally {
                            log.debug("Error refreshing context defaults", e);
    private List<SQLQuery> getDangerousUpdateDeleteQueries(@NotNull List<SQLScriptElement> queries) {
            DBCExecutionContext execContext = this.getExecutionContext();
            queries.stream().anyMatch(q -> (q instanceof SQLQuery sqlQuery && sqlQuery.isMutatingStatement()))
    }
            }
        saveToExternalFile();
        }
        if (columnSupport != null) {
                    onDataSourceChange(contextChanged);
                return Status.CANCEL_STATUS;
            if (family == this || family == dataSourceContainer) {
                        case OBJECT_UPDATE:
                    (!CommonUtils.isEmpty(contextDefaultNames[0]) || !CommonUtils.isEmpty(contextDefaultNames[1]))) {
                                owner.setResultTabSelection(results.getResultsTab());
            }
        isResultSetAutoFocusEnabled = value;
                if (extListener != null) {
        }
                saveContextVariables();
        }
            IRegion region = null;
    @NotNull
                                            tabs.add(tab);
                showExtraPresentation((SQLPresentationDescriptor) null);
        item.setToolTipText(toolTip);
                        editorControl.setCursor(oldCursor);
                    return extraPresentationManager.activePresentationPanel;
                    viewer.setStatus(ex.getMessage(), DBPMessageType.ERROR);
        if (sqlQuery != null) {
                    panelButton.setData(panelDescriptor);
                return EditorUtils.getPathFromInput(getEditorInput());
        }
        String tabName = name;
        ) {
                elements.addFirst(extractActiveQuery());
        String epLocation = getExtraPanelsLocation();
                viewItem.setImage(image);
                scriptNameResolver.get(SQLPreferenceConstants.VAR_ACTIVE_DATABASE)
                    int errorQueryLength = query.getLength();
                // De-select tool item on tab close
        refreshActions();
                    transactionStatusUpdateJob.schedule();
        if (lastUserActivityTime < 0) {
        try {

        setAction(ITextEditorActionConstants.SHOW_INFORMATION, null);

        if (resultsSash == null || resultsSash.isDisposed()) {
            if (response == 0) { // overwrite

    }
                                public void run() {
                IActionContributor ac = (IActionContributor) item.getData("actionContributor");
            textViewer.getTextWidget().addTraverseListener(e -> {
            }
                        if (!processor.hasPinnedTabs() && processor.getRunningJobs() == 0) {
            if (tabsToClose.getFirst().getData() instanceof SingleTabQueryProcessor sqp) {
                resultTabs.setFont(font);
            this.supported = supported;
                if (resultTabs != null && !resultTabs.isDisposed()) {
                    if (panelDescriptor.isAutoActivate()) {
    }
            public void variableChanged(ContextAction action, DBCScriptContext.VariableInfo variable) {

        if (getActivePreferenceStore().getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE) && isDirty()) {
                // Close all panels
            for (SQLQuery statementInfo : runningQueries) {
    private volatile boolean isPartControlInitialized = false;
        SQLEditorQueryListener(QueryProcessor queryProcessor, boolean closeTabOnError) {
                }
import java.time.Duration;
    @Override


                fireDataSourceChange();
        try {
        if (!isHideQueryText() && resultsSash.getMaximizedControl() != null) {
                IWorkbenchPage page = window.getActivePage();
            checkSession(status -> {
                        anyNotPinnedTab = anyNotPinnedTab || !processor.hasPinnedTabs();
        if (!DBWorkbench.getPlatform().getApplication().isStandalone()) {
                suggestionTextPainter.removeHint();
import org.eclipse.swt.SWT;
                    contextDefaultNames = isRestoreActiveSchemaFromScript() && instance.getDataSource() != null ?

                    }
                if (extListener != null) {
            scriptContext,
                            }
                tabItem.addDisposeListener(e -> {
            if (item.getData() == panel) {
    public void closeActiveTab() {
        SQLScriptContext scriptContext = context;
        switchPresentationSQLButton.setImage(DBeaverIcons.getImage(DBIcon.TREE_SCRIPT));
        DBPProject project = getProject();
        }

    final List<QueryProcessor> queryProcessors = new ArrayList<>();
            folder = resultTabs;
            if (activeRS != null && activeRS.getActivePresentation() != null) {
        if (document == null) {
            case ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER:
                if (rsv != null && rsv.getActivePresentation().getControl() != null && rsv.getActivePresentation().getControl()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        @Nullable final SQLQueryListener queryListener, @Nullable final SQLScriptContext context
            if ((e.keyCode == SWT.ARROW_RIGHT || e.keyCode == SWT.TAB || e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR)
        // it's a workaround for cases where we can't correctly parse whole query
            if (extraPresentationManager.activePresentation != null) {
        } else {
                        null,
                success = false;
            if (!focusInEditor) {
        if (resultSetNumber > 0) {
    }
    public SQLPresentationDescriptor getExtraPresentationDescriptor() {
            try {
                return preferenceStore.getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT);

    public int promptToSaveOnClose() {
        DBPPreferenceStore preferenceStore = getActivePreferenceStore();
    public void removeListener(SQLEditorListener listener) {
            null,
            @Override
        showExtraView(
            );
                } else if (data instanceof SQLEditorPresentationPanel pp) {
                                            tab.dispose();
            CTabItem tabItem = curResultsContainer.getResultsTab();
                "Extract data",
            this.updateMultipleResultsPerTabToolItem();
                synchronized (owner.runningQueries) {
        }
import org.eclipse.jface.action.*;
    public Boolean getDisableFetchResultSet() {
    public boolean supportsRename() {
    @Nullable

            bottomLeft = DBIcon.OVER_RED_LAMP;
                suggestionTextPainter.applyHint();
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        }
        variablesViewer = new SQLVariablesPanel(folder, this);
                action.setDescription(orientation.getDescription());
        }

        Control control = sash.getChildren()[0];
            buttons.add(button);
            if (item.getData() instanceof SingleTabQueryProcessor stqp) {
                    }
        tip

                        owner.setResultTabSelection(queryProcessor.resultContainers.getFirst().getResultsTab());
            return;
        final SQLPresentationDescriptor presentation = SQLPresentationRegistry.getInstance().getPresentation(presentationId);
                    }
                    if (scriptMode) {
    @Nullable

        @NotNull Image image,

                    elements = extractScriptQueries(0, document.getLength(), true, false, true);
        }
                        if (i == 0 && keepFirstTab) {
                // 2. The user is executing only single query
        return getTotalQueryRunning() > 0;
                                        final List<CTabItem> tabs = new ArrayList<>();
            DBWorkbench.getPlatformUI().showError(

            .append("\n")
        updateExecutionContext(null);
                        owner.setTitleImage(owner.editorImage);
        if (toolItem != null) {
                                    activeTab.getText()
                                });
                }

            log.debug("Error extracting datasource info from script's content", e);
        topBarMan = new ToolBarManager(topBar);
                            manager.add(new Separator());
    }
            tabName = SQLEditorMessages.editors_sql_data_grid;
    private class PresentationPanelToggleAction extends Action {
        // Create editor presentations sash
                @SuppressWarnings("unchecked")
                        } catch (Exception e) {
                        }
                        queryText
                curDataSource = dataSource;
        } catch (IOException e) {
    }
        return file == null ?
            }
                }.schedule(200);
        }
                viewItem.setSelection(false);
        public boolean isSupported() {
import org.jkiss.dbeaver.ui.internal.UIMessages;

                }
        });
                // FIXME: silly workaround. Command state update doesn't happen in some cases
*/
                ResultSetViewer rsv = resultsProvider.getResultSetController();
            }
        checkConnected(false, status -> UIUtils.asyncExec(() -> {
        DBPDataSourceContainer newDataSource = EditorUtils.getInputDataSource(SQLEditor.this.getEditorInput());
                getSite().getShell(),
                schedule(200);

import org.eclipse.jface.dialogs.MessageDialog;

        );
            dataSourceContainer.getPreferenceStore().removePropertyChangeListener(this);

    private void fireDataSourceChanged(PreferenceChangeEvent event) {
                try {
            dataSourceContainer.release(this);
                    if (adapter != null) {
                throw new DBException("Disconnected from database");
import org.eclipse.osgi.util.NLS;
        }
        ));

                        return;
            .stream()
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
            button.addSelectionListener(switchListener);
                                if (dialog.open() == IDialogConstants.OK_ID) {
        // No need to close anything
                        if (!hasErrors) {
                            return;
        }
            this.originalSelection = (ITextSelection) queryProcessor.getOwner().getSelectionProvider().getSelection();
            setUser(false);
        saveToExternalFile(getScriptDirectory());
            if (selectedItem != null && selectedItem == resultTabs.getSelection()) {
    public void explainQueryPlan() {
            setUser(false);
                }

                    boolean contextChanged = isContextChanged(event);
    private static final Image IMG_VARIABLES = DBeaverIcons.getImage(UIIcon.SQL_VARIABLE);
        }
                QueryProcessor processor = queryResultsContainer.queryProcessor;
            new OutputLogWriter(),
                // Datasource was changed or instance was changed (PG)
                // Close tab if it is already open
            if (sideBarChanged) {
        public void stop() {
    }
                return true;
                        return dataSource;
        }
        );

    @Override

        isShowScriptRulerOnExecution = value;
            UIServiceSystemAgent serviceSystemAgent = DBWorkbench.getService(UIServiceSystemAgent.class);
                return item;
import org.jkiss.dbeaver.model.app.DBPProject;
            var needAnotherQueryProcessor = !noQueryProcessors && useTabPerQuery(isSingleQueryNotScript)
        resultTabs.addSelectionListener(new SelectionAdapter() {
                        owner.showStatementInEditor(query, false);


        }
            try {

    );
                parentContext = nc.getScriptContext();
                // 1. New tab is not required
                }
        switchPresentationSQLButton.setChecked(true);
        } else {
    public void beforeDisconnect() {
                                    }
        }
                SQLEditorMessages.editors_sql_error_cant_execute_permissions_query_message
    private volatile DBCExecutionContext lastExecutionContext;
                }

        });
        fireDataSourceChange();
                        getSelectionProvider().setSelection(new TextSelection(planQuery.getOffset(), 0));
            super(SQLEditorMessages.pref_page_sql_editor_label_auto_open_output_view, AS_CHECK_BOX);
        sqlExtraPanelSash.setLayoutData(gd);
    @Override
                        tabItem.dispose();
                }
            DBWorkbench.getPlatformUI().showError("Bad query", "Can't execute query", e);
        if (getExecutionContext() == null) {

    public void addListener(SQLEditorListener listener) {
            super("Connect visualizer");
            resultsSash.setMaximizedControl(sqlEditorPanel);
}
        }
    private void switchFocus(boolean results) {
        return true;
        boolean isSingleQueryNotScript = isSingleQuery && !forceScript;
                    ConfirmationDialog.WARNING,
        if (isolatedExecutionContext != null) {
        }
                } else if (outputViewer.getControl().isFocusControl()) {
        item.addDisposeListener(e -> {

                        TextViewer textViewer = owner.getTextViewer();
                            + "'"); //$NON-NLS-2$
    }
        List<SQLScriptElement> elements = getSelectedQueries();


    public void toggleEditorMaximize() {
        };
                queryProcessor.getCurJobRunning().incrementAndGet();
        if (!elements.isEmpty()) {
            setInput(input);
        DBPImage bottomLeft;

            owner.notifyOnQueryResultListeners(owner.curResultsContainer, result);
        }
        }
                IWorkbenchPage page = getSite().getPage();
                });
            setStatus(SQLEditorMessages.editors_sql_status_empty_query_string, DBPMessageType.ERROR);
            setChecked(!isChecked());
    }
        if (transactionStatusUpdateJob == null) {
                Object tabControl = activeResultsTab.getData();
        ScriptAutoSaveJob() {
                    if (needAnotherQueryProcessor
        logViewer = null;
import org.eclipse.ui.texteditor.rulers.RulerColumnRegistry;
                scriptNameResolver.get(SQLPreferenceConstants.VAR_ACTIVE_SCHEMA)
                e.doit = false;
                SQLEditorAddIn addIn = addInDesc.createInstance();
            menuMgr.setRemoveAllWhenShown(true);
                setTitleImage(DBeaverIcons.getImage(UIIcon.LOADING.get(tickCount % UIIcon.LOADING.size())));
            Object data = e.widget.getData();
            public Path getSourceFile() {
    }

            DBPProject project = this.getProject();
        }
                viewItem.setImage(image);
import org.jkiss.dbeaver.model.qm.QMTransactionState;
                final IFile file = ((IFileEditorInput) editorInput).getFile();
    private String getTransactionStatusText() throws DBCException {
        int tabCount = resultTabs.getItemCount();
        final DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
            return;
            }
        public IStatus runInUIThread(IProgressMonitor monitor) {
            UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
                    UIUtils.asyncExec(() -> {
            }
            }
        if (curItem != null) {
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
            IFile file = EditorUtils.getFileFromInput(input);
        }
            } else {
                return Status.OK_STATUS;
            if (sqlQuery != null) {
        }

    }
        firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
        return GeneralUtils.replaceVariables(pattern, new SQLEditorVariablesResolver(
                monitor.subTask("Open context " + title);

        ) {
                planView.explainQueryPlan(sqlQuery, planner);
            workspace.getResourceDefaultRoot(activeProject, ScriptsHandlerImpl.class, false);
            // Close all extra tabs of this query processor
            lastFocusInEditor = focusInEditor;
                    for (IFileState historyItem : fileHistory) {
                return Status.CANCEL_STATUS;
            switchFocus(!UIUtils.hasFocus(resultTabs));
            createResultTabs();

        }
            getSite().getShell(),
    public static final String DEFAULT_TITLE_PATTERN = "<${" + SQLPreferenceConstants.VAR_CONNECTION_NAME + "}> ${"
        }
            }
            .toList();
                owner.runPostExecuteActions(null);
                }
        IFile fileFromInput = EditorUtils.getFileFromInput(this.getEditorInput());
    @Override
    }

    public void toggleResultPanel(boolean switchFocus, boolean createQueryProcessor) {
    }
                }
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        //      meaning that active part change sometimes happens before this code;
            IDocument document = getDocument();
            log.error("Error deleting empty script file", e); //$NON-NLS-1$
            targetName
                    tabControl = stqp.getFirstResults().viewer;
                    tabIndex = i;
                        return;
            null,
        return curQueryProcessor != null && curQueryProcessor.getRunningJobs() > 0;
import org.jkiss.dbeaver.ui.editors.sql.scripts.ScriptsHandlerImpl;
                SQLEditor owner = getOwner();
                                        }
            logViewer,
                    }
            File localFile = EditorUtils.getLocalFileFromInput(getEditorInput());
                    }
        curQueryProcessor = curResultsContainer.queryProcessor;

    @Nullable
        textWidget.addVerifyKeyListener(e -> {
            if (!extraPresentationManager.setActivePresentation(presentation)) {
            CTabItem selectedItem = resultTabs.getItem(new Point(event.getBounds().x, event.getBounds().y));

            if (field != null) {
            initSeparateConnection(dataSource, () -> onFinish.onTaskFinished(Status.OK_STATUS), false);
    @Override
            if (confirmClose) {
        }
        return setDataSourceContainer(inputDataSource);
                return null;
        }
    @Override
    public void reloadSyntaxRules() {
                    rsv.setStatus(
    @Override
        if (isNonPersistentEditor()) {
                if (confirmResult == IDialogConstants.CANCEL_ID || confirmResult < 0) {
            activeResultsTab = null;
            return label;
    }

        }
            } catch (IOException e) {
                WorkbenchMessages.Save_Resource,
            if (!planView.loadQueryPlan(planner, planView)) {
                    // Hide results
    protected String getEditorName() {
                                                tabs.add(tab);
            scriptAutoSavejob.cancel();
        }
                    if (container.resultSetNumber == index) {
                }
                log.debug(e);
        }
            if (lines.isEmpty()) {
            } finally {
        return queryProcessor;
                }

                        try {
    }

        if (CommonUtils.isEmpty(tabName)) {
            SQLEditorContributions.SQL_EDITOR_CONTEXT,
    @Override
        public IFindReplaceTarget getTarget() {
        try {

        synchronized (listeners) {

        for (QueryProcessor queryProcessor : queryProcessors) {
                    log.debug(ex);
            resultsView.setStatus(status, messageType);

            showOutputPanel(true);
    }

        textWidget.addVerifyKeyListener(e -> {
            setSystem(true);
                previousTarget = textViewer.getFindReplaceTarget();
                        initSeparateConnection(dataSource, onSuccess, true);
            }
                tabsToClose.getFirst().dispose();
            });
            // Show results
            }
                    item.setToolTipText(preparedText);
        @Override
        resultsSash.setSashWidth(8);
    private void addSashRatioSaveListener(SashForm sash, String prefId) {
        @Override
            return null;
                }
                    }
                } else {

                                        final List<CTabItem> tabs = new ArrayList<>();
                    return;
        }
                } else {
                } else if (tabsClosed == IDialogConstants.NO_ID) {
        @NotNull String name,

        if (isNonPersistentEditor()) {

                try {
        if (dataSourceContainer != null) {
            }
        if (actionContributor != null) {
            if (file != null && dataSourceContainer != null) {
                // Container was changed. Reset context provider and update input settings

            Map.of("driver", dataSource == null ? "" : dataSource.getDriver().getPreconfiguredId())
                curDataSource = dataSource;
                try {
                    return stqp.getFirstResults().viewer;
            private void saveContextVariables() {
                            .showError("New connection default", "Error setting default catalog/schema for new connection", e);
                                    for (CTabItem item : resultTabs.getItems()) {

        if (dangerousQuery.getEntityMetadata(false) != null) {
        return queries
            ISelectionProvider selectionProvider = owner.getSelectionProvider();
            return Status.OK_STATUS;
            deleteFileIfEmpty(sqlFile);
        }
        resultTabs.setFont(JFaceResources.getFont(UIFonts.Eclipse.PART_TITLE_FONT));
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
                jobsRunning
import org.eclipse.ui.texteditor.*;
    private void updateMultipleResultsPerTabToolItem() {
    private DBPPreferenceStore getContextPrefStore(@NotNull QueryResultsContainer container) {
    private ResultSetOrientation resultSetOrientation = ResultSetOrientation.HORIZONTAL;
            .append(NLS.bind(SQLEditorMessages.sql_editor_title_tooltip_url, dataSourceContainer.getConnectionConfiguration().getUrl()));
    }
            planView = new ExplainPlanViewer(this, this, resultTabs, maxPlanNumber);
        if (variablesViewer != null) {
            }
                                    public void run() {
        } else {

            SQLEditorPropertyTester.firePropertyChange(SQLEditorPropertyTester.PROP_CAN_EXPLAIN);
                    field.setImage(null);
    private void updateExtraViewToolbar(IActionContributor actionContributor) {
    @Nullable

        ToolBar topBar = new ToolBar(leftToolPanel, SWT.VERTICAL | SWT.FLAT);
                        return;
        }
                    setActiveResultsContainer(stqp.getFirstResults());
        fireDataSourceChanged(event);
                    switch (event.getAction()) {
                    int resultsIndex = 0;
                tabsToClose.add(item);
        synchronized (listeners) {
    }
            setUser(true);
        for (SQLEditorAddIn addIn : addIns) { // we are ok with brute-force until there are not many of add-ins
                        showOutputPanel(true);
                        if (!outputViewer.isDisposed()) {

                    SQLPreferenceConstants.CONFIRM_RESULT_TABS_CLOSE,
                if (!file.exists()) {
                    if (activeTab.getShowClose()) {
                        return Status.OK_STATUS;
    @Override
                                @Override
                            SQLQueryResult.ExecuteResult executeResult = result.getExecuteResults(resultsIndex, true);
import org.eclipse.swt.layout.GridLayout;
        closeAllJobs();
        item.setText(name);
            .filter(SQLQuery::isDropDangerous)
            if (error != null) {
        CTabItem logTab = getExtraViewTab(logViewer);
        if (required == IResultSetController.class || required == ResultSetViewer.class) {
    void setActiveResultsContainer(QueryResultsContainer data) {
            if (contributionItem instanceof ActionContributionItem) {
        return true;
        }
import org.jkiss.dbeaver.ui.editors.sql.addins.SQLEditorAddIn;
        String epLocation = getExtraPanelsLocation();
    }

        }
                getSourceViewer().revealRange(query.getOffset(), query.getLength());
            SQLEditor owner = getOwner();

            toolItem.setImage(multipleResultsPerTab
                manager.add(new Separator());
        @NotNull BiFunction<SQLQuery, Integer, Integer> dialogCreator
                        viewer.updateStatusMessage();
                    currentOutputViewer.flush();
            @Override
                        container.resultSetNumber--;
                if (page != null && page.getActiveEditor() instanceof SQLEditor editor) {
            globalScriptContext,
                        DBCExecutionContextDefaults<?, ?> contextDefaultsDB = defaultContext.getContextDefaults();
import org.eclipse.jface.text.*;
                if (extListener != null) {
                } else if (tabControl instanceof SingleTabQueryProcessor stqp) {
            }
                new AbstractJob("Notify context change") {
                    return;
            } else {
        if (viewer != null) {

            if (execContext != null) {
                    return extraPresentationManager.activePresentationPanel;
            dataSourceContainer = null;
    private void setStatus(String status, DBPMessageType messageType) {

        HORIZONTAL(
        String[] contextDefaults = isRestoreActiveSchemaFromScript() ?
            if (serviceConnections != null && !serviceConnections.checkAndCloseActiveTransaction(
    public void showExecutionLogPanel(@Nullable Boolean show) {
                    if (planQuery != null) {
            }
        return isDisableFetchResultSet;
                            manager.add(action);
        ToolItem toolItem = getViewToolItem(SQLEditorCommands.CMD_MULTIPLE_RESULTS_PER_TAB);
    DBPDataSourceAcquirer,
                if (onSuccess != null) {
                }

        }
                updateResultSetOrientation();
    private void setResultTabSelection(CTabItem item) {
    public boolean isActiveTabPinned() {
            tabItem.dispose();

    IStatefulEditor
    private static final Image IMG_EXPLAIN_PLAN = DBeaverIcons.getImage(UIIcon.SQL_PAGE_EXPLAIN_PLAN);
    @Override
                return;
        boolean wasEnabled = isMultipleResultsPerTabEnabled();
            }
                            break;

        suggestionTextPainter.enable();
        resultTabs.addListener(SWT.MouseDoubleClick, event -> {
        private transient Boolean success = null;
    }

        }
                }
        if (!export && curQueryProcessor != null) {
                // Set tab names by query results names
                return;
    DBPDataSourceTask,
                                firePropertyChange(IWorkbenchPartConstants.PROP_TITLE);
     */
                setStatus(query.getText(), DBPMessageType.INFORMATION);


    /**
                monitor.subTask("Close context " + context.getContextName());
                                        if (tab.getShowClose() && tab != activeTab && !isPinned(tab)) {
            stopped = true;
    void notifyOnDataListeners(@NotNull QueryResultsContainer container) {
                    PresentationPanelToggleAction.this.setChecked(false);
                if (queryProcessor != null && queryProcessor != processor) {
        if (required == INavigatorModelView.class) {
            sqlExtraPanelSash.setMaximizedControl(sqlExtraPanelSash.getChildren()[0]);
        } else {
                for (int i = 0; i < tabsToClose.size(); i++) {
        DBCExecutionContext executionContext = getExecutionContext();
                final List<SQLPresentationPanelDescriptor> panels = extraPresentationManager.activePresentationDescriptor.getPanels();
                }
    public void removeResults(QueryResultsContainer resultsContainer, boolean removeProcessor) {
    private ToolBarManager bottomBarMan;
import org.jkiss.dbeaver.ui.editors.sql.plan.ExplainPlanViewer;
        SelectionListener switchListener = SelectionListener.widgetSelectedAdapter(e -> {
                });
            // FIXME: it is a hack (to avoid asking "Save script?" because editor is marked as dirty while queries are running)
            : new SingleTabQueryProcessor(this, makeDefault);
                }
        }
                ResultSetViewer activeViewer = getActiveResultSetViewer();
import org.eclipse.jface.preference.IPreferenceStore;
                success = true;
                String execQuery = ActionUtils.findCommandDescription(SQLEditorCommands.CMD_EXECUTE_STATEMENT, getSite(), true);

                for (int index = containers.indexOf(data) + 1; index < containers.size(); index++) {
                    }
                }
            DBSInstance selectedInstance = DBUtils.findObject(dataSource.getAvailableInstances(), contextDefaults[0]);
                monitor.done();
        }
            return;
        }
                } else if (data instanceof ExplainPlanViewer epv) {
                // Do not switch tab if Output tab is active
                            if (resultSetViewer != null) {
        if ((isTransactionInProgress && rollbackTimeoutSeconds > 0) &&
            }

                UIMessages.dialog_policy_sql_execution_title,
    }
        isolatedExecutionContext = null;
            show
            SQLEditorPresentationPanel panelInstance = extraPresentationManager.panels.get(panel);
    }
    }
                    // Update dirty flag
            // Show presentation panels
        SQLScriptContext parentContext = null;
                    currentOutputViewer.println(severity, message);
            final DBCOutputWriter outputWriter = new DBCOutputWriter() {
                if (outputViewer!=null) {
                ) {
                            status
    @Nullable


            setUser(true);
                } catch (Throwable ex) {
        } else {
            if (configuration == null) {
            }
            && useTabPerQuery(isSingleQueryNotScript) == (curQueryProcessor instanceof SingleTabQueryProcessor))) {
                }
                                session.getProgressMonitor(),
        }
    public void toggleActiveTabPinned() {
            if (isResultSetAutoFocusEnabled && !newTab && (!isSingleQueryNotScript || (isSingleQueryNotScript && !replaceCurrentTab))) {

        MULTIPLE_RESULTS_PER_TAB_PROPERTY, MULTIPLE_RESULTS_PER_TAB_PROP_NAME,
        }
                }
                    initSeparateConnection(dataSource, null, false);
        if (project != null && project.isRegistryLoaded()) {
            EditorUtils.setInputDataSource(input, new SQLNavigatorContext(getDataSourceContainer(), getExecutionContext()));

        bottomBarMan.update(true);
        String scriptName;
        // Save editor
            showResultsPanel(true);
                    panelButton.setAction(toggleAction, true);
            case ModelPreferences.SQL_VARIABLES_ENABLED:
        }
            // 1. New tab is explicitly requested
    private boolean datasourceChanged;

    @Override
                if (!checkSession(connectListener)) {
        if (SQLEditorUtils.isSQLSyntaxParserApplied(getEditorInput())) {
        for (IContributionItem contributionItem : bottomBarMan.getItems()) {
        return presentationSwitchFolder;

                    log.debug(e);
    }


     * This function is called on drag-n-drop and some other operations
        }

        return maxIndex;

                DBRProgressListener connectListener = status -> {
        }
    }
     * Handles datasource change action in UI
    /**
        }
                    tabControl = qrc.viewer;
    }
            }
        }
            ListIterator<SQLEditorAddIn> addInsIterator = addIns.listIterator(addIns.size());
                if (CommonUtils.isEmpty(scriptPath)) {
        }
        try {
            return ISaveablePart2.YES;
        }
            outTab.dispose();
                    }

            && txnState.getUpdateCount() > 0;
        }

    protected boolean isDetectTitleImageFromInput() {
                String title = "SQLEditor <" + getEditorInput().getName() + ">";
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
    ISmartTransactionManager,
            doScriptAutoSave();
            } catch (Throwable e) {
    private void explainQueryPlan(SQLQuery sqlQuery) {

                if (preparedText.length() > 300) {
        UIUtils.syncExec(() -> {
                                    outputReader.readServerOutput(monitor, executionContext, null, statement, outputWriter);
            }
                    extListener.onStartScript();

                // FIXME: To update main toolbar and other controls we hade and show this editor
        if (tabItem.getData() instanceof QueryResultsContainer) {
        return viewItem;
                return ISaveablePart2.CANCEL;
                        e.detail = SWT.TRAVERSE_NONE;
        } catch (DBException e) {
        if (script) {
    }
        // Update controls
            }
        synchronized (listeners) {

    @NotNull
import org.eclipse.ui.progress.UIJob;
        if (isTabsToTheRight) {
        private void updateContext() {
            }
            if (e.keyCode == SWT.ESC) {
            return null;
        if (curQueryProcessor != null && isActiveQueryRunning()) {
            }
    public void setSmartAutoCommit(boolean smartAutoCommit) {
                        }
    /**
        return contextChanged;
        }
        if (planStyle == DBCPlanStyle.QUERY) {
    }
        //      datasource change event also won't come.
        try {
    private SQLEditorOutputViewer outputViewer;
                    transactionStatusUpdateJob = new TransactionStatusUpdateJob();
            } else {
                    // Update existing association
                }
    }
        return null;
            }
            } else {
        }
    private boolean isRestoreActiveSchemaFromScript() {
    private void showStatementInEditor(final SQLQuery query, boolean select) {
        }
            for (int i = resultTabs.indexOf(activeTab) - 1; i >= 0; i--) {
                                    SQLEditorMessages.action_result_tabs_set_name_title,

        @NotNull Control view,
    }
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA) && isSeparateConnection;
            // No datasource. Try to get one from active part
            if (!stopped) {
            epLocation = SQLPreferenceConstants.LOCATION_RIGHT;
            }
            if (document == null || runningQueries.isEmpty()) {
    VerticalFolder getPresentationSwitchFolder() {
        }));
                                        }
                    return;
        final boolean dsEvent = event.getObject() == getDataSourceContainer();

            VerticalButton viewItem = getViewToolItem(SQLEditorCommands.CMD_SQL_SHOW_OUTPUT);
                    }
    public void init(IEditorSite site, IEditorInput editorInput)
        @Override

        }
        }
            // Get/open context
    }
        if (SQLPreferenceConstants.LOCATION_RESULTS.equals(epLocation)) {
                    setFocusToTextControl();
                monitor.done();
    }
            }
            } finally {

            if (textWidget != null) {
                }
                    : null; // SQLQueryResult stores modified query
                if (tabControl instanceof IAdaptable adaptable) {
            } catch (Throwable ex) {
                }

                } catch (Exception e) {
                    resultTabDisposeListener.widgetDisposed(e);
            UIExecutionQueue.queueExec(this::createResultTabs);
            }

                    previousTarget = new StyledTextFindReplaceTarget(outputViewer.getText());
        this.onDataSourceChange(true);
import org.jkiss.dbeaver.model.impl.DefaultServerOutputReader;
 */
import org.jkiss.dbeaver.model.struct.DBSObject;
            }
                }
                    ) {
        syntaxLoaded = true;
            DBWorkbench.getPlatformUI().showError("File save", "Can't open SQL editor from external file", e);
            if (activeResultsTab != null && UIUtils.isUIThread()) {
        }
                    }
                }
        panelsLayout.marginBottom = 7;

        }
        if (!extraPresentationManager.presentations.isEmpty()) {
            if (suggestionTextPainter.hasContentToShow()) {

            super("Save '" + getPartName() + "' script");
    ) {

            } else if (item.getData() instanceof QueryProcessor) {
            for (CTabItem item : resultTabs.getItems()) {
            case ModelPreferences.SCRIPT_STATEMENT_DELIMITER:
        }
                                });
        panelsLayout.marginHeight = 2;
            }
                confirmResult = ConfirmationDialog.confirmAction(
            monitor.beginTask("Close SQLEditor isolated connection", 1);
            List<Integer> lines = new ArrayList<>(runningQueries.size() * 2);
            this,
        } else {
            if (tabItem != null) {
    private static final EditorPartContextualProperty multipleResultsPerTabProperty = EditorPartContextualProperty.setup(
        }
            boolean multipleResultsPerTab = this.isMultipleResultsPerTabEnabled();

        }
        DBCExecutionContext inputExecutionContext = this.globalScriptContext.getExecutionContext();
     */
        presentationSwitchFolder.setLayoutData(new GridData(GridData.FILL_VERTICAL));
                ? MultipleResultsPerTabMenuContribution.FALSE_IMAGE
            tip.append("\n").append(NLS.bind(
        public void onStartScript() {
                }

        @Nullable Boolean show // true - show, false - hide, null - toggle
                            SQLEditorMessages.editors_sql_error_cant_obtain_session,
            List<ServerOutputInfo> outputs;
    }
    public void toggleActivePanel() {
                // Disposed?
    }
            if (transformer != null) {
        if (document == null) {
        if (presentation != null && !presentation.isEnabled(getSite())) {
            this,
        return createScriptContext().fillQueryParameters(query, () -> null, false);
                        }
        private final boolean readDefaultsFromInstance;
                        }
            CTabItem activeResultsTab = getActiveResultsTab();
            TextViewer textViewer = getTextViewer();
        @Override

            final DBPDataSource dataSource = dataSourceContainer.getDataSource();

                try {
                } else {
            return;
    private static final String EMBEDDED_BINDING_PREFIX = "-- CONNECTION: ";
        }
            if (topBarMan != null) {
            if (!viewItem.isDisposed()) {
                if (nextTabItem.getShowClose()) {
    }
                }
            }
        }
                }

        });
            item.setControl(planView.getControl());
            return;
                if (executionContextProvider == null) {
            return;
            }
    private void closeAllJobs() {
                IAction action = ((ActionContributionItem) contributionItem).getAction();
            UIUtils.asyncExec(() -> {
                    updateExecutionContext(null);
import org.jkiss.utils.ArrayUtils;
    }
    }
        DBPDataSource dataSource = ds.getDataSource();
                        manager.add(new Action(SQLEditorMessages.action_result_tabs_set_name) {
    interface QueryProcessingComponent {
                            if (objectEvent) {
            .append(NLS.bind(SQLEditorMessages.sql_editor_title_tooltip_path, scriptPath))
                    QueryResultsContainer container = containers.get(index);
            String curPresentation = preferenceStore.getString(SQLPreferenceConstants.RESULT_SET_ORIENTATION);
        showExtraView(
                    @Override
            resultsSash.setMaximizedControl(resultTabs);
            for (int i = tabCount; i > 0; i--) {
            && !txnManager.isAutoCommit()
                List<QueryResultsContainer> results = stqp.getResultContainers();
                monitor.done();
                }
    }
                }
            }

        }
            getOwner().showResultsPanel(false);

        resultsSash = UIUtils.createPartDivider(
                                }
                        if (!container.isStatistics()) {
        SaveJob() {
                if (serviceConnections != null) {
        ToolItem viewItem = topBarMan == null ? null : UIUtils.findToolItemByCommandId(topBarMan, commandId);

            ExplainPlanViewer planView = getPlanView(sqlQuery, planner);
            SQLEditorMessages.editors_sql_output_tip,
        }
                }
            // Drop it.
                // Refresh active object
            }
        if (dataSourceContainer != null && !SQLEditorUtils.isOpenSeparateConnection(dataSourceContainer)) {
        this.addSashRatioSaveListener(resultsSash, SQLPreferenceConstants.RESULTS_PANEL_RATIO);
            : DBPPlatformDesktop.getInstance().getWorkspace().getProject(file.getProject());
            } else {
 * SQL Executor
import org.jkiss.dbeaver.ui.editors.sql.variables.SQLVariablesPanel;
                        // to avoid concurrent modification exception
            viewItem = bottomBarMan == null ? null : UIUtils.findToolItemByCommandId(bottomBarMan, commandId);

            }
                        case BEFORE_CONNECT:
            suggestionTextPainter.removeHint();
    }
        CTabItem tabItem = getActiveResultsTab();
        super.init(site, editorInput);
            null,
                        viewer.getActivePresentation().getControl().setFocus();
        }
        }
        boolean res = super.validateEditorInputState();
                if (page != null) {
        }
    private DBPDataSourceContainer getDataSourceFromContent() {
            }
        if (extraPresentationManager.activePresentation instanceof ISaveablePart) {
        public int getSashOrientation() {
    public List<SQLScriptElement> getSelectedQueries() {
        gd.verticalIndent = 5;
                    extraPresentationManager.activePresentationPanel.activatePanel();
                    ) {
        if (planner == null) {
                        );
            dialogType,
            updateExtraViewToolbar(actionContributor);
        }
                && suggestionTextPainter.hasContentToShow()
                                manager.add(new Action(SQLEditorMessages.action_result_tabs_close_tabs_to_the_right) {
            StyledText textWidget = viewer.getTextWidget();

            SQLEditorMessages.editors_sql_execution_log,
        if (getActivePreferenceStore().getBoolean(SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE)) {
        }
            bottomRight = DBIcon.OVER_SUCCESS;
                    getSite().getShell(),
            if (doConnect) {
                    sideBarChanged = true;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        setResultTabSelection(tabItem);
        if (resultTabs != null) {
                }

        }
                                        for (CTabItem tab : tabs) {
    @Nullable
            && getActivePreferenceStore().getBoolean(SQLPreferenceConstants.FOLDING_ENABLED);
    public boolean isActiveQueryRunning() {
                } catch (Throwable ex) {
        }));

            dataSourceContainer.getConnectionConfiguration(),
            setTitleImage(DBeaverIcons.getImage(UIIcon.SQL_CONSOLE));
        curResultsContainer = null;
                boolean anyNotPinnedTab = false;
            // 2. The user is executing script that may open several result sets
                }
                items.add(new ActionContributionItem(action));
                        if (contextDefaultsDB != null) {
                    extListener.onEndScript(statistics, hasErrors);

        }
                tabItem.setToolTipText(panel.getDescription());
        EditorUtils.appendProjectToolTip(tip, getProject());
            ));
                showExtraPresentation(newPresentation);
    public void dispose() {
                            break;
                GeneralUtils.UTF8_ENCODING
                getDangerousUpdateDeleteQueries(queries),
                DBCExecutionContext newExecutionContext = DBUtils.getDefaultContext(container, false);
    public void handleDataSourceEvent(@NotNull final DBPEvent event) {
            if (extraPresentationManager.activePresentation != null) {

        @Override
                textViewer.refresh();
                        getContextPrefStore(container),


                .map(SQLEditorAddIn::getServerOutputConsumer)
        private final boolean closeTabOnError;
        for (CTabItem item : resultTabs.getItems()) {

        }
        } catch (DBException e) {
            return false;
        }
                        SQLEditorMessages.editors_sql_staus_connected_to + executionContext.getDataSource().getContainer().getName()
                DBCPlan plan = planner.planQueryExecution(session, sqlQuery.getText(), configuration);
            if (serviceSystemAgent != null && result.getQueryTime() > serviceSystemAgent.getLongOperationTimeout() * 1000) {
                );
            return;
        UIUtils.dispose(tmpImage);

            // 4. Or current query processor is multi-tabbed and user wants single-tabbed or vice versa
    ISaveablePart2,
            showVariablesPanel(true);
                return false;
                "Error",
            );
        }
        }

                for (QueryProcessor queryProcessor : queryProcessors) {
            }
                    }
        private void refreshContextDefaults(DBCSession session) {
            extraPresentationManager.dispose();

import org.jkiss.dbeaver.model.qm.QMUtils;
            return false;
                    outputViewer.println(severity, message);
        if (elapsedSeconds < 60) {

                && owner.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.BEEP_ON_QUERY_END)) {


    }
                    && ((PresentationPanelToggleAction) action).panel.getId().equals(panelID)
                        if (er.getEditor(false) == this) {
                    if (!status.isOK() || container == null || !container.isConnected()) {
                            manager.add(new Action(SQLEditorMessages.action_result_tabs_close_other_tabs) {
        }
            }
            }

            try {

        return context != null
                    addIn.cleanup(this);
            UIUtils.syncExec(this::embedDataSourceAssociation);
    }
    @Nullable
            UIFonts.Eclipse.PART_TITLE_FONT,
        private final int sashOrientation;
    }
                ConfirmationDialog.INFORMATION,
                    }
            for (SQLEditorListener listener : listeners) {
            case NEVER -> false;
            }
            public void setBackground(Color color) {
                // Check and add presentation panel toggles
        }
                }


                if (selection != null && selection.getLength() > 1) {
    }
                SQLEditor.this.isolatedExecutionContext = newContext;
            targetName = dangerousQuery.getEntityMetadata(false).getEntityName();
        // Cancel running jobs (if any) and close results tabs
        int jobsRunning = getTotalQueryRunning();
                            // in that case we need to update tab selection and
            if (!control.isDisposed()) {
        if (!CommonUtils.isEmpty(elements)) {
            UIUtils.asyncExec(
        return CommonUtils.toBoolean(multipleResultsPerTabProperty.getPropertyValue(this).value, false);
        }
        }
            return ISaveablePart2.DEFAULT;
            resultsSash.hideUp();
            }
                List<QueryResultsContainer> containers = processor.getResultContainers();
                serviceSystemAgent.notifyAgent(
        {
            for (CTabItem ti : sqlExtraPanelFolder.getItems()) {
        try {
                    }

            && getExecutionContext() != null

        DataSourceToolbarUtils.refreshSelectorToolbar(getSite().getWorkbenchWindow());
        return ConfirmationDialog.confirmAction(
                    if (!outputViewer.isVisible()) {
        DBPDataSourceContainer oldDataSource = SQLEditor.this.getDataSourceContainer();


                                contextDefaultsDB.getDefaultCatalog().getName() : null;
        if (stopDangerousQueriesExecutionConfirmation(queries)) {
                    log.error(ex);
import org.jkiss.dbeaver.ui.editors.sql.commands.MultipleResultsPerTabMenuContribution;
            final DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
                                }
                for (CTabItem tabItem : resultTabs.getItems()) {
                }
            final IFile script = SQLEditorUtils.createNewScript(getProject(), null, context);
            }
            } catch (DBException e) {
            monitor.beginTask("Auto-save SQL script", 1);
            DatabaseEditorContext parentEditorContext = EditorUtils.getEditorContext(editorInput);
            }
        if (extraPresentationManager != null) {
        }
            if (editorInput instanceof IFileEditorInput) {
        }
            }
    private Boolean isDisableFetchResultSet = null;
            }
                                public void run() {
            ToolItem viewItem = getViewToolItem(SQLEditorCommands.CMD_SQL_SHOW_OUTPUT);


    // Panels

                }
            });
        return elements;
import org.jkiss.dbeaver.utils.*;
            getSite(),
                    monitor.setCanceled(true);
            return confirmResult;
                DBWorkbench.getPlatformUI().showError(
            } finally {
            presentationSwitchFolder.redraw();

    protected void onDataSourceChange(boolean contextChanged) {


            DatabaseEditorUtils.setPartBackground(this, sqlEditorPanel);
                boolean activeTabHasSingleResult = activeTab != null && activeTab.getData() instanceof QueryResultsContainer;
                    if (serviceConnections != null) {
                if (region != null) {
            }
                    ResultSetViewer viewer = getActiveResultSetViewer();
                    elements = extractScriptQueries(selection.getOffset(), selection.getLength(), true, false, true);
        for (QueryProcessor queryProcessor : queryProcessors) {
            StyledText editorControl = getEditorControl();
                queryProcessor.getCurJobRunning().updateAndGet(i -> i > 0 ? i - 1 : i);


            }
                sqlExtraPanelSash.setMaximizedControl(sqlExtraPanelSash.getChildren()[0]);
            }
        if (!CommonUtils.isEmpty(resultsPanelRatio)) {
        for (SQLEditorAddInDescriptor addInDesc : SQLEditorAddInsRegistry.getInstance().getAddIns()) {
        }
            if (newTab || noQueryProcessors || hasRunningJobs || hasPinnedTabs || needAnotherQueryProcessor) {
    public boolean showPresentationPanel(SQLEditorPresentationPanel panel) {
        bottomBarMan.add(ActionUtils.makeActionContribution(new ShowPreferencesAction(), false));
        CTabFolder folder = this.sqlExtraPanelFolder;
            }
            for (int i = resultTabs.indexOf(activeTab) + 1; i < resultTabs.getItemCount(); i++) {
        topBar.setData(VIEW_PART_PROP_NAME, this);
        }
        IPreferenceStore preferenceStore = getPreferenceStore();

                }

        }
            SQLQuery planQuery = new SQLQuery(getDataSource(), planQueryString[0]);
        GridLayout panelsLayout = new GridLayout(1, true);
    private void checkInputFileExistence(IEditorInput editorInput) {
            // For Eclipse plugins return just title because it is used in main window title.
        @NotNull List<SQLQuery> dangerousQueries,
                            if (owner.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.SET_SELECTION_TO_STATISTICS_TAB) &&
                        if (owner.resultsSash.getMaximizedControl() == owner.sqlEditorPanel) {
        // De-select tool item on tab close
    }
    }
    }
            return;
                } else {
        leftToolPanel.setLayoutData(new GridData(GridData.FILL_VERTICAL));
        }
                    }

            epLocation = SQLPreferenceConstants.LOCATION_RESULTS;
        MultipleResultsPerTabMenuContribution.syncWithEditor(this);
    }
            final SQLPresentationDescriptor curPresentation = getExtraPresentationDescriptor();
            CTabItem activeResultsTab = getActiveResultsTab();
                        && owner.isResultSetAutoFocusEnabled
            } else {
                monitor.done();
            monitor.beginTask("Save query processors", queryProcessors.size());

        );
        } else if (tabsToClose.size() == 1) {
                }
    }
                            page.showEditor(er);
                extListener.onEndSqlJob(session, result);
        if (isNonPersistentEditor() && isDetectTitleImageFromInput()) {

            DatabaseEditorUtils.setPartBackground(this, resultTabs);



        fontUpdater.accept(null);
                stackLayout.topControl = presentationStack.getChildren()[0];
                stqp.setResultsTab(item);


            }
                textWidget.addModifyListener(this::onTextChange);
                }
        @Override
        if (!isHideQueryText()) {
 * See the License for the specific language governing permissions and
            showDangerousQueriesStopExecutionConfirmation(
                return;
            }
        }
                }
                Object data = e.item.getData();
                    } else {
                selectAndReveal(query.getOffset(), query.getLength());
            }

        return getPreferenceStore().getString(SQLPreferenceConstants.EXTRA_PANEL_LOCATION);
        if (viewItem == null) {
        );
            }
                DBWorkbench.getPlatformUI().showError("Explain error", "Failed to explain execution plan", e);
                        showExtraPresentation(pd);
    /**
import org.eclipse.jface.viewers.ISelectionProvider;
        List<SQLScriptElement> elements;
                    document.replace(0, 0, assocSpecLine.toString());
            IMG_LOG,
                }
                    UIUtils.asyncExec(() -> CSSUtils.markConnectionTypeColor(resultTabs));
                container = dataSource.getContainer();
        sqlExtraPanelFolder.setTopRight(sqlExtraPanelToolbar.getControl());
        item.setData("actionContributor", actionContributor);
        } else {
            dataSourceContainer,
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationDescriptor;
                }
        } catch (Exception e) {
    }
                if (rsv == null && !outputViewer.getText().isFocusControl() && previousTarget != null) {
        return isStopDropQueriesConfirmed ||

                        DBExecUtils.setExecutionContextDefaults(

                                        if (item.getData() instanceof QueryResultsContainer) {
    ) {
    @Override
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
                if (action instanceof PresentationPanelToggleAction
            StyledText editorControl = getEditorControl();
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorVariablesResolver;
                    serverOutputs.add(new ServerOutputInfo(outputReader, executionContext, result));
        }
        processSQL(newTab, script, null, null);
                resultTabs.setSelection(item);
            final DBPDataSource dataSource = executionContext.getDataSource();
                            if (item.getData() instanceof QueryResultsContainer && ((QueryResultsContainer) item.getData()).isPinned()) {
        public ISelectionProvider getProvider() {
                            newContext,
    public SQLSuggestionTextPainter getSuggestionTextPainter() {
        }
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
        ResultSetViewer resultsView = getActiveResultSetViewer();
            forceScript,
                            int cValue = contents.read();
            }
                if (tabControl instanceof QueryResultsContainer qrc) {
                return;
        ));
                resultsSash.setMaximizedControl(null);
        panelsLayout.verticalSpacing = 1;
    }
        syntaxLoaded = false;
    @Override
            fontUpdater,
    private int closeExtraResultTabs(@Nullable QueryProcessor queryProcessor, boolean confirmClose, boolean keepFirstTab) {
        setPartName(getEditorName());

import org.eclipse.core.filesystem.EFS;
                            break;
    private SQLScriptContext globalScriptContext;
            int maxPlanNumber = 0;
                            xQueries.add(element);
                return container.getConnectionConfiguration().getConnectionType().isSmartCommit();
        if (resultsView != null) {
import java.io.*;
                    SQLEditorMessages.editors_sql_error_cant_obtain_session,
        public String getDescription() {

                    }
        editorImage = baseEditorImage;
        CTabItem activeTab = getActiveResultsTab();
                if (owner.isDisposed()) {
        if (!extraPresentationManager.presentations.isEmpty()) {
        final IEditorInput editorInput = getEditorInput();
    public boolean isFoldingEnabled() {
            if (tab.getData() instanceof QueryResultsContainer qrc) {
                                pinnedTabsCount++;
    @Nullable
    private List<SQLQuery> getDropQueries(@NotNull List<SQLScriptElement> queries) {
                                connectVisualizer.stop();
                error = e;
            SQLScriptElement sqlQuery = extractActiveQuery();
            SQLEditorMessages.editors_sql_variables_tip,
        if (sqlFile != null && !PlatformUI.getWorkbench().isClosing() && !DBWorkbench.isDistributed()) {
            } catch (DBException ex) {

        }
            boolean sideBarChanged = false;
            return null;
                if (extraPresentationManager.activePresentation == null) {
            queryProcessor.closeJob();
        return null;
                    return false;
    @Nullable
    public static final String DEFAULT_SCRIPT_FILE_NAME = "Script";
                }
        }
    }
                String connSpec = matcher.group(1).trim();
    public SQLEditor() {
    public void showExtraPresentation(@Nullable SQLPresentationDescriptor presentation) {
                            contextDefaultNames[0],
                // Remove all presentation panel toggles
    @Nullable
                } else {
            new CloseContextJob(isolatedExecutionContext).schedule();
                            contextDefaultNames[0] = contextDefaultsDB.getDefaultCatalog() != null ?
                    }
        private final SQLPresentationPanelDescriptor panel;
                    activeViewer.setStatus(SQLEditorMessages.editors_sql_status_empty_query_string, DBPMessageType.ERROR);
                if (dataSource != null && SQLEditorUtils.isOpenSeparateConnection(dataSource.getContainer())) {
            item.addDisposeListener(resultTabDisposeListener);
    public void processSQL(boolean newTab, boolean script) {

    }
    }
        if (tabsToClose.size() > 1 || (tabsToClose.size() == 1 && keepFirstTab)) {
            // Not empty
                DBCExecutionContext newContext = instance.openIsolatedContext(monitor, title, instance.getDefaultContext(monitor, false));
            tip.append("\n\nConnection error:\n").append(dataSourceContainer.getConnectionError());

            }
            parentContext,
                        if (container.getQuery() != null) {
        if (presentationStackLayout != null) {

                    }
            // Update command states
                    extraPresentationManager.activePresentationPanel.deactivatePanel();
            resultsSash.setMaximizedControl(null);
            );
                this.executionContextProvider = null;
                // Get all queries from the current position
                    // This must be true for every container of this query processor
            return null;
            }
 * Unless required by applicable law or agreed to in writing, software
            dataSourceContainer.getRegistry().removeDataSourceListener(this);
            if (show == null || !show) {


     */
            if (totalLines > 0) {
        });
                                    public void run() {
                    }
        public void widgetDisposed(DisposeEvent e) {
            }
    }
                String execScript = ActionUtils.findCommandDescription(SQLEditorCommands.CMD_EXECUTE_SCRIPT, getSite(), true);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    List<SQLScriptElement> xQueries = new ArrayList<>(elements.size());
                    } else {
                // to avoid concurrent modification exception

        final DBCExecutionContext executionContext = getExecutionContext();
                }
            return description;
    public SQLEditorPresentation getActivePresentation() {
    protected String[] getKeyBindingContexts() {
                activeResultsTab = resultTabs.getItem(new Point(e.x, e.y))));
        SQLPreferenceConstants.MULTIPLE_RESULTS_PER_TAB, CommonUtils.toString(false)
            try {
        Composite editorContainer;
import org.jkiss.utils.CommonUtils;
                    action.run();
        } catch (Throwable e) {
        // Update toolbar
        } finally {
                reloadSyntaxRules();
            }
    }

        return super.getAdapter(required);
    public DBCExecutionContext getExecutionContext() {



                if (!file.exists()) {
            Boolean state = ConfirmationDialog.getPersistedState(
        }
                        && curQueryProcessor.getResultContainers().size() == 1
    private void createResultTabs() {
            }

        } else {
        }

        }
                () -> {
        } else {
     * Build and update icon and title
            } catch (Exception e) {
        }

                if ("file".equals(uri.getScheme())) {
                } catch (DBCException ignored) {
            String line = document.get(region.getOffset(), region.getLength());
        if (maximized) {

        }
            );
                        processQueries(queries, forceScript, finalNewTab, export, false, queryListener, context)));
            TEXT_EDITOR_CONTEXT,
        @NotNull
        if (presentation != null) {
        return extraPresentationManager.activePresentation;
                                    resultTabs.getShell(),
        suggestionTextPainter = new SQLSuggestionTextPainter(getViewer());
                if (getActivePreferenceStore().getBoolean(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW)) {
            this.extListener = extListener;


import org.eclipse.swt.widgets.*;
        private final DBCExecutionContext executionContext;
            SWT.VERTICAL,
            ResultSetOrientation[] orientations = ResultSetOrientation.values();
                        DBPDataSourceContainer ds = getDataSourceContainer();
                String line = document.get(region.getOffset(), region.getLength());
                if (!orientation.isSupported()) {
                new DBCExecutionContext[] {isolatedExecutionContext})
                                            if (!isPinned(tab)) {

    }
            return;
        }
                return;


            (disconnectTimeoutSeconds <= 0 || rollbackTimeoutSeconds < disconnectTimeoutSeconds) &&
            return;
import org.jkiss.dbeaver.ui.editors.text.ScriptPositionColumn;

        boolean contextChanged = isEditorContext && eventAction.equals(DBPEvent.Action.OBJECT_UPDATE);
                    field.setImage(DBeaverIcons.getImage(DBIcon.SMALL_WARNING));
            if (!(activeEditor instanceof SQLEditorBase)) {
                                        }
                    // Start connect visualizer
                        }
                }

        closeAllJobs();
            }
        }
        } else {
            }
            monitor.beginTask("Save data changes...", 1);
        if (dataSourceContainer == null) {

        OpenContextJob(DBSInstance instance, Runnable onSuccess, boolean readDefaultsFromInstance) {
            }
            return false;
                currentOutputViewer.getViewer().scrollToEnd();

            StringWriter out = new StringWriter();
                super.setBackground(color);
        }
    }
        }
        synchronized (listeners) {
            if (resultsSash.isDownHidden()) {
import org.jkiss.dbeaver.ui.*;
        final QueryProcessor queryProcessor = useTabPerQuery(singleQuery)
                    if (contextDefaults != null) {

        Image image = alert ? IMG_OUTPUT_ALERT : IMG_OUTPUT;
        CTabItem curItem = getExtraViewTab(view);
                    panelControl = panelInstance.createPanel(resultTabs, SQLEditor.this, extraPresentationManager.activePresentation);
                    }
                if (nc.isReuseExecutionContext()) {
                    owner.runningQueries.remove(result.getStatement());
            show
            getActivePreferenceStore().getString(SQLPreferenceConstants.SCRIPT_DELETE_EMPTY));
            return false;
            if (matcher.matches()) {
    public void showOutputPanel(@Nullable Boolean show) {
                        owner.setTitleImage(DBeaverIcons.getImage(UIIcon.SQL_SCRIPT_EXECUTE));
            reloadSyntaxRules();
    private void explainPlanFromQuery(final DBCQueryPlanner planner, final SQLQuery sqlQuery) {
                    processQueryResult(monitor, result, statistics);


        extraPresentationManager = new ExtraPresentationManager(this);
        UIUtils.runUIJob("Select SQL query in editor", monitor -> {
                synchronized (serverOutputs) {
    @Override
            editorImage = baseEditorImage;
                    for (SQLScriptElement element : elements) {

    public CTabFolder getResultTabsContainer() {
            return scriptDialect.createInstance();
            log.error("Error checking SQL file", e);
                for (VerticalButton button : presentationSwitchFolder.getItems()) {


        }

            // if the user is executing only single query
        }
            }

                DurationFormatter.format(Duration.ofSeconds(rollbackTimeoutSeconds - elapsedSeconds), DurationFormat.MEDIUM)


        } catch (Throwable e) {
                if (!isInExecute) {

                    return qrc.viewer;
                    }
            return super.belongsTo(family);
            }
        @NotNull

            globalScriptContext.loadVariables(dsContainer.getDriver(), null);
                    }

        if (curResultsContainer != null) {
            this.panel = panel;
            if (weightsStr.length > 1) {
    @Nullable
            int confirmResult = IDialogConstants.YES_ID;
            datasourceChanged = true;
        CTabItem item = new CTabItem(tabFolder, SWT.CLOSE);
            case ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED:
                    curQueryProcessor = queryProcessors.getFirst();
                return true;

                                }
        if (sqlFile == null || !sqlFile.exists()) {
                            ResultSetViewer resultSetViewer = results.getResultSetController();
            SQLQuery query = result.getStatement();
                            try {
import org.jkiss.dbeaver.DBException;
                log.error(e);

            if (!scriptMode) {
            if (monitor.isCanceled() || DBWorkbench.getPlatform().isShuttingDown()) {
                editorControl.setCursor(editorControl.getDisplay().getSystemCursor(SWT.CURSOR_APPSTARTING));
                log.error(e);
            dataSourceContainer.getPreferenceStore().addPropertyChangeListener(this);
            String queryText = query == null ? "" : query.getOriginalText();
            UIUtils.checkSashStyle(resultSetOrientation.getSashOrientation() | SWT.SMOOTH)
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        }
    public boolean checkConnected(boolean forceConnect, DBRProgressListener onFinish) {
    public boolean isSmartAutoCommit() {
    }
                saveContextVariables();
                // Execute all SQL statements consequently
    }
                        info.outputReader.readServerOutput(monitor, info.executionContext, info.result, null, outputWriter);
                });
                                    @Override
                    panelInstance = panel.createPanel();
        }

            super("Open connection to " + instance.getDataSource().getContainer().getName());
                }
            ResultSetViewer activeRS = getActiveResultSetViewer();
            for (SQLEditorListener listener : listeners) {
            if (!status.isOK()) {
                        vb.dispose();
        }
                SQLEditorAddIn addIn = addInsIterator.previous();
            null,
            return Status.OK_STATUS;

                DBWorkbench.getPlatformUI().showError("Open context", "Can't open editor connection", error);
        boolean newTab, final boolean export, final boolean checkSession,
                    // Remove connection association
                scriptPath = editorInput.getName();
            MessageDialog dialog = new MessageDialog(
            if (extraPresentationManager.activePresentation == null) {
        return isShowScriptRulerOnExecution;
import org.jkiss.dbeaver.runtime.jobs.DataSourceMonitorJob;
        });
    @Override
                int suggestionOffset = suggestionTextPainter.getCurrentPosition();
        getSite().setSelectionProvider(new DynamicSelectionProvider());
        if (logTab != null) {
            return NLS.bind(
            if (textViewer != null) {
        };
        return processSQL(newTab, script, executeFromPosition, null, null);
                        break;
                    status = null;
                addIn.init(this);
import java.util.regex.Matcher;



                return NLS.bind(ResultSetMessages.sql_editor_resultset_filter_panel_control_execute_to_see_result, execQuery, execScript);
        if (!ds.isConnected()) {
    }
            && providerExt.isNotSynchronizedException(getEditorInput(), exception)
        DBPEvent.Action eventAction = event.getAction();
            }
                }
                    item.dispose();
            outputWriter.flush();

        }
        }
        private Cursor oldCursor;

                            @Override
                    status = GeneralUtils.makeErrorStatus("Failed to create execution context after session check");
                    tabsToClose.size()
    }
        }
            true

 * you may not use this file except in compliance with the License.
        );
        final DBPWorkspaceDesktop workspace = DBPPlatformDesktop.getInstance().getWorkspace();
        if (outputViewer != null && executionContext != null) {

    private class DynamicSelectionProvider extends CompositeSelectionProvider {
        List<CTabItem> tabsToClose = new ArrayList<>();
            synchronized (serverOutputs) {
                    if (editorControl != null && !editorControl.isDisposed()) {

        for (CTabItem item : resultTabs.getItems()) {
        item.setControl(view);
        return false;
        item.setData(view);
                // Hide panel
            editorContainer = sqlExtraPanelSash;
            super(panel.getLabel(), Action.AS_CHECK_BOX);
    protected QueryResultsDecorator createQueryResultsDecorator(boolean singleQuery) {
    }
                    @Override
    }
    }
            new SQLEditorParametersProvider(site)
            }
                }
            return results;
            false
        }
            releaseExecutionContext();

                processor = ((QueryResultsContainer) item.getData()).queryProcessor;
            return isolatedExecutionContext;
                }
    @Nullable
                    scriptPath = new File(uri).getAbsolutePath();
            if (confirmResult == IDialogConstants.YES_ID) {
                .toList();
                if (!saveJob.success) {
                        manager.add(new Separator());
        resultTabs.setLayoutData(new GridData(GridData.FILL_BOTH));
            {
    private String getScriptDirectory() {
            ResultSetViewer rsv = getActiveResultSetViewer();
            ResultSetViewer rsv = curResultsContainer.getResultSetController();
            }
            if (curPresentation != null && curPresentation == newPresentation) {
        final SQLNavigatorContext context = new SQLNavigatorContext(getDataSourceContainer(), getExecutionContext());
    }
    private ScriptAutoSaveJob scriptAutoSavejob;
    public SQLEditorPresentationPanel showPresentationPanel(String panelID) {
        baseEditorImage = null;
                SQLEditorMessages.sql_editor_title_tooltip_schema,

                if (prefs != null && weights.length == 2) {
            if (isResultSetAutoFocusEnabled || !(item.getData() instanceof QueryProcessingComponent) || resultTabs.getItemCount() == 1) {
                        if (resultTabsCount - pinnedTabsCount > 1) {
                }
            return DBUtils.getDefaultContext(getDataSource(), false);
        if (dangerousQueries.isEmpty()) {
        outputViewer.setExecutionContext(isolatedExecutionContext);
                                            if (!isPinned(tab)) {
                    });

        getEditorControlWrapper().setLayoutData(new GridData(GridData.FILL_BOTH));
            if (outputReader != null && outputReader.isServerOutputEnabled()) {
        SQLDialectMetadata scriptDialect = dataSourceContainer.getScriptDialect();
            menu.insertAfter(GROUP_SQL_EXTRAS, new Separator("presentations"));
                                UIUtils.asyncExec(this::reloadSyntaxRules);
                oldCursor = editorControl.getCursor();

                Matcher matcher = EMBEDDED_BINDING_PREFIX_PATTERN.matcher(line);

                                setPartName(getEditorName());
    @NotNull
    private boolean updateDataSourceContainer() {
        final long lastUserActivityTime = DataSourceMonitorJob.getLastUserActivityTime();
            public void widgetSelected(SelectionEvent e) {
    }
                    }
            item.setData(planView);
    private static class CloseContextJob extends AbstractJob {
            SQLEditorMessages.editors_sql_execution_log_tip,
        }
            URI locationURI = root.getLocationURI();
                    break;
    }
            resultsSash.showUp();

                                    @Override
            return false;
                                executionContext
import org.jkiss.dbeaver.ui.editors.sql.execute.SQLQueryJob;
                    SQLQuery planQuery = epv.getQuery();
        public void onEndSqlJob(DBCSession session, SqlJobResult result) {
                final URI uri = iei.getURI();
    }
    public String toString() {
            this.context = context;
            }
        }
        if (resultTabs != null && !resultTabs.isDisposed()) {
                                        for (CTabItem tab : tabs) {

        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                elements = extractScriptQueries(selection.getOffset(), document.getLength(), true, false, true);
                SQLEditorMessages.sql_editor_status_bar_rollback_label,
        QueryResultsContainer container = (QueryResultsContainer) activeTab.getData();
    private CTabFolder sqlExtraPanelFolder;
                return textViewer.getSelectionProvider();
                bindingType.appendSpec(dataSourceContainer, assocSpecLine);
                    createQueryProcessor(true, isSingleQuery, false);
                if (queryProcessor != null && queryProcessor.resultContainers.size() < 2 && keepFirstTab) {
                                    }
            monitor.beginTask("Open SQLEditor isolated connection", 1);
        sqlExtraPanelToolbar.add(ActionUtils.makeCommandContribution(
            switchFocus(false);
            ResultSetViewer rsv = getActiveResultSetViewer();
                if (!CommonUtils.isEmpty(connSpec)) {
                    }
        sqlExtraPanelToolbar.createControl(sqlExtraPanelFolder);
                    UIUtils.asyncExec(() -> {
    private void showExtraView(
                    } else {
        }
                SQLEditorMessages.sql_editor_status_bar_disconnect_label,
    }
        );
            DBPDataSource dataSource = getDataSource();
                    }
        return ISaveablePart2.YES;
            }
        } else {
            }
        public boolean belongsTo(Object family) {
            }
                    sash.setWeights(weights);
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
 *
            @Override
    void showScriptPositionRuler(boolean show) {
            && ((ISaveablePart) extraPresentationManager.activePresentation).isDirty())) {

                if (!result.hasError() && !queryProcessor.resultContainers.isEmpty()) {
        setTitleImage(editorImage);
        // Create new tab
                    continue;
            if (selectedInstance != null) {
            IWorkbenchWindow window = UIUtils.findActiveWorkbenchWindow();
        if (dataSource != null && executionContextProvider == null && SQLEditorUtils.isOpenSeparateConnection(ds)
        if (SQLEditorBase.isWriteEmbeddedBinding()) {
                if (SQLEditor.this.isPartControlInitialized || finalEditorInput instanceof IncludedScriptFileEditorInput) {
    private static final String MULTIPLE_RESULTS_PER_TAB_PROPERTY = "org.jkiss.dbeaver.ui.editors.sql.multipleResultsPerTab.isEnabled";
                onFinish.onTaskFinished(Status.OK_STATUS);
                }
                currTabItem = nextTabItem;
        if (isHideQueryText()) {
            }
                                                tabs.add(container.getResultsTab());
    protected void handleExceptionOnSave(CoreException exception, IProgressMonitor progressMonitor) {
                    features |= FEATURE_DECORATE_ON_DEMAND;
                }
    }
            return;
                SaveJob saveJob = new SaveJob();
                                return;
            IResultSetController.RESULTS_CONTEXT_ID,
                if (extraPresentationManager.getActivePresentationControl().isFocusControl()) {
import org.eclipse.ui.part.FileEditorInput;
            }

                    }
                ti.dispose();
            });

        }
    }
    public void exportDataFromQuery(@Nullable SQLScriptContext sqlScriptContext) {


                }
                            }
            }
        protected IContributionItem[] getContributionItems() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        });
            if (ConfirmationDialog.confirmAction(
    }
        } else {
                if (!foundSuitableTab && (newTab || !anyNotPinnedTab)) {
        );
    private static final String SIDE_BOTTOM_TOOLBAR_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.ui.editors.sql.toolbar.side.bottom";
                if (executionContext != null) {
        final long elapsedSeconds = (currentTime - lastUserActivityTime) / 1000;
        ) {
                WorkbenchMessages.SaveableHelper_Cancel
                    }
        }
                        if (ds != null) {
            return processQueries(elements, script, newTab, false, true, queryListener, null);
                            if (CommonUtils.isEmpty(resultSetName)) {
                    extListener.onStartQuery(session, query);

                for (CTabItem tabItem : resultTabs.getItems()) {
        }
            this.instance = instance;
            final OpenContextJob job = new OpenContextJob(dsInstance, onSuccess, readDefaultsFromInstance);
        };
            }
                    if (viewer != null && viewer.getActivePresentation().getControl().isVisible()) {
    public void loadQueryPlan() {

        final IDocument document = getDocument();
            final SQLPresentationDescriptor newPresentation = (SQLPresentationDescriptor) button.getData();
            if (panel.getDescription() != null) {
            ) != IDialogConstants.YES_ID) {
        try {
        @NotNull
            };
                            }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
                                    onFinish.onTaskFinished(status);
        private Throwable error;
            QueryProcessor queryProcessor = resultsContainer.getQueryProcessor();
            }

*/
        } else {
        @Override
                ConfirmationDialog.QUESTION,
        if (resultTabs != null && !resultTabs.isDisposed()) {
            }
            }
                        if (textViewer != null) {
                // Wait until job finished
        } else {
        }
            } catch (Throwable e) {
                SQLEditorMessages.update_conflict_message_overwrite,
        };
        private final String description;
                }
                return true;
        switchPresentationExtraButtons = buttons.toArray(VerticalButton[]::new);
                }.schedule(200);
        if (varTab != null) {
            case IURIEditorInput iei -> {
                UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
                owner.runPostExecuteActions(result);
        }
            log.error("Document is null");
            DBWorkbench.getPlatform().getWorkspace().getActiveProject()
    }
                ConfirmationDialog.WARNING,
                            if (activeTabHasSingleResult) {
            }
        if (contextChanged) {
            } else if (response == 1) { // revert
        if (scriptNameResolver.get(SQLPreferenceConstants.VAR_ACTIVE_SCHEMA) != null) {
            return NLS.bind(
            script.setContents(new ByteArrayInputStream(contents), IResource.FORCE, new NullProgressMonitor());

        if (inputDataSource == null) {
            }
    public boolean processSQL(boolean newTab, boolean script, boolean executeFromPosition) {
            public void parameterChanged(ContextAction action, String name, Object value) {
        bottomBarMan = new ToolBarManager(SWT.VERTICAL | SWT.FLAT);
                if (orientation.name().equals(curPresentation)) {
                            // see #16605
        if (dsEvent || objectEvent || registryEvent) {
            if (state == Boolean.FALSE) {
    private SQLVariablesPanel variablesViewer;
        sqlExtraPanelToolbar = new ToolBarManager();
        synchronized (listeners) {
            scriptAutoSavejob = new ScriptAutoSaveJob();
            }
        this.addSashRatioSaveListener(sqlExtraPanelSash, SQLPreferenceConstants.EXTRA_PANEL_RATIO);
                            if (resultTabs.indexOf(activeTab) - pinnedTabsCount > 0) {
                            contextDefaultNames[1] = contextDefaultsDB.getDefaultSchema() != null ?
        // Notify listeners
                            owner.clearProblems(query);
        };
                    ToolItem toolItem = getViewToolItem(SQLEditorCommands.CMD_SQL_SHOW_OUTPUT);
                int[] weights = sash.getWeights();
    void dumpQueryServerOutput(@Nullable DBCExecutionResult result) {
        if (!canProcessQueries()) {
                        owner.setLastQueryErrorPosition(errorQueryOffset);
    public static class SQLEditorQueryListener implements SQLQueryListener {

                        case OBJECT_SELECT:
        return BasicSQLDialect.INSTANCE;

                DBCExecutionContextDefaults<?, ?> ctxDefault = execContext.getContextDefaults();
                DBCServerOutputReader outputReader = null;
                SQLEditorMessages.editors_sql_error_cant_execute_readonly_query_message
                    owner.updateDirtyFlag();
                dsInstance = selectedInstance;
        return true;
                return null;
            if (selectionProvider == null) {
    }
        if (getDataSourceContainer() != null
        return new SQLScriptContext(
        // - initialization accomplishment should occur after part's UI initialization which may include part activation,

                sqlFile.delete(true, monitor);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
import org.jkiss.dbeaver.model.messages.ModelMessages;

    public static class ResultSetOrientationMenuContributor extends CompoundContributionItem {
                }
            queryProcessor.getCurJobRunning().updateAndGet(i -> 0);
            }
        if (presentations.isEmpty()) {
        }

                if (oldCursor != null) {
                }
                sqlExtraPanelSash.setMaximizedControl(null);

            final byte[] contents = document.get().getBytes(ResourcesPlugin.getEncoding());
                    // If we already have useless multi-tabbed processor, but we want single-tabbed, then get rid of the useless one  
            case ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK:
                            page.hideEditor(er);
            }
                tabItem.setData(panelInstance);
            if (e.button == 2) {
            .filter(q -> q instanceof SQLQuery)
                    try {
            }

        if (removeProcessor) {
                buttons
import org.eclipse.core.resources.*;
    public boolean hasMaximizedControl() {
            var hasRunningJobs = !noQueryProcessors && curQueryProcessor.getRunningJobs() > 0;
        return super.isDirty();
            if (tabItem != null) {
            ? new MultiTabsQueryProcessor(this, singleQuery, makeDefault)
        if (textViewer != null) {
        }
            scriptPath,
        if (doConnect) {
            List<PrintWriter> addInWriters = addIns.stream()
        switchPresentationSQLButton.setText(SQLEditorMessages.editors_sql_editor_presentation);
                                            CTabItem tab = resultTabs.getItem(i);
import java.util.*;
                }
            if (savedContainer != container) {
        GridData gd = new GridData(GridData.FILL_BOTH);
                closeExtraResultTabs(curQueryProcessor, false, true);
            IMG_OUTPUT,
        }
    private ToolItem getViewToolItem(@NotNull String commandId) {
                        && !curQueryProcessor.getFirstResults().viewer.hasData()
        final long disconnectTimeoutSeconds = DataSourceMonitorJob.getDisconnectTimeoutSeconds(dataSourceContainer);
            MenuManager menuMgr = new MenuManager();
        OutputAutoShowToggleAction() {
    private boolean showDangerousQueriesStopExecutionConfirmation(
                                            }

            columnSupport.setColumnVisible(positionColumn, show);
        }
                        lines.add(k);
    }
            if (queryProcessor.isDirty() || queryProcessor.getRunningJobs() > 0) {
            setInput(input);
        presentationSwitchFolder = new VerticalFolder(sqlEditorPanel, SWT.RIGHT);
            IProgressMonitor monitor = new NullProgressMonitor();
                switchFocus(false);
                });
                                        for (int i = resultTabs.indexOf(activeTab) + 1; i < resultTabs.getItemCount(); i++) {

                            results.handleExecuteResult(result);
                            }
                                        setActiveResultsContainer((QueryResultsContainer) activeTab.getData());
                    UIUtils.asyncExec(() -> {
            }
                }
                    activeTab.getControl().setFocus();
            if (!dataSourceContainer.isConnected()) {
                synchronized (owner.runningQueries) {
                            owner.getSelectionProvider().setSelection(originalSelection);
        if (editorInput instanceof IncludedScriptFileEditorInput) {
        + SQLPreferenceConstants.VAR_FILE_NAME + "}";


    }
            if (preferenceStore.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT)) {

        // Notify listeners
                }
        );
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetProvider;
        public PresentationPanelToggleAction(SQLPresentationPanelDescriptor panel) {

        createExtraViewControls();
                    removeToggleLayoutButton();
            variablesViewer.dispose();
                            DBUtils.refreshContextDefaultsAndReflect(
import org.jkiss.dbeaver.ui.controls.*;
                }
                            );
    private void removeToggleLayoutButton() {
            setStatus(SQLEditorMessages.editors_sql_status_cant_obtain_document, DBPMessageType.ERROR);
    private ToolBarManager sqlExtraPanelToolbar;
        }
            return true;
            if (event.button != 1) {
    private DBPDataSourceContainer dataSourceContainer;
            e.printStackTrace(new PrintWriter(out, true));
                );
    };
                    status = getTransactionStatusText();
        if (res) {
                saveAsNewScript();
            presentationStack.setLayout(presentationStackLayout);
            if (isDisposed()) {
            }
                    int firstLine = document.getLineOfOffset(statementInfo.getOffset());

        }
        final long currentTime = System.currentTimeMillis();
    public boolean processSQL(boolean newTab, boolean script, SQLQueryTransformer transformer, @Nullable SQLQueryListener queryListener) {
    @Override
                                    if (activeTabHasMultipleResults) {
            resultTabs.addMouseListener(MouseListener.mouseDownAdapter(e ->

        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            if (outputReader == null && result != null) {
                                if (onFinish != null) {
    @NotNull
                }
                    }
import org.eclipse.ui.menus.IMenuService;
    public void toggleMultipleResultsPerTab() {
                getSite().setSelectionProvider(new DynamicSelectionProvider());

            } finally {
                }

        }
                        planView = pv;
        sqlExtraPanelFolder = new CTabFolder(sqlExtraPanelSash, SWT.TOP | SWT.CLOSE | SWT.FLAT);
            maxPlanNumber++;
                                    }
    /////////////////////////////////////////////////////////////
    }
        if (tabItem != null && tabItem.getShowClose()) {
    private CTabItem activeResultsTab;
        DETACHED(
                new AbstractJob("Save variables") {

        protected IStatus run(@NotNull DBRProgressMonitor monitor) {

            if (tab.getData() instanceof SingleTabQueryProcessor stqp) {
                    public void run() {
            outputViewer.resetNewOutput();
            // Try to get datasource from contents (always, no matter what )
                    final DBPDataSource dataSource = executionContext.getDataSource();

            setResultTabSelection(item);
                    }
            case ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK:
                }
            super("Close context " + context.getContextName());
                    updateExecutionContext(() -> UIUtils.syncExec(() ->
                return;
            } finally {
            return Status.OK_STATUS;
    public boolean validateEditorInputState() {
        private long lastUIUpdateTime;
        try {
            currentOutputViewer.resetNewOutput();
                SQLPresentationDescriptor pd = entry.getKey();
        }
        CSSUtils.markConnectionTypeColor(resultTabs);
            editorContainer = presentationStack;
            }
        if (project == null || document == null || document.getNumberOfLines() == 0) {
                lastUIUpdateTime = -1;
                }
                public void flush() {
                    rsv.setStatus(ModelMessages.error_not_connected_to_database);
            return null;
        private IFindReplaceTarget previousTarget = null;
            = SQLPreferenceConstants.EmptyScriptCloseBehavior.getByName(
import org.eclipse.core.filesystem.IFileStore;
            !export && getActivePreferenceStore().getBoolean(SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR),
        }
        } else {
    }

                    @NotNull

            }
        if (inputDataSource == null) {
        DBSInstance dsInstance = dataSource.getDefaultInstance();

    /**
        setPartName(getEditorName());
        if (planView != null) {
        if (getFolderForExtraPanels() != sqlExtraPanelFolder) {
                    file.create(new ByteArrayInputStream(new byte[] {}), true, new NullProgressMonitor());
            }
                }
                    setResultTabSelection(tabItem);
            try {
    @NotNull
import org.eclipse.ui.internal.WorkbenchMessages;
     */
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLEditorCompletionContext;
            if (!outputs.isEmpty()) {
                if (scriptMode || !queryProcessor.getResultContainers().isEmpty()) {
        UIUtils.createEmptyLabel(presentationSwitchFolder, 1, 1).setLayoutData(new GridData(GridData.FILL_VERTICAL));
        @NotNull String toolTip,
                this::createDangerousUpdateDeleteQueryConfirmationDialog
        this.globalScriptContext.addListener(new DBCScriptContextListener() {
                return;
                String[] contextDefaultNames = null;
    private static final String PANEL_ITEM_PREFIX = "SQLPanelToggle:";
            tmpImage = editorImage;
        ) {
                    DBPDataSourceContainer container = dataSource.getContainer();
        }

    }
            }
                resultTabsReorder.swapTabs(currTabItem, nextTabItem);
                    maxPlanNumber = Math.max(maxPlanNumber, ((ExplainPlanViewer) item.getData()).getPlanNumber());

            return dialogCreator.apply(dangerousQueries.getFirst(), ConfirmationDialog.CONFIRM) != IDialogConstants.OK_ID;
    protected boolean isHideQueryText() {
                                manager.add(new Action(SQLEditorMessages.action_result_tabs_close_tabs_to_the_left) {
            showResultsPanel(false);
        if (executionContext != null) {
                listener.beforeQueryPlanExplain();
                        );
        // Notify listeners
        // Redraw toolbar to refresh action sets
            }
            if (resultsSash.getMaximizedControl() == null) {
            log.warn(String.format("Can't create sql dialect for %s:%s", scriptDialect.getId(), scriptDialect.getLabel()));
                elements = Collections.singletonList(sqlQuery);
     */
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
                    for (IEditorReference er : page.getEditorReferences()) {
        }
            case SQLPreferenceConstants.RESULT_SET_ORIENTATION:

        tabName += " " + (queryIndex + 1);
        if (scriptNameResolver.get(SQLPreferenceConstants.VAR_ACTIVE_DATABASE) != null) {
    }
        for (SQLQuery query : dangerousQueries) {
            dataSourceContainer,
                        serviceConnections.closeActiveTransaction(monitor, context, false);
        @Override
        ResultSetOrientation(int sashOrientation, String label, String description, boolean supported) {
        synchronized (runningQueries) {

        protected ConnectVisualizer() {
        IEditorInput input = getEditorInput();
        queryProcessors.clear();
            }
            // Patch connection reference
            public String getEmptyDataDescription() {

            for (SQLEditorListener listener : listeners) {
                manager.add(ActionUtils.makeCommandContribution(getSite(), SQLEditorCommands.CMD_SQL_EDITOR_MAXIMIZE_PANEL));
                }
        releaseContainer();
            queries,
                        if (isPinned && pinnedTabsCount > 1) {
        IDocument document = getDocument();
                        if (item.getData() instanceof QueryProcessingComponent) {
            // Close context in separate job (otherwise it can block UI)
/**
                    if (selectionProvider != null) {
        if (dataSourceContainer == null) {
    public void doSave(IProgressMonitor monitor) {

            return Status.OK_STATUS;
        });
    @Override
        }
                }
    }
                    for (QueryResultsContainer resultsProvider : queryProcessor.getResultContainers()) {
            if (dataSource != null) {
            DBWorkbench.getPlatformUI().showError("Execution plan", "Execution plan explain isn't supported by current datasource");
            SQLEditorMessages.editors_sql_output,
        }
    public boolean setDataSourceContainer(@Nullable DBPDataSourceContainer container) {
        private int tickCount;
            if (onFinish != null) {
        });
    static final Image IMG_DATA_GRID = DBeaverIcons.getImage(UIIcon.SQL_PAGE_DATA_GRID);
                    panelButton.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_END));
                CTabItem item = resultTabs.getItem(new Point(e.x, e.y));
            menuMgr.addMenuListener(manager -> {
        } catch (Exception e) {
        int tabIndex = 0;
                                resultSetViewer.getModel().setStatistics(statistics);
        if (menuService != null) {
        }
                            topOffset = textViewer.getTopIndexStartOffset();
                return false;
            boolean focusInEditor = textViewer != null && textViewer.getTextWidget() != null && textViewer.getTextWidget().isFocusControl();
{
                    );
        final DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
        @NotNull

        // - when editorInput's datasource is already specified and updateDataSourceContainer() just actualizes editor's internal state,

            };
                    curResultsContainer = curQueryProcessor.getFirstResults();
    private QueryProcessor createQueryProcessor(boolean setSelection, boolean singleQuery, boolean makeDefault) {
                    }
        curDataSource = null;
                    if (dataSource != null) {
    private boolean isResultSetAutoFocusEnabled = true;
                            // This happens when query results is statistics tab
                    if (owner.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE)
        }
            }
                toggleEditorMaximize();
    public String getTitleToolTip() {
        DBPProject activeProject = workspace.getActiveProject();
            }
    }
    }
                                                tabs.add(tab);
            try {
                    if (pv.getQuery() != null && pv.getQuery().equals(sqlQuery)) {
    private void createExtraViewControls() {
                getActivePreferenceStore().save();
            switchFocus(true);
        if (extraPresentationManager.activePresentationDescriptor == presentation || presentationStack == null) {
            menuService.populateContributionManager(topBarMan, SIDE_TOP_TOOLBAR_CONTRIBUTION_ID);
        if (isHideQueryText()) {

        if (emptyScriptCloseBehavior == SQLPreferenceConstants.EmptyScriptCloseBehavior.NOTHING) {
            // Beep
    public String getExtraPanelsLocation() {
    String getResultsTabName(int resultSetNumber, int queryIndex, String name) {


                    return;
            resultsSash.setOrientation(resultSetOrientation.getSashOrientation());
        final boolean isTransactionInProgress = txnManager != null
            }
            {
                tabItem.setText(panel.getLabel());
        releaseContainer();
            case IFileEditorInput fei -> scriptPath = fei.getFile().getFullPath().toString();
        }
                if (extListener != null) {
        }
                }

        // Connect to datasource
            try (DBCSession session = getExecutionContext().openSession(monitor, DBCExecutionPurpose.UTIL, "Prepare plan query")) {

                assocSpecLine.append(GeneralUtils.getDefaultLineSeparator());
     */
    }
            .map(q -> (SQLQuery) q)
                UIUtils.runUIJob("Process SQL query result", monitor -> {
            return curResultsContainer.getResultSetController();
        );
    }
                                owner.setResultTabSelection(results.getResultsTab());
                                    }
                                        final List<CTabItem> tabs = new ArrayList<>();
        }
        if (outputItem != null && outputItem != resultTabs.getSelection()) {
        sqlExtraPanelToolbar.update(true);
        // if we select several queries and press Run, they're intentionally goes into one SQLQuery
    public void setFocus() {
    }
            .stream()
        }
    private void createToggleLayoutButton() {
            try {
            );
            var noQueryProcessors = queryProcessors.isEmpty();
        TextViewer textViewer = getTextViewer();
            return;
                boolean foundSuitableTab = false;
        // End transaction
        outputViewer = new SQLEditorOutputViewer(getSite(), folder, SWT.LEFT);
    private static volatile TransactionStatusUpdateJob transactionStatusUpdateJob;
import org.jkiss.dbeaver.runtime.ui.UIServiceSystemAgent;
                SQLPreferenceConstants.CONFIRM_RUNNING_QUERY_CLOSE,
        public void onEndQuery(final DBCSession session, final SQLQueryResult result, DBCStatistics statistics) {
                scriptName = getEditorInput().getName();
            }
            SQLEditorOutputViewer currentOutputViewer = outputViewer;
                            ) {
                    QueryResultsContainer results = queryProcessor.getFirstResults();
            tabName += " (" + (resultSetNumber + 1) + ")";
    public boolean isEditable() {
        boolean doConnect = dataSourceContainer != null &&

                    @Override
        return queries
                    resultsSash.setMaximizedControl(null);
            }
     * Return true if there is an active tab, and its container is pinned

    @NotNull
import java.net.URI;

                            }
    }
        }
                }
            setId(PANEL_ITEM_PREFIX + panel.getId());
        }
    ) {
                return new File(locationURI).toString();
                            continue;
                qrc.setResultsTab(item);
    }
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
                        }
        public void onEndScript(final DBCStatistics statistics, final boolean hasErrors) {
        }
                    UIUtils.asyncExec(() -> {

import org.jkiss.dbeaver.model.*;
                                    }
            }
        IFile sqlFile = EditorUtils.getFileFromInput(editorInput);
                                    if (activeTabHasSingleResult) {
        if (outputViewer != null) {

    public void toggleExtraPanelsLayout() {
        } else {
        if (isHideQueryText()) {

    }

        final String[] planQueryString = new String[1];
                                );
                viewItem.setSelection(false);
                ) {
        // Notify listeners
            queryProcessor.cancelJob();
                e.doit = false;
                                        final QueryProcessor processor = ((QueryResultsContainer) activeTab.getData()).queryProcessor;
        CTabItem outTab = getExtraViewTab(outputViewer);
        panelsLayout.marginTop = 1;
        }
        return resultTabs;
                    accomplishEditorInputInitialization(finalEditorInput);
                }
        }
        sqlExtraPanelSash.setMaximizedControl(sqlExtraPanelSash.getChildren()[0]);
                .getString(SQLPreferenceConstants.RESULT_SET_ORIENTATION));
                    });
    }
    }
import java.util.regex.Pattern;
    private class ServerOutputReader extends AbstractJob {
                                        }
    }
    }
        }
            }
        if (executionContextProvider != null) {
                } else {
                // Restore cur data source (as it is reset in releaseExecutionContext)
        }

    @Override
        this.isPartControlInitialized = true;
            if (editorControl != null) {
     * Obtain the add-in instance by its concrete type
            explainPlanFromQuery(planner, sqlQuery);
    private void updateResultSetOrientation() {
                return;
    private SQLLogPanel logViewer;
        return null;


                try {
            public void setBackground(Color color) {
                }
                }
            int dialogResult = dialogCreator.apply(query, ConfirmationDialog.CONFIRM_WITH_YES_TO_ALL);
            final VerticalButton button = (VerticalButton) e.item;
        for (VerticalButton vButton : presentationSwitchFolder.getItems()) {
    private CTabFolder resultTabs;
            if (contributionItem instanceof ActionContributionItem) {
        createExtraViewControls();
    }
            schedule(UPDATE_DELAY_MS);
    }
    public DBPProject getProject() {
            if (sqlFile.exists()) {
            if (EditorUtils.isInAutoSaveJob()) {
            if (query != null) {
    private void fireDataSourceChange() {
                    }
    public void beforeConnect() {
    public boolean isDirty() {
                    for (PrintWriter writer : addInWriters) {
            inputDataSource = getDataSourceFromContent();
            ConfirmationDialog.WARNING,
        try {
        }
package org.jkiss.dbeaver.ui.editors.sql;

import org.eclipse.jface.text.source.SourceViewer;
                        return selectionProvider;
        SQLEditorFeatures.SQL_EDITOR_OPEN.use(
            SQLEditorMessages.editors_sql_variables,
        UIExecutionQueue.queueExec(this::onDataSourceChange);
        @Override
                                        for (int i = 0, last = resultTabs.indexOf(activeTab); i < last; i++) {
                    previousTarget = rsv.getAdapter(IFindReplaceTarget.class);
            return;
                    for (QueryProcessor processor : queryProcessors) {


                        preferenceStore.setValue(SQLPreferenceConstants.RESULT_SET_ORIENTATION, orientation.name());
                        if (queryJob != null) {
            return previousTarget;
        if (!EditorUtils.isInAutoSaveJob()) {

            return Status.OK_STATUS;
        if (!makeDefault) {
    }
        CSSUtils.markConnectionTypeColor(bottomBar);
                ResultSetViewer viewer = getActiveResultSetViewer();
                return concreteAddIn;
        new ServerOutputReader().schedule();

            getSite().getShell(),
            SQLEditor.this,
            List<IContributionItem> items = new ArrayList<>(orientations.length);

                releaseExecutionContext();
                                contextDefaults,
        if (provider instanceof IDocumentProviderExtension5 providerExt
        ITextSelection selection = (ITextSelection) getSelectionProvider().getSelection();
        UIUtils.syncExec(() -> {
                NavigatorResources.refreshNavigatorResource(dataSourceContainer.getProject(), file, container);
    protected void doSetInput(IEditorInput editorInput) throws CoreException {
