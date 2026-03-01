import org.jkiss.dbeaver.model.access.DBAPrivilegeOwner;
 *
 * See the License for the specific language governing permissions and
        boolean grant,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public interface ObjectACLManager<PRIVILEGE extends DBAPrivilege, PRIVILEGE_TYPE extends DBAPrivilegeType> {
 * limitations under the License.
/**
/*
 *
    PRIVILEGE createNewPrivilege(DBAPrivilegeOwner owner, DBSObject object, PRIVILEGE copyFrom);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager
    String getObjectUniqueName(DBSObject object);
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.access.DBAPrivilege;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.
        PRIVILEGE privilege,
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import java.util.Map;
} */
package org.jkiss.dbeaver.ui.editors.acl;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
        PRIVILEGE_TYPE[] privilegeTypes,
 * PostgresRolePrivilegesEditor
        DBAPrivilegeOwner object,
        Map<String, Object> options);
        DBRProgressMonitor monitor,
 * You may obtain a copy of the License at
    PRIVILEGE_TYPE[] getPrivilegeTypes();
import org.jkiss.dbeaver.model.access.DBAPrivilegeType;

    String generatePermissionChangeScript(

