 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *
import org.osgi.framework.BundleContext;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    }
    private static SQLEditorActivator plugin;
    public void stop(BundleContext context) throws Exception {
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.editors.sql";
import org.eclipse.ui.plugin.AbstractUIPlugin;
        super.start(context);
import org.eclipse.jface.resource.ImageDescriptor;
    }
        plugin = this;

 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        return plugin;
        preferences = new BundlePreferenceStore(getBundle());
    public void start(BundleContext context) throws Exception {
    @Override
    }
 * Unless required by applicable law or agreed to in writing, software
        DBRFeatureRegistry.getInstance().registerFeatures(SQLEditorFeatures.class);

 * distributed under the License is distributed on an "AS IS" BASIS,

        return preferences;
    public static ImageDescriptor getImageDescriptor(String path) {

        super.stop(context);
    public SQLEditorActivator() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
    }
    }
 * limitations under the License.
/*

    public DBPPreferenceStore getPreferences() {
    public static SQLEditorActivator getDefault() {
 * See the License for the specific language governing permissions and
 *
public class SQLEditorActivator extends AbstractUIPlugin {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
package org.jkiss.dbeaver.ui.editors.sql.internal;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;

        plugin = null;
    private DBPPreferenceStore preferences;


 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.editors.sql.SQLEditorFeatures;

    // The plug-in ID
    // The shared instance
