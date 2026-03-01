 * limitations under the License.
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
                if (!editPage.edit()) {
 */
            @Override
public class PostgreTriggerConfigurator implements DBEObjectConfigurator<PostgreTrigger> {
import org.jkiss.code.Nullable;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    public PostgreTrigger configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreTrigger trigger, @NotNull Map<String, Object> options) {
 * You may obtain a copy of the License at
/**
}
 * Licensed under the Apache License, Version 2.0 (the "License");

            protected PostgreTrigger runTask() {
 * Postgre sequence configurator

                    return null;
/*

        }.execute();
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software

 *
                return trigger;
                trigger.setFunction(editPage.selectedFunction);

import org.jkiss.dbeaver.ext.postgresql.model.PostgreTrigger;
 * See the License for the specific language governing permissions and
 *
package org.jkiss.dbeaver.ext.postgresql.ui.config;
 */
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                PostgreTriggerEditPage editPage = new PostgreTriggerEditPage(trigger);
import java.util.Map;
import org.jkiss.dbeaver.ui.UITask;
        return new UITask<PostgreTrigger>() {
                trigger.setName(editPage.getEntityName());
 * DBeaver - Universal Database Manager
