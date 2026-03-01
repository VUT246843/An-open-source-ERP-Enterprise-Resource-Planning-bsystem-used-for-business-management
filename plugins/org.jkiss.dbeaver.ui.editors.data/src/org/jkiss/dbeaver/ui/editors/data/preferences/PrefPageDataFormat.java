        profileProperties.put(formatterDescriptor.getId(), props);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            localeSelector.addListener(SWT.Selection, event -> {
            }
import org.eclipse.jface.dialogs.IDialogConstants;
        profileProperties.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (!isDataSourcePreferencePage()) {

    @Override
        super();
                2,
        }
            );
                getButton(DELETE_ID).setEnabled(profileList.getSelectionIndex() >= 0)));
        }
        for (DataFormatterDescriptor dfd : formatterDescriptors) {
            if (formatterProps != null) {
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        DBDDataFormatter formatter = formatterDescriptor.createFormatter();
                    }
    private void setCurrentProfile(DBDDataFormatterProfile profile) {
        }
            return;
            try {
                }

 * Unless required by applicable law or agreed to in writing, software
    }
            propsLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
            numericNativeFormatCheck.setEnabled(editable);
            typeCombo = new Combo(formatGroup, SWT.DROP_DOWN | SWT.READ_ONLY);

     */


            datetimeNativeFormatCheck.setEnabled(editable);
    @Override

        if (formatterDescriptor == null) {
            super.setPropertyValue(monitor, id, value);
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
        DataFormatProfilesEditDialog(Shell parentShell) {
        {

            UIUtils.createControlLabel(profileGroup, ResultSetMessages.pref_page_data_format_label_profile);
            if (typeCombo.getItemCount() > 0) {
import org.jkiss.code.NotNull;
            return;
        private static final int NEW_ID = IDialogConstants.CLIENT_ID + 1;
        DataFormatterDescriptor formatterDescriptor = getCurrentFormatter();
import org.jkiss.dbeaver.registry.formatter.DataFormatterDescriptor;
    }
            }
        );
        }
            Map<String, Object> defaultProps = descriptor.getSample().getDefaultProperties(profileLocale);
                false,

            localeSelector = new LocaleSelectorControl(composite, null);
    }
    @Override
        try {

import org.jkiss.dbeaver.model.data.DBDDataFormatter;
 */
 * See the License for the specific language governing permissions and
        propertiesControl.saveEditorValues();
            formatterProfile.setLocale(profileLocale);


import org.eclipse.osgi.util.NLS;
                ResultSetMessages.pref_page_data_format_numeric_use_native_formatting_tip,

import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        try {
                if (registry.getCustomProfile(profileName) != null) {
        }
import org.eclipse.swt.SWT;
        String sampleValue = formatter.formatValue(formatterDescriptor.getSample().getSampleValue());
            store.setValue(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT, numericNativeFormatCheck.getSelection());
            DataFormatterRegistry registry = DataFormatterRegistry.getInstance();


                super.setPropertyValue(monitor, id, previousValue);
    final private String HELP_DATA_FORMAT_LINK = "Managing-Data-Formats";
        changeProfile();

    }
    private void refreshProfileList() {
        }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            if (formatter != null) {
        } else {
        Map<String, Object> defProps = formatterDescriptor.getSample().getDefaultProperties(profileLocale);
        }
        }

            Composite profileGroup = UIUtils.createComposite(composite, 3);
            group.setLayoutData(new GridData(GridData.FILL_BOTH));


                        ResultSetMessages.dialog_data_format_profiles_error_title,
 *
            numericScientificFormatCheck = UIUtils.createCheckbox(
    protected Control createPreferenceContent(@NotNull Composite parent) {
            group.setLayout(new GridLayout(1, false));
        {

 * limitations under the License.
                    SelectionListener.widgetSelectedAdapter(e -> manageProfiles()));
        store.setToDefault(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT);
 * DBeaver - Universal Database Manager
            typeCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> reloadFormatter()));
        protected void buttonPressed(int buttonId) {
                ResultSetMessages.pref_page_data_format_numeric_use_scientific_notation,
 *
            profilesCombo.add(profile.getProfileName());
            profilesCombo = new Combo(profileGroup, SWT.DROP_DOWN | SWT.READ_ONLY);

        }

                composite,
    protected void performDefaults() {
    private Combo typeCombo;
    private void manageProfiles() {
            localeSelector.setEnabled(editable);
            return;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
            }
        // formats
        }
        Map<String, Object> formatterProps = profileProperties.get(formatterDescriptor.getId());
            reloadSampleThrowable();

        try {
        @Override
                composite,
    private void changeProfile() {
            Map<String, Object> formatterProps = formatterProfile.getFormatterProperties(store, dfd.getId());
        {
            newProfile = getDefaultProfile();

    private LocaleSelectorControl localeSelector;
            urlHelpLabel.setLayoutData(new GridData(
        }
                    profileGroup,

        dialog.open();


            );
import org.eclipse.swt.events.SelectionListener;
        numericScientificFormatCheck.setSelection(store.getBoolean(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT));
        private static final int DELETE_ID = IDialogConstants.CLIENT_ID + 2;
            numericScientificFormatCheck.setEnabled(editable && numericNativeFormatCheck.getSelection());
            List<DBDDataFormatterProfile> profiles = DataFormatterRegistry.getInstance().getCustomProfiles();
                GridData.VERTICAL_ALIGN_BEGINNING,
        if (isDataSourcePreferencePage()) {

                numericScientificFormatCheck.setEnabled(numericNativeFormatCheck.getSelection())));

import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.registry.formatter.DataFormatterRegistry;
    private PropertyTreeViewer propertiesControl;

                2
                    return;
        return PAGE_ID;
        }
        if (profilesCombo == null || profilesCombo.isDisposed()) {
            if (deleteButton != null) {
        }
        } catch (Exception e) {
        private void loadProfiles() {
        if (data instanceof DBDDataFormatterProfile) {
     */
        }
            // Set locale
        localeSelector.setLocale(profileLocale);
            gd.widthHint = 300;
            } else if (buttonId == DELETE_ID) {
    protected boolean supportsDataSourceSpecificOptions() {
                formatGroup,
                propertySource.setDefaultValues(formatter.getSample().getDefaultProperties(locale));
                typeCombo.add(formatter.getName());
    /**
        if (selectionIndex == 0) {
            ));
                        getShell(),
            return;
        }

            profilesCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> changeProfile()));
            getShell().setText(ResultSetMessages.dialog_data_format_profiles_title);
        sampleText.setText(CommonUtils.notEmpty(sampleValue));
    private Locale profileLocale;
            super(properties, values);
            store.setValue(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT, datetimeNativeFormatCheck.getSelection());
            profileList = new org.eclipse.swt.widgets.List(group, SWT.SINGLE | SWT.BORDER);
            profilesCombo.setText(oldProfile);
    private void reloadSampleThrowable() throws Exception {
    @Override
            formatterProps.putAll(props);
        DataFormatterDescriptor formatterDescriptor = getCurrentFormatter();
                deleteButton.setEnabled(false);
            Composite settingsGroup = UIUtils.createTitledComposite(
                saveFormatterProperties();

            Composite group = new Composite(parent, SWT.NONE);
                settingsGroup,
        }

        } catch (Exception e) {
            getButton(DELETE_ID).setEnabled(false);

        DBDDataFormatterProfile newProfile;
                    DBDDataFormatterProfile profile = registry.getCustomProfile(profileList.getItem(selectionIndex));
            DBWorkbench.getPlatformUI().showError("Data formats", "Can't apply formatter values to the sample", e);
                    if (profile != null) {
            return true;
            }
                            getShell(),
                false,
        formatterProfile = profile;
        reloadSample();
    protected void clearPreferences(@NotNull DBPPreferenceStore store) {
package org.jkiss.dbeaver.ui.editors.data.preferences;
    public void applyData(Object data) {
    private Button numericNativeFormatCheck;
                profileList.add(profile.getProfileName());
            formatterProfile.setProfileName(profileName);


                settingsGroup,
                ResultSetMessages.pref_page_data_format_group_format,
    protected void loadPreferences(DBPPreferenceStore store) {

                        }
        @Override
    }
        if (oldProfile != null) {
import org.jkiss.dbeaver.ModelPreferences;

                propertiesControl.refresh();
        reloadSample();
        }
            return;
            }

    }
        Map<String, Object> formatterProps = new HashMap<>();
    private List<DataFormatterDescriptor> formatterDescriptors;
        profileProperties.clear();
        }
            Button deleteButton = getButton(DELETE_ID);
                if (selectionIndex >= 0) {
        return composite;

    }

        datetimeNativeFormatCheck.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT));
        numericScientificFormatCheck.setSelection(isNumericSc);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        Composite composite = UIUtils.createComposite(parent, 2);

        super.applyData(data);

        }
            }
        }
            );
        }
    private DBDDataFormatterProfile formatterProfile;
        formatterDescriptors = new ArrayList<>(DataFormatterRegistry.getInstance().getDataFormatters());
        if (defProps != null && !defProps.isEmpty()) {
                saveFormatterProperties();
        propertySource = new VerifyingPropertySourceCustom(
            createButton(parent, NEW_ID, ResultSetMessages.dialog_data_format_profiles_button_new_profile, false);
            Link urlHelpLabel = UIUtils.createLink(
        super.dispose();
    }
import org.jkiss.dbeaver.Log;
    @Override
                    ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(HELP_DATA_FORMAT_LINK))));
        for (DBDDataFormatterProfile profile : DataFormatterRegistry.getInstance().getCustomProfiles()) {
        protected void createButtonsForButtonBar(Composite parent) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            reloadFormatter();
        setCurrentProfile(getDefaultProfile());
            profileGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            boolean editable = selectionIndex == 0 ||
            DataFormatterDescriptor formatter = getCurrentFormatter();
        profileLocale = formatterProfile.getLocale();
        if (selectionIndex < 0) {
                    ResultSetMessages.pref_page_data_format_button_manage_profiles,
    }
    private final Map<String, Map<String, Object>> profileProperties = new HashMap<>();
        }
        numericScientificFormatCheck.setEnabled(isNumericSc);
                throw new IllegalArgumentException(e);

                ResultSetMessages.pref_page_data_format_datetime_use_native_formatting,
        }
    private void onLocaleChange(Locale locale) {
                2,
        }
    @Override
        }
        DataFormatterDescriptor formatterDescriptor = getCurrentFormatter();
                super.buttonPressed(buttonId);
                ResultSetMessages.pref_page_data_format_datetime_use_native_formatting_tip,

import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
                }
        propertySource.setDefaultValues(defaultProps);
    private static final Log log = Log.getLog(PrefPageDataFormat.class);
        numericScientificFormatCheck.setEnabled(numericNativeFormatCheck.getSelection());
            super(parentShell);
    }
    private void saveFormatterProperties() throws Exception {
        }
        public void resetPropertyValueToDefault(@NotNull String id) {
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
                ResultSetMessages.pref_page_data_format_numeric_use_scientific_notation_tip,
                if (event.data instanceof Locale) {
        datetimeNativeFormatCheck.setSelection(store.getBoolean(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT));
                log.warn("The user has no permission to edit custom data format profiles configuration");
            return null;
     * Attempts to apply formatter setting and rollbacks it to the previous value if error occurs
                    + ResultSetMessages.pref_page_data_format_link_patterns + "</a>",
                2
        int selectionIndex = profilesCombo.getSelectionIndex();
    }
                        if (UIUtils.confirmAction(
        }
 * You may obtain a copy of the License at
            propertiesControl = new PropertyTreeViewer(formatGroup, SWT.BORDER);
            super.resetPropertyValueToDefault(id);
            formatterProps
                            registry.deleteCustomProfile(profile);
                    ResultSetMessages.dialog_data_format_profiles_dialog_name_chooser_title
/*
        numericNativeFormatCheck.setSelection(store.getBoolean(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT));
    private PropertySourceCustom propertySource;
            sampleText = new Text(formatGroup, SWT.BORDER | SWT.READ_ONLY);
        numericNativeFormatCheck.setSelection(store.getDefaultBoolean(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT));
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
                profileProperties.put(descriptor.getId(), new HashMap<>(defaultProps));
                2
            sampleText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private String profileName;
        }
                DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER);

    private Combo profilesCombo;
            return getDataSourceContainer().getDataFormatterProfile();
    }
import org.jkiss.dbeaver.ui.controls.LocaleSelectorControl;
        } else if (formatterProfile == null) {
        profileLocale = Locale.getDefault();
        reloadFormatter();
            localeSelector.setLocale(profileLocale);
                            ResultSetMessages.dialog_data_format_profiles_confirm_delete_message
                        )) {
        @Override
                        NLS.bind(ResultSetMessages.dialog_data_format_profiles_error_message, profileName), SWT.ICON_ERROR
                false,
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void dispose() {

    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.dataformat"; //$NON-NLS-1$
                SelectionListener.widgetSelectedAdapter(e ->
        // Locale
                dataSourceDescriptor.getDataFormatterProfile().isOverridesParent();
                ResultSetMessages.pref_page_data_format_numeric_use_native_formatting,
            profilesCombo.select(0);
            loadProfiles();
import org.jkiss.code.Nullable;
    @Override
            return parent;
        store.setToDefault(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT);
            for (DBDDataFormatterProfile profile : profiles) {
}
    protected void createPreferenceHeader(Composite composite) {

        }
        if (!locale.equals(profileLocale)) {
            }

            });
            // Load types
    @Override
                    onLocaleChange((Locale) event.data);
        refreshProfileList();
                SWT.DEFAULT,
            return DBWorkbench.getPlatform().getPreferenceStore();
            changeProfile();
            store.contains(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT) ||
        boolean isNumericSc = store.getDefaultBoolean(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT);
                } else {
    private void reloadFormatter() {
        }
            return getDataSourceContainer().getPreferenceStore();
            formatterProfile.reset(store);
    private Button numericScientificFormatCheck;
        if (selectionIndex < 0) {
        }
        return true;
    }
        }
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, true);
        profilesCombo.removeAll();
                store.contains(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT) ||
    }
                "<a href=\"" + HelpUtils.getHelpExternalReference(HELP_DATA_FORMAT_LINK) + "\">"
            if (DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
    }
        if (isDataSourcePreferencePage()) {
            return;
        protected Control createDialogArea(Composite parent) {
        super.performDefaults();
import org.jkiss.dbeaver.ui.ShellUtils;
        profilesCombo.setEnabled(profilesCombo.getItemCount() >= 2);
        formatterProfile = null;
    @Override
        }
                false,
            createButton(parent, DELETE_ID, ResultSetMessages.dialog_data_format_profiles_button_delete_profile, false);
        } else {
            );
            UIUtils.setComboSelection(profilesCombo, ((DBDDataFormatterProfile) data).getProfileName());
        String oldProfile = null;

            setCurrentProfile(newProfile);
    protected String getPropertyPageID() {

        if (isDataSourcePreferencePage()) {
                formatterProfile.setFormatterProperties(store, typeId, profileProperties.get(typeId));
            propertiesControl.getTree().setEnabled(editable);
        DataFormatProfilesEditDialog dialog = new DataFormatProfilesEditDialog(getShell());
            formatterProps.putAll(defProps);
                    );

        } catch (Exception e) {
            UIUtils.createControlLabel(formatGroup, ResultSetMessages.pref_page_data_format_label_type);
                    loadProfiles();
            numericNativeFormatCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e ->
    }
            store.setValue(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT, numericScientificFormatCheck.getSelection());
public class PrefPageDataFormat extends TargetPrefPage {
                String profileName = EnterNameDialog.chooseName(
        }
            log.warn(e);
            UIUtils.createControlLabel(formatGroup, ResultSetMessages.pref_page_data_format_label_sample);
            }
import org.jkiss.dbeaver.utils.HelpUtils;

    }


import java.util.*;
        public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {
    }
    }
        if (formatterProfile == profile) {
        protected boolean isResizable() {
                            loadProfiles();

        return formatterDescriptors.get(selectionIndex);

            } else {
            } catch (Exception e) {

    public PrefPageDataFormat() {
        return

        propertiesControl.loadProperties(propertySource);
            Composite formatGroup = UIUtils.createTitledComposite(
                false,
            } catch (Exception e) {
            numericNativeFormatCheck = UIUtils.createCheckbox(
    }


        if (formatterProfile != null) {
                ResultSetMessages.pref_page_data_format_group_settings,
    }
                typeCombo.select(0);
        if (selectionIndex > 0) {
    private Text sampleText;
        refreshProfileList();
import org.eclipse.swt.layout.GridData;
            log.warn(e);
                int selectionIndex = profileList.getSelectionIndex();
    private DBDDataFormatterProfile getDefaultProfile() {
        }

import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
                2,
            }
import org.jkiss.dbeaver.model.rm.RMConstants;
            newProfile = DataFormatterRegistry.getInstance().getCustomProfile(newProfileName);
    }
            }
        formatter.init(null, profileLocale, formatterProps);
        @Override
                profileProperties.put(dfd.getId(), formatterProps);
     * DataFormatProfilesEditDialog
                return;
        // Settings
        if (formatterDescriptor == null) {
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    private class VerifyingPropertySourceCustom extends PropertySourceCustom {
    private void reloadSample() {
    private DataFormatterDescriptor getCurrentFormatter() {
        Map<String, Object> defaultProps = formatterDescriptor.getSample().getDefaultProperties(localeSelector.getSelectedLocale());
            log.warn("Can't render sample value", e); //$NON-NLS-1$
 * you may not use this file except in compliance with the License.
        int selectionIndex = typeCombo.getSelectionIndex();
    @NotNull
        profileName = formatterProfile.getProfileName();
        public VerifyingPropertySourceCustom(DBPPropertyDescriptor[] properties, Map<String, ?> values) {
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
            }
import org.eclipse.swt.layout.GridLayout;
                );
                1
            gd.heightHint = 200;

            profileList.addSelectionListener(SelectionListener.widgetSelectedAdapter(e ->
            }


            datetimeNativeFormatCheck = UIUtils.createCheckbox(
        profilesCombo.add("<" + DataFormatterRegistry.getInstance().getGlobalProfile().getProfileName() + ">"); //$NON-NLS-1$ //$NON-NLS-2$
            GridData gd = new GridData(GridData.FILL_BOTH);
                }
            profileList.removeAll();

        DBPPreferenceStore store = getTargetPreferenceStore();
        }
            if (defaultProps != null && !defaultProps.isEmpty()) {

        @Override
                    UIUtils.showMessageBox(
            profileList.setLayoutData(gd);
            final Object previousValue = getPropertyValue(monitor, id);
    @NotNull
            Label propsLabel = UIUtils.createControlLabel(formatGroup, ResultSetMessages.pref_page_data_format_label_settingt);
        Map<String, Object> props = profileProperties.get(formatterDescriptor.getId());
        Map<String, Object> props = propertySource.getPropertyValues();
                    registry.createCustomProfile(profileName);
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL
            oldProfile = profilesCombo.getItem(selectionIndex);
            if (buttonId == NEW_ID) {
            if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {

    protected DBPPreferenceStore getTargetPreferenceStore() {
 */
    }
            return DataFormatterRegistry.getInstance().getGlobalProfile();
 * PrefPageDataFormat

    }
            profileLocale = locale;
            try {
    @NotNull
                }
            }
        } else {
        reloadSampleThrowable();
            formatterProfile.saveProfile(store);
        @Override

                2
            reloadSample();
    @Override
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL,
    @Override
            for (DataFormatterDescriptor formatter : formatterDescriptors) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (formatterDescriptor == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
                throw new IllegalArgumentException(e);
            formatterDescriptor.getProperties(),
/**
                            ResultSetMessages.dialog_data_format_profiles_confirm_delete_title,
        store.setToDefault(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT);

        refreshProfileList();
    public static class DataFormatProfilesEditDialog extends org.eclipse.jface.dialogs.Dialog {
            String newProfileName = profilesCombo.getItem(selectionIndex);
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
                    getShell(),
                settingsGroup,
        if (profilesCombo.getSelectionIndex() < 0) {
    /**
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
        }

        setCurrentProfile(getDefaultProfile());
                store.contains(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT) ||
        }


                UIUtils.createDialogButton(

 *
            return;
            return formatterProfile.getPreferenceStore();
            for (String typeId : profileProperties.keySet()) {
                if (CommonUtils.isEmpty(profileName)) {
            );
            profilesCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    }

        if (props != null && !props.isEmpty()) {
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
        int selectionIndex = profilesCombo.getSelectionIndex();
        if (newProfile != formatterProfile) {
        for (DataFormatterDescriptor descriptor : formatterDescriptors) {
    private Button datetimeNativeFormatCheck;
            typeCombo.removeAll();
        private org.eclipse.swt.widgets.List profileList;
        changeProfile();
                GridData.FILL,
import java.util.List;
import org.jkiss.utils.CommonUtils;
