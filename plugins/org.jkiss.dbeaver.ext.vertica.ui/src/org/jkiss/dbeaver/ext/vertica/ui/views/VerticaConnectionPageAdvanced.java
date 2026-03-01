    public boolean isComplete() {
    public VerticaConnectionPageAdvanced() {
            sqlDollarQuoteBehaviorCombo.add(VerticaUIMessages.connection_page_sql_dd_code_block);
 * See the License for the specific language governing permissions and
    public void loadSettings() {
            GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
    private Combo sqlDollarQuoteBehaviorCombo;
        loadSettings();
    }
                String.valueOf(disableCommentsReading.getSelection()));
    }
                VerticaConstants.PROP_DOLLAR_QUOTES_AS_STRING,
            Group advancedSettings = new Group(group, SWT.NONE);
            advancedSettings.setText(VerticaUIMessages.connection_page_group_performance);
                advancedSettings,
import org.eclipse.swt.layout.GridData;
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();

    @Override
 *

        if (disableCommentsReading != null) {
    }
import org.eclipse.swt.widgets.Composite;
            connectionInfo.getProviderProperty(VerticaConstants.PROP_DOLLAR_QUOTES_AS_STRING)) ? 0 : 1);

import org.jkiss.dbeaver.ext.vertica.VerticaConstants;
                1);
        group.setLayoutData(new GridData(GridData.FILL_BOTH));

    public void createControl(Composite parent) {
            advancedSettings.setLayoutData(gridData);
                SWT.DROP_DOWN | SWT.READ_ONLY);

            disableCommentsReading = UIUtils.createCheckbox(
            sqlGroup.setLayout(new GridLayout(2, false));
                VerticaUIMessages.connection_page_group_checkbox_disable_comments_tip,
    private Button disableCommentsReading;
        setControl(group);
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
 */
        super.saveSettings(dataSource);
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
 *
/*
                String.valueOf(sqlDollarQuoteBehaviorCombo.getSelectionIndex() == 0));
 * limitations under the License.
    @Override

        return true;
import org.eclipse.swt.layout.GridLayout;
package org.jkiss.dbeaver.ext.vertica.ui.views;

    }
        }
        sqlDollarQuoteBehaviorCombo.select(CommonUtils.toBoolean(
import org.jkiss.dbeaver.ext.vertica.ui.internal.VerticaUIMessages;
    @Override
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

        group.setLayout(new GridLayout(1, false));
                VerticaConstants.PROP_DISABLE_COMMENTS_READING,
        }
            connectionInfo.getProviderProperty(VerticaConstants.PROP_DISABLE_COMMENTS_READING)));
        setTitle("Vertica");
            gridData.horizontalSpan = 4;
        }

}

                VerticaUIMessages.connection_page_sql_dd_label,
        disableCommentsReading.setSelection(CommonUtils.toBoolean(
 * Copyright (C) 2010-2024 DBeaver Corp and others
            sqlDollarQuoteBehaviorCombo.add(VerticaUIMessages.connection_page_sql_dd_string);
    @Override
            Group sqlGroup = new Group(group, SWT.NONE);
    public void saveSettings(DBPDataSourceContainer dataSource) {
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
 * You may obtain a copy of the License at
                sqlGroup,
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Combo;
    }
        if (sqlDollarQuoteBehaviorCombo != null) {
            connectionInfo.setProviderProperty(
 * Unless required by applicable law or agreed to in writing, software

        Composite group = new Composite(parent, SWT.NONE);
        super.loadSettings();

 * Licensed under the Apache License, Version 2.0 (the "License");
            connectionInfo.setProviderProperty(
        {
                false,
            sqlGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 *
                VerticaUIMessages.connection_page_group_checkbox_disable_comments,

            sqlGroup.setText(VerticaUIMessages.connection_page_setting_sql);

import org.jkiss.utils.CommonUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
        {
 * DBeaver - Universal Database Manager
            advancedSettings.setLayout(new GridLayout(1, false));
            sqlDollarQuoteBehaviorCombo = UIUtils.createLabelCombo(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.SWT;
public class VerticaConnectionPageAdvanced extends ConnectionPageAbstract {
