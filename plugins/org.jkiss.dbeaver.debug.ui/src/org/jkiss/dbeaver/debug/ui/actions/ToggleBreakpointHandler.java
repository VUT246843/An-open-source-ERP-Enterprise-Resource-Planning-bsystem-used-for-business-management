import org.eclipse.jface.text.source.IVerticalRulerInfo;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.handlers.HandlerUtil;
 * limitations under the License.
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ToggleBreakpointHandler extends AbstractHandler implements IHandler {
import org.eclipse.core.commands.IHandler;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                    action.runWithEvent(new Event());
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
import org.eclipse.core.commands.ExecutionException;
        if (activeEditor != null) {
import org.eclipse.swt.widgets.Event;

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
            if (sqlEditor != null) {
 *
 * you may not use this file except in compliance with the License.

        }
 *
                    IVerticalRulerInfo rulerInfo = sqlEditor.getAdapter(IVerticalRulerInfo.class);
 * You may obtain a copy of the License at
import org.eclipse.jface.text.ITextViewer;
                    ToggleBreakpointAction action = new ToggleBreakpointAction(sqlEditor, textViewer.getDocument(), rulerInfo);
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return null;
            SQLEditorBase sqlEditor = activeEditor.getAdapter(SQLEditorBase.class);

import org.eclipse.debug.ui.actions.ToggleBreakpointAction;
import org.eclipse.core.commands.AbstractHandler;
                ITextViewer textViewer = sqlEditor.getAdapter(ITextViewer.class);
import org.eclipse.ui.IEditorPart;
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
 * DBeaver - Universal Database Manager
                if (textViewer != null) {
/*
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

 *
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.debug.ui.actions;
