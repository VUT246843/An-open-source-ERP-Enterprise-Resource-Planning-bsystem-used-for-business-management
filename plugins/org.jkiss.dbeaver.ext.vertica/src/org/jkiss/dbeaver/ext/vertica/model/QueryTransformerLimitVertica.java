/**
import net.sf.jsqlparser.statement.select.PlainSelect;
public class QueryTransformerLimitVertica extends QueryTransformerLimit implements DBCQueryTransformerExt {
        if (statement instanceof PlainSelect select) {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * You may obtain a copy of the License at
        return false;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
            return query.isPlainSelect() && select.getFromItem() != null;

        }
package org.jkiss.dbeaver.ext.vertica.model;
 * you may not use this file except in compliance with the License.

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import net.sf.jsqlparser.statement.Statement;
 *
import org.jkiss.dbeaver.model.exec.DBCQueryTransformerExt;
 * limitations under the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    public boolean isApplicableTo(SQLQuery query) {
        Statement statement = query.getStatement();
    
 * No applicable to queries without FROM (see #8167)
        super(false);
    @Override
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
* Query transformer for LIMIT.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*/
 *
import org.jkiss.dbeaver.model.sql.SQLQuery;
}
    public QueryTransformerLimitVertica() {
 * Unless required by applicable law or agreed to in writing, software
