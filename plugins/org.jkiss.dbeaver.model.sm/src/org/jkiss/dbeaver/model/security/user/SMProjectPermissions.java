
    private final List<SMProjectPermission> permissions;
        this.projectId = projectId;
package org.jkiss.dbeaver.model.security.user;
}
    public List<SMProjectPermission> getPermissions() {
    private final String projectId;

 * you may not use this file except in compliance with the License.
    public String getProjectId() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return projectId;


        this.permissions = permissions;
    }
import java.util.List;
 * DBeaver - Universal Database Manager
    @Nullable
    public SMProjectPermissions(@Nullable String projectId, List<SMProjectPermission> permissions) {
 * limitations under the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 */
/*
 *
import org.jkiss.code.Nullable;
public class SMProjectPermissions {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at

        return permissions;
