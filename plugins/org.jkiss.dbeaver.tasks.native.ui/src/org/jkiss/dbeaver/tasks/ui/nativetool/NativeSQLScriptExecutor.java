 *
 *
    protected abstract TaskConfigurationWizard<?> createTaskConfigurationWizard(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.actions.exec.SQLScriptExecutor;

 * Unless required by applicable law or agreed to in writing, software
        dialog.open();
        NativeToolWizardDialog dialog = new NativeToolWizardDialog(


/*
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    @NotNull
        @NotNull CONTAINER container,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UIUtils;
 * limitations under the License.
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 * You may obtain a copy of the License at
        @Nullable Path editor);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
package org.jkiss.dbeaver.tasks.ui.nativetool;
    public void execute(@NotNull CONTAINER container, @Nullable Path file) throws DBException {
import org.jkiss.code.NotNull;
            UIUtils.getActiveWorkbenchWindow(),

import org.jkiss.code.Nullable;
import java.nio.file.Path;
            createTaskConfigurationWizard(container, file));
import org.jkiss.dbeaver.DBException;
public abstract class NativeSQLScriptExecutor<CONTAINER extends DBSObject> implements SQLScriptExecutor<CONTAINER> {
}
