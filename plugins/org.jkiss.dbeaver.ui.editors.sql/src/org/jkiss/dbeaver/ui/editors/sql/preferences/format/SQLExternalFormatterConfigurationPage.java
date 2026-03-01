import org.eclipse.swt.layout.GridData;
 * Unless required by applicable law or agreed to in writing, software
            ? store.getDefaultString(ModelPreferences.SQL_FORMAT_EXTERNAL_CMD)
        store.setValue(ModelPreferences.SQL_FORMAT_EXTERNAL_FILE, externalUseFile.getSelection());

        externalCmdText = UIUtils.createLabelText(settingsGroup, SQLEditorMessages.pref_page_sql_format_label_external_command_line, "");
        externalTimeout = UIUtils.createLabelSpinner(settingsGroup,
        Composite settingsGroup = UIUtils.createTitledComposite(
    @Override
            2);
import org.jkiss.dbeaver.model.sql.format.external.SQLFormatterExternal;
}
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

        externalCmdText.setText(useDefaults
            parent,
        store.setValue(ModelPreferences.SQL_FORMAT_EXTERNAL_CMD, externalCmdText.getText());
import org.jkiss.dbeaver.utils.GeneralUtils;
                new StringContentProposalProvider(
    }
    protected Composite createFormatSettings(Composite parent) {
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
    private Spinner externalTimeout;
 * Copyright (C) 2010-2026 DBeaver Corp and others

        externalCmdText.setLayoutData(gd);
        super.saveSettings(store);
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
 *
                    GeneralUtils.variablePattern(SQLFormatterExternal.VAR_FILE)));
import org.eclipse.swt.widgets.Spinner;
        externalTimeout.setSelection(useDefaults
        externalUseFile = UIUtils.createCheckbox(settingsGroup,
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);


 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
            : store.getInt(ModelPreferences.SQL_FORMAT_EXTERNAL_TIMEOUT)
            ? store.getDefaultBoolean(ModelPreferences.SQL_FORMAT_EXTERNAL_FILE)
                externalCmdText,
            ? store.getDefaultInt(ModelPreferences.SQL_FORMAT_EXTERNAL_TIMEOUT)
            SQLEditorMessages.pref_page_sql_format_label_settings,
 * limitations under the License.
    public void loadSettings(@NotNull DBPPreferenceStore store, boolean useDefaults) {
    private Button externalUseFile;

 *
            4,
            : store.getBoolean(ModelPreferences.SQL_FORMAT_EXTERNAL_FILE)
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ModelPreferences;

        );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;

        externalUseFile.setSelection(useDefaults

        externalTimeout.setIncrement(10);
            false,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Text;
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
            SQLEditorMessages.pref_page_sql_format_label_external_use_temp_file,
        super.loadSettings(store, useDefaults);
import org.eclipse.swt.widgets.Button;
                new SmartTextContentAdapter(),
        gd.horizontalSpan = 3;
            GridData.FILL_HORIZONTAL,
 */
            0
        );
            SQLEditorMessages.pref_page_sql_format_label_external_exec_timeout,
    @Override
 * you may not use this file except in compliance with the License.
        store.setValue(ModelPreferences.SQL_FORMAT_EXTERNAL_TIMEOUT, externalTimeout.getSelection());

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
public class SQLExternalFormatterConfigurationPage extends BaseFormatterConfigurationPage {
            100, 100, Integer.MAX_VALUE);
import org.eclipse.swt.widgets.Composite;
import org.jkiss.code.NotNull;
            : store.getString(ModelPreferences.SQL_FORMAT_EXTERNAL_CMD)
        );
    }
 * You may obtain a copy of the License at
/*
            SQLEditorMessages.pref_page_sql_format_label_external_use_temp_file_tip + " " + GeneralUtils.variablePattern(SQLFormatterExternal.VAR_FILE),
            SQLEditorMessages.pref_page_sql_format_label_external_exec_timeout_tip,
        return parent;
        UIUtils.setContentProposalToolTip(externalCmdText, SQLEditorMessages.pref_page_sql_format_label_external_set_content_tool_tip, SQLFormatterExternal.VAR_FILE);
        );
        ContentAssistUtils.installContentProposal(
 *
    public void saveSettings(@NotNull DBPPreferenceStore store) {
    private Text externalCmdText;
package org.jkiss.dbeaver.ui.editors.sql.preferences.format;
