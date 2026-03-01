 * You may obtain a copy of the License at
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
import java.sql.SQLException;
}
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0

        super(cause, executionContext);
        return (SQLException) super.getCause();
 */
 *
    private static final long serialVersionUID = 1L;
    }
    public SQLException getCause() {
package org.jkiss.dbeaver.model.impl.jdbc;

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
/**
public class JDBCException extends DBCException {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public JDBCException(SQLException cause, DBCExecutionContext executionContext) {
    @Override
 * JDBCException
/*
 * you may not use this file except in compliance with the License.
 *
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
