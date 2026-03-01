 * you may not use this file except in compliance with the License.
        return text;
 * Can be returned in AI responses, signaling that certain AI function was used.

 * Unless required by applicable law or agreed to in writing, software

 * Reference to AI function.
public class AIFunctionReference {
import org.jkiss.code.NotNull;


 * This information can be used in UI to render links which trigger some UI actions.
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String text;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
 */
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.ai;
    }
 *
 */
import org.jkiss.dbeaver.model.ai.registry.AIFunctionDescriptor;
/*

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public AIFunctionDescriptor getFunction() {
 *
}

/**
    @NotNull
    @Nullable
        return function;
    public String getText() {
 * You may obtain a copy of the License at
        this.text = text;
    public AIFunctionReference(@NotNull AIFunctionDescriptor function, @Nullable String text) {
    @NotNull
 * limitations under the License.
        this.function = function;
    @Nullable
 * See the License for the specific language governing permissions and
    private final AIFunctionDescriptor function;
