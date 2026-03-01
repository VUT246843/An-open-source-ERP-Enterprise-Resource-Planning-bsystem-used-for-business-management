public class IoTDBConnectionPage extends GenericConnectionPage {
                saveAndUpdate();
            if (site.isNew() && CommonUtils.isEmpty(connectionInfo.getServerName())) {
        });
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ext.generic.views.GenericConnectionPage;

 * you may not use this file except in compliance with the License.
 */
        Composite additionalSettingsGroup = UIUtils.createTitledComposite(composite, "Additional Settings", 4, GridData.FILL_HORIZONTAL);
    public void createAdvancedSettingsGroup(Composite composite) {

import org.jkiss.dbeaver.ui.UIUtils;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
/*

 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.loadSettings();
        final DBPDataSourceContainer dataSource = site.getActiveDataSource();

import org.eclipse.swt.widgets.Combo;
    }
            sqlDialectCombo.add("table");
import org.eclipse.swt.widgets.Composite;
        activated = true;


    private static final String GROUP_SQL_DIALECT = "sqlDialect";
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
        additionalSettingsGroup.setLayout(new GridLayout(4, false));
import org.eclipse.swt.events.ModifyListener;
 * See the License for the specific language governing permissions and
            } else {
    }
        }
    @Override
        super.saveSettings(dataSource);
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
        if (sqlDialectCombo != null) {

    }
    public void saveSettings(DBPDataSourceContainer dataSource) {
 * limitations under the License.
    public void loadSettings() {
 *

            }
        site.updateButtons();
        Control emptyLabel = UIUtils.createEmptyLabel(additionalSettingsGroup, 2, 1);
import org.eclipse.swt.SWT;
        sqlDialectCombo.addModifyListener(textListener);

    @Override
        sqlDialectCombo = UIUtils.createLabelCombo(additionalSettingsGroup, "Sql Dialect", SWT.DROP_DOWN | SWT.READ_ONLY);
import org.eclipse.swt.layout.GridLayout;
    private boolean activated;
                sqlDialectCombo.setFocus();
 *     http://www.apache.org/licenses/LICENSE-2.0
            connectionInfo.setServerName(sqlDialectCombo.getText().trim());
            }
import org.eclipse.swt.widgets.Control;
            if (activated) {
}
        addControlToGroup(GROUP_SQL_DIALECT, sqlDialectCombo);
            if (sqlDialectCombo != null && sqlDialectCombo.isVisible()) {
    @Override
        saveSettings(site.getActiveDataSource());
        };
        UIUtils.asyncExec(() -> {
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
                sqlDialectCombo.setText(CommonUtils.notEmpty(site.getDriver().getDefaultServer()));
    private Combo sqlDialectCombo;
        }
                sqlDialectCombo.setText(CommonUtils.notEmpty(connectionInfo.getServerName()));
        if (sqlDialectCombo != null) {



package org.jkiss.dbeaver.ext.iotdb.ui.views;
        addControlToGroup(GROUP_SQL_DIALECT, emptyLabel);
            }
            sqlDialectCombo.removeAll();
            sqlDialectCombo.add("tree");
import org.jkiss.utils.CommonUtils;
        ModifyListener textListener = e -> {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private void saveAndUpdate() {
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
