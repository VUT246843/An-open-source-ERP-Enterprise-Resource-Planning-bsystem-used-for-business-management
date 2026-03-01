            //context.addBundleListener(new BundleLoadListener());
import org.jkiss.dbeaver.model.DBPMessageType;
    private static String getBundleName(Bundle bundle) {
}
    }
                } else if (event.getType() == BundleEvent.STOPPING) {
import org.eclipse.osgi.internal.framework.BundleContextImpl;



        super.stop(context);
    public void start(BundleContext context) throws Exception {
import org.osgi.framework.BundleEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;

                    System.err.println(message);
    }
                        message = "> Start " + getBundleName(bundle) + " [" + bundle.getSymbolicName() + " " + bundle.getVersion() + "]";
    }
                String message = null;
    public CoreApplicationActivator() {
            }, null);
                NotificationUtils.sendNotification(id, title, text, messageType, feedback);

    public void stop(BundleContext context) throws Exception {
        HookRegistry registry = container.getConfiguration().getHookRegistry();
import java.util.*;
    // The shared instance
    }
            }
 * Unless required by applicable law or agreed to in writing, software
import org.osgi.framework.hooks.bundle.EventHook;
            @Override
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
import org.eclipse.osgi.internal.framework.EquinoxContainer;
import org.jkiss.dbeaver.model.DBPDataSource;
        EquinoxContainer container = ((BundleContextImpl)context).getContainer();

            hooksField.set(registry, newHooks);
                NotificationUtils.sendNotification(dataSource, id, text, messageType, feedback);
                        //message = "< Stop " + getBundleName(bundle) + " [" + bundle.getSymbolicName() + " " + bundle.getVersion() + "]";
                    }

        try {
                    if (activatedBundles.remove(bundle.getSymbolicName())) {
            public void sendNotification(DBPDataSource dataSource, String id, String text, DBPMessageType messageType, Runnable feedback) {
            bundleName = bundle.getSymbolicName();
    @Override
    private static CoreApplicationActivator plugin;
                if (event.getType() == BundleEvent.STARTED) {
/*
    }
import org.jkiss.utils.CommonUtils;

                    if (bundle.getState() == Bundle.ACTIVE) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (!Log.isQuietMode()) {
import org.jkiss.dbeaver.ui.notifications.NotificationUtils;
            context.registerService(EventHook.class, (event, contexts) -> {
        plugin = this;
                }
        super.start(context);
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.ui.app.standalone";
        }
                Bundle bundle = event.getBundle();
        // Add bundle load logger
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
            @Override

import org.osgi.framework.Bundle;
        });
import java.lang.reflect.Field;

        if (CommonUtils.isEmpty(bundleName)) {
 * limitations under the License.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    // The plug-in ID


        }
            getLog().error("Error initializing class loader hook", e);
        return bundleName;
            activateHooks(context);
        }
            public void sendNotification(String id, String title, String text, DBPMessageType messageType, Runnable feedback) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class CoreApplicationActivator extends AbstractUIPlugin {
    public static CoreApplicationActivator getDefault() {

    private static final boolean PATCH_ECLIPSE_CLASSES = false;


                        activatedBundles.add(bundle.getSymbolicName());
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
        List<ClassLoaderHook> newHooks = Collections.unmodifiableList(hooks);

            Set<String> activatedBundles = new HashSet<>();
        return plugin;
    @Override
import org.osgi.framework.BundleContext;
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.ui.app.standalone.internal;
                if (message != null) {
 *
            Field hooksField = registry.getClass().getDeclaredField("classLoaderHooksRO");
        hooks.add(new PatchClassLoaderHook());
        String bundleName = bundle.getHeaders().get("Bundle-Name");
        DBeaverNotifications.setHandler(new DBeaverNotifications.NotificationHandler() {
import org.eclipse.osgi.internal.hookregistry.ClassLoaderHook;
 *
import org.eclipse.osgi.internal.hookregistry.HookRegistry;
        } catch (Throwable e) {
import org.jkiss.dbeaver.runtime.DBeaverNotifications;

        // Set notifications handler
 * You may obtain a copy of the License at
            hooksField.setAccessible(true);
        plugin = null;
        if (PATCH_ECLIPSE_CLASSES) {
    private void activateHooks(BundleContext context) {
            }
                }
        List<ClassLoaderHook> hooks = new ArrayList<>(registry.getClassLoaderHooks());

    }
                    }

