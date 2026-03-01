    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo)
                }
            String databaseName = CommonUtils.notEmpty(connectionInfo.getDatabaseName());
        if (!folder.exists()) {
                // TNS name not found.

    }
                String hostName = DBWUtils.getTargetTunnelHostName(ds, connectionInfo);
    @Override
    }
            return userName;
import org.jkiss.dbeaver.ext.oracle.oci.OCIUtils;
 * DBeaver - Universal Database Manager
        boolean isInstantClient = OCIUtils.isInstantClient(location.getName());
                return databaseName;
            File ociLibFile = new File(folder, dllName);
        List<DBPNativeClientLocation> homeIds = new ArrayList<>();
        return OCIUtils.getDefaultOraHome();

            } else {
import java.util.Map;
        }
    public long getFeatures()
        }
    @Override
import org.jkiss.dbeaver.model.*;
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return homeIds;
    {
        @NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
        } else {
    }
        throws DBException
 *
            final String tnsDescription = tnsNames.get(databaseName);
                url.append(connectionInfo.getHostPort());
                url.append(connectionInfo.getHostName());
    @Nullable
 * limitations under the License.
            connectionType = OracleConstants.ConnectionType.BASIC;
    }
package org.jkiss.dbeaver.ext.oracle;
                if (CommonUtils.isEmpty(hostName)) {
    public String getConnectionUserName(@NotNull DBPConnectionConfiguration connectionInfo) {
 *
                checkTnsAdmin = true;
        return role == null ? userName : userName + " AS " + role;
        Integer oraVersion = getOracleVersion(location);
                final String clientHomeId = connectionInfo.getClientHomeId();
        String conTypeProperty = connectionInfo.getProviderProperty(OracleConstants.PROP_CONNECTION_TYPE);


                    return null;
        }
        String userName = connectionInfo.getUserName();
    @Override
 */

    DBAUserCredentialsProvider,
    }
