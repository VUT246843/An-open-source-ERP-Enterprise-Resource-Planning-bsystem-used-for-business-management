                SQLEditorMessages.pref_page_sql_editor_checkbox_fetch_resultsets,
                closeIncludedScriptAfterExecutionCheck.getSelection()

                "",
                store.contains(ModelPreferences.SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED) ||
                SQLEditorMessages.pref_page_sql_editor_enable_variables,
    private Button enableSQLParameters;
        );
            useDefaults
            store.setValue(SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE, invalidateBeforeExecuteCheck.getSelection());
 * you may not use this file except in compliance with the License.
                SQLEditorMessages.pref_page_sql_editor_group_scripts,
        store.setToDefault(SQLPreferenceConstants.SET_SELECTION_TO_STATISTICS_TAB);
                "",

                UIUtils.setControlVisible(commitNQueryText, false);
                ? store.getDefaultString(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK)
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
                executeTimeoutText.setToolTipText(SQLEditorMessages.pref_page_sql_editor_label_sql_timeout_tip);
        commitTypeCombo.select(commitType.ordinal());
            );
        getShell().layout(true, true);
            store.setValue(SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS, fetchResultSetsCheck.getSelection());
            Composite commonGroup = UIUtils.createTitledComposite(
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
                store.contains(ModelPreferences.SCRIPT_STATEMENT_DELIMITER) ||

                useDefaults
 * DBeaver - Universal Database Manager
                UIUtils.createControlLabel(scriptsGroup, SQLEditorMessages.pref_page_sql_editor_label_error_handling);
                public void widgetSelected(SelectionEvent e) {
                );
            store.setValue(
        );
        UIUtils.asyncExec(this::toggleCommitControls);
    protected void clearPreferences(DBPPreferenceStore store) {
            store.setValue(SQLPreferenceConstants.BEEP_ON_QUERY_END, soundOnQueryEnd.getSelection());

                "",
            store.setValue(SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE, clearOutputBeforeExecute.getSelection());
        store.setToDefault(SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE);
    private Text anonymousParameterMarkText;
                        default:
                    SQLEditorMessages.pref_page_sql_editor_label_clear_output_before_execute,
                commitNQueryText = new Spinner(scriptsGroup, SWT.BORDER);
                2
import org.jkiss.dbeaver.model.sql.SQLScriptCommitType;
        errorHandlingCombo.select(errorHandling.ordinal());
                    SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY
                delimGroup,
        Composite composite = UIUtils.createPlaceholder(parent, 2, 5);
        closeIncludedScriptAfterExecutionCheck.setSelection(
            store.contains(SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE) ||
                    commonGroup,
            }
                true,
        enableSQLParameters.setSelection(
        enableSQLAnonymousParameters.setSelection(
                2
 * See the License for the specific language governing permissions and
                SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY
            log.warn(e);

    }
            );
                ? store.getDefaultBoolean(ModelPreferences.SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED)
                    : store.getString(SQLPreferenceConstants.SHOW_STATISTICS_ON_EXECUTION)

                ? store.getDefaultBoolean(SQLPreferenceConstants.BEEP_ON_QUERY_END)
            }
    private Button enableVariables;
                    2
            enableSQLParameters = UIUtils.createCheckbox(
            );
                errorHandlingCombo.add(
        );
                ? store.getDefaultBoolean(SQLPreferenceConstants.SET_SELECTION_TO_STATISTICS_TAB)
                );
