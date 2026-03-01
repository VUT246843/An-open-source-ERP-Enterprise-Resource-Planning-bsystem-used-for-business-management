        role = mapRole(msg.getRole());
            case USER -> "user";
    public OAIMessage() {
    public String name;
            case ASSISTANT, FUNCTION -> "assistant";
    public String getFullText() {
        return switch (role) {

package org.jkiss.dbeaver.model.ai.engine.openai.dto;
import com.google.gson.annotations.SerializedName;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public OAIMessage(@NotNull AIMessage msg) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        boolean input = switch (msg.getRole()) {
}
    @SerializedName("call_id")
import org.jkiss.dbeaver.model.ai.AIMessageType;
    public String id;
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
    }
            return "";
            case SYSTEM, USER -> true;
        type = TYPE_MESSAGE;
            default -> null;
        };
            default -> false;
        return content.stream().map(c -> c.text).collect(Collectors.joining());
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 *
    }

import org.jkiss.dbeaver.model.ai.AIMessage;
 * limitations under the License.
import java.util.stream.Collectors;
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
            case SYSTEM -> "system";
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    public List<OAIMessageContent> content;
public class OAIMessage {

import org.jkiss.code.Nullable;
    public String arguments;
    public static final String TYPE_MESSAGE = "message";
        };
    public String status;
import java.util.List;
 *
    }


    public String callId;
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    private static String mapRole(@NotNull AIMessageType role) {
    }
    public String type;
/*
        }
        content = List.of(new OAIMessageContent(input, msg.getContent()));
    public static final String TYPE_FUNCTION_CALL = "function_call";
 *
        if (content == null) {
    public static final String TYPE_FUNCTION_REASONING = "reasoning";
 */
    public String role;
