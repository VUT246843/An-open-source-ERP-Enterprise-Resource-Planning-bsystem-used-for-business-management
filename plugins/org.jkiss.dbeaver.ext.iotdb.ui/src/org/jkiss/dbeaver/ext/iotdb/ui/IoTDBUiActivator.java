        super.start(context);
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.iotdb.ui";


    public void start(BundleContext context) throws Exception {

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Unless required by applicable law or agreed to in writing, software
/*
 *
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
    private static IoTDBUiActivator plugin;

package org.jkiss.dbeaver.ext.iotdb.ui;

    @Override
    }

 *
    }
        return plugin;
 * Copyright (C) 2010-2024 DBeaver Corp and others


    public static IoTDBUiActivator getDefault() {
    public IoTDBUiActivator() {
    }
}
 * See the License for the specific language governing permissions and

    public static ImageDescriptor getImageDescriptor(String path) {
public class IoTDBUiActivator extends AbstractUIPlugin {
 *
    @Override
import org.osgi.framework.BundleContext;
 */
 * limitations under the License.
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        super.stop(context);
    public void stop(BundleContext context) throws Exception {
        plugin = this;
        plugin = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

