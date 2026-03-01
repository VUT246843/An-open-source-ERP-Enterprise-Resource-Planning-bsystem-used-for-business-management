
    }

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.workbench.WorkbenchUtils;
    public void start(BundleContext context) throws Exception {
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * See the License for the specific language governing permissions and

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jkiss.dbeaver.ui.preferences.PrefPageConstants;
            WorkbenchUtils.removePreferencePages(PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + AIPreferencePageMain.PAGE_ID);
 * Copyright (C) 2010-2026 DBeaver Corp and others
public class AIUIActivator extends AbstractUIPlugin {
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
        }

 *
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
    public static AIUIActivator getDefault() {
 *
 * Unless required by applicable law or agreed to in writing, software
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
/*
        return plugin;
        DBRFeatureRegistry.getInstance().registerFeatures(AIUIFeatures.class);
 * DBeaver - Universal Database Manager
    }

        // Trigger pref defaults

 *
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
        new BundlePreferenceStore(getBundle());

 * limitations under the License.
        super.stop(context);
 * Licensed under the Apache License, Version 2.0 (the "License");
        plugin = this;
    @Override
import org.jkiss.dbeaver.model.rm.RMConstants;
    }
        plugin = null;
        super.start(context);
import org.jkiss.dbeaver.ui.ai.preferences.AIPreferencePageMain;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.osgi.framework.BundleContext;
    public void stop(BundleContext context) throws Exception {
package org.jkiss.dbeaver.ui.ai.internal;

    private static AIUIActivator plugin;
