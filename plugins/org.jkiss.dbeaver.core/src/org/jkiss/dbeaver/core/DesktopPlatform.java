import org.eclipse.core.runtime.Plugin;
    static void setClosing(boolean closing) {


 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override



import org.jkiss.dbeaver.DBException;
            try {
        this.certificateStorage = new DefaultCertificateStorage(
    public DesktopPlatform() {
import org.jkiss.dbeaver.registry.GlobalEventManagerImpl;

import org.jkiss.dbeaver.registry.BasePlatformImpl;
            workspace.dispose();

import org.jkiss.dbeaver.runtime.qm.QMLogFileWriter;
    @NotNull


    protected Plugin getProductPlugin() {
            SecurityProviderUtils.registerSecurityProvider();
        }
        log.debug("Platform initialized (" + (System.currentTimeMillis() - startTime) + "ms)");
        return new DesktopNavigatorModel(this, null);
        if (!PlatformUI.isWorkbenchRunning()) {



    }


            this.qmLogWriter = null;
    protected void initialize() {
                workspace.save(new LoggingProgressMonitor(log));
        DataSourceProviderRegistry.dispose();
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;

package org.jkiss.dbeaver.core;

        DesktopPlatform.instance = null;
        this.queryManager.registerMetaListener(qmLogWriter);

 * DBeaver - Universal Database Manager
    }
    @Override
        }).start();
    }
        }
    static DesktopPlatform instance;
    @NotNull
import org.jkiss.dbeaver.model.navigator.DBNModel;
    private QMRegistryImpl queryManager;
        }
        return workspace;
        if (getPreferenceStore().getBoolean(DBeaverPreferences.SECURITY_USE_BOUNCY_CASTLE)) {
import org.jkiss.dbeaver.model.navigator.DesktopNavigatorModel;
        this.qmLogWriter = new QMLogFileWriter();
            this.qmLogWriter.dispose();
    }
    public DBACertificateStorage getCertificateStorage() {
    public void setWorkbenchStarted(boolean started) {
            this,

        return GlobalEventManagerImpl.getInstance();
        System.gc();

        }
    // The plug-in ID
        return workbenchStarted || !getApplication().isStandalone();

    public synchronized void dispose() {
            return false;
        if (isStandalone() && workspace != null && !application.isExclusiveMode()) {

 *
        log.debug("Platform shutdown completed (" + (System.currentTimeMillis() - startTime) + "ms)");
        return BaseApplicationImpl.getInstance().isStandalone();
            ac.setHeadlessMode(true);

 * DesktopPlatform
/**
    }
    public DBPPreferenceStore getPreferenceStore() {

        // We don't have any specific security providers which are activated during startup so it is safe
        new Thread(() -> {
        this.workspace.initializeProjects();
        this.workspace = getApplication().createWorkspace(this);
            workspace = null;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
 */
 * Unless required by applicable law or agreed to in writing, software

    public DBPApplicationDesktop getApplication() {
import org.eclipse.ui.PlatformUI;
        getApplication().beforeWorkspaceInitialization();
import org.jkiss.dbeaver.runtime.qm.QMRegistryImpl;

    @NotNull
import org.jkiss.dbeaver.runtime.SecurityProviderUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.qm.QMUtils;
    @NotNull
        // Init workspace in UI because it may need some UI interactions to initialize
        DBRFeatureRegistry.getInstance().endTracking();
        if (this.qmLogWriter != null) {
    }
        log.debug("Shutdown desktop platform...");
        instance = this;
        DBRFeatureRegistry.getInstance().startTracking();
    private static final Log log = Log.getLog(DesktopPlatform.class);
        }

    public static final String PLUGIN_ID = "org.jkiss.dbeaver.core"; //$NON-NLS-1$
            this.queryManager.unregisterMetaListener(qmLogWriter);
    public static boolean isStandalone() {
        super.initialize();
            }

        isClosing = closing;
public class DesktopPlatform extends BasePlatformImpl implements DBPPlatformDesktop {
        return queryManager;
        return workspace;
import org.jkiss.dbeaver.model.qm.QMRegistry;
            } catch (DBException ex) {
    }
    @Override
    }
    public DBPExternalFileManager getExternalFileManager() {
 *
            return true;

    @NotNull
        log.debug("Initialize desktop platform...");

import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    }
                .resolve(DBConstants.CERTIFICATE_STORAGE_FOLDER));
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private static volatile boolean isClosing = false;


        QMUtils.initApplication(this);
import org.jkiss.dbeaver.Log;
    @Override
        long startTime = System.currentTimeMillis();
    }
        }
            //queryManager = null;
    private static final String DBEAVER_CONFIG_FOLDER = "settings";
            System.exit(-2);
import org.jkiss.dbeaver.utils.RuntimeUtils;
    @Override
    @NotNull
        }

            // Register BC security provider
    @Override
        // Just in case do System.eis after pause

    protected DBNModel createNavigatorModel() {
    public QMRegistry getQueryManager() {
        // In plugin mode it is always true
import org.jkiss.dbeaver.model.impl.app.DefaultCertificateStorage;
    public DBPGlobalEventManager getGlobalEventManager() {
    public static boolean isClosing() {
        return certificateStorage;
        if (workspace != null) {

        this.workbenchStarted = started;
        if (application instanceof DBPApplicationController ac) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                log.error("Can not save workspace", ex); //$NON-NLS-1$

        if (isClosing) {
 *
 * See the License for the specific language governing permissions and
            System.out.println("App shutdown was halted. Force system shutdown!");
        }
            // Shutdown in headless mode
    @Override
    }

    }
 * limitations under the License.
 */

/*
        this.queryManager = new QMRegistryImpl();
    public boolean isWorkbenchStarted() {
import org.jkiss.dbeaver.model.DBPExternalFileManager;
    }

    }
        DesktopPlatform.setClosing(true);
}


    }
        long startTime = System.currentTimeMillis();
    private DBPWorkspaceDesktop workspace;
        super.dispose();
import org.jkiss.dbeaver.model.app.*;
import org.jkiss.code.NotNull;
    private volatile boolean workbenchStarted;
import org.jkiss.dbeaver.DBeaverPreferences;
        return DBeaverActivator.getInstance();
            this.queryManager.dispose();
        if (this.queryManager != null) {
        return isClosing();
    @NotNull
        return (DBPApplicationDesktop) BaseApplicationImpl.getInstance();
    }

import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
    @Override
            RuntimeUtils.getPluginStateLocation(DBeaverActivator.getInstance())
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBPApplication application = getApplication();
    private QMLogFileWriter qmLogWriter;
            RuntimeUtils.pause(10000);
 * You may obtain a copy of the License at
        return false;
    @Override
        // Create workspace
        return getApplication().getPreferenceStore();

import org.jkiss.dbeaver.model.DBConstants;

    public boolean isShuttingDown() {
    @Override
    public DBPWorkspaceDesktop getWorkspace() {
import org.jkiss.dbeaver.model.impl.app.BaseApplicationImpl;

    }

    private DBACertificateStorage certificateStorage;
