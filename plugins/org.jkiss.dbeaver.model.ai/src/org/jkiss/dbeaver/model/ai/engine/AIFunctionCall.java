    @Nullable
        this.hint = hint;
    }
        return messageMetadata;
        this.functionName = functionName;
    @Nullable
}
        this.messageMetadata = messageMetadata;

        this(functionName, arguments, null);
/*
    public AIFunctionDescriptor getFunction() {
 *
        this.functionName = functionName;

 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Nullable
    public String getFunctionName() {
        return function;

        return arguments;

    @Nullable
    }
    }
    @Nullable
    public AIFunctionCall() {
    }
 * limitations under the License.
    public AIFunctionCall(@NotNull String functionName, @Nullable Map<String, Object> arguments) {
    }
        this.messageMetadata = Map.copyOf(additionalProperties);
    private Map<String, Object> arguments;

package org.jkiss.dbeaver.model.ai.engine;

        return functionName + "(" + arguments + ")";
    @Nullable
    private Map<String, String> messageMetadata;
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.arguments = arguments;
    }
    }
    public void setMessageMetadata(@NotNull Map<String, String> additionalProperties) {
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
/**

 * AI function call info
     */
    @Nullable



    private AIFunctionDescriptor function;

    public void setArguments(@NotNull Map<String, Object> arguments) {
     * Properties received from AI engine. Can be required to pass down for further messages
    @Nullable
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

        return hint;
    }
    public String toString() {
 * you may not use this file except in compliance with the License.

 */
    }
    public void setFunctionName(@NotNull String functionName) {
    public Map<String, Object> getArguments() {
    @Override
 *
public class AIFunctionCall {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
     public void setFunction(@NotNull AIFunctionDescriptor function) {
 * DBeaver - Universal Database Manager
    public void setHint(@Nullable String hint) {

    }
    @Nullable

 * See the License for the specific language governing permissions and

    public String getHint() {
import org.jkiss.dbeaver.model.ai.registry.AIFunctionDescriptor;
    }
        this.function = function;
    /**
    public AIFunctionCall(@NotNull String functionName, @Nullable Map<String, Object> arguments, @Nullable Map<String, String> messageMetadata) {
import org.jkiss.code.NotNull;
    public Map<String, String> getAdditionalProperties() {

    }
import java.util.Map;
     * Example: Anthropic requires passing tool_use_id for function results to work properly
    }
        this.arguments = arguments;


    }
import org.jkiss.code.Nullable;
        return functionName;
    private String functionName;

    private String hint;
 */
