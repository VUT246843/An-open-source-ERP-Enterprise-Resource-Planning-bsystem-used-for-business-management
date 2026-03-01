 *
import org.eclipse.ui.ISources;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
import org.eclipse.swt.widgets.Control;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

package org.jkiss.dbeaver.ui.editors.erd.action;
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
 */
import org.eclipse.ui.handlers.HandlerUtil;
                selectAllAction.run();
        return null;

    @Override
        }
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gef.ui.actions.SelectAllAction;
            if (editor != null) {
                SelectAllAction selectAllAction = new SelectAllAction(editor);
 *

        if (control != null) {
public class ERDHandlerSelectAll extends AbstractHandler {
            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);
 * Unless required by applicable law or agreed to in writing, software
 *
            }
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
    public ERDHandlerSelectAll() {
    }
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import org.eclipse.core.commands.ExecutionEvent;


/*
 * DBeaver - Universal Database Manager
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
