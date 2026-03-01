
import java.util.Set;
    @NotNull

    public static final Map<String, AIModel> KNOWN_MODELS = AIUtils.modelMap(

        if (model.isPresent()) {
    private CopilotModels() {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
        new AIModel("gemini-2.5", 1_000_000, Set.of(AIModelFeature.CHAT)),
package org.jkiss.dbeaver.model.ai.engine.copilot;
    );
 * Unless required by applicable law or agreed to in writing, software
    }
        new AIModel("claude-sonnet-4", 200_000, Set.of(AIModelFeature.CHAT)),
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        return OpenAIModels.getModelByName(modelName);
 * See the License for the specific language governing permissions and
        new AIModel("claude-3.5-sonnet", 200_000, Set.of(AIModelFeature.CHAT)),
import org.jkiss.dbeaver.model.ai.utils.AIUtils;
        new AIModel("claude-3.7-sonnet", 200_000, Set.of(AIModelFeature.CHAT)),
            return Optional.empty();
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.ai.engine.AIModelFeature;
        }
 *
    public static Optional<AIModel> getModelByName(@Nullable String modelName) {
 * You may obtain a copy of the License at

public final class CopilotModels {
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIModels;
 */
import java.util.Map;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        new AIModel("gemini-2.0-flash-001", 1_000_000, Set.of(AIModelFeature.CHAT))
 *
        new AIModel("claude-3.7-sonnet-thought", 200_000, Set.of(AIModelFeature.CHAT)),
        Optional<AIModel> model = AIUtils.getModelByName(KNOWN_MODELS, modelName);
import org.jkiss.dbeaver.model.ai.engine.AIModel;
 * limitations under the License.
 * DBeaver - Universal Database Manager
        new AIModel("gemini-2.5-pro", 1_000_000, Set.of(AIModelFeature.CHAT)),
import java.util.Optional;
    }
import org.jkiss.code.Nullable;
/*
}

