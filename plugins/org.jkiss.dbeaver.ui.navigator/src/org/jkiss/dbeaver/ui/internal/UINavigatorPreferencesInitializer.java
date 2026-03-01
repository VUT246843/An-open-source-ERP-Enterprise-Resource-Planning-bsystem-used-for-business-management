
 * limitations under the License.
import org.jkiss.dbeaver.utils.PrefUtils;
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_CONNECTION_DOUBLE_CLICK,
 *

 * Preference initializer.
            NavigatorPreferences.DoubleClickBehavior.EXPAND.name());

        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO, true);
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.internal;
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_COLOR_ALL_NODES, false);
 * Note: in order to activate this class we have to initiate preferences in activator (see UINavigatorActivator class)
/**
 * you may not use this file except in compliance with the License.

}
 *     http://www.apache.org/licenses/LICENSE-2.0
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.ENTITY_EDITOR_DETACH_INFO, true);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        // Navigator
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE, false);
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_RESTORE_FILTER, true);

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_EXPAND_ON_CONNECT, false);

public class UINavigatorPreferencesInitializer extends AbstractPreferenceInitializer {

            NavigatorPreferences.DoubleClickBehavior.EDIT.name());
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_TOOLTIPS, true);

    @Override
 */
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_OBJECT_TIPS, true);

        DBPPreferenceStore store = ModelPreferences.getPreferences();
 * Unless required by applicable law or agreed to in writing, software
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_CONTENTS_IN_TOOLTIP, false);
 *
/*
    }
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_EDITOR_SHOW_TABLE_GRID, false);
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME, true);
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_REFRESH_EDITORS_ON_OPEN, false);
    public void initializeDefaultPreferences() {
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_DEFAULT_EDITOR_PAGE, "");
    public UINavigatorPreferencesInitializer() {
 * You may obtain a copy of the License at
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_CHILD_COUNT, false);
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_GROUP_BY_DRIVER, false);
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_OBJECT_DOUBLE_CLICK,
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE, 5000);
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH, 0);
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS, true);
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_SQL_PREVIEW, true);
import org.jkiss.dbeaver.ModelPreferences;
 *
 */
        // Init default preferences
        PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION, false);
