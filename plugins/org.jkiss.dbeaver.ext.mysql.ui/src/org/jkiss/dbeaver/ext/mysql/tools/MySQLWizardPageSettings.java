                Button overrideCredentials = UIUtils.createCheckbox(securityGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_security_checkbox_override_host_credentials, settings.isOverrideCredentials());
    public void createSecurityGroup(Composite parent)
package org.jkiss.dbeaver.ext.mysql.tools;

 *     http://www.apache.org/licenses/LICENSE-2.0
        super(wizard, title);
                public void widgetSelected(SelectionEvent e) {

    }
import org.eclipse.swt.events.SelectionAdapter;
                });
                overrideCredentials.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.widgets.Button;
        if (connectionInfo != null) {
 * you may not use this file except in compliance with the License.
 */

            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            infoLabel.setText(NLS.bind(MySQLUIMessages.tools_db_export_wizard_page_settings_security_label_info, connectionInfo.getUserName()));
                    authDialog.setSavePasswordToolTipText(MySQLUIMessages.tools_db_export_wizard_page_settings_auth_save_password_checkbox_tip);
import org.eclipse.swt.events.SelectionEvent;
            Label infoLabel = new Label(securityGroup, SWT.NONE);
            resetButton.addSelectionListener(new SelectionAdapter() {
abstract class MySQLWizardPageSettings<WIZARD extends AbstractNativeToolWizard> extends AbstractNativeToolWizardPage<WIZARD>
                    authDialog.setUserName(wizard.getSettings().getToolUserName());
                MySQLUIMessages.tools_db_export_wizard_page_settings_security_group,
            resetButton.setText(MySQLUIMessages.tools_db_export_wizard_page_settings_security_button_reset);
                3,
                    wizard.getSettings().setToolUserName(null);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.dialogs.BaseAuthDialog;
                    authDialog.setUserPassword(wizard.getSettings().getToolUserPassword());
        final DBPConnectionConfiguration connectionInfo = wizard.getSettings().getDataSourceContainer().getActualConnectionConfiguration();
            }
    MySQLWizardPageSettings(WIZARD wizard, String title)
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizard;
            Button resetButton = new Button(securityGroup, SWT.PUSH);
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLNativeCredentialsSettings;
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
import org.eclipse.jface.dialogs.IDialogConstants;
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                GridData.HORIZONTAL_ALIGN_BEGINNING
            Button authButton = new Button(securityGroup, SWT.PUSH);
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizardPage;
                public void widgetSelected(SelectionEvent e) {


            authButton.addSelectionListener(new SelectionAdapter() {
                parent,

 *
                }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

            Composite securityGroup = UIUtils.createTitledComposite(
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
                @Override
                    }

            });
                MySQLNativeCredentialsSettings settings = (MySQLNativeCredentialsSettings) wizard.getSettings();
/*
                        settings.setOverrideCredentials(overrideCredentials.getSelection());

                }
                overrideCredentials.setToolTipText(MySQLUIMessages.tools_db_export_wizard_page_settings_security_checkbox_override_host_credentials_tip);
 * limitations under the License.
            authButton.setText(MySQLUIMessages.tools_db_export_wizard_page_settings_security_button_auth);
import org.eclipse.swt.layout.GridData;
 * DBeaver - Universal Database Manager
            });
                    authDialog.setSavePassword(true);
                    if (authDialog.open() == IDialogConstants.OK_ID) {
 *
 *
    {
                    BaseAuthDialog authDialog = new BaseAuthDialog(getShell(), MySQLUIMessages.tools_db_export_wizard_page_settings_auth_title, false, true);
import org.eclipse.osgi.util.NLS;
            gd.horizontalSpan = 3;
 * You may obtain a copy of the License at
            infoLabel.setLayoutData(gd);
            if (wizard.getSettings() instanceof MySQLNativeCredentialsSettings) {
    {
                    public void widgetSelected(SelectionEvent e) {
                @Override
import org.eclipse.swt.SWT;
                        wizard.getSettings().setToolUserPassword(authDialog.getUserPassword());
import org.eclipse.swt.widgets.Composite;
                    wizard.getSettings().setToolUserPassword(null);
 * Unless required by applicable law or agreed to in writing, software
            );
                    @Override
                        wizard.getSettings().setToolUserName(authDialog.getUserName());
}
    }
{
import org.eclipse.swt.widgets.Label;
                    authDialog.setSavePasswordText(MySQLUIMessages.tools_db_export_wizard_page_settings_auth_save_password_checkbox);
