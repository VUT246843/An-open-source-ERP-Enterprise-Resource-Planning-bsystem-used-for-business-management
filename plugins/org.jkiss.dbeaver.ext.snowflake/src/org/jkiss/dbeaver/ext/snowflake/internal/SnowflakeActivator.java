 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
        plugin = this;

    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.snowflake";
public class SnowflakeActivator extends Plugin {
    }
    private static SnowflakeActivator plugin;
/**
    public DBPPreferenceStore getPreferences() {
    private DBPPreferenceStore preferences;
        preferences = new BundlePreferenceStore(getBundle());

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.snowflake.internal;
    public SnowflakeActivator() {
 * limitations under the License.
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
import org.osgi.framework.BundleContext;

import org.eclipse.core.runtime.Plugin;
/*


 * The activator class controls the plug-in life cycle
        return plugin;
    }
    @Override
}    public static SnowflakeActivator getDefault() {
    // The shared instance

 *

    public void stop(BundleContext context) throws Exception {
 */
 *
        plugin = null;
    }
 */
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        super.start(context);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.stop(context);
 * Unless required by applicable law or agreed to in writing, software
        return preferences;
    }
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    // The plug-in ID
 * DBeaver - Universal Database Manager
 *
    // The preferences

 * you may not use this file except in compliance with the License.

    public void start(BundleContext context) throws Exception {
