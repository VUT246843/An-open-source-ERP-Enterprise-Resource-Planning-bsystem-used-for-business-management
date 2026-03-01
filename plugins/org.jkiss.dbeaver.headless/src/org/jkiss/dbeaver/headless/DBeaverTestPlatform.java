 * Copyright (C) 2010-2026 DBeaver Corp and others

    private static volatile boolean isClosing = false;

import org.jkiss.dbeaver.registry.language.PlatformLanguageRegistry;
import org.jkiss.code.NotNull;
    DBeaverTestPlatform() {
        workspace.dispose();
    @Override
    private DBeaverTestWorkspace workspace;
            // Make temp folder
        if (!tempFolder.exists() && !tempFolder.mkdirs()) {

    }

                tempFolder = tempDirectory.toFile();

 * limitations under the License.
 *
    }
import java.io.File;
        return BaseApplicationImpl.getInstance().isStandalone();
 */
            }
    @Override
    private static final Log log = Log.getLog(DBeaverTestPlatform.class);
        log.debug("Test platform shutdown completed in " + (System.currentTimeMillis() - startTime) + "ms");
    }
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.headless"; //$NON-NLS-1$
    public DBACertificateStorage getCertificateStorage() {
        QMUtils.initApplication(this);
    }
    static DBeaverTestPlatform instance;
    @Override
        long startTime = System.currentTimeMillis();
                    }
    public boolean isUnitTestMode() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
 * you may not use this file except in compliance with the License.
    @NotNull

    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        return GlobalEventManagerImpl.getInstance();
    }


    }
        return tempFolder.toPath();
    }
    }

                final String sysTempFolder = System.getProperty(StandardConstants.ENV_TMP_DIR);
    @NotNull
    private DefaultCertificateStorage defaultCertificateStorage;
    @NotNull
import org.jkiss.dbeaver.model.impl.app.BaseApplicationImpl;

    @Override
            log.error("Can't create temp directory " + tempFolder.getAbsolutePath());

    }
        // Register properties adapter
                            tempFolder = new File(sysUserFolder, TEMP_PROJECT_NAME);
        return true;
                            if (!tempFolder.mkdirs()) {


    @Override
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
        return true;
    public DBPWorkspaceDesktop getWorkspace() {
        return PlatformLanguageRegistry.getInstance().getLanguage(Locale.ENGLISH);

    @Override
}
        log.debug("Shutdown Core...");
 *
                    if (!tempFolder.mkdirs()) {
            if (!ContentUtils.deleteFileRecursive(tempFolder)) {
    @Override
        return workspace;
    }
import java.util.Locale;
    @Override

import org.jkiss.dbeaver.runtime.qm.QMRegistryImpl;
    public static boolean isStandalone() {
import org.jkiss.dbeaver.utils.ContentUtils;
                            }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            this,
 * DBeaverTestPlatform
        return getApplication().getPreferenceStore();
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.headless;
            tempFolder = null;
        return qmController;
    public DBPPreferenceStore getPreferenceStore() {
        }
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
import org.jkiss.dbeaver.registry.BasePlatformImpl;
 *
        isClosing = closing;
import org.jkiss.dbeaver.model.app.*;

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (tempFolder != null) {
    @Override
    public QMRegistry getQueryManager() {

                if (!CommonUtils.isEmpty(sysTempFolder)) {
        log.debug("Test Platform initialized (" + (System.currentTimeMillis() - startTime) + "ms)");

 */
    private File tempFolder;
    public DBeaverHeadlessApplication getApplication() {

    protected void initialize() {


                }
    @NotNull
            } catch (IOException e) {
        }
    }
import org.jkiss.dbeaver.model.impl.app.DefaultCertificateStorage;

                                tempFolder = new File(TEMP_PROJECT_NAME);
/*
        return DBeaverTestActivator.getInstance();
/**
        this.qmController = new QMRegistryImpl();
    public synchronized void dispose() {
        return workspace;

            }
                log.warn("Can't delete temp folder '" + tempFolder.getAbsolutePath() + "'");
import org.eclipse.core.resources.ResourcesPlugin;
                        if (!CommonUtils.isEmpty(sysUserFolder)) {

import org.jkiss.dbeaver.registry.GlobalEventManagerImpl;
    }
    private static boolean disposed = false;
    private QMRegistryImpl qmController;
import org.jkiss.dbeaver.model.qm.QMRegistry;
import java.io.IOException;
        super.initialize();

 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
            try {
    @NotNull

    @NotNull
        if (tempFolder == null) {
    }
    public DBPPlatformLanguage getPlatformLanguage() {
    }
        super.dispose();
    private static void setClosing(boolean closing) {
        this.workspace = new DBeaverTestWorkspace(this, ResourcesPlugin.getWorkspace());
        return isClosing();
import org.jkiss.dbeaver.model.DBPExternalFileManager;

        DBeaverTestPlatform.disposed = true;
import org.jkiss.utils.StandardConstants;
    public static boolean isClosing() {
import org.jkiss.dbeaver.model.qm.QMUtils;

        // Remove temp folder

    public Path getTempFolder(@NotNull DBRProgressMonitor monitor, @NotNull String name) {
        return isClosing;
    public boolean isShuttingDown() {
    }
            DBeaverTestActivator.getConfigurationFile(DBConstants.CERTIFICATE_STORAGE_FOLDER).toPath());


import java.nio.file.Files;


        this.workspace.initializeProjects();
public class DBeaverTestPlatform extends BasePlatformImpl implements DBPPlatformDesktop {
    @NotNull
import java.nio.file.Path;
    public DBPExternalFileManager getExternalFileManager() {
        log.debug("Initialize Test Platform...");

    public static String getCorePluginID() {
        return PLUGIN_ID;
                final java.nio.file.Path tempDirectory = Files.createTempDirectory(TEMP_PROJECT_NAME);
            monitor.subTask("Create temp folder");
        return (DBeaverHeadlessApplication) BaseApplicationImpl.getInstance();

        System.gc();
    public boolean isWorkbenchStarted() {

    private static final String TEMP_PROJECT_NAME = ".dbeaver-temp"; //$NON-NLS-1$
    }
        long startTime = System.currentTimeMillis();
    @Override
        DBeaverTestPlatform.setClosing(true);
                        final String sysUserFolder = System.getProperty(StandardConstants.ENV_USER_HOME);
        return defaultCertificateStorage;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
                    tempFolder = new File(sysTempFolder, TEMP_PROJECT_NAME);

    public DBPGlobalEventManager getGlobalEventManager() {
        DBeaverTestPlatform.instance = null;
import org.eclipse.core.runtime.Plugin;
                        }
    }

import org.jkiss.dbeaver.model.DBConstants;
    protected Plugin getProductPlugin() {


        this.defaultCertificateStorage = new DefaultCertificateStorage(
    }
        }

    @Override
        DataSourceProviderRegistry.dispose();
