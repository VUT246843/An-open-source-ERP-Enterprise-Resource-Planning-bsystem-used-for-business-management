 * You may obtain a copy of the License at
    }
import org.eclipse.ui.IEditorPart;
import org.eclipse.core.commands.ExecutionEvent;
 * you may not use this file except in compliance with the License.
 *
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.core.commands.ExecutionException;

}

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.jface.text.source.SourceViewer;
            if (textViewer instanceof TextViewer) {
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (((TextViewer) textViewer).canDoOperation(SourceViewer.FORMAT)) {

    public ContentFormatHandler() {
 * Unless required by applicable law or agreed to in writing, software
public class ContentFormatHandler extends AbstractHandler {
                StyledText textWidget = textViewer.getTextWidget();
        if (activeEditor instanceof ContentEditor) {
                    }
                textWidget.setEditable(true);
package org.jkiss.dbeaver.ui.editors.content;
 */
 *
    }
                boolean oldEditable = textWidget.getEditable();
        }
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);

            IEditorPart editorPart = ((ContentEditor) activeEditor).getActiveEditor();

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.handlers.HandlerUtil;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                try {
                } finally {
import org.eclipse.jface.text.TextViewer;
            ITextViewer textViewer = editorPart.getAdapter(ITextViewer.class);
 * limitations under the License.

                    textWidget.setEditable(oldEditable);
 *
        return null;
            }
                        ((TextViewer) textViewer).doOperation(SourceViewer.FORMAT);
 * Copyright (C) 2010-2024 DBeaver Corp and others
