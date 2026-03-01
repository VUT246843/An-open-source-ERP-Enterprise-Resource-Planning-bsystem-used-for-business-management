        }
            // First check datasource settings from the "Transactions" preference page
                return false;
            }
 * DBeaver - Universal Database Manager
                    }
    }
        if (lastCheckTime == null) {
            }
    }
            if (DisconnectJob.isInProcess(dsDescriptor)) {
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        if (!dataSourceDescriptor.isConnected()) {
            if (connectionType.isAutoCloseTransactions()) {
                        try {
import org.jkiss.dbeaver.Log;
            }
                        if (dataSource != null && !invalidated.contains(dataSource)) {
            if (failedAttemptCount > MAX_FAILED_ATTEMPTS_BEFORE_DISCONNECT) {

    public static long getDisconnectTimeoutSeconds(@NotNull DBPDataSourceContainer container) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                // Anyway - just skip it
    private final Map<String, Long> checkCache = new HashMap<>();
            pingJob.addJobChangeListener(new JobChangeAdapter() {
        boolean invalidateOnSleep = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.CONNECTION_CLOSE_ON_SLEEP);
            try {
                            log.debug("Invalidate connection '" + ds.getName() + "'");

 *

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                Map<DBCExecutionContext, DBCTransactionManager> txnToEnd = new IdentityHashMap<>();
                List<DBPDataSourceContainer> dataSources = new ArrayList<>(dataSourceRegistry.getDataSources());
            if (project.isOpen() && project.isRegistryLoaded()) {
        final String dsId = dataSourceDescriptor.getId();

 * you may not use this file except in compliance with the License.
            if (pingCache.contains(dsId)) {
        final DBPWorkspace workspace = platform.getWorkspace();
 * You may obtain a copy of the License at
                }

                    invalidateSleptConnections(monitor);
                return;
        Long lastCheckTime;
    private void checkDataSourceAlive(final DBPDataSourceContainer dataSourceDescriptor, long lastUserActivityTime) {
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return lat;
import org.jkiss.dbeaver.model.exec.DBExecUtils;
 */
                        checkCache.put(dsId, System.currentTimeMillis());
import org.jkiss.dbeaver.model.qm.QMUtils;
                }
                DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
    }
    }
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
                            ds.disconnect(monitor);
        final int keepAliveInterval = dataSourceDescriptor.getConnectionConfiguration().getKeepAliveInterval();
            if (EndIdleTransactionsJob.isInProcess(dsDescriptor) || DBExecUtils.isExecutionInProgress(dataSource)) {
import org.jkiss.code.NotNull;
                        if (ec.isConnected()) {
        }
        }
    protected void doJob() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.connection.DBPConnectionType;



                        }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
            if (invalidateOnSleep && lastPingTime > 0 && System.currentTimeMillis() - lastPingTime > SYSTEM_SUSPEND_INTERVAL) {
        }
    }
        if (platform.isShuttingDown()) {
 * Unless required by applicable law or agreed to in writing, software
            }
import org.jkiss.dbeaver.model.app.DBPWorkspace;
        isSleeping = OperationSystemState.isInSleepMode();

        if (dataSource != null && rollbackTimeoutSeconds > 0 && idleInterval > rollbackTimeoutSeconds) {
            disconnectJob.schedule();

                            }
        if (connectionType.isAutoCloseConnections()) {


import org.jkiss.dbeaver.runtime.OperationSystemState;
                log.error(e);
        if (lat <= 0) {
        final DBPDataSource dataSource = dataSourceDescriptor.getDataSource();
                        DBPDataSource dataSource = ds.getDataSource();
                // Ping is still in progress. Hanged?

            return lastUserActivityTime;
        if (dataSource == null) {
    public static long getLastUserActivityTime() {
            doJob();
    }
        }
                        }
        final long disconnectTimeoutSeconds = getDisconnectTimeoutSeconds(dsDescriptor);
            dataSource,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            log.debug("Can't determine last check time for " + dsId);
        if (!config.isCloseIdleConnection()) {
                                if (txnState.getUpdateCount() > 0 && txnState.getTransactionStartTime() <= lastUserActivityTime) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        pingCache.remove(dsId);

 * See the License for the specific language governing permissions and

}                                dataSource,
        Set<DBPDataSource> invalidated = new HashSet<>();
    private static final Log log = Log.getLog(DataSourceMonitorJob.class);
                }
                closeAllConnections(monitor);
            ttlSeconds = pref.getInt(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL);
            }
        }
import org.jkiss.dbeaver.model.app.DBPProject;
            }

        return getLastUserActivityTime(-1);
        }
            pingJob.schedule();
            // Kill idle connection
        return 0;
        for (DBPProject project : new ArrayList<>(workspace.getProjects())) {
    }
            } catch (DBCException e) {
        final DBPWorkspace workspace = platform.getWorkspace();
            final KeepAlivePingJob pingJob = new KeepAlivePingJob(dataSource, disconnectOnError);
    private boolean isSleeping = false;
            return true;
        this.platform = platform;
                    }
        setUser(false);
        setSystem(true);
        synchronized (this) {
        return Status.OK_STATUS;
            return true;
                }
            });
    private long lastPingTime = -1;
        }
            // Or get this info from the current connection type
            return;
            return;
                                true,
    // Triggers datasources invalidate after sleep
