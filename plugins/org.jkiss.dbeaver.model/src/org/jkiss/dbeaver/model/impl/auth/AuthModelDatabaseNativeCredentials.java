
package org.jkiss.dbeaver.model.impl.auth;
 *
    @Property(order = 2, password = true)
}
        this.userName = userName;

    public String getUserName() {
        return userName;
    public String getUserPassword() {
    }


    }
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.meta.Property;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(order = 1)
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Database username/password auth credentials.
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public static final String PROP_USER_PASSWORD = "userPassword";
    public static final String PROP_USER_NAME = "userName";
 * DBeaver - Universal Database Manager
public class AuthModelDatabaseNativeCredentials implements DBAAuthCredentials {

    @Override
 */
 *
    public void setUserPassword(String userPassword) {
 * See the License for the specific language governing permissions and

        this.userPassword = userPassword;

        return userPassword;

import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    private String userName;
 * you may not use this file except in compliance with the License.
    public boolean isComplete() {
        return true;
    public void setUserName(String userName) {
    private String userPassword;
 * limitations under the License.
    }
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 *

/**
