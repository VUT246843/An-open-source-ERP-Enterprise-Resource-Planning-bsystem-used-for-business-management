                    scanner.unread();
 * distributed under the License is distributed on an "AS IS" BASIS,
                    c = scanner.read();
    }
            int prefixLength = 0;
    public TPToken evaluate(TPCharacterScanner scanner)
    }
 *
 * Unless required by applicable law or agreed to in writing, software
    @Override
                for (int i = varLength - 1 + prefixLength; i >= 0; i--) {
                for (;;) {
 * See the License for the specific language governing permissions and
                    varLength++;
 */
        if (c == '$') {
            c = scanner.read();
        this.parameterToken = parameterToken;
                    if (c == '}' || Character.isWhitespace(c) || c == TPCharacterScanner.EOF) {
 * DBeaver - Universal Database Manager
            }
                    }
            scanner.unread();
 *     http://www.apache.org/licenses/LICENSE-2.0
}



 * Licensed under the Apache License, Version 2.0 (the "License");
* ${varName}
                }
                scanner.unread();
                int varLength = 0;
                        prefixLength++;
 *
            if (SQLQueryParameter.supportsJasperSyntax()) {
        }
    {
        return TPTokenAbstract.UNDEFINED;

                }

 *
    private final TPToken parameterToken;
    public ScriptVariableRule(TPToken parameterToken) {
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
                        break;
            if (c == '{') {
        scanner.unread();
                    return parameterToken;
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
                    prefixLength++;

                if (c == 'P') {
                    if (c == '!') {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
public class ScriptVariableRule implements TPRule {
import org.jkiss.dbeaver.model.sql.SQLQueryParameter;
 * limitations under the License.
                    c = scanner.read();
 * you may not use this file except in compliance with the License.
/*
                        c = scanner.read();
package org.jkiss.dbeaver.model.sql.parser.rules;
                }
* SQL variable rule.
                if (varLength > 0 && c == '}') {

        int c = scanner.read();
import org.jkiss.dbeaver.model.text.parser.TPToken;
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others

*/
                    }
import org.jkiss.dbeaver.model.text.parser.TPRule;
 * You may obtain a copy of the License at
            }
