    }
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLControlToken;
 * You may obtain a copy of the License at
    protected boolean sequenceDetected(TPCharacterScanner scanner, char[] sequence, boolean eofAllowed) {
        for (int i = 1; i < sequence.length; i++) {
            if (!validChar) {
 *
            }
 *
 * limitations under the License.
package org.jkiss.dbeaver.model.sql.parser.rules;


                    scanner.unread();

        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;
        super(commandPrefix + controlCommand.getId() + ' ', controlToken);
                scanner.unread();
    }
            int c = scanner.read();
            boolean validChar = (seqChar == ' ' && Character.isWhitespace(c)) || Character.toUpperCase(c) == Character.toUpperCase(seqChar);
 *
import org.jkiss.dbeaver.model.text.parser.rules.EndOfLineRule;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                for (int j = i - 1; j > 0; j--) {
}
 * See the License for the specific language governing permissions and
                }
                // Non-matching character detected, rewind the scanner back to the start.
                return false;

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
                // Do not unread the first character.
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
            char seqChar = sequence[i];
 * distributed under the License is distributed on an "AS IS" BASIS,
    public SQLCommandRule(String commandPrefix, SQLCommandHandlerDescriptor controlCommand, SQLControlToken controlToken) {

public class SQLCommandRule extends EndOfLineRule {
