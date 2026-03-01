
 */
    }
        PrefUtils.setDefaultPreferenceValue(store, CubridConstants.PREF_DBMS_OUTPUT, true);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
        PrefUtils.setPreferenceDefaultValue(store, CubridConstants.PREF_DBMS_OUTPUT_BUFFER_SIZE, 10000);
 *

 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.utils.PrefUtils;
package org.jkiss.dbeaver.ext.cubrid.internal;
    public CubridPreferencesInitializer() {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}  * you may not use this file except in compliance with the License.
/*
 *
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
    }
public class CubridPreferencesInitializer extends AbstractPreferenceInitializer {
 * DBeaver - Universal Database Manager
    public void initializeDefaultPreferences() {


