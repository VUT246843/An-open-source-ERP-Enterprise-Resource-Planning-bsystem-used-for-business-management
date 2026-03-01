 * Connect exception
 */
 * DBeaver - Universal Database Manager
{
 */
 *
/**
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public DBCConnectException(String message, Throwable cause, DBPDataSource dataSource) {
 * Unless required by applicable law or agreed to in writing, software
        super(message, cause);


 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
public class DBCConnectException extends DBCException
 * See the License for the specific language governing permissions and
    public DBCConnectException(String message, Throwable cause) {
    private static final long serialVersionUID = 1L;
 * You may obtain a copy of the License at
 *

    }
 * you may not use this file except in compliance with the License.


/*

        super(message, cause, dataSource);
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
package org.jkiss.dbeaver.model.exec;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
