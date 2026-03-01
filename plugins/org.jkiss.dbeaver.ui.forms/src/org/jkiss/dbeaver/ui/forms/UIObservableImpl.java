 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.delegate = delegate;
 */
    private final Class<T> type;
 * you may not use this file except in compliance with the License.
 *
import org.eclipse.core.databinding.observable.value.IObservableValue;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
        this.delegate = new WritableValue<>(value, type);
import org.jkiss.code.Nullable;
    private final IObservableValue<T> delegate;
 *
final class UIObservableImpl<T> implements UIObservable<T> {
        return delegate;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.type = type;
@SuppressWarnings("CheckStyle")

package org.jkiss.dbeaver.ui.forms;
        this.type = type;
 * You may obtain a copy of the License at

import org.eclipse.core.databinding.observable.value.WritableValue;

    public Class<T> type() {
    UIObservableImpl(@NotNull IObservableValue<T> delegate, Class<T> type) {
    }
        return type;

    IObservableValue<T> delegate() {
    @Override
 *
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    public void set(T value) {

        delegate.setValue(value);

    }
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    UIObservableImpl(@Nullable T value, @NotNull Class<T> type) {

    public T get() {
/*
    @Override
    }
        return delegate.getValue();
 * DBeaver - Universal Database Manager
}
    }

    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
