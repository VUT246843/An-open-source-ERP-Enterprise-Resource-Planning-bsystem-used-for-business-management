        store.setToDefault(SQLPreferenceConstants.SMART_WORD_ITERATOR);
                analysisGroup,
    }
        store.setToDefault(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION);
        store.setToDefault(SQLPreferenceConstants.FOLDING_ENABLED);
            || store.contains(SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE)
        return true;

import org.jkiss.dbeaver.runtime.DBWorkbench;
        csFoldingEnabled.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.FOLDING_ENABLED));
        csProblemMarkersEnabled.setSelection(store.getBoolean(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED));

        readMetadataForSemanticValidationEnabled.setEnabled(advancedHighlightingEnabled.getSelection());
        csMarkOccurrencesForSelection.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION));
        store.setValue(SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS, readMetadataForSemanticValidationEnabled.getSelection());
        super();
    protected Control createPreferenceContent(@NotNull Composite parent) {
                false, 1);
                analysisGroup,
    private Button acDoubleQuotesCheck;
                SQLEditorMessages.pref_page_code_editor_label_read_metadata_enabled_tip,

                SQLEditorMessages.pref_page_code_editor_group_analysis,
        readMetadataForSemanticValidationEnabled.setSelection(store.getBoolean(SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS));
        performDefaults();

            || store.contains(SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO)

            Composite analysisGroup = UIUtils.createTitledComposite(
            || store.contains(SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS)
                1,
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING
            afKeywordCase = UIUtils.createCheckbox(
import org.jkiss.dbeaver.ui.UIUtils;
                false,
        readMetadataForSemanticValidationEnabled.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS));
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    private Button validateFunctionsEnabled;
    // Folding
    }
            csMarkOccurrencesUnderCursor = UIUtils.createCheckbox(miscellaneousGroup, SQLEditorMessages.pref_page_sql_completion_label_mark_occurrences, SQLEditorMessages.pref_page_sql_completion_label_mark_occurrences_tip, false, 1);
            Composite miscellaneousGroup = UIUtils.createTitledComposite(
        validateFunctionsEnabled.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.VALIDATE_FUNCTIONS));
            readMetadataForSemanticValidationEnabled.getSelection() && advancedHighlightingEnabled.getSelection()
        csSmartWordsIterator.setSelection(store.getBoolean(SQLPreferenceConstants.SMART_WORD_ITERATOR));
                composite,
 * Licensed under the Apache License, Version 2.0 (the "License");

                SQLEditorMessages.pref_page_code_editor_label_advanced_highlighting_enabled_tip,
        store.setValue(SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE, afExtractFromSource.getSelection());
                    );
            readMetadataForSemanticValidationEnabled.addSelectionListener(new SelectionAdapter() {
                GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING
 */
/**
            || store.contains(SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES)
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer container) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        advancedHighlightingEnabled.getSelection() && readMetadataForSemanticValidationEnabled.getSelection()
            advancedHighlightingEnabled = UIUtils.createCheckbox(
    }
        csProblemMarkersEnabled.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED));
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sql.codeeditor"; //$NON-NLS-1$

        store.setToDefault(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR);
        afKeywordCase.setSelection(store.getBoolean(SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO));
                SQLEditorMessages.pref_page_code_editor_label_validate_functions_enabled,
import org.eclipse.swt.widgets.Composite;
            || store.contains(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR)
import org.eclipse.swt.events.SelectionEvent;
            );
import org.jkiss.code.NotNull;
        }
                SQLEditorMessages.pref_page_sql_format_label_convert_keyword_case_tip,
        // Miscellaneous
        store.setValue(SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE, advancedHighlightingEnabled.getSelection());
            || store.contains(SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES)
        store.setToDefault(SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES);
        csMarkOccurrencesUnderCursor.setSelection(store.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR));


import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                    readMetadataForSemanticValidationEnabled.setEnabled(advancedHighlightingEnabled.getSelection());

    // Auto-close
import org.eclipse.swt.events.SelectionAdapter;
        {
        store.setToDefault(SQLPreferenceConstants.VALIDATE_FUNCTIONS);
                SQLEditorMessages.pref_page_sql_format_label_extract_sql_from_source_code_tip, false, 1);
        store.setValue(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION, csMarkOccurrencesForSelection.getSelection());
                SQLEditorMessages.pref_page_code_editor_label_read_metadata_enabled,
    private Button readMetadataForSemanticValidationEnabled;
                }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        csSmartWordsIterator.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SMART_WORD_ITERATOR));



                GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING
        advancedHighlightingEnabled.setSelection(store.getBoolean(SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE));
        store.setValue(SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO, afKeywordCase.getSelection());
 */

        }
                1
    private Button afExtractFromSource;
 * Unless required by applicable law or agreed to in writing, software
        );
            // Formatting
    protected void loadPreferences(DBPPreferenceStore store) {
                SQLEditorMessages.pref_page_sql_format_group_auto_format,
        csMarkOccurrencesForSelection.setSelection(store.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION));
        store.setValue(SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES, acSingleQuotesCheck.getSelection());
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_FILL
                1
                @Override
