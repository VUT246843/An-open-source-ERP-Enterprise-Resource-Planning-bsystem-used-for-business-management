 * limitations under the License.
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
 *
    private Button alwaysUseAllColumns;
 * you may not use this file except in compliance with the License.
    @Override
            miscGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                    }
    private Button filterForceSubselect;
            useBrowserCheckbox = UIUtils.createCheckbox(uiGroup,

            rereadOnScrollingCheck.setSelection(store.getBoolean(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING));
    }
            disableEditingOnMissingKey = UIUtils.createCheckbox(
                group,
            store.setValue(ModelPreferences.RESULT_SET_IGNORE_COLUMN_LABEL, ignoreColumnLabelCheck.getSelection());
            }
        keepStatementOpenCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.KEEP_STATEMENT_OPEN));
                orderingStrategyCombo.add(mode.getText());
        {
                queriesGroup,
                DataEditorsMessages.pref_page_database_resultsets_label_image_browser,
    }

 * See the License for the specific language governing permissions and

            store.contains(ModelPreferences.RESULT_SET_USE_FETCH_SIZE) ||
            ).ordinal());
        Composite rightPane = UIUtils.createComposite(composite, 1);
}            useBrowserCheckbox.setToolTipText(DataEditorsMessages.pref_page_database_resultsets_label_image_browser_tip);
        store.setToDefault(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT);
        {

    protected boolean supportsDataSourceSpecificOptions()
            Composite queriesGroup = UIUtils.createTitledComposite(leftPane, ResultSetMessages.pref_page_database_general_group_queries, 2, SWT.NONE, 0);
    protected void loadPreferences(DBPPreferenceStore store)
            uiGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
            refreshAfterUpdate = UIUtils.createCheckbox(miscGroup, ResultSetMessages.pref_page_content_editor_checkbox_refresh_after_update, false);
import org.jkiss.utils.CommonUtils;
            autoFetchNextSegmentCheck.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT));
            log.warn(e);
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
            orderingPolicyCombo = UIUtils.createLabelCombo(
    private Button showErrorsInDialog;
            for (OrderingPolicy policy : OrderingPolicy.values()) {
    }
    private Button autoFetchNextSegmentCheck;
                rsSegmentSize = ResultSetPreferences.MIN_SEGMENT_SIZE;
            orderingPolicyCombo.select(CommonUtils.valueOf(

                ModelPreferences.RESULT_SET_ORDERING_POLICY,


            store.contains(ModelPreferences.RESULT_SET_ORDERING_STRATEGY) ||
            store.contains(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER);
            if (confirmDataSave != null) {
            store.contains(ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING) ||
            store.contains(ModelPreferences.RESULT_SET_MAX_ROWS_USE_SQL) ||
        filterForceSubselect.setSelection(store.getDefaultBoolean(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT));
                @Override
            store.setValue(ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER, newRowsAfter.getSelection());
            for (OrderingStrategy mode : OrderingStrategy.values()) {
        updateOptionsEnablement();
            store.setValue(ModelPreferences.RESULT_SET_MAX_ROWS_USE_SQL, resultSetUseSQLCheck.getSelection());

                public void focusLost(FocusEvent e) {
        if (alwaysUseAllColumns.getSelection()) {
            store.setValue(ModelPreferences.RESULT_SET_USE_FETCH_SIZE, advUseFetchSize.getSelection());
    protected void savePreferences(DBPPreferenceStore store)
public class PrefPageResultSetMain extends TargetPrefPage {
        PrefUtils.savePreferenceStore(store);
    @Override
            orderingStrategyCombo = UIUtils.createLabelCombo(
        try {
        super.performDefaults();
    {
            newRowsAfter.setSelection(store.getBoolean(ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER));
                OrderingStrategy.SMART
            alwaysUseAllColumns.setSelection(store.getBoolean(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS));
            Composite miscGroup = UIUtils.createTitledComposite(rightPane, ResultSetMessages.pref_page_sql_editor_group_misc, 1, GridData.VERTICAL_ALIGN_BEGINNING, 0);
import org.jkiss.dbeaver.ui.internal.UIMessages;
 * PrefPageResultSetMain
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetCommands;
                confirmDataSave.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE));
import org.jkiss.code.NotNull;
                @Override
                store.setValue(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE, confirmDataSave.getSelection());

            filterForceSubselect = UIUtils.createCheckbox(advGroup, ResultSetMessages.pref_page_database_resultsets_label_filter_force_subselect,

        store.setToDefault(ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE);
    private void updateOptionsEnablement() {
        store.setToDefault(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR);
            }

        {
                    updateOptionsEnablement();
            store.setValue(
    private Button markCellValueOccurrences;
        store.setToDefault(ModelPreferences.RESULT_SET_IGNORE_COLUMN_LABEL);
        autoFetchNextSegmentCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT));
        Composite leftPane = UIUtils.createComposite(composite, 1);
    }
        }
        ignoreColumnLabelCheck.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_SET_IGNORE_COLUMN_LABEL));
            int rsSegmentSize = store.getInt(ModelPreferences.RESULT_SET_MAX_ROWS);
                }
/*
        store.setToDefault(ResultSetPreferences.KEEP_STATEMENT_OPEN);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    protected String getPropertyPageID()
            queryCancelTimeout.setToolTipText(ResultSetMessages.pref_page_database_general_label_result_set_cancel_timeout_tip);
import org.eclipse.swt.SWT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ModelPreferences;
 *

    {
    private Text queryCancelTimeout;
        store.setToDefault(ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS);
            advUseFetchSize = UIUtils.createCheckbox(advGroup, ResultSetMessages.pref_page_database_resultsets_label_fetch_size, ResultSetMessages.pref_page_database_resultsets_label_fetch_size_tip, false, 2);
                    }
            );
            disableEditingOnMissingKey.setSelection(store.getBoolean(ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING));

            );
            store.contains(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT) ||
            Composite uiGroup = UIUtils.createTitledComposite(rightPane, "UI", 1, GridData.VERTICAL_ALIGN_BEGINNING, 0);

import org.eclipse.swt.layout.GridData;
            automaticRowCountCheck.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT));
    protected void clearPreferences(DBPPreferenceStore store) {
            store.contains(ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS) ||
            store.setValue(

    protected void performDefaults() {
 * Unless required by applicable law or agreed to in writing, software
        alwaysUseAllColumns.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS));
            store.setValue(ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT, queryCancelTimeout.getText());
                OrderingPolicy.DEFAULT
 * Licensed under the Apache License, Version 2.0 (the "License");

        store.setToDefault(ModelPreferences.RESULT_SET_USE_FETCH_SIZE);
            store.contains(ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE) ||
        store.setToDefault(ModelPreferences.RESULT_SET_MAX_ROWS_USE_SQL);
        return

            queryCancelTimeout.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));

 *
        store.setToDefault(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER);
    }
        automaticRowCountCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT));
    @Override
            orderingStrategyCombo.select(CommonUtils.valueOf(
                SWT.DROP_DOWN | SWT.READ_ONLY
    }
            alwaysUseAllColumns.addSelectionListener(new SelectionAdapter() {
    private Button disableEditingOnMissingKey;

    private Button keepStatementOpenCheck;
        showErrorsInDialog.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG));
            store.setValue(ModelPreferences.RESULT_SET_MAX_ROWS, resultSetSize.getText());
                ResultSetMessages.pref_page_database_resultsets_label_filter_force_subselect_tip, false, 2);
                }
                orderingPolicyCombo.add(policy.getText());
            store.contains(ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES) ||
            store.setValue(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT, filterForceSubselect.getSelection());
    }
                    } catch (Exception e) {
    private Button ignoreColumnLabelCheck;
        store.setToDefault(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        confirmDataSave = UIUtils.createCheckbox(uiGroup, toggleComand.getName(), toggleComand.getDescription(), false, 1);
    }

    private Button newRowsAfter;

            log.warn(e);

            resultSetSize.setText(String.valueOf(rsSegmentSize));

    }

        markCellValueOccurrences.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES));
    private Button resultSetUseSQLCheck;
            refreshAfterUpdate.setSelection(store.getBoolean(ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE));
                SWT.DROP_DOWN | SWT.READ_ONLY
        {
        store.setToDefault(ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT);
        } catch (Exception e) {
import org.eclipse.swt.events.FocusEvent;
        useNavigatorFilters.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS));
        return PAGE_ID;
                store.getString(ModelPreferences.RESULT_SET_ORDERING_STRATEGY),

            }
        refreshAfterUpdate.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE));
        if (confirmDataSave != null) {

                1,
    {
                ModelPreferences.RESULT_SET_ORDERING_STRATEGY,
        } else {
        }
            store.setValue(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING, rereadOnScrollingCheck.getSelection());
                        resultSetSize.setText(String.valueOf(ResultSetPreferences.MIN_SEGMENT_SIZE));
import org.eclipse.swt.events.FocusAdapter;
            confirmDataSave.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE));
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
                        log.debug(e);
                ResultSetMessages.pref_page_database_resultsets_label_order_policy_tip,
/**
            store.setValue(ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES, markCellValueOccurrences.getSelection());
                ResultSetMessages.pref_page_content_editor_checkbox_disable_editing_if_key_missing,
import org.jkiss.dbeaver.model.data.order.OrderingPolicy;
import org.jkiss.dbeaver.model.data.order.OrderingStrategy;
                public void widgetSelected(SelectionEvent e) {
                ResultSetMessages.pref_page_content_editor_checkbox_keys_always_use_all_columns,

            markCellValueOccurrences = UIUtils.createCheckbox(uiGroup, ResultSetMessages.pref_page_content_editor_ui_mark_cell_value_occurrences, ResultSetMessages.pref_page_content_editor_ui_mark_cell_value_occurrences_tip, false, 1);
            );

            useNavigatorFilters = UIUtils.createCheckbox(miscGroup, ResultSetMessages.pref_page_content_editor_checkbox_use_navigator_filters, ResultSetMessages.pref_page_content_editor_checkbox_use_navigator_filters_tip, false, 1);
            store.setValue(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS, alwaysUseAllColumns.getSelection());
        Composite composite = UIUtils.createPlaceholder(parent, 2, 10);
import org.jkiss.dbeaver.utils.PrefUtils;
    public PrefPageResultSetMain()
        }
        store.setToDefault(ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING);
    @Override
                if (toggleComand != null) {
            store.contains(ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT) ||
        useDateTimeEditor.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR));
 * Copyright (C) 2010-2026 DBeaver Corp and others

    private Button advUseFetchSize;
            Composite group = UIUtils.createTitledComposite(leftPane,
            useNavigatorFilters.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS));
    protected Control createPreferenceContent(@NotNull Composite parent) {
            Composite advGroup = UIUtils.createTitledComposite(leftPane, ResultSetMessages.pref_page_results_group_advanced, 2, GridData.VERTICAL_ALIGN_BEGINNING);
        rereadOnScrollingCheck.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING));
                false
            keepStatementOpenCheck.setSelection(store.getBoolean(ResultSetPreferences.KEEP_STATEMENT_OPEN));
            store.contains(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT) ||
            newRowsAfter = UIUtils.createCheckbox(miscGroup, ResultSetMessages.pref_page_content_editor_checkbox_new_rows_after, false);
            alwaysUseAllColumns = UIUtils.createCheckbox(
        store.setToDefault(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT);
        }
            );
import java.util.Locale;
                    int newValue = CommonUtils.toInt(resultSetSize.getText());
        }
            queriesGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
            );
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.Log;

 * DBeaver - Universal Database Manager
            markCellValueOccurrences.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES));
                false
        }
            }
            showErrorsInDialog = UIUtils.createCheckbox(uiGroup, ResultSetMessages.pref_page_content_editor_ui_show_errors_in_dialog, ResultSetMessages.pref_page_content_editor_ui_show_errors_in_dialog_tip, false, 1);
            }
            resultSetUseSQLCheck = UIUtils.createCheckbox(queriesGroup, ResultSetMessages.pref_page_database_resultsets_label_use_sql, ResultSetMessages.pref_page_database_resultsets_label_use_sql_tip, false, 2);
            });

import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

            store.contains(ModelPreferences.RESULT_SET_MAX_ROWS) ||
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.resultset"; //$NON-NLS-1$
            resultSetUseSQLCheck.setSelection(store.getBoolean(ModelPreferences.RESULT_SET_MAX_ROWS_USE_SQL));

                    try {

            store.setValue(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT, autoFetchNextSegmentCheck.getSelection());
    private Button useBrowserCheckbox;
                GridData.VERTICAL_ALIGN_BEGINNING
            rereadOnScrollingCheck = UIUtils.createCheckbox(queriesGroup, ResultSetMessages.pref_page_database_resultsets_label_reread_on_scrolling, ResultSetMessages.pref_page_database_resultsets_label_reread_on_scrolling_tip, true, 2);
    }
        } catch (Exception e) {

    {
                store.getString(ModelPreferences.RESULT_SET_ORDERING_POLICY),
            useDateTimeEditor.setSelection(store.getBoolean(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR));
            disableEditingOnMissingKey.setSelection(false);
            updateOptionsEnablement();
 */

        store.setToDefault(ModelPreferences.RESULT_SET_ORDERING_POLICY);

        }
            resultSetSize.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
            showErrorsInDialog.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG));
            store.contains(ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER) ||
            store.setValue(ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE, refreshAfterUpdate.getSelection());
            useBrowserCheckbox.setSelection(store.getBoolean(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER));
        store.setToDefault(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS);
        super();
            advUseFetchSize.setSelection(store.getBoolean(ModelPreferences.RESULT_SET_USE_FETCH_SIZE));
        }

            }
        {

    private Combo orderingStrategyCombo;
        leftPane.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    @NotNull
    private Button useDateTimeEditor;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
        resultSetUseSQLCheck.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_SET_MAX_ROWS_USE_SQL));
    {
            );
        }
            store.contains(ModelPreferences.RESULT_SET_ORDERING_POLICY) ||
    private Button automaticRowCountCheck;

