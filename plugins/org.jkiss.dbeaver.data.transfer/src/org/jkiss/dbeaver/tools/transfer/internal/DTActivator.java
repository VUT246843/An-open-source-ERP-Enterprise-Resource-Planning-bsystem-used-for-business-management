 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

 * DBeaver - Universal Database Manager
        return Objects.requireNonNull(plugin, "Plugin is stopped");
    }
 *
 * limitations under the License.
        preferences = null;
 * Licensed under the Apache License, Version 2.0 (the "License");

/*
        plugin = this;
    @NotNull
}
 *
        return Objects.requireNonNull(preferences, "Plugin is stopped");
import java.util.Objects;
    private DBPPreferenceStore preferences;
 * See the License for the specific language governing permissions and
    }


 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBPPreferenceStore getPreferences() {
 *

    @Override
 * You may obtain a copy of the License at
    public static DTActivator getDefault() {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    private static DTActivator plugin;
public class DTActivator extends Plugin {

 * you may not use this file except in compliance with the License.
        super.start(context);
    public void stop(BundleContext context) throws Exception {
        preferences = new BundlePreferenceStore(getBundle());
import org.eclipse.core.runtime.Plugin;
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    }
package org.jkiss.dbeaver.tools.transfer.internal;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void start(BundleContext context) throws Exception {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
import org.osgi.framework.BundleContext;
        super.stop(context);
        plugin = null;
    @NotNull
