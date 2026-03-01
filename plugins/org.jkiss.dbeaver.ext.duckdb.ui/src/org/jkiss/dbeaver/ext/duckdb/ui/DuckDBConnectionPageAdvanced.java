            sqlDollarQuotePlainCombo = UIUtils.createLabelCombo(sqlGroup, DuckDBMessages.dialog_setting_sql_dd_plain_label, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            Group sqlGroup = new Group(group, SWT.NONE);
            sqlGroup.setLayout(new GridLayout(2, false));
public class DuckDBConnectionPageAdvanced extends ConnectionPageAbstract {
 * distributed under the License is distributed on an "AS IS" BASIS,
        {
        setTitle("Advanced");
/*
        setControl(group);
    public void saveSettings(DBPDataSourceContainer dataSource) {

 *
            CommonUtils.toString(sqlDollarQuoteTagCombo.getSelectionIndex() == 0)
import org.eclipse.swt.SWT;
    private Combo sqlDollarQuotePlainCombo;
        sqlDollarQuoteTagCombo.select(CommonUtils.getBoolean(config.getProviderProperty(DuckDBConstants.PROP_DD_TAG_STRING), false) ? 0 : 1);
    private Combo sqlDollarQuoteTagCombo;
        return true;
 * limitations under the License.
    public void loadSettings() {

    public DuckDBConnectionPageAdvanced() {
import org.eclipse.swt.widgets.Combo;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Group;

        group.setLayoutData(new GridData(GridData.FILL_BOTH));
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public void createControl(Composite parent) {
        Composite group = new Composite(parent, SWT.NONE);
            sqlGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    @Override
    }
        loadSettings();
            sqlDollarQuoteTagCombo.add(DuckDBMessages.dialog_setting_sql_dd_string);

 *
            sqlGroup.setText(DuckDBMessages.dialog_setting_sql);
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
    }
    }

 */
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        sqlDollarQuotePlainCombo.select(CommonUtils.getBoolean(config.getProviderProperty(DuckDBConstants.PROP_DD_PLAIN_STRING), false) ? 0 : 1);
package org.jkiss.dbeaver.ext.duckdb.ui;
        dataSource.getConnectionConfiguration().setProviderProperty(
    }
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.utils.CommonUtils;
            sqlDollarQuotePlainCombo.add(DuckDBMessages.dialog_setting_sql_dd_string);
import org.jkiss.dbeaver.ext.duckdb.ui.internal.DuckDBMessages;
 * You may obtain a copy of the License at
        }
 *
    @Override
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.duckdb.model.DuckDBConstants;

}
    @Override
        final DBPConnectionConfiguration config = getSite().getActiveDataSource().getConnectionConfiguration();
            DuckDBConstants.PROP_DD_PLAIN_STRING,
 * you may not use this file except in compliance with the License.
        dataSource.getConnectionConfiguration().setProviderProperty(
    }
    @Override
 * Unless required by applicable law or agreed to in writing, software
            DuckDBConstants.PROP_DD_TAG_STRING,
import org.jkiss.dbeaver.ui.UIUtils;

            sqlDollarQuoteTagCombo = UIUtils.createLabelCombo(sqlGroup, DuckDBMessages.dialog_setting_sql_dd_tag_label, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.eclipse.swt.layout.GridData;

 *     http://www.apache.org/licenses/LICENSE-2.0


            CommonUtils.toString(sqlDollarQuotePlainCombo.getSelectionIndex() == 0)
        group.setLayout(new GridLayout(1, false));
            sqlDollarQuoteTagCombo.add(DuckDBMessages.dialog_setting_sql_dd_code_block);

import org.eclipse.swt.widgets.Composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );

        );
            sqlDollarQuotePlainCombo.add(DuckDBMessages.dialog_setting_sql_dd_code_block);
    public boolean isComplete() {
