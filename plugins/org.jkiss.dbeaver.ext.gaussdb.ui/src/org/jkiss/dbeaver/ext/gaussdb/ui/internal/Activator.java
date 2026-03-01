    }
}
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.gaussdb.ui";
 * You may obtain a copy of the License at

    public void stop(BundleContext context) throws Exception {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.plugin.AbstractUIPlugin;
    @Override
        super.start(context);
import org.eclipse.jface.resource.ImageDescriptor;
 *
    public void start(BundleContext context) throws Exception {


import org.osgi.framework.BundleContext;
public class Activator extends AbstractUIPlugin {
    @Override
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*

 *

 * See the License for the specific language governing permissions and
    }
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
package org.jkiss.dbeaver.ext.gaussdb.ui.internal;
 */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static ImageDescriptor getImageDescriptor(String path) {

 * DBeaver - Universal Database Manager
        super.stop(context);
 * you may not use this file except in compliance with the License.
