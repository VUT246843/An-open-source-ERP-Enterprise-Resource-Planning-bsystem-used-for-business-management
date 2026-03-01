                }
    private void flushCommand(IDocument document, DocumentCommand command)


                    // in this case caretRelativeToParagraphOffset is always true
        // line delimiter could be null

                    lineBuffer.append(word);
        String lineContents = d.get(offset, length);

            }
                            d.replace(c.offset, 0, endTag); //$NON-NLS-1$
            {
     */

                return _end;
    private static boolean isNewComment(IDocument document, int commandOffset, String partitioning)
                // modify document command
public class SQLCommentAutoIndentStrategy extends DefaultIndentLineAutoEditStrategy {
                _bufferedEnd = -1;
            int[] caretOffset =
                int length = (lineDelimiter != null ? lineDelimiter.length() : 0) + prefix.length();
    }
        return DBWorkbench.getPlatform().getPreferenceStore();
                    return;
            return false;
    }
            AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH);
                String prefix = commentExtractLinePrefix(document, line + 1);
                            String lineDelimiter = getLineDelimiter(d);
        flushCommand(document, command);
        try {

                int index = TextUtilities.endsWith(lineDelimiters, command.text);

                c.offset -= length - 1;


        try {
            return false;

            }
        }
            int start = info.getOffset();
    {
                return _end;
                return;
        IRegion region = document.getLineInformation(line);
        }

