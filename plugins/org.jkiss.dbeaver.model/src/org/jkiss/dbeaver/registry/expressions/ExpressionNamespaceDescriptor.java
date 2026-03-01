        return implClass.getObjectClass();
    public ExpressionNamespaceDescriptor(IConfigurationElement config) {
    private final String id;
 *
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.description = config.getAttribute("description");
    public String getDescription() {
/*
 * Unless required by applicable law or agreed to in writing, software
    public String getId() {
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    }
 * you may not use this file except in compliance with the License.
 * limitations under the License.
        return description;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
    }

        super(config);
        this.id = config.getAttribute("id");
/**

 * ExpressionNamespaceDescriptor
public class ExpressionNamespaceDescriptor extends AbstractContextDescriptor {

    public Class<?> getImplClass() {
 */


 * You may obtain a copy of the License at

}

import org.jkiss.code.Nullable;
    @Nullable
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.registry.expressions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
    }
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.core.runtime.IConfigurationElement;
        this.implClass = new ObjectType(config.getAttribute("class"));
        return id;
 *
    @NotNull

    private final String description;
    }
    private final ObjectType implClass;
    public static final String EXP_EXTENSION_ID = "org.jkiss.dbeaver.expressions"; //$NON-NLS-1$
