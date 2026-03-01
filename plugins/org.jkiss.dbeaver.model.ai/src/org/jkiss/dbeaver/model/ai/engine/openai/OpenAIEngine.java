            List<String> choices = messages.stream()
            ))
                OAITool tool = new OAITool();
            .toList();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.ai.registry.AIFunctionDescriptor;

                model.id(),
    @NotNull
            disposedValue.close();
        @NotNull AIEngineRequest request
        @Override
                tool.name = fd.getId();
    @Override
        if (messages.isEmpty()) {
            List<OAITool> tools = new ArrayList<>();
        @NotNull DBRProgressMonitor monitor,
    public List<AIModel> getModels(@NotNull DBRProgressMonitor monitor) throws DBException {
            .toList();
import java.util.ArrayList;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
            return new AIEngineResponse(AIMessageType.ASSISTANT, choices, usage);
                tool.type = OAITool.TYPE_FUNCTION;
        super(properties);
        if (token == null || token.isEmpty()) {


                tools.add(tool);
                    OAIToolParameter tp = new OAIToolParameter();

                List.of(AIMessages.ai_empty_engine_response),
            baseUrl = OpenAIClient.OPENAI_ENDPOINT;
        if (!CommonUtils.isEmpty(request.getFunctions())) {

import org.jkiss.dbeaver.model.ai.engine.openai.dto.*;
    }
 * See the License for the specific language governing permissions and
        oaiRequest.temperature = temperature();
        @NotNull
package org.jkiss.dbeaver.model.ai.engine.openai;
            .map(model -> OpenAIModels.KNOWN_MODELS.getOrDefault(
    }
            for (AIFunctionDescriptor fd : request.getFunctions()) {
        OAIResponsesRequest oaiRequest = createOpenAiRequest(request);
        oaiRequest.store = false;
            AIFunctionCall fc = OpenAIClient.createFunctionCall(message);
 */
    ) throws DBException {
    protected String model() throws DBException {
        OAIMessage message = messages.getFirst();
    ) throws DBException {
import org.jkiss.dbeaver.DBException;
                tool.description = fd.getDescription();
    public int getContextWindowSize(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (contextWindowSize != null) {
            .toList();
                usage
import org.jkiss.dbeaver.model.ai.AIMessageType;
            throw new DBException("OpenAI API token is not set");

        if (baseUrl == null || baseUrl.isEmpty()) {
    }
        protected OpenAIClient initialize() throws DBException {
    ) throws DBException {
        throw new DBException("Context window size is not set for the model: " + model());

        @NotNull AIEngineResponseConsumer listener
        if (properties.isLegacyApi()) {
        }
import java.util.List;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class OpenAIEngine<PROPS extends OpenAIBaseProperties> extends BaseCompletionEngine<PROPS> {
    public void close() throws DBException {
 *
    }
import org.jkiss.utils.CommonUtils;

                    requiredFields.add(param.getName());
import org.jkiss.dbeaver.model.ai.engine.*;
 * limitations under the License.


        }
        AIUsage usage = completionResult.getAIUsage();
    protected OAIResponsesResponse complete(
    }
        }

        if (OAIMessage.TYPE_FUNCTION_CALL.equals(message.type)) {
            return createClient();
    protected OpenAIClient createClient() throws DBException {
        @NotNull DBRProgressMonitor monitor,
                }
        } else {
                .map(OAIMessage::getFullText)
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        OAIResponsesRequest oaiRequest = createOpenAiRequest(request);
 * DBeaver - Universal Database Manager
    }
    public OpenAIEngine(@NotNull PROPS properties) {
    @Override
        openAiService.dispose();
                AIMessageType.ASSISTANT,
    private static List<OAIMessage> fromMessages(@NotNull List<AIMessage> messages) {

        }
                new AIModel(model.id(), null, OpenAIModels.detectModelFeatures(model.id()))
                List<String> requiredFields = new ArrayList<>();
            );
                    tp.description = param.getDescription();
                tool.parameters.required = requiredFields.toArray(new String[0]);
        oaiRequest.stream = true;

        // Filter reasoning messages from the response for OpenAI reasoning models (e.g., gpt-5, gpt-5-mini, gpt-5-nano)
 *
}

    }
        }
    public AIEngineResponse requestCompletion(


import org.jkiss.code.NotNull;
        OAIResponsesResponse completionResult = complete(monitor, request);

            .stream()
import org.jkiss.code.Nullable;

        @NotNull AIEngineRequest request
    };
        }
    protected final DisposableLazyValue<OpenAIClient, DBException> openAiService = new DisposableLazyValue<>() {
    public void requestCompletionStream(
        String token = properties.getToken();
    }
        }
            return OpenAIClientLegacy.createClient(baseUrl, token);
        protected void onDispose(@NotNull OpenAIClient disposedValue) {
            return new AIEngineResponse(fc, usage);
        List<OAIMessage> messages = completionResult.output.stream()
        return OpenAIClient.createClient(baseUrl, token);
        List<AIMessage> messages = request.getMessages();
        return oaiRequest;
    @Override

                    tp.type = param.getType();

        oaiRequest.input = fromMessages(messages);
            return new AIEngineResponse(
        }
        return openAiService.getInstance().getModels(monitor)
    protected double temperature() throws DBException {
    @NotNull
    @NotNull
    private OAIResponsesRequest createOpenAiRequest(@NotNull AIEngineRequest request) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    @NotNull
    @NotNull
    }
        return messages.stream()
                tool.parameters.type = OAIToolParameters.TYPE_OBJECT;
            oaiRequest.tools = tools;
 * you may not use this file except in compliance with the License.
    }
        OAIResponsesRequest oaiRequest = new OAIResponsesRequest();
        String baseUrl = properties.getBaseUrl();
import org.jkiss.dbeaver.model.ai.AIUsage;
        oaiRequest.model = model();
            .filter(msg -> !OAIMessage.TYPE_FUNCTION_REASONING.equals(msg.type))
            return contextWindowSize;
        return properties.getModel();
                    tool.parameters.properties.put(param.getName(), tp);
            .map(OAIMessage::new)
            }
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.ai.AIMessage;
 * You may obtain a copy of the License at
/*
        openAiService.getInstance().createChatCompletionStream(monitor, oaiRequest, listener);
        return properties.getTemperature();
        return openAiService.getInstance().createChatCompletion(monitor, oaiRequest);

                .toList();
        @Override
import org.jkiss.dbeaver.model.ai.internal.AIMessages;
    @Nullable
    }
 *
        Integer contextWindowSize = properties.getContextWindowSize();
import org.jkiss.dbeaver.model.ai.utils.DisposableLazyValue;
    @Override
                for (AIFunctionDescriptor.Parameter param : fd.getParameters()) {
                    tp.enumItems = param.getValidValues();
        @NotNull DBRProgressMonitor monitor,
        @NotNull AIEngineRequest request,
