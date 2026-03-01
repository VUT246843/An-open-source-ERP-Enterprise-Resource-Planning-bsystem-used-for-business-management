import org.jkiss.code.NotNull;

 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
    @Override
        int rc = this.database.equals(other.database) ? 0 : this.database.getName().compareTo(other.database.getName());
        if (rc == 0) {
        this.database = database;
        if (rc == 0) {
 * limitations under the License.
 * DBeaver - Universal Database Manager
    @NotNull
            rc = Objects.compare(this.roleType, other.roleType, String::compareToIgnoreCase);
    }
 * You may obtain a copy of the License at
        return (CommonUtils.isEmpty(this.roleType) ? "" : this.roleType) +  DBUtils.getQuotedIdentifier(this.database.getDataSource(), this.roleName);
    @NotNull
        } else {
 */
import java.util.Objects;
        return Objects.hash(this.database, this.roleName, this.roleType);
    public boolean equals(Object o) {
    @NotNull
    public String getDisplayString() {
/*
    private final String roleType;

    }
    public int hashCode() {
        return this.roleType;
            rc = this.roleName.compareTo(other.roleName);
    }
        if (this == o) {

    @Override
    }
            (CommonUtils.isEmpty(this.roleType) ? "" : (this.roleType + " ")) +

import org.jkiss.code.Nullable;
 *
    public String toString() {
        return this.roleName;
        }
            DBUtils.getFullQualifiedName(this.database.getDataSource(), this.database) + ": " +
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    public String getRoleName() {


    public int compareTo(PostgreRoleReference other) {
        return "PostgreRoleReference[" +
            "]";
package org.jkiss.dbeaver.ext.postgresql.model;


 * you may not use this file except in compliance with the License.

            return this.compareTo(other) == 0;
public class PostgreRoleReference implements Comparable<PostgreRoleReference> {
import org.jkiss.dbeaver.model.DBUtils;
    public String getRoleType() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (o instanceof PostgreRoleReference other) {
        }
            return true;
    public PostgreDatabase getDatabase() {
    @Override
    public PostgreRoleReference(@NotNull PostgreDatabase database, @NotNull String roleName, @Nullable String roleType) {
    }
        this.roleType = roleType;
 *
    private final String roleName;
    }
    @Override
            this.roleName +
        return rc;
    private final PostgreDatabase database;
    }
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.roleName = roleName;
            return false;
        }
    @Nullable


    @NotNull
        return this.database;
    }

    @Nullable
 * Copyright (C) 2010-2024 DBeaver Corp and others
