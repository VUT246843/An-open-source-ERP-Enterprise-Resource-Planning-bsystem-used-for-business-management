    }
    public void setActiveEngine(String activeEngine) {

 *

    public void setCustomInstructions(@NotNull Map<String, String> instructions) {
 * DBeaver - Universal Database Manager
 * Keeps global parameters and configuration of all AI engines
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setEngineConfigurations(
        return functionSettings;
        for (Map.Entry<String, AIEngineProperties> entry : engineConfigurations.entrySet()) {
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
 * distributed under the License is distributed on an "AS IS" BASIS,

    public <T> T getAdapter(@NotNull Class<T> adapter) {
        return (T) properties.get(name);
    public AISettings() {
        }
            AIEngineProperties engineConfiguration = entry.getValue();
        @NotNull String engineId,
                if (!resolvedSecrets.contains(engineId)) {
            }

    }
 * Unless required by applicable law or agreed to in writing, software
 *
    }
import java.util.*;
    private final Set<String> resolvedSecrets = new HashSet<>();
 * You may obtain a copy of the License at
            if (!AISettingsManager.saveSecretsAsPlainText()) {
                }
        AIEngineProperties aiEngineSettings = engineConfigurations.get(engineId);
    public synchronized <T extends AIEngineProperties> T getEngineConfiguration(@NotNull String engineId) throws DBException {


    ) {

        return activeEngine;
import org.jkiss.dbeaver.model.ai.registry.AIEngineRegistry;
    }
    }
 */
    @SuppressWarnings("unchecked")
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull AIEngineProperties engineConfiguration


        if (aiEngineSettings == null) {
    @Nullable

/*
        return (T) aiEngineSettings;
        } else {
        return properties;
    }
        }

    @NotNull
    @NotNull


        AIEngineDescriptor engineDescriptor = AIEngineRegistry.getInstance().getEngineDescriptor(activeEngine);
        if (engineDescriptor == null) {
        return null;
    }
/**
        return Map.copyOf(customInstructions);
    }

    }
    @Override
 * limitations under the License.
            // Replacement?
        this.aiDisabled = aiDisabled;


            aiEngineSettings = engineDescriptor.createPropertiesInstance();
    public void setProperty(@NotNull String name, @Nullable Object value) {
    @NotNull
        if (aiEngineSettings != null) {
        }
}
package org.jkiss.dbeaver.model.ai;
        customInstructions.putAll(instructions);
    @Nullable
        return engineConfigurations.containsKey(engineId);
    }
    private String activeEngine;
            activeEngine = engineDescriptor.getId();
    public Map<String, String> getCustomInstructions() {
            properties.put(name, value);
        if (value == null) {
import org.jkiss.code.NotNull;
        return Objects.requireNonNullElse(getProperty(name), defaultValue);

        this.activeEngine = activeEngine;
    public boolean isAiDisabled() {
    public <T> T getProperty(@NotNull String name) {
    public Map<String, Object> getAllProperties() {
    private final Map<String, Object> properties = new LinkedHashMap<>();
        if (engineDescriptor != null) {
            }
        return aiDisabled;
    }
    public String activeEngine() {
            String engineId = entry.getKey();
            throw new DBException("AI engine " + engineId + " not found");
    }
 * AI global settings.
public class AISettings implements DBPAdaptable {
    public AIFunctionSettings getFunctionSettings() {
    public <T> T getProperty(@NotNull String name, @NotNull T defaultValue) {

        }
        @NotNull Map<String, AIEngineProperties> engineConfigurations

    private final Map<String, String> customInstructions = new LinkedHashMap<>();
        customInstructions.clear();
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;

    public boolean hasConfiguration(String engineId) {
        this.engineConfigurations.putAll(engineConfigurations);
import org.jkiss.dbeaver.DBException;
    public void setAiDisabled(boolean aiDisabled) {

import org.jkiss.code.Nullable;
    @NotNull
    }

    }
        }

 * you may not use this file except in compliance with the License.
    public void setEngineConfiguration(
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        return customInstructions.get(promptGeneratorId);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

    private boolean aiDisabled;


                    resolvedSecrets.add(engineId);

    public Map<String, AIEngineProperties> getEngineConfigurations() {
        engineConfigurations.put(engineId, engineConfiguration);
    public void saveSecrets() throws DBException {
    }

                engineConfiguration.saveSecrets();

    }
            if (resolvedSecrets.contains(engineId)) {
        AIEngineDescriptor engineDescriptor = AIEngineRegistry.getInstance().getEngineDescriptor(engineId);
    public String getCustomInstructions(@NotNull String promptGeneratorId) {
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
import org.jkiss.dbeaver.model.DBPAdaptable;
    private final AIFunctionSettings functionSettings = new AIFunctionSettings();
                    aiEngineSettings.resolveSecrets();
        return engineConfigurations;
    }
 */
    ) {
    @NotNull
            properties.remove(name);
    private final Map<String, AIEngineProperties> engineConfigurations = new LinkedHashMap<>();