import org.jkiss.dbeaver.ui.UIUtils;

            store.contains(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE) ||
                OrderingStrategy.class,


        try {
            store.setValue(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER, useBrowserCheckbox.getSelection());
            store.setValue(ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS, useNavigatorFilters.getSelection());
        store.setToDefault(ModelPreferences.RESULT_SET_MAX_ROWS);
import org.eclipse.ui.commands.ICommandService;
    @Override
        return true;
                ResultSetMessages.pref_page_database_resultsets_label_order_mode,
                ResultSetMessages.pref_page_database_resultsets_label_order_policy,
    private Button rereadOnScrollingCheck;
package org.jkiss.dbeaver.ui.editors.data.preferences;

            store.contains(ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT) ||
 */
            });
                false
            store.contains(ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG) ||
            store.contains(ResultSetPreferences.KEEP_STATEMENT_OPEN) ||
            store.contains(ModelPreferences.RESULT_SET_IGNORE_COLUMN_LABEL) ||
        newRowsAfter.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER));
            queryCancelTimeout.setText(store.getString(ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT));
        // Misc settings
    {
                group,
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
            keepStatementOpenCheck = UIUtils.createCheckbox(miscGroup, ResultSetMessages.pref_page_database_general_checkbox_keep_cursor, false);
        store.setToDefault(ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER);
            resultSetSize.addFocusListener(new FocusAdapter() {
                queriesGroup,
        disableEditingOnMissingKey.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING));
                OrderingStrategy.values()[orderingStrategyCombo.getSelectionIndex()].toString()
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG, showErrorsInDialog.getSelection());
                ResultSetMessages.pref_page_database_resultsets_label_order_mode_tip,
        store.setToDefault(ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT);
                Command toggleComand = commandService.getCommand(IResultSetCommands.CMD_TOGGLE_CONFIRM_SAVE);
        return composite;

        store.setToDefault(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING);
            store.contains(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS) ||
    @Override
                OrderingPolicy.class,
    @Override
        queryCancelTimeout.setText(String.valueOf(store.getDefaultInt(ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT)));
 * You may obtain a copy of the License at
        advUseFetchSize.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_SET_USE_FETCH_SIZE));
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG);
    private Button confirmDataSave;
            );
            queryCancelTimeout = UIUtils.createLabelText(advGroup, ResultSetMessages.pref_page_database_general_label_result_set_cancel_timeout + UIMessages.label_ms, "0");
                }
                    if (newValue > 0 && newValue < ResultSetPreferences.MIN_SEGMENT_SIZE) {
            store.setValue(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR, useDateTimeEditor.getSelection());
        rightPane.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
import org.eclipse.swt.events.SelectionAdapter;
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();

            automaticRowCountCheck = UIUtils.createCheckbox(miscGroup, ResultSetMessages.pref_page_database_resultsets_label_automatic_row_count, ResultSetMessages.pref_page_database_resultsets_label_automatic_row_count_tip, false, 2);

        store.setToDefault(ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES);
            useDateTimeEditor = UIUtils.createCheckbox(miscGroup, ResultSetMessages.pref_page_content_editor_checkbox_string_editor_for_datetime, ResultSetMessages.pref_page_content_editor_checkbox_string_editor_for_datetime_tip, false, 1);
                OrderingPolicy.values()[orderingPolicyCombo.getSelectionIndex()].toString()
            store.contains(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING) ||
            disableEditingOnMissingKey.setEnabled(false);
    private Combo orderingPolicyCombo;
            );
            ).ordinal());
            if (rsSegmentSize > 0 && rsSegmentSize < ResultSetPreferences.MIN_SEGMENT_SIZE) {
import org.eclipse.swt.widgets.*;
    private Text resultSetSize;
            if (commandService != null) {
    @Override
    private Button useNavigatorFilters;
        useBrowserCheckbox.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER));
            store.setValue(ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING, disableEditingOnMissingKey.getSelection());
    static final Log log = Log.getLog(PrefPageResultSetMain.class);
                ResultSetMessages.pref_page_content_editor_group_editing,
