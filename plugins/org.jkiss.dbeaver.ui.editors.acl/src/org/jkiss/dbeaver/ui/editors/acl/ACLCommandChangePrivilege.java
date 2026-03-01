    private DBAPrivilegeType[] privilegeTypes;
import org.jkiss.dbeaver.model.access.DBAPrivilegeOwner;
/*
            ACLCommandChangePrivilege prevGrant = (ACLCommandChangePrivilege) prevCommand;
 *
 */

import org.jkiss.dbeaver.model.access.DBAPrivilege;

 * limitations under the License.
    private boolean grant;
            }
 *
                }
    @Override
    private DBAPrivilege privilege;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.privilegeTypes = privilegeTypes;


/**

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
package org.jkiss.dbeaver.ui.editors.acl;
}
        this.privilege = privilege;
public class ACLCommandChangePrivilege extends DBECommandAbstract<DBAPrivilegeOwner> {
    @NotNull
    public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams)

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
        String grantScript = aclManager.generatePermissionChangeScript(monitor, object, grant, privilege, privilegeTypes, options);
 * Unless required by applicable law or agreed to in writing, software
 * Grant/Revoke privilege command
    {
                    return null;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
                } else {
                ACLMessages.edit_command_grant_privilege_action_grant_privilege,
        DBAPrivilegeOwner object = getObject();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public void updateModel()
    {
        super(user, grant ? ACLMessages.edit_command_grant_privilege_action_grant_privilege : ACLMessages.edit_command_grant_privilege_action_revoke_privilege);
    private ObjectACLManager aclManager;
 * DBeaver - Universal Database Manager
        }
        if (prevCommand instanceof ACLCommandChangePrivilege) {
    public ACLCommandChangePrivilege(ObjectACLManager aclManager, DBAPrivilegeOwner user, boolean grant, DBAPrivilege privilege, DBAPrivilegeType[] privilegeTypes)
    {
    }
        this.grant = grant;
 * You may obtain a copy of the License at
        };
 */
import java.util.Map;

    {
                grantScript)
 * you may not use this file except in compliance with the License.
            if (prevGrant.privilege == privilege && prevGrant.privilegeTypes == privilegeTypes) {
import org.jkiss.dbeaver.model.access.DBAPrivilegeType;
 *
    @Override
                    return prevCommand;
 * Licensed under the Apache License, Version 2.0 (the "License");

        return super.merge(prevCommand, userParams);
        return new DBEPersistAction[] {
            new SQLDatabasePersistAction(
                if (prevGrant.grant == grant) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

    @NotNull
    }
import org.jkiss.code.NotNull;
        //getObject().clearGrantsCache();
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.ui.editors.acl.internal.ACLMessages;
        this.aclManager = aclManager;
import org.jkiss.dbeaver.model.edit.DBECommand;
