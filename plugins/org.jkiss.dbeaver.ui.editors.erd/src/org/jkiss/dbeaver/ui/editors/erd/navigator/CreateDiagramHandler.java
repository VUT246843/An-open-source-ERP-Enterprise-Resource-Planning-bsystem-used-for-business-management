    {
 * you may not use this file except in compliance with the License.

        return null;
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
public class CreateDiagramHandler extends AbstractDataSourceHandler {
    public Object execute(ExecutionEvent event) throws ExecutionException
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.ExecutionEvent;
            new DiagramCreateWizard());
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
}    }
 */

        ActiveWizardDialog dialog = new ActiveWizardDialog(

 *
/*
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * You may obtain a copy of the License at
        dialog.open();
            HandlerUtil.getActiveWorkbenchWindow(event),
 * limitations under the License.
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.editors.erd.navigator;
    @Override

import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;
