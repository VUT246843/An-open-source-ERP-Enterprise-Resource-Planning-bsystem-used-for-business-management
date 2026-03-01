    public String toString() {
    public PostgreObjectPrivilege(PostgrePrivilegeOwner owner, PostgreRoleReference grantee, List<PostgrePrivilegeGrant> privileges) {
 */
    private static final Log log = Log.getLog(PostgreObjectPrivilege.class);
        return grantee == null ? "" : grantee.getDisplayString();

 *
            return 0;

        return owner.getDatabase().getRoleByReference(monitor, this.grantee);
    public String getName() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collections;
        return getName();
    @Property(viewable = true, order = 1)
        }

        this.grantee = grantee;
    public PostgreRole getTargetObject(DBRProgressMonitor monitor) throws DBException {
 * You may obtain a copy of the License at
    public int compareTo(@NotNull PostgrePrivilege o) {
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
    }
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.postgresql.model;
import org.jkiss.dbeaver.model.DBUtils;
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.meta.Property;
    }
            return this.grantee.compareTo(other.grantee);


/*
/**
 * See the License for the specific language governing permissions and
    }
 * DBeaver - Universal Database Manager
public class PostgreObjectPrivilege extends PostgrePrivilege {

 */
import org.jkiss.utils.CommonUtils;
        if (o instanceof PostgreObjectPrivilege other) {

 * PostgreObjectPrivilege
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import org.jkiss.dbeaver.DBException;
    private final PostgreRoleReference grantee;
 *
        return grantee;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
}

        super(owner, privileges);
import org.jkiss.code.NotNull;

    @Override

 * limitations under the License.
    public PostgreRoleReference getGrantee() {
    }


        } else {
    @Override
    @NotNull