import org.jkiss.dbeaver.ext.oracle.oci.OracleHomeDescriptor;
        if (conTypeProperty != null) {
                url.append(tnsDescription);
                    return hostName + ":" + hostPort;
    DBPInformationProvider {
            if (!CommonUtils.isEmpty(tnsDescription)) {
        if (connectionType == OracleConstants.ConnectionType.TNS) {
            if (connectionType == OracleConstants.ConnectionType.CUSTOM) {
            if (ociLibFile.exists()) {
                url.append(databaseName);
    }
            } else {
    @Nullable


 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;

        if (!CommonUtils.isEmpty(authModelId) && !AuthModelDatabaseNative.ID.equals(authModelId)) {
            if (connectionType == OracleConstants.ConnectionType.TNS) {
        }
        }
    public String getProductVersion(DBPNativeClientLocation location) {

 * You may obtain a copy of the License at
            }
            if (isSID) {
    @Nullable
            if (!CommonUtils.isEmpty(databaseName)) {
            }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            }
    public DBPDataSource openDataSource(
            String tnsPathProp = CommonUtils.toString(connectionInfo.getProviderProperty(OracleConstants.PROP_TNS_PATH));

import java.util.ArrayList;
import java.util.List;
            DBPConnectionConfiguration connectionInfo = ds.getConnectionConfiguration();
        StringBuilder url = new StringBuilder(100);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getConnectionUserPassword(@NotNull DBPConnectionConfiguration connectionInfo) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getProductName(DBPNativeClientLocation location) {
 *
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
        String databaseName = CommonUtils.notEmpty(connectionInfo.getDatabaseName());
        // FIXME: left for backward compatibility. Replaced by auth model. Remove in future.

    @Override
        }
    @NotNull
        return connectionInfo.getUserPassword();
        return new OracleDataSource(monitor, container);

        if (!CommonUtils.isEmpty(userName) && userName.contains(" AS ")) {
    }
                    return hostName;
        File folder = isInstantClient ? oraHome : new File(oraHome, "bin");
        return null;
    @Override
            } else {
        }
        url.append("jdbc:oracle:thin:@"); //$NON-NLS-1$
    }
    }
            // TNS name specified
                    System.setProperty(OracleConstants.VAR_ORACLE_NET_TNS_ADMIN, tnsNamesFile.getAbsolutePath());
    // Client manager
        return null;
        String authModelId = connectionInfo.getAuthModelId();
                checkTnsAdmin = false;

            if (!CommonUtils.isEmpty(tnsPathProp)) {
            OracleConstants.ConnectionType connectionType = getConnectionType(connectionInfo);
                url.append("/"); //$NON-NLS-1$
            homeIds.add(home);
 * See the License for the specific language governing permissions and

                url.append(":"); //$NON-NLS-1$
            File oraHomePath;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
    @Override
    }
        }
            // Basic connection info specified
        boolean isInstantClient = OCIUtils.isInstantClient(location.getName());
                url.append("//"); //$NON-NLS-1$
}
            final Map<String, String> tnsNames = OCIUtils.readTnsNames(oraHomePath, checkTnsAdmin);
                url.append(":"); //$NON-NLS-1$
    public String getObjectInformation(@NotNull DBPObject object, @NotNull String infoType) {
 * you may not use this file except in compliance with the License.
                oraHomePath = new File(tnsPathProp);
                // Last chance - set TNS path and hope that Oracle driver find figure something out
            return DatabaseURL.generateUrlByTemplate(connectionInfo.getUrl(), connectionInfo);
        File oraHome = location.getPath();
            if (!isSID) {
            boolean isSID = OracleConnectionType.SID.name().equals(connectionInfo.getProviderProperty(OracleConstants.PROP_SID_SERVICE));
        } else {
    {
                final OracleHomeDescriptor oraHome = CommonUtils.isEmpty(clientHomeId) ? null : OCIUtils.getOraHome(clientHomeId);
                if (tnsNamesFile != null && tnsNamesFile.exists()) {
            String dllName = System.mapLibraryName("ocijdbc" + counter);
        return FEATURE_SCHEMAS;
    @NotNull
    DBPNativeClientLocationManager,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        final String role = connectionInfo.getProviderProperty(OracleConstants.PROP_INTERNAL_LOGON);
                } else {
/*
            }

            boolean checkTnsAdmin;
                return DatabaseURL.generateUrlByTemplate(connectionInfo.getUrl(), connectionInfo);
import java.io.File;
        OracleConstants.ConnectionType connectionType;
    @Override
    }
import org.jkiss.dbeaver.DBException;
    {
            } else {
    {
        OracleConstants.ConnectionType connectionType = getConnectionType(connectionInfo);
            // Try to get description from TNSNAMES
    public OracleDataSourceProvider()
        for (OracleHomeDescriptor home : OCIUtils.getOraHomes()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                final File tnsNamesFile = OCIUtils.findTnsNamesFile(oraHomePath, checkTnsAdmin);
                }
    public DBPNativeClientLocation getDefaultLocalClientLocation()
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
            return userName;
import org.jkiss.utils.CommonUtils;
    }

import org.jkiss.dbeaver.model.connection.DBPNativeClientLocationManager;

    @Override
    {
import org.jkiss.dbeaver.model.net.DBWUtils;
        return url.toString();
        }
            }
        //boolean isOCI = OCIUtils.isOciDriver(driver);
            connectionType = OracleConstants.ConnectionType.valueOf(CommonUtils.toString(conTypeProperty));
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionType;

            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
        if (object instanceof DBPDataSourceContainer ds && infoType.equals(INFO_TARGET_ADDRESS)) {
    //////////////////////////////////////
    @Override
                oraHomePath = oraHome == null ? null : oraHome.getPath();
                url.append(databaseName);
    {
                } else if (CommonUtils.isEmpty(hostPort)) {
    public static Integer getOracleVersion(DBPNativeClientLocation location)

import org.jkiss.dbeaver.model.connection.DBPDriver;
    private OracleConstants.ConnectionType getConnectionType(DBPConnectionConfiguration connectionInfo) {

            }
                return counter;
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
        return OCIUtils.getFullOraVersion(location.getName(), isInstantClient);
    @Override
            }
            return null;
        if (connectionType == OracleConstants.ConnectionType.CUSTOM) {
            }
        for (int counter = 7; counter <= 15; counter++) {
    {
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
public class OracleDataSourceProvider extends JDBCDataSourceProvider implements
import org.jkiss.dbeaver.model.access.DBAUserCredentialsProvider;
    public List<DBPNativeClientLocation> findLocalClientLocations()
        return "Oracle" + (oraVersion == null ? "" : " " + oraVersion);
                String hostPort = connectionInfo.getHostPort();
        return connectionType;
