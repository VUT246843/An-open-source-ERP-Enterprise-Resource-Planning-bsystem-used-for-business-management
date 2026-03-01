    }
        return DatabaseURL.generateUrlByTemplate(driver, connectionInfo);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.ext.oceanbase;
 * limitations under the License.
 * You may obtain a copy of the License at
 *

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.ext.mysql.MySQLDataSourceProvider;
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
            throws DBException {
import org.jkiss.dbeaver.ext.oceanbase.model.OceanbaseMySQLDataSource;
 *

 * you may not use this file except in compliance with the License.
    @Override
    @Override

public class OceanbaseDataSourceProvider extends MySQLDataSourceProvider {
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
}

import org.jkiss.dbeaver.DBException;
/*
        return new OceanbaseMySQLDataSource(monitor, container);
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and

    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
import org.jkiss.dbeaver.model.DatabaseURL;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