import org.eclipse.core.commands.Command;
            resultSetSize = UIUtils.createLabelText(queriesGroup, ResultSetMessages.pref_page_database_general_label_result_set_max_size, "0", SWT.BORDER);
            disableEditingOnMissingKey.setEnabled(true);
            ICommandService commandService = UIUtils.getActiveWorkbenchWindow().getService(ICommandService.class);
    private Button refreshAfterUpdate;
        store.setToDefault(ModelPreferences.RESULT_SET_ORDERING_STRATEGY);
            if (confirmDataSave != null) {
            store.setValue(ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT, automaticRowCountCheck.getSelection());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            autoFetchNextSegmentCheck = UIUtils.createCheckbox(queriesGroup, ResultSetMessages.pref_page_database_resultsets_label_auto_fetch_segment, ResultSetMessages.pref_page_database_resultsets_label_auto_fetch_segment_tip, true, 2);
            filterForceSubselect.setSelection(store.getBoolean(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT));
            resultSetSize.setLayoutData(GridDataFactory.create(GridData.HORIZONTAL_ALIGN_BEGINNING).hint(100, SWT.DEFAULT).create());
import org.eclipse.jface.layout.GridDataFactory;
            ignoreColumnLabelCheck.setSelection(store.getBoolean(ModelPreferences.RESULT_SET_IGNORE_COLUMN_LABEL));
        resultSetSize.setText(String.valueOf(store.getDefaultInt(ModelPreferences.RESULT_SET_MAX_ROWS)));
            store.setValue(ResultSetPreferences.KEEP_STATEMENT_OPEN, keepStatementOpenCheck.getSelection());
            ignoreColumnLabelCheck = UIUtils.createCheckbox(advGroup, ResultSetMessages.pref_page_database_general_use_column_names, ResultSetMessages.pref_page_database_general_use_column_names_tip, false, 2);
        orderingStrategyCombo.select(OrderingStrategy.SMART.ordinal());
