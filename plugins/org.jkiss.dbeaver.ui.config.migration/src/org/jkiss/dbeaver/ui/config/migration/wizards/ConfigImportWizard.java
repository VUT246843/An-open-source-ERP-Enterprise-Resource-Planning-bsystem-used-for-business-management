        //connectionInfo.getDriver()
            config.setHandlers(connectionInfo.getNetworkHandlers());
     * Try to parse url by driver sample url. 
            DBWorkbench.getPlatformUI().showError(ImportConfigMessages.config_import_wizard_import_driver, null, e);
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        config.setUserName(connectionInfo.getUser());
            if (connectionInfo.isChecked()) {
        return true;
		mainPage = createMainPage(); //NON-NLS-1
            }
        config.setHostPort(connectionInfo.getPort());
    }
                    .orElse(matchedDrivers.get(0));
            driver.setName(driverInfo.getName());
            config.setConfigurationType(DBPDriverConfigurationType.URL);
    public boolean performFinish() {
            connectionInfo.getDriver(),
                connectionInfo.setDriver(driver);
    }
            connectionInfo.setDriver(driver);
    }
                    return false;
         * Still we proceed to import cause can be any other valid url format for the driver.
            driver.setDriverDefaultPort(driverInfo.getDefaultPort());
                if (connectionInfo.isChecked() && !findOrCreateDriver(connectionInfo)) {
     * NOTE sampleURL is not the only possible way to define a valid url.
            throw new DBException("Cannot create driver '" + driverInfo.getName() + "' - no driver class specified");
    private void importConnection(ImportData importData, ImportConnectionInfo connectionInfo) {

        /*
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
                if (driverClassName != null && driverClassName.equals(driverInfo.getDriverClass())) {

 * DBeaver - Universal Database Manager
        }
		setNeedsProgressMonitor(true);
    /**
        {
	@Override
        if (driver != null) {
        if (CommonUtils.isEmpty(connectionInfo.getHost())) {
            }
            // No URL - generate from props
            DriverDescriptor driver = driverClassMap.get(driverInfo.getDriverClass());
import org.eclipse.ui.IImportWizard;
            driver = matchedDrivers.stream()
            connectionInfo.setHost(matcher.group("host"));
    public void addPages() {
            driver.setDriverDefaultDatabase(driverInfo.getDefaultDatabase());
        } catch (DBException e) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
        return false;
            }
        }
        }
            // Create new driver
            config.setConfigurationType(DBPDriverConfigurationType.MANUAL);
    @Override
            throw new DBException("Cannot create driver '" + driverInfo.getName() + "' - no connection URL pattern specified");
    public ConfigImportWizard() {
            conConfig.setHostPort(connectionInfo.getPort());
        }
        final DBPDataSourceRegistry dataSourceRegistry = NavigatorUtils.getSelectedProject().getDataSourceRegistry();
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        config.setHostName(connectionInfo.getHost());
 * you may not use this file except in compliance with the License.
public abstract class ConfigImportWizard extends Wizard implements IImportWizard {
import org.jkiss.dbeaver.DBException;
            }
        if (!connectionInfo.getNetworkHandlers().isEmpty()) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
            driver.setModified(true);
            return false;
         * Here parsing was not successful.
    private Map<String, DriverDescriptor> driverClassMap = new HashMap<>();
        } catch (DBException e) {
        for (ImportConnectionInfo connectionInfo : importData.getConnections()) {
            for (String path : driverInfo.getLibraries()) {
                break;
    
		super();
    {
        config.setUrl(connectionInfo.getUrl());
 * You may obtain a copy of the License at

	}
    private boolean findOrCreateDriver(ImportConnectionInfo connectionInfo) throws DBException
            url = connectionInfo.getDriver().getConnectionURL(conConfig);
            dataSourceRegistry.addDataSource(dataSource);
            driver.setDriverClassName(driverInfo.getDriverClass());
                }

            }
    {
 * Unless required by applicable law or agreed to in writing, software
            sampleURL = connectionInfo.getDriver().getSampleURL();
import org.jkiss.utils.CommonUtils;
            conConfig.setDatabaseName(connectionInfo.getDatabase());
        String sampleURL = driverInfo.getSampleURL();
                    matchedDrivers.add(driver);
    @Override
                importConnection(importData, connectionInfo);
        }
        if (matchedDrivers.isEmpty()) {
            log.error(e.getMessage(), e);
        config.setDatabaseName(connectionInfo.getDatabase());
            driver.setDriverDefaultServer(driverInfo.getDefaultServer());
            driver = genericProvider.createDriver();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
            if (connectionInfo.getHost() == null) {
                    .filter(driverDescriptor -> driverDescriptor.getName().equalsIgnoreCase(driverInfo.getName()))
    private ConfigImportWizardPage mainPage;
        }
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
            connectionInfo.setPort(matcher.group("port"));
        try {
        } catch (DBException e) {
                }
 *
import org.eclipse.jface.wizard.Wizard;
            driver.setSampleURL(driverInfo.getSampleURL());

        dataSource.setFolder(importData.getDataSourceFolder());
        dataSource.setName(name);

        }
    protected abstract ConfigImportWizardPage createMainPage();
        String name = connectionInfo.getAlias();
            for (ImportConnectionInfo connectionInfo : importData.getConnections()) {
        if (url == null) {
import org.jkiss.dbeaver.model.DatabaseURL;
            DataSourceDescriptor.generateNewId(connectionInfo.getDriver()),

        }
        
 *     http://www.apache.org/licenses/LICENSE-2.0
        config.setUserPassword(connectionInfo.getPassword());
            UIUtils.showMessageBox(getShell(), ImportConfigMessages.config_import_wizard_extract_url_parameters, e.getMessage(), SWT.ICON_WARNING);
    protected void adaptConnectionUrl(ImportConnectionInfo connectionInfo) throws DBException
        DBPConnectionConfiguration config = new DBPConnectionConfiguration();
            config

import org.jkiss.dbeaver.registry.DataSourceDescriptor;
            if (driver != null) {
        }
        super.addPages(); 
 *

            return;
            }
            //fixme driverClassName is not uniq
            return;
         */
            driverClassMap.put(driver.getDriverClassName(), driver);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        dataSource.setSavePassword(!CommonUtils.isEmpty(config.getUserPassword()));
            // Flush drivers configuration


            connectionInfo.setDatabase(matcher.group("database"));
            conConfig.setHostName(connectionInfo.getHost());
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
        //It allows to specify whether connection url should be used directly or not after connection creation.
            adaptConnectionUrl(connectionInfo);
    }
                throw new DBException("Generic datasource provider not found");
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            for (DriverDescriptor driver : dataSourceProvider.getEnabledDrivers()) {
        config.setAuthProperties(connectionInfo.getAuthProperties());
 * Licensed under the Apache License, Version 2.0 (the "License");
         * URL is not null and not agree with sampleURL from drive. 

            name = connectionInfo.getAlias() + " " + (i + 1);
                    .findFirst()
    }
import java.util.ArrayList;
        try {
            parseUrlAsDriverSampleUrl(connectionInfo);
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
package org.jkiss.dbeaver.ui.config.migration.wizards;
 *
            return true;
            }
import org.eclipse.ui.IWorkbench;
        addPage(mainPage);        
            driver.setDescription(driverInfo.getDescription());
        String sampleURL = connectionInfo.getDriverInfo().getSampleURL();
     *

        config.setAuthModelId(connectionInfo.getAuthModelId());
	}


