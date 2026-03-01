import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
                ExasolConnectionDialog dialog = new ExasolConnectionDialog(UIUtils.getActiveWorkbenchShell(), (ExasolDataSource) container);
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                con.setConnectionString(dialog.getUrl());
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.UIUtils;
/*
                if (dialog.open() != IDialogConstants.OK_ID)
                con.setName(dialog.getName());
                con.setPassword(dialog.getPassword());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            @Override
import org.jkiss.dbeaver.ui.UITask;
    public ExasolConnection configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolConnection con, @NotNull Map<String, Object> options) {
 * limitations under the License.
            }
import java.util.Map;
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;

                {
                }
                con.setUserName(dialog.getUser());
        }.execute();
    }
package org.jkiss.dbeaver.ext.exasol.ui.config;
public class ExasolConnectionConfigurator implements DBEObjectConfigurator<ExasolConnection> {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
                    return null;

 * See the License for the specific language governing permissions and
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.exasol.model.ExasolConnection;
                return con;
            {
        return new UITask<ExasolConnection>() {
}
 *
            protected ExasolConnection runTask()

 */
 *
                con.setDescription(dialog.getComment());
import org.jkiss.dbeaver.model.edit.DBECommandContext;
