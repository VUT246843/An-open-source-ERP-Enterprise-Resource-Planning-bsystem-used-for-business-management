 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.exec.compile;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager

 *
/**
 * You may obtain a copy of the License at
    void clearLog();

    void error(DBCCompileError error);

    void info(String trace);
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Unless required by applicable law or agreed to in writing, software
    Throwable getError();
    void warn(DBCCompileError error);

 */
/*
 * Oracle compile log
    Collection<DBCCompileError> getErrorStack();
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBCCompileLog {

}
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    void trace(String trace);

 */
import java.util.Collection;
 *
 *

