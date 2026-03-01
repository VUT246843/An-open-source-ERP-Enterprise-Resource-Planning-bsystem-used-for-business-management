 */
    public static SQLControlResult success() {

 * DBeaver - Universal Database Manager
    @NotNull
        this.isSuccess = isSuccess;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return new SQLControlResult(element, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
        return new SQLControlResult(true);
 * you may not use this file except in compliance with the License.
    @Nullable
 * Unless required by applicable law or agreed to in writing, software



    public static SQLControlResult transform(@NotNull SQLScriptElement element) {

 * It may finish with no extra information or with parameters:

    }
import org.jkiss.code.Nullable;


 *
}
 *

        return transformed;
        this.isSuccess = isSuccess;
    @NotNull
 *  - error: execution error will be shown in UI
    public boolean isSuccess() {
 */
    }
    public static SQLControlResult failure() {
        this.transformed = transformed;
 *
 * You may obtain a copy of the License at
    }
 * Control command result.
 * Copyright (C) 2010-2025 DBeaver Corp and others

public class SQLControlResult {
    }

    }
    private SQLControlResult(@NotNull SQLScriptElement transformed, boolean isSuccess) {
        return isSuccess;
/*
/**
    private SQLControlResult(boolean isSuccess) {
    public SQLScriptElement getTransformed() {
    }
    private final boolean isSuccess;
 *
package org.jkiss.dbeaver.model.sql;
    private SQLScriptElement transformed;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @NotNull
        return new SQLControlResult(false);
 * limitations under the License.
 *  - message: will be shown in UI
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and

