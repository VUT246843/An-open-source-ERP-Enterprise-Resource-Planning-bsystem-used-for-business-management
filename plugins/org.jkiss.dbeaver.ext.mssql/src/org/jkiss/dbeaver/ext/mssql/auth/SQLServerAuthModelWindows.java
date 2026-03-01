 *     http://www.apache.org/licenses/LICENSE-2.0

    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {

 *
/*
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

 * you may not use this file except in compliance with the License.
    public static final String ID = "sqlserver_windows";
 *
        return false;

    }
    public boolean isUserNameApplicable() {
import org.jkiss.dbeaver.model.DBPDataSource;
 * Unless required by applicable law or agreed to in writing, software
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {
    }
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

 */
package org.jkiss.dbeaver.ext.mssql.auth;
 *
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
    public boolean isUserPasswordApplicable() {
        connProperties.put(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY, String.valueOf(true));
 * SQL Server windows auth model.
 * You may obtain a copy of the License at
        return credentials;
 */
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return false;

        super.endAuthentication(dataSource, configuration, connProperties);

    }

    @Override
import org.jkiss.dbeaver.DBException;
public class SQLServerAuthModelWindows extends SQLServerAuthModelAbstract {
}
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    @Override
    @Override
import java.util.Properties;
/**
