import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager


    default void refreshSMSession() throws DBException {
     */
}
     * @return null if the user is not authorized
 */
 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    default boolean hasPermission(String permission) {
     */
 * Security manager credentials provider.
package org.jkiss.dbeaver.model.auth;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
     *  Refresh current sm session
public interface SMCredentialsProvider {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
    @Nullable
import org.jkiss.code.Nullable;
        var activeUserCredentials = getActiveUserCredentials();
    }
    SMCredentials getActiveUserCredentials();
 * You may obtain a copy of the License at
    }
 *
    /**
 * Unless required by applicable law or agreed to in writing, software
/**
        return activeUserCredentials != null && activeUserCredentials.hasPermission(permission);
/*
 * limitations under the License.
