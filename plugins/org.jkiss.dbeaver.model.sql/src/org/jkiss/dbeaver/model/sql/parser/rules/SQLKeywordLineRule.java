        int nc = scanner.read();
        } else {
    /**
    }
        }
     */
            int c = scanner.read();
 * See the License for the specific language governing permissions and
        } else {
 *
    protected TPToken doEvaluate(TPCharacterScanner scanner, boolean resume) {
    /**

            return true;
            return false;
 *
            scanner.unread();
        super(keywordString,  token);
     */
 * DBeaver - Universal Database Manager
     * Same as underlying, but case-insensitive for start sequence
    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
            }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
/*
            }
        }
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
        int c = scanner.read();

        if (Character.isLetterOrDigit(nc)) {

                scanner.unread();
                // Do not unread the first character.
                if (caselessSequenceDetected(scanner, fStartSequence, false)) {

 *     http://www.apache.org/licenses/LICENSE-2.0
            if (Character.toLowerCase(c) == Character.toLowerCase(fStartSequence[0])) {
                return fToken;
                    scanner.unread();
                return false;
        if (Character.toLowerCase(c) == Character.toLowerCase(fStartSequence[0]))
 *
    @Override
 * you may not use this file except in compliance with the License.
                // Non-matching character detected, rewind the scanner back to the start.
import org.jkiss.dbeaver.model.text.parser.TPToken;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
        return TPTokenAbstract.UNDEFINED;

     * Same as underlying, but case-insensitive for start sequence
        if (resume) {
 */
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return (fColumn == scanner.getColumn() ? doEvaluate(scanner, resume) : TPTokenAbstract.UNDEFINED);
            int c = scanner.read();
                for (int j = i - 1; j > 0; j--)
 * Licensed under the Apache License, Version 2.0 (the "License");
        return TPTokenAbstract.UNDEFINED;
                        return fToken;
     * Same as underlying {@link #sequenceDetected(TPCharacterScanner, char[], boolean)}, but case-insensitive
    public SQLKeywordLineRule(String keywordString, TPToken token)  {

        scanner.unread();
    protected boolean caselessSequenceDetected(TPCharacterScanner scanner, char[] sequence, boolean eofAllowed) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (Character.toLowerCase(c) != Character.toLowerCase(sequence[i])) {

                scanner.unread();
import org.jkiss.dbeaver.model.text.parser.rules.EndOfLineRule;
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
     */
public class SQLKeywordLineRule extends EndOfLineRule {
            if (endSequenceDetected(scanner))
    @Override
    }

    }
        scanner.unread();
package org.jkiss.dbeaver.model.sql.parser.rules;
                    if (endSequenceDetected(scanner))
            for (int j = sequence.length; j > 0; j--)
    }
 * limitations under the License.

            return doEvaluate(scanner, resume);
        }
        if (fColumn == UNDEFINED)
        for (int i = 1; i < sequence.length; i++) {
