

    }
            type = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
 *     http://www.apache.org/licenses/LICENSE-2.0
            super(config);
    }
package org.jkiss.dbeaver.registry;
import java.util.Comparator;
            .toList();

            .filter(ext -> ext.getName().equals(WORKBENCH_WINDOW_INITIALIZER))
 * DBeaver - Universal Database Manager

    public static final String WORKBENCH_WINDOW_INITIALIZER = "workbenchWindowInitializer";

        return initializers;
    private final List<InitializerDescriptor> initializers;
        if (instance == null) {
        public int getOrder() {
import org.jkiss.dbeaver.ui.IWorkbenchWindowInitializer;
public class WorkbenchHandlerRegistry
    public static class InitializerDescriptor extends AbstractDescriptor {
    {
            instance = new WorkbenchHandlerRegistry(Platform.getExtensionRegistry());
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
            order = CommonUtils.toInt(config.getAttribute(RegistryConstants.ATTR_ORDER), Integer.MAX_VALUE);
        private final int order;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.workbenchHandler"; //$NON-NLS-1$
            return type.createInstance(IWorkbenchWindowInitializer.class);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    {
        return instance;
    @NotNull
        private final ObjectType type;
 * Licensed under the Apache License, Version 2.0 (the "License");
        initializers = Arrays.stream(registry.getConfigurationElementsFor(EXTENSION_ID))
import org.eclipse.core.runtime.IConfigurationElement;

import org.eclipse.core.runtime.IExtensionRegistry;
import java.util.Collection;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
{
import java.util.Arrays;


 * limitations under the License.
/*


        }
import java.util.List;

    public synchronized static WorkbenchHandlerRegistry getInstance()
        }
            .sorted(Comparator.comparingInt(InitializerDescriptor::getOrder))
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
 */
import org.eclipse.core.runtime.Platform;
 *
    public Collection<InitializerDescriptor> getWorkbenchWindowInitializers() {
            .map(InitializerDescriptor::new)
        }
import org.jkiss.utils.CommonUtils;
    private static WorkbenchHandlerRegistry instance = null;
 * See the License for the specific language governing permissions and
        public IWorkbenchWindowInitializer newInstance() throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
        }
}
            return order;
    private WorkbenchHandlerRegistry(IExtensionRegistry registry)
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        private InitializerDescriptor(IConfigurationElement config) {
