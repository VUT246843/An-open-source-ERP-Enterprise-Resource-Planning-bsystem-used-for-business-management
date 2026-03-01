            return value;
    private PostgrePrivilege revokeRolePrivilege(
            return PostgrePrivilegeGrant.Kind.SEQUENCE;


import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
            return object.getName();
        if (object instanceof PostgreProcedure procedure) {

    protected PostgrePrivilege revokePrivilege(
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

import org.jkiss.dbeaver.DBException;

            .toArray(PostgrePrivilegeType[]::new);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
import org.jkiss.dbeaver.model.struct.DBSEntity;
            return PostgrePrivilegeGrant.Kind.SEQUENCE;
    }
        String objectName = defineObjectName(owner);
        } else if (DBSProcedure.class.isAssignableFrom(object)) {
import java.util.Arrays;
                    schemaName,
    private PostgrePrivilege grantRolePrivilege(
    }
        return new DatabaseObjectFilter();
                        dbObject instanceof DBSPackage ||
    }
        }
    private PostgrePrivilegeGrant.Kind defineKind(Class<? extends DBSObject> object) {
                return PostgrePrivilegeGrant.Kind.PROCEDURE;
            throw new IllegalArgumentException("Unexpected object: " + owner);
    private String defineObjectName(DBSObject object) {
    ) {
            return object.getClass();
        }
            return PostgrePrivilegeGrant.Kind.SCHEMA;
    ) {
            );
        if (DBSSequence.class.isAssignableFrom(object)) {
import java.util.Collections;
        return new PermissionInfo(
            }
        } else if (owner instanceof PostgreTableBase) {
            return defaultPrivilege;

 *
                null,

    }
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (value == null) {
            return defaultPrivilege(privilegeType, folder);
        DBNDatabaseNode node = DBNUtils.getNodeByObject(monitor, getDatabaseObject().getDatabase(), true);
        PostgrePrivilegeType privilegeType,
        return objectToPrivileges.computeIfPresent(getObjectName(folder), (key, value) -> {
            DBNUtils.getChildFolder(monitor, node, PostgreSchema.class)
    }
    private static class DatabaseObjectFilter extends DatabaseNavigatorTreeFilter {
        return Arrays.stream(getDatabaseObject().getDataSource().getSupportedPrivilegeTypes())
import org.jkiss.dbeaver.model.navigator.DBNUtils;
            }

            return procedure.getUniqueName();
        DBNDatabaseFolder folder
    ) {
                List.of(createGrant(owner, role, privilegeType))
            return PostgrePrivilegeGrant.Kind.TABLE;
    private Class<?> defineObjectType(DBSObject object) {
        PostgrePrivilegeType privilegeType,
        PostgrePrivilegeType privilegeType,
        } else {
        PostgrePrivilegeType privilegeType,
            return PostgrePrivilegeGrant.Kind.TABLE;
        Class<?> objectType = defineObjectType(object);
                    dbObject instanceof DBSEntity ||
 *     http://www.apache.org/licenses/LICENSE-2.0

        );
    }
    }
                    List.of(createGrant(owner, role, privilegeType))
            return revokeDefaultPrivilege(privilegeType, folder);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
    }
                return PostgrePrivilegeGrant.Kind.FUNCTION;
            return value;
                    kind,
            } else {
        DBSObject object
                return new PostgreRolePrivilege(
import java.util.List;
import org.jkiss.dbeaver.model.access.DBAUser;
        PostgrePrivilegeType privilegeType,
        PostgrePrivilegeOwner owner
                        dbObject instanceof DBSTableIndex ||
            .filter(it -> it.isValid() && it.supportsType(objectType))
    }
            }
                owner,
