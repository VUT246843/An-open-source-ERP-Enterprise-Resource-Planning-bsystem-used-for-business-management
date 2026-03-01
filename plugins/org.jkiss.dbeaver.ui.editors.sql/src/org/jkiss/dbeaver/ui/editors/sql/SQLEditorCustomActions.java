        protected void setCaretPosition(final int position) {
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLWordBreakIterator;
import org.eclipse.jface.text.IDocument;
                ITextViewerExtension5 extension = (ITextViewerExtension5) viewer;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
                if (next != BreakIterator.DONE)
        public int previous() {
            IDocument document = viewer.getDocument();

                    if (ch != '\n' && ch != '\r') {
                    return false;
                    }
    protected abstract static class NextSubWordAction extends BaseTextNavigateAction {
                    if (previousLinkedPosition != null) {
                int position = widgetOffset2ModelOffset(viewer.getTextWidget().getCaretOffset());
        editor.setAction(ITextEditorActionDefinitionIds.WORD_PREVIOUS, new NavigatePreviousSubWordAction(editor));
        textWidget.setKeyBinding(SWT.CTRL | SWT.ARROW_LEFT, SWT.NULL);
        }
        protected final SQLEditorBase editor;
                return false;
            }
        }

            this.index = this.preceding(this.index);
    }
        private int index;

                if (n <= 0 || next == -1) {
                        if (position != nextLinkedPositionOffset && nextLinkedPositionOffset < next)
            while (true) {
 */

        }
import org.eclipse.jface.text.source.ISourceViewer;
                }
                } else {
        }
                int second = this.sqlIterator.following(first);
                return extension.widgetOffset2ModelOffset(widgetOffset);
            if (viewer instanceof ITextViewerExtension5) {
                    text.setSelectionRange(selection.y, offset - selection.y);

import org.eclipse.swt.custom.ST;
                log.debug(e);


                    getTextWidget().showSelection();



         * Finds the next position after the given position.
        }
        public int next() {
        }
                }
        }


                }
        }