//            _log.error(EditorMessages.error_badLocationException, e);
                // inside whitespace at end of line
        return lineContents.substring(trim);
                lineDelimiter = document.getLineDelimiter(line - 1);
        catch (BadLocationException e) {
        private final BreakIterator _iterator = BreakIterator.getLineInstance();

        catch (BadLocationException e) {

            // find start of line
    public void customizeDocumentCommand(IDocument document, DocumentCommand command)
                // margin exceeded
            if (string.trim().length() == 0) {
            length = length - lineDelimiter.length();
     * @see IAutoIndentStrategy#customizeDocumentCommand
        throws BadLocationException
 *     http://www.apache.org/licenses/LICENSE-2.0

     */

        }
            return true;
            }
        }
 * DBeaver - Universal Database Manager
            }
        // flush index buffer
                }
            // find white spaces
    {
                            && isNewComment(d, c.offset, partitioning) &&
            if (_bufferedEnd != -1) {
        while (line == currentLine || isCommentLine(document, currentLine)) {
        throws BadLocationException

        {



            }

     * @param offset an offset within the paragraph, which will be updated with respect to formatting.
            int partitionStart = partition.getOffset();
                lineBuffer.append(word);
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        String lineContents = document.get(firstChar, length);
            if (index >= start && index < end) {
            caret -= lineOffset;
        }
                return;
/*
        }
        int end = command.length + start;
        int column = 0;

        int length = d.getLineLength(line);
                return;
            String word = paragraph.substring(start, end);
        if (command.text != null) {
    {
                            offset[0] -= (index - (start - whiteSpaceBuffer.length()));
                return _end;
                String line = lineBuffer.toString() + whiteSpaceBuffer.toString() + word;
            }
        if (paragraph.trim().length() == 0) {

     * line add standard method tags and close the comment.
                if (index > -1) {
                            String endTag = lineDelimiter + indentation + " */"; //$NON-NLS-1$
    protected void commentHandleBackspaceDelete(IDocument document, DocumentCommand c)
            _start = _end;
                    lineBuffer.append(prefix);
        {

                String indentation = commentExtractLinePrefix(d, d.getLineOfOffset(c.offset));


    }
            _end = _iterator.next();
    private static int getMargin()

    }
     * Creates a new SQL multi-line comment auto indent strategy for the given document partitioning.
/**
            }
                    int length = document.getLineDelimiter(line).length() + prefix.length();
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
            int partitionEnd = partition.getLength() + partitionStart;
    }
        command.doit = false;
        }

            }
                    }
            return _start + word.length();
    }
        int trim = commentExtractLinePrefix(d, line).length();
        String lineContents = getLine(document, line);

    }

            buffer.append(string);
     *
        if (lineDelimiter == null) {
    {
                }
            offset[0] = paragraphBuffer.length() - lineDelimiter.length();
        return getPreferenceStore().getInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN_COLUMN);
    private void commentIndentAfterNewLine(IDocument d, DocumentCommand c)



        throws BadLocationException
        }
                }

     */
                command.offset = caretOffset[0];
        if (!command.doit) {
        paragraphBuffer.append(lineBuffer.toString());
                if (calculateDisplayedWidth(line) > margin) {
                    // flush line buffer and wrap paragraph
            ITypedRegion partition = TextUtilities.getPartition(document, partitioning, command.offset, true);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

        try {
     * against the print margin.
    private static int calculateDisplayedWidth(String string)
                    paragraphBuffer.append(lineBuffer.toString());
    {
 *

            // erase line delimiter
                    // margin not exceeded
            return false;
     */

import org.jkiss.dbeaver.runtime.DBWorkbench;
                    whiteSpaceBuffer.setLength(0);

 * you may not use this file except in compliance with the License.
    /**

            ITypedRegion partition = TextUtilities.getPartition(document, partitioning, commandOffset, false);
//            _log.error(EditorMessages.error_badLocationException, e);
    }
        // change in prefix region
                    whiteSpaceBuffer.setLength(0);
        int caretLine = document.getLineOfOffset(caret);

        int end = document.getLineOffset(currentLine);
            if (!wrapAlways) {
    {
            }
                    }
                if (isLineTooShort(document, line)) {
        catch (BadLocationException e) {
        catch (BadLocationException e) {

        int lineOffset = region.getOffset();
        }

        }
    /**
        private int _start;
            final String string = _string.substring(_start, _end);
        if (wrapAlways || calculateDisplayedWidth(buffer.toString()) > getMargin() || isLineTooShort(document, line)) {
        if (!prefix.startsWith("*") || prefix.startsWith("*/")) //$NON-NLS-1$ //$NON-NLS-2$
            int[] caretOffset =
        String paragraph = buffer.toString();
    protected void commentIndentForCommentEnd(IDocument d, DocumentCommand c)

        }
        }
            StringBuilder buf = new StringBuilder(c.text);
                whiteSpaceBuffer.append(word);
 */
    private void commentWrapParagraphFromLine(IDocument document, int line, int[] caretOffset, boolean always)
        int lineOffset = region.getOffset();
        if (d.getLength() >= nextCharPosAfterDelimiter + 2) {
        // handle whitespace
        if (!always) {
                        if (whiteSpaceBuffer.length() != 0 && index < start
    }
    {

        IRegion region = d.getLineInformation(line);

        throws BadLocationException


     */
     */

                        commentIndentAfterNewLine(document, command);
                // strip prefix if any
     * Returns the displayed width of a string, taking in account the displayed tab width. The result can be compared
     * returns true if the specified line is part of a paragraph and should be merged with the previous line.
        int index = offset[0];
        private int _bufferedEnd;
        }
        }
        return column;
    /**
        for (int i = 0; i < string.length(); i++) {
 *

    /*
            } else if (lineBuffer.length() == 0) {
            commentWrapParagraphFromLine(document, document.getLineOfOffset(c.offset), caretOffset, always);
    {

        if (d.getLength() < nextCharPos + 1) {
            caret -= paragraphOffset;
        for (int start = iterator.first(), end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator
            if (indent.trim().startsWith("*/")) //$NON-NLS-1$
                        }

                }
                        offset[0] = indexBuffer;
    }
                && commentExtractLinePrefix(document, line).length() - 1 >= c.offset - lineOffset) {

        }
            }
        StringBuilder whiteSpaceBuffer = new StringBuilder();
        if (c.offset < 2 || d.getLength() == 0) {
                    command.offset += lineDelimiter.length() + nextLinePrefix.length();
//            _log.error(EditorMessages.error_badLocationException, e);
            String endOfLine = document.get(command.offset, lineOffset + lineLength - command.offset);

                if (line < document.getNumberOfLines() - 1 && isCommentLine(document, line + 1)) {
        }
        int nextCharPosAfterDelimiter = endOfWhiteSpace + c.text.length() + getLineDelimiter(d).length();
        // flush line buffer
            // word is whitespace
        }
            }
 * Unless required by applicable law or agreed to in writing, software
            {

                }

            String text = document.get(c.offset, c.length);
        int offset = d.getLineOffset(line);
        boolean caretRelativeToParagraphOffset = false;
        }
            }

        }

        return calculateDisplayedWidth(lineContents) > getMargin();
