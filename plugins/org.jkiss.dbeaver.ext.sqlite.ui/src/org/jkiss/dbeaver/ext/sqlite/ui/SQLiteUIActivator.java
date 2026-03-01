 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.plugin.AbstractUIPlugin;
 * Licensed under the Apache License, Version 2.0 (the "License");


 */
	// The plug-in ID
		super.start(context);
	}
		plugin = null;
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
public class SQLiteUIActivator extends AbstractUIPlugin {
	public SQLiteUIActivator() {
 *
 * The activator class controls the plug-in life cycle
		super.stop(context);
 * You may obtain a copy of the License at
    public void start(BundleContext context) throws Exception {
 *
import org.osgi.framework.BundleContext;

package org.jkiss.dbeaver.ext.sqlite.ui;
		plugin = this;
 * limitations under the License.
}
	// The shared instance
	}
/*
/**
	}
	}
	private static SQLiteUIActivator plugin;

 *

import org.eclipse.jface.resource.ImageDescriptor;
 * DBeaver - Universal Database Manager
	public static ImageDescriptor getImageDescriptor(String path) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
	public static final String PLUGIN_ID = "org.jkiss.dbeaver.ext.sqlite.ui";
	}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

		return plugin;
	@Override
	@Override
 * you may not use this file except in compliance with the License.
	
 * See the License for the specific language governing permissions and
    public void stop(BundleContext context) throws Exception {

	public static SQLiteUIActivator getDefault() {
 *     http://www.apache.org/licenses/LICENSE-2.0

