import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
                cfgGroup,

                2);

 * DBeaver - Universal Database Manager
        replaceLegacyTimezone.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE));
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
        }
/**
import org.eclipse.swt.widgets.Composite;
                    setCheckboxesState();
public class PrefPagePostgreSQL extends AbstractPrefPage implements IWorkbenchPreferencePage
                cfgGroup,
                PostgreMessages.dialog_setting_connection_read_keys_with_columns_tip,
            ddTagBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_code_block);
                    2
                    PostgreMessages.dialog_setting_connection_show_not_available_for_conn_tip,
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

        ddPlainBehaviorCombo.select(store.getDefaultInt(PostgreConstants.PROP_DD_PLAIN_STRING));

 * See the License for the specific language governing permissions and
                    globalPrefs.getBoolean(PostgreConstants.PROP_READ_ALL_DATA_TYPES),

 *     http://www.apache.org/licenses/LICENSE-2.0
        return super.performOk();

                2
                globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB),
    private Button showDatabaseStatistics;
            );
                public void widgetSelected(SelectionEvent e) {
                }

    public PrefPagePostgreSQL()
                globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_TEMPLATES_DB),
                PostgreMessages.dialog_setting_connection_show_templates,
            );
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
    private Button readKeysWithColumns;
 * limitations under the License.
 *
    }
            showNonDefault = UIUtils.createCheckbox(secureGroup,
            );

        preferenceStore.setValue(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB, String.valueOf(showUnavailable.getSelection()));
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
                globalPrefs.getBoolean(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS),
    @Override
                PostgreMessages.dialog_setting_connection_replace_legacy_timezone_tip,
                    PostgreMessages.dialog_setting_connection_read_all_data_types,
import org.eclipse.swt.SWT;
 *
                    secureGroup,

            ddTagBehaviorCombo = UIUtils.createLabelCombo(secureGroup, PostgreMessages.dialog_setting_sql_dd_tag_label, PostgreMessages.dialog_setting_sql_dd_tag_tip, SWT.DROP_DOWN | SWT.READ_ONLY);
            ddPlainBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_code_block);
                2);
            Composite secureGroup = UIUtils.createTitledComposite(
        showTemplates.setEnabled(enable);

                PostgreMessages.dialog_setting_connection_replace_legacy_timezone,
                    2);

        preferenceStore.setValue(PostgreConstants.PROP_READ_ALL_DATA_TYPES, String.valueOf(readAllDataTypes.getSelection()));
                    globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB),
    private Button readAllDataTypes;
                PostgreMessages.dialog_setting_connection_database_statistics,
 *
                PostgreMessages.dialog_setting_connection_settings,
    private void setCheckboxesState() {
import org.eclipse.swt.events.SelectionEvent;
    @Override
    @Override
        preferenceStore.setValue(PostgreConstants.PROP_DD_TAG_STRING, ddTagBehaviorCombo.getSelectionIndex() == 0);
        showDatabaseStatistics.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_SHOW_DATABASE_STATISTICS));
import org.eclipse.swt.events.SelectionAdapter;
                2,
            readAllDataTypes = UIUtils.createCheckbox(secureGroup,
        preferenceStore.setValue(PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE, String.valueOf(replaceLegacyTimezone.getSelection()));
            ddPlainBehaviorCombo.select(globalPrefs.getBoolean(PostgreConstants.PROP_DD_PLAIN_STRING) ? 0 : 1);
import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            showDatabaseStatistics = UIUtils.createCheckbox(
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.postgresql.general"; //$NON-NLS-1$
                globalPrefs.getBoolean(PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE),
                secureGroup,
                    PostgreMessages.dialog_setting_connection_show_not_available_for_conn,
        }
import org.eclipse.swt.widgets.Combo;
    protected Control createPreferenceContent(@NotNull Composite parent) {
            setCheckboxesState();
                PostgreMessages.dialog_setting_connection_nondefaultDatabase_tip,
    }
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
    {
                GridData.HORIZONTAL_ALIGN_BEGINNING
        preferenceStore.setValue(PostgreConstants.PROP_SHOW_TEMPLATES_DB, String.valueOf(showTemplates.getSelection()));
import org.eclipse.ui.IWorkbench;
            showUnavailable.setSelection(false);
        preferenceStore.setValue(PostgreConstants.PROP_SHOW_DATABASE_STATISTICS, String.valueOf(showDatabaseStatistics.getSelection()));
        {
        showTemplates.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_SHOW_TEMPLATES_DB));
            showTemplates = UIUtils.createCheckbox(secureGroup,
                PostgreMessages.dialog_setting_connection_database_statistics_tip,
                PostgreMessages.dialog_setting_connection_nondefaultDatabase,
            ddTagBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_string);
            showUnavailable = UIUtils.createCheckbox(
        return cfgGroup;
                2,
        super();
    private Button showTemplates;
                PostgreMessages.dialog_setting_connection_read_keys_with_columns,
 * Unless required by applicable law or agreed to in writing, software
            Composite secureGroup = UIUtils.createTitledComposite(
                PostgreMessages.dialog_setting_group_sql,
    }
        readKeysWithColumns.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS));
        cfgGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (!enable) {
                    PostgreMessages.dialog_setting_connection_read_all_data_types_tip,
                2);
            ddPlainBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_string);
import org.eclipse.swt.widgets.Control;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        {
            );
    public void init(IWorkbench workbench) {

    private Combo ddPlainBehaviorCombo;


        preferenceStore.setValue(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB, String.valueOf(showNonDefault.getSelection()));
                globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_DATABASE_STATISTICS),
        super.performDefaults();
            showNonDefault.addSelectionListener(new SelectionAdapter() {
 */
        showUnavailable.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB));

    protected void performDefaults() {
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
 * You may obtain a copy of the License at
    }
            });

 * PrefPagePostgreSQL
 */
            readKeysWithColumns = UIUtils.createCheckbox(secureGroup,
            showTemplates.setSelection(false);
    private Button replaceLegacyTimezone;

                @Override

                2);