import org.jkiss.dbeaver.model.DBUtils;
        DBPDataSource dataSource = dsDescriptor.getDataSource();
/*
    }
                    for (DBCExecutionContext ec : instance.getAllContexts()) {

        if (!dsDescriptor.isConnected()) {
                        }
        final DBPConnectionConfiguration config = container.getConnectionConfiguration();
        );
        synchronized (this) {
                for (DBPDataSourceContainer ds : dataSources) {
        }
            "Connection '" + dataSource.getContainer().getName() + "' has been closed after long idle period",
 * limitations under the License.
public class DataSourceMonitorJob extends AbstractJob {
                ttlSeconds = connectionType.getCloseIdleTransactionPeriod();
    private final DBPPlatform platform;
        }
                            log.debug("Error closing connection in sleep mode");
                    }
        // End long transactions or connections

package org.jkiss.dbeaver.runtime.jobs;

import org.jkiss.dbeaver.model.DBPMessageType;
                for (DBPDataSourceContainer ds : dataSources) {
    private static final boolean INVALIDATE_AFTER_SLEEP = true;

        } else if (!wasSleeping) {
            return false;
    private static final long SYSTEM_SUSPEND_INTERVAL = 20000; // 20 seconds of inactivity - most likely a system suspend

        DBPConnectionConfiguration config = container.getConnectionConfiguration();
        if (dataSource != null && disconnectTimeoutSeconds > 0 && idleInterval > disconnectTimeoutSeconds) {
            scheduleMonitor();
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
                public void done(IJobChangeEvent event) {
    @NotNull
 * Performs connection keep-alive ping.
        final DBPConnectionType connectionType = config.getConnectionType();
 * Ends idle transactions.
        if ((curTime - lastCheckTime) / 1000 > keepAliveInterval) {
                        } catch (Exception e) {
                if (!txnToEnd.isEmpty()) {
        long lat = DBWorkbench.getPlatform().getApplication().getLastUserActivityTime();
        if (ttlSeconds == 0) {
    private void invalidateSleptConnections(DBRProgressMonitor monitor) {
/**
            DBPMessageType.ERROR

            }
        if (lastUserActivityTime < 0) {
    }


                disconnectOnError = true;
    }
        DBeaverNotifications.showNotification(
            }
                for (DBPDataSourceContainer ds : project.getDataSourceRegistry().getDataSources()) {
        final long rollbackTimeoutSeconds = getTransactionTimeoutSeconds(dsDescriptor);
                    new EndIdleTransactionsJob(dataSource, txnToEnd).schedule();
        if (timeout > 0) {
                                QMTransactionState txnState = QMUtils.getTransactionState(ec);
                // Disconnect all datasources
import org.jkiss.dbeaver.model.exec.DBCException;
        if (getDisconnectTimeoutSeconds(dataSourceDescriptor) > 0 || getTransactionTimeoutSeconds(dataSourceDescriptor) > 0) {
        lastPingTime = System.currentTimeMillis();
                                    txnToEnd.put(ec, txnManager);
import org.jkiss.dbeaver.model.app.DBPPlatform;
                            for (InvalidateJob.ContextInvalidateResult result : results) {
 * DataSourceMonitorJob.
import org.jkiss.dbeaver.model.struct.DBSInstance;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        log.debug("System awake detected. Reinitialize all remote connections.");
                                null);
 * Licensed under the Apache License, Version 2.0 (the "License");
        final int timeout = config.getCloseIdleInterval();
    }

            }



    protected void checkDataSourceAliveInWorkspace(DBPWorkspace workspace, long lastUserActivityTime) {
            return;
        checkDataSourceAliveInWorkspace(workspace, getLastUserActivityTime(lastPingTime));
            DisconnectJob disconnectJob = new DisconnectJob(dsDescriptor);
        if (lastCheckTime == null) {
 *
        long curTime = System.currentTimeMillis();
                            DBCTransactionManager txnManager = DBUtils.getTransactionManager(ec);
                    synchronized (DataSourceMonitorJob.this) {
        }
        // Perform keep alive request
        if (!isSleeping) {
    private void closeAllConnections(DBRProgressMonitor monitor) {
            lastCheckTime = checkCache.get(dsId);
        }
        }
                if (INVALIDATE_AFTER_SLEEP) {
        }
            showNotification(dataSource);
            }
 */
                pingCache.add(dsId);
                            List<InvalidateJob.ContextInvalidateResult> results = InvalidateJob.invalidateDataSource(

            final DBPConnectionType connectionType = config.getConnectionType();
        schedule(MONITOR_INTERVAL);

import org.jkiss.dbeaver.ModelPreferences;
        }
        }

        final long idleInterval = (System.currentTimeMillis() - lastUserActivityTime) / 1000;
    // Disabled because we use different approach - close connections on sleep
        if (pref.contains(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED)) {
    }
                        log.debug("Close connection '" + ds.getName() + "' for sleep mode");
        return false;
                    if (ds.isConnected() && !ds.getDriver().isEmbedded()) {
        int ttlSeconds = 0;
            DBeaverNotifications.NT_DISCONNECT_IDLE,
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
        }
        final DBPPreferenceStore pref = container.getPreferenceStore();
            if (failedAttemptCount >= MAX_FAILED_ATTEMPTS_BEFORE_IGNORE) {
        log.debug("System suspend detected. Close all remote connections.");
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
                            }

            if (invalidateOnSleep) {
    private static final int MAX_FAILED_ATTEMPTS_BEFORE_DISCONNECT = 5;
                }
            }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;
                                true,
    private static final int MAX_FAILED_ATTEMPTS_BEFORE_IGNORE = 10;
                lastCheckTime = connectTime.getTime();
                return;
