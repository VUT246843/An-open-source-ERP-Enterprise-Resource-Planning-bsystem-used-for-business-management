                if (newRowIndex > model.getRowCount()) {
                DBCLogicalOperator[] operators = attribute.getValueHandler().getSupportedOperators(attribute);
        } catch (DBException e) {
                                final DBVTransformSettings settings = getTransformSettings();
            // out of range
    {
    public void setDataContainer(DBSDataContainer targetEntity, DBDDataFilter newFilter) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            if (context != null) {
                    } else {
        return listenersCopy;
            }
            executionContext,
                }
                tb.update(true);
            manager.add(new Separator());
            }
        // Update dynamic find/replace target
    private void setActivePresentation(@NotNull IResultSetPresentation presentation) {
            }
                autoRefreshControl.scheduleAutoRefresh(error != null);
        if (!(targetEntity instanceof DBSDataContainer)) {
            // By default panels are visible for column presentations

                    isPanelVisible(((ResultSetPanelDescriptor) child.getData()).getId());
        return viewerSash != null && viewerSash.getMaximizedControl() == null;
    }
        if (curState == null) {
    @Override
        }
    }
            CSSUtils.markConnectionTypeColor(addToolBar);
    @Override
    private boolean saveChanges(@Nullable final DBRProgressMonitor monitor, @NotNull ResultSetSaveSettings settings, @Nullable final ResultSetPersister.DataUpdateListener listener)
        if ((decoratorFeatures & IResultSetDecorator.FEATURE_PANELS) != 0 || (decoratorFeatures & IResultSetDecorator.FEATURE_PRESENTATIONS) != 0) {
        }
    public void updatePanelActions() {
            int segmentSize = getSegmentMaxRows();
                }
        viewerSash.setOrientation(settings.verticalLayout ? SWT.VERTICAL : SWT.HORIZONTAL);

        } else {
            themeUpdateJob.cancel();
            activePresentationDescriptor != null &&
            {
                    } else {



                    }
                if (con2.getOrderPosition() > constraint.getOrderPosition()) {
import org.eclipse.core.runtime.IProgressMonitor;
                public void run() {
                    getAutoRefresh().enableControls(false);
            });
            if (cl == DBDValueHintContext.HintConfigurationLevel.ENTITY && !singleSource) {
    @Nullable
        DBSDataContainer dataContainer = getDataContainer();
        @Nullable int[] rowIndexes,
            return;
            viewerSash.setOrientation(verticalLayout ? SWT.VERTICAL : SWT.HORIZONTAL);
            });
                    this.selectedRecords = selectedRowsIncludingNewRow(newRowIndex);
                    return;
            if (event.getSource() instanceof DBPDataSourceContainerProvider) {
        @NotNull IMenuManager filtersMenu,
//        if (viewerSash.getMaximizedControl() == null) {
                        MenuManager extCopyMenu
        }
                }
        } else {
                        redrawData(visibilityChanged, false);
        @Nullable DBPDataSourceContainer dataSource,
        if (panelInfo != null) {
        Object[] state = new Object[1];
            }
            gd.horizontalSpan = ((GridLayout) mainPanel.getLayout()).numColumns;
        this.mainPanel.setGridLayout(supportsPanels ? 3 : 2);
                        int[] weights = viewerSash.getWeights();
        if (dataSource == null) {
            // Show script as confirmation
                editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_CELL_RESET));
        if (ownAttrs.isEmpty()) {
    public boolean activatePanel(String id, boolean setActive, boolean showPanels) {
                    pb.setVisible(!recordMode || descriptor.supportsRecordMode());
                    updateEditControls();
            }

                    ResultSetPreferences.RESULT_SET_PRESENTATION, activePresentationDescriptor.getId());
        } else {
        }
            if (panel.getId().equals(id)) {
    class HistoryStateItem {
            configLevelMenu.addMenuListener(this::fillAttributeHintsConfigLevelMenu);

                    public void widgetSelected(SelectionEvent e) {
                        if (activeTab != null) {
        this.defaultBackground = isDarkHighContrast ? UIStyles.getDefaultWidgetBackground() : UIStyles.getDefaultTextBackground();

        }
    private final IPropertyChangeListener propertyEvaluationRequestListener = ev -> {
    @Override
            this.filter = filter;
        public String toString() {

            manager.add(viewMenu);
            default -> isHasMoreData();
        boolean filterFocused = filtersPanel.getEditControl().isFocusControl();
        DBDAttributeBinding[] curAttributes = model.getRealAttributes();

            filtersPanel.enableFilters(enableFilters);
                filtersMenu.add(new Separator());
        final int offset,
    /**
    }
        }
                if (spd.open() == IDialogConstants.OK_ID) {
            return false;
                                cells[0] = docAttribute.getValueHandler().getValueFromObject(session, docAttribute, origRow[0], true, false);
        }
            setStatusTooltip(tooltip);
    }
        }
            }
                        case EDIT -> DTUIMessages.value_format_selector_editable;
                .format(EXECUTION_TIME_FORMATTER);
            this.refreshData(null);
            // Reset order
                default -> {
                    if (oldFetchSize != fetchSize) {
            // Make sure focus cell is visible
            filtersPanel.getEditControl().setFocus();
                );
    public void showFiltersDistinctMenu(DBDAttributeBinding curAttribute, boolean atKeyboardCursor) {
        } catch (DBException e) {

        }
        @NotNull ContextMenuLocation menuLocation
            IResultSetPanel visiblePanel = getVisiblePanel();
                ToolBarManager panelToolBar = new ToolBarManager(SWT.HORIZONTAL | SWT.RIGHT | SWT.FLAT);
    // Mode
        this.selectedRecords = new int[selectedRows.size()];
        final Set<String> enabledPanelIds = new LinkedHashSet<>();
                if (!(activePresentation instanceof StatisticsPresentation)) {


        final DBSDataContainer dataContainer = getDataContainer();
        if (state.containsKey("options")) {
        return new UIConfirmation() { @Override public Boolean runTask() { return checkForChanges(); } }.confirm();
    public void navigateReference(@NotNull DBRProgressMonitor monitor, @NotNull ResultSetModel bindingsModel, @NotNull DBSEntityAssociation association, @NotNull List<? extends DBDValueRow> rows, boolean newWindow)
                if (dataPumpRunning.get()) {
    }
                DBPMessageType.INFORMATION, null);
            return;
        statusLabel.setStatusTooltip(message);
            if (statusBar != null) {
                presentationSwitchFolder.setEnabled(false);

    }
        ConfigAction()
import org.jkiss.dbeaver.ModelPreferences;
        if (executionContext == null || dataContainer.getDataSource() != executionContext.getDataSource()) {
    public int promptToSaveOnClose()
            @NotNull Composite progressControl,
     * @param indexes the indexes to group
        if (identifier instanceof DBVEntityConstraint) {
        }
    }
        return new UIConfirmation() {
    @Override
        runDataPump(targetEntity, newFilter, 0, getSegmentMaxRows(), -1, true, false, false, null);
            return;
                }
            dataReceiver.setNextSegmentRead(true);
                            getActivePresentation().setCurrentAttribute(model.getVisibleAttribute(0));
        if (executionContext == null) {
    public void setInput(Object input)
            CTabItem curItem = panelFolder.getSelection();
                    if (!realValue.equals(resultSetSize.getText())) {
        }
        }
        this.model.clearData();
        ResultSetPanelDescriptor panelDescriptor = getPanelDescriptor(id);
    private Text resultSetSize;
        result[0] = DBUtils.readRowCount(monitor, executionContext, dataContainer, model.getDataFilter(), this);

        }

    }
                ResultSetHandlerTogglePanel.CMD_TOGGLE_PANEL,
                        DBWorkbench.getPlatformUI().showError("Presentation activate", "Can't instantiate data view '" + newPresentation.getLabel() + "'", e);

                        showPanels(false, true, true);
     */
            menuService.populateContributionManager(addToolBarManager, TOOLBAR_CONTRIBUTION_ID);

        }
    private boolean confirmProceed() {
            ResultSetReferenceMenu.fillRefTablesActions(monitor, this, getSelectedRows(), singleSource, refTablesMenu, openInNewWindow);
    @Nullable
        }

        ToolBar toolBar = actionToolBar.getControl();

//        }
            } else {
    public boolean hasColumnTransformers() {

            }
                    } catch (Throwable e) {
                                    controller.updateValue(sourceValue, false);
                    try {
        }
        if (activePresentation instanceof ISelectionProvider) {
    }
            if (settings == null) {
                    } else {
            try {
        }
    @NotNull

        Object endTime;
            });
        this.autoRefreshControl = new AutoRefreshControl(
        }
        popup.setModeless(true);
        if (getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME)) {
                            attrs,
            final Menu contextMenu = menuManager.createContextMenu(getActivePresentation().getControl());
        return model.getDataFilter();
            }
    }
                            }
                this.panelFolder.addSelectionListener(new SelectionAdapter() {
                setDataFilter(filter, true);
                protected ILoadService<String> createLoadService() {
                String msgSelectRowColor = NLS.bind(ResultSetMessages.actions_name_color_by, bindingText);
        }
    public void closePanel(String panelId) {
                return dataContainer.getName();
                return;
                    savedConfig.restoreDataFilter(monitor, dataContainer, dataFilter);
    @NotNull
        statusBar.setLayout(toolbarsLayout);
        return null;

                if (!this.availablePresentations.isEmpty()) {
            // Hints
                    if (type == FilterByAttributeType.NONE) {

        // Row colors
                    }
            }
        }

        } else if (result == IDialogConstants.NO_ID) {
                "Entity [" + DBUtils.getObjectFullName(targetEntity, DBPEvaluationContext.UI) + "] association [" + association.getName() +
                        attr,
        @NotNull DBDAttributeConstraint constraint
     * It is a hack function. Generally all command associated widgets should be updated automatically by framework.
        fillFiltersMenu(menuManager, curAttribute, getCurrentRow());
        if (!supportsPanels()) {
            if (filters != null) {
    private void navigateEntity(@NotNull DBRProgressMonitor monitor, boolean newWindow, DBSEntity targetEntity, List<DBDAttributeConstraint> constraints) {
import org.jkiss.dbeaver.utils.GeneralUtils;
            DBDAttributeConstraint constraint = getModel().getDataFilter().getConstraint(attribute);
                    }
        } finally {
        if (rowCountLabel != null && !rowCountLabel.isDisposed()) {

    ) {
        }
//        }
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
    }
    }

        if (ConfirmationDialog.confirmAction(

                    } catch (Throwable e) {
                    item.setText(pd.getLabel());
            // Save in global preferences
        );
        }
    }
        };
            List<ValueHintProviderDescriptor> allHints = ValueHintRegistry.getInstance().getHintDescriptors(ho).stream()
                () -> {
            @Override
                partitionedSelectedRows = groupConsecutiveRows(

    private PresentationSettings getPresentationSettings() {
        }
        activePresentationDescriptor = null;
import org.eclipse.jface.viewers.*;
    @Override
        private final int focusRow;

            return;
        }
        if (project != null) {
                    manager.add(ActionUtils.makeCommandContribution(
        this.dataPropertyListener = event -> {
            }
                        return adapted;
                panelsMenuManager.setRemoveAllWhenShown(true);
        }
        });
        if (!newRow) {
                        extCopyMenu.addMenuListener(manager1 -> ResultSetHandlerCopyAs.fillCopyAsMenu(ResultSetViewer.this, manager1));
     * Adds new data read job in queue.
        if (curState != null && newRow != null) {
        final Menu contextMenu = columnMenu.createContextMenu(getActivePresentation().getControl());

            }
                return Status.OK_STATUS;

                constraint.setVisible(true);
        queueDataPump(dataPumpJob);
    public boolean switchPresentation(ResultSetPresentationDescriptor selectedPresentation) {

                true,
        } finally {
        try {
            );
                    con2.setOrderPosition(con2.getOrderPosition() - 1);
                actionsDisabled = true;

        boolean verticalLayout;

        //DBSDataContainer dataContainer = DBUtils.getAdapter(DBSDataContainer.class, targetEntity);

            ((ISelectionProvider) presentation).addSelectionChangedListener(this::fireResultSetSelectionChange);

            IDialogSettings pSections = ResultSetUtils.getViewerSettings(SETTINGS_SECTION_PRESENTATIONS);
            HistoryStateItem item = stateHistory.get(i);
                    }
                selectedRows = Collections.singletonList(model.getRow(0));
                    updateFiltersText(false);
                    synchronized (dataPumpJobQueue) {
            model.setUpdateInProgress(this);

            constraint.setValue(keyValues);
            }
                attr,
            parent,
        }.schedule();
        activePanels.clear();
    public void persistConfig() {
                        newPresentations = Collections.singletonList(preferredPresentation);

        }

        super();
    }
    private final ConComposite mainPanel;
    }

    private void dispose()
    @NotNull
        }

            int segmentSize = getSegmentMaxRows();
            for (int[] partitionRange : partitionedSelectedRows) {
                    panelButton.setChecked(panelsVisible && isPanelVisible(panel.getId()));
            curRow = model.getRow(selectedRecords[0]);
    private class EmptySelection extends StructuredSelection implements IResultSetSelection {
            String panelIdList = pSection.get("enabledPanelIds");
            //model.setDataFilter(dataFilter);

    }
                        }
                    VerticalButton item = new VerticalButton(presentationSwitchFolder, SWT.LEFT | SWT.RADIO);
    }
                this,
                for (FilterByAttributeType type : FilterByAttributeType.values()) {
    }
            layoutMenu.add(new ToggleSelectionStatAction(this, ResultSetPreferences.RESULT_SET_SHOW_SEL_COLUMNS,
        }
        DBSDataContainer dataContainer = getDataContainer();
            }
        // Add association constraints
                        }
        settings.activePanelId = panelId;
                        PrefUtils.savePreferenceStore(store);
                final MenuManager editMenu = new MenuManager(
            for (String panelId : new ArrayList<>(settings.enabledPanelIds)) {
    }
    public Color getDefaultBackground() {

                                }
                    T adapted = ((IAdaptable) visiblePanel).getAdapter(adapter);
            }
            listenersCopy = listeners.toArray(new IResultSetListener[0]);
        } else {
    // Data & metadata
        filtersMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FILTER_CLEAR_SETTING));
        if (dataSource != null && !dataSource.getContainer().getNavigatorSettings().isHideVirtualModel()) {
            CTabItem panelTab = new CTabItem(panelFolder, SWT.CLOSE);
        boolean panelsActive = UIUtils.hasFocus(panelFolder);
import org.jkiss.dbeaver.model.exec.*;
            } else {

    {
                ToolBar tb = panelToolBar.getControl();
            Map<String, Object> state = saveConstraintVisualState(constraint);
            abstractPresentation.applyThemeSettings(UIUtils.getCurrentTheme());
        if (activePresentation != null) {
                            // Keep the same presentation
        if (focusRow > 0 && focusRow < model.getRowCount()) {
    public boolean applyChanges(@Nullable DBRProgressMonitor monitor, @NotNull ResultSetSaveSettings settings)
        // Add new row
            });
            lastRowNum = row.getVisualNumber();
            isUIUpdateRunning = false;
import org.eclipse.jface.resource.JFaceResources;
        }
            if (dataSource != null) {
        lockedBy.addDisposeListener(e -> actionsDisabled = false);
            selectionStatLabel.setText(stats);
            }
    @Override
                            }
                true,
    public String getReadOnlyStatus(@Nullable DBPDataSourceContainer dataSourceContainer) {
            filters.add(filterValue);
    public boolean supportsDataFilter() {
                }

            panelTab.setImage(DBeaverIcons.getImage(panelDescriptor.getIcon()));
            mainPanel.setRedraw(true);
            // Ignore
    {
        statusBar = new ConComposite(parent, SWT.NONE);
        model.updateDataFilter();
        if (customTransformers != null && !customTransformers.isEmpty()) {
import org.jkiss.code.NotNull;
            if (model.deleteRow(row)) {
            Object value = popup.getValue();
            persistConfig();
            if (model.getVisibleAttributeCount() == 0) {
            return;
    public static final String DEFAULT_QUERY_TEXT = "SQL";
        }
            try {
    @Override
        updateFiltersText(true);
            }
                    }
    @NotNull
        @NotNull ResultSetRow row,

            if (dataContainer != null) {
    {
        UIUtils.applyMainFont(panelSwitchFolder);
                    @Override
    private void fillAttributeHintsConfigLevelMenu(IMenuManager menuManager) {
        if (model.isSingleSource()) {
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;
    }
            showContextMenuAtCursor(menuManager[0]);
        toolbarsLayout.pack = true;
        return dataContainer != null && dataContainer.isFeatureSupported(DBSDataContainer.FEATURE_DATA_FILTER);
    public int getHistorySize() {
        mainPanel.setRedraw(false);
                }
            settings.panelsVisible = activePresentationDescriptor != null &&
        }
        boolean newRow = (curRow != null && curRow.getState() == ResultSetRow.STATE_ADDED);
            setNewState(container.getDataContainer(), model.getDataFilter());
    public DBPPreferenceStore getPreferenceStore() {
                case DBVEntityConstraint c -> {
                        List<DBDAttributeBinding> visibleAttributes = model.getVisibleAttributes();
            rowShift = newRow.getVisualNumber() - curRow.getVisualNumber();

            if (dataPumpRunning.get()) {
                manager.add(new Separator());

                    selectedRows.stream()
    void releaseDataReadLock() {
    }
            MenuManager hintsMenu = new MenuManager(ResultSetMessages.controls_resultset_viewer_action_view_hints);
                                    final DBSAttributeBase attribute = metaAttr.getAttribute();
            dataReceiver.setNextSegmentRead(false);
                filtersMenu.add(new OrderByAttributeAction(this, attribute, ColumnOrder.NONE));
        {
        }
                    if (useAllColumnsAsKey) {
            }
        return panelInfo == null ? null : panelInfo.panel;
                return Status.CANCEL_STATUS;
                if (statusBar != null) {

        for (IResultSetListener listener : getListenersCopy()) {
            settings = UITask.run(() -> {
                getControl().getShell(),
            if (status != null) {
        var composite = new ConComposite(mainPanel);
                if (ConfirmationDialog.confirmAction(

            customTransformer = registry.getTransformer(transformSettings.getCustomTransformer());
                    constraint.setValue(null);
            if (!pVisible) {
    }
        }
        }

    @Nullable
        return CommonUtils.isBitSet(decorator.getDecoratorFeatures(), feature);

                            }
                    panelButton.setData(panel);
    }
                IAction.AS_RADIO_BUTTON,
            boolean scroll,
    void appendData(@NotNull DBRProgressMonitor monitor, List<Object[]> rows, boolean resetOldRows) {

            model.getSingleSource() instanceof DBSDataManipulator &&
    private void fillColumnViewMenu(IMenuManager viewMenu, @NotNull DBDAttributeBinding attr, @Nullable ResultSetRow row, ResultSetValueController valueController) {
                    TransformerSettingsDialog settingsDialog = new TransformerSettingsDialog(
    }
    }
        PlatformUI.getWorkbench().getThemeManager().addPropertyChangeListener(themeChangeListener);
        }
            UIUtils.addDefaultEditActionsSupport(site, resultSetSize);
                this.panelFolder.addListener(SWT.Resize, event -> {
        final DBPDataSource dataSource = getDataSource();
        } else {
            if (!dataPumpRunning.get()) {
                    if (descriptor.isApplicableByDefault()) {
        DBDAttributeConstraint constraint = dataFilter.getConstraint(columnElement);
    @NotNull

                    if (type.getValue(this, attribute, DBCLogicalOperator.EQUALS, true) == null) {
                    true,
                    manager.add(filtersMenu);
                        IResultSetCommands.CMD_COPY_COLUMN_NAMES,
    ) {
                    return true;
                            for (int index = 0; index < attributes.length; index++) {
        doSave(RuntimeUtils.makeMonitor(monitor));
        if (virtualEntity.getTransformSettings() != null && virtualEntity.getTransformSettings().hasValuableData()) {
        }

                UIIcon.REFRESH,
    public void setSelectedRecords(int[] indexes) {
    }
                                        IValueController.EditType.NONE,
                // Statistics - let's use special presentation for it

                        saveTransformerSettings();
            // If we have deleted or updated rows then check for unique identifier
        OrderingStrategy orderingMode = OrderingStrategy.get(this.getPreferenceStore());

        if (supportsPanels) {

        if (needPK) {
    @Override
            PresentationSettings settings = new PresentationSettings();
        if (!checkForChanges()) {
                    setNewState(dataContainer, executionSource.getUseDataFilter());

import org.jkiss.dbeaver.ui.controls.autorefresh.AutoRefreshControl;
                        DBeaverIcons.getImageDescriptor(UIIcon.FILTER),

            }
            setNewState(targetEntity, model.getDataFilter());
        IDialogSettings pSections = ResultSetUtils.getViewerSettings(SETTINGS_SECTION_PRESENTATIONS);
                        // Fill leftover cells with null values, if needed
            if (model.getRowCount() > 0) {
            Object[] keyValues = new Object[rows.size()];
    }
    }
                statusMessage =
                Collections.singletonList(row),
        if (attribute != null) {
                                this,
                    wasn't empty. Previously we didn't update the selected row count which caused a problem described in #15767
        if (attr != null) {
                (activePresentationDescriptor.getPresentationType() == IResultSetPresentation.PresentationType.COLUMNS);
        @Override
        ResultSetPersister persister = new ResultSetPersister(this);
        }
        } catch (InvocationTargetException e) {

                DBeaverIcons.getImageDescriptor(UIIcon.PANEL_CUSTOMIZE),
            return "ResultSetDataPumpJob: " + getName();
                }
        if (!verifyQuerySafety()) {
        if (panelTab != null) {
        if (panelFolder != null) {
            if (resultSet instanceof StatResultSet) {
    public void resetHistory() {
 * ResultSetViewer

            toolbarList.add(addToolBarManager);
                    filtersMenu.setActionDefinitionId(IResultSetCommands.CMD_FILTER_MENU);
                                        session,
        }
                        ResultSetMessages.controls_resultset_viewer_status_rows_fetched,
    ) {
        }
            trackPresentationStatistics();
    public boolean refreshData(@Nullable Runnable onSuccess) {
            binaryFormatMenu.setRemoveAllWhenShown(true);
    private void fillAttributeTransformersMenu(IMenuManager manager, final DBDAttributeBinding attr) {
            String desc = dataContainer.getName();
        if (rowsToDelete.isEmpty()) {
                }
                } else {
                                    final Object sourceValue = metaAttr.getValueHandler().getValueFromObject(
//            }

        boolean panelsVisible = isPanelsVisible();
        }
        } else {
                    if (isChecked()) {
            DBDDataFilter dataFilter = restoreDataFilter(dataContainer);

            setActivePresentation(instance);
        return availablePresentations != null ? availablePresentations : Collections.emptyList();
    }
            DBWorkbench.getPlatformUI().showError("Apply changes error", "Error saving changes in database", e);
    }
    /**
            ToolBar navToolBar = navToolBarManager.createControl(statusBar);
            this.presentationSettings.put(activePresentationDescriptor, settings);
    }
                    if (error instanceof DBSQLException) {
                MENU_ID_LAYOUT); //$NON-NLS-1$
                            final Object[] origRow = model.getRowData(srcRowIndex);
    }
            manager.add(viewMenu);
    }

                }
                null,
            return Collections.emptyList();
        loadPresentationSettings();
        }
                UIUtils.asyncExec(() -> {
                                throw new InvocationTargetException(e);
                    };
                            if (!dataPumpJobQueue.isEmpty()) {
    }
                filtersPanel.getFilterText(),
                        } catch (Exception e) {
                boolean newChecked = panelsVisible &&

    private static final DecimalFormat ROW_COUNT_FORMAT = new DecimalFormat("###,###,###,###,###,##0");
        }
            log.debug("Panel '" + id + "' not found");
        Set<ResultSetRow> rowsToDelete = new LinkedHashSet<>();
                        model,
                    });
                DBDAttributeConstraint constraint = new DBDAttributeConstraint(attribute, DBDAttributeConstraint.NULL_VISUAL_POSITION);
            ISelection selection = ((ISelectionProvider) activePresentation).getSelection();
        long fetchTime = statistics.getFetchTime();

                for (ResultSetPresentationDescriptor pd : availablePresentations) {
        return false;
        public List<DBDAttributeBinding> getSelectedAttributes() {
                        DBWorkbench.getPlatformUI().showError("Error executing query", "Query execution failed", error);
        curState = null;
                final DBSDataContainer dataContainer = executionSource.getDataContainer();
        }

                                settings.setCustomTransformer(descriptor.getId());

    {
        }
        updateFiltersText();
        }
            DBSEntityAttributeRef ownAttr = ownAttrs.get(i);
        } else {
     * @param monitor monitor. If null then save will be executed in async job
    private final Map<ResultSetPresentationDescriptor, PresentationSettings> presentationSettings = new HashMap<>();
            @Override
    }
                    ConfirmationDialog.WARNING,
    @Override
                        .toArray()
            redrawData(false, true);
            } else {
        } finally {
        synchronized (dataPumpJobQueue) {
                    sourceRowIndex = fromRowAbove ? partitionStart : partitionEnd;
                    Action action = new Action(formatName, Action.AS_RADIO_BUTTON) {
                }
        // Add default panels if needed
                continue;
    {
                if (CommonUtils.isEmpty(preferredPresentationId)) {
        }
                    // Single row in partition, copy values from row above/below this partition
        return null;
                partitionedSelectedRows = new int[][]{new int[]{0, 0}};

        }
                DBDValueHint[] valueHint = chp.getCellHints(
                        null,
            refreshHintCache(
            dataPumpRunning.set(false);
                    () -> nextSegmentReadingBlocked = false);
                    }
        }
    }
                    );
        composite.setLayout(GridLayoutFactory.fillDefaults().create());
                rowCountLabel.setMessage(rcMessage);
    }
        if (this.selectedRecords.length > 1) {
import org.jkiss.dbeaver.ui.controls.resultset.colors.ResetAllColorAction;
        setDataFilter(newFilter, refresh);
    }
                this.panelFolder.setMRUVisible(true);
        items.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_TOGGLE_MAXIMIZE));
        }
            MenuManager configLevelMenu = new MenuManager("Configure for");
        // Read data
                                    } catch (DBCException e) {
        return false;
                        resultSetSize.setText(realValue);
        List<DBDAttributeConstraint> constraints = new ArrayList<>();

                        ResultSetUtils.formatRowCount(rowsFetched),
    {
                // auto-refresh
                        MENU_ID_ORDER); //$NON-NLS-1$
            dataReceiver.setTargetDataContainer(executionSource.getDataContainer());

                if (!scroll) {
                filtersMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FILTER_MENU_DISTINCT));
            mainPanel.addListener(SWT.Activate, new Listener() {
    }

                }
        }
        if (updatePresentation) {
        {
                    cellValue,
                    } else {
                    if (getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG)) {
    private void fillEditMenu(IMenuManager editMenu, @Nullable DBDAttributeBinding attr, @NotNull ResultSetRow row, ResultSetValueController valueController) {
                } else {
        this.viewerPanel = UIUtils.createPlaceholder(mainPanel, 1);
import org.eclipse.swt.graphics.Rectangle;
            @NotNull DBSDataContainer dataContainer,
                    // Apply changes
        getPresentationSettings().panelsVisible = show;

            log.error(e.getTargetException());
                        // No status bar in statistics presentation
    private final List<ResultSetJobAbstract> dataPumpJobQueue = new ArrayList<>();
                this.viewerPanel,

{
            actionToolBar.removeAll();
                restoreConstraintVisualState(constraint, state);
    @Override

                ResultSetMessages.controls_resultset_viewer_calculate_row_count,
            @Nullable Runnable finalizer)
                addDefaultPanelActions(panelToolBar);
        ResultSetJobDataRead dataPumpJob = new ResultSetDataPumpJob(
    }
        return supportsDecoratorFeature(IResultSetDecorator.FEATURE_PANELS) &&

            Composite panelPH = new Composite(panelComposite, SWT.NONE);
                        }
            }
                            }
                this.updateFiltersText();
        if (supportsPanels()) {
    }

                    if (attr != null && row != null) {
            return;
            resultSetSize.addFocusListener(new FocusAdapter() {
                    ConfirmationDialog.QUESTION,
    private final Color defaultBackground;
            @NotNull
                        return activePresentationDescriptor == presentation;
            } else {
        if (location != null) {
                                e.doit = switchPresentation((ResultSetPresentationDescriptor) e.widget.getData());
    private void fillHintItems(
                updatePresentationInToolbar();
                    DateTimeFormatter.ISO_DATE.format(((LocalDateTime) endTime)),
    @Override
                statusLabel = new StatusLabel(statusBar, SWT.NONE, this);
                            filtersMenu.add(new FilterByAttributeAction(this, operator, type, attribute));
            });

            getContainer().openNewContainer(monitor, (DBSDataContainer) targetEntity, newFilter);
                        }
            UIUtils.syncExec(() ->
        return filtersPanel;
            DBWorkbench.getPlatformUI().showError("Error executing query", "Viewer detached from data source");
            for (CTabItem tab : panelFolder.getItems()) {

        }
                    UIUtils.asyncExec(this::toggleMode);
                }
                    EnumSet.of(DBDValueHint.HintType.STRING),

                    return result != IDialogConstants.CANCEL_ID;
                                log.warn(e);
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(dataPropertyListener);
                }

                int fetchSize = CommonUtils.toInt(resultSetSize.getText());
                        break;
                        panelsMenuManager.add(menuItem);
        if (attr != null && row != null) {
        //toolbarsLayout.fill = true;
                                    // If there are no options - save settings without opening dialog
        private ResultSetPanelDescriptor descriptor;
    }
            project.getDataSourceRegistry().removeDataSourceListener(this);
            }
            if (saveReport == null) {
        if (refConstraint == null) {
            .collect(Collectors.toList());
        if (!checkForChanges()) {
    ) {
    ) {
        String activePanelId;
    public void toggleMode()
    }
            return persister.getScript();
            for (ResultSetRow row : model.getAllRows()) {
        return model.getAttributes();
import org.jkiss.dbeaver.ui.controls.resultset.colors.ResetRowColorAction;
    @Override
                        log.debug("Error refreshing hint cache", e);
                        checked = transformSettings.isIncluded(descriptor.getId());
    private void fillBinaryFormatMenu(@NotNull IMenuManager manager, @Nullable DBDAttributeBinding attribute) {
            if (ownBinding == null) {
    }
        return panelVisible[0];
                    for (DBCLogicalOperator operator : operators) {
            }
        }
                    }
        for (int i = 0; i < ownAttrs.size(); i++) {

                final int sourceRowIndex;

        if (attribute != null && supportsDataFilter()) {
import org.jkiss.dbeaver.ui.controls.*;
        layoutMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ZOOM_IN));
                viewMenu.add(new ResetAllColorAction(this));
    public void clearDataFilter(boolean refresh) {
        autoRefreshControl.enableAutoRefresh(false);
            }


            settings.activePanelId = null;
                        for (IContributionItem menuItem : fillPanelsMenu()) {
                    "] columns differ from referenced constraint [" + refConstraint.getName() + "] (" + ownAttrs.size() + "<>" + refAttrs.size() + ")");
        if (recordMode) {
}
            return rowIdentifier;
        List<? extends DBSEntityAttributeRef> refAttrs = CommonUtils.safeList(((DBSEntityReferrer) refConstraint).getAttributeReferences(monitor));
            if (this.selectedRecords.length == 0) {

        for (DBDAttributeConstraint constraint : newFilter.getConstraints()) {
        // Update combo
                this.panelFolder.setMinimizeVisible(true);
        }
    private volatile boolean isUIUpdateRunning;
        }
        if (rowCountLabel != null) {
        if (event.getObject() instanceof DBVEntity &&
        return site;
     */
            String tooltip = NLS.bind(ResultSetMessages.controls_resultset_viewer_status_rows_size, model.getRowCount(),
                if (getStatistics() == null || !getStatistics().isEmpty()) {
            });

            for (ResultSetPanelDescriptor pd : availablePanels) {
     * {1, 2, 4, 6, 7, 8, 9} &rArr; {[1..2), [4..4), [6..9)}
            if (finalizer != null) finalizer.run();
                filters.add(filterValue);
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        if (supportsDecoratorFeature(IResultSetDecorator.FEATURE_DECORATE_ON_DEMAND)) {
                        String panelId = (String) item.getData();
    }
            final DBDAttributeBinding[] attributes = model.getAttributes();
            activePresentation.dispose();
            if (rowIdentifier != null && rowIdentifier.getUniqueKey() == vConstraint) {
     */
        }
                                try {
            }
                boolean panelsDirty = false;
            panelPH.setLayoutData(new GridData(GridData.FILL_BOTH));
            final ResultSetPersister persister = createDataPersister(false);



        UIUtils.asyncExec(() -> {

                    mainPanel.removeListener(SWT.Activate, this);
        if (activePresentationDescriptor != null && dataSource != null) {

    }
        throws DBException
                        try {
        if (ActionUtils.isCommandEnabled(IResultSetCommands.CMD_NAVIGATE_LINK, site)) {
                        constraint.setOperator(DBCLogicalOperator.IN);
                                    log.warn(e1);
    @Override

            return ISaveablePart2.CANCEL;
                protected Integer runTask() {
        if (focusInPresentation) {
                }
                    };

        return getDataContainer() == null ? null : getDataContainer().getDataSource();
    public void showReferencesMenu(boolean openInNewWindow) {
                        default -> DTUIMessages.value_format_selector_database_native;
            return;
            }
            viewerSash.setMaximizedControl(null);
        if (!verifyQuerySafety() || !checkForChanges() || !isVisible() || !isWindowVisible) {
            resultSetSize.setEnabled(getDataContainer() != null);
                        for (DBDValueHint hint : hints) {
                if (filtersPanel != null) {
        this.container = container;
     */
                        "/" + model.getRowCount() +
        DBDAttributeBinding curAttribute = getActivePresentation().getCurrentAttribute();
        int segmentSize = getSegmentMaxRows();
                        updateStatusMessage();
        }
        updatePanelsContent(true);
        DBPDataSource dataSource = getDataSource();
                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_COPY_FROM_BELOW));
        }
            return null;
        } else {
            ((RowData) statusLabel.getLayoutData()).width = statusLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
    @Override
    }
        if (serverSideOrdering && getDataSource() != null && !getDataSource().getInfo().supportsResultSetOrdering()) {
                                model.getCellValue(new ResultSetCellLocation(docAttribute, sourceRow)),
    }
    private final Composite viewerPanel;
                SavePreviewDialog spd = new SavePreviewDialog(
        }
                rcMessage = ROW_COUNT_FORMAT.format(model.getRowCount());
    @Nullable
    }
                                session,
                }
                            try {
        }
    @Override
        }
        }
        PresentationSettings settings = this.presentationSettings.get(activePresentationDescriptor);
            }
            throw new DBException(ModelMessages.error_not_connected_to_database);
        ) != IDialogConstants.YES_ID)

                EMPTY_TRANSFORMER_NAME,
                    UIPropertyConfiguratorDescriptor configurator = UIPropertyConfiguratorRegistry.getInstance().getDescriptor(hint);

                // select row color


        }
        navigateMenu.add(new Separator());
    }
        for (ValueHintProviderDescriptor hd : hdList) {

                keyValues[k] = model.getCellValue(new ResultSetCellLocation(attrBinding, (ResultSetRow) rows.get(k)));
        }
        manager.add(new Separator());
                    // If no user-defined filter is present, apply default ordering
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            hintsMenu.setRemoveAllWhenShown(true);
            if (changed && presentationSwitchFolder != null) {
        // Dispose previous presentation and panels
                rcMessage = "No Data";
                                errorMessage = "Error executing query";
        if (dataContainer != null) {
                    ResultSetMessages.controls_resultset_viewer_status_rows_time_fetch_long,
                    if (needRefresh) break;
        );
            queryText = DEFAULT_QUERY_TEXT;
            this.descriptor = descriptor;
                    // Multiple rows in partition, copy values from first/last row of this partition
    public void updateToolbar() {
                    fillNavigateMenu(navigateMenu);

        DBDDataFilter newFilter = model.createDataFilter();
                        }
            } else {
                    if (getActivePresentation() instanceof StatisticsPresentation) {
        DBDAttributeBinding attr,
        }
        } catch (DBException e) {
            return;
                UIUtils.createEmptyLabel(panelSwitchFolder, 1, 1).setLayoutData(new GridData(GridData.FILL_VERTICAL));

        {
            String status = DBExecUtils.getAttributeReadOnlyStatus(attr, checkKey);
        toolBar.setRedraw(false);
    @Override
        this.viewerPanel.setRedraw(false);
    {
                @Override
                // Check for preferred presentation

                for (final ResultSetPanelDescriptor panel : availablePanels) {
                            model.getDataFilter(),

        public IResultSetController getController() {
        if (visiblePanel != null) {
        for (IDialogSettings pSection : ArrayUtils.safeArray(pSections.getSections())) {

        assert constraint != null;
        }
    }
        @Override
    }
                viewMenu.add(ActionUtils.makeCommandContribution(this.getSite(),
                if (stats == null || stats.isEmpty()) {
        // Activate panels
        if (result == IDialogConstants.YES_ID) {
                if (panelsDirty) {
                        }
                activePresentationDescriptor = null;
            showPanels(panelsVisible, false, false);

            activePresentation.fillMenu(manager);
        themeUpdateJob.setSystem(true);
                    }

        {
        } else if (forceOrder == ColumnOrder.DESC) {
                    }
                transformSettings == null || CommonUtils.isEmpty(transformSettings.getCustomTransformer()))
        if (extended) {
                }

        if (statusBar == null || statusBar.isDisposed()) {
                                final DBSAttributeBase attribute = metaAttr.getAttribute();
            if (status != null && checkKey) {
                curRow == null ? -1 : curRow.getRowNumber(),
    }
    }
        }

            DBPDataSourceContainer dataSourceContainer = null;
            if (dataContainer != null && !model.isUpdateInProgress()) {
                    + " = "
    public Composite getControl()
            boolean verticalLayout = false;
                    } catch (DBException e) {
                    item.dispose();
                if (pb.getData() instanceof ResultSetPresentationDescriptor descriptor) {
                // Add all panels

        if (targetEntity instanceof DBSDataContainer) {
    @Override
                continue;
                correctedSelectedRowsIndexes[i]++;

                }
                        ResultSetMessages.controls_resultset_viewer_action_navigate,
                curRow = null;
        for (DBDAttributeBinding attr : model.getAttributes()) {

            activePresentation.scrollToRow(IResultSetPresentation.RowPosition.CURRENT);
                UIUtils.checkSashStyle(SWT.HORIZONTAL | SWT.SMOOTH)
            }
    public void updateStatusMessage() {
            autoRefreshControl.scheduleAutoRefresh(false);
            curRow == null ? -1 : curRow.getVisualNumber());


                default:
        DBDDataFilter newFilter = new DBDDataFilter(constraints);
            layoutMenu.add(new ToggleSelectionStatAction(this, ResultSetPreferences.RESULT_SET_SHOW_SEL_CELLS,
                    mainPanel.removeListener(SWT.Activate, this);
                        DBeaverIcons.getImageDescriptor(UIIcon.SORT),
            savePresentationSettings();
                    }
    void setData(@NotNull DBRProgressMonitor monitor, List<Object[]> rows, int focusRow)
                // update history. Do it first otherwise we are in the incorrect state (getDatacontainer() may return wrong value)

                if (rowsFetched < 0 && rowsUpdated >= 0) {
            // Add menu for referencing tables
                });
                    updateFiltersText(true);
                PrefPageResultSetMain.PAGE_ID);
                if (!CommonUtils.isEmpty(panelId)) {
            if (listeners.isEmpty()) {
import org.eclipse.jface.action.*;
    }
    private void updateStatusInfo(boolean isTooltip) {

        // Add association constraints
                    if (settingsDialog.open() == IDialogConstants.OK_ID) {
                    String sqlText;

        final List<int[]> ranges = new ArrayList<>();
        return true;
    @NotNull
                return super.run(monitor);
                        MenuManager panelMenu = new MenuManager();
        return !activeControl.isDisposed() && activeControl.isFocusControl();
        DBCExecutionContext executionContext = getExecutionContext();
                    if (partitionIndex == sourceRowIndex) {
        }
        return null;
    }
                    if (query != null) {
     */
            for (ToolBarManager tb : toolbarList) {

    }
            ResultSetMessages.result_set_view_menu_text,
        boolean panelsVisible;
            }
        for (DBDAttributeConstraint constraint : curFilter.getConstraints()) {
        HistoryStateItem(DBSDataContainer dataContainer, @Nullable DBDDataFilter filter, int rowNumber) {
        @Nullable int[] rowIndexes,
                    setStatus(errorMessage, DBPMessageType.ERROR);
                        return null;
    }
import org.eclipse.swt.custom.CTabFolder;
                            DBWorkbench.getPlatformUI().showError("Transform error", "Error transforming column", e);
        Collection<DBDAttributeBinding> attrs,
        }
        if (constraint.getOrderPosition() == 0 && forceOrder != ColumnOrder.NONE) {
        DBWorkbench.getPlatform().getDataSourceProviderRegistry().getGlobalDataSourcePreferenceStore().addPropertyChangeListener(dataPropertyListener);
    }

            CSSUtils.markConnectionTypeColor(configToolBar);
        private final boolean saveHistory;
            DBSEntityAttributeRef refAttr = refAttrs.get(i);
                            }

            }

        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EDIT)) {
    ) {
        return model.getCellValue(attribute, row);
        boolean serverSideOrdering = switch (orderingMode) {
                rsToolbar,
                        presentationSwitchFolder.setSelection(item);


            navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_NAVIGATE_LINK));
    }
                }
        }
import org.eclipse.core.runtime.IStatus;
            recordModeButton.setVisible(activePresentationDescriptor != null && activePresentationDescriptor.supportsRecordMode());
        }
        return state;
                if (saveHistory && error == null) {
            panelTab.setText(panelDescriptor.getLabel());

                if (!DBUtils.isNullValue(value) && attr != null && !attr.isRequired()) {
            needToRetryTaskOnWindowDeiconified = !isWindowVisible;
    @Override
            (statusLabel.getMessageType() != messageType || !CommonUtils.equalObjects(statusLabel.getMessage(), status))
                    if (showPanels) {
        if (TOOLBAR_CONFIGURATION_VISIBLE_PROPERTY.equals(ev.getProperty())) { //$NON-NLS-1$
            runDataPump(
        return filterManager;
            return Collections.emptyList();

        if (filtersPanel != null) {
        Control activeControl = getActivePresentation().getControl();

                MenuManager panelsMenuManager = new MenuManager();
                    createFilterPanel0(composite);
                // No rows selected, use zero as the only row number
    private void fillOrderingsMenu(
                IDialogSettings pSection = UIUtils.getSettingsSection(pSections, pId);
                for (DBDAttributeBinding attr : newAttributes) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                rowCountLabel.updateActionState();
            }
                // Set first panel active
            statusBar.setRedraw(false);

            if (curRow != null && curRow.getVisualNumber() >= segmentSize && segmentSize > 0) {
            rowCountLabel.updateActionState();
                {
        IMenuManager menuManager,
    public void resetCellValue(
        } else {
    {
                                } catch (DBCException e1) {
                     */
                listener.handleResultSetChange();
        final int focusRow,
            MenuManager viewMenu = new MenuManager(
            UIUtils.asyncExec(() -> {
import org.eclipse.jface.dialogs.IDialogSettings;
                }
            manager.add(new GroupMarker(MENU_GROUP_EXPORT));

    }
    private IResultSetListener[] getListenersCopy() {
        if (panelFolder != null) {
        return true;
    // Ordering
        ActionUtils.addPropertyEvaluationRequestListener(propertyEvaluationRequestListener);
            this.viewerPanel.setRedraw(true);
                null);
                    } else {
        List<DBVEntityAttribute> vAttrs = virtualEntity.getEntityAttributes();
    public IResultSetPanel getVisiblePanel() {
            DBCExecutionContext context = getExecutionContext();
                T result = filtersPanel.getAdapter(adapter);
                panelsVisible = settings.panelsVisible;
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
                if (pd.isShowByDefault()) {
        MenuManager refTablesMenu = new MenuManager(menuName, null, "ref-tables");
    @Override
        if (clearMetaData) {
        final DBPDataSource dataSource = dataContainer.getDataSource();
                    attr,
            if (action.isEnabled()) {
            }
        @Override
            return false;
import org.eclipse.ui.menus.CommandContributionItemParameter;
        return result[0];
            trControl.setLayout(layout);
                return NLS.bind(
            DBRRunnableWithProgress restoreTask = monitor -> {

        return stateHistory;
            log.debug("Error updating presentation toolbar", e);
            DBCExecutionContext context = getExecutionContext();
        PanelInfo panelInfo = isPanelsVisible() ? activePanels.get(getPresentationSettings().activePanelId) : null;
            return defaultForeground;
                }
        DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(dataPropertyListener);
    @Override
                }
                        return query.getText();
        }
        }
                (association.getAssociatedEntity() == null ? "???" : DBUtils.getQuotedIdentifier(association.getAssociatedEntity())) + ")");

import org.jkiss.dbeaver.ui.controls.resultset.actions.*;
                this.panelFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
            availablePanels.addAll(ResultSetPresentationRegistry.getInstance().getSupportedPanels(
                        // Seems to be refresh

     * Performs grouping of a continuous indexes.
            }
        final DataFilterRegistry.SavedDataFilter savedConfig = DataFilterRegistry.getInstance().getSavedConfig(dataContainer);
    // Misc
                    }
    private Runnable onSuccess;
                        MENU_ID_FILTERS); //$NON-NLS-1$
            } else {
    // It is a bit hacky function because we need to bind custom attributes (usually this happens during data read)
                activateDefaultPanels(settings);

        ToolBarManager actionToolBar = panelInfo.actionToolBar;
            createDataPersister(true).rejectChanges();
            return null;
    }
                    presentationSettings.activePanelId = id;
                }
                        null,
        {
                        settings.enabledPanelIds.remove(panelId);
                {


                    saveReport);
                            if (panelSwitchFolder != null) {
    }
        if (virtualEntity == null) {
        }
//            if (visiblePanel == panel) {
                    panelFolder.setSelection(panelTab);
        Arrays.sort(updatedSelectedRows);
                    boolean useAllColumnsAsKey = executionContext
            return ResultSetViewer.this;
                    }
        }
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_FIRST));
                    RuntimeUtils.formatExecutionTime(fetchTime),
            ));
    }
        applyCurrentPresentationThemeSettings();
            viewerPanel.addDisposeListener(e -> menuManager[0].dispose());
        synchronized (listeners) {
            curRow = null;
        {
                        // Need to account currently inserted row

            if (recordMode) {
            }
    private VerticalButton recordModeButton;
                if (result != null) {
                    UIUtils.setControlVisible(statusBar.getParent(), false);
                for (ToolItem item : tb.getItems()) {
                statusBar.setRedraw(true);

    public boolean isInsertable()
            @Override
                if (transformSettings != null) {
                    try {
                    break;
                return;
                activePresentation.getControl().setFocus();
            }
            }
                        if (getActivePresentation().getCurrentAttribute() == null || model.getRowCount() == 0) {
        if (!(activePresentation instanceof IResultSetEditor) || !supportsDecoratorFeature(IResultSetDecorator.FEATURE_EDIT)) {

    public static class PanelsMenuContributor extends CompoundContributionItem
                }

        }
        for (DBDValueHintProvider.HintObject ho : DBDValueHintProvider.HintObject.values()) {
        }
    /**

                ActionUtils.findCommandName(IWorkbenchCommandConstants.FILE_REFRESH),
            .filter(override -> binding.getName().equals(override.getAttributeName()))
                            displayFormatProvider.setDefaultDisplayFormat(displayFormat);
                this.panelFolder = new CTabFolder(this.viewerSash, SWT.FLAT | SWT.TOP);
                    if (!CommonUtils.isEmpty(toolTip)) {
     * with references panel). We need to execute only current one and the last one. All
                panel.contributeActions(panelInfo.actionToolBar);
        savePresentationSettings();

            if (!instance.canShowPresentation(this)) {
                        presentation = pd;
                }

        } else {
    {
    // Current row/col number
    private final ResultSetModel model = new ResultSetModel();
                    @Override
        state.put("visible", constraint.isVisible());
        } else {
        if (curState == null) {
            activePresentation.dispose();

    public String getActiveQueryText() {
                    false,
                    "] columns differs from referenced constraint [" + refConstraint.getName() + "] (" + ownAttrs.size() + "<>" + refAttrs.size() + ")");
                return new EmptySelection();

                        }
        statusBar.layout(true, true);
                return false;
        List<? extends DBSEntityAttributeRef> refAttrs = CommonUtils.safeList(((DBSEntityReferrer) refConstraint).getAttributeReferences(monitor));

                .truncatedTo(ChronoUnit.SECONDS);
 *
                ResultSetReferenceMenu.fillRefTablesActions(null, this, getSelectedRows(), singleSource, manager, openInNewWindow));
        model.setMetaData(resultSet, attributes);
            panelPH.setLayout(new FillLayout());
                return (IResultSetSelection) selection;
            manager.add(new Separator());
            DBDAttributeBinding currentAttribute = getActivePresentation().getCurrentAttribute();
    {
                changed = CommonUtils.isEmpty(this.availablePresentations) || !newPresentations.equals(this.availablePresentations);

                );

                }
                for (int i = 0; i < selectedRecords.length; i++) {
import java.time.format.DateTimeFormatter;
                        filtersMenu.add(new FilterByAttributeAction(this, operator, FilterByAttributeType.NONE, attribute));
                start = index;
                                docAttribute,
        EditVirtualEntityDialog dialog = new EditVirtualEntityDialog(
                }
            DBDDataFilter filter = new DBDDataFilter(model.getDataFilter());
                .toArray()
                            panelsButton.setChecked(isPanelsVisible());
    }
        }
        }
    private volatile boolean isWindowVisible = true;

import org.eclipse.core.runtime.Status;
            manager.add(ActionUtils.makeCommandContribution(site, IWorkbenchCommandConstants.FILE_REFRESH));

                model.setStatistics(getStatistics());
            return;
            parameters.put(ResultSetHandlerTogglePanel.PARAM_PANEL_ID, panel.getId());
                MENU_ID_VIEW); //$NON-NLS-1$
            constraint.setOrderDescending(true);
        }
            return null;
            constraint.setValue(keyValue);
        return state[0];
                rowsRemoved++;
                        manager.add(ActionUtils.makeCommandContribution(site, IWorkbenchCommandConstants.EDIT_PASTE));
            hasNavTables = true;


        }
            case COLUMN -> "Column";

    @Nullable
    private void setStatusTooltip(String message) {
                }
        }

        // Restore data filter
                public void handleEvent(@NotNull Event event) {
        updatePresentationInToolbar();
    ///////////////////////////////////////
        } catch (DBException e) {
                this.panelFolder.addListener(SWT.MouseDoubleClick, event -> {
        {
                .filter(applicableHints::contains).toList();

            }
        }
                statusLabel.setLayoutData(rd);
        @Nullable Object newValue
            getAutoRefresh().populateRefreshButton(
            selectionStatLabel.setText(" ");
            menuManager.add(configLevelMenu);
        @Nullable ResultSetRow row
        }
        @Nullable final DBDAttributeBinding attr,
            return;
                if (partitionStart == partitionEnd) {
                transformersMenu.addMenuListener(manager12 -> fillAttributeTransformersMenu(manager12, attr));
        }

        @Override


                    String commandName = ActionUtils.findCommandName(IResultSetCommands.CMD_CELL_SET_DEFAULT) +
            } catch (Throwable e) {
        if (lastThemeUpdateTime == 0) {
                    int oldFetchSize = store.getInt(ModelPreferences.RESULT_SET_MAX_ROWS);
                        continue;
                dataContainer,
        if (executionContext == null || dataContainer == null) {
                    try {
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_LAST));
        return model.getDefaultRowIdentifier();
                    applyDefaultOrdering();
        var composite = new ConComposite(mainPanel);
                        saveTransformerSettings();
                log.debug("Error disposing toolbar " + tb, e);
    public void refreshWithFilter(DBDDataFilter filter) {
    @Override

                // Operators with multiple inputs
            toolbarList.add(navToolBarManager);
                        }
            // Enable redraw
            } catch (Exception e) {

            for (IContributionItem item : fillPanelsMenu()) {
            if (presentation instanceof IAdaptable) {
                        if (!getControl().isDisposed()) {

            lastThemeUpdateTime = System.currentTimeMillis();
            settings.activePanelId = pSection.get("activePanelId");
        } else {
                    @Override
    public void fireResultSetSelectionChange(SelectionChangedEvent event) {

    private void loadPresentationSettings() {
        if (activePresentation != null) {
                }
        if (project != null) {
        }
                    if (!isRefreshInProgress()) {
        }
                    changed |= (wasCollapsed != nowCollapsed);
            actionToolBar.update(true);
                            } else {
            availablePanels.addAll(ResultSetPresentationRegistry.getInstance().getSupportedPanels(
        if (menuManager[0] != null) {
        model.refreshValueHandlersConfiguration();
        }
                if (CommonUtils.equalObjects(tab.getData(), panelId)) {
                ho,
        });
    /**
            }
                }
        } else if (forceOrder == null && constraint.getOrderPosition() > 0 && !constraint.isOrderDescending()) {
            updatePanelActions();

    private Integer segmentFetchSize;
                    /*
                    item.setToolTipText(pd.getDescription());
            if (presentationSwitchFolder != null) {

import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
        }
        }
                        CTabItem item = (CTabItem) event.item;
            refTablesMenu.addMenuListener(manager ->
import org.jkiss.dbeaver.model.data.*;

        return this.viewerPanel;
            ConfirmationDialog.QUESTION_WITH_CANCEL);
    }
                    String errorMessage = error.getMessage();
            this.focusRow = focusRow;
        if (viewerPanel.isDisposed()) {
                            log.error("Can't extract document value", e);
    public Object getCellValue(@NotNull DBDAttributeBinding attribute, @NotNull DBDValueRow row) throws DBException {
        if (viewerPanel.isDisposed()) {
            for (CTabItem panelItem : panelFolder.getItems()) {
                );

    private class ResultSetDataPumpJob extends ResultSetJobDataRead {
                statusMessage =
        }
            new AbstractJob("Refresh hint cache") {
        }
        }
                    getSegmentMaxRows(),
        final DBVTransformSettings transformSettings = DBVUtils.getTransformSettings(attr, false);
        int size;
    private static final String TOOLBAR_EDIT_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.ui.controls.resultset.status.editCmds";
            MenuManager binaryFormatMenu = new MenuManager(ResultSetMessages.controls_resultset_viewer_action_binary_format);
            ToolBar addToolBar = addToolBarManager.createControl(statusBar);

        this.filterManager = GeneralUtils.adapt(this, IResultSetFilterManager.class);
    ////////////////////////////////////////////////////////////
    }
            final ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet(
            panel.panel.activatePanel();
                viewMenu.add(new Separator());
            case CELL -> "Cell";
        if (setActive) {
            .filter(override -> override.getOperator() == DBCLogicalOperator.EQUALS)
        if (cursorLocation == null) {

                            filtersPanel.setFilterValue(whereCondition);
        }
     */
            location = getKeyboardCursorLocation();
                rows.size()) + getExecutionTimeMessage(false);
                boolean panelUpdated = false;
    private void updateFiltersText()
    @NotNull
import java.lang.reflect.InvocationTargetException;


            instance.refreshData(true, false, false);
            this.presentationPanel = UIUtils.createPlaceholder(this.viewerSash, 1);
            return;
import org.eclipse.swt.custom.CTabFolderEvent;
        @NotNull DBSEntityAssociation association,
            if (activePresentation instanceof IResultSetDisplayFormatProvider displayFormatProvider) {
                null,
        final DBVEntity virtualEntity = DBVUtils.getVirtualEntity(dataContainer, false);
     *
            } else {
        for (IResultSetListener listener : getListenersCopy()) {
    public DBCExecutionContext getExecutionContext() {
            fillHintItems(
    }
        long totalTime = statistics.getTotalTime();
        }
                }
            manager.add(hintsMenu);
                }
                    srcRowIndex++;
                    DBeaverIcons.getImageDescriptor(UIIcon.ROW_EDIT),
                    return null;
        Point location = getKeyboardCursorLocation();
import java.util.List;

        toolbarsLayout.center = true;
            this.model.resetMetaData();
            if (showPanels) {
                        cells = new Object[1];
            return UIMessages.dialog_policy_data_edit_msg;
            }
                if (executionContext != null) {
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
            CSSUtils.markConnectionTypeColor(this.viewerSash);
        }
    }
    }
                final int partitionEnd = partitionRange[1];
                    for (IContributionItem menuItem : fillPanelsMenu()) {
     * </pre>
            if (ArrayUtils.contains(supportedOperators, DBCLogicalOperator.IN)) {
        if (model.getDocumentAttribute() == null) {
                        setActivePresentation(instance);
        return virtualEntity.getColorOverrides().stream()
            createStatusBar0(composite);
                }
                    try {
    ////////////////////////////////////////////////////////////
import org.eclipse.ui.*;
            viewerPanel.getShell(),
        }
        @Override
    private Point getKeyboardCursorLocation() {
                Action psAction = new Action(pd.getLabel(), Action.AS_CHECK_BOX) {
    private final AtomicBoolean dataPumpRunning = new AtomicBoolean();

                        ResultSetHandlerTogglePanel.CMD_TOGGLE_PANEL, getSite(), true,
            dataPumpRunning.set(true);
            }
    public boolean isReadOnly() {
import org.jkiss.dbeaver.ui.editors.data.preferences.PrefPageResultSetMain;
                        swtMenu.setLocation(displayAt);
                }
            getAutoRefresh().enableControls(false);
            }

            this.presentationState = savePresentationState();
    @Override
    }
                    ResultSetMessages.controls_resultset_viewer_status_rows_time_fetch,

        }
    public void clearData(boolean clearMetaData)
        if (!confirmProceed()) {

            }
                    if (getDataSource() != null && !ArrayUtils.contains(supportedOperators, DBCLogicalOperator.IN)) {
        }
        DBPDataSource dataSource = getDataSource();
    }
                    // We know actual row count

        return this.mainPanel;
            switch (checkResult) {


//        }

                    + UITextUtils.getShortText(this.getControl(), CommonUtils.toString(valueController.getValue()), 100);
                DBWorkbench.getPlatform().getPreferenceStore().setValue(
            panelTab.setControl(panelComposite);
        navigateEntity(monitor, newWindow, targetEntity, constraints);
                            }
     */

                    if (activePresentationDescriptor != null && (!metadataChanged || activePresentationDescriptor.getPresentationType().isPersistent())) {
        }
        boolean focusInPresentation = UIUtils.isParent(presentationPanel, viewerPanel.getDisplay().getFocusControl());

    }
                }
        return historyPosition;
    public void updatePanelsContent(boolean forceRefresh) {
                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_CELL_SET_NULL));

        }
            selectedRecords = new int[0];
            items.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_TOGGLE_LAYOUT));
                    if (error == null) {
            } catch (Exception e) {
                }
            filtersMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FILTER_SAVE_SETTING));
                        if (dataPumpRunning.get()) {
            for (final int[] partitionRange : partitionedSelectedRows) {
            return desc;
                    }
                }
                        }
    public void navigateAssociation(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
            }
    }
                filter,
            UIUtils.syncExec(this::updateResultsInUI);
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IWorkbenchCommandConstants.NAVIGATE_FORWARD_HISTORY, CommandContributionItem.STYLE_PUSH, UIIcon.RS_FORWARD));
                    public boolean isChecked() {
                }
            setStatusTooltip(statusMessage);
            DBDAttributeBinding ownBinding = bindingsModel.getAttributeBinding(ownAttr.getAttribute());
            listener.onModelPrepared();
        if (vEntity != null) {
            // Toolbar
            if (curRow == null || curRow.getVisualNumber() >= rowCount) {
    @Nullable
            configToolBarManager.add(new ConfigAction());
    {
    // Filters

            this.presentationSwitchFolder = null;
        boolean needPK = false;
                                long rowCount = readRowCount(monitor);
        }
                    }
            OrderingPolicy.get(this.getPreferenceStore())
        CSSUtils.setCSSClass(this.viewerPanel, CSS_CLASS_RESULT_SET_VIEWER);
        this.rejectChanges();
                        extCopyMenu.setRemoveAllWhenShown(true);
                    boolean nowCollapsed = toolbar.getLayoutData() != null;
        dataPumpJob.setMaxRows(maxRows);
        }
    }
    @Override
        }
        DBDDataFilter dataFilter = getModel().getDataFilter();
            // Edit items
    public void updateRowCount(boolean showErrors) {
            focusRow,
        int[] rowIndexes
    private IResultSetFilterManager filterManager;
                isWindowVisible = false;
                    if (row != null) {
                recordModeButton.setAction(new ToggleModeAction(this), true);

                if ((decoratorFeatures & IResultSetDecorator.FEATURE_FILTERS) != 0) {
                ResultSetMessages.controls_resultset_viewer_action_show_selected_column_count));
    }
        @NotNull IMenuManager manager,
    public DBDAttributeBinding[] getAttributes() throws DBException {
    private final List<HistoryStateItem> stateHistory = new ArrayList<>();
        List<DBDAttributeConstraint> constraints = new ArrayList<>();
                    // May happen if we insert "after" current row and there are no rows at all
import org.jkiss.dbeaver.utils.RuntimeUtils;
        if (customTransformer != null && !CommonUtils.isEmpty(customTransformer.getProperties())) {
        if (recordModeButton != null) {
                return NLS.bind(
                                    cells[index] = metaAttr.getValueHandler().createNewValueObject(session, attribute);
        } catch (DBException e) {
                    }
                return filters;
                // Constrain use corresponding own attr
        return UIStyles.getDefaultTextForeground();
                                }

        model.resetCellValue(attr, row, rowIndexes);
            state.put("options", constraint.getOptions());
                        removePanel(panelId);
            return null;
            //presentationSwitchToolbar.setEnabled(enableFilters);
    @Override



            return persister.applyChanges(monitor, false, settings, applyListener);
            DBDAttributeBinding attrBinding = bindingsModel.getAttributeBinding(refAttr.getAttribute());
                            try {
        DBCExecutionContext context = getExecutionContext();
import org.jkiss.dbeaver.ui.data.IValueController;
                            showPanels(!isPanelsVisible(), true, true);
    private int historyPosition = -1;
        DBVEntity vEntity = model.getVirtualEntity(false);
                }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            return;
        }
        if (!confirmProceed()) {
            for (DBVEntityAttribute vAttr : vAttrs) {
        }
        new AbstractJob("Initiate data read") {
 *
        }
    private void fillLayoutMenu(IMenuManager layoutMenu, DBDAttributeBinding attr) {
        composite.setLayout(new FillLayout());
            @Override public Boolean runTask() {
    public void readNextSegment() {

        if (size > 0 && size < ResultSetPreferences.MIN_SEGMENT_SIZE) {
        }
            setStatus(statusMessage, hasWarnings ? DBPMessageType.WARNING :DBPMessageType.INFORMATION);
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelDescriptor;
    public List<DBEPersistAction> generateChangesScript(@NotNull DBRProgressMonitor monitor, @NotNull ResultSetSaveSettings settings) {
                states.put(constraint.getFullAttributeName(), state);
                int rowCount = model.getRowCount();
            }

            }
            }

                curState = item;

        navigateMenu.add(new Separator());
                        cells = new Object[attributes.length];
        if (dataContainer != null) {
                    }
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
    // Context menu & filters
                dataReceiver.setHasMoreData(false);
            return;

                        refreshData(null);
            boolean saveHistory,
    private void showErrorPresentation(String sqlText, String message, Throwable error) {

    }
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EDIT)) {
                    selectedRecords[i] = firstSelRecord + i;
            openResultsInNewWindow(monitor, targetEntity, newFilter);

        final boolean scroll, // Scroll operation
                        log.error(e);
    }
        }
import org.jkiss.dbeaver.ui.controls.resultset.view.EmptyPresentation;
                    } else if (query != null) {

import org.jkiss.dbeaver.model.data.hints.DBDValueHintProvider;
                    panelsButton.setImage(DBeaverIcons.getImage(UIIcon.PANEL_CUSTOMIZE));
        }
import org.eclipse.ui.actions.CompoundContributionItem;
            for (IResultSetListener listener : listeners) {
    private CTabFolder panelFolder;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    }
            viewMenu.setRemoveAllWhenShown(true);
        DataEditorFeatures.RESULT_SET_SCROLL.use();
    }
                // Column enumeration is expensive
        {
    public boolean supportsEdit() {
            MenuManager panelsMenu = new MenuManager(
        if (dataSource == null || dataContainer == null) {
        String describeState() {
                UIUtils.showMessageBox(viewerPanel.getShell(), "Data read", "Can't read data - no active connection", SWT.ICON_WARNING));
        }
    }

                statusBar,
                configurators);

                    panelButton.setToolTipText(panel.getLabel());
            // This may happen during cross-database entity navigation
                for (DBCLogicalOperator operator : operators) {
    @Override
import org.eclipse.osgi.util.NLS;
                for (IResultSetPanel panel : getActivePanels()) {


        String statusMessage;
        }
                            }

                }
        DBCExecutionContext executionContext = getExecutionContext();
        if (vAttrs != null) {
                }
    private final List<ResultSetPanelDescriptor> availablePanels = new ArrayList<>();
    public List<ResultSetRow> getSelectedRows() {
                    statusMessage = NLS.bind(
        if (!newWindow && !confirmPanelsReset()) {
    }
        try {
        DBPProject project = container.getProject();
        }
        Map<String, Map<String, Object>> states = new HashMap<>();
            Composite trControl = new ConComposite(panelComposite, SWT.NONE);
            if (showDefaults) {
            }
        if (adapter == IFindReplaceTarget.class) {
        DBSDataContainer dataContainer = getDataContainer();
        DBPDataSource dataSource = getDataSource();
            throw new DBException("Broken association (referenced constraint missing)");
                        // We don't to override source row
            CTabItem activePanelTab = panelFolder.getSelection();

        private void updateResultsInUI() {

        }

            RuntimeUtils.runTask(restoreTask, "Restore data filter", 10000);
        return control.getDisplay().map(control, null, cursorLocation);

            !supportsDecoratorFeature(IResultSetDecorator.FEATURE_EDIT)

    private boolean runDataPump(
        }
    @NotNull
        }
    }
    private void updatePanelsButtons() {
    //////////////////////////////////
                            } catch (DBCException e) {
                        panelsDirty = true;
                    MenuManager orderMenu = new MenuManager(
        ResultSetDataPumpJob(
                resultSetSize.setText(String.valueOf(getSegmentMaxRows()));

        //this.updateStatusMessage();
    @Nullable
                    schedule(50);
        @NotNull IMenuManager vmMenu,
            if (endTime instanceof LocalDateTime) {
        {
        redrawData(false, rowsRemoved > 0);

        this.curRow = newRow;

        } else {
    ////////////////////////////////////////////////////////////
                    descriptor.getName(),
                    dataSource, attr, null);
                    ResultSetMessages.controls_resultset_viewer_status_row + (curRow == null ? 0 : curRow.getVisualNumber() + 1) +
                    if (row != null) {
     * Sets new metadata of result set

                        attr.lateBinding(session, rows);
        }
        try {
    private void fireResultSetLoad() {
    public void refreshHintCache(
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
                    orderMenu.setRemoveAllWhenShown(true);
                    if (pd == activePresentationDescriptor) {
                        configurators.put(hint, configurator);
import org.jkiss.dbeaver.model.data.order.OrderingPolicy;
        panelToolBar.add(new Action(
                pSection.put("verticalLayout", settings.verticalLayout);


import org.jkiss.dbeaver.ui.controls.resultset.virtual.*;
            .filter(override -> override.getOperator().evaluate(value, override.getAttributeValues()))
                            );
            } else {

            items.add(new CommandContributionItem(params));
    }

            ResultSetPreferences.CONFIRM_RS_EDIT_CLOSE,
    @Override
                // Save current presentation (only if it is persistent)
        viewMenu.add(new Separator());
                        constraint.setOperator(DBCLogicalOperator.EQUALS);
        if (!show) {

                this
            items.add(new Separator());
        }
        this.curRow = null;
                }
            this.onSuccess = onSuccess;

        return model;
            }
    public void showEmptyPresentation() {
            this.viewerSash.showUp();
            };
        @Nullable Object oldValue,
        @Nullable DBDAttributeBinding attr
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FETCH_ALL));
    }
            if (isRefreshInProgress() || !checkForChanges()) {
            if (UIUtils.hasFocus(filtersPanel)) {
        Collection<ResultSetRow> selectedRows = getSelectedRows();

                                TransformerSettingsDialog settingsDialog = new TransformerSettingsDialog(
            DataEditorFeatures.RESULT_SET_PRESENTATION_SELECTED.use(Map.of(
                {
                    Map.of("driver", dataSource.getContainer().getDriver().getPreconfiguredId())
            for (VerticalButton pb : presentationSwitchFolder.getItems()) {
            if (filtersPanel != null) {
                    filtersMenu.addMenuListener(manager1 -> fillFiltersMenu(manager1, attr, row));
                }
                menuManager[0] = createRefTablesMenu(monitor, openInNewWindow));
                    attr,
        UIUtils.applyMainFont(presentationSwitchFolder);
            }
                    }
            listener.onQueryExecuted(query, statistics, errorMessage);
                    }
                    }
                        }
            if (!state.isEmpty()) {
            return adapter.cast(new ResultSetContextImpl(this, null));
                        .getDataSource()

                            errorMessage = errorMessage + System.lineSeparator() + extraErrorMessage;
        actionsDisabled = true;
        activePanels.put(id, panelInfo);
    public void setDataFilter(final DBDDataFilter dataFilter, boolean refreshData)
        return dialog.open() == IDialogConstants.OK_ID;
        }
                        }
    private ResultSetPersister createDataPersister(boolean skipKeySearch)
        }
        if (applied) {
                DBCExecutionContext executionContext = getExecutionContext();
    }
                } else {
        // Listen presentation selection change
                }
        return false;
            dataContainer,
        settings.enabledPanelIds.removeIf(CommonUtils::isEmpty);
        DBSEntityConstraint refConstraint = association.getReferencedConstraint();
    // Presentation
import org.eclipse.swt.custom.CTabItem;

                }
            if (dataContainer instanceof IQueryExecuteController) {
            this.presentationPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
                //filtersMenu.add(new FilterByListAction(operator, type, attribute));
        // Add virtual attributes
    }

            }
        @Override
    @NotNull
            {

        List<IContributionItem> items = new ArrayList<>();
    public void setStatus(String status, DBPMessageType messageType)
                model.getRowCount(),
            UIUtils.runInProgressService(monitor ->
        int result = ConfirmationDialog.confirmAction(
        return activePresentationDescriptor != null && activePresentationDescriptor.supportsEdit();
    public void updateFiltersText(boolean resetFilterValue)
        if (activePresentationDescriptor != null && activePresentationDescriptor.supportsRecordMode()) {
     * @return grouped indexes
                    }
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FOCUS_FILTER));
                    }
                constraints.add(constraint);

                    case AFTER_SELECTION -> partitionOffset + partitionStart + partitionLength;
            this.selectedRecords = this.curRow == null ? new int[0] : new int[]{curRow.getVisualNumber()};

    }

                    checked = descriptor.isApplicableByDefault();
                    DateTimeFormatter.ISO_TIME.format(((LocalDateTime) endTime))

                VerticalButton.create(panelSwitchFolder, SWT.RIGHT | SWT.CHECK, getSite(), IResultSetCommands.CMD_TOGGLE_LAYOUT, false);

        @Override

                    if (getActivePresentation() instanceof StatisticsPresentation) {
        return activePresentationDescriptor != null && activePresentationDescriptor.supportsNavigation();
                    return;
import org.jkiss.dbeaver.ui.internal.UIMessages;
        int lastRowNum = -1;
    private boolean verifyQuerySafety() {
            DBSDataContainer dataContainer = getDataContainer();
    @Override
                activePresentation.getControl().setFocus();
                    });
        List<IAction> possibleActions = new ArrayList<>();
                site,

                            }

            for (DBDAttributeConstraint con2 : dataFilter.getConstraints()) {
                int newRowIndex = switch (placement) {
                DBDDisplayFormat defaultDisplayFormat = displayFormatProvider.getDefaultDisplayFormat();
            for (final DBDAttributeTransformerDescriptor descriptor : applicableTransformers) {
                VerticalButton panelsButton = new VerticalButton(panelSwitchFolder, SWT.RIGHT | SWT.CHECK);
            // Set explicit target container

    private void fillVirtualModelMenu(
                    row,
                    RuntimeUtils.formatExecutionTime(totalTime),
                }
            layout.marginWidth = 0;
                                        log.warn(e);
    {
        @Nullable final ResultSetRow row,
            null : executionContext.getDataSource().getContainer());
                    getModel(),
     * intrmediate data read requests must be ignored.
                nextSegmentReadingBlocked = false;
                DBCStatistics stats = getModel().getStatistics();
        private final boolean scroll;
            if (needRefresh) break;
                        }
                        }
            this.filterManager = new SimpleFilterManager();
            }
            return 0;
    ///////////////////////////////////////
package org.jkiss.dbeaver.ui.controls.resultset;
        possibleActions.add(new VirtualAttributeAddAction(this));

        vmMenu.add(new Separator());
            possibleActions.add(new VirtualUniqueKeyEditAction(this, false));
    {
import org.eclipse.core.runtime.jobs.Job;

        {
                        // Restore original position
            progressControl = (Composite) activePresentation.getControl();
                menuService.populateContributionManager(addToolBarManager, TOOLBAR_EXPORT_CONTRIBUTION_ID);
     * Checks that current state of result set allows to insert new rows
        }
    }
            ConfirmationDialog.WARNING, ResultSetPreferences.CONFIRM_RS_FETCH_ALL,
        }
                    desc += " [" + condBuffer + "]";

    private final DynamicFindReplaceTarget findReplaceTarget;
    {
        try {
    }
                ranges.add(new int[]{indexes[start], indexes[index - 1]});
        @Override
                                }
                            where,
        this.recordMode = false;
                        ResultSetMessages.controls_resultset_viewer_action_filter,
            }

                for (DBCLogicalOperator operator : operators) {
    }
