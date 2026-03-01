    private static final String PARAMETER_FOCUS= "org.jkiss.dbeaver.erd.focus.parameter";

                break;
            case DIAGRAM_FOCUS:
import org.eclipse.core.commands.AbstractHandler;
    private static final String DIAGRAM_FOCUS = "org.jkiss.dbeaver.erd.focus.diagram";
    }
        }
                break;
                ERDUIUtils.openProperties();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
import org.eclipse.core.commands.ExecutionException;
        return editor;
    private static final String PALETTE_FOCUS = "org.jkiss.dbeaver.erd.focus.palette";
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
            default:
                editor = new ERDEditorAdapter().getAdapter(activeEditor, ERDEditorPart.class);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                part.getViewer().getControl().forceFocus();
 * You may obtain a copy of the License at
 *
import org.eclipse.core.commands.ExecutionEvent;
 *     http://www.apache.org/licenses/LICENSE-2.0

        ERDEditorPart editor = null;
                if (adapter instanceof EditDomain && ((EditDomain) adapter).getPaletteViewer() != null) {
        }
            case PALETTE_FOCUS:
    }
        if (editor == null) {
                    ((EditDomain) adapter).getPaletteViewer().getControl().setFocus();
            }
    private static final String OUTLINE_FOCUS = "org.jkiss.dbeaver.erd.focus.outline";
import org.eclipse.ui.ISources;
        ERDEditorPart part = getPart(event);
 *
        return null;
        if (part == null) {
import org.eclipse.swt.widgets.Control;
        }
 * Unless required by applicable law or agreed to in writing, software
public class ERDHandlerFocus extends AbstractHandler {

}

    @Override
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
                break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        switch (event.getCommand().getId()) {
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * See the License for the specific language governing permissions and
            if (activeEditor != null) {
 */
            Object activeEditor = HandlerUtil.getVariable(event, ISources.ACTIVE_EDITOR_NAME);
                Object adapter = part.getAdapter(EditDomain.class);
                ERDUIUtils.openOutline();
/*
package org.jkiss.dbeaver.ui.editors.erd.action;
            case OUTLINE_FOCUS:
                }
            case PARAMETER_FOCUS:
            editor = ERDEditorAdapter.getEditor(control);
    
    private ERDEditorPart getPart(ExecutionEvent event) {

import org.eclipse.gef.EditDomain;
            return null;
                break;
        if (control != null) {
import org.jkiss.dbeaver.ui.editors.erd.ERDUIUtils;
 *
import org.eclipse.ui.handlers.HandlerUtil;
                throw new IllegalStateException("Unexpected value: " + event.getCommand().getId());
 * DBeaver - Universal Database Manager
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * you may not use this file except in compliance with the License.
