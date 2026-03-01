 *     http://www.apache.org/licenses/LICENSE-2.0
     *
 */

        @Nullable AIDatabaseContext context,
 * You may obtain a copy of the License at
/*
        @NotNull AIPromptGenerator systemGenerator,
import org.jkiss.code.Nullable;
    /**
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Provides various methods for AI-based operations.
 * Unless required by applicable law or agreed to in writing, software
}
 */
        @NotNull List<AIMessage> messages

     * @param messages        user messages
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
    AIAssistantResponse generateText(
    ) throws DBException;
 * you may not use this file except in compliance with the License.
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * @return generated text
 *

     */
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
     * @param systemGenerator generates prompt explaining goals, additional instructions and context information
        @NotNull DBRProgressMonitor monitor,
public interface AIAssistant {

import org.jkiss.dbeaver.DBException;
 *
 * DBeaver - Universal Database Manager
     * @param context         database context. Creates database snapshot according to this context.
     * Generates text according to the prompt
package org.jkiss.dbeaver.model.ai;
 * AI Assistant interface.
