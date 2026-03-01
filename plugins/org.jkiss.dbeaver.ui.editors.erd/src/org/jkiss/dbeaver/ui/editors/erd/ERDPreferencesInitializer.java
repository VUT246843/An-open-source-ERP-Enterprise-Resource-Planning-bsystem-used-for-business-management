 * You may obtain a copy of the License at
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_PRINT_MARGIN_TOP, ERDUIConstants.PRINT_MARGIN_DEFAULT);
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS, true);
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_PRINT_MARGIN_RIGHT, ERDUIConstants.PRINT_MARGIN_DEFAULT);
 */
    }
        DBPPreferenceStore store = new BundlePreferenceStore(ERDUIActivator.getDefault().getBundle());
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_ROUTING_TYPE, ERDUIConstants.PREF_DEFAULT_ATTR_ERD_ROUTER_ID);
    public void initializeDefaultPreferences() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 * limitations under the License.
    @Override
 *
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_NOTATION_TYPE, ERDUIConstants.PREF_DEFAULT_ATTR_ERD_NOTATION_ID);
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_GRID_SNAP_ENABLED, true);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
 *
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS, false);
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_PRINT_MARGIN_BOTTOM, ERDUIConstants.PRINT_MARGIN_DEFAULT);
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_GRID_ENABLED, false);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_PRINT_MARGIN_LEFT, ERDUIConstants.PRINT_MARGIN_DEFAULT);

        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_DIAGRAM_CHANGE_HEADER_COLORS, true);

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.PrefUtils;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_DIAGRAM_CHANGE_BORDER_COLORS, true);
        // Init default preferences
public class ERDPreferencesInitializer extends AbstractPreferenceInitializer {
    public ERDPreferencesInitializer() {
/*
package org.jkiss.dbeaver.ui.editors.erd;
}        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_PRINT_PAGE_MODE, ERDUIConstants.PRINT_MODE_DEFAULT);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_GRID_HEIGHT, 20);

        PrefUtils.setDefaultPreferenceValue(store, ERDUIConstants.PREF_GRID_WIDTH, 20);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
