 * DBeaver - Universal Database Manager
    // The shared instance
        preferences = new BundlePreferenceStore(getBundle());

    }
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    @Override
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 *
        super.start(context);
public class UINavigatorActivator extends AbstractUIPlugin {
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;

 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    private DBPPreferenceStore preferences;

    public static ImageDescriptor getImageDescriptor(String path) {
        plugin = null;
package org.jkiss.dbeaver.ui.internal;
}
    private static UINavigatorActivator plugin;
 * Unless required by applicable law or agreed to in writing, software
        DBRFeatureRegistry.getInstance().registerFeatures(EntityEditorFeatures.class);
 * See the License for the specific language governing permissions and
import org.osgi.framework.BundleContext;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public void start(BundleContext context) throws Exception {

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

    // The plug-in ID
 *
        return plugin;
    public UINavigatorActivator() {
import org.eclipse.jface.resource.ImageDescriptor;
    }
    }
    public static UINavigatorActivator getDefault() {

/*
 * you may not use this file except in compliance with the License.

        return preferences;
    }
        plugin = this;
 */

    }
 *
import org.eclipse.ui.plugin.AbstractUIPlugin;
        super.stop(context);
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.navigator";

 * limitations under the License.
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorFeatures;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void stop(BundleContext context) throws Exception {
 * You may obtain a copy of the License at
    public DBPPreferenceStore getPreferences() {
