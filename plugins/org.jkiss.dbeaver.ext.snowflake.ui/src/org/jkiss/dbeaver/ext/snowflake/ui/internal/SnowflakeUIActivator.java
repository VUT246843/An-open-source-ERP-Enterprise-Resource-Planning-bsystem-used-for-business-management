
	


	// The shared instance
	}
 *
 */
import org.osgi.framework.BundleContext;
/*
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	private static SnowflakeUIActivator plugin;
	}
		plugin = null;
		super.stop(context);
 *
	}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * The activator class controls the plug-in life cycle
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
	// The plug-in ID
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	@Override
    public void start(BundleContext context) throws Exception {
/**

 * You may obtain a copy of the License at

		plugin = this;
		return plugin;
	@Override
import org.eclipse.jface.resource.ImageDescriptor;

	public static SnowflakeUIActivator getDefault() {
	public static ImageDescriptor getImageDescriptor(String path) {
}
public class SnowflakeUIActivator extends AbstractUIPlugin {
    public void stop(BundleContext context) throws Exception {
 *     http://www.apache.org/licenses/LICENSE-2.0
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
	public SnowflakeUIActivator() {
 * limitations under the License.
		super.start(context);
 */

	}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.plugin.AbstractUIPlugin;
package org.jkiss.dbeaver.ext.snowflake.ui.internal;
	public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.snowflake.ui";
