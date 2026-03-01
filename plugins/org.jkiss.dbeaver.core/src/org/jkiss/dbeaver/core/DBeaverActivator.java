public class DBeaverActivator extends AbstractUIPlugin {
        }
import java.util.MissingResourceException;

            }
                } else {
            debugWriter.close();
        return preferences;
    }
 * you may not use this file except in compliance with the License.
                DesktopPlatform.instance.dispose();
 */
    }
 *



    public DBPPreferenceStore getPreferences() {
        } catch (MissingResourceException x) {
        preferences = new BundlePreferenceStore(bundle);
        return getInstance().pluginResourceBundle;


            if (DesktopPlatform.instance != null) {
                }
            coreResourceBundle = null;

            debugWriter = null;
            try {
 * See the License for the specific language governing permissions and
        instance = null;
        } catch (Throwable e) {

        if (DesktopPlatform.instance != null) {
    }
    }
 */
            System.err.println("Internal error after shutdown process:" + e.getMessage()); //$NON-NLS-1$
            pluginResourceBundle = Platform.getResourceBundle(bundle);
    private PrintStream debugWriter;
    public static ImageDescriptor getImageDescriptor(String path) {

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        }
        this.shutdownCore();
        DBRFeatureRegistry.getInstance().registerFeatures(CoreFeatures.class);
}
 *     http://www.apache.org/licenses/LICENSE-2.0
        ProxyInjector proxyInjector = new ProxyInjector();
 *
    }
            }
            DesktopUI.disposeUI();
import org.eclipse.core.runtime.Platform;

        try {

    @Override
        throws Exception {
    private static DBeaverActivator instance;

        try {
    public void start(BundleContext context)
import org.jkiss.dbeaver.ui.browser.BrowsePeerMethods;
                    injectProxyPeer();
    private void shutdownCore() {
        return imageDescriptorFromPlugin(DesktopPlatform.PLUGIN_ID, path);

 * limitations under the License.
    }
            } catch (Throwable e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        DBRFeatureRegistry.getInstance().registerFeatures(ConnectionFeatures.class);
            e.printStackTrace();
        if (debugWriter != null) {
 * You may obtain a copy of the License at

        ModelPreferences.setMainBundle(bundle);
        super.stop(context);
     * Returns the plugin's resource bundle,
    public static ResourceBundle getCoreResourceBundle() {
import org.jkiss.dbeaver.ui.ConnectionFeatures;
        Bundle bundle = getBundle();
 * DBeaver - Universal Database Manager
import java.util.ResourceBundle;
     * @return core resource bundle
    }
        super.start(context);
        proxyInjector.injectBrowseInteraction(BrowsePeerMethods::canBrowseInSWTBrowser, BrowsePeerMethods::browseInSWTBrowser);

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static ResourceBundle getPluginResourceBundle() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
        if (getPreferenceStore().getBoolean(UIPreferences.UI_USE_EMBEDDED_AUTH)) {
    @Override
        }
    private ResourceBundle pluginResourceBundle, coreResourceBundle;
                getLog().warn(e.getMessage());
/*
        return getInstance().coreResourceBundle;
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
                getPreferenceStore().setValue(UIPreferences.UI_USE_EMBEDDED_AUTH, false);
import java.io.PrintStream;
    public DBeaverActivator() {
                    getPreferenceStore().setValue(UIPreferences.UI_USE_EMBEDDED_AUTH, false);
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    getLog().warn("Desktop interface not available");
    private void injectProxyPeer() throws NoSuchFieldException, IllegalAccessException {
import org.eclipse.jface.resource.ImageDescriptor;
import org.jkiss.dbeaver.ui.AWTUtils;
                if (AWTUtils.isDesktopSupported()) {
    }

            // Dispose core
import org.jkiss.awt.injector.ProxyInjector;
import org.osgi.framework.Bundle;
        return instance;
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
 *

    }
        throws Exception {
package org.jkiss.dbeaver.core;
    public void stop(BundleContext context)
import org.jkiss.dbeaver.ui.preferences.UIPreferences;
     *
        this.shutdownUI();

        instance = this;
    private void shutdownUI() {
import org.osgi.framework.BundleContext;
import org.eclipse.ui.plugin.AbstractUIPlugin;
     */
import org.jkiss.dbeaver.ModelPreferences;
            coreResourceBundle = ResourceBundle.getBundle(CoreMessages.BUNDLE_NAME);
 * Unless required by applicable law or agreed to in writing, software


    // The shared instance
    public static DBeaverActivator getInstance() {
    }
    }
        }
    private DBPPreferenceStore preferences;
 * The activator class controls the plug-in life cycle
