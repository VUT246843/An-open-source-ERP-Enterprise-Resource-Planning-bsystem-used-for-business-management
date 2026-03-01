
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sql.completion"; //$NON-NLS-1$
    @Override
            store.setValue(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT, csUseGlobalSearch.getSelection());
            store.contains(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT) ||
        store.setToDefault(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS);

    private Button csQualifiedColumnNames;
                SQLEditorMessages.pref_page_sql_completion_label_autocomplete_by_tab,
    {
        return composite;
            csInsertSpace = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_insert_space, null, false, 2);
        return PAGE_ID;
                false,

            csShowServerHelpTopics.setSelection(store.getBoolean(SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS));

import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
                SQLEditorMessages.pref_page_sql_completion_label_auto_insert_proposal_tip,
            csAutoActivationDelaySpinner.setDigits(0);
            store.contains(SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION) ||
    }

import org.eclipse.swt.widgets.*;
                assistGroup,
            store.setValue(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS, csMatchContains.getSelection());
            Composite assistGroup = UIUtils.createTitledComposite(
    private Button csMatchContains;
    @Override
                rightPanel,
    }
                assistGroup,
        store.setToDefault(SQLPreferenceConstants.SHOW_VALUES);
                SQLEditorMessages.pref_page_sql_completion_label_completion_mode_tip,
    {
            log.warn(e);
package org.jkiss.dbeaver.ui.editors.sql.preferences;

                SQLEditorMessages.pref_page_sql_completion_label_auto_insert_proposal,
            store.contains(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS) ||
        csTabChoice.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.TAB_AUTOCOMPLETION));

        store.setToDefault(SQLPreferenceConstants.PROPOSAL_INSERT_CASE);
            
        {
    {
        csReplaceWordAfter.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.PROPOSAL_REPLACE_WORD));
                assistGroup,
    }
                SWT.READ_ONLY | SWT.DROP_DOWN);
    protected boolean supportsDataSourceSpecificOptions()

            );
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
        csAutoInsertCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO));
            );
        csShowColumnProcedures.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES));
            csInsertCase = new Combo(assistGroup, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
            csReplaceWordAfter.setSelection(store.getBoolean(SQLPreferenceConstants.PROPOSAL_REPLACE_WORD));
            store.contains(SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS) ||
            csObjectNameForm.select(SQLCompletionObjectNameFormKind.getFromPreferences(store).ordinal());

        PrefUtils.savePreferenceStore(store);
            store.contains(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION) ||
                SQLEditorMessages.pref_page_sql_completion_label_enable_auto_activation_tip,

/**
                assistGroup,
            store.contains(SQLModelPreferences.SQL_PROPOSAL_INSERT_TABLE_ALIAS) ||
import org.eclipse.swt.layout.GridData;
                assistGroup,

            store.setValue(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO, csAutoInsertCheck.getSelection());

/*
            store.contains(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY) ||
            csAutoActivationDelaySpinner.setMinimum(0);
import org.jkiss.dbeaver.model.sql.SQLTableAliasInsertMode;
    }
                assistGroup,
        rightPanel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
public class PrefPageSQLCompletion extends TargetPrefPage {
            csQualifiedColumnNames.setSelection(store.getBoolean(SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES));
                SQLEditorMessages.pref_page_sql_completion_label_qualified_column_names,
            csInsertCase.add(SQLEditorMessages.pref_page_sql_insert_case_lower_case);
            
        store.setToDefault(SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES);
        } catch (Exception e) {
            csHideDuplicates = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_hide_duplicate_names, null, false, 2);
        csCompletionMode.select(SQLAutocompletionMode.valueByName(store.getDefaultString(SQLPreferenceConstants.AUTOCOMPLETION_MODE)).ordinal());
        csSortAlphabetically.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY));
            csMatchContains.setSelection(store.getBoolean(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS));
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.SQLCompletionObjectNameFormKind;

    private Button csUseGlobalSearch;
            csAutoActivationDelaySpinner.setIncrement(50);
            for (SQLCompletionObjectNameFormKind mode : SQLCompletionObjectNameFormKind.values()) {
        Composite composite = UIUtils.createPlaceholder(parent, 2, 5);
import org.jkiss.code.NotNull;

    private Button csShowColumnProcedures;

            store.setValue(SQLPreferenceConstants.TAB_AUTOCOMPLETION, csTabChoice.getSelection());
            csAutoActivationCheck = UIUtils.createCheckbox(
                SQLEditorMessages.pref_page_sql_completion_label_activate_on_typing_tip,
        store.setToDefault(SQLPreferenceConstants.PROPOSAL_REPLACE_WORD);
        csShowValues.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SHOW_VALUES));
    protected Control createPreferenceContent(@NotNull Composite parent) {
    private Button csAutoInsertCheck;
        }
            );
            );
        return

    protected void performDefaults() {
    private Button csShowValues;
    @NotNull
import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        store.setToDefault(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS);
            store.contains(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY) ||
        csUseGlobalSearch.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT));
            store.setValue(SQLModelPreferences.SQL_PROPOSAL_INSERT_TABLE_ALIAS, SQLTableAliasInsertMode.values()[csInsertTableAlias.getSelectionIndex()].name());
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.SQLAutocompletionMode;

    private Spinner csAutoActivationDelaySpinner;
            csSortAlphabetically.setSelection(store.getBoolean(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY));
        super.performDefaults();
        csObjectNameForm.select(SQLCompletionObjectNameFormKind.getDefaultFromPreferences(store).ordinal());
    private Button csAutoActivationCheck;
                2
    {
            store.setValue(SQLPreferenceConstants.PROPOSAL_REPLACE_WORD, csReplaceWordAfter.getSelection());
    protected void savePreferences(@NotNull DBPPreferenceStore store)
    private Button csHideDuplicates;

            store.contains(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO) ||
            csInsertTableAlias = UIUtils.createLabelCombo(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_insert_table_alias, SWT.READ_ONLY | SWT.DROP_DOWN);
            }
            csAutoActivationCheck.setSelection(store.getBoolean(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION));
            csQualifiedColumnNames = UIUtils.createCheckbox(
        csInsertCase.select(store.getDefaultInt(SQLPreferenceConstants.PROPOSAL_INSERT_CASE));
            store.setValue(SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES, csShowColumnProcedures.getSelection());
        }
            csShowColumnProcedures = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_show_column_procedures, SQLEditorMessages.pref_page_sql_completion_label_show_column_procedures_tip, false, 2);
                csInsertTableAlias.add(mode.getText());
        store.setToDefault(SQLPreferenceConstants.TAB_AUTOCOMPLETION);
        store.setToDefault(SQLModelPreferences.SQL_EDITOR_PROPOSAL_SHORT_NAME);
            csUseGlobalSearch.setSelection(store.getBoolean(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT));
 * Unless required by applicable law or agreed to in writing, software
                true,
            store.setValue(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY, csSortAlphabetically.getSelection());
    @Override
        csAutoActivateOnKeystroke.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION));
 *
            csAutoActivateOnKeystroke = UIUtils.createCheckbox(
            store.setValue(SQLPreferenceConstants.ENABLE_HIPPIE, csHippieActivation.getSelection());
            SQLCompletionObjectNameFormKind.values()[csObjectNameForm.getSelectionIndex()].setToPreferences(store);
            csShowServerHelpTopics = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_show_server_help_topics, SQLEditorMessages.pref_page_sql_completion_label_show_server_help_topics_tip, false, 2);
        // Content assistant
            csAutoActivationDelaySpinner.setSelection(0);
    protected void loadPreferences(@NotNull DBPPreferenceStore store)
            for (SQLTableAliasInsertMode mode : SQLTableAliasInsertMode.values()) {
            csInsertCase.add(SQLEditorMessages.pref_page_sql_insert_case_upper_case);
    private Combo csCompletionMode;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * DBeaver - Universal Database Manager

            csShowValues.setSelection(store.getBoolean(SQLPreferenceConstants.SHOW_VALUES));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.internal.UIMessages;
    private Combo csObjectNameForm;
            store.setValue(SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION, csAutoActivateOnKeystroke.getSelection());
                1,
            store.setValue(SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES, csQualifiedColumnNames.getSelection());
            store.setValue(SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS, csShowServerHelpTopics.getSelection());
            csObjectNameForm = UIUtils.createLabelCombo(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_object_names_form, SWT.READ_ONLY | SWT.DROP_DOWN);

        csInsertSpace.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS));
    private static final Log log = Log.getLog(PrefPageSQLCompletion.class);
        csHippieActivation.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.ENABLE_HIPPIE));
            csSortAlphabetically = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_sort_alphabetically, null, false, 2);
                composite,
 * you may not use this file except in compliance with the License.
            csTabChoice.setSelection(store.getBoolean(SQLPreferenceConstants.TAB_AUTOCOMPLETION));
            csInsertTableAlias.select(SQLTableAliasInsertMode.fromPreferences(store).ordinal());
        return true;
    private Combo csInsertTableAlias;
                2,
        csAutoActivationCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION));
    private Button csTabChoice;
        ;
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
                SQLEditorMessages.pref_page_sql_completion_label_activate_hippie,
        }
        store.setToDefault(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT);
            csHippieActivation = UIUtils.createCheckbox(
 */
        store.setToDefault(SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION);
        store.setToDefault(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY);

            store.contains(SQLPreferenceConstants.AUTOCOMPLETION_MODE) ||
            store.setValue(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY, csAutoActivationDelaySpinner.getSelection());
            csCompletionMode.select(SQLAutocompletionMode.fromPreferences(store).ordinal());
    }
                SQLEditorMessages.pref_page_sql_completion_label_completion_mode,
            csInsertCase.select(store.getInt(SQLPreferenceConstants.PROPOSAL_INSERT_CASE));
            csAutoActivationDelaySpinner.setMaximum(1000000);
        store.setToDefault(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO);
    }
            csInsertSpace.setSelection(store.getBoolean(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS));
                2
            );


            csAutoActivationDelaySpinner.setSelection(store.getInt(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY));
        try {
import org.eclipse.swt.layout.GridLayout;
    @NotNull
    }
    public PrefPageSQLCompletion()
            csAutoActivationDelaySpinner = new Spinner(assistGroup, SWT.BORDER);
    private Button csHippieActivation;
            csAutoInsertCheck.setSelection(store.getBoolean(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO));
        csHideDuplicates.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS));
            store.setValue(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS, csInsertSpace.getSelection());
        try {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            csAutoActivationDelaySpinner.setToolTipText(SQLEditorMessages.pref_page_sql_completion_label_set_auto_activation_delay_tip);
        csAutoActivationDelaySpinner.setSelection(store.getDefaultInt(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY));
            csMatchContains = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_match_contains, SQLEditorMessages.pref_page_sql_completion_label_match_contains_tip, false, 2);
            );
            for (SQLAutocompletionMode mode : SQLAutocompletionMode.values()) {
        {
            csAutoInsertCheck = UIUtils.createCheckbox(
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
            }
        csInsertTableAlias.select(store.getDefaultInt(SQLModelPreferences.SQL_PROPOSAL_INSERT_TABLE_ALIAS));
    @Override


        csMatchContains.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS));
    @Override
                2
                false,
                2
        store.setToDefault(SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS);
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
            csUseGlobalSearch = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_use_global_search, SQLEditorMessages.pref_page_sql_completion_label_use_global_search_tip, false, 2);
    @Override
                SQLEditorMessages.pref_page_sql_completion_group_sql_assistant,
