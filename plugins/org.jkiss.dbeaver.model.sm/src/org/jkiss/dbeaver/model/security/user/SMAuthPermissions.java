    }

        return Objects.equals(userId, that.userId)
    public int hashCode() {
 * You may obtain a copy of the License at
/*
public class SMAuthPermissions {
    private final Set<String> permissions;
    public SMAuthPermissions(
    @Nullable
    private final String sessionId;

        return sessionId;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    }
    @NotNull
 * DBeaver - Universal Database Manager
    ) {
 *
    public boolean equals(Object o) {
}
import org.jkiss.code.NotNull;
    @NotNull
    }
    @NotNull
import java.util.Objects;
package org.jkiss.dbeaver.model.security.user;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return Objects.hash(userId, permissions);
        if (this == o) return true;

    @NotNull
 */
    @Nullable

    private final String userId;
        this.sessionId = sessionId;
 * See the License for the specific language governing permissions and

    public String getSessionId() {
        if (o == null || getClass() != o.getClass()) return false;
        this.userId = userId;
            && Objects.equals(permissions, that.permissions);
    }

import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Set;
        return userId;
        this.permissions = permissions;

    public Set<String> getPermissions() {
    @Override

        @Nullable String userId,
        SMAuthPermissions that = (SMAuthPermissions) o;

 * limitations under the License.
        @NotNull String sessionId,
    public String getUserId() {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        @NotNull Set<String> permissions
    }
        return permissions;

 * Copyright (C) 2010-2025 DBeaver Corp and others

