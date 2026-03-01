 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 *
 * DBeaver - Universal Database Manager
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
package org.jkiss.dbeaver.ext.greenplum;
 * See the License for the specific language governing permissions and
 *
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.postgresql.PostgreDataSourceProvider;
import org.jkiss.dbeaver.ext.greenplum.model.CloudberryDataSource;
 */
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return new CloudberryDataSource(monitor, container);
public class CloudberryDataSourceProvider extends PostgreDataSourceProvider {
}
/*
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
