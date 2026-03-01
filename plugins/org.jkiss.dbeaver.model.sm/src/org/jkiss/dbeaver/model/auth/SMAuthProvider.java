        @NotNull SMAuthProviderCustomConfiguration providerConfig,
 * Licensed under the Apache License, Version 2.0 (the "License");
 */


        @Nullable SMAuthProviderCustomConfiguration customConfiguration, // Auth provider configuration (e.g. 3rd party auth server address)

}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable String activeUserId) throws DBException;
        @NotNull Map<String, Object> userCredentials // Saved user credentials (e.g. associated 3rd party provider user name or realm)
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Validates that user may be associated with local user
 *

 *
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
    @NotNull
     */
        AUTH_SESSION session) throws DBException;
    ) throws DBException;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.security.SMController;
 * Unless required by applicable law or agreed to in writing, software
     *
        @NotNull SMSession mainSession,
    boolean supportsOpeningSessionAsChild();
     * @return new user ID. If activeUserId is not null then it must be the same.
        @NotNull DBRProgressMonitor monitor,
 */
        @NotNull SMController securityController,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Auth provider
public interface SMAuthProvider<AUTH_SESSION extends SMSession> {
 * See the License for the specific language governing permissions and

    AUTH_SESSION openSession(

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
import org.jkiss.code.Nullable;
    void closeSession(
        @NotNull Map<String, Object> userCredentials,
     * @param userCredentials credentials from authExternalUser
     * @param activeUserId
import org.jkiss.code.NotNull;
 * limitations under the License.
package org.jkiss.dbeaver.model.auth;
    void refreshSession(
/**
import org.jkiss.dbeaver.model.security.SMAuthProviderCustomConfiguration;
    /**

import org.jkiss.dbeaver.DBException;
        @NotNull DBRProgressMonitor monitor,
    String validateLocalAuth(
        AUTH_SESSION session) throws DBException;
 *

        @NotNull SMSession mainSession,
        @NotNull SMSession mainSession,
