 * Copyright (C) 2010-2025 DBeaver Corp and others
}
 *
package org.jkiss.dbeaver.model.text.parser.rules;

import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;

/*
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (c == '\r') {
        }
        this.newlineToken = newlineToken;
    }
                scanner.unread();
    public NewLineRule(TPToken newlineToken) {
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
        int c = scanner.read();
 * See the License for the specific language governing permissions and

        return TPTokenAbstract.UNDEFINED;
        }
            int next = scanner.read();

        if (c == '\n') {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final TPToken newlineToken;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * limitations under the License.
 */
 * You may obtain a copy of the License at
            }
    @Override
    public TPToken evaluate(TPCharacterScanner scanner) {
 * you may not use this file except in compliance with the License.
        scanner.unread();
import org.jkiss.dbeaver.model.text.parser.TPRule;
 *
            if (next != '\n') {
import org.jkiss.dbeaver.model.text.parser.TPToken;
public class NewLineRule implements TPRule {
            return newlineToken;
 * DBeaver - Universal Database Manager
            return newlineToken;
