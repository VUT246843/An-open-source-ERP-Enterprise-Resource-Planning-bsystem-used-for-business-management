    public DBPPreferenceStore getPreferences() {
    }
        plugin = this;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 */
import org.eclipse.ui.plugin.AbstractUIPlugin;
        return imageDescriptorFromPlugin(PLUGIN_ID, path);

    }
import org.eclipse.jface.resource.ImageDescriptor;
 *

 * you may not use this file except in compliance with the License.
    private static UIChartsActivator plugin;
 * You may obtain a copy of the License at
        return preferences;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        preferences = new BundlePreferenceStore(getBundle());
        plugin = null;
}
 * limitations under the License.
    private DBPPreferenceStore preferences;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        return plugin;
    }
        super.stop(context);
import org.osgi.framework.BundleContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.start(context);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    // The plug-in ID
/*
    }
 * Unless required by applicable law or agreed to in writing, software
    }
    public static UIChartsActivator getDefault() {

    public static ImageDescriptor getImageDescriptor(String path) {

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    @Override
    // The shared instance
    public UIChartsActivator() {

    public void stop(BundleContext context) throws Exception {

public class UIChartsActivator extends AbstractUIPlugin {
package org.jkiss.dbeaver.ui.charts.internal;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void start(BundleContext context) throws Exception {
 *
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.charts";

    @Override
