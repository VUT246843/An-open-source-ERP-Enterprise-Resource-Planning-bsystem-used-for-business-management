import org.jkiss.dbeaver.ext.bigquery.ui.internal.BigQueryMessages;
            authTypeCombo.select(CommonUtils.toInt(connectionInfo.getProperty(BigQueryConstants.DRIVER_PROP_OAUTH_TYPE)));
            connectionInfo.setProperty(
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
public class BigQueryAuthConfigurator extends DatabaseNativeAuthModelConfigurator {
import org.jkiss.dbeaver.ext.bigquery.model.BigQueryConstants;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Label keyPathLabel;
 * limitations under the License.
    }
            UIUtils.setControlVisible(authCertFile.getPanel(), serviceBased);
        super.saveSettings(dataSource);
/*
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
import org.eclipse.swt.widgets.Label;
 *     http://www.apache.org/licenses/LICENSE-2.0

        if (keyPathLabel != null && authCertFile != null) {
            updateKeyPathVisibility();
                authTypeCombo.getShell().layout(true, true);
        String keyPath = connectionInfo.getProperty(
            }
            authCertFile.setText(keyPath);
        if (authTypeCombo != null) {
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
    @Override
        }
        authTypeCombo.add(BigQueryMessages.label_service_based);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    public void createControl(@NotNull Composite authPanel, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {
 * See the License for the specific language governing permissions and
        if (keyPath != null && authCertFile != null) {

        authCertFile = new ConfigurationFileSelector(authPanel, BigQueryMessages.label_private_key_path, new String[]{"*", "*.p12", "*.json"}, DBWorkbench.isDistributed());
            connectionInfo.setProperty(BigQueryConstants.DRIVER_PROP_OAUTH_TYPE, String.valueOf(authTypeCombo.getSelectionIndex()));
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.access.DBAAuthModel;
import org.jkiss.utils.CommonUtils;
 *
            if (!authTypeCombo.isDisposed()) {
                UIUtils.resizeShell(authTypeCombo.getShell());

            boolean serviceBased = authTypeCombo.getSelectionIndex() == 0;
        keyPathLabel = UIUtils.createControlLabel(authPanel, BigQueryMessages.label_key_path);
    @Override
        authTypeCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {


        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        }));
import org.jkiss.dbeaver.ui.dialogs.connection.DatabaseNativeAuthModelConfigurator;
 * distributed under the License is distributed on an "AS IS" BASIS,
        authTypeCombo.select(0);
 * You may obtain a copy of the License at
    private TextWithOpenFile authCertFile;

            UIUtils.setControlVisible(keyPathLabel, serviceBased);
        authTypeCombo = new Combo(authPanel, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
                DBWorkbench.isDistributed() ? BigQueryConstants.DRIVER_PROP_OAUTH_PVT_KEY : BigQueryConstants.DRIVER_PROP_OAUTH_PVT_KEYPATH,

import org.eclipse.swt.widgets.Composite;
        }
    private void updateKeyPathVisibility() {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * Unless required by applicable law or agreed to in writing, software
        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.layout.GridData;
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        UIUtils.createControlLabel(authPanel, BigQueryMessages.label_oauth_type);
            propertyChangeListener.run();
        authTypeCombo.add(BigQueryMessages.label_user_based);
    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        super.loadSettings(dataSource);
 *

        updateKeyPathVisibility();

import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Combo;
    private Combo authTypeCombo;
        }
            DBWorkbench.isDistributed() ? BigQueryConstants.DRIVER_PROP_OAUTH_PVT_KEY : BigQueryConstants.DRIVER_PROP_OAUTH_PVT_KEYPATH);
import org.eclipse.swt.events.SelectionListener;
    }
import org.eclipse.swt.SWT;
        if (authTypeCombo != null) {
 *
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
                authCertFile.getText().trim());
    }
 */

        if (authCertFile != null) {
package org.jkiss.dbeaver.ext.bigquery.ui.config;
import org.jkiss.dbeaver.ui.controls.ConfigurationFileSelector;
        }

        authCertFile.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING));
