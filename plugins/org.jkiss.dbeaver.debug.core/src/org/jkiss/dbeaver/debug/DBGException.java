    public DBGException(Throwable cause, DBPDataSource dataSource) {
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
        super(message);

import org.jkiss.dbeaver.model.DBPDataSource;
    public DBGException(String message, Throwable cause, DBPDataSource dataSource) {
}
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
/*
import org.jkiss.dbeaver.DBDatabaseException;

 * Unless required by applicable law or agreed to in writing, software
    public DBGException(String message, Throwable e) {
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
@SuppressWarnings("serial")

    }

 * distributed under the License is distributed on an "AS IS" BASIS,
public class DBGException extends DBDatabaseException {
 */
 *
    }
 *
        super(message, e);
 * DBeaver - Universal Database Manager
    public DBGException(String message) {



 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
        super(cause, dataSource);
package org.jkiss.dbeaver.debug;
        super(message, cause, dataSource);
