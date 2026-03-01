    }
    }
    public void stop(BundleContext context) throws Exception {
}

import org.eclipse.jface.resource.ImageDescriptor;
    }
        plugin = null;
    public DTUIActivator() {

    @Override
        super.saveDialogSettings();


    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DTUIActivator extends AbstractUIPlugin {
/*
 *
    }
import org.eclipse.ui.plugin.AbstractUIPlugin;
 */
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.data.transfer";
 *     http://www.apache.org/licenses/LICENSE-2.0

        super.start(context);
    private static DTUIActivator plugin;
 * DBeaver - Universal Database Manager
        plugin = this;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override

 * you may not use this file except in compliance with the License.
        super.stop(context);

    public void saveDialogSettings() {
    // The shared instance
    // The plug-in ID
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
 * Unless required by applicable law or agreed to in writing, software
 *
 * limitations under the License.

    public static DTUIActivator getDefault() {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
package org.jkiss.dbeaver.tools.transfer.ui.internal;
import org.osgi.framework.BundleContext;
 * See the License for the specific language governing permissions and
    public void start(BundleContext context) throws Exception {

    public static ImageDescriptor getImageDescriptor(String path) {
        return plugin;
