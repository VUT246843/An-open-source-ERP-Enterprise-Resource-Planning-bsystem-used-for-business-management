
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
}
 * Unless required by applicable law or agreed to in writing, software
    private final String sqlQuery;

 *
        return sqlQuery;

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.sqlQuery = sqlQuery;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at

 *
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
public class DBSQLException extends DBCException {
 * limitations under the License.
/**
    public String getSqlQuery() {
 * you may not use this file except in compliance with the License.
 */
    }
        super(cause, executionContext);

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.sql;
 * DBeaver - Universal Database Manager
    public DBSQLException(String sqlQuery, Throwable cause, DBCExecutionContext executionContext) {
import org.jkiss.dbeaver.model.exec.DBCException;
 * SQL control command
