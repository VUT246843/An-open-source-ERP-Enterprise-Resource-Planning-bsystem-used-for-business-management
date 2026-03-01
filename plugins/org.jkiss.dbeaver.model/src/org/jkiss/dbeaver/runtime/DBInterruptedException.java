    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(message, cause);
        super(cause, dataSource);
        super(message);
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
    public DBInterruptedException(String message, Throwable cause) {
 *
        super(message, cause, dataSource);
}
    public DBInterruptedException(String message, Throwable cause, DBPDataSource dataSource) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBException
import org.jkiss.dbeaver.model.DBPDataSource;

    public DBInterruptedException(String message) {

import org.jkiss.dbeaver.DBDatabaseException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 */


package org.jkiss.dbeaver.runtime;
 * limitations under the License.
    public DBInterruptedException(Throwable cause, DBPDataSource dataSource) {

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
/*
    }
/**
 * DBeaver - Universal Database Manager
public class DBInterruptedException extends DBDatabaseException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }

 */
