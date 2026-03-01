        }
                        // Probably a Q-string
                }
            if (isEndOfText) {
        }
                        quoteStartChar = -1;
            int charsRead = 0;
        }

            boolean isEndOfLiteral, isEndOfText;
        return new TPRule[0];
                        }
 * See the License for the specific language governing permissions and
            return stringToken;
                scanner.unread();
            stringToken = new TPTokenDefault(SQLTokenType.T_STRING);
        QStringRule() {
                    if (!quoteCharRead) {
            }
        private int quoteStartChar = -1;
        }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            switch (startChar) {
        public TPToken getSuccessToken() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        private boolean tryReadQString(TPCharacterScanner scanner, char quoteEndChar) {
                for (int i = 0; i < charsRead; i++) {
                        quoteStartChar = scanner.read();
                        }
 */
                }
        }
import org.jkiss.dbeaver.model.text.parser.*;
                            return stringToken;
            }
import org.jkiss.code.Nullable;

                case '{': return '}';
            } while (!isEndOfLiteral && !isEndOfText);
                        if (quoteCharNeedsToBeUnread) {
                if (!resume) {
                            scanner.unread();
import org.jkiss.code.NotNull;
/*
public class OracleDialectRules implements TPRuleProvider {
package org.jkiss.dbeaver.ext.oracle.sql;
        }
                case '(': return ')';
            do {
                }
                currChar = scanner.read();
                        char quoteEndChar = getQuoteEndChar((char) quoteStartChar);
            if (c == 'Q' || c == 'q') {
 * you may not use this file except in compliance with the License.
 *
        public TPToken evaluate(TPCharacterScanner scanner) {
                    }
            }
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
            return doEvaluate(scanner, resume);
            if (!resume) {
                    if (resume && quoteStartChar != -1) {

                if (c == '\'') {
 * limitations under the License.
            }
                charsRead++;
    private static class QStringRule implements TPPredicateRule {
                    }
                        quoteCharNeedsToBeUnread = true;
                default: return startChar;
            return TPTokenAbstract.UNDEFINED;
 * You may obtain a copy of the License at
* Oracle dialect rules
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

                    boolean quoteCharRead = false;
                        if (tryReadQString(scanner, quoteEndChar)) {

                        scanner.unread();
}

                    boolean quoteCharNeedsToBeUnread = false;

/**

                    } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        private static char getQuoteEndChar(char startChar) {

 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
    }
                    scanner.unread();
    }
*/
            int prevChar = -1, currChar = -1;
                case '<': return '>';
                case '[': return ']';
        }
    @Override
            int c = resume ? 'q' : scanner.read();
            return doEvaluate(scanner, false);





                        quoteCharRead = true;
                prevChar = currChar;
        private TPToken doEvaluate(TPCharacterScanner scanner, boolean resume) {
                isEndOfLiteral = prevChar == quoteEndChar && currChar == '\'';

                    }
        public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
                isEndOfText = currChar == TPCharacterScanner.EOF;
                    if (!Character.isLetterOrDigit(quoteStartChar)) {
    @NotNull
                    scanner.unread();
 *
        @Override
 * DBeaver - Universal Database Manager
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            return new TPRule[]{ new QStringRule() };
        @Override
                c = resume ? '\'' : scanner.read();
            return isEndOfLiteral;

 * Unless required by applicable law or agreed to in writing, software
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {
        private final TPToken stringToken;
