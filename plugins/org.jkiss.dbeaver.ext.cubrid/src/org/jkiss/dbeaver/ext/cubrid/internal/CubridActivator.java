    public void stop(BundleContext context) throws Exception {
import org.osgi.framework.BundleContext;
 * You may obtain a copy of the License at
    }
    }
    @Override
package org.jkiss.dbeaver.ext.cubrid.internal;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        return plugin;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public CubridActivator() {
    }
        plugin = null;
    private BundlePreferenceStore preferenceStore;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return preferenceStore;
/*

    private static CubridActivator plugin;
    @Override
        super.stop(context);

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        preferenceStore = new BundlePreferenceStore(getBundle());
        plugin = this;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        if (preferenceStore == null) {
            preferenceStore = new BundlePreferenceStore(getBundle());
}


 */


    public void start(BundleContext context) throws Exception {
public class CubridActivator extends Plugin {
 * See the License for the specific language governing permissions and
 * limitations under the License.
        super.start(context);
 *
    public DBPPreferenceStore getPreferenceStore() {
    public static CubridActivator getDefault() {
 *
    }
import org.eclipse.core.runtime.Plugin;
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.cubrid";
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
