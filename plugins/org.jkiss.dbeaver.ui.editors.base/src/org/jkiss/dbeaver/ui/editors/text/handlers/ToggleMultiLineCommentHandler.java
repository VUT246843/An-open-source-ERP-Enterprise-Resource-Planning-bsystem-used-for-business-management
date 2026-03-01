                document.replace(selection.getOffset(), 0, comment.getFirst() + (useLineFeeds ? lineDelimiter : ""));
 * DBeaver - Universal Database Manager
            document.replace(selection.getOffset(), selection.getLength(), newSel);
                int endOffset = selOffset + selLength;
        Pair<String,String> comment = commentsSupport.getMultiLineComments();
            while (lineDelimiter.indexOf(selText.charAt(endPos)) != -1) {
        boolean isMultiLine = selection.getStartLine() != selection.getEndLine() || selText.contains(lineDelimiter);
            if (isMultiLine) {
            }
            selLength -= (selText.length() - newSel.length());
                document.replace(selection.getOffset() + selection.getLength(), 0, comment.getSecond() + (useLineFeeds ? lineDelimiter : ""));
        } else {
                boolean firstAtBegin = document.getLineOffset(selection.getStartLine()) == selOffset;
public final class ToggleMultiLineCommentHandler extends AbstractCommentHandler {
/*
import org.jkiss.utils.Pair;
        int selLength = selection.getLength();

 *
        if (rewriteSession != null) {
 *
                // Determine - whether we need to insert extra line feeds
            String newSel = selText.substring(startPos, endPos);
        if (document instanceof IDocumentExtension4) {
        int selOffset = selection.getOffset();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        }
        }
package org.jkiss.dbeaver.ui.editors.text.handlers;
    {
        DocumentRewriteSession rewriteSession = null;
        }
        }
            int startPos = selText.indexOf(comment.getFirst()) + comment.getFirst().length();
 * you may not use this file except in compliance with the License.
    }
        if (selLength > 0) {
            // Multi line comments are not supported
                boolean secondAtBegin = document.getLineOffset(document.getLineOfOffset(endOffset)) == endOffset;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
        String selText = selection.getText();
        if (comment == null) {
            rewriteSession = ((IDocumentExtension4) document).startRewriteSession(DocumentRewriteSessionType.SEQUENTIAL);
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
            // Add comment
                boolean useLineFeeds = firstAtBegin && secondAtBegin;
                selLength += comment.getFirst().length() + comment.getSecond().length();
            // Remove comments (also remove all extra line feeds)
            while (lineDelimiter.indexOf(selText.charAt(startPos)) != -1) {
    @Override

import org.jkiss.dbeaver.ui.ICommentsSupport;
            selectionProvider.setSelection(new TextSelection(selOffset, selLength));
 * Licensed under the Apache License, Version 2.0 (the "License");

                endPos--;
            ((IDocumentExtension4) document).stopRewriteSession(rewriteSession);

        if (testText.startsWith(comment.getFirst()) && testText.endsWith(comment.getSecond())) {
                document.replace(selection.getOffset(), selection.getLength(), comment.getFirst() + selText + comment.getSecond());
                startPos++;
 * limitations under the License.
            }
    protected void processAction(ISelectionProvider selectionProvider, ICommentsSupport commentsSupport, IDocument document, ITextSelection selection) throws BadLocationException
                // We use it only if begin and end of selection is on the beginning of line
            }
import org.eclipse.jface.text.*;
        }
 *
        String lineDelimiter = TextUtilities.getDefaultLineDelimiter(document);
 * Copyright (C) 2010-2024 DBeaver Corp and others

        String testText = selText.trim();
                selLength += comment.getFirst().length() + comment.getSecond().length() + (useLineFeeds ? lineDelimiter.length() * 2 : 0);
            return;
 *     http://www.apache.org/licenses/LICENSE-2.0


            } else {
import org.eclipse.jface.viewers.ISelectionProvider;
            int endPos = selText.lastIndexOf(comment.getSecond());
