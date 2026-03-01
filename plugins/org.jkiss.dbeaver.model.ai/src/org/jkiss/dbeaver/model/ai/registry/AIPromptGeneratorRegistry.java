import org.jkiss.code.NotNull;
            instance = new AIPromptGeneratorRegistry(Platform.getExtensionRegistry());
    }

        if (instance == null) {
}
            if ("prompt".equals(ext.getName())) {
import org.eclipse.core.runtime.IExtensionRegistry;
import java.util.List;
import java.util.Map;
    @NotNull
        for (IConfigurationElement ext : extElements) {
        return descriptorMap.get(id);
    private static final Log log = Log.getLog(AIPromptGeneratorRegistry.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,


 * Licensed under the Apache License, Version 2.0 (the "License");
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(AIPromptGeneratorDescriptor.EXTENSION_ID);

        return instance;
        return descriptorMap.values().stream().toList();
                AIPromptGeneratorDescriptor descriptor = new AIPromptGeneratorDescriptor(ext);


    }
 */
 */
import org.eclipse.core.runtime.Platform;
    }
/**
            }
/*
import org.eclipse.core.runtime.IConfigurationElement;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at

    }

        }
public class AIPromptGeneratorRegistry {
package org.jkiss.dbeaver.model.ai.registry;
 * limitations under the License.
import org.jkiss.code.Nullable;
    @Nullable
    private static AIPromptGeneratorRegistry instance = null;
 *
 * DBeaver - Universal Database Manager
import java.util.LinkedHashMap;
                descriptorMap.put(descriptor.getId(), descriptor);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AIPromptGeneratorDescriptor getPromptGenerator(@NotNull String id) {

 *
    public AIPromptGeneratorRegistry(@NotNull IExtensionRegistry registry) {
 * you may not use this file except in compliance with the License.

    private final Map<String, AIPromptGeneratorDescriptor> descriptorMap = new LinkedHashMap<>();
        }
 *

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static synchronized AIPromptGeneratorRegistry getInstance() {
 * See the License for the specific language governing permissions and
    public List<AIPromptGeneratorDescriptor> getAllPromptGenerator() {
 * AI engine settings
