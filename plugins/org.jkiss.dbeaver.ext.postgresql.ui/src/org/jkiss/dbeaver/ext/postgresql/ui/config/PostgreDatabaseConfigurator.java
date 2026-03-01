                if (dialog.open() != IDialogConstants.OK_ID) {
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.

 *
        return new UITask<PostgreDatabase>() {
    public PostgreDatabase configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object dataSource, @NotNull PostgreDatabase database, @NotNull Map<String, Object> options) {
                database.setName(dialog.getName());
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
}
package org.jkiss.dbeaver.ext.postgresql.ui.config;
 */
import org.jkiss.dbeaver.ui.UIUtils;
 *
            protected PostgreDatabase runTask() {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
public class PostgreDatabaseConfigurator implements DBEObjectConfigurator<PostgreDatabase> {
import org.eclipse.jface.dialogs.IDialogConstants;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
                    return null;
/*
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
        }.execute();
import org.jkiss.dbeaver.ext.postgresql.ui.PostgreCreateDatabaseDialog;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
 * limitations under the License.
 * Postgre database configurator
import org.jkiss.dbeaver.ui.UITask;
            }
                database.setTemplateName(dialog.getTemplateName());
 * Unless required by applicable law or agreed to in writing, software
                database.setInitialOwner(dialog.getOwner());

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                database.setInitialTablespace(dialog.getTablespace());
/**

 */

                PostgreCreateDatabaseDialog dialog = new PostgreCreateDatabaseDialog(UIUtils.getActiveWorkbenchShell(), database.getDataSource());

                return database;
                }
            @Override
                database.setInitialEncoding(dialog.getEncoding());
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
