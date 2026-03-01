    {
            // Load functions
    }
    public SQLCommandHandlerDescriptor getCommandHandler(String id) {
    {
        return new ArrayList<>(commandHandlers.values());
import org.jkiss.code.Nullable;
    private final Map<String, SQLCommandHandlerDescriptor> commandHandlers = new HashMap<>();
    @Nullable
 */
    private void loadExtensions(IExtensionRegistry registry)

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
import java.util.ArrayList;
 *
import java.util.Map;
    public List<SQLCommandHandlerDescriptor> getCommandHandlers() {
        return commandHandlers.get(id);
        return pragmaHandlers.get(id);
import org.jkiss.code.NotNull;
    }
            instance = new SQLCommandsRegistry();
 *
                }
 * Licensed under the Apache License, Version 2.0 (the "License");

    public synchronized static SQLCommandsRegistry getInstance()
package org.jkiss.dbeaver.model.sql.registry;
        for (IConfigurationElement ext : extConfigs) {
        }
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.IExtensionRegistry;
            instance.loadExtensions(Platform.getExtensionRegistry());
    {

            if (TAG_COMMAND.equals(ext.getName())) {
import java.util.HashMap;
 * distributed under the License is distributed on an "AS IS" BASIS,
{
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IConfigurationElement;
    }
                    this.commandHandlers.put(commandDescriptor.getId(), commandDescriptor);
        if (instance == null) {


 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * You may obtain a copy of the License at

    public SQLPragmaHandlerDescriptor getPragmaHandler(@NotNull String id) {
    private final Map<String, SQLPragmaHandlerDescriptor> pragmaHandlers = new HashMap<>();

                pragmaHandlers.put(descriptor.getId(), descriptor);
    static final String TAG_COMMAND = "command"; //$NON-NLS-1$
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.util.List;
    }
                final SQLPragmaHandlerDescriptor descriptor = new SQLPragmaHandlerDescriptor(ext);
    }



    }
        return instance;
 * you may not use this file except in compliance with the License.
    }
 * See the License for the specific language governing permissions and
    static final String TAG_PRAGMA = "pragma"; //$NON-NLS-1$
 *
                if (commandDescriptor.isEnabled()) {
    private static SQLCommandsRegistry instance = null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                SQLCommandHandlerDescriptor commandDescriptor = new SQLCommandHandlerDescriptor(ext);
        commandHandlers.clear();
    private SQLCommandsRegistry()
public class SQLCommandsRegistry
    {
            if (TAG_PRAGMA.equals(ext.getName())) {
        }
            }

            }
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SQLCommandHandlerDescriptor.EXTENSION_ID);
    public void dispose()
