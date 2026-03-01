
        return bundleContext;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    static BundleContext getContext() {
    @Override

 * limitations under the License.
    private static Activator activator;
    }

/*
        activator = null;
    public void start(BundleContext context) throws Exception {
 * DBeaver - Universal Database Manager
}
    public void stop(BundleContext context) throws Exception {
 * See the License for the specific language governing permissions and
    }
    private static BundleContext bundleContext;
 */
        bundleContext = null;


import org.osgi.framework.BundleActivator;
package org.jkiss.dbeaver.ui.net.ssh;
    }
    @Override

 * Unless required by applicable law or agreed to in writing, software



        bundleContext = context;
    public static Activator getDefault() {
        return activator;
 * You may obtain a copy of the License at
 *
public class Activator implements BundleActivator {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * you may not use this file except in compliance with the License.
        activator = this;
import org.osgi.framework.BundleContext;
