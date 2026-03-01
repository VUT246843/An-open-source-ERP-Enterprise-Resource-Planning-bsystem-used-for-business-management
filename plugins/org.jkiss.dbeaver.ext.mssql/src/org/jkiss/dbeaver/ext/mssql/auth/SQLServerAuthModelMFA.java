 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.endAuthentication(dataSource, configuration, connProperties);
 * DBeaver - Universal Database Manager
        dataSource.getContainer().setForceUseSingleConnection(true);
 * You may obtain a copy of the License at
        return credentials;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
        // https://github.com/microsoft/mssql-jdbc/issues/2237#issuecomment-2075520355
 *

    public static final String ID = "sqlserver_mfa";
}
 */
package org.jkiss.dbeaver.ext.mssql.auth;
        connProperties.put(CONNECT_RETRY_COUNT, "0");
        connProperties.put(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION, SQLServerConstants.AUTH_ACTIVE_DIRECTORY_INTERACTIVE);
    public boolean isUserPasswordApplicable() {
    }
 * SQL Server MFA auth model.




/**

import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
public class SQLServerAuthModelMFA extends SQLServerAuthModelAbstract {

    @Override
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
 * limitations under the License.
        return false;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {
    public static final String CONNECT_RETRY_COUNT = "connectRetryCount";
import org.jkiss.code.NotNull;
/*
 * you may not use this file except in compliance with the License.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
import java.util.Properties;
 *
    }

    }

 */
