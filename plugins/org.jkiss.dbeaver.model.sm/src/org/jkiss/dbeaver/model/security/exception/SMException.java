 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
 * limitations under the License.
}
    public SMException(String message, Throwable cause, DBCExecutionContext executionContext) {
        super(cause, executionContext);
    public SMException(String message, Throwable cause) {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.security.exception;
        super(message, cause);
    }

    public SMException(Throwable cause, DBCExecutionContext executionContext) {
    public SMException(String message) {


import org.jkiss.dbeaver.model.exec.DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        super(message);
        super(message, cause, executionContext);
 *

public class SMException extends DBCException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may obtain a copy of the License at
    }
 * you may not use this file except in compliance with the License.
