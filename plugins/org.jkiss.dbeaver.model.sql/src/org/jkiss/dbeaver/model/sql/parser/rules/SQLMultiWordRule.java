    }
    public TPToken evaluate(TPCharacterScanner scanner) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.text.parser.TPRule;


 * You may obtain a copy of the License at


            }
            }
            if (ch == TPCharacterScanner.EOF || !Character.isUnicodeIdentifierStart(ch)) {
 * you may not use this file except in compliance with the License.
            while (ch != TPCharacterScanner.EOF && Character.isWhitespace(ch)) {
                // Accept rule if last part is preceded by non-identifier character
    public SQLMultiWordRule(String[] parts, TPToken token) {
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                break;

 *
                ch = scanner.read();
public class SQLMultiWordRule implements TPRule {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.token = token;
 * limitations under the License.
    private final TPToken token;
            read--;
            }



 *
        int read = 1;
import org.jkiss.dbeaver.model.text.parser.TPToken;
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
    @Override
            scanner.unread();
 * Copyright (C) 2010-2024 DBeaver Corp and others

        outer:

import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
                // Require at least one whitespace character between parts
        Assert.isLegal(parts.length > 1, "Multi-word rule should consist of two or more parts");

                return token;
                scanner.unread();
            }
        while (read > 0) {
        for (int partIndex = 0; partIndex < parts.length; partIndex++) {
                read++;
            for (char partCh : parts[partIndex].toCharArray()) {
 * Rule for matching tokens consisting of several words separated by one or more whitespaces.
    }
                    break outer;
}
        int ch = scanner.read();
        }
                ch = scanner.read();
 * Unless required by applicable law or agreed to in writing, software
/*
    private final String[] parts;
            if (partIndex == parts.length - 1 && !Character.isUnicodeIdentifierPart(ch)) {
 * See the License for the specific language governing permissions and
            }

                }
 */
import org.eclipse.core.runtime.Assert;
/**
        return TPTokenAbstract.UNDEFINED;
package org.jkiss.dbeaver.model.sql.parser.rules;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
                if (ch == TPCharacterScanner.EOF || !Character.isUnicodeIdentifierPart(ch) || Character.toUpperCase(partCh) != Character.toUpperCase(ch)) {
        this.parts = parts;
 * DBeaver - Universal Database Manager
            if (ch == TPCharacterScanner.EOF || !Character.isWhitespace(ch)) {
                break;
                read++;
