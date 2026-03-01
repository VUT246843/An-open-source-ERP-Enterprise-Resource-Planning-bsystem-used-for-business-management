        ));
                AIBaseFeatures.PROMPT_TYPE, context.getPrompt().generatorId()
    }
    }
 */
                    }
import org.jkiss.dbeaver.model.ai.utils.ThrowableSupplier;
    protected static <T> T callWithRetry(
    protected AIEngineRequestFactory createRequestFactory() {
            }
                Instant now = Instant.now();

            monitor,
        AIFunctionRegistry registry = AIFunctionRegistry.getInstance();
                            request = newRequest;
        DBPDataSourceContainer container = context.getContext() != null
public class AIAssistantImpl implements AIAssistant {
                        AIFunctionResult result = callFunction(functionContext, functionCall);
        try (AIEngine<?> engine = engineDescriptor.createEngineInstance()) {


 * limitations under the License.
    }
                retry++;
    @NotNull

            if (e instanceof DBException dbe) {

            log.debug("Error getting AI configuration: " + e.getMessage());
    @NotNull
        @NotNull DBRProgressMonitor monitor,
    }
        int retry = 0;
            getActiveEngineId(),
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.ai.*;
            AIEngineDescriptor defaultCompletionEngineDescriptor =

                throw new DBException("Error requesting completion", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                );
                        );
                            newRequest.setFunctions(request.getFunctions());
        } catch (DBException e) {
    public AIEngineRequest buildAiEngineRequest(
    protected final DBPWorkspace workspace;
    ) throws DBException {

                    AIMessages.ai_empty_engine_response,
    ) throws DBException {
                    }
                            );
        AIEngineDescriptor engineDescriptor = getEngineDescriptor();
            context,
            log.warn("No active AI engine configured");

            try {
        this.requestFactory = createRequestFactory();
    public AIAssistantResponse generateText(
        AIFunctionDescriptor function = registry.getFunction(functionName);
        if (arguments == null) {
            monitor,
                    engineDescriptor.getId(),
            return AIAssistantRegistry.getInstance().getDescriptor().createSqlFormatter();
import org.jkiss.code.NotNull;
            arguments = Map.of();
        if (listener != null) {
        @NotNull AIFunctionCall functionCall
        return settingsManager.getSettings().getEngineConfiguration(activeEngine);
        @NotNull AIPromptGenerator systemGenerator,
                AIEngineRegistry.getInstance().getDefaultCompletionEngineDescriptor();
                AIEngineResponse completionResponse = requestCompletion(engine, monitor, request);
        try {
        @NotNull DBRProgressMonitor monitor,
    }
            api);
import org.jkiss.dbeaver.model.app.DBPWorkspace;
    public AIEngine<?> createEngine() throws DBException {
        @NotNull List<AIMessage> messages
        @NotNull List<AIMessage> messages
            AIEngineRequest request = completionRequest;

            }
    @NotNull

        return AISettingsManager.getInstance().getSettings().activeEngine();
        String activeEngine = settingsManager.getSettings().activeEngine();
                AIMessageMeta requestMeta = new AIMessageMeta(
        Map<String, Object> arguments = functionCall.getArguments();
                } else {
                        String stringValue = CommonUtils.toString(result.getValue());
            if (defaultCompletionEngineDescriptor == null) {
    protected boolean isLoggingEnabled() {
                throw dbe;
                log.debug("AI response:\n" + CommonUtils.addTextIndent(completionResponse.toString(), LOG_INDENT));
                engine,
                log.warn("No active AI engine configuration found");
                    usage,
                messages,
                                stringValue,
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
                    List.of(requestMeta)
            if (loggingEnabled) {
            throw new DBCMessageException("Function '" + functionName + "' not found");
    private static final Log log = Log.getLog(AIAssistantImpl.class);
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
            ? context.getContext().getExecutionContext().getDataSource().getContainer() : null;
                    Duration.between(now, Instant.now()),
                            continue;
            )
                return false;
        functionCall.setFunction(function);
                context,

                    AIMetaTypes.PROMPT,
        }
            }
import java.util.ArrayList;
    public AIAssistantImpl(@NotNull DBPWorkspace workspace) {
            } else {
        @Nullable AIDatabaseContext context,
            engine,
        );
                        } else {
        }
    }
    ) throws DBException {
            return new SimpleSqlFormatterImpl();
                if (retry < MANY_REQUESTS_RETRIES) {

        }
        try {
import org.jkiss.dbeaver.model.ai.registry.*;

 *
            }
                        return new AIAssistantResponse(
                }
            return false;
                            List.of(requestMeta)
                    List<String> variants = completionResponse.getVariants();
                            AIAssistantResponse.Type.TEXT,
        if (descriptor == null) {

    }
            } catch (TooManyRequestsException e) {
    protected AIFunctionResult callFunction(
            throw new DBException("Too many AI function calls (" + MAX_FUNCTION_CALLS + ")");
        }
import org.jkiss.dbeaver.model.exec.DBCMessageException;


}
                );
        }
                            newMessages.add(new AIMessage(AIMessageType.USER, stringValue, null));
            boolean loggingEnabled = isLoggingEnabled();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        return registry.callFunction(context, function, arguments);
    protected static <T> T callWithRetry(ThrowableSupplier<T, DBException> supplier) throws DBException {
                        }
 * you may not use this file except in compliance with the License.
            log.error("Error creating SQL formatter", e);
                int systemPromptLength = AIPromptUtils.calcSystemPromptLength(completionRequest.getMessages());
            AIFunctionContext functionContext = createAiFunctionContext(monitor, context, systemGenerator, messages);
    }
            descriptor = defaultCompletionEngineDescriptor;
            );
        @Nullable AIDatabaseContext context,
    public static final String LOG_INDENT = "\t";
                }
                    RuntimeUtils.pause(MANY_REQUESTS_TIMEOUT);
        AIEngineDescriptor descriptor = AIEngineRegistry.getInstance().getEngineDescriptor(getActiveEngineId());
        return new AIEngineRequestFactory(
        }
                log.debug("AI request:\n" + CommonUtils.addTextIndent(request.getMessages().toString(), LOG_INDENT));

        if (activeEngine == null || activeEngine.isEmpty()) {
        @Nullable AIEngineResponseConsumer listener,
                    completionResponse.getUsage() :
    public boolean isEngineSupports(Class<?> api) {
    protected AIEngineResponse requestCompletion(

            new AIDatabaseSnapshotService(),
            log.trace("Active engine is not present in the configuration, switching to default active engine");
            systemGenerator,
            AIEngineResponse completionResponse = callWithRetry(() -> engine.requestCompletion(monitor, request));
    @Override
    }
/*
import org.jkiss.code.Nullable;
        if (function == null) {
 * See the License for the specific language governing permissions and
            AIEngineProperties activeEngineConfiguration = getActiveEngineConfiguration();
        }
import org.jkiss.dbeaver.model.ai.engine.*;
            new DummyTokenCounter()
    public static String getActiveEngineId() {
    @Nullable
        AIBaseFeatures.AI_CHAT_FUNCTION_CALL.use(AIBaseFeatures.buildFeatureParameters(
        @NotNull AIEngineDescriptor engineDescriptor
                                AIAssistantResponse.Type.FUNCTION,
            }
        @NotNull AIFunctionContext context,
        if (CommonUtils.isEmpty(functionName)) {
    }
            return null;
    @NotNull
package org.jkiss.dbeaver.model.ai.impl;
        return new AIFunctionContext(

                return supplier.get();

    @NotNull
    @NotNull
                            return new AIAssistantResponse(
import java.util.Map;

        DBException dbException = new DBException("Request failed after " + MANY_REQUESTS_RETRIES + " attempts");
            if (loggingEnabled) {
        @NotNull AIEngine<?> engine,
    }

    protected void checkAiEnablement() throws DBException {
                            variants.getFirst(),
import java.time.Duration;
    }
        if (AISettingsManager.getInstance().getSettings().isAiDisabled()) {
    public AIEngineDescriptor getEngineDescriptor() throws DBException {
        this.workspace = workspace;
        return AIEngineRegistry.getInstance().createEngine(getActiveEngineId());
        );
                    new AIUsage(0, 0, 0, 0);
    private AIEngineProperties getActiveEngineConfiguration() throws DBException {
import org.jkiss.dbeaver.model.ai.internal.AIMessages;
    }
        try {
        String functionName = functionCall.getFunctionName();
        while (retry < MANY_REQUESTS_RETRIES) {
        checkAiEnablement();
        );
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
            return completionResponse;
        @NotNull DBRProgressMonitor monitor,

    protected static final int MAX_FUNCTION_CALLS = 5;
        return callWithRetry(null, supplier);
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.sqlFormatter = createSqlFormatter();
    ) throws DBException {
                        functionContext.addFunctionCall(functionCall);
    ) throws DBException {

        @NotNull AIPromptGenerator systemGenerator,
    }
import java.time.Instant;
        log.debug("Call AI function '" + function.getId() + "'");
        @NotNull AIEngineRequest request
                    AIAssistantResponse.Type.ERROR,
                    if (functionCall != null) {
    private static final int MANY_REQUESTS_TIMEOUT = 500;
                    systemPromptLength
                    engine.getProperties().getModel(),
            return activeEngineConfiguration.isLoggingEnabled();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            engineDescriptor,
        return descriptor;
                monitor,
            }
    private static AIFunctionContext createAiFunctionContext(
        @Nullable AIDatabaseContext context,
                            List<AIMessage> newMessages = new ArrayList<>(request.getMessages());
    }

 * DBeaver - Universal Database Manager
                if (completionResponse.getType() == AIMessageType.FUNCTION) {
import org.jkiss.utils.CommonUtils;
            listener.error(dbException);
                    if (variants != null && !variants.isEmpty()) {
                systemGenerator,
        @NotNull ThrowableSupplier<T, DBException> supplier
        @NotNull AIEngine<?> engine,
            context,



            AIEngineRequest completionRequest = buildAiEngineRequest(

    ) {
        } catch (DBException e) {
                return new AIAssistantResponse(
 *
        @NotNull AIPromptGenerator systemGenerator,
            messages
            for (int tryIndex = 0; tryIndex < MAX_FUNCTION_CALLS; tryIndex++) {
        }
    }
            container,
        @NotNull DBRProgressMonitor monitor,

        AISettingsManager settingsManager = AISettingsManager.getInstance();
    protected final AIEngineRequestFactory requestFactory;
    }
        return AIEngineRegistry.getInstance().isEngineSupports(

                                List.of(requestMeta)
import org.jkiss.dbeaver.utils.RuntimeUtils;
            systemGenerator,
        }

    protected AISqlFormatter createSqlFormatter() {
                AIBaseFeatures.FUNCTION_NAME, functionCall.getFunctionName(),
            Map.of(
            messages
            throw new DBCMessageException("Function name not specified");
                    log.debug("Too many engine requests. Retry after " + MANY_REQUESTS_TIMEOUT + "ms");
        }
 *
                        if (result.getType() == AIFunctionResult.FunctionType.ACTION) {
            }
        throw new DBException("Request failed after " + MANY_REQUESTS_RETRIES + " attempts");
            if (activeEngineConfiguration == null) {
                AIUsage usage = completionResponse.getUsage() != null ?
                            AIEngineRequest newRequest = new AIEngineRequest(newMessages);
            throw new DBException("AI integration is disabled");
import java.util.List;
        @NotNull List<AIMessage> messages,

                throw new DBException("AI engine  not found");
import org.jkiss.dbeaver.DBException;
        }
                    AIFunctionCall functionCall = completionResponse.getFunctionCall();
        } catch (Exception e) {
                engineDescriptor
    protected AISqlFormatter sqlFormatter;
    private static final int MANY_REQUESTS_RETRIES = 3;
        return requestFactory.build(
