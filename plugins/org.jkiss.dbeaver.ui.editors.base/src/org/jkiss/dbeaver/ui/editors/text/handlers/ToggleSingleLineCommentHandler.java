 *     http://www.apache.org/licenses/LICENSE-2.0
                        break;
            rewriteSession = ((IDocumentExtension4) document).startRewriteSession(DocumentRewriteSessionType.SEQUENTIAL);
        if (ArrayUtils.isEmpty(singleLineComments)) {
                forceComment = false;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (document instanceof IDocumentExtension4) {
        }
            } else {
                        selLength -= lineComment.length();
                        break;
        
            ((IDocumentExtension4) document).stopRewriteSession(rewriteSession);
        
 * limitations under the License.
                for (int i = 0; i < lineText.length(); i++) {
        String firstLineText = document.get(document.getLineOffset(startLine), document.getLineLength(startLine)).trim();
import org.eclipse.jface.text.*;
        DocumentRewriteSession rewriteSession = null;
        String[] singleLineComments = commentsSupport.getSingleLineComments();
        if (rewriteSession != null) {
            int lineOffset = document.getLineOffset(lineNum);
                }
                        lineComment = commentString;
 * DBeaver - Universal Database Manager
    }
            int lineLength = document.getLineLength(lineNum);
                        }
        int selOffset = textSelection.getOffset();
                    // Remove comment
                    }
        int endLine = textSelection.getEndLine();
        int startLine = textSelection.getStartLine();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.text.handlers;
                    selLength += singleLineComments[0].length();
                    if (Character.isWhitespace(lineText.charAt(i))) {
                    if (lineText.startsWith(commentString, checkOffset)) {
            return;
 * Unless required by applicable law or agreed to in writing, software
                // Add comment
                String lineComment = null;
        
                } else {
 * See the License for the specific language governing permissions and
                }
        for (String commentString : singleLineComments) {
/*
                    } else {
    protected void processAction(ISelectionProvider selectionProvider, ICommentsSupport commentsSupport, IDocument document, ITextSelection textSelection) throws BadLocationException {
        }
import org.eclipse.jface.viewers.ISelectionProvider;
                }
        int originalOffset = textSelection.getOffset();
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    
                    if (lineNum == startLine && originalOffset != lineOffset) {
import org.jkiss.dbeaver.ui.ICommentsSupport;
            selectionProvider.setSelection(new TextSelection(selOffset, selLength));
        int selLength = originalLength;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
                if (lineComment != null) {
        boolean forceComment = true;
                        checkOffset++;

            // Single line comments are not supported
    @Override
import org.jkiss.utils.ArrayUtils;
            }
 *
        }
        int originalLength = textSelection.getLength();
                String lineText = document.get(lineOffset, lineLength);
            }
        }
                    }
                    }
                if (lineNum == startLine) {
                    document.replace(lineOffset + checkOffset, lineComment.length(), "");
                int checkOffset = 0;
                        selOffset = lineOffset;
            if (forceComment) {
 *
        }

}                break;
 *
        }
                for (String commentString : singleLineComments) {
                }
                            selLength -= lineComment.length() - originalOffset + lineOffset;
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (int lineNum = endLine; lineNum >= startLine; lineNum--) {
        if (originalLength > 0) {

 */
public final class ToggleSingleLineCommentHandler extends AbstractCommentHandler {
                        if (lineComment.length() + lineOffset > originalOffset) {
            if (firstLineText.startsWith(commentString)) {
                        selOffset = Math.max(lineOffset, originalOffset - lineComment.length());
                document.replace(lineOffset, 0, singleLineComments[0]);
                    } else {
                    selOffset += singleLineComments[0].length();
