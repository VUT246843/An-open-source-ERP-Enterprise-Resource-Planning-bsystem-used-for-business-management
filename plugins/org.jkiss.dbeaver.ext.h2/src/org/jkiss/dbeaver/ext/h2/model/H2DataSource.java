 */
import org.jkiss.code.NotNull;
 *
        if (url.startsWith(H2_URL_PREFIX)) {
            String filePath = url.substring(H2_URL_PREFIX.length());
            return url;
import java.sql.Connection;
        return super.getConnectionURL(connectionInfo);
    public static final String H2_DB_FILE_EXTENSION = ".mv.db";

 * Licensed under the Apache License, Version 2.0 (the "License");


            int divPos = filePath.indexOf('?');
        }
/*
            if (filePath.endsWith(H2_DB_FILE_EXTENSION)) {
        }
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * H2 datasource
import org.jkiss.code.Nullable;
                // Remove extension from database name
    @Override
        if (url == null || url.startsWith(H2_URL_PREFIX_TCP)) {
                return url;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
    public static final String H2_URL_PREFIX_TCP = "jdbc:h2:tcp:";
    protected String getConnectionURL(DBPConnectionConfiguration connectionInfo) {
            if (divPos != -1) {
                }
}

 */
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context, @NotNull String purpose) throws DBCException {
                if (params != null) {
 * DBeaver - Universal Database Manager
        String url = connectionInfo.getUrl();
 *
    }
package org.jkiss.dbeaver.ext.h2.model;
    public H2DataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCException;
                url = H2_URL_PREFIX + filePath.substring(0, filePath.length() - H2_DB_FILE_EXTENSION.length());
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
/**
                params = filePath.substring(divPos);

        return super.openConnection(monitor, context, purpose);

import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;

                filePath = filePath.substring(0, divPos);
                    url += params;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
            String params = null;
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
public class H2DataSource extends GenericDataSource {
    public static final String H2_URL_PREFIX = "jdbc:h2:";
        super(monitor, container, new H2MetaModel(), new H2SQLDialect());
    }
            }
 * you may not use this file except in compliance with the License.
