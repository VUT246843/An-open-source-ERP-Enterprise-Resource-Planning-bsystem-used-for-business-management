import org.eclipse.core.runtime.IExtensionRegistry;
            knownToolBars.put(entry.getKey(), new ToolBarConfigurationDescriptor(entry.getKey(), entry.getValue()));
import java.util.stream.Collectors;
 */
    private void loadExtensions(IExtensionRegistry registry) {


        });
import java.util.Map;

     * Checks if item on the toolbar visible
            .collect(Collectors.groupingBy(e -> e.getAttribute(ToolBarConfigurationDescriptor.KEY_ATTR_NAME)));
        return instance;

import java.util.LinkedHashMap;
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    private static final Log log = Log.getLog(ToolBarConfigurationRegistry.class);
            return false;
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(EXTENSION_ID);

 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static ToolBarConfigurationRegistry instance = null;
}
 * Unless required by applicable law or agreed to in writing, software
    }
    
    /**

    private ToolBarConfigurationRegistry() {
     */
/*
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

            log.error("Unknown toolbar key " + toolBarKey + " for item " + itemKey);
    

        ToolBarConfigurationDescriptor toolBar = knownToolBars.get(toolBarKey);

 * See the License for the specific language governing permissions and
    }

        Map<String, List<IConfigurationElement>> toolBarElementsByKey = Stream.of(extConfigs)
            .filter(e -> ToolBarConfigurationDescriptor.TOOLBAR_ELEMENT_NAME.equals(e.getName()))
            return toolBar.isItemVisible(itemKey);
            "org.jkiss.dbeaver.toolBarConfiguration", "toolbars", "[" + toolBarKey + "]", "items", "[" + itemKey + "]", property 
        } else {
            instance.loadExtensions(Platform.getExtensionRegistry());
import org.jkiss.dbeaver.Log;
 * you may not use this file except in compliance with the License.
    private final Map<String, ToolBarConfigurationDescriptor> knownToolBars = new LinkedHashMap<>();
public class ToolBarConfigurationRegistry {
 * limitations under the License.
        if (toolBar != null) {
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.ui.actions;
     * Returns an instance of this singleton
 * Licensed under the Apache License, Version 2.0 (the "License");

import java.util.stream.Stream;
        for (Map.Entry<String, List<IConfigurationElement>> entry : toolBarElementsByKey.entrySet()) {
    public Collection<ToolBarConfigurationDescriptor> getKnownToolBars() {
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (instance == null) {
    /**
    }
    public boolean isItemVisible(@NotNull String toolBarKey, @NotNull String itemKey) {
        return String.join(".", new String[]{
import org.jkiss.code.NotNull;
        }
        return knownToolBars.values();
import org.eclipse.core.runtime.IConfigurationElement;
    static String makeItemVisibilityPreferenceKeyName(@NotNull String toolBarKey, @NotNull String itemKey, @NotNull String property) {
        }
import java.util.Collection;
        knownToolBars.clear();
    public static synchronized ToolBarConfigurationRegistry getInstance() {
 * You may obtain a copy of the License at
import java.util.List;
 *
            instance = new ToolBarConfigurationRegistry();
    }
import org.eclipse.core.runtime.Platform;
    }
    }
    static final String EXTENSION_ID = "org.jkiss.dbeaver.toolBarConfiguration"; //$NON-NLS-1$

