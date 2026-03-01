            }

        UIUtils.syncExec(() -> {
 * DBeaver - Universal Database Manager
 *
 * limitations under the License.


}    }
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.IWorkbenchCommandConstants;

public class SimpleCommandContext extends AbstractCommandContext {
 *
    }
        });
 *
 * See the License for the specific language governing permissions and
/**
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.impl.edit.AbstractCommandContext;
 */
    protected void refreshCommandState() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Uses jface command service to update commands state
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                commandService.refreshElements(IWorkbenchCommandConstants.EDIT_REDO, null);
        super(executionContext, atomic);
 */
                commandService.refreshElements(IWorkbenchCommandConstants.EDIT_UNDO, null);
 * SimpleCommandContext.
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    public SimpleCommandContext(DBCExecutionContext executionContext, boolean atomic) {
/*
package org.jkiss.dbeaver.ui.editors;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.commands.ICommandService;
            ICommandService commandService = UIUtils.getActiveWorkbenchWindow().getService(ICommandService.class);
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
            if (commandService != null) {
