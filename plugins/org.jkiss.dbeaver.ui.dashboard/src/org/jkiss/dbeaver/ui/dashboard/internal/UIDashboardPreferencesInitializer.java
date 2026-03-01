/**

 * Licensed under the Apache License, Version 2.0 (the "License");
    public UIDashboardPreferencesInitializer() {
 * See the License for the specific language governing permissions and
 *


        // Init default preferences
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Preference initializer.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.PrefUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 *
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
}

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void initializeDefaultPreferences() {

package org.jkiss.dbeaver.ui.dashboard.internal;
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        PrefUtils.setDefaultPreferenceValue(store, DashboardConstants.PREF_OPEN_SEPARATE_CONNECTION, false);
    }
 * limitations under the License.
 */


 *
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
/*
    @Override
public class UIDashboardPreferencesInitializer extends AbstractPreferenceInitializer {
