import java.util.List;
    private PostgrePrivilegeGrant.Kind underKind;

    @NotNull
    }

    }
    void setUnderKind(@NotNull String kind) {
        super(owner, grantee, privileges);
    public void setUnderKind(PostgrePrivilegeGrant.Kind underKind) {
public class PostgreDefaultPrivilege extends PostgreObjectPrivilege {
    public PostgreRoleReference getGrantor() {
        @Nullable PostgreRoleReference grantor,
 * See the License for the specific language governing permissions and
        @Nullable PostgreRoleReference grantee,

    public PostgrePrivilegeGrant.Kind getUnderKind() {
    @Property(viewable = true, order = 1)
    }
import org.jkiss.dbeaver.model.meta.Property;
 *     http://www.apache.org/licenses/LICENSE-2.0
            underKind = PostgrePrivilegeGrant.Kind.SEQUENCE;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            underKind = PostgrePrivilegeGrant.Kind.TYPE;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;

        return grantor;
 *
 * You may obtain a copy of the License at

 * DBeaver - Universal Database Manager
        return underKind;
            underKind = PostgrePrivilegeGrant.Kind.TABLE;
        @NotNull List<PostgrePrivilegeGrant> privileges
package org.jkiss.dbeaver.ext.postgresql.model;
 *
 * limitations under the License.
    }
import org.jkiss.code.NotNull;

/*
        }
        this.underKind = underKind;
            underKind = PostgrePrivilegeGrant.Kind.FUNCTION;

    public String getName() {

        } else if ("f".equals(kind)) { // Here "f" is not from RelKind

        this.grantor = grantor;
        } else if (PostgreClass.RelKind.S.getCode().equals(kind)) {
 * Unless required by applicable law or agreed to in writing, software
    public PostgreDefaultPrivilege(
 */
        @Nullable PostgrePrivilegeOwner owner,
    private final PostgreRoleReference grantor;
 *
}
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (PostgreClass.RelKind.r.getCode().equals(kind)) {
    ) {
    @Nullable
        return getOwner() == null ? "": getOwner().getName() + "." + underKind;
 * you may not use this file except in compliance with the License.
    @Nullable

        } else if ("T".equals(kind)) { // Here "T" is not from RelKind
