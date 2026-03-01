import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
            final SQLControlToken sourceToken = new SQLControlToken("mysql.source");
/*
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
        return new TPRule[0];
 *
 */
import org.jkiss.code.NotNull;

            SQLFullLineRule sourceRule2 = new SQLFullLineRule("SOURCE", sourceToken); //$NON-NLS-1$
    @Override
* MySQL dialect rules
 * See the License for the specific language governing permissions and
 *
 * Unless required by applicable law or agreed to in writing, software
        if (position == RulePosition.CONTROL) {
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.sql.parser.rules.SQLFullLineRule;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.text.parser.TPRule;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLControlToken;
            return new TPRule[] { sourceRule2 };
package org.jkiss.dbeaver.ext.mysql.sql;
    }
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
*/

    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
 * DBeaver - Universal Database Manager
    @NotNull
class MySQLDialectRules implements TPRuleProvider {
/**

