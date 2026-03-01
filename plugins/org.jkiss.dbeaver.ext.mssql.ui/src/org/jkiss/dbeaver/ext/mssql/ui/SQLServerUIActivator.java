    protected void initializeImageRegistry(ImageRegistry reg)

    }
}
 * See the License for the specific language governing permissions and
    public static final String IMG_SQL_SERVER = "IMG_SQL_SERVER"; //$NON-NLS-1$
 *

 *
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    public SQLServerUIActivator() {

        super.start(context);
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    private static SQLServerUIActivator plugin;
 *
 * you may not use this file except in compliance with the License.
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        super.stop(context);
 * You may obtain a copy of the License at
    }
public class SQLServerUIActivator extends AbstractUIPlugin {
    @Override
    public void stop(BundleContext context) throws Exception {


        plugin = null;

    @Override
 * DBeaver - Universal Database Manager

 */
 * limitations under the License.

        return plugin;
    // The plug-in ID
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        plugin = this;
package org.jkiss.dbeaver.ext.mssql.ui;
import org.eclipse.ui.plugin.AbstractUIPlugin;
    }
    @Override
    }
    public static ImageDescriptor getImageDescriptor(String path) {
    public static SQLServerUIActivator getDefault() {
import org.eclipse.jface.resource.ImageDescriptor;
        super.initializeImageRegistry(reg);
/*

    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.mssql.ui"; //$NON-NLS-1$
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // The shared instance
import org.osgi.framework.BundleContext;
    public void start(BundleContext context) throws Exception {
import org.eclipse.jface.resource.ImageRegistry;
        reg.put(IMG_SQL_SERVER, getImageDescriptor("$nl$/icons/mssql_icon.png")); //$NON-NLS-1$