import org.jkiss.dbeaver.utils.PrefUtils;
            store.contains(SQLPreferenceConstants.PROPOSAL_REPLACE_WORD) ||
 */
            store.setValue(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION, csAutoActivationCheck.getSelection());
        store.setToDefault(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION);
        rightPanel.setLayout(new GridLayout(1, false));
        store.setToDefault(SQLPreferenceConstants.ENABLE_HIPPIE);
        store.setToDefault(SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES);
 *     http://www.apache.org/licenses/LICENSE-2.0
                false,
    private Button csShowServerHelpTopics;
    {
            csTabChoice = UIUtils.createCheckbox(
            csHideDuplicates.setSelection(store.getBoolean(SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS));
            csShowColumnProcedures.setSelection(store.getBoolean(SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES));

        store.setToDefault(SQLModelPreferences.SQL_EDITOR_PROPOSAL_ALWAYS_FQ);
            );
import org.jkiss.dbeaver.ui.UIUtils;
            );
                csCompletionMode.add(mode.title);
                SQLEditorMessages.pref_page_sql_completion_label_enable_auto_activation,
            store.contains(SQLPreferenceConstants.SHOW_VALUES) ||
        store.setToDefault(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY);
            store.contains(SQLPreferenceConstants.PROPOSAL_INSERT_CASE) ||
            store.contains(SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES)
            Composite assistGroup = UIUtils.createTitledComposite(
            log.warn(e);
                SQLEditorMessages.pref_page_sql_completion_label_activate_on_typing,
    {
        } catch (Exception e) {
 * limitations under the License.
                SQLEditorMessages.pref_page_sql_format_group_search,
                false,
    @Override
            UIUtils.createControlLabel(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_insert_case);
            store.setValue(SQLPreferenceConstants.SHOW_VALUES, csShowValues.getSelection());
        store.setToDefault(SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS);
    private Button csReplaceWordAfter;
    }
            store.contains(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS) ||

            store.setValue(SQLPreferenceConstants.PROPOSAL_INSERT_CASE, csInsertCase.getSelectionIndex());
            csAutoActivateOnKeystroke.setSelection(store.getBoolean(SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION));
            csShowValues = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_show_values, SQLEditorMessages.pref_page_sql_completion_label_show_values_tip, false, 2);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                SQLEditorMessages.pref_page_sql_completion_label_qualified_column_names_tip,
                SQLEditorMessages.pref_page_sql_completion_label_activate_hippie_tip,
                2
        Composite rightPanel = new Composite(composite, SWT.NONE);
    private Button csAutoActivateOnKeystroke;
 *
