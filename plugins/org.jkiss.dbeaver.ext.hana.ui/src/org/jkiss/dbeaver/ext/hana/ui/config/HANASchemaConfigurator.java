package org.jkiss.dbeaver.ext.hana.ui.config;
/*
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
 *
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
 *
public class HANASchemaConfigurator implements DBEObjectConfigurator<HANASchema> {

    @Override
 *
            @Override
import org.jkiss.dbeaver.ui.UITask;
                String schemaName = EnterNameDialog.chooseName(
    }

            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
        }.execute();
                return newSchema;
    public HANASchema configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull HANASchema newSchema, @NotNull Map<String, Object> options) {
                    "New Schema",
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.hana.model.HANASchema;
                    UIUtils.getActiveWorkbenchShell(),
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
}
            protected HANASchema runTask() {
                if (CommonUtils.isEmpty(schemaName)) {

        return new UITask<HANASchema>() {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.ui.UIUtils;
                newSchema.setName(schemaName);
import org.jkiss.code.NotNull;
 */

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
                    "");
 * DBeaver - Universal Database Manager
