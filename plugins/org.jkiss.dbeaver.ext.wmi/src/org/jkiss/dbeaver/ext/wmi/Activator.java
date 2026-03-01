	 * The constructor

 * See the License for the specific language governing permissions and
import org.eclipse.ui.plugin.AbstractUIPlugin;
 * you may not use this file except in compliance with the License.
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		plugin = null;
	 * @return the shared instance
	 */


	 * Returns an image descriptor for the image file at the given
 *

 * DBeaver - Universal Database Manager
	 * @return the image descriptor
		super.start(context);
	 * Returns the shared instance
	}
	}
import org.osgi.framework.BundleContext;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    public void stop(BundleContext context) throws Exception {
	 * (non-Javadoc)
	/*

	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	public Activator() {
	 */
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
 *

		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	/*
	public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.wmi";
 * The activator class controls the plug-in life cycle
	/**
		plugin = this;
 * Copyright (C) 2010-2024 DBeaver Corp and others
	public static Activator getDefault() {
	/**
	public static ImageDescriptor getImageDescriptor(String path) {
	private static Activator plugin;
public class Activator extends AbstractUIPlugin {
package org.jkiss.dbeaver.ext.wmi;
	}

 *
	 */
		super.stop(context);
}
	@Override
/**
    public void start(BundleContext context) throws Exception {
	 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
	
	 */
	 *
	// The shared instance
 *     http://www.apache.org/licenses/LICENSE-2.0
	// The plug-in ID

	 * (non-Javadoc)
	/**
	@Override
		return plugin;
	}
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.resource.ImageDescriptor;
	}
	 * @param path the path
 */
	 * plug-in relative path
