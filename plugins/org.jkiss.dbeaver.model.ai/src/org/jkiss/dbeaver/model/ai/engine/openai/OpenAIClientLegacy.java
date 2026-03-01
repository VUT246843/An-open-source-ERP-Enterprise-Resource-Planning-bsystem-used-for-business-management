import java.time.Instant;
    }
        }
    }
            chatCompletionResult.getAIUsage(),
        );
            .POST(HttpRequest.BodyPublishers.ofString(serializeValue(chatRequest)))
        @NotNull OAIResponsesRequest completionRequest
            .build();
            systemPromptLength
import org.jkiss.dbeaver.model.ai.utils.AIHttpUtils;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.ai.engine.openai.dto.legacy.ChatMessage;
 * distributed under the License is distributed on an "AS IS" BASIS,
            om.content.getFirst().text,
    @Override
        if (completionRequest.temperature != null) {
            om.role,
import com.google.gson.GsonBuilder;
 *
        )).toList());

    public OAIResponsesResponse createChatCompletion(
        chatRequest.setModel(completionRequest.model);
import org.jkiss.dbeaver.model.ai.engine.openai.dto.legacy.ChatCompletionResult;
            baseUrl,
import org.jkiss.dbeaver.model.ai.engine.openai.dto.legacy.ChatCompletionRequest;
            )).toList();
            OpenAIConstants.OPENAI_ENGINE,
 *
        oaiResponse.output = chatCompletionResult.getChoices().stream().map(
        String response = client.send(monitor, modifiedRequest);
            .mapToInt(it -> it.content.getFirst().text.length())
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.ai.engine.openai.dto.OAIMessage;
        OAIResponsesResponse oaiResponse = new OAIResponsesResponse();
 * Unless required by applicable law or agreed to in writing, software
            c -> new OAIMessage(

        HttpRequest modifiedRequest = applyFilters(request);
            .uri(AIHttpUtils.resolve(baseUrl, "chat/completions"))
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
            AIMetaTypes.PROMPT,
        ChatCompletionResult chatCompletionResult = GSON.fromJson(response, ChatCompletionResult.class);

import org.jkiss.dbeaver.model.ai.*;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            Duration.between(now, Instant.now()),
        return oaiResponse;
import java.time.Duration;
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.ai.AIMessageMeta;
            .sum();
 *
        HttpRequest request = HttpRequest.newBuilder()
    public static OpenAIClientLegacy createClient(@NotNull String baseUrl, @NotNull String token) {
    private static final Gson GSON = new GsonBuilder().create();
import java.util.List;
        chatRequest.setMessages(completionRequest.input.stream().map(om -> new ChatMessage(
import org.jkiss.dbeaver.model.ai.engine.openai.dto.OAIResponsesResponse;
                )
            om.name
import java.util.Locale;
 * You may obtain a copy of the License at
        Instant now = Instant.now();
    @NotNull
        return new OpenAIClientLegacy(
package org.jkiss.dbeaver.model.ai.engine.openai;

            chatRequest.setTemperature(completionRequest.temperature);

import org.jkiss.dbeaver.model.ai.AIMessageType;
        @NotNull List<HttpRequestFilter> requestFilters
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                new AIMessage(
 */
                    c.getMessage().getContent(),
                    List.of(messageMeta)
}
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,
        );
    private static final Duration TIMEOUT = Duration.ofSeconds(30);
public class OpenAIClientLegacy extends OpenAIClient {
            .timeout(TIMEOUT)
    }

        AIMessageMeta messageMeta = new AIMessageMeta(
        super(baseUrl, requestFilters);
    @NotNull
    public OpenAIClientLegacy(
        int systemPromptLength = completionRequest.input.stream()
                    AIMessageType.ASSISTANT,
import org.jkiss.dbeaver.model.ai.AIMessage;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.ai.engine.openai.dto.OAIResponsesRequest;

            completionRequest.model,
        ChatCompletionRequest chatRequest = new ChatCompletionRequest();
 * See the License for the specific language governing permissions and
        @NotNull String baseUrl,
import com.google.gson.Gson;

import java.net.http.HttpRequest;
    ) {
    ) throws DBException {

            List.of(new OpenAIRequestFilter(token))
            .filter(it -> it.role.toLowerCase(Locale.ROOT).equals("system"))
