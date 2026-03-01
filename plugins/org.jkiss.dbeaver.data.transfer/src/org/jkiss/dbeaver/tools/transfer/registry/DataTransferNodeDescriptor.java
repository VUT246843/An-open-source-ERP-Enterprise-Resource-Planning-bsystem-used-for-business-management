        this.description = config.getAttribute("description");
        return id;
    }

        return icon;

    public String getName()
        return name;
public class DataTransferNodeDescriptor extends AbstractDescriptor {
                    boolean adapts = false;
    public boolean appliesToType(@NotNull Class<?> objectType) {
                    if (!adapts) {
                    }
        return id;
 * limitations under the License.
    }
            for (DBSObject sourceObject : sourceObjects) {
    public IDataTransferNode<?> createNode() throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        supports = false;
            for (ObjectType sourceType : sourceTypes) {
        loadNodeConfigurations(config);
    }
        this.id = config.getAttribute("id");


import org.jkiss.dbeaver.model.DBIcon;
                    if (sourceObject instanceof IAdaptable) {
    private final List<ObjectType> sourceTypes = new ArrayList<>();
    /**
    public String getId()
            throw new DBException("Can't create data transformer node", e);
            }


        }
        CONSUMER
            return settingsType.getImplClass(IDataTransferSettings.class).getDeclaredConstructor().newInstance();
    void loadNodeConfigurations(@NotNull IConfigurationElement config) {
            throw new DBException("Can't create node settings", e);
import org.jkiss.dbeaver.tools.transfer.IDataTransferSettings;
            procList.add(new DataTransferProcessorDescriptor(this, processorConfig));
                    }

            if (descriptor.appliesToType(objectType)) {
        List<DataTransferProcessorDescriptor> editors = new ArrayList<>();
        super(config);
 * You may obtain a copy of the License at
    public NodeType getNodeType()
                }
        }
 *
                return true;

        settingsType.checkObjectClass(IDataTransferSettings.class);
        List<DataTransferProcessorDescriptor> procList = new ArrayList<>();
    }
    @NotNull
        List<DataTransferProcessorDescriptor> procList = new ArrayList<>();
    public String getDescription()

    @Override


    private final NodeType nodeType;
     * @param sourceObjects object types
                procList.add(descriptor);
        this.icon = iconToImage(config.getAttribute("icon"), DBIcon.TYPE_UNKNOWN);
            return implType.getImplClass(IDataTransferNode.class).getDeclaredConstructor().newInstance();
    }
                    return true;
    @NotNull

    private final String id;
        return !processors.isEmpty();
        try {
            }
    private final ObjectType implType;
        PRODUCER,
    }
        for (DataTransferProcessorDescriptor descriptor : processors) {
                            adapts = true;
import org.eclipse.core.runtime.IAdaptable;
    }
        procList.sort(Comparator.comparing(DataTransferProcessorDescriptor::getName));
                return descriptor;

            }
    @NotNull
 */
    public DBPImage getIcon()
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
    public boolean isAdvancedNode() {
        return null;
    private final String description;
            if (processor.appliesToType(objectType)) {
                if (sourceType.matchesType(objectType)) {
    private final String name;
    @NotNull
            }
    public List<DataTransferProcessorDescriptor> getAvailableProcessors(@NotNull Collection<DBSObject> sourceObjects) {
package org.jkiss.dbeaver.tools.transfer.registry;
    public List<DataTransferProcessorDescriptor> getAvailableProcessors(@NotNull Class<?> objectType) {



import org.jkiss.dbeaver.tools.transfer.IDataTransferNode;
import org.jkiss.code.NotNull;
        this.processors.addAll(procList);
    @NotNull
 * DBeaver - Universal Database Manager
        } catch (Throwable e) {
        }
    @NotNull
}
                }
    }
        for (IConfigurationElement typeCfg : ArrayUtils.safeArray(config.getChildren("sourceType"))) {
import org.jkiss.utils.CommonUtils;
        } catch (Throwable e) {
    public boolean hasProcessors() {
    public String toString() {
    @Nullable
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
        for (DataTransferProcessorDescriptor descriptor : this.processors) {
    }
        return editors;

        if (!sourceTypes.isEmpty()) {


    }
    }
    @NotNull
        this.nodeType = CommonUtils.valueOf(NodeType.class, config.getAttribute("type").toUpperCase(Locale.ENGLISH), NodeType.PRODUCER);
    }
    private final DBPImage icon;

        try {
import org.jkiss.dbeaver.model.DBPImage;
    }
    }
        for (DataTransferProcessorDescriptor processor : processors) {
        this.advanced = CommonUtils.toBoolean(config.getAttribute("advanced"));
    @NotNull
    @NotNull
    public IDataTransferSettings createSettings() throws DBException {
            boolean supports = true;
        }
        }
        return description;
    {

     * @return list of editors
    public DataTransferProcessorDescriptor[] getProcessors() {
        }
import org.jkiss.dbeaver.tools.transfer.DTConstants;
        return advanced;
        this.settingsType = new ObjectType(config.getAttribute("settings"));
import org.jkiss.dbeaver.DBException;
    @Nullable
    public enum NodeType {
        for (IConfigurationElement processorConfig : ArrayUtils.safeArray(config.getChildren(DTConstants.PROP_PROCESSOR_TYPE))) {
            }
        this.implType = new ObjectType(config.getAttribute("class"));
                editors.add(descriptor);
    private final ObjectType settingsType;
                        }
import org.eclipse.core.runtime.IConfigurationElement;
 * you may not use this file except in compliance with the License.
/*
            if (supports) {
    public DataTransferProcessorDescriptor getProcessor(@NotNull String id) {
        return processors.toArray(new DataTransferProcessorDescriptor[0]);
import java.util.*;
        }

    }
        for (DataTransferProcessorDescriptor descriptor : processors) {
    }
 */
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    {

    public DataTransferNodeDescriptor(@NotNull IConfigurationElement config) {
    }
    public Class<? extends IDataTransferNode> getNodeClass()
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final boolean advanced;
                if (!descriptor.appliesToType(sourceObject.getClass())) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        implType.checkObjectClass(IDataTransferNode.class);
    @NotNull
 *
        return nodeType;
        }

        return false;
    }
    private final List<DataTransferProcessorDescriptor> processors = new ArrayList<>();
import org.jkiss.code.Nullable;
    @Nullable
        }
 * See the License for the specific language governing permissions and
     * Returns data exporter which supports ALL specified object types
     */
    @NotNull
 * DataTransferNodeDescriptor
    {
        return procList;
            sourceTypes.add(new ObjectType(typeCfg.getAttribute("type")));
    {
                        break;
                        if (descriptor.adaptsToType((IAdaptable)sourceObject)) {
/**

        return implType.getObjectClass(IDataTransferNode.class);
            if (descriptor.getId().equals(id)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
    @NotNull
        this.name = config.getAttribute("label");
import org.jkiss.utils.ArrayUtils;
    {

