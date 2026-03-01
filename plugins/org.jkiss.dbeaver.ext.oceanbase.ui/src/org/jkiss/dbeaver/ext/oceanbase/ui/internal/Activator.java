 * You may obtain a copy of the License at
     * @param path
     *            the path
import org.eclipse.jface.resource.ImageDescriptor;
 */

 *
 *
     * @return the image descriptor

 * you may not use this file except in compliance with the License.
     */
     * relative path
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
        super.stop(context);

    // The plug-in ID
 */
    public void start(BundleContext context) throws Exception {
        super.start(context);
}
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void stop(BundleContext context) throws Exception {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
import org.eclipse.ui.plugin.AbstractUIPlugin;
 * limitations under the License.
 * The activator class controls the plug-in life cycle

     * Returns an image descriptor for the image file at the given plug-in

/**
    }

     *
 * Unless required by applicable law or agreed to in writing, software
import org.osgi.framework.BundleContext;
/*
    }
    private static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.oceanbase.ui";

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static ImageDescriptor getImageDescriptor(String path) {
public class Activator extends AbstractUIPlugin {
 *
    }
    /**
package org.jkiss.dbeaver.ext.oceanbase.ui.internal;
