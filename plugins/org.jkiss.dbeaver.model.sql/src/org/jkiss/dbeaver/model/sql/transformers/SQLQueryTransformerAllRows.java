/**
        allRowsQuery.setResultSetLimit(0, 0);
import org.jkiss.dbeaver.model.sql.SQLQueryTransformer;
 */
 * DBeaver - Universal Database Manager
/*
 * See the License for the specific language governing permissions and

 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    @Override
    public SQLQuery transformQuery(@NotNull DBPDataSource dataSource, @NotNull SQLSyntaxManager syntaxManager, @NotNull SQLQuery query) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return allRowsQuery;
}
 *
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.sql.transformers;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
import org.jkiss.dbeaver.model.DBPDataSource;
public class SQLQueryTransformerAllRows implements SQLQueryTransformer {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLQuery;
 * SQLQueryTransformerAllRows.

        SQLQuery allRowsQuery = new SQLQuery(dataSource, query.getText(), query);
*/
    }
import org.jkiss.code.NotNull;
