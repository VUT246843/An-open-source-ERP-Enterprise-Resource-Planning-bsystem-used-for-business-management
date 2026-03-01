    public String getUserPassword() {
    public SecureCredentials(@NotNull DBWHandlerConfiguration handlerConfiguration) {
    @Nullable
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
        return userName;


import org.jkiss.dbeaver.model.access.DBAAuthProfile;
 * Unless required by applicable law or agreed to in writing, software
    }
import java.util.HashMap;
        this.userPassword = handlerConfiguration.isSavePassword() ? handlerConfiguration.getPassword() : null;

    public void setProperties(@NotNull Map<String, String> properties) {
    }
        this.userPassword = profile.getUserPassword();
    public void setUserPassword(@Nullable String userPassword) {

        this.userName = dataSource.getConnectionConfiguration().getUserName();
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
 *
            this.properties = new LinkedHashMap<>();

        } else {
    @Nullable
 *
import java.util.LinkedHashMap;
        if (this.properties == null) {
        if (this.properties != null) {
    public Map<String, String> getProperties() {
    }
    }

 * You may obtain a copy of the License at
    public SecureCredentials(@NotNull DBPDataSourceContainer dataSource) {
    }
            this.properties.putAll(properties);
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        }
    public void setSecureProp(String key, String value) {
    private Map<String, String> properties;
    }
        this.properties = profile.getProperties();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return userPassword;

    @Nullable
/*

 */
    public SecureCredentials(@NotNull DBAAuthProfile profile) {

    @Nullable
    }
        this.userName = profile.getUserName();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
}
    public String getUserName() {
    private String userName;
            this.properties.clear();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.properties.put(key, value);
        return properties;
import org.jkiss.code.Nullable;
    public void setUserName(@Nullable String userName) {
        this.userName = handlerConfiguration.getUserName();
    @Nullable
import java.util.Map;
    }
        this.userName = userName;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.userPassword = userPassword;
        this.userPassword = dataSource.isSavePassword() ? dataSource.getConnectionConfiguration().getUserPassword() : null;
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.registry;
public class SecureCredentials {
            this.properties = new HashMap<>(properties);
 *
        }
    }
    public SecureCredentials() {

        this.properties = dataSource.getConnectionConfiguration().getAuthProperties();


    private String userPassword;
 * limitations under the License.
    }