import org.jkiss.dbeaver.model.DBPDataSource;
        final DBPWorkspace workspace = platform.getWorkspace();
    public static long getLastUserActivityTime(long lastUserActivityTime) {
            // Sleep mode triggered

                            if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
            if (endIdleTransactionOrConnection(dataSourceDescriptor, lastUserActivityTime)) {
            return 0;
import org.eclipse.core.runtime.Status;
                    if (ds.isConnected() && !ds.getDriver().isEmbedded()) {
                DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean endIdleTransactionOrConnection(DBPDataSourceContainer dsDescriptor, long lastUserActivityTime) {
import org.jkiss.dbeaver.model.qm.QMTransactionState;

        List<DBPProject> projects = new ArrayList<>(workspace.getProjects());
            final Date connectTime = dataSourceDescriptor.getConnectTime();
    public DataSourceMonitorJob(DBPPlatform platform) {
            }
                List<DBPDataSourceContainer> dataSources = new ArrayList<>(dataSourceRegistry.getDataSources());
    public void scheduleMonitor() {

        }
        super("Connections monitoring");
            }
                return;
            boolean disconnectOnError = false;
                                }
            if (connectTime != null) {

        for (DBPProject project : projects) {
            int failedAttemptCount = KeepAlivePingJob.getFailedAttemptCount(dataSource);
        for (DBPProject project : new ArrayList<>(workspace.getProjects())) {
            }
    private static final int MONITOR_INTERVAL = 3000; // once per 3 seconds
            return timeout;
import org.eclipse.core.runtime.IStatus;

            return Status.OK_STATUS;
        if (!platform.isShuttingDown()) {
    private final Set<String> pingCache = new HashSet<>();
                }
                @Override
        }
                                monitor,
            synchronized (this) {
                    }
            return connectionType.getCloseIdleConnectionPeriod();
        if (keepAliveInterval <= 0) {
    }
    protected void showNotification(@NotNull DBPDataSource dataSource) {
        }
            if (project.isOpen() && project.isRegistryLoaded()) {
    public static long getTransactionTimeoutSeconds(@NotNull DBPDataSourceContainer container) {
        return Math.max(0, ttlSeconds);
                                invalidated.add(result.getDataSource());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (project.isOpen() && project.isRegistryLoaded()) {

            }
                    checkDataSourceAlive(ds, lastUserActivityTime);
        }
 *
        boolean wasSleeping = isSleeping;
        }

                for (DBSInstance instance : dataSource.getAvailableInstances()) {
                }
        }
                return false;
    @Override
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;

import java.util.*;
            return false;
