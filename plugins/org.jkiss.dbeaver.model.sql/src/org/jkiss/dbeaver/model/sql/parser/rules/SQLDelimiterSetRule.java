            // Get everything till the end of line
                next = scanner.read();
 * See the License for the specific language governing permissions and
            if (Character.toUpperCase(nextChar) != c) {
        if (next == TPCharacterScanner.EOF || next == '\n' || next == '\r') {
package org.jkiss.dbeaver.model.sql.parser.rules;
 */
        this.setDelimiterToken = setDelimiterToken;
            char c = setDelimiterWord.charAt(i);
    private final String setDelimiterWord;
                    return TPTokenAbstract.UNDEFINED;
        int delimLength = 0;
                } else if (delimLength == 0 && delimBuffer.length() > 0 && Character.isWhitespace(next)) {
                if (next == TPCharacterScanner.EOF || next == '\n' || next == '\r') {
        this.setDelimiterWord = setDelimiterWord;

        for (int i = 0; i < setDelimiterWord.length(); i++) {
}
 * limitations under the License.
        {
public class SQLDelimiterSetRule implements TPRule {
            scanner.unread();
            final String newDelimiter = delimLength <= 0 ?
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
                return TPTokenAbstract.UNDEFINED;

                int prevChar = scanner.read();

 * Unless required by applicable law or agreed to in writing, software
        return setDelimiterToken;
                    break;
            scanner.unread();
                    scanner.unread();
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLSetDelimiterToken;
 *
                // Doesn't match
        int next = scanner.read();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
            delimiterRule.changeDelimiter(newDelimiter);
                for (int k = 0; k <= i; k++) {
                }
            if (scanner.getOffset() > 0) {
 * DBeaver - Universal Database Manager
                delimBuffer.append((char) next);
        } else {
/*
                    scanner.unread();
                scanner.unread();
    private final SQLDelimiterRule delimiterRule;

        StringBuilder delimBuffer = new StringBuilder();
            }

            }
                    delimLength = delimBuffer.length();
        this.delimiterRule = delimiterRule;
                if (prevChar != TPCharacterScanner.EOF && prevChar != '\r' && prevChar != '\n') {

    @Override
 * you may not use this file except in compliance with the License.
 *
                for (int k = 0; k < setDelimiterWord.length() + 1; k++) {
            }
    public TPToken evaluate(TPCharacterScanner scanner) {
                return TPTokenAbstract.UNDEFINED;

            }
        }
            final int nextChar = scanner.read();
import org.jkiss.dbeaver.model.text.parser.*;
        if (scanner instanceof TPEvalScanner && ((TPEvalScanner) scanner).isEvalMode()) {
    public SQLDelimiterSetRule(String setDelimiterWord, SQLSetDelimiterToken setDelimiterToken, SQLDelimiterRule delimiterRule) {
            for (; ; ) {
        }
*/
                delimBuffer.toString().trim() : delimBuffer.substring(0, delimLength).trim();
* Delimiter redefine rule
            if (!Character.isWhitespace(next)) {
        }
        // Must be in the beginning of line

            // Empty delimiter
                }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
/**
    }
    private final SQLSetDelimiterToken setDelimiterToken;
        }
