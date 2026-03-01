 */
import org.jkiss.dbeaver.model.app.DBPProject;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.jkiss.dbeaver.utils.GeneralUtils;
        connectionInfo.setConnectionType(DBPConnectionType.DEV);
import org.jkiss.utils.IOUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * Unless required by applicable law or agreed to in writing, software
    }
            return;
        // Extract bundled database to workspace metadata
                IOUtils.copyStream(is, os);
        if (sqliteDriver == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        if (activeProject == null || !activeProject.isRegistryLoaded()) {
        DataSourceProviderDescriptor genericDSProvider = DataSourceProviderRegistry.getInstance().getDataSourceProvider("generic");
        if (isSampleDatabaseExists(registry)) {
        }
    public void initializeWorkbenchWindow(@NotNull IWorkbenchWindowConfigurer configurer) {
    }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
        try (InputStream is = WorkbenchInitializerCreateSampleDatabase.class.getClassLoader().getResourceAsStream(SAMPLE_DB_SOURCE_PATH)) {
    private static final String SAMPLE_DB_FILE_NAME = "Chinook.db";
            // No active project
            }
import org.eclipse.osgi.util.NLS;
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2025 DBeaver Corp and others
        dataSource = dsRegistry.createDataSource(SAMPLE_DB1_ID, sqliteDriver, connectionInfo);
import org.jkiss.dbeaver.DBException;
        if (DataSourceRegistry.getAllDataSources().size() > 1) {
            dsRegistry.addDataSource(dataSource);
        connectionInfo.setDatabaseName(dbFile.getAbsolutePath());
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
                shell,
        }

        }
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;
        dataSource.setSavePassword(true);

            DBWorkbench.getPlatform().getPreferenceStore().setValue(PROP_SAMPLE_DB_CANCELED, true);
            return;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.IWorkbenchWindowInitializer;
        if (!showCreateSampleDatabasePrompt(configurer.getWindow().getShell())) {
            log.error("Error extracting sample database to workspace", e);
            // Already exist

                NLS.bind(SampleDatabaseMessages.dialog_create_description, GeneralUtils.getProductName())
            log.error("Can't find generic data source provider");
        DriverDescriptor sqliteDriver = genericDSProvider.getDriver("sqlite_jdbc");
        }
 * limitations under the License.
    }
            return;
            log.error("Can't find SQLite driver is generic provider");
        try {
                SampleDatabaseMessages.dialog_create_title,
 * See the License for the specific language governing permissions and

        if (genericDSProvider == null) {
 *
        } catch (DBException e) {
            // Create was canceled
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static final String SAMPLE_DB1_FOLDER = "sample-database-sqlite-1";
import java.io.*;

        } catch (IOException e) {

import org.jkiss.dbeaver.registry.DataSourceRegistry;
package org.jkiss.dbeaver.ui.config.sample;
        if (!dbFolder.exists()) {
    static boolean showCreateSampleDatabasePrompt(Shell shell) {
        if (dataSource != null) {
            return;
        File dbFile = new File(dbFolder, SAMPLE_DB_FILE_NAME);
}
        DBPDataSourceRegistry registry = activeProject.getDataSourceRegistry();
        dataSource.getNavigatorSettings().setShowSystemObjects(true);
            return;
    static boolean isSampleDatabaseExists(DBPDataSourceRegistry registry) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 *
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
            DBWorkbench.getPlatformUI().showError("Connection create error", null, e);
        connectionInfo.setUrl(sqliteDriver.getConnectionURL(connectionInfo));
        }
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionType;

import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        }
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        return UIUtils.confirmAction(
    @Override
import org.eclipse.swt.widgets.Shell;
    private static final String PROP_SAMPLE_DB_CANCELED = "sample.database.canceled";
    private static final Log log = Log.getLog(WorkbenchInitializerCreateSampleDatabase.class);

        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PROP_SAMPLE_DB_CANCELED)) {
        }

/*
        );
            return;
public class WorkbenchInitializerCreateSampleDatabase implements IWorkbenchWindowInitializer {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
        return registry.getDataSource(SAMPLE_DB1_ID) != null;
            // Seems to be experienced user - no need in sample db
        DataSourceDescriptor dataSource = (DataSourceDescriptor)dsRegistry.getDataSource(SAMPLE_DB1_ID);
    private static final String SAMPLE_DB1_ID = "dbeaver-sample-database-sqlite-1";
                return;
                log.error("Can't create target database folder " + dbFolder.getAbsolutePath());
            return;
        dataSource.setName("DBeaver Sample Database (SQLite)");
import org.jkiss.dbeaver.Log;
            if (!dbFolder.mkdirs()) {
        } else {
        DBPConnectionConfiguration connectionInfo = new DBPConnectionConfiguration();
            try (OutputStream os = new FileOutputStream(dbFile)) {
        }
    static void createSampleDatabase(DBPDataSourceRegistry dsRegistry) {
 * You may obtain a copy of the License at
        }
        File dbFolder = GeneralUtils.getMetadataFolder().resolve(SAMPLE_DB1_FOLDER).toFile();

            createSampleDatabase(registry);
    private static final String SAMPLE_DB_SOURCE_PATH = "data/" + SAMPLE_DB_FILE_NAME;
