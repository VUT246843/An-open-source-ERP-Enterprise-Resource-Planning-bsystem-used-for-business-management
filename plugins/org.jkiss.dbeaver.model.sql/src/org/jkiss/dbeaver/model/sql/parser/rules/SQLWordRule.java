                }
 *
                    }
                for (int i = 1; i < wordDelimiter.length; i++) {

                        break;

        // Check for delimiter
                    if (c2 != wordDelimiter[i]) {
 * Smart word detector
 *
        functions.add(function.toLowerCase());
        }
    public void addFunction(String function) {
 * distributed under the License is distributed on an "AS IS" BASIS,


                int charsRead = 0;
}
 * Unless required by applicable law or agreed to in writing, software
        for (int i = buffer.length() - 1; i >= 0; i--) {
 * You may obtain a copy of the License at
                    length += 1;
                    return false;
    private void unreadBuffer(TPCharacterScanner scanner) {
                }
                buffer.append((char) c);
        this.defaultToken = defaultToken;
public class SQLWordRule implements TPRule {
            }
 */
            String buffer = this.buffer.toString().toLowerCase();
    private final SQLDelimiterRule delimRule;


import org.jkiss.dbeaver.model.sql.SQLDialect;

                c = scanner.read();
    }
            delimiters = delimRule.getDelimiters();
                unreadBuffer(scanner);
                }
    public boolean hasWord(String word) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (defaultToken.isUndefined())
                }
            if (token != null)
        if (c == '$' && prevC == '$') {

        this.functionToken = functionToken;
import org.jkiss.dbeaver.model.text.parser.TPRule;
            } while (c != TPCharacterScanner.EOF && isWordPart((char) c, prevC, scanner));

                }
    }
 * See the License for the specific language governing permissions and
                        matches = false;
                if (matches) {


                }
            return false;
    }
        }
        }
 *
    private boolean isWordPart(char c, char prevC, TPCharacterScanner scanner) {
        for (char[] wordDelimiter : delimiters) {
                    c = scanner.read();
                    int c2 = scanner.read();
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
    }
                if (c == '(' || token == null) {
import org.jkiss.dbeaver.model.text.parser.TPToken;
import java.util.HashMap;

    private char[][] delimiters;
import org.jkiss.code.NotNull;
        }
import java.util.HashSet;
        if (c != TPCharacterScanner.EOF && dialect.isWordStart(c)) {
            if (!Character.isLetter(c) && c == wordDelimiter[0]) {
                    charsRead++;
    public TPToken evaluate(TPCharacterScanner scanner) {
/**
                    scanner.unread();

        return words.containsKey(word.toLowerCase());
    }
/*
                int length = 0;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
                while (c != TPCharacterScanner.EOF && Character.isWhitespace(c)) {
                    }
        return TPTokenAbstract.UNDEFINED;
            }
                    return false;
        words.put(word.toLowerCase(), token);
            buffer.setLength(0);
            TPToken token = words.get(buffer);
            return defaultToken;
            buffer.setLength(buffer.length() - 1);
    private final StringBuilder buffer = new StringBuilder();
        this.delimRule = delimRule;
            scanner.unread();
        this.dialect = dialect;
                while (length > 0) {
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
    public SQLWordRule(SQLDelimiterRule delimRule, TPToken functionToken, TPToken defaultToken, @NotNull SQLDialect dialect) {


    private final SQLDialect dialect;
    private final Set<String> functions = new HashSet<>();
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
                for (int i = 0; i < charsRead; i++) {
    }
                        break;
    private final Map<String, TPToken> words = new HashMap<>();
                prevC = (char)c;
        }

    public void addWord(String word, TPToken token) {
            if (functions.contains(buffer)) {
        scanner.unread();
                    if (c2 == TPCharacterScanner.EOF) {
            char prevC;
            scanner.unread();

            do {
    public boolean hasFunction(String function) {
    private final TPToken functionToken;
    @Override

                boolean matches = true;
                    length -= 1;
import java.util.Set;
                    return functionToken;
    }
 * DBeaver - Universal Database Manager
        int c = scanner.read();
            return false;

    private final TPToken defaultToken;
        if (!dialect.isWordPart(c) && c != '$') {
                return token;
package org.jkiss.dbeaver.model.sql.parser.rules;
        return true;
        return functions.contains(function);
                if (wordDelimiter.length == 1) {
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            scanner.unread();
    }

            // Double dollar. Prev dollar is also wrong char

                }
                    scanner.unread();
