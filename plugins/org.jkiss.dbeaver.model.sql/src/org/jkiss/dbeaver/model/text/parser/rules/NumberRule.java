                ch = scanner.read();
            return undefined(scanner, 1);
                    return undefined(scanner, chCount);
                if (ch < '0' || ch > '9') {
    }
            }
        }
        while (readCount > 0) {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager

     * token when a numerical sequence is detected.
            readCount--;

                scanner.unread();
    public static final int RADIX_DECIMAL = 10;
                }
            }
                seenScientificNotation = true;
        if (!CommonUtils.isDigit(ch, RADIX_DECIMAL)) {
 */
/*

    /**
/**
import org.jkiss.code.NotNull;
    }
                ch = scanner.read();
 * See the License for the specific language governing permissions and

            if (ch1 == 'x' || ch1 == 'X') {
import org.jkiss.utils.CommonUtils;
    public static final int RADIX_HEXADECIMAL = 16;

                return fToken;
        if (ch == '0') {
                if (seenDecimalSeparator) {
import org.jkiss.dbeaver.model.text.parser.TPRule;
                continue;
    public NumberRule(@NotNull TPToken token) {
        }
    protected TPToken fToken;
                    chCount++;
 * distributed under the License is distributed on an "AS IS" BASIS,
                chCount++;
                seenDecimalSeparator = true;
                if (ch == '+' || ch == '-') {
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;

        fToken = token;
 * with optional decimal part, scientific notation (<code>10e-3</code>)
                    return undefined(scanner, 3);
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int ch = scanner.read();
     * Creates a rule which will return the specified

                if (seenScientificNotation) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.text.parser.TPToken;
            chCount++;
     */
                    return undefined(scanner, chCount);
                }
 * limitations under the License.


 * You may obtain a copy of the License at
                    return undefined(scanner, chCount);
 *
                continue;
     */
 * An implementation of <code>IRule</code> detecting a numerical value
 */
            scanner.unread();
            if (!CommonUtils.isDigit(ch, radix)) {
        }
                if (CommonUtils.isDigit(ch1, RADIX_HEXADECIMAL)) {
        return TPTokenAbstract.UNDEFINED;
                chCount++;
                }
                ch1 = scanner.read();
    }
                    radix = RADIX_HEXADECIMAL;
            if (radix == RADIX_DECIMAL && ch == '.') {
        }
        int chCount = 1;
                } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        boolean seenScientificNotation = false;
    public TPToken evaluate(TPCharacterScanner scanner) {
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
                }
    /**

                if (ch < '0' || ch > '9') {
                }


            }
                    ch = scanner.read();
            if (radix == RADIX_DECIMAL && (ch == 'e' || ch == 'E')) {

            } else {
     * The token to be returned when this rule is successful
        boolean seenDecimalSeparator = false;
package org.jkiss.dbeaver.model.text.parser.rules;
    @Override
     * @param token the token to be returned
    private static TPToken undefined(TPCharacterScanner scanner, int readCount) {

 * you may not use this file except in compliance with the License.
     *
                    return undefined(scanner, chCount);
}
        int radix = RADIX_DECIMAL;

 *
        while (true) {
 * and support for the hexadecimal base (16).
                }
            int ch1 = scanner.read();
            ch = scanner.read();
public class NumberRule implements TPRule {
                scanner.unread();
 *     http://www.apache.org/licenses/LICENSE-2.0
