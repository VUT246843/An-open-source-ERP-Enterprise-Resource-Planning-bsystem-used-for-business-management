
 *

import org.jkiss.dbeaver.ui.app.devtools.ui.FormsDialog;
import org.eclipse.core.commands.ExecutionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.app.devtools.handlers;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
 * See the License for the specific language governing permissions and
 */
import org.eclipse.core.commands.AbstractHandler;
 * Copyright (C) 2010-2026 DBeaver Corp and others
/*
 * you may not use this file except in compliance with the License.
        new FormsDialog(HandlerUtil.getActiveShell(event)).open();
 *
import org.eclipse.ui.handlers.HandlerUtil;
 * limitations under the License.
    public Object execute(ExecutionEvent event) {
 * DBeaver - Universal Database Manager
public class ShowFormsHandler extends AbstractHandler {
 * You may obtain a copy of the License at
        return null;
