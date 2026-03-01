import org.eclipse.swt.widgets.Composite;
            } else {
        settingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 *
        return projectText != null && !CommonUtils.isEmpty(projectText.getText());
                GridData.FILL_HORIZONTAL
 * You may obtain a copy of the License at
import org.eclipse.swt.layout.GridLayout;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    {

    {
            // Def host/port
            Composite addrGroup = UIUtils.createTitledComposite(
    protected String getDefaultAuthModelId(DBPDataSourceContainer dataSource) {

    private Text extraProjectsText;
            }
            extraProjectsText.setToolTipText(BigQueryMessages.label_additional_project_tip);

import org.eclipse.swt.events.ModifyListener;
        super.saveSettings(dataSource);
    {

                portText.setText(site.getDriver().getDefaultPort());
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
    }
import org.jkiss.dbeaver.ext.bigquery.auth.BigQueryAuthModel;
        }
        }
            if (CommonUtils.isEmpty(databaseName)) {
    private Text portText;
import org.jkiss.code.NotNull;

    }
    {

import org.eclipse.swt.widgets.Text;
        // Load values from new connection info
                4,
import org.jkiss.dbeaver.ui.IDialogPageProvider;
    @NotNull

    }

        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        }
        driverPropsPage = new DriverPropertiesDialogPage(this);
            UIUtils.setDefaultTextControlWidthHint(projectText);
            connectionInfo.setProviderProperty(BigQueryConstants.DRIVER_PROP_ADDITIONAL_PROJECTS, extraProjectsText.getText().trim());
                hostText.setText(connectionInfo.getHostName());

        if (projectText != null) {
            extraProjectsText = UIUtils.createLabelText(addrGroup, BigQueryMessages.label_additional_project, ""); //$NON-NLS-2$
            extraProjectsText.setText(additionalProjects);

        }
            GridData gd = (GridData) portText.getLayoutData();
    public void createControl(Composite composite)
    }
        if (additionalProjects != null) {
    }
            UIUtils.setDefaultTextControlWidthHint(extraProjectsText);


    private final DriverPropertiesDialogPage driverPropsPage;
    private Text hostText;
        };
            connectionInfo.setHostPort(portText.getText().trim());
        return BigQueryAuthModel.ID;


        {
                GridData.FILL_HORIZONTAL
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate)

        String additionalProjects = CommonUtils.toString(
            if (CommonUtils.isEmpty(connectionInfo.getHostName())) {
        if (portText != null) {
        setControl(settingsGroup);
        }

        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
}
        Composite settingsGroup = new Composite(composite, SWT.NONE);
                2,
            hostText = UIUtils.createLabelText(addrGroup, BigQueryMessages.label_host, BigQueryConstants.DEFAULT_HOST_NAME);
        return new IDialogPage[] {
            hostText.addModifyListener(textListener);
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.layout.GridData;
/*
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
    @Override
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;

 * BigQueryConnectionPage
        if (extraProjectsText != null) {
package org.jkiss.dbeaver.ext.bigquery.ui.views;
                BigQueryMessages.label_connection,
            String databaseName = connectionInfo.getDatabaseName();
            projectText.addModifyListener(textListener);
        super.dispose();
                hostText.setText(BigQueryConstants.DEFAULT_HOST_NAME);
import org.eclipse.swt.SWT;
import java.util.Locale;
        );
        createAdditionalControls(settingsGroup);
    public void dispose()
 * DBeaver - Universal Database Manager
            );
        settingsGroup.setLayout(new GridLayout(1, false));
 */
 * Unless required by applicable law or agreed to in writing, software
/**
            }
        if (hostText != null) {
        createAuthPanel(settingsGroup, 1);

            connectionInfo.getProviderProperty(BigQueryConstants.DRIVER_PROP_ADDITIONAL_PROJECTS),

                databaseName = ""; //$NON-NLS-1$
        if (projectText != null) {
 * limitations under the License.
 *
    @Override
            } else {
                settingsGroup,
        if (portText != null) {
        setImageDescriptor(logoImage);
 */
    }
            connectionInfo.getProperty(BigQueryConstants.DRIVER_PROP_ADDITIONAL_PROJECTS) // backward compatibility

        ModifyListener textListener = e -> site.updateButtons();
import org.jkiss.dbeaver.ext.bigquery.ui.BigQueryActivator;
 * Licensed under the Apache License, Version 2.0 (the "License");



    @Override
            );

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.ext.bigquery.ui.internal.BigQueryMessages;
import org.jkiss.dbeaver.ext.bigquery.model.BigQueryConstants;
            projectText = UIUtils.createLabelText(addrGroup, BigQueryMessages.label_project, ""); //$NON-NLS-2$
                portText.setText(""); //$NON-NLS-1$
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            extraProjectsText.addModifyListener(textListener);
            portText = UIUtils.createLabelText(addrGroup, BigQueryMessages.label_port, String.valueOf(BigQueryConstants.DEFAULT_PORT));
        }
    @Override
            } else if (site.getDriver().getDefaultPort() != null) {
import org.eclipse.jface.dialogs.IDialogPage;
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
            projectText.setText(databaseName);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class BigQueryConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
        super.loadSettings();
    @Override
    {
    public void saveSettings(DBPDataSourceContainer dataSource)

            connectionInfo.setHostName(hostText.getText().trim());
                portText.setText(connectionInfo.getHostPort());
            connectionInfo.setDatabaseName(projectText.getText().trim());
        }
            driverPropsPage
    public void loadSettings()
            UIUtils.setDefaultTextControlWidthHint(hostText);
                BigQueryMessages.label_server_info,
            Composite addrGroup = UIUtils.createTitledComposite(
 * See the License for the specific language governing permissions and
        createDriverPanel(settingsGroup);
    protected void createAdditionalControls(Composite settingsGroup) {
    private Text projectText;
    private static final ImageDescriptor logoImage = BigQueryActivator.getImageDescriptor("icons/bigquery_logo.png"); //$NON-NLS-1$
                settingsGroup,
 * you may not use this file except in compliance with the License.
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
    @Override
import org.eclipse.jface.resource.ImageDescriptor;
    public boolean isComplete() {
        {
        }
    public BigQueryConnectionPage() {

        if (hostText != null) {
    }
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;
            portText.addModifyListener(textListener);
            }

    }
