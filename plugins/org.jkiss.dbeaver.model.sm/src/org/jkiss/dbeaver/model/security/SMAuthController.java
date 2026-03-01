        @NotNull String appSessionId,
    SMAuthInfo authenticate(
        @NotNull Map<String, Object> sessionParameters,

     * However, we still use it widely and we cannot stop using because push is not always enabled.
        @NotNull Map<String, Object> userCredentials,
    ) throws DBException;
        @Nullable String previousSmSessionId,
/*
        @NotNull String appSessionId,
 * DBeaver - Universal Database Manager
        @Nullable String authProviderConfigurationId,
        @NotNull SMSessionType sessionType,
}
    @NotNull
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */

    SMAuthInfo restoreUserSession(@NotNull String appSessionId) throws DBException;
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Map<String, Object> sessionParameters,

    SMAuthInfo getAuthStatus(@NotNull String authId) throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.code.Nullable;
        boolean forceSessionsLogout
 *
 * Unless required by applicable law or agreed to in writing, software
public interface SMAuthController {
 * See the License for the specific language governing permissions and
    ) throws DBException;
     * Check auth status.

import org.jkiss.dbeaver.model.auth.SMAuthInfo;
import org.jkiss.dbeaver.model.auth.SMSessionType;
        @NotNull String authProviderId,
    /**
 * limitations under the License.
 *
     * We have a newer push mechanism (over websockets) which obsoletes this functions.

 *
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import java.util.Map;
        @NotNull SMSessionType sessionType
    SMAuthInfo authenticateAnonymousUser(
package org.jkiss.dbeaver.model.security;
    @NotNull
    @NotNull
