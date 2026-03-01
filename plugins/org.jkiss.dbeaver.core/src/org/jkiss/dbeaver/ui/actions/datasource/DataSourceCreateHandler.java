
 * DBeaver - Universal Database Manager
import org.eclipse.core.commands.ExecutionEvent;
        return null;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 */
 * Unless required by applicable law or agreed to in writing, software
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.core.commands.AbstractHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
import org.eclipse.ui.handlers.HandlerUtil;
        NewConnectionDialog.openNewConnectionDialog(window);
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
    @Override

import org.jkiss.dbeaver.ui.dialogs.connection.NewConnectionDialog;
 *
 * You may obtain a copy of the License at



 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.actions.datasource;
import org.eclipse.core.commands.ExecutionException;
 *
import org.eclipse.ui.IWorkbenchWindow;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
/*
public class DataSourceCreateHandler extends AbstractHandler {
} * Licensed under the Apache License, Version 2.0 (the "License");
