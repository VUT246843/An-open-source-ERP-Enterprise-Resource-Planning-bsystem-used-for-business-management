    @NotNull
}
    protected E exception;
    protected abstract O initialize(I input) throws E;
    }

     */
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.ai.utils;
 */

                value = initialize(input);
     */
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * @throws E if an exception occurred during initialization.

     * Evaluates the value. If the value has not been initialized yet, it is initialized by calling {@link #initialize(Object)} ()}.
    public synchronized O getInstance(I input) throws E {
                exception = (E) e;
    /**
 * DBeaver - Universal Database Manager
     * @return the value
        }
     * @return the initialized value.
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @throws E if an exception occurred during initialization.
 * See the License for the specific language governing permissions and
     *
     * Initializes the value.
 * You may obtain a copy of the License at
    protected O value;
 *
        if (value == null) {
public abstract class LazyValueWithArg<I, O, E extends Exception> {
 * distributed under the License is distributed on an "AS IS" BASIS,
            } catch (Exception e) {
import org.jkiss.code.NotNull;
     *
            throw exception;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
            }
    /**
        return value;
                exception = null;
 * you may not use this file except in compliance with the License.
/*
        if (exception != null) {

            try {
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
