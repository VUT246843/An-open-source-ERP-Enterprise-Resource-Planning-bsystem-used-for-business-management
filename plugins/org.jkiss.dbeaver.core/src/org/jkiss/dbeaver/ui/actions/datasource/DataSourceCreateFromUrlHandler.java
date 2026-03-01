public class DataSourceCreateFromUrlHandler extends AbstractHandler {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
            NewConnectionDialog.openNewConnectionDialog(window, dialog.getDriver(), dialog.extractConnectionConfiguration());
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.actions.datasource;

/*
 *
import org.eclipse.core.commands.ExecutionException;
 * you may not use this file except in compliance with the License.
    }

import org.eclipse.jface.dialogs.IDialogConstants;
 * DBeaver - Universal Database Manager
        final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.dialogs.connection.NewConnectionDialog;
 *
 *
import org.eclipse.core.commands.ExecutionEvent;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.dialogs.connection.NewConnectionFromUrlDialog;
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (dialog.open() == IDialogConstants.OK_ID) {
 */
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.IWorkbenchWindow;
        final NewConnectionFromUrlDialog dialog = new NewConnectionFromUrlDialog(window.getShell());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        return null;
} * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        }
