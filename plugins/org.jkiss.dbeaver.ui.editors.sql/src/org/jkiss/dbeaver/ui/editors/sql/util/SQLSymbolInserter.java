                    level.offset = offset;
import org.eclipse.swt.events.VerifyEvent;
                ++end;
                        return;

    {
                        // don't enter the character if if its the closing peer

    }
            int maxEnd = endLine.getOffset() + endLine.getLength();
        switch (character) {
                return editor.getSyntaxManager().getEscapeChar();
                        if (!Character.isJavaIdentifierPart(document.getChar(curOffset - 1))) {
                    final char closingCharacter = getPeerCharacter(character);
                return 0;
                    sourceViewer.setSelectedRange(newSelection.getOffset(), newSelection.getLength());
                    model.addLinkingListener(this);
        final SymbolLevel level = bracketLevelStack.remove(bracketLevelStack.size() - 1);
import org.eclipse.ui.IWorkbenchWindow;

                        try {
            return;
        }
    }
    @Override
        int length;
    private String getSelection() {
                    log.debug(e);

            log.debug(e);

            IRegion endLine = document.getLineInformationOfOffset(end);
        }
            IRegion endLine = document.getLineInformationOfOffset(end);

                    return;
            }
                    document.addPosition(CATEGORY, level.secondPosition);
                    }
                    ITypedRegion partitionBeforeCursor = offset > 0

            // be conservative
                    document.replace(offset, length, String.valueOf(character)+ getSelection() + closingCharacter);
    private boolean closeSingleQuotes = true;
