import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
    }
 * You may obtain a copy of the License at
    }
            getConnection(monitor).setReadOnly(readOnly);
    public boolean supportsSchemaChange() {
    @Override
                if (!CommonUtils.isEmpty(bootstrap.getDefaultCatalogName())) {
import org.jkiss.dbeaver.model.DBUtils;
 */
            if (connectionReadOnly) {
    }
    @Override
    private String activeDatabaseName;
        }
            activeDatabaseName = MySQLUtils.determineCurrentDatabase(session);
                return;
            }
    public MySQLExecutionContext getContextDefaults() {
    }
            if (!setCurrentDatabase(monitor, catalog)) {
        activeDatabaseName = catalog.getName();
        return setCurrentDatabaseName(monitor, databaseName);
    @Override
        return false;
        }
import org.jkiss.dbeaver.DBException;
        return (MySQLDataSource) super.getDataSource();
        return new DBCCachedContextDefaults(activeDatabaseName, null);
    public void setDefaultCatalog(DBRProgressMonitor monitor, MySQLCatalog catalog, DBSSchema schema) throws DBCException {

        // Send notifications
            log.debug("Null current database");
        return this;
        if (activeDatabaseName != null && activeDatabaseName.equals(catalog.getName())) {

 * you may not use this file except in compliance with the License.
                    setCurrentDatabaseName(monitor, bootstrap.getDefaultCatalogName());
 * DBeaver - Universal Database Manager

            } catch (SQLException e) {
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public MySQLDataSource getDataSource() {
            log.debug(e);

}
        return activeDatabaseName;

import org.jkiss.dbeaver.Log;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }
    public DBCCachedContextDefaults getCachedDefault() {
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                dbStat.execute();
    public String getActiveDatabaseName() {
        // MySQL driver bug - it doesn't ley to change active schema in read-only mode (#9167)
 *
        } catch (Exception e) {
        final MySQLCatalog oldActiveDatabase = getDefaultCatalog();
    }
 * MySQLExecutionContext
        } catch (Exception e) {

 * Unless required by applicable law or agreed to in writing, software
 */
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
    @Override
    private void setConnectionReadOnly(DBRProgressMonitor monitor, boolean readOnly) {
        } finally {
        try {


    @Override
 *

    }

    }
    }
            }
import org.jkiss.code.NotNull;
    }
                }

    public boolean supportsCatalogChange() {
    boolean setCurrentDatabase(DBRProgressMonitor monitor, MySQLCatalog object) throws DBCException {
            if (useBootstrapSettings) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        throw new DBCFeatureNotSupportedException();
                setConnectionReadOnly(monitor, true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
            }
import org.jkiss.utils.CommonUtils;
        if (connectionReadOnly) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

    }

    @NotNull
        boolean connectionReadOnly = isConnectionReadOnly(monitor);
        try {
    @Override
            return false;
        return null;
    }
        super(instance, purpose);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
    @Override
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();
        if (object == null) {
    MySQLExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
    }
/*
            return;
            throw new DBCException(e, this);
        }
public class MySQLExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<MySQLCatalog, DBSSchema> {
        // Check default active schema

import org.jkiss.dbeaver.ext.mysql.MySQLUtils;
    private boolean setCurrentDatabaseName(DBRProgressMonitor monitor, String databaseName) throws DBCException {
    //private MySQLCatalog activeDatabase;


        }
    private boolean isConnectionReadOnly(DBRProgressMonitor monitor) {
/**
        try {
            return true;
            log.debug(e);
 * distributed under the License is distributed on an "AS IS" BASIS,

    private static final Log log = Log.getLog(MySQLExecutionContext.class);
package org.jkiss.dbeaver.ext.mysql.model;
        String databaseName = object.getName();
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active catalog")) {
        return true;
    public void setDefaultSchema(DBRProgressMonitor monitor, DBSSchema schema) throws DBCException {
    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
    }
    @Override
            this.activeDatabaseName = databaseName;
            return false;
        return true;
    }
import java.sql.SQLException;

                throw new DBCException(e, session.getExecutionContext());
    public DBSSchema getDefaultSchema() {
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active database")) {



        }
            return getConnection(monitor).isReadOnly();

            setConnectionReadOnly(monitor, false);
            try (JDBCPreparedStatement dbStat = session.prepareStatement("use " + DBUtils.getQuotedIdentifier(getDataSource(), databaseName))) {
        DBUtils.fireObjectSelectionChange(oldActiveDatabase, catalog, this);
        }
        return CommonUtils.isEmpty(activeDatabaseName) ? null : getDataSource().getCatalog(activeDatabaseName);
import org.jkiss.dbeaver.model.exec.*;

            }

    @Override
        } catch (DBException e) {
    public MySQLCatalog getDefaultCatalog() {
