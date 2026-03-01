    }
            showServerOutput.setSelection(store.getBoolean(SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT));
            false,
    @Override
            || store.contains(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT)
    }

            showQueryText.setSelection(store.getBoolean(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT));
    }
        showQueryText.setSelection(store.getDefaultBoolean(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT));
import org.eclipse.swt.widgets.Composite;
            store.setValue(SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT, showServerOutput.getSelection());
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            SQLTerminalMessages.pref_page_sql_temrinal_show_output_console_view_label,
    @Override
            log.warn(e);
import org.jkiss.dbeaver.utils.PrefUtils;
/*

    @Override
import org.jkiss.code.NotNull;

 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
}        return composite;
    }
    @Override

        PrefUtils.savePreferenceStore(store);
            composite,
            store.setValue(SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT, showTerminalViewByDefault.getSelection());
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return store.contains(SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT)
        try {
    @NotNull
        );
            2
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
        showServerOutput.setSelection(store.getDefaultBoolean(SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT));
            showTerminalViewByDefault.setSelection(store.getBoolean(SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT));
    protected void performDefaults() {
    protected Control createPreferenceContent(@NotNull Composite parent) {
            GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
    @Override
            2
import org.eclipse.swt.widgets.Control;

            null,
package org.jkiss.dbeaver.ui.editors.sql.terminal;
 *
        return true;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        showQueryText = UIUtils.createCheckbox(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        } catch (Exception e) {
            SQLTerminalMessages.pref_page_sql_temrinal_show_query_text_label,
        
        } catch (Exception e) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLTerminalPreferencesPage extends TargetPrefPage {
            false,

 * See the License for the specific language governing permissions and
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            2
            commonGroup,
 */
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        return PAGE_ID;
        Composite commonGroup = UIUtils.createTitledComposite(
        try {
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
            SQLTerminalMessages.pref_page_sql_temrinal_show_server_output_label,

    @Override
        }
            null,
    private static final Log log = Log.getLog(SQLTerminalPreferencesPage.class);
    private Button showServerOutput;
        );

            || store.contains(SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT);
        super.performDefaults();

    }
            commonGroup,
            log.warn(e);
    protected void clearPreferences(@NotNull DBPPreferenceStore store) {

    protected boolean hasDataSourceSpecificOptions(@NotNull DBPDataSourceContainer dataSourceDescriptor) {
        showServerOutput = UIUtils.createCheckbox(
        store.setToDefault(SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sqleditor.terminalview"; //$NON-NLS-1$
 *
 * you may not use this file except in compliance with the License.
        store.setToDefault(SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT);
    @Override
 * Unless required by applicable law or agreed to in writing, software
        }

    private Button showQueryText;
        );
import org.eclipse.swt.layout.GridData;
    }
    private Button showTerminalViewByDefault;
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ui.editors.sql.terminal.internal.SQLTerminalMessages;
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {

        store.setToDefault(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT);
            false,
        showTerminalViewByDefault = UIUtils.createCheckbox(
 * DBeaver - Universal Database Manager
    }
    }
            commonGroup,
        );
            2,
    protected boolean supportsDataSourceSpecificOptions() {
            store.setValue(SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT, showQueryText.getSelection());
            SQLTerminalMessages.pref_page_sql_temrinal_show_output_console_view_tip,
    @NotNull
 *
        Composite composite = UIUtils.createPlaceholder(parent, 2, 5);

    protected String getPropertyPageID() {
import org.eclipse.swt.widgets.Button;
        showTerminalViewByDefault.setSelection(store.getDefaultBoolean(SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT));
 *     http://www.apache.org/licenses/LICENSE-2.0
            SQLEditorMessages.pref_page_sql_editor_group_common,
