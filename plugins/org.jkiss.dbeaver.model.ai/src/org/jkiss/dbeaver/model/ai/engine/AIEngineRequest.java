 * Unless required by applicable law or agreed to in writing, software
    public List<AIMessage> getMessages() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }

    private boolean wasPromptTruncated = false;
    public void setFunctions(@NotNull List<AIFunctionDescriptor> functions) {
/*
import org.jkiss.dbeaver.model.ai.registry.AIFunctionDescriptor;
public final class AIEngineRequest {
        return functions;
    private final List<AIFunctionDescriptor> functions = new ArrayList<>();
    }
    public AIEngineRequest(@NotNull AIMessage message) {
}
 * DBeaver - Universal Database Manager
        this.functions.clear();
        return messages;

    private final List<AIMessage> messages;
 * you may not use this file except in compliance with the License.
        return wasPromptTruncated;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    }
/**
        this.functions.addAll(functions);
 * Request to AI engine
    @NotNull
 * You may obtain a copy of the License at
 *

    @NotNull

    public List<AIFunctionDescriptor> getFunctions() {

 *


import org.jkiss.code.NotNull;
    public boolean wasPromptTruncated() {
    public AIEngineRequest(@NotNull List<AIMessage> messages) {
    public void setWasPromptTruncated(boolean wasPromptTruncated) {
import java.util.ArrayList;
        this.messages = messages;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
        this(List.of(message));
 * See the License for the specific language governing permissions and
        this.wasPromptTruncated = wasPromptTruncated;
 */

import java.util.List;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.ai.AIMessage;
package org.jkiss.dbeaver.model.ai.engine;


    @NotNull
    }
