        String dualTableName = dataSource.getSQLDialect().getDualTableName();
/**
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.model.sql.transformers;
        String newQuery = "SELECT " + query.getText();

 * See the License for the specific language governing permissions and
 *
 * Transforms SQL expression into something like SELECT <expression> FROM DUAL.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 *
 * DBeaver - Universal Database Manager
public class SQLQueryTransformerExpression implements SQLQueryTransformer {
/*
}
    }
import org.jkiss.code.NotNull;
            newQuery += " FROM " + dualTableName;
        if (dualTableName != null) {
 * SQLQueryTransformerExpression.
import org.jkiss.dbeaver.model.DBPDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.sql.SQLQueryTransformer;
*/
import org.jkiss.dbeaver.model.sql.SQLQuery;
    public SQLQuery transformQuery(@NotNull DBPDataSource dataSource, @NotNull SQLSyntaxManager syntaxManager, @NotNull SQLQuery query) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
        }
    @Override
        return new SQLQuery(dataSource, newQuery, query, false);
 * You may obtain a copy of the License at
