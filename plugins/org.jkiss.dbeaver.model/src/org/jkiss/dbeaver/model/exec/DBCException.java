    }
    private DBCExecutionContext executionContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */

        return executionContext;
    }





 * distributed under the License is distributed on an "AS IS" BASIS,

 */
        }
    {
        this.executionContext = executionContext;
        super(message);
 *
     * Deprecated. Use constructor with execution context

 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBCException(String message)
        super(message, cause);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSource;
        this.executionContext = executionContext;
    /**
            this.executionContext = ((DBCException) cause).executionContext;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    }
}
    }
 *
    {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBDatabaseException;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    protected DBCException(String message, Throwable cause, DBPDataSource dataSource) {
    public DBCException(String message, Throwable cause, DBCExecutionContext executionContext) {
    }
        super(cause, executionContext.getDataSource());
    public DBCException(String message, Throwable cause)
public class DBCException extends DBDatabaseException
package org.jkiss.dbeaver.model.exec;
 * See the License for the specific language governing permissions and
    public DBCException(Throwable cause, DBCExecutionContext executionContext)
    public DBCExecutionContext getExecutionContext() {

 * DBCException
 * limitations under the License.
    {
        if (cause instanceof DBCException) {
        super(message, cause, executionContext.getDataSource());

{
 */
    private static final long serialVersionUID = 1L;
        }
        super(message, cause, dataSource);
            this.executionContext = ((DBCException) cause).executionContext;
 *
        if (cause instanceof DBCException) {
/*
