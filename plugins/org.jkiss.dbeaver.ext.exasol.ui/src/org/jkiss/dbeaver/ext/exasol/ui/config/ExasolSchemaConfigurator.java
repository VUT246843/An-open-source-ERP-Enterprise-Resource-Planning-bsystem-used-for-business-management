            @Override
 * You may obtain a copy of the License at
 *
            }
        return new UITask<ExasolSchema>() {

import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
    public ExasolSchema configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolSchema schema, @NotNull Map<String, Object> options) {
                schema.setName(dialog.getName());
/*
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.dialogs.IDialogConstants;
                if (dialog.open() != IDialogConstants.OK_ID) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
 *
                schema.setOwner(dialog.getOwner() == null ? null : dialog.getOwner().getName());
 *
import java.util.Map;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * See the License for the specific language governing permissions and
                ExasolCreateSchemaDialog dialog = new ExasolCreateSchemaDialog(UIUtils.getActiveWorkbenchShell(), (ExasolDataSource) container);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
}
                    return null;
import org.jkiss.dbeaver.ui.UITask;
public class ExasolSchemaConfigurator implements DBEObjectConfigurator<ExasolSchema> {
                }
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

        }.execute();
 */
package org.jkiss.dbeaver.ext.exasol.ui.config;
 * you may not use this file except in compliance with the License.
            protected ExasolSchema runTask() {
    @Override
 * limitations under the License.
                return schema;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.edit.DBECommandContext;

import org.jkiss.code.NotNull;
