                }
                this);
                    viewer.getSite(), IResultSetCommands.CMD_FILTER_SAVE_SETTING));
            if (vsb != null) {
        SQLWordPartDetector wordDetector = new SQLWordPartDetector(new Document(contents), syntaxManager, position);
                            " (" + ActionUtils.findCommandDescription(IWorkbenchCommandConstants.NAVIGATE_BACKWARD_HISTORY, viewer.getSite(), true) + ")");
        final DBRRunnableWithProgress reader = monitor -> {
            }
                contentAdapter,
                    filtersText.redraw();

                public void mouseExit(MouseEvent e) {
    private ContentProposalAdapter filtersProposalAdapter;
                    }
    }
                    if (e.keyCode == SWT.ARROW_DOWN) {
            } else {
    }
                        filtersProposalAdapter.closeProposalPopup();
        }
            DBWorkbench.getPlatformUI().showError("Can't set filter", "Cannot set custom filter", e);
            }
            }
    private final ExecutePanel executePanel;
            this.filtersText.addKeyListener(new KeyAdapter() {
            super(addressBar, UIIcon.SQL_EXECUTE, ResultSetMessages.sql_editor_resultset_filter_panel_btn_apply, SWT.NONE);
    private final Color shadowColor;
                        @Override


            }
            }
            return null;
        HistoryMenuListener(ToolItem item, boolean back) {
        DBSDataContainer dataContainer = viewer.getDataContainer();

                openEditorForActiveQuery();
import org.eclipse.jface.text.IUndoManager;

    private boolean isFiltersAvailable() {
            historyTable.addKeyListener(new KeyAdapter() {
                if (historyTable.getItemCount() > 0) {
                    null));
            }
                historyForwardButton = new ToolItem(filterToolbar, SWT.DROP_DOWN | SWT.NO_FOCUS);

                    final int statePosition = i;

    public <T> T getAdapter(@NotNull Class<T> adapter) {

        }
                    hover = true;
            });
        }
class ResultSetFilterPanel extends Composite implements IContentProposalProvider, DBPAdaptable
            historyTable.addMouseMoveListener(e -> hoverItem = historyTable.getItem(new Point(e.x, e.y)));
        protected void paintPanel(PaintEvent e) {
        FilterExpandPanel(Composite addressBar) {
                    fillDropDownMenu(menuManager);
                        return;
            return false;
                                            context,
                }
        private final boolean back;
        try {
                }
            if (popup != null) {
            dropImageE = DBeaverIcons.getImage(UIIcon.DROP_DOWN);
import java.util.ArrayList;
            return DBIcon.SQL_TEXT;

            log.debug("Error reading history", e);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.Nullable;
        protected void fillDropDownMenu(MenuManager menuManager) {

    public IContentProposal[] getProposals(String contents, int position) {
                }
            try {
                }

import org.jkiss.dbeaver.model.sql.SQLConstants;
                        e.doit = true;
            if (activeObjectImage != null) {
                e.gc.drawLine(x, e.y + 2, x, e.y + e.height - 4);

        }
                    IResultSetCommands.CMD_FILTER_CLEAR_SETTING,

        setFilterValue(whereCondition);
            for (DBDAttributeBinding attribute : attributes) {
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.jkiss.dbeaver.ui.controls.resultset.colors.ResetAllColorAction;
                historyMenu.setLocation(pt.x, pt.y + rect.height);
                }
        @Override
            }
            e.gc.setClipping((Rectangle) null);
    }
                    UIUtils.asyncExec(() -> showObjectInfoPopup(e));
                ToolItem item = (ToolItem) e.widget;
    }
                    viewer.getFilterManager().saveQueryFilterValue(context, getActiveSourceQueryNormalized(false), whereCondition);
                return false;
                    IWorkbenchCommandConstants.NAVIGATE_BACKWARD_HISTORY
        @Override
            if (hover) {
        try {
                    //textWidget.setAlwaysShowScrollBars(false);
                historyMenu = null;
                    e.x + 2, e.y + e.height - 4);
        iconLabel.setToolTipText(ResultSetMessages.sql_editor_resultset_filter_panel_label);

                }
    private final TextViewer filtersTextViewer;
        editorPH.setLayoutData(new GridData(GridData.FILL_BOTH));

                redrawPanels();
            }
            Rectangle displayRect = getMonitor().getClientArea();
        if (filterExpandPanel != null && !filterExpandPanel.isDisposed()) {
                        e.doit = true;
            menuManager.add(ActionUtils.makeCommandContribution(viewer.getSite(), IResultSetCommands.CMD_FILTER_CLEAR_SETTING));
            if ((this.style & SWT.LEFT) == SWT.LEFT) {
import org.jkiss.dbeaver.ui.css.ICSSBackgroundMimicControl;
            throw new PartInitException("Error creating SQL panel", e);
            super(addressBar, SWT.NO_FOCUS);
            if (prevQuery == null || !prevQuery.equals(displayName)) {
            updateActiveQueryDisplayText(displayName);
            }
            }
                if (dataSource != null) {
                    if (item == null) {
                        return;
                }
                e.gc.drawImage(icon, 2, 2);
            int tableWidth = editControl.getSize().x - editControl.getBorderWidth() * 2;
            return;

                popup.dispose();
        }
            addMouseListener(new MouseAdapter() {
            if (context == null) {
                    } else if (e.keyCode == SWT.SPACE) {
        filterExpanded = !filterExpanded;
        }

                    hover = true;
        return filtersText;
    private static final Log log = Log.getLog(ResultSetFilterPanel.class);
                    }
            int height = Math.min(MAX_HISTORY_PANEL_HEIGHT, editControl.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
        String condition = filtersText.getText();
                    e.x + e.width - 4, e.y + e.height);
                && rsv.getFiltersPanel() != null
                @Override
            enabledImageExpand = DBeaverIcons.getImage(UIIcon.FIT_WINDOW);
        DBSDataContainer dataContainer = viewer.getDataContainer();
            }
import org.jkiss.utils.CommonUtils;
        if (executePanel != null && !executePanel.isDisposed()) {

//                    !CommonUtils.isEmpty(filterText));
                x += 4;

            popup.setVisible(true);
        protected abstract void executeDefaultAction();
            this.style = style;
        }
                @Override
                }
            }
            this.filtersTextViewer.setDocument(new Document());
