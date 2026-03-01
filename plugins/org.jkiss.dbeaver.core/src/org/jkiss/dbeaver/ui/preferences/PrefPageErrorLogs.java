
    @NotNull
        logFilesMaxSizeSpinner.setSelection((int) store.getDefaultLong(LogOutputStream.LOGS_MAX_FILE_SIZE) / 1024);
                2);
    }
            logFilesMaxSizeSpinner.setSelection((int) (bigScriptSize / 1024));
            logFilesMaxSizeSpinner.setIncrement(10);
import org.eclipse.swt.SWT;
    }



                CoreMessages.pref_page_ui_general_label_enable_debug_logs_tip,
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.eclipse.ui.IWorkbenchPreferencePage;
                CoreMessages.pref_page_ui_general_group_debug_logs,

            logFilesMaxSizeSpinner = new Spinner(groupLogs, SWT.BORDER);
 *
        logFilesMaxCountSpinner.setSelection(store.getDefaultInt(LogOutputStream.LOGS_MAX_FILES_COUNT));
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.errorLogs"; //$NON-NLS-1$
        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);

            logFilesMaxCountSpinner.setMinimum(0);

import org.jkiss.dbeaver.DBeaverPreferences;
            logFilesMaxCountSpinner.setMaximum(Integer.MAX_VALUE);
 *
 *
            UIUtils.createControlLabel(groupLogs, CoreMessages.pref_page_ui_general_label_log_file_location);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.preferences;

import org.eclipse.ui.IWorkbench;
            UIUtils.createControlLabel(groupLogs, CoreMessages.pref_page_logs_files_max_size_label);

import org.jkiss.dbeaver.LogOutputStream;

import org.jkiss.dbeaver.utils.SystemVariablesResolver;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            Label tipLabel = UIUtils.createLabel(groupLogs, CoreMessages.pref_page_ui_general_label_options_take_effect_after_restart);
    @Override
            ContentAssistUtils.installContentProposal(
 * PrefPageErrorHandle
            logFilesMaxCountSpinner.setIncrement(1);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.UIUtils;
                composite,

            logFilesMaxCountSpinner.setDigits(0);
}            tipLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, GridData.VERTICAL_ALIGN_BEGINNING, false, false , 2, 1));

            logsDebugLocation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 */
            Composite groupLogs = UIUtils.createTitledComposite(
            );
import org.eclipse.swt.layout.GridData;
    private TextWithOpenFile logsDebugLocation;
            long bigScriptSize = preferenceStore.getLong(LogOutputStream.LOGS_MAX_FILE_SIZE);

    protected Control createPreferenceContent(@NotNull Composite parent) {
            logFilesMaxSizeSpinner.setDigits(0);
        store.setValue(LogOutputStream.LOGS_MAX_FILES_COUNT, logFilesMaxCountSpinner.getSelection());
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
                CoreMessages.pref_page_ui_general_label_enable_debug_logs,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            logsDebugLocation = new TextWithOpenFile(groupLogs, CoreMessages.pref_page_ui_general_label_open_file_text, new String[] { "*.log", "*.txt" } );
import org.jkiss.code.NotNull;
                    GeneralUtils.variablePattern(SystemVariablesResolver.VAR_WORKSPACE),
    @Override

                2,
 */
                store.getBoolean(DBeaverPreferences.LOGS_DEBUG_ENABLED),
    
        store.setValue(DBeaverPreferences.LOGS_DEBUG_ENABLED, logsDebugEnabled.getSelection());
        }
            // Logs
            logFilesMaxCountSpinner = new Spinner(groupLogs, SWT.BORDER);
/*
    protected void performDefaults() {
    private Button logsDebugEnabled;
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
{
/**
import org.jkiss.dbeaver.utils.PrefUtils;
 * limitations under the License.
    @Override
    private Spinner logFilesMaxSizeSpinner;
        return composite;
        logsDebugLocation.setText(store.getDefaultString(DBeaverPreferences.LOGS_DEBUG_LOCATION));
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
                    GeneralUtils.variablePattern(SystemVariablesResolver.VAR_HOME)));

import org.jkiss.dbeaver.runtime.DBWorkbench;
                logsDebugLocation.getTextControl(),
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    {
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
public class PrefPageErrorLogs extends AbstractPrefPage implements IWorkbenchPreferencePage
        store.setValue(DBeaverPreferences.LOGS_DEBUG_LOCATION, logsDebugLocation.getText());
    public void init(IWorkbench workbench)
        return super.performOk();
    @Override
import org.jkiss.dbeaver.core.CoreMessages;
        {


    private Spinner logFilesMaxCountSpinner;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.utils.GeneralUtils;
            logFilesMaxSizeSpinner.setMinimum(0);
        super.performDefaults();
                new StringContentProposalProvider(
        logsDebugEnabled.setSelection(store.getDefaultBoolean(DBeaverPreferences.LOGS_DEBUG_ENABLED));
    }
            int debugLogFilesMaxCount = preferenceStore.getInt(LogOutputStream.LOGS_MAX_FILES_COUNT);
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
            UIUtils.createControlLabel(groupLogs, CoreMessages.pref_page_logs_files_max_count_label);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        store.setValue(LogOutputStream.LOGS_MAX_FILE_SIZE, logFilesMaxSizeSpinner.getSelection() * 1024L);
                groupLogs,

                new SmartTextContentAdapter(),
            logsDebugLocation.setText(store.getString(DBeaverPreferences.LOGS_DEBUG_LOCATION));
            final DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
 * See the License for the specific language governing permissions and
            logFilesMaxSizeSpinner.setMaximum(Integer.MAX_VALUE);
    }
    public boolean performOk() {
            logFilesMaxCountSpinner.setSelection(debugLogFilesMaxCount);
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
        PrefUtils.savePreferenceStore(store);
import org.eclipse.swt.widgets.*;
            logsDebugEnabled = UIUtils.createCheckbox(
