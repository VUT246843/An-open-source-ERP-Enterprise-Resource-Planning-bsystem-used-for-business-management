            hostText.setEditable(false);
            savePasswordCheckbox.setSelection(false);
    private Button savePasswordCheckbox;
    @Override
    @Override
        passwordText = UIUtils.createLabelText(composite, UIConnectionMessages.dialog_connection_network_socket_label_password, "", SWT.BORDER | SWT.PASSWORD); //$NON-NLS-2$

 */
        if (this.getEditIntention() == DBPConnectionEditIntention.CREDENTIALS_ONLY) {
                dialog.open();
        userNameText = UIUtils.createLabelText(composite, UIConnectionMessages.dialog_connection_network_socket_label_username, null); //$NON-NLS-2$
            portText.setEnabled(false);
    public boolean isComplete() {
        configuration.setProperty(SocksConstants.PROP_HOST, hostText.getText().trim());
        hostText = UIUtils.createLabelText(composite, UIConnectionMessages.dialog_connection_network_socket_label_host, null); //$NON-NLS-2$

        return true;
import org.jkiss.dbeaver.ui.UIUtils;
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration)
        hostText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener)
package org.jkiss.dbeaver.ui.dialogs.net;
 *
            portText.setSelection(CommonUtils.toInt(portString));
                PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
        } else {
    private Spinner portText;
    private Text userNameText;
    }
        userNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    public void resetSettings(@NotNull DBWHandlerConfiguration configuration) {
        }
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
 * You may obtain a copy of the License at
        String portString = configuration.getStringProperty(SocksConstants.PROP_PORT);
            }
            passwordText.setEnabled(savePasswordCheckbox.getSelection());
    }
import org.eclipse.ui.dialogs.PreferencesUtil;
    {
/**
                    NETWORK_PREF_PAGE_ID,
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
                    null,
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_CREDENTIALS_EDIT)) {
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        configuration.setPassword(passwordText.getText());
import org.eclipse.swt.events.SelectionEvent;
    }

        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        createSocksGroup(composite);
        }
        }
        if (!CommonUtils.isEmpty(portString)) {
import org.jkiss.dbeaver.ui.AbstractObjectPropertyConfigurator;
 * SOCKS proxy configuration
import org.eclipse.swt.widgets.*;
import org.jkiss.code.NotNull;

        portText.setLayoutData(gd);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * DBeaver - Universal Database Manager
        hostText.setText(CommonUtils.notEmpty(configuration.getStringProperty(SocksConstants.PROP_HOST)));
        UIUtils.createEmptyLabel(composite,1, 1);
        passwordText.setText(CommonUtils.notEmpty(configuration.getPassword()));
 * distributed under the License is distributed on an "AS IS" BASIS,
            @Override
    }
    @Override

 */
    public static final String NETWORK_PREF_PAGE_ID = "org.eclipse.ui.net.NetPreferences";
                    UIUtils.getActiveWorkbenchShell(),


        savePasswordCheckbox.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {

        composite.setLayout(new GridLayout(1, true));
public class SocksProxyConfiguratorUI extends AbstractObjectPropertyConfigurator<Object, DBWHandlerConfiguration> {

    protected void createSocksGroup(Composite parent) {
        UIUtils.createLink(parent, UIConnectionMessages.dialog_connection_open_global_network_preferences_link, new SelectionAdapter() {
        configuration.setSavePassword(savePasswordCheckbox.getSelection());
 * See the License for the specific language governing permissions and

    private Text passwordText;
        configuration.setProperty(SocksConstants.PROP_PORT, portText.getSelection());
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.utils.CommonUtils;

            savePasswordCheckbox.notifyListeners(SWT.Selection, new Event());
import org.jkiss.dbeaver.model.impl.net.SocksConstants;
        portText = UIUtils.createLabelSpinner(composite, UIConnectionMessages.dialog_connection_network_socket_label_port, SocksConstants.DEFAULT_SOCKS_PORT, 0, 65535);
    private Text hostText;
/*
            public void widgetSelected(SelectionEvent e) {
    {
import org.eclipse.swt.layout.GridLayout;
                    null);
    @Override
        gd.widthHint = UIUtils.getFontHeight(portText) * 7;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;


    public void loadSettings(@NotNull DBWHandlerConfiguration configuration)

 * limitations under the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others

    }
            savePasswordCheckbox.setEnabled(false);
            portText.setSelection(SocksConstants.DEFAULT_SOCKS_PORT);
        savePasswordCheckbox.setSelection(configuration.isSavePassword());
 *
}
 * you may not use this file except in compliance with the License.

        final Composite composite = UIUtils.createTitledComposite(parent, "SOCKS", 4, GridData.FILL_HORIZONTAL, SWT.DEFAULT);
        }));
        userNameText.setText(CommonUtils.notEmpty(configuration.getUserName()));
    @Override
import org.eclipse.jface.preference.PreferenceDialog;
 * Unless required by applicable law or agreed to in writing, software
    {
        });
        configuration.setUserName(userNameText.getText().trim());
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        savePasswordCheckbox = UIUtils.createCheckbox(composite, UIConnectionMessages.dialog_connection_auth_checkbox_save_password, false);
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
import org.eclipse.swt.SWT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final Composite composite = new Composite(parent, SWT.NONE);

    }
