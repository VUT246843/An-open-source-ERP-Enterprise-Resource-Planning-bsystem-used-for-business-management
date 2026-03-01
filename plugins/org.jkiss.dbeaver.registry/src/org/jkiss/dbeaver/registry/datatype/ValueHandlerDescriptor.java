 * limitations under the License.
import org.jkiss.code.NotNull;

    @Nullable
 *
 * you may not use this file except in compliance with the License.
 */
    private final String parentProvider;
import org.eclipse.core.runtime.IConfigurationElement;
    }
    }
    public ValueHandlerDescriptor(@NotNull IConfigurationElement config) {
package org.jkiss.dbeaver.registry.datatype;

 * DBeaver - Universal Database Manager
        return parentProvider;
} * You may obtain a copy of the License at
        return parentProvider != null && parentProvider.equals(descriptor.getId());

 *
 * ValueHandlerDescriptor
        this.parentProvider = config.getAttribute(RegistryConstants.ATTR_PARENT);

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
    public String getParentProvider() {
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.registry.RegistryConstants;
 */
import org.jkiss.code.Nullable;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ValueHandlerDescriptor extends DataTypeAbstractDescriptor<DBDValueHandlerProvider> {
 * Unless required by applicable law or agreed to in writing, software
/**
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isChildOf(@NotNull ValueHandlerDescriptor descriptor) {

        super(config, DBDValueHandlerProvider.class);
