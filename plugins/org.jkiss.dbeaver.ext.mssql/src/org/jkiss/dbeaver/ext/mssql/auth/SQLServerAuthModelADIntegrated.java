import java.util.Properties;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }

    public boolean isUserNameApplicable() {
        return false;
 * limitations under the License.

import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 * See the License for the specific language governing permissions and
    public boolean isUserPasswordApplicable() {
    }
    @Override
package org.jkiss.dbeaver.ext.mssql.auth;
        return credentials;
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 */
 * Unless required by applicable law or agreed to in writing, software

 * distributed under the License is distributed on an "AS IS" BASIS,

    }
 *


 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBConstants;
        super.endAuthentication(dataSource, configuration, connProperties);
 *
 * SQL Server AD integrated auth model.
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    public static final String ID = "sqlserver_ad_integrated";
    @Override
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
        connProperties.remove(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD);
/*
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        connProperties.remove(DBConstants.DATA_SOURCE_PROPERTY_USER);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
 * DBeaver - Universal Database Manager

 */
        return false;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

import org.jkiss.dbeaver.DBException;
        connProperties.put(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION, SQLServerConstants.AUTH_ACTIVE_DIRECTORY_INTEGRATED);
/**
    @Override

public class SQLServerAuthModelADIntegrated extends SQLServerAuthModelAbstract {
 *
