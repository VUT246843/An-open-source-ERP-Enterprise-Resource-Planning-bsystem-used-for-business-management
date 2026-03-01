            return null;//pageDrivers.getSelectedDriver().isEmbedded() ? pageGeneral : pageNetwork;
{
                DBWorkbench.getPlatformUI().showError("Persist failed", "Error persisting connection", e);

    {
        if (initialConfiguration != null) {
        });

            } catch (DBException e) {
 *
    }
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
    DBNBrowseSettings getSelectedNavigatorSettings() {
    List<DBPDataSourceProviderDescriptor> getAvailableProvides()
            } catch (DBException e) {
    }
    }
            final Object element = selection.getFirstElement();
        if (dataSourceNew == null) {
    }
    }
            saveSettings(dataSourceNew);
    @Override
                final ConnectionPageDeprecation nextPage = new ConnectionPageDeprecation(driver);
                return PersistResult.ERROR;

    }
import java.util.*;
     */
        return pageDrivers.getNavigatorSettings();
                return pageGeneral;
                    wizard -> wizard.setDriverSubstitution((DBPDriverSubstitutionDescriptor) event.getNewValue())
 * See the License for the specific language governing permissions and
        return dataSourceNew;
            if (view != null) {
        } else {
    {
            }
            );
    private DataSourceDescriptor dataSourceNew;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            ConnectionPageSettings pageSettings = getPageSettings();
public class NewConnectionWizard extends ConnectionWizard

import org.jkiss.dbeaver.ui.IActionConstants;
    {
    @Override
        }
                dataSourceRegistry.addDataSource(dataSourceNew);

                return PersistResult.ERROR;
        }
        }
                nextPage.setWizard(this);
        }
        }
    }
     * This method is called when 'Finish' button is pressed in

        // Initial settings
    {
    @SuppressWarnings("unused")


    @Nullable
        return PersistResult.CHANGED;
    {
            return initialConfiguration;

        }
            if (ConnectionPageAbstract.PROP_DRIVER_SUBSTITUTION.equals(event.getProperty())) {
    public ConnectionPageSettings getPageSettings()
    }
        } else {
            if (pageSettings == null) {

 */
                dataSourceTpl.getId(),
    }
    public NewConnectionWizard(@Nullable DBPDriver initialDriver, @Nullable DBPConnectionConfiguration initialConfiguration) {
    }
    /**

/*
        this.initialConfiguration = initialConfiguration;
     * using wizard as execution context.
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.dialogs.connection;
    /** A default constructor used by Eclipse's "New" command */
                driver,
        }
        final DBPDriver driver = dataSource.getDriver();
        DBPDataSourceRegistry dataSourceRegistry = Objects.requireNonNull(getDataSourceRegistry());
    @Override
