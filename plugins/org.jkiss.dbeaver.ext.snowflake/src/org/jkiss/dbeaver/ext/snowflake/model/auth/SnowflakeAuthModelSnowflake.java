        @NotNull Properties connProperties
        CREDENTIALS credentials = super.loadCredentials(dataSource, configuration);
        AuthModelDatabaseNativeCredentials credentials,
    ) throws DBException {
    }
 * limitations under the License.
    @NotNull
import org.jkiss.code.NotNull;

 *

                connProperties.put("authenticator", authenticator);
 * Unless required by applicable law or agreed to in writing, software
    public Object initAuthentication(

            if (!CommonUtils.isEmpty(authenticator)) {
    ) {

 *
import org.jkiss.utils.CommonUtils;
    }
            }
            String authenticator = getAuthenticator(dataSource, credentials, configuration);
            // If "authenticator" is already set by user then do not change it
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.DBException;
        @NotNull Properties connProperties
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }

        @NotNull DBPConnectionConfiguration configuration,
    @Override
    public static final String ID = "snowflake_snowflake";
    @Override
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
 * Licensed under the Apache License, Version 2.0 (the "License");

        credentials.setRole(configuration.getAuthProperty(SnowflakeConstants.PROP_AUTH_ROLE));
        }
package org.jkiss.dbeaver.ext.snowflake.model.auth;
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;

 */
import java.util.Properties;

    @Override
        if (connProperties.getProperty("authenticator") == null) {
        return super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);
        DBPDataSource dataSource,
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
    public void saveCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull CREDENTIALS credentials) {
    public CREDENTIALS createCredentials() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
 *
 * DBeaver - Universal Database Manager
        DBPConnectionConfiguration configuration
 */
 * You may obtain a copy of the License at
        return (CREDENTIALS) new AuthModelSnowflakeCredentials();
    @Override
/*
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void endAuthentication(
        @NotNull DBPConnectionConfiguration configuration,
    extends AuthModelDatabaseNative<CREDENTIALS> {
    }


/**
            connProperties.put("role", roleName);

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        super.endAuthentication(dataSource, configuration, connProperties);
 * you may not use this file except in compliance with the License.
        String roleName = configuration.getAuthProperty(SnowflakeConstants.PROP_AUTH_ROLE);
        @NotNull DBPDataSourceContainer dataSource,
 * See the License for the specific language governing permissions and

    public CREDENTIALS loadCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration) {
        if (!CommonUtils.isEmpty(roleName)) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    @Override
        configuration.setAuthProperty(SnowflakeConstants.PROP_AUTH_ROLE, credentials.getRole());
import org.jkiss.dbeaver.model.DBPDataSource;
    protected String getAuthenticator(
    @NotNull
        @NotNull DBRProgressMonitor monitor,
        @NotNull CREDENTIALS credentials,
 * Snowflake database native auth model.
        return configuration.getAuthProperty(SnowflakeConstants.PROP_AUTHENTICATOR);
public class SnowflakeAuthModelSnowflake<CREDENTIALS extends AuthModelSnowflakeCredentials>
        @NotNull DBPDataSource dataSource,
        return credentials;

        super.saveCredentials(dataSource, configuration, credentials);
        }
