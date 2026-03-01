        plugin = null;
 *
 * You may obtain a copy of the License at
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.statistics";
    }
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import java.io.IOException;
 */

            (DBWorkbench.getPlatform().getApplication().isStatisticsCollectionRequired()
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        setPreferenceValue(PREF_FEATURE_TRACKING_ENABLED, enabled);
    private static UIStatisticsActivator plugin;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public static ImageDescriptor getImageDescriptor(String path) {
        if (enabled == isTrackingEnabled()) {
    // The plug-in ID
/*

        return DBWorkbench.isPlatformStarted() &&
 *
    public void start(BundleContext context) throws Exception {
    }


 *
    public static void setSkipDataShareConfirmation(boolean skip) {

    }

        super.start(context);

 * DBeaver - Universal Database Manager

        setPreferenceValue(PREF_SKIP_DATA_SHARE_CONFIRMATION, skip);
            || getDefault().getPreferences().getBoolean(PREF_FEATURE_TRACKING_ENABLED));
    private static void setPreferenceValue(String key, boolean value) {
    public void stop(BundleContext context) throws Exception {
 * you may not use this file except in compliance with the License.
        plugin = this;
    // The shared instance
    }
    public static final String PREF_SKIP_DATA_SHARE_CONFIRMATION = "feature.tracking.skipConfirmation";
    public static void setTrackingEnabled(boolean enabled) {
        } catch (IOException e) {

    }
    private static final Log log = Log.getLog(UIStatisticsActivator.class);
 * limitations under the License.


    public static boolean isSkipDataShareConfirmation() {
        }
}
 * See the License for the specific language governing permissions and
    public DBPPreferenceStore getPreferences() {
 * Unless required by applicable law or agreed to in writing, software
        return preferences;


    @Override
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
        return getDefault().getPreferences().getBoolean(PREF_SKIP_DATA_SHARE_CONFIRMATION);
    }
    public static boolean isTrackingEnabled() {
        preferences = new BundlePreferenceStore(getBundle());
        super.stop(context);
    private DBPPreferenceStore preferences;

        preferenceStore.setValue(key, value);
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;

        return plugin;

            preferenceStore.save();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            return;

    }
package org.jkiss.dbeaver.ui.statistics;
public class UIStatisticsActivator extends AbstractUIPlugin {
    public UIStatisticsActivator() {

            log.debug(e);
    @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
        try {
import org.osgi.framework.BundleContext;
        DBPPreferenceStore preferenceStore = getDefault().getPreferences();
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static UIStatisticsActivator getDefault() {
    public static final String PREF_FEATURE_TRACKING_ENABLED = "feature.tracking.enabled";
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;
        }
