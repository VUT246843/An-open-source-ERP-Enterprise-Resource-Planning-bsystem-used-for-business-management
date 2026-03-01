 * you may not use this file except in compliance with the License.
    RESOURCE_EDIT(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT, Set.of(RESOURCE_VIEW)),
    public String getPermissionId() {
        this.childPermissions = childPermissions;
 *

        return permission;
    RMProjectPermission(String permission, Set<RMProjectPermission> childPermissions) {
        this(permission, Set.of());
public enum RMProjectPermission {
    private final String permission;

 *     http://www.apache.org/licenses/LICENSE-2.0
        var allPermissions = new HashSet<String>();
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager

    }

/*
import org.jkiss.code.Nullable;
    public static RMProjectPermission fromPermission(String permission) {

    RESOURCE_VIEW(RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW),
    TASK_MANAGER(RMConstants.PERMISSION_TASK_MANAGER),
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.rm;
 */
            allPermissions.addAll(childPermission.getAllPermissions());
 *
    }
    @Nullable
        return null;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.HashSet;
 * You may obtain a copy of the License at
        }
    private final Set<RMProjectPermission> childPermissions;

 *

 * See the License for the specific language governing permissions and
            if (projectPermission.permission.equals(permission)) {
        return allPermissions;
            }
        allPermissions.add(permission);

    RMProjectPermission(String permission) {
 * limitations under the License.
    PROJECT_ADMIN(RMConstants.PERMISSION_PROJECT_ADMIN, Set.of(RESOURCE_EDIT, DATA_SOURCES_EDIT, TASK_MANAGER));
    }
        for (RMProjectPermission childPermission : childPermissions) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

                return projectPermission;

        for (RMProjectPermission projectPermission : RMProjectPermission.values()) {
import java.util.Set;
    DATA_SOURCES_EDIT(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT, Set.of(DATA_SOURCES_VIEW)),
    public Set<String> getAllPermissions() {

        this.permission = permission;
    DATA_SOURCES_VIEW(RMConstants.PERMISSION_PROJECT_DATASOURCES_VIEW),
