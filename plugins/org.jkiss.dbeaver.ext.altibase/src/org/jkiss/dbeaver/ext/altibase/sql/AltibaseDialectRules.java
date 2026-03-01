 *
                            scanner.unread();
 * limitations under the License.
        }
    }
        private final TPToken stringToken;
            }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        char quoteEndChar = getQuoteEndChar(quoteStartChar);
        public TPToken evaluate(TPCharacterScanner scanner) {
import org.jkiss.code.Nullable;
        return new TPRule[0];
                    }
                        quoteCharRead = true;
                    scanner.unread();
 *
            switch (startChar) {
                            return stringToken;
                    if (!quoteCharRead) {
    }
                        }
                    if (resume && quoteStartChar != -1) {


            if (!resume) {
            if (isEndOfText) {
                        quoteStartChar = (char) scanner.read();
                    }

            }

 */
                isEndOfText = currChar == TPCharacterScanner.EOF;
                    } else {
        private static char getQuoteEndChar(char startChar) {
            stringToken = new TPTokenDefault(SQLTokenType.T_STRING);
 * Unless required by applicable law or agreed to in writing, software
* Altibase dialect rules
                            scanner.unread();
 * See the License for the specific language governing permissions and
            do {
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
        public TPToken getSuccessToken() {

            if (c == 'Q' || c == 'q') {

                        if (quoteCharNeedsToBeUnread) {
        }
                currChar = scanner.read();
            return doEvaluate(scanner, resume);
            return TPTokenAbstract.UNDEFINED;
        }
                        if (tryReadQString(scanner, quoteEndChar)) {
 * You may obtain a copy of the License at
 *

 * you may not use this file except in compliance with the License.
                        }
                for (int i = 0; i < charsRead; i++) {
            int charsRead = 0;
            int c = resume ? 'q' : scanner.read();
                case '{': return '}';
        private boolean tryReadQString(TPCharacterScanner scanner, char quoteEndChar) {
}
            int prevChar = -1;
                }
                    if (!Character.isLetterOrDigit(quoteStartChar)) {

            int currChar = -1;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
            boolean isEndOfText;
            return new TPRule[]{ new QStringRule() };

/*
        public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
                scanner.unread();
                isEndOfLiteral = prevChar == quoteEndChar && currChar == '\'';
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
                    }
                prevChar = currChar;

            return isEndOfLiteral;
        @Override
            }
            
            }
        }
            boolean isEndOfLiteral;

        private char quoteStartChar = (char) -1;
                case '<': return '>';
                charsRead++;
import org.jkiss.dbeaver.model.text.parser.*;
                        if (quoteCharRead || quoteCharNeedsToBeUnread) {
        QStringRule() {
            return stringToken;
    private static class QStringRule implements TPPredicateRule {
            } while (!isEndOfLiteral && !isEndOfText);
/**
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {
                }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
                        quoteCharNeedsToBeUnread = true;


 * DBeaver - Universal Database Manager
                        // Probably a Q-string
        @Override
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

        @Override
                default: return startChar;
*/
        }
                    scanner.unread();
                case '[': return ']';
                if (!resume) {
                        quoteStartChar = (char) -1;
                    boolean quoteCharNeedsToBeUnread = false;
        private TPToken doEvaluate(TPCharacterScanner scanner, boolean resume) {
                    boolean quoteCharRead = false;
                c = resume ? '\'' : scanner.read();
                if (c == '\'') {
                case '(': return ')';
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
package org.jkiss.dbeaver.ext.altibase.sql;
    @Override
class AltibaseDialectRules implements TPRuleProvider {
                        }


            return doEvaluate(scanner, false);
