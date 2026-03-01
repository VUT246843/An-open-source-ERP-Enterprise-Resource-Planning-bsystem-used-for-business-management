                if (dialog.open() != IDialogConstants.OK_ID) {
 * Unless required by applicable law or agreed to in writing, software
                login.setLoginName(dialog.getName());
 * you may not use this file except in compliance with the License.
                }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerLogin;
 * limitations under the License.
                EditUserDialog dialog = new EditUserDialog(UIUtils.getActiveWorkbenchShell(), SQLServerUIMessages.dialog_create_login_shell_title);
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
/*
                return login;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            @Override
    public SQLServerLogin configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerLogin login, @NotNull Map<String, Object> options) {
 */
 *
    @Override
import org.eclipse.jface.dialogs.IDialogConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

                    return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 * You may obtain a copy of the License at
            protected SQLServerLogin runTask() {
import java.util.Map;
package org.jkiss.dbeaver.ext.mssql.ui.config;

public class SQLServerLoginConfigurator implements DBEObjectConfigurator<SQLServerLogin> {
}
        }.execute();
import org.jkiss.dbeaver.ui.UIUtils;
        return new UITask<SQLServerLogin>() {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                login.setPassword(dialog.getPassword());
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.UITask;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

 *
import org.jkiss.dbeaver.ui.dialogs.EditUserDialog;
import org.jkiss.dbeaver.ext.mssql.ui.SQLServerUIMessages;
    }
