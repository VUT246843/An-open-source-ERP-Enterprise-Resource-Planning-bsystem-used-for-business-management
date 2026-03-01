 * Licensed under the Apache License, Version 2.0 (the "License");

        if (debugPlugin != null) {
/*

import org.eclipse.ui.plugin.AbstractUIPlugin;

    }
import org.eclipse.debug.core.DebugPlugin;


 */
        return activator;
import org.eclipse.debug.core.IDebugEventSetListener;
        activator = this;
 *
    }
        DebugPlugin debugPlugin = DebugPlugin.getDefault();
 *
public class DebugUIActivator extends AbstractUIPlugin {
 * distributed under the License is distributed on an "AS IS" BASIS,
        activator = null;
        }
package org.jkiss.dbeaver.debug.ui.internal;
    private static DebugUIActivator activator;

        DebugPlugin debugPlugin = DebugPlugin.getDefault();
    private IDebugEventSetListener eventListener;
        }
 *
 * you may not use this file except in compliance with the License.
}
        if (debugPlugin != null) {
    public void start(BundleContext context) throws Exception {
    public static DebugUIActivator getDefault() {
            debugPlugin.removeDebugEventListener(eventListener);
    @Override
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void stop(BundleContext context) throws Exception {
 * See the License for the specific language governing permissions and
    @Override

import org.osgi.framework.BundleContext;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
        eventListener = new DebugUIEventListener();


 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
            debugPlugin.addDebugEventListener(eventListener);
 * Unless required by applicable law or agreed to in writing, software
