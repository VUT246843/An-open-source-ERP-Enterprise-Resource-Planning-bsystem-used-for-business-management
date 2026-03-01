        }
        if (instance == null) {
            list.add(entry.getValue());
                String fallbacks = descriptor.getFallbacks();
                engine = descriptorMap.get(follBackId);
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public List<AIEngineDescriptor> getCompletionEngines() {
 */
        }
    @NotNull
                return engineClass.equals(entry.getValue().getEngineObjectType().getObjectClass());
import org.jkiss.code.NotNull;
            descriptor = defaultCompletionEngineDescriptor;
 * Copyright (C) 2010-2026 DBeaver Corp and others

/*
    }
import java.util.ArrayList;
        return false;
    private final Map<String, String> replaceMap = new LinkedHashMap<>();
    @Nullable
            if (follBackId != null) {
            .filter(entry -> {
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IConfigurationElement;
    public AIEngine createEngine(@NotNull String id) throws DBException {
public class AIEngineRegistry {
        }
    }

        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(AIEngineDescriptor.EXTENSION_ID);
import java.util.List;
        if (engine == null) {

import org.jkiss.utils.CommonUtils;

 */
            }
 *

                        fallbackMap.put(rl, descriptor.getId());
                descriptorMap.put(descriptor.getId(), descriptor);
                }
 *
            if ("completionEngine".equals(ext.getName())) {
                AIEngineDescriptor descriptor = new AIEngineDescriptor(ext);
        return instance;
import org.jkiss.dbeaver.Log;
                if (!CommonUtils.isEmpty(fallbacks)) {
                throw new DBException("AI engine '" + id + "' not found");
 * limitations under the License.
                    for (String rl : replaces.split(",")) {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.DBException;
        if (descriptor == null) {
        return descriptor.createEngineInstance();
    @Nullable
    private static final Log log = Log.getLog(AIEngineRegistry.class);
 * you may not use this file except in compliance with the License.
            }
 * AI engine settings
    public AIEngineDescriptor getDefaultCompletionEngineDescriptor() {
            if (replaceMap.containsKey(entry.getKey())) {
    }
        }
            log.trace("Active engine is not present in the configuration, switching to default active engine");
    public synchronized static AIEngineRegistry getInstance() {
            .orElse(null);
        for (Map.Entry<String, AIEngineDescriptor> entry : descriptorMap.entrySet()) {
    public AIEngineDescriptor getEngineDescriptor(@NotNull String id) {

 *
        AIEngineDescriptor engine = descriptorMap.get(id);
    private final Map<String, AIEngineDescriptor> descriptorMap = new LinkedHashMap<>();
    public AIEngineDescriptor getDescriptorByEngineClass(@NotNull Class<?> engineClass) {
import org.jkiss.dbeaver.model.ai.engine.AIEngine;

                break;
            String replace = replaceMap.get(id);
            })
            String follBackId = fallbackMap.get(id);
import java.util.LinkedHashMap;
    public boolean isEngineSupports(@NotNull String id, @NotNull Class<?> api) {

                }
            }

 * You may obtain a copy of the License at
        while (true) {
            Class<?> objectClass = descriptor.getEngineObjectType().getObjectClass();
                String replaces = descriptor.getReplaces();
        for (IConfigurationElement ext : extElements) {
            instance = new AIEngineRegistry(Platform.getExtensionRegistry());
        }
    private static AIEngineRegistry instance = null;
            if (defaultCompletionEngineDescriptor == null) {
            return objectClass != null && api.isAssignableFrom(objectClass);
            .findFirst()
            if (replace == null) {
                if (!CommonUtils.isEmpty(replaces)) {
                        replaceMap.put(rl, descriptor.getId());
            }
        return getCompletionEngines().stream().filter(AIEngineDescriptor::isDefault).findFirst().orElse(null);
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
    private final Map<String, String> fallbackMap = new LinkedHashMap<>();
    }
 * Unless required by applicable law or agreed to in writing, software
        return engine;


        }
    @NotNull
    }
    }
 * See the License for the specific language governing permissions and
        return descriptorMap.entrySet().stream()
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AIEngineRegistry(@NotNull IExtensionRegistry registry) {
                    }
        List<AIEngineDescriptor> list = new ArrayList<>();
/**
        return list;
}
        if (descriptor != null) {
import org.jkiss.code.Nullable;
    }
    @Nullable

                continue;
            .map(Map.Entry::getValue)
                    for (String rl : fallbacks.split(",")) {
package org.jkiss.dbeaver.model.ai.registry;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            id = replace;
            }
        AIEngineDescriptor descriptor = getEngineDescriptor(id);
import org.eclipse.core.runtime.Platform;
            AIEngineDescriptor defaultCompletionEngineDescriptor = getDefaultCompletionEngineDescriptor();

    }
                    }
        AIEngineDescriptor descriptor = getEngineDescriptor(id);

