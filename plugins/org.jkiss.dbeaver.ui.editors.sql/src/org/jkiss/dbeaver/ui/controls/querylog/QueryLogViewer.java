            QMMStatementExecuteInfo exec = i.next();
        createContextMenu();
    };
            projectName = session.getProjectInfo() == null ? null : session.getProjectInfo().getId();
        }
        }
                }
            manager.add(selectAllAction);
                public boolean isChecked() {
                if (dsContainer == null) {

                    return criteria.hasQueryType(purpose);
        @Override
            }

            manager.add(new Separator());
                        if (monitor.isCanceled()) {
            if (!exec.isClosed() || exec.isFetching()) {
                    if (exec.hasError()) {
    private final IWorkbenchPartSite site;
                String queryString = stmtExec.getQueryString();
            SQLEditorHandlerOpenEditor.openSQLConsole(
                    scheduleLogRefresh();

                contextName = object.getConnection().getContextName();
        private boolean isQueryLinkedWithEditor(QMMStatementExecuteInfo execInfo) {
        int colIndex = 0;

            return events;



        private final String id;
            public void dragSetData(DragSourceEvent event) {
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            ColumnDescriptor cd = columns.get(i);
        dndSource.setTransfer(types);
                }
                loadingService,
        } finally {
            gd = new GridData(GridData.FILL_HORIZONTAL);
            return ""; //$NON-NLS-1$

                        .createLabelText(container, schemaTerm, schemaName, SWT.BORDER | SWT.READ_ONLY, new GridData(GridData.FILL_HORIZONTAL))
        @Nullable
            tableColumn.dispose();
                @Override
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.Log;

            return;

            return Comparator.comparingLong(e -> e.getObject().getDuration());
                public void run() {
        if (CommonUtils.isEmpty(projectName)) {
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
            String resultMessage = COLUMN_RESULT.getText(object, true);
            QMEvent event = (QMEvent) item.getData();
        }
    private static final LogColumn COLUMN_RESULT = new LogColumn("result", ModelMessages.controls_querylog_column_result_name, ModelMessages.controls_querylog_column_result_tooltip, 120) { //$NON-NLS-1$
                        catalogTerm = dataSource.getInfo().getCatalogTerm();

                    queryString = queryString.trim();
                        }
import java.lang.reflect.InvocationTargetException;
    }

                manager.add(editorAction);
import org.eclipse.core.runtime.Status;
        StringBuilder sql = new StringBuilder();
        DBPDataSourceContainer dsContainer = null;

                }
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                } else {
import org.eclipse.swt.graphics.Font;
            @Override
        private SQLDialect getSqlDialectFromContainer(DBPDataSourceContainer container) {
    private class LogRefreshJob extends AbstractUIJob {

        UIUtils.asyncExec(() -> updateMetaInfo(events));
                return column.getToolTipText((QMEvent) item.getData());
                // Apply sort (if any)
import org.eclipse.swt.events.SelectionAdapter;
                return "?"; //$NON-NLS-1$
 */
            TableColumnSortListener sorter = comparator != null
        try {
        dialog.open();
        for (TableItem item : items) {
            if (dataSource != null) {
                UIUtils.getActiveWorkbenchWindow(),
        for (Iterator<QMMStatementExecuteInfo> i = savepoint.getExecutions(); i.hasNext(); ) {
    private final List<ColumnDescriptor> columns = new ArrayList<>();
            final TableColumn tableColumn = UIUtils.createTableColumn(logTable, SWT.NONE, logColumn.title);
            if (object instanceof QMMStatementInfo) {
                        RuntimeUtils.pause(WAITING_QM_SESSION_SECONDS_PER_TRY * 1000);
        protected SQLDialect getSQLDialect() {
            }
import org.eclipse.swt.layout.GridLayout;
            tableColumn.addListener(SWT.Resize, event -> {
        @Override
import org.jkiss.dbeaver.model.qm.meta.*;
        for (DBCExecutionPurpose purpose : DBCExecutionPurpose.values()) {
        protected void createButtonsForButtonBar(@NotNull Composite parent) {
                        sql.append(SQLConstants.DEFAULT_STATEMENT_DELIMITER).append("\n"); //$NON-NLS-1$
                statement = (QMMStatementInfo) object;
        Comparator<QMEvent> getComparator() {
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(this);
            TableItem item = objectToItemMap.get(exec.getObjectId());
                }
        this.searchText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        }
                    Composite container = CompositeFactory.newComposite(SWT.NONE)
                        for (QMMTransactionSavepointInfo savepoint = ((QMMTransactionInfo) object).getCurrentSavepoint(); savepoint != null; savepoint = savepoint.getPrevious()) {
    }
        }

                String text = CommonUtils.notEmpty(statement.getQueryString());
                }
        }
                return null;
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    private Color getObjectForeground(QMEvent event) {

        }
            if (hasStatements) {
        @Override
                            Event event = new Event();


    public synchronized void preferenceChange(PreferenceChangeEvent event) {
        QMEventCriteria criteria = QMUtils.createDefaultCriteria(store);
                    TableItem tableItem = logTable.getItem(entriesPerPage + i);
                containerName = ((QMMConnectionInfo) object).getContainerName();
    }
                    } else {
 *

            };
                @Override
                    for (DBCExecutionPurpose queryType : queryTypes) typeNames.add(queryType.name());
            }

                monitor.beginTask("Load query history", 1); //$NON-NLS-1$
                }
            this.logColumn = logColumn;
        addDragAndDropSupport();
                    text = CommonUtils.truncateString(text, 4000);
        String getToolTipText(QMEvent event) {
            } else if (object instanceof QMMStatementExecuteInfo) {
                && ((SQLLogFilter) filter).getEditor() != null;
                    QMEventAction action = qmEvent.getAction();
        }
public class QueryLogViewer extends Viewer implements QMMetaListener, DBPPreferenceListener {
        for (TableColumn tableColumn : logTable.getColumns()) {
            } else {
        @Override
            boolean hasStatements = false;
import org.eclipse.jface.dialogs.IDialogConstants;
        criteria.setFetchingSize(entriesPerPage);
        COLUMN_ROWS,
            manager.add(toggleAction);
            if (item != null && !item.isDisposed()) {
        @Override
        return DBUtils.findDataSource(projectName, containerId);
import java.util.List;
        }
    }
                    return ModelMessages.controls_querylog_rollback;
                    dsContainer = getDataSourceContainer(stmtExec);
 * QueryLogViewer
                    qmSessionId,
            final Label messageLabel = UIUtils.createControlLabel(topFrame, ModelMessages.controls_querylog_label_text);
                        for (Listener listener : sortListeners) {
                    reloadEvents(criteria);
        private LogColumn(String id, String title, String toolTip, int widthHint) {
            return containerName == null ? "?" : containerName; //$NON-NLS-1$
    }
        }
        private final DateFormat timeFormat = new SimpleDateFormat("MMM-dd HH:mm:ss", Locale.getDefault()); //$NON-NLS-1$
import org.eclipse.ui.menus.CommandContributionItem;
                    indexes[i] = entriesPerPage + i;
            if (isMultilineResult) {
            if (object.getObject() instanceof QMMStatementExecuteInfo executeInfo) {
    private synchronized void updateMetaInfo(final List<? extends QMEvent> events) {
            } else if (object instanceof QMMStatementExecuteInfo) {


 * You may obtain a copy of the License at
                        // Ignore empty statements
            this.widthHint = widthHint;
import org.jkiss.dbeaver.utils.GeneralUtils;
        

                        tries++;
        logRefreshJob.cancel();
    @Override
                monitor.done();
        menuMgr.setRemoveAllWhenShown(true);

        logTable.remove(selectionIndices);

    };
                dialogSettings.put("column-" + logColumn.id, String.valueOf(width)); //$NON-NLS-1$

                        } else if (exec.getErrorMessage() == null) {
            } else if (object instanceof QMMTransactionInfo) {
        item.setData(event);
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;

            return "SQL" + (statement == null ? "" : " / " + CommonUtils.capitalizeWord(statement.getPurpose().getTitle())); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
 */
                return null;
                @Override
            var dataSource = container.getDataSource();
                contextName = ((QMMStatementExecuteInfo) object).getStatement().getConnection().getContextName();

            };

import org.jkiss.dbeaver.model.qm.*;
        dndSource.addDragListener(new DragSourceListener() {
            }
            return (purpose == DBCExecutionPurpose.USER_SCRIPT || purpose == DBCExecutionPurpose.USER)
                    containerFullName += " <" + instanceId + ">";
            final Text resultText = new Text(

        site.registerContextMenu(menuMgr, this);
        }
            }
        });
            return COLUMN_TEXT.getText(object, false);
                logTable.remove(indexes);
    private QMEventCriteria criteria;
            if (exec.hasError()) {
import org.jkiss.dbeaver.model.sql.SQLDialect;
        private static final int RETRIES_QM_WAITING = 60;
    public void selectAll() {
        }
                    // Update all dependent statements

                String text = COLUMN_TEXT.getText(item, true);
                }
            QMMStatementExecuteInfo exec = (QMMStatementExecuteInfo) event.getObject();
        columns.clear();
            //gd.heightHint = 40;

    public void refresh() {
                }

            }

            if (object.getObject() instanceof QMMStatementExecuteInfo qmmStatementExecuteInfo) {
    class EventHistoryReadService extends AbstractLoadService<List<QMEvent>> {

        @Override
                        }
        // Many properties could be changed at once
                    selectAll();
        }
        } else if (object instanceof QMMStatementInfo || object instanceof QMMStatementExecuteInfo) {
            manager.add(copyAction);
            }
    }
    public QueryLogViewer(Composite parent, IWorkbenchPartSite site, QMEventFilter filter, boolean showConnection, boolean currentSessionOnly) {
            createFiltersMenu(manager);
                for (int i = 0; i < itemCount - entriesPerPage; i++) {
                );
            deleteSelectionAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_DELETE);
        @Override
                        tdt.append('\t');
                continue;
    public void setInput(Object input) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
            final List<QMEvent> events = new ArrayList<>();
                }
    }
            }
    private final LogColumn COLUMN_TIME = new LogColumn("time", ModelMessages.controls_querylog_column_time_name, ModelMessages.controls_querylog_column_time_tooltip, 80) { //$NON-NLS-1$
        }

        ColumnDescriptor(LogColumn logColumn, TableColumn tableColumn) {

            }

import org.jkiss.dbeaver.model.qm.filters.QMEventCriteria;
 *


        protected Composite createDialogArea(Composite parent) {
import org.eclipse.swt.widgets.*;
    private static final LogColumn COLUMN_ROWS = new LogColumn("rows", ModelMessages.controls_querylog_column_rows_name, ModelMessages.controls_querylog_column_rows_tooltip, 120) { //$NON-NLS-1$

                    tdt.append(text);
    @Override
        manager.add(new Separator());

        }
        private final String title;
        String getText(QMEvent event, boolean briefInfo) {
            item = new TableItem(logTable, SWT.NONE, itemIndex++);

    }
        }
        Comparator<QMEvent> getComparator() {
            logTable.selectAll();
            reloadInProgress = true;
            gd.widthHint = 500;
        @Override
                }
            if (object instanceof QMMStatementExecuteInfo statement) {
        if (!logTable.isDisposed()) {
                String contextName = conInfo.getContextName();

                    if (i1 > 0) {
    private QMEventFilter defaultFilter = new DefaultEventFilter();
                    case BEGIN -> ModelMessages.controls_querylog_connected_to + containerFullName + "\""; //$NON-NLS-1$
                        return ModelMessages.controls_querylog_success;
            copyAction.setEnabled(logTable.getSelectionCount() > 0);
            IAction deleteSelectionAction = new Action(ModelMessages.controls_querylog_action_delete) {
    private static final LogColumn COLUMN_TYPE = new LogColumn("type", ModelMessages.controls_querylog_column_type_name, ModelMessages.controls_querylog_column_type_tooltip, 100) { //$NON-NLS-1$
            if (object instanceof QMMConnectionInfo) {
        if (criteria == null) {
        return null;
        this.searchText.addModifyListener(e -> scheduleLogRefresh());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        menuMgr.addMenuListener(manager -> {
        // So here we just schedule single refresh job
                    List<String> typeNames = new ArrayList<>(queryTypes.length);

                    break;
    private static class ColumnDescriptor {
                new SQLNavigatorContext(dsContainer),
            int itemIndex = 0;
                    } else if (fetchRowCount <= 0) {
        }
                showEventDetails((QMEvent) e.item.getData());
    }
            try {
                public void run() {
        }
                var cursorFilter = new QMCursorFilter(
        //logTable.setLinesVisible(true);
            if (object.isClosed()) {
                    copySelectionToClipboard(false);
            String containerName = null;
                    ColumnDescriptor cd = columns.get(i1);
        if (item == null) {
/*
                return BaseThemeSettings.instance.treeAndTableFontBold;
    private DBPDataSourceContainer getDataSourceContainer(QMMStatementExecuteInfo stmtExec) {
            };
    @Override
            composite.setLayout(new GridLayout(1, false));
            QMMObject object = event.getObject();
                if (catalogTerm == null) {
        }
                messageText.setText(COLUMN_TEXT.getText(object, true));
        DBWorkbench.getPlatformUI();
        @Nullable
                public void run() {
        this.useDefaultFilter = useDefaultFilter;
        EventViewDialog dialog = new EventViewDialog(event);
        String getText(QMEvent event, boolean briefInfo) {
        }
            selectAllAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_SELECT_ALL);
            data[i] = (QMEvent) items[i].getData();
            setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.MAX | SWT.RESIZE);
            return;
        // Create log table
            super(ModelMessages.controls_querylog_job_refresh);
                savepoint = (QMMTransactionSavepointInfo) event.getObject();
            } else {
import org.eclipse.ui.IWorkbenchPartSite;
 * Unless required by applicable law or agreed to in writing, software
            if (extraInfo) {
            tableColumn.addListener(SWT.Selection, sorter);
            }
    }
    public Table getControl() {
        @Override
            }
                final Text messageText = new Text(topFrame, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
                    }
    public void setUseDefaultFilter(boolean useDefaultFilter) {

        logTable.setData(this);
                var container = getDataSourceContainer(executeInfo);
            if (object instanceof QMMStatementExecuteInfo exec) {
            QMEventBrowser eventBrowser = QMUtils.getEventBrowser(currentSessionOnly);
                    return ModelMessages.controls_querylog_rollback;
            if (object instanceof QMMStatementExecuteInfo stmtExec) {
            this.object = object;
    }
        protected EventHistoryReadService(@NotNull QMEventCriteria criteria) {
    private LogRefreshJob logRefreshJob = null;
            }
                if (object instanceof QMMStatementExecuteInfo) {
        public void visualizeLoading() {
            QMMObject object = event.getObject();
            public void handleEvent(Event event) {
                containerName = object.getConnection().getContainerName();
                        continue;
            }
            if (exec.hasError()) {
            public void widgetDefaultSelected(SelectionEvent e) {
import org.jkiss.dbeaver.runtime.qm.DefaultEventFilter;
            };
            return;
        this.filter = filter;
            public void dragFinished(DragSourceEvent event) {
        }

        if (object instanceof QMMConnectionInfo) {
                        if (exec.getErrorCode() == 0) {
            if (itemCount > entriesPerPage) {
    }
            scheduleLogRefresh();
                    event.data = tdt;
                    }
        logTable.setRedraw(false);

                    if (!sql.isEmpty()) {
                return QueryLogThemeSettings.instance.colorReverted;
                }

            refresh();
        }
                logTable.removeListener(SWT.Resize, this);
import org.eclipse.core.runtime.IStatus;
                SWT.BORDER | SWT.READ_ONLY | (isMultilineResult ?
        clearLog();
                QMMObject object = qmEvent.getObject();
                } else {
    private final LongKeyMap<TableItem> objectToItemMap = new LongKeyMap<>();

                tdt.append(GeneralUtils.getDefaultLineSeparator());
            criteria = QMUtils.createDefaultCriteria(DBWorkbench.getPlatform().getPreferenceStore());
        }
                return RuntimeUtils.formatExecutionTime(object.getDuration());

                            return "[" + exec.getErrorCode() + "] " + exec.getErrorMessage(); //$NON-NLS-1$ //$NON-NLS-2$
import org.jkiss.utils.LongKeyMap;
                } else if (object instanceof QMMConnectionInfo) {
            if (contextName == null) {
import org.eclipse.swt.events.SelectionEvent;
    }
        });
                if (!reloadInProgress) {
        StringBuilder tdt = new StringBuilder();
            manager.add(clearLogAction);

import org.jkiss.code.Nullable;
                if (!CommonUtils.isEmptyTrimmed(queryString)) {

                }
                }
            log.debug("Event reload is in progress. Skip"); //$NON-NLS-1$
            final String colWidth = dialogSettings.get("column-" + logColumn.id); //$NON-NLS-1$
        }
        boolean inDialog = UIUtils.isInDialog(parent);
    }
                    } else {
            manager.add(deleteSelectionAction);

 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
import org.jkiss.dbeaver.DBException;
            this.tableColumn = tableColumn;
        return null;
                @Override
        Comparator<QMEvent> getComparator() {
            QMMObject object = event.getObject();
    };
                if (((QMEvent) item.getData()).getObject() instanceof QMMStatementExecuteInfo) {
    private int createOrUpdateItem(QMEvent event, int itemIndex) {
        @Override
import org.jkiss.dbeaver.model.connection.DBPDriver;
        String getText(QMEvent event, boolean briefInfo) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            });
import org.eclipse.swt.dnd.*;
    };

        logTable.removeAll();
            }
            }
    };

        this.defaultFilter = new DefaultEventFilter();
    public void setFilter(QMEventFilter filter) {
                tdt.append(text);
        protected IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
                    if (dataSource != null) {
                reloadInProgress = false;
            if (object.getObject() instanceof QMMStatementExecuteInfo info) {
        item.setFont(getObjectFont(event));

        final IDialogSettings dialogSettings = UIUtils.getDialogSettings(VIEWER_ID);
    };
            } else if (object instanceof QMMTransactionSavepointInfo) {
        return null;
        String getText(QMEvent event, boolean briefInfo) {
            } else {
                }
                if (useDefaultFilter && itemIndex >= entriesPerPage) {
        }
            for (QMEvent qmEvent : events) {
        private static final int WAITING_QM_SESSION_SECONDS_PER_TRY = 1;

                        return fetchRowCount + "/" + updateRowCount;

            }
                savepoint = ((QMMTransactionInfo) event.getObject()).getCurrentSavepoint();
                if (result != null) {
            if (eventBrowser != null) {
                } else {
            return;
        String getToolTipText(QMEvent event) {
import org.eclipse.swt.SWT;
                }
        logTable.setLayoutData(gd);
            }
                }
        EventHistoryReadService loadingService = new EventHistoryReadService(criteria);
    private final Text searchText;

            this.id = id;
                super.buttonPressed(buttonId);

            return super.getSQLDialect();
        }
    }
        if (reloadInProgress) {
            QMEvent item = (QMEvent) o;
import org.eclipse.jface.viewers.ISelection;
                if (exec.isClosed() && !exec.isFetching()) {
                }
        @Override
                final SQLEditor editor = ((SQLLogFilter) filter).getEditor();
        private final QMEventCriteria criteria;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

        protected boolean isLabelVisible() {
import org.jkiss.dbeaver.model.sql.SQLQuery;
import org.jkiss.dbeaver.ui.editors.sql.log.SQLLogFilter;
            resultLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                LogColumn column = (LogColumn) logTable.getColumn(selectedColumn).getData();
                @Override
            if (event.getObject() instanceof QMMTransactionInfo) {
        DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(this);
        @Override
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        }
    private final LogColumn[] ALL_COLUMNS = new LogColumn[]{
            return contextName;
            } else {
        }
                        }
        COLUMN_TEXT,
                            return ModelMessages.controls_querylog_error + exec.getErrorCode() + "]"; //$NON-NLS-1$
        COLUMN_TYPE,
                    while (qmSessionId == null && tries < RETRIES_QM_WAITING) {
        }
        criteria.setSearchString(CommonUtils.nullIfEmpty(searchText.getText().trim()));
                            return exec.getErrorMessage();
                    return ModelMessages.controls_querylog_commit;

                return colorGray;
        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
        }
        for (Object o : selection) {

                public boolean isChecked() {

            return QueryLogViewer.class;
            final ColumnDescriptor cd = new ColumnDescriptor(logColumn, tableColumn);
                }
                    sql.append(queryString);
                    return;
            topFrame.setLayoutData(new GridData(GridData.FILL_BOTH));
            } else if (object instanceof QMMStatementInfo) {
                manager.add(new Separator());
        }
                public void run() {
                    itemIndex = createOrUpdateItem(qmEvent, itemIndex);
    private static abstract class LogColumn {

    }
    }
            return ""; //$NON-NLS-1$
            }
                contextName = ((QMMConnectionInfo) object).getContextName();
        }
        logTable.setHeaderVisible(true);
                    if (isChecked()) {
                    return ModelMessages.controls_querylog_commit;
 *
import org.eclipse.swt.graphics.Color;
        if (CommonUtils.isEmpty(tdt)) {
            }
        }
    private void createColumns(boolean showConnection) {
    }
        int[] selectionIndices = logTable.getSelectionIndices();
                        .setToolTipText(ModelMessages.controls_querylog_column_schema_tip);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
                }
        this.filter = filter;
    }

        if (getObjectBackground(event) != null) {
        QMMConnectionInfo session = stmtExec.getStatement().getConnection();
            super.configureShell(shell);
        abstract String getText(QMEvent event, boolean briefInfo);
        @Nullable
                if (getSqlDialectFromContainer(container) != null) {
            IAction toggleAction = new Action(type.getTitle(), Action.AS_CHECK_BOX) {
                        ModelMessages.controls_querylog_disconnected_from + containerFullName + "\""; //$NON-NLS-1$
            final Label resultLabel = UIUtils.createControlLabel(topFrame, ModelMessages.controls_querylog_label_result);
            }
        @Override
        }
        UIUtils.dispose(logTable);
        private final DateFormat timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()); //$NON-NLS-1$
        this.criteria = criteria;
                    DBPDataSource dataSource = ds.getDataSource();
                }
            item.setText(i, CommonUtils.getSingleLineString(cd.logColumn.getText(event, true)));
                } else {
                    hasStatements = true;
                }
            return ""; //$NON-NLS-1$
//        } else if (object instanceof QMMStatementScripInfo) {
        protected boolean isWordWrap() {
    private final Table logTable;
/**
    private String getSelectedText(boolean extraInfo) {
                    }
    }
                sql.toString()
                if (DBWorkbench.getPlatform().getApplication() instanceof QMSessionProvider provider) {

            // Register control in focus service (to provide handlers binding)
        this.searchText = new Text(parent, SWT.BORDER | SWT.SEARCH | SWT.ICON_CANCEL);
            return composite;
                }
            }
            //manager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
                public void run() {
            IAction selectAllAction = new Action(ModelMessages.controls_querylog_action_select_all) {
            }
            UIUtils.setClipboardContents(logTable.getDisplay(), TextTransfer.getInstance(), tdt);
            } else if (object instanceof QMMStatementInfo) {
            return colorGray;
        @Override
            return getObjectType(event.getObject());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        UIUtils.dispose(dndSource);
        private void createExecuteButton(@NotNull Composite parent) {
    private Color getObjectBackground(QMEvent event) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            return true;
        QMUtils.registerMetaListener(this);
                        }
import org.eclipse.jface.action.*;
                    return criteria.hasObjectType(type);
        new TableToolTip(logTable) {
            IAction copyAction = new Action(ModelMessages.controls_querylog_action_copy) {
            if (container == null) {
                return null;
    private void openSelectionInEditor() {
        item.setForeground(getObjectForeground(event));
        }
            }

                ? new TableColumnSortListener(logTable, Comparator.comparing(item -> ((QMEvent) item.getData()), comparator))
        return ""; //$NON-NLS-1$
            Comparator<QMEvent> comparator = logColumn.getComparator();
                TableColumn sortColumn = logTable.getSortColumn();
                    List<QMObjectType> typeList = new ArrayList<>();
        }
                return null;
        @Override
                    } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
            if (colWidth != null) {
                        TableItem item = new TableItem(logTable, SWT.NONE, itemIndex++);
        return searchText;
            DBPDriver driver = DataSourceProviderRegistry.getInstance().findDriver(container.getDriver().getId());
                String tdt = getSelectedText(false);
    public synchronized void deleteSelectedItems() {
            } else if (object instanceof QMMTransactionInfo) {
        }
                            updateExecutions(qmEvent, savepoint);
            IAction clearLogAction = new Action(ModelMessages.controls_querylog_action_clear_log) {
                    store.setValue(QMConstants.PROP_OBJECT_TYPES, QMObjectType.toString(typeList));
            }
                if (CommonUtils.isNotEmpty(catalogName) || CommonUtils.isNotEmpty(schemaName)) {


        logTable.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.model.DBUtils;


                logTable.setRedraw(true);
                var sqlDialect = getSqlDialectFromContainer(container);
        }
    private int entriesPerPage = MIN_ENTRIES_PER_PAGE;
            };
        if (DBWorkbench.getPlatform().isShuttingDown()) {
            @Override

*/
import org.eclipse.jface.viewers.StructuredSelection;
        logTable.setMenu(menu);

            msg.setLayoutData(gd);

                    createButton(parent, IDialogConstants.PROCEED_ID, SQLEditorMessages.editor_query_log_viewer_reexecute_query_button_text, false);
            super.visualizeLoading();
    public void copySelectionToClipboard(boolean extraInfo) {
            return Comparator.comparingLong(QMUtils::getObjectEventTime);
        LoadingJob.createService(
                    catalogText.setToolTipText(ModelMessages.controls_querylog_column_catalog_tip);
                        SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL : SWT.NONE));
        });
        // Register QM listener
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (event.getObject() instanceof QMMStatementExecuteInfo exec) {
        {
            this.toolTip = toolTip;


        if (event.getObject() instanceof QMMStatementExecuteInfo exec) {
                    // Do not add remaining (older) events - they don't fit page anyway
        // Prepare colors
                    default -> "?"; //$NON-NLS-1$
                        .layoutData(GridDataFactory.fillDefaults().create())
        }

            );
        @Override
    }
                    if (tableItem != null && tableItem.getData() instanceof QMMObject) {
        LogRefreshJob() {
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.qm.filters.QMCursorFilter;
import org.eclipse.jface.viewers.Viewer;
            parent,
            if (!showConnection && (logColumn == COLUMN_DATA_SOURCE || logColumn == COLUMN_CONTEXT)) {
        String containerId = session.getContainerId();

            }
        public void completeLoading(List<QMEvent> result) {
        for (int i = 0, columnsSize = columns.size(); i < columnsSize; i++) {
            return null;
            super(QueryLogViewer.this.getControl().getShell(), QueryLogViewer.this.site, "Event", null); //$NON-NLS-1$
            QMMObject object = event.getObject();
            tableColumn.setToolTipText(logColumn.toolTip);
            };
                }
        protected String getSQLText() {
 * you may not use this file except in compliance with the License.
                }


        }
    private void addDragAndDropSupport() {
                        objectToItemMap.remove(((QMMObject) tableItem.getData()).getObjectId());
            if (buttonId == IDialogConstants.PROCEED_ID && object.getObject() instanceof QMMStatementExecuteInfo info) {

    private void reloadEvents(@Nullable QMEventCriteria criteria) {
        }
            logTable.addDisposeListener(e -> dispose());
    };
        } else if (object instanceof QMMTransactionSavepointInfo) {
                    catalogText.setText(CommonUtils.notEmpty(catalogName));
            }
                continue;
                tableColumn.setWidth(logColumn.widthHint);
                    Collections.addAll(typeList, objectTypes);
        Transfer[] types = new Transfer[]{TextTransfer.getInstance()};
        }
                final int width = tableColumn.getWidth();
    private synchronized void scheduleLogRefresh() {
                    if (isChecked()) {
            }
    private static final LogColumn COLUMN_CONTEXT = new LogColumn("context", ModelMessages.controls_querylog_column_context_name, ModelMessages.controls_querylog_column_context_tooltip, 150) { //$NON-NLS-1$
                }
                // Do not update color of failed executions (it has to be red)
        if (ActionUtils.isCommandEnabled(CMD_FILTER_ID, site)) {
                //TableItem item = (TableItem)e.item;
            logRefreshJob = new LogRefreshJob();



    public void setCriteria(@Nullable QMEventCriteria criteria) {
        GridData gd = new GridData(GridData.FILL_BOTH);
            return;
            shell.setText(ModelMessages.controls_querylog_shell_text + COLUMN_TYPE.getText(object, true));
            @Override
            if (!logTable.isDisposed()) {
    private static final String CMD_FILTER_ID = "org.jkiss.dbeaver.core.qm.filter";
                //return SQLUtils.stripTransformations(statement.getQueryString());
                if (!CommonUtils.isEmpty(criteria.getSearchString())) {
import org.eclipse.jface.widgets.CompositeFactory;
            }
        }
                if (sortColumn != null) {
                    }
    }
            }
                        queryTypes = ArrayUtils.add(DBCExecutionPurpose.class, queryTypes, purpose);
            Control msg;
*/
        }
            manager.add(ActionUtils.makeCommandContribution(site, IWorkbenchCommandConstants.FILE_REFRESH));
                    String text = cd.logColumn.getText(item, true);
            SWT.MULTI | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL | (inDialog ? SWT.BORDER : SWT.NONE));
    private void createFiltersMenu(IMenuManager manager) {
        createColumns(showConnection);
                    copySelectionToClipboard(true);
                if ((filter != null && !filter.accept(qmEvent)) || (useDefaultFilter && !defaultFilter.accept(qmEvent))) {
                    continue;
        LogColumn logColumn;
                DBPDataSourceContainer ds = getDataSourceContainer(qmmStatementExecuteInfo);
        COLUMN_RESULT,
            } else if (object instanceof QMMConnectionInfo conInfo) {
                        return String.valueOf(fetchRowCount);
        logRefreshJob.schedule(500);
        protected void buttonPressed(int buttonId) {
            final Composite topFrame = UIUtils.createComposite(composite, 2);
                return switch (event.getAction()) {
            }
                }
            }
                        events.add(cursor.nextEvent(monitor));
            }
            } else {
        this.site = site;

import org.jkiss.code.NotNull;
            }

        TableItem[] items = logTable.getSelection();
                        objectTypes = ArrayUtils.add(QMObjectType.class, objectTypes, type);
                String catalogName = qmmStatementExecuteInfo.getCatalog();
import org.eclipse.jface.dialogs.IDialogSettings;
    private static final LogColumn COLUMN_DATA_SOURCE = new LogColumn("datasource", ModelMessages.controls_querylog_column_connection_name, ModelMessages.controls_querylog_column_connection_tooltip, 150) { //$NON-NLS-1$
        TableItem[] items = logTable.getSelection();
            QMMObject object = event.getObject();
                contextName = object.getConnection().getContextName();
                        }
    public synchronized void clearLog() {
        @Override
        TableItem item = objectToItemMap.get(event.getObject().getObjectId());

        @NotNull
                String catalogTerm = null;
        EventViewDialog(QMEvent object) {
            if (object instanceof QMMConnectionInfo) {
        EvenHistoryReadVisualizer(EventHistoryReadService loadingService) {

        this.entriesPerPage = Math.max(MIN_ENTRIES_PER_PAGE, store.getInt(QMConstants.PROP_ENTRIES_PER_PAGE));
        String projectName = session.getProjectInfo() == null ? null : session.getProjectInfo().getName();
            @Override
                if (isQueryLinkedWithEditor(info) && SQLEditorUtils.isOpenSeparateConnection(getDataSourceContainer(info))) {
                String qmSessionId = null;
            super("Load query history"); //$NON-NLS-1$
                        .create(topFrame);
            createCopyButton(parent);
                            event.doit = false; // Disable sort toggle
        @Override
            public void dragStart(DragSourceEvent event) {
        if (event.getProperty().startsWith(QMConstants.PROP_PREFIX)) {
                        updateExecutions(qmEvent, (QMMTransactionSavepointInfo) object);
            } else {
                        } else {
                    if (action == QMEventAction.BEGIN || action == QMEventAction.END) {
                }
                && object.getObject() instanceof QMMStatementExecuteInfo && filter != null && filter instanceof SQLLogFilter
    }
        protected void configureShell(Shell shell) {
                    } else {
    }
    private class EvenHistoryReadVisualizer extends ProgressLoaderVisualizer<List<QMEvent>> {
            if (savepoint == null) {
        @Override
        // Extract events
            deleteSelectionAction.setEnabled(logTable.getSelectionCount() > 0);
    private Font getObjectFont(QMEvent event) {
                super.completeLoading(result);

                    }
                String containerFullName = containerName;
    }
            UIUtils.addFocusTracker(site, QUERY_LOG_CONTROL_ID, logTable);
        protected IDialogSettings getDialogBoundsSettings() {
        return itemIndex;
        }
        return logTable;
                tableColumn.setWidth(Integer.parseInt(colWidth));
    }
            this.title = title;

                    if (!queryString.endsWith(SQLConstants.DEFAULT_STATEMENT_DELIMITER)) {
        }
            }
//            return ModelMessages.controls_querylog_script;

            colIndex++;
            IAction toggleAction = new Action(purpose.getTitle(), Action.AS_CHECK_BOX) {
    private void dispose() {
                if (((QMMTransactionInfo) object).isCommitted()) {
                    qmSessionId = provider.getQueryManagerSessionId();
        }
            }
        private final QMEvent object;

            final Composite composite = new Composite(parent, SWT.NONE);


import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
        item.setBackground(getObjectBackground(event));
        COLUMN_DURATION,
                }
                    long fetchRowCount = exec.getFetchRowCount();
                    clearLog();
                    } else {
    public void metaInfoChanged(@NotNull DBRProgressMonitor monitor, @NotNull final List<QMMetaEvent> events) {
                if (!CommonUtils.isEmpty(tdt)) {
                        if (DBWorkbench.getPlatform().isShuttingDown()) {
                return null;
    private static String getObjectType(QMMObject object) {
        updateItem(event, item);
            }
            }
                return savepoint.isCommitted() ?

            QMMObject object = event.getObject();
        }
                    break;
        @Override
                statement = ((QMMStatementExecuteInfo) object).getStatement();
                super.visualizeLoading();
        if (logTable.isDisposed()) {
        }



    private static final LogColumn COLUMN_TEXT = new LogColumn("text", ModelMessages.controls_querylog_column_text_name, ModelMessages.controls_querylog_column_text_tooltip, 400) { //$NON-NLS-1$
    private static final String QUERY_LOG_CONTROL_ID = "org.jkiss.dbeaver.ui.qm.log"; //$NON-NLS-1$
        private final String toolTip;
            @Override
                if (schemaTerm == null) {
                            break;
        int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;
            public String getItemToolTip(TableItem item, int selectedColumn) {
                public void run() {
                    filter != null ? filter : (useDefaultFilter ? defaultFilter : null)
        @Override
                }
            for (TableItem item : logTable.getSelection()) {
import java.text.SimpleDateFormat;
                topFrame,
        }
        }
            UIUtils.createLabelText(topFrame, ModelMessages.controls_querylog_label_time, COLUMN_TIME.getText(object, true), SWT.READ_ONLY);
        return null;
    @Override
                    if (CommonUtils.isEmpty(((QMMStatementExecuteInfo) object).getQueryString())) {
            } else {
            this.criteria = criteria;
        return new StructuredSelection(data);
                @Override

                }
        }
                if (ds != null) {
                String instanceId = conInfo.getInstanceId();
        // Make sure app is initialized

            IAction copyAllAction = new Action(ModelMessages.controls_querylog_action_copy_all_fields) {
    private final boolean currentSessionOnly;
        objectToItemMap.clear();
                @Override
            columns.add(cd);
                if (exec.isClosed()) {
                    store.setValue(QMConstants.PROP_QUERY_TYPES, CommonUtils.makeString(typeNames, ','));
        };
            objectToItemMap.remove(((QMEvent) tableItem.getData()).getObject().getObjectId());
                if (!CommonUtils.equalObjects(containerName, instanceId)) {
    }
                gd.widthHint = 300;
    }
        }
                    return sqlDialect;


            manager.add(ActionUtils.makeCommandContribution(site, CMD_FILTER_ID, CommandContributionItem.STYLE_CHECK));
                    if (sortListeners != null) {
                int[] indexes = new int[itemCount - entriesPerPage];
                containerName = object.getConnection().getContainerName();
        reloadEvents(criteria);
                "QueryManager", //$NON-NLS-1$
        }
                        qmSessionId = provider.getQueryManagerSessionId();
            return ModelMessages.controls_querylog_savepoint;
import org.jkiss.dbeaver.model.messages.ModelMessages;
}
        @Override
            } finally {
        for (QMObjectType type : QMObjectType.values()) {
                return driver.getScriptDialect().createInstance();
                    UIUtils
        // Run in UI thread
        }
                }
        reloadInProgress = true;
        MenuManager menuMgr = new MenuManager();
                        objectTypes = ArrayUtils.remove(QMObjectType.class, objectTypes, type);

        COLUMN_CONTEXT,
                    }
        String getText(QMEvent event, boolean briefInfo) {
        @Override
                    deleteSelectedItems();


            IAction editorAction = new Action("Open in SQL console", DBeaverIcons.getImageDescriptor(UIIcon.SQL_CONSOLE)) { //$NON-NLS-1$
                return text;
                    QMObjectType[] objectTypes = criteria.getObjectTypes();
        dndSource = new DragSource(logTable, operations);
        for (TableItem tableItem : logTable.getSelection()) {
            };
        super();
                : new TableColumnSortListener(logTable, colIndex);



import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                //containerFullName += " {" + contextName + "}";
                }
                } catch (DBException e) {
import org.jkiss.utils.ArrayUtils;
        logTable = new Table(
        }
                    DBCExecutionPurpose[] queryTypes = criteria.getQueryTypes();
        @Override
    private volatile boolean reloadInProgress = false;
                String schemaName = qmmStatementExecuteInfo.getSchema();
        public List<QMEvent> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    while (events.size() < entriesPerPage && cursor.hasNextEvent(monitor)) {
            } else if (object instanceof QMMTransactionSavepointInfo) {

import org.jkiss.dbeaver.utils.RuntimeUtils;
                containerName = ((QMMTransactionSavepointInfo) object).getTransaction().getConnection().getContainerName();
                }
    private void updateExecutions(QMEvent event, QMMTransactionSavepointInfo savepoint) {
    };
                    Listener[] sortListeners = sortColumn.getListeners(SWT.Selection);
            messageLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
        });
            }
                    if (object instanceof QMMTransactionInfo) {
            UIUtils.createLabelText(topFrame, ModelMessages.controls_querylog_label_type, COLUMN_TYPE.getText(object, true), SWT.BORDER | SWT.READ_ONLY);
    private class EventViewDialog extends BaseSQLDialog {



import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
                } else if (object instanceof QMMTransactionInfo || object instanceof QMMTransactionSavepointInfo) {

                @Override
        COLUMN_TIME,
                item.setBackground(getObjectBackground(event));
    private QMEventFilter filter;
        }
        this.currentSessionOnly = currentSessionOnly;

                    }
            if (exec.getStatement().getPurpose().isUser()) {
                    itemIndex = createOrUpdateItem(qmEvent, itemIndex);
                public void run() {
    @Override
                try (QMEventCursor cursor = eventBrowser.getQueryHistoryCursor(cursorFilter)) {
        TableColumn tableColumn;
                return container.getDataSource().getSQLDialect();
                if (briefInfo) {
                msg = messageText;
                    }
        @Override
                containerName = ((QMMStatementExecuteInfo) object).getStatement().getConnection().getContainerName();
import org.jkiss.dbeaver.ui.*;
                }
                    PrefUtils.savePreferenceStore(store);
                public void run() {
        }
                        schemaTerm = dataSource.getInfo().getSchemaTerm();

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

            return ""; //$NON-NLS-1$
            if (driver == null) {
    public IStructuredSelection getSelection() {
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            }
            // Add events in reverse order
            } else {
        @Override
                    monitor.subTask("Load all queries"); //$NON-NLS-1$
import org.jkiss.dbeaver.ui.controls.TableColumnSortListener;
                            break;
        protected DBCExecutionContext getExecutionContext() {
            } else {
    }
        protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
            return timeFormat.format(QMUtils.getObjectEventTime(event));

    }
    private static final LogColumn COLUMN_DURATION = new LogColumn("duration", ModelMessages.controls_querylog_column_duration_name, ModelMessages.controls_querylog_column_duration_tooltip, 100) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    private DragSource dndSource;
    }
        String getText(QMEvent event, boolean briefInfo) {
                        return String.valueOf(updateRowCount);
            manager.add(copyAllAction);

            };
            return null;
        }
                @Override
        IStructuredSelection selection = getSelection();
package org.jkiss.dbeaver.ui.controls.querylog;
    }
                    Text catalogText = new Text(container, SWT.BORDER | SWT.READ_ONLY);
        }
                    catalogTerm = ModelMessages.controls_querylog_column_catalog_name;
import org.jkiss.dbeaver.model.DBPDataSource;
        }
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
                    monitor.subTask("Search queries: " + criteria.getSearchString()); //$NON-NLS-1$

        String getText(QMEvent event, boolean briefInfo) {
                    }
        }
    private boolean useDefaultFilter = true;
    }
                            event.widget = sortColumn;

import org.jkiss.dbeaver.runtime.DBWorkbench;

    @Override
            tableColumn.setData(logColumn);
            try {
        if (!sql.isEmpty()) {
    private void createContextMenu() {
        }
                return ""; //$NON-NLS-1$
        private final int widthHint;
    };
                    }
            objectToItemMap.put(event.getObject().getObjectId(), item);
                .schedule();
import java.util.*;
    private static final int MIN_ENTRIES_PER_PAGE = 1;
            resultText.setLayoutData(gd);
            resultText.setText(resultMessage);

        String tdt = getSelectedText(extraInfo);
                item.setForeground(getObjectForeground(event));
        } else if (object instanceof QMMTransactionInfo) {

        QMUtils.unregisterMetaListener(this);
        logTable.addListener(SWT.Resize, new Listener() {
                    criteria,
        return tdt.toString();

                    int tries = 0;
                return QueryLogThemeSettings.instance.colorUncommitted;
                }
    public void setSelection(ISelection selection, boolean reveal) {
        }
            int itemCount = logTable.getItemCount();
        if (item.isDisposed()) {
                    openSelectionInEditor();
                    PrefUtils.savePreferenceStore(store);
            return savepoint.isCommitted() ? null : QueryLogThemeSettings.instance.colorTransaction;
                for (int i1 = 0, columnsSize = columns.size(); i1 < columnsSize; i1++) {
        TextEditorUtils.enableHostEditorKeyBindingsSupport(site, searchText);
            super(loadingService, logTable);

        private static final String DIALOG_ID = "DBeaver.QM.EventViewDialog";//$NON-NLS-1$
    }
            @Override
        this.searchText.setMessage(SQLEditorMessages.editor_query_log_viewer_draw_text_type_qury_part);
                    }

                }
 * See the License for the specific language governing permissions and
    @Override
                if (logTable.isDisposed()) {
                    }
                };
    }
            return Status.OK_STATUS;
import org.eclipse.jface.layout.GridDataFactory;

        QMEvent[] data = new QMEvent[items.length];
            copyAllAction.setActionDefinitionId(IActionConstants.CMD_COPY_SPECIAL);
                item.setFont(getObjectFont(event));
            GridData gd = new GridData(GridData.FILL_BOTH);
            }
    private static final String VIEWER_ID = "DBeaver.QM.LogViewer"; //$NON-NLS-1$
        }
                            listener.handleEvent(event);
            } else if (object instanceof QMMTransactionSavepointInfo) {
                    QueryLogThemeSettings.instance.colorUncommitted : QueryLogThemeSettings.instance.colorTransaction;
    }
                gd.heightHint = 60;
import org.jkiss.dbeaver.model.sql.SQLConstants;
                final SQLQuery query = new SQLQuery(editor.getDataSource(), info.getQueryString());
                editor.processQueries(List.of(query), false, true, false, true, null, null);
            return UIUtils.getDialogSettings(DIALOG_ID);
                    if (updateRowCount < 0 && fetchRowCount <= 0) {
            return timestampFormat.format(event.getObject().getOpenTime());
        } catch (Exception e) {
                    }
    }
        }

                    case END ->
                new EvenHistoryReadVisualizer(loadingService))
            log.error("Error updating Query Log", e); //$NON-NLS-1$
            return ModelMessages.controls_querylog_transaction;
                    UIUtils.createControlLabel(topFrame, catalogTerm);
                if (((QMMTransactionSavepointInfo) object).isCommitted()) {
            copyAllAction.setEnabled(logTable.getSelectionCount() > 0);
                msg = createSQLPanel(topFrame);
                    // Filter the same second time?
        Menu menu = menuMgr.createContextMenu(logTable);
            if (!tdt.isEmpty()) {
                    schemaTerm = ModelMessages.controls_querylog_column_schema_name;
        // Search field
            return null;
                }

import java.text.DateFormat;
                    throw new InvocationTargetException(e);
                    scheduleLogRefresh();
        }
                        queryTypes = ArrayUtils.remove(DBCExecutionPurpose.class, queryTypes, purpose);
        }
            QMMTransactionSavepointInfo savepoint = exec.getSavepoint();
            }
    public Object getInput() {
            boolean isMultilineResult = resultMessage.contains("\n");
                @Override
            String contextName = null;
        }
            return false;
            copyAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_COPY);
    }
        if (selection.isEmpty()) {
    private static final Log log = Log.getLog(QueryLogViewer.class);
            manager.add(new Separator());

                        return ""; //$NON-NLS-1$
    }
