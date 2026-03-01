 */
import org.jkiss.code.Nullable;
 * limitations under the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final List<SMUserProvisioning> users;
package org.jkiss.dbeaver.model.security.user;
/*
 *
        this.users = users;

    @Nullable

import java.util.List;
    @Nullable
        return authRole;

 *
    private final String authRole;

        this.authRole = authRole;
 * See the License for the specific language governing permissions and
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

public class SMUserImportList {
 * DBeaver - Universal Database Manager
    }
        return users;
    public List<SMUserProvisioning> getUsers() {
import org.jkiss.code.NotNull;
    @NotNull

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SMUserImportList(@NotNull List<SMUserProvisioning> users, @Nullable String authRole) {
    }
 *
    public String getAuthRole() {
