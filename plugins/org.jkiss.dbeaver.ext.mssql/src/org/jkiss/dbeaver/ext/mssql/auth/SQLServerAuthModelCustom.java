 * See the License for the specific language governing permissions and
public class SQLServerAuthModelCustom extends SQLServerAuthModelAbstract {
/*
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    }
import java.util.Properties;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;

package org.jkiss.dbeaver.ext.mssql.auth;
}
        return super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);
        super.endAuthentication(dataSource, configuration, connProperties);
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) throws DBException {
    @Override
/**
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    public static final String ID = "sqlserver_custom";


 *
 * SQL Server custom auth model.
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
