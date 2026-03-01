        Set<String> ids = new LinkedHashSet<>();
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

import org.jkiss.code.Nullable;
            if (cat != null) {
            }

        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(AIFunctionDescriptor.EXTENSION_ID);
 *
        for (IConfigurationElement el : extElements) {
 */
    public List<AIFunctionDescriptor> getAllFunctions(@NotNull AIFunctionPurpose purpose) {

        }
        Map<AIFunctionCategoryDescriptor, List<AIFunctionDescriptor>> map = new LinkedHashMap<>();
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.model.ai.registry;
        return function.callFunction(context, arguments);
        for (IConfigurationElement ext : extElements) {

                categoriesById.put(cd.getId(), cd);
    private final Map<String, AIFunctionDescriptor> functionsById = new LinkedHashMap<>();
            if ("category".equals(el.getName())) {
                functionsById.put(fd.getId(), fd);
 * you may not use this file except in compliance with the License.

    }
import org.jkiss.dbeaver.Log;
            var cat = categoriesById.get(f.getCategoryId());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public AIFunctionDescriptor getFunction(@NotNull String id) {
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
 *
        @NotNull Map<String, Object> arguments
    @NotNull

        @NotNull AIFunctionDescriptor descriptor,
    @NotNull
/*
    private static AIFunctionRegistry instance;
        return ids;
            .filter(f ->
    public static synchronized AIFunctionRegistry getInstance() {
                AIFunctionDescriptor fd = new AIFunctionDescriptor(ext);
        }
                    || f.getPurpose() == purpose)

    }
    private final Map<String, AIFunctionCategoryDescriptor> categoriesById = new LinkedHashMap<>();
                    || purpose == AIFunctionPurpose.ALL
 */
    private static final Log log = Log.getLog(AIFunctionRegistry.class);
        for (var c : categoriesById.values()) {
import org.eclipse.core.runtime.Platform;
        return map;
        for (AIFunctionDescriptor f : functionsById.values()) {
}
import org.jkiss.dbeaver.model.ai.AIFunctionContext;

 * See the License for the specific language governing permissions and


                f.getPurpose() == AIFunctionPurpose.ALL
        return functionsById.values().stream()
import org.jkiss.dbeaver.model.ai.AIFunctionPurpose;
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.DBException;
        if (instance == null) {
        for (var cat : categoriesById.values()) {
            }
import java.util.*;
            instance = new AIFunctionRegistry(Platform.getExtensionRegistry());
                var cd = new AIFunctionCategoryDescriptor(el);
    }
        @NotNull AIFunctionContext context,
    @NotNull
 *
                ids.add(c.getId());
    }
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }


        return new ArrayList<>(categoriesById.values());
    public Map<AIFunctionCategoryDescriptor, List<AIFunctionDescriptor>> getFunctionsByCategory() {
    public AIFunctionRegistry(@NotNull IExtensionRegistry registry) {
import org.jkiss.dbeaver.model.ai.AIFunction;
import org.jkiss.dbeaver.model.ai.AIFunctionResult;
    public AIFunctionResult callFunction(
                map.get(cat).add(f);
/**
    public List<AIFunctionCategoryDescriptor> getAllCategories() {
    }
        AIFunction function = descriptor.createInstance();
        return instance;
        }
        return functionsById.get(id);
            if ("function".equals(ext.getName())) {
    ) throws DBException {
 * limitations under the License.
        }
 * AI function registry
    @Nullable
    }
            if (c.isEnabledByDefault()) {
            .toList();
    @NotNull
    @NotNull
            map.put(cat, new ArrayList<>());
public class AIFunctionRegistry {
            }
    public Set<String> getDefaultEnabledCategoryIds() {
 * You may obtain a copy of the License at