//        if (!skipKeySearch && !model.isSingleSource()) {
        public void runWithEvent(Event event)
        return settings;
                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_CELL_SET_DEFAULT, commandName, image));
                {
 */
                    item.setData(pd);
    private final DBPPreferenceListener dataPropertyListener;
                    new Object[]{
    public boolean isHasMoreData() {
    private static final String TOOLBAR_EXPORT_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.ui.controls.resultset.status.exportCmd";
                }
                    DBDValueHintProvider.OPTION_APPROXIMATE);
    @NotNull
        }
        if ((getDecorator().getDecoratorFeatures() & IResultSetDecorator.FEATURE_PANELS) != 0) {

import org.jkiss.dbeaver.ui.controls.resultset.colors.CustomizeColorsAction;
                    panelItem.dispose();
                    child.redraw();
                checkDoubleLock(lockedBy);
        Map<String, Object> state = new Hashtable<>();
        if (presentationSwitchFolder == null) {
                int firstSelRecord = selectedRecords[0];
        if (hasWarnings) {
                    int result = ConfirmationDialog.confirmAction(
                        lastThemeUpdateTime = 0;
        }
        @NotNull
        mainPanel.getShell().addShellListener(new ShellAdapter() {
    @Nullable
                                    );
            } else {
                    return tab;
            PlatformUI.getWorkbench().getThemeManager().removePropertyChangeListener(themeChangeListener);
    /**
            public void shellDeiconified(ShellEvent e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            // Menus from value handler
    @Override
                        if (resetFilterValue) {
        @NotNull final DBSDataContainer dataContainer,
                    }

        }
        UIUtils.syncExec(() -> getActivePresentation().rejectChanges());
        }
        DBCExecutionContext context = getExecutionContext();
                            final DBDAttributeBinding metaAttr = attributes[index];
                // Operators with single input

            model.isUniqueKeyUndefinedButRequired(executionContext.getDataSource().getContainer());
                List<Object[]> rows = new ArrayList<>(rowCount);
                true,
        if (!this.checkForChanges()) {
                layoutMenu.add(psAction);
                    "Presentation switch",
        dataFilter.setOrder(null);
        for (int i = 0; i < selectedRows.size(); i++) {
    {
            int checkResult = new UITask<Integer>() {

                }
        if (checkEntity) {
        });
            scroll,
        navigateMenu.add(new ToggleRefreshOnScrollingAction(this));
import org.eclipse.jface.dialogs.IDialogConstants;
        }
        }
    }
            throw new DBException("Association '" + DBUtils.getQuotedIdentifier(association) + "' has empty column list");
    private boolean supportsPanels() {
        ) {
    private class ConfigAction extends Action {
        }
                    }

//                panel.refresh(forceRefresh);
                "driver", dataSource.getContainer().getDriver().getPreconfiguredId()
                navigateMenu.add(refTablesMenu);
    }
    }
                .mapToInt(ResultSetRow::getVisualNumber)
            changeMode(false);
        }
import org.jkiss.dbeaver.utils.PrefUtils;
            }
    private final Map<String, PanelInfo> activePanels = new HashMap<>();
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    /**
        }
     *
        if (!supportsPanels() || show == isPanelsVisible()) {
        } else if (panelFolder != null) {
                        if (CommonUtils.isNotEmpty(extraErrorMessage)) {
            themeUpdateJob.schedule(THEME_UPDATE_DELAY_MS);

        activePresentationDescriptor = null;
        updatePanelsButtons();
        final List<ResultSetRow> selectedRows = getSelectedRows();
        }
        List<? extends DBSEntityAttributeRef> ownAttrs = CommonUtils.safeList(((DBSEntityReferrer) association).getAttributeReferences(monitor));

import org.jkiss.code.Nullable;
                case DBVEntityForeignKey k -> refreshData(null);
                "Can't switch presentation",
                panelFolder.setSelection(panelTab);
    @Override
            UIUtils.syncExec(() ->
                MenuManager formatsMenu = new MenuManager(DTUIMessages.value_format_selector_value);
        return DBWorkbench.getPlatform().getPreferenceStore();
    private final VerticalFolder panelSwitchFolder;
                // Must run finalizer in any case
        activePresentation.refreshData(attributesChanged || (rowsChanged && recordMode), false, true);
        }
        if (!settings.enabledPanelIds.isEmpty()) {
        }

            event.getObject() == model.getVirtualEntity(false) &&
     */
        return size;
        mainPanel.layout(true, true);
                    if (configurator != null) {
                    }
            panelTab.dispose();
        @Nullable DBDAttributeBinding attribute
        final DBSDataContainer dataContainer = getDataContainer();
                }
    @Nullable
    ////////////////////////////////////////////////////////////
            panelTab.setData(id);
        for (int index = 1, start = 0, length = indexes.length; index <= length; index++) {
import org.eclipse.jface.text.IFindReplaceTarget;
            Collections.singletonList(attr),
                                    log.error("Can't extract cell value", e);
     *
    {
        {
    public boolean supportsNavigation() {
                    }
                        getExecutionTimeMessage(isTooltip)
        }

                statusBarLayoutJob.schedule(30);
    }
            UIUtils.asyncExec(() -> {
                ToolBar toolBar = panelInfo.actionToolBar.createControl(trControl);

                        Point displayAt = item.getParent().toDisplay(ib.x, ib.y + ib.height);
                            if (!metaAttr.isPseudoAttribute() && !metaAttr.isAutoGenerated()) {
                    true,

                        false,
        if (isDirty()) {
        }
    public Composite getViewerPanel()

            ResultSetViewer.this, model.getSingleSource(), model.getVirtualEntity(true));
    }
            return;
        }
                        newPresentation = this.availablePresentations.getFirst();
        if (supportsDecoratorFeature(IResultSetDecorator.FEATURE_EDIT) &&
    public List<? extends DBDValueRow> getAllRows() {
                }

            UIUtils.disposeChildControls(panelSwitchFolder);

                item.filter = dataFilter; // Update data filter - it may contain some orderings
                pSection.put("activePanelId", settings.activePanelId);
import java.time.Instant;
            }
                    }
                if (row != null) {
                    // Just ignore previous RS values
        public List<String> getQueryFilterHistory(@Nullable DBCExecutionContext context, @NotNull String query) {
            }
                    needPK = true;
            }
            size = getPreferenceStore().getInt(ModelPreferences.RESULT_SET_MAX_ROWS);
        private void beforeDataRead() {
import org.jkiss.dbeaver.DBException;

            if (activePresentation != null) {

                    return new DatabaseLoadService<>("Load row count", getExecutionContext()) {
        } else {
            ((GridLayout) panelComposite.getLayout()).verticalSpacing = 0;
                availablePresentations = Collections.emptyList();
            throw new DBException("Referencing entity [" + DBUtils.getObjectFullName(targetEntity, DBPEvaluationContext.UI) + "] is not a data container");
                        EnumSet.of(DBDValueHint.HintType.STRING),
        if (panelsActive) {
            ToolBar configToolBar = configToolBarManager.createControl(statusBar);
                        togglePanelsMaximize();
                        log.error(errorMessage, error);
            }
                if (success && getPreferenceStore().getBoolean(ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE)) {
            return false;
                    @Override
            if (correctedSelectedRowsIndexes[i] >= newRowIndex) {
            rowIdentifier = model.getDefaultRowIdentifier();
            rowIdentifier,
                log.debug("Internal error: data read status is empty");
            }
                    }
                    -1,//curRow == null ? -1 : curRow.getRowNumber(), // Do not reposition cursor after next segment read!
        }
                panel.setFocus();
    ////////////////////////////////////////////////////////////
                false,
    private void setNewState(DBSDataContainer dataContainer, @Nullable DBDDataFilter dataFilter) {
        }
        }
                }
            return;
            settings = new PresentationSettings();
                                } else {
        @NotNull ResultSetModel bindingsModel,
    }
                    return spd.getSaveSettings();
            DBWorkbench.getPlatformUI().showError("Can't show panel", "Can't create panel '" + id + "'", e);
                    } catch (DBException e) {
    }
        if (!settings.enabledPanelIds.contains(settings.activePanelId)) {


            DBDAttributeConstraint constraint = model.getDataFilter().getConstraint(attribute);
        }
    }

                        finalizer.run();
                                final DBDAttributeBinding metaAttr = attributes[index];
                            } catch (DBException e) {

                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_COPY_FROM_ABOVE));
    }

    private boolean isVisible() {
    private boolean restorePresentationState(Object state) {
        if (getExecutionContext() == null) {
            }
    // Refreshes model metadata (virtual objects + colors and other)

                Collections.addAll(settings.enabledPanelIds, panelIdList.split(","));
        boolean newWindow)
     * In some cases there may be many frequent data read requests (e.g. when user works
    private void createStatusBar0(@NotNull Composite parent) {
            if (dpj.isActiveTask()) {
            if (!ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
                }
            panelFolder.setRedraw(true);
        } else {
//            items.add(ActionUtils.makeCommandContribution(site, ResultSetHandlerMain.CMD_TOGGLE_LAYOUT));
            ToolBar editorToolBar = editToolBarManager.createControl(statusBar);
    }

        return true;
                case ISaveablePart2.CANCEL:
                }
        }

                cellValue,
            if (refTablesMenu != null) {
                        public String evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
                // Operators with no inputs
                    return false;
    public void showColumnMenu(DBDAttributeBinding curAttribute) {
        }
                }
     * @param bindingsModel       data bindings providing model. Can be a model from another results viewer.

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                    if (hints != null) {
            }
            }
            curState.rowNumber = newRow.getVisualNumber();
        this.decorator = container.createResultSetDecorator();
                dpj.cancel();
                    }
        // Also it is required to implement default grouping ordering (count desc)

            DBCLogicalOperator[] supportedOperators =
                    if (docAttribute != null) {
                    }

    void setMetaData(@NotNull DBCResultSet resultSet, @NotNull DBDAttributeBinding[] attributes)
        return ranges.toArray(new int[0][]);
                    listener.onUpdate(success);
    {
        applyChanges(monitor, new ResultSetSaveSettings());
        // Listen datasource events (like connect/disconnect/update)
                        .getBoolean(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS);
                            }

                ResultSetMessages.controls_resultset_viewer_action_show_selected_cell_count));
        public void deleteQueryFilterValue(@Nullable DBCExecutionContext context, @NotNull String query, String filterValue) {
    private List<IContributionItem> fillPanelsMenu() {
        }
        if (checkDoubleLock(lockedBy)) {
            this.viewerSash = UIUtils.createPartDivider(

        updatePresentationInToolbar();
                            if (isChecked()) {

    public void setStatus(String status) {
            final ResultSetPersister.DataUpdateListener applyListener = success -> {
            @NotNull ResultSetExecutionSource executionSource,

                    } catch (Throwable e) {
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_GO_TO_ROW));

        } else {
            if (viewerSash != null && viewerSash.getWeights().length > 1) {
        }
            }
                        }
            UIUtils.showPreferencesFor(

        }

            ) {
            return Collections.emptyList();
            index++;
            contextMenu.setLocation(location);
        if (selectionStatLabel == null || selectionStatLabel.isDisposed()) {
            setStatus(message, DBPMessageType.INFORMATION);
                viewMenu.add(transformersMenu);
                @Override
                    if (!metadataChanged) {

                };
    private CTabItem getPanelTab(String panelId) {
            panel = panelDescriptor.createInstance();
            toolbarList.add(editToolBarManager);
        if (activePresentation instanceof IStatefulControl) {
                            = new MenuManager(ActionUtils.findCommandName(ResultSetHandlerCopySpecial.CMD_COPY_SPECIAL));
                dataSourceContainer = ((DBPDataSourceContainerProvider) event.getSource()).getDataSourceContainer();
        }
                    UIUtils.setControlVisible(filtersPanel.getParent(), true);

        }
            DBeaverNotifications.showNotification(
        return recordMode;

                if (listener != null) {
                                break;
            }
    @Override
     * Saves changes to database
        }
                            if (!whereCondition.isEmpty()) {
    {
            // Bind custom attributes

            for (Map.Entry<DBDValueHint, UIPropertyConfiguratorDescriptor> entry : configurators.entrySet()) {

            }
                    }
        viewMenu.add(new DataFormatsPreferencesAction(this));
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        // Refresh cached hints for changed row

        if (attr != null) {
                getActivePresentation().showAttribute(currentAttribute);
        }
                            true,
                    filtersPanel.enableFilters(false);
                {
            }
            return;
    private void removePanel(String panelId) {
    @Override
        if (activePresentation instanceof IStatefulControl) {
                rowIndexes);
        }

        this.model.releaseAllData();

    @NotNull

                    saveReport.isHasReferences() && saveReport.getDeletes() > 0,
                                if (settingsDialog.open() == IDialogConstants.OK_ID) {
    public boolean isPanelVisible(String panelId) {

        if (state.rowNumber >= 0 && state.rowNumber >= segmentSize && segmentSize > 0) {
    }
            showEmptyPresentation();
                context, getDataSource(), null, IResultSetPresentation.PresentationType.COLUMNS));
    }
            return null;
        return refTablesMenu;

            activePresentation.updateValueView();

                statusBar.layout(true, true);
        return queryText;
            if (row.getState() == ResultSetRow.STATE_REMOVED || (row.isChanged(attr))) {
                        StringBuilder where = new StringBuilder();
                ResultSetMessages.controls_resultset_viewer_action_panels,
                // FK to dictionary - simple query
    private final Composite presentationPanel;
            return Collections.emptyList();
        // Set new presentation
        @NotNull String property,
            }
        DBSEntity singleSource = model.getSingleSource();
                    ConfirmationDialog.CONFIRM,
        }
                pSection.put("panelsVisible", settings.panelsVisible);
    public int getHistoryPosition() {

                    }
            return;
        if (CommonUtils.isEmptyTrimmed(stats)) {
        }
    public boolean hasColorOverrides() {

                                break;
                    IResultSetCommands.CMD_SELECT_ROW_COLOR, msgSelectRowColor, null));
                        final Menu swtMenu = panelMenu.createContextMenu(panelToolBar.getControl());
                panelsMenu.add(item);

        }
    @Override
                String bindingText = attr.getName()
        this.curRow = (this.model.getRowCount() > 0 ? this.model.getRow(0) : null);
            layoutMenu.add(new ToggleSelectionStatAction(this, ResultSetPreferences.RESULT_SET_SHOW_SEL_ROWS,
                        cellValue,
                            if (!CommonUtils.isEmpty(hint.getHintText())) {
            possibleActions.add(new VirtualAttributeDeleteAction(this, attr));
    }
                final List<ResultSetPresentationDescriptor> newPresentations;
    private ResultSetFilterPanel filtersPanel;
                    UIUtils.asyncExec(() -> updatePanelsContent(true));
     * @param listener finish listener (may be null)
        // Create filter copy to avoid modifications
                for (int i = 0; i < rowCount; i++) {
    }
import org.jkiss.dbeaver.Log;
                    if (CommonUtils.isNotEmpty(errorMessage) && query instanceof SQLQuery) {
    }
            log.debug("Internal error: actions double-lock by [" + lockedBy + "]");
                    throw new InvocationTargetException(e);
            supportsDecoratorFeature(IResultSetDecorator.FEATURE_COMPACT_FILTERS)
        if (rowsChanged) {
        return container.getExecutionContext();
            if (attrBinding == null) {
            return false;
        PanelInfo panelInfo = activePanels.get(id);

                    ResultSetMessages.controls_resultset_viewer_status_no_data + getExecutionTimeMessage(isTooltip);
                for (DBDCellHintProvider provider : hintProviders) {

        dialog.setInitPage(EditVirtualEntityDialog.InitPage.UNIQUE_KEY);

        }
                return Status.OK_STATUS;
                hasNavTables = true;
            dataPumpRunning.set(false);
                    if (focusRow >= 0 && (focusRow < model.getRowCount() || model.getRowCount() == 0) && model.getVisibleAttributeCount() > 0) {

        private void afterDataRead() {
        }
        ResultSetRow[] rows = selectedRows.toArray(new ResultSetRow[0]);
            }
        }
            manager.add(new TransformerAction(
            possibleActions.add(new VirtualForeignKeyEditAction(this));
            return "";
                        panelsButton.setToolTipText(toolTip);
            constraint.setOrderDescending(true);
                };
                }
                    String realValue = String.valueOf(getSegmentMaxRows());

            this.curRow = model.getRow(focusRow);
    public void switchPresentation() {
            if (!hasData()) {
            if (activePresentationDescriptor.getPresentationType().isPersistent()) {

                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_DELETE));
            layout.marginHeight = 0;
    @Override
            updateEditControls();
                } else {
                if (filtersPanel != null) {

                    try {
                        srcRowIndex++;
    public static final String CUSTOM_FILTER_VALUE_STRING = "..";
                    DateTimeFormatter.ISO_DATE.format(((LocalDateTime) endTime)),
    private static @NotNull String getHintObjectLabel(DBDValueHintProvider.HintObject ho) {
                        }

            contextMenu.setVisible(true);
            }
            toolBar.setRedraw(true);
            boolean panelsVisible = false;

                DBSEntityAttributeRef ownAttr = ownAttrs.get(i);
        MenuManager[] menuManager = new MenuManager[1];
                this.selectedRecords = this.curRow == null ? new int[0] : new int[]{curRow.getVisualNumber()};
        setActivePresentation(new EmptyPresentation());
            settings.panelsVisible = pSection.getBoolean("panelsVisible");
    }
    public Object getCellValue(
            return ISaveablePart2.YES;
        if (selectedRows.isEmpty()) {
                // Filters and View
            }
            if (!acquireDataReadLock()) {
                    newRowIndex++;
            }
            return true;
        DBSDataContainer dataContainer = getDataContainer();
            GridLayout layout = new GridLayout(2, false);
            model.getVisibleAttributeCount() > 0;
                // ignore

    private final CustomSashForm viewerSash;


        int[] rowIndexes,
        }
            DBCLogicalOperator[] supportedOperators =
    private void fireResultSetModelPrepared() {
        return true;
import org.jkiss.dbeaver.model.app.DBPProject;
                } catch (DBException e) {
        lockedBy.addFocusListener(new FocusListener() {


                                new ResultSetCellLocation(docAttribute, targetRow, null),
        menuManager.add(new EmptyAction(getHintObjectLabel(ho) + " hints"));
        } else if (activePresentation instanceof StatisticsPresentation) {
            DBWorkbench.getPlatformUI().showError(
                        DBExecUtils.bindUniqueIdentifiers(array, new VoidProgressMonitor());
                }
    }
    @Override
            runDataPump(

                historyPosition = i;
                            try {
                DBWorkbench.getPlatformUI()
                        // No filters in statistics presentation
        if (actionsDisabled) {
    @Nullable
        if (statusLabel != null && !statusLabel.isDisposed() &&
    ////////////////////////////////////////////////////////////
                row,

        }

        if (statistics == null || statistics.isEmpty()) {
    }
        {
        return model.getHintContext();
    }
            dataPumpJobQueue.add(dataPumpJob);
    }
    }

            selectedRows.stream()
        protected IContributionItem[] getContributionItems() {
    @Nullable
            }

    private static final String SETTINGS_SECTION_PRESENTATIONS = "presentations";
                        panelInfo.panel.setFocus();
            }
import java.util.*;
    }
            try {

                    SQLScriptElement query = null;
        // Cancel any refresh jobs
        DBSDataContainer dataContainer = getDataContainer();
            if (valueController != null) {
        }
                        public void widgetSelected(SelectionEvent e) {
                                        new ResultSetCellLocation(metaAttr, targetRow),
            endTime = LocalDateTime

                    VerticalButton panelButton = new VerticalButton(panelSwitchFolder, SWT.RIGHT | SWT.CHECK);
    }
                        manager.add(extCopyMenu);
        } else {
                                } catch (DBCException e) {
    }
import org.jkiss.dbeaver.model.impl.local.StatResultSet;
    @NotNull
                }
        }
                viewerSash.setMaximizedControl(viewerSash.getChildren()[0]);
                    formatsMenu.add(action);
            }
                        getExecutionTimeMessage(isTooltip)
        };
                            rows,
                    if (preferredPresentation != null) {
                constraint.setOperator(DBCLogicalOperator.IN);
    public boolean updateCellValue(
    }
        toolbarsLayout.wrap = true;

            });
            addToolBarManager.add(new GroupMarker(TOOLBAR_GROUP_PRESENTATIONS));
    }
    @Override
            Boolean autoRecordMode = getDecorator().getAutoRecordMode();
            int rowCount = model.getRowCount();
                    if (operator.getArgumentCount() < 0) {
        themeUpdateJob.setUser(false);
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FETCH_PAGE));
        if (this.recordMode && rowShift != 0 && selectedRecords.length > 0) {

                                    }
    }
                }
        }
                if (txnManager != null) {

        try {
            boolean panelHadFocus = activePanelTab != null && !activePanelTab.getControl().isDisposed()
            } else {

            DBSDataContainer dataContainer = getDataContainer();
                // Shift     selected records
                        if (txnManager.isAutoCommit()) {
    public boolean isAllAttributesReadOnly() {
        if (getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE) ||
    ) {
        }

    {
            savePresentationSettings();
    @Override
        return model.isDirty() || (activePresentation != null && activePresentation.isDirty());
    public boolean isDirty()
        return isDarkHighContrast ? UIStyles.getDefaultWidgetBackground() : UIStyles.getDefaultTextBackground();
                boolean checked;
            saveHistory,
        updatePanelsButtons();
                    });
        @Nullable int[] rowIndexes
                    sourceRowIndex = partitionStart + (fromRowAbove ? -1 : 1);

    private String getExecutionTimeMessage(boolean extended)
        }
        if (virtualEntity == null) {
        if (!toolbarList.isEmpty()) {
                    fillEditMenu(editMenu, attr, row, valueController);
    }
    public void resetDataFilter(boolean refresh) {
        DBSDataContainer dataContainer = getDataContainer();
            if (child instanceof VerticalButton && child.getData() instanceof ResultSetPanelDescriptor) {

    @NotNull
import org.eclipse.ui.internal.WorkbenchImages;

            @Override
            if (dataContainer != null) {

        navigateEntity(monitor, newWindow, targetEntity, constraints);
                    }
                gd.horizontalSpan = ((GridLayout) mainPanel.getLayout()).numColumns;
    @NotNull
                try {
                DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
    private void applyDefaultOrdering() {
        synchronized (dataPumpJobQueue) {

    }
        } catch (Exception e) {
                final TransformerAction action = new TransformerAction(
            return;
        if (saveSettings) {
            }
    public boolean isPresentationInFocus() {


    public boolean hasData() {
                // No entity reference - we cannot fetch any filter values for this attribute anyway
        }
                    DateTimeFormatter.ISO_TIME.format(((LocalDateTime) endTime))
        DBDDataFilter dataFilter = getDataFilter();
            afterDataRead();
            Map<String, Object> state = states.get(constraint.getFullAttributeName());
                editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_EDIT_INLINE));
        }
        }
    public Color getDefaultForeground() {
    @Override
            int focusRow,
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;
    // Status
        if (CommonUtils.isNotEmpty(model.getDataFilter().getOrder())) {
            IResultSetPresentation instance = selectedPresentation.createInstance();
        DBDAttributeTransformerDescriptor customTransformer = null;
        ResultSetRow row,
                    if (rows.size() <= 1) {

    private void createFilterPanel0(@NotNull Composite parent) {
                }
    private void updatePresentationInToolbar() {
                    rowsUpdated = stats.getRowsUpdated();
        contextMenu.setLocation(Display.getCurrent().getCursorLocation());
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        if (recordMode) {
    {
            throw new DBException(

            for (final DBDAttributeTransformerDescriptor descriptor : customTransformers) {

        } else {
        {
                setActivePresentation(new StatisticsPresentation());
                        // Value filters are available only if certain cell is selected
                );
        for (final ResultSetPanelDescriptor panel : availablePanels) {
    @NotNull
    /**
        long[] result = new long[1];
                ((IStatefulControl) activePresentation).restoreState(state));
        if (location != null) {
        return updatedSelectedRows;
        }

    {

    }

        DataSourceJob updateJob = model.getUpdateJob();
        // Clear panels toolbar
        if (model.getRowCount() == 0) {
        }
            @Override
                    }
                            if (error.getCause() instanceof InterruptedException) {
    public ResultSetRow getCurrentRow()
            this.dataPumpJobQueue.clear();
                        model.updateDataFilter(dataFilter, true);
                        SQLUtils.appendConditionString(
                        .getPreferenceStore()
        return null;
                "presentationId", activePresentationDescriptor.getId(),
        }

        setActivePresentation(new ErrorPresentation(sqlText, GeneralUtils.makeErrorStatus(message, error), container));
            }
            return true;
        if (updateJob != null) {
        PresentationSettings presentationSettings = getPresentationSettings();
                }
            // Update row count label
/*
 *
        String queryText = statistics == null ? null : statistics.getQueryText();
                                filtersMenu.add(new EmptyAction(type.getTitle()));
                DBeaverNotifications.NT_GENERIC,

                setUser(false);
    }
                // Regular results
    }
    public void toggleVerticalLayout() {
            final List<String> filters = filterHistory.get(query);
            final int[][] partitionedSelectedRows;
    public DBSEntity getSingleSource() throws DBException {
        historyPosition = stateHistory.size() - 1;
                                }
    }
            panel.panel.deactivatePanel();

        } catch (InterruptedException e) {
            return;
                            hasItems = true;
                ResultSetMessages.controls_resultset_viewer_action_refresh + " (" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                log.error("Can't find attribute binding for ref attribute '" + refAttr.getAttribute().getName() + "'");
    public IResultSetPanel[] getActivePanels() {
    @Override
            DBPDataSource dataSource = getDataSource();
            }
        if (resultSetSize != null) {
        int rowsRemoved = 0;
            case ROW -> "Row";
        activePresentation.clearMetaData();
    public void showPanels(boolean show, boolean showDefaults, boolean saveSettings) {
        }

    @Nullable
                        @Override
        } else {
                                return ROW_COUNT_FORMAT.format(rowCount);
        }
    private final VerticalFolder presentationSwitchFolder;
    private boolean actionsDisabled;
        } finally {
                rowsToDelete.addAll(selection.getSelectedRows());
        return false;
                final int partitionStart = partitionRange[0];
        return items;

        }
        if (ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES.equals(property)) {
        DataFilterRegistry.getInstance().saveDataFilter(dataContainer, model.getDataFilter());

        if (position < 0 || position >= stateHistory.size()) {

        if (index < availablePresentations.size() - 1) {
        List<? extends DBDAttributeTransformerDescriptor> applicableTransformers =
            }
                    if (operator.getArgumentCount() == 0) {
                        log.debug(e);
        MenuManager menuManager = new MenuManager();
            }
        if (!isDirty()) {
        }
    public boolean checkForChanges() {
                ResultSetMessages.controls_resultset_viewer_action_show_selected_row_count));
            showPanels(false, true, true);
        if (supportsDecoratorFeature(IResultSetDecorator.FEATURE_DECORATE_ON_DEMAND)) {

        for (IResultSetListener listener : getListenersCopy()) {
            }
            return;
                            fireResultSetModelPrepared();
        Object cellValue = getModel().getCellValue(attr, row);
        }
        presentationSettings.enabledPanelIds.add(id);
        }
            if (activePresentationDescriptor != null) {
                    changed = true;
                }
        }
        }
    }
                        sqlText = query.getText();
                manager.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_EXPORT));
            toolbarList.add(configToolBarManager);
        ((GridLayout) this.mainPanel.getLayout()).verticalSpacing = 0;
        updateEditControls();
        this.getModel().resetOrdering(columnElement);
                                // Skip pseudo and autoincrement attributes
        {
            } finally {
    @Override
            if (curItem != null) {
                            String whereCondition = where.toString().trim();
    private IResultSetPresentation activePresentation;
            ToolBarManager configToolBarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
    @Override
        updateEditControls();
                statusBar.layout(true, true);

    private static int[][] groupConsecutiveRows(@NotNull int[] indexes) {
    {
        statusBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
                    }
        }
                    saveChanges(null, new ResultSetSaveSettings(), success -> {
        if (presentationSwitchFolder != null) {
 * DBeaver - Universal Database Manager
                        ResultSetHandlerTogglePanel.PARAM_PANEL_ID, panel.getId());
        if (applicableTransformers != null) {
                DBPDataSource dataSource = dataContainer.getDataSource();
        final DBCExecutionContext executionContext = getExecutionContext();
                                        cells[index] = metaAttr.getValueHandler().getValueFromObject(session, attribute, origRow[index], true, false);
    }
        }
            mainPanel.addListener(SWT.Activate, new Listener() {
        } finally {
import java.util.concurrent.atomic.AtomicBoolean;
            isUIUpdateRunning = true;
    public void updateEditControls() {
                return dataStatus;
    ///////////////////////////////////////
            DBCExecutionContext executionContext = getExecutionContext();
                    }
                        activePresentationDescriptor = newPresentation;
    private void reorderLocally(DBDAttributeBinding columnElement)
                    curAttribute.getName()) != IDialogConstants.OK_ID)
            int[] panelWeights = new int[]{700, 300};
                for (DBDValueHint hint : valueHint) {
            orderingMode = OrderingStrategy.SERVER_SIDE;
                    );
        if (refConstraint == null) {
    // Virtual identifier management
    @NotNull
            };
        }
    @Override
                    }

            popup.setLocation(location);
                if (firstSelRecord < 0) firstSelRecord = 0;
    }
                .ofInstant(Instant.ofEpochMilli(statistics.getEndTime()), TimeZone.getDefault().toZoneId())
    private void openResultsInNewWindow(DBRProgressMonitor monitor, DBSEntity targetEntity, final DBDDataFilter newFilter) {
        }
                if (vAttr.getTransformSettings() != null && vAttr.getTransformSettings().hasValuableData()) {
    }

                );

    @NotNull
        if (model.getVisibleAttributeCount() == 0) {
                        continue;
        DBSEntity targetEntity = association.getParentObject();
        if (getExecutionContext() == null) {
                dataReceiver.setNextSegmentRead(true);
        } else {
    }
        }
                for (Control item : presentationSwitchFolder.getChildren()) {
        Control control = getActivePresentation().getControl();
    public void lockActionsByControl(Control lockedBy) {
                    viewMenu.add(new ResetRowColorAction(this, mapping, valueController.getValue()));
    private final boolean isDarkHighContrast;
        this.autoRefreshControl.setHintSupplier(() -> {
        @NotNull ResultSetRow row,

    {
                    }
        CTabItem activePanelTab = panelFolder.getSelection();
        }
            presentationSettings.put(presentation, settings);
                activePresentation.refreshData(true, false, true);
                e1);
        return supportsDecoratorFeature(IResultSetDecorator.FEATURE_STATUS_BAR);
                        IResultSetPresentation instance = newPresentation.createInstance();
                        log.error("Presentation '" + preferredPresentationId + "' not found");
        } else if (model.getStatistics() != null) {
        }

import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
                                filtersMenu.add(new Separator());
            if (dataContainer != null) {
                        query = ((SQLQueryContainer) dataContainer).getQuery();

                        getTransformSettings().enableTransformer(descriptor, !isChecked());
                    }
                true,
                settings.activePanelId = settings.enabledPanelIds.iterator().next();
        runDataPump(state.dataContainer, state.filter, 0, segmentSize, state.rowNumber, true, false, false, null);
        {
            if (!ArrayUtils.contains(selectedRecords, curRow.getVisualNumber())) {
                    this.curRow = model.addNewRow(newRowIndex, cells);
    @Override
        }
        fillOrderingsMenu(columnMenu, curAttribute);
            if (rowIdentifier != null && rowIdentifier.isValidIdentifier()) {
                            setActivePanel((String) activeTab.getData());
                try {
        //if (!model.getDataFilter().equals(dataFilter))
        }
            }
                }
    public int[] getSelectedRecords() {
            hasWarnings = model.getStatistics().getError() != null;
                    if (!CommonUtils.isEmpty(defaultPresentationId)) {
        DBCExecutionContext executionContext = getExecutionContext();
        }
                null,
            if (state != null) {
        if (selectedPresentation == activePresentationDescriptor) {
                );
        if (strategy == OrderingStrategy.SERVER_SIDE) {
        setStatus(status, DBPMessageType.INFORMATION);
    {
                if (!panelUpdated) {
            this.viewerPanel.setRedraw(true);
    }
    // Presentation & panels
                    continue;
    private void handleDataPropertyChange(
    }
                    @Override
        Point location;
                    GridData gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        if (transformSettings != null && transformSettings.getCustomTransformer() != null) {
        ActionUtils.removePropertyEvaluationRequestListener(propertyEvaluationRequestListener);
            {
                        getTransformSettings().setCustomTransformer(null);
    }
                if (model.getTotalRowCount() == null) {
    @Override
            return;

                    createStatusBar0(composite);
        return !virtualEntity.getColorOverrides().isEmpty();
                    return false;
        //Object state = savePresentationState();
                                panelSwitchFolder.redraw();
 * Unless required by applicable law or agreed to in writing, software
        }
        @Nullable final Runnable finalizer)
            }

                createFilterConstraint(rows, ownBinding, constraint);
        if (activePresentation instanceof AbstractPresentation abstractPresentation) {
        List<? extends DBSEntityAttributeRef> ownAttrs = CommonUtils.safeList(((DBSEntityReferrer) association).getAttributeReferences(monitor));
 * You may obtain a copy of the License at

            UIUtils.applyMainFont(statusBar);
            UIUtils.showMessageBox(null, "Open link", "Target entity '" + DBUtils.getObjectFullName(targetEntity, DBPEvaluationContext.UI) + "' - is not a data container", SWT.ICON_ERROR);
                return false;
                }
                this.panelFolder.setMenu(panelsMenu);
                }

        fireQueryExecuted(sqlText, null, error.getMessage());
            constraint.setOrderPosition(dataFilter.getMaxOrderingPosition() + 1);
        // Transformers
        if (availablePresentations.size() < 2) {


        if (panelInfo == null || panelInfo.actionToolBar == null) {
                        presentationSwitchFolder.setSelection(item);
                });
                panelInfo.actionToolBar = new ToolBarManager(SWT.HORIZONTAL | SWT.RIGHT | SWT.FLAT);
        this.curRow = null;
                        }
            throw new DBException("Referenced constraint [" + refConstraint + "] is not a referrer");
                            SQLSemanticProcessor.isForceFilterSubQuery(context.getDataSource())
            };
    public boolean isSaveAsAllowed()
    private void restoreConstraintVisualState(DBDAttributeConstraint constraint, Map<String, Object> state) {
        viewerPanel.addDisposeListener(e -> menuManager.dispose());
                return NLS.bind(
        }
                if (changed) {
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_NEXT));
import org.eclipse.swt.graphics.Color;
    private static final String CSS_CLASS_RESULT_SET_VIEWER = "ResultSetViewer";
                        String extraErrorMessage = ((SQLQuery) query).getExtraErrorMessage();
        } else {
        return switch (ho) {
                    }

            case CLIENT_SIDE -> false;
    private void trackPresentationStatistics() {

        } else {
        }
        } finally {
        boolean changed = false;
    @Override
        this.site = site;

        }
        //fire selection change to update selection statistics in ResultSetStatListener
            rejectChanges();
                            }
                isWindowVisible = true;

    {
            viewerSash.setMaximizedControl(viewerSash.getChildren()[0]);
                };
                desc = desc.substring(0, HISTORY_STATE_ITEM_MAXIMAL_LENGTH) + "...";
            ConfirmationDialog.confirmAction(getControl().getShell(), CONFIRM_SERVER_SIDE_ORDERING_UNAVAILABLE, ConfirmationDialog.WARNING);
        return stateHistory.size();

        navigateMenu.add(new Separator());
        }
                        return;
                if (panelItem != curItem) {
    public void readAllData() {
            ToolBar configToolBar = configToolBarManager.createControl(statusBar);
            return;
        this.dataReceiver = new ResultSetDataReceiver(this);
                        manager.add(ActionUtils.makeCommandContribution(site, IWorkbenchCommandConstants.EDIT_COPY));

        Map<DBDValueHint, UIPropertyConfiguratorDescriptor> configurators = new LinkedHashMap<>();
        if (activePresentation != null) {
import org.jkiss.dbeaver.model.data.order.OrderingStrategy;
                boolean newRecordMode;
 * you may not use this file except in compliance with the License.
            if (panelHadFocus) {
                        Collections.singletonMap("columns", attr.getName())));
    }
        if (updatePresentation) {
        PresentationSettings settings = getPresentationSettings();
            }
        }
            {
        }
    private static final int THEME_UPDATE_DELAY_MS = 250;
     */
                if (visiblePanel instanceof IAdaptable) {
        }
                attr,
            beforeDataRead();

        // make constraints
    /**
            resultSetSize.setToolTipText(DataEditorsMessages.resultset_segment_size);
        @NotNull
        //redrawData(false);
        if (model.isSingleSource()) {
                runDataPump(
        try {
                valueController.getValueManager().contributeActions(editMenu, valueController, null);
                                    final ResultSetValueController controller = new ResultSetValueController(
    public void doSave(IProgressMonitor monitor)
    @Override
    private Object savePresentationState() {
            filtersMenu.add(new OrderByAttributeAction(this, attribute, ColumnOrder.ASC));
        }
            // Try to get it from adapter
                        if (copyCurrent && srcRowIndex >= 0 && srcRowIndex < model.getRowCount()) {
        model.updateMetaData(newAttributes);
        return decorator;
            visiblePanel.refresh(forceRefresh);
            Object keyValue = model.getCellValue(new ResultSetCellLocation(attrBinding, (ResultSetRow) rows.getFirst()));
            createFilterPanel0(composite);
    @Override
    @Override
    }
        stateHistory.add(curState);
        DBSDataContainer dataContainer = getDataContainer();
                    }
                    }
import org.jkiss.dbeaver.ui.editors.text.DynamicFindReplaceTarget;
        int[] correctedSelectedRowsIndexes = Arrays.copyOf(this.selectedRecords, this.selectedRecords.length);
        this.activePresentation.clearMetaData();
                allHints,

                firstSelRecord += rowShift;
            rowIndexes);
            }
        for (int i = 0; i < stateHistory.size(); i++) {
                        @Override
                ((IQueryExecuteController) dataContainer).forceDataReadCancel(error);
                    }
        boolean hasNavTables = false;
            return Collections.emptyList();

            constraint.setOrderDescending(false);
            params.parameters = parameters;
        refTablesMenu.setActionDefinitionId(IResultSetCommands.CMD_REFERENCES_MENU);
        for (ResultSetPanelDescriptor panel : availablePanels) {
            // Refresh
        decorator.fillContributions(manager);
        }
import org.eclipse.ui.menus.IMenuService;
        items.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ACTIVATE_PANELS));

        return model.getCellValue(attribute, row, rowIndexes, retrieveDeepestCollectionElement);
            model.setStatistics(null);

        }
import org.jkiss.dbeaver.ui.controls.resultset.handler.*;
                return false;
     * @param attributes attributes metadata

                    public void close(CTabFolderEvent event) {
    {
     * Switch to the next presentation
                            }
    private final AbstractJob themeUpdateJob;
        }
        panelInfo = new PanelInfo(panelDescriptor, panel);
            CSSUtils.markConnectionTypeColor(this.presentationSwitchFolder);
    }
        return true;
                    @Override
    private MenuManager createRefTablesMenu(@Nullable DBRProgressMonitor monitor, boolean openInNewWindow) {
                        }
                visiblePanel.contributeActions(actionToolBar);
                ResultSetMessages.controls_resultset_viewer_action_view_format,
    public boolean supportsStatusBar() {
    public void redrawData(boolean attributesChanged, boolean rowsChanged) {

                    return promptToSaveOnClose();
            final int fontHeight = UIUtils.getFontHeight(statusBar);
        addListener(new ResultSetStatListener(this));
                public void run() {
                if (control != null && !control.isDisposed()) {

                DBSDataContainer dataContainer = getDataContainer();

        @Override
                    StringBuilder condBuffer = new StringBuilder();
                }
                });
                            if (pd.getId().equals(defaultPresentationId)) {
            manager.add(new GroupMarker(NavigatorCommands.GROUP_TOOLS));
            }
    private static final Log log = Log.getLog(ResultSetViewer.class);

            return;
                }
            {
            return true;
            CommandContributionItemParameter params = new CommandContributionItemParameter(
                    if (getControl().isDisposed()) {

    }
            updateJob.cancel();
            return false;
            if (!dataPumpRunning.get()) {
    {
            }
                        }
        }
            CTabItem panelTab = getPanelTab(id);
    public void setSelection(ISelection selection, boolean reveal)
                        case UI -> DTUIMessages.value_format_selector_display;
        }
        }
                    fetchSize = ResultSetPreferences.MIN_SEGMENT_SIZE;
import org.eclipse.swt.SWT;
    }
        // Check that we could have hints
        // Search in history
            activePresentationDescriptor.supportsPanels();
            }
        try {
        CTabItem panelTab = getPanelTab(panelId);
            if (autoRecordMode != null ||
        if (statusLabel == null || statusLabel.isDisposed()) {

            presentationPanel.setFocus();
                        log.error("Error refreshing rows after update", e);
        } else {
            ResultSetSaveReport saveReport = generateChangesReport();
                final int partitionLength = partitionEnd - partitionStart + 1;
                (model.isMetadataChanged() && getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE)))
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
        List<? extends DBDAttributeTransformerDescriptor> customTransformers =
            stateHistory.removeLast();



        if (settings.enabledPanelIds.isEmpty() && !availablePanels.isEmpty()) {
                            final ResultSetValueController controller = new ResultSetValueController(

                this.panelFolder.marginHeight = 0;
import org.eclipse.jface.util.IPropertyChangeListener;
            manager.add(openWithMenu);
        if (dataContainer == null) {

        // }
            for (DBDValueRow row : rows) {
            viewMenu.addMenuListener(manager1 -> fillVirtualModelMenu(manager1, attr));

            final Object value = valueController.getValue();
            DBDRowIdentifier rowIdentifier = firstAttribute.getRowIdentifier();
        // Save current state in history
        UIUtils.setHelp(this.viewerPanel, IHelpContextIds.CTX_RESULT_SET_VIEWER);
                PresentationSettings settings = pEntry.getValue();
            return;
        }
            listeners.add(listener);
                    }
        try {
            if (!supportsDecoratorFeature(IResultSetDecorator.FEATURE_COMPACT_STATUS)) {
            DBWorkbench.getPlatformUI().showError("Report error", "Error generating changes report", e);
                if (((VerticalButton) child).isChecked() != newChecked) {
                }
                        } else {
                    rowsFetched = stats.getRowsFetched();
                    CTabItem selectedItem = panelFolder.getItem(new Point(event.getBounds().x, event.getBounds().y));
    private static final String TOOLBAR_GROUP_PRESENTATIONS = "presentations";
                this.panelFolder.addDisposeListener(e -> panelsMenuManager.dispose());
        }
            fillLayoutMenu(layoutMenu, attr);
                context, getDataSource(), activePresentationDescriptor.getId(), activePresentationDescriptor.getPresentationType()));
            }
        }
                    }
        if (context == null || dataContainer == null) {
            trControl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        if (filtersPanel == null) {
                RowData rd = new RowData();
        throws DBException
                ResultSetViewer.this,
                                errorMessage = "Query execution was interrupted";
                }
                    try {
        @Nullable DBDAttributeBinding attribute,
    private void savePresentationSettings() {
            hintsMenu.addMenuListener(manager12 -> fillAttributeHintsMenu(manager12, attr, row));
                    gd.verticalIndent = 2;
                protected boolean isActionEnabled() {
        if (settings == null) {
            this.saveHistory = saveHistory;
        }
            }
            @NotNull DBCExecutionContext executionContext,
        }
            this.mainPanel, ResultSetViewer.class.getSimpleName(), monitor -> refreshData(null));
    @Override
        }
        panelFolder.setRedraw(false);
    }
        }
                final ResultSetRow sourceRow = model.getRow(sourceRowIndex);
                            getPresentationSettings().panelRatio = weights[1];
            }
                @Override
import org.eclipse.swt.events.*;
                        if (cells[0] == null) {
        // Set conditions
            if (constraint != null) {
                        fireResultSetLoad();
                tb.dispose();
        PresentationSettings() {
        }
                UIUtils.createLabelSeparator(panelComposite, SWT.HORIZONTAL);
    }
        }
        activePresentation.createPresentation(this, presentationPanel);
                    SQLUtils.appendConditionString(filter, context.getDataSource(), null, condBuffer, true);

    }
        updateStatusInfo(false);
                    if (dataContainer instanceof SQLQueryContainer) {
    @Override
                    } catch (Throwable e) {
    @NotNull
                                dataPumpJobQueue.remove(curJob);

                    panelsButton.setText(ResultSetMessages.controls_resultset_config_panels);

        this.getActivePresentation().refreshData(false, false, true);
        private static final int HISTORY_STATE_ITEM_MAXIMAL_LENGTH = 50;
                        sqlText = getActiveQueryText();

            ValueHintRegistry.getInstance().getHintDescriptors()
 */
            activePresentationDescriptor = selectedPresentation;
        }
        } else {
                constraint.setOperator(DBCLogicalOperator.EQUALS);
    private final AutoRefreshControl autoRefreshControl;
        for (DBDValueHintContext.HintConfigurationLevel cl : DBDValueHintContext.HintConfigurationLevel.values()) {
                        tb.addDisposeListener(e -> panelMenu.dispose());
import java.time.temporal.ChronoUnit;
            return false;
                panel.getId(),
        }
            if (filters != null) {
        if (dataContainer == null) {
            return;
                }
                                    try {

                            panelsButton.setChecked(isPanelsVisible());
                menuManager.add(new HintConfigurationAction(this, attr, entry.getKey(), entry.getValue()));
                    ResultSetMessages.controls_resultset_viewer_status_rows_time_long,
                updatePanelsContent(false);
            return;
        return dataReceiver;
        historyPosition = -1;
        final boolean refresh, // Refresh. Nothing was changed but refresh from server or scroll happened
                        );
        HistoryStateItem state = stateHistory.get(position);
                    });
                        }
        return curRow;
    @Override
            size = ResultSetPreferences.MIN_SEGMENT_SIZE;
        });
                DBDAttributeConstraint constraint = new DBDAttributeConstraint(ownAttr.getAttribute(), DBDAttributeConstraint.NULL_VISUAL_POSITION);
        savePresentationSettings();

        // Remove custom ordering. We can't use both custom and attribute-based ordering at once
                for (int partitionIndex = partitionStart; partitionIndex <= partitionEnd; partitionIndex++) {
            return false;
                    public void maximize(CTabFolderEvent event) {
                        UIUtils.setControlVisible(composite, false);
            menuManager.add(new Separator());
    }
                    RuntimeUtils.formatExecutionTime(totalTime),
                @Override
    private static class PanelInfo {
    private void fireQueryExecuted(String query, StatResultSet statistics, String errorMessage) {
        Collection<ValueHintProviderDescriptor> hdList,
            // Trick - in fact it is not a refresh but "execute" action
    private final List<IResultSetListener> listeners = new ArrayList<>();
    @Override
        return composite;
                    }
            return;
                        @Override
    @Override
import org.jkiss.dbeaver.registry.data.hints.ValueHintProviderDescriptor;
            this.findReplaceTarget = new DynamicFindReplaceTarget();
        if (recordModeButton != null) {
    {
                    if (item.getData() instanceof ActionContributionItem && ((ActionContributionItem) item.getData()).getAction() == this) {
            }
            viewMenu.addMenuListener(manager1 -> fillColumnViewMenu(manager1, attr, row, valueController));
        }
        toolbarList.clear();



    private DBDDataFilter restoreDataFilter(final DBSDataContainer dataContainer) {
        themeChangeListener = e -> scheduleThemeUpdate();
            return;
    // Actions
        if (singleSource == null) {
                    dataContainer,
        }
        DBDDataFilter curFilter = model.getDataFilter();
                    MenuManager filtersMenu = new MenuManager(
            items.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_TOGGLE_PANELS));
        }
                    constraint.setOperator(null);
            panelTab.setToolTipText(panelDescriptor.getDescription());
    implements DBPContextProvider, IResultSetController, ISaveablePart2, DBPAdaptable, DBPEventListener
            this.presentationSwitchFolder.setLayoutData(new GridData(GridData.FILL_VERTICAL));
            executionContext.getDataSource().getInfo().isReadOnlyData() ||
    public boolean refreshMetaData() {
    ///////////////////////////////////////
        if (!themeUpdateJob.isCanceled()) {
        if (isHasMoreData() && getDataContainer() != null && getDataContainer().isFeatureSupported(DBSDataContainer.FEATURE_DATA_COUNT)) {
        updateStatusMessage();
        this.defaultForeground = isDarkHighContrast ? UIStyles.COLOR_WHITE : UIStyles.getDefaultTextForeground();
        if (!this.viewerSash.isUpHidden()) {
                partitionOffset += partitionLength;
        final boolean saveHistory, // Save history state (sometimes we don'ty need it)

    @Override
        }
                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_COPY));
        if (!isDirty()) {
                        showErrorPresentation(sqlText, errorMessage, error);
        @NotNull DBDAttributeBinding attrBinding,
            new ResultSetExecutionSource(dataContainer, this, this, dataFilter),
                    finalizer.run();
            var composite = createFilterPanel();
    }
        }
                        sqlText = ((DBSQLException) error).getSqlQuery();
    }
                case ISaveablePart2.YES:
                MENU_ID_VIRTUAL_MODEL); //$NON-NLS-1$
    public void showFilterSettingsDialog() {
        }
    private volatile boolean needToRetryTaskOnWindowDeiconified = false;
        DBSDataContainer dataContainer;
                getSite().getPart(),
            }
    @Nullable

import org.jkiss.dbeaver.model.messages.ModelMessages;

                log.debug("Internal error: data read status is empty");
                });
    private ResultSetRow curRow;
                    newRecordMode = (rows.size() <= 1);
                    if (event.button != 1) {
                return false;
            constraint.setOptions((Object[]) state.get("options"));

            }
    public void clearEntityIdentifier()
        }
                    item.setImage(DBeaverIcons.getImage(pd.getIcon()));
        manager.add(new Separator(MENU_GROUP_ADDITIONS));
            return false;


            presentationSwitchFolder.setVisible(pVisible);
                            false);
                    DBPImage image = DBValueFormatting.getObjectImage(attr);
            configToolBarManager.update(true);
    }

            return true;
                }
import org.eclipse.ui.menus.CommandContributionItem;
            }
            if (curAttribute.getEntityAttribute() == null) {
        if (context == null) {
                toolBar.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
                if (sourceRowIndex < 0 || sourceRowIndex >= model.getRowCount()) {
                }
        }
        }

                        }
            manager.add(new TransformerAction(this, attr, "Settings ...", IAction.AS_UNSPECIFIED, false) {
        try {
                composite.setLayoutData(gd);
                Object cellValue = model.getCellValue(attr, row, rowIndexes, false);
    void removeDataPump(ResultSetJobAbstract dataPumpJob) {
                                try {
                }
                    }
                                    saveTransformerSettings();
        if (executionContext == null) {
                if (newRecordMode != recordMode) {
    }

                if (needToRetryTaskOnWindowDeiconified) {
    };
    }
            if (getStatistics() != null) {
                        manager.add(ActionUtils.makeCommandContribution(site, IActionConstants.CMD_PASTE_SPECIAL));

        if (attr.getDataKind() == DBPDataKind.BINARY || attr.getDataKind() == DBPDataKind.CONTENT) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
     * Creates a new data filter, keeping all visual state (visibility, etc.) from a previous one.
    public boolean editEntityIdentifier() {

    }
    }
                final int partitionStart = partitionRange[0];
                        ResultSetMessages.controls_resultset_viewer_status_rows_updated,
            resultSetSize.addModifyListener(e -> {
    private volatile long lastThemeUpdateTime;
        activePresentation.changeMode(recordMode);
    static final class PresentationSettings {
                curRow = rowCount == 0 ? null : model.getRow(rowCount - 1);
                    public void minimize(CTabFolderEvent event) {
                    }
            valueController = null;
            } else if (selection instanceof IResultSetSelection) {
    ///////////////////////////////////////////////////////
            activePresentation.scrollToRow(IResultSetPresentation.RowPosition.NEXT);
        isDarkHighContrast = UIStyles.isDarkHighContrastTheme();
            dataSource.getContainer().getConnectionConfiguration().getConnectionType().isConfirmDataChange()
        }
        boolean[] panelVisible = new boolean[1];
            }
    public void saveDataFilter() {

        DBCExecutionContext context = getExecutionContext();

        synchronized (listeners) {
                    constraint.setValue(value);
    public String getReadOnlyStatus() {
        UIUtils.disposeChildControls(presentationPanel);
        getAutoRefresh().enableControls(readyToRun);
        return container;
            if (showDefaults) {
        // Display format
                && UIUtils.hasFocus(activePanelTab.getControl());
            if (dataStatus != null) {
    // Context menus
            }
                "Data filter was saved",
            }
    private void createFilterConstraint(
                statusMessage += " [" + dataSource.getContainer().getName() + "]";
        long decoratorFeatures = getDecorator().getDecoratorFeatures();
        viewMenu.add(new TransformComplexTypesToggleAction(this));
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (panelDescriptor == null) {
        }
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;

    @Override
        model.setTotalRowCount(result[0]);
        if (!(refConstraint instanceof DBSEntityReferrer)) {
            return;
                    return;


                    // Retry later
            }
                        .mapToInt(ResultSetRow::getVisualNumber)
        UIUtils.asyncExec(() -> UIStyles.fixToolBarForeground(toolbarList));
            panelFolder.setFont(JFaceResources.getFont(UIFonts.Eclipse.PART_TITLE_FONT));
    public void setSegmentFetchSize(Integer segmentFetchSize) {


        // Set conditions
                {
        synchronized (listeners) {
        @NotNull DBDAttributeBinding attr,
        }

        } else {
                }
            super(ResultSetMessages.controls_resultset_viewer_action_options);
                            schedule(50);
            if (dataFilter.hasFilters()) {
        synchronized (dataPumpJobQueue) {
            // Set cursor on new row
    private ResultSetPresentationDescriptor activePresentationDescriptor;
                                        false
                        persister.refreshInsertedRows();
                    } else {
        } catch (Throwable e1) {
            valueController = new ResultSetValueController(
        if (activePanels.isEmpty()) {
        nextSegmentReadingBlocked = true;
    @NotNull
            if (panel.needsSeparator()) {
        if (!checkForChanges()){

            getReadOnlyStatus() == null &&

    }
                    UIUtils.setControlVisible(statusBar.getParent(), true);
            endTime = LocalDateTime
                final boolean metadataChanged = !scroll && model.isMetadataChanged();
                this,
        final DBDAttributeBinding docAttribute = model.getDocumentAttribute();

        @NotNull DBDAttributeBinding attr,
        }

        DBWorkbench.getPlatform().getDataSourceProviderRegistry().getGlobalDataSourcePreferenceStore().removePropertyChangeListener(dataPropertyListener);
                    viewerPanel.getShell(),
    ) throws DBException {
            }
                }

                this.availablePresentations = newPresentations;
            if (constraint != null && constraint.getOrderPosition() > 0) {
                    rows.add(model.getRowData(i));
                }
    private boolean recordMode;
            settings.verticalLayout = pSection.getBoolean("verticalLayout");
                activePresentation.updateValueView();
                    ResultSetPresentationDescriptor preferredPresentation = ResultSetPresentationRegistry.getInstance().getPresentation(preferredPresentationId);

                        saveTransformerSettings();
                //fire selection change to update selection statistics in ResultSetStatListener
    @Nullable
        } else {
        fireResultSetChange();
        if (!verifyQuerySafety()) {
                    @Override
        return model.getReadOnlyStatus(executionContext == null ?
        }
                }
        });
        if (!ArrayUtils.isEmpty(constraint.getOptions())) {
        }
                    }
        @NotNull

            this.viewerSash.hideUp();

        }
    public boolean isPanelsVisible() {
            menuService.populateContributionManager(editToolBarManager, TOOLBAR_EDIT_CONTRIBUTION_ID);
            }

                return true;
            index = 0;
        } else {
                    orderMenu.addMenuListener(manager1 -> fillOrderingsMenu(manager1, attr));
            @Override
        if (themeChangeListener != null) {

        IResultSetListener[] listenersCopy;
        if (isTooltip) {
    }
        }
        }
        curState = new HistoryStateItem(
        final DBVEntity virtualEntity = DBVUtils.getVirtualEntity(dataContainer, false);
        }
                        if (copyCurrent && srcRowIndex >= 0 && srcRowIndex < model.getRowCount()) {
                UIUtils.asyncExec(() -> {
            if (adapter.isAssignableFrom(activePresentation.getClass())) {
                    DBPPreferenceStore store = dataContainer.getDataSource().getContainer().getPreferenceStore();
                menuManager,

        ) {

                }
            throw new DBException(ModelMessages.error_not_connected_to_database);

                statusMessage += " - finished with error";

        try (DBCSession session = context.openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, ResultSetMessages.controls_resultset_viewer_add_new_row_context_name)) {

        }
    }
        try {
        List<ValueHintProviderDescriptor> applicableHints = getModel().getHintContext().filterApplicableHintProviderDescriptors(
        if (model.getAttributes().length == 0) {
        }
        return curState != null ? curState.dataContainer : container.getDataContainer();

        final int[][] partitionedSelectedRows = groupConsecutiveRows(
            } finally {
                        RuntimeUtils.formatExecutionTime(totalTime), endTime
        final DBSDataContainer dataContainer = getDataContainer();
                        setImageDescriptor(DBeaverIcons.getImageDescriptor(presentation.getIcon()));
        return activePresentation;

            }
                    ResultSetMessages.controls_resultset_viewer_status_rows_time,
                } else {
    public <T> T getAdapter(@NotNull Class<T> adapter)
import org.jkiss.dbeaver.registry.data.hints.ValueHintRegistry;
                log.warn("Presentation '" + pId + "' not found. ");
                    // Refresh updated rows
            }
        if (filtersPanel == null) {
                        } else {
        @Override
                model.setUpdateInProgress(null);
                    settings.enabledPanelIds.add(pd.getId());
                false,
                } else {
    @Override
            if (index == length || indexes[index - 1] != indexes[index] - 1) {
            }
                    model.getRowCount(),

        return model.getReadOnlyStatus(dataSourceContainer);
        DBDRowIdentifier rowIdentifier = model.getDefaultRowIdentifier();
            } else {
                // Set focus to presentation
            };
            }
                    UIUtils.syncExec(() -> {
    public static final String CONTROL_ID = ResultSetViewer.class.getSimpleName();
                        "navigate"); //$NON-NLS-1$
        ) {

    private List<ResultSetPresentationDescriptor> availablePresentations;
                    }
    public List<ResultSetPresentationDescriptor> getAvailablePresentations() {
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_PREVIOUS));
            location = getSite().getWorkbenchWindow().getWorkbench().getDisplay().getCursorLocation();

                constraints.add(constraint);
            // Enable presentations
        @Override
                model.setDataFilter(dataFilter);
        activePresentation = presentation;
        autoRefreshControl.cancelRefresh();
        PanelInfo panel = activePanels.get(panelId);
                    boolean wasCollapsed = toolbar.getLayoutData() != null;
        @NotNull List<? extends DBDValueRow> rows,
        if (getDataContainer() == null) {

    ////////////////////////////////////////////////////////////
                if (valueController.getValueHandler() instanceof DBDValueDefaultGenerator) {
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
    {
    {
        if (supportsDecoratorFeature(IResultSetDecorator.FEATURE_FILTERS)) {
    @Override
                                cells[0] = docAttribute.getValueHandler().createNewValueObject(session, docAttribute.getAttribute());
                    if (docAttribute != null) {
        if (panelSwitchFolder != null) {
            if (!ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
    }
                String preferredPresentationId = getDecorator().getPreferredPresentation();
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            WorkbenchImages.getImageDescriptor(IWorkbenchGraphicConstants.IMG_LCL_VIEW_MENU)) {
        if (getControl().isDisposed()) {
        }
        } finally {
    public DBDValueHintContext getHintContext() {
    public void toggleSortOrder(@NotNull DBDAttributeBinding columnElement, @Nullable ColumnOrder forceOrder) {
        @Override
    AutoRefreshControl getAutoRefresh() {
        DBDRowIdentifier rowIdentifier = getVirtualEntityIdentifier();
        if (popup.open() == IDialogConstants.OK_ID) {
        DataEditorFeatures.RESULT_SET_REFRESH.use();
        {
                @Override

            return dataPumpRunning.get();
            }
        this.selectedRecords = new int[0];
        try {
    };
        return
            possibleActions.add(new VirtualUniqueKeyEditAction(this, true));
                ToolBar toolBar = panelToolBar.createControl(trControl);
            this.viewerSash.setLayoutData(new GridData(GridData.FILL_BOTH));
        int rowNumber;

    }
    @Override
            if (settings.activePanelId == null) {
        }
        if (!skipKeySearch) {
            }
    }
            progressControl,
                    }
                    }
        }
    }

            return false;
            persister.applyChanges(monitor, true, settings, null);
    @Override
                    action.setChecked(displayFormat == defaultDisplayFormat);
        }
    @Nullable
        layoutMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ZOOM_OUT));
        int rowShift = 0;
                    refreshData(onSuccess);
            boolean pVisible = activePresentationDescriptor != null;
                if (settings.panelRatio > 0) {
        } else {
            persister.checkEntityIdentifiers();
            dataFilter,

            statusMessage += " - " + dataReceiver.getErrorList().size() + " warning(s)";
                changed = true;
                            }
                selectedRecords = new int[0];
        items.add(new Separator());
    public DBPDataSource getDataSource() {
                    final Object[] cells;
            if (hasColorOverrides()) {
            if (desc != null && desc.length() > HISTORY_STATE_ITEM_MAXIMAL_LENGTH) {
    public DBDRowIdentifier getDefaultRowIdentifier() {
                    try {
                    public void run() {
        boolean hasWarnings = !dataReceiver.getErrorList().isEmpty();
                T adapted = ((IAdaptable) activePresentation).getAdapter(adapter);
    }
        }

            constraint.setOrderPosition(0);
    IResultSetFilterManager getFilterManager() {
            } else {
            final DBSDataContainer dataContainer = executionSource.getDataContainer();
        }
    private static final String CONFIRM_SERVER_SIDE_ORDERING_UNAVAILABLE = "org.jkiss.dbeaver.sql.resultset.serverSideOrderingUnavailable";

        if (this.filterManager == null) {
            for (int k = 0; k < rows.size(); k++) {
        if (!recordMode && lastRowNum < model.getRowCount() - 1 && rowsRemoved == 0) {
            }
                segmentSize = (curRow.getVisualNumber() / segmentSize + 1) * segmentSize;
            dataContainer,
            for (DBDBinaryFormatter formatter : DBConstants.BINARY_FORMATS) {
    @Override
    @NotNull
                    String toolTip = ActionUtils.findCommandDescription(
                    }
        //toolbarsLayout.marginTop = 0;

            this.dataContainer = dataContainer;
        final IMenuService menuService = getSite().getService(IMenuService.class);
                                false
                rd.width = 50 * fontHeight;
            public void run() {
                this.panelFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
            if (visiblePanel != null) {
        // if (forceOrder == ColumnOrder.ASC) {
            DBDRowIdentifier rowIdentifier = attr.getRowIdentifier();
            }
    private void setActivePanel(String panelId) {
            return;
        dataFilter = new DBDDataFilter(dataFilter == null ? model.getDataFilter() : dataFilter);
import org.jkiss.dbeaver.ui.controls.resultset.view.StatisticsPresentation;
        }
                if (activePresentation.getControl() != null && !activePresentation.getControl().isDisposed()) {
                        break;
        }
            return createDataPersister(false).generateReport();
    private static final DateTimeFormatter EXECUTION_TIME_FORMATTER = DateTimeFormatter.ofPattern("MMM dd, HH:mm:ss");
        }
    private long readRowCount(@NotNull DBRProgressMonitor monitor) throws DBException {

                    ConfirmationDialog.WARNING, ResultSetPreferences.CONFIRM_FILTER_RESULTSET,
            executionContext = DBUtils.getDefaultContext(dataContainer, false);
            constraint.setOrderDescending(false);
    @Override

            updatePanelActions();
        }

        throw new IllegalArgumentException("ResultSet model can't be changed");
            return Collections.emptyList();
                for (VerticalButton item : presentationSwitchFolder.getItems()) {
                    } catch (DBException e) {
                    ActionUtils.findCommandDescription(IWorkbenchCommandConstants.FILE_REFRESH, getSite(), true) + ")",
    {
        final List<DBDAttributeBinding> selectedAttributes = getSelection().getSelectedAttributes();
                editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_EDIT));
                filtersMenu.add(new FilterResetAttributeAction(this, attribute));
        try {
                "Entity [" + DBUtils.getObjectFullName(targetEntity, DBPEvaluationContext.UI) + "] association [" + association.getName() +
        if (ownAttrs.size() != refAttrs.size()) {
        Map<DBDValueHint, UIPropertyConfiguratorDescriptor> configurators

    }
        if (ownAttrs.size() != refAttrs.size()) {
                    }
                        for (ResultSetPresentationDescriptor pd : this.availablePresentations) {
                MenuManager transformersMenu = new MenuManager(NLS.bind(ResultSetMessages.controls_resultset_viewer_action_view_column_type, attr.getName()));
                }
        UIUtils.asyncExec(() -> {
    public IResultSetSelection getSelection()
        }
        final ResultSetValueController valueController;

        }
                    panelButton.setLayoutData(gd);
            DBSEntityAttributeRef refAttr = refAttrs.get(i);
        }
     * <h3>Example</h3>
    public ResultSetModel getInput()
            }
                PresentationSettings settings = getPresentationSettings();
            dataPumpJobQueue.remove(dataPumpJob);
        if (getDataContainer() instanceof DBSEntity) {
            ConfirmationDialog.QUESTION
                        newRecordMode = autoRecordMode;
            List<IContributionItem> items = rsv.fillPanelsMenu();
                boolean changed = false;
                        site,
            getModel().resetOrdering(rowIdentifier.getAttributes());

        // Pump data
                for (ToolBarManager toolbarManager : toolbarList) {
    @Override
                        for (int index = 0; index < attributes.length; index++) {

    private Text selectionStatLabel;
    @NotNull
     * @param resultSet  resultset
                            }
                    rowsFetched = getModel().getRowCount();
        final DBCExecutionContext executionContext = getExecutionContext();
        this.model.setData(monitor, rows);
        if (supportsDecoratorFeature(IResultSetDecorator.FEATURE_PRESENTATIONS)) {
        }
                return new IContributionItem[0];
    public ResultSetSaveReport generateChangesReport() {
    public void reloadIdentifierAttributes() throws DBException {
        if (!configurators.isEmpty()) {
                fireResultSetModelPrepared();
                }
                        null,
    /**
                        checked = !transformSettings.isExcluded(descriptor.getId());
                }
        boolean singleSource = getModel().isSingleSource();
                        }
        if (activePresentation instanceof ISelectionProvider) {
            themeChangeListener = null;
            setDataContainer((DBSDataContainer) targetEntity, newFilter);
        }
            if (constraint != null && constraint.hasCondition()) {
        boolean applied = OrderingUtils.addOrderingOnClientSide(
        autoRefreshControl.enableAutoRefresh(false);
            filtersMenu.add(new Separator());
        this.mainPanel = new ConComposite(parent);
            }
            updateToolbar();
        filtersPanel = new ResultSetFilterPanel(
                @Override

            constraint.setOrderDescending(forceOrder == ColumnOrder.DESC);
            this,
        protected IStatus run(IProgressMonitor monitor) {
            int partitionOffset = 0;
    @Override
import org.eclipse.ui.internal.IWorkbenchGraphicConstants;
    public void setSelectionStatistics(@Nullable String stats) {

                }

                        ConfirmationDialog.CONFIRM);
    private ResultSetPanelDescriptor getPanelDescriptor(String id) {
                    panelButton.addSelectionListener(new SelectionAdapter() {
            }
    {
                return status;
        }
                    }
                0,
            switch (event.getData()) {
    private void scheduleThemeUpdate() {
                    break;
*/
    }
        DBPDataSourceInfo dataSourceInfo = dataSource.getInfo();
                    transformSettings != null && descriptor.getId().equals(transformSettings.getCustomTransformer()))
    private ActiveStatusMessage rowCountLabel;
        UIUtils.syncExec(() -> getActivePresentation().applyChanges());
                            }
            menuManager.add(new Separator());
    public ResultSetRow addNewRow(@NotNull RowPlacement placement, boolean copyCurrent, boolean updatePresentation) {
        boolean refreshHints) throws DBException {
        if (resultSetSize != null && !resultSetSize.isDisposed()) {
            DBDAttributeConstraint constraint = filter.getConstraint(curAttribute);
        if (executionContext != null &&
                            );
        }
                Control control = activePresentation.getControl();
        for (int i = 0; i < correctedSelectedRowsIndexes.length; i++) {
                pSection.put("enabledPanelIds", CommonUtils.joinStrings(",", settings.enabledPanelIds));
    public void togglePanelsMaximize() {
        return activePanels.values().stream().map(pi -> pi.panel).toArray(IResultSetPanel[]::new);
import org.eclipse.swt.graphics.Point;
    @Override
    {
            rowsToDelete.add(curRow);
        final OrderingStrategy strategy = OrderingStrategy.get(this.getPreferenceStore());
        UIUtils.syncExec(() -> panelVisible[0] = !mainPanel.isDisposed() && mainPanel.isVisible());
                            // Skip non-null, pseudo and autoincrement attributes
    public void navigateHistory(int position) {

import org.jkiss.dbeaver.model.*;
    }
                    rcMessage = ROW_COUNT_FORMAT.format(model.getRowCount()) + "+";
            CSSUtils.markConnectionTypeColor(this.panelSwitchFolder);
            if (statusBar != null) {
        }
    }
            }.execute();
                                    settings.setCustomTransformer(oldCustomTransformer);
        }
    @Override
            return false;

        return model.hasData();
                constraint.setVisible(true);
import org.jkiss.dbeaver.model.sql.*;
                {

            toolbarList.add(configToolBarManager);
                        if (weights.length == 2) {

    public IWorkbenchPartSite getSite()
    ) {
    @Override

        }
                    RuntimeUtils.formatExecutionTime(totalTime),
        viewMenu.add(new Separator());

                isExpensiveFilter = false;
                    manager.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_COPY_ROW_NAMES));
        );
                    if (placement == RowPlacement.BEFORE_SELECTION) {
        fireResultSetSelectionChange(new SelectionChangedEvent(ResultSetViewer.this, getSelection()));
            layoutMenu.add(new ToggleModeAction(this));
            }

        DBCExecutionContext executionContext = getExecutionContext();
            layout.verticalSpacing = 0;
    private void fillAttributeHintsMenu(IMenuManager menuManager, DBDAttributeBinding attr, ResultSetRow row) {
import org.eclipse.swt.layout.*;
                        ResultSetMessages.controls_resultset_viewer_action_order,
     * Navigate reference
                CSSUtils.markConnectionTypeColor(panelFolder);
        }
/**
                curRow == null ? -1 : curRow.getRowNumber(),
                        @Override
            }
        }
        changeMode(!recordMode);
            DBSEntityReferrer descReferrer = ResultSetUtils.getEnumerableConstraint(curAttribute);
            // Foreign key to some external table
        // In script mode history state isn't updated so we check for it here
            if (activePresentation instanceof IAdaptable) {
                toolBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            configToolBarManager.add(new ToolbarSeparatorContribution(true));
                        log.error("Can't generate filter condition", e);
    {
    {
                rows.size()) + getExecutionTimeMessage(true);
            }
    }
                    } catch (DBCException e) {
import org.jkiss.dbeaver.model.data.order.OrderingUtils;
    public ResultSetDataReceiver getDataReceiver() {
                UIUtils.syncExec(() -> autoRefreshControl.scheduleAutoRefresh(!success));
 * limitations under the License.
        redrawData(true, false);
                    boolean hasItems = false;

        }
                return;
            UIUtils.syncExec(() ->
        if (rowIdentifier != null) {
            }
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_GO_TO_COLUMN));
        }
                                    );
            dpjCopy = new ArrayList<>(this.dataPumpJobQueue);
                    if (item.getData() == activePresentationDescriptor) {

                } else {
            dataReceiver.setHasMoreData(false);
                } else {
    }
            this.selectedRecords = Arrays.stream(this.selectedRecords).filter(value -> value < rows.size()).toArray();
        return UIUtils.confirmAction(null, ResultSetMessages.confirm_modifying_query_title, ResultSetMessages.confirm_modifying_query_message, DBIcon.STATUS_WARNING);
        //manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
            List<String> filters = filterHistory.get(query);
                    .showError("Cannot navigate", "Attribute " + ownAttr.getAttribute() + " is missing in result set");
            findReplaceTarget.setTarget(nested);
            ToolBar rsToolbar = new ToolBar(statusBar, SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
        updateStatusInfo(true);

    @Override
                        UIUtils.syncExec(() -> redrawData(true, true));
                manager.add(editMenu);
    void queueDataPump(ResultSetJobAbstract dataPumpJob) {
            return false;
    @NotNull
        {

                                curJob.schedule();
            return ISaveablePart2.NO;
                    item.addSelectionListener(new SelectionAdapter() {
        {
import java.util.stream.Collectors;
                } catch (DBException e) {
        if (adapter == IResultSetContext.class) {
        }
        @Override
        DBPProject project = container.getProject();
            viewMenu.add(new CustomizeColorsAction(this, attr, row));
            Runnable finalizer = () -> {

    }
                manager.add(new TransformerAction(this, attr, descriptor.getName(), IAction.AS_CHECK_BOX, checked) {
                state[0] =  ((IStatefulControl) activePresentation).saveState());
    }
                }
        if (rowIdentifier == null) {
        updateToolbar();
            registry.findTransformers(dataSource, attr, true);


                        ResultSetUtils.formatRowCount(rowsUpdated),

            viewMenu.add(binaryFormatMenu);


        }
    }
import org.jkiss.dbeaver.ui.*;

        }
                    }
//        for (IResultSetPanel panel : getActivePanels()) {
        if (filterFocused) {
                log.debug("Panel '" + id + "' tab not found");
                    return true;
        boolean supportsPanels = supportsDecoratorFeature(IResultSetDecorator.FEATURE_PANELS);
            final Throwable error = getError();
                        store.setValue(ModelPreferences.RESULT_SET_MAX_ROWS, fetchSize);
                        boolean visibilityChanged = !model.getDataFilter().equalVisibility(dataFilter);
        }
                filtersMenu.add(new Separator());
                    manager.add(navigateMenu);
            panel.createContents(activePresentation, panelPH);
                        UIUtils.setControlVisible(composite, false);
            return;
                if (error != null) {
                }
                if (valueHint == null) {
     * Reads row count and sets value in status label
                    editMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_ROW_ADD));
    public DBDDataFilter getDataFilter() {
        dataPumpJob.setRefresh(refresh);
            menuManager.add(new HintEnablementAction(this, hd, attr));
            mainPanel.layout(true, true);
                        }
                }
            this.panelSwitchFolder = new VerticalFolder(mainPanel, SWT.RIGHT);
                                null
        if (model.isUpdateInProgress() ||
                .ofInstant(Instant.ofEpochMilli(statistics.getEndTime()), TimeZone.getDefault().toZoneId())
                }
    private static final String TOOLBAR_NAVIGATION_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.ui.controls.resultset.status.navCmds";
            List<String> filters = filterHistory.computeIfAbsent(query, k -> new ArrayList<>());

            updateEditControls();
                }

        }
                presentationSwitchFolder.setEnabled(true);
                CommandContributionItem.STYLE_CHECK
    public boolean isRecordMode() {
        }
        return composite;
                if (finalizer != null) {
            return;
    private Composite createStatusBar() {

            resultSetSize = new Text(statusBar, SWT.BORDER);
    }

                    toolbar.setLayoutData(toolbar.getItemCount() > 0 ? null : new RowData(0, 0));
            DBWorkbench.getPlatformUI().showError("SQL script generate error", "Error saving changes in database", e);
    }
        if (this.curRow != null && newRow != null) {
        this.updateFiltersText();
                    We allow zero length row list for the situations when we load new an empty resultSet and the last resultSet
                                        this,
        }
                        newPresentations = Collections.emptyList();
            savePresentationSettings();
        }.confirm();
        constraint.setVisible((boolean) state.get("visible"));
        }
            return false;
            if (supportsPanels) {
        }

        DBSDataContainer dataContainer = getDataContainer();
            }
                recordModeButton = new VerticalButton(presentationSwitchFolder, SWT.LEFT | SWT.CHECK);

        toolbarsLayout.marginLeft = 0;
            if (!getControl().isDisposed()) {
    private IPropertyChangeListener themeChangeListener;

        return selectedRecords;
                getSegmentMaxRows(),
                        // New data filter may have different columns visibility
                    final ResultSetRow targetRow = model.getRow(partitionIndex);
                if (dataContainer != null && dataContainer.getDataSource() != null) {
                            updatePanelsButtons();
        return true;
                        panelButton.setToolTipText(panel.getLabel() + " (" + toolTip + ")");
            if (!CommonUtils.equalObjects(rowCountLabel.getMessage(), rcMessage)) {
                    return Status.OK_STATUS;
    }
    }
                        continue;
    public void lockActionsByFocus(final Control lockedBy) {
        }
    }
                    columnElement.getName()) != IDialogConstants.YES_ID)

        if (dataContainer != null) {
            }
                    } else {
        @Nullable final DBDDataFilter dataFilter,
            );
            if (activePanelTab != null && activePanelTab.getControl() != null) {
            panelSwitchFolder = null;
            }
        }
        }
    }
                UIUtils.createEmptyLabel(presentationSwitchFolder, 1, 1).setLayoutData(new GridData(GridData.FILL_VERTICAL));
                        for (final DBDAttributeBinding metaAttr : selectedAttributes) {
    private volatile boolean nextSegmentReadingBlocked;

            @Override
        }
        }
                });

            {
                fireResultSetSelectionChange(new SelectionChangedEvent(ResultSetViewer.this, getSelection()));
import org.eclipse.core.runtime.IAdaptable;
        }
        final DBVEntity virtualEntity = DBVUtils.getVirtualEntity(dataContainer, false);
                        try {
        DBCStatistics statistics = model.getStatistics();
                    DBDValueHint[] hints = provider.getCellHints(
                UIUtils.updateContributionItems(tb);
        DBCStatistics statistics = getModel().getStatistics();
            });
            }
            }
                return EMPTY_LISTENERS;
        }
        private final Map<String, List<String>> filterHistory = new HashMap<>();
    void fireResultSetChange() {
                    panelWeights = new int[] {1000 - settings.panelRatio, settings.panelRatio};
        }

        }
                }
            addToolBarManager.add(new Separator(TOOLBAR_GROUP_ADDITIONS));
import java.time.LocalDateTime;
                    }
                if (fetchSize > 0 && fetchSize < ResultSetPreferences.MIN_SEGMENT_SIZE) {
        viewMenu.add(new ColorizeDataTypesToggleAction(this));
                if (pEntry.getKey() == null) {
        if ((getDecorator().getDecoratorFeatures() & IResultSetDecorator.FEATURE_PRESENTATIONS) != 0) {
                    // Standard items
        }
            // Stats presentation
        }
                            ResultSetHandlerTogglePanel.showResultsPanel(ResultSetViewer.this, panel.getId(), isPanelVisible);
import org.jkiss.dbeaver.ui.controls.resultset.view.ErrorPresentation;
        return model.getAllRows();
        }
            selectionStatLabel.setText(" ");
            project.getDataSourceRegistry().addDataSourceListener(this);

                ResultSetMessages.controls_resultset_viewer_action_layout,
     * <pre>
        if (!dataReceiver.isHasMoreData()) {
            CSSUtils.markConnectionTypeColor(editorToolBar);


import org.eclipse.swt.widgets.*;
            throw new DBException("Entity [" + DBUtils.getObjectFullName(targetEntity, DBPEvaluationContext.UI) + "] is not a data container");
                if (!ArrayUtils.isEmpty((Object[]) value)) {
            return null;
            }
        //     dataFilter.resetOrderBy();
    }
        boolean updated = model.updateCellValue(attr, row, rowIndexes, value, true);
                    }
            ToolBarManager configToolBarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
                    case BEFORE_SELECTION -> partitionOffset + partitionStart;
        if (context != null) {

    // Grid/Record mode
    }
            // Clear queue
            ToolBarManager editToolBarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;
            } else if (UIUtils.hasFocus(panelFolder)) {
                    if (newPresentation == null) {

            }
                    panelsButton.addSelectionListener(new SelectionAdapter() {
            this.panel = panel;
    private static final String TOOLBAR_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.ui.controls.resultset.status";
        }
                        viewerPanel.getShell(),
                    return result;
        }
                                        attribute,
                IValueController.EditType.NONE,
        if (!dataReceiver.isHasMoreData()) {

            return null;
                    ((VerticalButton) child).setChecked(newChecked);
            }.schedule();
                this.panelFolder.marginWidth = 0;
            }
                    try {
                    newRowIndex = model.getRowCount();
        final DBDRegistry registry = DBWorkbench.getPlatform().getValueHandlerRegistry();
            segmentSize = (state.rowNumber / segmentSize + 1) * segmentSize;
                curItem.dispose();
                        }
            ToolBarManager addToolBarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
            log.debug(e);
        Point cursorLocation = getActivePresentation().getCursorLocation();

    @NotNull
        ) {

        showContextMenuAtCursor(menuManager);
            setActivePanel(id);
    @Override
        clearData(true);
                    String toolTip = ActionUtils.findCommandDescription(IResultSetCommands.CMD_TOGGLE_PANELS, getSite(), false);
                final Control control1 = getControl();
        for (ToolBarManager tb : toolbarList) {
                            controller.updateValue(sourceValue, false);
    private static final String TOOLBAR_GROUP_NAVIGATION = "navigation";
    @Nullable
            return false;
        try (DBCSession session = executionContext.openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, ResultSetMessages.controls_resultset_viewer_add_new_row_context_name)) {
                            return;

        switchPresentation(availablePresentations.get(index));

                log.debug("Bad selection type (" + selection + ") in presentation " + activePresentation);
        public PanelInfo(ResultSetPanelDescriptor descriptor, IResultSetPanel panel) {
        synchronized (dataPumpJobQueue) {
    }
        IResultSetPanel panel;
    }
                @Override
    }
            }
    }
                    newPresentations = ResultSetPresentationRegistry.getInstance().getAvailablePresentations(resultSet, context);
                }
            settings.enabledPanelIds.add(availablePanels.getFirst().getId());
            Map<String, String> parameters = new HashMap<>();
            dataFilter,
                model.getDataFilter(),
            }
                String pId = pEntry.getKey().getId();

            dataReceiver.setNextSegmentRead(false);
    }
        }
        RowLayout toolbarsLayout = new RowLayout(SWT.HORIZONTAL);
        }
            viewMenu.setRemoveAllWhenShown(true);

    // Misc
        final DBPDataSource dataSource = getDataSource();
            return context.getDataSource().getContainer().getPreferenceStore();
    }
                    if (panel.isDirty()) {
            listener.handleResultSetSelectionChange(event);
        return updated;
                                    ResultSetViewer.this, attr, false);
            return false;
            return;
    /**
        if (queryText == null || queryText.isEmpty()) {
        }
            }
                if (setActive) {
        }
     * {1} &rArr; {[1..1)}
                        // Update status (update execution statistics)
        }
        } else if (forceOrder == ColumnOrder.ASC) {
                rowIdentifier.clearAttributes();
                    return hasData();
    public void doSaveAs()


        if (activePresentationDescriptor.supportsHints() && row != null && attr != null) {
                        restorePresentationState(presentationState);
                                true,
            public void focusLost(FocusEvent e) {
        }
                    ToolBar toolbar = toolbarManager.getControl();
    }
            registry.findTransformers(dataSource, attr, false);
        }
        private final Runnable finalizer;
        }
                afterDataRead();
            MenuManager viewMenu = new MenuManager(
        PresentationSettings settings = getPresentationSettings();
            final DBDDataFilter dataFilter = new DBDDataFilter();


        }

                        return;
                            setCurrentRow(getModel().getRow(focusRow));
        try {
        if (showPanels && !isPanelsVisible()) {
    List<DBVColorOverride> getColorOverrides(@NotNull DBDAttributeBinding binding, @Nullable Object value) {
        }
        }
        }
    public void updateDirtyFlag() {
            }
        }
                dataContainer,


            }
            if (panelIdList != null) {
        fillFiltersMenu(columnMenu, curAttribute, currentRow);
                }
                        swtMenu.setVisible(true);

            log.debug("Wrong history position: " + position);
    }
                        filtersMenu.add(new FilterByAttributeAction(operator, FilterByAttributeType.INPUT, attribute));
    @NotNull
            );
    }
        List<ResultSetRow> selectedRows = getSelectedRows();

        lockedBy.addDisposeListener(e -> actionsDisabled = false);
        IResultSetPanel visiblePanel = getVisiblePanel();
                }
                    @Override
            updateEditControls();
        if (attribute != null) {
        // Set focus in presentation control
        }

    }
        }
        filtersMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_FILTER_EDIT_SETTINGS));
//            throw new DBException("Can't save data for result set from multiple sources");

        }
            runDataPump(dataContainer, dataFilter, 0, segmentSize, 0, true, false, false, finalizer);
                    MenuManager navigateMenu = new MenuManager(
    public void removeListener(IResultSetListener listener)
    boolean acquireDataReadLock() {
        if (hdList.isEmpty()) {

        }

                return adapter.cast(activePresentation);
            !(activePresentation instanceof IResultSetEditor) ||
                        if (operator.getArgumentCount() > 0) {

import org.jkiss.utils.CommonUtils;
    }
            layoutMenu.add(new Separator());

                log.error("Error binding custom attributes", e);
                    case AT_END -> model.getRowCount();
                }
            } else {
        }
                statusMessage =
            }
    private void activateDefaultPanels(PresentationSettings settings) {
    }
    public int getSegmentMaxRows()
            CSSUtils.markConnectionTypeColor(navToolBar);
                            if (cells[index] == null && !metaAttr.isPseudoAttribute() && !metaAttr.isAutoGenerated()) {
    private Composite createFilterPanel() {
    }
        DBPDataSource dataSource = getDataSource();
                }

            if (!availablePanels.isEmpty()) {
        }
                        public void widgetSelected(SelectionEvent e) {
        List<ResultSetJobAbstract> dpjCopy;
                        public void run() {
                if (statusBar != null) {
            (executionContext.getDataSource().getContainer().isConnectionReadOnly() ||
        };
            }
                    ResultSetMessages.controls_resultset_viewer_status_empty + getExecutionTimeMessage(isTooltip);
        this.recordMode = recordMode;

            }
            resultSetSize.setLayoutData(new RowData(5 * fontHeight, SWT.DEFAULT));
                if (adapted != null) {
        @NotNull DBRProgressMonitor monitor,
        if (container.getDataContainer() == null || !container.getDataContainer().isFeatureSupported(DBSDataContainer.FEATURE_DATA_MODIFIED_ON_REFRESH) ) {
            IFindReplaceTarget nested = null;
        }
            return "Active presentation doesn't support data edit";
        return getExecutionContext() != null && dataReceiver.isHasMoreData();
            }
        }
    }
    }
        return model.getSingleSource();
                    {
                    public void run() {
                    String formatName = switch (displayFormat) {
                }
        }

                    panelsButton.setChecked(panelsVisible);
        PanelInfo panelInfo = isPanelsVisible() ? activePanels.get(getPresentationSettings().activePanelId) : null;
                viewMenu.add(formatsMenu);
    }
        refreshHintCache(
                            if (e.widget != null && e.widget.getData() != null) {
                } else {
    private HistoryStateItem curState = null;
                                needRefresh = true;
                // Virtual foreign key change - let's refresh
            }
        statusBarLayoutJob.schedule(10);
    }
                        if (getCurrentRow() == null && model.getRowCount() > 0) {
        }
                    }
        availablePanels.clear();
                    if (dataFilter != null) {
        navigateMenu.add(new Separator());
        }
                            applyCurrentPresentationThemeSettings();
            layoutMenu.add(new Separator());
        if (UIUtils.isUIThread()) {
            DBDAttributeBinding firstAttribute = model.getVisibleAttribute(0);
        @Override
    }
     * {1, 2, 3, 4, 5, 6, 7} &rArr; {[1..7)}
                manager.add(new Separator());

    public IResultSetDecorator getDecorator() {
        // Workaround for script results
            scheduleThemeUpdate();
            getActivePresentation().refreshData(false, false, true);
    public ResultSetViewer(@NotNull Composite parent, @NotNull IWorkbenchPartSite site, @NotNull IResultSetContainer container) {
            public void focusGained(FocusEvent e) {
            for (Map.Entry<ResultSetPresentationDescriptor, PresentationSettings> pEntry : presentationSettings.entrySet()) {
            // Toggle to DESC ordering
    private final Job statusBarLayoutJob = new Job("Pending result set view status bar re-layout") {
        }
                    if (!CommonUtils.isEmpty(toolTip)) {
                                final DBSAttributeBase attribute = metaAttr.getAttribute();
            layoutMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_SWITCH_PRESENTATION));
            if (setActive || firstPanel) {
                                        true,
            super(dataContainer, executionSource, executionContext, progressControl);
                new ResultSetCellLocation(attr, row, rowIndexes),
            if (!recordMode) {
    void updatePresentation(final DBCResultSet resultSet, boolean metadataChanged) {
            throw new DBException(
                    final ResultSetPresentationDescriptor presentation;
            }
            if (hasWarnings) {
    @Override
                        public void widgetSelected(SelectionEvent e) {
        public List<ResultSetRow> getSelectedRows() {
                }
        refTablesMenu.add(ResultSetReferenceMenu.NOREFS_ACTION);
        }
        curState.filter = new DBDDataFilter(bindingsModel.getDataFilter());
                                log.warn(e);
    private void showContextMenuAtCursor(MenuManager menuManager) {
        if (segmentFetchSize != null && segmentFetchSize > 0) {
        @NotNull DBDValueRow row,
                    panelButton.setImage(DBeaverIcons.getImage(panel.getIcon()));

        // Collect all potentially applicable hints
        int[] updatedSelectedRows = ArrayUtils.add(correctedSelectedRowsIndexes, newRowIndex);
    @Override
        if (dataSource == null) {
                    showEmptyPresentation();
            return null;
        try {
            listeners.remove(listener);

            this.viewerPanel.addDisposeListener(e -> dispose());
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
        if (rows.size() == 1) {
        @NotNull List<? extends DBDValueRow> rows,
    {

        final DBCExecutionContext context = getExecutionContext();
                        SWT.PUSH,

    public IResultSetPresentation getActivePresentation() {
    }
                    SQLScriptElement query = ((SQLQueryContainer) dataContainer).getQuery();
            menuManager.add(new Separator());
        }
    }
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
            if (model.getAllRows().isEmpty()) {
            DBVEntityConstraint vConstraint = vEntity.getBestIdentifier();
            }
                    firstSelRecord = model.getRowCount() - selectedRecords.length;
                if (ConfirmationDialog.confirmAction(
            if (vConstraint != null) {

            updateFiltersText();
            if (activePanelTab != null && !activePanelTab.getControl().isDisposed() && UIUtils.hasFocus(activePresentation.getControl())) {
            }
        if ((getDecorator().getDecoratorFeatures() & IResultSetDecorator.FEATURE_PANELS) != 0) {
            return defaultBackground;
                                IValueController.EditType.NONE,
            dataReceiver.setFocusRow(focusRow);
    @Override
                    ResultSetMessages.controls_resultset_viewer_action_edit,
                @NotNull
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    RuntimeUtils.formatExecutionTime(fetchTime),
        ResultSetRow currentRow = getCurrentRow();
        if (filtersPanel == null || this.viewerPanel.isDisposed()) {
            showPanels(true, false, false);
                }
        boolean supportsVirtualKeys = dataSource.getContainer().getDriver().supportsVirtualKeys();
        // Disable auto-refresh
        public DBDAttributeBinding getElementAttribute(Object element) {
        throws DBException

                            panelMenu.add(menuItem);
                manager.add(new Separator());
        DBSEntityConstraint identifier = rowIdentifier == null ? null : rowIdentifier.getUniqueKey();
            composite.setLayoutData(gd);
                activePanelTab.getControl().setFocus();
        // Move one row down (if we are in grid mode)
            final DBDAttributeBinding docAttribute = model.getDocumentAttribute();
            MenuManager openWithMenu = new MenuManager(ActionUtils.findCommandName(ResultSetHandlerOpenWith.CMD_OPEN_WITH));
    private final List<ToolBarManager> toolbarList = new ArrayList<>();
            boolean firstPanel = panelFolder.getItemCount() == 0;
        for (Control child : panelSwitchFolder.getChildren()) {
                        // Null cell value - no operators can be applied
        }
    }
                }
        @NotNull IMenuManager filtersMenu,
        }
                } else {
                activePanelTab.getControl().setFocus();
import java.text.DecimalFormat;
    }
                List<DBDCellHintProvider> hintProviders = model.getHintContext().getCellHintProviders(attr);
                // Handle updates for virtual constraints: refresh identifiers when a constraint changes
        // Copy cell values in new context

        Object cellValue,
            manager.add(layoutMenu);
        };
            ToolBarManager navToolBarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
                DataEditorFeatures.RESULT_SET_PRESENTATION_RECORD.use(
            MenuManager refTablesMenu = createRefTablesMenu(null, false);
        boolean needRefresh = false;
            statusLabel.setStatus(status, messageType);
                    if (attr instanceof DBDAttributeBindingCustom) {
            });
            for (ToolBarManager tb : toolbarList) {
    private static final String TOOLBAR_CONFIGURATION_VISIBLE_PROPERTY = "org.jkiss.dbeaver.ui.toolbar.configuration.visible";
        this.viewerPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
                        CTabItem activeTab = panelFolder.getSelection();
    /**
            return;
            }
                    updateFiltersText(false);

                    MENU_ID_EDIT

        int panelRatio;
                    activePresentation.formatData(true);
            manager.add(panelsMenu);
                        null,
    {
    public ResultSetModel getModel()

                        switchPresentation(presentation);
        if (supportsDecoratorFeature(IResultSetDecorator.FEATURE_PANELS)) {
            return true;
                if (row != null && menuLocation == ContextMenuLocation.ROW_HEADER) {


        //toolbarsLayout.marginBottom = 0;
                refreshWithFilter(dataFilter);
        if (atKeyboardCursor) {
                DBWorkbench.getPlatform().getValueHandlerRegistry().findTransformers(
    }
        model.appendData(monitor, rows, resetOldRows);
            model.isUniqueKeyUndefinedButRequired(executionContext.getDataSource().getContainer())))
                        Rectangle ib = item.getBounds();
    private void fillNavigateMenu(IMenuManager navigateMenu) {
            if (refreshData) {
        if (statusBar != null) {
                pSection.put("panelRatio", settings.panelRatio);
        // Custom oldValue items

                    if (!viewerSash.isDisposed() && !isUIUpdateRunning) {
            if (supportsStatusBar()) {
        }
        if (panelFolder != null) {
    private final IWorkbenchPartSite site;

                    String defaultPresentationId = getPreferenceStore().getString(ResultSetPreferences.RESULT_SET_PRESENTATION);
    }
                    }
    @Nullable
        return model.getVisibleAttributes();

        activePresentation.refreshData(true, false, false);
                if (autoRecordMode != null) {
import org.jkiss.dbeaver.model.struct.*;
        }


        if (rowCountLabel != null) {

            @NotNull

    public void deleteSelectedRows()
            DBSDataContainer dataContainer = getDataContainer();
            Composite panelComposite = UIUtils.createComposite(panelFolder, 1);
                    this,
    public boolean isRefreshInProgress() {
        navigateMenu.add(ActionUtils.makeCommandContribution(site, IWorkbenchCommandConstants.NAVIGATE_BACKWARD_HISTORY, CommandContributionItem.STYLE_PUSH, UIIcon.RS_BACK));
        }
        // Use async exec to avoid focus switch after user UI interaction (e.g. combo)
            activePresentation.scrollToRow(IResultSetPresentation.RowPosition.CURRENT);
    }
    private StatusLabel statusLabel;
    @Override
        return new EmptySelection();
            openWithMenu.setRemoveAllWhenShown(true);
        private final Object presentationState;
            rowCountLabel.executeAction(showErrors);
                        }
            if (executionContext != null) {

        if (activePresentation.getControl() instanceof Composite) {
        for (ResultSetRow row : rowsToDelete) {

            constraint.setOperator(DBCLogicalOperator.EQUALS);
                }
                int srcRowIndex = partitionOffset + partitionStart;
            }
                            null,
                @Override
                log.debug("Internal error: multiple data reads started (" + dataPumpJobQueue + ")");
                for (DBDDisplayFormat displayFormat : DBDDisplayFormat.values()) {
            } else {
            CSSUtils.markConnectionTypeColor(configToolBar);

    }
        boolean retrieveDeepestCollectionElement
        private ToolBarManager actionToolBar;
            throw new IllegalStateException("Can't add/copy rows in disconnected results");
    private static final IResultSetListener[] EMPTY_LISTENERS = new IResultSetListener[0];
        return null;
        if (dataSource != null && attr != null && model.getVisibleAttributeCount() > 0 && !model.isUpdateInProgress()) {
            return items.toArray(new IContributionItem[0]);
    @NotNull
            return;
                Menu panelsMenu = panelsMenuManager.createContextMenu(this.panelFolder);
        if (needRefresh) {
            } else if (!isHasMoreData()) {
        }
    }
import org.jkiss.dbeaver.ui.controls.resultset.valuefilter.FilterValueEditPopup;
            }
        }
            binaryFormatMenu.addMenuListener(manager12 -> fillBinaryFormatMenu(manager12, attr));
        }
            DBSEntityAttribute attribute = refAttr.getAttribute();
            String rcMessage;
            if (attribute != null) {

            throw new DBException("Can't obtain association '" + DBUtils.getQuotedIdentifier(association) + "' target constraint (table " +
                    }
    private final Color defaultForeground;
    ResultSetFilterPanel getFiltersPanel() {
                return true;
                verticalLayout = settings.verticalLayout;
        if ((getDecorator().getDecoratorFeatures() & IResultSetDecorator.FEATURE_PRESENTATIONS) != 0) {
            return runDataPump(dataContainer, null, 0, segmentSize, curRow == null ? 0 : curRow.getRowNumber(), false, false, true, onSuccess);
                    updateStatusMessage();
            this.selectedRecords[i] = selectedRows.get(i).getVisualNumber();
        final DBSDataContainer dataContainer = getDataContainer();
                }

        Composite progressControl = viewerPanel;

        if (dataContainer != null && !model.isUpdateInProgress()) {
     * @return true if new rows insert is allowed
    }
            if (orderingMode == OrderingStrategy.SERVER_SIDE && supportsDataFilter()) {
                    } else {
        setDataFilter(model.createDataFilter(), refresh);
            listener.handleResultSetLoad();
                });
    }

                            panelButton.setChecked(!isPanelVisible);
                        ResultSetPreferences.CONFIRM_RS_PANEL_RESET,
                    model.getDataFilter(),
                activateDefaultPanels(getPresentationSettings());
                transformersMenu.setRemoveAllWhenShown(true);

    @Override
            if (currentAttribute != null) {
    private boolean supportsDecoratorFeature(long feature) {

                nested = ((IAdaptable) presentation).getAdapter(IFindReplaceTarget.class);
                if (row.getState() == ResultSetRow.STATE_REMOVED || (row.getState() == ResultSetRow.STATE_NORMAL && row.isChanged())) {
            } else {


                                if (!metaAttr.isPseudoAttribute() && !metaAttr.isAutoGenerated()) {
                    editMenu.add(new Separator());
    {
            finalizer);
                    updatePanelsContent(true);
                IResultSetContext context = new ResultSetContextImpl(this, resultSet);
        // Cleanup unavailable panels
            }
                        }
/*
        if (panel != null) {
        getPresentationSettings().enabledPanelIds.remove(panelId);
            }
    @Nullable
            rowIdentifier.reloadAttributes(new VoidProgressMonitor(), model.getAttributes());

        } else {
                }
                    IAction.AS_RADIO_BUTTON,
                    }
            return true;
        @NotNull

            }
            menuManager.add(new HintConfigurationLevelAction(this, cl));
     */
                if (dataContainer instanceof SQLQueryContainer) {
            filtersMenu.add(new Separator());
        for (DBDAttributeBinding attr : attrs) {
            this.rowNumber = rowNumber;
            settings.panelRatio = pSection.getInt("panelRatio");
            }
            !ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EDIT)

        // make constraints
                                ResultSetJobAbstract curJob = dataPumpJobQueue.getFirst();
            }
                    }
        boolean readyToRun = getExecutionContext() != null && container.isReadyToRun() && !model.isUpdateInProgress();
                "result_panels"); //$NON-NLS-1$
            recordModeButton.redraw();
                                        null
import org.jkiss.dbeaver.model.virtual.*;
            }
                    // do nothing
        filtersMenu.add(new Separator());
            menuService.populateContributionManager(navToolBarManager, TOOLBAR_NAVIGATION_CONTRIBUTION_ID);


        if (presentation instanceof ISelectionProvider) {
            dataPumpJobQueue.clear();
        Collection<DBDValueRow> rows,

        if (newWindow) {
                    continue;
    }
            log.error("Can't save data filter with null context");
    }
    {
            MenuManager layoutMenu = new MenuManager(
        return persister;
        private final IResultSetPanel panel;
        vmMenu.add(new VirtualEntityEditAction(this));
            // Content placeholder
            }
                        DBDAttributeBinding[] array = visibleAttributes.toArray(new DBDAttributeBinding[0]);

                ResultSetMessages.controls_resultset_viewer_action_logical_structure,

                if (finalizer != null) {
            rowCountLabel = new ActiveStatusMessage(

            if (descReferrer instanceof DBSEntityAssociation) {

            return ISaveablePart2.YES;
            boolean enableFilters = readyToRun && supportsDataFilter();
        }
     */
            return Status.OK_STATUS;
        }
        public void saveQueryFilterValue(@Nullable DBCExecutionContext context, @NotNull String query, @NotNull String filterValue) {
            }
        if (dataSourceInfo.supportsReferentialIntegrity() || supportsVirtualKeys) {
    private void addDefaultPanelActions(ToolBarManager panelToolBar) {
        return curRow;
        return model;
                if (needRefresh) break;
            }
                    }
            final List<ResultSetRow> selectedRows = getSelectedRows();
            if (context != null && filter != null && filter.hasConditions()) {
                final int partitionEnd = partitionRange[1];
            openWithMenu.addMenuListener(manager1 -> ResultSetHandlerOpenWith.fillOpenWithMenu(ResultSetViewer.this, manager1));
    @Override
            return adapter.cast(findReplaceTarget);


        if (dataSource == null) {
    public DBSDataContainer getDataContainer()
        this.segmentFetchSize = segmentFetchSize;
        }
    }
                                filtersPanel.addFiltersHistory(whereCondition);
        if (serverSideOrdering) {
    @Override
                -1,
                if (firstSelRecord > model.getRowCount() - selectedRecords.length) {
    {
            if (endTime instanceof LocalDateTime) {
                                final String oldCustomTransformer = settings.getCustomTransformer();
                }
        @Nullable Object value,
        if (Objects.equals(stats, selectionStatLabel.getText())) {
                }
            for (ResultSetPresentationDescriptor pd : getAvailablePresentations()) {
        @NotNull DBDAttributeBinding attribute,
        }
    public void showFiltersMenu() {
    }
    @Nullable
                if (menuLocation == ContextMenuLocation.DATA) {
        contextMenu.addMenuListener(MenuListener.menuHiddenAdapter(menuEvent -> UIUtils.asyncExec(columnMenu::dispose)));
        settings.verticalLayout = !settings.verticalLayout;
        }

        if (dataContainer != null) {
        if (panel != null) {
        }
            if (presentation == null) {
                });

        if (!(targetEntity instanceof DBSDataContainer)) {
                        row,
                        DBDValueHintProvider.OPTION_INLINE);
    public void doSave(DBRProgressMonitor monitor)
        if (activePresentation != null) {
            if (selection.isEmpty()) {
    }
        for (IResultSetListener listener : getListenersCopy()) {
        new FilterSettingsDialog(ResultSetViewer.this).open();
        return
        if (statusBar != null) {
        }
            setError(error);
        }
        this.viewerPanel.setData(CONTROL_ID, this);
            this.presentationSwitchFolder = new VerticalFolder(mainPanel, SWT.LEFT);
    {
            DBSDataContainer dataContainer = getDataContainer();
    public void togglePanelsFocus() {
    @Override
        return getPresentationSettings().enabledPanelIds.contains(panelId);
        } else {

    public void setCurrentRow(@Nullable ResultSetRow newRow) {
            String pId = pSection.getName();
                    }
                        @Override
                actionsDisabled = false;
    }
            case SERVER_SIDE -> true;
        }
            return;
import org.eclipse.jface.layout.GridLayoutFactory;
                vmMenu.add(action);
            if (!selection.isEmpty()) {
                            final Object sourceValue = docAttribute.getValueHandler().getValueFromObject(
    }



            event.getData() != null) {
                    control.setFocus();
    private static class SimpleFilterManager implements IResultSetFilterManager {
                            context.getDataSource(),
                createFilterConstraint(rows, attrBinding, constraint);
        if (filtersPanel == null) {
            throw new IllegalStateException("Can't fill rows in disconnected results");
                    }
            log.error("Can't refresh metadata on disconnected data viewer");
    }
            UIUtils.disposeControlOnItemDispose(panelTab);
    @NotNull
    }
                    });
                Composite composite = createStatusBar();
    {
        return true;
                public void focusLost(FocusEvent e) {
                    }
                if (attr != null && menuLocation == ContextMenuLocation.COLUMN_HEADER) {

            navigateMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_COUNT));
        }
                log.error(e);

        }
            throw new DBException(ModelMessages.error_not_connected_to_database);
        IResultSetContext context = new ResultSetContextImpl(this, null);
    }
            if (panelTab != null) {
import org.eclipse.swt.custom.CTabFolder2Adapter;
                IResultSetPanel visiblePanel = getVisiblePanel();
                    statusMessage = NLS.bind(
            // Set focus to panel
    private static final String TOOLBAR_GROUP_ADDITIONS = IWorkbenchActionConstants.MB_ADDITIONS;
                                        model.getCellValue(new ResultSetCellLocation(metaAttr, sourceRow)),
                panelsMenuManager.addMenuListener(manager -> {
        }
                }
    public void addListener(IResultSetListener listener)
                            if (!hasItems) {
        DBDAttributeBinding[] newAttributes = DBUtils.injectAndFilterAttributeBindings(dataSource, dataContainer, curAttributes, false);
    public static final String EMPTY_TRANSFORMER_NAME = "Default";
        PanelInfo panel = activePanels.remove(panelId);
                manager.add(action);

    }
        if (curAttribute == null) {
                updateFiltersText();
        @NotNull
        layoutMenu.add(new Separator());
                null);
                            } catch (DBCException e) {
                selectedRecords = curRow == null ? new int[0] : new int[] { curRow.getVisualNumber() };
 *     http://www.apache.org/licenses/LICENSE-2.0
            DBExecUtils.isResultSetReadOnly(executionContext) ||
        public ResultSetRow getElementRow(Object element) {
            // Config toolbar
            this.reorderLocally(columnElement);
            return false;
                }
        this.viewerPanel.setRedraw(false);
                    if (!activatePanel(panelId, panelId.equals(settings.activePanelId), false)) {
                    if (selectedItem != null && selectedItem == panelFolder.getSelection()) {
    public List<DBDAttributeBinding> getVisibleAttributes() throws DBException {
            }
        targetEntity = DBVUtils.getRealEntity(monitor, targetEntity);

                        }

        int index = availablePresentations.indexOf(activePresentationDescriptor);
                        } catch (DBCException e) {
        themeUpdateJob = new AbstractJob("Update theme") {
                } else {
        if (fetchTime <= 0) {
        DBDDataFilter filter;
    }
    public void refresh()
            configLevelMenu.setRemoveAllWhenShown(true);
import org.jkiss.utils.ArrayUtils;

 * See the License for the specific language governing permissions and
                for (int partitionIndex = partitionStart; partitionIndex <= partitionEnd; partitionIndex++) {
                    public void run() {
    }
                    }
        if (updated && refreshHints) {
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    private int[] selectedRecords = new int[0];
                    Now we call the ResultSetStatListener even if the resultSet is empty.
     * Freaking E4 do not do it. I've spent a couple of days fighting it. Guys, you owe me.
        }
            ResultSetPresentationDescriptor presentation = ResultSetPresentationRegistry.getInstance().getPresentation(pId);
            viewerSash.setWeights(panelWeights);
public class ResultSetViewer extends Viewer
                    filtersMenu.setRemoveAllWhenShown(true);
        manager.add(new GroupMarker(MENU_GROUP_EDIT));
        // Fill general menu
    }
        dataPumpJob.setOffset(offset);
                            return ResultSetMessages.controls_resultset_viewer_switch_autocommit_hint;
                    this,
            }
    private boolean checkDoubleLock(Control lockedBy) {

                        if (CommonUtils.isEmpty(errorMessage)) {
                            UIUtils.asyncExec(() -> refreshData(null));
        public void forceDataReadCancel(Throwable error) {
            this.scroll = scroll;
                    endTime
                    rcMessage = ROW_COUNT_FORMAT.format(model.getTotalRowCount());
                        }
    private void applyCurrentPresentationThemeSettings() {
        } else {
            String message = NLS.bind(ResultSetMessages.controls_resultset_viewer_status_rows_size, model.getRowCount(),
        targetEntity = DBVUtils.getRealEntity(monitor, targetEntity);
    // Theme listener
                        newRecordMode = false;
            context.getDataSource().getContainer().persistConfiguration();
        );
        DBDValueHintProvider.HintObject ho,

        }
                        if (this.availablePresentations.contains(activePresentationDescriptor)) {
    }
    // History
            return;
            if (!valueController.isReadOnly()) {
        }

        if (selectedRecords.length > 0 && selectedRecords[0] < model.getRowCount()) {

    }
                if (dataFilter == null) {
                attrBinding.getValueHandler().getSupportedOperators(attrBinding);
                    manager.add(orderMenu);
                curAttribute.getValueHandler().getSupportedOperators(curAttribute);
                for (DBVColorOverride mapping : getColorOverrides(attr, valueController.getValue())) {
            }
                        reloadIdentifierAttributes();
        }
        while (historyPosition < stateHistory.size() - 1) {
    {
        for (ResultSetJobAbstract dpj : dpjCopy) {
        if (dataContainer == null) {
    ///////////////////////////////////////
    private int[] selectedRowsIncludingNewRow(int newRowIndex) {
            String dataStatus = getReadOnlyStatus();
        //restorePresentationState(state);
        FilterValueEditPopup popup = new FilterValueEditPopup(getSite().getShell(), ResultSetViewer.this, curAttribute, rows);
    }

            try (DBCSession session = DBUtils.openMetaSession(new VoidProgressMonitor(), dataContainer, "Bind custom attributes")) {

        updatePanelsButtons();
            serverSideOrdering = false;
            size = segmentFetchSize;
        {
                Collections.singletonList(attr),
        MenuManager columnMenu = new MenuManager();
        }
                    });
    private final ResultSetDataReceiver dataReceiver;
            }
    }
                    ResultSetPresentationDescriptor newPresentation = null;
                    }
    public void cancelJobs() {
                            final Object[] origRow = model.getRowData(srcRowIndex);
            ResultSetPersister persister = createDataPersister(false);

        }
    @NotNull
        }
                new TabFolderReorder(panelFolder);
                            boolean isPanelVisible = isPanelsVisible() && isPanelVisible(panel.getId());
        if (dataContainer == null) {
        if (nextSegmentReadingBlocked) {
        synchronized (listeners) {
        if (valueController != null) {
                UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart());
                    updateToolbar();
                if (!getControl().isDisposed()) {
    private final IResultSetDecorator decorator;

        final DBSDataContainer dataContainer = getDataContainer();
    public void handleDataSourceEvent(@NotNull DBPEvent event) {
    }
                return NLS.bind(
        stateHistory.clear();
                DBeaverIcons.getImage(UIIcon.COMPILE),
                }
                    UIUtils.setControlVisible(filtersPanel.getParent(), false);
    private Map<String, Object> saveConstraintVisualState(DBDAttributeConstraint constraint) {
        }
            }
                manager.add(new BinaryFormatAction(this, formatter, attribute));

            if (item.dataContainer == dataContainer && item.filter != null && item.filter.equalFilters(dataFilter, false)) {
        DBSEntity targetEntity = refConstraint.getParentObject();
                    editMenu.add(new Separator());
            listener.handleResultSetChange();
                if (control1.isDisposed()) {
    private final IResultSetContainer container;
        return saveChanges(monitor, settings, null);
    public void switchFilterFocus() {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    public void rejectChanges()
        if (settings.enabledPanelIds.isEmpty()) {
                            }
            }
                        model.getHintContext().cacheRequiredData(
                    final DBDDataFilter dataFilter = executionSource.getDataFilter();
    }
            IResultSetSelection selection = getSelection();
    public void copyRowValues(boolean fromRowAbove, boolean updatePresentation) {

            viewMenu.add(new TransformerSettingsAction(this));
    }
import org.jkiss.dbeaver.ui.css.CSSUtils;
        if (newAttributes.length > curAttributes.length) {
                    (curRow == null ? getExecutionTimeMessage(isTooltip) : "");

        if (hasNavTables) {



                        ResultSetViewer.this, attr, false);
    public boolean isSaveOnCloseNeeded()
    }
                    ResultSetPreferences.CONFIRM_ORDER_RESULTSET,

        for (int i = 0; i < refAttrs.size(); i++) {
            }
                            monitor,
        // Create control and tab item
    ) {
            try {
        return getSelection().getSelectedRows();
        selectedRecords = indexes;
                                newPresentation = pd;
    }
        if (isExpensiveFilter) {
    private void changeMode(boolean recordMode)

            }
                        log.error(e);
        if (monitor != null) {

    public boolean isActionsDisabled() {
            {
        if (context != null) {
            var gd = new GridData(GridData.FILL_HORIZONTAL);
    }
    }
        contextMenu.setVisible(true);
            }
        } else {
            redrawData(false, true);
            if (!CommonUtils.isEmpty(transformers)) {
        }

            return false;
                    ResultSetViewer.this.getControl().layout(true, true);
                });

            possibleActions.add(new VirtualAttributeEditAction(this, attr));

            return true;
                    log.error("Can't describe filter condition", e);
    {
        return autoRefreshControl;
            // Get filtered hint types
        return actionsDisabled;
    public String getAttributeReadOnlyStatus(@NotNull DBDAttributeBinding attr, boolean checkEntity, boolean checkKey) {
            Collections.singletonList(row),
        final int maxRows,
                null);
            }
                return false;
                        }
        // Create panel
    @Override
                public void handleEvent(@NotNull Event event) {
            dataReceiver.setNextSegmentRead(false);
    private Composite statusBar;
                vConstraint.setAttributes(Collections.emptyList());

        DBDRowIdentifier rowIdentifier = model.getVisibleAttribute(0).getRowIdentifier();

        DBSEntityConstraint refConstraint = association.getReferencedConstraint();
                    log.debug("No presentations for result set [" + resultSet.getClass().getSimpleName() + "]");
        if (virtualEntity == null) {
     * Refresh is called to execute new query/browse new data. It is public API function.
                    return adapted;

        boolean isExpensiveFilter = true;
            }
            }

        for (IAction action : possibleActions) {
            selectionStatLabel.setToolTipText(ResultSetMessages.result_set_viewer_selection_stat_tooltip);
                        return;
    // Misc

            ((ISelectionProvider) activePresentation).setSelection(selection);
                return panel;
                    viewerPanel.getShell(),
            if (selectedRows.isEmpty()) {
    {
        });
    @Override
            List<? extends DBDAttributeTransformerDescriptor> transformers =
            removePanel(panelId);
    public void fillContextMenu(
            return true;
                    //panelTab.getControl().setFocus();
                } else {
            selectionStatLabel = new Text(statusBar, SWT.READ_ONLY);
        if (savedConfig != null) {
                    if (adapted != null) {
    public IResultSetContainer getContainer() {
        if (dataContainer != null) {
        }
        }
                    };
                return dataFilter;
        synchronized (dataPumpJobQueue) {

            ((GridData) presentationSwitchFolder.getLayoutData()).exclude = !pVisible;
                        if (success) {
    }
                        log.debug("Error handling resulset load", e);
                    }
            manager.add(new Separator());
    }
            if (hd.getInstance() instanceof DBDCellHintProvider chp) {
            if (rsv == null) {

    private void fillFiltersMenu(
        String menuName = ActionUtils.findCommandName(IResultSetCommands.CMD_REFERENCES_MENU);

                @Override
            }

    public DBDRowIdentifier getVirtualEntityIdentifier()
                long rowsFetched, rowsUpdated = -1;
        if (activePresentationDescriptor != null) {
            handleDataPropertyChange(dataSourceContainer, event.getProperty(), event.getOldValue(), event.getNewValue());
    @NotNull
            filtersMenu.add(new OrderByAttributeAction(this, attribute, ColumnOrder.DESC));
                            return ResultSetMessages.controls_resultset_viewer_frequent_refresh_hint;
                releaseDataReadLock();
    private boolean confirmPanelsReset() {
                        .getContainer()
                    }

                }
            viewerPanel.getShell(),
                    }
            this.panelSwitchFolder.setLayoutData(new GridData(GridData.FILL_VERTICAL));
        synchronized (dataPumpJobQueue) {

            public void shellIconified(ShellEvent e) {
        for (IResultSetListener listener : getListenersCopy()) {
    }
            this.finalizer = finalizer;
            navigateMenu.add(new Separator());
                        " (" + ((DBDValueDefaultGenerator) valueController.getValueHandler()).getDefaultValueLabel() + ")";
    List<HistoryStateItem> getStateHistory() {
