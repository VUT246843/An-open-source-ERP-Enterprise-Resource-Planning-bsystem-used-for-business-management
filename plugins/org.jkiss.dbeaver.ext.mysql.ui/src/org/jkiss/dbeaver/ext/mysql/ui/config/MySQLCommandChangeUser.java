package org.jkiss.dbeaver.ext.mysql.ui.config;
    private boolean generateCreateScript(@NotNull StringBuilder script) {
            String delim = hasSet ? "," : ""; //$NON-NLS-1$ //$NON-NLS-2$
    @Override

 *
                actions.add(new SQLDatabasePersistAction(MySQLUIMessages.edit_command_change_user_action_update_user_record, updateSQL));
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
                    public void afterExecute(DBCSession session, Throwable error)
        return script.toString();
    }
        StringBuilder resOptions = new StringBuilder();
import org.jkiss.dbeaver.DBException;
    {
        script.append(" WHERE User='").append(getObject().getUserName()).append("' AND Host='").append(getObject().getHost()).append("'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            includeUserPassword = generateCreateScript(script);
        final MySQLDataSource dataSource = getObject().getDataSource();
                default: break;
 *
    @Override
                case MAX_CONNECTIONS: script.append(delim).append("Max_Connections=").append(CommonUtils.toInt(entry.getValue())); hasSet = true; break; //$NON-NLS-1$
        }
        StringBuilder script = new StringBuilder();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                case MAX_UPDATES: getObject().setMaxUpdates(CommonUtils.toInt(entry.getValue())); break;
        boolean hasSet = false, hasResOptions = false;
            String updateSQL = generateUpdateScript();
            return false;
        return actions.toArray(new DBEPersistAction[0]);

                new SQLDatabasePersistAction(MySQLUIMessages.edit_command_change_user_action_create_new_user, script.toString()) {
                case MAX_CONNECTIONS: getObject().setMaxConnections(CommonUtils.toInt(entry.getValue())); break;
        }
        if (MySQLUtils.isAlterUSerSupported(dataSource)) {
 * limitations under the License.

            }
import java.util.List;
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

            throw new DBException("Password confirmation value is invalid");
 * You may obtain a copy of the License at
    {
                case MAX_QUERIES: script.append(delim).append("Max_Questions=").append(CommonUtils.toInt(entry.getValue())); hasSet = true; break; //$NON-NLS-1$
        script.append(" IDENTIFIED BY ").append(SQLUtils.quoteString(getObject(), CommonUtils.toString(getProperties().get(UserPropertyHandler.PASSWORD.name()))));
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options)
        MySQLUser user = getObject();
            final StringBuilder script = new StringBuilder();
        Object passwordValue = getProperties().get(UserPropertyHandler.PASSWORD.name());
                default:
        for (Map.Entry<Object, Object> entry : getProperties().entrySet()) {
import org.jkiss.dbeaver.model.exec.DBCSession;
                case MAX_CONNECTIONS: resOptions.append("\n\tMAX_CONNECTIONS_PER_HOUR ").append(CommonUtils.toInt(entry.getValue())); hasResOptions = true; break; //$NON-NLS-1$
import org.jkiss.dbeaver.ext.mysql.model.MySQLUser;
        if (resOptions.length() > 0) {
        }

    }
                case MAX_UPDATES: script.append(delim).append("Max_Updates=").append(CommonUtils.toInt(entry.getValue())); hasSet = true; break; //$NON-NLS-1$
    @NotNull
            if (generateAlterScript(script, includeUserPassword)) {
        script.append("CREATE USER ").append(object.getFullName());


        if (getProperties().containsKey(UserPropertyHandler.PASSWORD.name())) {
    }
    }
        }
        }
            switch (UserPropertyHandler.valueOf((String) entry.getKey())) {
            }
                    {
import org.jkiss.utils.CommonUtils;
        super(user, MySQLUIMessages.edit_command_change_user_name);
        final MySQLUser object = getObject();
                actions.add(new SQLDatabasePersistAction(MySQLUIMessages.edit_command_change_user_action_update_user_record, script.toString()));

    }
    @Override
                    break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return "SET PASSWORD FOR '" + user.getUserName() + "'@'" + user.getHost() +
                    }
        return hasSet || hasResOptions;
            }
            hasSet = true;
 * See the License for the specific language governing permissions and
                case MAX_USER_CONNECTIONS: resOptions.append("\n\tMAX_USER_CONNECTIONS ").append(CommonUtils.toInt(entry.getValue())); hasResOptions = true; break; //$NON-NLS-1$
                case MAX_QUERIES: getObject().setMaxQuestions(CommonUtils.toInt(entry.getValue())); break;
        List<DBEPersistAction> actions = new ArrayList<>();
    public void updateModel()
    protected MySQLCommandChangeUser(MySQLUser user)
        }
