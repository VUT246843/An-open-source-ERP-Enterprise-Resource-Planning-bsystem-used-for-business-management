 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2026 DBeaver Corp and others
                wizard.getSettings().setToolUserPassword(null);
             wizard.getObjectsName()));
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizardPage;
 * you may not use this file except in compliance with the License.
                if (authDialog.open() == IDialogConstants.OK_ID) {
        Button authButton = new Button(securityGroup, SWT.PUSH);
 * DBeaver - Universal Database Manager
import org.eclipse.swt.SWT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                connectionInfo.getProviderProperties().remove(authProperty);
 * You may obtain a copy of the License at
            public void widgetSelected(SelectionEvent e)
 */
                wizard.getSettings().setToolUserName(null);
 * See the License for the specific language governing permissions and
            }
{
        authButton.addSelectionListener(new SelectionAdapter() {
                authDialog.setSavePasswordText(PostgreMessages.wizard_backup_page_setting_authentication_save_password);
    }
        Label infoLabel = new Label(securityGroup, SWT.NONE);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.layout.GridData;
 *
import org.eclipse.swt.widgets.Composite;
/*
        Composite securityGroup = UIUtils.createTitledComposite(
            parent, PostgreMessages.wizard_backup_page_setting_group_security, 2, GridData.HORIZONTAL_ALIGN_BEGINNING);
            public void widgetSelected(SelectionEvent e)
                    wizard.getSettings().setToolUserPassword(authDialog.getUserPassword());
            @Override
import org.eclipse.swt.events.SelectionAdapter;
                }

            {
        final DBPConnectionConfiguration connectionInfo = wizard.getSettings().getDataSourceContainer().getActualConnectionConfiguration();

 * limitations under the License.
                    wizard.getSettings().setToolUserName(authDialog.getUserName());
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                BaseAuthDialog authDialog = new BaseAuthDialog(getShell(), PostgreMessages.wizard_backup_page_setting_group_security_btn_authentication, false, true);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.osgi.util.NLS;
        });
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.dialogs.BaseAuthDialog;
                authDialog.setSavePassword(CommonUtils.isNotEmpty(wizard.getSettings().getToolUserPassword()));

        gd.horizontalSpan = 2;
            @Override
                authDialog.setSavePasswordToolTipText(PostgreMessages.wizard_backup_page_setting_authentication_save_password_tip);
                authDialog.setUserName(wizard.getSettings().getToolUserName());
import org.eclipse.jface.dialogs.IDialogConstants;
                authDialog.setUserPassword(wizard.getSettings().getToolUserPassword());
        Button resetButton = new Button(securityGroup, SWT.PUSH);
            }

        super(wizard, title);
    {
        final String authProperty = DBConstants.INTERNAL_PROP_PREFIX + "-auth-" + wizard.getObjectsName() + "@";
        infoLabel.setText(NLS.bind(PostgreMessages.wizard_backup_page_setting_group_security_label_info, connectionInfo.getUserName(),
 *
public abstract class PostgreToolWizardPageSettings<WIZARD extends AbstractNativeToolWizard> extends AbstractNativeToolWizardPage<WIZARD>
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizard;

        authButton.setText(PostgreMessages.wizard_backup_page_setting_group_security_btn_authentication);
        resetButton.setText(PostgreMessages.wizard_backup_page_setting_group_security_btn_reset_default);
    public PostgreToolWizardPageSettings(WIZARD wizard, String title)
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
package org.jkiss.dbeaver.ext.postgresql.tools;
import org.eclipse.swt.widgets.Button;
        resetButton.addSelectionListener(new SelectionAdapter() {

        infoLabel.setLayoutData(gd);

import org.jkiss.utils.CommonUtils;
}

    public void createSecurityGroup(Composite parent) {
import org.eclipse.swt.widgets.Label;
            {
    }
        });
import org.jkiss.dbeaver.model.DBConstants;
