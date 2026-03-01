        // Represent empty points using NaN-coordinates
                }
            getContainer().getConnectionConfiguration().setUserPassword(passwordInfo.getNewPassword());
    @Override
        super(monitor, container, metaModel, new HANASQLDialect());
                }
        DBAPasswordChangeInfo passwordInfo = DBWorkbench.getPlatformUI().promptUserPasswordChange(
        return sysViewColumnUnits.get(objectName+"."+columnName);
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (HANAConstants.DATA_TYPE_NAME_HALF_VECTOR.equalsIgnoreCase(typeName) ||
            return adapter.cast(new HANAStructureAssistant(this));
        }
            statement.execute("ALTER USER " + connectionInfo.getUserName() + " PASSWORD " + DBUtils.getQuotedIdentifier(this, passwordInfo.getNewPassword()));
            DBWorkbench.getPlatformUI().showError("Error changing password", "Error changing expired password", e);
  
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        Connection connection = super.openConnection(monitor, context, purpose);
    @Override
    protected boolean isPopulateClientAppName() { 
            props.put(HANAConstants.CONN_PROP_APPLICATION_NAME, appName);
                            sysViewColumnUnits.put(resultSet.getString(1), resultSet.getString(2));
    @Override
    protected Map<String, String> getInternalConnectionProperties(
    }
    }
    @Override
        @NotNull DBPConnectionConfiguration connectionInfo
    /*
        try {
package org.jkiss.dbeaver.ext.hana.model;
    private static final Log log = Log.getLog(HANADataSource.class);
    public DBCPlanStyle getPlanStyle() {
 */
    private boolean isPasswordExpireWarningShown;
            
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import java.sql.Connection;
     */
    @Override
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Exception e) {
    }
    @NotNull
 *
        HANAPlanAnalyser plan = new HANAPlanAnalyser(this, query);
            } else {
        return DBCPlanStyle.PLAN;
        return props;
            return DBPDataKind.ARRAY;
            HANAConstants.DATA_TYPE_NAME_REAL_VECTOR.equalsIgnoreCase(typeName)) {
    
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration)
        // Represent geometries as EWKB (instead of as WKB) so that we can extract the SRID
import org.jkiss.code.Nullable;
    }
        plan.explain(session);
    private boolean changeExpiredPassword(DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose) {
            connectionInfo.setUserPassword(passwordInfo.getNewPassword());
        } catch (SQLException e) {
    /*
     */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
        return false; // basically true, but different property name 
            getContainer().persistConfiguration();
            props.put(HANAConstants.CONN_PROP_READONLY, "TRUE");
        @NotNull JDBCExecutionContext context,
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    }

import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
        }
                    try (JDBCResultSet resultSet = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
 *
    @NotNull
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.ModelPreferences;
                    isPasswordExpireWarningShown = true;
        if (sysViewColumnUnits != null)
            for (SQLWarning warning = connection.getWarnings(); warning != null; warning = warning.getNextWarning()) {
    /*
 * you may not use this file except in compliance with the License.
            }
            String appName = DBUtils.getClientApplicationName(getContainer(), context, purpose);
     * search
    public HANADataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)

import org.jkiss.code.NotNull;
                        }
     */
import org.jkiss.dbeaver.Log;
        } else if (adapter == DBAUserPasswordManager.class) {
        }
            return false;
     * explain
    @NotNull

    String getSysViewColumnUnit(String objectName, String columnName)
    }
    {
        @NotNull DBRProgressMonitor monitor,
        try {
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * DBeaver - Universal Database Manager
        sysViewColumnUnits = new HashMap<String, String>();
            statement.execute("SELECT * FROM SYS.DUMMY");
    }
        props.put(HANAConstants.CONN_PROP_SPATIAL_OUTPUT_REPRESENTATION, HANAConstants.CONN_VALUE_SPATIAL_OUTPUT_REPRESENTATION);
        String stmt = "SELECT VIEW_NAME||'.'||VIEW_COLUMN_NAME, UNIT FROM SYS.M_MONITOR_COLUMNS WHERE UNIT IS NOT NULL";
public class HANADataSource extends GenericDataSource implements DBCQueryPlanner {
        Map<String, String> props = new HashMap<>();
    public <T> T getAdapter(@NotNull Class<T> adapter) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @NotNull DBPDriver driver,
import java.sql.SQLWarning;
        }
                log.debug("Error getting SYS column units: " + e.getMessage());
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
            Statement statement = connection.createStatement();
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
                log.debug("password expired check failed ", e);
        if (getContainer().isConnectionReadOnly()) {
import org.jkiss.dbeaver.ext.hana.model.plan.HANAPlanAnalyser;
                    DBWorkbench.getPlatformUI().showWarningMessageBox("Warning", warning.getMessage());
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
    @Override
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
}

import java.sql.Statement;
            if (e.getErrorCode() == HANAConstants.ERR_SQL_ALTER_PASSWORD_NEEDED) {
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
    
    {
    }
        } catch (SQLException e) {

                "Password has expired. Set new password.", connectionInfo.getUserName(), connectionInfo.getUserPassword(), false, false);
import java.sql.SQLException;
        if (adapter == DBSStructureAssistant.class) {
import org.jkiss.dbeaver.model.exec.DBCException;
                throw new DBException("You can't set empty password");
                                        @NotNull String purpose) throws DBCException {
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;

     * column unit for views in SYS schema
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
        return super.getAdapter(adapter);
        }
            Connection connection = super.openConnection(monitor, context, purpose);
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read generic metadata")) {
 * limitations under the License.
        return plan;
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    ) throws DBCException {
 * See the License for the specific language governing permissions and
                    }
            log.debug("password expire check failed", e);
            return adapter.cast(new HANAUserPasswordManager(this));
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.model.access.DBAPasswordChangeInfo;

        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
     * application
        return info;
                        while(resultSet.next()) {
    }    
        DBPConnectionConfiguration connectionInfo = getContainer().getActualConnectionConfiguration();
        props.put(HANAConstants.CONN_PROP_SPATIAL_WKB_EMPTY_POINT_REPRESENTATION, HANAConstants.CONN_VALUE_SPATIAL_WKB_EMPTY_POINT_REPRESENTATION);

import java.util.HashMap;
        return true;
    
import org.jkiss.dbeaver.model.exec.DBCSession;
            try {
                if (warning.getErrorCode() == HANAConstants.WRN_SQL_NEARLY_EXPIRED_PASSWORD && !isPasswordExpireWarningShown) {
    public void initializeSysViewColumnUnits(@NotNull DBRProgressMonitor monitor) throws DBException {
    {

        }
    @Override

    /*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        final HANADataSourceInfo info = new HANADataSourceInfo(metaData);
    } 
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context,
        return super.resolveDataKind(typeName, valueType);
            }
        if (passwordInfo == null) {
     */
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.DBPDataKind;
import java.util.Map;
        return connection;
        @NotNull String purpose,
        }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
        }
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
        }

                if (changeExpiredPassword(monitor, context, purpose)) {
        try {
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
    
        throws DBException
                    return openConnection(monitor, context, purpose);
            } catch (SQLException e) {
/*
                try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
            Statement statement = connection.createStatement();

import org.jkiss.dbeaver.DBException;
    throws DBCException {
            return false;
            if (passwordInfo.getNewPassword() == null) {
    private HashMap<String, String> sysViewColumnUnits; 
