        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
import org.eclipse.ui.IWorkbenchPart;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

 */
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
            DBRProcessController view = (DBRProcessController)activePart;
import org.eclipse.core.commands.ExecutionException;

 *
    public Object execute(ExecutionEvent event) throws ExecutionException {
            view.terminateProcess();
        if (activePart instanceof DBRProcessController) {
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        return null;
package org.jkiss.dbeaver.ui.views.process;
 * limitations under the License.
    @Override
 *
import org.jkiss.dbeaver.model.runtime.DBRProcessController;
import org.eclipse.core.commands.ExecutionEvent;
/*
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.handlers.HandlerUtil;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
public class ShellProcessStopHandler extends AbstractHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.core.commands.AbstractHandler;