import java.util.ArrayList;

        }
    private String generatePasswordSet() {
            switch (UserPropertyHandler.valueOf((String) entry.getKey())) {
            }
/*
        script.append("UPDATE mysql.user SET "); //$NON-NLS-1$
            updateSQL = generatePasswordSet();
    private String generateUpdateScript() {
                case MAX_USER_CONNECTIONS: getObject().setMaxUserConnections(CommonUtils.toInt(entry.getValue())); break;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
            generateIdentifiedByClause(script);
        if (getProperties().containsKey(UserPropertyHandler.PASSWORD.name()) && includePassword) {
    @Override
        }
 * you may not use this file except in compliance with the License.

        script.append("ALTER USER ").append(getObject().getFullName()); //$NON-NLS-1$
    }
            script.append("\nWITH").append(resOptions);
                            getObject().getDataSource().resetUsers();
import org.jkiss.dbeaver.model.sql.SQLUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    }
public class MySQLCommandChangeUser extends DBECommandComposite<MySQLUser, UserPropertyHandler> {
 *     http://www.apache.org/licenses/LICENSE-2.0
        boolean newUser = !getObject().isPersisted();
        }
 *
            return null;
            "' = PASSWORD(" + SQLUtils.quoteString(user, passwordValue.toString()) + ")";
            if (updateSQL != null) {
import org.jkiss.code.NotNull;
        return getProperties().containsKey(UserPropertyHandler.PASSWORD.name());
            StringBuilder script = new StringBuilder();
import org.jkiss.dbeaver.ext.mysql.MySQLUtils;

import java.util.Map;
                    @Override
        for (Map.Entry<Object, Object> entry : getProperties().entrySet()) {
        String passValue = CommonUtils.toString(getProperty(UserPropertyHandler.PASSWORD));
            return null;
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
        if (newUser) {
        return true;
    {
                        if (error == null) {

        String confirmValue = CommonUtils.toString(getProperty(UserPropertyHandler.PASSWORD_CONFIRM));


 */
            }
 * Unless required by applicable law or agreed to in writing, software
                case MAX_QUERIES: resOptions.append("\n\tMAX_QUERIES_PER_HOUR ").append(CommonUtils.toInt(entry.getValue())); hasResOptions = true; break; //$NON-NLS-1$
    public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
                actions.add(new SQLDatabasePersistAction(MySQLUIMessages.edit_command_change_user_action_update_user_record, updateSQL));
                case MAX_UPDATES: resOptions.append("\n\tMAX_UPDATES_PER_HOUR ").append(CommonUtils.toInt(entry.getValue())); hasResOptions = true; break; //$NON-NLS-1$

    private boolean generateAlterScript(StringBuilder script, boolean includePassword) {
    {
                            getObject().setPersisted(true);
            switch (UserPropertyHandler.valueOf((String) entry.getKey())) {
 */
        if (!CommonUtils.isEmpty(passValue) && !CommonUtils.equalObjects(passValue, confirmValue)) {
    private void generateIdentifiedByClause(@NotNull StringBuilder script) {
    }
                        }
                });
        for (Map.Entry<Object, Object> entry : getProperties().entrySet()) {
        } else {
            }
                case MAX_USER_CONNECTIONS: script.append(delim).append("Max_User_Connections=").append(CommonUtils.toInt(entry.getValue())); hasSet = true; break; //$NON-NLS-1$
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
 * Grant/Revoke privilege command
            if (updateSQL != null) {
    }
        if (passwordValue == null) {
        }
    public boolean isDisableSessionLogging() {
}
        if (!hasSet) {
        boolean hasSet = false;
        boolean includeUserPassword = true;
            generateIdentifiedByClause(script);
            actions.add(
