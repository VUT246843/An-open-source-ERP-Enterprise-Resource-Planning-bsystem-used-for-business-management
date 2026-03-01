import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.ExecutionEvent;
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionException;
        return null;
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.editors.erd.action;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (editor != null) {
 */
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
            }
        if (control != null) {
import org.eclipse.ui.ISources;
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
    }
    public ERDHandlerRefresh() {
 *
import org.eclipse.core.commands.AbstractHandler;


public class ERDHandlerRefresh extends AbstractHandler {
        }
 *

import org.eclipse.swt.widgets.Control;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
                editor.refreshDiagram(true, true);
 * you may not use this file except in compliance with the License.
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    @Override
}
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

    public Object execute(ExecutionEvent event) throws ExecutionException {
            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);
/*
