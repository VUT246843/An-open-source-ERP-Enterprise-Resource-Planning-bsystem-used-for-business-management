import org.jkiss.dbeaver.DBException;

    @NotNull
    @Override
        return url.toString();
    }
    @Override
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public long getFeatures()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*

import org.jkiss.dbeaver.model.DBPDataSource;
 */
import org.jkiss.dbeaver.ext.denodo.model.DenodoDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBPDataSource openDataSource(

import org.jkiss.dbeaver.model.connection.DBPDriver;


 *
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBException
    }
        url.append(connectionInfo.getHostName());
 * you may not use this file except in compliance with the License.

        url.append("/");
        }
import org.jkiss.dbeaver.Log;
    @Override
        log.debug("getConnectionURL" + url.toString());
    {
        url.append(connectionInfo.getDatabaseName());
public class DenodoDataSourceProvider extends JDBCDataSourceProvider {
        @NotNull DBPDataSourceContainer container)
 *
    {
    private static final Log log = Log.getLog(DenodoDataSourceProvider.class);
        url.append("jdbc:denodo://");
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.denodo.model.DenodoMetaModel;
            url.append(":").append(connectionInfo.getHostPort());
 * See the License for the specific language governing permissions and
 *


        return FEATURE_SCHEMAS;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
package org.jkiss.dbeaver.ext.denodo;
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo)
}
import org.jkiss.code.NotNull;
        @NotNull DBRProgressMonitor monitor,

    @NotNull
        StringBuilder url = new StringBuilder();
 * limitations under the License.
 * DBeaver - Universal Database Manager


    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return new DenodoDataSource(monitor, container, new DenodoMetaModel());
