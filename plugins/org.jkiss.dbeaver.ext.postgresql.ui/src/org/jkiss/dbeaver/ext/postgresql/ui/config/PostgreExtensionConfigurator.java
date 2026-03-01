import java.util.Map;
public class PostgreExtensionConfigurator implements DBEObjectConfigurator<PostgreExtension> {
                protected PostgreExtension runTask() {
 * Copyright (C) 2019 Andrew Khitrin (ahitrin@gmail.com)
 * DBeaver - Universal Database Manager
        
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        public PostgreExtension configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreExtension extension, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
import org.jkiss.code.Nullable;
                }
 * You may obtain a copy of the License at
                    if (dialog.open() != IDialogConstants.OK_ID) {
 *
            return new UITask<PostgreExtension>() {
import org.eclipse.jface.dialogs.IDialogConstants;
 */
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.postgresql.ui.PostgreCreateExtensionDialog;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreExtension;
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.postgresql.ui.config;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,
}
import org.jkiss.dbeaver.ui.UITask;
                @Override
                    extension.setSchema(dialog.getSchema().getName());


                    }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others

                    return extension;
                    PostgreCreateExtensionDialog dialog = new PostgreCreateExtensionDialog(UIUtils.getActiveWorkbenchShell(), extension);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UIUtils;
/*
                        return null;
        @Override
 *
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    extension.setName(dialog.getExtension().getName());
            }.execute();
