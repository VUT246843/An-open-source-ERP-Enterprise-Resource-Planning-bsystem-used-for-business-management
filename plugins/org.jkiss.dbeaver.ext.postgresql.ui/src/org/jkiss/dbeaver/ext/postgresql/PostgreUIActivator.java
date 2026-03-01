        return serviceContext.get(IEventBroker.class);

import org.eclipse.jface.resource.ImageRegistry;
	}
 *     http://www.apache.org/licenses/LICENSE-2.0
		bundleContext = context;
	
 * you may not use this file except in compliance with the License.

    
 *
}
import org.eclipse.e4.core.contexts.EclipseContextFactory;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import org.osgi.framework.BundleContext;
	}

		return imageDescriptorFromPlugin(PLUGIN_ID, path);
		bundleContext = context;

 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.jface.resource.ImageDescriptor;
		return plugin;

		plugin = this;
import org.eclipse.e4.core.contexts.IEclipseContext;
 */
		super.stop(context);
	private static PostgreUIActivator plugin;
    private static BundleContext bundleContext;
	}
		plugin = null;
 */
	@Override
	}
/**
 *
	{
    public void start(BundleContext context) throws Exception {
 * Copyright (C) 2010-2024 DBeaver Corp and others
	@Override
	
    public static final String IMG_PG_SQL = "IMG_PG_SQL"; //$NON-NLS-1$
	public static ImageDescriptor getImageDescriptor(String path) {
public class PostgreUIActivator extends AbstractUIPlugin {
	}
import org.eclipse.ui.plugin.AbstractUIPlugin;

/*
import org.eclipse.e4.core.services.events.IEventBroker;
    public PostgreUIActivator() {
	    reg.put(IMG_PG_SQL, getImageDescriptor("$nl$/icons/postgresql_icon.png")); //$NON-NLS-1$
 * See the License for the specific language governing permissions and
	public IEventBroker getEventBroker() {
		super.start(context);

 * The activator class controls the plug-in life cycle
        IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
	    super.initializeImageRegistry(reg);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

	public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.postgresql"; //$NON-NLS-1$
package org.jkiss.dbeaver.ext.postgresql;
	}
 * limitations under the License.
 * You may obtain a copy of the License at
	public static PostgreUIActivator getDefault() {
	// The plug-in ID
	protected void initializeImageRegistry(ImageRegistry reg)
	@Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
	// The shared instance
    public void stop(BundleContext context) throws Exception {
