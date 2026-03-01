
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
{
    private Button traceAppendCheck;
            }
        traceAppendCheck.setSelection(
import org.eclipse.swt.widgets.Button;
        }
 */
        gl.marginWidth = 10;
 * See the License for the specific language governing permissions and
            int traceLevel = 0;
        setDescription(DB2Messages.db2_connection_trace_page_tab_description_trace_settings);
    @Override
    private ControlEnableState traceEnableState;
                CommonUtils.toString(
                    traceEnableState = null;
                traceEnableState = ControlEnableState.disable(traceGroup);
            new LevelConfig(DB2Constants.TRACE_SQLJ, DB2Messages.db2_connection_trace_page_checkbox_sql_j),
            new LevelConfig(DB2Constants.TRACE_PARAMETER_META_DATA, DB2Messages.db2_connection_trace_page_checkbox_parameter_metadata),
            new LevelConfig(DB2Constants.TRACE_RESULT_SET_CALLS, DB2Messages.db2_connection_trace_page_checkbox_result_set_calls),
        super.saveSettings(dataSource);

import org.jkiss.utils.CommonUtils;


 * Unless required by applicable law or agreed to in writing, software
            DB2Messages.db2_connection_trace_page_header_levels,
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.dispose();
        traceAppendCheck = UIUtils.createLabelCheckbox(traceGroup, DB2Messages.db2_connection_trace_page_checkbox_append, false);
        };
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        if (providerProperties.containsKey(DB2Constants.PROP_TRACE_FOLDER)) {
        levelsGroup.setLayoutData(gd);
        {
 *
            new LevelConfig(DB2Constants.TRACE_STATEMENT_CALLS, DB2Messages.db2_connection_trace_page_checkbox_statement_calls),
    @Override
/**
            null,
            CommonUtils.getBoolean(
            GridData.FILL_HORIZONTAL
                providerProperties.get(DB2Constants.PROP_TRACE_ENABLED), false));

    private Composite traceGroup;
package org.jkiss.dbeaver.ext.db2.ui.views;
                    providerProperties.get(DB2Constants.PROP_TRACE_FOLDER)));
    {
        enableTraceCheck.setSelection(
import org.eclipse.swt.widgets.Text;
                    traceEnableState.restore();
        traceGroup.setLayout(new GridLayout(2, false));
        setTitle(DB2Messages.db2_connection_trace_page_tab_trace_settings);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                providerProperties.get(DB2Constants.PROP_TRACE_APPEND), false));
            providerProperties.put(DB2Constants.PROP_TRACE_ENABLED, String.valueOf(enableTraceCheck.getSelection()));
                }
        setControl(cfgGroup);
        }
        fileNameText = UIUtils.createLabelText(
            CommonUtils.getBoolean(
            null);

        private LevelConfig(int level, String label)
                }
import org.jkiss.dbeaver.ui.UIUtils;
                if (level.checkbox.getSelection()) {
 * limitations under the License.
            public void widgetSelected(SelectionEvent e)
    }
        int traceLevel = CommonUtils.toInt(

 */
        enableTraceCheck = UIUtils.createCheckbox(cfgGroup, DB2Messages.db2_connection_trace_page_checkbox_enable_trace, false);
        }
    {
            level.checkbox = UIUtils.createCheckbox(levelsGroup, level.label, false);
            for (LevelConfig level : levels) {
            traceGroup,
            DB2Messages.db2_connection_trace_page_label_file_name,
        loadSettings();
            null,
            level.checkbox.setSelection((traceLevel & level.level) != 0);

        Button checkbox;
            {
    public DB2ConnectionTracePage()
        // Load values from new connection info
    private Text folderText;
                if (traceEnableState == null) {
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
    private Text fileNameText;
        return true;
import org.eclipse.swt.widgets.Composite;
            new LevelConfig(DB2Constants.TRACE_DIAGNOSTICS, DB2Messages.db2_connection_trace_page_checkbox_diagnostics),
        if (providerProperties.containsKey(DB2Constants.PROP_TRACE_FILE)) {
                    traceEnableState = ControlEnableState.disable(traceGroup);
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
            }
    {
                    traceLevel |= level.level;
            null,

        traceGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        saveConnectionURL(dataSource.getConnectionConfiguration());
    public void createControl(Composite parent)
    public void loadSettings()
        );
        cfgGroup.setLayout(gl);
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.dialogs.ControlEnableState;
        // Settings
        final String label;
        });

            if (traceEnableState == null) {
            new LevelConfig(DB2Constants.TRACE_XA_CALLS, DB2Messages.db2_connection_trace_page_checkbox_xa_calls),
        gl.marginHeight = 10;
        GridData gd = new GridData(GridData.FILL_BOTH);
        cfgGroup.setLayoutData(gd);

import org.eclipse.swt.layout.GridData;
        gd.horizontalSpan = 2;
            providerProperties.put(DB2Constants.PROP_TRACE_FOLDER, folderText.getText().trim());
            new LevelConfig(DB2Constants.TRACE_CONNECTION_CALLS, DB2Messages.db2_connection_trace_page_checkbox_connection_calls),

            new LevelConfig(DB2Constants.TRACE_CONNECTS, DB2Messages.db2_connection_trace_page_checkbox_connect),
        for (LevelConfig level : levels) {
        final int level;
import org.eclipse.swt.SWT;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2026 DBeaver Corp and others


    public void saveSettings(DBPDataSourceContainer dataSource)
            providerProperties.put(DB2Constants.PROP_TRACE_LEVEL, String.valueOf(traceLevel));
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 * you may not use this file except in compliance with the License.
    @Override
        {


            2,
        Map<String, String> providerProperties = connectionInfo.getProviderProperties();
public class DB2ConnectionTracePage extends ConnectionPageAbstract
        }
            new LevelConfig(DB2Constants.TRACE_DRDA_FLOWS, DB2Messages.db2_connection_trace_page_checkbox_drda_flows),
        }
 *
import java.util.Map;
    private static class LevelConfig {
import org.eclipse.swt.events.SelectionEvent;
            new LevelConfig(DB2Constants.TRACE_DRIVER_CONFIGURATION, DB2Messages.db2_connection_trace_page_checkbox_driver_configuration),
        Composite cfgGroup = new Composite(parent, SWT.NONE);
            this.label = label;
    @Override
            this.level = level;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
            @Override
        Map<String, String> providerProperties = dataSource.getConnectionConfiguration().getProviderProperties();
                CommonUtils.toString(
        GridLayout gl = new GridLayout(1, false);

        Composite levelsGroup = UIUtils.createTitledComposite(
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        traceGroup = new Composite(cfgGroup, SWT.NONE);
        }
            new LevelConfig(DB2Constants.TRACE_RESULT_SET_META_DATA, DB2Messages.db2_connection_trace_page_checkbox_result_set_metadata),
 *     http://www.apache.org/licenses/LICENSE-2.0

                } else {
    }
    {
 * OracleConnectionPage
        }
}
    }
 *
            traceGroup,
    }
        if (!enableTraceCheck.getSelection()) {
import org.eclipse.swt.events.SelectionAdapter;
            }

    public void dispose()
 * DBeaver - Universal Database Manager
            providerProperties.put(DB2Constants.PROP_TRACE_APPEND, String.valueOf(traceAppendCheck.getSelection()));
        for (LevelConfig level : levels) {

            traceGroup,
            folderText.setText(
            providerProperties.put(DB2Constants.PROP_TRACE_FILE, fileNameText.getText());
            DB2Messages.db2_connection_trace_page_string_trace);
        levels = new LevelConfig[] {
    private LevelConfig[] levels;
    private Button enableTraceCheck;
        enableTraceCheck.addSelectionListener(new SelectionAdapter() {
    public boolean isComplete()
        folderText = DialogUtils.createOutputFolderChooser(

            providerProperties.get(DB2Constants.PROP_TRACE_LEVEL));
    @Override
    }
    }
/*

            false,
                    providerProperties.get(DB2Constants.PROP_TRACE_FILE)));
            fileNameText.setText(
            DB2Messages.db2_connection_trace_page_label_folder,
