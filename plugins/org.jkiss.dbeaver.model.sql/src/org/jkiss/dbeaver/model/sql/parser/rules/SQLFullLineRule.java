 *
        super(startSequence, token, escapeCharacter, escapeContinuesLine);
/*
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.text.parser.rules.EndOfLineRule;
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
    public SQLFullLineRule(String startSequence, TPToken token, char escapeCharacter, boolean escapeContinuesLine) {
 * you may not use this file except in compliance with the License.
            }
            if (prevChar != TPCharacterScanner.EOF && prevChar != '\r' && prevChar != '\n') {
        super(startSequence, token, escapeCharacter);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    public SQLFullLineRule(String startSequence, TPToken token, char escapeCharacter) {
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
    public SQLFullLineRule(String startSequence, TPToken token) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return super.evaluate(scanner);
    @Override
        super(startSequence, token);
                return TPTokenAbstract.UNDEFINED;
* Rule which starts in the beginning of line
            scanner.unread();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * DBeaver - Universal Database Manager

*/

        // Must be in the beginning of line
/**
        if (scanner.getOffset() > 0) {

 */
import org.jkiss.dbeaver.model.text.parser.TPToken;
    }
 * limitations under the License.
 *
    public TPToken evaluate(TPCharacterScanner scanner) {
public class SQLFullLineRule extends EndOfLineRule {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            int prevChar = scanner.read();

package org.jkiss.dbeaver.model.sql.parser.rules;
}
 * You may obtain a copy of the License at
    }
    }
 * Unless required by applicable law or agreed to in writing, software
