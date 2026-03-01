import org.jkiss.dbeaver.ModelPreferences;
        }
        super.initialize(monitor);
import java.sql.SQLException;
    protected Map<String, String> getInternalConnectionProperties(
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
                return 8000;
    ) throws DBCException {

        }
        switch (featureId) {
import java.util.Map;
import org.jkiss.dbeaver.model.DBPDataKind;
                    return DBPDataKind.DATETIME;
     * Is meta info SYS.SYSPROCEDURE available for the data source
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
    }
    // Databases
    {
import org.jkiss.dbeaver.model.DBUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
                return true;
import org.jkiss.dbeaver.model.connection.DBPDriver;
                CommonUtils.truncateString(DBUtils.getClientApplicationName(getContainer(), context, purpose), 64));
import org.jkiss.code.NotNull;
    }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDialectMssql;
import org.jkiss.utils.CommonUtils;
     */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return super.getDataSourceFeature(featureId);
    //////////////////////////////////////////////////////////
import java.util.HashMap;
 * you may not use this file except in compliance with the License.
            hasMetaDataProcedureView = false;

        }
    }
        this(
 */
    @Override
 * You may obtain a copy of the License at
            switch (typeName) {

    private static final Log log = Log.getLog(SQLServerGenericDataSource.class);
    @Override
        super(monitor, container, metaModel, metaModel.getServerType() == ServerType.SQL_SERVER ? new SQLServerDialectMssql() : new SQLServerDialectSybase());
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public SQLServerGenericDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container)
        if (CommonUtils.toBoolean(connectionInfo.getProviderProperty(SQLServerConstants.PROP_ENCRYPT_PASSWORD))) {
        @NotNull String purpose,
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read server information")) {
                log.error("Can't read driver properties", e);

}

        if (valueType == Types.VARCHAR) {
    {
 * limitations under the License.
            JDBCUtils.executeStatement(session, "SELECT TOP 1 1 FROM SYS.SYSPROCEDURE WHERE 1 <> 1");

                    if (descriptor.getId().equals(PROP_ENCRYPT_PASS) && descriptor instanceof PropertyDescriptor) {
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;

        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
    }
 *
                        break;
            hasMetaDataProcedureView = true;
        }
        @NotNull DBRProgressMonitor monitor,
        );
 *
import java.sql.Types;
    protected boolean isPopulateClientAppName() {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
            try {
import org.jkiss.dbeaver.ext.mssql.model.ServerType;
        }
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                SQLServerUtils.isDriverJtds(driver) ? SQLServerConstants.APPNAME_CLIENT_PROPERTY : SQLServerConstants.APPLICATION_NAME_CLIENT_PROPERTY,
        return false;
    }
            container,
    @NotNull
                case SQLServerConstants.TYPE_DATETIME:
import org.jkiss.dbeaver.Log;


        Map<String, String> connectionsProps = new HashMap<>();
                case SQLServerConstants.TYPE_DATETIME2:

public class SQLServerGenericDataSource extends GenericDataSource {
 *
    @Override
    }
package org.jkiss.dbeaver.ext.mssql.model.generic;
            } catch (DBException e) {
        return connectionsProps;

                    return DBPDataKind.DATETIME;
    @Override
                for (DBPPropertyDescriptor descriptor : properties) {
            case DBPDataSource.FEATURE_MAX_STRING_LENGTH:
    private static final String PROP_ENCRYPT_PASS = "ENCRYPT_PASSWORD";
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
        @NotNull DBPConnectionConfiguration connectionInfo
import org.jkiss.dbeaver.model.exec.DBCException;

            // Workaround for jTDS driver (#3555)
    public Object getDataSourceFeature(String featureId) {
    public boolean hasMetaDataProcedureView() {
    }
        @NotNull DBPDriver driver,
            monitor,
            case DBPDataSource.FEATURE_LIMIT_AFFECTS_DML:
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws DBException
/*
                DBPPropertyDescriptor[] properties = driver.getDataSourceProvider().getConnectionProperties(monitor, driver, connectionInfo);
    }
import org.jkiss.dbeaver.model.DBPDataSource;
        return super.resolveDataKind(typeName, valueType);
    private boolean hasMetaDataProcedureView = false;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                case SQLServerConstants.TYPE_DATETIMEOFFSET:
        @NotNull JDBCExecutionContext context,
 * distributed under the License is distributed on an "AS IS" BASIS,
            // App name
                }
                case SQLServerConstants.TYPE_SMALLDATETIME:
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                        context.getDataSource().getContainer().getConnectionConfiguration().setProperty(PROP_ENCRYPT_PASS, "true"); // To see changes in the Driver Properties tab
            connectionsProps.put(
            }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        throws DBException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public SQLServerGenericDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, SQLServerMetaModel metaModel)
    /**

            new SQLServerMetaModel(SQLServerUtils.isDriverSqlServer(container.getDriver()))
        } catch (SQLException e) {

import org.jkiss.dbeaver.ext.mssql.model.SQLServerDialectSybase;
        return hasMetaDataProcedureView;
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    }
                        connectionInfo.setProperty(PROP_ENCRYPT_PASS, "true"); // To apply changes
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
