/*

 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.lang.reflect.InvocationTargetException;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
@FunctionalInterface
 *
 */
public interface DBRRunnableParametrized<T> {
 */
 *
} * See the License for the specific language governing permissions and
        throws DBException, InvocationTargetException, InterruptedException;
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * Runnable with parameter
/**

package org.jkiss.dbeaver.model.runtime;


 * you may not use this file except in compliance with the License.
    void run(T param)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