import org.eclipse.swt.widgets.Button;
        advancedHighlightingEnabled.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE));
 *

    // Auto-Format
            || store.contains(SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS)
                        advancedHighlightingEnabled.getSelection() && readMetadataForSemanticValidationEnabled.getSelection()
    private Button csMarkOccurrencesForSelection;
        afExtractFromSource.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE));
                analysisGroup,
        store.setValue(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR, csMarkOccurrencesUnderCursor.getSelection());
            || store.contains(SQLPreferenceConstants.SMART_WORD_ITERATOR)
        store.setValue(SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS, acBracketsCheck.getSelection());
    protected void clearPreferences(DBPPreferenceStore store) {
        validateFunctionsEnabled.setSelection(store.getBoolean(SQLPreferenceConstants.VALIDATE_FUNCTIONS));
        store.setToDefault(SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE);
        store.setValue(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED, csProblemMarkersEnabled.getSelection());
                public void widgetSelected(SelectionEvent e) {
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Button csProblemMarkersEnabled;
        {
                    validateFunctionsEnabled.setEnabled(

        acDoubleQuotesCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES));
    }
                SQLEditorMessages.pref_page_sql_format_group_auto_close,
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            || store.contains(SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE);
    @Override

            || store.contains(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION)
    }
            validateFunctionsEnabled = UIUtils.createCheckbox(
    private Button acSingleQuotesCheck;
    protected void savePreferences(DBPPreferenceStore store) {
        acSingleQuotesCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES));
            csMarkOccurrencesForSelection = UIUtils.createCheckbox(miscellaneousGroup, SQLEditorMessages.pref_page_sql_completion_label_mark_occurrences_for_selections, SQLEditorMessages.pref_page_sql_completion_label_mark_occurrences_for_selections_tip, false, 1);
    protected boolean supportsDataSourceSpecificOptions() {
 * PrefPageSQLCodeEditing

                afGroup,
                1
        store.setValue(SQLPreferenceConstants.VALIDATE_FUNCTIONS, validateFunctionsEnabled.getSelection());
            acSingleQuotesCheck = UIUtils.createCheckbox(acGroup, SQLEditorMessages.pref_page_sql_format_label_single_quotes, false);
            advancedHighlightingEnabled.addSelectionListener(new SelectionAdapter() {
    }
 *
    private Button csMarkOccurrencesUnderCursor;
        acDoubleQuotesCheck.setSelection(store.getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES));
            );
 * DBeaver - Universal Database Manager
                public void widgetSelected(SelectionEvent e) {
            readMetadataForSemanticValidationEnabled = UIUtils.createCheckbox(

    protected void performDefaults() {
package org.jkiss.dbeaver.ui.editors.sql.preferences;
            );
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
        afExtractFromSource.setSelection(store.getBoolean(SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE));

        // Query analysis
            || store.contains(SQLPreferenceConstants.VALIDATE_FUNCTIONS)
 * you may not use this file except in compliance with the License.
        return store.contains(SQLPreferenceConstants.FOLDING_ENABLED)
    }
            });
                afGroup,