import org.jkiss.dbeaver.Log;
    @Override
            store.contains(SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES) ||
import org.jkiss.dbeaver.runtime.DBWorkbench;
    protected void clearPreferences(DBPPreferenceStore store)
            csHippieActivation.setSelection(store.getBoolean(SQLPreferenceConstants.ENABLE_HIPPIE));
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Combo csInsertCase;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super();
            store.contains(SQLPreferenceConstants.TAB_AUTOCOMPLETION) ||
                csObjectNameForm.add(mode.title);
    private Button csSortAlphabetically;
            UIUtils.createControlLabel(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_auto_activation_delay + UIMessages.label_ms);
    private Button csInsertSpace;


 * You may obtain a copy of the License at
 *
            store.contains(SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS) ||
                false,
    {
                GridData.VERTICAL_ALIGN_BEGINNING
        csShowServerHelpTopics.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS));
            }

 * PrefPageSQLCompletion
    protected String getPropertyPageID()
        store.setToDefault(SQLModelPreferences.SQL_PROPOSAL_INSERT_TABLE_ALIAS);
import org.eclipse.swt.SWT;
                SQLEditorMessages.pref_page_sql_completion_label_autocomplete_by_tab_tip,
}            csInsertCase.add(SQLEditorMessages.pref_page_sql_default);
                assistGroup,
                2
            store.contains(SQLModelPreferences.SQL_EDITOR_PROPOSAL_ALWAYS_FQ) ||
            store.setValue(SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS, csHideDuplicates.getSelection());
        csQualifiedColumnNames.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES));
            csCompletionMode = UIUtils.createLabelCombo(
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            csReplaceWordAfter = UIUtils.createCheckbox(assistGroup, SQLEditorMessages.pref_page_sql_completion_label_replace_word_after, SQLEditorMessages.pref_page_sql_completion_label_replace_word_after_tip, false, 2);
            store.setValue(SQLPreferenceConstants.AUTOCOMPLETION_MODE, SQLAutocompletionMode.values()[csCompletionMode.getSelectionIndex()].getName());
        }
            store.contains(SQLModelPreferences.SQL_EDITOR_PROPOSAL_SHORT_NAME) ||
