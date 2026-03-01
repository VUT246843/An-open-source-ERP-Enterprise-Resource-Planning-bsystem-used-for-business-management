    private final AIFunctionCall functionCall;
    @NotNull
    public List<String> getChoices() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public AIEngineResponseChunk(
 *     http://www.apache.org/licenses/LICENSE-2.0

}

        }
 * Unless required by applicable law or agreed to in writing, software

/*
    public AIEngineResponseChunk(@NotNull AIFunctionCall functionCall) {
package org.jkiss.dbeaver.model.ai.engine;
import org.jkiss.code.Nullable;
 *
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
import java.util.List;
 *
 * See the License for the specific language governing permissions and
    }
        @NotNull List<String> choices

    @Nullable
        if (functionCall != null) {
public final class AIEngineResponseChunk {
        this.functionCall = functionCall;
    private final List<String> choices;
    @Nullable
    @NotNull
        this.choices = choices;
 * you may not use this file except in compliance with the License.
            return functionCall.toString();

// FIXME: create several subclasses for different types of chunks


        this.functionCall = null;
        this.choices = Collections.emptyList();
import java.util.Collections;
 */
        return choices;
    public AIFunctionCall getFunctionCall() {
    }
 *
 * You may obtain a copy of the License at
    ) {
    public String toString() {
        return choices.toString();
    @Override
 * limitations under the License.
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,
        return functionCall;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

