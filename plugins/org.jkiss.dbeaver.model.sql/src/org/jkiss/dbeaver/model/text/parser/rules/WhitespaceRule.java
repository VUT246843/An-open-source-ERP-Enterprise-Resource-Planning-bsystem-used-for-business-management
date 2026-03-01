 * You may obtain a copy of the License at
                c = scanner.read();
            scanner.unread();
    }
    public WhitespaceRule(TPToken token) {
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.text.parser.TPToken;
        if (Character.isWhitespace((char) c)) {
        }
 *
    @Override
            } while (Character.isWhitespace((char) c));
/*

        int c = scanner.read();
import org.jkiss.dbeaver.model.text.parser.TPRule;

}
    private final TPToken fWhitespaceToken;
 * Whitespace rule
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 */
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
            do {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,


        return TPTokenAbstract.UNDEFINED;
 *
 * limitations under the License.
/**
            return fWhitespaceToken;
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
        scanner.unread();
package org.jkiss.dbeaver.model.text.parser.rules;
 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
        fWhitespaceToken = token;
public class WhitespaceRule implements TPRule {
    public TPToken evaluate(TPCharacterScanner scanner) {
