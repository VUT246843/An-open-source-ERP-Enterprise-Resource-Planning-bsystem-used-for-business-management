
    @Override
                ddTag = CommonUtils.getBoolean(dataSource.getConnectionConfiguration().getProviderProperty(DuckDBConstants.PROP_DD_TAG_STRING), false);
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            boolean ddTag = false;
            };
    private static final List<String> DUCKDB_KEYWORDS = List.of(
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
    public boolean supportsAliasInSelect() {

                    true,
                    ddPlain
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 */
 *
                )
        super.initDriverSettings(session, dataSource, metaData);
import org.jkiss.code.NotNull;
        }

import java.util.List;
/*
}
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
                    ddTag,
            return new TPRule[] {

    }
                new SQLDollarQuoteRule(
public final class DuckDBSQLDialect extends GenericSQLDialect implements TPRuleProvider {
 * distributed under the License is distributed on an "AS IS" BASIS,
    );
        if (position == TPRuleProvider.RulePosition.INITIAL || position == TPRuleProvider.RulePosition.PARTITION) {
                    position == RulePosition.PARTITION,
        "LOAD"
            boolean ddPlain = false;
package org.jkiss.dbeaver.ext.duckdb.model;
        addSQLKeywords(DUCKDB_KEYWORDS);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
import org.jkiss.dbeaver.model.text.parser.TPRule;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull TPRuleProvider.RulePosition position) {
    }
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
 * you may not use this file except in compliance with the License.
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others

        "INSTALL",
import org.jkiss.code.Nullable;
        return true;
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
                ddPlain = CommonUtils.getBoolean(dataSource.getConnectionConfiguration().getProviderProperty(DuckDBConstants.PROP_DD_PLAIN_STRING), false);
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager
        return new TPRule[0];
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
 *
import org.jkiss.dbeaver.model.sql.parser.rules.SQLDollarQuoteRule;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (dataSource != null) {