import org.eclipse.swt.layout.GridData;
                    SQLScriptCommitType.AUTOCOMMIT.ordinal()

                SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION,
                new GridData(32, SWT.DEFAULT)
    private Text statementDelimiterText;
            SQLScriptStatementDelimiterMode.valueByName(
    private static final Log log = Log.getLog(PrefPageSQLExecute.class);
                        case "params":
            useDefaults
                "",

                ? store.getDefaultBoolean(ModelPreferences.SQL_VARIABLES_ENABLED)
                SQLEditorMessages.pref_page_sql_editor_checkbox_show_statistics_for_queries_with_results,

                store.contains(ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER) ||
        );
                false,
    private void loadPreferences(DBPPreferenceStore store, boolean useDefaults) {
                invalidateBeforeExecuteCheck = UIUtils.createCheckbox(
                    SQLEditorMessages.pref_page_sql_editor_label_commit_type,
            }
import org.jkiss.dbeaver.utils.PrefUtils;
                commitNQueryText.setMinimum(1);
            showStatisticsCombo = UIUtils.createLabelCombo(
                commitNQueryText.setSelection(0);
        executeTimeoutText.setSelection(
                false,
            ;
        loadPreferences(getTargetPreferenceStore(), true);

        PrefUtils.savePreferenceStore(store);
        );
    private Button ignoreNativeDelimiter;
                commitTypeCombo.add(
                SQLScriptStatementDelimiterMode.values()[blankLineDelimiterCombo.getSelectionIndex()].getName()
            );
            store.setValue(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED, enableSQLAnonymousParameters.getSelection());

                ? store.getDefaultInt(SQLPreferenceConstants.STATEMENT_TIMEOUT)
                2
                store.contains(SQLPreferenceConstants.SCRIPT_COMMIT_TYPE) ||
            store.setValue(SQLPreferenceConstants.SCRIPT_COMMIT_TYPE, getSelectedScriptCommitType().name());
        store.setToDefault(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK);
    }
                SQLEditorMessages.pref_page_sql_editor_text_anonymous_parameter_mark,
                UIUtils.setControlVisible(commitNQueryLabel, false);
            Composite delimGroup = UIUtils.createTitledComposite(
        store.setToDefault(ModelPreferences.SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED);
                SQLEditorMessages.pref_page_sql_editor_text_named_parameter_prefix,
        );
                : store.getString(ModelPreferences.SQL_CONTROL_COMMAND_PREFIX)
            useDefaults

                );
                    2
        );
            );
