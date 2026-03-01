        @NotNull Map<SMAuthConfigurationReference, Object> authInfo,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

        @Nullable String error,
    SMAuthInfo finishAuthentication(@NotNull String authId) throws DBException;
        @Nullable String errorCode
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.auth;
import org.jkiss.code.NotNull;
 *
 * you may not use this file except in compliance with the License.
    void updateAuthStatus(
    ) throws DBException;
/*
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull SMAuthStatus authStatus,
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface SMAuthenticationManager {
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
import org.jkiss.dbeaver.DBException;

import org.jkiss.code.Nullable;
}
 *
        @NotNull String authId,

