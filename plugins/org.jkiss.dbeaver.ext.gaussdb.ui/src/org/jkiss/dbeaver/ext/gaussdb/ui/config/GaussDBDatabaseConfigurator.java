package org.jkiss.dbeaver.ext.gaussdb.ui.config;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
                database.setDatabaseCompatibleMode(dialog.getCompatibleMode());
    public GaussDBDatabase configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext,
                database.setInitialOwner(dialog.getOwner());
 * DBeaver - Universal Database Manager
                database.setInitialEncoding(dialog.getEncoding());
/*
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDatabase;
                if (dialog.open() != IDialogConstants.OK_ID) {
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;


                    return null;
import org.jkiss.dbeaver.ext.gaussdb.ui.GaussDBCreateDatabaseDialog;
        }.execute();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
    }
    @Override
                }
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        @Nullable Object container, @NotNull GaussDBDatabase database, @NotNull Map<String, Object> options) {
                database.setName(dialog.getName());
import org.jkiss.code.Nullable;
                database.setTemplateName(dialog.getTemplateName());
 *
import org.jkiss.dbeaver.ui.UITask;
            protected GaussDBDatabase runTask() throws DBException {

 * Copyright (C) 2010-2024 DBeaver Corp and others
}
                return database;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.eclipse.jface.dialogs.IDialogConstants;
            @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
        return new UITask<GaussDBDatabase>() {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    database.getDataSource());
                GaussDBCreateDatabaseDialog dialog = new GaussDBCreateDatabaseDialog(UIUtils.getActiveWorkbenchShell(),
public class GaussDBDatabaseConfigurator implements DBEObjectConfigurator<GaussDBDatabase> {

import org.jkiss.dbeaver.ui.UIUtils;
 *
                database.setInitialTablespace(dialog.getTablespace());

 * You may obtain a copy of the License at
