    private boolean withGrantOption;
        };
 *
        this.withGrantOption = withGrantOption;
                    prevGrant.withGrantOption = true;
            if (prevGrant.schema == schema && prevGrant.table == table) {
                    if (prevGrant.grant == grant) {
    private boolean grant;

                        return null;
    }
                grant ? grantScript : revokeScript)
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
                    }
            MySQLCommandGrantPrivilege prevGrant = (MySQLCommandGrantPrivilege) prevCommand;
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
        this.schema = schema;
    private MySQLPrivilege privilege;

        this.privilege = privilege;
        return super.merge(prevCommand, userParams);
 * Unless required by applicable law or agreed to in writing, software
            (schema == null ? "*" : DBUtils.getQuotedIdentifier(schema)) + "." + //$NON-NLS-1$ //$NON-NLS-2$
    public void updateModel()
        getObject().clearGrantsCache();
    private MySQLTableBase table;
        this.table = table;
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
        this.grant = grant;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        super(user, grant ? MySQLUIMessages.edit_command_grant_privilege_action_grant_privilege : MySQLUIMessages.edit_command_grant_privilege_name_revoke_privilege);
import java.util.Locale;
    }
        }
    private String getObjectName()
            }
    {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    {
 */
    public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams)
/**
                } else if (MySQLConstants.PRIVILEGE_GRANT_OPTION_NAME.equals(privilege.getName()) && withGrantOption) {

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        String privName = privilege.getFixedPrivilegeName().toUpperCase(Locale.ROOT);
import org.jkiss.dbeaver.ext.mysql.model.MySQLUser;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
                    } else {
    }
import org.jkiss.dbeaver.model.edit.DBECommand;
            " ON " + getObjectName() + //$NON-NLS-1$
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
 * Grant/Revoke privilege command
import org.jkiss.code.NotNull;
    @Override
    {
    {
        return

            (table == null ? "*" : DBUtils.getQuotedIdentifier(table)); //$NON-NLS-1$
                    // Just one such addition option is enough to expand this option on the entire table
        if (prevCommand instanceof MySQLCommandGrantPrivilege) {

 *
 * you may not use this file except in compliance with the License.
                MySQLUIMessages.edit_command_grant_privilege_action_grant_privilege,
    @NotNull
 */
public class MySQLCommandGrantPrivilege extends DBECommandAbstract<MySQLUser> {
    {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.mysql.model.MySQLPrivilege;
        String revokeScript = "REVOKE " + privName + //$NON-NLS-1$
import java.util.Map;
                    // To add WITH GRANT OPTION part to the GRANT statement
                    return prevCommand;
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options)
                        return prevCommand;
    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
}
import org.jkiss.dbeaver.model.DBUtils;
    public MySQLCommandGrantPrivilege(MySQLUser user, boolean grant, boolean withGrantOption, MySQLCatalog schema, MySQLTableBase table, MySQLPrivilege privilege)


 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
/*
        String grantScript = "GRANT " + privName + //$NON-NLS-1$

    private MySQLCatalog schema;
        return new DBEPersistAction[] {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                if (prevGrant.privilege == privilege) {
            " ON " + getObjectName() + //$NON-NLS-1$
package org.jkiss.dbeaver.ext.mysql.ui.config;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            " TO " + getObject().getFullName() + (withGrantOption ? " WITH GRANT OPTION" : ""); //$NON-NLS-1$ //$NON-NLS-2$
    @Override
    @Override
                }
    @NotNull
            " FROM " + getObject().getFullName() + ""; //$NON-NLS-1$ //$NON-NLS-2$
            new SQLDatabasePersistAction(