import org.eclipse.jface.fieldassist.IContentProposal;
            }

    }
            UIUtils.addEmptyTextHint(this.filtersText, styledText ->
            //UIUtils.createToolBarSeparator(filterToolbar, SWT.VERTICAL);
        }
                        switch (e.keyCode) {
                }
            });
                    viewer.getSite(),
                    showFilterHistoryPopup();
                public void focusLost(FocusEvent e) {
                            case SWT.DEL:
                y = parentRect.y - height;
        private final ToolItem dropdown;
                ddMenu.setLocation(pt.x, pt.y + rect.height);
        try {
import org.jkiss.dbeaver.ui.controls.resultset.actions.FilterResetAllPinsAction;
                currentCondition,
                return;
            }
        }
                }
                                        viewer.getFilterManager().deleteQueryFilterValue(
        }
            UIUtils.addDefaultEditActionsSupport(viewer.getSite(), this.filtersText);

                    historyForwardButton.setEnabled(true);

            popup.setVisible(true);
        if (!viewer.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL)) {
            return DBIcon.TREE_TABLE;
        if (forUI && dataContainer instanceof DBSEntity && !viewer.getDataFilter().hasFilters()) {
            filtersHistory.addAll(history);
        activeDisplayName = CommonUtils.notEmpty(CommonUtils.truncateString(displayName, 200));
            this.dropdown = item;
import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.SpreadsheetCommandHandler;
            SQLConstants.KEYWORD_IS,
                }
        } finally {
        if (dataContainer instanceof DBSEntity) {
                }
        protected void paintPanel(PaintEvent e) {

                y = parentRect.y - height;
        String[] filterKeywords = {
            }
            }
    }
//        gl.marginWidth = 0;

            serviceSQL.openSQLConsole(
            DBCExecutionContext context = viewer.getExecutionContext();
                maxFilterTextWidth = textSize.x;
        this.shadowColor = getDisplay().getSystemColor(isDark ? SWT.COLOR_WIDGET_LIGHT_SHADOW : SWT.COLOR_WIDGET_NORMAL_SHADOW);
        this.addControlListener(new ControlListener() {

            super(addressBar, UIIcon.REFRESH, ResultSetMessages.controls_resultset_viewer_action_refresh, SWT.RIGHT);
                return rsv.getFiltersPanel().filtersText;
        }
    private String prevQuery = null;
                ddMenu.setVisible(true);
                            return;
    private String activeDisplayName = ResultSetViewer.DEFAULT_QUERY_TEXT;
                filtersClearButton.setEnabled(false);
        return displayName;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
        }

                    historyForwardButton.setToolTipText(
                        menuManager.removeAll();

            if (e.detail == SWT.ARROW) {
        }
        {
            SQLConstants.KEYWORD_NOT,
            GridData gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_VERTICAL);
            }
            this.filterComposite.setLayout(gl);
                                    closeHistoryPopup();
            });
            });
            if (isItemEnabled()) {
    }
            if (!compactMode) {
                        setFilterValue(newFilter);
                public void onMouseSingleClick(@NotNull MouseEvent e) {

        if (dataSource != null) {
            if ((this.style & SWT.LEFT) == SWT.LEFT) gd.widthHint += 4;
            filtersCustomButton.setEnabled(true);
            editorName = "Query";
                this.filterExpandPanel = new FilterExpandPanel(filterComposite);
                popup = null;
            } else {

        private Table createFilterHistoryPanel(final Shell popup) {
            setToolTipText(ResultSetMessages.filter_panel_expand_panel_text);


            });
                }
                Rectangle iconBounds = icon.getBounds();
        ActiveObjectPanel(Composite addressBar, boolean compactMode) {
                        // allows add new line when filter is expanded


            if (historyBackButton != null) {
            Rectangle parentRect = getDisplay().map(activeObjectPanel, null, getBounds());
import org.eclipse.jface.text.TextViewer;

            );
            popup.setLayout(new FillLayout());
            if (viewer.getDataFilter().hasHiddenAttributes()) {
                if (e.character == SWT.CR || e.character == SWT.LF) {
            this.filtersText.addModifyListener(e -> {
        }
                        }
            // The same
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                        redraw();
                historyBackButton = new ToolItem(filterToolbar, SWT.DROP_DOWN | SWT.NO_FOCUS);
            executePanel.redraw();
        TextEditorUtils.enableHostEditorKeyBindingsSupport(viewer.getSite(), this.filtersText);
                @Override
                }
        @Override
    }

                    if (filterExpanded && (e.stateMask & SWT.MOD1) == 0) {
                            case SWT.ARROW_UP:
            }
    }
                    if (item != null && !item.isDisposed()) {
        this.setLayout(gl);
                context.getDataSource(),
 *     http://www.apache.org/licenses/LICENSE-2.0
            editControl.addFocusListener(new FocusAdapter() {
        private MenuManager menuManager;
            final Point filterTextSize = filtersText.getSize();

                }
 */
            @Override
            );
            }
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
                e.gc.drawImage(dropImageD, e.x + 4, e.y + 2);
        }
import org.eclipse.ui.PartInitException;
                        if (filterExpanded && (e.stateMask & SWT.CTRL) == 0) {
                }
        iconLabel.setCursor(getDisplay().getSystemCursor(SWT.CURSOR_HAND));
                    e.x + e.width - 4, e.y,
                    .getNavigatorModel().findNode(dataContainer);
            if (filterExpandPanel != null) {
        }
    @NotNull
            if (filtersHistory.isEmpty()) {
                this.filterExpandPanel = null;
    }
            dropImageD = new Image(dropImageE.getDevice(), dropImageE, SWT.IMAGE_GRAY);
            int x = parentRect.x;
        }
        gl.marginHeight = 0;
    private final ToolBar filterToolbar;
                        e.doit = false;
            addMouseListener(new MouseAdapter() {
            }


            int height = Math.min(MAX_INFO_PANEL_HEIGHT, Math.max(MIN_INFO_PANEL_HEIGHT, controlRect.y + 30));
        redrawPanels();

        }
            });

                            case SWT.SPACE:
                                } catch (DBException e1) {
            });
        String editorName;
import org.jkiss.dbeaver.model.struct.DBSEntity;
            this.filtersText = this.filtersTextViewer.getTextWidget();
                    hoverItem = null;
