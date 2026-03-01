    public void start(BundleContext context) throws Exception {
 * You may obtain a copy of the License at
     * @return the image descriptor
}
 * Copyright (C) 2010-2022 DBeaver Corp and others
    @Override

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */



    private static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.tidb.ui";
    public static ImageDescriptor getImageDescriptor(String path) {
    }
    /**
    public void stop(BundleContext context) throws Exception {
     * relative path
     */
    // The plug-in ID

import org.eclipse.jface.resource.ImageDescriptor;
     *            the path
 *
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 *
/*
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.stop(context);
    @Override
import org.osgi.framework.BundleContext;
     *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
package org.jkiss.dbeaver.ext.tidb.ui.internal;
import org.eclipse.ui.plugin.AbstractUIPlugin;
    }
 * DBeaver - Universal Database Manager
 * limitations under the License.
/**
     * @param path
 * The activator class controls the plug-in life cycle
     * Returns an image descriptor for the image file at the given plug-in
 *
public class Activator extends AbstractUIPlugin {


 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        super.start(context);
