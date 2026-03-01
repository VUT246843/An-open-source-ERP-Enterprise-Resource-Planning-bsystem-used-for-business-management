        int startLine = line;
     */
        this.context = new SQLParserContext((DBPDataSource) null, syntaxManager, new SQLRuleManager(syntaxManager), document);

     * Creates a new instance.
            line = document.getLineOfOffset(position);
        } else {
            }
            nextToken();
     *
        if (this.indent < 0) {
        return getLeadingWhitespace(unit);
    }


                    int align = scanner.findNonWhitespaceForwardInAnyPartition(lineOffset, bound);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (int k = 0; k < number; k++) {
     * @param offset the offset for which the reference is computed
    /**
        unindent(indent, 1);
    /**
            return null;
    }
import org.jkiss.dbeaver.model.DBPDataSource;
    public String unindent(String indent, int number) {
    /**
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;

import org.jkiss.dbeaver.model.sql.SQLScriptElement;
        if (!useSpaces) {
     * Returns the reference position regarding to indentation for <code>offset</code>, or <code>NOT_FOUND</code>.
 * You may obtain a copy of the License at
        StringBuilder indent = createIndent(this.indent);
     * Computes the indentation at <code>offset</code>.
     *
     * @return a String which reflects the correct indentation for the line in which offset resides, or
    private SQLParserContext context;
    }
        }
     */
    }

     * The scanner we will use to scan the document. It has to be installed on the same document as the one we get.
    private int token;
    public StringBuilder createIndent(int indent) {
}
            return "";
        int unit;
        StringBuilder oneIndent = createIndent();
    private int indent;
        try {
     *
     * <code>offset</code> resides, or <code>null</code> if it cannot be determined
                lineOffset = document.getLineInformationOfOffset(currentQuery.getOffset()).getOffset();
     */
 *
        token = scanner.previousToken(start - 1, SQLHeuristicScanner.UNBOUND);
    }
        return oneIndent;
        StringBuilder newIndent = new StringBuilder(indent);
            int lineOffset = line.getOffset();
        }
        unit = findReferencePosition(offset);
 * See the License for the specific language governing permissions and
     * <code>fToken, fPreviousPosition</code> and <code>fPosition</code> accordingly.
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        position = offset;
            if (nonWS < 0) {
     * @param indent the requested indentation level.

        if (unit == SQLHeuristicScanner.NOT_FOUND) {
 *
     * <code>null</code> if it cannot be determined
     * Creates a string that represents one indent (can be spaces or tabs..)
        position = scanner.getPosition() + 1;

        nextToken();
    public void unindent(StringBuilder indent, int number) {
    private SQLHeuristicScanner scanner;

     * The stateful scan position for the indentation methods.

            return document.get(lineOffset, nonWS - lineOffset);
        return ret;
     * Computes the indentation at the reference point of <code>position</code>.
        //   if we were unable to find anything, return null
        if (indent == null) {
     * @param offset        the offset in the document
 *
            if (indentLength >= indent.length() && scanner.endsWithDelimiter(lineOffset, lineOffset + line.getLength() - 1)) {
     */
package org.jkiss.dbeaver.ui.editors.sql.indent;
            unindent(indent);
        } catch (BadLocationException e) {
public class SQLIndenter {
     * Returns the indentation of the line at <code>offset</code> as a <code>StringBuilder</code>. If the offset is
    public int findReferencePosition(int offset) {
        }
    /**
     * @return one indentation
                nonWS = currentQuery.getOffset();
    public void unindent(StringBuilder indent) {
     *



     * The most recent token.
            switch (token) {
     * list introduction start.
                    // ignore and return just the position
    /**

     * @return a String which reflects the correct indentation for the line in which offset resides, or
                }
 * DBeaver - Universal Database Manager
        int startPosition = position;
     * @param assumeOpening <code>true</code> if an opening statement should be assumed
            return null;
    public SQLIndenter(IDocument document, SQLSyntaxManager syntaxManager, SQLHeuristicScanner scanner) {
import org.eclipse.jface.text.IRegion;
        return skipToPreviousListItemOrListStart();
     * not valid, the empty string is returned.
        return newIndent.toString();
     */


     * or simply increase the indentation by a number of standard indents.

        }
        IPreferenceStore preferenceStore = EditorsPlugin.getDefault().getPreferenceStore();

        StringBuilder ret = new StringBuilder();
     * Computes the indentation at <code>offset</code>.
     */
        return computeIndentation(offset, false);
    }
     * @param offset the offset in the document
     */
            }
    }

     * @param scanner  the {@link SQLHeuristicScanner}to be used for scanning the document. It must be installed on the
     * The indentation accumulated by <code>findPreviousIndenationUnit</code>.
import org.eclipse.jface.preference.IPreferenceStore;
            int i = indent.lastIndexOf(oneIndent.toString()); //$NON-NLS-1$
//            _log.debug(EditorMessages.error_badLocationException, e);
     */
    /**
            for (int i = 0; i < tabWidth; i++) {
     * Reads the next token in backward direction from the heuristic scanner and sets the fields
                } catch (BadLocationException e) {
            oneIndent.append('\t');
     * <code>null</code> if it cannot be determined
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param document the document to scan

    public String computeIndentation(int offset) {

            }
            int tabWidth = preferenceStore.getInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH);
    /**
     * Creates a string that represents the given number of indents (can be spaces or tabs..)
     * @return the reference statement relative to which <code>offset</code> should be indented, or
            line = -1;
    public String computeIndentation(int offset, boolean assumeOpening) {
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
     * @return a String which reflects the indentation at the line in which the reference position to

    /**


 * Licensed under the Apache License, Version 2.0 (the "License");
                try {
        } catch (BadLocationException e) {
            if (i != -1) {
     */

        indent = 1;
import org.jkiss.dbeaver.model.sql.parser.SQLParserContext;
     *
    /**
     *
     * Returns the reference position for a list element. The algorithm tries to match any previous indentation on the
        unindent(newIndent, number);
                SQLScriptElement currentQuery = SQLScriptParser.extractQueryAtPos(context, offset, false);
    }
            IRegion line = document.getLineInformationOfOffset(offset);
     *
     * same list. If there is none, the reference position returned is determined depending on the type of list: The


    private String getLeadingWhitespace(int offset) {
    }
 * limitations under the License.
     */
        }

        this.scanner = scanner;
        this.document = document;
     *                 same <code>IDocument</code>.
     *
    /**
 */
     * @param syntaxManager syntax manager
            int indentLength = nonWS - lineOffset;
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
     * {@link SQLHeuristicScanner#NOT_FOUND}
        }
    /**
     * The line of <code>fPosition</code>.
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
        //adding offset, after adding indent to keep consistency on whitespace of the last line.
                return "";
     * @param offset the offset in the document
            ret.append(oneIndent);
            }
/*
    }
                    int bound = Math.min(document.getLength(), startPosition + 1);
    private int line;
            StringBuilder indent = createIndent();

     */
     * @return the indentation specified by <code>indent</code>
                    return 0;

        }
                    int lineOffset = document.getLineOffset(startLine);
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
    /**
 * you may not use this file except in compliance with the License.
    /**

            }
        while (true) {
    /**
    private void nextToken() {
    private IDocument document;
    public String getReferenceIndentation(int offset) {
    }

        // add additional indent
                case SQLIndentSymbols.TokenEOF:
                oneIndent.append(' ');
        nextToken(position);
     * @return the reference position for a list item: either a previous list item that has its own indentation, or the
            if (line < startLine) {
    }
        return indent.toString();
                indent.delete(i, i + oneIndent.length());
     */
    /**
            }
     * @return the indentation (leading whitespace) of the line in which <code>offset</code> is located

    public void nextToken(int start) {
import org.eclipse.jface.text.IDocument;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

        while (indent-- > 0) {
     */
    private int position;
     */
        indent = 0; // the indentation modification
     * @param offset the offset in the document
        boolean useSpaces = preferenceStore.getBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS);
     * @param indent the indentation to be modified

     *
//                    _log.debug(EditorMessages.error_badLocationException, e);
        StringBuilder oneIndent = new StringBuilder();
     * indentation will either match the list scope introducer (e.g. for method declarations), so called deep indents,
     */
        try {
            // if any line item comes with its own indentation, adapt to it
     *
                return startPosition;
            int nonWS = scanner.findNonWhitespaceForwardInAnyPartition(lineOffset, lineOffset + line.getLength());

        indent.append(getReferenceIndentation(offset));
 * Unless required by applicable law or agreed to in writing, software
    /**
import org.eclipse.jface.text.BadLocationException;
     */
     * The document being scanned.
     */
    }
        CharSequence oneIndent = createIndent();

    private int skipToPreviousListItemOrListStart() {
    public static StringBuilder createIndent() {
        }
    /**
     * Reduces indentation in <code>indent</code> by one indentation unit.
