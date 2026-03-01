        ACTION
 *     http://www.apache.org/licenses/LICENSE-2.0
        return value;
    public T getValue() {
        return callback;
    public AIFunctionResult(
import org.jkiss.code.NotNull;
    public AIFunctionResult(
    private final DBRRunnableWithReturn<?> callback;


import org.jkiss.dbeaver.model.runtime.DBRRunnableWithReturn;
 *
        this.value = value;
 * DBeaver - Universal Database Manager
    }
 *
 * You may obtain a copy of the License at

        this.type = type;
 * you may not use this file except in compliance with the License.

        return type;
    public DBRRunnableWithReturn<?> getCallback() {
    public enum FunctionType {
 * limitations under the License.
/*
    @NotNull
        @NotNull AIFunctionResult.FunctionType type,
 * See the License for the specific language governing permissions and
public class AIFunctionResult<T> {

    public AIFunctionResult.FunctionType getType() {
        @NotNull AIFunctionResult.FunctionType type,
    ) {
        this.callback = callback;
        @NotNull T value
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
    }

        this(type, value, null);
    private final AIFunctionResult.FunctionType type;
package org.jkiss.dbeaver.model.ai;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private final T value;
 */
    }
    @Nullable

        @Nullable DBRRunnableWithReturn<?> callback
    @Nullable
        @NotNull T value,
 * Copyright (C) 2010-2026 DBeaver Corp and others

    }
        INFORMATION,
    }
}
    ) {
