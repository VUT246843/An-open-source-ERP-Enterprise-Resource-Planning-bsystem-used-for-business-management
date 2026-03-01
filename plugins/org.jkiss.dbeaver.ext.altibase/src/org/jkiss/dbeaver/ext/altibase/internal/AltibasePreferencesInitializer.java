 * limitations under the License.

package org.jkiss.dbeaver.ext.altibase.internal;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        PrefUtils.setDefaultPreferenceValue(store, AltibaseConstants.PREF_DBMS_OUTPUT, true);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

/*
 */
 *
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
        PrefUtils.setDefaultPreferenceValue(store, AltibaseConstants.PREF_EXPLAIN_PLAN_TYPE, 0);

    public AltibasePreferencesInitializer() {
public class AltibasePreferencesInitializer extends AbstractPreferenceInitializer {
import org.jkiss.dbeaver.utils.PrefUtils;
 * Unless required by applicable law or agreed to in writing, software
        PrefUtils.setDefaultPreferenceValue(store, AltibaseConstants.PREF_PLAN_PREFIX, true);

    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

 * DBeaver - Universal Database Manager
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
}         DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    public void initializeDefaultPreferences() {
