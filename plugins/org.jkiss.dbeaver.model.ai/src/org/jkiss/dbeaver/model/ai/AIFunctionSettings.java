    }
        enabledFunctionCategories.add(category);
    private final Set<String> enabledFunctionCategories = new LinkedHashSet<>();
    }
        return new HashSet<>(enabledFunctionCategories);
    public void setEnabledFunctions(@Nullable Set<String> functions) {

        return new HashSet<>(initializedDefaultCategories);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * See the License for the specific language governing permissions and

            functions.forEach(this::enableFunction);
    public void enableFunctionCategory(@NotNull String category) {
        if (function != null && !function.isHidden()) {
    }
    public boolean isFunctionsEnabled() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (categories != null) {
import org.jkiss.code.NotNull;

    @NotNull

    @NotNull

        if (functions != null) {
    public void enableFunction(@NotNull String functionId) {
import java.util.Set;
import org.jkiss.code.Nullable;
    public void setInitializedDefaultCategories(@Nullable Set<String> categories) {
        }


    @NotNull
    }
public final class AIFunctionSettings {

 *     http://www.apache.org/licenses/LICENSE-2.0
            this.initializedDefaultCategories.addAll(categories);
    AIFunctionSettings() {
import org.jkiss.dbeaver.model.ai.registry.AIFunctionDescriptor;
        this.initializedDefaultCategories.add(categoryId);
}
    }
import java.util.HashSet;
    }
        return functionsEnabled;
    }
 * AI function settings.

    public void setFunctionsEnabled(boolean functionsEnabled) {
/*

        this.initializedDefaultCategories.clear();

import java.util.LinkedHashSet;
 * limitations under the License.
 *
    public void markCategoryAsInitialized(@NotNull String categoryId) {
import org.jkiss.dbeaver.model.ai.registry.AIFunctionRegistry;
    public boolean isCategoryInitialized(@NotNull String categoryId) {
 * Stores function-related configuration: enabled/disabled states,
    }
    public Set<String> getEnabledFunctions() {
    public void setEnabledFunctionCategories(@Nullable Set<String> categories) {

 */

        this.functionsEnabled = functionsEnabled;
package org.jkiss.dbeaver.model.ai;
    }
        return initializedDefaultCategories.contains(categoryId);
    private final Set<String> initializedDefaultCategories = new LinkedHashSet<>();

 * you may not use this file except in compliance with the License.
        }
        return Set.copyOf(enabledFunctions);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    private final Set<String> enabledFunctions = new LinkedHashSet<>();

        }
    private boolean functionsEnabled = true;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        AIFunctionDescriptor function = AIFunctionRegistry.getInstance().getFunction(functionId);
 * DBeaver - Universal Database Manager
    public Set<String> getEnabledFunctionCategories() {
        this.enabledFunctions.clear();
        if (categories != null) {

    public Set<String> getInitializedDefaultCategories() {
 *
        }
            this.enabledFunctionCategories.addAll(categories);
    }
 * initialized categories tracking.
    }
            enabledFunctions.add(functionId);
 * You may obtain a copy of the License at
 */
/**
        this.enabledFunctionCategories.clear();
