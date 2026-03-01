import org.jkiss.code.NotNull;
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        return UITask.run(() -> {

import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 *
 * You may obtain a copy of the License at
 * limitations under the License.
            database.setName(dialog.getName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;
 *

public class SQLServerDatabaseConfigurator implements DBEObjectConfigurator<SQLServerDatabase> {
import org.eclipse.jface.dialogs.IDialogConstants;
 * DBeaver - Universal Database Manager
            SQLServerCreateDatabaseDialog dialog = new SQLServerCreateDatabaseDialog(UIUtils.getActiveWorkbenchShell(), database.getDataSource());
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Unless required by applicable law or agreed to in writing, software
 *
            return database;
                return null;
            }
    @Override
import org.jkiss.dbeaver.ui.UITask;
import java.util.Map;
        });
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDatabase;
/*
            if (dialog.open() != IDialogConstants.OK_ID) {
package org.jkiss.dbeaver.ext.mssql.ui.config;
    public SQLServerDatabase configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerDatabase database, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.mssql.ui.SQLServerCreateDatabaseDialog;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
