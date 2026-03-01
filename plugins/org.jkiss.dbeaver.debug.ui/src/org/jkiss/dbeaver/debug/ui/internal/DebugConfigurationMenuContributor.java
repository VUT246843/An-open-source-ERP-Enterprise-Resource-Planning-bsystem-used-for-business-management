 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
        LaunchHistory launchHistory = launchConfigurationManager.getLaunchHistory(DebugUI.DEBUG_LAUNCH_GROUP_ID);
import org.eclipse.jface.action.Separator;
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
            menuItems.add(new ActionContributionItem(action));
            menuItems.add(new Separator());
        menuItems.add(new ActionContributionItem(new LaunchShortcutsAction(DebugUI.DEBUG_LAUNCH_GROUP_ID)));
        for (ILaunchConfiguration launch : filteredConfigs) {
    private static final Log log = Log.getLog(DebugConfigurationMenuContributor.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
}
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchHistory;
        LaunchConfigurationManager launchConfigurationManager = DebugUIPlugin.getDefault().getLaunchConfigurationManager();
        }
{
package org.jkiss.dbeaver.debug.ui.internal;
 * limitations under the License.
    protected void fillContributionItems(final List<IContributionItem> menuItems)
/*

            LaunchAction action = new LaunchAction(launch, "debug");
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.action.IContributionItem;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class DebugConfigurationMenuContributor extends DataSourceMenuContributor
        }

import org.jkiss.dbeaver.ui.actions.datasource.DataSourceMenuContributor;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

        menuItems.add(new ActionContributionItem(new DebugLaunchDialogAction()));
        // Fill recent debugs
import org.eclipse.debug.ui.actions.LaunchAction;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationManager;
        ILaunchConfiguration[] filteredConfigs = LaunchConfigurationManager.filterConfigs(launchHistory.getHistory());
 *
import org.eclipse.debug.internal.ui.DebugUIPlugin;
        // Fill configuration actions
import org.eclipse.debug.ui.actions.LaunchShortcutsAction;
    {

        if (filteredConfigs.length > 0) {
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.debug.ui.DebugUI;
import java.util.List;
 * You may obtain a copy of the License at
import org.eclipse.jface.action.ActionContributionItem;
