 * See the License for the specific language governing permissions and

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others

 *

 * Runnable with parameter and progress
 */
package org.jkiss.dbeaver.model.runtime;
 *
} *     http://www.apache.org/licenses/LICENSE-2.0
@FunctionalInterface

 */
    void run(T param) throws DBException;
 * limitations under the License.
public interface DBRRunnableWithParam<T> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
/**
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * Unless required by applicable law or agreed to in writing, software

