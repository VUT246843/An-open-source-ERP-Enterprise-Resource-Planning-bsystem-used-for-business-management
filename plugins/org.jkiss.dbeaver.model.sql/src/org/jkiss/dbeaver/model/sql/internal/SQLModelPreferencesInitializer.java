 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.sql.internal;
        PrefUtils.setDefaultPreferenceValue(store, SQLModelPreferences.SQL_EDITOR_PROPOSAL_SHORT_NAME, false);

import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
import org.jkiss.dbeaver.model.sql.SQLTableAliasInsertMode;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.utils.PrefUtils;

 *
/*
public class SQLModelPreferencesInitializer extends AbstractPreferenceInitializer {
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.model.sql.format.tokenized.SQLFormatterTokenized;
        PrefUtils.setDefaultPreferenceValue(store, SQLModelPreferences.SQL_PROPOSAL_INSERT_TABLE_ALIAS, SQLTableAliasInsertMode.PLAIN);
 * See the License for the specific language governing permissions and
        PrefUtils.setDefaultPreferenceValue(store, SQLModelPreferences.SQL_FORMAT_FORMATTER, SQLFormatterTokenized.FORMATTER_ID);
        // Init default preferences

    public void initializeDefaultPreferences() {
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;


        PrefUtils.setDefaultPreferenceValue(store, SQLModelPreferences.SQL_EDITOR_PROPOSAL_ALWAYS_FQ, false);

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
}
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
        // Common
    public SQLModelPreferencesInitializer() {
 *
 */
    }
        //SQL Editor
