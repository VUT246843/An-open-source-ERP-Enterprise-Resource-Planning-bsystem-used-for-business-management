
    // The shared instance

import org.osgi.framework.BundleContext;
 * DBeaver - Universal Database Manager
        super.start(context);
public class GISViewerActivator extends Plugin {
    /**
    public static GISViewerActivator getDefault() {
    public InputStream getResourceStream(String path) {
        plugin = this;
 * See the License for the specific language governing permissions and

    @Override
    private DBPPreferenceStore preferences;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
    @Override
        return GISViewerActivator.class.getClassLoader().getResourceAsStream(path);
    /**
import java.io.InputStream;
    }

     * @return the shared instance
        super.stop(context);
     * The constructor
package org.jkiss.dbeaver.ui.gis.internal;
     */
}
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * You may obtain a copy of the License at
    public GISViewerActivator() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return preferences;
    private static GISViewerActivator plugin;
 */
    public void start(BundleContext context) throws Exception {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/*
 */
 *
     *

    }
        plugin = null;
    }
/**
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
        return plugin;
 *

import org.eclipse.core.runtime.Plugin;
 * limitations under the License.
     * Returns the shared instance
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.data.gis.view";
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
    public void stop(BundleContext context) throws Exception {
    public DBPPreferenceStore getPreferences() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

 * The activator class controls the plug-in life cycle
    }

    }
        preferences = new BundlePreferenceStore(getBundle());
