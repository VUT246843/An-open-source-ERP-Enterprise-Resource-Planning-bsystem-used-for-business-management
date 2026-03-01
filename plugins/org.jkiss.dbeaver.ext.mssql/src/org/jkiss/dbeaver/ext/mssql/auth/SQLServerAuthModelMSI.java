    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
        super.endAuthentication(dataSource, configuration, connProperties);
import org.jkiss.dbeaver.DBException;
 *

    }
package org.jkiss.dbeaver.ext.mssql.auth;
 * SQL Server MSI auth model.
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
import java.util.Properties;
}

    @Override
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }


    public static final String ID = "sqlserver_msi";
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
/**
 * you may not use this file except in compliance with the License.

public class SQLServerAuthModelMSI extends SQLServerAuthModelAbstract {
            connProperties.put("msiClientId", configuration.getUserName());
    }
 * See the License for the specific language governing permissions and
 */
        return credentials;
    @Override
 * You may obtain a copy of the License at
    public boolean isUserPasswordApplicable() {
            connProperties.remove(DBConstants.DATA_SOURCE_PROPERTY_USER);
import org.jkiss.code.NotNull;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
            connProperties.remove(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD);
        return false;
/*
import org.jkiss.dbeaver.model.DBPDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

        if (!CommonUtils.isEmpty(configuration.getUserName())) {
 * DBeaver - Universal Database Manager
        }
import org.jkiss.dbeaver.model.DBConstants;

    @Override
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {

        connProperties.put(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION, SQLServerConstants.AUTH_ACTIVE_DIRECTORY_MSI);

import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
