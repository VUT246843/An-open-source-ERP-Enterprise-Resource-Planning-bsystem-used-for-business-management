import org.jkiss.code.NotNull;
        DBPPreferenceStore store = dsContainer.getPreferenceStore();
        if (reconnectToLastDatabaseButton != null) {

    }
        {
            replaceCombo.add(DTMessages.pref_data_transfer_replacing_combo_underscores);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.datatransfer";
                preferences.getBoolean(DTConstants.PREF_RECONNECT_TO_LAST_DATABASE)
        }
 * limitations under the License.
        replaceCombo.select(preferences.getDefaultInt(DTConstants.PREF_REPLACE_MAPPING));
    private Spinner typeLengthSpinner;
            reconnectToLastDatabaseButton.setSelection(preferences.getDefaultBoolean(DTConstants.PREF_RECONNECT_TO_LAST_DATABASE));
    @Override

            );
        store.setToDefault(DTConstants.PREF_NAME_CASE_MAPPING);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            replaceCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            reconnectToLastDatabaseButton = UIUtils.createCheckbox(
import org.jkiss.dbeaver.utils.PrefUtils;
            final Composite group = UIUtils.createTitledComposite(

        preferences.setValue(DTConstants.PREF_MAX_TYPE_LENGTH, typeLengthSpinner.getSelection());

        }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            preferences = store;
    }
        }
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        }
            nameCaseCombo.add(DTMessages.pref_data_transfer_name_case_upper);
        return PAGE_ID;


                null

                2);

                Integer.MAX_VALUE);
        // nothing to initialize
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
    }
    private Combo nameCaseCombo;
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
                store.contains(DTConstants.PREF_MAX_TYPE_LENGTH);
                null,
                group,

                false,
            preferences = store;
    }
    @Override

            fallbackOutputDirectoryText.setMessage(DTConstants.DEFAULT_FALLBACK_OUTPUT_DIRECTORY);
