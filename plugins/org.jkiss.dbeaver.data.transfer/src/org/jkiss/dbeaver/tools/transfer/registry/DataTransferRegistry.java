
        return instance;
                }
        return eventProcessors.get(id);
 *

        for (DataTransferNodeDescriptor node : nodes) {
package org.jkiss.dbeaver.tools.transfer.registry;
import org.eclipse.core.runtime.IExtensionRegistry;
    public Collection<DataTransferEventProcessorDescriptor> getEventProcessors(@NotNull String nodeId) {
import org.eclipse.core.runtime.Platform;
        for (DataTransferNodeDescriptor node : nodes) {
        return transformers.values().stream().filter(t -> t.getName().equals(tName)).findFirst().orElse(null);

    }

        if (idParts.length == 2) {
    }
            } else if ("eventProcessor".equals(ext.getName())) {
        @NotNull Class<?> objectType) {
import org.jkiss.code.NotNull;
                DataTransferNodeDescriptor node = new DataTransferNodeDescriptor(ext);
        for (DataTransferNodeDescriptor node : nodes) {
        }
                if (!CommonUtils.isEmpty(ext.getAttribute("ref"))) {
        //transformers.sort(Comparator.comparing(DataTransferAttributeTransformerDescriptor::getName));
                    log.error("Referenced data transfer node '" + nodeReference + "' not found");
        @NotNull DataTransferNodeDescriptor.NodeType nodeType,
 * Copyright (C) 2010-2025 DBeaver Corp and others

    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        return null;
import org.jkiss.dbeaver.tools.transfer.IDataTransferNode;

            // Load main nodes
                    continue;
                        result.add(node);
    }
                        break;
    public DataTransferEventProcessorDescriptor getEventProcessorById(@NotNull String id) {
        return transformers.get(id);
            }
            }
 */
    public List<DataTransferNodeDescriptor> getAvailableConsumers(@NotNull Collection<DBSObject> sourceObjects) {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
    @Nullable
                }
    }
                if (refNode == null) {
    public List<DataTransferProcessorDescriptor> getAvailableProcessors(
    @Nullable
            }
                return node;

        }
                    refNode.loadNodeConfigurations(ext);
 */

    public List<DataTransferNodeDescriptor> getAvailableProducers(@NotNull Collection<DBSObject> sourceObjects) {
    public synchronized static DataTransferRegistry getInstance() {
    private final List<DataTransferNodeDescriptor> nodes = new ArrayList<>();
    }
        List<DataTransferNodeDescriptor> result = new ArrayList<>();
            if (node.getNodeType() == nodeType) {
    @Nullable
        }
                return node;
            if (node.getNodeType() == nodeType) {
    @Nullable
                transformers.put(at.getId(), at);
                    return node.getAvailableProcessors(objectType);
        }
    }

        if (instance == null) {
                DataTransferAttributeTransformerDescriptor at = new DataTransferAttributeTransformerDescriptor(ext);
 * you may not use this file except in compliance with the License.
    private static final Log log = Log.getLog(DataTransferRegistry.class);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return getAvailableNodes(DataTransferNodeDescriptor.NodeType.PRODUCER, sourceObjects);

                for (DBSObject sourceObject : sourceObjects) {
public class DataTransferRegistry {

            DataTransferNodeDescriptor node = getNodeById(idParts[0]);
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
        List<DataTransferNodeDescriptor> result = new ArrayList<>();
 *
                    }
    public List<DataTransferNodeDescriptor> getNodes(@NotNull DataTransferNodeDescriptor.NodeType nodeType) {
    }
    @NotNull
    }
    @Nullable
                    continue;
        return new ArrayList<>(transformers.values());
                if (CommonUtils.isEmpty(nodeReference)) {
        }
    public DataTransferNodeDescriptor getNodeByType(@NotNull Class<? extends IDataTransferNode> type) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
        }
            } else if ("transformer".equals(ext.getName())) {


 * DataTransferRegistry
    @NotNull
                }
        for (IConfigurationElement ext : extElements) {
        }
import java.util.*;
    public DataTransferNodeDescriptor getNodeById(@NotNull String id) {

    @NotNull
    public List<DataTransferAttributeTransformerDescriptor> getAttributeTransformers() {
        for (DataTransferNodeDescriptor node : nodes) {

        return null;
        return result;
 *
        }
        // Load references
            }
    @NotNull
                // Load transformers
            .filter(x -> x.isApplicable(nodeId))
                result.add(node);
        return null;
    private final Map<String, DataTransferEventProcessorDescriptor> eventProcessors = new LinkedHashMap<>();

import org.eclipse.core.runtime.IConfigurationElement;
            if ("node".equals(ext.getName())) {
            }
    }
        return getAvailableNodes(DataTransferNodeDescriptor.NodeType.CONSUMER, sourceObjects);
        return result;
                    if (node.appliesToType(sourceObject.getClass())) {

        String[] idParts = processorFullId.split(":");
            instance = new DataTransferRegistry(Platform.getExtensionRegistry());
                if (node.appliesToType(objectType)) {

 * Unless required by applicable law or agreed to in writing, software
    private DataTransferRegistry(@NotNull IExtensionRegistry registry) {
}
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataTransfer"; //$NON-NLS-1$
            }
        return eventProcessors.values().stream()
    }

            if (node != null) {
                }

        for (DataTransferNodeDescriptor node : nodes) {
 * Licensed under the Apache License, Version 2.0 (the "License");

                }
        for (IConfigurationElement ext : extElements) {
/**

    List<DataTransferNodeDescriptor> getAvailableNodes(
    @NotNull
    public DataTransferProcessorDescriptor getProcessor(@NotNull String processorFullId) {
    }
        @NotNull Class<? extends IDataTransferNode<?>> nodeType,
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
    public DataTransferAttributeTransformerDescriptor getAttributeTransformerByName(@NotNull String tName) {
    }
        @NotNull Collection<DBSObject> sourceObjects
                eventProcessors.put(descriptor.getId(), descriptor);
 * You may obtain a copy of the License at
        // Load datasource providers from external plugins

import java.util.stream.Collectors;
                nodes.add(node);
                return node.getProcessor(idParts[1]);
    }
    private static DataTransferRegistry instance = null;
            }
                final DataTransferEventProcessorDescriptor descriptor = new DataTransferEventProcessorDescriptor(ext);
    public DataTransferAttributeTransformerDescriptor getAttributeTransformer(String id) {
    @Nullable
        return null;

    @NotNull
                } else {
            if (type.equals(node.getNodeClass())) {
            if (node.getId().equals(id)) {
    }
 * limitations under the License.
            .sorted(Comparator.comparingInt(DataTransferEventProcessorDescriptor::getOrder))

    private final Map<String, DataTransferAttributeTransformerDescriptor> transformers = new LinkedHashMap<>();
                String nodeReference = ext.getAttribute("ref");
        }
            if (node.getNodeClass() == nodeType) {
            if ("node".equals(ext.getName())) {
            }
                DataTransferNodeDescriptor refNode = getNodeById(nodeReference);
            .collect(Collectors.toList());
    @Nullable
        nodes.sort(Comparator.comparing(DataTransferNodeDescriptor::getName));
