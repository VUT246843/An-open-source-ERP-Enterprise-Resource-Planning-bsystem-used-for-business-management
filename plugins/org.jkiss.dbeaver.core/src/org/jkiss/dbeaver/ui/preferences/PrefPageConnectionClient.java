
        DBConstants.VAR_CONTEXT_NAME,
        {
    }

                CoreMessages.pref_page_database_client_name_group,
import org.eclipse.swt.events.SelectionAdapter;
                    updateClientAppEnablement();
        }

        try {
                null,
    @Override
                composite,
import org.jkiss.dbeaver.utils.PrefUtils;
                "" //$NON-NLS-1$
                null,
    }
import org.jkiss.dbeaver.ModelPreferences;
 * limitations under the License.
                2
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            });
                CoreMessages.pref_page_database_label_disable_client_application_name,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
        return PAGE_ID;
    public PrefPageConnectionClient() {
        SystemVariablesResolver.VAR_APP_VERSION,
import org.jkiss.dbeaver.core.CoreMessages;
        SystemVariablesResolver.VAR_APP_NAME,
        store.setToDefault(ModelPreferences.CONNECT_USE_ENV_VARS);
            store.contains(ModelPreferences.META_CLIENT_NAME_VALUE) ||
        SystemVariablesResolver.VAR_APP_PATH,
            log.warn(e);
            );
    protected void clearPreferences(DBPPreferenceStore store) {
                CoreMessages.pref_page_connections_application_name_text,
                connGroup,
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        return true;
            store.contains(ModelPreferences.META_CLIENT_NAME_OVERRIDE) ||
    private void updateClientAppEnablement() {
        DBPConnectionConfiguration.VARIABLE_SERVER,
            updateClientAppEnablement();
    protected Control createPreferenceContent(@NotNull Composite parent) {
            final Label label = UIUtils.createLabel(clientNameGroup,
        if (disableClientApplicationNameCheck == null) {
        PrefUtils.savePreferenceStore(store);
            overrideClientApplicationNameCheck.addSelectionListener(new SelectionAdapter() {
        DBPConnectionConfiguration.VARIABLE_HOST_TUNNEL,
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
                CoreMessages.pref_page_database_client_name_group_description);
            );
                CoreMessages.pref_page_connection_label_use_environment,
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
    }
        DBPConnectionConfiguration.VARIABLE_USER,


    @NotNull
        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);
    @Override


                2
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.client.connections"; //$NON-NLS-1$
        // We removed support of ${password} variable due to dbeaver/pro#1861
    @Override

    }
    }
    private Button connUseEnvVariables;
        store.setToDefault(ModelPreferences.META_CLIENT_NAME_VALUE);
        connUseEnvVariables.setSelection(store.getDefaultBoolean(ModelPreferences.CONNECT_USE_ENV_VARS));
            store.setValue(ModelPreferences.CONNECT_USE_ENV_VARS, connUseEnvVariables.getSelection());
                false,

 * PrefPageConnectionClient
import org.jkiss.dbeaver.ui.UIUtils;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            );
 * distributed under the License is distributed on an "AS IS" BASIS,
        SystemVariablesResolver.VAR_LOCAL_IP,
        updateClientAppEnablement();
            store.setValue(ModelPreferences.META_CLIENT_NAME_VALUE, clientApplicationNameText.getText());
 *
            store.setValue(ModelPreferences.META_CLIENT_NAME_OVERRIDE, overrideClientApplicationNameCheck.getSelection());
                new SmartTextContentAdapter(),
                clientNameGroup,


                clientNameGroup,
public class PrefPageConnectionClient extends TargetPrefPage {
            log.warn(e);
                2
        DBPConnectionConfiguration.VARIABLE_PORT,
            store.setValue(ModelPreferences.META_CLIENT_NAME_DISABLE, disableClientApplicationNameCheck.getSelection());
    protected boolean supportsDataSourceSpecificOptions() {
                }

