        // Set fetch size to Integer.MIN_VALUE to enable result set streaming
    }
 *
    public void transformStatement(DBCStatement statement, int parameterIndex) throws DBCException {
    QueryTransformerFetchAll(MySQLDataSource dataSource) {
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
import org.jkiss.dbeaver.model.sql.SQLQuery;
* Query transformer for fetch-all selects
    public void setParameters(Object... parameters)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
import org.jkiss.dbeaver.model.exec.DBCStatement;
class QueryTransformerFetchAll implements DBCQueryTransformer {
    public String transformQueryString(SQLQuery query) throws DBCException {
import java.sql.SQLException;
 *
    final MySQLDataSource dataSource;

 * DBeaver - Universal Database Manager
        this.dataSource = dataSource;
package org.jkiss.dbeaver.ext.mysql.model;
/*
    }
    @Override
        } catch (SQLException e) {

 */
        try {
    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software

            if (!dataSource.isMariaDB() && dataSource.supportsFetchTransform()) {
        return query.getText();
    }
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
*/
    {
    }
                ((Statement) statement).setFetchSize(Integer.MIN_VALUE);
 * you may not use this file except in compliance with the License.
            }
import org.jkiss.dbeaver.model.exec.DBCException;
 *
        }
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
            throw new DBCException(e, statement.getSession().getExecutionContext());
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

import java.sql.Statement;

/**
