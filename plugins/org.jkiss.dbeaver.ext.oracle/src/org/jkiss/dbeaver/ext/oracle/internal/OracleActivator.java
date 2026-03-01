        preferences = new BundlePreferenceStore(getBundle());
    }
    }
     */
    /**

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
     * The constructor
     *

    }
    }

     * Returns the shared instance
    @Override
import org.osgi.framework.BundleContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
        plugin = null;
/*
    private DBPPreferenceStore preferences;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.oracle.internal;
    @Override
    /*
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        if (preferenceStore == null) {
        plugin = this;

    public void start(BundleContext context) throws Exception {
    // The plug-in ID
 * The activator class controls the plug-in life cycle
    /*
    // The preferences
    public static OracleActivator getDefault() {
        return plugin;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
    private static OracleActivator plugin;
     * (non-Javadoc)

    // The shared instance
public class OracleActivator extends Plugin {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBPPreferenceStore getPreferenceStore() {
     */
 *
     * @return the shared instance
    public void stop(BundleContext context) throws Exception {
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.oracle";
 */
        return preferenceStore;

 */

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 * DBeaver - Universal Database Manager
    private BundlePreferenceStore preferenceStore;
        // Create the preference store lazily.
     */
        super.start(context);

/**
    /**
 *
    public OracleActivator() {
     * (non-Javadoc)
}

            preferenceStore = new BundlePreferenceStore(getBundle());
        }
        super.stop(context);
import org.eclipse.core.runtime.Plugin;

 * See the License for the specific language governing permissions and
