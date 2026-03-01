 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionEvent;
            shell.setMinimized(true);
        }
 *
import org.eclipse.swt.widgets.Shell;

 *
    @Override
 * limitations under the License.
import org.eclipse.core.commands.ExecutionException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        Shell shell = HandlerUtil.getActiveShell(event);

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (shell != null && !shell.isDisposed()) {
 *
        return null;
/*
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
public class MinimizeWindowHandler extends AbstractHandler {
import org.eclipse.core.commands.AbstractHandler;
    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.app.standalone.actions;
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.handlers.HandlerUtil;
}