import org.jkiss.dbeaver.ui.ShellUtils;
}                executeTimeoutText.setMinimum(0);
/**
    private Button enableParametersInEmbeddedCode;

        }
                GridData.VERTICAL_ALIGN_FILL
                SWT.BORDER,
        );

import org.eclipse.swt.events.SelectionListener;
            ).getTitle()
                ? store.getDefaultString(ModelPreferences.SQL_CONTROL_COMMAND_PREFIX)
            store.setValue(ModelPreferences.SQL_VARIABLES_ENABLED, enableVariables.getSelection());
        store.setToDefault(ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER);

                : store.getString(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            useDefaults

                commitNQueryText.setToolTipText(SQLEditorMessages.pref_page_sql_editor_label_commit_after_line);
            SQLScriptCommitType.valueOf(store.getDefaultString(SQLPreferenceConstants.SCRIPT_COMMIT_TYPE))
                SQLEditorMessages.pref_page_sql_editor_checkbox_enable_sql_parameters,
            );
                store.contains(SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION) ||
            );
                paramsGroup,

import org.jkiss.dbeaver.Log;
                SQLEditorMessages.pref_page_sql_editor_enable_parameters_in_ddl_tip,
            useDefaults
                2
                commitNQueryText.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                store.contains(ModelPreferences.SQL_CONTROL_COMMAND_PREFIX) ||
            namedParameterPrefixText.setTextLimit(1);
                commitTypeCombo.add(SQLEditorMessages.pref_page_sql_editor_combo_item_no_commit, SQLScriptCommitType.NO_COMMIT.ordinal());
                2,
        {
                ? store.getDefaultBoolean(SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION)
        );
            useDefaults
    private Button enableSQLAnonymousParameters;
                    null,
                leftPane,
        store.setToDefault(SQLPreferenceConstants.SCRIPT_COMMIT_LINES);
            useDefaults ? null : store.getString(SQLPreferenceConstants.SCRIPT_ERROR_HANDLING),

    private void toggleCommitControls() {

    @Override
                );
                SQLEditorMessages.pref_page_sql_editor_checkbox_ignore_native_delimiter_tip,


        }
                delimGroup,
            useDefaults
        );
                executeTimeoutText.setIncrement(1);
                useDefaults
                2
        {
                : store.getInt(SQLPreferenceConstants.STATEMENT_TIMEOUT)
        );
        removeTrailingDelimiter.setSelection(
        store.setToDefault(SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS);

        store.setToDefault(ModelPreferences.SCRIPT_STATEMENT_DELIMITER);
                paramsGroup,
                SQLEditorMessages.pref_page_sql_editor_checkbox_select_statistics_tab_tip,
                : store.getBoolean(ModelPreferences.QUERY_REMOVE_TRAILING_DELIMITER)
                SQLPreferenceConstants.SHOW_STATISTICS_ON_EXECUTION,
        );
                : store.getBoolean(SQLPreferenceConstants.SET_SELECTION_TO_STATISTICS_TAB)
            store.setValue(SQLPreferenceConstants.SCRIPT_COMMIT_LINES, commitNQueryText.getSelection());
                ? store.getDefaultBoolean(SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS)
                null,
            SQLScriptErrorHandling.valueOf(store.getDefaultString(SQLPreferenceConstants.SCRIPT_ERROR_HANDLING))
        {
                showStatisticsCombo.add(statisticsTabOnExecution.getTitle());
                paramsGroup,
                    false,
        try {
                scriptsGroup,
import org.eclipse.swt.SWT;
                delimGroup,
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
        store.setToDefault(SQLPreferenceConstants.SCRIPT_COMMIT_TYPE);
 *
                ? store.getDefaultBoolean(SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE)
                SQLEditorMessages.pref_page_sql_editor_checkbox_remove_trailing_delimiter,
    private Combo showStatisticsCombo;
            anonymousParameterMarkText = UIUtils.createLabelText(
            useDefaults

                GridData.FILL_HORIZONTAL
                : store.getBoolean(SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE)
                    SQLEditorMessages.pref_page_sql_editor_label_invalidate_before_execute,
    private Control commitNQueryLabel;
        SQLScriptCommitType commitType = CommonUtils.valueOf(
                SQLEditorMessages.pref_page_sql_editor_group_delimiters,
                false,
                            ShellUtils.launchProgram(HelpUtils.getHelpExternalReference("SQL-Execution#dynamic-parameters-binding"));

            );
                SQLEditorMessages.pref_page_sql_editor_group_parameters,
        } catch (Exception e) {

            store.setValue(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX, namedParameterPrefixText.getText());
        store.setToDefault(SQLPreferenceConstants.BEEP_ON_QUERY_END);
            store.setValue(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK, anonymousParameterMarkText.getText());
            store.setValue(SQLPreferenceConstants.STATEMENT_TIMEOUT, executeTimeoutText.getSelection());
    protected Control createPreferenceContent(@NotNull Composite parent) {
                    false,
            useDefaults
                            break;
                paramsGroup,

                    SQLScriptErrorHandling.STOP_ROLLBACK.ordinal()
                store.contains(ModelPreferences.SQL_PARAMETERS_ENABLED) ||
            loadPreferences(store, false);
                store.contains(SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE) ||
                    SQLScriptErrorHandling.STOP_COMMIT.ordinal()
            store.setValue(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE, maxEditorCheck.getSelection());
    private SQLScriptCommitType getSelectedScriptCommitType() {
                ? store.getDefaultBoolean(SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE)
            store.setValue(ModelPreferences.SCRIPT_STATEMENT_DELIMITER, statementDelimiterText.getText());
            blankLineDelimiterCombo,
    }
                    scriptsGroup,
                : store.getBoolean(ModelPreferences.SQL_VARIABLES_ENABLED)
                @Override
                commitNQueryLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                : store.getBoolean(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED)
                blankLineDelimiterCombo.add(mode.title);

                store.contains(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE) ||
                : store.getInt(SQLPreferenceConstants.SCRIPT_COMMIT_LINES)
    protected boolean supportsDataSourceSpecificOptions() {
                SQLEditorMessages.pref_page_sql_editor_text_control_command_prefix,
        super.performDefaults();
                SQLPreferenceConstants.SET_SELECTION_TO_STATISTICS_TAB,
public class PrefPageSQLExecute extends TargetPrefPage {
                : store.getBoolean(SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE)
            useDefaults
                scriptsGroup,
        }
                new GridData(32, SWT.DEFAULT)
        );
 * You may obtain a copy of the License at
    }
                commitTypeCombo.add(SQLEditorMessages.pref_page_sql_editor_combo_item_each_spec_line, SQLScriptCommitType.NLINES.ordinal());
                UIUtils.createControlLabel(commonGroup, SQLEditorMessages.pref_page_sql_editor_label_sql_timeout + UIMessages.label_sec);
                store.contains(SQLPreferenceConstants.STATEMENT_TIMEOUT) ||
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private Spinner executeTimeoutText;
                store.contains(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED) ||
        maxEditorCheck.setSelection(
                    switch (e.text) {
        setSelectionToStatisticsTabCheck.setSelection(

                commitTypeCombo.select(0);
                SQLEditorMessages.pref_page_sql_editor_checkbox_fetch_resultsets_tip,

                );
        );
import org.jkiss.utils.CommonUtils;
            useDefaults
                : store.getString(ModelPreferences.SCRIPT_STATEMENT_DELIMITER)
            for (StatisticsTabOnExecutionBehavior statisticsTabOnExecution : StatisticsTabOnExecutionBehavior.values()) {
                ? store.getDefaultBoolean(SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE)

        );
                SQLEditorMessages.pref_page_sql_editor_checkbox_blank_line_delimiter,
 */
                    SQLEditorMessages.pref_page_sql_editor_combo_item_stop_commit,
                2
    }
                }
                SWT.READ_ONLY | SWT.DROP_DOWN


            );
        );
            closeIncludedScriptAfterExecutionCheck = UIUtils.createCheckbox(
            setSelectionToStatisticsTabCheck = UIUtils.createCheckbox(
                2,
    public PrefPageSQLExecute() {
        store.setToDefault(ModelPreferences.SQL_VARIABLES_ENABLED);
                );
            );
                SWT.BORDER,
                    commonGroup,

                SQLEditorMessages.pref_page_sql_editor_checkbox_remove_trailing_delimiter_tip,
            statementDelimiterText = UIUtils.createLabelText(
                executeTimeoutText.setDigits(0);
        UIUtils.setComboSelection(
                : store.getBoolean(SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION)
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            useDefaults ? null : store.getString(SQLPreferenceConstants.SCRIPT_COMMIT_TYPE),
        anonymousParameterMarkText.setText(
            );
        return CommonUtils.fromOrdinal(SQLScriptCommitType.class, commitTypeCombo.getSelectionIndex());
 *
                );
            showStatisticsCombo,
                store.contains(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK) ||
                    SQLEditorMessages.pref_page_sql_editor_label_refresh_defaults_after_execute,
                    SQLEditorMessages.pref_page_sql_editor_label_clear_output_before_execute_tip,
                false,
                    commonGroup,
        try {
        Composite rightPane = UIUtils.createComposite(composite, 1);
            {
                store.contains(ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK) ||
                SQLEditorMessages.pref_page_sql_editor_checkbox_show_statistics_for_queries_with_results_tip,
                    SQLEditorMessages.pref_page_sql_editor_combo_item_each_line_autocommit,
                soundOnQueryEnd = UIUtils.createCheckbox(


        return

            );
                            break;
                SQLEditorMessages.pref_page_sql_editor_checkbox_enable_sql_anonymous_parameters,
                    2
        rightPane.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                errorHandlingCombo = new Combo(scriptsGroup, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
                false,
                    "When to perform commit during script execution",
                );
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
            enableParametersInEmbeddedCode = UIUtils.createCheckbox(
                2
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
 */
                true,
                SQLEditorMessages.pref_page_sql_editor_checkbox_close_included_script_after_execution,
                SQLEditorMessages.pref_page_sql_editor_enable_parameters_in_ddl,
            Composite scriptsGroup = UIUtils.createTitledComposite(
                    2
                scriptsGroup,
    private Button maxEditorCheck;
            controlCommandPrefixText = UIUtils.createLabelText(
                        case "commands":
            ignoreNativeDelimiter = UIUtils.createCheckbox(
                SQLEditorMessages.pref_page_sql_editor_group_common,

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            useDefaults
                new GridData(32, SWT.DEFAULT)
            blankLineDelimiterCombo = UIUtils.createLabelCombo(

            );
            {
        return PAGE_ID;
        );
                clearOutputBeforeExecute = UIUtils.createCheckbox(
                2,
                paramsGroup,
                ? store.getDefaultBoolean(ModelPreferences.SQL_PARAMETERS_ENABLED)
                : store.getBoolean(SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE)
            store.setValue(
                rightPane,
            store.setValue(
            StatisticsTabOnExecutionBehavior.getByName(
        store.setToDefault(SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE);
                store.contains(SQLPreferenceConstants.SCRIPT_COMMIT_LINES) ||
package org.jkiss.dbeaver.ui.editors.sql.preferences;
    private Button invalidateBeforeExecuteCheck;
        }
            );

                    SQLEditorMessages.pref_page_sql_editor_label_sound_on_query_end,
    @Override
 * PrefPageSQLExecute
    @NotNull
                setSelectionToStatisticsTabCheck.getSelection()
    private Button soundOnQueryEnd;
                paramsGroup,
            SQLScriptErrorHandling.class,
        // Parameters
                store.contains(SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS) ||
        UIUtils.setControlVisible(commitNQueryText, showNQueryText);
        statementDelimiterText.setText(
        );
                    commonGroup,
import org.jkiss.code.NotNull;
                SQLEditorMessages.pref_page_sql_editor_checkbox_select_statistics_tab,
                leftPane,
                    SQLEditorMessages.pref_page_sql_editor_combo_item_stop_rollback,
            {
            );
        {
    protected void performDefaults() {

            SQLScriptCommitType.class,
        Composite leftPane = UIUtils.createComposite(composite, 1);
                false,
        invalidateBeforeExecuteCheck.setSelection(
        UIUtils.setControlVisible(commitNQueryLabel, showNQueryText);
        );

    @Override
        namedParameterPrefixText.setText(
            store.setValue(
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            store.setValue(ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER, ignoreNativeDelimiter.getSelection());
    @NotNull
            );
        fetchResultSetsCheck.setSelection(
                errorHandlingCombo.add(
    @Override
    @Override
                false,
        clearOutputBeforeExecute.setSelection(
            gd.verticalIndent = 12;
        soundOnQueryEnd.setSelection(
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sqlexecute"; //$NON-NLS-1$
                2
                delimGroup,
                SQLEditorMessages.pref_page_sql_editor_enable_variables_tip,
            );
            store.setValue(ModelPreferences.SQL_CONTROL_COMMAND_PREFIX, controlCommandPrefixText.getText());
 * Licensed under the Apache License, Version 2.0 (the "License");
                SQLEditorMessages.pref_page_sql_editor_checkbox_max_editor_on_script_exec,
    @Override
        boolean showNQueryText = commitType == SQLScriptCommitType.NLINES;
            //statementDelimiterText.setTextLimit(1);
            useDefaults
                ? store.getDefaultBoolean(ModelPreferences.QUERY_REMOVE_TRAILING_DELIMITER)
    private Combo errorHandlingCombo;
    private Button fetchResultSetsCheck;
    protected String getPropertyPageID() {
import org.jkiss.dbeaver.ui.UIUtils;
    private Button clearOutputBeforeExecute;
                store.contains(SQLPreferenceConstants.SCRIPT_ERROR_HANDLING) ||
import org.jkiss.dbeaver.utils.HelpUtils;
        store.setToDefault(SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE);

                : store.getString(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX)
                SQLEditorMessages.pref_page_sql_editor_text_statement_delimiter,
        );
                rightPane,
    }
                StatisticsTabOnExecutionBehavior.getByTitle(showStatisticsCombo.getText()).name()
                commitNQueryText.setMaximum(1024 * 1024);
            store.setValue(ModelPreferences.SQL_PARAMETERS_ENABLED, enableSQLParameters.getSelection());

        }

        ignoreNativeDelimiter.setSelection(
                2
                executeTimeoutText = new Spinner(commonGroup, SWT.BORDER);
        controlCommandPrefixText.setText(
                commitNQueryText.setDigits(0);

                null,
            );
        SQLScriptErrorHandling errorHandling = CommonUtils.valueOf(
    protected void loadPreferences(DBPPreferenceStore store) {
    }
                CommonUtils.fromOrdinal(SQLScriptErrorHandling.class, errorHandlingCombo.getSelectionIndex()).name()
                : store.getBoolean(ModelPreferences.SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED)
                SQLEditorMessages.pref_page_sql_editor_checkbox_ignore_native_delimiter,
                    null,
    @Override
    }
        store.setToDefault(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX);
                executeTimeoutText.setSelection(0);
                scriptsGroup,
                executeTimeoutText.setMaximum(100000);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            );
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.StatisticsTabOnExecutionBehavior;
 *
        store.setToDefault(ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK);
    @Override
                scriptsGroup,
    }
                SQLPreferenceConstants.SCRIPT_ERROR_HANDLING,
                store.contains(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX) ||
    private Combo blankLineDelimiterCombo;
                    }
                paramsGroup,
            gd.horizontalSpan = 2;
            );
    private Button closeIncludedScriptAfterExecutionCheck;
        );
            );
        SQLScriptCommitType commitType = getSelectedScriptCommitType();
import org.jkiss.dbeaver.model.sql.SQLScriptErrorHandling;
import org.jkiss.dbeaver.ModelPreferences.SQLScriptStatementDelimiterMode;
            store.setValue(ModelPreferences.QUERY_REMOVE_TRAILING_DELIMITER, removeTrailingDelimiter.getSelection());
        } catch (Exception e) {
        leftPane.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                    ? store.getDefaultString(ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK)
                    : store.getString(ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK)

        return composite;
 * limitations under the License.
        store.setToDefault(ModelPreferences.SQL_CONTROL_COMMAND_PREFIX);
    }
        return true;
                store.contains(ModelPreferences.SQL_VARIABLES_ENABLED) ||
            Composite paramsGroup = UIUtils.createTitledComposite(
import org.eclipse.swt.events.SelectionEvent;
        );
    private Combo commitTypeCombo;
            UIUtils.createLink(paramsGroup, SQLEditorMessages.pref_page_sql_editor_text_explanation_link, new SelectionAdapter() {
            );
                updateDefaultAfterExecute = UIUtils.createCheckbox(
            useDefaults
                commitTypeCombo = UIUtils.createLabelCombo(
                store.contains(ModelPreferences.QUERY_REMOVE_TRAILING_DELIMITER) ||
 *     http://www.apache.org/licenses/LICENSE-2.0
                store.contains(SQLPreferenceConstants.SET_SELECTION_TO_STATISTICS_TAB) ||
        );
                commitNQueryText.setIncrement(1);
                ? store.getDefaultBoolean(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE)
                2
                : store.getBoolean(SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS)
        store.setToDefault(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE);
            useDefaults
    private Spinner commitNQueryText;
    protected void savePreferences(DBPPreferenceStore store) {

                SQLEditorMessages.pref_page_sql_editor_checkbox_close_included_script_after_execution_tip,
                            break;
                errorHandlingCombo.add(SQLEditorMessages.pref_page_sql_editor_combo_item_ignore, SQLScriptErrorHandling.IGNORE.ordinal());
                            ShellUtils.launchProgram(HelpUtils.getHelpExternalReference("Client-Side-Scripting"));
            useDefaults
        super();
                new GridData(32, SWT.DEFAULT)
            maxEditorCheck = UIUtils.createCheckbox(
                    false,
            removeTrailingDelimiter = UIUtils.createCheckbox(
                commitTypeCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                commitTypeCombo.add(SQLEditorMessages.pref_page_sql_editor_combo_item_script_end, SQLScriptCommitType.AT_END.ordinal());
        enableVariables.setSelection(
            for (SQLScriptStatementDelimiterMode mode : SQLScriptStatementDelimiterMode.values()) {
    private Text controlCommandPrefixText;
import org.eclipse.swt.events.SelectionAdapter;
    }
            );
                commitNQueryLabel = new Label(scriptsGroup, SWT.NONE);
                    SQLEditorMessages.pref_page_sql_editor_label_refresh_defaults_after_execute_tip,
                ? store.getDefaultBoolean(ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER)
        // Scripts
                SWT.BORDER,
            store.setValue(

        store.setToDefault(SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION);
            store.setValue(SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE, updateDefaultAfterExecute.getSelection());
    private Text namedParameterPrefixText;
            enableVariables = UIUtils.createCheckbox(
                false,
            fetchResultSetsCheck = UIUtils.createCheckbox(
                : store.getBoolean(ModelPreferences.SQL_PARAMETERS_ENABLED)
        store.setToDefault(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED);
            }
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                ? store.getDefaultBoolean(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED)
        commitNQueryText.setSelection(
            log.warn(e);
    private Button removeTrailingDelimiter;
 * Unless required by applicable law or agreed to in writing, software

            useDefaults
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
                    false,
            store.setValue(ModelPreferences.SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED, enableParametersInEmbeddedCode.getSelection());
        updateDefaultAfterExecute.setSelection(
        // Delimiters
    private Button setSelectionToStatisticsTabCheck;
                2,
    private Button updateDefaultAfterExecute;
                ? store.getDefaultString(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX)
            useDefaults
        store.setToDefault(SQLPreferenceConstants.STATEMENT_TIMEOUT);
    }
        // General settings
/*
            useDefaults
            useDefaults
import org.jkiss.dbeaver.ui.internal.UIMessages;
                ? store.getDefaultString(ModelPreferences.SCRIPT_STATEMENT_DELIMITER)
                SWT.BORDER,
                    ? store.getDefaultString(SQLPreferenceConstants.SHOW_STATISTICS_ON_EXECUTION)

import org.jkiss.dbeaver.ModelPreferences;
                : store.getBoolean(ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER)
                ? store.getDefaultInt(SQLPreferenceConstants.SCRIPT_COMMIT_LINES)
            }).setLayoutData(gd);
        enableParametersInEmbeddedCode.setSelection(
                commitTypeCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> toggleCommitControls()));

                : store.getBoolean(SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE)
            );
                store.contains(SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE)
            anonymousParameterMarkText.setTextLimit(1);
        store.setToDefault(SQLPreferenceConstants.SCRIPT_ERROR_HANDLING);
        store.setToDefault(ModelPreferences.SQL_PARAMETERS_ENABLED);
                : store.getBoolean(SQLPreferenceConstants.BEEP_ON_QUERY_END)
        store.setToDefault(ModelPreferences.QUERY_REMOVE_TRAILING_DELIMITER);
            ).getTitle()
            );
        UIUtils.setComboSelection(
            enableSQLAnonymousParameters = UIUtils.createCheckbox(
import org.eclipse.swt.widgets.*;
        );
            namedParameterPrefixText = UIUtils.createLabelText(
                null,
        }
                ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK,
