    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
    }
            actionList.add(new SQLDatabasePersistAction("alter user", script));
                    }
 * See the License for the specific language governing permissions and
        ExasolDataSource ds = (ExasolDataSource) object.getDataSource();


        }
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        	if (ExasolConstants.PRIORITY_GROUP_CLASS.equals(priority.getClass().getName())) {

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                                       ExasolUser object, Map<String, Object> options, String newName) throws DBException {

        }
            actionList.add(Comment(obj));
                        return dialog.getPassword();
    public void renameObject(@NotNull DBECommandContext commandContext,
            /*ExasolDataSource ds = (ExasolDataSource) obj.getDataSource();
        ExasolUser obj = command.getObject();
 */
        actions.add(new SQLDatabasePersistAction("Create User", script.toString()));
            StringBuilder script = new StringBuilder("ALTER USER " + DBUtils.getQuotedIdentifier(obj) + " IDENTIFIED ");
import java.util.Map;
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
        	if (ExasolConstants.CONSUMER_GROUP_CLASS.equals(priority.getClass().getName())) {
            actionList.add(new SQLDatabasePersistAction("alter user", script));
 * distributed under the License is distributed on an "AS IS" BASIS,

                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
        switch (obj.getType()) {
        	
        }
    }
        actions.add(
    }
            return;


        	}
        throws DBException {
                            throw new IllegalStateException("Password has to be provided");
        if (command.getProperties().containsKey("kerberosPrincipal")) {

 * You may obtain a copy of the License at
                        ExasolUserQueryPassword dialog = new ExasolUserQueryPassword(UIUtils.getActiveWorkbenchShell());
}        if (command.getProperties().containsKey("priority")) {

        ExasolUser object) {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
                                              @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
 * limitations under the License.
            case LDAP:
            actions.add(Comment(obj));
            script.append(" BY \"" + obj.getPassword() + "\" ");
            }*/
        ExasolUser obj = command.getObject();
                String script = String.format("ALTER USER  %s SET CONSUMER_GROUP = %s", DBUtils.getQuotedIdentifier(obj), DBUtils.getQuotedIdentifier(priority));
                break;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
                break;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriority;
                        if (dialog.open() != IDialogConstants.OK_ID) {
                script.append(" REPLACE \"" + oldPassword + "\"");
                    throw new IllegalStateException("Old password can not be empty");
 *     http://www.apache.org/licenses/LICENSE-2.0

    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    @Override
    @Override
        }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        }
                break;
public class ExasolUserManager extends SQLObjectEditor<ExasolUser, ExasolDataSource> implements DBEObjectRenamer<ExasolUser> {

        if (command.getProperties().containsKey("dn")) {
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.DBPDataSource;
    public DBSObjectCache<ExasolDataSource, ExasolUser> getObjectsCache(
    protected void processObjectRename(DBECommandContext commandContext,
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolUser;

                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {

                             @NotNull ExasolUser object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.DBException;
        StringBuilder script = new StringBuilder("CREATE USER " + DBUtils.getQuotedIdentifier(obj) + " IDENTIFIED ");
        );
        return new SQLDatabasePersistAction("Comment on User", "COMMENT ON USER " + DBUtils.getQuotedIdentifier(obj) + " IS '" + ExasolUtils.quoteString(obj.getDescription()) + "'");
            return;
        if (!CommonUtils.isEmpty(obj.getDescription())) {
            if (!ds.hasAlterUserPrivilege()) {
        if (command.getProperties().containsKey("description")) {

    @Override
                    DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getNewName()))
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,

            actionList.add(new SQLDatabasePersistAction("Modify User", script.toString()));
                script.append(" BY \"" + obj.getPassword() + "\"");
                actionList.add(new SQLDatabasePersistAction(ExasolMessages.manager_assign_priority_group, script));
        	
                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *



        	ExasolPriority priority = obj.getPriority();

                script.append(" AT LDAP AS '" + obj.getDn() + "'");
        actions.add(new SQLDatabasePersistAction("Drop User", "DROP USER " + DBUtils.getQuotedIdentifier(obj)));
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    @Override
    protected ExasolUser createDatabaseObject(@NotNull DBRProgressMonitor monitor,
            case LOCAL:

        ExasolUser obj = command.getObject();
                }.execute();
    @Override
                    @Override
package org.jkiss.dbeaver.ext.exasol.manager;
    	return new ExasolUser((ExasolDataSource) container, "user", "", "", "password", "", ExasolUserType.LOCAL);

        return FEATURE_SAVE_IMMEDIATELY;
    private SQLDatabasePersistAction Comment(ExasolUser obj) {

 *
        ObjectRenameCommand command = new ObjectRenameCommand(object, ModelMessages.model_jdbc_rename_object, options, newName);
        	}
        ExasolUser obj = command.getObject();
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.DBUtils;
        commandContext.addCommand(command, new RenameObjectReflector(), true);

    }

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    }
                if (CommonUtils.isEmpty(oldPassword)) {
 * Licensed under the Apache License, Version 2.0 (the "License");



                    protected String runTask() {
                String oldPassword = new UITask<String>() {
        }
    }
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
            String script = String.format("ALTER USER " + DBUtils.getQuotedIdentifier(obj) + " IDENTIFIED AT LDAP AS '%s'", obj.getDn());
            new SQLDatabasePersistAction(
            default:
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        processObjectRename(commandContext, object, options, newName);


import org.jkiss.utils.CommonUtils;
    @Override
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
/*
                "Rename User",
    }
                        }
                String script = String.format("GRANT PRIORITY GROUP %s to %s", DBUtils.getQuotedIdentifier(priority), DBUtils.getQuotedIdentifier(obj));
                "RENAME USER " + DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getOldName()) + " to " +
                actionList.add(new SQLDatabasePersistAction(ExasolMessages.manager_assign_priority_group, script));
import org.jkiss.dbeaver.ext.exasol.ExasolUserType;
        }
    }
 *
                script.append(" BY KERBEROS PRINCIPAL '" + obj.getKerberosPrincipal() + "'");
    @Override
 * DBeaver - Universal Database Manager
        if (command.getProperties().containsKey("password")) {
            String script = String.format("ALTER USER " + DBUtils.getQuotedIdentifier(obj) + " IDENTIFIED BY KERBEROS PRINCIPAL '%s'", obj.getKerberosPrincipal());
        return ds.getUserCache();
import java.util.List;
