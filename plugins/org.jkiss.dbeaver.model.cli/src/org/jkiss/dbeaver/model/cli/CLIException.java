    public short getExitCode() {
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.DBException;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        return exitCode;
}
        this.exitCode = exitCode;

    private final short exitCode;
    public CLIException(String message, short exitCode) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.cli;
 *

    public CLIException(String message, Throwable cause, short exitCode) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.exitCode = exitCode;

 *
public class CLIException extends DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    }
        super(message);

 */
    }
 *
 * limitations under the License.
 * DBeaver - Universal Database Manager
        super(message, cause);
