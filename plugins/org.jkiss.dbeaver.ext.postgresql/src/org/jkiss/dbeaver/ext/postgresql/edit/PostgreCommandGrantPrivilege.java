
                objectName = ((PostgreRolePrivilege) privilege).getFullObjectName();
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } else {
            grantedTypedObject = ((PostgreTableColumn) object).getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        if (privilegeOwner instanceof DBNDatabaseFolder) {
            } else if (underKind == PostgrePrivilegeGrant.Kind.FUNCTION) {
            roleName = DBUtils.getQuotedIdentifier(object);
        } else {
        // the first one which grants and one which revokes and merge privileges
 */
    private final boolean grant;
            for (PostgrePrivilegeType type : getObject().getDataSource().getSupportedPrivilegeTypes()) {
            // Expand PostgrePrivilegeType.ALL to simplify command merging later
        }
    private final DBSObject privilegeOwner;
    @Override
            if (dp.getGrantor() != null) {
        if (privilegeTypes != null) {

        Class<? extends DBSObject> ownerClass = null;
            granted.addAll(modified);
            }
            return new DBEPersistAction[0];
        this.privilege = privilege;
        ddl.append(grant ? "GRANT " : "REVOKE ").append(privName).append(grantedCols).append(" ON ").append(grantedTypedObject);
                new ArrayList<>(privilegeTypes),
 * Grant/Revoke privilege command
        }
    @NotNull
        if (privilegeTypes.isEmpty()) {

 *
    private String makeUniqueName(@NotNull String name) {
                }

            }
                grant
import org.jkiss.dbeaver.ext.postgresql.model.*;
        ddl.append(grant ? " TO" : " FROM");
        return new DBEPersistAction[] {
        return true;

                objectName = ((PostgreProcedure) privilegeOwner).getFullQualifiedSignature();
            if (permission.getGrantee() != null) {
                ddl.append(" FOR ROLE ").append(DBUtils.getQuotedIdentifier(dp.getDataSource(), dp.getGrantor().getRoleName()));
            revoked.addAll(modified);
            grantedCols = "(" + DBUtils.getQuotedIdentifier(object) + ")";
        final String revokeCommandId = makeUniqueName("revoke");
        }
        // In order to properly merge grant/revoke commands, we need to capture
            } else {
        PostgrePrivilegeOwner object = getObject();
        }
        };
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

        final String mergedCommandId = makeUniqueName("merged") + "#" + hashCode();
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
import java.util.*;
import org.jkiss.dbeaver.model.DBPObject;
                return false;
    }
        }
            revoked.removeAll(modified);
            ownerClass = privilegeOwner.getClass();
            granted.removeAll(modified);
    public PostgreCommandGrantPrivilege(@NotNull PostgrePrivilegeOwner user, boolean grant, @NotNull DBSObject privilegeOwner, @NotNull PostgrePrivilege privilege, @Nullable PostgrePrivilegeType[] privilegeTypes) {
 *

import org.jkiss.code.NotNull;
            ddl.append(" ").append(roleType.toUpperCase());
                revokeCommand != null ? revokeCommand.privilegeTypes : Collections.emptySet(),

                grantedTypedObject = "SEQUENCES";
        this.grant = grant;
                grantedTypedObject = "TABLES";
        String objectName = "", roleName;
            objectName = PostgreUtils.getObjectUniqueName(object, options);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @NotNull
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

                grantedTypedObject = "TYPES";
            ddl.append(" WITH GRANT OPTION");
        String roleType = null;
        boolean withGrantOption = false;
 * You may obtain a copy of the License at
                withGrantOption |= CommonUtils.isBitSet(privilege.getPermission(pn), PostgrePrivilege.WITH_GRANT_OPTION);
                grantCommand != null ? grantCommand.privilegeTypes : Collections.emptySet(),
        ddl.append(" ").append(roleName);
                    ((PostgreRolePrivilege) privilege).setKind(PostgrePrivilegeGrant.Kind.PROCEDURE);
        if (privilege instanceof PostgreRolePrivilege) {
            }

    private void mergePrivilegeTypes(@NotNull Set<PostgrePrivilegeType> granted, @NotNull Set<PostgrePrivilegeType> revoked, @NotNull Collection<PostgrePrivilegeType> modified, boolean grant) {
        String grantedCols = "", grantedTypedObject;
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) {
        } else {
 * See the License for the specific language governing permissions and
                grantedTypedObject = "FUNCTIONS";
import org.jkiss.dbeaver.model.DBUtils;
        if (roleType != null) {
            roleType = role.getSpecificRoleType();
        super(user, grant ? "Grant" : "Revoke");

package org.jkiss.dbeaver.ext.postgresql.edit;
        }
    }

            PostgreObjectPrivilege permission = (PostgreObjectPrivilege) this.privilege;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (privilege instanceof PostgreDefaultPrivilege dp) {
            if (type.supportsType(ownerClass) && !privilegeTypes.contains(type)) {
        }
            grantedTypedObject = objectType + " " + objectName;
            );
            ddl.append(" IN SCHEMA ").append(DBUtils.getQuotedIdentifier(privilege.getOwner())).append(" ");

        if (ownerClass == null) {
        }
import org.jkiss.dbeaver.model.edit.DBECommand;
        }

            }
            objectType = ((PostgreRolePrivilege) privilege).getKind().name();
            objectType = PostgreUtils.getObjectTypeName(object);
            ownerClass = ((DBNDatabaseFolder) privilegeOwner).getChildrenClass();
