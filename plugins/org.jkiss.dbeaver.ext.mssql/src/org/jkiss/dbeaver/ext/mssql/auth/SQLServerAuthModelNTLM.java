 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * SQL Server NTLM auth model.


package org.jkiss.dbeaver.ext.mssql.auth;
        @NotNull DBPDataSource dataSource,
import org.jkiss.dbeaver.model.DBPDataSource;
 *
 */
        @NotNull AuthModelDatabaseNativeCredentials credentials,
}
 *
import org.jkiss.dbeaver.model.DBConstants;
    public Object initAuthentication(
            connProperties.put(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY, String.valueOf(true));
            connProperties.put(DBConstants.DATA_SOURCE_PROPERTY_USER, userName.substring(0, divPos));
    }
        super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);
        int divPos = userName.indexOf('@');
    @Override
 * See the License for the specific language governing permissions and

 * limitations under the License.
    ) throws DBException {
    public static final String ID = "sqlserver_ntlm";
/**
public class SQLServerAuthModelNTLM extends SQLServerAuthModelAbstract {
        }
        return credentials;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 *
        connProperties.put(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION_SCHEME, SQLServerConstants.AUTH_NTLM);
    @Override
        super.endAuthentication(dataSource, configuration, connProperties);
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
 */
        @NotNull DBPConnectionConfiguration configuration,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

        @NotNull DBRProgressMonitor monitor,
            connProperties.put(SQLServerConstants.PROP_DOMAIN, userName.substring(divPos + 1));
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        @NotNull Properties connProperties
        if (divPos != -1) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        if (!connProperties.contains(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others


import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 * DBeaver - Universal Database Manager
import java.util.Properties;
        }
        String userName = configuration.getUserName();
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

import org.jkiss.dbeaver.DBException;

