
            driverPropsPage
                GridData.FILL_HORIZONTAL
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Text projectText;

 * You may obtain a copy of the License at
    public boolean isComplete()
import org.jkiss.dbeaver.Log;
            instanceText = UIUtils.createLabelText(addrGroup, SpannerMessages.label_instance, ""); //$NON-NLS-2$
        setImageDescriptor(logoImage);
            instanceText != null && !CommonUtils.isEmpty(instanceText.getText()) &&
    {
            instanceText.addModifyListener(textListener);
    private Text instanceText;
        if (instanceText != null) {
    }
        if (instanceText != null) {
        if (databaseText != null) {
 * limitations under the License.
        }
            projectText.setText(CommonUtils.notEmpty(connectionInfo.getServerName()));
        setControl(settingsGroup);
    {
        }
        return new IDialogPage[] {

    @Override
            Composite addrGroup = UIUtils.createTitledComposite(
        createDriverPanel(settingsGroup);
    protected String getDefaultAuthModelId(DBPDataSourceContainer dataSource) {
import org.eclipse.jface.resource.ImageDescriptor;
}
import org.eclipse.jface.dialogs.IDialogPage;

            databaseText != null && !CommonUtils.isEmpty(databaseText.getText());
import org.eclipse.swt.widgets.Text;
 * distributed under the License is distributed on an "AS IS" BASIS,

                2,
            addrGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if (databaseText != null) {
 */
 *
        }
                SpannerMessages.label_connection,
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
/*
    }
            );
 *
import org.jkiss.dbeaver.ui.IDialogPageProvider;

import org.jkiss.dbeaver.ext.spanner.ui.internal.SpannerMessages;
            databaseText.addModifyListener(textListener);
        }
 *
            connectionInfo.setDatabaseName(databaseText.getText().trim());
    private static ImageDescriptor logoImage = SpannerActivator.getImageDescriptor("icons/spanner_logo.png"); //$NON-NLS-1$
    {
    private Text databaseText;
    }
                settingsGroup,
    {
            instanceText.setToolTipText(SpannerMessages.label_instance_tip);
public class SpannerConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider

    @Override
    @NotNull
import org.jkiss.dbeaver.ui.UIUtils;
{
            databaseText.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (projectText != null) {
        // Load values from new connection info
        return SpannerAuthModel.ID;
/**
 * you may not use this file except in compliance with the License.
    public void saveSettings(DBPDataSourceContainer dataSource)
    @Override
    public void createControl(Composite composite)
        settingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.events.ModifyListener;
import org.jkiss.code.NotNull;
 */
    @Override
        {
        driverPropsPage = new DriverPropertiesDialogPage(this);
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
            connectionInfo.setServerName(projectText.getText().trim());
 * See the License for the specific language governing permissions and
            projectText.addModifyListener(textListener);
 * SpannerConnectionPage
 * Unless required by applicable law or agreed to in writing, software

        settingsGroup.setLayout(new GridLayout(1, false));
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private DriverPropertiesDialogPage driverPropsPage;
import org.eclipse.swt.layout.GridData;
        }
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.ext.spanner.auth.SpannerAuthModel;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            databaseText.setToolTipText(SpannerMessages.label_database_tip);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            projectText = UIUtils.createLabelText(addrGroup, SpannerMessages.label_project, ""); //$NON-NLS-2$
        return projectText != null && !CommonUtils.isEmpty(projectText.getText()) &&
    }

package org.jkiss.dbeaver.ext.spanner.ui.views;
    }
    }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate)

import org.jkiss.dbeaver.ext.spanner.ui.SpannerActivator;
            instanceText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
        }
        super.dispose();


        createAuthPanel(settingsGroup, 1);
    {
    public SpannerConnectionPage() {
 * DBeaver - Universal Database Manager
    public void dispose()

            connectionInfo.setHostName(instanceText.getText().trim());
    }
    @Override

        super.loadSettings();

        ModifyListener textListener = e -> site.updateButtons();
        };
import org.jkiss.utils.CommonUtils;
            databaseText = UIUtils.createLabelText(addrGroup, SpannerMessages.label_database, ""); //$NON-NLS-2$

        Composite settingsGroup = new Composite(composite, SWT.NONE);


import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
    public void loadSettings()
        super.saveSettings(dataSource);

import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
    {
    @Override
import org.eclipse.swt.widgets.Composite;
        if (projectText != null) {
    private static final Log log = Log.getLog(SpannerConnectionPage.class);