import org.eclipse.swt.widgets.Control;

                SQLEditorMessages.pref_page_code_editor_label_validate_functions_enabled_tip,
        {

            });
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            );
        // Autoclose
            || store.contains(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED)
        {
    @Override
                composite,
            );
            Composite acGroup = UIUtils.createTitledComposite(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                SQLEditorMessages.pref_page_sql_format_label_convert_keyword_case,
                false,
                SQLEditorMessages.pref_page_code_editor_label_advanced_highlighting_enabled,
        store.setToDefault(SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS);
        store.setValue(SQLPreferenceConstants.FOLDING_ENABLED, csFoldingEnabled.getSelection());
            csProblemMarkersEnabled = UIUtils.createCheckbox(miscellaneousGroup, SQLEditorMessages.pref_page_sql_completion_label_problem_markers_enabled, SQLEditorMessages.pref_page_sql_completion_label_problem_markers_enabled_tip, false, 1);
        store.setToDefault(SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS);
        final DBPPreferenceStore store = container.getPreferenceStore();
        return composite;
    }
            );
import org.eclipse.swt.layout.GridData;

                composite,
                1,
            acDoubleQuotesCheck = UIUtils.createCheckbox(acGroup, SQLEditorMessages.pref_page_sql_format_label_double_quotes, false);

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        }
 * See the License for the specific language governing permissions and
    @Override
                composite,
                @Override
    @Override
                SQLEditorMessages.pref_page_sql_format_label_extract_sql_from_source_code,
        store.setValue(SQLPreferenceConstants.SMART_WORD_ITERATOR, csSmartWordsIterator.getSelection());
        }
    private Button advancedHighlightingEnabled;
                false,
                }
    @Override
    private Button csSmartWordsIterator;
    private Button afKeywordCase;
    public PrefPageSQLCodeEditing() {
                    );
            csSmartWordsIterator = UIUtils.createCheckbox(miscellaneousGroup, SQLEditorMessages.pref_page_sql_completion_label_smart_word_iterator, SQLEditorMessages.pref_page_sql_completion_label_smart_word_iterator_tip, false, 1);
        return PrefPageSQLCodeEditing.PAGE_ID;
        acSingleQuotesCheck.setSelection(store.getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES));
        super.performDefaults();
        acBracketsCheck.setSelection(store.getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS));
    @Override
    private Button csFoldingEnabled;
 * limitations under the License.
    @NotNull
            acBracketsCheck = UIUtils.createCheckbox(acGroup, SQLEditorMessages.pref_page_sql_format_label_brackets, false);

            Composite afGroup = UIUtils.createTitledComposite(
        store.setToDefault(SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO);
        validateFunctionsEnabled.setEnabled(
    @NotNull
}        store.setToDefault(SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES);
            csFoldingEnabled = UIUtils.createCheckbox(miscellaneousGroup, SQLEditorMessages.pref_page_sql_completion_label_folding_enabled, SQLEditorMessages.pref_page_sql_completion_label_folding_enabled_tip, false, 1);
        csFoldingEnabled.setSelection(store.getBoolean(SQLPreferenceConstants.FOLDING_ENABLED));
 * You may obtain a copy of the License at
        afKeywordCase.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO));
        csMarkOccurrencesUnderCursor.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR));
                SQLEditorMessages.pref_page_sql_completion_group_misc,
        acBracketsCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS));
        store.setToDefault(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED);
            afExtractFromSource = UIUtils.createCheckbox(
    protected String getPropertyPageID() {
    }
                    validateFunctionsEnabled.setEnabled(
        store.setValue(SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES, acDoubleQuotesCheck.getSelection());
                1,
        store.setToDefault(SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE);

        Composite composite = UIUtils.createComposite(parent, 1);
    // Highlighting
public class PrefPageSQLCodeEditing extends TargetPrefPage {
    @Override
                1,
    private Button acBracketsCheck;
            );
