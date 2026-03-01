                renameCmd.setNewName(newName);
        }
        public String getNewUserName() {
            }
import org.jkiss.dbeaver.ext.mysql.MySQLUtils;


import java.util.*;

        protected CommandCreateUser(MySQLUser user)

                }};
    //---- Rename command and rename reflector. For the most part, it is copy-pasted from SQLObjectEditor.
                                "FLUSH PRIVILEGES")
            } else {
                             @NotNull String newName) {
            Map<String, Object> options = new LinkedHashMap<>(command.getOptions());
import org.jkiss.dbeaver.DBException;
                    @NotNull
               "RENAME USER " + getQuotedName(oldUserName, oldHost, dataSource) + " TO " + getQuotedName(newUserName, newHost, dataSource) //$NON-NLS-1$ //$NON-NLS-2$
                userParams.put(mergeId, renameCmd);
    {
            if (CommonUtils.equalObjects(oldName, newName)) {
        }
                            new SQLDatabasePersistAction(
    }
        private static String getQuotedName(@NotNull String userName, @NotNull String host, @NotNull DBPDataSource dataSource) {
            newUser.setMaxUserConnections(tplUser.getMaxUserConnections());
            }
            newUser.setMaxUpdates(tplUser.getMaxUpdates());

 *
        private String newName;
    }

    @Override

            // Update cache
            DBUtils.fireObjectUpdate(command.getObject(), options, DBPEvent.RENAME);
            newHost = newName.substring(atPosition + 1);
        commandContext.addCommand(new CommandDropUser(user), new DeleteObjectReflector<>(this), true);

    private static class CommandCreateUser extends DBECommandAbstract<MySQLUser> {
            if (CommonUtils.isEmpty(host)) {

            setNewName(newName);
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        @Override
    @Override
}
 * limitations under the License.
            newUser.setMaxQuestions(tplUser.getMaxQuestions());
                        };
        if (USE_DIRECT_UPDATE && !queue.isEmpty() && !MySQLUtils.isAlterUSerSupported(queue.getObject().getDataSource())) {

package org.jkiss.dbeaver.ext.mysql.ui.config;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

            if (host.isEmpty()) {
        }
import org.jkiss.dbeaver.model.DBPEvent;
 * you may not use this file except in compliance with the License.
            }
    @Override
        @Override
        if (copyFrom instanceof MySQLUser) {
            this.newName = newName;
                newUserName = newName;

            }
            return super.merge(prevCommand, userParams);
        @NotNull
        @Override

                    }
            if (renameCmd == null) {
        @NotNull
            DBSObjectCache<? extends DBSObject, MySQLUser> cache = getObjectsCache(command.getObject());
        }
                            getObject().setPersisted(false);
        }
        }
public class MySQLUserManager extends AbstractObjectManager<MySQLUser> implements DBEObjectMaker<MySQLUser, MySQLDataSource>,
        String getOldName() {
import org.jkiss.dbeaver.model.exec.DBCSession;
        }
        private void setHost(@NotNull MySQLUser user, @NotNull String host) {

                        if (CommonUtils.getOption(options, OPTION_SUPPRESS_FLUSH_PRIVILEGES)) {
import org.jkiss.utils.CommonUtils;
    @Override
    public MySQLUser createNewObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext commandContext, @NotNull Object container, Object copyFrom, @NotNull Map<String, Object> options)
            DBPDataSource dataSource = executionContext.getDataSource();


import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
            return Collections.unmodifiableMap(options);

import org.jkiss.dbeaver.model.edit.*;
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options)
    @Nullable
        }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    {
    }
                renameCmd = new CommandRenameUser(getObject(), getTitle(), options, newName);
            }
        String getOldHost() {

            DBSObjectCache<? extends DBSObject, MySQLUser> cache = getObjectsCache(command.getObject());

    public boolean canDeleteObject(@NotNull MySQLUser object)
            MySQLUser tplUser = (MySQLUser)copyFrom;
    DBECommandFilter<MySQLUser>, DBEObjectRenamer<MySQLUser> {
                    @Override
        }
        }
        }
        return true;
        private CommandRenameUser(MySQLUser user, String title, Map<String, Object> options, String newName) {
                });
        commandContext.addCommand(command, new ReflectorRenameUser(), true);
        }