/*
        }
 * you may not use this file except in compliance with the License.
        if (object instanceof DBNDatabaseFolder folder) {
        } else {
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.*;
    }
                role.getRoleReference(),
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            && getDatabaseObject().getDataSource().getServerType().supportsDefaultPrivileges()
    private PostgrePrivilege revokeDefaultPrivilege(
        if (!(parentObject instanceof PostgreSchema)) {
        public boolean isLeafObject(Object object) {
    ) {
        DBSObject parentObject = ((DBNDatabaseItem) folder.getParentNode()).getObject();
        PostgrePrivilegeType privilegeType,
            && getDatabaseObject() != null
    @Override

        return objectToPrivileges.compute(getObjectName(owner), (key, value) -> {
        PostgreRole role = (PostgreRole) getDatabaseObject();
            return grantRolePrivilege(privilegeType, (PostgrePrivilegeOwner) object);
        if (owner instanceof PostgreProcedure procedure) {
        });
            value.removePermission(privilegeType);
            return PostgrePrivilegeGrant.Kind.FUNCTION;
                return value;
        } else {
            value.removePermission(privilegeType);
package org.jkiss.dbeaver.ext.postgresql.ui.editors.privileges;
    private PostgrePrivilege defaultPrivilege(
 * You may obtain a copy of the License at
        });
        });

                DBSObject dbObject = ((DBNDatabaseItem) object).getObject();
        } else if (owner instanceof PostgreSchema) {
            if (procedure.getKind() == PostgreProcedureKind.p) {
    }
        });
        DBSObject object
            throw new IllegalArgumentException("Unsupported parent object: " + parentObject);
            defaultPrivilege.setUnderKind(defineKind(folder.getChildrenClass()));
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;


            PostgreDefaultPrivilege defaultPrivilege = new PostgreDefaultPrivilege(
        return objectToPrivileges.computeIfAbsent(getObjectName(folder), key -> {
        String schemaName = owner.getSchema().getName();

        PostgrePrivilegeOwner owner
            getDatabaseObject().getPrivileges(monitor, false),
            PostgreRole role = (PostgreRole) getDatabaseObject();

    private PostgrePrivilegeGrant.Kind defineKind(PostgrePrivilegeOwner owner) {
import org.jkiss.dbeaver.model.struct.rdb.DBSPackage;
    ) {
        @Override
        if (object instanceof DBNDatabaseFolder folder
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
                        dbObject instanceof DBAUser;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        dbObject instanceof DBSProcedure ||
    protected PostgrePrivilegeType[] getSupportedPrivilegeTypes(DBSObject object) {
public class RolePermissionsEditor extends PostgresPermissionsEditor<DBSObject> {
        ) {
    ) {
        } else if (owner instanceof PostgreSequence) {
            if (object instanceof DBNDatabaseItem) {
 */
                );

            return false;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
        return objectToPrivileges.computeIfPresent(getObjectName(owner), (key, value) -> {
        DBNDatabaseFolder folder
 * Unless required by applicable law or agreed to in writing, software
        }
}
    }
    @Override
    }
                    objectName,
            PostgreSchema owner = (PostgreSchema) parentObject;
    @Override
        } else {
import org.jkiss.dbeaver.model.struct.DBSObject;

        }

    @Override
                    role,
    protected PostgrePrivilege grantPrivilege(
    protected boolean doesSupportObject(DBSObject object) {
                        dbObject instanceof DBSSequence ||
            return revokeRolePrivilege(privilegeType, (PostgrePrivilegeOwner) object);
            return folder.getChildrenClass();
 * DBeaver - Universal Database Manager
        return object instanceof PostgrePrivilegeOwner || !PostgreSchema.class.isAssignableFrom(defineObjectType(object));
        if (object instanceof DBNDatabaseFolder folder) {
    protected DatabaseNavigatorTreeFilter navigatorTreeFilter() {
            } else {


        } else {
 * limitations under the License.
                return
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
        } else {
                value.addPermission(createGrant(owner, role, privilegeType));
        PostgrePrivilegeGrant.Kind kind = defineKind(owner);
        }
        }
    protected PermissionInfo laodPermissionInfo(DBRProgressMonitor monitor) throws DBException {
 *
        }
