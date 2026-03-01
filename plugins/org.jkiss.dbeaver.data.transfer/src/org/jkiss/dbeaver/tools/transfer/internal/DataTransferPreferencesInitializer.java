 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * You may obtain a copy of the License at
 *


    }
 * you may not use this file except in compliance with the License.
        PrefUtils.setDefaultPreferenceValue(store, DTConstants.PREF_OPEN_LOCAL_FS_BROWSER, false);
        final DBPPreferenceStore store = new BundlePreferenceStore(DTActivator.getDefault().getBundle());
        PrefUtils.setDefaultPreferenceValue(store, DTConstants.PREF_NAME_CASE_MAPPING, 0);

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
}
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public DataTransferPreferencesInitializer() {
 * See the License for the specific language governing permissions and
    @Override
/*
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.tools.transfer.internal;
 */
public class DataTransferPreferencesInitializer extends AbstractPreferenceInitializer {
import org.jkiss.dbeaver.tools.transfer.DTConstants;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    public void initializeDefaultPreferences() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        PrefUtils.setDefaultPreferenceValue(store, DTConstants.PREF_REPLACE_MAPPING, 0);

import org.jkiss.dbeaver.utils.PrefUtils;
        PrefUtils.setDefaultPreferenceValue(store, DTConstants.PREF_MAX_TYPE_LENGTH, DTConstants.DEFAULT_MAX_TYPE_LENGTH);
        PrefUtils.setDefaultPreferenceValue(store, DTConstants.PREF_SAVE_LOCAL_SETTINGS, true);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
 * limitations under the License.
