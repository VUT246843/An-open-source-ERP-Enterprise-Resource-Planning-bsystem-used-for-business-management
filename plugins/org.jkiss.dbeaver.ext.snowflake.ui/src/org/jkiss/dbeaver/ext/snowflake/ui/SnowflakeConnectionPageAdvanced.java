 *
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

 * See the License for the specific language governing permissions and

import org.eclipse.swt.widgets.Combo;
    public SnowflakeConnectionPageAdvanced() {
            sqlDollarQuoteBehaviorCombo.add(SnowflakeMessages.dialog_setting_sql_dd_string);
            store.getBoolean(SnowflakeConstants.PROP_DD_STRING) // backward compatibility
            SnowflakeConstants.PROP_DD_STRING,
 * limitations under the License.
    public void createControl(Composite parent) {
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.snowflake.ui;
        setTitle("Advanced");
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void loadSettings() {
    @Override
 * you may not use this file except in compliance with the License.
    @Override
        loadSettings();
 */
                GridData.HORIZONTAL_ALIGN_BEGINNING
            CommonUtils.toString(sqlDollarQuoteBehaviorCombo.getSelectionIndex() == 0)
import org.eclipse.swt.layout.GridLayout;
    @Override
    }
                SWT.DROP_DOWN | SWT.READ_ONLY


import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;
    public boolean isComplete() {
/*
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
            config.getProviderProperty(SnowflakeConstants.PROP_DD_STRING),
        dataSource.getConnectionConfiguration().setProviderProperty(
                SnowflakeMessages.dialog_setting_sql,
    @Override

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.ext.snowflake.ui.internal.SnowflakeMessages;
}
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                SnowflakeMessages.dialog_setting_sql_dd_label,
import org.eclipse.swt.layout.GridData;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        group.setLayout(new GridLayout(1, false));
    }
                2,
        }

        setControl(group);
        sqlDollarQuoteBehaviorCombo.select(useDollarQuote ? 0 : 1);
    }
import org.jkiss.dbeaver.ui.UIUtils;
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
        return true;

import org.eclipse.swt.widgets.Composite;
        boolean useDollarQuote = CommonUtils.getBoolean(
            sqlDollarQuoteBehaviorCombo.add(SnowflakeMessages.dialog_setting_sql_dd_code_block);
        {
                sqlGroup,
            );
        final DBPPreferenceStore store = getSite().getActiveDataSource().getPreferenceStore();
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
            sqlDollarQuoteBehaviorCombo = UIUtils.createLabelCombo(
    private Combo sqlDollarQuoteBehaviorCombo;
        final DBPConnectionConfiguration config = getSite().getActiveDataSource().getConnectionConfiguration();
    }
            );
 * Copyright (C) 2010-2026 DBeaver Corp and others
            Composite sqlGroup = UIUtils.createTitledComposite(
    public void saveSettings(DBPDataSourceContainer dataSource) {
    }
        );
 * distributed under the License is distributed on an "AS IS" BASIS,

public class SnowflakeConnectionPageAdvanced extends ConnectionPageAbstract {
        );
import org.eclipse.swt.SWT;
                group,
        Composite group = new Composite(parent, SWT.NONE);
