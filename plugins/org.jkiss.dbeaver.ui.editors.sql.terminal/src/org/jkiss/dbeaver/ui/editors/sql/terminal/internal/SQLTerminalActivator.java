 * limitations under the License.
 *
        preferences = new BundlePreferenceStore(getBundle());
        plugin = null;


    }
    }

 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.editors.sql.terminal.internal;
    private DBPPreferenceStore preferences;
    @Override
    }
    public SQLTerminalActivator() {
public class SQLTerminalActivator extends AbstractUIPlugin {
    private static SQLTerminalActivator plugin;

    }
        DBRFeatureRegistry.getInstance().registerFeatures(SQLTerminalFeatures.class);
        plugin = this;
    }
}
import org.eclipse.ui.plugin.AbstractUIPlugin;
    }
        return plugin;

    public DBPPreferenceStore getPreferences() {
    public static SQLTerminalActivator getDefault() {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    // The shared instance
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.editors.sql.terminal";

import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
import org.eclipse.jface.resource.ImageDescriptor;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @Override

    public void stop(BundleContext context) throws Exception {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.start(context);
 */
 * Unless required by applicable law or agreed to in writing, software
    // The plug-in ID
 * you may not use this file except in compliance with the License.
        return preferences;
    public void start(BundleContext context) throws Exception {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static ImageDescriptor getImageDescriptor(String path) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.editors.sql.terminal.SQLTerminalFeatures;


        super.stop(context);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.osgi.framework.BundleContext;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 *


