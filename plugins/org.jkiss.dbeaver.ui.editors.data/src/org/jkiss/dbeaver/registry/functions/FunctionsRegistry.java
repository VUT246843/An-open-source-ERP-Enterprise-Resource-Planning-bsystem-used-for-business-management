 * you may not use this file except in compliance with the License.
}
                    this.aggregateFunctions.add(
 * limitations under the License.
    private FunctionsRegistry()
import org.eclipse.core.runtime.IExtensionRegistry;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
                // Load aggregateFunctions
    static final String TAG_FUNCTION = "function"; //$NON-NLS-1$
    public void dispose()
 *

package org.jkiss.dbeaver.registry.functions;
        }
    public AggregateFunctionDescriptor getFunction(String id) {
        }
                }
import java.util.List;
        {
    public synchronized static FunctionsRegistry getInstance()
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
    private final List<AggregateFunctionDescriptor> aggregateFunctions = new ArrayList<>();


    {
            instance.loadExtensions(Platform.getExtensionRegistry());

            }
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others

            }
                return func;
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    private void loadExtensions(IExtensionRegistry registry)
        return null;
        for (AggregateFunctionDescriptor func : aggregateFunctions) {
        }
            for (IConfigurationElement ext : extConfigs) {
import java.util.ArrayList;

        aggregateFunctions.clear();
        if (instance == null) {
                if (TAG_FUNCTION.equals(ext.getName())) {

    {
            IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(AggregateFunctionDescriptor.EXTENSION_ID);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        new AggregateFunctionDescriptor(ext));
public class FunctionsRegistry

    {
    }
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
    private static FunctionsRegistry instance = null;
        return aggregateFunctions;
    }
        return instance;
    public List<AggregateFunctionDescriptor> getAggregateFunctions() {

import org.eclipse.core.runtime.IConfigurationElement;
            if (func.getId().equals(id)) {
import org.eclipse.core.runtime.Platform;
 * distributed under the License is distributed on an "AS IS" BASIS,
            instance = new FunctionsRegistry();

    }


    {
 *
{
