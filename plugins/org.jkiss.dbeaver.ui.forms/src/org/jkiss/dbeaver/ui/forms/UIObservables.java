                return first.get() && second.get();
            @Override
 *
    public static UIObservable<Boolean> and(
        @Nullable UIObservable<Boolean> first,
import java.util.Objects;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override

                if (newValue) {
    ) {
import org.eclipse.core.databinding.observable.Diffs;
            return second;
                    observable.set(value);

    @NotNull
        }
            protected Boolean calculate() {
    }
/**
        return new UIObservableImpl<>(computed, Boolean.class);

import org.jkiss.code.NotNull;
}
 * Copyright (C) 2010-2026 DBeaver Corp and others

            }
    @NotNull
            return first;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
            }
            protected void doSetValue(@NotNull Boolean newValue) {
            }

        if (first == null && second == null) {
package org.jkiss.dbeaver.ui.forms;
        if (first == null) {
 * limitations under the License.
        @Nullable UIObservable<Boolean> second
import org.eclipse.core.databinding.observable.value.ComputedValue;
    public static <T> UIObservable<Boolean> equals(@NotNull UIObservable<T> observable, @NotNull T value) {

        if (second == null) {
        };
 * you may not use this file except in compliance with the License.
/*
    }
        }
                }
            protected Boolean calculate() {
public final class UIObservables {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        ComputedValue<Boolean> computed = new ComputedValue<>() {
            @Override
            @NotNull
    private UIObservables() {
        ComputedValue<Boolean> computed = new ComputedValue<>() {
 */
 *
 * Unless required by applicable law or agreed to in writing, software
        }
                }
                return Objects.equals(observable.get(), value);
        return new UIObservableImpl<>(computed, Boolean.class);
            @NotNull
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Various utilities for working with {@link UIObservable}.
        };
 * You may obtain a copy of the License at
                    return;
                if (Objects.equals(observable.get(), newValue)) {
                    fireValueChange(Diffs.createValueDiff(false, true));
            throw new IllegalArgumentException("Either first or second must not be null");
