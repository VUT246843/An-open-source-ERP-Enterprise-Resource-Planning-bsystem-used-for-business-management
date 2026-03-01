            PrefUtils.savePreferenceStore(store);
                store.setValue(DTConstants.PREF_REPLACE_MAPPING, replaceCombo.getSelectionIndex());
import org.jkiss.dbeaver.ui.UIUtils;
            }
    private final boolean originalSaveSettingsValue;
        originalReplaceSelection = dbpPreferenceStore.contains(DTConstants.PREF_REPLACE_MAPPING) ?
            }
                        }
        MappingNameCase nameCase = MappingNameCase.getCaseBySelectionId(nameCaseCombo.getSelectionIndex());
                DTUIMessages.mappings_rules_dialog_confirmation_message,
                            ((DBSTypedObjectExt2) source).setMaxLength(maxDataTypeLength);
                dbpPreferenceStore.setValue(DTConstants.PREF_REPLACE_MAPPING, replaceCombo.getSelectionIndex());
            return DBUtils.getQuotedIdentifier(dataSource, finalName);
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
                store.setValue(DTConstants.PREF_REPLACE_MAPPING, replaceCombo.getSelectionIndex());
                    container.setTargetName(getTransformedName(getOriginalTargetName(container), changeNameCase));
    @NotNull
            store.getInt(DTConstants.PREF_MAX_TYPE_LENGTH) : store.getDefaultInt(DTConstants.PREF_MAX_TYPE_LENGTH);
        store.setValue(DTConstants.PREF_SAVE_LOCAL_SETTINGS, saveToGlobalSettings);
        replaceCombo.select(originalReplaceSelection);
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    @Override
                        source != null ? source.getName() : mapping.getTargetName(), changeNameCase));
            }
        store = DTActivator.getDefault().getPreferences();
                updateMappingsNames();
        return targetName;

        }
            public void widgetSelected(SelectionEvent e) {

            DTUIMessages.pref_data_transfer_name_case_label,
            || replaceCombo.getSelectionIndex() != originalReplaceSelection
        this.elementList = elementList;
        if (CommonUtils.isNotEmpty(finalName)) {
                    if (changeDataTypeLength && source instanceof DBSTypedObjectExt2) {
            }


    private final List<Object> elementList;
            nameCaseCombo.add(value.getName());
                dbpPreferenceStore.setValue(DTConstants.PREF_NAME_CASE_MAPPING, nameCaseCombo.getSelectionIndex());
        UIUtils.createLink(mappingGroup, DTMessages.data_transfer_wizard_output_label_global_settings, new SelectionAdapter() {
        if (!saveToGlobalSettings) {
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            if (sourceName.contains(".")) {
                DTUIMessages.mappings_rules_dialog_confirmation_title,
    private Combo nameCaseCombo;
    private Button saveSettings;
import org.jkiss.dbeaver.model.DBIcon;

            mappingGroup,
public class MappingRulesDialog extends BaseDialog {
            store.setValue(DTConstants.PREF_SAVE_LOCAL_SETTINGS, saveSettings.getSelection());
        if (CommonUtils.isNotEmpty(finalName) && finalName.contains(" ")) {
        }
                    finalName = camelCaseName.replaceAll(" ", "");
        if (nameCase != MappingNameCase.DEFAULT) {
        UIUtils.createControlLabel(mappingGroup, DTUIMessages.pref_data_transfer_spanner_max_length);
        PrefUtils.savePreferenceStore(store);
        dbpPreferenceStore = dataSource.getContainer().getPreferenceStore();

            } else {
    private String getTransformedName(@Nullable String targetName, boolean caseChanged) {
        if (nameCaseCombo.getSelectionIndex() != originalNameCaseSelection
import org.jkiss.dbeaver.tools.transfer.database.*;
        // Save settings
                    DBSAttributeBase source = mapping.getSource();
    private final int originalMaxTypeLength;
            }
import org.jkiss.dbeaver.Log;
        if (changeNameCase) {

                Collection<DatabaseMappingAttribute> attributeMappings = container.getAttributeMappings();
            finalName = dataSource.getSQLDialect().storesUnquotedCase().transform(targetName);
 *
            DTUIMessages.pref_data_transfer_mapping_group,
 * limitations under the License.
                    }
 * See the License for the specific language governing permissions and
        // First check datasource settings, then - global
            SWT.READ_ONLY | SWT.DROP_DOWN);
        for (MappingReplaceMechanism value : MappingReplaceMechanism.values()) {
    protected void okPressed() {
            composite,
        GridData gd = new GridData();
                store.setValue(DTConstants.PREF_NAME_CASE_MAPPING, nameCaseCombo.getSelectionIndex());
        nameCaseCombo.select(originalNameCaseSelection);
        DBSDataContainer source = container.getSource();
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        boolean changeNameCase = nameCaseCombo != null && nameCaseCombo.getSelectionIndex() != originalNameCaseSelection;
        } else if (caseChanged) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            originalSaveSettingsValue);
            if (MappingReplaceMechanism.UNDERSCORES == replaceMechanism) {
        log.debug("Can't transform target attribute name: " + targetName);
import org.eclipse.swt.events.SelectionAdapter;
    // Remove extensions from the file name if source is file
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
                }
    @Override
        typeLengthSpinner = UIUtils.createSpinner(
        }
import org.eclipse.swt.widgets.*;
        replaceCombo = UIUtils.createLabelCombo(
        if (changeReplaceMechanism) {
            dbpPreferenceStore.getInt(DTConstants.PREF_NAME_CASE_MAPPING) : store.getInt(DTConstants.PREF_NAME_CASE_MAPPING);
        }
        nameCaseCombo = UIUtils.createLabelCombo(
        }
        replaceCombo.setToolTipText(DTUIMessages.pref_data_transfer_replacing_combo_tip);
        Composite mappingGroup = UIUtils.createTitledComposite(
        if (source instanceof StreamEntityMapping) {
                MappingReplaceMechanism.getCaseBySelectionId(replaceCombo.getSelectionIndex());

                }
            }
import org.jkiss.dbeaver.model.DBUtils;
        boolean changeDataTypeLength = typeLengthSpinner != null && typeLengthSpinner.getSelection() != originalMaxTypeLength;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
 * distributed under the License is distributed on an "AS IS" BASIS,
        saveSettings = UIUtils.createCheckbox(
                DatabaseMappingType mappingType = container.getMappingType();
            dbpPreferenceStore.getInt(DTConstants.PREF_REPLACE_MAPPING) : store.getInt(DTConstants.PREF_REPLACE_MAPPING);

            // Add quotes for the result name if needed
                        int maxDataTypeLength = typeLengthSpinner.getSelection();
                if (mappingType == DatabaseMappingType.create && (changeNameCase || changeReplaceMechanism)) {
                }
        Composite composite = super.createDialogArea(parent);
import org.jkiss.code.Nullable;
        for (MappingNameCase value : MappingNameCase.values()) {
        if (changeDataTypeLength) {
                DBIcon.STATUS_WARNING
                    // Skip this cases

        super.okPressed();
        }
            1,
 * You may obtain a copy of the License at
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            SWT.READ_ONLY | SWT.DROP_DOWN);
        }
                && nameCase != MappingNameCase.UPPER // No need to transform upper case names
            originalMaxTypeLength,
            // Only if user changed upper/lower case to default manually - then transform to database case
 * DBeaver - Universal Database Manager
                return sourceName.substring(0, sourceName.lastIndexOf("."));
    private void updateMappingsNames() {
            if (saveToGlobalSettings) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPIdentifierCase;
                && !(nameCase == MappingNameCase.DEFAULT && dataSource.getSQLDialect().storesUnquotedCase() == DBPIdentifierCase.UPPER)
    }
            DTUIMessages.pref_data_transfer_info_label_mapping);

        originalMaxTypeLength = dbpPreferenceStore.contains(DTConstants.PREF_MAX_TYPE_LENGTH) ?
        return composite;
    public MappingRulesDialog(@NotNull Shell parentShell, @NotNull DBPDataSource dataSource, @NotNull List<Object> elementList) {
                getShell(),
                String camelCaseName = CommonUtils.toCamelCase(finalName);
                store.setValue(DTConstants.PREF_NAME_CASE_MAPPING, nameCaseCombo.getSelectionIndex());
                for (DatabaseMappingAttribute mapping : attributeMappings) {

            Integer.MAX_VALUE);
        }
import java.util.Collection;
        String finalName = targetName;
                    mapping.setTargetName(getTransformedName(
            MappingReplaceMechanism replaceMechanism =
import org.eclipse.swt.SWT;
/*
                    continue;
    private final int originalNameCaseSelection;
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
    private final DBPPreferenceStore store;
        final Label label = UIUtils.createLabel(mappingGroup,
            // Something changed. Show notification dialog here
                return;
            DTUIMessages.mappings_rules_dialog_save_settings_checkbox,
        nameCaseCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        }
    }
                // User want just to save local settings as global

            } else {
            store.getBoolean(DTConstants.PREF_SAVE_LOCAL_SETTINGS) : true;
import java.util.List;
        }
        ) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        } else if (source != null) {
        originalNameCaseSelection = dbpPreferenceStore.contains(DTConstants.PREF_NAME_CASE_MAPPING) ?
 */
import org.jkiss.dbeaver.tools.transfer.ui.prefs.PrefPageDataTransfer;
    // Return object name if source is a table
import org.jkiss.dbeaver.utils.PrefUtils;
            )) {
    }
            if (UIUtils.confirmAction(
    @Nullable
            replaceCombo.add(value.getName());
            if (saveSettings.getSelection()) {
            } else if (MappingReplaceMechanism.CAMELCASE == replaceMechanism
            mappingGroup,
        saveSettings.setToolTipText(DTUIMessages.mappings_rules_dialog_save_settings_checkbox_tip);
            return targetName;
import org.eclipse.swt.events.SelectionEvent;


            }
import org.eclipse.swt.layout.GridData;

                dbpPreferenceStore.setValue(DTConstants.PREF_MAX_TYPE_LENGTH, typeLengthSpinner.getSelection());

    private String getOriginalTargetName(@NotNull DatabaseMappingContainer container) {
        gd2.horizontalSpan = 2;
    private Spinner typeLengthSpinner;
        }
            } else {
            GridData.FILL_HORIZONTAL);
            2,

        boolean saveToGlobalSettings = saveSettings.getSelection();
        super(parentShell, DTUIMessages.mappings_rules_dialog_title, null);

    protected Composite createDialogArea(@NotNull Composite parent) {
        label.setLayoutData(gd);

 *     http://www.apache.org/licenses/LICENSE-2.0
            finalName = nameCase.getIdentifierCase().transform(targetName);
        saveSettings.setLayoutData(gd2);
                store.setValue(DTConstants.PREF_MAX_TYPE_LENGTH, typeLengthSpinner.getSelection());
 *
            DTUIMessages.pref_data_transfer_replacing_combo_label,
                    }
                store.setValue(DTConstants.PREF_MAX_TYPE_LENGTH, typeLengthSpinner.getSelection());
                if (CommonUtils.isNotEmpty(camelCaseName)) {
        boolean changeReplaceMechanism = replaceCombo != null && replaceCombo.getSelectionIndex() != originalReplaceSelection;
        }
        for (Object element : elementList) {
            dbpPreferenceStore.getInt(DTConstants.PREF_MAX_TYPE_LENGTH) : store.contains(DTConstants.PREF_MAX_TYPE_LENGTH) ?
            mappingGroup,
                }
import org.jkiss.code.NotNull;
            return source.getName();
            String sourceName = source.getName();
    }
            PrefUtils.savePreferenceStore(dbpPreferenceStore);
        if (CommonUtils.isEmpty(targetName)) {
                        continue;
    private final DBPPreferenceStore dbpPreferenceStore;
import org.jkiss.utils.CommonUtils;
                    if (mapping.getMappingType() != DatabaseMappingType.create) {
 * you may not use this file except in compliance with the License.
    }
            ) {
        this.dataSource = dataSource;
    private static final Log log = Log.getLog(MappingRulesDialog.class);
import org.jkiss.dbeaver.tools.transfer.DTConstants;
            if (saveToGlobalSettings) {
            @Override
            }

            } else {
                        if (source.getMaxLength() > maxDataTypeLength) {
import org.jkiss.dbeaver.model.struct.DBSTypedObjectExt2;
}
    private final int originalReplaceSelection;
            mappingGroup,
        replaceCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            if (element instanceof DatabaseMappingContainer container) {
        }
        gd.horizontalSpan = 2;
        return container.getTargetName();
                if (mappingType == DatabaseMappingType.skip || mappingType == DatabaseMappingType.unspecified) {
        originalSaveSettingsValue = store.contains(DTConstants.PREF_SAVE_LOCAL_SETTINGS) ?
            || typeLengthSpinner.getSelection() != originalMaxTypeLength
            DTUIMessages.pref_data_transfer_spanner_max_length_tip,
 *
            if (saveToGlobalSettings) {
import org.jkiss.dbeaver.model.DBPDataSource;
        GridData gd2 = new GridData();
        });
                finalName = finalName.replaceAll(" ", "_");
        } else if (originalSaveSettingsValue != saveSettings.getSelection()) {
    private Combo replaceCombo;
import org.jkiss.dbeaver.tools.transfer.stream.StreamEntityMapping;
                UIUtils.showPreferencesFor(getShell(), null, PrefPageDataTransfer.PAGE_ID);
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final DBPDataSource dataSource;