        clientApplicationNameText.setEnabled(overrideClientApplicationNameCheck.getSelection());
        DBPConnectionConfiguration.VARIABLE_DATASOURCE,
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
    @Override
                @Override
            disableClientApplicationNameCheck = UIUtils.createCheckbox(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
                2,
        super();
        try {

 *
        {
        } catch (Exception e) {
        }
    @Override
            clientApplicationNameText = UIUtils.createLabelText(
        SystemVariablesResolver.VAR_HOME,
    private static final String[] ALLOWED_VARIABLES = new String[] {
    }

    private Button disableClientApplicationNameCheck;
    };

            overrideClientApplicationNameCheck.setSelection(store.getBoolean(ModelPreferences.META_CLIENT_NAME_OVERRIDE));
        SystemVariablesResolver.VAR_WORKSPACE,

                false,
            connUseEnvVariables.setSelection(store.getBoolean(ModelPreferences.CONNECT_USE_ENV_VARS));
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.DBConstants;
    private Button overrideClientApplicationNameCheck;
        }
                false,
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
        DBPConnectionConfiguration.VARIABLE_HOST,
        disableClientApplicationNameCheck.setSelection(store.getDefaultBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE));
    @NotNull
        DBPPreferenceStore store = getTargetPreferenceStore();
            store.contains(ModelPreferences.META_CLIENT_NAME_DISABLE) ||
 */
        }
        } catch (Exception e) {
    private Text clientApplicationNameText;
            ;
    protected String getPropertyPageID() {
        DBConstants.VAR_CONTEXT_ID,
        store.setToDefault(ModelPreferences.META_CLIENT_NAME_DISABLE);
        DBPConnectionConfiguration.VARIABLE_CONN_TYPE,
        store.setToDefault(ModelPreferences.META_CLIENT_NAME_OVERRIDE);
            Composite clientNameGroup = UIUtils.createTitledComposite(

    }

                ALLOWED_VARIABLES
            gd.horizontalSpan = 2;
                CoreMessages.pref_page_connection_label_general,
        clientApplicationNameText.setText(store.getDefaultString(ModelPreferences.META_CLIENT_NAME_VALUE));
            UIUtils.setContentProposalToolTip(

            Composite connGroup = UIUtils.createTitledComposite(
            );
            GridData gd = new GridData();
            );
            disableClientApplicationNameCheck.setSelection(store.getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE));
package org.jkiss.dbeaver.ui.preferences;
        DBPConnectionConfiguration.VARIABLE_URL,
    protected void performDefaults() {
        if (disableClientApplicationNameCheck == null) {
                2,
    @Override
                new StringContentProposalProvider(ALLOWED_VARIABLES));
            overrideClientApplicationNameCheck = UIUtils.createCheckbox(
 * you may not use this file except in compliance with the License.
                CoreMessages.pref_page_database_label_client_application_name,
        }

        SystemVariablesResolver.VAR_DBEAVER_HOME,
        overrideClientApplicationNameCheck.setSelection(store.getDefaultBoolean(ModelPreferences.META_CLIENT_NAME_OVERRIDE));
 * You may obtain a copy of the License at
        return
}                composite,
        return composite;
    @Override

                clientNameGroup,
                public void widgetSelected(SelectionEvent e) {
        DBPConnectionConfiguration.VARIABLE_DATABASE,
            return;
import org.jkiss.code.NotNull;
/**
import org.eclipse.swt.layout.GridData;
        // DBPConnectionConfiguration.VARIABLE_PASSWORD,
 * See the License for the specific language governing permissions and
    }
        }
                clientApplicationNameText,
            label.setLayoutData(gd);
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.SelectionEvent;
            store.contains(ModelPreferences.CONNECT_USE_ENV_VARS)
 */
            clientApplicationNameText.setText(store.getString(ModelPreferences.META_CLIENT_NAME_VALUE));
            connUseEnvVariables = UIUtils.createCheckbox(
import org.eclipse.swt.widgets.*;
            ContentAssistUtils.installContentProposal(
                null,
            return;
    }

                GridData.FILL_HORIZONTAL);
                clientApplicationNameText,
                CoreMessages.pref_page_database_label_override_client_application_name,

                GridData.FILL_HORIZONTAL);
