    @Override
    protected void initialize() {
            // Activate plugin services
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (sqlDialectRegistry == null) {
    public DBPDataFormatterRegistry getDataFormatterRegistry() {
        // Global pref events forwarder
import java.nio.file.Paths;
            );
                }
    private DBNModel navigatorModel;
                monitor.subTask("Create temp folder '" + tempFolderPath + "'");
        if (!getApplication().isExclusiveMode()) {
    public synchronized void dispose() {
    protected OSDescriptor localSystem;
    @NotNull

            try {
        return this.localSystem;
                log.error("Error deactivating plugin service", e);
            }
    @NotNull
            return new LocalTaskController();

                activatedServices.add(pluginService);
        });
            throw new IllegalStateException("Can't detect application installation folder.", e);
    @Override
    }
    public DBDRegistry getValueHandlerRegistry() {
import org.jkiss.dbeaver.DBException;
                } else {
                }
            }

        );
        Path iniFile = configPath.resolve(ECLIPSE_CONFIG_FILE);
import org.jkiss.dbeaver.registry.formatter.DataFormatterRegistry;
 */
        getPreferenceStore().setValue(ModelPreferences.PLATFORM_LANGUAGE, language.getCode());
            this.localSystem = new OSDescriptor(Platform.getOS(), Platform.getOSArch());
    }
    @NotNull
                log.warn("Can not delete temp folder '" + tempFolder + "'");

    @NotNull
    public DBFileController createFileController() {
                            final String sysUserFolder = System.getProperty(StandardConstants.ENV_USER_HOME);
    @NotNull
                    }
                if (!Files.exists(tmpFolder)) {
                    if (!Files.exists(tempFolder)) {
    public static final String DBEAVER_DATA_DIR = "DBeaverData";

    @Override
                getLocalWorkspaceConfigFolder()
import org.jkiss.dbeaver.model.task.DBTTaskController;
                        } catch (IOException ex) {
        }
import org.jkiss.code.NotNull;
                }
                if (!CommonUtils.isEmpty(sysTempFolder)) {
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        return getPluginConfigurationController(null);
            for (DBPDataSourceContainer ds : DataSourceRegistry.getAllDataSources()) {
    @Override
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            //this.navigatorModel = null;
        if (Files.exists(productPluginPath)) {
    @Override
            getWorkspace().getMetadataFolder().resolve(FILES_FOLDER)
    @Override
            if (this.platformLanguage == null) {
    public static final String CONFIG_FOLDER = ".config";
import org.jkiss.dbeaver.model.fs.DBFRegistry;

                                    }
            iniFile = configPath.resolve(APP_CONFIG_FILE);
    
            this.navigatorModel.dispose();
        return DataTypeProviderRegistry.getInstance();
            }
            } catch (IOException e) {
        }
        if (tempFolder != null) {
    public DBWHandlerRegistry getNetworkHandlerRegistry() {
        if (controller == null) {
 * Unless required by applicable law or agreed to in writing, software
        return NetworkHandlerRegistry.getInstance();
    public DBConfigurationController getProductConfigurationController() {
    @NotNull
    private SQLDialectMetadataRegistry sqlDialectRegistry;
        if (application instanceof DBPApplicationConfigurator) {
        }
    @Override
public abstract class BasePlatformImpl implements DBPPlatform, DBPApplicationConfigurator, DBPPlatformLanguageManager {
            if (!ContentUtils.deleteFileRecursive(tempFolder)) {

import org.jkiss.dbeaver.ModelPreferences;
    public DBConfigurationController getConfigurationController() {
            } catch (Throwable e) {
            String pluginBundleName = bundle == null ? null : bundle.getSymbolicName();
package org.jkiss.dbeaver.registry;
    public DBConfigurationController getPluginConfigurationController(@Nullable String pluginId) {
import org.jkiss.dbeaver.registry.fs.FileSystemProviderRegistry;
    private static final String ECLIPSE_CONFIG_FILE = "eclipse.ini";
import org.eclipse.core.runtime.Platform;

 * DBeaver - Universal Database Manager
            } else {
    public DBPPlatformLanguage getPlatformLanguage() {
        if (this.localSystem == null) {
        for (IPluginService pluginService : activatedServices) {
        }

import org.osgi.framework.Bundle;
import org.jkiss.dbeaver.model.DBFileController;
    @Override
}
            return ((DBPApplicationConfigurator) application).createTaskController();
    private final Map<Bundle, DBConfigurationController> configurationControllerByPlugin = new HashMap<>();
        } catch (IOException e) {
    @Override
        // This property is fake. But we set it to trigger property change listener
    }
    }
        log.debug("Initialize base platform...");

        DBPPreferenceStore prefStore = getPreferenceStore();
        GlobalSettings.getInstance().setGlobalProperty(DBEAVER_PROP_LANGUAGE, language.getCode());
import org.jkiss.dbeaver.registry.settings.GlobalSettings;
import java.nio.file.Files;

                        try {
    @Override
    public DBTTaskController createTaskController() {

        return getConfigurationController(getProductPlugin().getBundle());
            return ((DBPApplicationConfigurator) application).createFileController();
    @NotNull
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
                throw new IllegalStateException("Cannot determine SQL dialect registry for " + getClass());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
    }
                new DataSourceMonitorJob(this).scheduleMonitor();

        DBConfigurationController controller = bundle == null ? defaultConfigurationController : configurationControllerByPlugin.get(bundle);
        // Remove temp folder


    }
            if (sqlDialectRegistry == null) {
            return ((DBPApplicationConfigurator) application).createConfigurationController(pluginBundleName);
            this.platformLanguage = PlatformLanguageRegistry.getInstance().getLanguage(Locale.getDefault());
            if (productPlugin != null) {
                pluginService.deactivateService();
    public DBConfigurationController createConfigurationController(@Nullable String pluginId) {
    }
    @NotNull
        return DataSourceProviderRegistry.getInstance();
                                tempFolder = Path.of(sysUserFolder).resolve(TEMP_PROJECT_NAME);

                if (!CommonUtils.isEmpty(tempFolderPath)) {
        return createConfigurationController(pluginId == null ? null : Platform.getBundle(pluginId));
        this.navigatorModel.initialize();
        }
    public DBFileController getFileController() {
            }
import org.jkiss.dbeaver.Log;
            }
    @NotNull

        return navigatorModel;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNModel;
    public Path getTempFolder(@NotNull DBRProgressMonitor monitor, @NotNull String name) {
        DBPApplication application = getApplication();
    @Override
            }
        DBPApplication application = getApplication();
    private static final String APP_CONFIG_FILE = "dbeaver.ini";
    @Override

import org.jkiss.dbeaver.model.net.DBWHandlerRegistry;
import org.jkiss.dbeaver.registry.language.PlatformLanguageRegistry;
 * See the License for the specific language governing permissions and
            }

            }
    @Override
 *
            localTaskController = createTaskController();
import org.jkiss.dbeaver.runtime.jobs.DataSourceMonitorJob;
        } else if (bundle == null) {
        return localTemp;
    public SQLDialectMetadataRegistry getSQLDialectRegistry() {
 * You may obtain a copy of the License at
                            if (!CommonUtils.isEmpty(sysUserFolder)) {
    public DBPDataSourceProviderRegistry getDataSourceProviderRegistry() {
 * limitations under the License.
import org.jkiss.utils.StandardConstants;
        try {
 *

    @NotNull
        return localFileController;

        // Deactivate plugin services
                    tempFolder = Path.of(sysTempFolder).resolve(TEMP_PROJECT_NAME);
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
    @Override
import org.jkiss.dbeaver.model.app.*;
            );
/*

    }
    private static final String DBEAVER_PROP_LANGUAGE = "nl";
        // Navigator model
import java.util.*;

                Path pluginStateLocation = RuntimeUtils.getPluginStateLocation(productPlugin);
            if (!getApplication().isMultiuser()) {
            } catch (Exception e) {
    @NotNull
        return platformLanguage;
                pluginService.activateService();
    }
import org.jkiss.dbeaver.model.DBConfigurationController;
        }
            return productPluginPath;
    private DBConfigurationController createConfigurationController(@Nullable Bundle bundle) {
/**
    }

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import java.nio.file.Path;
import org.jkiss.dbeaver.model.sql.SQLDialectMetadataRegistry;
                log.error("Error activating plugin service", e);
    @Override

        if (localTaskController == null) {
                        throw new IOException("Can't create temp directory '" + dbTempFolder.getAbsolutePath() + "'");
 * Base implementation of DBeaver platform for all products
        return getConfigurationController(CommonUtils.isEmpty(pluginId) ? null : Platform.getBundle(pluginId));
            localFileController = createFileController();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    }
        }
    private final List<IPluginService> activatedServices = new ArrayList<>();
                ((AbstractPreferenceStore)ds.getPreferenceStore()).firePropertyChangeEvent(prefStore, event.getProperty(), event.getOldValue(), event.getNewValue());

import org.jkiss.code.Nullable;
                    log.debug("Create global temp folder '" + tmpFolder + "'");
        }
import java.io.File;
                                if (!Files.exists(tempFolder)) {
 *
        return localTaskController;
    @NotNull

    }
        return ObjectManagerRegistry.getInstance();
    @NotNull
    @NotNull
        // which will ask to restart workbench.
        return new DBNModel(this, null);

        // Dispose navigator model first
    }

            Plugin productPlugin = getProductPlugin();
        return getWorkspace().getMetadataFolder().resolve(CONFIG_FOLDER);
    }
        if (application instanceof DBPApplicationConfigurator) {
        Path productPluginPath = RuntimeUtils.getPluginStateLocation(getProductPlugin()).resolve(fileName);
        } else {
                    if (!dbTempFolder.mkdirs()) {

        this.platformLanguage = language;
    
    }
    @NotNull
import org.jkiss.dbeaver.runtime.IPluginService;
            log.debug("Dispose navigator model");
            sqlDialectRegistry = RuntimeUtils.getBundleService(SQLDialectMetadataRegistry.class, true);
    protected abstract Plugin getProductPlugin();
            tempFolder = null;
        return new LocalFileController(
        {
            if (bundle == null) {
 * you may not use this file except in compliance with the License.
        return sqlDialectRegistry;
        if (this.navigatorModel != null && this.navigatorModel.getRoot() != null) {
        prefStore.addPropertyChangeListener(event -> {
    @Override
import java.io.IOException;
    public void disposeNavigatorModel() {
    @NotNull
        }
            controller = createConfigurationController(bundle);
    }

        if (CommonUtils.equalObjects(language, this.platformLanguage)) {
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;
            try {


    }
        } else {


    public void setPlatformLanguage(@NotNull DBPPlatformLanguage language) throws DBException {

        DBPApplication application = getApplication();
            } catch (IOException e) {
        }
    private DBPPlatformLanguage platformLanguage;
    public static final String FILES_FOLDER = ".files";
    }
    }
                    Files.createDirectories(tmpFolder);
            // Forward event to all data source preferences
            return;
    }
    }

        if (localFileController == null) {

                defaultConfigurationController = controller;
import org.jkiss.dbeaver.model.runtime.OSDescriptor;
                                }
    @NotNull
 * BaseWorkspaceImpl.


        return controller;
    }
import org.jkiss.utils.CommonUtils;
                    controller.setLegacyConfigFolder(pluginStateLocation);
    @NotNull
import org.jkiss.dbeaver.model.data.DBDRegistry;

        return DataFormatterRegistry.getInstance();
    }
            }

                    tempFolderPath = GeneralUtils.replaceVariables(tempFolderPath, new SystemVariablesResolver());
        return getLocalWorkspaceConfigFolder().resolve(fileName);
        }
    private DBFileController localFileController;
        disposeNavigatorModel();
                            }
    @Override
    }
            activatePluginServices();
                Files.createDirectories(localTemp);
    private DBTTaskController localTaskController;
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                log.error("Can't create temp directory " + localTemp, e);
        activatedServices.clear();
    public DBFRegistry getFileSystemRegistry() {
        return iniFile;

    private DBConfigurationController defaultConfigurationController;
    @NotNull
        Path configPath;
    
        }
import org.jkiss.dbeaver.model.edit.DBERegistry;
    public DBNModel getNavigatorModel() {
            configPath = RuntimeUtils.getLocalPathFromURL(Platform.getInstallLocation().getURL());
                Path tmpFolder = Paths.get(tempFolderPath);
    }
import org.jkiss.dbeaver.model.impl.preferences.AbstractPreferenceStore;
        // It is a part of UI
            }

        Path localTemp = name == null ? tempFolder : tempFolder.resolve(name);
    }
    @NotNull
            return controller;
    public Path getApplicationConfiguration() {
        return FileSystemProviderRegistry.getInstance();
    @Override
import org.eclipse.core.runtime.Plugin;
    @Override
    

        }
    private static final Log log = Log.getLog(BasePlatformImpl.class);
        if (application instanceof DBPApplicationConfigurator) {
                final String sysTempFolder = System.getProperty(StandardConstants.ENV_TMP_DIR);
            // Make temp folder
                            Files.createDirectories(tempFolder);
    public DBTTaskController getTaskController() {
                                    try {
    public Path getLocalConfigurationFile(String fileName) {
            try {
                tempFolder = Files.createTempDirectory(tmpFolder, TEMP_PROJECT_NAME);

    protected void activatePluginServices() {
    }
    @Override

                                        Files.createDirectories(tempFolder);
            try {
        if (!Files.exists(localTemp)) {
                Platform.getStateLocation(bundle).toFile().toPath()
        }
 */
                String tempFolderPath = System.getProperty("dbeaver.io.tmpdir");
                    }
                        }
    protected DBNModel createNavigatorModel() {
    private static final String TEMP_PROJECT_NAME = ".dbeaver-temp"; //$NON-NLS-1$
            }
                                        tempFolder = Path.of(TEMP_PROJECT_NAME);
    protected Path tempFolder;
            return new LocalConfigurationController(
        for (IPluginService pluginService : PluginServiceRegistry.getInstance().getServices()) {

        }
    private @NotNull Path getLocalWorkspaceConfigFolder() {
            LocalConfigurationController controller = new LocalConfigurationController(
                // Connections monitoring job
import org.jkiss.dbeaver.utils.ContentUtils;
                                    } catch (IOException exc) {
    }
        }
                configurationControllerByPlugin.put(bundle, controller);
    private DBConfigurationController getConfigurationController(@Nullable Bundle bundle) {
import org.jkiss.dbeaver.registry.datatype.DataTypeProviderRegistry;
                    tempFolderPath = System.getProperty(StandardConstants.ENV_TMP_DIR);
    @Override

                if (Files.exists(pluginStateLocation)) {
        if (!Files.exists(iniFile)) {
        }
    public OSDescriptor getLocalSystem() {
                this.platformLanguage = PlatformLanguageRegistry.getInstance().getLanguage(Locale.ENGLISH);
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
        this.navigatorModel.setModelAuthContext(getWorkspace().getAuthContext());
    }
    
                log.debug("Language for locale '" + Locale.getDefault() + "' not found. Use default.");
    public DBERegistry getEditorsRegistry() {
                    File dbTempFolder = new File(tempFolderPath);
        this.navigatorModel = createNavigatorModel();
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (tempFolder == null) {
