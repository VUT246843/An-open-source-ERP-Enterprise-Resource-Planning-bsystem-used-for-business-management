
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * You may obtain a copy of the License at
            ((Statement)statement).setFetchSize(2000);
public class QueryTransformerFetchAll implements DBCQueryTransformer {
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
		} catch (SQLException e) {
import org.jkiss.dbeaver.model.sql.SQLQuery;
}
	@Override
 */
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
		}
import java.sql.Statement;

 * DBeaver - Universal Database Manager
	}
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;
 *

/*
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
		return query.getText();

 *     http://www.apache.org/licenses/LICENSE-2.0
	public void setParameters(Object... parameters) {
			throw new DBCException(e, statement.getSession().getExecutionContext());
		try {
package org.jkiss.dbeaver.ext.exasol.model;
	}
 * distributed under the License is distributed on an "AS IS" BASIS,

	@Override

 * you may not use this file except in compliance with the License.
import java.sql.SQLException;
	public String transformQueryString(SQLQuery query) throws DBCException {
	@Override
	public void transformStatement(DBCStatement statement, int parameterIndex) throws DBCException {
 * Unless required by applicable law or agreed to in writing, software
