        for (int i= 1; i < sequence.length; i++) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
                }
            if (Character.toUpperCase(c) == Character.toUpperCase(fStartSequence[0])) {
            if (lastChar != TPCharacterScanner.EOF) {
        super(startSequence, token, escapeCharacter);
 * distributed under the License is distributed on an "AS IS" BASIS,
                int c = scanner.read();
 * See the License for the specific language governing permissions and

            int lastChar = scanner.read();
            if (c == TPCharacterScanner.EOF && eofAllowed) {
            scanner.unread();
    @Override
                }
        if (Character.isLetterOrDigit(sequence[sequence.length - 1])) {
    protected TPToken doEvaluate(TPCharacterScanner scanner, boolean resume) {
                    scanner.unread();
                if (!Character.isWhitespace((char) lastChar)) {
 * Unless required by applicable law or agreed to in writing, software
            }

 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            return (fColumn == scanner.getColumn() ? doEvaluate(scanner, resume) : TPTokenAbstract.UNDEFINED);
                // Do not unread the first character.
 * needs whitespace after last letter or digit
    protected boolean sequenceDetected(TPCharacterScanner scanner, char[] sequence, boolean eofAllowed) {
            if (endSequenceDetected(scanner))
            int c= scanner.read();
            }
            int c= scanner.read();
                if (sequenceDetected(scanner, fStartSequence, false)) {
    }
/**
        } else {
    }
    }

    }


/*
/*
            // Check we are at the line beginning
 */
    }
{
 * You may obtain a copy of the License at
            }

                    if (endSequenceDetected(scanner))
package org.jkiss.dbeaver.model.sql.parser.rules;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

*/
import org.jkiss.dbeaver.model.text.parser.TPToken;
            // Check for trailing whitespace
                    return false;
            } else if (Character.toUpperCase(c) != Character.toUpperCase(sequence[i])) {
 *
    public LineCommentRule(String startSequence, TPToken token) {
 * you may not use this file except in compliance with the License.
                scanner.unread();

        if (fColumn == UNDEFINED)


 * DBeaver - Universal Database Manager
public class LineCommentRule extends EndOfLineRule
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
                // Non-matching character detected, rewind the scanner back to the start.
                for (int j= i-1; j > 0; j--)

 * The same as end-of-line rule but matches word in case-insensitive fashion +
        return TPTokenAbstract.UNDEFINED;
        super(startSequence, token, escapeCharacter, escapeContinuesLine, excludeLineDelimiter);
        scanner.unread();
                return true;
 *
    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {

                return fToken;
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
                return false;
            }

 * limitations under the License.
    @Override
        if (Character.toUpperCase(c) == Character.toUpperCase(fStartSequence[0]))
        }
 *

        }
        super(startSequence, token, (char) 0);
    public LineCommentRule(String startSequence, TPToken token, char escapeCharacter) {
    }
        scanner.unread();
        if (resume) {
            for (;;) {
                        return fToken;
 */
        int c= scanner.read();
 * Copyright (C) 2010-2024 DBeaver Corp and others

        super(startSequence, token, escapeCharacter, escapeContinuesLine);
import org.jkiss.dbeaver.model.text.parser.rules.EndOfLineRule;
}        return true;
                scanner.unread();
    public LineCommentRule(String startSequence, TPToken token, char escapeCharacter, boolean escapeContinuesLine, boolean excludeLineDelimiter) {
        return TPTokenAbstract.UNDEFINED;
            return doEvaluate(scanner, resume);
    public LineCommentRule(String startSequence, TPToken token, char escapeCharacter, boolean escapeContinuesLine) {

