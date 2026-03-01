    public static final String EVENT_TYPE_ARGUMENTS_DELTA = "response.function_call_arguments.delta";

                            } else {
    public void createChatCompletionStream(
            .POST(HttpRequest.BodyPublishers.ofString(serializeValue(completionRequest)))
        this.requestFilters = requestFilters;
        @NotNull DBRProgressMonitor monitor,
import java.time.Duration;
    protected static String serializeValue(@Nullable Object value) throws DBException {

        }
    }
        return client.getHttpClient();
    ) throws DBException {
                if (!CommonUtils.isEmpty(eventType)) {
    public HttpClient getHttpClient() {
import org.jkiss.utils.CommonUtils;
    private static final String DATA_EVENT = "data: ";
        return GSON.fromJson(client.send(monitor, modifiedRequest), OAIModelList.class).data();
        HttpRequest modifiedRequest = applyFilters(request);
                        if (chunk.item != null && OAIMessage.TYPE_FUNCTION_CALL.equals(chunk.item.type)) {
        try {
        HttpRequest request = createCompletionRequest(completionRequest);
        if (!baseUrl.endsWith("/")) {
                        case "response.output_item.done":
 *     http://www.apache.org/licenses/LICENSE-2.0
                                        if (!CommonUtils.isEmpty(content.text)) {
    public static OpenAIClient createClient(@NotNull String baseUrl, @NotNull String token) {
    protected static final Duration TIMEOUT = Duration.ofSeconds(30);
        @Override
        String responseJson = client.send(monitor, modifiedRequest);
    @NotNull
import org.jkiss.dbeaver.model.ai.utils.AIHttpUtils;

        }
        private final AIEngineResponseConsumer listener;

                                functionCall = true;
                        } else {
            listener::completeBlock
                } catch (Exception e) {
        } catch (JsonSyntaxException e) {
    @NotNull

            baseUrl,
            request = filter.filter(request, setContentType);
import java.util.function.Consumer;
    static AIFunctionCall createFunctionCall(OAIMessage message) throws DBException {
    protected DBException mapHttpError(int statusCode, @NotNull String body) {
    public HttpRequest applyFilters(@NotNull HttpRequest request, boolean setContentType) throws DBException {

    public static final String EVENT_TYPE_RESPONSE_COMPLETED = "response.completed";

            .build();
            .header(HttpConstants.HEADER_USER_AGENT, GeneralUtils.getProductTitle())
                        if (functionCall) {
                            }
            listener::error,
        @NotNull String baseUrl,
                            break;
    }
        this.baseUrl = baseUrl;
            modifiedRequest,
                        case "response.created":

import org.jkiss.dbeaver.model.ai.engine.AIEngineResponseConsumer;
    public static final String EVENT_TYPE_TEXT_DELTA = "response.output_text.delta";
        private boolean functionCall;
            .timeout(TIMEOUT)
                        }
        for (HttpRequestFilter filter : requestFilters) {
                            List<String> choices = new ArrayList<>();

        }
    public HttpRequest applyFilters(@NotNull HttpRequest request) throws DBException {
import java.net.http.HttpClient;
/*
    ) {
                            if (EVENT_TYPE_ITEM_DONE.equals(chunk.type)) {
import org.jkiss.dbeaver.model.ai.engine.AIEngineResponseChunk;
                                for (OAIMessage msg : chunk.response.output) {
                String data = event.substring(DATA_EVENT.length()).trim();
        Map<String, Object> arguments;
    }
        Consumer<String> stringConsumer = new StreamConsumer(listener);

    public List<OAIModel> getModels(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
                        case "response.output_text.done":
 */
    @NotNull

        client.sendAsync(
 * Unless required by applicable law or agreed to in writing, software
                        case "response.output_item.added":
 * Licensed under the Apache License, Version 2.0 (the "License");
    private HttpRequest createCompletionRequest(@NotNull OAIResponsesRequest completionRequest) throws DBException {
        return new AIFunctionCall(message.name, arguments);

        HttpRequest request = HttpRequest.newBuilder()
import org.jkiss.dbeaver.model.data.json.JSONUtils;
            arguments = JSONUtils.GSON.fromJson(argumentsStr, JSONUtils.MAP_TYPE_TOKEN);
    public static final String EVENT_TYPE_ITEM_DONE = "response.output_item.done";
        }

        HttpRequest modifiedRequest = applyFilters(request);
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) throws DBException {
                                    }
        HttpRequest filter(@NotNull HttpRequest request, boolean setContentType) throws DBException;
                        case "response.content_part.done":
                    }
        try {
        }
}
            .build();
import org.jkiss.dbeaver.model.ai.engine.AIFunctionCall;
        return request;
import org.jkiss.dbeaver.model.ai.engine.openai.dto.*;
                                }
            } else if (event.startsWith(EVENT_EVENT)) {

            .uri(AIHttpUtils.resolve(baseUrl, "models"))
        }
    }

                    OAIResponsesChunk chunk = GSON.fromJson(data, OAIResponsesChunk.class);
 * DBeaver - Universal Database Manager
                                choices.add(chunk.delta);


                    }
        @NotNull AIEngineResponseConsumer listener
        log.debug("OpenAI request failed: " + statusCode + ", " + body);
                }
import org.jkiss.dbeaver.Log;
    @NotNull
        public StreamConsumer(AIEngineResponseConsumer listener) {
    public static final String OPENAI_ENDPOINT = "https://api.openai.com/v1/";
                    switch (eventType) {
        return GSON.fromJson(responseJson, OAIResponsesResponse.class);

    protected final List<HttpRequestFilter> requestFilters;
                    } else {

                log.debug("Unknown OpenAI event: " + event);
public class OpenAIClient extends AbstractHttpAIClient {
            } else {
    @NotNull
    }
            }
    @NotNull
    private static final Log log = Log.getLog(OpenAIClient.class);
                            // do nothing
                            return;
                            if (!choices.isEmpty()) {
        @NotNull DBRProgressMonitor monitor,
            this.listener = listener;
        return HttpRequest.newBuilder()
import org.jkiss.utils.HttpConstants;
            .uri(AIHttpUtils.resolve(baseUrl, OpenAIConstants.ENDPOINT_RESPONSES))
                            }
        return new OpenAIClient(
                            }
                        listener.usage(chunk.response.getAIUsage());
    }
                String eventType = event.substring(EVENT_EVENT.length()).trim();
            throw new DBException("Error serializing value", e);
            stringConsumer,
    public OpenAIClient(

 * limitations under the License.
import java.util.ArrayList;
import org.jkiss.code.Nullable;
                    listener.error(e);
                }
                                    for (OAIMessageContent content : msg.content) {
    }
        @NotNull OAIResponsesRequest completionRequest
            }
                        }
 *

        return applyFilters(request, true);
