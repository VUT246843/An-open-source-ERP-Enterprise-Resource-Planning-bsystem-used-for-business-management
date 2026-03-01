 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 * limitations under the License.
import org.jkiss.code.Nullable;
     * Returns instance of SQLEditorAddInsRegistry
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IExtensionRegistry;

                SQLEditorQuickFixProcessorDescriptor desc = new SQLEditorQuickFixProcessorDescriptor((element));
 * you may not use this file except in compliance with the License.
 *

 *

 * You may obtain a copy of the License at
        Map<Class<?>, SQLEditorQuickFixProcessorDescriptor> descs = new HashMap<>();
    public static synchronized SQLEditorQuickFixProcessorsRegistry getInstance() {


        this.quickFixProcDescriptors = descs.values();
    public Collection<SQLEditorQuickFixProcessorDescriptor> getQuickFixProcessorDescriptors() {
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.sql.addins;
            instance = new SQLEditorQuickFixProcessorsRegistry(Platform.getExtensionRegistry());
    private final Collection<SQLEditorQuickFixProcessorDescriptor> quickFixProcDescriptors;


    @NotNull

    private SQLEditorQuickFixProcessorsRegistry(@NotNull IExtensionRegistry registry) {
    @NotNull
public class SQLEditorQuickFixProcessorsRegistry {
    }
import java.util.HashMap;
import java.util.Map;

        }
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sql.quickFixProcessors"; //$NON-NLS-1$
        return instance;
            if (TAG_QUICK_FIX_PROCESSOR.equals(element.getName())) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Collection;
            }
        }
import org.jkiss.code.NotNull;
        if (instance == null) {
    }
/*
        return this.quickFixProcDescriptors;
    private static SQLEditorQuickFixProcessorsRegistry instance = null;
    private static final String TAG_QUICK_FIX_PROCESSOR = "quickFixProcessor"; //$NON-NLS-1$
    }
 */
        for (IConfigurationElement element : registry.getConfigurationElementsFor(EXTENSION_ID)) {

import org.eclipse.core.runtime.Platform;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
import org.eclipse.core.runtime.IConfigurationElement;
                descs.put(desc.getClass(), desc);
 * Unless required by applicable law or agreed to in writing, software
    /**
    @Nullable
