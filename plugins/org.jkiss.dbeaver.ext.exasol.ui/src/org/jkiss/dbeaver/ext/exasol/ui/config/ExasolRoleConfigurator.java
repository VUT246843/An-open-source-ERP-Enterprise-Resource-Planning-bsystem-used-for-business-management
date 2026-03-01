                return role;
/*
}
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
                role.setName(dialog.getName());
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolRole;
    @Override
import java.util.Map;

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        return new UITask<ExasolRole>() {
                if (dialog.open() != IDialogConstants.OK_ID) {
package org.jkiss.dbeaver.ext.exasol.ui.config;
                ExasolRoleDialog dialog = new ExasolRoleDialog(UIUtils.getActiveWorkbenchShell());
            protected ExasolRole runTask() {
        }.execute();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UITask;

            }
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * DBeaver - Universal Database Manager
 */
                }
public class ExasolRoleConfigurator implements DBEObjectConfigurator<ExasolRole> {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return null;
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public ExasolRole configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolRole role, @NotNull Map<String, Object> options) {

 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
            @Override
import org.eclipse.jface.dialogs.IDialogConstants;
                role.setDescription(dialog.getDescription());
import org.jkiss.code.Nullable;
