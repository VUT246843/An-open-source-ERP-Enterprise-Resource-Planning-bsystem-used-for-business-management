
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        this.exceptions = exceptions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return exceptions;

import org.jkiss.dbeaver.DBException;
 */
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        super(message, cause);

public class DBExceptionWithHistory extends DBException {
package org.jkiss.dbeaver.model.exec;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }

    }

 * limitations under the License.
 * you may not use this file except in compliance with the License.
}
import java.util.List;
    private final List<Throwable> exceptions;
 * You may obtain a copy of the License at
/*
    public DBExceptionWithHistory(String message, Throwable cause, List<Throwable> exceptions) {
    public List<Throwable> getExceptions() {
 *
 *
