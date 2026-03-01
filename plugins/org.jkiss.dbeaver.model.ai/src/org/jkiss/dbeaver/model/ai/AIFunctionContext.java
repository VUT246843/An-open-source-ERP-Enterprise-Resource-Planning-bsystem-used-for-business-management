
    }
 */
    @NotNull

        this.prompt = prompt;
    @NotNull
}
    public AIFunctionContext(


 */
    @NotNull
    @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBRProgressMonitor getMonitor() {
    }
    @Nullable
import org.jkiss.code.Nullable;
        this.functionCalls.add(functionCall);
 * limitations under the License.
    private final DBRProgressMonitor monitor;
 * Unless required by applicable law or agreed to in writing, software
    private final AIDatabaseContext context;
    }
    ) {
        @NotNull DBRProgressMonitor monitor,
        @Nullable AIDatabaseContext context,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
        @NotNull List<AIMessage> promptMessages
    @NotNull
public class AIFunctionContext {
        return promptMessages;
    }
    @NotNull
    private final List<AIFunctionCall> functionCalls = new ArrayList<>();
        return functionCalls;
        return prompt;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final List<AIMessage> promptMessages;
    public List<AIMessage> getPromptMessages() {
    public void addFunctionCall(@NotNull AIFunctionCall functionCall) {
package org.jkiss.dbeaver.model.ai;
/**
        this.context = context;
    public AIPromptGenerator getPrompt() {


 * AI function call context
/*
 * Licensed under the Apache License, Version 2.0 (the "License");

        return monitor;
        return context;
        this.monitor = monitor;
import org.jkiss.dbeaver.model.ai.engine.AIFunctionCall;
    }
    }
    public List<AIFunctionCall> getFunctionCalls() {

    @Nullable
    }
    public AIDatabaseContext getContext() {

        @NotNull AIPromptGenerator prompt,
import java.util.List;
    private final AIPromptGenerator prompt;
 *
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.promptMessages = promptMessages;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.

