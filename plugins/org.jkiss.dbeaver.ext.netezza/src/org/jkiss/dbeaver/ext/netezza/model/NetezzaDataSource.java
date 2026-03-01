 *
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
            // Special case for quoted user names.
                             @NotNull DBPDataSourceContainer container) throws DBException {
        }

import org.jkiss.dbeaver.DBException;
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCException;

        if (getSQLDialect().isQuotedIdentifier(name)) {
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
import org.jkiss.dbeaver.model.meta.ForTest;
    @Override
        }
public class NetezzaDataSource extends GenericDataSource {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
        super(monitor, metaModel, container, new NetezzaSQLDialect());
import org.jkiss.dbeaver.Log;
 *
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context,

            System.setProperty(COMMAND_SYSTEM_PROPERTY, "");
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context,
    }
 * DBeaver - Universal Database Manager
                BeanUtils.invokeObjectMethod(datasource, "setUser", new Class[]{String.class}, new Object[]{name});
import org.jkiss.utils.BeanUtils;
                                        @NotNull String purpose) throws DBCException {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
    @ForTest
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public NetezzaDataSource(@NotNull DBRProgressMonitor monitor, @NotNull GenericMetaModel metaModel,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

                final var datasource = BeanUtils.invokeObjectMethod(connection, "getDatasource");
/*
        super.initializeContextState(monitor, context, initFrom);
import org.jkiss.code.Nullable;
        // See https://github.com/baztian/jaydebeapi/issues/103
        // when system property "sun.java.command" is null.
                             @NotNull GenericMetaModel metaModel) throws DBException {
 * you may not use this file except in compliance with the License.
        // Workaround for an issue where older Netezza JDBC drivers get a NullPointerException
        final String command = System.getProperty(COMMAND_SYSTEM_PROPERTY);
    public NetezzaDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container,
                log.debug("Error setting user", e);
}

        final String name = getContainer().getActualConnectionConfiguration().getUserName();

            } catch (Throwable e) {

    private static final String COMMAND_SYSTEM_PROPERTY = "sun.java.command";
                                          JDBCExecutionContext initFrom) throws DBException {
import java.sql.Connection;
        // and https://community.microstrategy.com/s/article/Failed-to-Connect-to-IPS-with-the-IBM-Netezza-7-2-1-JDBC-Driver-in-MicroStrategy-2019-and-2020?language=en_US
package org.jkiss.dbeaver.ext.netezza.model;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final Log log = Log.getLog(NetezzaDataSource.class);
    }
    // Constructor for tests
            // Netezza inside check the user name with "select current_user", but this select returns and sets user name in lowercase without quotes
 * You may obtain a copy of the License at
            try {
 * See the License for the specific language governing permissions and
        if (command == null) {

        return super.openConnection(monitor, context, purpose);
        super(monitor, container, metaModel, new NetezzaSQLDialect());
 */
                final var connection = context.getConnection(monitor);
