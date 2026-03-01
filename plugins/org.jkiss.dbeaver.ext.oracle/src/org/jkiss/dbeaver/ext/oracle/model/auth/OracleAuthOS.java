}
        @NotNull DBRProgressMonitor monitor,
    }
 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class OracleAuthOS extends AuthModelDatabaseNative<OracleAuthOSCredentials> {
    public static final String ID = "oracle_os";
        OracleAuthOSCredentials credentials = super.loadCredentials(dataSource, configuration);

    }


import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * DBeaver - Universal Database Manager

 *
/**
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;
        @NotNull DBPConnectionConfiguration configuration,
    @NotNull
        connProperties.put(OracleConstants.CONN_PROP_SESSION_OS_USER, System.getProperty(StandardConstants.ENV_USER_NAME));
package org.jkiss.dbeaver.ext.oracle.model.auth;

        credentials.setUserPassword(null);
        @NotNull Properties connProperties
import java.util.Properties;
 */
        @NotNull OracleAuthOSCredentials credentials,
    public OracleAuthOSCredentials loadCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration) {
    }
 * You may obtain a copy of the License at
 *
/*
    public Object initAuthentication(
        @NotNull DBPDataSource dataSource,

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
        credentials.setUserName(null);
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
    @Override
import org.jkiss.utils.StandardConstants;
    ) throws DBException {
        return new OracleAuthOSCredentials();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

 */
        return credentials;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
 * limitations under the License.
    public OracleAuthOSCredentials createCredentials() {

 * Oracle OS auth model.
import org.jkiss.dbeaver.DBException;

        return super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);
 * Copyright (C) 2010-2025 DBeaver Corp and others
