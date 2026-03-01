        super.stop(context);
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static DBPPreferenceStore getPreferencesStore() {
        return new BundlePreferenceStore(getDefault().getBundle());
package org.jkiss.dbeaver.ui.editors.binary.internal;
    }
import org.eclipse.ui.plugin.AbstractUIPlugin;
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
        super.start(context);
 * limitations under the License.

    }


    }
import org.eclipse.jface.resource.ImageDescriptor;

 */
        plugin = this;

 *
    private static HexEditorsActivator plugin;

 * DBeaver - Universal Database Manager
}
 * You may obtain a copy of the License at
import org.osgi.framework.BundleContext;
    public HexEditorsActivator() {

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    public void stop(BundleContext context) throws Exception {
        return plugin;
 *

    public static ImageDescriptor getImageDescriptor(String path) {
    @Override
    // The plug-in ID
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *
    public void start(BundleContext context) throws Exception {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    public static HexEditorsActivator getDefault() {
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.editors.hex";
        plugin = null;

public class HexEditorsActivator extends AbstractUIPlugin {
    // The shared instance
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
