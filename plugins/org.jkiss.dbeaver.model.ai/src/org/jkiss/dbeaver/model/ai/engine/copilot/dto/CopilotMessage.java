        return switch (role) {
    @Nullable
 *
 * limitations under the License.
            case ASSISTANT, FUNCTION -> "assistant";
    public static CopilotMessage from(AIMessage message) {
            case USER -> "user";
import org.jkiss.code.Nullable;
            default -> null;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 */

    }

 *
 *
/*
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.ai.engine.copilot.dto;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.ai.AIMessage;
        };
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.ai.AIMessageType;
) {
public record CopilotMessage(
import org.jkiss.code.NotNull;
        return new CopilotMessage(mapRole(message.getRole()), message.getContent());
            case SYSTEM -> "system";

 * distributed under the License is distributed on an "AS IS" BASIS,
    private static String mapRole(@NotNull AIMessageType role) {
    String role,
}
 * DBeaver - Universal Database Manager
    String content
