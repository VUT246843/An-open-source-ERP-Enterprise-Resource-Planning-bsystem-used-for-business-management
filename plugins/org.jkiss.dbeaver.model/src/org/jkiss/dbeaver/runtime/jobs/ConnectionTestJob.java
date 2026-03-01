                clientVersion = this.driverName + " " + this.driverVersion;
                }
                            driverName = metaData.getDriverName();
            }
                }
            } catch (InvocationTargetException e) {

import org.eclipse.core.runtime.IStatus;
            if (connectStatus == Status.CANCEL_STATUS) {
                // ignore
            } catch (InterruptedException e) {
 *

            }
    }
                    productVersion = info.getDatabaseProductVersion();
        this.ownerMonitor = ownerMonitor;
    public String getServerVersion() {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private final DBRRunnableParametrized<DBCSession> onTest;

    public String getDriverVersion() {
    }
            connectTime = (System.currentTimeMillis() - startTime);
                        // Try to get driver version from driver instance
            }
            monitor = ownerMonitor;
        if (ownerMonitor != null) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
            monitor.subTask("Load connection info");
        this.setSystem(true);
            new DisconnectJob(container).schedule();
import java.sql.Driver;
            long startTime = System.currentTimeMillis();
 * DBeaver - Universal Database Manager
                        } catch (Exception e) {

    @NotNull

import org.jkiss.dbeaver.model.DBPDataSourceInfo;
                            driverVersion = ((Driver) driverInstance).getMajorVersion() + "." + ((Driver) driverInstance).getMinorVersion();
                    productName = info.getDatabaseProductName();
                            driverVersion = metaData.getDriverVersion();
            connectError = ex;
 *

            monitor.beginTask(ModelMessages.dialog_connection_wizard_start_connection_monitor_start, 3);
            DBPDataSourceInfo info = dataSource.getInfo();
        this.productName = null;
            monitor.subTask(ModelMessages.dialog_connection_wizard_start_connection_monitor_subtask_test);
                        driverName = container.getDriver().getDriverClassName();

            monitor.worked(1);
    private DBRProgressMonitor ownerMonitor;
            }
            if (!CommonUtils.isEmpty(this.driverName)) {


import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    public String getProductName() {

    }
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.sql.Connection;
                    }

    }
                    log.debug(e);
                    }

import org.jkiss.code.NotNull;
    @Override
    public long getConnectTime() {
            // Start monitor task here because actual connection makes its own begin/end sequence
            DBPDataSource dataSource = container.getDataSource();

            try {
 *
        this.productVersion = null;
        super.initialize = true;//CommonUtils.toBoolean(testDataSource.getDriver().getDriverParameter(DBConstants.PARAM_INIT_ON_TEST));
        return driverName;
                            productVersion = metaData.getDatabaseProductVersion();
                log.error(e.getTargetException());
import org.jkiss.dbeaver.model.DBUtils;
import java.lang.reflect.InvocationTargetException;
                try (DBCSession session = DBUtils.openUtilSession(monitor, dataSource, "Test connection")) {
/*
                            log.error("Can't obtain connection metadata", e);
 * limitations under the License.
                        Object driverInstance = container.getDriver().getDriverLoader(container).getDriverInstance(monitor);
            if (driverName == null || driverVersion == null) {
            monitor.subTask(ModelMessages.dialog_connection_wizard_start_connection_monitor_success);
    public String getClientVersion() {
        return driverVersion;
    public String getDriverName() {
    private String driverVersion;
                    if (driverName == null) {
        monitor.done();
    public String getProductVersion() {
                            Connection connection = (Connection) session;
        return serverVersion;
        Thread.currentThread().setName(ModelMessages.dialog_connection_wizard_start_connection_monitor_thread);
            if (!CommonUtils.isEmpty(this.productName)) {
                }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
import org.jkiss.dbeaver.model.DBPDataSource;
    }
                    onTest.run(session);
 * you may not use this file except in compliance with the License.
            if (connectError != null || monitor.isCanceled()) {
    private String productVersion;
        } catch (DBException ex) {
                    }
                try {
 * See the License for the specific language governing permissions and
    private long connectTime = -1;
        }
                    log.error("Can't obtain connection metadata", e);
    }
        this.onTest = onTest;
 * Unless required by applicable law or agreed to in writing, software
            if (dataSource == null) {

                try {
                        if (driverInstance instanceof Driver) {
                throw new DBException(ModelMessages.error_not_connected_to_database);

                try (DBCSession session = DBUtils.openUtilSession(monitor, dataSource, "Call connection testers")) {
    public ConnectionTestJob(DBPDataSourceContainer testDataSource, DBRRunnableParametrized<DBCSession> onTest) {

        return Status.OK_STATUS;
            super.run(monitor);
    }

        }
import org.jkiss.utils.CommonUtils;
    private static final Log log = Log.getLog(ConnectionTestJob.class);
            monitor.worked(1);
                    if (driverVersion == null) {
                        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            monitor.worked(1);
 */
package org.jkiss.dbeaver.runtime.jobs;
        return connectTime;
                            DatabaseMetaData metaData = connection.getMetaData();
    private String clientVersion = "?";
    }
                serverVersion = this.productName + " " + this.productVersion;
import java.sql.DatabaseMetaData;
import org.jkiss.dbeaver.Log;
                    if (session instanceof Connection) {
            if (info != null) {
}

                return Status.CANCEL_STATUS;
                            productName = metaData.getDatabaseProductName();
    public void setOwnerMonitor(DBRProgressMonitor ownerMonitor) {
    private String serverVersion = "?";
public class ConnectionTestJob extends ConnectJob {
            }
        this.setUser(false);
    private String driverName;
                } catch (DBException e) {
        return clientVersion;
                    driverVersion = info.getDriverVersion();
                        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        }
        return productName;
        return productVersion;
                } catch (Exception e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            } else {
            }
import org.jkiss.dbeaver.DBException;
    }
    private String productName;
                return Status.OK_STATUS;

import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
                    driverName = info.getDriverName();
            }
import org.eclipse.core.runtime.Status;
            }
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public IStatus run(@NotNull DBRProgressMonitor monitor) {
 * You may obtain a copy of the License at
        super(testDataSource);
