    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 *
        if (disposedValue == null) {
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.utils.LazyValue;
 *
     * Disposes the cached value. After calling dispose(), evaluate() will reinitialize the value.
    public synchronized void dispose() throws E {
     */
        this.value = null;
}
     * @param disposedValue the value that was disposed.
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.ai.utils;
        onDispose(disposedValue);
        // Clear the cached value and exception to force re-evaluation
    /**
public abstract class DisposableLazyValue<T, E extends Exception> extends LazyValue<T, E> {
import org.jkiss.code.NotNull;

     * @throws E if an exception occurs during disposal.
 * You may obtain a copy of the License at

     * @throws E if an exception occurs during disposal.
     */
     *
        this.exception = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0

     *
        T disposedValue = this.value;
 * limitations under the License.

    protected abstract void onDispose(@NotNull T disposedValue) throws E;
 * you may not use this file except in compliance with the License.
     * Performs cleanup operations when disposing the cached value.
/*
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
            return; // Nothing to dispose


 * DBeaver - Universal Database Manager
 *
