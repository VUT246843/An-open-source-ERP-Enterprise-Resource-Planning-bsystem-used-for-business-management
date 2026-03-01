                uiGroup,
                null,
            store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING, textDelimiterTrailing.getSelection());
    }
 *
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

                2
            Composite uiGroup = UIUtils.createTitledComposite(
            textTabSize = UIUtils.createLabelSpinner(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_tab_width, 0, 1, 100);
    @Override
    private ValueFormatSelector textValueFormat;
                DataEditorsMessages.pref_page_database_resultsets_label_text_delimiter_leading,
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
    @Override
            );
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
    @Override
                uiGroup,
 */
        } catch (Exception e) {
    private Button showNulls;
                store.contains(ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM) ||
    protected void clearPreferences(DBPPreferenceStore store) {
 * limitations under the License.
                null,
public class PrefPageResultSetPresentationPlainText extends TargetPrefPage {
            );

        try {
            textDelimiterLeading.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING));

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
            showNulls.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS));
            showNulls = UIUtils.createCheckbox(
            textDelimiterBottom = UIUtils.createCheckbox(
import org.jkiss.utils.CommonUtils;
            textDelimiterTop.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP));
                store.getString(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT),
        textDelimiterTrailing.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING));
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING, textDelimiterLeading.getSelection());
            );
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
                store.contains(ResultSetPreferences.RESULT_TEXT_LINE_NUMBER);

/**
                DataEditorsMessages.pref_page_database_resultsets_label_text_show_nulls,
 * Unless required by applicable law or agreed to in writing, software
                false,
    }
        PrefUtils.savePreferenceStore(store);
            );
import org.jkiss.dbeaver.Log;
/*
                null,
    private static final Log log = Log.getLog(PrefPageResultSetPresentationPlainText.class);
import org.jkiss.dbeaver.ui.UIUtils;

        store.setToDefault(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING);
            textMaxColumnSize.setSelection(store.getInt(ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE));

                uiGroup,
    private Spinner textMaxColumnSize;
                DataEditorsMessages.pref_page_database_resultsets_label_text_delimiter_trailing,
        return composite;

    }
 * DBeaver - Universal Database Manager
                uiGroup,
            textExtraSpaces = UIUtils.createCheckbox(
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
 * You may obtain a copy of the License at
                store.contains(ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE) ||
        super.performDefaults();
            textDelimiterTrailing = UIUtils.createCheckbox(
                store.contains(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT) ||
                2,
    @Override
                0,
import org.eclipse.swt.widgets.Button;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.resultset.plain.text"; //$NON-NLS-1$
        textExtraSpaces.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES));
        textTabSize.setSelection(store.getDefaultInt(ResultSetPreferences.RESULT_TEXT_TAB_SIZE));
    @Override
            store.contains(ResultSetPreferences.RESULT_TEXT_TAB_SIZE) ||
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                uiGroup,
                uiGroup,
            );
 * Licensed under the Apache License, Version 2.0 (the "License");
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE);
 *     http://www.apache.org/licenses/LICENSE-2.0
                2
            textLineNumber = UIUtils.createCheckbox(
            store.setValue(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES, textExtraSpaces.getSelection());
            textLineNumber.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_LINE_NUMBER));
    protected void performDefaults() {
}    protected String getPropertyPageID() {
    }
                store.contains(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING) ||
    @Override
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM);
                2
        super();
    private Button textLineNumber;
    protected Control createPreferenceContent(@NotNull Composite parent) {
import org.eclipse.swt.widgets.Control;
            );
    public PrefPageResultSetPresentationPlainText() {
                DataEditorsMessages.pref_page_database_resultsets_label_text_show_line_numbers_tip,
    private Button textDelimiterTrailing;
            textValueFormat = new ValueFormatSelector(uiGroup);
import org.eclipse.swt.widgets.Composite;
        try {
            store.setValue(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT, textValueFormat.getSelection().name());
                false,
    @NotNull
            store.setValue(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS, showNulls.getSelection());
        textLineNumber.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_LINE_NUMBER));
        return true;
                DBDDisplayFormat.EDIT
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        textValueFormat.select(DBDDisplayFormat.EDIT);
        return
            store.setValue(ResultSetPreferences.RESULT_TEXT_LINE_NUMBER, textLineNumber.getSelection());
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS);
                false,
            );
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
                DataEditorsMessages.pref_page_database_resultsets_label_text_show_line_numbers,
    }
            textExtraSpaces.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES));
                2
        }
                2
                2
                DataEditorsMessages.pref_page_database_resultsets_label_text_extra_spaces,
            );
            store.setValue(ResultSetPreferences.RESULT_TEXT_TAB_SIZE, textTabSize.getSelection());
        textDelimiterBottom.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM));
        Composite composite = UIUtils.createComposite(parent, 2);
    private Spinner textTabSize;
                false,

package org.jkiss.dbeaver.ui.editors.data.preferences;
                false,
                uiGroup,
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT);
                DataEditorsMessages.pref_page_database_resultsets_group_plain_text,
    private Button textDelimiterTop;
        }
        }
        textDelimiterLeading.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING));
    }

    private Button textDelimiterLeading;

                store.contains(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP) ||
import org.jkiss.dbeaver.utils.PrefUtils;
    @NotNull
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING);
                GridData.VERTICAL_ALIGN_BEGINNING
                false,
        } catch (Exception e) {
                10,

 * PrefPageResultSetPlainText
            textMaxColumnSize = UIUtils.createLabelSpinner(
            textValueFormat.select(CommonUtils.valueOf(

                store.contains(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS) ||
 * See the License for the specific language governing permissions and
            textDelimiterBottom.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM));
    }

    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
                DBDDisplayFormat.class,
            textTabSize.setSelection(store.getInt(ResultSetPreferences.RESULT_TEXT_TAB_SIZE));
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
    @Override
    @Override

            log.warn(e);

import org.eclipse.swt.widgets.Spinner;
    private Button textExtraSpaces;

import org.eclipse.swt.layout.GridData;
                store.contains(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES) ||
    private Button textDelimiterBottom;
            log.warn(e);
                null,
    }
import org.jkiss.dbeaver.ui.controls.ValueFormatSelector;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP, textDelimiterTop.getSelection());
    protected boolean supportsDataSourceSpecificOptions() {
            );
                DataEditorsMessages.pref_page_database_resultsets_label_text_delimiter_bottom,
        textDelimiterTop.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP));
            textDelimiterTop = UIUtils.createCheckbox(
            store.setValue(ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE, textMaxColumnSize.getSelection());
                DataEditorsMessages.pref_page_database_resultsets_label_text_delimiter_top,
                uiGroup,
        textMaxColumnSize.setSelection(store.getDefaultInt(ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE));
 *
                DataEditorsMessages.pref_page_database_resultsets_label_maximum_column_length,
 */
import org.jkiss.code.NotNull;
            store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM, textDelimiterBottom.getSelection());
            textDelimiterTrailing.setSelection(store.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING));
    }
                null,
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES);
        showNulls.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS));
                composite,
 *
                null,
        store.setToDefault(ResultSetPreferences.RESULT_TEXT_TAB_SIZE);
            ));
        {
            textDelimiterLeading = UIUtils.createCheckbox(
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                store.contains(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING) ||

                false,
                2
        return PAGE_ID;
                Integer.MAX_VALUE
