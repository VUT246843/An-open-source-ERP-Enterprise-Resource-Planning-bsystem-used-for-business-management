                    selectedConnections.add(((DBPDataSourceContainerProvider) item).getDataSourceContainer());
 * Licensed under the Apache License, Version 2.0 (the "License");
        setWindowTitle(CoreMessages.dialog_migrate_wizard_window_title);
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        private DriverSelectViewer driverSelectViewer;
        public List<DataSourceDescriptor> getSelectedConnections()
import org.jkiss.dbeaver.model.struct.DBSWrapper;
                if (item instanceof DBPDataSourceContainerProvider) {
import org.eclipse.swt.events.SelectionListener;
import java.util.*;
        public void createControl(Composite parent)
        addPage(pageDriver);
    public boolean performFinish()
        }
    @Override
            setDescription(CoreMessages.dialog_migrate_wizard_start_description);
                    item.setImage(DBeaverIcons.getImage(ds.getDriver().getIcon()));
            if (isReconnect) {
        pageConnections = new PageConnections();
    public MigrateConnectionWizard(DBPDataSourceRegistry registry, IStructuredSelection selection)
        @Override
                }
import org.eclipse.jface.viewers.SelectionChangedEvent;
    private PageConnections pageConnections;
            return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.TableItem;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                }
                } else if (item instanceof DBSObject) {
            gd.heightHint = 200;
            super("migrateConnectionDriver"); //$NON-NLS-1$
        {
                    result.add((DataSourceDescriptor) item.getData());

 * Connection migration wizard
                placeholder,
        final DriverDescriptor targetDriver = pageDriver.selectedDriver;
        @Override
import org.eclipse.osgi.util.NLS;
            boolean isReconnect = UIUtils.confirmAction(
    }
import org.eclipse.jface.dialogs.Dialog;
                    item.setData(ds);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        }

import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
            gd.heightHint = 400;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!changedConnections.isEmpty()) {


            driverSelectViewer = new DriverSelectViewer(
                @Override
    }
                true);
        {
            this.selectedDriver = null;
            conn.persistConfiguration();
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
import org.eclipse.swt.SWT;
 *
import org.eclipse.jface.wizard.WizardPage;
    class PageDriver extends WizardPage implements ISelectionChangedListener {
    {
            connectionsViewer.setLayoutData(gd);
        private Table connectionsViewer;
package org.jkiss.dbeaver.ui.dialogs.connection;
        {

            connectionsViewer = new Table(composite, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.ISelection;
            Composite placeholder = UIUtils.createPlaceholder(parent, 1);
                    selectedDriver = (DriverDescriptor) selectedObject;


        if (selection != null && !selection.isEmpty()) {
                @Override
            );

        List<DataSourceDescriptor> changedConnections = new ArrayList<>();
    {
 * You may obtain a copy of the License at
        return true;


            }
                for (DBPDataSourceContainer ds : registry.getDataSources()) {
        }
            super(CoreMessages.dialog_migrate_wizard_name);
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.DBeaverIcons;
            return pageDriver;
                if (item.getChecked()) {
            getWizard().getContainer().updateButtons();
        private DriverDescriptor selectedDriver;
            }
        } else {
    }
                public void widgetSelected(SelectionEvent e)
    private PageDriver pageDriver;
                    selectedConnections.add((DBPDataSourceContainer) item);
            if (!conn.getDriver().equals(targetDriver)) {
 * distributed under the License is distributed on an "AS IS" BASIS,

     * Adding the page to the wizard.
        {
    }
        public void selectionChanged(SelectionChangedEvent event)
            setControl(composite);
                this,

            }
            }
 */
import org.eclipse.jface.viewers.ISelectionChangedListener;
        }
import org.eclipse.swt.events.SelectionEvent;
        public boolean isPageComplete()
            Dialog.applyDialogFont(placeholder);
    public void addPages()
        }
        public void createControl(Composite parent)
 * you may not use this file except in compliance with the License.
        for (DataSourceDescriptor conn : connections) {
    {


import org.jkiss.dbeaver.core.CoreMessages;
                {
                }
            setDescription(CoreMessages.dialog_migrate_wizard_choose_driver_description);
                    getContainer().showPage(getNextPage());
                    if (selectedConnections.contains(ds)) {
    @Override
                    selectedConnections.add(((DBSWrapper) item).getObject().getDataSource().getContainer());
			}
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceHandler;
            });
            for (TableItem item : connectionsViewer.getItems()) {
                CoreMessages.dialog_migrate_wizard_connection_changed_title,
            return this.selectedDriver != null;
        }
import org.eclipse.jface.wizard.IWizardPage;
                }
            Composite composite = UIUtils.createComposite(parent, 1);
                DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders(),

                        item.setChecked(true);
                    TableItem item = new TableItem(connectionsViewer, SWT.NONE);
        {
            }
 */
                UIUtils.getActiveWorkbenchShell(),
