 *
package org.jkiss.dbeaver.ext.mssql.auth;
public class SQLServerAuthModelADPassword extends SQLServerAuthModelAbstract {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 */
import java.util.Properties;

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {
import org.jkiss.dbeaver.model.DBPDataSource;
 * You may obtain a copy of the License at
        }
    @Override
    }
import org.jkiss.dbeaver.DBException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String ID = "sqlserver_ad_password";
/*
    }
        connProperties.put(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY, String.valueOf(false));


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
        connProperties.put(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION, SQLServerConstants.AUTH_ACTIVE_DIRECTORY_PASSWORD);
        if (!CommonUtils.isEmpty(configuration.getUserName())) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
            connProperties.put("UserName", configuration.getUserName());

        super.endAuthentication(dataSource, configuration, connProperties);
 * Licensed under the Apache License, Version 2.0 (the "License");
            connProperties.put("Password", configuration.getUserPassword());

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
 * SQL Server AD password based auth model.
    @Override
 *
 *

/**
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 * limitations under the License.
        if (!CommonUtils.isEmpty(configuration.getUserPassword())) {
        return credentials;

 */