/**
        StringBuilder ddl = new StringBuilder();
 */
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            for (PostgrePrivilegeType pn : privilegeTypes) {
        }
            PostgrePrivilegeGrant.Kind underKind = ((PostgreDefaultPrivilege) privilege).getUnderKind();
    @NotNull
        } else {
        if (grant) {
        return name + "#" + privilege.hashCode() + "#" + privilegeOwner.hashCode();
 *

        this.privilegeTypes = new HashSet<>();
        } else {
                roleType = permission.getGrantee().getRoleType();
            mergePrivilegeTypes(
            new SQLDatabasePersistAction(

    private final PostgrePrivilege privilege;
 * Unless required by applicable law or agreed to in writing, software
        for (PostgrePrivilegeType type : getObject().getDataSource().getSupportedPrivilegeTypes()) {
                    this.privilegeTypes.add(type);
        if (object instanceof PostgreRole role) {
        }
    }
        final String grantCommandId = makeUniqueName("grant");
 * limitations under the License.
        if (!userParams.containsKey(mergedCommandId)) {
        if (object instanceof PostgreTableColumn) {
                roleName = DBUtils.getQuotedIdentifier(object.getDataSource(), permission.getGrantee().getRoleName());
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        String objectType;

                ddl.toString()
        return grant ? grantCommand : revokeCommand;
    private final Set<PostgrePrivilegeType> privilegeTypes;
        userParams.putIfAbsent(grant ? grantCommandId : revokeCommandId, this);
            if (underKind == PostgrePrivilegeGrant.Kind.TYPE) {
        final PostgreCommandGrantPrivilege grantCommand = (PostgreCommandGrantPrivilege) userParams.get(grantCommandId);
/*


            modified.removeIf(granted::remove);
        this.privilegeOwner = privilegeOwner;
        final StringJoiner privName = new StringJoiner(", ");
                }
            }

        }
import org.jkiss.code.Nullable;
public class PostgreCommandGrantPrivilege extends DBECommandAbstract<PostgrePrivilegeOwner> {
            userParams.put(mergedCommandId, true);
            privName.add(PostgrePrivilegeType.ALL.name());
            modified.removeIf(revoked::remove);
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (grant && withGrantOption) {
        // from other commands into them. Other commands are consumed later in process.
            } else {
            if (privilegeOwner instanceof PostgreProcedure) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean hasAllPrivilegeTypes() {
            ddl.append("ALTER DEFAULT PRIVILEGES");
            )
        } else if (privilege instanceof PostgreDefaultPrivilege) {
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
            }
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        if (hasAllPrivilegeTypes()) {
                if (type.supportsType(privilegeOwner.getClass())) {
            } else if (underKind == PostgrePrivilegeGrant.Kind.SEQUENCE) {
                roleName = "";
        final PostgreCommandGrantPrivilege revokeCommand = (PostgreCommandGrantPrivilege) userParams.get(revokeCommandId);
            }
                privName.add(pn.name());
import org.jkiss.utils.CommonUtils;
        }
    public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams) {
    }
            } else if (privilege instanceof PostgreRolePrivilege) {

}
            this.privilegeTypes.addAll(Arrays.asList(privilegeTypes));
                grant ? "Grant" : "Revoke",
            if (privilegeOwner instanceof PostgreProcedure) {
        } else {
import org.jkiss.dbeaver.model.struct.DBSObject;
                if (((PostgreProcedure) privilegeOwner).getKind() == PostgreProcedureKind.p) {