/*
        @Override
            return pageConnections;
        protected PageConnections()
        @Override
        final List<DataSourceDescriptor> connections = pageConnections.getSelectedConnections();
        }
import org.eclipse.swt.widgets.Composite;
                changedConnections.add(conn);
            final List<DataSourceDescriptor> result = new ArrayList<>();
public class MigrateConnectionWizard extends Wizard
     */
        PageDriver()
                changedConnections.forEach(c -> DataSourceHandler.reconnectDataSource(null, c));
                    selectedConnections.add(((DBSObject) item).getDataSource().getContainer());
                } else if (item instanceof DBSWrapper) {
import org.jkiss.dbeaver.ui.dialogs.driver.DriverSelectViewer;
        }
    {
 * Unless required by applicable law or agreed to in writing, software
    private final DBPDataSourceRegistry registry;
        {
        @Override
                if (item.getChecked()) {
            setTitle(CoreMessages.dialog_migrate_wizard_choose_driver_title);
                }
                }
            if (selection instanceof IStructuredSelection) {
                Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
            return result;
            setControl(placeholder);
        addPage(pageConnections);
                    item.setText(ds.getName());
import org.eclipse.jface.wizard.Wizard;
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                    }

            for (TableItem item : connectionsViewer.getItems()) {
                Object item = iter.next();
            }
            driverSelectViewer.getControl().setLayoutData(gd);
        }
                } else if (item instanceof DBPDataSourceContainer) {
import org.jkiss.dbeaver.model.struct.DBSObject;
            GridData gd = new GridData(GridData.FILL_BOTH);
    class PageConnections extends WizardPage {
{
    }

import org.eclipse.jface.viewers.IStructuredSelection;
        {
                {
        }
                    getContainer().updateButtons();
            if (registry != null) {

        {
            GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
}
    public IWizardPage getStartingPage()
 * limitations under the License.
/**
                NLS.bind(CoreMessages.dialog_migrate_wizard_connection_changed_message, changedConnections.size())
            connectionsViewer.addSelectionListener(new SelectionListener() {
        }
        if (!selectedConnections.isEmpty()) {

                }

            conn.setDriver(targetDriver);
            for (Iterator<?> iter = selection.iterator(); iter.hasNext(); ) {
        public boolean isPageComplete()
 * DBeaver - Universal Database Manager
                public void widgetDefaultSelected(SelectionEvent e)
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.ui.UIUtils;

        this.registry = registry;
            gd.widthHint = 400;
    private final Set<DBPDataSourceContainer> selectedConnections = new HashSet<>();

                if (selectedObject instanceof DBPDriver) {
            ISelection selection = event.getSelection();
        pageDriver = new PageDriver();
    @Override
            setTitle(CoreMessages.dialog_migrate_wizard_start_title);
    /**
 *
        }
    }
                    return true;
