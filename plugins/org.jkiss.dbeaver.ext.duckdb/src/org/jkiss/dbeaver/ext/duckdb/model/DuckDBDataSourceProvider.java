 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 */
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 *
import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @NotNull
/*
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        return super.openDataSource(monitor, container);
package org.jkiss.dbeaver.ext.duckdb.model;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
public class DuckDBDataSourceProvider extends GenericDataSourceProvider {
import org.jkiss.code.NotNull;
