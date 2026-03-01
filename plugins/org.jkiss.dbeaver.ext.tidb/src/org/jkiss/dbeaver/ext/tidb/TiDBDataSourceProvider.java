import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            throws DBException {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;
    @NotNull
import org.jkiss.dbeaver.ext.mysql.MySQLDataSourceProvider;
    @NotNull
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
import org.jkiss.dbeaver.ext.tidb.mysql.model.TiDBMySQLDataSource;
    @Override
 * Unless required by applicable law or agreed to in writing, software
    @Override

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

}
        return DatabaseURL.generateUrlByTemplate(driver, connectionInfo);
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.model.DatabaseURL;
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.model.DBPDataSource;
        return new TiDBMySQLDataSource(monitor, container);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.tidb;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class TiDBDataSourceProvider extends MySQLDataSourceProvider {
 *
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
 * limitations under the License.
    }
 *
 *
    }
