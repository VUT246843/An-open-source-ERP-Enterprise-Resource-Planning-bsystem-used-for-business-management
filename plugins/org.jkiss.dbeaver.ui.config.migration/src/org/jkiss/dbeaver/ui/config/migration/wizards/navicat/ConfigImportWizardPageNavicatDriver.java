    }
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    @Override
        getWizard().getContainer().updateMessage();
    }
        }
        GridData gd = new GridData(GridData.FILL_BOTH);
    }
import org.jkiss.dbeaver.model.connection.DBPDriver;
        return selectedDriver;
public class ConfigImportWizardPageNavicatDriver extends WizardPage
        implements ISelectionChangedListener, IDoubleClickListener {
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;


        Composite placeholder = new Composite(parent, SWT.NONE);
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
    {
import org.eclipse.swt.layout.GridLayout;
            }
 *

import org.jkiss.dbeaver.ui.dialogs.driver.DriverSelectViewer;
    public void createControl(Composite parent)
        placeholder.setLayout(new GridLayout(1, true));
        setTitle(ImportConfigMessages.config_import_wizard_driver_selection_name);
}
        return selectedDriver != null;
import org.eclipse.swt.layout.GridData;
    {
    public DBPDriver getSelectedDriver()
 * distributed under the License is distributed on an "AS IS" BASIS,
        driverSelectViewer.getControl().setLayoutData(gd);
    {
    }
        setControl(placeholder);
        if (selectedDriver != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setDescription(ImportConfigMessages.config_import_wizard_driver_selection_description);
    @Override

 * limitations under the License.
        getWizard().getContainer().updateButtons();
        this.setMessage("");
 * you may not use this file except in compliance with the License.


            if (selectedObject instanceof DBPDriver) {

                this.setMessage(selectedDriver.getDescription());
import org.eclipse.jface.wizard.WizardPage;
    public boolean isPageComplete()

 * Copyright (C) 2010-2025 DBeaver Corp and others
    private DriverDescriptor selectedDriver;
        DriverSelectViewer driverSelectViewer = new DriverSelectViewer(placeholder, this,
        ISelection selection = event.getSelection();
package org.jkiss.dbeaver.ui.config.migration.wizards.navicat;
import org.eclipse.swt.widgets.Composite;
    {
    {
        }

    protected ConfigImportWizardPageNavicatDriver()
            getWizard().getContainer().showPage(getWizard().getNextPage(this));
    }
            Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
        super(ImportConfigMessages.config_import_wizard_page_th_driver);
import org.eclipse.jface.viewers.*;

    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
/*
        if (selection instanceof IStructuredSelection) {
 * See the License for the specific language governing permissions and
 *
 * DBeaver - Universal Database Manager
    public void doubleClick(DoubleClickEvent event)
import org.eclipse.swt.SWT;
 * Unless required by applicable law or agreed to in writing, software
                DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders(), true);
    public void selectionChanged(SelectionChangedEvent event)
                selectedDriver = (DriverDescriptor) selectedObject;

        gd.heightHint = 200;
        this.selectedDriver = null;

 *
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
