 */
            }

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
        this.token = new SQLVariableToken();
        return token;
/*

 * See the License for the specific language governing permissions and


            read++;
            ch = scanner.read();
        }
    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.text.parser.TPPredicateRule;

import org.jkiss.code.NotNull;
}
    private final TPToken token;
    }
                    return token;
import org.jkiss.dbeaver.model.text.parser.TPToken;
                do {
 * limitations under the License.
    }
    @Override
    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.model.sql.parser.rules;
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
 *
    public TPToken evaluate(TPCharacterScanner scanner) {
        return TPTokenAbstract.UNDEFINED;
        if (!dialect.validIdentifierPart((char) ch, false)) {
 * DBeaver - Universal Database Manager
    }
        this.dialect = dialect;
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLVariableToken;
    @Override
 *

    public SQLVariableRule(@NotNull SQLDialect dialect) {
    }
                } while (dialect.validIdentifierPart((char) ch, false));
            if (ch == '@') {
                    ch = scanner.read();

        int ch = scanner.read();
            scanner.unread();
import org.jkiss.dbeaver.model.sql.SQLDialect;
        return evaluate(scanner, false);


    private final SQLDialect dialect;

 * Rule that matches {@code @variableName} supported by some dialects.
        int read = 0;
/**
    public TPToken getSuccessToken() {
 *
                    read++;


public class SQLVariableRule implements TPPredicateRule {
 * You may obtain a copy of the License at
                    scanner.unread();
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (read > 2) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        while (read-- > 0) {
        scanner.unread();
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

