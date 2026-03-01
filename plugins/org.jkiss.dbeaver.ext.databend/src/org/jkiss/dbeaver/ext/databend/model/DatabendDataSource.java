 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throws DBException {
    protected boolean isPopulateClientAppName() {
            }
                throw new DBCException("Error configuring SSL certificates", e);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
        return false;
package org.jkiss.dbeaver.ext.databend.model;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
public class DatabendDataSource extends GenericDataSource {
 * you may not use this file except in compliance with the License.
}


import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import org.jkiss.dbeaver.model.exec.DBCException;
    }

    private void initSSL(DBRProgressMonitor monitor, Properties properties) throws DBException {
    @Override
    @Nullable
            try {
    }

import java.util.Properties;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        }
            } catch (Exception e) {
import org.jkiss.dbeaver.DBException;
        monitor.subTask("Initialising SSL configuration");
        super(monitor, container, metaModel, new DatabendSQLDialect());
        properties.put(DatabendConstants.SSL_PARAM, "enable");
    protected Properties getAllConnectionProperties(@NotNull DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose, DBPConnectionConfiguration connectionInfo)
 *
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * limitations under the License.
/**
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Properties properties = super.getAllConnectionProperties(monitor, context, purpose, connectionInfo);
 */
 */
 * You may obtain a copy of the License at
        return properties;
            throws DBCException {
                initSSL(monitor, properties);
import org.jkiss.code.NotNull;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DatabendDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, DatabendMetaModel metaModel)
 * Databend datasource
        final DBWHandlerConfiguration sslConfig = getContainer().getActualConnectionConfiguration().getHandler("databend-ssl");
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
/*
        if (sslConfig != null && sslConfig.isEnabled()) {
import org.jkiss.code.Nullable;
