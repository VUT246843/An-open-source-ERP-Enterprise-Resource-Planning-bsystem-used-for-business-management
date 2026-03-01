    @Override

package org.jkiss.dbeaver.ext.kingbase.ui.internal;
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override

    
    public static ImageDescriptor getImageDescriptor(String path) {
    /**
     */
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
     * Get image descriptor
 *     http://www.apache.org/licenses/LICENSE-2.0
public class Activator extends AbstractUIPlugin {
        super.start(context);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
     *
    }
 */
     * @return the image descriptor object
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
     * @param path the image path
    }

 *
 *
    public void start(BundleContext context) throws Exception {
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.osgi.framework.BundleContext;
import org.eclipse.ui.plugin.AbstractUIPlugin;
        super.stop(context);


import org.eclipse.jface.resource.ImageDescriptor;
    public void stop(BundleContext context) throws Exception {
 * limitations under the License.
 *
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    private static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.kingbase.ui";
