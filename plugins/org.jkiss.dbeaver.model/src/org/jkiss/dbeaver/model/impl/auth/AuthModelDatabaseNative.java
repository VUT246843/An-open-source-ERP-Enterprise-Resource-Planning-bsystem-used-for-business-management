/**
    }
    @NotNull
import org.jkiss.dbeaver.DBException;
        configuration.setUserPassword(credentials.getUserPassword());
    }
    public void endAuthentication(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connProperties) {
import org.jkiss.dbeaver.model.access.DBAAuthModel;

    }
 * See the License for the specific language governing permissions and
    public static final String ID = "native";
        return true;

import org.jkiss.dbeaver.model.access.DBAUserCredentialsProvider;
            }
 *
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean isUserPasswordApplicable() {

    @Override
        @NotNull DBRProgressMonitor monitor,
    }
    public CREDENTIALS loadCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration) {

    }


        String userPassword = credentials.getUserPassword();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return true;
import org.jkiss.dbeaver.model.DBPDataSource;
        return true;
 * No-op model. Leaves all configuration as is.

import org.jkiss.dbeaver.model.DBConstants;
        boolean allowsEmptyPassword = dataSource.getDriver().isAllowsEmptyPassword();
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
    public CREDENTIALS createCredentials() {
 *
    protected boolean isUserPasswordNeeded(@NotNull DBPDataSource dataSource) {
        if (dataSourceProvider instanceof DBAUserCredentialsProvider) {

        configuration.setUserName(credentials.getUserName());

        }
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull
    public static final AuthModelDatabaseNative INSTANCE = new AuthModelDatabaseNative();
            credentials.setUserPassword(((DBAUserCredentialsProvider) dataSourceProvider).getConnectionUserPassword(configuration));
            credentials.setUserPassword("");

 * You may obtain a copy of the License at
        @NotNull CREDENTIALS credentials
 * you may not use this file except in compliance with the License.
        if (isUserNameNeeded(dataSource)) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
            credentials.setUserName(((DBAUserCredentialsProvider) dataSourceProvider).getConnectionUserName(configuration));
    protected boolean isUserNameNeeded(@NotNull DBPDataSource dataSource) {
public class AuthModelDatabaseNative<CREDENTIALS extends AuthModelDatabaseNativeCredentials> implements DBAAuthModel<CREDENTIALS> {

    @Override
 */
 *
    }
        loadCredentials(dataSource, configuration, credentials);
    ) throws DBException {
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBPDataSourceContainer dataSource,
 * distributed under the License is distributed on an "AS IS" BASIS,

import java.util.Properties;
        @NotNull DBPDataSource dataSource,
        // do nothing
 * Unless required by applicable law or agreed to in writing, software

    @Override

    }
import org.jkiss.code.NotNull;
            credentials.setUserPassword(configuration.getUserPassword());
            if (!CommonUtils.isEmpty(userPassword) || (dataSource.getContainer().getDriver().isAllowsEmptyPassword() && !CommonUtils.isEmpty(userName))) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        @NotNull CREDENTIALS credentials,

        @NotNull Properties connectProps
        if (credentials.getUserPassword() == null && allowsEmptyPassword) {
    ) throws DBException {
    }
            if (!CommonUtils.isEmpty(userName)) {

        DBPDataSourceProvider dataSourceProvider = dataSource.getDriver().getDataSourceProvider();
    }
            credentials.setUserName(configuration.getUserName());
        }
 *
        String userName = credentials.getUserName();

        return (CREDENTIALS) new AuthModelDatabaseNativeCredentials();
    public Object initAuthentication(
        @NotNull DBPConnectionConfiguration configuration,
package org.jkiss.dbeaver.model.impl.auth;
 */
        CREDENTIALS credentials = createCredentials();
                connectProps.put(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD, userPassword);
    protected void loadCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, CREDENTIALS credentials) {
        return credentials;
        return true;
            }
}
    public void refreshCredentials(
 * Copyright (C) 2010-2026 DBeaver Corp and others
                connectProps.put(DBConstants.DATA_SOURCE_PROPERTY_USER, userName);
    public void saveCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration, @NotNull CREDENTIALS credentials) {
import org.jkiss.utils.CommonUtils;
        if (isUserPasswordNeeded(dataSource)) {
        @NotNull DBPConnectionConfiguration configuration,
    @Override
    public boolean isUserNameApplicable() {

        return credentials;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        }
    }
        } else {
/*
 * Database username/password auth model.
