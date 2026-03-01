 *
/*

    @Override
                role.setCanLogin(dialog.isUser());
public class PostgreRoleConfigurator implements DBEObjectConfigurator<PostgreRole> {
                    return null;
                }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
                if (dialog.open() != IDialogConstants.OK_ID) {
 * Unless required by applicable law or agreed to in writing, software
                return role;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
import org.jkiss.dbeaver.ext.postgresql.ui.PostgreCreateRoleDialog;
                PostgreCreateRoleDialog dialog = new PostgreCreateRoleDialog(UIUtils.getActiveWorkbenchShell(), role);
    public PostgreRole configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreRole role, @NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;
import org.eclipse.jface.dialogs.IDialogConstants;
            }
 * See the License for the specific language governing permissions and
import java.util.Map;
            @Override
 */
import org.jkiss.dbeaver.ui.UITask;
 * limitations under the License.

 * Postgre role configurator
/**
 * DBeaver - Universal Database Manager
 */
 *
    }
package org.jkiss.dbeaver.ext.postgresql.ui.config;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.UIUtils;
                role.setName(dialog.getName());
        return new UITask<PostgreRole>() {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            protected PostgreRole runTask() {
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }.execute();
 * distributed under the License is distributed on an "AS IS" BASIS,


                role.setPassword(dialog.getPassword());
