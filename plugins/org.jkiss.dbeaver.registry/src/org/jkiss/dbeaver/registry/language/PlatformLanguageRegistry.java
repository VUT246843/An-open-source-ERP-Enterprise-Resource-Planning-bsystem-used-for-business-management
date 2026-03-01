                return descriptor;
 *
 *
            }
                descriptors.add(formatterDescriptor);
        }
 * See the License for the specific language governing permissions and
 */
        for (PlatformLanguageDescriptor descriptor : descriptors) {
            }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
public class PlatformLanguageRegistry
    public List<PlatformLanguageDescriptor> getLanguages()

            if (descriptor.getCode().equals(locale.toString())) {

    {
        if (instance == null) {
                return descriptor;
import java.util.ArrayList;

 * You may obtain a copy of the License at
/*
        {
        }
import java.util.Locale;

    private PlatformLanguageRegistry(IExtensionRegistry registry)

        }
    {
    }
    private static PlatformLanguageRegistry instance = null;
 *     http://www.apache.org/licenses/LICENSE-2.0

    
    }
 * you may not use this file except in compliance with the License.
        return null;
            instance = new PlatformLanguageRegistry(Platform.getExtensionRegistry());
            if (descriptor.getCode().equals(id)) {
    }
        }
    {
    public PlatformLanguageDescriptor getLanguage(Locale locale)
            for (IConfigurationElement ext : extElements) {
    public PlatformLanguageDescriptor getLanguage(String id)
    }
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
        for (PlatformLanguageDescriptor descriptor : descriptors) {
    public synchronized static PlatformLanguageRegistry getInstance()

        return null;
        return descriptors;
{
        for (PlatformLanguageDescriptor descriptor : descriptors) {

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.IConfigurationElement;
                PlatformLanguageDescriptor formatterDescriptor = new PlatformLanguageDescriptor(ext);
    private final List<PlatformLanguageDescriptor> descriptors = new ArrayList<>();
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        return instance;
        }
                return descriptor;
    {
package org.jkiss.dbeaver.registry.language;
}
        // Load data descriptors from external plugins
            if (descriptor.getCode().equals(locale.getLanguage())) {
 *
 * DBeaver - Universal Database Manager
 * limitations under the License.

        // Try to search by language only
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.IExtensionRegistry;
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(PlatformLanguageDescriptor.EXTENSION_ID);
            }
