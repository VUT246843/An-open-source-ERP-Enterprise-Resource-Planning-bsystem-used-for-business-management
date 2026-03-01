 *
 * you may not use this file except in compliance with the License.

	/**
	}
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)

	 */
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.mysql.ui";
 * You may obtain a copy of the License at
	@Override
	 */
	 * @return the shared instance
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	/**

import org.eclipse.ui.plugin.AbstractUIPlugin;

 * DBeaver - Universal Database Manager
	private static MySQLUIActivator plugin;
	/**
 *     http://www.apache.org/licenses/LICENSE-2.0
	

	 * @param path the path
	 * Returns the shared instance
	 * plug-in relative path
 *
	 */
import org.osgi.framework.BundleContext;
	// The shared instance
 *
		return plugin;

/*
	 */
 * Unless required by applicable law or agreed to in writing, software
		plugin = null;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
	}
}
	 * (non-Javadoc)
/**
	 *
 * See the License for the specific language governing permissions and
    public void start(BundleContext context) throws Exception {
import org.eclipse.jface.resource.ImageDescriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
		plugin = this;
	 * (non-Javadoc)
	 * The constructor
public class MySQLUIActivator extends AbstractUIPlugin {
		super.start(context);
	@Override
 * The activator class controls the plug-in life cycle
	 */
package org.jkiss.dbeaver.ext.mysql.ui;
	public static ImageDescriptor getImageDescriptor(String path) {
 * limitations under the License.

		super.stop(context);
    public void stop(BundleContext context) throws Exception {
	public static MySQLUIActivator getDefault() {
	}
	// The plug-in ID
 * distributed under the License is distributed on an "AS IS" BASIS,
	}
 */
	 * Returns an image descriptor for the image file at the given
	/*
	 *
	}
	public MySQLUIActivator() {

	/*
	 * @return the image descriptor
