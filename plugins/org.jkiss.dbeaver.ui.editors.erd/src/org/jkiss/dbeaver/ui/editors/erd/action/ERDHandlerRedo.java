import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (editor != null && editor.getCommandStack().canRedo()) {
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
import org.eclipse.core.commands.ExecutionEvent;
 *
import org.eclipse.core.commands.ExecutionException;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
/*
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.commands.AbstractHandler;

        if (control != null) {



            }
 *
    @Override
import org.eclipse.ui.ISources;
                editor.getCommandStack().redo();
 * Copyright (C) 2010-2025 DBeaver Corp and others
            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);
import org.eclipse.swt.widgets.Control;
        return null;
public class ERDHandlerRedo extends AbstractHandler {
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.erd.action;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * DBeaver - Universal Database Manager
import org.eclipse.ui.handlers.HandlerUtil;
}
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
 * limitations under the License.
 */
