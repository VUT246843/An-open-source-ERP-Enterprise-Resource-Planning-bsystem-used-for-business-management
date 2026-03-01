 *
 *
package org.jkiss.dbeaver.runtime.properties;
 *
 */
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
@FunctionalInterface
import java.lang.reflect.InvocationTargetException;
 * Unless required by applicable law or agreed to in writing, software
/*
}
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface InvocationSupplier<T> {
    T get() throws InvocationTargetException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
