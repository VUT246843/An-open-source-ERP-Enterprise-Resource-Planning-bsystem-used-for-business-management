 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class SQLServerAuthModelDatabase extends SQLServerAuthModelAbstract {
/*
/**
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
}
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Properties;
        return super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);

import org.jkiss.dbeaver.model.DBPDataSource;
    }

import org.jkiss.code.NotNull;
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.mssql.auth;


 * limitations under the License.

    public static final String ID = "sqlserver_database";
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * SQL Server database auth model.

        //properties.put(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION, SQLServerConstants.AUTH_SQL_SERVER_PASSWORD);
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {
        connProperties.put(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY, String.valueOf(false));
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
 * See the License for the specific language governing permissions and
        super.endAuthentication(dataSource, configuration, connProperties);
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
