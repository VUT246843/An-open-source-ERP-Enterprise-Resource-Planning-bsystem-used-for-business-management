 * DBeaver - Universal Database Manager
        PrefUtils.savePreferenceStore(store);
            store.contains(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS) ||
            showFiltersInSingleTabMode = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_filters_panel_in_singletab_mode, true);
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.resultset.presentation"; //$NON-NLS-1$
        super.performDefaults();
        showDescription.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION));
    private Button rightJustifyNumbers;
    protected boolean supportsDataSourceSpecificOptions() {
        return
        store.setToDefault(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES);  
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION, showDescription.getSelection());
    @Override
    private Button showFiltersInSingleTabMode;
package org.jkiss.dbeaver.ui.editors.data.preferences;
    @Override

        } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            store.contains(ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL);
        try {
 */

import org.jkiss.dbeaver.Log;
    private Button rightJustifyDateTime;
        rightJustifyDateTime.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME));
        super();
            rightJustifyNumbers = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_right_justify_numbers_and_date, null, false, 1);
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION);
import org.jkiss.dbeaver.utils.PrefUtils;
            Composite uiGroup = UIUtils.createTitledComposite(composite, DataEditorsMessages.pref_page_database_resultsets_group_common, 1);
            rightJustifyDateTime.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME));

    protected void performDefaults() {
import org.eclipse.swt.widgets.Button;
    @Override
            transformComplexTypes.setSelection(store.getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES));
    protected void clearPreferences(DBPPreferenceStore store) {
    @NotNull
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME, showConnectionName.getSelection());

        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
 * See the License for the specific language governing permissions and

    }
        Composite composite = UIUtils.createComposite(parent, 1);
            rightJustifyNumbers.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS));
        showConnectionName.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME));
            autoSwitchMode = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_switch_mode_on_rows, false);
    }
 * Unless required by applicable law or agreed to in writing, software
            store.contains(ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME) ||
        store.setToDefault(ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES);
        transformComplexTypes.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES));
/**
            log.warn(e);
    }
        }
            transformComplexTypes = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_structurize_complex_types, DataEditorsMessages.pref_page_database_resultsets_label_structurize_complex_types_tip, false, 1);
            store.contains(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES) ||
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            log.warn(e);
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
        autoCompleteProposal.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL));
        store.setToDefault(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS);
        	store.contains(ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE) ||
            showConnectionName.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME));
 * Licensed under the Apache License, Version 2.0 (the "License");
            showConnectionName = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_show_connection_name, false);
            store.setValue(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME, rightJustifyDateTime.getSelection());
 * you may not use this file except in compliance with the License.
            columnWidthByValue = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_calc_column_width_by_values, DataEditorsMessages.pref_page_database_resultsets_label_calc_column_width_by_values_tip, false, 1);
        showFiltersInSingleTabMode.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE));
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE, showFiltersInSingleTabMode.getSelection());
    }
    private Button showDescription;
            store.setValue(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES, transformComplexTypes.getSelection());

            store.setValue(ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE, autoSwitchMode.getSelection());
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
import org.jkiss.code.NotNull;
        store.setToDefault(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME);
        try {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        store.setToDefault(ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE);
 */
    }
        rightJustifyNumbers.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS));
    private Button showConnectionName;
    @Override

        columnWidthByValue.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES));
 *
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE);

 * PrefPageResultSetPresentation
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            autoSwitchMode.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE));
public class PrefPageResultSetPresentation extends TargetPrefPage {
            store.setValue(ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES, columnWidthByValue.getSelection());
    }
 *

            showFiltersInSingleTabMode.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE));

    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
            autoCompleteProposal = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_auto_completion, DataEditorsMessages.pref_page_database_resultsets_label_auto_completion_tip, true, 1);
    protected Control createPreferenceContent(@NotNull Composite parent) {
    public PrefPageResultSetPresentation() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
}        autoSwitchMode.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE));
    protected String getPropertyPageID() {

    @Override
        }
/*
import org.eclipse.swt.widgets.Composite;

        return composite;
            rightJustifyDateTime = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_right_justify_datetime, null, false, 1);
import org.jkiss.dbeaver.ModelPreferences;

            columnWidthByValue.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES));
    @Override
            store.contains(ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES) ||
import org.eclipse.swt.widgets.Control;
            showDescription = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_show_column_description, false);
        store.setToDefault(ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            store.contains(ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION) ||
    private Button autoSwitchMode;
    @Override
        return true;
    }
    private Button transformComplexTypes;
    @NotNull
import org.jkiss.dbeaver.ui.UIUtils;
    private Button autoCompleteProposal;
        } catch (Exception e) {
    @Override
 * You may obtain a copy of the License at
            store.setValue(ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL, autoCompleteProposal.getSelection());
    private static final Log log = Log.getLog(PrefPageResultSetPresentation.class);
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME);
        {
    }
        return PAGE_ID;
    protected void savePreferences(@NotNull DBPPreferenceStore store) {

            store.contains(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME) ||
            store.contains(ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE) ||
            showDescription.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION));

            store.setValue(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS, rightJustifyNumbers.getSelection());
            autoCompleteProposal.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL));
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * limitations under the License.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private Button columnWidthByValue;
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
