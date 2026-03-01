import org.jkiss.dbeaver.ext.mysql.model.MySQLPrivilege;
    @Override
    public MySQLCatalog getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) {
 * You may obtain a copy of the License at
        return MySQLCatalog.class;
        return props;
            return super.getAdapter(adapter);
 *
    public Class<? extends MySQLCatalog> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return getCatalogs();
 * limitations under the License.
        }
    }
    public boolean supportsSequences() {
    }
import org.osgi.framework.Version;
    
        Version tidbVersion = this.getInfo().getDatabaseVersion();
        Map<String, String> props = super.getInternalConnectionProperties(monitor, driver, context, purpose, connectionInfo);
                }
        return this.tidbVersion;

    public String getServerVersion() {

        connAttr = PROP_APPLICATION_NAME + ":" + appName + (CommonUtils.isEmpty(connAttr) ? "" : "," + connAttr);
        String appName = DBUtils.getClientApplicationName(getContainer(), context, purpose);
    public boolean supportsInformationSchema() {
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
        return DBUtils.findObject(getPrivileges(monitor), name, true);
    private static final String CONN_ATTR_NAME = "connectionAttributes";
 *     http://www.apache.org/licenses/LICENSE-2.0
        props.put(CONN_ATTR_NAME, connAttr);
        super.createDataSourceInfo(monitor, metaData);
package org.jkiss.dbeaver.ext.tidb.mysql.model;
            return false;
    private static final Log log = Log.getLog(MySQLDataSource.class);
 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    if (dbResult.next()) {
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
    }

        }
public class TiDBMySQLDataSource extends MySQLDataSource {

import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
    @Override
    @Override
        return this.isServerVersionAtLeast(4, 0);
        return getCatalog(childName);
import org.jkiss.dbeaver.DBException;
        // build application name
        return true;
        @NotNull DBPDriver driver,

            return false;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        appName = "dbeaver_tidb_plugin" + (CommonUtils.isEmpty(appName) ? "" : "(" + appName + ")");
        } else if (tidbVersion.getMajor() == major && tidbVersion.getMinor() < minor) {
        return DBUtils.findObject(getEngines(), name, true);
    
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import org.jkiss.dbeaver.ext.mysql.model.MySQLEngine;
import java.util.Collection;
 * DBeaver - Universal Database Manager
    }
import org.jkiss.utils.CommonUtils;

 * you may not use this file except in compliance with the License.
        }

        String connAttr = props.get(CONN_ATTR_NAME);

    @Override

import java.util.Map;
        return new TiDBMySQLDataSourceInfo(this, metaData);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public MySQLPrivilege getPrivilege(DBRProgressMonitor monitor, String name) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    

            }
        super(monitor, container, new TiDBDialect());
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT VERSION() AS VERSION")) {
        @NotNull String purpose,
 *
    @Override
import org.jkiss.dbeaver.model.DBUtils;
    @Override
    ) throws DBCException {
    public boolean isServerVersionAtLeast(int major, int minor) {
        } else if (adapter == DBDValueHandlerProvider.class) {
        }
    public TiDBMySQLDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull JDBCExecutionContext context,
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            } catch (SQLException ex) {


import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
            return DBUtils.findObject(getPrivileges(monitor), "Show databases", true);
 * Unless required by applicable law or agreed to in writing, software
        
        // build conAttr value
    @Override
    }
        return this.getEngine("tidb");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.code.Nullable;
        if (adapter == DBCQueryPlanner.class) {
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
    private String tidbVersion = "";


        if (name.equalsIgnoreCase("SHOW DB")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
                    }
            return adapter.cast(new TiDBPlanAnalyzer(this));
    public Collection<? extends MySQLCatalog> getChildren(@NotNull DBRProgressMonitor monitor) {
import java.sql.SQLException;
    }
}
import org.jkiss.code.NotNull;
    }

        @NotNull DBPConnectionConfiguration connectionInfo
    public <T> T getAdapter(@NotNull Class<T> adapter) {
/*
    @Override
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "TiDB version fetch")) {
    }
        super.initialize(monitor);
    public MySQLEngine getEngine(String name) {
    }
    protected Map<String, String> getInternalConnectionProperties(
    @Override

        if (tidbVersion.getMajor() < major) {
        } else {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStandardValueHandlerProvider;
    }
            return adapter.cast(new JDBCStandardValueHandlerProvider());
    private static final String PROP_APPLICATION_NAME = "program_name";
    @Override
    @Override
 * See the License for the specific language governing permissions and
                log.error(ex);
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 */
import org.jkiss.dbeaver.ext.tidb.model.plan.TiDBPlanAnalyzer;
    }

                        this.tidbVersion = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_VERSION);
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public MySQLEngine getDefaultEngine() {
        return true;
