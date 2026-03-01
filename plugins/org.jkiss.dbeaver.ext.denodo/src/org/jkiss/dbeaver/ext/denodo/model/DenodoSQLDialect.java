            return new TPRule[] {
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;


    }
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {
        addSQLKeywords(
        return new TPRule[0];
import java.util.Arrays;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
    public DenodoSQLDialect() {
                new SQLDollarQuoteRule(position == RulePosition.PARTITION, false, false, true) };
 *
    @NotNull
}
    }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.denodo.model;
 */
                        "VQL",
 * Unless required by applicable law or agreed to in writing, software
/*

import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;

 * limitations under the License.
    public boolean supportsAliasInConditions() {
                Arrays.asList(
    @Override
import org.jkiss.dbeaver.model.text.parser.TPRule;
                ));
        super("Denodo", "denodo");


 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
                        "DESC"
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.initDriverSettings(session, dataSource, metaData);

 * DBeaver - Universal Database Manager
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import org.jkiss.dbeaver.model.sql.parser.rules.SQLDollarQuoteRule;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return false;
    }
 *
public class DenodoSQLDialect extends GenericSQLDialect implements TPRuleProvider {
    @Override