import org.jkiss.dbeaver.Log;
        }
            }
                return true;
        

        log.info("Import url as is it for url:" + url);
            connectionInfo.setDriver(driver);

            DBWorkbench.getPlatformUI().showError(ImportConfigMessages.config_import_wizard_header_import_configuration, null, e);
        }
    }
        }
        final ImportData importData = mainPage.getImportData();
        Matcher matcher = DatabaseURL.getPattern(sampleURL).matcher(url);
            driver.setDriverDefaultUser(driverInfo.getDefaultUser());

import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        config.setProviderProperties(connectionInfo.getProviderProperties());
                driver.addDriverLibrary(path, DBPDriverLibrary.FileType.jar);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            driver.setConnectionProperties(driverInfo.getProperties());
            connectionInfo.setUrl(url);
     */
        DataSourceDescriptor dataSource = dataSourceRegistry.createDataSource(
        }
 * See the License for the specific language governing permissions and
            if (dataSourceRegistry.findDataSourceByName(name) == null) {
        DriverDescriptor driver;
                throw new DBCException("Can't detect target driver for '" + connectionInfo.getAlias() + "'");
            // Use the only found driver
            genericProvider.addDriver(driver);
        final DataSourceProviderRegistry registry = DataSourceProviderRegistry.getInstance();
            final DataSourceProviderDescriptor genericProvider = registry.getDataSourceProvider("generic");
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    private void parseUrlAsDriverSampleUrl(ImportConnectionInfo connectionInfo) throws DBException {
        } catch (Exception e) {
     * @throws DBException in case url does not reflect the sample one from driver.
        
        List<DriverDescriptor> matchedDrivers = new ArrayList<>();
    private static final Log log = Log.getLog(ConfigImportWizard.class);
        if (CommonUtils.isEmpty(sampleURL)) {
        }
            DataSourceProviderRegistry.getInstance().saveDrivers();
import org.eclipse.swt.SWT;
import java.util.regex.Matcher;
import java.util.HashMap;
        for (int i = 0; ; i++) {

        if (connectionInfo.getDriver() != null) {
            }
        }
                final String driverClassName = driver.getDriverClassName();
import java.util.Map;
 * limitations under the License.
/*
        for (DataSourceProviderDescriptor dataSourceProvider : registry.getDataSourceProviders()) {
            DBPConnectionConfiguration conConfig = new DBPConnectionConfiguration();
        final ImportDriverInfo driverInfo = connectionInfo.getDriverInfo();
import java.util.List;
        config.setProperties(connectionInfo.getProperties());
        String url = connectionInfo.getUrl();
        );
        }
        String url = connectionInfo.getUrl();
}
        if (CommonUtils.isEmpty(driverInfo.getDriverClass())) {
        mainPage.deactivatePage();
            if (genericProvider == null) {
        try {
        
        try {
        if (matcher.matches()) {
            if (connectionInfo.getDriver() == null) {
        
import org.eclipse.jface.viewers.IStructuredSelection;
 */
        } else {
import org.jkiss.dbeaver.model.exec.DBCException;
		setWindowTitle(ImportConfigMessages.config_import_wizard_header_import_configuration);
                throw new DBCException("No URL and no host name - can't import connection '" + connectionInfo.getAlias() + "'");
