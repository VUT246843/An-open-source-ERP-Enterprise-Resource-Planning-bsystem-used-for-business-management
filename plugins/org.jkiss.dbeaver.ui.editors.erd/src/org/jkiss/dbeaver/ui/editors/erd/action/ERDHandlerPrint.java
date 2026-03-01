            editor.printDiagram();
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
/*
 */

    }
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.eclipse.core.commands.ExecutionEvent;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

 * DBeaver - Universal Database Manager
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ERDEditorPart editor = null;
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
 *
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
    public ERDHandlerPrint() {
import org.eclipse.core.commands.AbstractHandler;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
}
import org.eclipse.ui.ISources;
 * you may not use this file except in compliance with the License.
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (editor == null) {
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Control;

public class ERDHandlerPrint extends AbstractHandler {
            if (activeEditor != null) {
package org.jkiss.dbeaver.ui.editors.erd.action;
        }
            editor = ERDEditorAdapter.getEditor(control);

                editor = new ERDEditorAdapter().getAdapter(activeEditor, ERDEditorPart.class);
        if (control != null) {
            Object activeEditor = HandlerUtil.getVariable(event, ISources.ACTIVE_EDITOR_NAME);
 * Copyright (C) 2010-2025 DBeaver Corp and others

        return null;
 *
            }
        if (editor != null) {
