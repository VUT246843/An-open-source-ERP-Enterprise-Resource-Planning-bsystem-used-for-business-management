    @NotNull
    public DBTTaskCategory[] getChildren() {
        return children.toArray(new DBTTaskCategory[0]);
 *

 * TaskTypeDescriptor

    @Override
    }
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
    }



    }


 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
}
 * DBeaver - Universal Database Manager
    }
        if (parentId != null) {
 * See the License for the specific language governing permissions and
import java.util.List;
        return iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private TaskCategoryDescriptor parent;
    @Override
import org.eclipse.core.runtime.IConfigurationElement;
    @NotNull
    private final List<TaskTypeDescriptor> tasks = new ArrayList<>();
    }
    public String toString() {
    public DBTTaskType[] getTaskTypes() {

                parent.addChild(this);
    }
import org.jkiss.dbeaver.model.task.DBTTaskCategory;
    public String getId() {
        return getId();
import org.jkiss.dbeaver.registry.RegistryConstants;
    public String getName() {


        return config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
/**
    @Override
 *
    }
package org.jkiss.dbeaver.registry.task;
import org.jkiss.dbeaver.model.DBPImage;
    @Override
    @Override
    public String getDescription() {
public class TaskCategoryDescriptor extends AbstractContextDescriptor implements DBTTaskCategory, DBPNamedObjectLocalized {
import org.jkiss.code.NotNull;
        return tasks.toArray(new DBTTaskType[0]);
/*
        String parentId = config.getAttribute(RegistryConstants.ATTR_PARENT);
    }
 */
    @Nullable
    void addTask(TaskTypeDescriptor task) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 */
        return config.getAttribute(RegistryConstants.ATTR_NAME);

    TaskCategoryDescriptor(TaskRegistry registry, IConfigurationElement config) {
 * Unless required by applicable law or agreed to in writing, software
    public DBPImage getIcon() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
            if (parent != null) {
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        return config.getAttribute(RegistryConstants.ATTR_ID);
    }
    private List<TaskCategoryDescriptor> children = new ArrayList<>();


    public TaskCategoryDescriptor getParent() {
            }
        this.config = config;
import org.jkiss.dbeaver.model.DBPNamedObjectLocalized;
    }
        this.tasks.add(task);
 *
    public String getLocalizedName(@NotNull String locale) {
    }
    private final IConfigurationElement config;
        return config.getAttribute(RegistryConstants.ATTR_NAME, locale);

    private void addChild(TaskCategoryDescriptor child) {
        super(config);
    @Override
        return parent;
 * you may not use this file except in compliance with the License.
    @NotNull
import org.jkiss.dbeaver.model.task.DBTTaskType;
import java.util.ArrayList;
            parent = registry.getTaskCategory(parentId);

import org.jkiss.code.Nullable;


        }
 * You may obtain a copy of the License at
    }
        children.add(child);
