
     * @param closeBracket the close bracket character
     * @param document the document being searched
     */
        // Scan backward for the opening bracket.  Ignore "nested" bracket pairs.
                // Java identifier rule is close enough for now.
    protected int startPos;
     * @return the location of the open bracket
            IDocument doc = fText.getDocument();

            // Scan backwards for the start of the word.
        int length = document.getLength();
        } catch (BadLocationException x) {
 * you may not use this file except in compliance with the License.
                    break;
package org.jkiss.dbeaver.ui.editors.sql.syntax;
        int i;
    /**
    }
    @Override
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,

                }
     * Returns the position of the closing bracket after startPosition.
     * @return true if the bounds of the word were successfully determined, otherwise false.
     * Returns the position of the open bracket before startPosition.
        curPos = viewer.getSelectedRange().x;
    }

        startPos = -1;
                fText.setSelectedRange(startPos, 0);
            else
 * DBeaver - Universal Database Manager
            for (i= 1; i < fgBrackets.length; i = i + 2) {
            while (pos < length) {
                    bracketIndex1 = i;
public class SQLDoubleClickStrategy implements ITextDoubleClickStrategy {
    protected int curPos;
    protected void selectWord() {
        return -1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                stack--;
            return true;
            // If we found an open bracket, find the matching closing bracket.

                startPos = -1;
     * @return true if brackets found and matched, otherwise false
        }
            if (nextChar == openBracket && nextChar != closeBracket)
        while (openPos >= 0 && stack > 0) {
     protected int searchForOpenBracket( int startPosition, char openBracket, char closeBracket, IDocument document ) throws BadLocationException {
            // Scan forward for the end of the word.
            log.debug(x);
                fText.setSelectedRange(startPos, 0);

            nextChar = doc.getChar(curPos);
        if (stack == 0)
     * @see org.eclipse.jface.text.ITextDoubleClickStrategy#doubleClicked(ITextViewer)
            nextChar= document.getChar(openPos);

     * @return <code>true</code> when selection is OK, <code>false</code> when not
import org.eclipse.jface.text.ITextDoubleClickStrategy;
        if (curPos < 0 || curPos >= fText.getDocument().getLength()) {
    protected static char[] fgBrackets = { '(', ')', '[', ']', '\'', '\'', '"', '"' };
    /**
     protected boolean matchBracketsAt() {
    }
 * limitations under the License.
 * Process double clicks in the SQL content.
        int closePosition = startPosition + 1;
            if (startPos == endPos)
    /**
    /**


        int stack = 1;
            return;
            startPos = pos;
                    startPos = curPos - 1;
        }
            return false;
     * @param document the document being searched
import org.jkiss.dbeaver.Log;

                    endPos = curPos;
     protected boolean selectBracketBlock() {
            int length = doc.getLength();
        }
            if (startPos == endPos)
        fText = viewer;
     *
        }

     *

                fText.setSelectedRange(startPos + 1, endPos - startPos - 1);

                --pos;


                if (startPos > -1)
        int bracketIndex2 = fgBrackets.length;

            // Is the char either an open or close bracket?
                // Yes we know this isn't Java code we are parsing but the
     *
            }
            else
                fText.setSelectedRange(startPos + 1, endPos - startPos - 1);
     */


            if (startPos > -1 && bracketIndex1 < bracketIndex2) {
            }
            pos = curPos;
            int pos = curPos;
        int bracketIndex1 = fgBrackets.length;
        return -1;
     * @param startPosition the starting position for the search
 *

        try {
        endPos = -1;
     */
/**
    /**
    protected boolean matchWord() {
        return false;
                    bracketIndex2 = i;
                if (nextChar == fgBrackets[i]) {
        char nextChar;
 * Copyright (C) 2010-2024 DBeaver Corp and others

                ++pos;
        char prevChar, nextChar;
            else if (nextChar == closeBracket)
            else if (endPos > -1) {

                endPos = -1;
            }
     * Handles a double click action by selecting the current word.
        IDocument doc = fText.getDocument();
                c = doc.getChar(pos);
                if (!Character.isJavaIdentifierPart(c))
    protected ITextViewer fText;
 * See the License for the specific language governing permissions and

     * Attempts to find and match opening or closing brackets just ahead of the
            }
    }
    /**
    public void doubleClicked(ITextViewer viewer) {
            if (nextChar == closeBracket && nextChar != openBracket)
            closePosition++;
        }
/*
            // Otherwise if we found a closing bracket, find the matching open bracket.
    /**
        if (matchBracketsAt()) {

     * Attempts to determine and set the start (fStartPos) and end (fEndPos) of the word
        } catch (BadLocationException x) {
     */
            }
import org.eclipse.jface.text.IDocument;
    }
            endPos = pos;
 * You may obtain a copy of the License at
     * @return the location of the closing bracket
    }
     */

            while (pos >= 0) {
     */
        int stack = 1;
        try {
     * Select the area between the selected bracket and the closing bracket. Return
     *
                stack--;
            char c;
     * that was double-clicked.
            selectWord();
                }
    public SQLDoubleClickStrategy() {
     * @param closeBracket the close bracket character
 * Licensed under the Apache License, Version 2.0 (the "License");

        // Get the chars preceding and following the start position.
            log.debug(x);
     *
        }
                endPos = searchForClosingBracket(startPos, prevChar, fgBrackets[bracketIndex1 + 1], doc );
     */
        return false;
            return openPos + 1;
     * Constructs an instance of this class.  This is the default constructor.
        }


    private static final Log log = Log.getLog(SQLDoubleClickStrategy.class);
     protected int searchForClosingBracket(int startPosition, char openBracket, char closeBracket, IDocument document ) throws BadLocationException {
        // Get the viewer we are dealing with.
                    return true;
        }
        if (matchWord()) {
        // Get the double click location in the document.
 * Unless required by applicable law or agreed to in writing, software
 *

            return closePosition - 1;
        return false;
        while (closePosition < length && stack > 0) {
                stack++;
import org.eclipse.jface.text.ITextViewer;
            else if (nextChar == openBracket)
     * @param openBracket the open bracket character
        if (curPos == 0) {
 *

        // Scan forward for the closing bracket.  Ignore "nested" bracket pairs.
                    break;
}
        if (!selectBracketBlock()) {
                startPos = searchForOpenBracket(endPos, fgBrackets[bracketIndex2 - 1], nextChar, doc );
        if (stack == 0)


                c = doc.getChar(pos);
            for (i= 0; i < fgBrackets.length; i = i + 2) {
    protected int endPos;
        }
     * double click location.  Sets fStartPos and fEndPos to the bracket locations
            prevChar = doc.getChar(curPos - 1);

                stack++;

            nextChar = document.getChar( closePosition );
                    return true;
                if (endPos > -1)
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Selects the word at the current selection location.
            openPos--;

                if (!Character.isJavaIdentifierPart(c))
    }
     *
     * true if successful.

 */
            return true;
 */
    }
     * @param startPosition the starting position for the search
                if (prevChar == fgBrackets[i]) {
        super();
            }
        char nextChar;

     * if found.
        int openPos = startPosition - 1;
     * @param openBracket the open bracket character
import org.eclipse.jface.text.BadLocationException;
     */
