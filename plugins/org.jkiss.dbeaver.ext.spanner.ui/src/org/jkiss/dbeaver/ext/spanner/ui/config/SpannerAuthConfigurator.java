    public void createControl(@NotNull Composite authPanel, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {

        super.saveSettings(dataSource);
/*
            connectionInfo.setProviderProperty(SpannerConstants.DRIVER_PROP_PVTKEYPATH, privateKeyFile.getText().trim());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        privateKeyFile.setLayoutData(gd);
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
            privateKeyFile.setText(CommonUtils.notEmpty(connectionInfo.getProviderProperty(SpannerConstants.DRIVER_PROP_PVTKEYPATH)));
 *
 * you may not use this file except in compliance with the License.

    }
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        }
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
    private TextWithOpenFile privateKeyFile;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    }
}
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (privateKeyFile != null) {
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
import org.jkiss.dbeaver.model.access.DBAAuthModel;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        privateKeyFile = new ConfigurationFileSelector(authPanel, SpannerMessages.label_private_key_path, new String[] { "*", "*.json" } );

import org.jkiss.dbeaver.ui.dialogs.connection.DatabaseNativeAuthModelConfigurator;
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.ext.spanner.ui.internal.SpannerMessages;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Composite;
        super.loadSettings(dataSource);

        }
import org.eclipse.swt.layout.GridData;
    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
    @Override
 * See the License for the specific language governing permissions and
 */
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.spanner.ui.config;
import org.jkiss.dbeaver.ui.controls.ConfigurationFileSelector;
public class SpannerAuthConfigurator extends DatabaseNativeAuthModelConfigurator {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (privateKeyFile != null) {

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
    @Override
        UIUtils.createControlLabel(authPanel, SpannerMessages.label_private_key_path);
import org.jkiss.dbeaver.ext.spanner.model.SpannerConstants;

