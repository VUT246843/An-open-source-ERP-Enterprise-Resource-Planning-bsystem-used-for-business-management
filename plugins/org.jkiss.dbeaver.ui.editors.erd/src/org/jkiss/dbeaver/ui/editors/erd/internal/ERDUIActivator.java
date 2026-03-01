    /**

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UIIcon;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        } catch (Throwable e) {

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;

        plugin = null;

        try {
    /**
        overloadGEFImage();
        preferences = new BundlePreferenceStore(getBundle());
    @Override
import org.eclipse.gef.internal.InternalImages;
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.editors.erd"; // $NON-NLS-0$
    }
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.debug(e);
        super.stop(context);
    private static ERDUIActivator plugin;
 * The activator class controls the plug-in life cycle
        // Switch off D3D because of Sun XOR painting bug
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.graphics.Image;
    }
}
    }
    private static final Log log = Log.getLog(ERDUIActivator.class);
                .invoke(null, InternalImages.IMG_PALETTE, DBeaverIcons.getImage(UIIcon.PALETTE));

    private void overloadGEFImage() {
package org.jkiss.dbeaver.ui.editors.erd.internal;
    public DBPPreferenceStore getPreferences() {
/**
     *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super.start(context);
                "set",
    }
    public static ERDUIActivator getDefault() {
 *
    }
     * @return the shared instance
     * path
     * @return the image descriptor

        // See http://www.jgraph.com/forum/viewtopic.php?t=4066
import org.eclipse.jface.resource.ImageDescriptor;

     */

            // Use reflection because of Eclipse API incompatibility with oder versions
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
        return plugin;
 * DBeaver - Universal Database Manager
        System.setProperty("sun.java2d.d3d", Boolean.FALSE.toString()); //$NON-NLS-1$
 * limitations under the License.
        return preferences;
 *
    public void start(BundleContext context) throws Exception {
 * you may not use this file except in compliance with the License.
     * Returns an image descriptor for the image file at the given plug-in relative
 *
        // Overload GEF images
import org.jkiss.dbeaver.Log;
                String.class, Image.class)
    public void stop(BundleContext context) throws Exception {

     * Returns the shared instance
        // no specific
import org.osgi.framework.BundleContext;
        ERDUIActivator.plugin = this;
 */
    }
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.plugin.AbstractUIPlugin;
 */
    public static ImageDescriptor getImageDescriptor(String path) {
    }
public class ERDUIActivator extends AbstractUIPlugin {
    private DBPPreferenceStore preferences;
     */
    public ERDUIActivator() {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

     * @param path the path
            InternalImages.class.getMethod(

     *
/*