*/
                if (word.trim().length() != 0) {
        return paragraphBuffer.toString();
            int partitionEnd = partition.getOffset() + partition.getLength();
            currentLine++;
    }
                _end = _bufferedEnd;
            if ('\t' == string.charAt(i)) {


                        buf.append(" * "); //$NON-NLS-1$
        command.text = null;
            // suspected whitespace
            final String word = string.trim();
        try {
                }
            // stop work
        length -= firstChar - offset;
        StringBuilder paragraphBuffer = new StringBuilder();
            return;
            IRegion info = d.getLineInformationOfOffset(p);
            _start = _iterator.first();
            command.offset += command.text.length();

                    }
            _bufferedEnd = -1;
                && ((text.contains(SQLConstants.ML_COMMENT_END)) || (document.getChar(offset) == '*' && text.startsWith(

            int line = document.getLineOfOffset(c.offset);
                    commentWrapParagraphFromLine(document, line, caretOffset, false);
            if (buffer.length() != 0 && !Character.isWhitespace(buffer.charAt(buffer.length() - 1))) {
    }

        buffer.replace(start, end, command.text);
        }
        }


        caretOffset[0] = caretRelativeToParagraphOffset ? caretOffset[0] + beginning : caret + beginning;
                //$NON-NLS-1$
                // backspace: beginning of a SQL multi-line comment line
                return;
    private static String formatParagraph(String paragraph, int[] offset, String prefix, String lineDelimiter,
        if (d.getChar(nextCharPos) == '*' && d.getChar(nextCharPos + 1) == '/') {

        {

            // end of line
                c.length = 0;
        }
    }
                    paragraphBuffer.append(lineDelimiter);
            _string = string;
 * Auto indent strategy for SQL multi-line comments
            if (command.text != null && command.text.equals("/")) {
        }
            if (end >= start) {
        if (command.text != null && command.text.length() != 0 && command.text.trim().length() == 0) {

    private boolean hasCloseCommentSlash(IDocument d, DocumentCommand c, int endOfWhiteSpace) throws BadLocationException {

            return;

                {
            String prefix = commentExtractLinePrefix(document, line);
    {
        int paragraphOffset = lineOffset + indent.length();
import org.jkiss.dbeaver.utils.GeneralUtils;
                    return;
        int length = document.getLineLength(line);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
                // move caret to next line
            }
    private String commentExtractLinePrefix(IDocument d, int line)
            return;

        String nextLine = getLineContents(document, line + 1);
                    c.doit = false;
    private static DBPPreferenceStore getPreferenceStore()
                c.doit = false;
                    indexBuffer -= word.length();

                };

        caretOffset[0] = caretRelativeToParagraphOffset ? caret : 0;

    private String getLineContents(IDocument d, int line)
            IRegion line = document.getLineInformation(lineIndex);
                    int[] caretOffset =
            }
            if (document.getNumberOfLines() > 1) {
    }
        catch (BadLocationException excp) {
        throws BadLocationException
                    c.offset
    {
     */
                    ++caret;
 * See the License for the specific language governing permissions and

        throws BadLocationException
 * limitations under the License.
                    document.replace(c.offset, length, null);
     * that the SQL multi-line comment is new.
            if (!indent.trim().startsWith("*")) //$NON-NLS-1$
    public SQLCommentAutoIndentStrategy(String partitioning)
    private boolean isLineTooLong(IDocument document, int line)
    {
                column += tabWidth - (column % tabWidth);


        private final String _string;
        if (indexBuffer != -1) {

            int line = document.getLineOfOffset(c.offset);

 *
            }
            String text = command.text;
                        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(
            return false;
        int currentLine = line;
                {
        public LineBreakIterator(String string)
                    // ends with line delimiter



                if (prefix.length() > 0) {
        document.replace(beginning, end - beginning, wrapped);
            }
        }
            } else {
        }
 * You may obtain a copy of the License at
                    if (d.getChar(end) == '/' && d.getChar(end + 1) != '/') {
            }
        }
            if (command.text != null && command.length == 0) {
            int end = findEndOfWhiteSpace(d, start, c.offset);
    private boolean isLineTooShort(IDocument document, int line)
    /**
                return;
                                          int margin)
        // last position is not returned by break iterator
                return;
            if (endOfLine.length() == 0) {
            c.offset = caretOffset[0];
     * @param partitioning the document partitioning
            if (lineDelimiter != null && lineDelimiter.equals(text)) {
        command.length = 0;
            String lineDelimiter = document.getLineDelimiter(line);
            return false;
                return document.getLineDelimiter(0);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            if ((offset < partitionStart + PREFIX_LENGTH || offset + length > partitionEnd - POSTFIX_LENGTH)
            int p = (c.offset == d.getLength() ? c.offset - 1 : c.offset);
     *
        int indexBuffer = -1;
    @Override
                indexBuffer = paragraphBuffer.length() + lineBuffer.length() + (index - start);
                commentIndentForCommentEnd(document, command);
        if (!isCommentLine(document, line + 1)) {
            commentWrapParagraphFromLine(document, line, caretOffset, wrapAlways);
 * distributed under the License is distributed on an "AS IS" BASIS,
        public int next()
        String prefix = lineContents.trim();
                // move caret to next line if possible

            String comment = document.get(partition.getOffset(), partition.getLength());
    private boolean isCommentLine(IDocument document, int line)
                return;
            int lineOffset = document.getLineOffset(line);
    }
                    String lineDelimiter = document.getLineDelimiter(line);
        }
        String wrapped = formatParagraph(paragraph, caretOffset, indent, delimiter, getMargin());
     */

                return true; // partition goes to end of document - probably a new comment
    /**
            }
            c.text = buf.toString();


            offset[0] = indexBuffer;
/*
            if (index != lineOffset + region.getLength() && d.getChar(index) == ' ') {
     * Line break iterator to handle whitespaces as first class citizens.
            int lineOffset = document.getLineOffset(line);
     * @param d the document to work on
                return;
                    String nextLinePrefix = commentExtractLinePrefix(document, line + 1);
            String string = getLineContents(document, currentLine);
            if (!isLineTooLong(document, line) && !isLineTooShort(document, line)) {
                lineBuffer.append(prefix);

            if (line.getOffset() >= partitionEnd) {
     * Returns <code>true</code> if the line is too long, <code>false</code> otherwise.
                    lineBuffer.append(word);
                    lineBuffer.append(whiteSpaceBuffer.toString());
}
            return comment.indexOf("/*", 2) != -1;
                // simply insert space

                            command.offset
        if (document.getNumberOfLines() < line)
                return false;
                        };

            if (word.length() == string.length()) {
        String indent = commentExtractLinePrefix(document, line);
            caretRelativeToParagraphOffset = true;
        String prefix = commentExtractLinePrefix(document, line);


        return false;
package org.jkiss.dbeaver.ui.editors.sql.indent;
                        {
            .next()) {
                            && index >= start - whiteSpaceBuffer.length()) {

                c.length++;

                    return;

        public int first()
    private static String getLine(IDocument document, int line)
    }
                column++;
        int caret = caretOffset[0];
                        // just the line delimiter

     * Formats a paragraph, using break iterator.

            if ("* ".equals(d.get(c.offset - 2, 2))) {
                document.replace(c.offset - length + 1, length, null);


            lineDelimiter = ""; //$NON-NLS-1$
                return true;
                } else {
    {
        //lineContents = lineContents.substring(1).trim().toLowerCase();
    /**
                document.replace(c.offset, c.length, null);
                    command.offset
                lineBuffer.append(whiteSpaceBuffer.toString());
        int line = document.getLineOfOffset(command.offset);
     *
                //$NON-NLS-1$
                    c.length = 0;
            final int PREFIX_LENGTH = SQLConstants.ML_COMMENT_START.length();
        IRegion region = document.getLineInformation(line);
            }
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
        if (c.offset == -1 || d.getLength() == 0) {

    /**
        StringBuilder buffer = new StringBuilder();
        boolean wrapAlways = command.offset >= lineOffset && command.offset <= lineOffset + prefix.length();

            } else if (endOfLine.trim().length() == 0) {
        int nextCharPos = endOfWhiteSpace + c.text.length();

    /**
    {

        String lineContents = document.get(lineOffset, lineLength);
    {
                    if (lineDelimiters[index].equals(command.text)) {
     * Guesses if the command operates within a newly created SQL multi-line comment or not. If in doubt, it will assume
        int beginning = document.getLineOffset(line);
    {
                            !hasCloseCommentSlash(d, c, end)) { // already has comment close block
        int lineLength = region.getLength();
            int offset = command.offset;
                if (currentLine <= caretLine) {
        } else {
     * Copies the indentation of the previous line and add a star. If the SQL multi-line comment just started on this
//            _log.error(EditorMessages.error_badLocationException, e);
            }
     */
     * Method commentWrapParagraphFromLine.
        String lineDelimiter = d.getLineDelimiter(line);
                _start = _end;
                    command.offset = caretOffset[0];

        }
    private String partitioning;
        private int _end;
     */
                    // flush index buffer

        else if (offset[0] == paragraph.length()) {
        {
        return d.get(lineOffset, index - lineOffset);
            if (word.trim().length() == 0) {
            }
        document.replace(command.offset, command.length, command.text);
                c.length = 0;
     */
        int lineOffset = document.getLineOffset(line);
                        // SQL multi-line comment started on this line
    /**
            } else {

                c.offset--;
        }
                    if (indexBuffer != -1) {
    private static class LineBreakIterator {
    }
        try {
        }
            int length = command.length;

                }
                if (end < c.offset) {
            } else {


        throws BadLocationException
     * Returns <code>true</code> if the comment line is too short, <code>false</code> otherwise.
            if (_end == BreakIterator.DONE) {

 */
    }
            if (document.getLength() == partitionEnd) {

            // stop work
     * @param c the command to deal with
        return true;
    {
    {
        if (lineDelimiter != null) {
        int start = command.offset - lineOffset;

                };




    protected void commentWrapParagraphOnInsert(IDocument document, DocumentCommand command)
                "/")))) //$NON-NLS-1$ //$NON-NLS-2$

                flushCommand(document, command);
        String delimiter = document.getLineDelimiter(0);
            if (lineIndex >= document.getNumberOfLines()) {
            {
            } else if (document.getChar(c.offset - 1) == '*'
        }

        catch (BadLocationException e) {
            index++;
                buffer.append(' ');
        throws BadLocationException
        throws BadLocationException
            int lineIndex = document.getLineOfOffset(commandOffset) + 1;
        catch (BadLocationException excp) {
        this.partitioning = partitioning;

            return;
        int index = findEndOfWhiteSpace(d, lineOffset, lineOffset + d.getLineLength(line));
                // first word of line is always appended
    private static String getLineDelimiter(IDocument document)
                    //If it is the single line comment '//', don't append '*'.
            // partition change
        if (paragraphOffset < caret) {



        StringBuilder buffer = new StringBuilder(lineContents);

            }
import org.eclipse.jface.text.*;
        }
                || text != null && text.length() >= 2
        if (d.getChar(index) == '*') {
            // whitespace

        int firstChar = findEndOfWhiteSpace(document, offset, offset + length);
        }
        final int tabWidth = getPreferenceStore().getInt(
    }
                c.doit = false;
        LineBreakIterator iterator = new LineBreakIterator(paragraph);
            }
                        // correct for caret in whitespace at the end of line
                        indexBuffer = -1;
                buf.append(indentation);
                index++;
        try {
            _bufferedEnd = _end;
                return _end;

            return _start;
    {

    {
    {

        try {
        return nextLine.trim().length() != 0;
        int offset = document.getLineOffset(line);
        // must insert the text now because it may include whitespace
                            SQLPreferenceConstants.SQLEDITOR_CLOSE_COMMENTS)
                String[] lineDelimiters = document.getLegalLineDelimiters();
            return d.getChar(nextCharPosAfterDelimiter + 1) == '*' && d.getChar(nextCharPosAfterDelimiter + 2) == '/';
            boolean always = c.offset > lineOffset && c.offset <= lineOffset + prefix.length();
                    lineBuffer.setLength(0);

                String prefix = commentExtractLinePrefix(document, line);
import java.text.BreakIterator;
                        }
        paragraphBuffer.append(lineDelimiter);

        }
        return document.get(region.getOffset(), region.getLength());
        }
        }
        StringBuilder lineBuffer = new StringBuilder();
            _iterator.setText(string);

    }
            }
        }
        }

    /**
            final int POSTFIX_LENGTH = SQLConstants.ML_COMMENT_END.length(); //$NON-NLS-1$
        return GeneralUtils.getDefaultLineSeparator();