import java.net.http.HttpRequest;
                            if (OpenAIClient.EVENT_TYPE_TEXT_DELTA.equals(chunk.type)) {
                                functionCall = false;
        @NotNull List<HttpRequestFilter> requestFilters
        HttpRequest request = createCompletionRequest(completionRequest);
        return new DBException("OpenAI request failed: " + AIHttpUtils.parseOpenAIStyleErrorMessage(body));
        );

                try {


            if (CommonUtils.isEmpty(event)) {
            throw new DBException("Error parsing function call arguments", e);
                                listener.nextChunk(new AIEngineResponseChunk(
    }
                return;
 *
    protected final String baseUrl;
                        case "response.in_progress":
    @Override
    }
    public OAIResponsesResponse createChatCompletion(
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.ai.engine.openai;
            .GET()

import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import org.jkiss.dbeaver.model.ai.engine.AbstractHttpAIClient;
        String argumentsStr = message.arguments;
            .timeout(TIMEOUT)
        @NotNull OAIResponsesRequest completionRequest,
        @NotNull
                    if (EVENT_TYPE_RESPONSE_COMPLETED.equals(chunk.type)) {
                                            choices.add(content.text);
            List.of(new OpenAIRequestFilter(token))
                        case EVENT_TYPE_TEXT_DELTA:
import com.google.gson.Gson;
    }
    public interface HttpRequestFilter {
    }
        );
        public void accept(String event) {
            if (event.startsWith(DATA_EVENT)) {

 * you may not use this file except in compliance with the License.
            baseUrl += "/";
                            } else if (chunk.response != null) {
        HttpRequest modifiedRequest = applyFilters(request);
        } catch (Exception e) {
                                    createFunctionCall(chunk.item)));
                                listener.nextChunk(new AIEngineResponseChunk(choices));
 *

 * See the License for the specific language governing permissions and
                        case EVENT_TYPE_RESPONSE_COMPLETED:
    protected static final Gson GSON = JSONUtils.GSON;
    private static final String EVENT_EVENT = "event: ";
                                        }

import org.jkiss.dbeaver.DBException;
            return GSON.toJson(value);
    }
    private static class StreamConsumer implements Consumer<String> {


 * You may obtain a copy of the License at
import java.util.List;
