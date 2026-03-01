
 */
    protected abstract void initializePrompt(@Nullable AIDatabaseContext context);
import org.jkiss.code.Nullable;
 */
            outputFormats.forEach(outputFormat -> prompt.append("- ").append(outputFormat).append("\n"));
import org.jkiss.dbeaver.model.ai.registry.AIPromptGeneratorDescriptor;

        this.contexts.addAll(Arrays.asList(contexts));
        }
    public AIPromptAbstract addContexts(@NotNull String... contexts) {
        }

        }

 *

            for (AIPromptGeneratorDescriptor.Uses use : gd.getUses()) {
        // Additional function instructions

        return this;
 *

        }
import org.jkiss.utils.CommonUtils;
        AIPromptGeneratorDescriptor gd = AIPromptGeneratorRegistry.getInstance().getPromptGenerator(generatorId());
    private final List<String> instructions = new ArrayList<>();
    @NotNull
                }

        // User custom instructions
    public String build(@Nullable AIDatabaseContext context) {
            examples.forEach(example -> prompt.append("- ").append(example).append("\n"));
    protected void clear() {
        this.outputFormats.addAll(Arrays.asList(outputFormats));

        AISettings settings = AISettingsManager.getInstance().getSettings();
        return this;
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
    protected AIPromptAbstract() {
public abstract class AIPromptAbstract implements AIPromptGenerator {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!contexts.isEmpty()) {
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others

            contexts.forEach(ctx -> prompt.append("- ").append(ctx).append("\n"));
    private final List<String> examples = new ArrayList<>();
    private final List<String> contexts = new ArrayList<>();
import org.jkiss.dbeaver.model.ai.AIPromptGenerator;
                    addInstructions(use.instructions());
import org.jkiss.code.NotNull;

    public AIPromptAbstract addInstructions(@NotNull String... instructions) {
        if (!outputFormats.isEmpty()) {
    public AIPromptAbstract addExamples(@NotNull String... examples) {
        if (!instructions.isEmpty()) {
                if (settings.getFunctionSettings().getEnabledFunctions().contains(use.function())) {
        this.examples.addAll(Arrays.asList(examples));
        this.instructions.addAll(Arrays.asList(instructions));
            instructions.forEach(instruction -> prompt.append("- ").append(instruction).append("\n"));
            }
 * See the License for the specific language governing permissions and
        if (CommonUtils.isNotEmpty(customInstructions)) {
 * prompt usage in chat conversations. It is used on persisted conversation loading.
 * DBeaver - Universal Database Manager
import java.util.ArrayList;
        this.outputFormats.clear();
        this.examples.clear();
    public AIPromptAbstract addOutputFormats(@NotNull String... outputFormats) {
 *
        this.contexts.clear();
            prompt.append("\nContext:\n");
 * Base class for prompt generators.


        if (!examples.isEmpty()) {
/**
        initializePrompt(context);

    private final List<String> outputFormats = new ArrayList<>();
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

 * Unless required by applicable law or agreed to in writing, software


        if (gd != null && settings.getFunctionSettings().isFunctionsEnabled()) {
    }
import org.jkiss.dbeaver.model.ai.AISettings;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Arrays;
package org.jkiss.dbeaver.model.ai.prompt;
            prompt.append("Instructions:\n");
    }
        String customInstructions = settings.getCustomInstructions(generatorId());
            prompt.append("\nOutput Format:\n");
        clear();
    }
import java.util.List;
            addInstructions(customInstructions);
        StringBuilder prompt = new StringBuilder();
 * You may obtain a copy of the License at
        }
        }
        return this;
        return this;
/*

}

 * Each prompt must implement function 'PromptClass create(DBSLogicalDataSourceSupplier)' in order to support
    }
        this.instructions.clear();
    }
        return prompt.toString();
 * limitations under the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

            prompt.append("\nExamples:\n");

import org.jkiss.dbeaver.model.ai.registry.AIPromptGeneratorRegistry;
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