import org.eclipse.ui.PlatformUI;
     * @see org.eclipse.jface.text.link.ILinkedModeListener#resume(org.eclipse.jface.text.link.LinkedModeModel, int)
    @Override
        private static class EditorHistoryUpdater implements ILinkedModeUIFocusListener {

    public static class EditorLinkedModeUI extends LinkedModeUI {

 *
    public void verifyKey(VerifyEvent event) {
                    LinkedModeModel model = new LinkedModeModel();
        if(selection == null) {
    {
        final int size;
    private boolean hasIdentifierToTheRight(IDocument document, int offset)


                ++end;
                    level.firstPosition = new Position(offset, 1);
 * Unless required by applicable law or agreed to in writing, software
    public char getEscapeCharacter(char character)
                    while (curOffset > 0) {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
                        document.removePositionUpdater(positionUpdater);

                {


        }
            return false;
                        ) {
    /*


    private SQLEditorBase editor;
    }
 * limitations under the License.
            // be conservative
        public EditorLinkedModeUI(LinkedModeModel model, ITextViewer viewer) {
                catch (BadLocationException | BadPositionCategoryException e) {
                return escapeCharacter == document.getChar(offset - 1);
 * DBeaver - Universal Database Manager
                        return;
        catch (BadLocationException e) {
        final IDocument document = sourceViewer.getDocument();
//                    }
        IDocument document = sourceViewer.getDocument();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            return null;
                        if (template != null && template.isAutoInsertable()
import org.eclipse.swt.custom.VerifyKeyListener;
 *
                    log.debug(e);
            public void linkingFocusLost(LinkedPosition position, LinkedModeUITarget target) {

import org.eclipse.jface.text.*;
                if (event.character == '\'') {
                }
            return;
                        catch (BadLocationException e) {
        if (flags != ILinkedModeListener.EXTERNAL_MODIFICATION) {
            IRegion startLine = document.getLineInformationOfOffset(offset);
                IWorkbenchWindow win= PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    @Override
        {

import java.util.ArrayList;
        {

                        curOffset--;
            @Override
                    level.secondPosition = new Position(offset + 1, 1);
        if (!event.doit) {
                            templatesPage.insertTemplate(template, document);

                    if (!closeSingleQuotes) {
            catch (BadLocationException e) {
                    if (offset < document.getLength() && !Character.isWhitespace(document.getChar(offset + length))) {
                        Template template = templatesPage.getTemplateStore().findTemplate(templateName);
                    ITypedRegion partitionAtCursor = TextUtilities.getPartition(
            public void linkingFocusGained(LinkedPosition position, LinkedModeUITarget target) {

                    }

                    }
            super(model, viewer);
        }
        }
import org.eclipse.ui.IWorkbenchPage;
                    }

                            document.removePositionCategory(CATEGORY);
                // fall through

                throw new IllegalArgumentException();
                            // do nothing
        try {
                            && SQLEditorUtils.isTemplateContextFitsEditorContext(template.getContextTypeId(), editor)
    }
                        offset,
            int end = offset;
                }
        }
                }
            while (end != maxEnd && Character.isWhitespace(document.getChar(end))) {
                    level.uI.setSimpleMode(true);
        }
                }
                    LinkedPositionGroup group = new LinkedPositionGroup();
                    // set up position tracking for our magic peers
                    }
    }
//                        curOffset--;
                        }
                    );
            log.debug(e);
                    model.addGroup(group);
                    event.doit = false;

                        || hasIdentifierToTheRight(document, offset + length)) {
                        || hasIdentifierToTheRight(document, offset + length)) {
            return offset != minStart && Character.isJavaIdentifierPart(document.getChar(offset - 1));
    {
                        true
        closeSingleQuotes = enabled;
        public ExitPolicy(char exitCharacter, char escapeCharacter, List<SymbolLevel> stack)
                if (win != null) {
                        String templateName = document.get(curOffset, offset - curOffset);
                    }
//                    if (curOffset == document.getLength()) {

                    log.debug(e);
            extension.registerPostNotificationReplace(null, new IDocumentExtension.IReplace() {
                    level.uI.setExitPosition(sourceViewer, offset + 2, 0, Integer.MAX_VALUE);
            case '(':
import org.eclipse.jface.text.link.LinkedModeUI.ExitFlags;
                    

     */
    }
            while (end != maxEnd && Character.isWhitespace(document.getChar(end)))

                    group.addPosition(new LinkedPosition(document, offset + 1, 0, LinkedPositionGroup.NO_STOP));


    {
                    if (bracketLevelStack.size() == 1) {
                    if (bracketLevelStack.size() == 0) {
        closeBrackets = enabled;
            case ')': return '(';
        	return null;
                    }
//                        endOffset--;
 * You may obtain a copy of the License at
            return end != maxEnd && Character.isJavaIdentifierPart(document.getChar(end));
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        try {
        }
                        && partitionBeforeCursor != null && !IDocument.DEFAULT_CONTENT_TYPE.equals(partitionBeforeCursor.getType())
                    }
        catch (BadLocationException e) {
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplatesPage;
    public void setCloseSingleQuotesEnabled(boolean enabled)
        closeDoubleQuotes = enabled;
            case '[':
                    if (level.secondPosition.offset == offset && length == 0) {
    public static char getPeerCharacter(char character)
    /*
import org.eclipse.swt.SWT;
            this.exitCharacter = exitCharacter;


                    level.uI.enter();
                        return;
import org.eclipse.jface.text.source.ISourceViewer;

                break;
    private boolean hasIdentifierToTheLeft(IDocument document, int offset)
import org.eclipse.jface.text.templates.Template;
            case SWT.TAB: {
                    }
            case '\'':
    private ISourceViewer sourceViewer;
                    if (hasIdentifierToTheLeft(document, offset)
        return selection.getText();
                    level.length = 2;
        public ExitFlags doExit(LinkedModeModel model, VerifyEvent event, int offset, int length)
        final char escapeCharacter;
                    IWorkbenchPage page= win.getActivePage();
                            event.doit = false;
                        page.getNavigationHistory().markLocation(part);

    {
    private boolean closeBrackets = true;
        switch (event.character) {
import org.eclipse.ui.IEditorPart;
                        try {
                    level.uI.setCyclingMode(LinkedModeUI.CYCLE_NEVER);
    }

                    if (!editor.validateEditorInputState()) {
                    }
    private static class SymbolLevel {
            }

                if (size == stack.size() && !isMasked(offset)) {
                            sourceViewer.setSelectedRange(curOffset, offset - curOffset);
                // fall through
                }
        try {
            return true;
            }
    {
            }
            }
                if (event.character == '"') {
            this.escapeCharacter = escapeCharacter;
            int end = offset;
                    }
        int offset;
            case '[': return ']';

 * you may not use this file except in compliance with the License.
import java.util.List;
     */
                    if (hasIdentifierToTheLeft(document, offset)

                    int curOffset = offset;
            }

                        return;
            try {
        this.editor = editor;
                if (hasCharacterToTheRight(document, offset + length, event.character)) {
                    if (!closeDoubleQuotes) {
        }
            }

                    if ((level.firstPosition.isDeleted || level.firstPosition.length == 0)

    @Override
    }
            return null;
    public SQLSymbolInserter(SQLEditorBase editor)
                        }
                    document.addPosition(CATEGORY, level.firstPosition);
}    }
                }
    public void suspend(LinkedModeModel environment)
    {
                        }
        final int length = selection.y;
                if (!closeBrackets) {
    private class ExitPolicy implements IExitPolicy {
                    SymbolLevel level = new SymbolLevel();

            case '\'': return character;
                } catch (BadLocationException e) {
     */
                    }
    	ISelectionProvider selectionProvider = editor.getSelectionProvider();
                    SymbolLevel level = stack.get(stack.size() - 1);
    }
                    }
                        }

    }
            size = this.stack.size();
            int maxEnd = endLine.getOffset() + endLine.getLength();
    private List<SymbolLevel> bracketLevelStack = new ArrayList<>();
     * @see org.eclipse.jface.text.link.ILinkedModeListener#suspend(org.eclipse.jface.text.link.LinkedModeModel)
package org.jkiss.dbeaver.ui.editors.sql.util;

                        document.addPositionCategory(CATEGORY);
        {

                    model.forceInstall();
        this.sourceViewer = editor.getViewer();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return end != maxEnd && document.getChar(end) == character;
        final List<SymbolLevel> stack;
    private boolean closeDoubleQuotes = true;
                // mark navigation history
    {
        }
            }
                try {
        }
    {
                        ? TextUtilities.getPartition(document, SQLParserPartitions.SQL_PARTITIONING, offset - 1, true)
                        return null;
                } catch (BadLocationException e) {
            return true;
        Position firstPosition;
                    level.uI.setExitPolicy(new ExitPolicy(closingCharacter, getEscapeCharacter(closingCharacter), bracketLevelStack));
                }
                }
            default:
                    return;
/*
                public void perform(IDocument d, IDocumentListener owner)
                @Override
        }
                    if (level.firstPosition.offset > offset || level.secondPosition.offset < offset) {
                        catch (BadPositionCategoryException e) {
 * See the License for the specific language governing permissions and
                        SQLTemplatesPage templatesPage = editor.getTemplatesPage();
        switch (character) {
                    }
            return;
    
        final Point selection = sourceViewer.getSelectedRange();
    private final String CATEGORY = toString();
                    ) {
        final int offset = selection.x;
            case '"': return character;
                try {
        catch (BadLocationException e) {
            return true;
                        SQLParserPartitions.SQL_PARTITIONING,
        }

            this.stack = stack;
                        && !level.secondPosition.isDeleted
    public void setCloseDoubleQuotesEnabled(boolean enabled)
 * Licensed under the Apache License, Version 2.0 (the "License");
            );

            int minStart = startLine.getOffset();

            case '(': return ')';
                        return;
 */
        final char exitCharacter;


    public void left(LinkedModeModel environment, int flags)
                            document.replace(level.secondPosition.offset, level.secondPosition.length, null);
import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
     * @see org.eclipse.jface.text.link.ILinkedModeListener#left(org.eclipse.jface.text.link.LinkedModeModel, int)
        }
    }
    {
            case '"':
            log.debug(e);
        if (editor.isBlockSelectionModeEnabled()) {
                        document.addPositionUpdater(positionUpdater);
        LinkedModeUI uI;
        }
        }
