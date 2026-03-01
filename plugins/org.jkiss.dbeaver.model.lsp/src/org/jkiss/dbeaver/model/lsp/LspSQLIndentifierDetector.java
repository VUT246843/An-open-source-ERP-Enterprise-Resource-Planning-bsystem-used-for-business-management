
 */
    public LspSQLIndentifierDetector(SQLDialect dialect) {
package org.jkiss.dbeaver.model.lsp;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        }

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        while (!token.isEOF()) {

        scanner.setRules(ruleManager.getAllRules());
/*
    }
        final TPRuleBasedScanner scanner = new TPRuleBasedScanner();

            token = scanner.nextToken();

        List<Pair<TPToken, Region>> tokens = new ArrayList<>();
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.text.parser.TPRuleBasedScanner;
        return tokens;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.SQLDialect;
    }
        this.dialect = dialect;
import java.util.ArrayList;
import org.jkiss.code.NotNull;
        TPToken token = scanner.nextToken();
    protected SQLDialect dialect;
 *
public class LspSQLIndentifierDetector extends TPWordDetector {


 *
import java.util.List;

                tokens.add(new Pair<>(token, new Region(scanner.getTokenOffset(), scanner.getTokenLength())));
            if (token instanceof TPTokenAbstract) {
import org.jkiss.dbeaver.model.text.parser.TPToken;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<Pair<TPToken, Region>> extractAllTokens(@NotNull IDocument document, @NotNull SQLRuleManager ruleManager) {
import org.eclipse.jface.text.Region;
import org.jkiss.utils.Pair;
}
        scanner.setRange(document, 0, document.getLength());

import org.eclipse.jface.text.IDocument;
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.text.parser.TPWordDetector;
