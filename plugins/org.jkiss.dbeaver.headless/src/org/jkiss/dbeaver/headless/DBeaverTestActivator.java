 *
    public void start(BundleContext context)
     */

    private static DBeaverTestActivator instance;
        return instance;
    public static IWorkspace getWorkspace() {
    {
    public void stop(BundleContext context)
    private static File configDir;


 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * The activator class controls the plug-in life cycle
        return ResourcesPlugin.getWorkspace();
    }

            e.printStackTrace();
package org.jkiss.dbeaver.headless;
        throws Exception {
 * DBeaver - Universal Database Manager
    private void shutdownCore() {
    }
 * You may obtain a copy of the License at

            }
}
    private DBPPreferenceStore preferences;
    }
 * See the License for the specific language governing permissions and
import org.osgi.framework.BundleContext;
        if (configDir == null) {
import org.eclipse.core.runtime.Plugin;
import java.io.PrintStream;
    public static synchronized File getConfigurationFile(String fileName)
        throws Exception {
        Bundle bundle = getBundle();
    public static DBeaverTestActivator getInstance() {
import java.io.File;

    public DBeaverTestActivator() {
import org.jkiss.dbeaver.ModelPreferences;
 * Licensed under the Apache License, Version 2.0 (the "License");
        instance = this;
            System.err.println("Internal error after shutdown process:" + e.getMessage()); //$NON-NLS-1$
        }
        try {
            if (DBeaverTestActivator.instance != null) {
    /**

 */
        preferences = new BundlePreferenceStore(bundle);
    // The shared instance
    }

    }

 *
     */
            configDir = getInstance().getStateLocation().toFile();
    /**



        this.shutdownCore();
    @Override

     * Returns the workspace instance.

        return preferences;
            debugWriter = null;
    }

            // Dispose core
/*

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Unless required by applicable law or agreed to in writing, software
        instance = null;
import org.eclipse.core.resources.ResourcesPlugin;
 */

    @Override
import org.eclipse.core.resources.IWorkspace;
        }
        } catch (Throwable e) {
import org.osgi.framework.Bundle;
        if (debugWriter != null) {

        }
                DBeaverTestActivator.instance = null;
            debugWriter.close();
        ModelPreferences.setMainBundle(bundle);
        super.stop(context);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
public class DBeaverTestActivator extends Plugin {
     * Returns configuration file
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
        return new File(configDir, fileName);
    }
    private PrintStream debugWriter;
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBPPreferenceStore getPreferences() {
        super.start(context);
 *
 * limitations under the License.
    }
