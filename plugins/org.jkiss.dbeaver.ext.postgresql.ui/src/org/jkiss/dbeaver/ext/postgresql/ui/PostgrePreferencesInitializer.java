
        // Init default preferences
 *

 * limitations under the License.
    @Override
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_SHOW_UNAVAILABLE_DB, false);
 *
 * Unless required by applicable law or agreed to in writing, software
        DBPPreferenceStore store = new BundlePreferenceStore(PostgreUIActivator.getDefault().getBundle());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *
}
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_SHOW_TEMPLATES_DB, false);

 * See the License for the specific language governing permissions and

        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE, false);
/*

        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_SHOW_NON_DEFAULT_DB, false);
package org.jkiss.dbeaver.ext.postgresql.ui;
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
    public void initializeDefaultPreferences() {
        // Common
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS, false);
import org.jkiss.dbeaver.ext.postgresql.PostgreUIActivator;
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
public class PostgrePreferencesInitializer extends AbstractPreferenceInitializer {
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_DD_TAG_STRING, 1);
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_DD_PLAIN_STRING, 1);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 * distributed under the License is distributed on an "AS IS" BASIS,
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_READ_ALL_DATA_TYPES, false);
 */
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        PrefUtils.setDefaultPreferenceValue(store, PostgreConstants.PROP_SHOW_DATABASE_STATISTICS, false);
