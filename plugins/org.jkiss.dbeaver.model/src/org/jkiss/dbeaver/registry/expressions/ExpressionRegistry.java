}

    private ExpressionRegistry() {
            instance = new ExpressionRegistry();
public class ExpressionRegistry {

    public List<ExpressionNamespaceDescriptor> getExpressionNamespaces() {
    static final String TAG_FUNCTION = "function"; //$NON-NLS-1$
    }
/*
    }
    static final String TAG_NAMESPACE = "namespace"; //$NON-NLS-1$
 *
        expressionNamespaces.clear();

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

            for (IConfigurationElement ext : extConfigs) {
                // Load expression functions
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
package org.jkiss.dbeaver.registry.expressions;
 * See the License for the specific language governing permissions and
            }
    public void dispose() {


 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                }
 * limitations under the License.
        }
    public synchronized static ExpressionRegistry getInstance() {
 *
import org.eclipse.core.runtime.Platform;
            instance.loadExtensions(Platform.getExtensionRegistry());
import java.util.ArrayList;

 */
        }
    private final List<ExpressionNamespaceDescriptor> expressionNamespaces = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(ExpressionNamespaceDescriptor.EXP_EXTENSION_ID);

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        return expressionNamespaces;
                if (TAG_NAMESPACE.equals(ext.getName())) {
        if (instance == null) {

        {
    private static ExpressionRegistry instance = null;


    private void loadExtensions(IExtensionRegistry registry) {
                    this.expressionNamespaces.add(new ExpressionNamespaceDescriptor(ext));
 * You may obtain a copy of the License at
        return instance;
