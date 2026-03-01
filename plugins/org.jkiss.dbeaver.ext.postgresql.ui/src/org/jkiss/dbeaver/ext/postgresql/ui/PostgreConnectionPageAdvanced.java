    public void saveSettings(DBPDataSourceContainer dataSource) {
    public void createControl(Composite parent) {
}
                secureGroup,

        setTitle("Advanced");
import org.jkiss.dbeaver.registry.DBConnectionConstants;
 *
        {

                secureGroup,
        ddPlainBehaviorCombo.select(CommonUtils.getBoolean(
            );

            CommonUtils.getBoolean(
                PostgreMessages.dialog_setting_group_performance,
        GridData gd = new GridData(GridData.FILL_BOTH);
            showUnavailable = UIUtils.createCheckbox(

            );
                secureGroup,
                false,
        boolean sessionRoleSupported = mainPage != null && mainPage.isSessionRoleSupported();
        readKeysWithColumns.setSelection(
 * Copyright (C) 2010-2026 DBeaver Corp and others
        // Load values from new connection info
                PostgreMessages.dialog_setting_connection_replace_legacy_timezone_tip,
                PostgreMessages.dialog_setting_sql_dd_tag_label,
                secureGroup,
            }
                roleText = UIUtils.createLabelText(advancedGroup, PostgreMessages.dialog_setting_session_role, null, SWT.BORDER);
    @Override
                PostgreMessages.dialog_setting_connection_settings,
                globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB)
                secureGroup,
                PostgreMessages.dialog_setting_connection_show_not_available_for_conn_tip,
                connectionInfo.getProviderProperty(PostgreConstants.PROP_SHOW_TEMPLATES_DB),
import org.jkiss.utils.CommonUtils;
                connectionInfo.getProviderProperty(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS),
                PostgreMessages.dialog_setting_sql_dd_plain_label,

        if (usePreparedStatements != null) {
            readKeysWithColumns = UIUtils.createCheckbox(

            );
            Composite advancedGroup = UIUtils.createTitledComposite(
        showUnavailable.setSelection(
            usePreparedStatements = UIUtils.createCheckbox(
            ddTagBehaviorCombo = UIUtils.createLabelCombo(
                PostgreMessages.dialog_setting_connection_read_keys_with_columns_tip,
        cfgGroup.setLayoutData(gd);
 * DBeaver - Universal Database Manager
                PostgreMessages.dialog_setting_connection_use_prepared_statements,
import org.eclipse.swt.widgets.Composite;
            );
 * Unless required by applicable law or agreed to in writing, software
        );
            ));
    public void loadSettings() {
                PostgreMessages.dialog_setting_connection_show_not_available_for_conn,

 */
                globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_DATABASE_STATISTICS)
import org.jkiss.dbeaver.runtime.DBWorkbench;
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
import org.jkiss.dbeaver.model.connection.DBPDriver;
/*
                2
        connectionCfg.setProviderProperty(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS, String.valueOf(readKeysWithColumns.getSelection()));
        }
                connectionInfo.getProviderProperty(PostgreConstants.PROP_READ_ALL_DATA_TYPES),
 */

        connectionCfg.setProviderProperty(
            globalPrefs.getBoolean(PostgreConstants.PROP_DD_PLAIN_STRING)
                roleText.setToolTipText(PostgreMessages.dialog_setting_session_role_tip);
                PostgreMessages.dialog_setting_sql_dd_tag_tip,
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
            );
                PostgreMessages.dialog_setting_connection_replace_legacy_timezone,
        GridLayout gl = new GridLayout(1, false);
        if (homesSelector != null) {
                homesSelector.getPanel().setLayoutData(gd);
        connectionCfg.setProviderProperty(PostgreConstants.PROP_READ_ALL_DATA_TYPES, String.valueOf(readAllDataTypes.getSelection()));
        this.mainPage = mainPage;
                2,

/**
        DBPConnectionConfiguration connectionCfg = dataSource.getConnectionConfiguration();
                homesSelector = new ClientHomesSelector(advancedGroup, PostgreMessages.dialog_setting_connection_localClient, false);
            String.valueOf(replaceLegacyTimezone.getSelection())
    }
            ));
                gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            ddTagBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_code_block);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                false,
            CommonUtils.getBoolean(
        }
            usePreparedStatements.setSelection(
        return true;
        {
        connectionCfg.setProviderProperty(
                PostgreMessages.dialog_setting_group_sql,
    private Combo ddTagBehaviorCombo;

            Composite performanceGroup = UIUtils.createTitledComposite(
                GridData.HORIZONTAL_ALIGN_BEGINNING
            connectionInfo.getProviderProperty(PostgreConstants.PROP_DD_PLAIN_STRING),
                false,
                SWT.DROP_DOWN | SWT.READ_ONLY
    @Override

    @Override
                cfgGroup,

        }
                false,
                PostgreConstants.PROP_USE_PREPARED_STATEMENTS,
            homesSelector.populateHomes(getSite().getDriver(), connectionInfo.getClientHomeId(), site.isNew());

    private ClientHomesSelector homesSelector;
            CommonUtils.getBoolean(
            CommonUtils.getBoolean(
            );
    public void dispose() {

            );

        if (homesSelector != null) {
            Composite secureGroup = UIUtils.createTitledComposite(
                secureGroup,
        setDescription("PostgreSQL - " + PostgreMessages.dialog_setting_connection_settings);
import org.eclipse.swt.widgets.Combo;
                PostgreMessages.dialog_setting_connection_read_all_data_types_tip,
            );
import org.eclipse.swt.layout.GridData;
            ddTagBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_string);
            roleText.setText(CommonUtils.notEmpty(connectionInfo.getProviderProperty(PostgreConstants.PROP_CHOSEN_ROLE)));
                globalPrefs.getBoolean(PostgreConstants.PROP_SHOW_TEMPLATES_DB)
            }
                globalPrefs.getBoolean(PostgreConstants.PROP_READ_ALL_DATA_TYPES)
package org.jkiss.dbeaver.ext.postgresql.ui;
                PostgreMessages.dialog_setting_connection_database_statistics,
                PostgreMessages.dialog_setting_connection_show_templates_tip,
    private Button usePreparedStatements;
        setControl(cfgGroup);
                cfgGroup,
        );
    private Button showUnavailable;
            ));

    }
                PostgreMessages.dialog_setting_connection_use_prepared_statements_tip,
                2
        ddTagBehaviorCombo.select(CommonUtils.getBoolean(
            ddPlainBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_string);
public class PostgreConnectionPageAdvanced extends ConnectionPageAbstract {
                PostgreMessages.dialog_setting_connection_read_all_data_types,
                SWT.DROP_DOWN | SWT.READ_ONLY
                globalPrefs.getBoolean(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS)
            if (sessionRoleSupported) {
                2
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private Button readAllDataTypes;
            ddPlainBehaviorCombo.add(PostgreMessages.dialog_setting_sql_dd_code_block);
 * limitations under the License.
            connectionInfo.getProviderProperty(PostgreConstants.PROP_DD_TAG_STRING),
 * PostgreConnectionPageAdvanced
            );
    private Button readKeysWithColumns;
                false,
                CommonUtils.getBoolean(connectionInfo.getProviderProperty(PostgreConstants.PROP_USE_PREPARED_STATEMENTS), false));
                roleText.setLayoutData(gd);
            readAllDataTypes = UIUtils.createCheckbox(
            connectionCfg.setProviderProperty(
        Composite cfgGroup = new Composite(parent, SWT.NONE);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * You may obtain a copy of the License at
                GridData.HORIZONTAL_ALIGN_BEGINNING);
            PostgreConstants.PROP_SHOW_DATABASE_STATISTICS,
                PostgreMessages.dialog_setting_connection_advanced_group_label,
                PostgreMessages.dialog_setting_connection_database_statistics_tip,
            PostgreConstants.PROP_DD_PLAIN_STRING,
        replaceLegacyTimezone.setSelection(

        if (serverType.turnOffPreparedStatements()) {
        }
            );
            ));
            String.valueOf(ddPlainBehaviorCombo.getSelectionIndex() == 0)
        }
                secureGroup,
                2
 * you may not use this file except in compliance with the License.

                gd = new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING);
import org.eclipse.swt.widgets.Button;
                GridData.FILL_HORIZONTAL
        ) ? 0 : 1);
    public PostgreConnectionPageAdvanced(@Nullable PostgreConnectionPage mainPage) {
            globalPrefs.getBoolean(PostgreConstants.PROP_DD_TAG_STRING)
import org.jkiss.dbeaver.ui.dialogs.connection.ClientHomesSelector;

            );
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
                PostgreMessages.dialog_setting_connection_show_templates,
        loadSettings();
            CommonUtils.getBoolean(
    @Override

            if (DBWorkbench.hasFeature(DBConnectionConstants.PRODUCT_FEATURE_ADVANCED_DATABASE_ADMINISTRATION) && serverType.supportsClient()) {
                PostgreMessages.dialog_setting_connection_read_keys_with_columns,
        PostgreServerType serverType = PostgreUtils.getServerType(driver);

                PostgreMessages.dialog_setting_sql_dd_plain_tip,
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Text roleText; //TODO: make it a combo and fill it with appropriate roles
 *
        }
 * See the License for the specific language governing permissions and
                cfgGroup,
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        final DBPDriver driver = site.getDriver();
                false,
        saveConnectionURL(connectionCfg);
        connectionCfg.setProviderProperty(PostgreConstants.PROP_SHOW_TEMPLATES_DB, String.valueOf(showTemplates.getSelection()));
                GridData.HORIZONTAL_ALIGN_BEGINNING
import org.jkiss.code.Nullable;
    }
        }
                2
            ));
    private Button replaceLegacyTimezone;
                connectionInfo.getProviderProperty(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB),
                1,
            ));
                2,
 * distributed under the License is distributed on an "AS IS" BASIS,
        connectionCfg.setProviderProperty(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB, String.valueOf(showUnavailable.getSelection()));
    private final PostgreConnectionPage mainPage;
import org.eclipse.swt.widgets.Text;
            Composite secureGroup = UIUtils.createTitledComposite(
        DBPPreferenceStore globalPrefs = DBWorkbench.getPlatform().getPreferenceStore();
        if (sessionRoleSupported || serverType.supportsClient()) {
                false,

            showDatabaseStatistics = UIUtils.createCheckbox(
                2
        connectionCfg.setProviderProperty(

    @Override
            );
        cfgGroup.setLayout(gl);
        showTemplates.setSelection(
import org.eclipse.swt.SWT;
    private Button showTemplates;
                connectionInfo.getProviderProperty(PostgreConstants.PROP_SHOW_DATABASE_STATISTICS),
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private Combo ddPlainBehaviorCombo;
                connectionInfo.getProviderProperty(PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE),
    }
            connectionCfg.setClientHomeId(homesSelector.getSelectedHome());

import org.jkiss.dbeaver.ui.UIUtils;

        ) ? 0 : 1);
            replaceLegacyTimezone = UIUtils.createCheckbox(
        if (usePreparedStatements != null) {
    public boolean isComplete() {
            CommonUtils.getBoolean(
        }
            connectionCfg.setProviderProperty(PostgreConstants.PROP_CHOSEN_ROLE, roleText.getText().trim());
        );
        super.dispose();
import org.eclipse.swt.layout.GridLayout;
        if (roleText != null) {
        }
            );
                2,
            String.valueOf(showDatabaseStatistics.getSelection())
                globalPrefs.getBoolean(PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE)
                gd.widthHint = UIUtils.getFontHeight(roleText) * 15;

        showDatabaseStatistics.setSelection(
                2
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
                performanceGroup,
                cfgGroup,
            PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE,
        if (roleText != null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;


        connectionCfg.setProviderProperty(PostgreConstants.PROP_DD_TAG_STRING, String.valueOf(ddTagBehaviorCombo.getSelectionIndex() == 0));
        }
            ddPlainBehaviorCombo = UIUtils.createLabelCombo(
        readAllDataTypes.setSelection(
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
                secureGroup,
            showTemplates = UIUtils.createCheckbox(
    private Button showDatabaseStatistics;
                String.valueOf(usePreparedStatements.getSelection())

