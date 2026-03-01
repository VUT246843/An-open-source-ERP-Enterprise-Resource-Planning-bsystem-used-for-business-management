                // Create global browser control
import org.jkiss.dbeaver.ui.ActionBars;
            ld.widthHint = 0;
        }
import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridLayout;
 * Dashboard browser composite
                        return;
            }
import org.eclipse.swt.widgets.Composite;
        this.dashboardContainer = dashboardContainer;
    private final DashboardContainer viewContainer;

        this.viewContainer = viewContainer;
 * limitations under the License.
        initializeGlobalBrowser(viewContainer);
import org.jkiss.dbeaver.ui.dashboard.control.DashboardViewCompositeControl;
        if (!CommonUtils.isEmpty(dashboardURL)) {
}
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        setLayout(layout);
 */
public class DashboardBrowserComposite extends Composite implements DashboardViewCompositeControl {
    private final DashboardItemContainer dashboardContainer;
package org.jkiss.dbeaver.ui.dashboard.browser;
    private void closeBrowser() {
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IActionBars;
 */

import org.eclipse.swt.browser.Browser;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Control;
        DashboardItemConfiguration itemConfig = dashboardContainer.getItemDescriptor();
        return browser;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.RowLayout;


            ld.heightHint = 0;
        private Composite globalComposite;
            IStatusLineManager statusLineManager = actionBars.getStatusLineManager();
                for (IContributionItem item : statusLineManager.getItems()) {
 * DBeaver - Universal Database Manager
/*
        super(parent, style);
/**

    private Browser browser;
 *
 * You may obtain a copy of the License at
            globalComposite.setLayout(new RowLayout());
                    statusLineManager = (IStatusLineManager) sslm.getParent();
    public DashboardBrowserComposite(DashboardItemContainer dashboardContainer, DashboardContainer viewContainer, Composite parent, int style, Point preferredSize) {
                statusLineManager.add(item);
        GridLayout layout = new GridLayout(1, false);
import org.jkiss.utils.CommonUtils;
        @Override
    }
    }
    }
    @Override

    private static class BrowserContributionItem extends ContributionItem {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return browser;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    }
            globalComposite = new Browser(parent, SWT.NONE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (item instanceof BrowserContributionItem bci) {

    }
    public Control getDashboardControl() {
 *
        layout.marginHeight = 0;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;


 * See the License for the specific language governing permissions and
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
    }
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
            this.browser.setUrl(itemConfig.evaluateURL(dashboardURL, dashboardContainer.getProject(), dashboardContainer.getDataSourceContainer()));

        String dashboardURL = itemConfig.getDashboardURL();
                }
                // It will be disposed when entire application is disposed
import org.eclipse.jface.action.*;
                }
    public Browser getBrowser() {
    private static void initializeGlobalBrowser(DashboardContainer viewContainer) {

            StatusLineLayoutData ld = new StatusLineLayoutData();
        this.browser = new Browser(this, SWT.NONE);
                if (statusLineManager instanceof SubStatusLineManager sslm) {


        if (actionBars != null) {
        }
        IActionBars actionBars = ActionBars.extractActionBars(viewContainer.getWorkbenchSite());

        public void fill(Composite parent) {
        this.browser.setLayoutData(new GridData(GridData.FILL_BOTH));
            globalComposite.setLayoutData(ld);
        layout.marginWidth = 0;
                BrowserContributionItem item = new BrowserContributionItem();

            if (statusLineManager != null) {
