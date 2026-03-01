        if (globalDescriptor != null) {
import org.jkiss.code.NotNull;
}
    }
            if ("assistant".equals(ext.getName())) {

    }
    public static synchronized AIAssistantRegistry getInstance() {
 * Unless required by applicable law or agreed to in writing, software
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(AIAssistantDescriptor.EXTENSION_ID);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        }
            try {
            instance = new AIAssistantRegistry(Platform.getExtensionRegistry());
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public <T extends AIAssistant> T createAssistant(@NotNull DBPWorkspace workspace) throws IllegalStateException {
 * limitations under the License.
                if (globalDescriptor == null || descriptor.getPriority() > globalDescriptor.getPriority()) {
        if (instance == null) {
        return instance;
                }
            } catch (DBException e) {

            }

                return (T) globalDescriptor.createInstance(workspace);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else {
/*
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.jkiss.dbeaver.model.ai.AIAssistant;
    private static AIAssistantRegistry instance = null;
 *
    public AIAssistantDescriptor getDescriptor() {
    }



        for (IConfigurationElement ext : extElements) {
public class AIAssistantRegistry {
        }
package org.jkiss.dbeaver.model.ai.registry;
    }
                throw new IllegalStateException(e);
        }
            return (T) new AIAssistantImpl(workspace);
 *
    @NotNull
        return globalDescriptor;
 * You may obtain a copy of the License at
 */
    public AIAssistantRegistry(IExtensionRegistry registry) {

import org.eclipse.core.runtime.Platform;
            }
    private AIAssistantDescriptor globalDescriptor;
                AIAssistantDescriptor descriptor = new AIAssistantDescriptor(ext);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.ai.impl.AIAssistantImpl;

import org.jkiss.dbeaver.model.app.DBPWorkspace;
                    this.globalDescriptor = descriptor;
