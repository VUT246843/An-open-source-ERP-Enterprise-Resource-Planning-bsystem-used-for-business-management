    }
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
    public static ImageDescriptor getImageDescriptor(String path) {
        plugin = null;
        super.start(context);
    public static ExasolActivator getDefault() {
    /**
import org.osgi.framework.BundleContext;
     * Returns the shared instance
 * You may obtain a copy of the License at
     * @return the shared instance
    // The shared instance

     * @param path the path
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
public class ExasolActivator extends AbstractUIPlugin {
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
 * distributed under the License is distributed on an "AS IS" BASIS,

        return plugin;
 * limitations under the License.
 */
    // The plug-in ID
    public void start(BundleContext context) throws Exception {
 * Unless required by applicable law or agreed to in writing, software
     * (non-Javadoc)
     * (non-Javadoc)
     */
 * DBeaver - Universal Database Manager
     * @return the image descriptor
     * Returns an image descriptor for the image file at the given plug-in relative path
import org.eclipse.jface.resource.ImageDescriptor;
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 *
    }
    private static ExasolActivator plugin;
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    /*
 *
package org.jkiss.dbeaver.ext.exasol.ui;

    public ExasolActivator() {
/**

     *
 *
    }

     * The constructor
     */
        plugin = this;


import org.eclipse.ui.plugin.AbstractUIPlugin;
        return imageDescriptorFromPlugin(PLUGIN_ID, path);

/*
 * you may not use this file except in compliance with the License.
        super.stop(context);
     */
    /*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.exasol.ui";
}
 * The activator class controls the plug-in life cycle
    /**

    public void stop(BundleContext context) throws Exception {
 * See the License for the specific language governing permissions and
    /**
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
     */
     *
