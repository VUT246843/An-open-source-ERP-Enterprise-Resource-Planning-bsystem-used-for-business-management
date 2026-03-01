        return new AIMessage(
    private final List<AIMessageMeta> meta;
    }
        this.role = AIMessageType.FUNCTION;
    }

        return new AIMessage(AIMessageType.USER, prompt, uiMessage, LocalDateTime.now(), null);
        );
        this.role = role;
    }
    private final String displayMessage;
    @NotNull

        return "Message (" + role + "): " + content;
        @Nullable List<AIMessageMeta> meta
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    ) {
    ) {
    }
        this.functionCallName = null;
        return new AIMessage(role, newContent, displayMessage, time, meta);


    public static AIMessage functionCall(@NotNull AIFunctionCall functionCall, @NotNull AIFunctionResult result) {
    public List<AIMessageMeta> getMeta() {
    public String toString() {
package org.jkiss.dbeaver.model.ai;
    @Nullable
        this.functionResult = result;

    }
    }
    private final String functionCallName;
    }
        @NotNull String content,
 * You may obtain a copy of the License at
        @NotNull AIMessageType role,
        @Nullable String functionCallName
    }
    }
        @NotNull LocalDateTime time,
    }
        return displayMessage;
    public AIFunctionResult getFunctionResult() {
        return time;
import java.time.LocalDateTime;
    public AIMessage withContent(String newContent) {
    private final AIFunctionResult functionResult;
        return new AIMessage(AIMessageType.SYSTEM, message, null);
    }
        return functionCallName;
        this.content = CommonUtils.toString(result.getValue()) + " was completed";
            null,
        @Nullable String displayMessage,
    public AIFunctionCall getFunctionCall() {
        @NotNull String content,
    @Nullable
        @Nullable List<AIMessageMeta> meta,
    public String getContent() {
        @NotNull LocalDateTime time,

        @NotNull AIFunctionCall functionCall,
    public AIMessage(
    public AIMessage(
    public String getDisplayMessage() {
        @NotNull String content,
    @Nullable
        return role;
    public static AIMessage systemMessage(@NotNull String message) {
        @NotNull AIFunctionResult result,

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.displayMessage = displayMessage;
    @NotNull
    @Nullable
        this.functionCallName = null;
        return meta;
 *
    }
        this.role = role;

        this.functionCall = null;
        this.functionResult = null;

    public static AIMessage errorMessage(@NotNull Throwable throwable) {
            id
        this.content = content;
    }
        @NotNull AIMessageType role,
 * See the License for the specific language governing permissions and

    ) {
    private final LocalDateTime time;
    public AIMessage(
        this.functionCallName = functionCallName;
        @Nullable List<AIMessageMeta> meta
    }
    public String getRawDisplayMessage() {
/*

        this.meta = meta;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    @NotNull
    }
        this.meta = meta;

        return displayMessage != null ? displayMessage : content;
import org.jkiss.code.Nullable;

    @NotNull
        @Nullable List<AIMessageMeta> meta
        @Nullable String displayMessage,
    public LocalDateTime getTime() {
    @Nullable
            null
    @Nullable
    }
        this.displayMessage = CommonUtils.toString(result.getValue());
        );
     * Creates AI message
import org.jkiss.code.NotNull;
    private final String content;
        this(role, content, content, LocalDateTime.now(), meta);
import org.jkiss.dbeaver.model.ai.engine.AIFunctionCall;
 */
    @Override
 *
    }
        this.meta = meta;
    public AIMessageType getRole() {
            payload,
        @NotNull AIMessageType role,
            AIMessageType.ERROR,
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return new AIMessage(
/**

    }
        return new AIMessage(AIMessageType.USER, message, null);
     * Creates AI message
    public static AIMessage userMessage(@NotNull String message) {


        this.functionCall = functionCall;
    public static AIMessage userAutoMessage(@NotNull String prompt, @NotNull String uiMessage) {
    }
    @NotNull
 *
    public static AIMessage functionMessage(@NotNull String id, @NotNull String payload, @NotNull AIMessageType type) {
        return functionResult;

    private final AIFunctionCall functionCall;
    @NotNull
    @NotNull
        this.content = content;
    @Nullable
            null,

    public String getFunctionCallName() {
        this.displayMessage = displayMessage;
    }
        @Nullable List<AIMessageMeta> meta
     */
    @NotNull
    public static AIMessage assistantMessage(
import java.util.List;
        this.functionCall = null;
        return content;


    @NotNull
    public static AIMessage warningMessage(@NotNull String message) {
 * DBeaver - Universal Database Manager
        return functionCall;
public class AIMessage {

    @NotNull
        this.time = LocalDateTime.now();
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
    }
    private AIMessage(

    ) {

    @NotNull

    public boolean isAutoGenerated() {
            type,
 * you may not use this file except in compliance with the License.
    }

            LocalDateTime.now(),
        return new AIMessage(AIMessageType.WARNING, message, null);
            CommonUtils.toString(CommonUtils.getAllExceptionMessages(throwable), "Unknown error"),
        return new AIMessage(functionCall, result, null);
        this.time = time;
        this.time = time;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    ) {
    @Nullable
    private final AIMessageType role;
        return new AIMessage(AIMessageType.ASSISTANT, message, meta);
 * Represents a single AI message
    @Nullable
    /**
import org.jkiss.utils.CommonUtils;

        @NotNull String message,
        this.functionResult = null;
        return displayMessage != null && !CommonUtils.equalObjects(displayMessage, content);
    @NotNull
