        } else {
                UIConnectionMessages.dialog_driver_download_page_vendor_link,
            link.setToolTipText(driver.getWebURL());
 * you may not use this file except in compliance with the License.
                        PrefPageDriversMaven.PAGE_ID);
    abstract boolean performFinish();
        linksGroup.setLayoutData(gd);
 * Unless required by applicable law or agreed to in writing, software
            link.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING));
            UIUtils.createPlaceholder(linksGroup, 1).setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    public void widgetSelected(SelectionEvent e) {
}import org.jkiss.dbeaver.ui.preferences.PrefPageDriversMaven;
import org.eclipse.swt.widgets.Link;


import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
                        UIUtils.openWebBrowser(driver.getWebURL());
import org.eclipse.swt.events.SelectionAdapter;
    protected void createLinksPanel(Composite composite) {


            UIConnectionMessages.dialog_driver_download_page_download_conf_link,
        link.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_END));
                    UIUtils.showPreferencesFor(
            linksGroup,
                @Override
 */
                        PrefPageDrivers.PAGE_ID,
    DriverDownloadPage(String pageName, String title, ImageDescriptor titleImage) {
                    }
        Link link = UIUtils.createLink(
        //UIUtils.createPlaceholder(composite, 1).setLayoutData(new GridData(GridData.FILL_BOTH));
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
                linksGroup,
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.events.SelectionEvent;

        if (!CommonUtils.isEmpty(driver.getWebURL())) {



    public DriverDownloadWizard getWizard() {
        super(pageName, title, titleImage);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.verticalIndent = 10;
            });
        final DBPDriver driver = getWizard().getDriver();
                });
 *
    }
import org.eclipse.jface.resource.ImageDescriptor;
 *
                }
        Composite linksGroup = UIUtils.createPlaceholder(composite, 2);
        // Vendor site
 * DBeaver - Universal Database Manager
        return (DriverDownloadWizard) super.getWizard();


    }
import org.eclipse.swt.layout.GridData;
abstract class DriverDownloadPage extends WizardPage {
                public void widgetSelected(SelectionEvent e) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        null,
 * You may obtain a copy of the License at
            new SelectionAdapter() {
import org.eclipse.swt.widgets.Composite;
            Link link = UIUtils.createLink(
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    abstract void resolveLibraries();
 *

import org.eclipse.jface.wizard.WizardPage;
package org.jkiss.dbeaver.ui.dialogs.driver;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                new SelectionAdapter() {
                        null,
                    @Override
import org.jkiss.dbeaver.model.connection.DBPDriver;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.preferences.PrefPageDrivers;
        }
