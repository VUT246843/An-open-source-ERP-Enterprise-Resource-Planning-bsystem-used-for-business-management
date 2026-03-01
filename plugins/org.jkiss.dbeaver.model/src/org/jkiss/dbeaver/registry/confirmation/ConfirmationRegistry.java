 * You may obtain a copy of the License at
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.confirmations";
import java.util.Map;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software



import org.jkiss.code.NotNull;

        }
 * you may not use this file except in compliance with the License.
    private static final String ELEMENT_ID = "confirmation";
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (descriptor == null) {
 *

import java.util.HashMap;
            throw new IllegalArgumentException("Can't find confirmation '" + id + "'");
    @NotNull
}


                confirmations.put(descriptor.getId(), descriptor);
    }
import org.eclipse.core.runtime.IExtensionRegistry;
        ConfirmationDescriptor descriptor = confirmations.get(id);
            }
    public ConfirmationDescriptor getConfirmation(@NotNull String id) {
        return descriptor;
 *
    public Collection<ConfirmationDescriptor> getConfirmations() {
    ConfirmationRegistry(@NotNull IExtensionRegistry registry) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static synchronized ConfirmationRegistry getInstance() {
 */
public class ConfirmationRegistry {

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
package org.jkiss.dbeaver.registry.confirmation;
import java.util.Collection;
 * See the License for the specific language governing permissions and

    private static ConfirmationRegistry instance;
 *
        if (instance == null) {
    private final Map<String, ConfirmationDescriptor> confirmations = new HashMap<>();
        return instance;
            if (ELEMENT_ID.equals(element.getName())) {
                final ConfirmationDescriptor descriptor = new ConfirmationDescriptor(element);
 * DBeaver - Universal Database Manager
        return confirmations.values();
import org.eclipse.core.runtime.Platform;
    }
import org.eclipse.core.runtime.IConfigurationElement;
    }
        for (IConfigurationElement element : registry.getConfigurationElementsFor(EXTENSION_ID)) {

            instance = new ConfirmationRegistry(Platform.getExtensionRegistry());
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
