                                StringBuilder allStrings = new StringBuilder();
            ISelectionProvider provider = textEditor.getSelectionProvider();
                    ITextSelection textSelection = (ITextSelection) selection;
 * Trim trailing and leading spaces of highlighted and non-highlighted text
 *
                                    }
                            int endLine = textSelection.getEndLine();
    public Object execute(ExecutionEvent executionEvent) throws ExecutionException {
                                // Highlighted more than one line - make trim for each row separately
 * See the License for the specific language governing permissions and
                                String trimmedSelection = textSelection.getText().trim();
                        } else {

 * DBeaver - Universal Database Manager
        BaseTextEditor textEditor = BaseTextEditor.getTextEditor(HandlerUtil.getActiveEditor(executionEvent));
                        }
                        log.error("Error reading or replacing text when trimming", e);
                }
                                }
/**
import org.eclipse.jface.text.IDocument;
                            }

}
                    try {
 * limitations under the License.
                if (selection instanceof ITextSelection) {
                            }
    @Override
                    int offset = textSelection.getOffset();
                            // Nothing is highlighted - make trim only for the string on which the cursor is
import org.jkiss.dbeaver.utils.GeneralUtils;
                            int startLine = information.getOffset();
import org.eclipse.jface.viewers.ISelection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                    IRegion lineInformation = document.getLineInformation(i);
import org.eclipse.jface.text.BadLocationException;
            }
 */
import org.eclipse.core.commands.ExecutionException;
                                document.replace(startLine, length, trimmedString);
                                for (int i = startLine; i <= endLine; i++) {
                                    if (i != endLine) {
                                    String untrimmedString = document.get(lineInformation.getOffset(), lineInformation.getLength());
    }
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.handlers.HandlerUtil;
                                }
        if (textEditor != null) {
                            } else {
 * Unless required by applicable law or agreed to in writing, software
                            if (!CommonUtils.isEmpty(untrimmedString)) {
import org.eclipse.jface.text.ITextSelection;
                    } catch (BadLocationException e) {
            if (provider != null && document != null) {
                                document.replace(offset, textSelection.getLength(), allStrings.toString());
                                String lineSeparator = GeneralUtils.getDefaultLineSeparator();
public class TrimTextSpacesHandler extends AbstractTextHandler {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static final Log log = Log.getLog(TrimTextSpacesHandler.class);
 *
import org.eclipse.core.commands.ExecutionEvent;

import org.eclipse.jface.text.IRegion;

                                    document.replace(offset, textSelection.getLength(), trimmedSelection);
 *
                            String untrimmedString = document.get(startLine, length);
                            int length = offset - startLine;
                            IRegion information = document.getLineInformationOfOffset(offset);
                                    allStrings.append(untrimmedString.trim());
            IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
                ISelection selection = provider.getSelection();
                        if (textSelection.getLength() > 0) {
                                        allStrings.append(lineSeparator);
                                if (!CommonUtils.isEmpty(trimmedSelection)) {


                    }
/*
                            String trimmedString = untrimmedString.trim();
        }
                            if (startLine != endLine) {


 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
                                // Make trim only for the highlighted area of the string
package org.jkiss.dbeaver.ui.editors.text.handlers;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
 * You may obtain a copy of the License at
                            int startLine = textSelection.getStartLine();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.viewers.ISelectionProvider;
        return null;