import org.jkiss.dbeaver.model.data.DBDDataFilter;
            this.filtersText.addFocusListener(new FocusListener() {
            disabledImage = new Image(enabledImage.getDevice(), enabledImage, SWT.IMAGE_GRAY);
                        if (filtersProposalAdapter.isProposalPopupOpen()) {
            String displayName = getActiveSourceQueryNormalized(true);
                        stateHistory.get(historyPosition + 1).describeState() +
        searchJob.schedule();
        @Override
            filterToolbar.redraw();
{
                @Override
        public Control getOriginWidget() {
        }
    @NotNull
                    StyledText textWidget = ((TextViewer) sqlPanel).getTextWidget();
    //IME composition state (e.g., Zhuyin)
            // when active object panel styles are applying. So it background is always system default on init stage.
        });
            e.gc.drawLine(
                executePanel.setVisible(enable);
import java.util.regex.Matcher;
        @Override
        });
                    } else {
                            DBValueFormatting.getObjectImage(attribute)));


                this.executePanel = null;
                String curFilterValue = filtersText.getText();

                filterExpandPanel.setVisible(enable);
/**
        static final int MAX_INFO_PANEL_HEIGHT = 400;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                proposals.add(new ContentProposal(kw + " ", kw + ": SQL expression keyword"));
        @Override
        GridLayout gl = new GridLayout(2, false);

        for (DBDAttributeConstraint ac : newFilter.getConstraints()) {
                menuManager.add(ActionUtils.makeCommandContribution(
                    popup.dispose();
        filterComposite.setBackground(filtersText.getBackground());

            } catch (PartInitException e1) {
    private class ExecutePanel extends ToolItemPanel {
            syntaxManager.init(dataSource.getSQLDialect(), dataSource.getContainer().getPreferenceStore());
            // Register filters text in focus service
import org.eclipse.jface.action.MenuManager;
        } else if (!forUI && dataContainer != null) {
        if (isDisposed()) {
        @Override
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
            public void mouseUp(MouseEvent e) {
                                try {
            if (isItemEnabled()) {
            filtersCustomButton.setImage(DBeaverIcons.getImage(UIIcon.FILTER));
                    if (executeAction(e)) {
                if (historyPosition < stateHistory.size() - 1) {
            final boolean supportsDataFilter = viewer.supportsDataFilter();
            super(addressBar, SWT.NONE);
import org.eclipse.jface.fieldassist.ContentProposal;
            gl = new GridLayout(compactMode ? 4 : 5, false);
                    //  handle enter/return for commit Chinese or when popup is open


                return false;
                        setCustomDataFilter();
import org.eclipse.jface.text.TextViewerUndoManager;
                        final String newFilter = hoverItem.getText();
import org.eclipse.swt.events.*;
        protected abstract void fillDropDownMenu(MenuManager menuManager);
                int newPosition = back ? historyPosition - 1 : historyPosition + 1;
                );
                Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
            if (menuManager.getSize() > 1) {
                @Override
        if (!oldFilter) {
    private class FilterExpandPanel extends FilterPanel {
            if (filterToolbar != null) {
            addMouseTrackListener(new MouseTrackAdapter() {
import org.eclipse.swt.widgets.*;
        } catch (DBException e) {
            filtersText.setText(whereCondition);
                return;
            }
            DBCExecutionContext context = viewer.getExecutionContext();
                RGB hoverRgb = UIUtils.blend(background.getRGB(), blendRGB, 90);

                    e.doit = false;
                if (e.detail == SWT.TRAVERSE_RETURN) {
        return null;
        String displayName = getActiveSourceQuery(forUI);
    private final HistoryPanel historyPanel;
            Rectangle displayRect = getMonitor().getClientArea();
                e.gc.fillRectangle(e.x, e.y, e.width - 3, panelHeight);
                    historyBackButton.setToolTipText(
        private void closeHistoryPopup() {
            editorName = dataContainer.getName();
                menuManager.add(ActionUtils.makeCommandContribution(
        protected void paintPanel(PaintEvent e) {
    {
        } else {
                setCustomDataFilter();
import org.jkiss.dbeaver.ui.controls.resultset.actions.FilterResetAllTransformersAction;
            editControl.addFocusListener(new FocusAdapter() {
        @Override
                @Override

import org.jkiss.dbeaver.DBException;

        public void widgetSelected(SelectionEvent e) {
                    return textWidget;
            }

            e.gc.setForeground(shadowColor);
                            " (" + ActionUtils.findCommandDescription(IWorkbenchCommandConstants.NAVIGATE_FORWARD_HISTORY, viewer.getSite(), true) + ")");

        gd.heightHint = filtersText.getLineHeight() * (filterExpanded ? 5 : 1);
                }
            editControl.setFocus();
                public void onMouseDoubleClick(@NotNull MouseEvent e) {
        }
/*
                    executePanel.setEnabled(true);
        DBCExecutionContext context = viewer.getExecutionContext();
                for (int i = filtersHistory.size(); i > 0; i--) {
        protected void paintPanel(PaintEvent e) {
            filtersCustomButton.setToolTipText(ActionUtils.findCommandDescription(

                                break;
            gl.marginWidth = 2;
            super(addressBar, SWT.NO_FOCUS);
        public Point computeSize(int wHint, int hHint, boolean changed) {
    private class FilterPanel extends Canvas implements ICSSBackgroundMimicControl {
                            return;
 *
                    }
        }
    }

        return displayName;
            return adapter.cast(filtersTextViewer.getUndoManager());
                        if (filterExpanded && (e.stateMask & SWT.MOD1) == 0) {
    }
    private class EraseItemListener extends AbstractDropDownListener {
                if (executePanel != null) {

        }
            if (hover) {
            if (viewer.isRefreshInProgress() && isEnabled()) {

                // nothing
            }
        protected boolean executeAction(MouseEvent e) {
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
    private ToolItem filtersClearButton;
            }
            if (filtersHistory.isEmpty()) {
                    return dcNode.getNodeIcon();
            DBPDataSource dataSource = viewer.getDataContainer().getDataSource();
    private class RefreshPanel extends ToolItemPanel {
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
    private final Composite filterComposite;
                null,
                                break;
                    // Do not nullify it to avoid double-opening of popup
        }
            if (ResultSetViewer.DEFAULT_QUERY_TEXT.equals(query)) {
                menuManager.add(ActionUtils.makeCommandContribution(
                redrawPanels();
            e.gc.setForeground(shadowColor);
                    e.x + e.width - 4, e.y + e.height - 4);
            //setLayoutData(new GridData(GridData.FILL_BOTH));

                }
            setRedraw(true);
                    if (menuManager == null) {

        if (serviceSQL != null && dataContainer != null && dataContainer.getDataSource() != null) {
                    currentCondition,
            }
            this.filterComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            displayName = dataContainer.getName();
                Color background = e.gc.getBackground();
            }
                            return;
    }
            if (!compactMode) {
        filterComposite.layout();
            } else {
            viewer.showFilterSettingsDialog();
            this.filtersTextViewer.setUndoManager(undoManager);
                    viewer.getSite(),

        enablePanelControls(enableFilters);
                e.gc.drawImage(filterExpanded ? disabledImageCollapse : disabledImageExpand, e.x, e.y + 2);
            new TableColumn(historyTable, SWT.NONE);
        private final boolean compactMode;
                        // close the proposal window, if space is pressed.
                if (attribute.isCustom()) {
                    if (filterExpanded) {
            });
                if (dcNode != null) {
                    TableItem item = hoverItem;
                    ResultSetViewer.HistoryStateItem state = stateHistory.get(i);
                public void mouseHover(MouseEvent e) {
            iconLabel.setImage(DBeaverIcons.getImage(activeObjectImage));
                } else {

                x += enabledImage.getBounds().width + 4;
                public void mouseDown(MouseEvent e) {

                viewer.navigateHistory(newPosition);
        @NotNull
    private class CustomFilterListener extends AbstractDropDownListener {
import org.jkiss.dbeaver.Log;
                }
    private abstract class ToolItemPanel extends FilterPanel {
                    redraw();
            this.filtersText.setLayoutData(gd);
                    });
        {
            return !currentCondition.toString().trim().equals(filtersText.getText().trim());

                prevQuery = displayName;
import org.jkiss.dbeaver.ui.controls.DoubleClickMouseAdapter;
        if (currentCondition.toString().trim().equals(condition.trim())) {
                @Override
        private TableItem hoverItem;
    private static final int MIN_FILTER_TEXT_HEIGHT = 20;

            if (hover) {
                tableWidth -= vsb.getSize().x;
                //historyTable.deselectAll();
                                    DBCExecutionContext context = viewer.getExecutionContext();
        DBSDataContainer dataContainer = viewer.getDataContainer();
                filtersHistory.clear();
            });
 *
            } else {
                historyForwardButton.addSelectionListener(new HistoryMenuListener(historyForwardButton, false));
            if (textSize.x < maxFilterTextWidth) {
        final List<IContentProposal> proposals = new ArrayList<>();
            undoManager.connect(filtersTextViewer);
                public void focusGained(FocusEvent e) {
    }
                viewer.getSite(),
        protected void executeDefaultAction() {
            if (viewer.hasColorOverrides()) {
            displayName = m.replaceAll("");
                filtersClearButton = new ToolItem(filterToolbar, SWT.NO_FOCUS | SWT.DROP_DOWN);
                if (sqlPanel instanceof TextViewer) {
            disabledImageExpand = new Image(enabledImageExpand.getDevice(), enabledImageExpand, SWT.IMAGE_GRAY);
    }
                                final String filterValue = item.getText();
            //filtersText.setEnabled(enable);
        return filtersIme != null && !filtersIme.isDisposed() && filtersIme.getCaretOffset() != -1;
    private ToolItem historyForwardButton;
                        item.addDisposeListener(e1 -> menuManager.dispose());
        }
            addDisposeListener(e -> {

            StringBuilder currentCondition = new StringBuilder();
            e.gc.setFont(BaseThemeSettings.instance.baseFont);
            public void controlMoved(ControlEvent e) {
        iconLabel.addMouseListener(new MouseAdapter() {
            });
                filtersProposalAdapter.refresh();
            return !viewer.isRefreshInProgress();
                filtersClearButton.addSelectionListener(new EraseItemListener());
                        return;

                ToolItem item = (ToolItem) e.widget;
        if (CommonUtils.isEmpty(activeDisplayName)) {
                }
                    }
    @Nullable
                    String hi = filtersHistory.get(i - 1);
        } else {
        viewer.setDataFilter(newFilter, true);
                menuManager.add(new ResetAllColorAction(viewer));

            return;
                filterToolbar.setVisible(enable);
                    historyBackButton.setEnabled(true);
            activeObjectPanel.redraw();

                Object sqlPanel = serviceSQL.createSQLPanel(viewer.getSite(), editorPH, viewer, ResultSetViewer.DEFAULT_QUERY_TEXT, false, viewer.getActiveQueryText());
            filterToolbar.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        }

                Rectangle rect = item.getBounds();

            ResultSetFilterContentAdapter contentAdapter = new ResultSetFilterContentAdapter(viewer);
                DBNDatabaseNode dcNode = dataContainer.getDataSource().getContainer().getProject()
            @Override
                @Override
    {
        enablePanelControls(false);
        }
                    false
            } else {

        @Override
        }
                menuManager.add(ActionUtils.makeCommandContribution(

            } else {
            super(addressBar, SWT.NONE);
                null, // This is workaround to open new SQL Editor with this dataContainer schema/catalog, not default
            StyledTextUtils.fillDefaultStyledTextContextMenu(filtersText);
            return historyTable;
                                    }
                filtersClearButton.setToolTipText(ActionUtils.findCommandDescription(
            if ((this.style & SWT.RIGHT) == SWT.RIGHT) gd.widthHint += 4;
            setToolTipText(ResultSetMessages.sql_editor_resultset_filter_panel_btn_open_console);
    private void setCustomDataFilter()
            }
            this.back = back;
                            DBInfoUtils.makeObjectDescription(monitor, attribute.getAttribute(), false),

            gd.heightHint = MIN_FILTER_TEXT_HEIGHT;
        }
        private Shell popup;
    void addFiltersHistory(String whereCondition)
    }
        return proposals.toArray(new IContentProposal[0]);
                    viewer.getSite(),

            historyPanel.setVisible(enable);
        private Shell popup;
        @Override
            }
            GC sizingGC = new GC(this);
            } else if (isItemEnabled()) {
        }
                e.gc.drawLine(x, e.y + 2, x, e.y + e.height - 4);
    private class HistoryPanel extends FilterPanel {
                    executePanel.redraw();
            this.historyPanel = new HistoryPanel(filterComposite);
                public void mouseUp(MouseEvent e) {
            Point controlRect = editControl.computeSize(-1, -1);
        if (filterToolbar != null && !filterToolbar.isDisposed()) {
                    panel.setBackground(textWidget.getBackground());
                            case SWT.CR:
        FilterPanel(Composite parent, int style) {



        private final boolean showHistoryItems;

        @Override


    }
                    IResultSetCommands.CMD_FILTER_CLEAR_SETTING
        //viewer.getControl().setFocus();

            this.showHistoryItems = showHistoryItems;
                if (historyMenu != null) {
            }

                Rectangle rect = item.getBounds();
    private class HistoryMenuListener extends SelectionAdapter {
            }
        if (context == null) {
            }
    }
            viewer.clearDataFilter(true);
            this.filtersText.setFont(BaseThemeSettings.instance.baseFont);
            super(parent, style);
    private void enablePanelControls(boolean enable) {
                filterExpanded ? filtersText.getSize().y : Math.min(textSize.y + 6, MIN_FILTER_TEXT_HEIGHT));
        }
                public void keyPressed(KeyEvent e) {
            filterExpandPanel.redraw();
                                    log.warn("Error deleting filter value [" + filterValue + "]", e1);


        Matcher m = mlCommentsPattern.matcher(displayName);
import org.eclipse.swt.layout.GridLayout;
        displayName = CommonUtils.compactWhiteSpaces(displayName);
                for (int i = historyPosition + (back ? -1 : 1); i >= 0 && i < stateHistory.size(); i += back ? -1 : 1) {
            gd.widthHint = enabledImageExpand.getBounds().width + 4;
            // So we take filters text background from the main ResultSetViewer
            }
                e.gc.drawImage(filterExpanded ? enabledImageCollapse : enabledImageExpand, e.x, e.y + 2);
            if (viewer.isRefreshInProgress()) {


    private final List<String> filtersHistory = new ArrayList<>();
                    } else {
        if (dataContainer instanceof DBSEntity) {
import org.eclipse.swt.layout.FillLayout;
                new TableItem(historyTable, SWT.NONE).setText("");
            if ((this.style & SWT.RIGHT) == SWT.RIGHT) {
        protected void paintPanel(PaintEvent e) {
                viewer.getActiveQueryText());
                    final String content = DBUtils.getQuotedIdentifier(attribute) + " ";
        protected boolean isItemEnabled() {
                width += executePanel.getSize().x;
            return new Point(
    private DBPImage getActiveObjectImage() {
            gd.heightHint = MIN_FILTER_TEXT_HEIGHT;
            Point parentRect = getDisplay().map(filtersText, null, new Point(0, 0));
        }
            popup = new Shell(getShell(), SWT.NO_TRIM | SWT.ON_TOP | SWT.RESIZE);
    }
            popup.setBounds(x, y, width, height);
    private String getActiveSourceQuery(boolean forUI) {
                public void mouseUp(MouseEvent e) {
    private final ActiveObjectPanel activeObjectPanel;
                Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
                    historyTable.setSelection(0);
                menuManager.add(new FilterResetAllTransformersAction(viewer));
            }
                        menuManager = new MenuManager();

            addMouseMoveListener(e -> {
        }
                e.gc.drawLine(
        private final int style;
        });
                        public void widgetSelected(SelectionEvent e) {
        }

                                item.dispose();
    }
                    ResultSetMessages.controls_resultset_viewer_show_hidden_columns,
                @Override
                    null,
                        final int selectionIndex = historyTable.getSelectionIndex();
                return;

            CSSUtils.setExcludeFromStyling(this.filterComposite);
                    }
                    openEditorForActiveQuery();
                    }
                filtersText.getText();
                        stateHistory.get(historyPosition - 1).describeState() +
import org.eclipse.swt.custom.StyledText;
    Control getEditControl() {
            return ((DBPImageProvider) dataContainer).getObjectImage();

            gl.marginHeight = 2;
    void setFilterValue(String whereCondition) {
            }

            }
            displayName = viewer.getActiveQueryText();
                return false;
            int panelHeight = hintSize.y;
        @NotNull
            if (!compactMode) {
    private ToolItem historyBackButton;
                popup.dispose();
            int historyPosition = viewer.getHistoryPosition();
            int x = parentRect.x + e.x + 1;

        }
            if (e.detail == SWT.ARROW) {
            }

    }
                }
            public void controlResized(ControlEvent e) {
            //this.refreshPanel = new RefreshPanel(filterComposite);
                                            getActiveSourceQueryNormalized(true),
            } else {
                if (context != null) {
    private final IME filtersIme;
    private static final int MIN_FILTER_TEXT_WIDTH = 50;
                historyBackButton.addSelectionListener(new HistoryMenuListener(historyBackButton, true));
            if (executePanel != null) {
        for (String kw : filterKeywords) {

                dataContainer,
                }
 * limitations under the License.

                e.gc.setBackground(hoverBgColor);
            }
        private final Image enabledImage, disabledImage;
                    e.x + 2, e.y + 2,
                ));

        private void showFilterHistoryPopup() {
        Pattern mlCommentsPattern = Pattern.compile("/\\*.*\\*/", Pattern.DOTALL);
            // Because filters text is activated after some panels it is not initialized
                historyMenu = new Menu(dropdown.getParent().getShell());
                                    if (context != null) {
            if (viewer.getDataContainer() instanceof DBSEntity) {
                    if (isImeComposing()) {
                @Override
import java.util.Locale;
 * Unless required by applicable law or agreed to in writing, software
        setRedraw(false);
            addDisposeListener(e -> UIUtils.dispose(dropImageD));

                UIUtils.dispose(disabledImageCollapse);

 *
                    viewer.getSite(),
                SQLUtils.appendConditionString(
            }
                viewer.refreshData(null);
    }
import org.jkiss.dbeaver.ui.contentassist.ContentProposalExt;
    public String getFilterText() {
            }

                        }
                Math.max(maxFilterTextWidth, Math.min(textSize.x + 10, maxWidth)),
        protected abstract boolean executeAction(MouseEvent e);
        displayName = displayName.replaceAll("--.+", "");
            });
                @Override
        if (enableFilters) {
                e.gc.drawImage(DBeaverIcons.getImage(UIIcon.CLOSE), x, e.y + 2);
            SQLConstants.KEYWORD_AND,
        }
                }
        }

                            item = historyTable.getItem(selectionIndex);
                }
                        }
                        }
        }

        gl.marginWidth = 3;
        }
            filtersText.setEditable(supportsDataFilter);

                            content,
            try {
            }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            }
                    e.doit = false;
                    redraw();
            int maxWidth = 0;
                x += 6;
 * You may obtain a copy of the License at
        StringBuilder currentCondition = new StringBuilder();
                                            filterValue
                    IWorkbenchCommandConstants.NAVIGATE_FORWARD_HISTORY
                filtersClearButton.setImage(DBeaverIcons.getImage(UIIcon.ERASE));
                }
            setLayoutData(gd);


            ) {
import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.model.sql.SQLUtils;

            this.activeObjectPanel = new ActiveObjectPanel(filterComposite, compactMode);
    void enableFilters(boolean enableFilters) {
                final String name = DBUtils.getUnQuotedIdentifier(attribute.getDataSource(), attribute.getName());
            enabledImage = DBeaverIcons.getImage(image);
                    ResultSetMessages.sql_editor_resultset_filter_panel_text_enter_sql_to_filter:
        } catch (DBException e) {
        if (whereCondition != null && !filtersText.getText().trim().equals(whereCondition.trim())) {
        public CustomFilterListener(boolean showHistoryItems) {
            return false;
            } else {
import org.jkiss.code.NotNull;
    }
                    }

        Composite panel = new Composite(popup, SWT.NONE);
                    true
                @Override
                RGB blendRGB = isDarkBG ? new RGB(255, 255, 255) : new RGB(0, 0, 0);
                    }
    public void updateActiveQueryDisplayText(String displayName) {
    }


            historyTable.addMouseTrackListener(new MouseTrackAdapter() {
            int maxFilterTextWidth = sizingGC.textExtent("X".repeat(maxTextLength)).x;
            if (context == null) {
                DBCExecutionContext context = viewer.getExecutionContext();
                return;
        }
    private void openEditorForActiveQuery() {
            this.addMouseListener(new DoubleClickMouseAdapter() {
            e.gc.setClipping(e.x, e.y, e.width - 8, e.height);
            int y = parentRect.y + e.y + 1;
        private final Image dropImageE, dropImageD;
        this.addDisposeListener(e -> {

                public void mouseUp(MouseEvent e) {
        this.viewer = rsv;
            }
        static final int MIN_INFO_PANEL_HEIGHT = 100;
                textSize.x += image.getBounds().width + 4;
                e.gc.drawImage(dropImageE, e.x + 4, e.y + 2);
        if (dataContainer instanceof DBPImageProvider) {

            } else {
            if (viewer.hasColumnTransformers()) {
                    mi.setText(state.describeState());
            if (y + height > displayRect.y + displayRect.height) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            Point hintSize = computeSize(SWT.DEFAULT, SWT.DEFAULT);
                menuManager.add(new FilterResetAllPinsAction(viewer));
            ));
        protected boolean executeAction(MouseEvent e) {
                textOffset += iconBounds.width + 2;
            if (executePanel != null) {

                return;
            SQLConstants.KEYWORD_NULL,

            menuManager.add(ActionUtils.makeCommandContribution(
        String displayName;
        private final Image enabledImageCollapse, disabledImageCollapse;
//                    viewer.getModel().getDataFilter().hasOrdering() ||
            int width = filterTextSize.x + historyPanel.getSize().x;

                    historyBackButton.setEnabled(false);
                    }
            setToolTipText(ResultSetMessages.filter_panel_filters_history_text);


                }
            }
                menuManager.add(ActionUtils.makeCommandContribution(
            }
                                filtersHistory.remove(filterValue);
    private void loadFiltersHistory(String query) {
                boolean isDarkBG = UIUtils.isDark(background.getRGB());
                historyBackButton.setImage(DBeaverIcons.getImage(UIIcon.RS_BACK));
    private final FilterExpandPanel filterExpandPanel;
                        new TableItem(historyTable, SWT.NONE).setText(hi);

            filterToolbar = new ToolBar(this, SWT.HORIZONTAL | SWT.RIGHT);
        protected void fillDropDownMenu(MenuManager menuManager) {
    }
                ));
                historyForwardButton.setImage(DBeaverIcons.getImage(UIIcon.RS_FORWARD));
                    e.x + e.width - 4, e.y + 2,
            UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
        }
            });
package org.jkiss.dbeaver.ui.controls.resultset;
        } else {
                    redraw();
            DBPImage activeObjectImage = getActiveObjectImage();

        protected boolean isItemEnabled() {

                public void mouseExit(MouseEvent e) {
                    ResultSetMessages.sql_editor_resultset_filter_panel_text_enter_filter_not_support
                    kw = dataSource.getSQLDialect().storesUnquotedCase().transform(kw);
                                break;
                return true;
                maxWidth = control.getSize().x / 4;
            try {
            this.filterComposite = new Composite(this, SWT.NONE);
                openEditorForActiveQuery();
    private String getActiveSourceQueryNormalized(boolean forUI) {

                public void focusLost(FocusEvent e) {
        DBPImage activeObjectImage = getActiveObjectImage();
                e.gc.drawImage(enabledImage, x, e.y + 2);
                popup.dispose();
        newFilter.setWhere(condition);
            }

                    if (ddMenu == null) {
            TextViewerUndoManager undoManager = new TextViewerUndoManager(200);

        Composite editorPH = new Composite(panel, SWT.NONE);
                    if (!CommonUtils.equalObjects(hi, curFilterValue)) {

                true
                ));
    //private final RefreshPanel refreshPanel;
            }
                        }
            if (viewer.getDataFilter().hasPinnedAttributes()) {
        }
        static final int MIN_INFO_PANEL_WIDTH = 300;
        @Override
    private void redrawPanels() {
            for (Control control = viewer.getControl().getParent(); maxWidth == 0 && control != null; control = control.getParent()) {
                        }
                    SpreadsheetCommandHandler.CMD_SHOW_COLUMNS,
                    // when user click on button and popup is already visible

            this.filtersIme = new IME(this.filtersText, SWT.NONE);
            // Update history buttons
                loadFiltersHistory(getActiveSourceQueryNormalized(false));
                    viewer.getModel().getDataFilter(),
                dataContainer.getDataSource().getContainer(),
    private Menu historyMenu;
    @NotNull
            gd.widthHint = dropImageE.getBounds().width + 6;
                        menuManager.update();

                editControl = createObjectPanel(popup);
                log.debug("Error saving filter", e);

        editorPH.setLayout(new FillLayout());
    @NotNull
                viewer.supportsDataFilter() ?
            }
                        }

            historyPanel.redraw();
                        closeHistoryPopup();

                @Override

            enabledImageCollapse = DBeaverIcons.getImage(UIIcon.ORIGINAL_SIZE);
                }

 * See the License for the specific language governing permissions and
        UIUtils.waitJobCompletion(searchJob);
                }
                {
                        historyPanel.showFilterHistoryPopup();

            List<ResultSetViewer.HistoryStateItem> stateHistory = viewer.getStateHistory();
        Label iconLabel = new Label(panel, SWT.NONE);
    private final ResultSetViewer viewer;
            int y = parentRect.y + getSize().y;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
                        if (isImeComposing()) {
            } catch (Throwable e) {
            setLayoutData(gd);
        } else if (dataContainer instanceof DBSEntity) {
        if (historyPanel != null && !historyPanel.isDisposed()) {
import java.util.regex.Pattern;
                if (!hover) {
            if (executePanel != null) {
            Table editControl = createFilterHistoryPanel(popup);
            editControl.getColumn(0).setWidth(tableWidth);
        }
    }
            //filtersText.setVisible(enable);
        filtersHistory.clear();
            IResultSetContainer parentContainer = viewer.getContainer().getParentContainer();

                UIUtils.dispose(disabledImageExpand);
import org.jkiss.dbeaver.ui.controls.StyledTextUtils;
                                }

            int x = e.x;
            });
                    }

        return filtersText.getText();
                closeHistoryPopup();
        }
                                final String newFilter = item.getText();
        GridLayout gl = new GridLayout(2, false);
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.FILL_VERTICAL);
            popup = new Shell(getShell(), SWT.ON_TOP | SWT.RESIZE);
                        if (selectionIndex != -1) {
            @Override
            CSSUtils.markConnectionTypeColor(filterToolbar);
            });
        GridData gd = (GridData) filtersText.getLayoutData();


            ac.setCriteria(null);

        };
                historyMenu.dispose();
            }
        private Menu ddMenu;
            SQLConstants.KEYWORD_LIKE};
                            content.length(),
        final boolean oldFilter = filtersHistory.remove(whereCondition);
            super.dispose();
        }
