/*
        // Init default preferences
 * See the License for the specific language governing permissions and

        // QM
package org.jkiss.dbeaver.core;
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_OBJECT_TYPES,

            QMObjectType.toString(Arrays.asList(QMObjectType.txn, QMObjectType.query)));
public class DesktopPreferencesInitializer extends AbstractPreferenceInitializer {
        DBPPreferenceStore store = new BundlePreferenceStore(DBeaverActivator.getInstance().getBundle());
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_STORE_LOG_FILE, false);

        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.UI_KEEP_DATABASE_EDITORS_ON_DISCONNECT, true);
 * Licensed under the Apache License, Version 2.0 (the "License");

        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.UI_STATUS_BAR_SHOW_STATUS_LINE, true);
        PrefUtils.setDefaultPreferenceValue(store, ScreenReaderPreferences.PREF_FORCE_FOCUS_ON_EDITOR, false);

 */
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_ENTRIES_PER_PAGE, 200);
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_QUERY_TYPES,
import org.jkiss.dbeaver.DBeaverPreferences;
import org.jkiss.dbeaver.ui.editors.DatabaseEditorPreferences.BreadcrumbLocation;
            !ApplicationPolicyService.getInstance().isInstallUpdateDisabled());
import org.jkiss.dbeaver.ui.preferences.UIPreferences;
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.AGENT_ENABLED, true);

        PrefUtils.setDefaultPreferenceValue(store, UIPreferences.UI_USE_EMBEDDED_AUTH, false);
        // Agent
import java.util.Arrays;
    }
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.AGENT_LONG_OPERATION_TIMEOUT, 30);
    public void initializeDefaultPreferences() {
 *
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.LOGS_DEBUG_ENABLED, true);
 *
        PrefUtils.setDefaultPreferenceValue(store, ScreenReaderPreferences.PREF_SCREEN_READER_ACCESSIBILITY, ScreenReader.DEFAULT);
 * You may obtain a copy of the License at

import java.io.File;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.qm.QMObjectType;
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_HISTORY_DAYS, 90);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.UI_SHOW_HOLIDAY_DECORATIONS, true);
        // General UI
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.LogOutputStream;
 * you may not use this file except in compliance with the License.

        // Logs
        PrefUtils.setDefaultPreferenceValue(store, LogOutputStream.LOGS_MAX_FILE_SIZE, LogOutputStream.DEFAULT_MAX_LOG_SIZE);
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
        // Resources
import org.jkiss.dbeaver.ui.screenreaders.ScreenReader;
 *
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.LOGS_DEBUG_LOCATION,
import org.jkiss.dbeaver.ui.screenreaders.ScreenReaderPreferences;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.TEXT_EDIT_UNDO_LEVEL, 200);
import org.jkiss.dbeaver.model.DBConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        //PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.DEFAULT_RESOURCE_ENCODING, GeneralUtils.UTF8_ENCODING);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.RuntimeUtils;
    @Override

import org.jkiss.dbeaver.model.qm.QMConstants;


        PrefUtils.setDefaultPreferenceValue(store, LogOutputStream.LOGS_MAX_FILES_COUNT, LogOutputStream.DEFAULT_MAX_LOG_FILES_COUNT);
 * limitations under the License.
import org.jkiss.dbeaver.core.ui.services.ApplicationPolicyService;
 * distributed under the License is distributed on an "AS IS" BASIS,

            "${" + SystemVariablesResolver.VAR_WORKSPACE + "}" + File.separator + ".metadata" + File.separator + DBConstants.DEBUG_LOG_FILE_NAME);
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.AGENT_LONG_OPERATION_NOTIFY, RuntimeUtils.isWindows());
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.UI_STATUS_BAR_SHOW_BREADCRUMBS, BreadcrumbLocation.IN_STATUS_BAR);
import org.jkiss.dbeaver.utils.PrefUtils;
            DBCExecutionPurpose.USER + "," + DBCExecutionPurpose.USER_FILTERED + "," + DBCExecutionPurpose.USER_SCRIPT);
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.UI_AUTO_UPDATE_CHECK,
 * DBeaver - Universal Database Manager
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.UI_KEEP_DATABASE_EDITORS, true);
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.NAVIGATOR_EDITOR_FULL_NAME, false);
    public DesktopPreferencesInitializer() {
        PrefUtils.setDefaultPreferenceValue(store, DBeaverPreferences.SECURITY_USE_BOUNCY_CASTLE, true);
