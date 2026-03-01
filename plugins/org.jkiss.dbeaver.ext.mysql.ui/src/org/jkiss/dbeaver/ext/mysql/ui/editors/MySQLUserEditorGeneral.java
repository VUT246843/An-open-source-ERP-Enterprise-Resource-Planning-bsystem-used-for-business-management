 * MySQLUserEditorGeneral
        @Override
    @Override
                    userNameText.setEditable(false);
                        @Override
        if (context != null) {
}

        DBECommandContext context = getEditorInput().getCommandContext();
        }
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
 * you may not use this file except in compliance with the License.
                    });
        {
    @Override
                    userNameText.setText(username);
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;

    protected PageControl getPageControl()
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

            Spinner maxUpdatesText = UIUtils.createLabelSpinner(limitsGroup, MySQLUIMessages.editors_user_editor_general_spinner_max_updates,  getDatabaseObject().getMaxUpdates(), 0, Integer.MAX_VALUE);
    private PageControl pageControl;
import org.jkiss.dbeaver.ext.mysql.model.MySQLPrivilege;


                                privTable.checkPrivilege(privilege, grant);
                        {
                    } catch (DBException e) {
            userNameText = UIUtils.createLabelText(loginGroup, MySQLUIMessages.editors_user_editor_general_label_user_name, getDatabaseObject().getUserName());
    {
 * limitations under the License.
import org.jkiss.dbeaver.model.edit.DBECommand;

        }
        privTable.fillGrants(grants);
                                privTable.checkPrivilege(privilege, !grant);
        if (newUser) {
/*
        super.dispose();
            hostText.setEditable(newUser);
            Text passwordText = UIUtils.createLabelText(loginGroup, MySQLUIMessages.editors_user_editor_general_label_password, password, SWT.BORDER | SWT.PASSWORD);
import org.eclipse.swt.widgets.Event;
        DBECommandContext commandContext = getEditorInput().getCommandContext();
            ControlPropertyCommandListener.create(this, maxUpdatesText, UserPropertyHandler.MAX_UPDATES);
            return;
                ControlPropertyCommandListener.create(this, userNameText, UserPropertyHandler.NAME);

    public void createPartControl(Composite parent)
                        null,

                        @Override
 * See the License for the specific language governing permissions and
            Spinner maxQueriesText = UIUtils.createLabelSpinner(limitsGroup, MySQLUIMessages.editors_user_editor_general_spinner_max_queries, getDatabaseObject().getMaxQuestions(), 0, Integer.MAX_VALUE);
    public void activatePart() {
        }
                });
            Composite limitsGroup = UIUtils.createTitledComposite(container, MySQLUIMessages.editors_user_editor_general_group_limits, 2, GridData.FILL_HORIZONTAL);
        @Override
                        getDatabaseObject(),
            ControlPropertyCommandListener.create(this, maxQueriesText, UserPropertyHandler.MAX_QUERIES);
            privTable.setLayoutData(gd);
                addChangeCommand(
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
                final boolean grant = event.detail >= 1;
        public void onSave()
                    hostText.setText(host);
                }
import org.jkiss.dbeaver.ext.mysql.ui.config.MySQLUserManager;

import org.jkiss.dbeaver.model.impl.edit.DBECommandAdapter;
public class MySQLUserEditorGeneral extends MySQLUserEditorAbstract

import org.jkiss.dbeaver.model.edit.DBECommandReflector;
        {

                        public void redoCommand(@NotNull MySQLCommandGrantPrivilege mySQLCommandGrantPrivilege)
        }
                MySQLUIMessages.editors_user_editor_general_service_load_catalog_privileges,
    @Override
            };
            }
                    hostText.setEditable(false);
        }
        }
    //static final Log log = Log.getLog(MySQLUserEditorGeneral.class);
                        }

import org.eclipse.swt.SWT;
            MySQLUser user = getDatabaseObject();
                    new MySQLCommandGrantPrivilege(
    {
                            return null;
            });

                        grant,
                }
    @Override
    }
        public void onCommandChange(DBECommand<?> command) {

            UIUtils.asyncExec(() -> {
        }
        public void onReset() {
        private void setUsernameAndHost(@NotNull String username, @NotNull String host) {
 *
import org.jkiss.dbeaver.ui.LoadingJob;
            String password = newUser ? "" : DEF_PASSWORD_VALUE; //$NON-NLS-1$
                @Override
            Composite loginGroup = UIUtils.createTitledComposite(container, MySQLUIMessages.editors_user_editor_general_group_login, 2, GridData.FILL_HORIZONTAL);
        @Override
    public void dispose()
            setUsernameAndHost(user.getUserName(), user.getHost());
import org.jkiss.dbeaver.ext.mysql.ui.config.MySQLCommandGrantPrivilege;
 */
                            }
                public List<MySQLPrivilege> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
            pageControl.createLoadVisualizer()
    private class PageControl extends UserPageControl {
        GridData gd = new GridData(GridData.FILL_BOTH);
    private void triggerModifyEvent(Text text) {
    }
                        null,
                        privilege),

            super(parent);

                setUsernameAndHost(mysqlCommand.getNewUserName(), mysqlCommand.getNewHost());
            if (newUser && getDatabaseObject().isPersisted()) {

        if (isLoaded) {
                            if (!privTable.isDisposed()) {
                executionContext
    }
                public void completeLoading(List<MySQLPrivilege> privs) {
            triggerModifyEvent(userNameText);

                    new DBECommandReflector<MySQLUser, MySQLCommandGrantPrivilege>() {

                        }
    }
import org.eclipse.swt.widgets.Text;
 * You may obtain a copy of the License at
                UIUtils.asyncExec(() -> {


                            isLoaded = false;
        pageControl.createProgressPanel();
        event.widget = text;
                        public void undoCommand(@NotNull MySQLCommandGrantPrivilege mySQLCommandGrantPrivilege)
    private PrivilegeTableControl privTable;
    @Override
            }
            gd.horizontalSpan = 2;
        {
        }
            }
                newUser = false;
 *
        text.notifyListeners(SWT.Modify, event);
            Spinner maxUserConnectionsText = UIUtils.createLabelSpinner(limitsGroup, MySQLUIMessages.editors_user_editor_general_spinner_max_user_connections, getDatabaseObject().getMaxUserConnections(), 0, Integer.MAX_VALUE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                ControlPropertyCommandListener.create(this, hostText, UserPropertyHandler.HOST);
            new DatabaseLoadService<>(
    }
        LoadingJob.createService(
            userNameText.setEditable(newUser);
                        throw new InvocationTargetException(e);
 */
        }
        return RefreshResult.IGNORED;
import org.jkiss.dbeaver.ext.mysql.model.MySQLUser;
                if (!privTable.isDisposed()) {
                        withGrantOption,
        }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.edit.DBECommandContext;
                            }
                    try {
        if (executionContext == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,

                            .stream()
            });
            ControlPropertyCommandListener.create(this, maxConnectionsText, UserPropertyHandler.MAX_CONNECTIONS);
                        }
        Composite container = UIUtils.createPlaceholder(pageControl, 2, 5);
import org.jkiss.dbeaver.ui.editors.ControlPropertyCommandListener;
        }
        if (commandlistener != null && commandContext != null) {
        // do nothing


            privTable.addListener(SWT.Modify, event -> {
                final boolean withGrantOption = event.detail == 2;

            return new ProgressVisualizer<>() {
import org.jkiss.dbeaver.DBException;


        public PageControl(Composite parent) {
            return;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected void processGrants(List<MySQLGrant> grants)

                    privTable.fillPrivileges(privs);
{
            }

import org.jkiss.dbeaver.ui.UIUtils;
package org.jkiss.dbeaver.ext.mysql.ui.editors;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            gd = new GridData(GridData.FILL_BOTH);
                        if (user == null) {
                        MySQLUser user = getDatabaseObject();
            if (newUser) {
                    }

        }
    public RefreshResult refreshPart(Object source, boolean force)
import org.jkiss.code.NotNull;
                        {
        DBCExecutionContext executionContext = getExecutionContext();
import java.util.List;
    {
            ControlPropertyCommandListener.create(this, maxUserConnectionsText, UserPropertyHandler.MAX_USER_CONNECTIONS);
                            .filter(p -> !p.getName().equalsIgnoreCase("proxy"))
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            },
                    loadGrants();
            privTable = new PrivilegeTableControl(container, MySQLUIMessages.editors_user_editor_general_control_dba_privileges, true);

            context.addCommandListener(commandlistener);
    {
import java.lang.reflect.InvocationTargetException;
                            .toList();
    private boolean newUser;
        pageControl = new PageControl(parent);
        container.setLayoutData(gd);
                        isLoaded = false;
        Event event = new Event();
        isLoaded = true;
    }
                        return user.getDataSource().getPrivilegesByKind(monitor, MySQLPrivilege.Kind.ADMIN)
    private class CommandListener extends DBECommandAdapter {
                final MySQLPrivilege privilege = (MySQLPrivilege) event.data;
                            if (!privTable.isDisposed()) {
    private Text userNameText;
        }
        return pageControl;
        {
            ControlPropertyCommandListener.create(this, confirmText, UserPropertyHandler.PASSWORD_CONFIRM);
import org.eclipse.swt.widgets.Composite;
    }
 * DBeaver - Universal Database Manager
    private Text hostText;
        public ProgressVisualizer<List<MySQLPrivilege>> createLoadVisualizer() {
                    super.completeLoading(privs);
            Spinner maxConnectionsText = UIUtils.createLabelSpinner(limitsGroup, MySQLUIMessages.editors_user_editor_general_spinner_max_connections, getDatabaseObject().getMaxConnections(), 0, Integer.MAX_VALUE);
                }
import org.eclipse.swt.widgets.Spinner;
    public static final String DEF_PASSWORD_VALUE = "**********"; //$NON-NLS-1$
                @Override
        newUser = !getDatabaseObject().isPersisted();
        ).schedule();
            ) {
 *
import org.jkiss.dbeaver.ext.mysql.ui.controls.PrivilegeTableControl;
            Text confirmText = UIUtils.createLabelText(loginGroup, MySQLUIMessages.editors_user_editor_general_label_confirm, password, SWT.BORDER | SWT.PASSWORD);
import org.jkiss.dbeaver.ext.mysql.model.MySQLGrant;

            hostText = UIUtils.createLabelText(loginGroup, MySQLUIMessages.editors_user_editor_general_label_host, getDatabaseObject().getHost());

    }
            if (command instanceof MySQLUserManager.CommandRenameUser mysqlCommand) {
import org.eclipse.swt.layout.GridData;
            ControlPropertyCommandListener.create(this, passwordText, UserPropertyHandler.PASSWORD);
    private boolean isLoaded;
    @Override
            commandContext.removeCommandListener(commandlistener);
        commandlistener = new CommandListener();
import org.jkiss.dbeaver.ext.mysql.ui.config.UserPropertyHandler;
    private CommandListener commandlistener;
            if (newUser) {
/**