import org.eclipse.jface.text.link.*;

            case '\'':
    static protected final Log log = Log.getLog(SQLSymbolInserter.class);
        }
                            break;
                    final char character = event.character;


            default:
            IDocument document = sourceViewer.getDocument();
        if (document instanceof IDocumentExtension) {
                }
                        return;
                            // do nothing
                    if (!IDocument.DEFAULT_CONTENT_TYPE.equals(partitionAtCursor.getType())
                break;
                        return new ExitFlags(ILinkedModeListener.UPDATE_CARET, false);
        }




                        document,
        // remove brackets
        }
            case ']': return '[';

import org.eclipse.jface.text.link.LinkedModeUI.IExitPolicy;
    {
import org.eclipse.jface.viewers.ISelectionProvider;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (curOffset != offset) {
                    return;
            @Override
                    bracketLevelStack.add(level);
                        && partitionAtCursor.getOffset() != offset
                        }
                        return;
                        && level.secondPosition.offset == level.firstPosition.offset) {
 *
            if (event.character == exitCharacter) {
    /*
            case '"':
    }
                        }
                log.debug(e);
import org.jkiss.dbeaver.Log;
    public void setCloseBracketsEnabled(boolean enabled)
        @Override
                    if (page != null) {
        private boolean isMasked(int offset)
                }

                }
                    }
            IDocumentExtension extension = (IDocumentExtension) document;
        if (selectionProvider == null) {
                        IEditorPart part= page.getActiveEditor();
    }
                    level.uI = new EditorLinkedModeUI(model, sourceViewer);
public class SQLSymbolInserter implements VerifyKeyListener, ILinkedModeListener {
        ITextSelection selection = (ITextSelection) selectionProvider.getSelection();
    {
        }


            setPositionListener(new EditorHistoryUpdater());
    }

        Position secondPosition;

import org.eclipse.swt.graphics.Point;
    private boolean hasCharacterToTheRight(IDocument document, int offset, char character)

    public void resume(LinkedModeModel environment, int flags)
    private IPositionUpdater positionUpdater = new ExclusivePositionUpdater(CATEGORY);
                        : null;
                try {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    IRegion newSelection = level.uI.getSelectedRegion();
