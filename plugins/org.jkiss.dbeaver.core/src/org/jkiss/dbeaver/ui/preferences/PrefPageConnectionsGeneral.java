                    ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(HELP_CONNECTIONS_LINK));
import org.jkiss.dbeaver.ui.dialogs.connection.NavigatorSettingsStorage;
                    defaultConnectionType = connectionTypeCombo.getSelectedItem();
        connectionNamePattern = DBWorkbench.getPlatform().getPreferenceStore().getString(ModelPreferences.DEFAULT_CONNECTION_NAME_PATTERN);
                true,
                    ConnectionNameResolver.getConnectionVariablesInfo(),

        if (!defaultNavigatorSettings.equals(DataSourceNavigatorSettings.getDefaultSettings())) {
                CoreMessages.pref_page_connection_label_close_connection_on_sleep,
    @Override
                useWinTrustStoreCheck = UIUtils.createCheckbox(
        DBPDriver driver = DriverUtils.getRecentDrivers(DriverUtils.getAllDrivers(), 1).getFirst();
import org.eclipse.swt.SWT;
    private ConnectionNameResolver fakeConnectionNameResolver;
    private static final String VALUE_TRUST_STORE_TYPE_WINDOWS = "WINDOWS-ROOT"; //$NON-NLS-1$
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.ui.controls.CSmartCombo;
    }
                composite,
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
                new StringContentProposalProvider(Arrays.stream(ConnectionNameResolver.getConnectionVariables()).map(GeneralUtils::variablePattern).toArray(String[]::new))
            addLinkToSettings(groupObjects, PrefPageDrivers.PAGE_ID);
            UIUtils.setContentProposalToolTip(connectionDefaultNamePatternText, "Connection name patterns",
        sampleConnectionName.setText(GeneralUtils.replaceVariables(connectionDefaultNamePatternText.getText(), fakeConnectionNameResolver));
                    CoreMessages.pref_page_connection_label_default_connection_template_variables,
            addLinkToSettings(groupObjects, PrefPageMetaData.PAGE_ID);
public class PrefPageConnectionsGeneral extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage, NavigatorSettingsStorage {
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
                GridData.VERTICAL_ALIGN_BEGINNING);
import org.jkiss.utils.CommonUtils;
import org.eclipse.ui.IWorkbenchPreferencePage;
                useWinTrustStoreCheck.setEnabled(false);
        defaultNavigatorSettings = DataSourceNavigatorSettings.getDefaultSettings();
            connectionDefaultNamePatternText.addModifyListener(e -> sampleConnectionName.setText(GeneralUtils.replaceVariables(connectionDefaultNamePatternText.getText(), fakeConnectionNameResolver)));
            Composite groupObjects = UIUtils.createComposite(
            createWinstoreSettings(composite);
import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
    @Override
    protected Control createPreferenceContent(@NotNull Composite parent) {
            );
                @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
                public void widgetSelected(SelectionEvent e) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.defaultNavigatorSettings = settings;
    public boolean performOk() {
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageGeneral;
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
import org.jkiss.dbeaver.registry.driver.DriverUtils;

import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        return new ConnectionNameResolver(fakeDataSource, conConfig, null);
                preferences.getDefaultBoolean(ModelPreferences.PROP_USE_WIN_TRUST_STORE_TYPE));
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
                connectionDefaultNamePatternText,
    private DBNBrowseSettings defaultNavigatorSettings;
        }
                CoreMessages.pref_page_connection_label_default_settings,
            "<a>" + CoreMessages.pref_page_connections_wiki_link + "</a>",
        dataSourceRegistry.dispose();

import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
                    false
            UIUtils.createPreferenceLink(
 * Licensed under the Apache License, Version 2.0 (the "License");
                    settings,

                winTrustStoreComposite.setToolTipText(CoreMessages.pref_page_connections_use_win_cert_disabled_tip);
            if (connectionTypeCombo.getItem(i).getId().equals(defaultConnectionType.getId())) {
    public PrefPageConnectionsGeneral() {

        conConfig.setDatabaseName("database1");
            sampleConnectionName.setText(GeneralUtils.replaceVariables(connectionDefaultNamePatternText.getText(), fakeConnectionNameResolver));
        updateCombosAndSettings();

    @Override
/*
                Composite winTrustStoreComposite = UIUtils.createComposite(settings, 1);
import org.jkiss.dbeaver.registry.DataSourceRegistry;
        Composite composite = UIUtils.createComposite(parent, 1);
 *
            );
    private CSmartCombo<DBPConnectionType> connectionTypeCombo;
import org.jkiss.dbeaver.ui.UIUtils;
    }
                composite,
            // Link to secure storage config
        }
                    CoreMessages.pref_page_connection_label_default_connection_template_variables_tip,
            descLabel.setText(CoreMessages.pref_page_eclipse_ui_general_connections_group_label);
 *
            );
 * distributed under the License is distributed on an "AS IS" BASIS,
            Composite groupComposite = UIUtils.createComposite(groupDefaults, 2);
                1,
            if (CommonUtils.isNotEmpty(System.getProperty(GeneralUtils.PROP_TRUST_STORE))
                );
        }
                ConnectionNameResolver.getConnectionVariables());
        urlHelpLabel.setLayoutData(gridData);
            sampleConnectionName = UIUtils.createLabelText(groupComposite, CoreMessages.pref_page_connection_label_default_connection_name_pattern_sample, CoreMessages.pref_page_connection_label_default_connection_name_pattern_sample_tip);
    }
            }
                @Override
    private DBPConnectionType defaultConnectionType;
    private Text connectionDefaultNamePatternText;
        connectionNamePattern = preferences.getDefaultString(ModelPreferences.DEFAULT_CONNECTION_NAME_PATTERN);
                    DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.PROP_USE_WIN_TRUST_STORE_TYPE)
        defaultNavigatorSettings = DataSourceNavigatorSettings.PRESET_FULL.getSettings();
import org.jkiss.dbeaver.ModelPreferences;
            closeConnectionOnOsSleepCheck = UIUtils.createCheckbox(
            sampleConnectionName.setEditable(false);
                    CoreMessages.pref_page_connections_use_win_cert_label,
        conConfig.setUrl("sample//url");
    public void setElement(IAdaptable iAdaptable) {
            fakeConnectionNameResolver = generateSampleDatasourceResolver();

    @Override

            Composite settings = UIUtils.createTitledComposite(
                    DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.PROP_USE_WIN_TRUST_STORE_TYPE)
            connectionDefaultNamePatternText.setText(connectionNamePattern);
import org.jkiss.dbeaver.core.CoreMessages;

        super.performDefaults();
        if (RuntimeUtils.isWindows()) {
            new VariablesHintLabel(
    private void updateCombosAndSettings() {
                CoreMessages.pref_page_connections_group_security,
        if (RuntimeUtils.isWindows() && useWinTrustStoreCheck != null) {
        }
        return null;
            store.setValue(ModelPreferences.PROP_USE_WIN_TRUST_STORE_TYPE, useWinTrustStoreCheck.getSelection());
import org.jkiss.code.NotNull;
        return defaultNavigatorSettings;
    public void init(IWorkbench iWorkbench) {
        }
    private void addLinkToSettings(Composite composite, String pageID) {
            DataSourceNavigatorSettings.setDefaultSettings(defaultNavigatorSettings);
 */
    private static final String HELP_CONNECTIONS_LINK = "Create-Connection";
                1,
    @Override
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
                    groupDefaults,

        }
        conConfig.setHostName("hostname");
        connectionDefaultNamePatternText.setText(preferences.getDefaultString(ModelPreferences.DEFAULT_CONNECTION_NAME_PATTERN));
            ) {
        updateCombosAndSettings();
        if (defaultConnectionType != DBPConnectionType.getDefaultConnectionType()) {
        if (DBWorkbench.getPlatform().getApplication().hasProductFeature(DBConnectionConstants.PRODUCT_FEATURE_SIMPLE_TRUSTSTORE)) {

    }
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettings;
        if (getContainer() instanceof IWorkbenchPreferenceContainer wpc) {

 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IAdaptable;
    private void createWinstoreSettings(Composite composite) {
    }
        }
            driver,
                1);
            addLinkToSettings(groupObjects, PrefPageTransactions.PAGE_ID);
                }
                composite,
            useWinTrustStoreCheck.setSelection(
                    winTrustStoreComposite,
    
    }
 * See the License for the specific language governing permissions and
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.connections";
                connectionTypeCombo.select(i);
        }
                useWinTrustStoreCheck.setToolTipText(CoreMessages.pref_page_connections_use_win_cert_tip);
    private static final String VALUE_TRUST_STORE_TYPE_WINDOWS_MY = "WINDOWS-MY"; //$NON-NLS-1$
import org.eclipse.ui.IWorkbench;
 * DBeaver - Universal Database Manager
        {


        {
                2,
            ContentAssistUtils.installContentProposal(
                null
    }
                groupBehavior,
            Composite groupBehavior = UIUtils.createTitledComposite(
                CoreMessages.pref_page_connection_label_general,
        store.setValue(ModelPreferences.CONNECTION_CLOSE_ON_SLEEP, closeConnectionOnOsSleepCheck.getSelection());
        return super.performOk();
    public IAdaptable getElement() {
            } else {
    private Combo navigatorSettingsCombo;
        GridData gridData = new GridData(GridData.FILL, SWT.END, true, true);
            new SelectionAdapter() {
        super();
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                300);


            DBPConnectionType.setDefaultConnectionType(defaultConnectionType);
    private Button useWinTrustStoreCheck;
                pageID,
    }

    protected void performDefaults() {
                break;
    @Override
 * limitations under the License.
import org.eclipse.ui.IWorkbenchPropertyPage;
        }
            navigatorSettingsCombo = ConnectionPageGeneral.createNavigatorSettingsCombo(groupComposite, this, null);

            conConfig
        conConfig.setHostPort("42");
            connectionTypeCombo = ConnectionPageGeneral.createConnectionTypeCombo(groupComposite);
            Composite groupDefaults = UIUtils.createTitledComposite(
                GridData.FILL_HORIZONTAL,
    public void setNavigatorSettings(DBNBrowseSettings settings) {
        Link urlHelpLabel = UIUtils.createLink(
        for (int i = 0; i < connectionTypeCombo.getItemCount(); i++) {
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
        closeConnectionOnOsSleepCheck.setSelection(preferences.getDefaultBoolean(ModelPreferences.CONNECTION_CLOSE_ON_SLEEP));
        }
    }
        ConnectionPageGeneral.updateNavigatorSettingsPreset(navigatorSettingsCombo, defaultNavigatorSettings);

import org.eclipse.swt.events.SelectionAdapter;
                CoreMessages.pref_page_connection_label_close_connection_on_sleep_tip,
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        final DataSourceRegistry dataSourceRegistry = new DataSourceRegistry(DBWorkbench.getPlatform().getWorkspace().getActiveProject());
            composite,
            }
        return composite;
        DBPConnectionConfiguration conConfig = new DBPConnectionConfiguration();
            Label descLabel = new Label(groupObjects, SWT.WRAP);
                public void widgetSelected(SelectionEvent e) {
        if (RuntimeUtils.isWindows() && useWinTrustStoreCheck != null) {
import java.util.Arrays;
                "<a>''{0}''</a> " + CoreMessages.pref_page_ui_general_label_settings,

            });

            DataSourceDescriptor.generateNewId(driver),

                composite,
        conConfig.setServerName("server1");
        );
import org.jkiss.dbeaver.model.connection.DBPDriver;
            addLinkToSettings(groupObjects, PrefPageErrorHandle.PAGE_ID);
        {
            });
    }
                || (CommonUtils.isNotEmpty(System.getProperty(GeneralUtils.PROP_TRUST_STORE_TYPE))
                useWinTrustStoreCheck = UIUtils.createCheckbox(
    }

    private Text sampleConnectionName;
        conConfig.setUserPassword("password1");
        }
                GridData.VERTICAL_ALIGN_BEGINNING
                    CoreMessages.pref_page_connections_use_win_cert_label,
import org.jkiss.dbeaver.ui.ShellUtils;
        DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
            connectionTypeCombo.addSelectionListener(new SelectionAdapter() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    @Override



import org.eclipse.swt.layout.GridData;
    public DBNBrowseSettings getNavigatorSettings() {
    }

                1);
                new SmartTextContentAdapter(),
                );
                && !System.getProperty(GeneralUtils.PROP_TRUST_STORE_TYPE).equalsIgnoreCase(VALUE_TRUST_STORE_TYPE_WINDOWS))

import org.jkiss.dbeaver.registry.DBConnectionConstants;
    private String connectionNamePattern;
package org.jkiss.dbeaver.ui.preferences;
        defaultConnectionType = DBPConnectionType.getDefaultConnectionType();

                wpc,
import org.jkiss.dbeaver.utils.HelpUtils;
 * You may obtain a copy of the License at

            UIUtils.createLabelSeparator(composite, SWT.HORIZONTAL);
                composite,
                }
            );
    private ConnectionNameResolver generateSampleDatasourceResolver() {

        DataSourceDescriptor fakeDataSource = (DataSourceDescriptor) dataSourceRegistry.createDataSource(
            connectionDefaultNamePatternText = UIUtils.createLabelText(groupComposite, CoreMessages.pref_page_connection_label_default_connection_name_pattern, CoreMessages.pref_page_connection_label_default_connection_name_pattern_tip);
        store.setValue(ModelPreferences.DEFAULT_CONNECTION_NAME_PATTERN, connectionDefaultNamePatternText.getText());
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionNameResolver;
import org.eclipse.swt.widgets.*;
    @NotNull
import org.jkiss.dbeaver.runtime.DBWorkbench;
}
    private Button closeConnectionOnOsSleepCheck;
