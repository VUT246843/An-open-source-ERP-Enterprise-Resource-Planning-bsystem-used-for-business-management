 * limitations under the License.
}
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
 *
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
        return new GreenplumDataSource(monitor, container);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
/*
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    @NotNull
public class GreenplumDataSourceProvider extends PostgreDataSourceProvider {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumDataSource;
import org.jkiss.dbeaver.ext.postgresql.PostgreDataSourceProvider;
package org.jkiss.dbeaver.ext.greenplum;