import org.jkiss.dbeaver.ui.editors.sql.dialogs.BaseSQLDialog;
            createExecuteButton(parent);
        public Object getFamily() {
            } else if (object instanceof QMMTransactionInfo) {

import org.eclipse.ui.IWorkbenchCommandConstants;
    }
        String getText(QMEvent event, boolean briefInfo) {
import org.eclipse.jface.layout.GridLayoutFactory;

                    long updateRowCount = exec.getUpdateRowCount();
        if (event.getObject() instanceof QMMStatementExecuteInfo) {
            } catch (DBException e) {
                    }
                contextName = ((QMMTransactionSavepointInfo) object).getTransaction().getConnection().getContextName();
                        sql.append("\n"); //$NON-NLS-1$
                    }

import org.jkiss.utils.CommonUtils;
        if (logRefreshJob == null) {
            DBCExecutionPurpose purpose = execInfo.getStatement().getPurpose();
            manager.add(toggleAction);
        COLUMN_DATA_SOURCE,
                    catalogText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    private void updateItem(QMEvent event, TableItem item) {
    private void showEventDetails(QMEvent event) {
            } else if (savepoint.isClosed()) {
                    } else if (updateRowCount < 0) {
 * limitations under the License.
            if (event.getObject() instanceof QMMStatementExecuteInfo exec) {
                        updateItem(qmEvent, item);
import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;

        } else if (event.getObject() instanceof QMMTransactionInfo || event.getObject() instanceof QMMTransactionSavepointInfo) {
                    event.data = ""; //$NON-NLS-1$
                }
            QMMStatementInfo statement;
        UIUtils.installAndUpdateMainFont(parent);
/*
                String containerName = conInfo.getContainerName();
            }
            QMMTransactionSavepointInfo savepoint;
                        //monitor.subTask(events.get(events.size() - 1).toString());
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
        if (!tdt.isEmpty()) {
                        .layout(GridLayoutFactory.fillDefaults().numColumns(3).create())
            return getText(event, true);
    public Text getSearchText() {
                String schemaTerm = null;
                    updateMetaInfo(result);
        for (final LogColumn logColumn : ALL_COLUMNS) {
