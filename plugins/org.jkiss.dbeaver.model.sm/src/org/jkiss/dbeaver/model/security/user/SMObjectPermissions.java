

    public String[] getPermissions() {
    public SMObjectPermissions(@NotNull String objectId, @NotNull Collection<String> permissions) {
    @NotNull
import org.jkiss.code.NotNull;
        this.objectId = objectId;
    private final String[] permissions;
    private final String objectId;

 * You may obtain a copy of the License at
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
        this.permissions = permissions.toArray(new String[0]);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager

 *
    public SMObjectPermissions(@NotNull String objectId, @NotNull String[] permissions) {
        this.permissions = permissions;
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 *
 * limitations under the License.
        return objectId;
        return permissions;
import java.util.Collection;
    }
    }
}

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public class SMObjectPermissions {
        this.objectId = objectId;
package org.jkiss.dbeaver.model.security.user;
    }
 * you may not use this file except in compliance with the License.
    public String getObjectId() {
 * See the License for the specific language governing permissions and

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
