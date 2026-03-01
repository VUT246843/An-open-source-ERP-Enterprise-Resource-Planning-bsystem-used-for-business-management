
package org.jkiss.dbeaver.ui.forms;
}
    static IStatus warning(@NotNull String message) {
        return ValidationStatus.cancel(message);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IStatus;
    }
    }
    static IStatus error(@NotNull String message) {
    }
 */
        return ValidationStatus.error(message);
    static IStatus cancel(@NotNull String message) {
        return ValidationStatus.ok();

 * @param <T> value type
@FunctionalInterface
        return ValidationStatus.warning(message);
 * Unless required by applicable law or agreed to in writing, software
    }
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }
    static IStatus info(@NotNull String message) {
 */
public interface UIValidator<T> extends Function<T, IStatus> {
    @NotNull

        return ValidationStatus.error(message, exception);
 * limitations under the License.
    @NotNull
 * Value validator

    @NotNull
    @NotNull
import org.jkiss.code.NotNull;


        return ValidationStatus.info(message);
    @NotNull
    static IStatus error(@NotNull String message, @NotNull Throwable exception) {
 *
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
/*
 * See the License for the specific language governing permissions and
 *
    @NotNull
import org.eclipse.core.databinding.validation.ValidationStatus;
    static IStatus ok() {
import java.util.function.Function;
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others
