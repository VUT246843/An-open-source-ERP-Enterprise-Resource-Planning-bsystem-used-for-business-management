            .maxTokens(maxContextWindowSize)
import org.jkiss.code.Nullable;
        for (AIFunctionDescriptor fd : selected) {
            if (!result.add(depId)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {

            AIFunctionDescriptor dep = AIFunctionRegistry.getInstance().getFunction(depId);
        // Pre-calc token counts
        int systemPromptTokenCount = tokenCounter.count(systemPrompt);
        if (dbSnapshotTokenBudget < 0) {

        boolean isContextTruncated = false;
        }
        try {
    protected void determineRequestTools(
        @NotNull AIEngineRequest request
    }
import java.util.*;
            .reserveForSystem(systemPromptTokenBudget)
        AIMessage systemMessage = AIMessage.systemMessage(fullSystemPrompt);

            AIDatabaseSnapshotService.TokenBoundedStringBuilder dbSnapshotBuilder = databaseSnapshotService.createDbSnapshot(monitor, databaseContext, ddlOptions);
        for (String depId : dependencies) {
        } catch (DBException e) {
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (requiredByDeps.contains(f.getId())) {

    public AIEngineRequest build(
        determineRequestTools(monitor, engineDescriptor, promptGenerator, request);
}
        }

    // Reserved tokens that must remain for the model's reply
import org.jkiss.dbeaver.DBException;
        int snapshotHeaderTokenCount = tokenCounter.count(DB_SNAPSHOT_SECTION_HEADER);
        // Tokens available for user/system/chat history after we reserve reply + overhead

    // Percentage of remaining context tokens allocated to system prompt + snapshot
import org.jkiss.dbeaver.model.ai.*;

                functions.add(fd);
            .build();
        return request;
    ) {

        List<AIFunctionDescriptor> functions = new ArrayList<>();

        }
        List<AIMessage> allMessages = new ArrayList<>(1 + messages.size());


            }
            if (dbSnapshotBuilder != null) {
        int systemPromptTokenBudget = availableContextTokens * SYSTEM_PROMPT_TOKEN_BUDGET_PERCENT / 100;

            !enabledFunctions.contains(aiFunctionDescriptor.getId())
 * Unless required by applicable law or agreed to in writing, software

            for (AIFunctionDescriptor f : functions) {
    public AIEngineRequestFactory(
    }
        Set<String> enabledFunctions = aiSettings.getFunctionSettings().getEnabledFunctions();

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
                AIConstants.DEFAULT_CONTEXT_WINDOW_SIZE, e);
     * Resolves transitive dependencies for the given list of already selected function descriptors.
            collectDependencies(fd.getDependsOn(), result);
            return;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .withMaxDbSnapshotTokens(dbSnapshotTokenBudget)
        AIEngineRequest request = new AIEngineRequest(truncated);
        }
        ) {

    protected AISchemaGenerationOptions buildOptions(int dbSnapshotTokenBudget) {
            .withSendObjectComment(prefs.getBoolean(AIConstants.AI_SEND_DESCRIPTION))
        return AISchemaGenerationOptions.builder()
     */



        String fullSystemPrompt = dbSnapshot.isBlank()
        this.tokenCounter = tokenCounter;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
        // Truncate chat to fit the window
import org.jkiss.dbeaver.Log;
        @NotNull String[] dependencies,
            : systemPrompt + "\n" + DB_SNAPSHOT_SECTION_HEADER + dbSnapshot;
        @NotNull AIDatabaseSnapshotService databaseSnapshotService,
            log.debug("Cannot determine engine " + engine + " context window size. Set to default " +
package org.jkiss.dbeaver.model.ai.impl;
    private final AIDatabaseSnapshotService databaseSnapshotService;
        Set<String> result = new HashSet<>();
        if (!requiredByDeps.isEmpty()) {
        @NotNull DBRProgressMonitor monitor,
            }
        @NotNull List<AIMessage> messages
        this.databaseSnapshotService = databaseSnapshotService;

 *
    ) {
        return result;

        String systemPrompt = promptGenerator.build(databaseContext);
        }
            }
    private static final int REPLY_TOKEN_RESERVE = 2000;
            || DBWorkbench.getPlatform().getApplication().isMultiuser() // FIXME: For now disabled for server apps


        }
        if (!engineDescriptor.isSupportsFunctions()
        @NotNull AIPromptGenerator systemPromptGenerator,

        request.setFunctions(new ArrayList<>(selectedFunctions));
        AISettings aiSettings = AISettingsManager.getInstance().getSettings();
import org.jkiss.dbeaver.model.ai.engine.AIEngine;
        String dbSnapshot = "";
            if (CommonUtils.isEmpty(depId)) {
    }
            ? systemPrompt
    /**
import org.jkiss.dbeaver.model.ai.registry.AIFunctionDescriptor;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        }


        @NotNull DBRProgressMonitor monitor,
        request.setWasPromptTruncated(isContextTruncated);
        }
        }
 * limitations under the License.
import org.jkiss.dbeaver.model.ai.registry.AIFunctionRegistry;
        @Nullable AIDatabaseContext databaseContext,
        if (databaseContext != null && dbSnapshotTokenBudget > 0) {
            AISchemaGenerationOptions ddlOptions = buildOptions(dbSnapshotTokenBudget);
        @NotNull AIPromptGenerator promptGenerator,
        int availableContextTokens = maxContextWindowSize - REPLY_TOKEN_RESERVE - OVERHEAD_TOKEN_RESERVE;
            dbSnapshotTokenBudget = 0;
            return AIConstants.DEFAULT_CONTEXT_WINDOW_SIZE;
 */
            .build();
            .reserveForReply(REPLY_TOKEN_RESERVE)
 * You may obtain a copy of the License at
    private static final int OVERHEAD_TOKEN_RESERVE = 100;
            }
        ChatTruncator chatTruncator = ChatTruncator.builder()
        DBPPreferenceStore prefs = DBWorkbench.getPlatform().getPreferenceStore();
    }
        if (availableContextTokens < 0) {

                    selectedFunctions.add(f);
    private static int getContextWindowSize(@NotNull DBRProgressMonitor monitor, @NotNull AIEngine<?> engine) {
                collectDependencies(dep.getDependsOn(), result);
                continue;
        // Compose system message
    private final TokenCounter tokenCounter;
    private static void collectDependencies(
    private static final Log log = Log.getLog(AIEngineRequestFactory.class);
            availableContextTokens = 0; // clamp, just in case caller gave a tiny window
    ) throws DBException {

        );
    }
    private static final String DB_SNAPSHOT_SECTION_HEADER = "Database snapshot:\n";
        @NotNull AIEngine<?> engine,
import org.jkiss.code.NotNull;
    private static Set<String> resolveDependencies(@NotNull Set<AIFunctionDescriptor> selected) {
        @NotNull AIEngineDescriptor engineDescriptor,
import org.jkiss.utils.CommonUtils;
            }

        Set<AIFunctionDescriptor> selectedFunctions = new LinkedHashSet<>(functions);
    }

        allMessages.add(systemMessage);
import org.jkiss.dbeaver.model.ai.engine.AIEngineRequest;

        selectedFunctions.removeIf(aiFunctionDescriptor ->
            if (dep != null) {
        int maxContextWindowSize = getContextWindowSize(monitor, engine);

            .tokenCounter(tokenCounter)

            .withSendColumnTypes(prefs.getBoolean(AIConstants.AI_SEND_TYPE_INFO))
    // Section header used before the DB snapshot inside the system prompt
            || !aiSettings.getFunctionSettings().isFunctionsEnabled()
        Set<String> requiredByDeps = resolveDependencies(selectedFunctions);
            }

            .reserveForOverhead(OVERHEAD_TOKEN_RESERVE)
    @NotNull
                }
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
        @NotNull AIEngineDescriptor engineDescriptor,

        int dbSnapshotTokenBudget = systemPromptTokenBudget - systemPromptTokenCount - snapshotHeaderTokenCount;
 * Licensed under the Apache License, Version 2.0 (the "License");
        allMessages.addAll(messages);
    }

            return engine.getContextWindowSize(monitor);
            if (fd.isGlobal() || fd.isApplicable(engineDescriptor, systemPromptGenerator)) {
    private static final int SYSTEM_PROMPT_TOKEN_BUDGET_PERCENT = 80;
                isContextTruncated = dbSnapshotBuilder.isTruncated();
 *
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
        for (AIFunctionDescriptor fd : AIFunctionRegistry.getInstance().getAllFunctions(AIFunctionPurpose.TOOL)) {
/*
public class AIEngineRequestFactory {
    // Reserved tokens for overhead (API limits, formatting, metadata, etc.)
        List<AIMessage> truncated = chatTruncator.truncate(allMessages);

                dbSnapshot = dbSnapshotBuilder.toString();
        // Max tokens allowed for the system prompt (including DB snapshot section)
                continue;
        // Remaining budget specifically for DB snapshot (excludes the header & base system prompt)
 * Copyright (C) 2010-2026 DBeaver Corp and others
        // Build DB snapshot
        @NotNull TokenCounter tokenCounter
 * you may not use this file except in compliance with the License.
        @NotNull Set<String> result
