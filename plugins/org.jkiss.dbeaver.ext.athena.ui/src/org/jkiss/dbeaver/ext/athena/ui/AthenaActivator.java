    @Override
    }
 * limitations under the License.
    }
    public void stop(BundleContext context) throws Exception {

    private static AthenaActivator plugin;

    // The shared instance
        super.start(context);
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.athena.ui";
 *
 * Unless required by applicable law or agreed to in writing, software

public class AthenaActivator extends AbstractUIPlugin {
 * See the License for the specific language governing permissions and
    // The plug-in ID
import org.eclipse.jface.resource.ImageDescriptor;
/**
}
import org.osgi.framework.BundleContext;
import org.eclipse.ui.plugin.AbstractUIPlugin;
 * you may not use this file except in compliance with the License.
        return plugin;

 *
 * The activator class controls the plug-in life cycle
        plugin = this;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
        plugin = null;

 * Copyright (C) 2010-2024 DBeaver Corp and others
/*

 * DBeaver - Universal Database Manager

    public static AthenaActivator getDefault() {
 */
package org.jkiss.dbeaver.ext.athena.ui;
    }
    public static ImageDescriptor getImageDescriptor(String path) {
    public void start(BundleContext context) throws Exception {
 */
    }

    public AthenaActivator() {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * You may obtain a copy of the License at
    @Override
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
        super.stop(context);
    }
 *

