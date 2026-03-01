                    }
}
/*
                        endSequenceIndex = currentIndex;
        fNestingLevel = 1;

                    // won't be applied to the entire document
                    fNestingLevel += 1;
    private boolean fRollback;
    public boolean isRollback() {
            currentIndex += 1;
 *
            final int ch = scanner.read();
     * end sequences are balanced, then this rule evaluated
 * Unless required by applicable law or agreed to in writing, software
 */
 * you may not use this file except in compliance with the License.

    }
     * to the result of <code>getSuccessToken()</code>
                    fNestingLevel -= 1;
        return super.doEvaluate(scanner, resume);
 *
     */
        int currentIndex = 0;
                    }
     */
                        // nesting level (> 0) so we can rollback later

                    if (fNestingLevel > 0 && fRollback) {

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
    }

            if (fStartSequence.length > 0 && ch == fStartSequence[0]) {
    private static final Log log = Log.getLog(NestedMultiLineRule.class);

import org.jkiss.dbeaver.Log;
        fRollback = rollback;
    /**
 * limitations under the License.


    @Override
                if (sequenceDetected(scanner, fStartSequence, fBreaksOnEOF)) {

    }
            } else if (fEndSequence.length > 0 && ch == fEndSequence[0]) {
     * to the entire document when EOF is reached.
import org.jkiss.dbeaver.model.text.parser.rules.MultiLineRule;

        }
                if (fRollback) {
    @Override
                        // Update to last end sequence index at positive
            if (fNestingLevel <= 0) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void setRollback(boolean rollback) {
 * See the License for the specific language governing permissions and
            }
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (sequenceDetected(scanner, fEndSequence, fBreaksOnEOF)) {
        int endSequenceIndex = 0;
 *
                return true;

                        scanner.unread();

import org.jkiss.dbeaver.model.text.parser.TPToken;
 * DBeaver - Universal Database Manager
     * should be performed in order to avoid applying this rule
    private int fNestingLevel;
 * Licensed under the Apache License, Version 2.0 (the "License");

        return fRollback;
    protected TPToken doEvaluate(TPCharacterScanner scanner, boolean resume) {

                    // Rollback to last end index - at least this rule
public class NestedMultiLineRule extends MultiLineRule {
package org.jkiss.dbeaver.model.sql.parser.rules;
    protected boolean endSequenceDetected(TPCharacterScanner scanner) {
                    for (; currentIndex > endSequenceIndex; currentIndex--) {
    }
    }
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
        while (true) {
     * Controls whether rollback to the last end sequence index
    public NestedMultiLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOF) {
                }
            } else if (ch == TPCharacterScanner.EOF) {
     * Current nesting depth. If level is zero i.e start and
 * You may obtain a copy of the License at
                }
                return true;
                log.trace("Found unterminated start sequences after scanning");
        super(startSequence, endSequence, token, escapeCharacter, breaksOnEOF);
