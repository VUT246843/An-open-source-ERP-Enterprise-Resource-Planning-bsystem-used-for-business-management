                        }
 * This class contains all of the shared functionality for comment handlers
                ISelectionProvider provider = textEditor.getSelectionProvider();
            IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
import org.eclipse.ui.handlers.HandlerUtil;

        BaseTextEditor textEditor = BaseTextEditor.getTextEditor(HandlerUtil.getActiveEditor(event));
import org.eclipse.core.commands.ExecutionException;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.viewers.ISelection;
 * you may not use this file except in compliance with the License.
                    if (selection instanceof ITextSelection) {
import org.eclipse.jface.viewers.ISelectionProvider;
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
 *

                                log.warn(e);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.ICommentsSupport;
                }
import org.eclipse.jface.text.BadLocationException;
package org.jkiss.dbeaver.ui.editors.text.handlers;
                                processAction(textEditor.getSelectionProvider(), commentsSupport, document, textSelection);
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (document != null && commentsSupport != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

            ICommentsSupport commentsSupport = textEditor.getCommentsSupport();
                        ITextSelection textSelection = (ITextSelection) selection;
 * limitations under the License.
                    ISelection selection = provider.getSelection();
        return null;
import org.eclipse.core.commands.ExecutionEvent;
    protected abstract void processAction(ISelectionProvider selectionProvider, ICommentsSupport commentsSupport, IDocument document, ITextSelection textSelection) throws BadLocationException;
                            } catch (BadLocationException e) {
                if (provider != null) {
                // get current text selection
                            }
    }


public abstract class AbstractCommentHandler extends AbstractTextHandler {
import org.eclipse.jface.text.ITextSelection;
 */
                    }
 * DBeaver - Universal Database Manager
                        if (!textSelection.isEmpty()) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.Log;
    public final Object execute(ExecutionEvent event) throws ExecutionException {
            }
 */
        }
 *
        if (textEditor != null) {
/*

                            try {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.text.IDocument;
 * You may obtain a copy of the License at
    static protected final Log log = Log.getLog(AbstractCommentHandler.class);
}
 * Unless required by applicable law or agreed to in writing, software
/**
