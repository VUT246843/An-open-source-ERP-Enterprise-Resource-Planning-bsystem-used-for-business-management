 *     http://www.apache.org/licenses/LICENSE-2.0
                PostgreCreateSchemaDialog dialog = new PostgreCreateSchemaDialog(UIUtils.getActiveWorkbenchShell(), schema);
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
        }.execute();
/**
 * You may obtain a copy of the License at

}
 * limitations under the License.
 *
    public PostgreSchema configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreSchema schema, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.postgresql.ui.PostgreCreateSchemaDialog;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
/*
 *
                return schema;
                schema.setName(dialog.getName());
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.UITask;
    @Override
 * you may not use this file except in compliance with the License.
 *
 */
            @Override
                schema.setOwner(dialog.getOwner());
import org.jkiss.dbeaver.ui.UIUtils;
            }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 */
                    return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }

    }
public class PostgreSchemaConfigurator implements DBEObjectConfigurator<PostgreSchema> {
        return new UITask<PostgreSchema>() {
import java.util.Map;
 * Postgre sequence configurator

 * See the License for the specific language governing permissions and
            protected PostgreSchema runTask() {
                if (dialog.open() != IDialogConstants.OK_ID) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.postgresql.ui.config;
