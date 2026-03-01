    @Override
public class HandlerDialog extends AbstractHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
}
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.
import org.eclipse.core.commands.ExecutionException;
 */
        testDialog.open();

import org.eclipse.core.commands.AbstractHandler;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.app.devtools.handlers;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        TestDialog testDialog = new TestDialog(HandlerUtil.getActiveShell(event));
import org.eclipse.ui.handlers.HandlerUtil;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ui.app.devtools.ui.TestDialog;

 *
/*
 *
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionEvent;
 *
