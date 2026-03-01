import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;

    }
    {
        } catch (SQLException e) {
        try {

 *
}        }
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.

 *
* Query transformer for fetch-all selects
class QueryTransformerFetchAll implements DBCQueryTransformer {
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    @Override
import java.sql.Statement;
/**
 */
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
    public String transformQueryString(SQLQuery query) throws DBCException {
/*
 * See the License for the specific language governing permissions and
    public static final int BULK_EXPORT_FETCH_SIZE = 100000;

 * You may obtain a copy of the License at
            throw new DBCException(e, statement.getSession().getExecutionContext());
            ((Statement)statement).setFetchSize(BULK_EXPORT_FETCH_SIZE);
    }
        // Set fetch size to 100k (maybe this should be configurable?)
*/
    public void setParameters(Object... parameters)
    public void transformStatement(DBCStatement statement, int parameterIndex) throws DBCException {
import java.sql.SQLException;

        return query.getText();
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.postgresql.model;
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.SQLQuery;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