import org.eclipse.swt.graphics.*;
                    MenuItem mi = new MenuItem(historyMenu, SWT.NONE);
            int maxTextLength = compactMode ? 16 : 24;
        @Override
    private boolean filterExpanded = false;
                    if (hoverItem != null) {

                false
            historyTable.addMouseListener(new MouseAdapter() {
        }
        protected boolean hover = false;
            popup.setLayout(new FillLayout());
        @Override
                }
        boolean isDark = UIStyles.isDarkTheme();

            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.FILL_VERTICAL);
                @Override
                                if (historyTable.getSelectionIndex() <= 0) {
            if (parentContainer != null && parentContainer.getResultSetController() instanceof ResultSetViewer rsv
            gl.verticalSpacing = 0;
                @Override
                if (CommonUtils.isEmpty(attrName) || name.toLowerCase(Locale.ENGLISH).startsWith(attrName)) {
                e.gc.drawLine(
            SQLUtils.appendConditionString(
        @Override

            gd.heightHint = MIN_FILTER_TEXT_HEIGHT;

            e.gc.drawText(activeDisplayName, textOffset, (e.height - textHeight) / 2);
        }

                            return;
                    }
        protected void executeDefaultAction() {
                viewer.getModel().getDataFilter(),
    }
            if (historyForwardButton != null) {
                    historyMenu.dispose();

            Point textSize = sizingGC.textExtent(activeDisplayName);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            if (!compactMode) {
            filtersText.getText();
        private final Image enabledImageExpand, disabledImageExpand;
            List<ResultSetViewer.HistoryStateItem> stateHistory = viewer.getStateHistory();
            int textOffset = 2;
            ToolItem filtersCustomButton = new ToolItem(filterToolbar, SWT.NO_FOCUS | SWT.DROP_DOWN);
        @Override
            editControl.setFocus();
import org.jkiss.dbeaver.model.*;
                    context.getDataSource(),
            if (dataSource != null) {

                                hoverItem = null;
            throw new PartInitException("Cannot create filter panel because SQL service is not available");
            final Table historyTable = new Table(popup, SWT.BORDER | SWT.FULL_SELECTION | SWT.SINGLE);
            if (y + height > displayRect.y + displayRect.height) {
                if (historyPosition > 0) {
                }
            }
            final ScrollBar vsb = editControl.getVerticalBar();
            }
import org.eclipse.swt.layout.GridData;
    ResultSetFilterPanel(@NotNull ResultSetViewer rsv, @NotNull Composite parent, boolean compactMode) {
            if (serviceSQL != null) {
        }
    private class ActiveObjectPanel extends FilterPanel {

import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;

                filtersClearButton.setEnabled(true);
            }

        }
            filtersText.setEditable(viewer.supportsDataFilter() && enable);

            e.gc.setForeground(shadowColor);
                log.error(e);
                @Override
    private abstract static class AbstractDropDownListener extends SelectionAdapter {
        if (adapter == IUndoManager.class) {
                            attribute.getName(),
        }
        public void widgetSelected(SelectionEvent e) {
 */
                return true;

                                setFilterValue(newFilter);
        private void showObjectInfoPopup(MouseEvent e) {
        return dataContainer != null && dataContainer.isFeatureSupported(DBSDataContainer.FEATURE_DATA_FILTER);
            if ((e.stateMask & SWT.CTRL) != 0) {

            int textHeight = e.gc.getFontMetrics().getHeight();

            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
                                        );
                    hover = false;
                historyMenu.setVisible(true);
            this.compactMode = compactMode;
            setLayoutData(gd);
        } catch (Throwable e) {
        }
                filtersText,
        try {
            this.filtersTextViewer = new TextViewer(filterComposite, SWT.MULTI);
}
                Image icon = DBeaverIcons.getImage(activeObjectImage);

            }
            DBDAttributeBinding[] attributes = viewer.getModel().getAttributes();
            int width = Math.min(filterComposite.getSize().x, Math.max(MIN_INFO_PANEL_WIDTH, controlRect.x + 30));
 * DBeaver - Universal Database Manager
    private Control createObjectPanel(Shell popup) throws PartInitException {
        ExecutePanel(Composite addressBar) {
        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    }
        DBDDataFilter newFilter = new DBDDataFilter(viewer.getModel().getDataFilter());
        RefreshPanel(Composite addressBar) {
                    historyForwardButton.setEnabled(false);
            if (filterExpandPanel != null) {
            StyledTextUtils.enableDND(this.filtersText);
                DBWorkbench.getPlatformUI().showError("Object info", "Error opening object info", e1);
            }
            this.filtersText.addVerifyKeyListener(e -> {
        this.getParent().layout(true);
            });
            int historyPosition = viewer.getHistoryPosition();
    }
                        new ContentProposalExt(
                    proposals.add(
            final Collection<String> history = viewer.getFilterManager().getQueryFilterHistory(context, query);
        protected ToolItemPanel(Composite addressBar, DBPImage image, String toolTip, int style) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.SWT;


    private static final int MAX_HISTORY_PANEL_HEIGHT = 200;
                this.executePanel = new ExecutePanel(filterComposite);
                width += filterExpandPanel.getSize().x;
        }
            SQLConstants.KEYWORD_OR,

                public void keyPressed(KeyEvent e) {
            setLayoutData(gd);

            }
                    e.detail = SWT.TRAVERSE_NONE;
        }
                ));
//        gl.horizontalSpacing = 0;
            gd.widthHint = 4 + enabledImage.getBounds().width;
                //this.activeObjectPanel = null;
            addMouseListener(new MouseAdapter() {
            filtersProposalAdapter = ContentAssistUtils.installContentProposal(
            e.gc.setForeground(shadowColor);
        }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
            Control editControl;
                        ddMenu = menuManager.createContextMenu(item.getParent().getShell());
                    popup.dispose();
            });
            if (filtersClearButton != null) {
            }
    private final StyledText filtersText;
            }
                                setCustomDataFilter();
                e.gc.drawImage(disabledImage, x, e.y + 2);
        if (m.find()) {
        }
            if (popup != null) {
            GridData gd = new GridData(GridData.FILL_BOTH);
                executeDefaultAction();
            disabledImageCollapse = new Image(enabledImageCollapse.getDevice(), enabledImageCollapse, SWT.IMAGE_GRAY);
        if (activeObjectImage != null) {
import org.jkiss.dbeaver.model.runtime.SystemJob;
            filtersCustomButton.addSelectionListener(new CustomFilterListener(compactMode));

                menuManager.add(new Separator());
        gl.marginHeight = 3;
        @Override
        if (activeObjectPanel != null && !activeObjectPanel.isDisposed()) {
            addPaintListener(this::paintPanel);
            if (historyMenu != null) {
                            viewer.navigateHistory(statePosition);
    }
        }
    }
            if (showHistoryItems) {
        super(parent, SWT.NONE);
            SQLConstants.KEYWORD_BETWEEN,
                Color hoverBgColor = UIUtils.getSharedTextColors().getColor(hoverRgb);
                editorName,
        }

            addDisposeListener(e -> UIUtils.dispose(disabledImage));
            } catch (DBException e) {
                    } else if (e.character == SWT.CR || e.character == SWT.LF) {
                                }
        }
            sizingGC.setFont(BaseThemeSettings.instance.baseFont);
                public void focusLost(FocusEvent e) {
    private void togglePanelExpand() {
    @Override
                    }
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.FILL_VERTICAL);
        SystemJob searchJob = new SystemJob("Extract attribute proposals", reader);
        }
                    mi.addSelectionListener(new SelectionAdapter() {

                historyBackButton.setEnabled(false);
                    filtersText.redraw();
        // Handle all shortcuts by filters editor, not by host editor
                Image image = DBeaverIcons.getImage(activeObjectImage);
            }
            }
        DBPDataSource dataSource = viewer.getDataSource();
//                    viewer.getModel().getDataFilter().hasFilters() ||
            e.gc.setForeground(e.gc.getDevice().getSystemColor(SWT.COLOR_DARK_GREEN));
                        return;
            if (activeObjectImage != null) {

        String attrName = wordDetector.getFullWord().toLowerCase(Locale.ENGLISH);
        public void dispose() {
        }

import java.util.Collection;
            return filtersText;
                }
                    if (isImeComposing() || filtersProposalAdapter.isProposalPopupOpen()) {
            if (attrName.isEmpty() || kw.startsWith(attrName.toUpperCase())) {
                }
import org.jkiss.dbeaver.ui.*;
            }
        CSSUtils.markConnectionTypeColor(this);
                                closeHistoryPopup();
import org.jkiss.dbeaver.ui.controls.resultset.actions.FilterResetAllSettingsAction;
 * ResultSetFilterPanel


                executePanel.setEnabled(supportsDataFilter);
                public void mouseEnter(MouseEvent e) {

                    //hoverItem = historyTable.getItem(new Point(e.x, e.y));
    @Override
            DBPImage activeObjectImage = getActiveObjectImage();
                historyForwardButton.setEnabled(false);
    }
                IResultSetCommands.CMD_FILTER_EDIT_SETTINGS,
        filtersHistory.add(whereCondition);
            displayName = ResultSetMessages.sql_editor_resultset_filter_panel_show_sql_label;
    private boolean isImeComposing() {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.dbeaver.ui.css.CSSUtils;
            setToolTipText(toolTip);
                    togglePanelExpand();
        }
                    viewer.getSite(),

            this.filtersText.addTraverseListener(e -> {
        }
            });
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;
 * you may not use this file except in compliance with the License.
                menuManager.add(new FilterResetAllSettingsAction(viewer));
            }
        panel.setLayout(gl);
import java.util.List;
            sizingGC.dispose();
        }
        DBSDataContainer dataContainer = viewer.getDataContainer();

            if (enableFilters && !CommonUtils.equalObjects(prevQuery, displayName)) {
                        setCustomDataFilter();
                    continue;
            }
            new CompositeBorderPainter(this.filterComposite);
            return;
        {

            // This is a kind of hack.
        HistoryPanel(Composite addressBar) {
                        // don't apply filter(need to commit symbols)

                viewer.getSite(), IResultSetCommands.CMD_FILTER_EDIT_SETTINGS));
            activeDisplayName = ResultSetViewer.DEFAULT_QUERY_TEXT;
                } else {
        filtersText.redraw();
        protected abstract boolean isItemEnabled();
import org.eclipse.jface.text.Document;
            popup.setBounds(x, y, width, height);
            gl.horizontalSpacing = 0;
            if (popup != null) {
        iconLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
