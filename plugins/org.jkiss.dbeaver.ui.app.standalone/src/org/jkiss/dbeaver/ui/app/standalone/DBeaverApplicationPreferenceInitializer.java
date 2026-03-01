 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");


		node.putBoolean(IDEInternalPreferences.SHOW_PERSPECTIVE_IN_TITLE, false);

}
 * You may obtain a copy of the License at
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
 * Overwrites IDEPreferenceInitializer behavior.
import org.eclipse.ui.internal.ide.IDEInternalPreferences;
	public void initializeDefaultPreferences() {
/**
 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and
	@Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.app.standalone;

	}
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

public class DBeaverApplicationPreferenceInitializer extends AbstractPreferenceInitializer {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		node.putBoolean(IDEInternalPreferences.SHOW_LOCATION, false);
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
/*
		node.putBoolean(IDEInternalPreferences.SHOW_PRODUCT_IN_TITLE, true);
 *
 * DBeaver - Universal Database Manager
		IEclipsePreferences node= DefaultScope.INSTANCE.getNode(IDEWorkbenchPlugin.getDefault().getBundle().getSymbolicName());
 * limitations under the License.
 */
		node.putBoolean(IDEInternalPreferences.SHOW_LOCATION_NAME, false);
