 *
 */
     */
    // The plug-in ID
import org.eclipse.ui.plugin.AbstractUIPlugin;
    {
/**
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
     * Returns the shared instance

    public void stop(BundleContext context) throws Exception
    /**
    {
    /**
     * @return the image descriptor
    // The shared instance
 *
 * you may not use this file except in compliance with the License.
        super.stop(context);
    {
    /*

import org.osgi.framework.BundleContext;
    @Override
 * DBeaver - Universal Database Manager
    public void start(BundleContext context) throws Exception
    public static ImageDescriptor getImageDescriptor(String path)
    {
    }
     *

    /**
        plugin = this;
    */
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Returns an image descriptor for the image file at the given plug-in relative path
    public static DB2Activator getDefault()
    @Override
}
 * The activator class controls the plug-in life cycle

     */
    private static DB2Activator plugin;
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
     *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.

    */
    * (non-Javadoc)
    }
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.db2.ui";
        return plugin;
 * Unless required by applicable law or agreed to in writing, software
 *
    /*
    }
    public DB2Activator()
    * (non-Javadoc)
     */
        super.start(context);

package org.jkiss.dbeaver.ext.db2.ui;
    * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
        plugin = null;
import org.eclipse.jface.resource.ImageDescriptor;
 */
     * The constructor
    * 
    * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     * @return the shared instance
 * You may obtain a copy of the License at
public class DB2Activator extends AbstractUIPlugin {
    * 

    }
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
/*
 * distributed under the License is distributed on an "AS IS" BASIS,

     * @param path the path
