    }
    public static UIActivator getDefault() {

 *

import org.eclipse.ui.plugin.AbstractUIPlugin;
    public UIActivator() {
        plugin = this;
public class UIActivator extends AbstractUIPlugin {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }
    }

 * See the License for the specific language governing permissions and
import org.eclipse.jface.resource.ImageDescriptor;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    // The shared instance
    public void stop(BundleContext context) throws Exception {
        plugin = null;
}
 * You may obtain a copy of the License at
    }
    @Override
        super.stop(context);
    @Override
 * Unless required by applicable law or agreed to in writing, software
 *

    private static UIActivator plugin;
    public static ImageDescriptor getImageDescriptor(String path) {
import org.osgi.framework.BundleContext;

package org.jkiss.dbeaver.ui.internal;

 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    // The plug-in ID
    public void start(BundleContext context) throws Exception {
 *
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui";
    }
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*

        super.start(context);
        return plugin;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

