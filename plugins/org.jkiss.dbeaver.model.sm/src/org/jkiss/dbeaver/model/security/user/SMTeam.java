 * limitations under the License.
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

    @NotNull
        this.teamName = teamName;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.description = description;
    public void setPermissions(@NotNull Set<String> permissions) {
    public void setDescription(@Nullable String description) {
    public String getTeamId() {
        return CommonUtils.isEmpty(teamName) ? subjectId : teamName;
        return subjectId;

    public String getDescription() {
    @Override
        this.permissions = permissions;
/*

 * you may not use this file except in compliance with the License.
 */
 *
import org.jkiss.code.Nullable;
    private String description;


    private Set<String> permissions = new LinkedHashSet<>();
    }

        return CommonUtils.isEmpty(teamName) ? subjectId : teamName;
    public void setTeamName(@Nullable String teamName) {
        this.description = description;
 * You may obtain a copy of the License at
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;
    }
        this(teamId, null, null, true);
 * Copyright (C) 2010-2024 DBeaver Corp and others


    }
}
 *
import org.jkiss.utils.CommonUtils;
        this.teamName = name;
    }
    public String toString() {

    }
    public void addPermission(String permission) {
 * DBeaver - Universal Database Manager
import java.util.LinkedHashSet;

        return getTeamId();
package org.jkiss.dbeaver.model.security.user;
    }
    public Set<String> getPermissions() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SMTeam extends SMSubject {

    @Nullable
 *


        return permissions;
    public SMTeam(@NotNull String teamId) {


    }

    }
    @Property(viewable = true, order = 2)
        this.permissions.add(permission);
    @Property(viewable = true, order = 3)
    @NotNull
    public SMTeam(@NotNull String teamId, @Nullable String name, @Nullable String description, boolean secretStorage) {
import org.jkiss.code.NotNull;

    @Nullable
    }
    @Nullable
import java.util.Set;
        super(teamId, null, secretStorage);
 * distributed under the License is distributed on an "AS IS" BASIS,
        return description;
    }
    }
 * See the License for the specific language governing permissions and
    @NotNull
    public String getTeamName() {

    }
    @Property(viewable = true, order = 1)
    private String teamName;
    public String getName() {
