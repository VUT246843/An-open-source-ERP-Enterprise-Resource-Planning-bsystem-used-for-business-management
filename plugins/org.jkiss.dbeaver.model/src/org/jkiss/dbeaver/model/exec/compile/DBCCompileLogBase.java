
    protected void log(final int type, final Object message, final Throwable t)
    @Override


    /** "Warn" level logging. */

/*
    {
    public DBCCompileLogBase()
    public void error(DBCCompileError error) {
    @Override
        log(LOG_LEVEL_INFO, trace, null);
 * Unless required by applicable law or agreed to in writing, software
    {
            errorStack.add((DBCCompileError) message);
    public static final int LOG_LEVEL_ERROR  = 5;
            error = t;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

        error = null;
    }
    public Throwable getError()
 * you may not use this file except in compliance with the License.

    /** "Info" level logging. */
        log(LOG_LEVEL_WARN, error, null);
    /** "Trace" level logging. */

 *
    public static final int LOG_LEVEL_WARN   = 4;
        return errorStack;
    public static final int LOG_LEVEL_TRACE  = 1;

    /** "Error" level logging. */
    }
import java.util.ArrayList;
import java.util.List;
    }
    private List<DBCCompileError> errorStack = new ArrayList<>();
    }
        return error;

 */
}
        }
    }
    public static final int LOG_LEVEL_INFO   = 3;

    }

    private Throwable error;
    /** "Debug" level logging. */
 * You may obtain a copy of the License at
 *
        errorStack.clear();
        } else if (message instanceof DBCCompileError) {
    }
import java.util.Collection;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override

    {
    public void clearLog()
    }
    public void warn(DBCCompileError error) {
public class DBCCompileLogBase implements DBCCompileLog {
 * DBeaver - Universal Database Manager
    {
    /** "Fatal" level logging. */
    public Collection<DBCCompileError> getErrorStack()
    @Override
    @Override
        log(LOG_LEVEL_TRACE, trace, null);
        if (t != null) {
    }
        log(LOG_LEVEL_ERROR, error, null);
    @Override


    public void info(String trace) {
    public static final int LOG_LEVEL_FATAL  = 6;
 *
    public static final int LOG_LEVEL_DEBUG  = 2;
    public void trace(String trace) {
    @Override
package org.jkiss.dbeaver.model.exec.compile;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
