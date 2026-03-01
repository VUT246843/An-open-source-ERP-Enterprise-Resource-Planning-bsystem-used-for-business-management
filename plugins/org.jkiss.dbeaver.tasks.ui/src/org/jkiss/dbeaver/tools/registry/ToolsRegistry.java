
                for (IConfigurationElement toolElement : toolsElement.getChildren(TAG_TOOL)) {
import org.eclipse.core.runtime.Platform;
        if (instance == null) {

    {
 * You may obtain a copy of the License at
    public List<ToolDescriptor> getTools() {
                for (IConfigurationElement toolElement : toolsElement.getChildren(TAG_TOOL_GROUP)) {
import org.eclipse.core.runtime.IConfigurationElement;
                }
import java.util.List;

    private final List<ToolDescriptor> tools = new ArrayList<ToolDescriptor>();
            }
        return instance;
    }

    static final String TAG_TOOL_GROUP = "toolGroup"; //$NON-NLS-1$
 */
    ToolGroupDescriptor getToolGroup(String id) {
            // Load tools
    {

import java.util.LinkedHashMap;
                    this.toolGroups.put(group.getId(), group);
    }
public class ToolsRegistry
 *     http://www.apache.org/licenses/LICENSE-2.0
        toolGroups.clear();
    public void dispose()
        tools.clear();
    }

 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

/*
                        new ToolDescriptor(toolElement));
    static final String TAG_TOOLS = "tools"; //$NON-NLS-1$
{
                }
        return tools;
        return toolGroups.get(id);
    private ToolsRegistry()
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
}
    }
import org.eclipse.core.runtime.IExtensionRegistry;
                    ToolGroupDescriptor group = new ToolGroupDescriptor(toolElement);

            instance.loadExtensions(Platform.getExtensionRegistry());
    private static ToolsRegistry instance = null;
 * Unless required by applicable law or agreed to in writing, software
        for (IConfigurationElement toolsElement : extConfigs) {
    private final Map<String, ToolGroupDescriptor> toolGroups = new LinkedHashMap<String, ToolGroupDescriptor>();

    private void loadExtensions(IExtensionRegistry registry)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    static final String TAG_TOOL = "tool"; //$NON-NLS-1$
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.tools"; //$NON-NLS-1$

package org.jkiss.dbeaver.tools.registry;
 * limitations under the License.
            {

            instance = new ToolsRegistry();
    public synchronized static ToolsRegistry getInstance()
 * See the License for the specific language governing permissions and

import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    this.tools.add(
import java.util.ArrayList;
    }
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(EXTENSION_ID);
    {
    {
        }

 *
