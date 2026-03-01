                value.addPermission(grant);
        );
    private PostgrePrivilegeType[] supportedPrivilegeTypes;
    private PostgrePrivilegeType[] loadSupportedPrivilegeTypes() {
/*
    }
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @Override
import java.util.Arrays;
        @Override

            supportedPrivilegeTypes = loadSupportedPrivilegeTypes();

    }

    }

    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
 *
import org.jkiss.dbeaver.DBException;
            if (value != null) {
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
        public boolean select(Object element) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return supportedPrivilegeTypes;
        }
                    role.getRoleReference(),
            .filter(it -> it.isValid() && it.supportsType(getDatabaseObject().getClass()))
    }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
import java.util.List;

                );
            return privileges;
            getDatabaseObject().getPrivileges(monitor, false),
            privileges.removePermission(privilegeType);
    protected DatabaseNavigatorTreeFilter navigatorTreeFilter() {
}
        return objectToPrivileges.computeIfPresent(getObjectName(role), (object, privileges) -> {
    protected PermissionInfo laodPermissionInfo(DBRProgressMonitor monitor) throws DBException {
        }
        return objectToPrivileges.compute(getObjectName(role), (key, value) -> {
        return object instanceof PostgrePrivilegeOwner;
    }
        }
    }
 */
            return object instanceof DBNDatabaseItem item && item.getObject() instanceof PostgreRole;
            DBNUtils.getNodeByObject(monitor, getDatabaseObject().getDatabase(), true)
    }
        return Arrays.stream(getDatabaseObject().getDataSource().getSupportedPrivilegeTypes())
    protected PostgrePrivilege revokePrivilege(PostgrePrivilegeType privilegeType, PostgreRole role) {


        if (supportedPrivilegeTypes == null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class ObjectPermissionsEditor extends PostgresPermissionsEditor<PostgreRole> {
import org.jkiss.dbeaver.ext.postgresql.model.*;
                return childrenClass != null && PostgreRole.class.isAssignableFrom(childrenClass);
    @Override
        });
    @Override
import org.jkiss.dbeaver.model.navigator.DBNUtils;
    @Override
            return isLeafObject(element);
        // Privilege types are loaded once and cached since they are not expected to change
 * Unless required by applicable law or agreed to in writing, software
        return new ObjectOwnerFiler();
    @Override
 * You may obtain a copy of the License at
    protected boolean doesSupportObject(DBSObject object) {
                return value;
        public boolean isLeafObject(Object object) {
 * limitations under the License.
    protected PostgrePrivilegeType[] getSupportedPrivilegeTypes(DBSObject object) {
                    databaseObject,

 * See the License for the specific language governing permissions and
        PostgrePrivilegeGrant grant = createGrant(databaseObject, role, privilegeType);

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        });
                return new PostgreObjectPrivilege(

        return new PermissionInfo(

import org.jkiss.dbeaver.model.struct.DBSObject;
 *
            }
    private static class ObjectOwnerFiler extends DatabaseNavigatorTreeFilter {

                Class<? extends DBSObject> childrenClass = item.getChildrenClass();
    protected PostgrePrivilege grantPrivilege(PostgrePrivilegeType privilegeType, PostgreRole role) {
 *

            if (element instanceof DBNDatabaseFolder item) {
            .toArray(PostgrePrivilegeType[]::new);
                    List.of(grant)
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
package org.jkiss.dbeaver.ext.postgresql.ui.editors.privileges;

 * you may not use this file except in compliance with the License.
            } else {
        PostgrePrivilegeOwner databaseObject = getDatabaseObject();