/*
import org.eclipse.ui.IWorkbenchPreferencePage;
    }
package org.jkiss.dbeaver.ext.postgresql.ui;
    private Button showNonDefault;
        showNonDefault.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB));
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public boolean performOk() {
        setCheckboxesState();
                GridData.HORIZONTAL_ALIGN_BEGINNING
{
        boolean enable = showNonDefault.getSelection();

        ddTagBehaviorCombo.select(store.getDefaultInt(PostgreConstants.PROP_DD_TAG_STRING));
                PostgreMessages.dialog_setting_connection_show_templates_tip,
            ddTagBehaviorCombo.select(globalPrefs.getBoolean(PostgreConstants.PROP_DD_TAG_STRING) ? 0 : 1);
        preferenceStore.setValue(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS, String.valueOf(readKeysWithColumns.getSelection()));
        Composite cfgGroup = UIUtils.createComposite(parent, 1);
import org.eclipse.swt.layout.GridData;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        preferenceStore.setValue(PostgreConstants.PROP_DD_PLAIN_STRING, ddPlainBehaviorCombo.getSelectionIndex() == 0);
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private Button showUnavailable;
    private Combo ddTagBehaviorCombo;
    @NotNull
        readAllDataTypes.setSelection(store.getDefaultBoolean(PostgreConstants.PROP_READ_ALL_DATA_TYPES));
    @Override

        DBPPreferenceStore globalPrefs = DBWorkbench.getPlatform().getPreferenceStore();
            ddPlainBehaviorCombo = UIUtils.createLabelCombo(secureGroup, PostgreMessages.dialog_setting_sql_dd_plain_label, PostgreMessages.dialog_setting_sql_dd_plain_tip, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
    }
            replaceLegacyTimezone = UIUtils.createCheckbox(secureGroup,
        showUnavailable.setEnabled(enable);