import org.jkiss.dbeaver.registry.DataSourceViewRegistry;

 *
        /*if (initialDriver == null) */{
                return pageSettings;
    @Override
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            }
        setWindowTitle(CoreMessages.dialog_new_connection_wizard_title);
                pageDrivers.setSelectedDriver(initialDriver);
    @Override
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
            DataSourceViewDescriptor view = DataSourceViewRegistry.getInstance().findView(provider, IActionConstants.NEW_CONNECTION_POINT);
            }
            if (element instanceof DBNLocalFolder) {
import org.jkiss.dbeaver.registry.DataSourceViewDescriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.initialDriver = initialDriver;
    @Nullable
        //addPage(pageNetwork);

    private final DBPDriver initialDriver;
 * This is a sample new wizard.
        return pageDrivers.getConnectionProject();
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    private ConnectionPageGeneral pageGeneral;
            pageDrivers = new ConnectionPageDriver(this);
    protected PersistResult persistDataSource() {
        ConnectionPageSettings pageSettings = getPageSettings(driver);

    }
    @Override
            }
        DBPProject project = initialDriver == null ? pageDrivers.getConnectionProject() : DBWorkbench.getPlatform().getWorkspace().getActiveProject();

            try {
            ConnectionFeatures.CONNECTION_CREATE.use(Map.of("driver", dataSourceNew.getDriver().getPreconfiguredId()));
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
    public void init(IWorkbench workbench, IStructuredSelection selection)
        pageGeneral = new ConnectionPageGeneral(this);
            final DBPDriver driver = getSelectedDriver();
import org.jkiss.dbeaver.DBException;
    public IWizardPage getNextPage(IWizardPage page)
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
            ConnectionPageSettings pageSettings = getPageSettings(driver);
        }
        //pageNetwork = new ConnectionPageNetwork(this);
    }
        for (DBPDataSourceProviderDescriptor provider : DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders()) {
        return availableProvides;

import org.eclipse.jface.dialogs.Dialog;


    @Override
    private ConnectionPageDriver pageDrivers;
        DriverDescriptor selectedDriver = (DriverDescriptor) getSelectedDriver();
                addPage(pageSettings);
            saveSettings(dataSourceNew);
                    UIUtils.getActiveWorkbenchWindow(),
        return persistDataSource() != PersistResult.ERROR;
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    public DataSourceDescriptor getOriginalDataSource() {
            }
            return;
            return PersistResult.UNCHANGED;

    @Override
    public IWizardPage getStartingPage() {
    private final List<DBPDataSourceProviderDescriptor> availableProvides = new ArrayList<>();


            }
import org.jkiss.dbeaver.model.connection.DBPDriver;
        } else if (page instanceof ConnectionPageSettings) {
import org.eclipse.jface.wizard.IWizardPage;
    }

    /**
import org.jkiss.dbeaver.ui.UIUtils;

    @Override
    public boolean isNew() {
    @NotNull
        this.selection = selection;
        }
    @Override
    private IStructuredSelection selection;
     * Adding the page to the wizard.
                DBWorkbench.getPlatformUI().showError("Create failed", "Error adding new connections", e);
        if (pageSettings != null) {
    }

                settingsPages.put(provider, pageSettings);
                ConnectionPageSettings pageSettings = new ConnectionPageSettings(this, view, getDriverSubstitution());
/**
            return null;
                dataSourceTpl.getConnectionConfiguration()
    public DBPDriver getSelectedDriver()
    private final DBPConnectionConfiguration initialConfiguration;
        if (initialDriver == null) {

    DBPProject getSelectedProject() {

                ));

import org.eclipse.jface.viewers.IStructuredSelection;
            try {
    public NewConnectionWizard() {
    @Override

    protected DBPConnectionConfiguration getDefaultConnectionConfiguration() {
            if (driver.isNotAvailable()) {
            DataSourceDescriptor dataSourceTpl = pageSettings == null ? getActiveDataSource() : pageSettings.getActiveDataSource();
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
import org.jkiss.dbeaver.core.CoreMessages;
        return pageDrivers;
            }
     */
            return super.getStartingPage();
            dataSourceNew.persistConfiguration();
    {
    @Override
        DriverDescriptor driver = (DriverDescriptor) getSelectedDriver();
        return initialDriver != null ? initialDriver : getPageDrivers().getSelectedDriver();
        return super.getDefaultConnectionConfiguration();
 * DBeaver - Universal Database Manager
            dataSourceNew = dataSourceRegistry.createDataSource(
    }


import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        addPropertyChangeListener(event -> {
 */
            }
        return super.getPreviousPage(page);
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    }

 * Licensed under the Apache License, Version 2.0 (the "License");

        this(null, null);
    @Override
        return this.settingsPages.get(selectedDriver.getProviderDescriptor());
            dataSourceNew.copyFrom(dataSourceTpl);
}
        return this.settingsPages.get(driver.getProviderDescriptor());
     * the wizard. We will create an operation and run it
            return null;
    private final Map<DBPDataSourceProviderDescriptor, ConnectionPageSettings> settingsPages = new HashMap<>();
    {
    }
        } else {
    ConnectionPageDriver getPageDrivers()
import org.jkiss.code.Nullable;
    public void addPages()
    @Override
                pageGeneral.setDataSourceFolder(((DBNLocalFolder) element).getFolder());


 *
            pageSettings.saveSettings(dataSource);
    }
    }
            addPage(pageDrivers);
            availableProvides.add(provider);
    protected void saveSettings(DataSourceDescriptor dataSource) {
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
    {
    @Override
                    getActiveDataSource().getConnectionConfiguration(),
            if (initialDriver != null) {
    }
import org.eclipse.ui.IWorkbench;
        if (initialDriver != null && page instanceof ConnectionPageSettings) {
    @Override
        if (selection != null && !selection.isEmpty()) {
            return getPageSettings((DriverDescriptor) getSelectedDriver());
                dataSourceRegistry.checkForErrors();
                    getActiveDataSource().getDriver(),
    public boolean performFinish() {
            } else {
import org.jkiss.dbeaver.ui.ConnectionFeatures;

        if (driver.isNotAvailable()) {
        return true;
        }
        //pageNetwork.saveSettings(dataSource);
 *     http://www.apache.org/licenses/LICENSE-2.0
        addPage(pageGeneral);

        return project == null ? null : project.getDataSourceRegistry();
                return nextPage;
        if (selectedDriver == null) {
        pageGeneral.saveSettings(dataSource);
    ConnectionPageSettings getPageSettings(DBPDriver driver)
        }
    public DBPDataSourceRegistry getDataSourceRegistry() {
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.code.NotNull;
        if (page == pageDrivers) {
            return null;
 * You may obtain a copy of the License at
                ((Dialog) getContainer()).close();
        if (driver.isNotAvailable()) {
        }
                UIUtils.asyncExec(() -> NewConnectionDialog.openNewConnectionDialog(
    public IWizardPage getPreviousPage(IWizardPage page) {
            // We need drivers page always as it contains some settings
 * limitations under the License.
