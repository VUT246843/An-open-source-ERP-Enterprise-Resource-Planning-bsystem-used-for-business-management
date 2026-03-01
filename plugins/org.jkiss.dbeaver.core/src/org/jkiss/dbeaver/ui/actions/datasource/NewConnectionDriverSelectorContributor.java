import org.jkiss.dbeaver.ui.UIUtils;
            NewConnectionDialog.openNewConnectionDialog(window, driver, null);
package org.jkiss.dbeaver.ui.actions.datasource;
import org.eclipse.jface.action.MenuManager;

import org.jkiss.dbeaver.model.connection.DBPDriver;
    {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.window = window;
    }
    @Override
 *
        @Override
        }
        MenuManager allDriversMenu = new MenuManager("Other");
import java.util.function.Predicate;
            }
    }
        public void run() {

}        for (DBPDriver driver : allDrivers) {
import org.eclipse.jface.action.IContributionItem;
        for (DBPDriver driver : recentDrivers) {
 * See the License for the specific language governing permissions and
        private DBPDriver driver;

        }
        List<DBPDriver> allDrivers = DriverUtils.getAllDrivers();
import org.jkiss.dbeaver.registry.driver.DriverUtils;
                continue;
            this.driver = driver;
 * limitations under the License.
{
    {
        menuItems.add(allDriversMenu);
import org.jkiss.dbeaver.ui.dialogs.connection.NewConnectionDialog;
            allDrivers.removeIf(Predicate.not(driver -> driver.getDefaultDriverLoader().isDriverInstalled()));
            if (recentDrivers.contains(driver)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.DBeaverIcons;
/*
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(NewConnectionDriverSelectorContributor.class);
            allDriversMenu.add(new NewConnectionAction(window, driver));
 * you may not use this file except in compliance with the License.

        private IWorkbenchWindow window;
            menuItems.add(new ActionContributionItem(new NewConnectionAction(window, driver)));
public class NewConnectionDriverSelectorContributor extends DataSourceMenuContributor


            super(driver.getName(), DBeaverIcons.getImageDescriptor(driver.getIcon()));
        if (DBWorkbench.isDistributed()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected void fillContributionItems(final List<IContributionItem> menuItems)
    private static class NewConnectionAction extends Action
 * You may obtain a copy of the License at
import org.eclipse.jface.action.Action;
        IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        }
        public NewConnectionAction(IWorkbenchWindow window, DBPDriver driver) {
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
import java.util.List;
import org.eclipse.ui.IWorkbenchWindow;


import org.eclipse.jface.action.ActionContributionItem;
        List<DBPDriver> recentDrivers = DriverUtils.getRecentDrivers(allDrivers, 10);
        }
 */
