
 * limitations under the License.
}
import org.jkiss.dbeaver.ui.UIUtils;
        }


    }
 * See the License for the specific language governing permissions and

    @Override
    }
import org.jkiss.utils.CommonUtils;
                true,
 * SQL Server auth model config
import org.jkiss.code.NotNull;


        super.resetSettings(dataSource);
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            dataSource.getConnectionConfiguration().removeProperty(

    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Composite;
 *
        if (isCheck != null) {
                parent,
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;

public class SQLServerAuthConfigurator extends DatabaseNativeAuthModelConfigurator {
    @Override
                "Enable integrated security (by default it is required for NTLM)",
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {

            isCheck.setSelection(
                2);
 * DBeaver - Universal Database Manager
    @Override
                    true));
 */
        }
        }
 * You may obtain a copy of the License at
        if (object instanceof SQLServerAuthModelNTLM) {
import org.jkiss.dbeaver.model.access.DBAAuthModel;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.mssql.ui.views;


        }
        if (isCheck != null) {
    public void resetSettings(@NotNull DBPDataSourceContainer dataSource) {
    }
 *
/*
 *
                "Use integrated security",
    }
        super.loadSettings(dataSource);
 */
                SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.dialogs.connection.DatabaseNativeAuthModelConfigurator;
        if (isCheck != null) {
            dataSource.getConnectionConfiguration().setProperty(

    private Button isCheck;
    public void createControl(@NotNull Composite parent, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.eclipse.swt.widgets.Button;
                CommonUtils.getBoolean(
 *     http://www.apache.org/licenses/LICENSE-2.0
        super.saveSettings(dataSource);
        super.createControl(parent, object, propertyChangeListener);
    @Override
import org.jkiss.dbeaver.ext.mssql.auth.SQLServerAuthModelNTLM;
                String.valueOf(isCheck.getSelection()));
                SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY);
                    dataSource.getConnectionConfiguration().getProperty(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY),
            isCheck = UIUtils.createCheckbox(
