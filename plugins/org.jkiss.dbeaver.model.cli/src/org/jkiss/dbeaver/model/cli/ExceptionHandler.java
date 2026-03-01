 * you may not use this file except in compliance with the License.

 *
        return exception;
 *
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    @Override
public class ExceptionHandler implements CommandLine.IExecutionExceptionHandler {
        return CLIConstants.EXIT_CODE_ERROR;
 * DBeaver - Universal Database Manager
/*
 *
    @Nullable


import picocli.CommandLine;
    @Nullable
package org.jkiss.dbeaver.model.cli;
    private Exception exception;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 */
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public ExceptionHandler() {
 * limitations under the License.

}
    public int handleExecutionException(Exception e, CommandLine commandLine, CommandLine.ParseResult fullParseResult) throws Exception {
 * See the License for the specific language governing permissions and


    public Exception getException() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        exception = e;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
