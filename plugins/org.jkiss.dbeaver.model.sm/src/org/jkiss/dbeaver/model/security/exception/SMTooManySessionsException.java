    private final String errorType = "tooManySessions";
    public String getErrorType() {
 * limitations under the License.
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SMTooManySessionsException(String message) {
 */
 * You may obtain a copy of the License at
    @NotNull
/*

 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
        super(message);

 *
package org.jkiss.dbeaver.model.security.exception;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
public class SMTooManySessionsException extends SMException {
        return errorType;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