import org.jkiss.dbeaver.ext.mysql.model.MySQLUser;
        public String getNewHost() {
            }
            return "CMD:RenameObject:" + getObject();
 * distributed under the License is distributed on an "AS IS" BASIS,
            ));
        MySQLUser newUser = new MySQLUser((MySQLDataSource) container, null);
    {

 * Unless required by applicable law or agreed to in writing, software
        {
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return actions.toArray(new DBEPersistAction[0]);

        private final String oldUserName;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

        private final Map<String, Object> options;
            if (getObject().getDataSource().getUsers(monitor)
            newUser.setHost(tplUser.getHost());
            int atPosition = newName.indexOf('@');
                    @Override
        return true;
            super(user, title);
            }
                return renameCmd;
        protected CommandDropUser(MySQLUser user)

        @Override
        private final String oldName;
                            return new DBEPersistAction[0];
    }
        private String newHost;
            }
        public void redoCommand(@NotNull CommandRenameUser command) {

            user.setUserName(command.getOldUserName());
import org.jkiss.code.Nullable;
            }
 * DBeaver - Universal Database Manager
                        }
            // Add privileges flush to the tail
            // We need very first and very last rename commands. They produce final rename
            newUser.setMaxConnections(tplUser.getMaxConnections());
    private class ReflectorRenameUser implements DBECommandReflector<MySQLUser, CommandRenameUser> {
            setHost(user, command.getOldHost());
/*

        public String toString() {
                return new DBEPersistAction[0];
    private static class CommandDropUser extends DBECommandComposite<MySQLUser, UserPropertyHandler> {
    }
        @Override
 *
                .anyMatch(u -> username.equals(u.getUserName()) && host.equals(u.getHost()))) {

/**
                        if (error == null) {
 *
            return newUserName;
        public void undoCommand(@NotNull CommandRenameUser command) {
                    }
    }
            super(user, MySQLUIMessages.edit_user_manager_command_create_user);

        @NotNull
    private static final boolean USE_DIRECT_UPDATE = false;
        commandContext.addCommand(new CommandCreateUser(newUser), new CreateObjectReflector<>(this), true);
            final String username = getObject().getUserName();
            options.put(DBEObjectRenamer.PROP_OLD_NAME, command.getOldName());
            final String mergeId = "rename" + getObject().hashCode();
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
            DBUtils.fireObjectUpdate(command.getObject(), options, DBPEvent.RENAME);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * MySQLUserManager
        }
            actions.add(new SQLDatabasePersistAction(
        public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 */
            return oldUserName;

            return oldHost;
        {

 * Copyright (C) 2010-2025 DBeaver Corp and others
            return oldName;
        }
                        return new DBEPersistAction[] {
                        }
                host =  "%";
                return;
                cache.renameObject(command.getObject(), command.getNewName(), command.getOldName());
        return null;
            super(user, MySQLUIMessages.edit_user_manager_command_drop_user);
            setHost(user, command.getNewHost());
            return newName;
                throw new DBException("Can't create user with empty name");

    @Override
            if (host.isEmpty()) {
        public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams) {
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull MySQLUser user, @NotNull Map<String, Object> options)
 * See the License for the specific language governing permissions and
        }
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
                cache.renameObject(command.getObject(), command.getOldName(), command.getNewName());
        Map<String, Object> getOptions() {
        private final String oldHost;
            if (atPosition == -1 || atPosition == newName.length() - 1) {

               "Rename user", //$NON-NLS-1$
    public static final class CommandRenameUser extends DBECommandAbstract<MySQLUser> implements DBECommandRename {
                newHost = "";

            return DBUtils.getQuotedIdentifier(dataSource, userName) + "@" + DBUtils.getQuotedIdentifier(dataSource, host);
    }
            final String host = getObject().getHost();
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) {
                    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException {
            queue.add(
        }
                    {
                return DBUtils.getQuotedIdentifier(dataSource, userName);
            oldUserName = user.getUserName();
            return newHost;
            super.validateCommand(monitor, options);
import org.jkiss.dbeaver.model.impl.edit.AbstractObjectManager;
            user.setUserName(command.getNewUserName());
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
    public void filterCommands(DBECommandQueue<MySQLUser> queue)
                throw new DBException("Can't create user with empty host name");
    private static final String OPTION_SUPPRESS_FLUSH_PRIVILEGES = "suppress.flushPrivileges";

            MySQLUser user = command.getObject();
    @Override
            if (cache != null) {

                new SQLDatabasePersistAction(MySQLUIMessages.edit_user_manager_command_drop_user, "DROP USER " + getObject().getFullName()) { //$NON-NLS-2$
    {

        private String newUserName;
            oldName = user.getName();
            newUser.setUserName(tplUser.getUserName());
            newUserName = newName.substring(0, atPosition);
    {
                    queue.getObject(),
        }
                    MySQLUIMessages.edit_user_manager_command_flush_privileges) {
            MySQLUser user = command.getObject();
            // Update cache
        String getOldUserName() {

            oldHost = user.getHost();
            CommandRenameUser renameCmd = (CommandRenameUser) userParams.get(mergeId);
                                getTitle(),
            }
    }
        return newUser;
    }
import org.jkiss.code.NotNull;
    {
            this.options = options;
            options.put(DBEObjectRenamer.PROP_NEW_NAME, command.getNewName());
            if (cache != null) {
    }
            user.setHost(host);
import org.jkiss.dbeaver.model.DBPDataSource;
        }
    {
        @Override
                .stream()

        @NotNull
            List<DBEPersistAction> actions = new ArrayList<>();
                    public void afterExecute(DBCSession session, Throwable error)
                throw new DBException("Cannot create user: user '%s'@'%s' already exists".formatted(username, host));
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull MySQLUser object, @NotNull Map<String, Object> options,
    }
    public boolean canCreateObject(@NotNull Object container)
        }
    @Override
            return new DBEPersistAction[] {
    @Override
    }

        {

    // Perhaps we should set it in UI? For now it is always disabled
        private void setNewName(String newName) {
        String getNewName() {
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (CommonUtils.isEmpty(username)) {
        }
                new DBECommandAbstract<MySQLUser>(
import org.jkiss.dbeaver.model.DBUtils;

        return FEATURE_EDITOR_ON_CREATE;

import org.jkiss.dbeaver.model.struct.DBSObject;
        DBECommand<MySQLUser> command = new CommandRenameUser(object, MySQLUIMessages.edit_user_manager_command_rename_user, options, newName);
            Map<String, Object> options = new LinkedHashMap<>(command.getOptions());
    public DBSObjectCache<? extends DBSObject, MySQLUser> getObjectsCache(MySQLUser object)
 */
