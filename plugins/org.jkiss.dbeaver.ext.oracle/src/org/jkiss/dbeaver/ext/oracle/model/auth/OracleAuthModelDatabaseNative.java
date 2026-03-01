    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        super.endAuthentication(dataSource, configuration, connProperties);
        credentials.setUserName(userName);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 *

            connProperties.setProperty(OracleConstants.CONN_PROP_SESSION_OS_USER, formattedUsername);

    }
 * limitations under the License.
                String logonAs = configuration.getProviderProperty(OracleConstants.PROP_AUTH_LOGON_AS);
                userName += " AS " + role;
            String formattedUsername = userName.toUpperCase().split(" AS ")[0];
        );
}
    }

    @NotNull
import org.jkiss.code.NotNull;
    public static final String ID = "oracle_native";
            false
        if (!CommonUtils.isEmpty(userName) && !userName.contains(" AS ")) {
    ) throws DBException {
        }
            }
        @NotNull DBRProgressMonitor monitor,

import org.jkiss.dbeaver.model.DBPDataSource;
        String userName = configuration.getUserName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
                // Role can be also passed as provided property

                }
        return new OracleDatabaseNativeCredentials();
    public Object initAuthentication(
 *
            if (!CommonUtils.isEmpty(role)) {

                    role = configuration.getProviderProperty(OracleConstants.PROP_AUTH_LOGON_AS);
 * Oracle database native auth model.
        }
        return super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            if (CommonUtils.isEmpty(role)) {
            configuration.getProviderProperty(OracleConstants.PROP_SET_OS_USER),
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */


 * DBeaver - Universal Database Manager
        @NotNull DBPDataSource dataSource,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public OracleDatabaseNativeCredentials createCredentials() {
/*
        @NotNull Properties connProperties
    @Override
    @Override
import java.util.Properties;
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
            String role = configuration.getAuthProperty(OracleConstants.PROP_AUTH_LOGON_AS);
                if (!OracleConnectionRole.NORMAL.getTitle().equalsIgnoreCase(logonAs)) {
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
 * Unless required by applicable law or agreed to in writing, software

public class OracleAuthModelDatabaseNative extends AuthModelDatabaseNative<OracleDatabaseNativeCredentials> {
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
            }
 */
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
        @NotNull OracleDatabaseNativeCredentials credentials,
        if (setOsUser) {
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
package org.jkiss.dbeaver.ext.oracle.model.auth;
        boolean setOsUser = CommonUtils.getBoolean(
    }
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionRole;
        @NotNull DBPConnectionConfiguration configuration,
