	 */
	public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.oracle.ui";
    public void start(BundleContext context) throws Exception {
	/**
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.eclipse.ui.plugin.AbstractUIPlugin;
		plugin = this;
}
 * DBeaver - Universal Database Manager

import org.eclipse.jface.resource.ImageDescriptor;
public class OracleUIActivator extends AbstractUIPlugin {
 *
	 * plug-in relative path
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

	/**
	 * Returns an image descriptor for the image file at the given
/**
	 * (non-Javadoc)
 * See the License for the specific language governing permissions and
	 */
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	/**
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	 *
	public static OracleUIActivator getDefault() {
	 * Returns the shared instance

	

	 * (non-Javadoc)
package org.jkiss.dbeaver.ext.oracle.ui.internal;
	private static OracleUIActivator plugin;
	}
	 */
	/*
	public OracleUIActivator() {

 * limitations under the License.
		return plugin;
 */
	// The plug-in ID
 *
		super.start(context);

	 * @param path the path
 * distributed under the License is distributed on an "AS IS" BASIS,
		plugin = null;
	 */
 * You may obtain a copy of the License at
	public static ImageDescriptor getImageDescriptor(String path) {
 * Unless required by applicable law or agreed to in writing, software
	/*
 */

    public void stop(BundleContext context) throws Exception {
 * Licensed under the Apache License, Version 2.0 (the "License");
	 */
	}
	}
import org.osgi.framework.BundleContext;
	 * The constructor

	 * @return the image descriptor
 * you may not use this file except in compliance with the License.
 *
	}
 * The activator class controls the plug-in life cycle
	@Override
	@Override
/*
		super.stop(context);
	 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
	// The shared instance
	 * @return the shared instance
