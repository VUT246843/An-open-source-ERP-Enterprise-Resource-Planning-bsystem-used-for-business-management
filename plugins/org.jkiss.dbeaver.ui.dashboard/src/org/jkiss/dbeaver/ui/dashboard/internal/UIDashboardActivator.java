 *     http://www.apache.org/licenses/LICENSE-2.0
/*

    private DBPPreferenceStore preferences;
    private static UIDashboardActivator plugin;

import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
        plugin = null;

    public UIDashboardActivator() {

import org.osgi.framework.BundleContext;

    }
}
package org.jkiss.dbeaver.ui.dashboard.internal;
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
 * DBeaver - Universal Database Manager
    
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void stop(BundleContext context) throws Exception {
    }
        super.stop(context);
 * limitations under the License.
        preferences = new BundlePreferenceStore(getBundle());
 */
    // The shared instance
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Licensed under the Apache License, Version 2.0 (the "License");

        return preferences;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBPPreferenceStore getPreferences() {
 *
    public static UIDashboardActivator getDefault() {
    }
 * See the License for the specific language governing permissions and
 *
import org.eclipse.jface.resource.ImageDescriptor;
        plugin = this;

    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.dashboard";
    }

    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.dashboard.view.DashboardUpdateJob;
        DashboardUpdateJob.startUpdating();
    // The plug-in ID
 *
        return plugin;

    }
    public static ImageDescriptor getImageDescriptor(String path) {
public class UIDashboardActivator extends AbstractUIPlugin {
    @Override


    public void start(BundleContext context) throws Exception {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.start(context);
    }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.plugin.AbstractUIPlugin;
