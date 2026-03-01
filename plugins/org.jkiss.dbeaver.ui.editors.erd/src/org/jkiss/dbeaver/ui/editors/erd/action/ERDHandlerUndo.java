        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);

import org.eclipse.swt.widgets.Control;
package org.jkiss.dbeaver.ui.editors.erd.action;
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
    }
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.eclipse.core.commands.AbstractHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    public ERDHandlerUndo() {
import org.eclipse.core.commands.ExecutionException;

        if (control != null) {

 * Licensed under the Apache License, Version 2.0 (the "License");

                editor.getCommandStack().undo();
    }
 * limitations under the License.

 *
 */
        return null;
            }
 * Unless required by applicable law or agreed to in writing, software
            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.ui.handlers.HandlerUtil;
}
 * DBeaver - Universal Database Manager
 *
 *
    @Override
public class ERDHandlerUndo extends AbstractHandler {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            if (editor != null && editor.getCommandStack().canUndo()) {
import org.eclipse.ui.ISources;
