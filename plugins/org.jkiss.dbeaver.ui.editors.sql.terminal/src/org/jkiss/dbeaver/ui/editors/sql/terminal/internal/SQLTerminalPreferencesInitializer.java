 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 * Unless required by applicable law or agreed to in writing, software

        PrefUtils.setDefaultPreferenceValue(store, SQLTerminalPreferencesConstants.SHOW_TERMINAL_VIEW_BY_DEFAULT, false);
import org.jkiss.dbeaver.utils.PrefUtils;
 *
        PrefUtils.setDefaultPreferenceValue(store, SQLTerminalPreferencesConstants.SHOW_QUERY_TEXT, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLTerminalPreferencesConstants.SHOW_SERVER_OUTPUT, true);
public class SQLTerminalPreferencesInitializer extends AbstractPreferenceInitializer {
 * DBeaver - Universal Database Manager
}
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    @Override
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
package org.jkiss.dbeaver.ui.editors.sql.terminal.internal;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
        // Init default preferences


import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
/*
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
    public SQLTerminalPreferencesInitializer() {

 * You may obtain a copy of the License at
    public void initializeDefaultPreferences() {
import org.jkiss.dbeaver.ui.editors.sql.terminal.SQLTerminalPreferencesConstants;
