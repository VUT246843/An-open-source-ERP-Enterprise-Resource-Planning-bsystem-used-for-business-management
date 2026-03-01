    {
    public boolean isPageComplete()
 */
public class ConfigImportWizardPageCustomDriver extends WizardPage
 * Unless required by applicable law or agreed to in writing, software
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    {
        Composite placeholder = new Composite(parent, SWT.NONE);
import org.eclipse.swt.layout.GridData;

        super(ImportConfigMessages.config_import_wizard_page_th_driver);
        getWizard().getContainer().updateButtons();
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
import org.eclipse.swt.layout.GridLayout;
        gd.heightHint = 200;
                DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders(), true);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.SWT;
            if (selectedObject instanceof DBPDriver) {
        this.selectedDriver = null;

        implements ISelectionChangedListener, IDoubleClickListener {

import org.jkiss.dbeaver.ui.dialogs.driver.DriverSelectViewer;
        GridData gd = new GridData(GridData.FILL_BOTH);
        }
    private DriverDescriptor selectedDriver;
    }
    @Override
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    }
    {
        return selectedDriver;
        setTitle(ImportConfigMessages.config_import_wizard_driver_selection_name);

            Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
    {
package org.jkiss.dbeaver.ui.config.migration.wizards.custom;

    @Override
 *
                selectedDriver = (DriverDescriptor) selectedObject;
        setDescription(ImportConfigMessages.config_import_wizard_driver_selection_description);

            getWizard().getContainer().showPage(getWizard().getNextPage(this));
        return selectedDriver != null;
        if (selectedDriver != null) {

    public void selectionChanged(SelectionChangedEvent event)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    {
        }
        if (selection instanceof IStructuredSelection) {
    }
 * See the License for the specific language governing permissions and
        getWizard().getContainer().updateMessage();
 *
        this.setMessage("");
        DriverSelectViewer driverSelectViewer = new DriverSelectViewer(placeholder, this,

    public DBPDriver getSelectedDriver()
 * DBeaver - Universal Database Manager
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.connection.DBPDriver;
    protected ConfigImportWizardPageCustomDriver()
        ISelection selection = event.getSelection();
    public void doubleClick(DoubleClickEvent event)
 * You may obtain a copy of the License at
    }

 *
}
        placeholder.setLayout(new GridLayout(1, true));

    {
                this.setMessage(selectedDriver.getDescription());
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
    @Override
 * you may not use this file except in compliance with the License.
    public void createControl(Composite parent)
        setControl(placeholder);
import org.eclipse.jface.wizard.WizardPage;
            }
        driverSelectViewer.getControl().setLayoutData(gd);
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.Composite;

