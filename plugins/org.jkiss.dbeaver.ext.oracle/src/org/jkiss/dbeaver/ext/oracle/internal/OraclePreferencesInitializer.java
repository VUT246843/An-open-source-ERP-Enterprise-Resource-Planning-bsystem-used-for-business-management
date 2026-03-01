package org.jkiss.dbeaver.ext.oracle.internal;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
    {
 *
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

    public OraclePreferencesInitializer()
 */
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
        // Metadata optimization
 * Unless required by applicable law or agreed to in writing, software
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY, true);
    public void initializeDefaultPreferences()
 *
 * DBeaver - Universal Database Manager
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_USE_META_OPTIMIZER, true);
    }
public class OraclePreferencesInitializer extends AbstractPreferenceInitializer {
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING, true);


 * limitations under the License.
    {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others

/*
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_DBMS_OUTPUT, true);

import org.jkiss.dbeaver.runtime.DBWorkbench;
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_SUPPORT_ROWID, true);
import org.jkiss.dbeaver.utils.PrefUtils;
        // Common
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS, true);
 *
    @Override
}  * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at


 * distributed under the License is distributed on an "AS IS" BASIS,
        // Init default preferences
