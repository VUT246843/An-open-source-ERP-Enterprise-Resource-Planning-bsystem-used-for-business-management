 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UITask;
            database.getAdditionalInfo().setDefaultCollation(dialog.getCollation());
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 */
 * MySQL database configurator
/*
}
            String schemaName = dialog.getName();
 *
/**


            return database;
        });

import org.eclipse.jface.dialogs.IDialogConstants;

    }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
public class MySQLCatalogConfigurator implements DBEObjectConfigurator<MySQLCatalog> {
import org.jkiss.dbeaver.ext.mysql.ui.views.MySQLCreateDatabaseDialog;
            }
            MySQLCreateDatabaseDialog dialog = new MySQLCreateDatabaseDialog(UIUtils.getActiveWorkbenchShell(), database);
import java.util.Map;
        return UITask.run(() -> {
    public MySQLCatalog configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object dataSource, @NotNull MySQLCatalog database, @NotNull Map<String, Object> options) {
 * See the License for the specific language governing permissions and
 * limitations under the License.
package org.jkiss.dbeaver.ext.mysql.ui.config;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
            if (dialog.open() != IDialogConstants.OK_ID) {
                return null;
 *

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
            database.getAdditionalInfo().setDefaultCharset(dialog.getCharset());
            database.setName(schemaName);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