import org.jkiss.dbeaver.tools.transfer.DTConstants;
import org.eclipse.swt.layout.GridData;
    @Override
        final DBPPreferenceStore preferences = DTActivator.getDefault().getPreferences();
        typeLengthSpinner.setSelection(preferences.getDefaultInt(DTConstants.PREF_MAX_TYPE_LENGTH));
                DTUIMessages.pref_data_transfer_replacing_combo_label,
 * you may not use this file except in compliance with the License.
    protected Control createPreferenceContent(@NotNull Composite parent) {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        store.setToDefault(DTConstants.PREF_FALLBACK_OUTPUT_DIRECTORY);
            replaceCombo.add(DTMessages.pref_data_transfer_replacing_combo_camel_case);
            replaceCombo.setToolTipText(DTUIMessages.pref_data_transfer_replacing_combo_tip);
        }
                DTUIMessages.pref_data_transfer_name_case_label,

                DTUIMessages.pref_data_transfer_options_fallback_directory,
    protected String getPropertyPageID() {
        }
        DBPPreferenceStore preferences = DTActivator.getDefault().getPreferences();
    protected boolean supportsDataSourceSpecificOptions() {
                DTConstants.DEFAULT_MAX_TYPE_LENGTH,
        store.setToDefault(DTConstants.PREF_REPLACE_MAPPING);
        preferences.setValue(DTConstants.PREF_REPLACE_MAPPING, replaceCombo.getSelectionIndex());
        if (!isDataSourcePreferencePage()) {
    }
}
    @Override
 */

    private Combo replaceCombo;
            fallbackOutputDirectoryText = DialogUtils.createOutputFolderChooser(
                DTUIMessages.pref_data_transfer_mapping_group,

    @Override
            preferences.setValue(DTConstants.PREF_FALLBACK_OUTPUT_DIRECTORY, fallbackOutputDirectoryText.getText());
        typeLengthSpinner.setSelection(preferences.contains(DTConstants.PREF_MAX_TYPE_LENGTH) ?
 * Copyright (C) 2010-2026 DBeaver Corp and others
            fallbackOutputDirectoryText.setText(CommonUtils.notEmpty(preferences.getString(DTConstants.PREF_FALLBACK_OUTPUT_DIRECTORY)));
 *
import org.eclipse.swt.widgets.*;
        if (isDataSourcePreferencePage()) {
                mappingGroup,
                1,
        }
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.SWT;
            Composite mappingGroup = UIUtils.createTitledComposite(

            replaceCombo = UIUtils.createLabelCombo(
    @Override
            store.contains(DTConstants.PREF_NAME_CASE_MAPPING) ||
        final Composite composite = UIUtils.createComposite(parent, 1);
        }
public class PrefPageDataTransfer extends TargetPrefPage implements IWorkbenchPreferencePage {
        nameCaseCombo.select(preferences.getInt(DTConstants.PREF_NAME_CASE_MAPPING));

                composite,
        if (fallbackOutputDirectoryText != null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dsContainer) {


 * You may obtain a copy of the License at
        }
            Composite group = UIUtils.createTitledComposite(
            UIUtils.createControlLabel(mappingGroup, DTUIMessages.pref_data_transfer_spanner_max_length);
    }
                composite,
                GridData.FILL_HORIZONTAL);
    }
            fallbackOutputDirectoryText.setMessage(preferences.getDefaultString(DTConstants.PREF_FALLBACK_OUTPUT_DIRECTORY));


                DTUIMessages.pref_data_transfer_options_title,
        return true;
        if (reconnectToLastDatabaseButton != null) {
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
        if (reconnectToLastDatabaseButton != null) {
            fallbackOutputDirectoryText.setText("");
        if (fallbackOutputDirectoryText != null) {
            typeLengthSpinner = UIUtils.createSpinner(
                null,
        return
        nameCaseCombo.select(preferences.getDefaultInt(DTConstants.PREF_NAME_CASE_MAPPING));

    @Override
                DTUIMessages.pref_data_transfer_wizard_title,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                group,
import org.eclipse.ui.IWorkbench;
        PrefUtils.savePreferenceStore(preferences);
    protected void clearPreferences(DBPPreferenceStore store) {
    @NotNull
            preferences.setValue(DTConstants.PREF_RECONNECT_TO_LAST_DATABASE, reconnectToLastDatabaseButton.getSelection());
    }
            );
                DTUIMessages.pref_data_transfer_wizard_reconnect_to_database,
            replaceCombo.add(DTMessages.pref_data_transfer_replacing_combo_do_not);
 * DBeaver - Universal Database Manager
            nameCaseCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

                DTUIMessages.pref_data_transfer_info_label_mapping, GridData.HORIZONTAL_ALIGN_BEGINNING, 2);
                DTUIMessages.pref_data_transfer_options_fallback_directory_tip,
    @Override
    private Text fallbackOutputDirectoryText;
        if (fallbackOutputDirectoryText != null) {
            nameCaseCombo = UIUtils.createLabelCombo(
                composite,
package org.jkiss.dbeaver.tools.transfer.ui.prefs;
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        final DBPPreferenceStore preferences = DTActivator.getDefault().getPreferences();
        store.setToDefault(DTConstants.PREF_MAX_TYPE_LENGTH);
import org.jkiss.utils.CommonUtils;
    private Button reconnectToLastDatabaseButton;
        replaceCombo.select(preferences.getInt(DTConstants.PREF_REPLACE_MAPPING));

 * Unless required by applicable law or agreed to in writing, software
        DBPPreferenceStore preferences = DTActivator.getDefault().getPreferences();
                SWT.READ_ONLY | SWT.DROP_DOWN);
        }
    }
        if (isDataSourcePreferencePage()) {
    public void init(IWorkbench workbench) {
        store.setToDefault(DTConstants.PREF_RECONNECT_TO_LAST_DATABASE);
                2
            );

            preferences.getInt(DTConstants.PREF_MAX_TYPE_LENGTH) : DTConstants.DEFAULT_MAX_TYPE_LENGTH);
            UIUtils.createInfoLabel(mappingGroup,
            nameCaseCombo.add(DTMessages.pref_data_transfer_name_case_default);
                SWT.READ_ONLY | SWT.DROP_DOWN);
            nameCaseCombo.add(DTMessages.pref_data_transfer_name_case_lower);
                mappingGroup,
 *
                store.contains(DTConstants.PREF_REPLACE_MAPPING) ||

            reconnectToLastDatabaseButton.setSelection(preferences.getBoolean(DTConstants.PREF_RECONNECT_TO_LAST_DATABASE));
                1,
                DTUIMessages.pref_data_transfer_spanner_max_length_tip,
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
 *
import org.eclipse.ui.IWorkbenchPreferencePage;
        if (!isDataSourcePreferencePage()) {
    @NotNull
        return composite;
        }
    protected void performDefaults() {
 * See the License for the specific language governing permissions and
        preferences.setValue(DTConstants.PREF_NAME_CASE_MAPPING, nameCaseCombo.getSelectionIndex());

                mappingGroup,
