
        }.execute();

 *
    }
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
                    return null;
package org.jkiss.dbeaver.ext.exasol.ui.config;
 * See the License for the specific language governing permissions and
                return group;

 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                if (dialog.open() != IDialogConstants.OK_ID) {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.code.Nullable;
                group.setName(dialog.getName());
                group.setDescription(dialog.getComment());
}
        return new UITask<ExasolPriorityGroup>() {
 * you may not use this file except in compliance with the License.
public class ExasolPriorityGroupConfigurator implements DBEObjectConfigurator<ExasolPriorityGroup> {
 */
 * limitations under the License.
                ExasolPriorityGroupDialog dialog = new ExasolPriorityGroupDialog(UIUtils.getActiveWorkbenchShell(), group);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            protected ExasolPriorityGroup runTask() {
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
            }
    public ExasolPriorityGroup configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolPriorityGroup group, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ui.UITask;
                group.setWeight(dialog.getWeight());
                }
import java.util.Map;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriorityGroup;
