 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            url.append("/").append(connectionInfo.getDatabaseName());
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.DBException;
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
 * See the License for the specific language governing permissions and
        url.append("jdbc:ocient://").append(connectionInfo.getHostName());
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
/*
        throws DBException {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
        return new OcientDataSource(monitor, container);
        }
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
        if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
import org.jkiss.dbeaver.model.connection.DBPDriver;
        StringBuilder url = new StringBuilder();
import org.jkiss.dbeaver.model.DBPDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
            url.append(":").append(connectionInfo.getHostPort());
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ext.ocient;

 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ext.ocient.model.OcientDataSource;
    @NotNull
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager


        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    @Override
 */
public class OcientDataSourceProvider extends GenericDataSourceProvider {
}
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * You may obtain a copy of the License at
 *
    }
        return url.toString();
