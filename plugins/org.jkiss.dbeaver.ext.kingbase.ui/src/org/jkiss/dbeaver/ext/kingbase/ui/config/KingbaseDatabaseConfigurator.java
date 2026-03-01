import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseDatabase;
package org.jkiss.dbeaver.ext.kingbase.ui.config;
 *
 *

        @Nullable Object container, @NotNull KingbaseDatabase database, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.kingbase.ui.KingbaseCreateDatabaseDialog;
 *
        return new UITask<KingbaseDatabase>() {
                    database.getDataSource());
                if (dialog.open() != IDialogConstants.OK_ID) {
                return database;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class KingbaseDatabaseConfigurator implements DBEObjectConfigurator<KingbaseDatabase> {
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            protected KingbaseDatabase runTask() throws DBException {

                database.setTemplateName(dialog.getTemplateName());

}
    }
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 */
                database.setInitialEncoding(dialog.getEncoding());
                database.setDatabaseCompatibleMode(dialog.getCompatibleMode());
 * You may obtain a copy of the License at
                KingbaseCreateDatabaseDialog dialog = new KingbaseCreateDatabaseDialog(UIUtils.getActiveWorkbenchShell(),
                database.setInitialOwner(dialog.getOwner());
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
                    return null;

                database.setInitialTablespace(dialog.getTablespace());
                database.setName(dialog.getName());
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
import org.jkiss.dbeaver.ui.UITask;
                }
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

    public KingbaseDatabase configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext,
        }.execute();
import java.util.Map;
/*
            @Override
