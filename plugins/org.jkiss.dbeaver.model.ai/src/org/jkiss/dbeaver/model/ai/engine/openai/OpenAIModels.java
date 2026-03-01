        }
            if (modelName.contains(keyword)) {
 * DBeaver - Universal Database Manager


    public static final String DEFAULT_MODEL = "gpt-4o";
        new AIModel("o4-mini", 200_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            features.add(AIModelFeature.STREAMING);
        new AIModel("text-embedding-ada-002", 65_536, Set.of(AIModelFeature.EMBEDDING))
        Set<AIModelFeature> features = new HashSet<>();

        new AIModel("o1", 200_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
import java.util.regex.Pattern;
 *
     */
        new AIModel("gpt-5", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
        if (DEPRECATED_MODELS.contains(lowerCaseModelName)) {

        new AIModel("gpt-4o-mini-transcribe", 128_000, Set.of(AIModelFeature.SPEECH_TO_TEXT)),
        new AIModel("gpt-5.2", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
        new AIModel("gpt-3.5-turbo", 16_384, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
        new AIModel("o1-pro", 200_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
 *
        return modelName;
     * @return the replacement model name

    }
 */
     * @param modelName the model name to check
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        new AIModel("gpt-5.1-codex", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
package org.jkiss.dbeaver.model.ai.engine.openai;
        new AIModel("o3", 200_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
    }
        "gpt-3.5-turbo-1106",
    public static boolean isTemperatureEditable(@NotNull AIModel model) {
    public static String getEffectiveModelName(@Nullable String modelName) {
import org.jkiss.code.NotNull;
 *
        }
        new AIModel("gpt-4o-mini", 128_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
    /**
        if (isChatModel(modelName)) {


import org.jkiss.dbeaver.model.ai.engine.AIModel;
            return lowerCaseModelName;
import org.jkiss.dbeaver.model.ai.utils.AIUtils;

        if (KNOWN_MODELS.containsKey(lowerCaseModelName)) {
        if (!(modelName.startsWith("gpt-") || modelName.startsWith("o"))) {
        new AIModel("text-embedding-3-large", 65_536, Set.of(AIModelFeature.EMBEDDING)),
        if (knownModel != null) {


        "search",
    );
public final class OpenAIModels {
        return !model.features().contains(AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE);
    );
    }
 * You may obtain a copy of the License at
        new AIModel("gpt-5.2-pro", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
        }
/*
    );
        // If the model is not known, return an empty set
            return DEFAULT_MODEL;
        new AIModel("gpt-4.1-nano", 1_048_576, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),

        "gpt-3.5-turbo-16k-1106"

        }
        for (String keyword : CHAT_EXCLUDED_KEYWORDS) {
        "gpt-3.5-turbo-16k",
    public static Set<AIModelFeature> detectModelFeatures(@NotNull String modelName) {
 * you may not use this file except in compliance with the License.
     * If the model name is known, returns it in lowercase.
 * distributed under the License is distributed on an "AS IS" BASIS,
        new AIModel("gpt-5.1", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
        "gpt-3.5-turbo-0301",
        return features;
        new AIModel("gpt-5-codex", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
            return knownModel.features();
        new AIModel("gpt-4.1", 1_048_576, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
        new AIModel("gpt-4-turbo", 128_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
    public static Optional<AIModel> getModelByName(@Nullable String modelName) {
        new AIModel("gpt-5-mini", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
        }
    }
    public static final Set<String> DEPRECATED_MODELS = Set.of(
        new AIModel("o3-mini", 200_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),
    private static final List<String> CHAT_EXCLUDED_KEYWORDS = List.of(

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        "image"
        new AIModel("o1-mini", 128_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),

     * Returns the replacement model name for the given model name.
        return AIUtils.getModelByName(KNOWN_MODELS, modelName);

    private OpenAIModels() {
        if (modelName == null || modelName.isEmpty()) {
        new AIModel("gpt-4o", 128_000, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
            }
        "gpt-3.5-turbo-16k-0613",
        new AIModel("gpt-4.1-mini", 1_048_576, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
}

import org.jkiss.code.Nullable;
        AIModel knownModel = KNOWN_MODELS.get(modelName.toLowerCase(Locale.ROOT));
            features.add(AIModelFeature.EMBEDDING);
    @NotNull
            features.add(AIModelFeature.CHAT);
 * Licensed under the Apache License, Version 2.0 (the "License");
        new AIModel("o3-pro", 200_000, Set.of(AIModelFeature.CHAT)),
        new AIModel("gpt-4o-transcribe", 128_000, Set.of(AIModelFeature.SPEECH_TO_TEXT)),
     * If the model name is deprecated, returns the default model.
            return DEFAULT_MODEL;
        "realtime",
        new AIModel("gpt-4", 8_192, Set.of(AIModelFeature.CHAT, AIModelFeature.STREAMING)),
    }
        new AIModel("gpt-5-nano", 400_000, Set.of(AIModelFeature.CHAT, AIModelFeature.ALWAYS_DEFAULT_TEMPERATURE), 1),

        new AIModel("whisper-1", 30_000, Set.of(AIModelFeature.SPEECH_TO_TEXT)),
        }
import java.util.*;
        "moderation",
        return true;
    private static boolean isChatModel(@NotNull String modelName) {
    private static final Pattern EMBEDDING_MODEL_PATTERN = Pattern.compile("text-embedding-.*");
        new AIModel("text-embedding-3-small", 65_536, Set.of(AIModelFeature.EMBEDDING)),
 * limitations under the License.
        "research",
    }
        if (EMBEDDING_MODEL_PATTERN.matcher(modelName).matches()) {
import org.jkiss.dbeaver.model.ai.engine.AIModelFeature;
     *
        "gpt-3.5-turbo-0613",

 * Copyright (C) 2010-2026 DBeaver Corp and others
        "audio",
        String lowerCaseModelName = modelName.toLowerCase(Locale.ROOT);
     * If the model name is null or empty, returns the default model.
        }
            return false;
    public static final Map<String, AIModel> KNOWN_MODELS = AIUtils.modelMap(
                return false;
