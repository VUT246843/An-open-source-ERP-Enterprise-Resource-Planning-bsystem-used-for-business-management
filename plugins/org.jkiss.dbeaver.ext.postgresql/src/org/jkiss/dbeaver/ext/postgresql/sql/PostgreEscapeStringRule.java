                chRead++;
    @Override

 * See the License for the specific language governing permissions and
    @Override
            return TPTokenAbstract.UNDEFINED;
                chRead++;

 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    @Override
        } while (ch != TPCharacterScanner.EOF);
 *     http://www.apache.org/licenses/LICENSE-2.0
            scanner.unread();
 * DBeaver - Universal Database Manager


    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
            }
 * described in <b>4.1.2.2</b> chapter of PostgreSQL documentation.
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        if (scanner.read() != '\'') {
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.text.parser.*;
            scanner.unread();
            scanner.unread();
/*
    }
public class PostgreEscapeStringRule implements TPPredicateRule {
        return TPTokenAbstract.UNDEFINED;

        if ((ch = scanner.read()) != 'e' && ch != 'E') {

package org.jkiss.dbeaver.ext.postgresql.sql;
        if (scanner.getColumn() > 0) {
            } else if (ch == '\'') {
                    scanner.unread();
 * This rule matches string literals with C-Style escapes, as
                    return stringToken;
    private final TPToken stringToken = new TPTokenDefault(SQLTokenType.T_STRING);

            scanner.unread();
        }
        }
                return TPTokenAbstract.UNDEFINED;
            if (ch == '\\') {

    public TPToken getSuccessToken() {
        return evaluate(scanner, false);

            return TPTokenAbstract.UNDEFINED;
                // Previous character is a part of identifier, we

 * Licensed under the Apache License, Version 2.0 (the "License");
    public TPToken evaluate(TPCharacterScanner scanner) {
                ch = scanner.read();
            if (Character.isLetterOrDigit(ch = scanner.read()) || ch == '_') {
 * Unless required by applicable law or agreed to in writing, software
            scanner.unread();
 *
    }
                // don't want to take a bite of it by accident
 * @see <a href="https://www.postgresql.org/docs/current/sql-syntax-lexical.html#SQL-SYNTAX-STRINGS-ESCAPE">4.1.2.2. String Constants with C-Style Escapes</a>
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
 */
        }
            chRead++;
                }
        int ch;

            ch = scanner.read();
        return stringToken;

        while (chRead-- > 0) {
                ch = scanner.read();
 * you may not use this file except in compliance with the License.
    }
}
        do {
                if (ch != '\'' && ch != TPCharacterScanner.EOF) {
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int chRead = 2;
 *
        }
 */
