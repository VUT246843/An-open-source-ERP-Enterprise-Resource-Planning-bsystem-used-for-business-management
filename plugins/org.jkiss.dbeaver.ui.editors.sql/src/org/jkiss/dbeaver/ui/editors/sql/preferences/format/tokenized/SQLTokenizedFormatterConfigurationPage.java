    private Button useSpacesCheck;
        } else {
        }
    public void loadSettings(@NotNull DBPPreferenceStore preferenceStore, boolean useDefaults) {
public class SQLTokenizedFormatterConfigurationPage extends BaseFormatterConfigurationPage {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                ? preferenceStore.getDefaultBoolean(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET)
import org.jkiss.dbeaver.model.DBPIdentifierCase;
            IPreferenceStore textEditorPrefs = getTextEditorsPreferenceStore();
        super.saveSettings(preferenceStore);
        preferenceStore.setValue(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA, lineFeedBeforeCommaCheck.getSelection());
            useDefaults
    private Combo keywordCaseCombo;
            SQLEditorMessages.pref_page_sql_format_label_insert_delimiters_in_empty_lines,
            caseName = "";

        final String caseName = useDefaults


        indentSizeSpinner.addSelectionListener(selectListener);
            SQLEditorMessages.pref_page_sql_format_tip_insert_delimiters_in_empty_lines,
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
            caseName = keywordCaseCombo.getText().toUpperCase(Locale.ENGLISH);
                ? preferenceStore.getDefaultBoolean(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA)
import org.eclipse.swt.widgets.Button;
                useDefaults
        super.loadSettings(preferenceStore, useDefaults);
        lineFeedBeforeCommaCheck.setSelection(
        Composite settings = UIUtils.createTitledComposite(parent, SQLEditorMessages.pref_page_sql_format_label_settings, 4, GridData.FILL_HORIZONTAL, 0);
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
        SelectionListener selectListener = new SelectionAdapter() {
/*
 * Unless required by applicable law or agreed to in writing, software
            textEditorPrefs.setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH, this.indentSizeSpinner.getSelection());
                SQLEditorMessages.pref_page_sql_format_label_add_line_feed_before_close_bracket,
        {
                    ? textEditorPrefs.getDefaultBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS)
        useSpacesCheck.addSelectionListener(selectListener);
import org.eclipse.swt.widgets.Spinner;
    private Spinner indentSizeSpinner;
import org.eclipse.swt.SWT;
        this.indentSizeSpinner = UIUtils.createLabelSpinner(settings,
 * limitations under the License.
    private IPreferenceStore getTextEditorsPreferenceStore() {
        preferenceStore.setValue(ModelPreferences.SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES, insertDelimiterInEmptyLines.getSelection());


    protected Composite createFormatSettings(Composite parent) {
        );
        this.breakLineBeforeCloseBracket = UIUtils.createCheckbox(settings,
import org.jkiss.code.NotNull;
                    : textEditorPrefs.getBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS)
        preferenceStore.setToDefault(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA);
import org.eclipse.swt.widgets.Combo;
        } else {
                    ? textEditorPrefs.getDefaultInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH)


                SQLEditorMessages.pref_page_sql_format_label_insert_spaces_for_tabs,
            useDefaults
        keywordCaseCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    }

                SQLEditorMessages.pref_page_sql_format_label_indent_size, 4, 0, 100);
 * You may obtain a copy of the License at
        preferenceStore.setValue(ModelPreferences.SQL_FORMAT_KEYWORD_CASE, caseName);
            textEditorPrefs.setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS, useSpacesCheck.getSelection());
import org.eclipse.swt.layout.GridData;
                useDefaults
import org.jkiss.utils.CommonUtils;
        this.insertDelimiterInEmptyLines = UIUtils.createCheckbox(settings,
import org.eclipse.swt.widgets.Composite;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.sql.preferences.format.BaseFormatterConfigurationPage;
            // Text editor settings
        if (keywordCaseCombo.getSelectionIndex() == 0) {
            ? preferenceStore.getDefaultString(ModelPreferences.SQL_FORMAT_KEYWORD_CASE)
import org.jkiss.dbeaver.ui.UIUtils;
        breakLineBeforeCloseBracket.addSelectionListener(selectListener);
    }
    private Button lineFeedBeforeCommaCheck;
    }
            // Text editor settings
        preferenceStore.setToDefault(ModelPreferences.SQL_FORMAT_KEYWORD_CASE);

        DBPIdentifierCase keywordCase = CommonUtils.isEmpty(caseName) ? null : CommonUtils.valueOf(DBPIdentifierCase.class, caseName);
            keywordCaseCombo.add(DBPIdentifierCase.capitalizeCaseName(c.name()));
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        final String caseName;
        super.resetSettings(preferenceStore);
            this.indentSizeSpinner.setSelection(
            IPreferenceStore textEditorPrefs = getTextEditorsPreferenceStore();
 * Copyright (C) 2010-2026 DBeaver Corp and others
        );
                    : textEditorPrefs.getInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH)
        this.useSpacesCheck = UIUtils.createCheckbox(settings,
            UIUtils.setComboSelection(

import org.eclipse.swt.events.SelectionAdapter;
                ? preferenceStore.getDefaultBoolean(ModelPreferences.SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES)
        lineFeedBeforeCommaCheck.addSelectionListener(selectListener);
        insertDelimiterInEmptyLines.setSelection(
                : preferenceStore.getBoolean(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET)
        preferenceStore.setToDefault(ModelPreferences.SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES);
    private Button breakLineBeforeCloseBracket;
        }
            );
                SQLEditorMessages.pref_page_sql_format_label_insert_spaces_for_tabs, true, 2);
            public void widgetSelected(SelectionEvent e) {
    @Override
import org.eclipse.jface.preference.IPreferenceStore;

                SQLEditorMessages.pref_page_sql_format_label_indent_size,
            : preferenceStore.getString(ModelPreferences.SQL_FORMAT_KEYWORD_CASE);
            keywordCaseCombo.select(0);
import org.eclipse.swt.events.SelectionListener;
import org.jkiss.dbeaver.ModelPreferences;
import java.util.Locale;
                changeListener.run();

        };
                keywordCaseCombo,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        }
 */
            }
 *
                SQLEditorMessages.pref_page_sql_format_label_insert_line_feed_before_commas, true, 2);
 *
        keywordCaseCombo.add("Default");
    @Override
            useDefaults
    @Override


        return EditorsPlugin.getDefault().getPreferenceStore();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        );
    }
        preferenceStore.setToDefault(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET);
    private Button insertDelimiterInEmptyLines;
    public void saveSettings(@NotNull DBPPreferenceStore preferenceStore) {
        preferenceStore.setValue(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET, breakLineBeforeCloseBracket.getSelection());
            );
            true, 2);

        for (DBPIdentifierCase c : DBPIdentifierCase.values()) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        keywordCaseCombo = UIUtils.createLabelCombo(settings, SQLEditorMessages.pref_page_sql_format_label_keyword_case, SWT.DROP_DOWN | SWT.READ_ONLY);

 *
        return parent;


            useSpacesCheck.setSelection(
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
    public void resetSettings(@NotNull DBPPreferenceStore preferenceStore) {

package org.jkiss.dbeaver.ui.editors.sql.preferences.format.tokenized;
                : preferenceStore.getBoolean(ModelPreferences.SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES)
                : preferenceStore.getBoolean(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA)
        if (keywordCase == null) {
}
                DBPIdentifierCase.capitalizeCaseName(keywordCase.name()));
        this.lineFeedBeforeCommaCheck = UIUtils.createCheckbox(settings,
                SQLEditorMessages.pref_page_sql_format_label_insert_line_feed_before_commas,

        keywordCaseCombo.addSelectionListener(selectListener);
        insertDelimiterInEmptyLines.addSelectionListener(selectListener);
        breakLineBeforeCloseBracket.setSelection(
import org.eclipse.swt.events.SelectionEvent;
                true, 2);
        }
                SQLEditorMessages.pref_page_sql_format_label_add_line_feed_before_close_bracket,
            @Override
