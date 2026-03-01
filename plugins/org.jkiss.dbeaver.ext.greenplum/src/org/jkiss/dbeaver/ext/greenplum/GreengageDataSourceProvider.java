 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
        return new GreengageDataSource(monitor, container);
import org.jkiss.dbeaver.ext.greenplum.model.GreengageDataSource;

import org.jkiss.dbeaver.ext.postgresql.PostgreDataSourceProvider;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 * See the License for the specific language governing permissions and
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.DBException;
 *
public class GreengageDataSourceProvider
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package org.jkiss.dbeaver.ext.greenplum;
/*
 * You may obtain a copy of the License at
 * limitations under the License.
        extends PostgreDataSourceProvider {
