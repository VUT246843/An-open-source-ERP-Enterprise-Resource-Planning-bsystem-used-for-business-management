                    case LDAP:
 * Licensed under the Apache License, Version 2.0 (the "License");
            protected ExasolUser runTask() {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
package org.jkiss.dbeaver.ext.exasol.ui.config;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 */
                    case KERBEROS:
                if (dialog.open() != IDialogConstants.OK_ID) {
        }.execute();
                    case LOCAL:
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
import org.jkiss.dbeaver.ui.UITask;
                        break;
 * DBeaver - Universal Database Manager

                return user;
 * you may not use this file except in compliance with the License.
    @Override
            }
 *
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolUser;
                        break;
import org.jkiss.code.Nullable;
        return new UITask<ExasolUser>() {
                    return null;
                        user.setDN(dialog.getLDAPDN());
/*
    public ExasolUser configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolUser user, @NotNull Map<String, Object> options) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
                ExasolUserDialog dialog = new ExasolUserDialog(UIUtils.getActiveWorkbenchShell(), (ExasolDataSource) container);
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                user.setDescription(dialog.getComment());
                user.setName(dialog.getName());
public class ExasolUserConfigurator implements DBEObjectConfigurator<ExasolUser> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                        user.setKerberosPrincipal(dialog.getKerberosPrincipal());
 * Unless required by applicable law or agreed to in writing, software
                switch (dialog.getUserType()) {
                        break;
import org.eclipse.jface.dialogs.IDialogConstants;
}
import org.jkiss.dbeaver.ui.UIUtils;
            @Override
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                }
                        user.setPassword(dialog.getPassword());
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and

import org.jkiss.code.NotNull;
