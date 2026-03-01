        return value;
 *
import org.jkiss.utils.function.ThrowableFunction;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
public class CachedValue<T> {

    private volatile T value;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.ai.model;
    private final ThrowableFunction<DBRProgressMonitor, T, DBException> supplier;
}
                if (value == null || refresh) {

    public T get(DBRProgressMonitor monitor, boolean refresh) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
        if (value == null || refresh) {


            }
                }

    }
    }
                    value = supplier.apply(monitor);
 *
 * limitations under the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
            synchronized (this) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
    public CachedValue(ThrowableFunction<DBRProgressMonitor, T, DBException> supplier) {
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.supplier = supplier;
