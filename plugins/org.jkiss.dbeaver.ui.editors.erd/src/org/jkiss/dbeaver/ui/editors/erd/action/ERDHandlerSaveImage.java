    }
    }
        return null;
import org.eclipse.core.commands.AbstractHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;


import org.eclipse.ui.ISources;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * You may obtain a copy of the License at
 *
import org.eclipse.ui.handlers.HandlerUtil;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (control != null) {
    @Override
import org.eclipse.core.commands.ExecutionEvent;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 */

 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.ui.editors.erd.action;
 *
/*
        }
 * you may not use this file except in compliance with the License.
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
 *
public class ERDHandlerSaveImage extends AbstractHandler {
    public ERDHandlerSaveImage() {
}
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (editor != null) {
                editor.saveDiagramAs();
import org.eclipse.swt.widgets.Control;
import org.eclipse.core.commands.ExecutionException;
            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);

 * Copyright (C) 2010-2025 DBeaver Corp and others
