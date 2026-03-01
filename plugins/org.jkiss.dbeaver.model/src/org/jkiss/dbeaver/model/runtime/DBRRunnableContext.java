 * DBeaver - Universal Database Manager
public interface DBRRunnableContext
package org.jkiss.dbeaver.model.runtime;

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBRRunnableContext
}
 */

     */
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBRRunnableWithProgress runnable)
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 *
import java.lang.reflect.InvocationTargetException;
/**
        throws InvocationTargetException, InterruptedException;
     * @param runnable runnable implementation
 *

/*
        boolean cancelable,
     * Runs blocking process.
{
    void run(
        boolean fork,
 *
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 */
     * If any exception occur when running this process then it'll be written in log
 * distributed under the License is distributed on an "AS IS" BASIS,
