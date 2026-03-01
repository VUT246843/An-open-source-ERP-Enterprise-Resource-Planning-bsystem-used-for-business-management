package org.jkiss.dbeaver.ext.dameng.ui.config;
                    ""
 * limitations under the License.

import org.jkiss.utils.CommonUtils;
    }
 * Unless required by applicable law or agreed to in writing, software
 * @author Shengkai Bai
import org.jkiss.code.NotNull;

            );
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Map;
 * DBeaver - Universal Database Manager
 */
            return damengSchema;
            }
public class DamengSchemaConfigurator implements DBEObjectConfigurator<DamengSchema> {
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 *
/*
import org.jkiss.dbeaver.ext.dameng.model.DamengSchema;
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
                    "New Schema",
            String schemaName = EnterNameDialog.chooseName(
 */
import org.jkiss.code.Nullable;
    public DamengSchema configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull DamengSchema damengSchema, @NotNull Map<String, Object> options) {
            damengSchema.setName(schemaName);
import org.jkiss.dbeaver.ui.UITask;
 * You may obtain a copy of the License at
                    UIUtils.getActiveWorkbenchShell(),
 *     http://www.apache.org/licenses/LICENSE-2.0
        });
 *
import org.jkiss.dbeaver.ui.UIUtils;
}
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
        return UITask.run(() -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                return null;

 * See the License for the specific language governing permissions and
            if (CommonUtils.isEmpty(schemaName)) {
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
