 * you may not use this file except in compliance with the License.

    @Override
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLServerActivator extends Plugin {
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.mssql";
        plugin = null;

 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    }
 * See the License for the specific language governing permissions and

    public SQLServerActivator() {
    // The plug-in ID
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
    public static SQLServerActivator getDefault() {

 * distributed under the License is distributed on an "AS IS" BASIS,

        plugin = this;
import org.osgi.framework.BundleContext;
 */
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
/*
    private static SQLServerActivator plugin;

    }
    }
    // The shared instance
package org.jkiss.dbeaver.ext.mssql.internal;
    private DBPPreferenceStore preferences;
    // The preferences

        return preferences;
    }
/**
}
 *
 * The activator class controls the plug-in life cycle
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.runtime.Plugin;
    public void start(BundleContext context) throws Exception {
        preferences = new BundlePreferenceStore(getBundle());
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        super.stop(context);
    public DBPPreferenceStore getPreferences() {
        return plugin;
    @Override

 *
        super.start(context);
    public void stop(BundleContext context) throws Exception {
 * Unless required by applicable law or agreed to in writing, software

 */
