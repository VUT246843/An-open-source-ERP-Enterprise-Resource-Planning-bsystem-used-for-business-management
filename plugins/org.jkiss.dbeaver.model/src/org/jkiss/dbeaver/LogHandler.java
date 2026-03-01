


    void trace(String name, Object message, Throwable t);
    boolean isFatalEnabled(String name);



 * You may obtain a copy of the License at
 *
 * See the License for the specific language governing permissions and
    void error(String name, Object message);


    void warn(String name, Object message);


    void info(String name, Object message);


    void fatal(String name, Object message);
 * you may not use this file except in compliance with the License.
    void trace(String name, Object message);
    void debug(String name, Object message);
    String getName(String name);
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

    void info(String name, Object message, Throwable t);
/*
 */

    boolean isErrorEnabled(String name);
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface LogHandler {
    void warn(String name, Object message, Throwable t);

    void error(String name, Object message, Throwable t);

    void fatal(String name, Object message, Throwable t);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * limitations under the License.

package org.jkiss.dbeaver;
    boolean isDebugEnabled(String name);
 * Unless required by applicable law or agreed to in writing, software
    void debug(String name, Object message, Throwable t);


    boolean isWarnEnabled(String name);
/**
 *
    boolean isTraceEnabled(String name);
    boolean isInfoEnabled(String name);

 * Log handler
}
 */
