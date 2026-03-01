    }
    @NotNull
     * @return the type of the value
/**
    Class<T> type();
 * Unless required by applicable law or agreed to in writing, software
/*
        return of(value, boolean.class);
 */
        return of(value, short.class);
    /**
     */

    @NotNull
 *
    /**
        return of(value, int.class);

 */
}
    void set(T value);
     * Gets the current value.
     */

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return of(value, value.getDeclaringClass());
    /**
    static UIObservable<Double> of(double value) {
    }
import org.jkiss.code.NotNull;

     *
    }
        return of(value, float.class);

    static UIObservable<Float> of(float value) {
        return computed(supplier, Boolean.class);
    }

    }

    static <T> UIObservable<T> of(@Nullable T value, @NotNull Class<T> type) {
    @NotNull
     * @return the current value


    }
    static UIObservable<Boolean> of(boolean value) {
import org.eclipse.core.databinding.observable.value.ComputedValue;
        return of(value, String.class);
    }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
     *
@SuppressWarnings("CheckStyle")
    static UIObservable<Boolean> predicate(@NotNull Supplier<Boolean> supplier) {
    static UIObservable<Long> of(long value) {
 * A value whose changes can be observed.


    @NotNull
public sealed interface UIObservable<T> permits UIObservableImpl {
     */
    @NotNull
 *
     * Gets the type of the value.
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0

 * @param <T> the type of the value
     *
    static UIObservable<Integer> of(int value) {
 * You may obtain a copy of the License at
    static UIObservable<Byte> of(byte value) {
     * Sets a new value.
 * DBeaver - Universal Database Manager
    static UIObservable<Short> of(short value) {
    }
        return new UIObservableImpl<>(ComputedValue.create(supplier), type);
 *
     * @param value the new value
    static <T> UIObservable<T> computed(@NotNull Supplier<T> supplier, @NotNull Class<T> type) {
 * limitations under the License.
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.forms;
    static UIObservable<String> of(@Nullable String value) {

    T get();

    @NotNull

        return new UIObservableImpl<>(value, type);
    @NotNull
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    static <T extends Enum<T>> UIObservable<T> of(@NotNull T value) {
        return of(value, char.class);

 * you may not use this file except in compliance with the License.
    }
    }
    @NotNull
    @NotNull
    @NotNull
        return of(value, double.class);
    static UIObservable<Character> of(char value) {

import java.util.function.Supplier;
        return of(value, byte.class);
    @NotNull
    @NotNull
import org.jkiss.code.Nullable;
    }
        return of(value, long.class);
