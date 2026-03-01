
            return new TPRule[] {
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/*
    @Override
        }
* Exasol dialect rules
}
 *
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
    }
        }
            return new TPRule[] {new ExasolSquareBracketsRule(dataSource,  position == RulePosition.PARTITION) };
            };
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.text.parser.TPRule;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (position == TPRuleProvider.RulePosition.CONTROL) {


import org.jkiss.dbeaver.ext.exasol.sql.ExasolSquareBracketsRule;
            final SQLControlToken defineToken = new SQLControlToken("exasol.define");
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {
/**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
                new SQLFullLineRule("DEFINE", defineToken) //$NON-NLS-1$
class ExasolDialectRules implements TPRuleProvider {
    @NotNull
import org.jkiss.dbeaver.model.sql.parser.rules.SQLFullLineRule;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                new SQLFullLineRule("define", defineToken), //$NON-NLS-1$
*/
        return new TPRule[0];
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLControlToken;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
 *
 */
package org.jkiss.dbeaver.ext.exasol.editors;
 * See the License for the specific language governing permissions and
