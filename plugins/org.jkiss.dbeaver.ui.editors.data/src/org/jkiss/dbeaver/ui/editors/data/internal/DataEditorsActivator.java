    private static DataEditorsActivator plugin;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
    }
    }
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
        return preferences;
        plugin = this;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    // The shared instance
    }
    public void stop(BundleContext context) throws Exception {

package org.jkiss.dbeaver.ui.editors.data.internal;


    private DBPPreferenceStore preferences;
 *
 * you may not use this file except in compliance with the License.

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }
    public void start(BundleContext context) throws Exception {
 *

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    }
    @Override

    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.editors.data";
    @Override
        DBRFeatureRegistry.getInstance().registerFeatures(DataEditorFeatures.class);
 * DBeaver - Universal Database Manager
import org.osgi.framework.BundleContext;
        plugin = null;

public class DataEditorsActivator extends AbstractUIPlugin {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    // The plug-in ID

 * distributed under the License is distributed on an "AS IS" BASIS,
    public static ImageDescriptor getImageDescriptor(String path) {
        return plugin;

    }
import org.jkiss.dbeaver.ui.DataEditorFeatures;
        preferences = new BundlePreferenceStore(getBundle());
 * You may obtain a copy of the License at

        super.start(context);
        super.stop(context);
    public DBPPreferenceStore getPreferences() {
}
    public static DataEditorsActivator getDefault() {
    public DataEditorsActivator() {
/*
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
 */
