
    {

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
/*
            @NotNull DBPDataSourceContainer container)
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

}

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.ext.mssql.model.generic.SQLServerGenericDataSource;
 *
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    }
    {
 * See the License for the specific language governing permissions and
        return new SQLServerGenericDataSource(monitor, container);
public class SQLServerGenericDataSourceProvider extends SQLServerDataSourceProvider {
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * you may not use this file except in compliance with the License.
            @NotNull DBRProgressMonitor monitor,
    public DBPDataSource openDataSource(
package org.jkiss.dbeaver.ext.mssql;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public SQLServerGenericDataSourceProvider()
    @NotNull
import org.jkiss.code.NotNull;

            throws DBException
 * Licensed under the Apache License, Version 2.0 (the "License");
