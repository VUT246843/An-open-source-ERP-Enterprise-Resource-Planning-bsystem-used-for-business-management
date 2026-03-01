 */
    public void dispose() {

 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.Log;
            instance = new NavigatorExtensionsRegistry(Platform.getExtensionRegistry());

import java.util.ArrayList;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
package org.jkiss.dbeaver.ui.internal.registry;
                NavigatorNodeActionDescriptor descriptor = new NavigatorNodeActionDescriptor(ext);
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(NavigatorNodeActionDescriptor.EXTENSION_ID);
import java.util.List;
        return instance;
            .filter(nad -> (
                        && nad.getHandler().isEnabledFor(view, node))
        nodeActions.clear();
import java.util.Comparator;
                nad.appliesTo(node) ||
            .collect(Collectors.toList());
 * you may not use this file except in compliance with the License.

 * You may obtain a copy of the License at
    }
            if ("nodeAction".equals(ext.getName())) {
/**
 * See the License for the specific language governing permissions and
        if (instance == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

        return nodeActions.stream()
    private List<NavigatorNodeActionDescriptor> nodeActions = new ArrayList<>();
    }
import java.util.stream.Collectors;
    }
import org.eclipse.core.runtime.Platform;
/*
                    (node instanceof DBNDatabaseNode dbNode
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

        // Load node action handlers
 */

    private static NavigatorExtensionsRegistry instance = null;
 * NavigatorExtensionsRegistry
import org.jkiss.dbeaver.ui.navigator.INavigatorNodeActionHandler;
public class NavigatorExtensionsRegistry {
 *
    public List<INavigatorNodeActionHandler> getNodeActions(INavigatorModelView view, DBNNode node) {
 * Unless required by applicable law or agreed to in writing, software
        nodeActions.sort(Comparator.comparingInt(NavigatorNodeActionDescriptor::getOrder));
import org.jkiss.dbeaver.model.navigator.DBNNode;
                nodeActions.add(descriptor);
    public NavigatorExtensionsRegistry(IExtensionRegistry registry) {

                        && nad.appliesTo(dbNode.getObject())))

import org.eclipse.core.runtime.IExtensionRegistry;
 *
    }
        for (IConfigurationElement ext : extElements) {
    public synchronized static NavigatorExtensionsRegistry getInstance() {
 * DBeaver - Universal Database Manager
}
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
            .map(NavigatorNodeActionDescriptor::getHandler)
import org.eclipse.core.runtime.IConfigurationElement;

 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    private static final Log log = Log.getLog(NavigatorExtensionsRegistry.class);
