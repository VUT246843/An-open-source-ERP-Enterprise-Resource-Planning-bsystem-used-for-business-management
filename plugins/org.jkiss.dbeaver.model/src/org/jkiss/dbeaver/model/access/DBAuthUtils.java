 * you may not use this file except in compliance with the License.
public class DBAuthUtils {
import org.jkiss.code.Nullable;

        }
        DBAPasswordChangeInfo userPassword = DBWorkbench.getPlatformUI().promptUserPasswordChange(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
                DBWorkbench.getPlatformUI().showError(

    /**
import org.jkiss.code.NotNull;
/*
        return "<h2>Authentication complete</h2>"
        if (userPassword != null) {
        if (CommonUtils.isEmpty(oldPassword)) {
        DBPConnectionConfiguration connectionInfo = dataSourceContainer.getConnectionConfiguration();
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.utils.GeneralUtils;
    ) {
            // Credentials not saved in the connection settings, use actual configuration
            false,
                    ModelMessages.dialog_user_password_change_question_message)
 *
            } catch (DBException e) {
    public static boolean promptAndChangePasswordForCurrentUser(
        DBPConnectionConfiguration actualConnectionConfiguration = dataSourceContainer.getActualConnectionConfiguration();
            oldPassword,
        @NotNull DBAUserPasswordManager passwordChangeManager
package org.jkiss.dbeaver.model.access;
            userName = connectionInfo.getUserName();

    }
 *
            userName,
 * limitations under the License.
import org.jkiss.dbeaver.model.messages.ModelMessages;
                }
 * DBeaver - Universal Database Manager

     * Other cases - false will be returned.
     * If the user inputs a new password - the password will be changed in the database.
                    }
            String newPassword = userPassword.getNewPassword();
    @NotNull
     * If not, the dialog for changing the current password will be shown.
            // Look at the actual configuration first, then on connection info
            try {
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
                    if (!dataSourceContainer.isTemporary()) {
                        dataSourceContainer.persistConfiguration();
     * @param dataSourceContainer for connection configuration using and changing
        if (CommonUtils.isEmpty(userName)) {
     */
     * @return First, it will check the program on the headless mode and returns false if it is in this mode.
        }
                    ModelMessages.dialog_user_password_change_question_label,
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    connectionInfo.setUserPassword(newPassword);
            + "<div>It was requested by <b>" + GeneralUtils.getProductTitle() + "</b></div>"
            false);
import org.jkiss.dbeaver.DBException;
        return false;
     * @param monitor to execute query changing password
                if (DBWorkbench.getPlatformUI().confirmAction(
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        String oldPassword = connectionInfo.getUserPassword();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                ) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param passwordChangeManager manage syntax of password changing
     *
        @NotNull DBRProgressMonitor monitor,
            }
                    actualConnectionConfiguration.setUserPassword(newPassword);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static String getExternalBrowserSuccessResponse(@Nullable String providerName) {
            + "<div>You successfully authorized %s</div>".formatted(providerName == null ? "for using database" : "in " + providerName)
                    return true;
                    ModelMessages.dialog_user_password_change_error_message + userName, e);
            oldPassword = actualConnectionConfiguration.getUserPassword();
        @NotNull DBPDataSourceContainer dataSourceContainer,
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                    ModelMessages.dialog_user_password_change_label,
 */
            + "<div>You can <a href=\"#\" onclick=\"javascript:window.close()\">close this page</a> and return to the application.</div>";
    }
 * You may obtain a copy of the License at
        if (DBWorkbench.getPlatform().getApplication().isHeadlessMode()) {
            ModelMessages.dialog_user_password_change_label,
}
            return false;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        String userName = actualConnectionConfiguration.getUserName();
                passwordChangeManager.changeUserPassword(monitor, userName, newPassword, oldPassword);
