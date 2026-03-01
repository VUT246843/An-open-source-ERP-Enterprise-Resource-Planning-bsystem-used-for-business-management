) {
 * you may not use this file except in compliance with the License.
            usage.completionTokens(),
            usage.promptTokensDetails() != null ? usage.promptTokensDetails().cachedTokens() : 0,
 *
 * See the License for the specific language governing permissions and
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * DBeaver - Universal Database Manager
            return null;
 * You may obtain a copy of the License at
    }
import org.jkiss.code.Nullable;
        return new AIUsage(
        }
import org.jkiss.code.NotNull;

 */
public record CopilotChatResponse(
    }
import org.jkiss.dbeaver.model.ai.AIUsage;
            0
    public record Choice(Message message) {


    @NotNull
        if (usage == null) {

    @Nullable

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.ai.engine.copilot.dto;

    public record Message(String content) {
}
        );
 *

 * limitations under the License.
    public AIUsage getAIUsage() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
    CopilotUsage usage
 * Unless required by applicable law or agreed to in writing, software
/*

    List<Choice> choices,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            usage.promptTokens(),
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
