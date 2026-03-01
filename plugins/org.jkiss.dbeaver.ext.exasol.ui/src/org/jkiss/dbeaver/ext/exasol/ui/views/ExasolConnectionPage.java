            portText.addModifyListener(textListener);
            backupHostLabel.setEnabled(showBackupHosts);

                    //reset text if disabled
    private boolean showBackupHosts = false;
            } else {
        }
        control.setLayout(new GridLayout(1, false));
        return super.isComplete() &&

            portText.setLayoutData(gd);
                ExasolMessages.connection_page_checkbox_legacy_encrypt_tip,
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.backupHostText.setEnabled(true);
        connectionInfo.setProviderProperty(ExasolUIConstants.DRV_BACKUP_HOST_LIST, backupHostText.getText());
            hostText != null && portText != null &&
 * limitations under the License.
            addrGroup.setLayoutData(gd);
                    if (!useBackupHostList.getSelection())
import org.jkiss.utils.CommonUtils;
            connectionInfo.setProviderProperty(ExasolUIConstants.DRV_ENCRYPT, "1"); //$NON-NLS-1$
                false,

 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.swt.widgets.Text;
    }
            });
 *
        useLegacyEncryption.setSelection(CommonUtils.toBoolean(


        String encryptComm = connectionInfo.getProviderProperty(ExasolUIConstants.DRV_ENCRYPT);
        super.loadSettings();
            backupHostText.addModifyListener(textListener);
package org.jkiss.dbeaver.ext.exasol.ui.views;
    }
 * See the License for the specific language governing permissions and
        if (portText != null) {
                }

        createDriverPanel(control);
            String.valueOf(useLegacyEncryption.getSelection()));
            connectionInfo.getProviderProperty(ExasolConstants.DRV_USE_LEGACY_ENCRYPTION)));
    @Override
            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
        return logoImage;
            gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            hostText.addModifyListener(textListener);
        control.setLayoutData(new GridData(GridData.FILL_BOTH));
            encryptCommunication = UIUtils.createCheckbox(addrGroup, ExasolMessages.label_encrypt, null, false, 2);

    @Override
                portText.setText(site.getDriver().getDefaultPort());
import org.eclipse.swt.SWT;
            portText = UIUtils.createLabelText(addrGroup, ExasolMessages.dialog_connection_port, null, SWT.BORDER);
    public ExasolConnectionPage() {

        UIUtils.dispose(logoImage);
            this.encryptCommunication.setEnabled(true);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Image logoImage;

                hostText.setText(connectionInfo.getHostName());

    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
                addrGroup,
            !CommonUtils.isEmpty(portText.getText());
            connectionInfo.setHostPort(portText.getText().trim());
        }
    @Override
        if ("1".equals(encryptComm)) {
 */
            backupHostLabel = UIUtils.createControlLabel(addrGroup, ExasolMessages.label_backup_host_list);
        logoImage = createImage("icons/exasol.png"); //$NON-NLS-1$
    }
            this.useBackupHostList.setSelection(true);

            }
            backupHostLabel.setLayoutData(gd);




            connectionInfo.setHostName(hostText.getText().trim());

            } else {
        if (hostText != null) {
        }
        if (hostText != null) {
    }
        if (!CommonUtils.isEmpty(backupHostText)) {
    public void loadSettings() {
    private void evaluateURL() {
            backupHostText = new Text(bhPlaceholder, SWT.BORDER);
            hostText = UIUtils.createLabelText(addrGroup, ExasolMessages.label_host_list, null, SWT.BORDER);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    private Button useBackupHostList;
            useBackupHostList = UIUtils.createCheckbox(bhPlaceholder, ExasolMessages.label_use_backup_host_list, null, showBackupHosts, 1);
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
import org.eclipse.swt.events.ModifyListener;
    }
        }
        }
 *
        } else {
import org.eclipse.jface.dialogs.IDialogPage;
        String backupHostText = connectionInfo.getProviderProperty(ExasolUIConstants.DRV_BACKUP_HOST_LIST);
        ModifyListener textListener = e -> evaluateURL();
import org.eclipse.swt.widgets.Label;
    }
 * DBeaver - Universal Database Manager
        if (portText != null) {
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;

    private Button useLegacyEncryption;
import org.eclipse.swt.widgets.Button;
        site.updateButtons();

            gd = new GridData(GridData.FILL_HORIZONTAL);
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        setControl(control);
        connectionInfo.setProviderProperty(ExasolConstants.DRV_USE_LEGACY_ENCRYPTION,
    public boolean isComplete() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
                hostText.setText(""); //$NON-NLS-1$
                    backupHostLabel.setEnabled(useBackupHostList.getSelection());

            gd.widthHint = UIUtils.getFontHeight(portText) * 7;
            Composite addrGroup = UIUtils.createTitledComposite(control, ExasolMessages.label_database, 2, GridData.FILL_HORIZONTAL);

        {
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();

public class ExasolConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
    }

                ExasolMessages.connection_page_checkbox_legacy_encrypt,
import org.eclipse.swt.widgets.Composite;
    }
            this.useBackupHostList.setSelection(false);
    public void dispose() {
            useLegacyEncryption = UIUtils.createCheckbox(
 * Unless required by applicable law or agreed to in writing, software
            !CommonUtils.isEmpty(hostText.getText()) &&
        return new IDialogPage[]{
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
            this.backupHostText.setText(backupHostText);
    private Text hostText;
    private Label backupHostLabel;
import java.util.Locale;

    public void saveSettings(DBPDataSourceContainer dataSource) {
        Composite control = new Composite(composite, SWT.NONE);
            hostText.setLayoutData(gd);
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
        super.saveSettings(dataSource);
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
            this.backupHostLabel.setEnabled(false);

        }
            UIUtils.setDefaultTextControlWidthHint(backupHostText);
            bhPlaceholder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
        }
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
import org.jkiss.dbeaver.ui.IDialogPageProvider;
    private Text backupHostText;
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
                    backupHostText.setEnabled(useBackupHostList.getSelection());
        };
 * You may obtain a copy of the License at
            gd = new GridData(GridData.FILL_HORIZONTAL);
 * you may not use this file except in compliance with the License.
            this.backupHostLabel.setEnabled(true);
        createAuthPanel(control, 1);
            this.backupHostText.setEnabled(false);
 *
            gd.grabExcessHorizontalSpace = true;
import org.jkiss.dbeaver.ext.exasol.ui.ExasolUIConstants;
                2);
    public Image getImage() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.SelectionAdapter;
                @Override


        if (this.encryptCommunication.getSelection())

                portText.setText(connectionInfo.getHostPort());
                        backupHostText.setText(""); //$NON-NLS-1$
import org.eclipse.swt.layout.GridLayout;

    @Override
/*
            Composite bhPlaceholder = UIUtils.createComposite(addrGroup, 2);
}
            new DriverPropertiesDialogPage(this)
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();

        super.dispose();
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
            useBackupHostList.addSelectionListener(new SelectionAdapter() {
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    public void createControl(Composite composite) {
                public void widgetSelected(SelectionEvent e) {

            }
            UIUtils.setDefaultTextControlWidthHint(hostText);
                portText.setText("8563"); //$NON-NLS-1$
            } else if (site.getDriver().getDefaultPort() != null) {
            backupHostText.setLayoutData(gd);
    private Button encryptCommunication;
        // Load values from new connection info

            gd.grabExcessHorizontalSpace = true;

    private Text portText;
    @Override
import org.eclipse.swt.layout.GridData;
