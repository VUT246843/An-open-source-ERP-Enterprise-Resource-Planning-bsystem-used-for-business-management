
                // toggle wrapping
 */
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        // get active editor where word wrap will be toggled
 *
import org.eclipse.core.commands.ExecutionEvent;

    }

}            }
 *
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
                StyledText styledText = (StyledText) text;
public class ToggleWordWrapHandler extends AbstractTextHandler {
import org.eclipse.ui.handlers.HandlerUtil;
 *
                styledText.setWordWrap(!styledText.getWordWrap());
        }
        BaseTextEditor textEditor = BaseTextEditor.getTextEditor(HandlerUtil.getActiveEditor(event));

 * limitations under the License.
package org.jkiss.dbeaver.ui.editors.text.handlers;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import org.eclipse.swt.custom.StyledText;
 * DBeaver - Universal Database Manager
import org.eclipse.swt.widgets.Control;


 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
 * You may obtain a copy of the License at
    public Object execute(ExecutionEvent event) {
 * Unless required by applicable law or agreed to in writing, software
            // editor (ITextEditor) adapter returns StyledText
        if (textEditor != null) {
            Object text = textEditor.getAdapter(Control.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
            if (text instanceof StyledText) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
