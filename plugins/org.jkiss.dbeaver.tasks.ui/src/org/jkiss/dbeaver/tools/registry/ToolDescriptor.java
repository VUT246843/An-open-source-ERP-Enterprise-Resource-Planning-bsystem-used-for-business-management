    

    public TaskTypeDescriptor getTaskForObjects(@NotNull Collection<DBSObject> objects) {

        @Nullable
        }

     * @return corresponding task or null
    }
    }
        for (String taskId : toolImplTaskIds) {
                return task;
        return id + " (" + label + ")";
            if (task != null && task.appliesTo(item)) {
 * You may obtain a copy of the License at
        @Override


        for (ToolCommandRef cmdRef : toolCommandRefs) {
    public boolean isSingleton() {
        return group;
    /**

     * @return corresponding command or null
 * limitations under the License.
        String groupId = config.getAttribute(RegistryConstants.ATTR_GROUP);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    public ToolDescriptor(@NotNull IConfigurationElement config) {
/**
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);
        protected Object adaptType(@NotNull DBPObject object) {
public class ToolDescriptor extends AbstractDescriptor {
        }

 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.toolCommandRefs = Stream.of(config.getChildren("command"))
                return true;
    private final ToolGroupDescriptor group;
            }
        }
     * @param item selected object
            super(e);

        private Command command = null;
     * @param objects - selected objects
     */
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        @Nullable
 * you may not use this file except in compliance with the License.
        public final String commandId;
     */
package org.jkiss.dbeaver.tools.registry;
import org.jkiss.code.NotNull;
    @Override
    }
                return true;
 */
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
            if (task != null && objects.stream().allMatch(task::appliesTo)) {
        return false;
        public ToolCommandRef(@NotNull IConfigurationElement e) {
            }
        this.singleton = CommonUtils.toBoolean(config.getAttribute(RegistryConstants.ATTR_SINGLETON));
            .map(e -> e.getAttribute(RegistryConstants.ATTR_ID)).collect(Collectors.toSet());
    @Nullable
            }
        for (ToolCommandRef cmdRef : toolCommandRefs) {
            if (cmdRef.appliesTo(item)) {
     * Return command for the selected command
import org.jkiss.utils.CommonUtils;
        public Command getCommand() {

import org.jkiss.dbeaver.ui.ActionUtils;

     *
        super(config);
        return singleton;
     * @return indication of the possibility of application
            }
    /**
import java.util.Collection;
    }
}
    @Nullable

    public Command getCommandForObjects(@NotNull Collection<DBSObject> objects) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
            if (object instanceof DBSObject dbsObject) {
            if (objects.stream().allMatch(cmdRef::appliesTo)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
    }
     * Return task for the selected command
        
        this.toolImplTaskIds = Stream.of(config.getChildren("task"))
 * See the License for the specific language governing permissions and
        return null;
import org.eclipse.core.commands.Command;
                return cmdRef.getCommand();
import org.jkiss.dbeaver.model.DBPImage;
            return super.adaptType(object);
    }
            .map(ToolCommandRef::new).collect(Collectors.toSet());
        return id;
            }
import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;
import org.jkiss.dbeaver.registry.task.TaskRegistry;
            this.commandId = e.getAttribute(RegistryConstants.ATTR_ID);
        }
    private static class ToolCommandRef extends AbstractContextDescriptor {
import java.util.Set;
    private final DBPImage icon;
 * DBeaver - Universal Database Manager
    public String toString() {
    @NotNull

        for (String taskId : toolImplTaskIds) {

    @NotNull
    public String getId() {

     * @param objects - selected objects
 *
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    }
        return icon;
    public String getDescription() {
 */

import org.jkiss.dbeaver.registry.RegistryConstants;
    /**
        return label;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
     *
    }
    public DBPImage getIcon() {
 * ToolDescriptor
    }
    private final boolean singleton;
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
import java.util.stream.Stream;
     *
    @Nullable
import org.eclipse.core.runtime.IConfigurationElement;
    
     */
    private final String id;
        return null;
                return dbsObject.getDataSource();
    public boolean appliesTo(@NotNull DBPObject item) {
        this.group = CommonUtils.isEmpty(groupId) ? null : ToolsRegistry.getInstance().getToolGroup(groupId);

    private final String label;
    public String getLabel() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        
    }
import org.jkiss.dbeaver.model.DBPObject;
        }
    }
 *
    }
     * Checks if the tool tasks could be applied to the given object
    @Nullable
import java.util.stream.Collectors;
import org.jkiss.code.Nullable;
        return description;
            return command != null ? command : (command = ActionUtils.findCommand(commandId));
            TaskTypeDescriptor task = TaskRegistry.getInstance().getTaskType(taskId);

            TaskTypeDescriptor task = TaskRegistry.getInstance().getTaskType(taskId);
        }
    public ToolGroupDescriptor getGroup() {
    private final Set<ToolCommandRef> toolCommandRefs;
    private final String description;
    private final Set<String> toolImplTaskIds;
