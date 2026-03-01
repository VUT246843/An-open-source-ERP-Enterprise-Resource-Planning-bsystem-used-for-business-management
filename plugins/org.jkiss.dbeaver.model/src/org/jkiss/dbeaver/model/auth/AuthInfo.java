        return userCredentials;
public class AuthInfo {
 * you may not use this file except in compliance with the License.
    }

 *

 * See the License for the specific language governing permissions and


 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getAuthProvider() {
}

    public Map<String, Object> getUserCredentials() {
 */
        this.userCredentials = userCredentials;
    private final String authProvider;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.authProvider = authProvider;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return authProvider;
    }
import org.jkiss.code.NotNull;

    }
/*
package org.jkiss.dbeaver.model.auth;

    public AuthInfo(@NotNull String authProvider, @NotNull Map<String, Object> userCredentials) {
    public void setUserCredentials(Map<String, Object> userCredentials) {
        this.userCredentials = userCredentials;
    private transient Map<String, Object> userCredentials;
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
