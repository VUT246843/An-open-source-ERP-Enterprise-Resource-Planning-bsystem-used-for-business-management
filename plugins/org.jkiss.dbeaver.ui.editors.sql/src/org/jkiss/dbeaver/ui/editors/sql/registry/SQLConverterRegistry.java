    private static final String TAG_TARGET = "target"; //NON-NLS-1

        }
    }
        }
 */

/**
                return converter;
 */
}
    private SQLConverterRegistry(IExtensionRegistry registry)
        IConfigurationElement[] panelElements = registry.getConfigurationElementsFor(EXTENSION_ID);
 * limitations under the License.
 * See the License for the specific language governing permissions and
import java.util.List;
        return targetConverters;
 *


    public synchronized static SQLConverterRegistry getInstance() {
 * DBeaver - Universal Database Manager
        }
            instance = new SQLConverterRegistry(Platform.getExtensionRegistry());
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (TAG_TARGET.equals(ext.getName())) {
    }


    public List<SQLTargetConverterDescriptor> getTargetConverters() {
    private List<SQLTargetConverterDescriptor> targetConverters = new ArrayList<>();
    @Nullable
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;


    }
    private static SQLConverterRegistry instance;

        for (IConfigurationElement ext : panelElements) {
    @NotNull
import org.jkiss.code.Nullable;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * SQLConverterRegistry
    {
            if (converter.getId().equals(converterId)) {
import java.util.ArrayList;
        for (SQLTargetConverterDescriptor converter : targetConverters) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *


        if (instance == null) {
    public SQLTargetConverterDescriptor getTargetConverter(String converterId) {
package org.jkiss.dbeaver.ui.editors.sql.registry;
import org.eclipse.core.runtime.IExtensionRegistry;
            }
public class SQLConverterRegistry {
            }

 * Unless required by applicable law or agreed to in writing, software
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sql.covert"; //NON-NLS-1 //$NON-NLS-1$
                targetConverters.add(descriptor);
        return null;
        // Load target converters
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

        return instance;
                SQLTargetConverterDescriptor descriptor = new SQLTargetConverterDescriptor(ext);
 * Licensed under the Apache License, Version 2.0 (the "License");
