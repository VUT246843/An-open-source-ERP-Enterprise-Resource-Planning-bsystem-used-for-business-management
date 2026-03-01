import java.util.Arrays;
public class LspSQLRuleManager extends SQLRuleManager {
    // TODO: A hack to include a newline rule in the list of rules, replace with proper impl after POC
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        allRules.addFirst(new NewLineRule(TPTokenAbstract.NEWLINE));


import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
 *
    }
}
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
        return allRules.toArray(new TPRule[0]);
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.text.parser.rules.NewLineRule;
        List<TPRule> allRules = new ArrayList<>(Arrays.asList(super.getAllRules()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 *

import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
    public TPRule[] getAllRules() {
import java.util.ArrayList;
package org.jkiss.dbeaver.model.lsp.context;
 * you may not use this file except in compliance with the License.

    @NotNull
    public LspSQLRuleManager(@NotNull SQLSyntaxManager syntaxManager) {
/*
    @Override
        super(syntaxManager);
import org.jkiss.dbeaver.model.text.parser.TPRule;
