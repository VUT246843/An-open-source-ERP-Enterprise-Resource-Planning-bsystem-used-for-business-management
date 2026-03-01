    @Nullable
    }
 *

 * Completion request
    private final AIFunctionCall functionCall;
        this.functionCall = null;
    @NotNull
        @Nullable AIUsage usage

 * DBeaver - Universal Database Manager
        this.variants = null;

    public AIEngineResponse(
    @Override
import org.jkiss.code.NotNull;
 * limitations under the License.
        @NotNull AIMessageType type,
     * Constructs response with function call
    public AIUsage getUsage() {
    @Nullable
    }
    @Nullable
    public List<String> getVariants() {
    public String toString() {
    public AIFunctionCall getFunctionCall() {

}
    private int processingTime;
        return "AI response (" + type + ") " + (variants != null ? variants : functionCall);

    private final AIMessageType type;
    /**
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AIEngineResponse(@NotNull AIFunctionCall functionCall, @Nullable AIUsage usage) {
        this.type = AIMessageType.FUNCTION;
        return variants;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.ai.AIMessageType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

    ) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        return usage;
    }
 *
import java.util.List;
        @NotNull List<String> variants,
public class AIEngineResponse {
        this.usage = usage;
    @Nullable
    }

package org.jkiss.dbeaver.model.ai.engine;

        this.variants = variants;

    public AIMessageType getType() {
 * See the License for the specific language governing permissions and
 */
    @Nullable
    }
import org.jkiss.code.Nullable;
        this.usage = usage;
    }
     * Constructs response with text message

        this.functionCall = functionCall;
     */
 * you may not use this file except in compliance with the License.

        return functionCall;
/**
    @Nullable
        this.type = type;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.ai.AIUsage;

 */
    private final List<String> variants;
    /**
    private final AIUsage usage;
     */
    }
        return type;
