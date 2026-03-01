package org.jkiss.dbeaver.ext.oceanbase.model.auth;
            @NotNull AuthModelDatabaseNativeCredentials credentials, @NotNull DBPConnectionConfiguration configuration,
            userName += "@" + configuration.getServerName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource,
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
        String userName = configuration.getUserName();
    @Override
import java.util.Properties;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
    public static final String ID = "oceanbase_native";
 *

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
}
 */
        if (!CommonUtils.isEmpty(userName) && !userName.contains("@")) {
public class OceanbaseAuthModelDatabaseNative extends AuthModelDatabaseNative<AuthModelDatabaseNativeCredentials> {


import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return super.initAuthentication(monitor, dataSource, credentials, configuration, connProperties);

 *

        credentials.setUserName(userName);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
        }
import org.jkiss.dbeaver.DBException;
            @NotNull Properties connProperties) throws DBException {
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
import org.jkiss.dbeaver.model.DBPDataSource;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,


    }
