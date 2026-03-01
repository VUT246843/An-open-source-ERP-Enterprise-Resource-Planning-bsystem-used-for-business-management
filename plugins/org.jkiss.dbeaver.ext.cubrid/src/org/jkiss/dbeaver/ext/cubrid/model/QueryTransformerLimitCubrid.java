            String having = String.valueOf(select.getHaving()).toUpperCase();
        String sql = super.transformQueryString(query);

        if (statement instanceof PlainSelect select) {
        implements DBCQueryTransformerExt {
    }
    @Override

    }
 * limitations under the License.
package org.jkiss.dbeaver.ext.cubrid.model;
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.sql.SQLQuery;
                return false;
}

    @Override
        Statement statement = query.getStatement();

        super(true);
                return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    }


        return true;
 *

        return dataSource.wrapShardQuery(sql);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String transformQueryString(SQLQuery query) throws DBCException {
    public QueryTransformerLimitCubrid() {
import net.sf.jsqlparser.statement.select.PlainSelect;
            }
            }
        }
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class QueryTransformerLimitCubrid extends QueryTransformerLimit
    public boolean isApplicableTo(SQLQuery query) {
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        CubridDataSource dataSource = (CubridDataSource) query.getDataSource();
 *

import org.jkiss.dbeaver.model.exec.DBCQueryTransformerExt;
import org.jkiss.dbeaver.model.exec.DBCException;
        return statement != null && isLimitApplicable(statement);
            if (having.contains("GROUPBY_NUM")) {
            if (where.contains("ROWNUM") || where.contains("INST_NUM")) {
import net.sf.jsqlparser.statement.Statement;
    public boolean isLimitApplicable(Statement statement) {
 */
            String where = String.valueOf(select.getWhere()).toUpperCase();
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