import org.eclipse.ui.texteditor.TextNavigationAction;
        }
        public void run() {
                    if (position != linkedPositionEnd && linkedPositionEnd < next)
                if (position == -1)

        }
    protected static class SelectNextSubWordAction extends NextSubWordAction {

        protected NextSubWordAction(SQLEditorBase editor, String actionDefinitionId, int code) {
            int first = this.sqlIterator.preceding(offset);
    }
            final IDocument document = viewer.getDocument();
            IDocument document = viewer.getDocument();
            final ISourceViewer viewer = getSourceViewer();
                }
        }

            getTextWidget().setCaretOffset(modelOffset2WidgetOffset(position));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            super(editor, ITextEditorActionDefinitionIds.WORD_PREVIOUS, ST.WORD_PREVIOUS);
                        if (position != previousLinkedPositionEnd && previous < previousLinkedPositionEnd)
        public SQLWordIterator() {
import org.eclipse.jface.text.link.LinkedPosition;

            int first = this.sqlIterator.following(offset);
    protected static class NavigateNextSubWordAction extends NextSubWordAction {
                            next = nextLinkedPositionOffset;

                int next = findNextPosition(position);
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLDocumentCharacterIterator;
                previous = wordIterator.preceding(previous);
    static protected final Log log = Log.getLog(SQLEditorCustomActions.class);
                    }
                    int linkedPositionEnd = linkedPosition.getOffset() + linkedPosition.getLength();
        }
            LinkedModeModel model = LinkedModeModel.getModel(document, position);
            }
                if (second != -1 && !this.isDelimiter(second, first)) {
import org.eclipse.jface.text.link.LinkedModeModel;
                }
                if (this.isWhitespace(first, second)) {

                }
                super.run();
                return true;
                next = this.next();
        protected SQLWordIterator wordIterator = new SQLWordIterator();
        protected int findPreviousPosition(int position) {
import org.eclipse.swt.graphics.Point;
        public NavigateNextSubWordAction(SQLEditorBase editor) {
    public static class SQLWordIterator extends java.text.BreakIterator {

                final int offset = modelOffset2WidgetOffset(position);
            }
        private final SQLWordBreakIterator sqlIterator = new SQLWordBreakIterator();
    }

            return first;
            }
                int position = widgetOffset2ModelOffset(viewer.getTextWidget().getCaretOffset());
            this.first();
                LinkedPosition linkedPosition = model.findPosition(new LinkedPosition(document, position, 0));
 *

            }
        public int next(int n) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            super(editor, actionDefinitionId, code);
                if (caret == selection.x)
                }
                        previous = linkedPositionOffset;
            try {
                }
                    if (!Character.isWhitespace(ch)) {
            if (viewer instanceof ITextViewerExtension5) {

            }
                else
}
            return this.index;
                final int offset = modelOffset2WidgetOffset(position);
                        return false;
                return false;

 * You may obtain a copy of the License at
            super(editor.getViewer().getTextWidget(), action);
        protected void setCaretPosition(final int position) {
            }
        editor.setAction(ITextEditorActionDefinitionIds.SELECT_WORD_NEXT, new SelectNextSubWordAction(editor));
                wordIterator.setText((CharacterIterator) new SQLDocumentCharacterIterator(document));

            if (text != null && !text.isDisposed()) {
        }
            } catch (BadLocationException e) {
         * @return the next position

                    super.run(); // may navigate into virtual white space
            if (this.eatFollowingWhitespace(offset, first)) {
                n--;
            if (model != null && previous != BreakIterator.DONE) {
import org.eclipse.jface.text.ITextViewerExtension5;
            return first;
        public CharacterIterator getText() {

            ISourceViewer viewer = getSourceViewer();
            }

        textWidget.setKeyBinding(SWT.CTRL | SWT.SHIFT | SWT.ARROW_LEFT, SWT.NULL);
                    setCaretPosition(next);
            if (text != null && !text.isDisposed()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            int widget = -1;

                    if (nextLinkedPosition != null) {
            ISourceViewer viewer = getSourceViewer();
        protected PreviousSubWordAction(SQLEditorBase editor, String actionDefinitionId, final int code) {
                }

 *
            return this.index;

                if (linkedPosition != null) {
public class SQLEditorCustomActions {
                            previous = previousLinkedPositionEnd;
                        return false;

         * @param position the current position
            this.sqlIterator.setText(newText);
            }
        }
                    setCaretPosition(previous);
            this.sqlIterator.setText(newText);
        public void setText(CharacterIterator newText) {
            } else {
/*
            ISourceViewer viewer = getSourceViewer();
        StyledText textWidget = editor.getViewer().getTextWidget();
        }

import java.text.BreakIterator;
    public static void registerCustomActions(SQLEditorBase editor) {

            return widgetOffset + viewer.getVisibleRegion().getOffset();
                        int nextLinkedPositionOffset = nextLinkedPosition.getOffset();
    }
            this.first();
        @Override
                    return;
                }

    }
        protected int findNextPosition(int position) {

        protected int modelOffset2WidgetOffset(int modelOffset) {
                    text.setSelectionRange(selection.y, offset - selection.y);

        }
                    }
            return modelOffset - viewer.getVisibleRegion().getOffset();
            super(editor, ITextEditorActionDefinitionIds.SELECT_WORD_NEXT, ST.SELECT_WORD_NEXT);
        private boolean isDelimiter(int offset, int exclusiveEnd) {
                next = wordIterator.following(next);
                return;

        public int following(int offset) {
            } else {
            }
                wordIterator.setText((CharacterIterator) new SQLDocumentCharacterIterator(document));
            if (exclusiveEnd != -1 && offset != -1) {
                LinkedPosition linkedPosition = model.findPosition(new LinkedPosition(document, position, 0));
        public int current() {

 * distributed under the License is distributed on an "AS IS" BASIS,


    protected static class NavigatePreviousSubWordAction extends PreviousSubWordAction {
        }
import org.eclipse.swt.custom.StyledText;

        protected ISourceViewer getSourceViewer() {
        @Override
        }

        /**

                    if (ch == '\n' || ch == '\r') {
                return extension.modelOffset2WidgetOffset(modelOffset);

            }
import java.text.CharacterIterator;
            if (model != null && next != BreakIterator.DONE) {
                final int caret = text.getCaretOffset();
        private boolean isWhitespace(int offset, int exclusiveEnd) {

    protected abstract static class BaseTextNavigateAction extends TextNavigationAction {
                    super.run(); // may navigate into virtual white space
                log.debug(e);
            return this.index;
        @Override
                    widget = modelOffset2WidgetOffset(previous);
    }
            return this.index;
            if (exclusiveEnd != -1 && offset != -1) {

                    return !this.isDelimiter(offset, exclusiveEnd);
        protected void setCaretPosition(final int position) {
        }
            final StyledText text = viewer.getTextWidget();
        }
                    LinkedPosition previousLinkedPosition = model.findPosition(new LinkedPosition(document, previous, 0));
        protected int widgetOffset2ModelOffset(int widgetOffset) {
                    return;

        private boolean eatFollowingWhitespace(int offset, int exclusiveEnd) {
            this.index = this.sqlIterator.first();

                } else if (next != BreakIterator.DONE) {
                    LinkedPosition nextLinkedPosition = model.findPosition(new LinkedPosition(document, next, 0));
        editor.setAction(ITextEditorActionDefinitionIds.SELECT_WORD_PREVIOUS, new SelectPreviousSubWordAction(editor));
    }
                final Point selection = text.getSelection();
            return this.index;
            this.editor = editor;
            int next = position;
            // Check whether we are in a java code partition and the preference is enabled
                    char ch = seq.charAt(offset);
                if (editor.isBlockSelectionModeEnabled() && document.getLineOfOffset(next) != document.getLineOfOffset(position)) {
            setActionDefinitionId(actionDefinitionId);

                    text.setSelectionRange(selection.x, offset - selection.x);

            this.first();
        public void setText(String newText) {

            final ISourceViewer viewer = getSourceViewer();
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                        next = linkedPositionEnd;
        }
            LinkedModeModel model = LinkedModeModel.getModel(document, position);
                else
                    return second;


import org.eclipse.jface.text.BadLocationException;
        }
                int second = this.sqlIterator.preceding(first);

                } else if (previous != BreakIterator.DONE) {

                int previous = findPreviousPosition(position);
            int widget = -1;

            final DBPPreferenceStore store = editor.getActivePreferenceStore();
            }
                final int caret = text.getCaretOffset();

            final IDocument document = viewer.getDocument();
        }
                if (linkedPosition != null) {
        textWidget.setKeyBinding(SWT.CTRL | SWT.SHIFT | SWT.ARROW_RIGHT, SWT.NULL);
        @Override
                    getTextWidget().showSelection();
            ISourceViewer viewer = getSourceViewer();
package org.jkiss.dbeaver.ui.editors.sql;
            while (next != BreakIterator.DONE && widget == -1) { // XXX: optimize
            if (!store.getBoolean(SQLPreferenceConstants.SMART_WORD_ITERATOR)) {

            int next = 0;
import org.jkiss.dbeaver.Log;
            return editor.getViewer();
        }
                    text.setSelectionRange(selection.x, offset - selection.x);
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
            super(editor, ITextEditorActionDefinitionIds.SELECT_WORD_PREVIOUS, ST.SELECT_WORD_PREVIOUS);

                if (previous != BreakIterator.DONE)
                if (editor.isBlockSelectionModeEnabled() && document.getLineOfOffset(previous) != document.getLineOfOffset(position)) {
    protected abstract static class PreviousSubWordAction extends BaseTextNavigateAction {
        }
            getTextWidget().setCaretOffset(modelOffset2WidgetOffset(position));
    }
        public void run() {
            int previous = position;
            final ISourceViewer viewer = getSourceViewer();
                for (CharSequence seq = this.sqlIterator.getTextValue(); offset < exclusiveEnd; ++offset) {
        public int preceding(int offset) {
            try {
 *
        }
        editor.setAction(ITextEditorActionDefinitionIds.WORD_NEXT, new NavigateNextSubWordAction(editor));
 * Unless required by applicable law or agreed to in writing, software
        }
                } else {
            if (!store.getBoolean(SQLPreferenceConstants.SMART_WORD_ITERATOR)) {

                ITextViewerExtension5 extension = (ITextViewerExtension5) viewer;

    protected static class SelectPreviousSubWordAction extends PreviousSubWordAction {
            } catch (BadLocationException e) {
            return next;
            }
        public BaseTextNavigateAction(SQLEditorBase editor, String actionDefinitionId, int action) {
                for (CharSequence seq = this.sqlIterator.getTextValue(); offset < exclusiveEnd; ++offset) {
            final StyledText text = viewer.getTextWidget();
            super(editor, ITextEditorActionDefinitionIds.WORD_NEXT, ST.WORD_NEXT);
                    fireSelectionChanged();
                } else {
            }
                    char ch = seq.charAt(offset);
        protected void setCaretPosition(final int position) {
                return false;
        public NavigatePreviousSubWordAction(SQLEditorBase editor) {
                    int linkedPositionOffset = linkedPosition.getOffset();

            this.index = this.following(this.index);

 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        }
        @Override

 * limitations under the License.
            if (this.isWhitespace(first, offset)) {
        public SelectNextSubWordAction(SQLEditorBase editor) {
                    if (position != linkedPositionOffset && previous < linkedPositionOffset)

            }
            }
        }
            return this.sqlIterator.getText();
        public SelectPreviousSubWordAction(SQLEditorBase editor) {

            this.setText((CharSequence) newText);
            while (previous != BreakIterator.DONE && widget == -1) { // XXX: optimize
                if (position == -1)
                    return next;

        public int first() {

                return;
        protected abstract void setCaretPosition(int position);
        public int last() {
        }
            if (exclusiveEnd != -1 && offset != -1) {
                if (caret == selection.x)
                return true;
            }




                        int previousLinkedPositionEnd = previousLinkedPosition.getOffset() + previousLinkedPosition.getLength();
        protected abstract void setCaretPosition(int position);
            final ISourceViewer viewer = getSourceViewer();
         */
                    }
                    }

            } else {
                    return second;
         *
        @Override
        }
            return previous;
            super(editor, actionDefinitionId, code);


            final DBPPreferenceStore store = editor.getActivePreferenceStore();


            }
                super.run();
                if (this.isWhitespace(offset, exclusiveEnd)) {

        public void setText(CharSequence newText) {
    }
                        return false;
                    widget = modelOffset2WidgetOffset(next);
                final Point selection = text.getSelection();
 * DBeaver - Universal Database Manager
        textWidget.setKeyBinding(SWT.CTRL | SWT.ARROW_RIGHT, SWT.NULL);
                    fireSelectionChanged();
        protected SQLWordIterator wordIterator = new SQLWordIterator();
            this.index = this.sqlIterator.last();
