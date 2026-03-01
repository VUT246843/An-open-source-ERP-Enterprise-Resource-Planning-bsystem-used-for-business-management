    public static BigQueryActivator getDefault() {
 * You may obtain a copy of the License at
/**
    // The shared instance

        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    public static ImageDescriptor getImageDescriptor(String path) {
    }

 *
        plugin = null;


/*
    public BigQueryActivator() {
    @Override
    }

 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.bigquery.ui;

    }
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.bigquery";
 *
        super.start(context);
 * The activator class controls the plug-in life cycle
    }
        super.stop(context);
public class BigQueryActivator extends AbstractUIPlugin {
    }
        return plugin;
    // The plug-in ID
    private static BigQueryActivator plugin;

 * Unless required by applicable law or agreed to in writing, software
}
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void stop(BundleContext context) throws Exception {
import org.eclipse.jface.resource.ImageDescriptor;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

        plugin = this;
 *
    public void start(BundleContext context) throws Exception {
import org.eclipse.ui.plugin.AbstractUIPlugin;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0

 * you may not use this file except in compliance with the License.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
import org.osgi.framework.BundleContext;
