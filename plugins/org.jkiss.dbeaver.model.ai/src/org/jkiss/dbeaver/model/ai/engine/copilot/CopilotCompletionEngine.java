        @NotNull AIEngineResponseConsumer listener

        }
            .withMessages(request.getMessages().stream().map(CopilotMessage::from).toList())
        CopilotChatRequest chatRequest = CopilotChatRequest.builder()

            monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0
        synchronized (this) {
        @NotNull
        @Override
        return new AIEngineResponse(
    ) throws DBException {
 *
    public void requestCompletionStream(

    }
        super(properties);
 */
import org.jkiss.utils.CommonUtils;
    @Override
            disposedValue.close();
            choices,
            .withTopP(1)
}
        return CommonUtils.toString(
/*
            .withTemperature(properties.getTemperature())
    @Override
            .withMessages(request.getMessages().stream().map(CopilotMessage::from).toList())
        List<String> choices = chatResponse
 * Copyright (C) 2010-2026 DBeaver Corp and others
            "Please set it explicitly or use a known model with a predefined context window size.");
            listener
    }
    public List<AIModel> getModels(@NotNull DBRProgressMonitor monitor) throws DBException {

            .withIntent(false)
            requestSessionToken(monitor).token(),
        return client.getInstance().loadModels(monitor, requestSessionToken(monitor).token()).stream()
    @Override
public class CopilotCompletionEngine<P extends CopilotProperties> extends BaseCompletionEngine<P> {

            .build();
            .withModel(getModelName())
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.ai.engine.copilot;
                new AIModel(model.id(), null, Set.of())
 * Unless required by applicable law or agreed to in writing, software
    }
import java.util.List;
        @NotNull AIEngineRequest request,

        @NotNull DBRProgressMonitor monitor,
            .withStream(true)

        }
            .map(it -> it.message().content())
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    }
 *
        client.getInstance().createChatCompletionStream(
            throw new DBException("Copilot API token is not set");
            .withTemperature(properties.getTemperature())
    public void close() throws DBException {
    public String getModelName() throws DBException {
            return createClient(getProperties().getBaseAuthUrl());
        }
            chatResponse.getAIUsage()
 * See the License for the specific language governing permissions and
            .withModel(getModelName())
        @NotNull AIEngineRequest request
            ))
        );
        );
    public int getContextWindowSize(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
    }
        if (contextWindowSize != null) {
    };
            .withStream(false)
import org.jkiss.dbeaver.model.ai.utils.DisposableLazyValue;
    public CopilotCompletionEngine(@NotNull P properties) {
    @NotNull
 * DBeaver - Universal Database Manager
    protected CopilotSessionToken requestSessionToken(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.ai.engine.copilot.dto.CopilotChatResponse;
        );
            AIMessageType.ASSISTANT,
    }
            .toList();
        client.dispose();

            return contextWindowSize;
    @NotNull
import org.jkiss.dbeaver.model.ai.engine.copilot.dto.CopilotMessage;
        @NotNull DBRProgressMonitor monitor,
    }

import org.jkiss.dbeaver.model.ai.AIMessageType;

            return sessionToken;
        protected CopilotClient initialize() throws DBException {

            chatRequest,
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (sessionToken == null) {
        String token = properties.getToken();
            .withN(1)
            .withTopP(1)
            .build();
    @Override
import org.jkiss.dbeaver.model.ai.engine.*;
    }
import org.jkiss.dbeaver.model.ai.engine.copilot.dto.CopilotChatRequest;
 * You may obtain a copy of the License at
        if (token == null || token.isEmpty()) {
        }
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIConstants;
        }

        Integer contextWindowSize = properties.getContextWindowSize();

            }

 *
import org.jkiss.dbeaver.DBException;
        }
        CopilotChatResponse chatResponse = client.getInstance().chat(monitor, requestSessionToken(monitor).token(), chatRequest);
 * you may not use this file except in compliance with the License.
    @NotNull
    protected final DisposableLazyValue<CopilotClient, DBException> client = new DisposableLazyValue<>() {
            .toList();
            .withN(1)
    }


    protected CopilotClient createClient(@NotNull String baseAuthUrl) throws DBException {
        @Override
    public AIEngineResponse requestCompletion(

import java.util.Set;

    private CopilotSessionToken sessionToken;
        throw new DBException("Context window size is not defined in Copilot properties. " +
            properties.getModel(),
            .withIntent(false)
        return new CopilotClient(baseAuthUrl);
import org.jkiss.code.NotNull;
        CopilotChatRequest chatRequest = CopilotChatRequest.builder()
            .stream()
        return sessionToken;
            OpenAIConstants.DEFAULT_MODEL
            .choices()
import org.jkiss.dbeaver.model.ai.engine.copilot.dto.CopilotSessionToken;

        if (sessionToken != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        protected void onDispose(@NotNull CopilotClient disposedValue) {
            .map(model -> CopilotModels.getModelByName(model.id()).orElse(
    ) throws DBException {

                sessionToken = client.getInstance().requestSessionToken(monitor, properties.getToken());
