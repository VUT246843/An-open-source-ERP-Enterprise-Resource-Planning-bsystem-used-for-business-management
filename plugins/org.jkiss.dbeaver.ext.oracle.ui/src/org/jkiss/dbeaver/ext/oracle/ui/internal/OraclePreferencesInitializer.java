 *     http://www.apache.org/licenses/LICENSE-2.0
        // Common
 * limitations under the License.
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_USE_META_OPTIMIZER, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY, true);
 *
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
/*
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_EXPLAIN_TABLE_NAME, "");

        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES, false);
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_SUPPORT_ROWID, true);
 * Unless required by applicable law or agreed to in writing, software
    }
public class OraclePreferencesInitializer extends AbstractPreferenceInitializer {

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
package org.jkiss.dbeaver.ext.oracle.ui.internal;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_DBMS_OUTPUT, true);
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_USE_RULE_HINT, false);
import org.jkiss.dbeaver.utils.PrefUtils;
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_SHOW_DATE_AS_DATE, false);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING ,true);
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS, false);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        // Init default preferences
 * DBeaver - Universal Database Manager
}
        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS, false);

        PrefUtils.setDefaultPreferenceValue(store, OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS, true);
 */
        DBPPreferenceStore store = new BundlePreferenceStore(OracleUIActivator.getDefault().getBundle());
    @Override
 * You may obtain a copy of the License at
    public void initializeDefaultPreferences() {
