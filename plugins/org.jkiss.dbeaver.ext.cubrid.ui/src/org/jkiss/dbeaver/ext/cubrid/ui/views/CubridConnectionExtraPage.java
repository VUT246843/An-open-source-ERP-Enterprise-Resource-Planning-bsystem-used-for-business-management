                    SWT.ICON_ERROR
    	Group shardGroup = new Group(parent, SWT.NONE);
            int shardValue;

import org.eclipse.swt.widgets.Combo;
                    CubridMessages.dialog_connection_cubrid_properties_invalid_input_message,
            connectionInfo.setProperty(PROP_SHARD_TYPE, shardType);
    private static final String PROP_SHARD_TYPE = "shardType";
    public CubridConnectionExtraPage() {
        shardTypeCombo.setEnabled(enableControls);
}
            	shardValue = Integer.parseInt(shardValueStr);
        DBPDataSourceContainer dataSource = site.getActiveDataSource();
        shardVal = UIUtils.createLabelText(shardGroup, "Value", "");
public class CubridConnectionExtraPage extends ConnectionPageAbstract {
        }
import org.jkiss.utils.CommonUtils;
        if (CommonUtils.isEmpty(shardValue)) {

 * Licensed under the Apache License, Version 2.0 (the "License");
        Composite container = new Composite(parent, SWT.NONE);
package org.jkiss.dbeaver.ext.cubrid.ui.views;
    }
    }
        }
    @Override
        if (CommonUtils.isEmpty(shardType)) {
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Group;
        shardTypeCombo = UIUtils.createLabelCombo(shardGroup, "Shard Hint", SWT.DROP_DOWN | SWT.READ_ONLY);
                    CubridMessages.dialog_connection_cubrid_properties_invalid_input_title,


    private static final String SHARD_TYPE_ID = "SHARD ID";
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
    @Override
 *
    private static final String PROP_SHARD_VALUE = "shardValue";
        shardVal.setEnabled(enableControls);
                );
        String shardType = connectionInfo.getProperty(PROP_SHARD_TYPE);
        shardTypeCombo.add(SHARD_TYPE_VAL);
        shardVal.setText(shardValue);
            shardType = SHARD_TYPE_ID;
                    getShell(),


    	shardGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
    	shardGroup.setText(CubridMessages.dialog_connection_cubrid_properties_shard_setting);
 * Copyright (C) 2010-2025 DBeaver Corp and others

    private static final String SHARD_TYPE_VAL = "SHARD VAL";
        super.saveSettings(dataSource);
            } catch (NumberFormatException e) {

        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
            	UIUtils.showMessageBox(

 * limitations under the License.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        shardTypeCombo.setText(shardType);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
        shardTypeCombo.add(SHARD_TYPE_ID);

                    CubridMessages.dialog_connection_cubrid_properties_invalid_shard_id_message,
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    private static final String PROP_IS_SHARD = "isShard";
        setTitle(CubridMessages.dialog_connection_cubrid_properties);
    	shardGroup.setToolTipText(CubridMessages.dialog_connection_cubrid_properties_shard_tooltip);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.cubrid.ui.internal.CubridMessages;
        setControl(container);
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
 *
        createShardGroup(container, enableShardControls);
        setDescription(CubridMessages.dialog_connection_cubrid_properties_description);
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridData;

        }
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
    public void saveSettings(DBPDataSourceContainer dataSource) {
    private Text shardVal;
 * you may not use this file except in compliance with the License.
        shardTypeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
                    getShell(),
        container.setLayout(new GridLayout(1, false));
    private void createShardGroup(Composite parent, boolean enableControls) {
    @Override
                    CubridMessages.dialog_connection_cubrid_properties_invalid_shard_id_title,

 * See the License for the specific language governing permissions and
import org.eclipse.swt.SWT;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            shardValue = DEFAULT_SHARD_VALUE;

                return;
    public boolean isComplete() {

            try {


    private Combo shardTypeCombo;
        loadSettings();
    	shardGroup.setLayout(new GridLayout(2, false));
        boolean enableShardControls = dataSource.getName() == null || Boolean.parseBoolean(connectionInfo.getProperty(PROP_IS_SHARD));

            String shardType = shardTypeCombo.getText().trim();
        DBPDataSourceContainer dataSource = site.getActiveDataSource();
import org.eclipse.swt.widgets.Composite;
            connectionInfo.setProperty(PROP_SHARD_VALUE, shardValueStr);
import org.eclipse.swt.layout.GridLayout;


            String shardValueStr = shardVal.getText().trim();
/*
    }
                    SWT.ICON_ERROR
    }
    public void loadSettings() {
    private static final String DEFAULT_SHARD_VALUE = "0";
        return true;
            	return;
            if (SHARD_TYPE_ID.equals(shardType) && (shardValue < 0 || shardValue > 1)) {
                );
 * Unless required by applicable law or agreed to in writing, software
        super.loadSettings();
    public void createControl(Composite parent) {
        if (shardTypeCombo != null && shardVal != null) {
 *
            	UIUtils.showMessageBox(
            
 * You may obtain a copy of the License at
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,


        String shardValue = connectionInfo.getProperty(PROP_SHARD_VALUE);
 */
        shardVal.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
            }
