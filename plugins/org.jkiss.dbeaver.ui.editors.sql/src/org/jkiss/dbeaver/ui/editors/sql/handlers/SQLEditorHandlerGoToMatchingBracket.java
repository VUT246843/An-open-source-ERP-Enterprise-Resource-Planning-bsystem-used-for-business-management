                }
        if (!visible) {
    private static IRegion getSignedSelection(ISourceViewer sourceViewer) {

        } else {
        int anchor = characterPairMatcher.getAnchor();
            sourceViewer.setSelectedRange(offset + 1, length - 2);
        if (sourceViewer == null) {
            viewerSelection.x = viewerSelection.x + viewerSelection.y;

        boolean visible = false;

import org.eclipse.core.commands.ExecutionEvent;
                return true;
        return null;
 *
            }
        try {
        }
        }

 * Copyright (C) 2010-2024 DBeaver Corp and others
            return;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

            gotoMatchingBracket(
                return true;
        return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
        int offset = region.getOffset();
        int length = region.getLength();
    // copied from JDT code
    @Override
import org.eclipse.jface.text.*;
            sourceViewer.revealRange(targetOffset, direction);
        }
        } catch (BadLocationException e) {
    // copied from JDT code

 * DBeaver - Universal Database Manager
                if (isClosingBracket(document.getChar(offset - 1))) {
        }
        Point selection = text.getSelectionRange();
    private static boolean isClosingBracket(char character) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            return;
import org.jkiss.dbeaver.model.sql.SQLConstants;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        targetOffset += adjustment;


    private void gotoMatchingBracket(SQLEditorBase editor, boolean selectText) {
    }
            visible = (extension.modelOffset2WidgetOffset(targetOffset) > -1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static int getOffsetAdjustment(IDocument document, int offset, int length) {
import org.eclipse.core.commands.ExecutionException;
 *
        int direction = Integer.compare(selection.getLength(), 0);
                    return 1;
        if (editor != null) {
 */
            return 0;
            IRegion visibleRegion = sourceViewer.getVisibleRegion();
                    return -1;


import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        int targetOffset = (ICharacterPairMatcher.RIGHT == anchor) ? offset + 1 : offset + length - 1;

 * You may obtain a copy of the License at

        if (sourceViewer instanceof ITextViewerExtension5 extension) {
        // http://dev.eclipse.org/bugs/show_bug.cgi?id=34195
        IRegion selection = getSignedSelection(sourceViewer);
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
            // http://dev.eclipse.org/bugs/show_bug.cgi?id=34195
            if (character == SQLConstants.BRACKETS[i])
        if (selectText) {
        ISourceViewer sourceViewer = editor.getViewer();
        Point viewerSelection = sourceViewer.getSelectedRange();
            //do nothing
}        for (int i = 0; i < SQLConstants.BRACKETS.length; i += 2) {
            viewerSelection.y = -viewerSelection.y;
    private static boolean isOpeningBracket(char character) {
import org.eclipse.swt.custom.StyledText;
                editor,
import org.eclipse.ui.handlers.HandlerUtil;
                }
    // copied from JDT code

        }

 * limitations under the License.

        int adjustment = getOffsetAdjustment(document, selection.getOffset() + selection.getLength(), selection.getLength());
        IDocument document = sourceViewer.getDocument();
        return false;
            return;

                if (isOpeningBracket(document.getChar(offset))) {

        if (text.getCaretOffset() == selection.x) {
            visible = (targetOffset >= visibleRegion.getOffset() && targetOffset <= visibleRegion.getOffset() + visibleRegion.getLength());
import org.eclipse.swt.graphics.Point;
        return new Region(viewerSelection.x, viewerSelection.y);
        }

        if (region == null) {
    }
        ICharacterPairMatcher characterPairMatcher = editor.getCharacterPairMatcher();
        for (int i = 1; i < SQLConstants.BRACKETS.length; i += 2) {
            } else {
        if (length < 1) {
    }
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        IRegion region = characterPairMatcher.match(document, selection.getOffset());

        } else {
import org.eclipse.jface.text.source.ICharacterPairMatcher;
 * Unless required by applicable law or agreed to in writing, software
                SQLEditorCommands.CMD_SQL_SELECT_TO_MATCHING_BRACKET.equals(event.getCommand().getId()));
            return;
 *
import org.eclipse.jface.text.source.ISourceViewer;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        SQLEditorBase editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditorBase.class);
    }
        StyledText text = sourceViewer.getTextWidget();

        }
            if (length < 0) {
            sourceViewer.setSelectedRange(targetOffset, direction);
    }
        }
        return 0;
public class SQLEditorHandlerGoToMatchingBracket extends AbstractHandler {
        }

            if (character == SQLConstants.BRACKETS[i])
import org.eclipse.core.commands.AbstractHandler;
        if (length == 0 || Math.abs(length) > 1)
        if (document == null) {
/*
        }
