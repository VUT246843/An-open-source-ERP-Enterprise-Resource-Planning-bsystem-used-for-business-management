                    scanner.unread();
        this.origBuffer = this.buffer = new char[maxLength];
            maxLength = Math.max(maxLength, this.delimiters[index].length);

    public SQLDelimiterRule(String[] delimiters, TPToken token) {
* DelimiterRule
/*
        int index = 0, maxLength = 0;
 * DBeaver - Universal Database Manager
            }

            this.delimiters = this.origDelimiters;
    }
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
                    // New delimiter ends with old delimiter (as command terminator). Remove it.
        this.token = token;
                if (newDelimiter.endsWith(delimStr)) {
            }

                    return;
    private char[][] delimiters, origDelimiters;
            index++;
        this.origDelimiters = this.delimiters = new char[delimiters.length][];
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
    }
        return true;
                                if (Character.isUnicodeIdentifierPart(cn)) {
                            return token;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
                        if (i == delimiters[k].length - 1 && equalsBegin(delimiters[k])) {
*/
                            }
package org.jkiss.dbeaver.model.sql.parser.rules;
    }
        }
            this.delimiters = new char[1][];
                                    matches = false;
    }
    }
        for (int i = 0; ; i++) {
            boolean matches = false;
            }
import org.jkiss.dbeaver.model.text.parser.TPToken;
import org.jkiss.utils.CommonUtils;
                                int cn = scanner.read();
                                }

                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        for (int i = 0; i < delimiter.length; i++) {
                c = Character.toUpperCase(c);
                    newDelimiter = newDelimiter.substring(0, newDelimiter.length() - delimStr.length()).trim();
                        }
                this.delimiters[index][i] = Character.toUpperCase(this.delimiters[index][i]);
            for (int i = 0; i < this.delimiters[index].length; i++) {


 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
            for (char[] delim : delimiters) {
            if (c != TPCharacterScanner.EOF) {
            this.buffer = new char[newDelimiter.length()];
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                for (int k = 0; k < delimiters.length; k++) {
 * limitations under the License.
                                scanner.unread();
        } else {
    private boolean equalsBegin(char[] delimiter) {
        return delimiters;
                                    continue;
                return false;
                String delimStr = String.valueOf(delim);
            }
            }

    private char[] buffer, origBuffer;
            this.delimiters[index] = delim.toCharArray();
    public char[][] getDelimiters() {
            if (!matches) {
}
 *
                            if (Character.isLetterOrDigit(c)) {
                if (newDelimiter.equals(delimStr)) {
import org.jkiss.dbeaver.model.text.parser.TPRule;

    public void changeDelimiter(String newDelimiter) {
        for (String delim : delimiters) {
        }
                    }
            this.buffer = this.origBuffer;
    @Override
    private final TPToken token;
                            // Matched. Check next character
            if (buffer[i] != delimiter[i]) {
                        matches = true;
                    if (i < delimiters[k].length && delimiters[k][i] == c) {
            int c = scanner.read();
 *     http://www.apache.org/licenses/LICENSE-2.0
                        buffer[i] = (char)c;
            this.delimiters[0] = newDelimiter.toUpperCase(Locale.ENGLISH).toCharArray();
    public TPToken evaluate(TPCharacterScanner scanner) {
                }
 */
 * See the License for the specific language governing permissions and
import java.util.Locale;
 *
                for (int k = 0; k <= i; k++) {
        }
        if (CommonUtils.isEmpty(newDelimiter)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class SQLDelimiterRule implements TPRule {
                        break;
        }
/**
                }
                return TPTokenAbstract.UNDEFINED;
